(ns com.colinkahn.clojure-test.assertions.impl
  (:require [hyperfiddle.rcf.unify :refer [unify]]))

(defn unified? [msg [_ x p]]
  `{:type (if-some [_# (hyperfiddle.rcf.unify/unify ~x '~p)]
            :pass
            :fail)
    :message ~msg
    :expected '~p
    :actual ~x})
