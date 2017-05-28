(ns string-calculator.string-calculator
  (:gen-class)
  (:require [clojure.string :as str]))

(defn parse-int [s]
  (Integer. (re-find #"[0-9]*" s)))

(defn- toInts [digits]
  (map parse-int (str/split digits #",")))

(defn- sum [numbers]
  (reduce + numbers))

(defn str-calc [digits]
  (cond
    (= digits "") 0
    () (sum (toInts digits))))
