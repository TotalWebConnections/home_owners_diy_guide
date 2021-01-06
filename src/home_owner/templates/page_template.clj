(ns home-owner.templates.page-template
  (:require [hiccup.page :refer [html5]]
            [home-owner.config.media :refer [get-image-map]]
            [home-owner.config.parsers :refer [handle-eval-tags evaluate-tree-nodes]]
            [home-owner.partials.Header :refer [Header]]
            [home-owner.partials.Nav :refer [Nav]]
            [home-owner.partials.Title :refer [Title]]
            [home-owner.partials.Sidebar :refer [Sidebar]]
            [home-owner.partials.Footer :refer [Footer]]))


(defn page-template [request page]
  (let [page-struct (evaluate-tree-nodes (clojure.edn/read-string page) handle-eval-tags)]
    (html5
     (Header request (:header page-struct))
     [:body
      (Nav)
      (Title)
      [:div.Container
       [:div.body (:page page-struct)]
       (evaluate-tree-nodes (Sidebar) handle-eval-tags)]
      (Footer)])))

