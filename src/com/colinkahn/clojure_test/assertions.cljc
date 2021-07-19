(ns com.colinkahn.clojure-test.assertions
  #?(:cljs (:require [hyperfiddle.rcf.unify :refer [unify]]))
  #?(:cljs (:require-macros [com.colinkahn.clojure-test.assertions.cljs]))
  #?(:clj (:require
            [clojure.test :as test]
            [com.colinkahn.clojure-test.assertions.impl :as impl])))

#?(:clj
   (do
     (defmethod test/assert-expr 'unified?
       [msg form]
       `(test/do-report
          ~(impl/unified? msg form))) 

))
