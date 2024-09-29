#!/bin/bash
npm install
antlr4 USDA.g4 -Dlanguage=JavaScript -visitor
find . -name '*.usda' | xargs -L 1 node USDA.mjs
