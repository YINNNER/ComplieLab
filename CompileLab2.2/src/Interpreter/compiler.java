/* Generated By:JJTree&JavaCC: Do not edit this line. compiler.java */
package Interpreter;

import java.io.FileNotFoundException;
import java.io.IOException;

public class compiler/*@bgen(jjtree)*/implements compilerTreeConstants, compilerConstants {/*@bgen(jjtree)*/
  protected static JJTcompilerState jjtree = new JJTcompilerState();


  public static void main(String args[]){
    System.out.println("Please type the valid statement...");
    System.out.println(" Using a ! to terminate your input>>");
    new compiler(System.in);
    try {
      SimpleNode n = compiler.Start();
      n.dump("");
      System.out.println("Thank you.");
    }
    catch (Exception e){
      System.out.println("Oops.");
      System.out.println(e.getMessage());
    }
  }

  public static final String[] Images = {
          "", null, null, null, null, null, null, "IF", "ELSE",
          "READ", "WRITE", "WHILE", "INT",
          "REAL", "BOOL", "INTEGER_LITERAL", "REAL_LITERAL", null, "BOOL_LITERAL", "UNDERSCORE", "COMMA", "SEMI", "COLON",
          "LEFT_PAR", "RIGHT_PAR", "LEFT_BRA", "RIGHT_BRA", "LEFT_CUR", "RIGHT_CUR", "ASSIGN", "PLUS", "MINUS", "TIMES", "DIVIDE",
          "MOD", "LESS:", "GREATER", "EQUAL", "NOTEQUAL", "LESS_EQUAL", "GREATER_EQUAL", "IDENTIFIER", null, null, };

  public final String Lexical() throws FileNotFoundException {
    compilerTokenManager TokenManager = token_source;
    String result = "";
    String errMsg = "";
    String lexical = "";
    String sentence = "";
    int line = 0;

    while(true) {
      Token t;
      while(true) {
        try {
          t = compilerTokenManager.getNextToken();
          break;
        } catch (TokenMgrError e1) {
          errMsg = errMsg + e1.toString() + "\r\n";

          try {
            SimpleCharStream.readChar();
          } catch (IOException e) {
            errMsg = errMsg + e.getMessage() + "\r\n";
          }
        }
      }

      if (line != 0 && line != t.beginLine) {
        sentence = sentence + "\r\n";
        result = result + sentence + lexical;
        line = t.beginLine;
        sentence = "Line:" + line;
        lexical = "";
      } else if (line == 0) {
        line = t.beginLine;
        sentence = "Line:" + line;
      }

      if (t.specialToken != null) {
        Token tmp_t;
        for(tmp_t = t.specialToken; tmp_t.specialToken != null; tmp_t = tmp_t.specialToken) {
          ;
        }

        while(tmp_t != null) {
          result = result + tmp_t.image + "\r\n";
          tmp_t = tmp_t.next;
        }
      }

      sentence = sentence + " " + t.image;
      if (t.kind == 0) {
        sentence = sentence + "\r\n";
        result = result + sentence + lexical;
        return result;
      }


      if(Images[t.kind]==null){
        lexical+="\t(Line:"+t.beginLine+":"+"\t"+t.image+")"+"  ";
      }
      else {
        lexical+="\t(Line:"+t.beginLine+":"+"\t"+Images[t.kind]+"\t"+t.image+")"+"  ";
      }
      lexical+="\r\n";
    }
  }

