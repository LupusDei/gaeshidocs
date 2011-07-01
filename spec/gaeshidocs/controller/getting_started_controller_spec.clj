(ns gaeshidocs.controller.getting-started-controller-spec
  (:use
    [speclj.core]
    [gaeshi.spec-helpers.controller]
    [gaeshidocs.core]
    [gaeshidocs.controller.getting-started-controller]))

(describe "getting_started"

  (with-mock-rendering)
  (with-routes getting-started-controller)

  (it "handles the initial start screen"
    (let [response (do-get "/getting-started")]
    (should= 200 (:status response))
    (should= "getting_started/first_step" @rendered-template)))

  )

(run-specs)
