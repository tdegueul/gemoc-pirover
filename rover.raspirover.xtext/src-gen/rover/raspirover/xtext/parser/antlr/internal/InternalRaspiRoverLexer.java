package rover.raspirover.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRaspiRoverLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=6;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalRaspiRoverLexer() {;} 
    public InternalRaspiRoverLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalRaspiRoverLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalRaspiRover.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRaspiRover.g:11:7: ( 'raspi-project' )
            // InternalRaspiRover.g:11:9: 'raspi-project'
            {
            match("raspi-project"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRaspiRover.g:12:7: ( '{' )
            // InternalRaspiRover.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRaspiRover.g:13:7: ( 'boards' )
            // InternalRaspiRover.g:13:9: 'boards'
            {
            match("boards"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRaspiRover.g:14:7: ( '[' )
            // InternalRaspiRover.g:14:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRaspiRover.g:15:7: ( ']' )
            // InternalRaspiRover.g:15:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRaspiRover.g:16:7: ( '}' )
            // InternalRaspiRover.g:16:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRaspiRover.g:17:7: ( 'program' )
            // InternalRaspiRover.g:17:9: 'program'
            {
            match("program"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRaspiRover.g:18:7: ( 'params' )
            // InternalRaspiRover.g:18:9: 'params'
            {
            match("params"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRaspiRover.g:19:7: ( ',' )
            // InternalRaspiRover.g:19:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRaspiRover.g:20:7: ( 'digital-pin' )
            // InternalRaspiRover.g:20:9: 'digital-pin'
            {
            match("digital-pin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRaspiRover.g:21:7: ( 'analog-pin' )
            // InternalRaspiRover.g:21:9: 'analog-pin'
            {
            match("analog-pin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRaspiRover.g:22:7: ( 'var' )
            // InternalRaspiRover.g:22:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRaspiRover.g:23:7: ( ':=' )
            // InternalRaspiRover.g:23:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRaspiRover.g:24:7: ( 'if' )
            // InternalRaspiRover.g:24:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRaspiRover.g:25:7: ( '(' )
            // InternalRaspiRover.g:25:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRaspiRover.g:26:7: ( ')' )
            // InternalRaspiRover.g:26:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRaspiRover.g:27:7: ( 'else' )
            // InternalRaspiRover.g:27:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRaspiRover.g:28:7: ( 'while' )
            // InternalRaspiRover.g:28:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRaspiRover.g:29:7: ( 'forward' )
            // InternalRaspiRover.g:29:9: 'forward'
            {
            match("forward"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRaspiRover.g:30:7: ( 'backward' )
            // InternalRaspiRover.g:30:9: 'backward'
            {
            match("backward"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRaspiRover.g:31:7: ( 'turn' )
            // InternalRaspiRover.g:31:9: 'turn'
            {
            match("turn"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRaspiRover.g:32:7: ( 'stop' )
            // InternalRaspiRover.g:32:9: 'stop'
            {
            match("stop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRaspiRover.g:33:7: ( 'log' )
            // InternalRaspiRover.g:33:9: 'log'
            {
            match("log"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRaspiRover.g:34:7: ( 'send' )
            // InternalRaspiRover.g:34:9: 'send'
            {
            match("send"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRaspiRover.g:35:7: ( 'query-temp' )
            // InternalRaspiRover.g:35:9: 'query-temp'
            {
            match("query-temp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRaspiRover.g:36:7: ( 'query-humidity' )
            // InternalRaspiRover.g:36:9: 'query-humidity'
            {
            match("query-humidity"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRaspiRover.g:37:7: ( 'query-msg' )
            // InternalRaspiRover.g:37:9: 'query-msg'
            {
            match("query-msg"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRaspiRover.g:38:7: ( 'query' )
            // InternalRaspiRover.g:38:9: 'query'
            {
            match("query"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRaspiRover.g:39:7: ( 'front' )
            // InternalRaspiRover.g:39:9: 'front'
            {
            match("front"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRaspiRover.g:40:7: ( 'obstacle' )
            // InternalRaspiRover.g:40:9: 'obstacle'
            {
            match("obstacle"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRaspiRover.g:41:7: ( 'true' )
            // InternalRaspiRover.g:41:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRaspiRover.g:42:7: ( 'cm' )
            // InternalRaspiRover.g:42:9: 'cm'
            {
            match("cm"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRaspiRover.g:43:7: ( 'mm' )
            // InternalRaspiRover.g:43:9: 'mm'
            {
            match("mm"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRaspiRover.g:44:7: ( 'm' )
            // InternalRaspiRover.g:44:9: 'm'
            {
            match('m'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRaspiRover.g:45:7: ( 'ft' )
            // InternalRaspiRover.g:45:9: 'ft'
            {
            match("ft"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRaspiRover.g:46:7: ( 'in' )
            // InternalRaspiRover.g:46:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRaspiRover.g:47:7: ( 'yd' )
            // InternalRaspiRover.g:47:9: 'yd'
            {
            match("yd"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRaspiRover.g:48:7: ( 'rad' )
            // InternalRaspiRover.g:48:9: 'rad'
            {
            match("rad"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRaspiRover.g:49:7: ( 'deg' )
            // InternalRaspiRover.g:49:9: 'deg'
            {
            match("deg"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRaspiRover.g:50:7: ( 'grad' )
            // InternalRaspiRover.g:50:9: 'grad'
            {
            match("grad"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRaspiRover.g:51:7: ( 'pin' )
            // InternalRaspiRover.g:51:9: 'pin'
            {
            match("pin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRaspiRover.g:52:7: ( '<' )
            // InternalRaspiRover.g:52:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRaspiRover.g:53:7: ( '==' )
            // InternalRaspiRover.g:53:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRaspiRover.g:54:7: ( '<>' )
            // InternalRaspiRover.g:54:9: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRaspiRover.g:55:7: ( '>' )
            // InternalRaspiRover.g:55:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRaspiRover.g:56:7: ( '<=' )
            // InternalRaspiRover.g:56:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRaspiRover.g:57:7: ( '>=' )
            // InternalRaspiRover.g:57:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRaspiRover.g:58:7: ( '!=' )
            // InternalRaspiRover.g:58:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRaspiRover.g:2722:13: ( RULE_INT '.' RULE_INT )
            // InternalRaspiRover.g:2722:15: RULE_INT '.' RULE_INT
            {
            mRULE_INT(); 
            match('.'); 
            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRaspiRover.g:2724:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalRaspiRover.g:2724:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalRaspiRover.g:2724:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalRaspiRover.g:2724:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalRaspiRover.g:2724:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRaspiRover.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRaspiRover.g:2726:10: ( ( '0' .. '9' )+ )
            // InternalRaspiRover.g:2726:12: ( '0' .. '9' )+
            {
            // InternalRaspiRover.g:2726:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRaspiRover.g:2726:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRaspiRover.g:2728:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalRaspiRover.g:2728:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalRaspiRover.g:2728:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalRaspiRover.g:2728:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalRaspiRover.g:2728:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalRaspiRover.g:2728:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRaspiRover.g:2728:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalRaspiRover.g:2728:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalRaspiRover.g:2728:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalRaspiRover.g:2728:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRaspiRover.g:2728:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRaspiRover.g:2730:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalRaspiRover.g:2730:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalRaspiRover.g:2730:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRaspiRover.g:2730:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRaspiRover.g:2732:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalRaspiRover.g:2732:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalRaspiRover.g:2732:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRaspiRover.g:2732:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalRaspiRover.g:2732:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRaspiRover.g:2732:41: ( '\\r' )? '\\n'
                    {
                    // InternalRaspiRover.g:2732:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalRaspiRover.g:2732:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRaspiRover.g:2734:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalRaspiRover.g:2734:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalRaspiRover.g:2734:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRaspiRover.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRaspiRover.g:2736:16: ( . )
            // InternalRaspiRover.g:2736:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalRaspiRover.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | RULE_DOUBLE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=56;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalRaspiRover.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalRaspiRover.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalRaspiRover.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalRaspiRover.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalRaspiRover.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalRaspiRover.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalRaspiRover.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalRaspiRover.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalRaspiRover.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalRaspiRover.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalRaspiRover.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalRaspiRover.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalRaspiRover.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalRaspiRover.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalRaspiRover.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalRaspiRover.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalRaspiRover.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalRaspiRover.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalRaspiRover.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalRaspiRover.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalRaspiRover.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalRaspiRover.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalRaspiRover.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalRaspiRover.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalRaspiRover.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // InternalRaspiRover.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // InternalRaspiRover.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // InternalRaspiRover.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // InternalRaspiRover.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // InternalRaspiRover.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // InternalRaspiRover.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // InternalRaspiRover.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // InternalRaspiRover.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // InternalRaspiRover.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // InternalRaspiRover.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // InternalRaspiRover.g:1:220: T__47
                {
                mT__47(); 

                }
                break;
            case 37 :
                // InternalRaspiRover.g:1:226: T__48
                {
                mT__48(); 

                }
                break;
            case 38 :
                // InternalRaspiRover.g:1:232: T__49
                {
                mT__49(); 

                }
                break;
            case 39 :
                // InternalRaspiRover.g:1:238: T__50
                {
                mT__50(); 

                }
                break;
            case 40 :
                // InternalRaspiRover.g:1:244: T__51
                {
                mT__51(); 

                }
                break;
            case 41 :
                // InternalRaspiRover.g:1:250: T__52
                {
                mT__52(); 

                }
                break;
            case 42 :
                // InternalRaspiRover.g:1:256: T__53
                {
                mT__53(); 

                }
                break;
            case 43 :
                // InternalRaspiRover.g:1:262: T__54
                {
                mT__54(); 

                }
                break;
            case 44 :
                // InternalRaspiRover.g:1:268: T__55
                {
                mT__55(); 

                }
                break;
            case 45 :
                // InternalRaspiRover.g:1:274: T__56
                {
                mT__56(); 

                }
                break;
            case 46 :
                // InternalRaspiRover.g:1:280: T__57
                {
                mT__57(); 

                }
                break;
            case 47 :
                // InternalRaspiRover.g:1:286: T__58
                {
                mT__58(); 

                }
                break;
            case 48 :
                // InternalRaspiRover.g:1:292: T__59
                {
                mT__59(); 

                }
                break;
            case 49 :
                // InternalRaspiRover.g:1:298: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 50 :
                // InternalRaspiRover.g:1:310: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 51 :
                // InternalRaspiRover.g:1:318: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 52 :
                // InternalRaspiRover.g:1:327: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 53 :
                // InternalRaspiRover.g:1:339: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 54 :
                // InternalRaspiRover.g:1:355: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 55 :
                // InternalRaspiRover.g:1:371: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 56 :
                // InternalRaspiRover.g:1:379: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\51\1\uffff\1\51\3\uffff\1\51\1\uffff\3\51\1\47\1\51\2\uffff\11\51\1\113\2\51\1\120\1\47\1\123\1\47\1\125\1\47\1\uffff\3\47\2\uffff\1\51\2\uffff\2\51\3\uffff\3\51\1\uffff\4\51\1\uffff\1\147\1\150\2\uffff\4\51\1\155\7\51\1\165\1\166\1\uffff\1\167\1\51\10\uffff\1\125\5\uffff\1\51\1\172\4\51\1\177\1\51\1\u0081\1\51\1\u0083\2\uffff\4\51\1\uffff\4\51\1\u008c\2\51\3\uffff\2\51\1\uffff\4\51\1\uffff\1\51\1\uffff\1\51\1\uffff\1\u0097\3\51\1\u009b\1\u009c\1\u009d\1\u009e\1\uffff\2\51\1\u00a1\7\51\1\uffff\1\u00a9\1\51\1\u00ab\4\uffff\1\u00ad\1\51\2\uffff\1\u00af\2\51\1\u00b2\2\51\1\uffff\1\51\3\uffff\1\51\1\uffff\1\51\1\u00bb\1\uffff\1\51\1\uffff\1\u00bd\3\uffff\1\51\1\u00bf\3\uffff\1\u00c0\2\uffff";
    static final String DFA12_eofS =
        "\u00c1\uffff";
    static final String DFA12_minS =
        "\1\0\1\141\1\uffff\1\141\3\uffff\1\141\1\uffff\1\145\1\156\1\141\1\75\1\146\2\uffff\1\154\1\150\1\157\1\162\1\145\1\157\1\165\1\142\1\155\1\60\1\144\1\162\4\75\1\56\1\101\1\uffff\2\0\1\52\2\uffff\1\144\2\uffff\1\141\1\143\3\uffff\1\157\1\162\1\156\1\uffff\2\147\1\141\1\162\1\uffff\2\60\2\uffff\1\163\1\151\1\162\1\157\1\60\1\162\1\165\1\157\1\156\1\147\1\145\1\163\2\60\1\uffff\1\60\1\141\10\uffff\1\56\5\uffff\1\160\1\60\1\162\1\153\1\147\1\141\1\60\1\151\1\60\1\154\1\60\2\uffff\1\145\1\154\1\167\1\156\1\uffff\1\156\1\145\1\160\1\144\1\60\1\162\1\164\3\uffff\1\144\1\151\1\uffff\1\144\1\167\1\162\1\155\1\uffff\1\164\1\uffff\1\157\1\uffff\1\60\1\145\1\141\1\164\4\60\1\uffff\1\171\1\141\1\60\1\55\1\163\2\141\1\163\1\141\1\147\1\uffff\1\60\1\162\1\60\4\uffff\1\55\1\143\2\uffff\1\60\1\162\1\155\1\60\1\154\1\55\1\uffff\1\144\1\uffff\1\150\1\uffff\1\154\1\uffff\1\144\1\60\1\uffff\1\55\1\uffff\1\60\3\uffff\1\145\1\60\3\uffff\1\60\2\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\141\1\uffff\1\157\3\uffff\1\162\1\uffff\1\151\1\156\1\141\1\75\1\156\2\uffff\1\154\1\150\1\164\1\165\1\164\1\157\1\165\1\142\1\155\1\172\1\144\1\162\1\76\3\75\1\71\1\172\1\uffff\2\uffff\1\57\2\uffff\1\163\2\uffff\1\141\1\143\3\uffff\1\157\1\162\1\156\1\uffff\2\147\1\141\1\162\1\uffff\2\172\2\uffff\1\163\1\151\1\162\1\157\1\172\1\162\1\165\1\157\1\156\1\147\1\145\1\163\2\172\1\uffff\1\172\1\141\10\uffff\1\71\5\uffff\1\160\1\172\1\162\1\153\1\147\1\141\1\172\1\151\1\172\1\154\1\172\2\uffff\1\145\1\154\1\167\1\156\1\uffff\1\156\1\145\1\160\1\144\1\172\1\162\1\164\3\uffff\1\144\1\151\1\uffff\1\144\1\167\1\162\1\155\1\uffff\1\164\1\uffff\1\157\1\uffff\1\172\1\145\1\141\1\164\4\172\1\uffff\1\171\1\141\1\172\1\55\1\163\2\141\1\163\1\141\1\147\1\uffff\1\172\1\162\1\172\4\uffff\1\172\1\143\2\uffff\1\172\1\162\1\155\1\172\1\154\1\55\1\uffff\1\144\1\uffff\1\164\1\uffff\1\154\1\uffff\1\144\1\172\1\uffff\1\55\1\uffff\1\172\3\uffff\1\145\1\172\3\uffff\1\172\2\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\1\uffff\1\4\1\5\1\6\1\uffff\1\11\5\uffff\1\17\1\20\22\uffff\1\62\3\uffff\1\67\1\70\1\uffff\1\62\1\2\2\uffff\1\4\1\5\1\6\3\uffff\1\11\4\uffff\1\15\2\uffff\1\17\1\20\16\uffff\1\42\2\uffff\1\54\1\56\1\52\1\53\1\57\1\55\1\60\1\63\1\uffff\1\61\1\64\1\65\1\66\1\67\13\uffff\1\16\1\44\4\uffff\1\43\7\uffff\1\40\1\41\1\45\2\uffff\1\46\4\uffff\1\51\1\uffff\1\47\1\uffff\1\14\10\uffff\1\27\12\uffff\1\21\3\uffff\1\25\1\37\1\26\1\30\2\uffff\1\50\1\1\6\uffff\1\22\1\uffff\1\35\1\uffff\1\34\1\uffff\1\3\2\uffff\1\10\1\uffff\1\13\1\uffff\1\31\1\32\1\33\2\uffff\1\7\1\12\1\23\1\uffff\1\24\1\36";
    static final String DFA12_specialS =
        "\1\1\42\uffff\1\0\1\2\u009c\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\47\2\46\2\47\1\46\22\47\1\46\1\37\1\43\4\47\1\44\1\16\1\17\2\47\1\10\2\47\1\45\12\40\1\14\1\47\1\34\1\35\1\36\2\47\32\42\1\4\1\47\1\5\1\41\1\42\1\47\1\12\1\3\1\30\1\11\1\20\1\22\1\33\1\42\1\15\2\42\1\25\1\31\1\42\1\27\1\7\1\26\1\1\1\24\1\23\1\42\1\13\1\21\1\42\1\32\1\42\1\2\1\47\1\6\uff82\47",
            "\1\50",
            "",
            "\1\54\15\uffff\1\53",
            "",
            "",
            "",
            "\1\61\7\uffff\1\62\10\uffff\1\60",
            "",
            "\1\65\3\uffff\1\64",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71\7\uffff\1\72",
            "",
            "",
            "\1\75",
            "\1\76",
            "\1\77\2\uffff\1\100\1\uffff\1\101",
            "\1\103\2\uffff\1\102",
            "\1\105\16\uffff\1\104",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\14\51\1\112\15\51",
            "\1\114",
            "\1\115",
            "\1\117\1\116",
            "\1\121",
            "\1\122",
            "\1\124",
            "\1\127\1\uffff\12\126",
            "\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\0\130",
            "\0\130",
            "\1\131\4\uffff\1\132",
            "",
            "",
            "\1\135\16\uffff\1\134",
            "",
            "",
            "\1\136",
            "\1\137",
            "",
            "",
            "",
            "\1\140",
            "\1\141",
            "\1\142",
            "",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\170",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\127\1\uffff\12\126",
            "",
            "",
            "",
            "",
            "",
            "\1\171",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0080",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0082",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u008d",
            "\1\u008e",
            "",
            "",
            "",
            "\1\u008f",
            "\1\u0090",
            "",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "",
            "\1\u0095",
            "",
            "\1\u0096",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u009f",
            "\1\u00a0",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00aa",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "",
            "",
            "\1\u00ac\2\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00ae",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00b0",
            "\1\u00b1",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00b3",
            "\1\u00b4",
            "",
            "\1\u00b5",
            "",
            "\1\u00b7\4\uffff\1\u00b8\6\uffff\1\u00b6",
            "",
            "\1\u00b9",
            "",
            "\1\u00ba",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u00bc",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "",
            "\1\u00be",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | RULE_DOUBLE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_35 = input.LA(1);

                        s = -1;
                        if ( ((LA12_35>='\u0000' && LA12_35<='\uFFFF')) ) {s = 88;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='r') ) {s = 1;}

                        else if ( (LA12_0=='{') ) {s = 2;}

                        else if ( (LA12_0=='b') ) {s = 3;}

                        else if ( (LA12_0=='[') ) {s = 4;}

                        else if ( (LA12_0==']') ) {s = 5;}

                        else if ( (LA12_0=='}') ) {s = 6;}

                        else if ( (LA12_0=='p') ) {s = 7;}

                        else if ( (LA12_0==',') ) {s = 8;}

                        else if ( (LA12_0=='d') ) {s = 9;}

                        else if ( (LA12_0=='a') ) {s = 10;}

                        else if ( (LA12_0=='v') ) {s = 11;}

                        else if ( (LA12_0==':') ) {s = 12;}

                        else if ( (LA12_0=='i') ) {s = 13;}

                        else if ( (LA12_0=='(') ) {s = 14;}

                        else if ( (LA12_0==')') ) {s = 15;}

                        else if ( (LA12_0=='e') ) {s = 16;}

                        else if ( (LA12_0=='w') ) {s = 17;}

                        else if ( (LA12_0=='f') ) {s = 18;}

                        else if ( (LA12_0=='t') ) {s = 19;}

                        else if ( (LA12_0=='s') ) {s = 20;}

                        else if ( (LA12_0=='l') ) {s = 21;}

                        else if ( (LA12_0=='q') ) {s = 22;}

                        else if ( (LA12_0=='o') ) {s = 23;}

                        else if ( (LA12_0=='c') ) {s = 24;}

                        else if ( (LA12_0=='m') ) {s = 25;}

                        else if ( (LA12_0=='y') ) {s = 26;}

                        else if ( (LA12_0=='g') ) {s = 27;}

                        else if ( (LA12_0=='<') ) {s = 28;}

                        else if ( (LA12_0=='=') ) {s = 29;}

                        else if ( (LA12_0=='>') ) {s = 30;}

                        else if ( (LA12_0=='!') ) {s = 31;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 32;}

                        else if ( (LA12_0=='^') ) {s = 33;}

                        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='h'||(LA12_0>='j' && LA12_0<='k')||LA12_0=='n'||LA12_0=='u'||LA12_0=='x'||LA12_0=='z') ) {s = 34;}

                        else if ( (LA12_0=='\"') ) {s = 35;}

                        else if ( (LA12_0=='\'') ) {s = 36;}

                        else if ( (LA12_0=='/') ) {s = 37;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 38;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='*' && LA12_0<='+')||(LA12_0>='-' && LA12_0<='.')||LA12_0==';'||(LA12_0>='?' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 39;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_36 = input.LA(1);

                        s = -1;
                        if ( ((LA12_36>='\u0000' && LA12_36<='\uFFFF')) ) {s = 88;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}