(ns home-owner.partials.Header
  (:require [optimus.link :as link]))

(defn Header [request header]
  [:head
   [:meta {:charset "utf-8"}]
   [:meta {:name "viewport"
           :content "width=device-width, initial-scale=1.0"}]
   [:meta {:name "description"
           :content (:meta-desc header)}]
   (if (:published header)
     [:meta {:itemprop "datePublished"
             :content (:published header)}])
   [:title (:title header)]
   [:link {:rel "preconnect" :href "https://fonts.gstatic.com"}]
   [:link {:rel "stylesheet" :href "https://fonts.googleapis.com/css2?family=Oswald:wght@300;400;600&display=swap"}]
   [:link {:rel "stylesheet" :href "https://fonts.googleapis.com/css2?family=Open+Sans:wght@300;400&display=swap"}]
   [:link {:rel "stylesheet" :href (link/file-path request "/styles/main.css")}]])
