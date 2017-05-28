(ns string-calculator.string-calculator-test
  (:require [clojure.test :refer :all]
            [ string-calculator.string-calculator :refer :all]))

(deftest should-return-number-for-digit
  (are [number digit] (= number (str-calc digit))
        0 ""
        1 "1"
        2 "2"
        3 "3"
        0 "0,0"
        2 "1,1"
        2 "1\n1"
        5 "1,2,2"
        5 "1\n2\n2"))
