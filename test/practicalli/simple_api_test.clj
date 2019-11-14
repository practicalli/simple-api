(ns practicalli.simple-api-test
  (:require [clojure.test :refer :all]
            [practicalli.simple-api :as SUT]))

(deftest handler-test
  (testing "Response to events"
    (is (= 200 (:status (SUT/handler {}))))))
