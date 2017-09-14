(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

;Implement (boolean x), which works like the
; built-in boolean function: for nil and false,
; it returns false, and for all other values it
; returns true. You can use if in its implementation,
; but not the build-in boolean.
; ONKO TÄÄ OIKEIN IMPLEMENTOITU? MIKSI NIL EI TOIMI
(defn boolean [x]
  (if (= x (or nil false))
    false
    true
    ))

(defn abs [x]
  (if (< x 0)
    (max x (- x))
    x
    )
  )

(defn divides? [divisor n]
  (if (= (mod n divisor) 0)
    true
    false
    ))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 3 n) "fizz"
    (divides? 5 n) "buzz"
    :else ""
    )
  )

(defn teen? [age]
  (if (and (< age 20) (> age 12))
    true
    false)
  )

(defn not-teen? [age]
  (if (and (< age 20) (> age 12))
    false
    true)
  )

;  MIKSI KÄY NÄIN: (generic-doublificate {:a 1})
;=> 2 - esimerkissä palauttaa true
(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (or (list? x) (vector x)) (* 2 (count x))
    :else true)
  )

(defn leap-year? [year]

(cond
  (divides? 400 year) true
  (divides? 100 year) false
  (divides? 4 year) true
  :else false
  )
  )

; '_______'
