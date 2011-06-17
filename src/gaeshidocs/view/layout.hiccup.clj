(doctype :html5)
[:html
 [:head
  [:meta {:http-equiv "Content-Type" :content "text/html" :charset "iso-8859-1"}]
  [:title "gaeshidocs"]
  (include-css "/stylesheets/gaeshidocs.css")
  (include-js "/javascript/gaeshidocs.js")]
 [:body
  (eval (:template-body gaeshi.views/*view-context*))
]]