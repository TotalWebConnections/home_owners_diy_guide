{ :header {
           :title "Home Owners DIY Guide"
           :meta-desc "The best place for DIY info for home owners."}
  :page [:div.Page.Home
          [:div.Home-primary-image-wrapper
           [:a.dark {:href "landscaping-to-sell-your-home"}
            [:eval
              :get-image "landscaping-to-sell-your-home"]
            [:div.Home.primary-image-text
             [:h2 "Landscaping To Sell Your Home"]
             [:p  "Add some curb appeal to your home"]]]]
          [:div.Home-post-wrapper
           [:h2.recentPostsTitle "Recent Posts"]
           [:div.row
            [:eval
              :get-recent-posts 4]]]]}
