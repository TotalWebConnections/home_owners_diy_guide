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
       [:a.dark {:href "landscaping-to-sell-your-home"}[:h4 "Landscaping To Sell Your Home"]]]]
     [:div.topPostWrapper
      [:div.image
       [:eval
         :get-image "new-house"]]
      [:div.content
       [:a.dark {:href "25-things-all-homeowners-should-do"}[:h4 "25 Things All Homeowners Should Be Doing"]]]]
     [:div.topPostWrapper
      [:div.image
       [:eval
         :get-image "clover-yard"]]
      [:div.content
       [:a.dark {:href "getting-rid-of-clover"}[:h4 "How To Get Rid Of Clover in Your Yard"]]]]]])
