package interpreter;

import io.IOInterface;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

/**
 * Created by Alex on 2018.12.1
 */
public class CMMErrorListener extends BaseErrorListener{
    private IOInterface io;
    public CMMErrorListener(IOInterface io)
    {
        this.io = io;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg,
                            RecognitionException e)
    {
//        List<String> stack = ((Parser)recognizer).getRuleInvocationStack();
//        Collections.reverse(stack);
        //io.stderr("rule stack: "+stack+"\n");
        io.stderr("\n"+"line "+line+":"+charPositionInLine+" at "+ ": "+msg+"\n");
//        System.out.print("line "+line+":"+charPositionInLine+" at "+
//                offendingSymbol+": "+msg+"\n");
    }

}
