(ns clj-web-server.core
  (:require [ring.adapter.jetty :refer [run-jetty]]))

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "Hello World! :)"})

(defn run []
  (run-jetty handler
             {:port 3030 :join? false}))

; (.stop app)
(def app (run)) ; Calls run and keeps a handle to it so that could be stopped via (.stop app).