  public final String Lexicaler() throws FileNotFoundException {
    compilerTokenManager TokenManager = token_source;
    String result = "";
    String errMsg = "";
    String lexical = "";
    String sentence = "";
    int Line = 0;

    while(true) {
      Token t;
      while(true) {
        try {
          t = compilerTokenManager.getNextToken();
          break;
        } catch (TokenMgrError var11) {
          errMsg = errMsg + var11.toString() + "\r\n";

          try {
            SimpleCharStream var10000 = compilerTokenManager.input_stream;
            SimpleCharStream.readChar();
          } catch (IOException var10) {
            errMsg = errMsg + var10.getMessage() + "\r\n";
          }
        }
      }

      if ((Line == 0 || Line == t.beginLine) && t.kind != 0) {
        if (Line == 0) {
          Line = t.beginLine;
          sentence = "Line:" + Line;
        }
      } else {
        sentence = sentence + "\r\n";
        result = result + sentence + lexical;
        Line = t.beginLine;
        sentence = "Line:" + Line;
        lexical = "";
      }

      if (t.specialToken != null) {
        Token tmp_t;
        for(tmp_t = t.specialToken; tmp_t.specialToken != null; tmp_t = tmp_t.specialToken) {
          ;
        }

        while(tmp_t != null) {
          result = result + tmp_t.image + "\r\n";
          tmp_t = tmp_t.next;
        }
      }

      sentence = sentence + " " + t.image;
      if (t.kind == 0) {
        sentence = sentence + "\r\n";
        result = result + sentence + lexical;
        return errMsg;
      }

      if (Images[t.kind] == null) {
        lexical = lexical + "\t(Line:" + t.beginLine + ":" + "\t" + t.image + ")" + "  ";
      } else {
        lexical = lexical + "\t(Line:" + t.beginLine + ":" + "\t" + Images[t.kind] + "\t" + t.image + ")" + "  ";
      }

      lexical = lexical + "\r\n";
    }
  }




  static final public SimpleNode Start() throws ParseException {
                    /*@bgen(jjtree) Start */
  SimpleNode jjtn000 = new SimpleNode(JJTSTART);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      Procedure();
      jj_consume_token(43);
                  jjtree.closeNodeScope(jjtn000, true);
                  jjtc000 = false;
    {if (true) return jjtn000;}
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
    throw new Error("Missing return statement in function");
  }


