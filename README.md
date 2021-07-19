# Assertions

`clojure.test` assertions for Clojure(Script) I might use in personal projects.

```
(require 'com.colinkahn.clojure-test.assertions)

(deftest unified-test
  (is (unified? [1 {:a 1 :b 2} 2]  [?a {:a ?a :b ?b} ?b])))
```
