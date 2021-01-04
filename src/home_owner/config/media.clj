(ns home-owner.config.media)


(def media
  {:coming-soon {:url "coming_soon.jpg" :alt "Coming Soon!"}
   :new_house {:url "new_house.jpg" :alt "A New home"}
   :landscaping-to-sell-your-home {:url "landscaping-to-sell-your-home.jpg" :alt "Landscaping To Sell Your Home"}})


(defn get-image-map [key]
  ((keyword key) media))


