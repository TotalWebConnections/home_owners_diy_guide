(ns home-owner.config.media)


(def media
  {:coming-soon {:url "coming_soon.jpg" :alt "Coming Soon!"}
   :new_house {:url "new_house.jpg" :alt "A New home"}
   :landscaping-to-sell-your-home {:url "landscaping-to-sell-your-home.jpg" :alt "Landscaping To Sell Your Home"}
   :new-house {:url "new_house.jpg" :alt "New Homeowners Guide"}
   :clover-yard {:url "clover-yard.jpg" :alt "Dealing With Clover In Your Yard"}
   :furnace-technician {:url "furnace-technician.jpg" :alt "Furnace Technician"}
   :artificial-grass {:url "artificial-grass.jpg" :alt "Artificial Grass"}
   :how-to-take-care-of-your-gutters {:url "how-to-take-care-of-your-gutters.jpg" :alt "How To Take Care Of Your Gutters"}
   :getting-rid-of-mice {:url "getting-rid-of-mice.jpg" :alt "How To Get Rid Of Mice In Your Home"}
   :when-to-fertalize-your-lawn {:url "when-to-fertalize-your-lawn.jpg" :alt "When To Fertalize Your Lawn"}
   :replace-mulch-with-grass {:url "replace-mulch-with-grass.jpg" :alt "How to replace mulch with grass"}
   :mulch-vs-stone {:url "mulch-vs-stone.jpg" :alt "Mulch Vs Stone"}
   :environmentally-friendly-lawn-care {:url "environmentally-friendly-lawn-care.jpg" :alt "environmentally friendly lawn care tips"}
   :best-time-to-mow-lawn {:url "best-time-to-mow-lawn.jpg" :alt "Best Time To Mow Lawn"}})

(defn get-image-map [key]
  ((keyword key) media))