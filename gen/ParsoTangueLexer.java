// Generated from C:/Users/Gleb Begletsov/Java/ParsoTangueAST/src/main/antlr4\ParsoTangue.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ParsoTangueLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, STRING=6, LET=7, RETURN=8, IF=9, 
		ELSE=10, END=11, ASSIGMENT=12, TYPE=13, VOID=14, BOOL_VAR=15, GT_EQ=16, 
		LS_EQ=17, EQ=18, NOT_EQ=19, GT=20, LS=21, NOT=22, MULTIPLY=23, DIV=24, 
		MOD=25, PLUS=26, MINUS=27, ID=28, NUMBER=29, WHITESPACE=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "STRING", "LET", "RETURN", "IF", 
			"ELSE", "END", "ASSIGMENT", "TYPE", "VOID", "BOOL_VAR", "GT_EQ", "LS_EQ", 
			"EQ", "NOT_EQ", "GT", "LS", "NOT", "MULTIPLY", "DIV", "MOD", "PLUS", 
			"MINUS", "ID", "LETTER", "NUMBER", "DIGIT", "WHITESPACE"
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


	public ParsoTangueLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ParsoTangue.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u001e\u00d5\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d"+
		"\u0002\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005P\b\u0005\n\u0005\f\u0005S\t\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005Z\b\u0005\n\u0005\f\u0005"+
		"]\t\u0005\u0001\u0005\u0003\u0005`\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u008e\b\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u009e\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0005\u001b\u00c0\b\u001b\n\u001b\f\u001b\u00c3"+
		"\t\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0004\u001d\u00c8\b\u001d"+
		"\u000b\u001d\f\u001d\u00c9\u0001\u001e\u0001\u001e\u0001\u001f\u0005\u001f"+
		"\u00cf\b\u001f\n\u001f\f\u001f\u00d2\t\u001f\u0001\u001f\u0001\u001f\u0000"+
		"\u0000 \u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016"+
		"-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u0000;\u001d=\u0000?\u001e"+
		"\u0001\u0000\u0007\u0004\u0000\n\n\r\r\"\"\\\\\u0002\u0000\n\n\r\r\u0001"+
		"\u0000\'\'\u0004\u0000\n\n\r\r\'\'\\\\\u0002\u0000AZaz\u0001\u000009\u0003"+
		"\u0000\t\n\r\r  \u00df\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000"+
		"\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000"+
		")\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001"+
		"\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000"+
		"\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u0000"+
		"7\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000?\u0001"+
		"\u0000\u0000\u0000\u0001A\u0001\u0000\u0000\u0000\u0003C\u0001\u0000\u0000"+
		"\u0000\u0005E\u0001\u0000\u0000\u0000\u0007G\u0001\u0000\u0000\u0000\t"+
		"I\u0001\u0000\u0000\u0000\u000b_\u0001\u0000\u0000\u0000\ra\u0001\u0000"+
		"\u0000\u0000\u000fe\u0001\u0000\u0000\u0000\u0011l\u0001\u0000\u0000\u0000"+
		"\u0013o\u0001\u0000\u0000\u0000\u0015t\u0001\u0000\u0000\u0000\u0017v"+
		"\u0001\u0000\u0000\u0000\u0019\u008d\u0001\u0000\u0000\u0000\u001b\u008f"+
		"\u0001\u0000\u0000\u0000\u001d\u009d\u0001\u0000\u0000\u0000\u001f\u009f"+
		"\u0001\u0000\u0000\u0000!\u00a2\u0001\u0000\u0000\u0000#\u00a5\u0001\u0000"+
		"\u0000\u0000%\u00a8\u0001\u0000\u0000\u0000\'\u00ab\u0001\u0000\u0000"+
		"\u0000)\u00ad\u0001\u0000\u0000\u0000+\u00af\u0001\u0000\u0000\u0000-"+
		"\u00b1\u0001\u0000\u0000\u0000/\u00b3\u0001\u0000\u0000\u00001\u00b5\u0001"+
		"\u0000\u0000\u00003\u00b7\u0001\u0000\u0000\u00005\u00b9\u0001\u0000\u0000"+
		"\u00007\u00bb\u0001\u0000\u0000\u00009\u00c4\u0001\u0000\u0000\u0000;"+
		"\u00c7\u0001\u0000\u0000\u0000=\u00cb\u0001\u0000\u0000\u0000?\u00d0\u0001"+
		"\u0000\u0000\u0000AB\u0005(\u0000\u0000B\u0002\u0001\u0000\u0000\u0000"+
		"CD\u0005,\u0000\u0000D\u0004\u0001\u0000\u0000\u0000EF\u0005)\u0000\u0000"+
		"F\u0006\u0001\u0000\u0000\u0000GH\u0005{\u0000\u0000H\b\u0001\u0000\u0000"+
		"\u0000IJ\u0005}\u0000\u0000J\n\u0001\u0000\u0000\u0000KQ\u0005\"\u0000"+
		"\u0000LP\b\u0000\u0000\u0000MN\u0005\\\u0000\u0000NP\b\u0001\u0000\u0000"+
		"OL\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000PS\u0001\u0000\u0000"+
		"\u0000QO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RT\u0001\u0000"+
		"\u0000\u0000SQ\u0001\u0000\u0000\u0000T`\u0005\"\u0000\u0000U[\u0007\u0002"+
		"\u0000\u0000VZ\b\u0003\u0000\u0000WX\u0005\\\u0000\u0000XZ\b\u0001\u0000"+
		"\u0000YV\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000Z]\u0001\u0000"+
		"\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\^\u0001"+
		"\u0000\u0000\u0000][\u0001\u0000\u0000\u0000^`\u0007\u0002\u0000\u0000"+
		"_K\u0001\u0000\u0000\u0000_U\u0001\u0000\u0000\u0000`\f\u0001\u0000\u0000"+
		"\u0000ab\u0005l\u0000\u0000bc\u0005e\u0000\u0000cd\u0005t\u0000\u0000"+
		"d\u000e\u0001\u0000\u0000\u0000ef\u0005r\u0000\u0000fg\u0005e\u0000\u0000"+
		"gh\u0005t\u0000\u0000hi\u0005u\u0000\u0000ij\u0005r\u0000\u0000jk\u0005"+
		"n\u0000\u0000k\u0010\u0001\u0000\u0000\u0000lm\u0005i\u0000\u0000mn\u0005"+
		"f\u0000\u0000n\u0012\u0001\u0000\u0000\u0000op\u0005e\u0000\u0000pq\u0005"+
		"l\u0000\u0000qr\u0005s\u0000\u0000rs\u0005e\u0000\u0000s\u0014\u0001\u0000"+
		"\u0000\u0000tu\u0005;\u0000\u0000u\u0016\u0001\u0000\u0000\u0000vw\u0005"+
		":\u0000\u0000wx\u0005=\u0000\u0000x\u0018\u0001\u0000\u0000\u0000yz\u0005"+
		"I\u0000\u0000z{\u0005n\u0000\u0000{|\u0005t\u0000\u0000|}\u0005e\u0000"+
		"\u0000}~\u0005g\u0000\u0000~\u007f\u0005e\u0000\u0000\u007f\u008e\u0005"+
		"r\u0000\u0000\u0080\u0081\u0005S\u0000\u0000\u0081\u0082\u0005t\u0000"+
		"\u0000\u0082\u0083\u0005r\u0000\u0000\u0083\u0084\u0005i\u0000\u0000\u0084"+
		"\u0085\u0005n\u0000\u0000\u0085\u008e\u0005g\u0000\u0000\u0086\u0087\u0005"+
		"B\u0000\u0000\u0087\u0088\u0005o\u0000\u0000\u0088\u0089\u0005o\u0000"+
		"\u0000\u0089\u008a\u0005l\u0000\u0000\u008a\u008b\u0005e\u0000\u0000\u008b"+
		"\u008c\u0005a\u0000\u0000\u008c\u008e\u0005n\u0000\u0000\u008dy\u0001"+
		"\u0000\u0000\u0000\u008d\u0080\u0001\u0000\u0000\u0000\u008d\u0086\u0001"+
		"\u0000\u0000\u0000\u008e\u001a\u0001\u0000\u0000\u0000\u008f\u0090\u0005"+
		"v\u0000\u0000\u0090\u0091\u0005o\u0000\u0000\u0091\u0092\u0005i\u0000"+
		"\u0000\u0092\u0093\u0005d\u0000\u0000\u0093\u001c\u0001\u0000\u0000\u0000"+
		"\u0094\u0095\u0005t\u0000\u0000\u0095\u0096\u0005r\u0000\u0000\u0096\u0097"+
		"\u0005u\u0000\u0000\u0097\u009e\u0005e\u0000\u0000\u0098\u0099\u0005f"+
		"\u0000\u0000\u0099\u009a\u0005a\u0000\u0000\u009a\u009b\u0005l\u0000\u0000"+
		"\u009b\u009c\u0005s\u0000\u0000\u009c\u009e\u0005e\u0000\u0000\u009d\u0094"+
		"\u0001\u0000\u0000\u0000\u009d\u0098\u0001\u0000\u0000\u0000\u009e\u001e"+
		"\u0001\u0000\u0000\u0000\u009f\u00a0\u0005>\u0000\u0000\u00a0\u00a1\u0005"+
		"=\u0000\u0000\u00a1 \u0001\u0000\u0000\u0000\u00a2\u00a3\u0005<\u0000"+
		"\u0000\u00a3\u00a4\u0005=\u0000\u0000\u00a4\"\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a6\u0005=\u0000\u0000\u00a6\u00a7\u0005=\u0000\u0000\u00a7$"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005!\u0000\u0000\u00a9\u00aa\u0005"+
		"=\u0000\u0000\u00aa&\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005>\u0000"+
		"\u0000\u00ac(\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005<\u0000\u0000\u00ae"+
		"*\u0001\u0000\u0000\u0000\u00af\u00b0\u0005!\u0000\u0000\u00b0,\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b2\u0005*\u0000\u0000\u00b2.\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b4\u0005/\u0000\u0000\u00b40\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b6\u0005%\u0000\u0000\u00b62\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005"+
		"+\u0000\u0000\u00b84\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005-\u0000"+
		"\u0000\u00ba6\u0001\u0000\u0000\u0000\u00bb\u00c1\u00039\u001c\u0000\u00bc"+
		"\u00c0\u00039\u001c\u0000\u00bd\u00c0\u0003=\u001e\u0000\u00be\u00c0\u0005"+
		"_\u0000\u0000\u00bf\u00bc\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bf\u00be\u0001\u0000\u0000\u0000\u00c0\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c28\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c5\u0007\u0004\u0000\u0000\u00c5:\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c8\u0003=\u001e\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c8"+
		"\u00c9\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9"+
		"\u00ca\u0001\u0000\u0000\u0000\u00ca<\u0001\u0000\u0000\u0000\u00cb\u00cc"+
		"\u0007\u0005\u0000\u0000\u00cc>\u0001\u0000\u0000\u0000\u00cd\u00cf\u0007"+
		"\u0006\u0000\u0000\u00ce\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d1\u00d3\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d4\u0006\u001f\u0000\u0000\u00d4@\u0001\u0000"+
		"\u0000\u0000\f\u0000OQY[_\u008d\u009d\u00bf\u00c1\u00c9\u00d0\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}