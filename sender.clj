(ns example.eventbus-pubsub.sender
  (:require [vertx.core :as vertx]
            [vertx.eventbus :as eb]))

(vertx/periodic 1000
                (eb/publish "news-feed" "some news from Clojure")
                (println "published message some news"))
