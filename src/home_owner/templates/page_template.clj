(ns home-owner.templates.page-template
  (:require [hiccup.page :refer [html5]]
            [home-owner.partials.Header :refer [Header]]
            [home-owner.partials.Nav :refer [Nav]]
            [home-owner.partials.Title :refer [Title]]
            [home-owner.partials.Sidebar :refer [Sidebar]]))


(defn page-template [request page]
  (let [page-struct (clojure.edn/read-string (str "{" page "}"))]
    (html5
     (Header request (:header page-struct))
     [:body
      (Nav)
      (Title)
      [:div.body (:page page-struct)]
      (Sidebar)
      [:script {:src "https://kit.fontawesome.com/a85405c6c9.js" :crossorigin "anonymous"}]])))
