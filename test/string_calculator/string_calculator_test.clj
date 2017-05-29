(ns string-calculator.string-calculator-test
  (:require [clojure.test :refer :all]
            [string-calculator.string-calculator :refer :all]))

(deftest should-return-numbers-for-digits
  (are [numbers digits] (= numbers (to-ints digits))
        '(1 2 3) "1,2,3"))

(deftest should-get-values-from-custom-digits
  (is (= "1;2;3" (get-values "//;\n1;2;3"))))

(deftest should-get-values-from-default-digits
  (is (= "1;2;3" (get-values "1;2;3"))))

(deftest should-get-delimiters-from-default-digits
  (is (= (str #",|\n") (str (get-delimiters "1;2;3")))))

(deftest should-get-delimiters-from-custom-digits
  (are [delimiters digits] (= (str delimiters) (str (get-delimiters digits)))
        #";" "//;\n1,2"
        #"." "//.\n1.2"))

(deftest should-return-sum-for-digit
  (are [sum digits] (= sum (str-calc digits))
        0 ""
        1 "1"
        2 "2"
        3 "3"
        0 "0,0"
        2 "1,1"
        2 "1\n1"
        5 "1,2,2"
        5 "1\n2\n2"
        5 "1,2\n2"
        3 "//;\n1;2"))
