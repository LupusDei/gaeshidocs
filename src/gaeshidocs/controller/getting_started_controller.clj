(ns gaeshidocs.controller.getting-started-controller
  (:use
    [compojure.core :only (defroutes GET)]
    [compojure.route :only (not-found)]
    [gaeshi.views :only (render-template render-html)]))

(defroutes getting-started-controller
  (GET "/getting-started" [] (render-template "getting_started/first_step"))
  )
