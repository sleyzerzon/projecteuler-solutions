; Find the sum of all the multiples of 3 or 5 below 1000.

(defn multiple-of-3-or-5? [n]
  (or (zero? (rem n 3))
      (zero? (rem n 5))))

(println (apply + (filter #(multiple-of-3-or-5? %) (range 1 1000))))
