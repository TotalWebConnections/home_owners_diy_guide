(ns home-owner.partials.Social
  (:require [home-owner.config.config :refer [Site]]))

(defn Social []
  (let [social-urls (:social-urls Site)]
    [:div.Social
     [:ul
      [:li [:a {:href (:facebook social-urls)}  [:i.fab.fa-facebook-f]]]
      [:li [:a {:href (:twitter social-urls)}  [:i.fab.fa-twitter]]]
      [:li [:a {:href (:instagram social-urls)}  [:i.fab.fa-instagram]]]
      [:li [:a {:href (:pinterest social-urls)}  [:i.fab.fa-pinterest]]]]]))

