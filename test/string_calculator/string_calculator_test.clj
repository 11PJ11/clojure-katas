(ns string-calculator.string-calculator-test
  (:require [clojure.test :refer :all]
            [ string-calculator.string-calculator :refer :all]))

(deftest should-return-0-for-empty-string
  (is (= 0 (str-calc ""))))

(deftest should-return-1-for-1
  (is (= 1 (str-calc "1"))))

(deftest should-return-2-for-2  
  (is (= 2 (str-calc "2"))))

(deftest should-return-3-for-3  
  (is (= 3 (str-calc "3"))))
