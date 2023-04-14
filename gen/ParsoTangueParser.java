// Generated from /Users/glebbeglecov/IdeaProjects/ParsoTangue AST/src/main/antlr4/ParsoTangue.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ParsoTangueParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, STRING=6, LET=7, RETURN=8, IF=9, 
		ELSE=10, END=11, ASSIGMENT=12, TYPE=13, VOID=14, BOOL_VAR=15, GT_EQ=16, 
		LS_EQ=17, EQ=18, NOT_EQ=19, GT=20, LS=21, NOT=22, MULTIPLY=23, DIV=24, 
		MOD=25, PLUS=26, MINUS=27, ID=28, NUMBER=29, WHITESPACE=30;
	public static final int
		RULE_program = 0, RULE_function = 1, RULE_function_blocks_list = 2, RULE_return = 3, 
		RULE_if_statement = 4, RULE_elif_statement = 5, RULE_else_statement = 6, 
		RULE_statement = 7, RULE_block = 8, RULE_parameter_var = 9, RULE_declaration = 10, 
		RULE_assigment = 11, RULE_expression = 12, RULE_bool_expr = 13, RULE_bool_op_with_expr = 14, 
		RULE_bool_expr_or_bool_var = 15, RULE_number_bool_expr = 16, RULE_string_bool_expr = 17, 
		RULE_bool_expr_var = 18, RULE_math_expr = 19, RULE_number_math_expr = 20, 
		RULE_negative_math_expr = 21, RULE_string_math_expr = 22, RULE_string_plus = 23, 
		RULE_number_expr_var = 24, RULE_string_expr_var = 25, RULE_function_call = 26, 
		RULE_function_parameters_list = 27, RULE_function_parameter = 28, RULE_function_var = 29, 
		RULE_function_type = 30, RULE_bool_operator = 31, RULE_first_bool_operator = 32, 
		RULE_second_bool_operator = 33, RULE_first_math_operator = 34, RULE_second_math_operator = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "function", "function_blocks_list", "return", "if_statement", 
			"elif_statement", "else_statement", "statement", "block", "parameter_var", 
			"declaration", "assigment", "expression", "bool_expr", "bool_op_with_expr", 
			"bool_expr_or_bool_var", "number_bool_expr", "string_bool_expr", "bool_expr_var", 
			"math_expr", "number_math_expr", "negative_math_expr", "string_math_expr", 
			"string_plus", "number_expr_var", "string_expr_var", "function_call", 
			"function_parameters_list", "function_parameter", "function_var", "function_type", 
			"bool_operator", "first_bool_operator", "second_bool_operator", "first_math_operator", 
			"second_math_operator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "')'", "'{'", "'}'", null, "'let'", "'return'", "'if'", 
			"'else'", "';'", "':='", null, "'void'", null, "'>='", "'<='", "'=='", 
			"'!='", "'>'", "'<'", "'!'", "'*'", "'/'", "'%'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "STRING", "LET", "RETURN", "IF", 
			"ELSE", "END", "ASSIGMENT", "TYPE", "VOID", "BOOL_VAR", "GT_EQ", "LS_EQ", 
			"EQ", "NOT_EQ", "GT", "LS", "NOT", "MULTIPLY", "DIV", "MOD", "PLUS", 
			"MINUS", "ID", "NUMBER", "WHITESPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "ParsoTangue.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ParsoTangueParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ParsoTangueParser.EOF, 0); }
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsoTangueVisitor ) return ((ParsoTangueVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(73); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(72);
				function();
				}
				}
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LET );
			setState(77);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(ParsoTangueParser.LET, 0); }
		public Function_typeContext function_type() {
			return getRuleContext(Function_typeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ParsoTangueParser.ID, 0); }
		public Function_blocks_listContext function_blocks_list() {
			return getRuleContext(Function_blocks_listContext.class,0);
		}
		public List<Parameter_varContext> parameter_var() {
			return getRuleContexts(Parameter_varContext.class);
		}
		public Parameter_varContext parameter_var(int i) {
			return getRuleContext(Parameter_varContext.class,i);
		}
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
		}
		public TerminalNode END() { return getToken(ParsoTangueParser.END, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsoTangueVisitor ) return ((ParsoTangueVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(LET);
			setState(80);
			function_type();
			setState(81);
			match(ID);
			setState(82);
			match(T__0);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(83);
				parameter_var();
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(84);
					match(T__1);
					setState(85);
					parameter_var();
					}
					}
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
			match(T__2);
			setState(97);
			match(T__3);
			setState(98);
			function_blocks_list();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(99);
				return_();
				setState(100);
				match(END);
				}
			}

			setState(104);
			match(T__4);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_blocks_listContext extends ParserRuleContext {
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public Function_blocks_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_blocks_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).enterFunction_blocks_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).exitFunction_blocks_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsoTangueVisitor ) return ((ParsoTangueVisitor<? extends T>)visitor).visitFunction_blocks_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_blocks_listContext function_blocks_list() throws RecognitionException {
		Function_blocks_listContext _localctx = new Function_blocks_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function_blocks_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 268444160L) != 0)) {
				{
				{
				setState(106);
				block();
				}
				}
				setState(111);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(ParsoTangueParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsoTangueVisitor ) return ((ParsoTangueVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(RETURN);
			setState(113);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ParsoTangueParser.IF, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Elif_statementContext elif_statement() {
			return getRuleContext(Elif_statementContext.class,0);
		}
		public Else_statementContext else_statement() {
			return getRuleContext(Else_statementContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsoTangueVisitor ) return ((ParsoTangueVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(IF);
			setState(116);
			statement();
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(117);
				elif_statement();
				}
				break;
			case 2:
				{
				setState(118);
				else_statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Elif_statementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(ParsoTangueParser.ELSE, 0); }
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Elif_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).enterElif_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).exitElif_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsoTangueVisitor ) return ((ParsoTangueVisitor<? extends T>)visitor).visitElif_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elif_statementContext elif_statement() throws RecognitionException {
		Elif_statementContext _localctx = new Elif_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_elif_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(ELSE);
			setState(122);
			if_statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Else_statementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(ParsoTangueParser.ELSE, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public Else_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).enterElse_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).exitElse_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsoTangueVisitor ) return ((ParsoTangueVisitor<? extends T>)visitor).visitElse_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_statementContext else_statement() throws RecognitionException {
		Else_statementContext _localctx = new Else_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_else_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(ELSE);
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				{
				setState(125);
				match(T__3);
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 268444160L) != 0)) {
					{
					{
					setState(126);
					block();
					}
					}
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(132);
				match(T__4);
				}
				break;
			case IF:
			case TYPE:
			case ID:
				{
				setState(133);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsoTangueVisitor ) return ((ParsoTangueVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(T__0);
			setState(137);
			bool_expr();
			setState(138);
			match(T__2);
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				{
				setState(139);
				match(T__3);
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 268444160L) != 0)) {
					{
					{
					setState(140);
					block();
					}
					}
					setState(145);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(146);
				match(T__4);
				}
				break;
			case IF:
			case TYPE:
			case ID:
				{
				setState(147);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode END() { return getToken(ParsoTangueParser.END, 0); }
		public AssigmentContext assigment() {
			return getRuleContext(AssigmentContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsoTangueVisitor ) return ((ParsoTangueVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				declaration();
				setState(151);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				assigment();
				setState(154);
				match(END);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				function_call();
				setState(157);
				match(END);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
				if_statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Parameter_varContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(ParsoTangueParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(ParsoTangueParser.ID, 0); }
		public Parameter_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).enterParameter_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).exitParameter_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsoTangueVisitor ) return ((ParsoTangueVisitor<? extends T>)visitor).visitParameter_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_varContext parameter_var() throws RecognitionException {
		Parameter_varContext _localctx = new Parameter_varContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parameter_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(TYPE);
			setState(163);
			match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(ParsoTangueParser.TYPE, 0); }
		public AssigmentContext assigment() {
			return getRuleContext(AssigmentContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsoTangueVisitor ) return ((ParsoTangueVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(TYPE);
			setState(166);
			assigment();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssigmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ParsoTangueParser.ID, 0); }
		public TerminalNode ASSIGMENT() { return getToken(ParsoTangueParser.ASSIGMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssigmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assigment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).enterAssigment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).exitAssigment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsoTangueVisitor ) return ((ParsoTangueVisitor<? extends T>)visitor).visitAssigment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssigmentContext assigment() throws RecognitionException {
		AssigmentContext _localctx = new AssigmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assigment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(ID);
			setState(169);
			match(ASSIGMENT);
			setState(170);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Math_exprContext math_expr() {
			return getRuleContext(Math_exprContext.class,0);
		}
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsoTangueVisitor ) return ((ParsoTangueVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expression);
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				math_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				bool_expr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Bool_exprContext extends ParserRuleContext {
		public Bool_expr_or_bool_varContext bool_expr_or_bool_var() {
			return getRuleContext(Bool_expr_or_bool_varContext.class,0);
		}
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public List<Bool_op_with_exprContext> bool_op_with_expr() {
			return getRuleContexts(Bool_op_with_exprContext.class);
		}
		public Bool_op_with_exprContext bool_op_with_expr(int i) {
			return getRuleContext(Bool_op_with_exprContext.class,i);
		}
		public Bool_expr_varContext bool_expr_var() {
			return getRuleContext(Bool_expr_varContext.class,0);
		}
		public Number_bool_exprContext number_bool_expr() {
			return getRuleContext(Number_bool_exprContext.class,0);
		}
		public String_bool_exprContext string_bool_expr() {
			return getRuleContext(String_bool_exprContext.class,0);
		}
		public Bool_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).enterBool_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).exitBool_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsoTangueVisitor ) return ((ParsoTangueVisitor<? extends T>)visitor).visitBool_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_exprContext bool_expr() throws RecognitionException {
		Bool_exprContext _localctx = new Bool_exprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_bool_expr);
		int _la;
		try {
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				bool_expr_or_bool_var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				match(T__0);
				setState(178);
				bool_expr();
				setState(179);
				match(T__2);
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==EQ || _la==NOT_EQ) {
					{
					{
					setState(180);
					bool_op_with_expr();
					}
					}
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				bool_expr_var();
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==EQ || _la==NOT_EQ) {
					{
					{
					setState(187);
					bool_op_with_expr();
					}
					}
					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(193);
				number_bool_expr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(194);
				string_bool_expr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Bool_op_with_exprContext extends ParserRuleContext {
		public Second_bool_operatorContext second_bool_operator() {
			return getRuleContext(Second_bool_operatorContext.class,0);
		}
		public Bool_expr_or_bool_varContext bool_expr_or_bool_var() {
			return getRuleContext(Bool_expr_or_bool_varContext.class,0);
		}
		public Bool_op_with_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_op_with_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).enterBool_op_with_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).exitBool_op_with_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsoTangueVisitor ) return ((ParsoTangueVisitor<? extends T>)visitor).visitBool_op_with_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_op_with_exprContext bool_op_with_expr() throws RecognitionException {
		Bool_op_with_exprContext _localctx = new Bool_op_with_exprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_bool_op_with_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			second_bool_operator();
			setState(198);
			bool_expr_or_bool_var();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Bool_expr_or_bool_varContext extends ParserRuleContext {
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Bool_expr_varContext bool_expr_var() {
			return getRuleContext(Bool_expr_varContext.class,0);
		}
		public Bool_expr_or_bool_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_or_bool_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).enterBool_expr_or_bool_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).exitBool_expr_or_bool_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsoTangueVisitor ) return ((ParsoTangueVisitor<? extends T>)visitor).visitBool_expr_or_bool_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_or_bool_varContext bool_expr_or_bool_var() throws RecognitionException {
		Bool_expr_or_bool_varContext _localctx = new Bool_expr_or_bool_varContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_bool_expr_or_bool_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(200);
				match(T__0);
				setState(201);
				bool_expr();
				setState(202);
				match(T__2);
				}
				break;
			case BOOL_VAR:
			case ID:
				{
				setState(204);
				bool_expr_var();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Number_bool_exprContext extends ParserRuleContext {
		public List<Number_expr_varContext> number_expr_var() {
			return getRuleContexts(Number_expr_varContext.class);
		}
		public Number_expr_varContext number_expr_var(int i) {
			return getRuleContext(Number_expr_varContext.class,i);
		}
		public First_bool_operatorContext first_bool_operator() {
			return getRuleContext(First_bool_operatorContext.class,0);
		}
		public Second_bool_operatorContext second_bool_operator() {
			return getRuleContext(Second_bool_operatorContext.class,0);
		}
		public Number_bool_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_bool_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).enterNumber_bool_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).exitNumber_bool_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsoTangueVisitor ) return ((ParsoTangueVisitor<? extends T>)visitor).visitNumber_bool_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Number_bool_exprContext number_bool_expr() throws RecognitionException {
		Number_bool_exprContext _localctx = new Number_bool_exprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_number_bool_expr);
		try {
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				number_expr_var();
				setState(208);
				first_bool_operator();
				setState(209);
				number_expr_var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				number_expr_var();
				setState(212);
				second_bool_operator();
				setState(213);
				number_expr_var();
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

	@SuppressWarnings("CheckReturnValue")
	public static class String_bool_exprContext extends ParserRuleContext {
		public List<String_expr_varContext> string_expr_var() {
			return getRuleContexts(String_expr_varContext.class);
		}
		public String_expr_varContext string_expr_var(int i) {
			return getRuleContext(String_expr_varContext.class,i);
		}
		public Bool_operatorContext bool_operator() {
			return getRuleContext(Bool_operatorContext.class,0);
		}
		public String_bool_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_bool_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).enterString_bool_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).exitString_bool_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsoTangueVisitor ) return ((ParsoTangueVisitor<? extends T>)visitor).visitString_bool_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_bool_exprContext string_bool_expr() throws RecognitionException {
		String_bool_exprContext _localctx = new String_bool_exprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_string_bool_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			string_expr_var();
			setState(218);
			bool_operator();
			setState(219);
			string_expr_var();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Bool_expr_varContext extends ParserRuleContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode ID() { return getToken(ParsoTangueParser.ID, 0); }
		public TerminalNode BOOL_VAR() { return getToken(ParsoTangueParser.BOOL_VAR, 0); }
		public Bool_expr_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).enterBool_expr_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).exitBool_expr_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsoTangueVisitor ) return ((ParsoTangueVisitor<? extends T>)visitor).visitBool_expr_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_varContext bool_expr_var() throws RecognitionException {
		Bool_expr_varContext _localctx = new Bool_expr_varContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_bool_expr_var);
		try {
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				function_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				match(BOOL_VAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Math_exprContext extends ParserRuleContext {
		public Number_math_exprContext number_math_expr() {
			return getRuleContext(Number_math_exprContext.class,0);
		}
		public String_math_exprContext string_math_expr() {
			return getRuleContext(String_math_exprContext.class,0);
		}
		public Math_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).enterMath_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).exitMath_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsoTangueVisitor ) return ((ParsoTangueVisitor<? extends T>)visitor).visitMath_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_exprContext math_expr() throws RecognitionException {
		Math_exprContext _localctx = new Math_exprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_math_expr);
		try {
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				number_math_expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				string_math_expr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Number_math_exprContext extends ParserRuleContext {
		public Number_expr_varContext number_expr_var() {
			return getRuleContext(Number_expr_varContext.class,0);
		}
		public List<Number_math_exprContext> number_math_expr() {
			return getRuleContexts(Number_math_exprContext.class);
		}
		public Number_math_exprContext number_math_expr(int i) {
			return getRuleContext(Number_math_exprContext.class,i);
		}
		public Negative_math_exprContext negative_math_expr() {
			return getRuleContext(Negative_math_exprContext.class,0);
		}
		public First_math_operatorContext first_math_operator() {
			return getRuleContext(First_math_operatorContext.class,0);
		}
		public Second_math_operatorContext second_math_operator() {
			return getRuleContext(Second_math_operatorContext.class,0);
		}
		public Number_math_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_math_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).enterNumber_math_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).exitNumber_math_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsoTangueVisitor ) return ((ParsoTangueVisitor<? extends T>)visitor).visitNumber_math_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Number_math_exprContext number_math_expr() throws RecognitionException {
		return number_math_expr(0);
	}

	private Number_math_exprContext number_math_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Number_math_exprContext _localctx = new Number_math_exprContext(_ctx, _parentState);
		Number_math_exprContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_number_math_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case NUMBER:
				{
				setState(231);
				number_expr_var();
				}
				break;
			case T__0:
				{
				setState(232);
				match(T__0);
				setState(233);
				number_math_expr(0);
				setState(234);
				match(T__2);
				}
				break;
			case MINUS:
				{
				setState(236);
				negative_math_expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(247);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new Number_math_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_number_math_expr);
						setState(239);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(240);
						first_math_operator();
						setState(241);
						number_math_expr(4);
						}
						break;
					case 2:
						{
						_localctx = new Number_math_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_number_math_expr);
						setState(243);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(244);
						second_math_operator();
						setState(245);
						number_math_expr(3);
						}
						break;
					}
					} 
				}
				setState(251);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Negative_math_exprContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(ParsoTangueParser.MINUS, 0); }
		public Number_math_exprContext number_math_expr() {
			return getRuleContext(Number_math_exprContext.class,0);
		}
		public Negative_math_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negative_math_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).enterNegative_math_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).exitNegative_math_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsoTangueVisitor ) return ((ParsoTangueVisitor<? extends T>)visitor).visitNegative_math_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Negative_math_exprContext negative_math_expr() throws RecognitionException {
		Negative_math_exprContext _localctx = new Negative_math_exprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_negative_math_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(MINUS);
			setState(253);
			number_math_expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class String_math_exprContext extends ParserRuleContext {
		public String_expr_varContext string_expr_var() {
			return getRuleContext(String_expr_varContext.class,0);
		}
		public List<String_plusContext> string_plus() {
			return getRuleContexts(String_plusContext.class);
		}
		public String_plusContext string_plus(int i) {
			return getRuleContext(String_plusContext.class,i);
		}
		public String_math_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_math_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).enterString_math_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).exitString_math_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsoTangueVisitor ) return ((ParsoTangueVisitor<? extends T>)visitor).visitString_math_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_math_exprContext string_math_expr() throws RecognitionException {
		String_math_exprContext _localctx = new String_math_exprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_string_math_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(255);
					string_plus();
					}
					} 
				}
				setState(260);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(261);
			string_expr_var();
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

	@SuppressWarnings("CheckReturnValue")
	public static class String_plusContext extends ParserRuleContext {
		public String_expr_varContext string_expr_var() {
			return getRuleContext(String_expr_varContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(ParsoTangueParser.PLUS, 0); }
		public String_plusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_plus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).enterString_plus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).exitString_plus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsoTangueVisitor ) return ((ParsoTangueVisitor<? extends T>)visitor).visitString_plus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_plusContext string_plus() throws RecognitionException {
		String_plusContext _localctx = new String_plusContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_string_plus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			string_expr_var();
			setState(264);
			match(PLUS);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Number_expr_varContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ParsoTangueParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(ParsoTangueParser.NUMBER, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Number_expr_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_expr_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).enterNumber_expr_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).exitNumber_expr_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsoTangueVisitor ) return ((ParsoTangueVisitor<? extends T>)visitor).visitNumber_expr_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Number_expr_varContext number_expr_var() throws RecognitionException {
		Number_expr_varContext _localctx = new Number_expr_varContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_number_expr_var);
		try {
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(268);
				function_call();
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

	@SuppressWarnings("CheckReturnValue")
	public static class String_expr_varContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ParsoTangueParser.ID, 0); }
		public TerminalNode STRING() { return getToken(ParsoTangueParser.STRING, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public String_expr_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_expr_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).enterString_expr_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).exitString_expr_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsoTangueVisitor ) return ((ParsoTangueVisitor<? extends T>)visitor).visitString_expr_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_expr_varContext string_expr_var() throws RecognitionException {
		String_expr_varContext _localctx = new String_expr_varContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_string_expr_var);
		try {
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(273);
				function_call();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ParsoTangueParser.ID, 0); }
		public Function_parameters_listContext function_parameters_list() {
			return getRuleContext(Function_parameters_listContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsoTangueVisitor ) return ((ParsoTangueVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(ID);
			setState(277);
			match(T__0);
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 939556930L) != 0)) {
				{
				setState(278);
				function_parameters_list();
				}
			}

			setState(281);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_parameters_listContext extends ParserRuleContext {
		public List<Function_parameterContext> function_parameter() {
			return getRuleContexts(Function_parameterContext.class);
		}
		public Function_parameterContext function_parameter(int i) {
			return getRuleContext(Function_parameterContext.class,i);
		}
		public Function_parameters_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_parameters_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).enterFunction_parameters_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).exitFunction_parameters_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsoTangueVisitor ) return ((ParsoTangueVisitor<? extends T>)visitor).visitFunction_parameters_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_parameters_listContext function_parameters_list() throws RecognitionException {
		Function_parameters_listContext _localctx = new Function_parameters_listContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_function_parameters_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(283);
			function_parameter();
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(284);
				match(T__1);
				setState(285);
				function_parameter();
				}
				}
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_parameterContext extends ParserRuleContext {
		public Function_varContext function_var() {
			return getRuleContext(Function_varContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Function_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).enterFunction_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).exitFunction_parameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsoTangueVisitor ) return ((ParsoTangueVisitor<? extends T>)visitor).visitFunction_parameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_parameterContext function_parameter() throws RecognitionException {
		Function_parameterContext _localctx = new Function_parameterContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_function_parameter);
		try {
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				function_var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				function_call();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_varContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ParsoTangueParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(ParsoTangueParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(ParsoTangueParser.STRING, 0); }
		public TerminalNode BOOL_VAR() { return getToken(ParsoTangueParser.BOOL_VAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Function_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).enterFunction_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).exitFunction_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsoTangueVisitor ) return ((ParsoTangueVisitor<? extends T>)visitor).visitFunction_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_varContext function_var() throws RecognitionException {
		Function_varContext _localctx = new Function_varContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_function_var);
		try {
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(297);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(298);
				match(BOOL_VAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(299);
				expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_typeContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(ParsoTangueParser.VOID, 0); }
		public TerminalNode TYPE() { return getToken(ParsoTangueParser.TYPE, 0); }
		public Function_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).enterFunction_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).exitFunction_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsoTangueVisitor ) return ((ParsoTangueVisitor<? extends T>)visitor).visitFunction_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_typeContext function_type() throws RecognitionException {
		Function_typeContext _localctx = new Function_typeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_function_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			_la = _input.LA(1);
			if ( !(_la==TYPE || _la==VOID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Bool_operatorContext extends ParserRuleContext {
		public First_bool_operatorContext first_bool_operator() {
			return getRuleContext(First_bool_operatorContext.class,0);
		}
		public Second_bool_operatorContext second_bool_operator() {
			return getRuleContext(Second_bool_operatorContext.class,0);
		}
		public Bool_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).enterBool_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).exitBool_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsoTangueVisitor ) return ((ParsoTangueVisitor<? extends T>)visitor).visitBool_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_operatorContext bool_operator() throws RecognitionException {
		Bool_operatorContext _localctx = new Bool_operatorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_bool_operator);
		try {
			setState(306);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GT_EQ:
			case LS_EQ:
			case GT:
			case LS:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				first_bool_operator();
				}
				break;
			case EQ:
			case NOT_EQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				second_bool_operator();
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

	@SuppressWarnings("CheckReturnValue")
	public static class First_bool_operatorContext extends ParserRuleContext {
		public TerminalNode GT() { return getToken(ParsoTangueParser.GT, 0); }
		public TerminalNode LS() { return getToken(ParsoTangueParser.LS, 0); }
		public TerminalNode GT_EQ() { return getToken(ParsoTangueParser.GT_EQ, 0); }
		public TerminalNode LS_EQ() { return getToken(ParsoTangueParser.LS_EQ, 0); }
		public First_bool_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_first_bool_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).enterFirst_bool_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).exitFirst_bool_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsoTangueVisitor ) return ((ParsoTangueVisitor<? extends T>)visitor).visitFirst_bool_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final First_bool_operatorContext first_bool_operator() throws RecognitionException {
		First_bool_operatorContext _localctx = new First_bool_operatorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_first_bool_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3342336L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Second_bool_operatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(ParsoTangueParser.EQ, 0); }
		public TerminalNode NOT_EQ() { return getToken(ParsoTangueParser.NOT_EQ, 0); }
		public Second_bool_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_second_bool_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).enterSecond_bool_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).exitSecond_bool_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsoTangueVisitor ) return ((ParsoTangueVisitor<? extends T>)visitor).visitSecond_bool_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Second_bool_operatorContext second_bool_operator() throws RecognitionException {
		Second_bool_operatorContext _localctx = new Second_bool_operatorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_second_bool_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			_la = _input.LA(1);
			if ( !(_la==EQ || _la==NOT_EQ) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class First_math_operatorContext extends ParserRuleContext {
		public TerminalNode MULTIPLY() { return getToken(ParsoTangueParser.MULTIPLY, 0); }
		public TerminalNode DIV() { return getToken(ParsoTangueParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(ParsoTangueParser.MOD, 0); }
		public First_math_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_first_math_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).enterFirst_math_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).exitFirst_math_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsoTangueVisitor ) return ((ParsoTangueVisitor<? extends T>)visitor).visitFirst_math_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final First_math_operatorContext first_math_operator() throws RecognitionException {
		First_math_operatorContext _localctx = new First_math_operatorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_first_math_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 58720256L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Second_math_operatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(ParsoTangueParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ParsoTangueParser.MINUS, 0); }
		public Second_math_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_second_math_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).enterSecond_math_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsoTangueListener ) ((ParsoTangueListener)listener).exitSecond_math_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsoTangueVisitor ) return ((ParsoTangueVisitor<? extends T>)visitor).visitSecond_math_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Second_math_operatorContext second_math_operator() throws RecognitionException {
		Second_math_operatorContext _localctx = new Second_math_operatorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_second_math_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 20:
			return number_math_expr_sempred((Number_math_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean number_math_expr_sempred(Number_math_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001e\u013d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0001\u0000\u0004\u0000J\b\u0000\u000b\u0000\f\u0000"+
		"K\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001W\b\u0001\n\u0001\f\u0001"+
		"Z\t\u0001\u0005\u0001\\\b\u0001\n\u0001\f\u0001_\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001g\b"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0005\u0002l\b\u0002\n\u0002"+
		"\f\u0002o\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004x\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0080"+
		"\b\u0006\n\u0006\f\u0006\u0083\t\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u0087\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007\u008e\b\u0007\n\u0007\f\u0007\u0091\t\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u0095\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00a1\b\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0003\f\u00af\b\f\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0005\r\u00b6\b\r\n\r\f\r\u00b9\t\r\u0001\r\u0001\r\u0005"+
		"\r\u00bd\b\r\n\r\f\r\u00c0\t\r\u0001\r\u0001\r\u0003\r\u00c4\b\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u00ce\b\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u00d8\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00e1\b\u0012\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u00e5\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00ee\b\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0005\u0014\u00f8\b\u0014\n\u0014\f\u0014\u00fb\t\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0005\u0016\u0101\b\u0016"+
		"\n\u0016\f\u0016\u0104\t\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u010e"+
		"\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0113\b\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0118\b\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u011f\b\u001b"+
		"\n\u001b\f\u001b\u0122\t\u001b\u0001\u001c\u0001\u001c\u0003\u001c\u0126"+
		"\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003"+
		"\u001d\u012d\b\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0003"+
		"\u001f\u0133\b\u001f\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001"+
		"#\u0001#\u0001#\u0000\u0001($\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF\u0000"+
		"\u0005\u0001\u0000\r\u000e\u0002\u0000\u0010\u0011\u0014\u0015\u0001\u0000"+
		"\u0012\u0013\u0001\u0000\u0017\u0019\u0001\u0000\u001a\u001b\u0143\u0000"+
		"I\u0001\u0000\u0000\u0000\u0002O\u0001\u0000\u0000\u0000\u0004m\u0001"+
		"\u0000\u0000\u0000\u0006p\u0001\u0000\u0000\u0000\bs\u0001\u0000\u0000"+
		"\u0000\ny\u0001\u0000\u0000\u0000\f|\u0001\u0000\u0000\u0000\u000e\u0088"+
		"\u0001\u0000\u0000\u0000\u0010\u00a0\u0001\u0000\u0000\u0000\u0012\u00a2"+
		"\u0001\u0000\u0000\u0000\u0014\u00a5\u0001\u0000\u0000\u0000\u0016\u00a8"+
		"\u0001\u0000\u0000\u0000\u0018\u00ae\u0001\u0000\u0000\u0000\u001a\u00c3"+
		"\u0001\u0000\u0000\u0000\u001c\u00c5\u0001\u0000\u0000\u0000\u001e\u00cd"+
		"\u0001\u0000\u0000\u0000 \u00d7\u0001\u0000\u0000\u0000\"\u00d9\u0001"+
		"\u0000\u0000\u0000$\u00e0\u0001\u0000\u0000\u0000&\u00e4\u0001\u0000\u0000"+
		"\u0000(\u00ed\u0001\u0000\u0000\u0000*\u00fc\u0001\u0000\u0000\u0000,"+
		"\u0102\u0001\u0000\u0000\u0000.\u0107\u0001\u0000\u0000\u00000\u010d\u0001"+
		"\u0000\u0000\u00002\u0112\u0001\u0000\u0000\u00004\u0114\u0001\u0000\u0000"+
		"\u00006\u011b\u0001\u0000\u0000\u00008\u0125\u0001\u0000\u0000\u0000:"+
		"\u012c\u0001\u0000\u0000\u0000<\u012e\u0001\u0000\u0000\u0000>\u0132\u0001"+
		"\u0000\u0000\u0000@\u0134\u0001\u0000\u0000\u0000B\u0136\u0001\u0000\u0000"+
		"\u0000D\u0138\u0001\u0000\u0000\u0000F\u013a\u0001\u0000\u0000\u0000H"+
		"J\u0003\u0002\u0001\u0000IH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000"+
		"\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LM\u0001\u0000"+
		"\u0000\u0000MN\u0005\u0000\u0000\u0001N\u0001\u0001\u0000\u0000\u0000"+
		"OP\u0005\u0007\u0000\u0000PQ\u0003<\u001e\u0000QR\u0005\u001c\u0000\u0000"+
		"R]\u0005\u0001\u0000\u0000SX\u0003\u0012\t\u0000TU\u0005\u0002\u0000\u0000"+
		"UW\u0003\u0012\t\u0000VT\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000"+
		"XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000"+
		"\u0000ZX\u0001\u0000\u0000\u0000[S\u0001\u0000\u0000\u0000\\_\u0001\u0000"+
		"\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^`\u0001"+
		"\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000`a\u0005\u0003\u0000\u0000"+
		"ab\u0005\u0004\u0000\u0000bf\u0003\u0004\u0002\u0000cd\u0003\u0006\u0003"+
		"\u0000de\u0005\u000b\u0000\u0000eg\u0001\u0000\u0000\u0000fc\u0001\u0000"+
		"\u0000\u0000fg\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0005"+
		"\u0005\u0000\u0000i\u0003\u0001\u0000\u0000\u0000jl\u0003\u0010\b\u0000"+
		"kj\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000"+
		"\u0000mn\u0001\u0000\u0000\u0000n\u0005\u0001\u0000\u0000\u0000om\u0001"+
		"\u0000\u0000\u0000pq\u0005\b\u0000\u0000qr\u0003\u0018\f\u0000r\u0007"+
		"\u0001\u0000\u0000\u0000st\u0005\t\u0000\u0000tw\u0003\u000e\u0007\u0000"+
		"ux\u0003\n\u0005\u0000vx\u0003\f\u0006\u0000wu\u0001\u0000\u0000\u0000"+
		"wv\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000x\t\u0001\u0000\u0000"+
		"\u0000yz\u0005\n\u0000\u0000z{\u0003\b\u0004\u0000{\u000b\u0001\u0000"+
		"\u0000\u0000|\u0086\u0005\n\u0000\u0000}\u0081\u0005\u0004\u0000\u0000"+
		"~\u0080\u0003\u0010\b\u0000\u007f~\u0001\u0000\u0000\u0000\u0080\u0083"+
		"\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0001\u0000\u0000\u0000\u0082\u0084\u0001\u0000\u0000\u0000\u0083\u0081"+
		"\u0001\u0000\u0000\u0000\u0084\u0087\u0005\u0005\u0000\u0000\u0085\u0087"+
		"\u0003\u0010\b\u0000\u0086}\u0001\u0000\u0000\u0000\u0086\u0085\u0001"+
		"\u0000\u0000\u0000\u0087\r\u0001\u0000\u0000\u0000\u0088\u0089\u0005\u0001"+
		"\u0000\u0000\u0089\u008a\u0003\u001a\r\u0000\u008a\u0094\u0005\u0003\u0000"+
		"\u0000\u008b\u008f\u0005\u0004\u0000\u0000\u008c\u008e\u0003\u0010\b\u0000"+
		"\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u0091\u0001\u0000\u0000\u0000"+
		"\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000"+
		"\u0090\u0092\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000"+
		"\u0092\u0095\u0005\u0005\u0000\u0000\u0093\u0095\u0003\u0010\b\u0000\u0094"+
		"\u008b\u0001\u0000\u0000\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0095"+
		"\u000f\u0001\u0000\u0000\u0000\u0096\u0097\u0003\u0014\n\u0000\u0097\u0098"+
		"\u0005\u000b\u0000\u0000\u0098\u00a1\u0001\u0000\u0000\u0000\u0099\u009a"+
		"\u0003\u0016\u000b\u0000\u009a\u009b\u0005\u000b\u0000\u0000\u009b\u00a1"+
		"\u0001\u0000\u0000\u0000\u009c\u009d\u00034\u001a\u0000\u009d\u009e\u0005"+
		"\u000b\u0000\u0000\u009e\u00a1\u0001\u0000\u0000\u0000\u009f\u00a1\u0003"+
		"\b\u0004\u0000\u00a0\u0096\u0001\u0000\u0000\u0000\u00a0\u0099\u0001\u0000"+
		"\u0000\u0000\u00a0\u009c\u0001\u0000\u0000\u0000\u00a0\u009f\u0001\u0000"+
		"\u0000\u0000\u00a1\u0011\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\r\u0000"+
		"\u0000\u00a3\u00a4\u0005\u001c\u0000\u0000\u00a4\u0013\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a6\u0005\r\u0000\u0000\u00a6\u00a7\u0003\u0016\u000b\u0000"+
		"\u00a7\u0015\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\u001c\u0000\u0000"+
		"\u00a9\u00aa\u0005\f\u0000\u0000\u00aa\u00ab\u0003\u0018\f\u0000\u00ab"+
		"\u0017\u0001\u0000\u0000\u0000\u00ac\u00af\u0003&\u0013\u0000\u00ad\u00af"+
		"\u0003\u001a\r\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00ad\u0001"+
		"\u0000\u0000\u0000\u00af\u0019\u0001\u0000\u0000\u0000\u00b0\u00c4\u0003"+
		"\u001e\u000f\u0000\u00b1\u00b2\u0005\u0001\u0000\u0000\u00b2\u00b3\u0003"+
		"\u001a\r\u0000\u00b3\u00b7\u0005\u0003\u0000\u0000\u00b4\u00b6\u0003\u001c"+
		"\u000e\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b9\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000"+
		"\u0000\u0000\u00b8\u00c4\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000"+
		"\u0000\u0000\u00ba\u00be\u0003$\u0012\u0000\u00bb\u00bd\u0003\u001c\u000e"+
		"\u0000\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bd\u00c0\u0001\u0000\u0000"+
		"\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c4\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c4\u0003 \u0010\u0000\u00c2\u00c4\u0003\"\u0011\u0000"+
		"\u00c3\u00b0\u0001\u0000\u0000\u0000\u00c3\u00b1\u0001\u0000\u0000\u0000"+
		"\u00c3\u00ba\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c4\u001b\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c6\u0003B!\u0000\u00c6\u00c7\u0003\u001e\u000f\u0000\u00c7\u001d"+
		"\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005\u0001\u0000\u0000\u00c9\u00ca"+
		"\u0003\u001a\r\u0000\u00ca\u00cb\u0005\u0003\u0000\u0000\u00cb\u00ce\u0001"+
		"\u0000\u0000\u0000\u00cc\u00ce\u0003$\u0012\u0000\u00cd\u00c8\u0001\u0000"+
		"\u0000\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00ce\u001f\u0001\u0000"+
		"\u0000\u0000\u00cf\u00d0\u00030\u0018\u0000\u00d0\u00d1\u0003@ \u0000"+
		"\u00d1\u00d2\u00030\u0018\u0000\u00d2\u00d8\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d4\u00030\u0018\u0000\u00d4\u00d5\u0003B!\u0000\u00d5\u00d6\u0003"+
		"0\u0018\u0000\u00d6\u00d8\u0001\u0000\u0000\u0000\u00d7\u00cf\u0001\u0000"+
		"\u0000\u0000\u00d7\u00d3\u0001\u0000\u0000\u0000\u00d8!\u0001\u0000\u0000"+
		"\u0000\u00d9\u00da\u00032\u0019\u0000\u00da\u00db\u0003>\u001f\u0000\u00db"+
		"\u00dc\u00032\u0019\u0000\u00dc#\u0001\u0000\u0000\u0000\u00dd\u00e1\u0003"+
		"4\u001a\u0000\u00de\u00e1\u0005\u001c\u0000\u0000\u00df\u00e1\u0005\u000f"+
		"\u0000\u0000\u00e0\u00dd\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000"+
		"\u0000\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1%\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e5\u0003(\u0014\u0000\u00e3\u00e5\u0003,\u0016\u0000\u00e4"+
		"\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e5"+
		"\'\u0001\u0000\u0000\u0000\u00e6\u00e7\u0006\u0014\uffff\uffff\u0000\u00e7"+
		"\u00ee\u00030\u0018\u0000\u00e8\u00e9\u0005\u0001\u0000\u0000\u00e9\u00ea"+
		"\u0003(\u0014\u0000\u00ea\u00eb\u0005\u0003\u0000\u0000\u00eb\u00ee\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ee\u0003*\u0015\u0000\u00ed\u00e6\u0001\u0000"+
		"\u0000\u0000\u00ed\u00e8\u0001\u0000\u0000\u0000\u00ed\u00ec\u0001\u0000"+
		"\u0000\u0000\u00ee\u00f9\u0001\u0000\u0000\u0000\u00ef\u00f0\n\u0003\u0000"+
		"\u0000\u00f0\u00f1\u0003D\"\u0000\u00f1\u00f2\u0003(\u0014\u0004\u00f2"+
		"\u00f8\u0001\u0000\u0000\u0000\u00f3\u00f4\n\u0002\u0000\u0000\u00f4\u00f5"+
		"\u0003F#\u0000\u00f5\u00f6\u0003(\u0014\u0003\u00f6\u00f8\u0001\u0000"+
		"\u0000\u0000\u00f7\u00ef\u0001\u0000\u0000\u0000\u00f7\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f8\u00fb\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000"+
		"\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa)\u0001\u0000\u0000"+
		"\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fc\u00fd\u0005\u001b\u0000"+
		"\u0000\u00fd\u00fe\u0003(\u0014\u0000\u00fe+\u0001\u0000\u0000\u0000\u00ff"+
		"\u0101\u0003.\u0017\u0000\u0100\u00ff\u0001\u0000\u0000\u0000\u0101\u0104"+
		"\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0102\u0103"+
		"\u0001\u0000\u0000\u0000\u0103\u0105\u0001\u0000\u0000\u0000\u0104\u0102"+
		"\u0001\u0000\u0000\u0000\u0105\u0106\u00032\u0019\u0000\u0106-\u0001\u0000"+
		"\u0000\u0000\u0107\u0108\u00032\u0019\u0000\u0108\u0109\u0005\u001a\u0000"+
		"\u0000\u0109/\u0001\u0000\u0000\u0000\u010a\u010e\u0005\u001c\u0000\u0000"+
		"\u010b\u010e\u0005\u001d\u0000\u0000\u010c\u010e\u00034\u001a\u0000\u010d"+
		"\u010a\u0001\u0000\u0000\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010d"+
		"\u010c\u0001\u0000\u0000\u0000\u010e1\u0001\u0000\u0000\u0000\u010f\u0113"+
		"\u0005\u001c\u0000\u0000\u0110\u0113\u0005\u0006\u0000\u0000\u0111\u0113"+
		"\u00034\u001a\u0000\u0112\u010f\u0001\u0000\u0000\u0000\u0112\u0110\u0001"+
		"\u0000\u0000\u0000\u0112\u0111\u0001\u0000\u0000\u0000\u01133\u0001\u0000"+
		"\u0000\u0000\u0114\u0115\u0005\u001c\u0000\u0000\u0115\u0117\u0005\u0001"+
		"\u0000\u0000\u0116\u0118\u00036\u001b\u0000\u0117\u0116\u0001\u0000\u0000"+
		"\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000"+
		"\u0000\u0119\u011a\u0005\u0003\u0000\u0000\u011a5\u0001\u0000\u0000\u0000"+
		"\u011b\u0120\u00038\u001c\u0000\u011c\u011d\u0005\u0002\u0000\u0000\u011d"+
		"\u011f\u00038\u001c\u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011f\u0122"+
		"\u0001\u0000\u0000\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0120\u0121"+
		"\u0001\u0000\u0000\u0000\u01217\u0001\u0000\u0000\u0000\u0122\u0120\u0001"+
		"\u0000\u0000\u0000\u0123\u0126\u0003:\u001d\u0000\u0124\u0126\u00034\u001a"+
		"\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0125\u0124\u0001\u0000\u0000"+
		"\u0000\u01269\u0001\u0000\u0000\u0000\u0127\u012d\u0005\u001c\u0000\u0000"+
		"\u0128\u012d\u0005\u001d\u0000\u0000\u0129\u012d\u0005\u0006\u0000\u0000"+
		"\u012a\u012d\u0005\u000f\u0000\u0000\u012b\u012d\u0003\u0018\f\u0000\u012c"+
		"\u0127\u0001\u0000\u0000\u0000\u012c\u0128\u0001\u0000\u0000\u0000\u012c"+
		"\u0129\u0001\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012c"+
		"\u012b\u0001\u0000\u0000\u0000\u012d;\u0001\u0000\u0000\u0000\u012e\u012f"+
		"\u0007\u0000\u0000\u0000\u012f=\u0001\u0000\u0000\u0000\u0130\u0133\u0003"+
		"@ \u0000\u0131\u0133\u0003B!\u0000\u0132\u0130\u0001\u0000\u0000\u0000"+
		"\u0132\u0131\u0001\u0000\u0000\u0000\u0133?\u0001\u0000\u0000\u0000\u0134"+
		"\u0135\u0007\u0001\u0000\u0000\u0135A\u0001\u0000\u0000\u0000\u0136\u0137"+
		"\u0007\u0002\u0000\u0000\u0137C\u0001\u0000\u0000\u0000\u0138\u0139\u0007"+
		"\u0003\u0000\u0000\u0139E\u0001\u0000\u0000\u0000\u013a\u013b\u0007\u0004"+
		"\u0000\u0000\u013bG\u0001\u0000\u0000\u0000\u001eKX]fmw\u0081\u0086\u008f"+
		"\u0094\u00a0\u00ae\u00b7\u00be\u00c3\u00cd\u00d7\u00e0\u00e4\u00ed\u00f7"+
		"\u00f9\u0102\u010d\u0112\u0117\u0120\u0125\u012c\u0132";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}