; This page is used to style a 404 page for your site - accessible at /404
; You will have to direct your host to point 404 requests on your domain to this page.


{:header {
          :title "Not Found"
          :meta-desc "404 - Page Not Found"}
 :page [:div.Page
         [:h1 "404 - Page Not Found"]
         [:p "Looks like you've try to get to a page that doesn't exit...yet!"]
         [:p [:a.dark {:href "/"} "Go Home"]]
         [:p [:a.dark {:href "/posts"} "Go To Posts Page"]]]}
