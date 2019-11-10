(defn average
  [numbers]
  (if (empty? numbers)
    0
    (/ (reduce + numbers) (count numbers))))

(def names {"Inese" 10, "Vasja" 8, "Petja" 4, "Natasha" 7, "Anja" 10, "Lauris" 6, "Sandra" 8, "Krišjanis" 9})

(require '[clojure.string :as str])

(def answer
 (average
  (map #(second %)
       (filter
        (fn [[key]] (str/ends-with? key "a"))
        names))))

(println (double answer))
