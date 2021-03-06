(ns gaeshidocs.core
  (:use
    [compojure.core :only (defroutes GET)]
    [compojure.route :only (not-found)]
    [gaeshi.middleware.view-context :only (wrap-view-context)]
    [gaeshi.views :only (render-template render-html)]
    [gaeshi.controllers :only (controller-router)]))

(defroutes gaeshidocs-routes
  (GET "/" [] (render-template "index"))
  (GET "/getting-started" [] (render-template "statics/getting_started"))
  (GET "/deploying" [] (render-template "statics/deploying"))
  (controller-router 'gaeshidocs.controller)
  (not-found (render-template "not_found" :template-root "gaeshidocs/view" :ns `gaeshidocs.view.view-helpers)))

(def app-handler
  (->
    gaeshidocs-routes
    (wrap-view-context :template-root "gaeshidocs/view" :ns `gaeshidocs.view.view-helpers)))