  static final public void Procedure() throws ParseException {
                  /*@bgen(jjtree) Procedure */
  SimpleNode jjtn000 = new SimpleNode(JJTPROCEDURE);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      label_1:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case IF:
        case READ:
        case WRITE:
        case WHILE:
        case INT:
        case REAL:
        case BOOL:
        case IDENTIFIER:
          Statement();
          break;
        case LEFT_CUR:
          Block();
          break;
        default:
          jj_la1[0] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case IF:
        case READ:
        case WRITE:
        case WHILE:
        case INT:
        case REAL:
        case BOOL:
        case LEFT_CUR:
        case IDENTIFIER:
          ;
          break;
        default:
          jj_la1[1] = jj_gen;
          break label_1;
        }
      }
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  static final public void Statement() throws ParseException {
                  /*@bgen(jjtree) Statement */
  SimpleNode jjtn000 = new SimpleNode(JJTSTATEMENT);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case INT:
      case REAL:
      case BOOL:
        VarialbeDeclaration();
        break;
      case IDENTIFIER:
        Identifier();
        jj_consume_token(ASSIGN);
        Expression();
        jj_consume_token(SEMI);
        break;
      default:
        jj_la1[6] = jj_gen;
        if (jj_2_1(3)) {
          label_2:
          while (true) {
            jj_consume_token(IF);
            jj_consume_token(LEFT_PAR);
            Condition();
            jj_consume_token(RIGHT_PAR);
            Statement();
            switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
            case ELSE:
              jj_consume_token(ELSE);
              Statement();
              break;
            default:
              jj_la1[2] = jj_gen;
              ;
            }
            switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
            case IF:
              ;
              break;
            default:
              jj_la1[3] = jj_gen;
              break label_2;
            }
          }
        } else {
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case READ:
            jj_consume_token(READ);
            jj_consume_token(LEFT_PAR);
            Identifier();
            label_3:
            while (true) {
              switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
              case COMMA:
                ;
                break;
              default:
                jj_la1[4] = jj_gen;
                break label_3;
              }
              jj_consume_token(COMMA);
              Identifier();
            }
            jj_consume_token(RIGHT_PAR);
            jj_consume_token(SEMI);
            break;
          case WRITE:
            jj_consume_token(WRITE);
            jj_consume_token(LEFT_PAR);
            Expression();
            label_4:
            while (true) {
              switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
              case COMMA:
                ;
                break;
              default:
                jj_la1[5] = jj_gen;
                break label_4;
              }
              jj_consume_token(COMMA);
              Identifier();
            }
            jj_consume_token(RIGHT_PAR);
            jj_consume_token(SEMI);
            break;
          case WHILE:
            jj_consume_token(WHILE);
            jj_consume_token(LEFT_PAR);
            Condition();
            jj_consume_token(RIGHT_PAR);
            Statement();
            break;
          default:
            jj_la1[7] = jj_gen;
            jj_consume_token(-1);
            throw new ParseException();
          }
        }
      }
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }


  static final public void VarialbeDeclaration() throws ParseException {
                            /*@bgen(jjtree) VarialbeDeclaration */
  SimpleNode jjtn000 = new SimpleNode(JJTVARIALBEDECLARATION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case INT:
        jj_consume_token(INT);
        break;
      case REAL:
        jj_consume_token(REAL);
        break;
      case BOOL:
        jj_consume_token(BOOL);
        break;
      default:
        jj_la1[8] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case LEFT_BRA:
        jj_consume_token(LEFT_BRA);
        Expression();
        jj_consume_token(RIGHT_BRA);
        break;
      default:
        jj_la1[9] = jj_gen;
        ;
      }
      Identifier();
      label_5:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case COMMA:
          ;
          break;
        default:
          jj_la1[10] = jj_gen;
          break label_5;
        }
        jj_consume_token(COMMA);
        Identifier();
      }
      jj_consume_token(SEMI);
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  static final public void Block() throws ParseException {
              /*@bgen(jjtree) Block */
  SimpleNode jjtn000 = new SimpleNode(JJTBLOCK);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(LEFT_CUR);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case IF:
      case READ:
      case WRITE:
      case WHILE:
      case INT:
      case REAL:
      case BOOL:
      case IDENTIFIER:
        Statement();
        break;
      case LEFT_CUR:
        Block();
        break;
      default:
        jj_la1[11] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      jj_consume_token(RIGHT_CUR);
    } catch (Throwable jjte000) {
      if (jjtc000) {
        jjtree.clearNodeScope(jjtn000);
        jjtc000 = false;
      } else {
        jjtree.popNode();
      }
      if (jjte000 instanceof RuntimeException) {
        {if (true) throw (RuntimeException)jjte000;}
      }
      if (jjte000 instanceof ParseException) {
        {if (true) throw (ParseException)jjte000;}
      }
      {if (true) throw (Error)jjte000;}
    } finally {
      if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
  }


  static final public void Expression() throws ParseException {
                   /*@bgen(jjtree) Expression */
  SimpleNode jjtn000 = new SimpleNode(JJTEXPRESSION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      Term();
      label_6:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case PLUS:
        case MINUS:
          ;
          break;
        default:
          jj_la1[12] = jj_gen;
          break label_6;
        }
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case PLUS:
          jj_consume_token(PLUS);
          break;
        case MINUS:
          jj_consume_token(MINUS);
          break;
        default:
          jj_la1[13] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        Term();
      }
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }


  static final public void Term() throws ParseException {
             /*@bgen(jjtree) Term */
  SimpleNode jjtn000 = new SimpleNode(JJTTERM);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      Factor();
      label_7:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case TIMES:
        case DIVIDE:
          ;
          break;
        default:
          jj_la1[14] = jj_gen;
          break label_7;
        }
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case TIMES:
          jj_consume_token(TIMES);
          break;
        case DIVIDE:
          jj_consume_token(DIVIDE);
          break;
        default:
          jj_la1[15] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        Factor();
      }
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }


  static final public void Factor() throws ParseException {
               /*@bgen(jjtree) Factor */
  SimpleNode jjtn000 = new SimpleNode(JJTFACTOR);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case IDENTIFIER:
        Identifier();
        break;
      case LEFT_PAR:
        jj_consume_token(LEFT_PAR);
        Expression();
        jj_consume_token(RIGHT_PAR);
        break;
      case INTEGER_LITERAL:
        Integer();
        break;
      case REAL_LITERAL:
        Real();
        break;
      case BOOL_LITERAL:
        Bool();
        break;
      default:
        jj_la1[16] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }


  static final public void Condition() throws ParseException {
                  /*@bgen(jjtree) Condition */
  SimpleNode jjtn000 = new SimpleNode(JJTCONDITION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      Expression();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case EQUAL:
        jj_consume_token(EQUAL);
        break;
      case NOTEQUAL:
        jj_consume_token(NOTEQUAL);
        break;
      case LESS:
        jj_consume_token(LESS);
        break;
      case GREATER:
        jj_consume_token(GREATER);
        break;
      case LESS_EQUAL:
        jj_consume_token(LESS_EQUAL);
        break;
      case GREATER_EQUAL:
        jj_consume_token(GREATER_EQUAL);
        break;
      default:
        jj_la1[17] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      Expression();
    } catch (Throwable jjte000) {
      if (jjtc000) {
        jjtree.clearNodeScope(jjtn000);
        jjtc000 = false;
      } else {
        jjtree.popNode();
      }
      if (jjte000 instanceof RuntimeException) {
        {if (true) throw (RuntimeException)jjte000;}
      }
      if (jjte000 instanceof ParseException) {
        {if (true) throw (ParseException)jjte000;}
      }
      {if (true) throw (Error)jjte000;}
    } finally {
      if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
  }


  static final public void Identifier() throws ParseException {
                   /*@bgen(jjtree) Identifier */
  SimpleNode jjtn000 = new SimpleNode(JJTIDENTIFIER);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(IDENTIFIER);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case LEFT_BRA:
        jj_consume_token(LEFT_BRA);
        Expression();
        jj_consume_token(RIGHT_BRA);
        break;
      default:
        jj_la1[18] = jj_gen;
        ;
      }
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }


  static final public void Integer() throws ParseException {
                /*@bgen(jjtree) Integer */
  SimpleNode jjtn000 = new SimpleNode(JJTINTEGER);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(INTEGER_LITERAL);
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }


  static final public void Real() throws ParseException {
             /*@bgen(jjtree) Real */
  SimpleNode jjtn000 = new SimpleNode(JJTREAL);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(REAL_LITERAL);
    } finally {
     if (jjtc000) {
       jjtree.closeNodeScope(jjtn000, true);
     }
    }
  }

  static final public void Bool() throws ParseException {
              /*@bgen(jjtree) Bool */
  SimpleNode jjtn000 = new SimpleNode(JJTBOOL);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(BOOL_LITERAL);
    } finally {
       if (jjtc000) {
         jjtree.closeNodeScope(jjtn000, true);
       }
    }
  }

  static private boolean jj_2_1(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_1(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(0, xla); }
  }

  static private boolean jj_3R_8() {
    if (jj_scan_token(IF)) return true;
    if (jj_scan_token(LEFT_PAR)) return true;
    if (jj_3R_9()) return true;
    return false;
  }

  static private boolean jj_3R_9() {
    if (jj_3R_10()) return true;
    return false;
  }

  static private boolean jj_3R_21() {
    if (jj_scan_token(BOOL_LITERAL)) return true;
    return false;
  }

  static private boolean jj_3R_17() {
    if (jj_3R_21()) return true;
    return false;
  }

  static private boolean jj_3R_16() {
    if (jj_3R_20()) return true;
    return false;
  }

  static private boolean jj_3R_15() {
    if (jj_3R_19()) return true;
    return false;
  }

  static private boolean jj_3R_20() {
    if (jj_scan_token(REAL_LITERAL)) return true;
    return false;
  }

  static private boolean jj_3R_14() {
    if (jj_scan_token(LEFT_PAR)) return true;
    return false;
  }

  static private boolean jj_3R_12() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_13()) {
    jj_scanpos = xsp;
    if (jj_3R_14()) {
    jj_scanpos = xsp;
    if (jj_3R_15()) {
    jj_scanpos = xsp;
    if (jj_3R_16()) {
    jj_scanpos = xsp;
    if (jj_3R_17()) return true;
    }
    }
    }
    }
    return false;
  }

  static private boolean jj_3R_13() {
    if (jj_3R_18()) return true;
    return false;
  }

  static private boolean jj_3R_19() {
    if (jj_scan_token(INTEGER_LITERAL)) return true;
    return false;
  }

  static private boolean jj_3_1() {
    Token xsp;
    if (jj_3R_8()) return true;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3R_8()) { jj_scanpos = xsp; break; }
    }
    return false;
  }

  static private boolean jj_3R_11() {
    if (jj_3R_12()) return true;
    return false;
  }

  static private boolean jj_3R_18() {
    if (jj_scan_token(IDENTIFIER)) return true;
    return false;
  }

  static private boolean jj_3R_10() {
    if (jj_3R_11()) return true;
    return false;
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public compilerTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private Token jj_scanpos, jj_lastpos;
  static private int jj_la;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[19];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x8007e80,0x8007e80,0x100,0x80,0x100000,0x100000,0x7000,0xe00,0x7000,0x2000000,0x100000,0x8007e80,0xc0000000,0xc0000000,0x0,0x0,0x858000,0x0,0x2000000,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x200,0x200,0x0,0x0,0x0,0x0,0x200,0x0,0x0,0x0,0x0,0x200,0x0,0x0,0x3,0x3,0x200,0x1f8,0x0,};
   }
  static final private JJCalls[] jj_2_rtns = new JJCalls[1];
  static private boolean jj_rescan = false;
  static private int jj_gc = 0;

  /** Constructor with InputStream. */
  public compiler(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public compiler(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new compilerTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor. */
  public compiler(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new compilerTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor with generated Token Manager. */
  public compiler(compilerTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(compilerTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      if (++jj_gc > 100) {
        jj_gc = 0;
        for (int i = 0; i < jj_2_rtns.length; i++) {
          JJCalls c = jj_2_rtns[i];
          while (c != null) {
            if (c.gen < jj_gen) c.first = null;
            c = c.next;
          }
        }
      }
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }



  static private final class LookaheadSuccess extends java.lang.Error { }
  static final private LookaheadSuccess jj_ls = new LookaheadSuccess();
  static private boolean jj_scan_token(int kind) {
    if (jj_scanpos == jj_lastpos) {
      jj_la--;
      if (jj_scanpos.next == null) {
        jj_lastpos = jj_scanpos = jj_scanpos.next = token_source.getNextToken();
      } else {
        jj_lastpos = jj_scanpos = jj_scanpos.next;
      }
    } else {
      jj_scanpos = jj_scanpos.next;
    }
    if (jj_rescan) {
      int i = 0; Token tok = token;
      while (tok != null && tok != jj_scanpos) { i++; tok = tok.next; }
      if (tok != null) jj_add_error_token(kind, i);
    }
    if (jj_scanpos.kind != kind) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) throw jj_ls;
    return false;
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;
  static private int[] jj_lasttokens = new int[100];
  static private int jj_endpos;

  static private void jj_add_error_token(int kind, int pos) {
    if (pos >= 100) return;
    if (pos == jj_endpos + 1) {
      jj_lasttokens[jj_endpos++] = kind;
    } else if (jj_endpos != 0) {
      jj_expentry = new int[jj_endpos];
      for (int i = 0; i < jj_endpos; i++) {
        jj_expentry[i] = jj_lasttokens[i];
      }
      jj_entries_loop: for (java.util.Iterator<?> it = jj_expentries.iterator(); it.hasNext();) {
        int[] oldentry = (int[])(it.next());
        if (oldentry.length == jj_expentry.length) {
          for (int i = 0; i < jj_expentry.length; i++) {
            if (oldentry[i] != jj_expentry[i]) {
              continue jj_entries_loop;
            }
          }
          jj_expentries.add(jj_expentry);
          break jj_entries_loop;
        }
      }
      if (pos != 0) jj_lasttokens[(jj_endpos = pos) - 1] = kind;
    }
  }

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[44];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 19; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 44; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    jj_endpos = 0;
    jj_rescan_token();
    jj_add_error_token(0, 0);
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

  static private void jj_rescan_token() {
    jj_rescan = true;
    for (int i = 0; i < 1; i++) {
    try {
      JJCalls p = jj_2_rtns[i];
      do {
        if (p.gen > jj_gen) {
          jj_la = p.arg; jj_lastpos = jj_scanpos = p.first;
          switch (i) {
            case 0: jj_3_1(); break;
          }
        }
        p = p.next;
      } while (p != null);
      } catch(LookaheadSuccess ls) { }
    }
    jj_rescan = false;
  }

  static private void jj_save(int index, int xla) {
    JJCalls p = jj_2_rtns[index];
    while (p.gen > jj_gen) {
      if (p.next == null) { p = p.next = new JJCalls(); break; }
      p = p.next;
    }
    p.gen = jj_gen + xla - jj_la; p.first = token; p.arg = xla;
  }

  static final class JJCalls {
    int gen;
    Token first;
    int arg;
    JJCalls next;
  }

}
