(defproject clj-web-server "0.1.0-SNAPSHOT"
  :description "Following tutorials from Clojure Workshop, Chapter 14"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [ring/ring-core "1.8.0"]
                 [ring/ring-jetty-adapter "1.8.0"]]
  :repl-options {:init-ns clj-web-server.core})
