[:div {:style "text-align: center; padding-left: 200px;"}
  [:table
    [:tr
      [:td
        [:img {:src "/images/gaeshi.png"}]]
      [:td
        [:h1 {:style "font-size: 64px;"} "Docs"]]]]]


[:h3 "Intro"]
[:p "Gaeshi is a clojure framework for building Google AppEngine sites. The project home is at "
 [:a {:href "https://github.com/slagyr/gaeshi"} "https://github.com/slagyr/gaeshi"] "."
 "It consists of 3 parts"
 [:ul
  [:li [:b "Kuzushi"] "- which means 'breaking balance', is a Leiningen plugin that supplies all the Geashi commands."]
  [:li [:b "Tsukuri"] "- which means 'entry', is a library containing all the development tools."]
  [:li [:b "Kake"] "- which means 'execution', is the runtime library that contains all the main APIs."]]]

[:p
  [:a {:href "/getting-started" :style "font-size: 16px"} "Get started now!"]
]

[:h3 "License"]
[:p "Copyright (C) 2011 Micah Martin All Rights Reserved."]
[:p "Distributed under the The MIT License."]

[:p "This app was generated for gaeshidocs."]
