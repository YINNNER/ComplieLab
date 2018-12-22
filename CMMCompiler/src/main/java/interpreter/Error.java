package interpreter;

import io.IOInterface;
import org.antlr.v4.runtime.Token;

import java.util.Hashtable;
import java.util.Set;

/**
 * Created by Alex on 2018.12.3
 */
public class Error {

    public static void conflict_declar_error(IOInterface io, Token token) {
        io.stderr("semantic error:conflicting declaration variable in '"
                + token.getText()
                + "' in line "
                + token.getLine()
                +":"
                + token.getCharPositionInLine()
                +"\n");
    }
    public static void undeclared_var_error(IOInterface io, Token token) {
        io.stderr("semantic error:'"
                        + token.getText()
                +"'undeclared in '"
                + "' in line "
                + token.getLine()
                +":"
                + token.getCharPositionInLine()
                +"\n");
    }
    public static void invalid_type_error(IOInterface io, Token token) {
        io.stderr("semantic error:invalid types for array '"
                + token.getText()
                +"'in '"
                + "' in line "
                + token.getLine()
                +":"
                + token.getCharPositionInLine()
                +"\n");
    }
    public static void unmatched_type_error(IOInterface io, Token token){
        io.stderr("semantic error: unmatched type in '"
                + token.getText()
                + "' in line "
                + token.getLine()
                +":"
                + token.getCharPositionInLine()
                +"\n");
    }
    public static void unsupport_array_type_error(IOInterface io, Token token) {
        io.stderr("semantic error: unsupported array type in '"
                + token.getText()
                + "'"
                +" in line "
                + token.getLine()
                +":"
                + token.getCharPositionInLine()
                +"\n");
    }
    public static void fatal_error(IOInterface io, Token token) {
        io.stderr("semantic error: fatal error in '"
                + token.getText()
                + "'"
                +" in line "
                + token.getLine()
                +":"
                + token.getCharPositionInLine()
                +"\n");
    }
    public  static  void out_of_boundary_error(IOInterface io, Token token) {
        io.stderr("semantic error: index out of boundary of array '"
                + token.getText()
                + "'"
                +" in line "
                + token.getLine()
                +":"
                + token.getCharPositionInLine()
                +"\n");
    }
    public static void divide_by_zero_error(IOInterface io, Token token)  {
        io.stderr("semantic error: divide by zore '"
                + token.getText()
                + "'"
                +" in line "
                + token.getLine()
                +":"
                + token.getCharPositionInLine()
                +"\n");
    }
    public static void uninitialized_error(IOInterface io, Token token) {
        io.stderr("semantic error: uninitialized variable '"
                + token.getText()
                + "'"
                +" in line "
                + token.getLine()
                +":"
                + token.getCharPositionInLine()
                +"\n");
    }
    public static void variableoverflow_error(IOInterface io, Token token){
        io.stderr("semantic error: variable overflow '"
                + token.getText()
                + "'"
                +" in line "
                + token.getLine()
                +":"
                + token.getCharPositionInLine()
                +"\n");
    }
    public static void fatal_unknown_error(IOInterface io, Token token)
    {
        io.stderr("fatal semantic error: unknown error '"
                + token.getText()
                + "'"
                +" in line "
                + token.getLine()
                +":"
                + token.getCharPositionInLine()
                +"\n");
        throw new RuntimeException("fatal semantic error: unknown error");
    }
    public static void fatal_null_error(IOInterface io, Token token)
    {
        io.stderr("fatal semantic error: null error '"
                + token.getText()
                + "'"
                +" in line "
                + token.getLine()
                +":"
                + token.getCharPositionInLine()
                +"\n");
        throw new RuntimeException("fatal semantic error: null value error");
    }
    public static void fatal_unsupported_arithmetic_error(IOInterface io, Token token)
    {
        io.stderr("fatal error : unsupported arithmetic for'"
                + token.getText()
                + "'"
                +" in line "
                + token.getLine()
                +":"
                + token.getCharPositionInLine()
                +"\n");
        throw new RuntimeException("fatal semantic error: fatal_unsupported_arithmetic_error");
    }
    public static void _is_fatal_returnval_null_error(IOInterface io, Token token, ReturnValue returnValue)
    {
        if(returnValue != null)
        {
            if(returnValue.getValue() != null && returnValue.getType() != null)
            {
                return;
            }
        }
        io.stderr("Fatal semantic error: Return value is null in line" + token.getLine());
        throw new RuntimeException("Return value is null in line" + token.getLine());
    }
    private static Hashtable<String, String> key_words_hashMap;
    public static void _is_conflict_with_keyword_error(IOInterface io, String varName, Token token)
    {
        if(key_words_hashMap == null)
        {
            throw new RuntimeException("Fatal semantic error: Hash map is null.");
        }
        Set<String> keys = key_words_hashMap.keySet();
        for(String key: keys){
            if(varName.equals(key_words_hashMap.get(key)))
            {
                io.stderr("Fatal semantic error: Conflict with key word: in line "
                        +token.getLine() + " : " + token.getCharPositionInLine());
                throw  new RuntimeException("Fatal semantic error: Conflict with key word!");
            }
        }
    }
    public static void init_keyword_hashMap()
    {
        if(key_words_hashMap != null)
            return;
        key_words_hashMap = new Hashtable<>();
        key_words_hashMap.put("READ","read");
        key_words_hashMap.put("WRITE","write");
        key_words_hashMap.put("IF","if");
        key_words_hashMap.put("ELSE","else");
        key_words_hashMap.put("WHILE","while");
        key_words_hashMap.put("BREAK","break");
        key_words_hashMap.put("INT","int");
        key_words_hashMap.put("DOUBLE","double");
        key_words_hashMap.put("STRING","string");
        key_words_hashMap.put("BOOlEAN","bool");
    }
}
