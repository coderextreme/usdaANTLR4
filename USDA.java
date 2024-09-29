import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.ANTLRFileStream;
import java.io.IOException;
public class USDA {
	public static void main(String[] args) throws IOException {
	    System.err.println("Compiling file: "+args[0]);
	    CharStream input = new ANTLRFileStream(args[0]);
	    USDALexer lexer = new USDALexer(input);
	    CommonTokenStream tokens = new CommonTokenStream(lexer);
	    USDAParser parser = new USDAParser(tokens);
	    parser.getInterpreter().setPredictionMode(PredictionMode.SLL);
	    try {
		parser.usdFile();  // STAGE 1
	    } catch (Exception ex) {
		tokens.reset(); // rewind input stream
		parser.reset();
		parser.getInterpreter().setPredictionMode(PredictionMode.LL);
		parser.usdFile();  // STAGE 2
		// if we parse ok, it's LL not SLL
	    }
	}
}
