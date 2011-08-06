[:div {:style "text-align: center"}
 [:h1 "Deploy to Google App Engine"]]

[:div {:class "instructions"}
  [:h2 "Creating Your Google Appspot Domain"]
  [:p "One of the coolest things about using gaeshi is how easy it is to put a site on the webz."]
  [:ol
    [:li "First you are going to need an account with google."
      [:p "If you don't already use gmail, you can make an account "
        [:a {:href "https://www.google.com/accounts/ServiceLogin"} "here."]
      ]
    ]
    [:li "Next you will want to pick the domain name for you app."
      [:p "Google appspot will want to verify your humanity first, but then you can register up to 10 domains!"]
      [:p "You can get one "
        [:a {:href "https://appengine.google.com/start/createapp"} "here."]
      ]
    ]
  ]
]

[:div {:class "instructions"}
  [:h2 "Attaching Gaeshi to Google App Engine"]
  [:ol
    [:li "Make sure your config/production/appengine-web.xml file reflects the domain name <application>sub_domain_name</application>.  For example, if I named my app pure_awesome, and I get the domain pure-awesome.appspot.com, then I should have <application>pure-awesome</application> in that file."]
    [:li "Finally you will need to have a config file in ~/.gaeshi/ named pure_awesome that contains the following:"
      [:br]
      [:code "
{
	:appengine-sdk-dir '/path/to/appengine-java-sdk-1.4.3'
	:appengine-email 'jon.doe@gmail.com'
	:appengine-password 'jonspassword'
}"    ]
    ]
    [:li "Now you can type "
      [:code "gaeshi deploy production"]
      " and SHABAM! Within a few moments you can checkout your new live gaeshi web app!"
    ]
  ]
]
