(ns home-owner.templates.post-template
  (:require [hiccup.page :refer [html5]]
            [home-owner.config.parsers :refer [handle-eval-tags evaluate-tree-nodes generate-image]]
            [home-owner.partials.Header :refer [Header]]
            [home-owner.partials.Nav :refer [Nav]]
            [home-owner.partials.Title :refer [Title]]
            [home-owner.partials.Sidebar :refer [Sidebar]]
            [home-owner.partials.Footer :refer [Footer]]))

(defn post-template [request page]
  (let [page-struct (clojure.edn/read-string page)]
    (html5
     (Header request (:header page-struct))
     [:body
      (Nav)
      (Title)
      [:div.Container
       [:div.body
        (generate-image (:primary-image page-struct))
        ; [:img {:width "100%" :src (str "/images/" (:primary-image page-struct))}]
        [:div.Post-container
         [:h1 (:title (:header page-struct))]
         (:page page-struct)
         [:div#last-update (str "Last Updated on " (:last-updated (:header page-struct)))]]]
       (evaluate-tree-nodes (Sidebar) handle-eval-tags)]
      (Footer)])))
