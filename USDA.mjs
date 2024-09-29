import antlr4 from "antlr4"
import fs from "fs"
import USDALexer from "./USDALexer.js"
import USDAParser from "./USDAParser.js"
import USDAListener from "./USDAListener.js"
const iName = process.argv[2]
console.error("Parsing file", iName);
var input = fs.readFileSync(iName, 'UTF-8')
var chars = new antlr4.InputStream(input)
var lexer = new USDALexer(chars)
var tokens  = new antlr4.CommonTokenStream(lexer)
var parser = new USDAParser(tokens)
parser.buildParseTrees = true
var tree = parser.usdFile()

var extractor = new USDAListener()
antlr4.tree.ParseTreeWalker.DEFAULT.walk(extractor, tree)
