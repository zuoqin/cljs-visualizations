# cljs-visual

## Usage

1. Download data files:

  1. M-x cider-jack-in
  2. open download.clj and load it into REPL: C-c C-k
  3. (in-ns 'cljs-visual.download)   
  4. (download-corpus "E:/DEV/clojure/DataAnalysis/cljs-visual/datas")
  Directory should be filled with downloaded text files

2. Use [MAchine Learning for LanguagE Toolkit](http://mallet.cs.umass.edu)
  1. (in-ns ' cljs-visual.system)
  2. (start system)
  Directory should be craeted two files: topic-words.csv and topic-dists.csv

3. D3.js ClojueScript visualizations
  1. change to E:\DEV\clojure\DataAnalysis\cljs-visual\www
  2. run: node E:\Node\npm\node_modules\http-server\bin\http-server
  3. open in browser: http://127.0.0.1:8080/
  
FIXME

## License

Copyright © 2013 FIXME

Distributed under the Eclipse Public License, the same as Clojure.
