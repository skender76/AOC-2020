(ns clojure-for-advent-of-code.core)

(defn make-thingy [x]
  (fn [& args] x))

(defn triplicate [f]
  (apply f [])
  (apply f [])
  (apply f []))