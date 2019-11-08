(ns practicalli.simple-api
  (:gen-class)
  (:require [org.httpkit.server :as server]))

(defn handler
  "A function that handles all requests from the server.
  `req` is a ring request map"
  [req]
  {:status  200
   :body    "Hello Clojure Server world!"
   :headers {}})


(defn server
  "A ring-based server listening to all http requests
  port is an Integer greater than 128"
  [port]
  (server/run-server handler {:port port}))


(defn -main
  "Hacky server start function."
  []
  (server 8000))
