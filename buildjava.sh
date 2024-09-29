#!/bin/bash
antlr4 USDA.g4 -visitor
javac -cp /c/Users/jcarl/Downloads/antlr4-runtime-4.13.2.jar *java
find . -name '*.usda' | xargs -L 1 java -cp ".:/c/Users/jcarl/Downloads/antlr4-runtime-4.13.2.jar" USDA
