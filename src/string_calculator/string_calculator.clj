(ns string-calculator.string-calculator
  (:gen-class)
  (:require [clojure.string :as str]))

(defn- parse-int [str]
  (Integer. (re-find #"[0-9]*" str)))

(defn- is-custom? [digits]
  (str/starts-with? digits "//"))

(defn get-delimiters [digits]
  (cond
    (is-custom? digits) (re-pattern (subs digits 2 3))
    () #",|\n"))

(defn get-values [digits]
  (cond 
    (is-custom? digits) (second(str/split digits #"\n"))
    () digits))

(defn- get-delimiters-and-values [digits]
    [(get-delimiters digits) (get-values digits)])

(defn- to-single-digits [digits]
  (let [[delimiters values] (get-delimiters-and-values digits)]
    (str/split values delimiters)))

(defn to-ints [digits]
  (->> digits
       (to-single-digits) 
       (map parse-int)))
 
(defn- sum [numbers]
  (reduce + numbers))

(defn str-calc [digits]
  (cond
    (= digits "") 0
    ()(sum (to-ints digits))))