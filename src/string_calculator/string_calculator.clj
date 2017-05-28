(ns string-calculator.string-calculator
  (:gen-class)
  (:require [clojure.string :as str]))

(defn- parse-int [s]
  (Integer. (re-find #"[0-9]*" s)))

(defn- split [digits]
  (str/split digits #",|\n"))

(defn- toInts [digits]
  (map parse-int (split digits)))

(defn- sum [numbers]
  (reduce + numbers))

(defn str-calc [digits]
  (cond
    (= digits "") 0
    () (-> digits
           (toInts)
           (sum))))
