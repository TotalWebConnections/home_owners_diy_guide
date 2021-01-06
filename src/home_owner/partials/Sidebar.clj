(ns home-owner.partials.Sidebar
  (:require [optimus.link :as link]))

(defn Sidebar []
  [:div.Sidebar
   [:div.Sidebar__about
    [:div.Sidebar__about__inner
     [:div.Sidebar__about__inner__content
      [:h4 "About Us"]
      [:p "We are site dedicated to home upkeep and maintenance with an emphasis on DIY projects"]]]]
   [:div.Sidebar__section.topPosts
     [:h4 "Popular Posts"]
     [:div.topPostWrapper
      [:div.image
       [:eval
         :get-image "landscaping-to-sell-your-home"]]
      [:div.content
       [:a.dark {:href "#"}[:h4 "Title"]]
       [:p "Some stuff here about it"]]]
     [:div.topPostWrapper
      [:div.image
       [:eval
         :get-image "landscaping-to-sell-your-home"]]
      [:div.content
       [:a.dark {:href "#"}[:h4 "Title"]]
       [:p "Some stuff here about it"]]]
     [:div.topPostWrapper
      [:div.image
       [:eval
         :get-image "landscaping-to-sell-your-home"]]
      [:div.content
       [:a.dark {:href "#"}[:h4 "Title"]]
       [:p "Some stuff here about it"]]]]])
