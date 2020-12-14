(ns clojure-for-advent-of-code.core-test
  (:require [clojure.test :refer :all]
            [clojure-for-advent-of-code.core :refer :all]))

(let [n (rand-int Integer/MAX_VALUE)
      f (make-thingy n)]
  (assert (= n (f)))
  (assert (= n (f 123)))
  (assert (= n (apply f 123 (range)))))

(defn inc [x] )