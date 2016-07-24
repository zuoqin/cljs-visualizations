
(ns cljs-visual.system
  (:require [net.cgrand.enlive-html :as en]
            [cljs-visual.download :as dl]
            [cljs-visual.topic-model :as tm])
  (:import [java.net URL]))

(defn download-base [s]
  (println :download-base)
  (assoc s :index (en/html-resource (URL. (:index-url s)))))

(defn download-page [s]
  (println :download-page)
  (let [links (dl/get-index-links (:index s))
        page (-> links first :attrs :href URL. en/html-resource)]
    (assoc s
           :links links
           :page page)))

(def system
  {:index-url "http://www.presidency.ucsb.edu/sou.php"
   :data-dir "E:/DEV/clojure/DataAnalysis/cljs-visual/datas"})

(defn start
  [system]
  (let [instances (tm/make-pipe-list)
        theFiles (tm/add-directory-files instances (:data-dir system)) 
        theSystem (assoc system :instances instances :model (tm/train-model instances) )
    ]
    
    
    
    (tm/write-topic-distributions (:model theSystem) (:instances theSystem) "E:/DEV/clojure/DataAnalysis/cljs-visual/datas/topic-dists.csv" )
    (tm/write-topic-words (:model theSystem) (:instances theSystem) "E:/DEV/clojure/DataAnalysis/cljs-visual/datas/topic-words.csv" )  
  )
)

(defn stop
  [system]
  system)

