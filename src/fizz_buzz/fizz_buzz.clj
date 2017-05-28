(ns fizz-buzz.fizz-buzz
  (:gen-class))

(defn- is-mult-of? [mult number]
  (= (mod number mult) 0))
  
(defn- is-multiple-of-3? [number]
  (is-mult-of? 3 number))

(defn- is-multiple-of-5? [number]
  (is-mult-of? 5 number))

(defn- is-multiple-of-3-and-5? [number]
  (and (is-multiple-of-3? number)
       (is-multiple-of-5? number))) 
  

(defn fizz-buzz [number]
  (cond 
    (is-multiple-of-3-and-5? number) "FizzBuzz"      
    (is-multiple-of-3? number) "Fizz"
    (is-multiple-of-5? number) "Buzz"
    () (str number)))
