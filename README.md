# Machine Learning with Jave & Clojure and Visualizations with D3 & ClojureScript

## Usage

1. Download data files:

  1. M-x cider-jack-in
  2. open download.clj and load it into REPL: C-c C-k
  3. (in-ns 'cljs-visual.download)   
  4. (download-corpus "E:/DEV/clojure/DataAnalysis/cljs-visual/datas")
  5. Directory should be filled with downloaded text files

2. Use [MAchine Learning for LanguagE Toolkit](http://mallet.cs.umass.edu)
  1. (in-ns ' cljs-visual.system)
  2. open topic_model.clj and load it into REPL: C-c C-k
  3. open system.clj and load it into REPL: C-c C-k
  2. (start system)
  3. Two files should be created : topic-words.csv and topic-dists.csv

3. D3.js ClojueScript visualizations
  1. change to E:\DEV\clojure\DataAnalysis\cljs-visual\www
  2. run: node E:\Node\npm\node_modules\http-server\bin\http-server
  3. copy topic-words.csv, topic-dists.csv into project www directory
  4. open in your browser: http://127.0.0.1:8080/
  

## Observations

1. Pay attention how important Mexico was for US in 19th century:
![alt text](https://github.com/zuoqin/cljs-visualizations/blob/master/doc/mexico.png "Mexico in State of the Union Addresses and Messages")

## License

Copyright © 2013 FIXME

Distributed under the Eclipse Public License, the same as Clojure.
