(ns home-owner.config.parsers
  (:require [home-owner.config.media :refer [get-image-map]]
            [clojure.string :as str]
            [stasis.core :as stasis]))


(defn generate-image [name]
  (let [image-map (get-image-map name)]
    [:img {:src (str "/images/" (:url image-map)) :alt (:alt image-map) :width "100%"}]))

(defn generate-single-post [url page]
  [:div.Home-post
   [:a {:href (str/replace url #"\.clj$" "/")}
    (generate-image (:primary-image page))
    [:div.Home-post-text
     [:h2 (:title (:header page))]
     [:p  "Easy steps to maintain your home."]]]])

(defn generate-posts-page []
  (map (fn [page] (generate-single-post (first page) (clojure.edn/read-string  (str "{" (second page) "}")))) (stasis/slurp-directory "resources/posts" #".*\.clj$")))


(defn evaluable? [x]
  (and (vector? x)
       (= :eval (first x))))

(defn evaluate-tree-nodes [tree evaluator-fn]
  (clojure.walk/postwalk
   #(if (evaluable? %)
      (apply evaluator-fn (rest %))
      %)
   tree))

(defn handle-eval-tags [f & args]
  (case f
    :get-image (apply generate-image args)
    :all-posts (apply generate-posts-page args)))
