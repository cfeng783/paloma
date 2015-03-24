package org.xtext.edinburgh.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPalomaLexer extends Lexer {
    public static final int RULE_ID=7;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int RULE_INT=4;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_DOUBLE=5;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=9;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int RULE_DOUBLE_SCIENTIFIC=6;
    public static final int T__39=39;
    public static final int RULE_EXPONENT=8;
    public static final int RULE_WS=12;

    // delegates
    // delegators

    public InternalPalomaLexer() {;} 
    public InternalPalomaLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalPalomaLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:11:7: ( 'local' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:11:9: 'local'
            {
            match("local"); 


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
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:12:7: ( 'all' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:12:9: 'all'
            {
            match("all"); 


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
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:13:7: ( 'loc_s' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:13:9: 'loc_s'
            {
            match("loc_s"); 


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
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:14:7: ( 'loc_r' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:14:9: 'loc_r'
            {
            match("loc_r"); 


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
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:15:7: ( '^' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:15:9: '^'
            {
            match('^'); 

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
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:16:7: ( '+' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:16:9: '+'
            {
            match('+'); 

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
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:17:7: ( '-' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:17:9: '-'
            {
            match('-'); 

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
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:18:7: ( '*' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:18:9: '*'
            {
            match('*'); 

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
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:19:7: ( '/' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:19:9: '/'
            {
            match('/'); 

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
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:20:7: ( '%' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:20:9: '%'
            {
            match('%'); 

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
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:21:7: ( '#params' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:21:9: '#params'
            {
            match("#params"); 


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
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:22:7: ( '#states' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:22:9: '#states'
            {
            match("#states"); 


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
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:23:7: ( '#agents' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:23:9: '#agents'
            {
            match("#agents"); 


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
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:24:7: ( 'param' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:24:9: 'param'
            {
            match("param"); 


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
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:25:7: ( '=' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:25:9: '='
            {
            match('='); 

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
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:26:7: ( ';' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:26:9: ';'
            {
            match(';'); 

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
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:27:7: ( ':=' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:27:9: ':='
            {
            match(":="); 


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
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:28:7: ( '(' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:28:9: '('
            {
            match('('); 

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
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:29:7: ( ',' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:29:9: ','
            {
            match(','); 

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
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:30:7: ( ')' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:30:9: ')'
            {
            match(')'); 

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
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:31:7: ( '.' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:31:9: '.'
            {
            match('.'); 

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
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:32:7: ( '!(' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:32:9: '!('
            {
            match("!("); 


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
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:33:7: ( ')@' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:33:9: ')@'
            {
            match(")@"); 


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
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:34:7: ( 'IR' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:34:9: 'IR'
            {
            match("IR"); 


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
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:35:7: ( '{' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:35:9: '{'
            {
            match('{'); 

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
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:36:7: ( '}.' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:36:9: '}.'
            {
            match("}."); 


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
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:37:7: ( '!!(' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:37:9: '!!('
            {
            match("!!("); 


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
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:38:7: ( '?(' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:38:9: '?('
            {
            match("?("); 


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
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:39:7: ( 'Pr' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:39:9: 'Pr'
            {
            match("Pr"); 


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
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:40:7: ( '??(' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:40:9: '??('
            {
            match("??("); 


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
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:41:7: ( 'Wt' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:41:9: 'Wt'
            {
            match("Wt"); 


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
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:42:7: ( 'range' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:42:9: 'range'
            {
            match("range"); 


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
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:43:7: ( 'dist' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:43:9: 'dist'
            {
            match("dist"); 


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
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:44:7: ( '|' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:44:9: '|'
            {
            match('|'); 

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
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:45:7: ( '||' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:45:9: '||'
            {
            match("||"); 


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
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:46:7: ( '[' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:46:9: '['
            {
            match('['); 

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
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:47:7: ( ']' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:47:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5315:13: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5315:15: ( '0' .. '9' )+ '.' ( '0' .. '9' )+
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5315:15: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5315:16: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            match('.'); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5315:31: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5315:32: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_EXPONENT"
    public final void mRULE_EXPONENT() throws RecognitionException {
        try {
            int _type = RULE_EXPONENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5317:15: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5317:17: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5317:27: ( '+' | '-' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='+'||LA3_0=='-') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5317:38: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5317:39: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXPONENT"

    // $ANTLR start "RULE_DOUBLE_SCIENTIFIC"
    public final void mRULE_DOUBLE_SCIENTIFIC() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE_SCIENTIFIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5319:24: ( ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* RULE_EXPONENT | ( '0' .. '9' )+ RULE_EXPONENT ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5319:26: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* RULE_EXPONENT | ( '0' .. '9' )+ RULE_EXPONENT )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5319:26: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* RULE_EXPONENT | ( '0' .. '9' )+ RULE_EXPONENT )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5319:27: ( '0' .. '9' )+ '.' ( '0' .. '9' )* RULE_EXPONENT
                    {
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5319:27: ( '0' .. '9' )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5319:28: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);

                    match('.'); 
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5319:43: ( '0' .. '9' )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5319:44: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    mRULE_EXPONENT(); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5319:69: ( '0' .. '9' )+ RULE_EXPONENT
                    {
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5319:69: ( '0' .. '9' )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5319:70: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);

                    mRULE_EXPONENT(); 

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
    // $ANTLR end "RULE_DOUBLE_SCIENTIFIC"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5321:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5321:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5321:11: ( '^' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='^') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5321:11: '^'
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

            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5321:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')||(LA10_0>='A' && LA10_0<='Z')||LA10_0=='_'||(LA10_0>='a' && LA10_0<='z')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:
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
            	    break loop10;
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
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5323:10: ( ( '0' .. '9' )+ )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5323:12: ( '0' .. '9' )+
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5323:12: ( '0' .. '9' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5323:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5325:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5325:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5325:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\"') ) {
                alt14=1;
            }
            else if ( (LA14_0=='\'') ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5325:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5325:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop12:
                    do {
                        int alt12=3;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='\\') ) {
                            alt12=1;
                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<='!')||(LA12_0>='#' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFF')) ) {
                            alt12=2;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5325:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5325:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop12;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5325:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5325:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop13:
                    do {
                        int alt13=3;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='\\') ) {
                            alt13=1;
                        }
                        else if ( ((LA13_0>='\u0000' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFF')) ) {
                            alt13=2;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5325:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5325:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop13;
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
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5327:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5327:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5327:24: ( options {greedy=false; } : . )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='*') ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1=='/') ) {
                        alt15=2;
                    }
                    else if ( ((LA15_1>='\u0000' && LA15_1<='.')||(LA15_1>='0' && LA15_1<='\uFFFF')) ) {
                        alt15=1;
                    }


                }
                else if ( ((LA15_0>='\u0000' && LA15_0<=')')||(LA15_0>='+' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5327:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop15;
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
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5329:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5329:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5329:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\u0000' && LA16_0<='\t')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\uFFFF')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5329:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop16;
                }
            } while (true);

            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5329:40: ( ( '\\r' )? '\\n' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\n'||LA18_0=='\r') ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5329:41: ( '\\r' )? '\\n'
                    {
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5329:41: ( '\\r' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='\r') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5329:41: '\\r'
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
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5331:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5331:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5331:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='\t' && LA19_0<='\n')||LA19_0=='\r'||LA19_0==' ') ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:
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
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
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
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5333:16: ( . )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5333:18: .
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
        // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | RULE_DOUBLE | RULE_EXPONENT | RULE_DOUBLE_SCIENTIFIC | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt20=47;
        alt20 = dfa20.predict(input);
        switch (alt20) {
            case 1 :
                // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1:190: T__44
                {
                mT__44(); 

                }
                break;
            case 32 :
                // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1:196: T__45
                {
                mT__45(); 

                }
                break;
            case 33 :
                // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1:202: T__46
                {
                mT__46(); 

                }
                break;
            case 34 :
                // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1:208: T__47
                {
                mT__47(); 

                }
                break;
            case 35 :
                // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1:214: T__48
                {
                mT__48(); 

                }
                break;
            case 36 :
                // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1:220: T__49
                {
                mT__49(); 

                }
                break;
            case 37 :
                // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1:226: T__50
                {
                mT__50(); 

                }
                break;
            case 38 :
                // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1:232: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 39 :
                // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1:244: RULE_EXPONENT
                {
                mRULE_EXPONENT(); 

                }
                break;
            case 40 :
                // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1:258: RULE_DOUBLE_SCIENTIFIC
                {
                mRULE_DOUBLE_SCIENTIFIC(); 

                }
                break;
            case 41 :
                // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1:281: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 42 :
                // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1:289: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 43 :
                // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1:298: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 44 :
                // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1:310: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 45 :
                // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1:326: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 46 :
                // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1:342: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 47 :
                // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1:350: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA8_eotS =
        "\4\uffff";
    static final String DFA8_eofS =
        "\4\uffff";
    static final String DFA8_minS =
        "\1\60\1\56\2\uffff";
    static final String DFA8_maxS =
        "\1\71\1\145\2\uffff";
    static final String DFA8_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA8_specialS =
        "\4\uffff}>";
    static final String[] DFA8_transitionS = {
            "\12\1",
            "\1\3\1\uffff\12\1\13\uffff\1\2\37\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "5319:26: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* RULE_EXPONENT | ( '0' .. '9' )+ RULE_EXPONENT )";
        }
    }
    static final String DFA20_eotS =
        "\1\uffff\2\46\1\50\3\uffff\1\56\1\uffff\1\44\1\46\2\uffff\1\44\2\uffff\1\72\1\uffff\1\44\1\46\1\uffff\2\44\4\46\1\110\2\uffff\1\113\1\46\1\uffff\2\44\2\uffff\1\46\1\uffff\1\46\13\uffff\1\46\12\uffff\1\126\4\uffff\1\127\1\130\2\46\6\uffff\1\113\1\uffff\1\120\3\uffff\1\46\1\136\1\46\3\uffff\2\46\1\142\2\46\1\uffff\2\46\1\150\1\uffff\1\151\1\152\1\153\1\154\1\155\6\uffff";
    static final String DFA20_eofS =
        "\156\uffff";
    static final String DFA20_minS =
        "\1\0\1\157\1\154\1\101\3\uffff\1\52\1\uffff\2\141\2\uffff\1\75\2\uffff\1\100\1\uffff\1\41\1\122\1\uffff\1\56\1\50\1\162\1\164\1\141\1\151\1\174\2\uffff\1\56\1\53\1\uffff\2\0\2\uffff\1\143\1\uffff\1\154\13\uffff\1\162\12\uffff\1\60\4\uffff\2\60\1\156\1\163\6\uffff\1\56\2\60\3\uffff\1\137\1\60\1\141\3\uffff\1\147\1\164\1\60\1\154\1\162\1\uffff\1\155\1\145\1\60\1\uffff\5\60\6\uffff";
    static final String DFA20_maxS =
        "\1\uffff\1\157\1\154\1\172\3\uffff\1\57\1\uffff\1\163\1\141\2\uffff\1\75\2\uffff\1\100\1\uffff\1\50\1\122\1\uffff\1\56\1\77\1\162\1\164\1\141\1\151\1\174\2\uffff\1\145\1\71\1\uffff\2\uffff\2\uffff\1\143\1\uffff\1\154\13\uffff\1\162\12\uffff\1\172\4\uffff\2\172\1\156\1\163\6\uffff\2\145\1\172\3\uffff\1\141\1\172\1\141\3\uffff\1\147\1\164\1\145\1\154\1\163\1\uffff\1\155\1\145\1\172\1\uffff\5\172\6\uffff";
    static final String DFA20_acceptS =
        "\4\uffff\1\6\1\7\1\10\1\uffff\1\12\2\uffff\1\17\1\20\1\uffff\1\22\1\23\1\uffff\1\25\2\uffff\1\31\7\uffff\1\44\1\45\2\uffff\1\51\2\uffff\1\56\1\57\1\uffff\1\51\1\uffff\1\5\1\6\1\7\1\10\1\54\1\55\1\11\1\12\1\13\1\14\1\15\1\uffff\1\17\1\20\1\21\1\22\1\23\1\27\1\24\1\25\1\26\1\33\1\uffff\1\31\1\32\1\34\1\36\4\uffff\1\43\1\42\1\44\1\45\1\52\1\50\3\uffff\1\47\1\53\1\56\3\uffff\1\30\1\35\1\37\5\uffff\1\2\3\uffff\1\46\5\uffff\1\41\1\1\1\3\1\4\1\16\1\40";
    static final String DFA20_specialS =
        "\1\0\40\uffff\1\2\1\1\113\uffff}>";
    static final String[] DFA20_transitionS = {
            "\11\44\2\43\2\44\1\43\22\44\1\43\1\22\1\41\1\11\1\44\1\10\1\44\1\42\1\16\1\20\1\6\1\4\1\17\1\5\1\21\1\7\12\36\1\15\1\14\1\44\1\13\1\44\1\26\1\44\4\40\1\37\3\40\1\23\6\40\1\27\6\40\1\30\3\40\1\34\1\44\1\35\1\3\1\40\1\44\1\2\2\40\1\32\1\37\6\40\1\1\3\40\1\12\1\40\1\31\10\40\1\24\1\33\1\25\uff82\44",
            "\1\45",
            "\1\47",
            "\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "",
            "\1\54\4\uffff\1\55",
            "",
            "\1\62\16\uffff\1\60\2\uffff\1\61",
            "\1\63",
            "",
            "",
            "\1\66",
            "",
            "",
            "\1\71",
            "",
            "\1\75\6\uffff\1\74",
            "\1\76",
            "",
            "\1\100",
            "\1\101\26\uffff\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "",
            "",
            "\1\116\1\uffff\12\115\13\uffff\1\114\37\uffff\1\114",
            "\1\120\1\uffff\1\120\2\uffff\12\117",
            "",
            "\0\121",
            "\0\121",
            "",
            "",
            "\1\123",
            "",
            "\1\124",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\125",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\131",
            "\1\132",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\116\1\uffff\12\115\13\uffff\1\114\37\uffff\1\114",
            "\12\133\13\uffff\1\114\37\uffff\1\114",
            "\12\117\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "",
            "\1\135\1\uffff\1\134",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\137",
            "",
            "",
            "",
            "\1\140",
            "\1\141",
            "\12\133\13\uffff\1\114\37\uffff\1\114",
            "\1\143",
            "\1\145\1\144",
            "",
            "\1\146",
            "\1\147",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | RULE_DOUBLE | RULE_EXPONENT | RULE_DOUBLE_SCIENTIFIC | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_0 = input.LA(1);

                        s = -1;
                        if ( (LA20_0=='l') ) {s = 1;}

                        else if ( (LA20_0=='a') ) {s = 2;}

                        else if ( (LA20_0=='^') ) {s = 3;}

                        else if ( (LA20_0=='+') ) {s = 4;}

                        else if ( (LA20_0=='-') ) {s = 5;}

                        else if ( (LA20_0=='*') ) {s = 6;}

                        else if ( (LA20_0=='/') ) {s = 7;}

                        else if ( (LA20_0=='%') ) {s = 8;}

                        else if ( (LA20_0=='#') ) {s = 9;}

                        else if ( (LA20_0=='p') ) {s = 10;}

                        else if ( (LA20_0=='=') ) {s = 11;}

                        else if ( (LA20_0==';') ) {s = 12;}

                        else if ( (LA20_0==':') ) {s = 13;}

                        else if ( (LA20_0=='(') ) {s = 14;}

                        else if ( (LA20_0==',') ) {s = 15;}

                        else if ( (LA20_0==')') ) {s = 16;}

                        else if ( (LA20_0=='.') ) {s = 17;}

                        else if ( (LA20_0=='!') ) {s = 18;}

                        else if ( (LA20_0=='I') ) {s = 19;}

                        else if ( (LA20_0=='{') ) {s = 20;}

                        else if ( (LA20_0=='}') ) {s = 21;}

                        else if ( (LA20_0=='?') ) {s = 22;}

                        else if ( (LA20_0=='P') ) {s = 23;}

                        else if ( (LA20_0=='W') ) {s = 24;}

                        else if ( (LA20_0=='r') ) {s = 25;}

                        else if ( (LA20_0=='d') ) {s = 26;}

                        else if ( (LA20_0=='|') ) {s = 27;}

                        else if ( (LA20_0=='[') ) {s = 28;}

                        else if ( (LA20_0==']') ) {s = 29;}

                        else if ( ((LA20_0>='0' && LA20_0<='9')) ) {s = 30;}

                        else if ( (LA20_0=='E'||LA20_0=='e') ) {s = 31;}

                        else if ( ((LA20_0>='A' && LA20_0<='D')||(LA20_0>='F' && LA20_0<='H')||(LA20_0>='J' && LA20_0<='O')||(LA20_0>='Q' && LA20_0<='V')||(LA20_0>='X' && LA20_0<='Z')||LA20_0=='_'||(LA20_0>='b' && LA20_0<='c')||(LA20_0>='f' && LA20_0<='k')||(LA20_0>='m' && LA20_0<='o')||LA20_0=='q'||(LA20_0>='s' && LA20_0<='z')) ) {s = 32;}

                        else if ( (LA20_0=='\"') ) {s = 33;}

                        else if ( (LA20_0=='\'') ) {s = 34;}

                        else if ( ((LA20_0>='\t' && LA20_0<='\n')||LA20_0=='\r'||LA20_0==' ') ) {s = 35;}

                        else if ( ((LA20_0>='\u0000' && LA20_0<='\b')||(LA20_0>='\u000B' && LA20_0<='\f')||(LA20_0>='\u000E' && LA20_0<='\u001F')||LA20_0=='$'||LA20_0=='&'||LA20_0=='<'||LA20_0=='>'||LA20_0=='@'||LA20_0=='\\'||LA20_0=='`'||(LA20_0>='~' && LA20_0<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA20_34 = input.LA(1);

                        s = -1;
                        if ( ((LA20_34>='\u0000' && LA20_34<='\uFFFF')) ) {s = 81;}

                        else s = 36;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA20_33 = input.LA(1);

                        s = -1;
                        if ( ((LA20_33>='\u0000' && LA20_33<='\uFFFF')) ) {s = 81;}

                        else s = 36;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}