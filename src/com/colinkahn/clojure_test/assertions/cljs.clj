(ns com.colinkahn.clojure-test.assertions.cljs
  (:require
    [cljs.test :as test]
    [com.colinkahn.clojure-test.assertions.impl :as impl]))

(defmethod test/assert-expr 'unified?
  [_ msg form]
  `(test/do-report
     ~(impl/unified? msg form)))
