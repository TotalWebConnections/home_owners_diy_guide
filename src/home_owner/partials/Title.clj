(ns home-owner.partials.Title
  (:require [home-owner.config.config :refer [Site]]))



(defn Title []
  [:div.Title
   [:h1 (:title Site)]])
