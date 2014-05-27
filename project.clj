(defproject wordsrv-core "0.1.0-SNAPSHOT"
  :description "the word is served"
  :url "http://pp-femurchasm.gnu-darwin.org"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :aot :all
;  :dependencies [[org.clojure/clojure "1.5.1"]
                                        ;                 [org.apache.storm/storm-core "0.9.1-incubating"]]
  :dependencies [[commons-collections/commons-collections "3.2.1"]]
  :profiles {:dev
              {:dependencies [[org.apache.storm/storm-core "0.9.1-incubating"]
                              [org.clojure/clojure "1.5.1"]
                              [org.testng/testng "6.8.8"]
                              [org.easytesting/fest-assert "1.4"]
                              [org.mockito/mockito-all "1.9.5"]
                              [org.jmock/jmock "2.6.0"]]}}
  :min-lein-version "2.3.4"
  )

