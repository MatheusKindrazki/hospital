(ns hospital.core
  (:use [clojure pprint])
  (:require [hospital.model :as h.model]))

(let [hospital-do-kindra (h.model/novo-hospital)]
  (pprint hospital-do-kindra))

