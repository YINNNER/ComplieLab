package gen;
// Generated from D:/rui/Compiler/CMM_Interpreter-master/Compiler/src/main\CMM.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CMMParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		READ=1, WRITE=2, IF=3, ELSE=4, WHILE=5, BREAK=6, INT=7, DOUBLE=8, STRING=9, 
		BOOlEAN=10, COMMA=11, SEMICOLON=12, IDENT=13, INTCONSTANT=14, DOUBLECONSTANT=15, 
		STRINGCONSTANT=16, TRUE=17, FALSE=18, LBBRACKET=19, RBBRACKET=20, LMBRACKET=21, 
		RMBRACKET=22, LSBRACKET=23, RSBRACKET=24, QUOTE=25, SEQUAL=26, SMALLER=27, 
		GEQUAL=28, GREATER=29, DEQUAL=30, NEQUAL=31, EQUAL=32, PLUS=33, MINUS=34, 
		MULT=35, DIV=36, MOD=37, WS=38, SL_COMMENT=39, MUL_COMMENT=40;
	public static final int
		RULE_program = 0, RULE_stmt = 1, RULE_stmtBlock = 2, RULE_varDecl = 3, 
		RULE_type = 4, RULE_array = 5, RULE_varList = 6, RULE_ifStmt = 7, RULE_whileStmt = 8, 
		RULE_breakStmt = 9, RULE_readStmt = 10, RULE_writeStmt = 11, RULE_assignStmt = 12, 
		RULE_delassign = 13, RULE_value = 14, RULE_constant = 15, RULE_expr = 16, 
		RULE_addMin = 17, RULE_mulDiv = 18, RULE_unaryMinus = 19, RULE_atom = 20;
	public static final String[] ruleNames = {
		"program", "stmt", "stmtBlock", "varDecl", "type", "array", "varList", 
		"ifStmt", "whileStmt", "breakStmt", "readStmt", "writeStmt", "assignStmt", 
		"delassign", "value", "constant", "expr", "addMin", "mulDiv", "unaryMinus", 
		"atom"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'read'", "'write'", "'if'", "'else'", "'while'", "'break'", "'int'", 
		"'double'", "'string'", "'bool'", "','", "';'", null, null, null, null, 
		"'true'", "'false'", "'{'", "'}'", "'['", "']'", "'('", "')'", "'\"'", 
		"'<='", "'<'", "'>='", "'>'", "'=='", "'!='", "'='", "'+'", "'-'", "'*'", 
		"'/'", "'%'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "READ", "WRITE", "IF", "ELSE", "WHILE", "BREAK", "INT", "DOUBLE", 
		"STRING", "BOOlEAN", "COMMA", "SEMICOLON", "IDENT", "INTCONSTANT", "DOUBLECONSTANT", 
		"STRINGCONSTANT", "TRUE", "FALSE", "LBBRACKET", "RBBRACKET", "LMBRACKET", 
		"RMBRACKET", "LSBRACKET", "RSBRACKET", "QUOTE", "SEQUAL", "SMALLER", "GEQUAL", 
		"GREATER", "DEQUAL", "NEQUAL", "EQUAL", "PLUS", "MINUS", "MULT", "DIV", 
		"MOD", "WS", "SL_COMMENT", "MUL_COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CMM.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CMMParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42);
				stmt();
				}
				}
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << READ) | (1L << WRITE) | (1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << INT) | (1L << DOUBLE) | (1L << STRING) | (1L << BOOlEAN) | (1L << IDENT) | (1L << LBBRACKET))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public BreakStmtContext breakStmt() {
			return getRuleContext(BreakStmtContext.class,0);
		}
		public AssignStmtContext assignStmt() {
			return getRuleContext(AssignStmtContext.class,0);
		}
		public ReadStmtContext readStmt() {
			return getRuleContext(ReadStmtContext.class,0);
		}
		public WriteStmtContext writeStmt() {
			return getRuleContext(WriteStmtContext.class,0);
		}
		public StmtBlockContext stmtBlock() {
			return getRuleContext(StmtBlockContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case DOUBLE:
			case STRING:
			case BOOlEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				varDecl();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				ifStmt();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				whileStmt();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				breakStmt();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(51);
				assignStmt();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 6);
				{
				setState(52);
				readStmt();
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 7);
				{
				setState(53);
				writeStmt();
				}
				break;
			case LBBRACKET:
				enterOuterAlt(_localctx, 8);
				{
				setState(54);
				stmtBlock();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtBlockContext extends ParserRuleContext {
		public TerminalNode LBBRACKET() { return getToken(CMMParser.LBBRACKET, 0); }
		public TerminalNode RBBRACKET() { return getToken(CMMParser.RBBRACKET, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public StmtBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterStmtBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitStmtBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitStmtBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtBlockContext stmtBlock() throws RecognitionException {
		StmtBlockContext _localctx = new StmtBlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stmtBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(LBBRACKET);
			setState(59); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(58);
				stmt();
				}
				}
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << READ) | (1L << WRITE) | (1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << INT) | (1L << DOUBLE) | (1L << STRING) | (1L << BOOlEAN) | (1L << IDENT) | (1L << LBBRACKET))) != 0) );
			setState(63);
			match(RBBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarListContext varList() {
			return getRuleContext(VarListContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CMMParser.SEMICOLON, 0); }
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			type();
			setState(66);
			varList();
			setState(67);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeBoolContext extends TypeContext {
		public TerminalNode BOOlEAN() { return getToken(CMMParser.BOOlEAN, 0); }
		public TypeBoolContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterTypeBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitTypeBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitTypeBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeIntContext extends TypeContext {
		public TerminalNode INT() { return getToken(CMMParser.INT, 0); }
		public TypeIntContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterTypeInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitTypeInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitTypeInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeDoubleContext extends TypeContext {
		public TerminalNode DOUBLE() { return getToken(CMMParser.DOUBLE, 0); }
		public TypeDoubleContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterTypeDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitTypeDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitTypeDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeStringContext extends TypeContext {
		public TerminalNode STRING() { return getToken(CMMParser.STRING, 0); }
		public TypeStringContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterTypeString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitTypeString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitTypeString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new TypeIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				match(INT);
				}
				break;
			case DOUBLE:
				_localctx = new TypeDoubleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				match(DOUBLE);
				}
				break;
			case STRING:
				_localctx = new TypeStringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				match(STRING);
				}
				break;
			case BOOlEAN:
				_localctx = new TypeBoolContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(72);
				match(BOOlEAN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(CMMParser.IDENT, 0); }
		public TerminalNode LMBRACKET() { return getToken(CMMParser.LMBRACKET, 0); }
		public TerminalNode RMBRACKET() { return getToken(CMMParser.RMBRACKET, 0); }
		public TerminalNode INTCONSTANT() { return getToken(CMMParser.INTCONSTANT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(IDENT);
			setState(76);
			match(LMBRACKET);
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(77);
				match(INTCONSTANT);
				}
				break;
			case 2:
				{
				setState(78);
				expr(0);
				}
				break;
			}
			setState(81);
			match(RMBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarListContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(CMMParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(CMMParser.IDENT, i);
		}
		public List<DelassignContext> delassign() {
			return getRuleContexts(DelassignContext.class);
		}
		public DelassignContext delassign(int i) {
			return getRuleContext(DelassignContext.class,i);
		}
		public List<ArrayContext> array() {
			return getRuleContexts(ArrayContext.class);
		}
		public ArrayContext array(int i) {
			return getRuleContext(ArrayContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CMMParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CMMParser.COMMA, i);
		}
		public VarListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterVarList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitVarList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitVarList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarListContext varList() throws RecognitionException {
		VarListContext _localctx = new VarListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(83);
				match(IDENT);
				}
				break;
			case 2:
				{
				setState(84);
				delassign();
				}
				break;
			case 3:
				{
				setState(85);
				array();
				}
				break;
			}
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(88);
				match(COMMA);
				setState(92);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(89);
					match(IDENT);
					}
					break;
				case 2:
					{
					setState(90);
					delassign();
					}
					break;
				case 3:
					{
					setState(91);
					array();
					}
					break;
				}
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStmtContext extends ParserRuleContext {
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
	 
		public IfStmtContext() { }
		public void copyFrom(IfStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ONLYIFContext extends IfStmtContext {
		public TerminalNode IF() { return getToken(CMMParser.IF, 0); }
		public TerminalNode LSBRACKET() { return getToken(CMMParser.LSBRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RSBRACKET() { return getToken(CMMParser.RSBRACKET, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public StmtBlockContext stmtBlock() {
			return getRuleContext(StmtBlockContext.class,0);
		}
		public ONLYIFContext(IfStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterONLYIF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitONLYIF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitONLYIF(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IFELSEContext extends IfStmtContext {
		public TerminalNode IF() { return getToken(CMMParser.IF, 0); }
		public TerminalNode LSBRACKET() { return getToken(CMMParser.LSBRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RSBRACKET() { return getToken(CMMParser.RSBRACKET, 0); }
		public TerminalNode ELSE() { return getToken(CMMParser.ELSE, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<StmtBlockContext> stmtBlock() {
			return getRuleContexts(StmtBlockContext.class);
		}
		public StmtBlockContext stmtBlock(int i) {
			return getRuleContext(StmtBlockContext.class,i);
		}
		public IFELSEContext(IfStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterIFELSE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitIFELSE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitIFELSE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifStmt);
		try {
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new ONLYIFContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(IF);
				setState(100);
				match(LSBRACKET);
				setState(101);
				expr(0);
				setState(102);
				match(RSBRACKET);
				setState(105);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(103);
					stmt();
					}
					break;
				case 2:
					{
					setState(104);
					stmtBlock();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new IFELSEContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(IF);
				setState(108);
				match(LSBRACKET);
				setState(109);
				expr(0);
				setState(110);
				match(RSBRACKET);
				setState(113);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(111);
					stmt();
					}
					break;
				case 2:
					{
					setState(112);
					stmtBlock();
					}
					break;
				}
				setState(115);
				match(ELSE);
				setState(118);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(116);
					stmt();
					}
					break;
				case 2:
					{
					setState(117);
					stmtBlock();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(CMMParser.WHILE, 0); }
		public TerminalNode LSBRACKET() { return getToken(CMMParser.LSBRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RSBRACKET() { return getToken(CMMParser.RSBRACKET, 0); }
		public StmtBlockContext stmtBlock() {
			return getRuleContext(StmtBlockContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(WHILE);
			setState(123);
			match(LSBRACKET);
			setState(124);
			expr(0);
			setState(125);
			match(RSBRACKET);
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(126);
				stmtBlock();
				}
				break;
			case 2:
				{
				setState(127);
				stmt();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStmtContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(CMMParser.BREAK, 0); }
		public TerminalNode SEMICOLON() { return getToken(CMMParser.SEMICOLON, 0); }
		public BreakStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterBreakStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitBreakStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitBreakStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStmtContext breakStmt() throws RecognitionException {
		BreakStmtContext _localctx = new BreakStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_breakStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(BREAK);
			setState(131);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReadStmtContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(CMMParser.READ, 0); }
		public TerminalNode LSBRACKET() { return getToken(CMMParser.LSBRACKET, 0); }
		public TerminalNode RSBRACKET() { return getToken(CMMParser.RSBRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(CMMParser.SEMICOLON, 0); }
		public TerminalNode IDENT() { return getToken(CMMParser.IDENT, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ReadStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterReadStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitReadStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitReadStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadStmtContext readStmt() throws RecognitionException {
		ReadStmtContext _localctx = new ReadStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_readStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(READ);
			setState(134);
			match(LSBRACKET);
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				{
				setState(135);
				match(IDENT);
				}
				}
				break;
			case 2:
				{
				{
				setState(136);
				array();
				}
				}
				break;
			}
			setState(139);
			match(RSBRACKET);
			setState(140);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WriteStmtContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(CMMParser.WRITE, 0); }
		public TerminalNode LSBRACKET() { return getToken(CMMParser.LSBRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RSBRACKET() { return getToken(CMMParser.RSBRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(CMMParser.SEMICOLON, 0); }
		public WriteStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterWriteStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitWriteStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitWriteStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteStmtContext writeStmt() throws RecognitionException {
		WriteStmtContext _localctx = new WriteStmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_writeStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(WRITE);
			setState(143);
			match(LSBRACKET);
			setState(144);
			expr(0);
			setState(145);
			match(RSBRACKET);
			setState(146);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignStmtContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(CMMParser.EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CMMParser.SEMICOLON, 0); }
		public AssignStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterAssignStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitAssignStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitAssignStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStmtContext assignStmt() throws RecognitionException {
		AssignStmtContext _localctx = new AssignStmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			value();
			setState(149);
			match(EQUAL);
			setState(150);
			expr(0);
			setState(151);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DelassignContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(CMMParser.IDENT, 0); }
		public TerminalNode EQUAL() { return getToken(CMMParser.EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DelassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delassign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterDelassign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitDelassign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitDelassign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DelassignContext delassign() throws RecognitionException {
		DelassignContext _localctx = new DelassignContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_delassign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(IDENT);
			setState(154);
			match(EQUAL);
			setState(155);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(CMMParser.IDENT, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_value);
		try {
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(157);
				match(IDENT);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(158);
				array();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode INTCONSTANT() { return getToken(CMMParser.INTCONSTANT, 0); }
		public TerminalNode DOUBLECONSTANT() { return getToken(CMMParser.DOUBLECONSTANT, 0); }
		public TerminalNode STRINGCONSTANT() { return getToken(CMMParser.STRINGCONSTANT, 0); }
		public TerminalNode TRUE() { return getToken(CMMParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CMMParser.FALSE, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_constant);
		int _la;
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTCONSTANT:
			case DOUBLECONSTANT:
			case STRINGCONSTANT:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTCONSTANT) | (1L << DOUBLECONSTANT) | (1L << STRINGCONSTANT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class STExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SMALLER() { return getToken(CMMParser.SMALLER, 0); }
		public AddMinContext addMin() {
			return getRuleContext(AddMinContext.class,0);
		}
		public STExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterSTExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitSTExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitSTExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GEExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode GEQUAL() { return getToken(CMMParser.GEQUAL, 0); }
		public AddMinContext addMin() {
			return getRuleContext(AddMinContext.class,0);
		}
		public GEExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterGEExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitGEExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitGEExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DEQUAL() { return getToken(CMMParser.DEQUAL, 0); }
		public AddMinContext addMin() {
			return getRuleContext(AddMinContext.class,0);
		}
		public EExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterEExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitEExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitEExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SEExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEQUAL() { return getToken(CMMParser.SEQUAL, 0); }
		public AddMinContext addMin() {
			return getRuleContext(AddMinContext.class,0);
		}
		public SEExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterSEExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitSEExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitSEExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GTExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode GREATER() { return getToken(CMMParser.GREATER, 0); }
		public AddMinContext addMin() {
			return getRuleContext(AddMinContext.class,0);
		}
		public GTExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterGTExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitGTExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitGTExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NEExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEQUAL() { return getToken(CMMParser.NEQUAL, 0); }
		public AddMinContext addMin() {
			return getRuleContext(AddMinContext.class,0);
		}
		public NEExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterNEExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitNEExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitNEExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToAddminExprContext extends ExprContext {
		public AddMinContext addMin() {
			return getRuleContext(AddMinContext.class,0);
		}
		public ToAddminExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterToAddminExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitToAddminExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitToAddminExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToAddminExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(166);
			addMin(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(186);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new SEExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(168);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(169);
						match(SEQUAL);
						setState(170);
						addMin(0);
						}
						break;
					case 2:
						{
						_localctx = new GEExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(171);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(172);
						match(GEQUAL);
						setState(173);
						addMin(0);
						}
						break;
					case 3:
						{
						_localctx = new GTExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(174);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(175);
						match(GREATER);
						setState(176);
						addMin(0);
						}
						break;
					case 4:
						{
						_localctx = new STExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(177);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(178);
						match(SMALLER);
						setState(179);
						addMin(0);
						}
						break;
					case 5:
						{
						_localctx = new EExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(180);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(181);
						match(DEQUAL);
						setState(182);
						addMin(0);
						}
						break;
					case 6:
						{
						_localctx = new NEExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(183);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(184);
						match(NEQUAL);
						setState(185);
						addMin(0);
						}
						break;
					}
					} 
				}
				setState(190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AddMinContext extends ParserRuleContext {
		public AddMinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addMin; }
	 
		public AddMinContext() { }
		public void copyFrom(AddMinContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TomulDivContext extends AddMinContext {
		public MulDivContext mulDiv() {
			return getRuleContext(MulDivContext.class,0);
		}
		public TomulDivContext(AddMinContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterTomulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitTomulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitTomulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusContext extends AddMinContext {
		public AddMinContext addMin() {
			return getRuleContext(AddMinContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(CMMParser.PLUS, 0); }
		public MulDivContext mulDiv() {
			return getRuleContext(MulDivContext.class,0);
		}
		public PlusContext(AddMinContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusContext extends AddMinContext {
		public AddMinContext addMin() {
			return getRuleContext(AddMinContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(CMMParser.MINUS, 0); }
		public MulDivContext mulDiv() {
			return getRuleContext(MulDivContext.class,0);
		}
		public MinusContext(AddMinContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddMinContext addMin() throws RecognitionException {
		return addMin(0);
	}

	private AddMinContext addMin(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AddMinContext _localctx = new AddMinContext(_ctx, _parentState);
		AddMinContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_addMin, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TomulDivContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(192);
			mulDiv(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(200);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new PlusContext(new AddMinContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_addMin);
						setState(194);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(195);
						match(PLUS);
						setState(196);
						mulDiv(0);
						}
						break;
					case 2:
						{
						_localctx = new MinusContext(new AddMinContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_addMin);
						setState(197);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(198);
						match(MINUS);
						setState(199);
						mulDiv(0);
						}
						break;
					}
					} 
				}
				setState(204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MulDivContext extends ParserRuleContext {
		public MulDivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulDiv; }
	 
		public MulDivContext() { }
		public void copyFrom(MulDivContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TounaryMinusContext extends MulDivContext {
		public UnaryMinusContext unaryMinus() {
			return getRuleContext(UnaryMinusContext.class,0);
		}
		public TounaryMinusContext(MulDivContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterTounaryMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitTounaryMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitTounaryMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicationContext extends MulDivContext {
		public MulDivContext mulDiv() {
			return getRuleContext(MulDivContext.class,0);
		}
		public TerminalNode MULT() { return getToken(CMMParser.MULT, 0); }
		public UnaryMinusContext unaryMinus() {
			return getRuleContext(UnaryMinusContext.class,0);
		}
		public MultiplicationContext(MulDivContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitMultiplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivisionContext extends MulDivContext {
		public MulDivContext mulDiv() {
			return getRuleContext(MulDivContext.class,0);
		}
		public TerminalNode DIV() { return getToken(CMMParser.DIV, 0); }
		public UnaryMinusContext unaryMinus() {
			return getRuleContext(UnaryMinusContext.class,0);
		}
		public DivisionContext(MulDivContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitDivision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulDivContext mulDiv() throws RecognitionException {
		return mulDiv(0);
	}

	private MulDivContext mulDiv(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MulDivContext _localctx = new MulDivContext(_ctx, _parentState);
		MulDivContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_mulDiv, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TounaryMinusContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(206);
			unaryMinus();
			}
			_ctx.stop = _input.LT(-1);
			setState(216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(214);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationContext(new MulDivContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mulDiv);
						setState(208);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(209);
						match(MULT);
						setState(210);
						unaryMinus();
						}
						break;
					case 2:
						{
						_localctx = new DivisionContext(new MulDivContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mulDiv);
						setState(211);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(212);
						match(DIV);
						setState(213);
						unaryMinus();
						}
						break;
					}
					} 
				}
				setState(218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryMinusContext extends ParserRuleContext {
		public UnaryMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryMinus; }
	 
		public UnaryMinusContext() { }
		public void copyFrom(UnaryMinusContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ChangeSignContext extends UnaryMinusContext {
		public TerminalNode MINUS() { return getToken(CMMParser.MINUS, 0); }
		public UnaryMinusContext unaryMinus() {
			return getRuleContext(UnaryMinusContext.class,0);
		}
		public ChangeSignContext(UnaryMinusContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterChangeSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitChangeSign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitChangeSign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToAtomContext extends UnaryMinusContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ToAtomContext(UnaryMinusContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterToAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitToAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitToAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryMinusContext unaryMinus() throws RecognitionException {
		UnaryMinusContext _localctx = new UnaryMinusContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_unaryMinus);
		try {
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				_localctx = new ChangeSignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				match(MINUS);
				setState(220);
				unaryMinus();
				}
				break;
			case IDENT:
			case INTCONSTANT:
			case DOUBLECONSTANT:
			case STRINGCONSTANT:
			case TRUE:
			case FALSE:
			case LSBRACKET:
				_localctx = new ToAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ToArrayContext extends AtomContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ToArrayContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterToArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitToArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitToArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierContext extends AtomContext {
		public TerminalNode IDENT() { return getToken(CMMParser.IDENT, 0); }
		public IdentifierContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToExprContext extends AtomContext {
		public TerminalNode LSBRACKET() { return getToken(CMMParser.LSBRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RSBRACKET() { return getToken(CMMParser.RSBRACKET, 0); }
		public ToExprContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterToExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitToExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitToExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToConstantContext extends AtomContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ToConstantContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterToConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitToConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitToConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_atom);
		try {
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new IdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				match(IDENT);
				}
				break;
			case 2:
				_localctx = new ToConstantContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				constant();
				}
				break;
			case 3:
				_localctx = new ToArrayContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(226);
				array();
				}
				break;
			case 4:
				_localctx = new ToExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(227);
				match(LSBRACKET);
				setState(228);
				expr(0);
				setState(229);
				match(RSBRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 17:
			return addMin_sempred((AddMinContext)_localctx, predIndex);
		case 18:
			return mulDiv_sempred((MulDivContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean addMin_sempred(AddMinContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean mulDiv_sempred(MulDivContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u00ec\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\6\2.\n\2\r\2\16\2/\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3:\n\3\3\4\3\4\6\4>\n\4\r\4\16\4?\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6L\n\6\3\7\3\7\3\7\3\7\5\7R\n\7\3\7"+
		"\3\7\3\b\3\b\3\b\5\bY\n\b\3\b\3\b\3\b\3\b\5\b_\n\b\7\ba\n\b\f\b\16\bd"+
		"\13\b\3\t\3\t\3\t\3\t\3\t\3\t\5\tl\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tt\n"+
		"\t\3\t\3\t\3\t\5\ty\n\t\5\t{\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0083\n\n"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u008c\n\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\5"+
		"\20\u00a2\n\20\3\21\3\21\5\21\u00a6\n\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\7\22\u00bd\n\22\f\22\16\22\u00c0\13\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\7\23\u00cb\n\23\f\23\16\23\u00ce\13\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00d9\n\24\f\24\16\24\u00dc\13"+
		"\24\3\25\3\25\3\25\5\25\u00e1\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\5\26\u00ea\n\26\3\26\2\5\"$&\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*\2\4\3\2\20\22\3\2\23\24\2\u00fe\2-\3\2\2\2\49\3\2\2\2\6;\3\2\2"+
		"\2\bC\3\2\2\2\nK\3\2\2\2\fM\3\2\2\2\16X\3\2\2\2\20z\3\2\2\2\22|\3\2\2"+
		"\2\24\u0084\3\2\2\2\26\u0087\3\2\2\2\30\u0090\3\2\2\2\32\u0096\3\2\2\2"+
		"\34\u009b\3\2\2\2\36\u00a1\3\2\2\2 \u00a5\3\2\2\2\"\u00a7\3\2\2\2$\u00c1"+
		"\3\2\2\2&\u00cf\3\2\2\2(\u00e0\3\2\2\2*\u00e9\3\2\2\2,.\5\4\3\2-,\3\2"+
		"\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\3\3\2\2\2\61:\5\b\5\2\62:\5\20"+
		"\t\2\63:\5\22\n\2\64:\5\24\13\2\65:\5\32\16\2\66:\5\26\f\2\67:\5\30\r"+
		"\28:\5\6\4\29\61\3\2\2\29\62\3\2\2\29\63\3\2\2\29\64\3\2\2\29\65\3\2\2"+
		"\29\66\3\2\2\29\67\3\2\2\298\3\2\2\2:\5\3\2\2\2;=\7\25\2\2<>\5\4\3\2="+
		"<\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2\2@A\3\2\2\2AB\7\26\2\2B\7\3\2\2"+
		"\2CD\5\n\6\2DE\5\16\b\2EF\7\16\2\2F\t\3\2\2\2GL\7\t\2\2HL\7\n\2\2IL\7"+
		"\13\2\2JL\7\f\2\2KG\3\2\2\2KH\3\2\2\2KI\3\2\2\2KJ\3\2\2\2L\13\3\2\2\2"+
		"MN\7\17\2\2NQ\7\27\2\2OR\7\20\2\2PR\5\"\22\2QO\3\2\2\2QP\3\2\2\2RS\3\2"+
		"\2\2ST\7\30\2\2T\r\3\2\2\2UY\7\17\2\2VY\5\34\17\2WY\5\f\7\2XU\3\2\2\2"+
		"XV\3\2\2\2XW\3\2\2\2Yb\3\2\2\2Z^\7\r\2\2[_\7\17\2\2\\_\5\34\17\2]_\5\f"+
		"\7\2^[\3\2\2\2^\\\3\2\2\2^]\3\2\2\2_a\3\2\2\2`Z\3\2\2\2ad\3\2\2\2b`\3"+
		"\2\2\2bc\3\2\2\2c\17\3\2\2\2db\3\2\2\2ef\7\5\2\2fg\7\31\2\2gh\5\"\22\2"+
		"hk\7\32\2\2il\5\4\3\2jl\5\6\4\2ki\3\2\2\2kj\3\2\2\2l{\3\2\2\2mn\7\5\2"+
		"\2no\7\31\2\2op\5\"\22\2ps\7\32\2\2qt\5\4\3\2rt\5\6\4\2sq\3\2\2\2sr\3"+
		"\2\2\2tu\3\2\2\2ux\7\6\2\2vy\5\4\3\2wy\5\6\4\2xv\3\2\2\2xw\3\2\2\2y{\3"+
		"\2\2\2ze\3\2\2\2zm\3\2\2\2{\21\3\2\2\2|}\7\7\2\2}~\7\31\2\2~\177\5\"\22"+
		"\2\177\u0082\7\32\2\2\u0080\u0083\5\6\4\2\u0081\u0083\5\4\3\2\u0082\u0080"+
		"\3\2\2\2\u0082\u0081\3\2\2\2\u0083\23\3\2\2\2\u0084\u0085\7\b\2\2\u0085"+
		"\u0086\7\16\2\2\u0086\25\3\2\2\2\u0087\u0088\7\3\2\2\u0088\u008b\7\31"+
		"\2\2\u0089\u008c\7\17\2\2\u008a\u008c\5\f\7\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\7\32\2\2\u008e\u008f\7"+
		"\16\2\2\u008f\27\3\2\2\2\u0090\u0091\7\4\2\2\u0091\u0092\7\31\2\2\u0092"+
		"\u0093\5\"\22\2\u0093\u0094\7\32\2\2\u0094\u0095\7\16\2\2\u0095\31\3\2"+
		"\2\2\u0096\u0097\5\36\20\2\u0097\u0098\7\"\2\2\u0098\u0099\5\"\22\2\u0099"+
		"\u009a\7\16\2\2\u009a\33\3\2\2\2\u009b\u009c\7\17\2\2\u009c\u009d\7\""+
		"\2\2\u009d\u009e\5\"\22\2\u009e\35\3\2\2\2\u009f\u00a2\7\17\2\2\u00a0"+
		"\u00a2\5\f\7\2\u00a1\u009f\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\37\3\2\2"+
		"\2\u00a3\u00a6\t\2\2\2\u00a4\u00a6\t\3\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4"+
		"\3\2\2\2\u00a6!\3\2\2\2\u00a7\u00a8\b\22\1\2\u00a8\u00a9\5$\23\2\u00a9"+
		"\u00be\3\2\2\2\u00aa\u00ab\f\t\2\2\u00ab\u00ac\7\34\2\2\u00ac\u00bd\5"+
		"$\23\2\u00ad\u00ae\f\b\2\2\u00ae\u00af\7\36\2\2\u00af\u00bd\5$\23\2\u00b0"+
		"\u00b1\f\7\2\2\u00b1\u00b2\7\37\2\2\u00b2\u00bd\5$\23\2\u00b3\u00b4\f"+
		"\6\2\2\u00b4\u00b5\7\35\2\2\u00b5\u00bd\5$\23\2\u00b6\u00b7\f\5\2\2\u00b7"+
		"\u00b8\7 \2\2\u00b8\u00bd\5$\23\2\u00b9\u00ba\f\4\2\2\u00ba\u00bb\7!\2"+
		"\2\u00bb\u00bd\5$\23\2\u00bc\u00aa\3\2\2\2\u00bc\u00ad\3\2\2\2\u00bc\u00b0"+
		"\3\2\2\2\u00bc\u00b3\3\2\2\2\u00bc\u00b6\3\2\2\2\u00bc\u00b9\3\2\2\2\u00bd"+
		"\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf#\3\2\2\2"+
		"\u00c0\u00be\3\2\2\2\u00c1\u00c2\b\23\1\2\u00c2\u00c3\5&\24\2\u00c3\u00cc"+
		"\3\2\2\2\u00c4\u00c5\f\5\2\2\u00c5\u00c6\7#\2\2\u00c6\u00cb\5&\24\2\u00c7"+
		"\u00c8\f\4\2\2\u00c8\u00c9\7$\2\2\u00c9\u00cb\5&\24\2\u00ca\u00c4\3\2"+
		"\2\2\u00ca\u00c7\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd%\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\b\24\1\2"+
		"\u00d0\u00d1\5(\25\2\u00d1\u00da\3\2\2\2\u00d2\u00d3\f\5\2\2\u00d3\u00d4"+
		"\7%\2\2\u00d4\u00d9\5(\25\2\u00d5\u00d6\f\4\2\2\u00d6\u00d7\7&\2\2\u00d7"+
		"\u00d9\5(\25\2\u00d8\u00d2\3\2\2\2\u00d8\u00d5\3\2\2\2\u00d9\u00dc\3\2"+
		"\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\'\3\2\2\2\u00dc\u00da"+
		"\3\2\2\2\u00dd\u00de\7$\2\2\u00de\u00e1\5(\25\2\u00df\u00e1\5*\26\2\u00e0"+
		"\u00dd\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1)\3\2\2\2\u00e2\u00ea\7\17\2\2"+
		"\u00e3\u00ea\5 \21\2\u00e4\u00ea\5\f\7\2\u00e5\u00e6\7\31\2\2\u00e6\u00e7"+
		"\5\"\22\2\u00e7\u00e8\7\32\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e2\3\2\2\2"+
		"\u00e9\u00e3\3\2\2\2\u00e9\u00e4\3\2\2\2\u00e9\u00e5\3\2\2\2\u00ea+\3"+
		"\2\2\2\32/9?KQX^bksxz\u0082\u008b\u00a1\u00a5\u00bc\u00be\u00ca\u00cc"+
		"\u00d8\u00da\u00e0\u00e9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}