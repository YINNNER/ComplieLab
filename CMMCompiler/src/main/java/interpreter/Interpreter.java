package interpreter;

import gen.CMMLexer;
import gen.CMMParser;
import io.IOInterface;
import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;

/**
 * Created by Alex on 2018.12.4
 */
public class Interpreter {
    private String sourcecode;

    private IOInterface ioInterface;
    private IOInterface debugIO;

    private CMMLexer lexer;
    private boolean showTree = false;
    private boolean showTokens = false;


    public Interpreter(String sourcecode,IOInterface ioInterface, IOInterface debugIO, boolean showtokens, boolean showtree)
    {
        this(sourcecode, ioInterface, debugIO);
        this.showTokens = showtokens;
        this.showTree = showtree;
    }
    public Interpreter(String sourcecode,IOInterface ioInterface, IOInterface debugIO)
    {
        this.sourcecode = sourcecode;
        this.ioInterface = ioInterface;
        this.debugIO = debugIO;
    }

    public void setShowTree(boolean showTree)
    {
        this.showTree = showTree;
    }

    public void setShowtoken(boolean showtokens)
    {
        this.showTokens = showtokens;
    }

    public  void Lexing(){
        lexer = new CMMLexer(new ANTLRInputStream(sourcecode));
        lexer.removeErrorListeners();
        lexer.addErrorListener(new CMMErrorListener(ioInterface));//注册监听器
        if(showTokens){
            List<Token> tokenList = (List<Token>) lexer.getAllTokens();
            int i = -1;
            for(Token token : tokenList){
                if(i != token.getLine())
                {
                    i = token.getLine();
                    debugIO.stdout("line " + i + " : \n");
                }
                debugIO.stdout("\tText : " + token.getText() + "\tType : " + token.getType() + "\n");
            }
            lexer.reset();
        }
    }

    public void run()
    {
        Error.init_keyword_hashMap();
        //lexer = new CMMLexer(new ANTLRInputStream(processStringCat(sourcecode)));

        Lexing();
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        CMMParser parser = new CMMParser(tokenStream);


        parser.removeErrorListeners();
        parser.addErrorListener(new CMMErrorListener(ioInterface));//注册监听器
        parser.setErrorHandler(new DefaultErrorStrategy());
        parser.addParseListener(new DefPhase(ioInterface));

        ParseTree parseTree = parser.program();
        RefPhase refPhase = new RefPhase(ioInterface);

        refPhase.visit(parseTree);


        if (showTree) {
            Trees.inspect(parseTree, parser);
        }


    }

}
