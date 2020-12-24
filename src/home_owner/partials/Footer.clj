(ns home-owner.partials.Footer
  (:require [home-owner.partials.Social :refer [Social]]))


(defn Footer []
  [:div.Footer
   [:div.Footer__inner
    [:div.Footer__inner__nav
     [:div.Nav__links
      [:ul
        [:li [:a {:href "#"} "Home"]]
        [:li [:a {:href "#"} "About"]]
        [:li [:a {:href "#"} "Posts"]]
        [:li [:a {:href "#"} "Contact"]]]]]
    [:div.Footer__inner__social
     (Social)]]
   [:div.Footer__copyright
    [:p "Copyright 2020 - Total Web Connections LLC"]]
   [:script {:src "https://kit.fontawesome.com/a85405c6c9.js" :crossorigin "anonymous"}]])
