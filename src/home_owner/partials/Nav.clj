(ns home-owner.partials.Nav
  (:require [home-owner.partials.Social :refer [Social]]))

(defn Nav []
  [:div.Nav
   [:div.Nav__links
    [:ul
      [:li [:a {:href "/"} "Home"]]
      [:li [:a {:href "/about"} "About"]]
      [:li [:a {:href "/posts"} "Posts"]]
      [:li [:a {:href "/contact"} "Contact"]]]]
   [:div.Nav__social
    (Social)]])
