(ns fizz-buzz.fizz-buzz-test
  (:require [clojure.test :refer :all]
            [fizz-buzz.fizz-buzz :refer :all]))

(deftest should-return-1-for-1
  (is (= "1" (fizz-buzz 1))))

(deftest should-return-2-for-2
  (is (= "2" (fizz-buzz 2))))

(deftest should-return-4-for-4
  (is (= "4" (fizz-buzz 4))))

(deftest should-return-Fizz-for-3
  (is (= "Fizz" (fizz-buzz 3))))
  
(deftest should-return-Fizz-for-6
  (is (= "Fizz" (fizz-buzz 6))))

(deftest should-return-Buzz-for-5
  (is (= "Buzz" (fizz-buzz 5))))

(deftest should-return-Buzz-for-10
  (is (= "Buzz" (fizz-buzz 10))))

(deftest should-return-FizzBuzz-for-15
  (is (= "FizzBuzz" (fizz-buzz 15))))
