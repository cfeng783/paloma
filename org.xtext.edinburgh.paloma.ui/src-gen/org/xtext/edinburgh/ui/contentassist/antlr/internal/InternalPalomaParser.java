package org.xtext.edinburgh.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.edinburgh.services.PalomaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPalomaParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_DOUBLE", "RULE_DOUBLE_SCIENTIFIC", "RULE_ID", "RULE_EXPONENT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'local'", "'all'", "'loc_s'", "'loc_r'", "'^'", "'+'", "'-'", "'*'", "'/'", "'%'", "'#params'", "'#states'", "'#agents'", "'param'", "'='", "';'", "':='", "'('", "','", "')'", "'.'", "'!('", "')@'", "'IR'", "'{'", "'}.'", "'!!('", "'?('", "'Pr'", "'??('", "'Wt'", "'range'", "'dist'", "'|'", "'||'", "'['", "']'"
    };
    public static final int RULE_ID=7;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__21=21;
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
    public static final int RULE_DOUBLE_SCIENTIFIC=6;
    public static final int T__38=38;
    public static final int RULE_EXPONENT=8;
    public static final int T__39=39;
    public static final int RULE_WS=12;

    // delegates
    // delegators


        public InternalPalomaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPalomaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPalomaParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g"; }


     
     	private PalomaGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(PalomaGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:61:1: ( ruleModel EOF )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:76:1: ( rule__Model__Group__0 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleParam"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:88:1: entryRuleParam : ruleParam EOF ;
    public final void entryRuleParam() throws RecognitionException {
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:89:1: ( ruleParam EOF )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:90:1: ruleParam EOF
            {
             before(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_ruleParam_in_entryRuleParam121);
            ruleParam();

            state._fsp--;

             after(grammarAccess.getParamRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParam128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParam"


    // $ANTLR start "ruleParam"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:97:1: ruleParam : ( ( rule__Param__Group__0 ) ) ;
    public final void ruleParam() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:101:2: ( ( ( rule__Param__Group__0 ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:102:1: ( ( rule__Param__Group__0 ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:102:1: ( ( rule__Param__Group__0 ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:103:1: ( rule__Param__Group__0 )
            {
             before(grammarAccess.getParamAccess().getGroup()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:104:1: ( rule__Param__Group__0 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:104:2: rule__Param__Group__0
            {
            pushFollow(FOLLOW_rule__Param__Group__0_in_ruleParam154);
            rule__Param__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParamAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParam"


    // $ANTLR start "entryRuleAgentState"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:116:1: entryRuleAgentState : ruleAgentState EOF ;
    public final void entryRuleAgentState() throws RecognitionException {
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:117:1: ( ruleAgentState EOF )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:118:1: ruleAgentState EOF
            {
             before(grammarAccess.getAgentStateRule()); 
            pushFollow(FOLLOW_ruleAgentState_in_entryRuleAgentState181);
            ruleAgentState();

            state._fsp--;

             after(grammarAccess.getAgentStateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAgentState188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAgentState"


    // $ANTLR start "ruleAgentState"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:125:1: ruleAgentState : ( ( rule__AgentState__Group__0 ) ) ;
    public final void ruleAgentState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:129:2: ( ( ( rule__AgentState__Group__0 ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:130:1: ( ( rule__AgentState__Group__0 ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:130:1: ( ( rule__AgentState__Group__0 ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:131:1: ( rule__AgentState__Group__0 )
            {
             before(grammarAccess.getAgentStateAccess().getGroup()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:132:1: ( rule__AgentState__Group__0 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:132:2: rule__AgentState__Group__0
            {
            pushFollow(FOLLOW_rule__AgentState__Group__0_in_ruleAgentState214);
            rule__AgentState__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAgentStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAgentState"


    // $ANTLR start "entryRulePrefix"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:144:1: entryRulePrefix : rulePrefix EOF ;
    public final void entryRulePrefix() throws RecognitionException {
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:145:1: ( rulePrefix EOF )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:146:1: rulePrefix EOF
            {
             before(grammarAccess.getPrefixRule()); 
            pushFollow(FOLLOW_rulePrefix_in_entryRulePrefix241);
            rulePrefix();

            state._fsp--;

             after(grammarAccess.getPrefixRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrefix248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrefix"


    // $ANTLR start "rulePrefix"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:153:1: rulePrefix : ( ( rule__Prefix__Group__0 ) ) ;
    public final void rulePrefix() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:157:2: ( ( ( rule__Prefix__Group__0 ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:158:1: ( ( rule__Prefix__Group__0 ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:158:1: ( ( rule__Prefix__Group__0 ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:159:1: ( rule__Prefix__Group__0 )
            {
             before(grammarAccess.getPrefixAccess().getGroup()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:160:1: ( rule__Prefix__Group__0 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:160:2: rule__Prefix__Group__0
            {
            pushFollow(FOLLOW_rule__Prefix__Group__0_in_rulePrefix274);
            rule__Prefix__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrefixAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrefix"


    // $ANTLR start "entryRuleACTION"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:172:1: entryRuleACTION : ruleACTION EOF ;
    public final void entryRuleACTION() throws RecognitionException {
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:173:1: ( ruleACTION EOF )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:174:1: ruleACTION EOF
            {
             before(grammarAccess.getACTIONRule()); 
            pushFollow(FOLLOW_ruleACTION_in_entryRuleACTION301);
            ruleACTION();

            state._fsp--;

             after(grammarAccess.getACTIONRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleACTION308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleACTION"


    // $ANTLR start "ruleACTION"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:181:1: ruleACTION : ( ( rule__ACTION__Alternatives ) ) ;
    public final void ruleACTION() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:185:2: ( ( ( rule__ACTION__Alternatives ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:186:1: ( ( rule__ACTION__Alternatives ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:186:1: ( ( rule__ACTION__Alternatives ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:187:1: ( rule__ACTION__Alternatives )
            {
             before(grammarAccess.getACTIONAccess().getAlternatives()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:188:1: ( rule__ACTION__Alternatives )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:188:2: rule__ACTION__Alternatives
            {
            pushFollow(FOLLOW_rule__ACTION__Alternatives_in_ruleACTION334);
            rule__ACTION__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getACTIONAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleACTION"


    // $ANTLR start "entryRuleACT_SpNoMsg"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:200:1: entryRuleACT_SpNoMsg : ruleACT_SpNoMsg EOF ;
    public final void entryRuleACT_SpNoMsg() throws RecognitionException {
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:201:1: ( ruleACT_SpNoMsg EOF )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:202:1: ruleACT_SpNoMsg EOF
            {
             before(grammarAccess.getACT_SpNoMsgRule()); 
            pushFollow(FOLLOW_ruleACT_SpNoMsg_in_entryRuleACT_SpNoMsg361);
            ruleACT_SpNoMsg();

            state._fsp--;

             after(grammarAccess.getACT_SpNoMsgRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleACT_SpNoMsg368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleACT_SpNoMsg"


    // $ANTLR start "ruleACT_SpNoMsg"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:209:1: ruleACT_SpNoMsg : ( ( rule__ACT_SpNoMsg__Group__0 ) ) ;
    public final void ruleACT_SpNoMsg() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:213:2: ( ( ( rule__ACT_SpNoMsg__Group__0 ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:214:1: ( ( rule__ACT_SpNoMsg__Group__0 ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:214:1: ( ( rule__ACT_SpNoMsg__Group__0 ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:215:1: ( rule__ACT_SpNoMsg__Group__0 )
            {
             before(grammarAccess.getACT_SpNoMsgAccess().getGroup()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:216:1: ( rule__ACT_SpNoMsg__Group__0 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:216:2: rule__ACT_SpNoMsg__Group__0
            {
            pushFollow(FOLLOW_rule__ACT_SpNoMsg__Group__0_in_ruleACT_SpNoMsg394);
            rule__ACT_SpNoMsg__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getACT_SpNoMsgAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleACT_SpNoMsg"


    // $ANTLR start "entryRuleACT_SpBr"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:228:1: entryRuleACT_SpBr : ruleACT_SpBr EOF ;
    public final void entryRuleACT_SpBr() throws RecognitionException {
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:229:1: ( ruleACT_SpBr EOF )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:230:1: ruleACT_SpBr EOF
            {
             before(grammarAccess.getACT_SpBrRule()); 
            pushFollow(FOLLOW_ruleACT_SpBr_in_entryRuleACT_SpBr421);
            ruleACT_SpBr();

            state._fsp--;

             after(grammarAccess.getACT_SpBrRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleACT_SpBr428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleACT_SpBr"


    // $ANTLR start "ruleACT_SpBr"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:237:1: ruleACT_SpBr : ( ( rule__ACT_SpBr__Group__0 ) ) ;
    public final void ruleACT_SpBr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:241:2: ( ( ( rule__ACT_SpBr__Group__0 ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:242:1: ( ( rule__ACT_SpBr__Group__0 ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:242:1: ( ( rule__ACT_SpBr__Group__0 ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:243:1: ( rule__ACT_SpBr__Group__0 )
            {
             before(grammarAccess.getACT_SpBrAccess().getGroup()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:244:1: ( rule__ACT_SpBr__Group__0 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:244:2: rule__ACT_SpBr__Group__0
            {
            pushFollow(FOLLOW_rule__ACT_SpBr__Group__0_in_ruleACT_SpBr454);
            rule__ACT_SpBr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getACT_SpBrAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleACT_SpBr"


    // $ANTLR start "entryRuleACT_SpUni"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:256:1: entryRuleACT_SpUni : ruleACT_SpUni EOF ;
    public final void entryRuleACT_SpUni() throws RecognitionException {
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:257:1: ( ruleACT_SpUni EOF )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:258:1: ruleACT_SpUni EOF
            {
             before(grammarAccess.getACT_SpUniRule()); 
            pushFollow(FOLLOW_ruleACT_SpUni_in_entryRuleACT_SpUni481);
            ruleACT_SpUni();

            state._fsp--;

             after(grammarAccess.getACT_SpUniRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleACT_SpUni488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleACT_SpUni"


    // $ANTLR start "ruleACT_SpUni"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:265:1: ruleACT_SpUni : ( ( rule__ACT_SpUni__Group__0 ) ) ;
    public final void ruleACT_SpUni() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:269:2: ( ( ( rule__ACT_SpUni__Group__0 ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:270:1: ( ( rule__ACT_SpUni__Group__0 ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:270:1: ( ( rule__ACT_SpUni__Group__0 ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:271:1: ( rule__ACT_SpUni__Group__0 )
            {
             before(grammarAccess.getACT_SpUniAccess().getGroup()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:272:1: ( rule__ACT_SpUni__Group__0 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:272:2: rule__ACT_SpUni__Group__0
            {
            pushFollow(FOLLOW_rule__ACT_SpUni__Group__0_in_ruleACT_SpUni514);
            rule__ACT_SpUni__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getACT_SpUniAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleACT_SpUni"


    // $ANTLR start "entryRuleACT_InBr"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:284:1: entryRuleACT_InBr : ruleACT_InBr EOF ;
    public final void entryRuleACT_InBr() throws RecognitionException {
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:285:1: ( ruleACT_InBr EOF )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:286:1: ruleACT_InBr EOF
            {
             before(grammarAccess.getACT_InBrRule()); 
            pushFollow(FOLLOW_ruleACT_InBr_in_entryRuleACT_InBr541);
            ruleACT_InBr();

            state._fsp--;

             after(grammarAccess.getACT_InBrRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleACT_InBr548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleACT_InBr"


    // $ANTLR start "ruleACT_InBr"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:293:1: ruleACT_InBr : ( ( rule__ACT_InBr__Group__0 ) ) ;
    public final void ruleACT_InBr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:297:2: ( ( ( rule__ACT_InBr__Group__0 ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:298:1: ( ( rule__ACT_InBr__Group__0 ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:298:1: ( ( rule__ACT_InBr__Group__0 ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:299:1: ( rule__ACT_InBr__Group__0 )
            {
             before(grammarAccess.getACT_InBrAccess().getGroup()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:300:1: ( rule__ACT_InBr__Group__0 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:300:2: rule__ACT_InBr__Group__0
            {
            pushFollow(FOLLOW_rule__ACT_InBr__Group__0_in_ruleACT_InBr574);
            rule__ACT_InBr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getACT_InBrAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleACT_InBr"


    // $ANTLR start "entryRuleACT_InUni"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:312:1: entryRuleACT_InUni : ruleACT_InUni EOF ;
    public final void entryRuleACT_InUni() throws RecognitionException {
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:313:1: ( ruleACT_InUni EOF )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:314:1: ruleACT_InUni EOF
            {
             before(grammarAccess.getACT_InUniRule()); 
            pushFollow(FOLLOW_ruleACT_InUni_in_entryRuleACT_InUni601);
            ruleACT_InUni();

            state._fsp--;

             after(grammarAccess.getACT_InUniRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleACT_InUni608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleACT_InUni"


    // $ANTLR start "ruleACT_InUni"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:321:1: ruleACT_InUni : ( ( rule__ACT_InUni__Group__0 ) ) ;
    public final void ruleACT_InUni() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:325:2: ( ( ( rule__ACT_InUni__Group__0 ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:326:1: ( ( rule__ACT_InUni__Group__0 ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:326:1: ( ( rule__ACT_InUni__Group__0 ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:327:1: ( rule__ACT_InUni__Group__0 )
            {
             before(grammarAccess.getACT_InUniAccess().getGroup()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:328:1: ( rule__ACT_InUni__Group__0 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:328:2: rule__ACT_InUni__Group__0
            {
            pushFollow(FOLLOW_rule__ACT_InUni__Group__0_in_ruleACT_InUni634);
            rule__ACT_InUni__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getACT_InUniAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleACT_InUni"


    // $ANTLR start "entryRuleIRange"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:340:1: entryRuleIRange : ruleIRange EOF ;
    public final void entryRuleIRange() throws RecognitionException {
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:341:1: ( ruleIRange EOF )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:342:1: ruleIRange EOF
            {
             before(grammarAccess.getIRangeRule()); 
            pushFollow(FOLLOW_ruleIRange_in_entryRuleIRange661);
            ruleIRange();

            state._fsp--;

             after(grammarAccess.getIRangeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIRange668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIRange"


    // $ANTLR start "ruleIRange"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:349:1: ruleIRange : ( ( rule__IRange__Alternatives ) ) ;
    public final void ruleIRange() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:353:2: ( ( ( rule__IRange__Alternatives ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:354:1: ( ( rule__IRange__Alternatives ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:354:1: ( ( rule__IRange__Alternatives ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:355:1: ( rule__IRange__Alternatives )
            {
             before(grammarAccess.getIRangeAccess().getAlternatives()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:356:1: ( rule__IRange__Alternatives )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:356:2: rule__IRange__Alternatives
            {
            pushFollow(FOLLOW_rule__IRange__Alternatives_in_ruleIRange694);
            rule__IRange__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIRangeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIRange"


    // $ANTLR start "entryRulePR_Expr"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:368:1: entryRulePR_Expr : rulePR_Expr EOF ;
    public final void entryRulePR_Expr() throws RecognitionException {
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:369:1: ( rulePR_Expr EOF )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:370:1: rulePR_Expr EOF
            {
             before(grammarAccess.getPR_ExprRule()); 
            pushFollow(FOLLOW_rulePR_Expr_in_entryRulePR_Expr721);
            rulePR_Expr();

            state._fsp--;

             after(grammarAccess.getPR_ExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePR_Expr728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePR_Expr"


    // $ANTLR start "rulePR_Expr"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:377:1: rulePR_Expr : ( ( rule__PR_Expr__Group__0 ) ) ;
    public final void rulePR_Expr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:381:2: ( ( ( rule__PR_Expr__Group__0 ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:382:1: ( ( rule__PR_Expr__Group__0 ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:382:1: ( ( rule__PR_Expr__Group__0 ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:383:1: ( rule__PR_Expr__Group__0 )
            {
             before(grammarAccess.getPR_ExprAccess().getGroup()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:384:1: ( rule__PR_Expr__Group__0 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:384:2: rule__PR_Expr__Group__0
            {
            pushFollow(FOLLOW_rule__PR_Expr__Group__0_in_rulePR_Expr754);
            rule__PR_Expr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPR_ExprAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePR_Expr"


    // $ANTLR start "entryRuleTerminal_PR_Expr"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:396:1: entryRuleTerminal_PR_Expr : ruleTerminal_PR_Expr EOF ;
    public final void entryRuleTerminal_PR_Expr() throws RecognitionException {
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:397:1: ( ruleTerminal_PR_Expr EOF )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:398:1: ruleTerminal_PR_Expr EOF
            {
             before(grammarAccess.getTerminal_PR_ExprRule()); 
            pushFollow(FOLLOW_ruleTerminal_PR_Expr_in_entryRuleTerminal_PR_Expr781);
            ruleTerminal_PR_Expr();

            state._fsp--;

             after(grammarAccess.getTerminal_PR_ExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminal_PR_Expr788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerminal_PR_Expr"


    // $ANTLR start "ruleTerminal_PR_Expr"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:405:1: ruleTerminal_PR_Expr : ( ( rule__Terminal_PR_Expr__Alternatives ) ) ;
    public final void ruleTerminal_PR_Expr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:409:2: ( ( ( rule__Terminal_PR_Expr__Alternatives ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:410:1: ( ( rule__Terminal_PR_Expr__Alternatives ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:410:1: ( ( rule__Terminal_PR_Expr__Alternatives ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:411:1: ( rule__Terminal_PR_Expr__Alternatives )
            {
             before(grammarAccess.getTerminal_PR_ExprAccess().getAlternatives()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:412:1: ( rule__Terminal_PR_Expr__Alternatives )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:412:2: rule__Terminal_PR_Expr__Alternatives
            {
            pushFollow(FOLLOW_rule__Terminal_PR_Expr__Alternatives_in_ruleTerminal_PR_Expr814);
            rule__Terminal_PR_Expr__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTerminal_PR_ExprAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerminal_PR_Expr"


    // $ANTLR start "entryRuleRATE_Expr"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:424:1: entryRuleRATE_Expr : ruleRATE_Expr EOF ;
    public final void entryRuleRATE_Expr() throws RecognitionException {
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:425:1: ( ruleRATE_Expr EOF )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:426:1: ruleRATE_Expr EOF
            {
             before(grammarAccess.getRATE_ExprRule()); 
            pushFollow(FOLLOW_ruleRATE_Expr_in_entryRuleRATE_Expr841);
            ruleRATE_Expr();

            state._fsp--;

             after(grammarAccess.getRATE_ExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRATE_Expr848); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRATE_Expr"


    // $ANTLR start "ruleRATE_Expr"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:433:1: ruleRATE_Expr : ( ( rule__RATE_Expr__Group__0 ) ) ;
    public final void ruleRATE_Expr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:437:2: ( ( ( rule__RATE_Expr__Group__0 ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:438:1: ( ( rule__RATE_Expr__Group__0 ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:438:1: ( ( rule__RATE_Expr__Group__0 ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:439:1: ( rule__RATE_Expr__Group__0 )
            {
             before(grammarAccess.getRATE_ExprAccess().getGroup()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:440:1: ( rule__RATE_Expr__Group__0 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:440:2: rule__RATE_Expr__Group__0
            {
            pushFollow(FOLLOW_rule__RATE_Expr__Group__0_in_ruleRATE_Expr874);
            rule__RATE_Expr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRATE_ExprAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRATE_Expr"


    // $ANTLR start "entryRuleTerminal_RATE_Expr"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:452:1: entryRuleTerminal_RATE_Expr : ruleTerminal_RATE_Expr EOF ;
    public final void entryRuleTerminal_RATE_Expr() throws RecognitionException {
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:453:1: ( ruleTerminal_RATE_Expr EOF )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:454:1: ruleTerminal_RATE_Expr EOF
            {
             before(grammarAccess.getTerminal_RATE_ExprRule()); 
            pushFollow(FOLLOW_ruleTerminal_RATE_Expr_in_entryRuleTerminal_RATE_Expr901);
            ruleTerminal_RATE_Expr();

            state._fsp--;

             after(grammarAccess.getTerminal_RATE_ExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminal_RATE_Expr908); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerminal_RATE_Expr"


    // $ANTLR start "ruleTerminal_RATE_Expr"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:461:1: ruleTerminal_RATE_Expr : ( ( rule__Terminal_RATE_Expr__Alternatives ) ) ;
    public final void ruleTerminal_RATE_Expr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:465:2: ( ( ( rule__Terminal_RATE_Expr__Alternatives ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:466:1: ( ( rule__Terminal_RATE_Expr__Alternatives ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:466:1: ( ( rule__Terminal_RATE_Expr__Alternatives ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:467:1: ( rule__Terminal_RATE_Expr__Alternatives )
            {
             before(grammarAccess.getTerminal_RATE_ExprAccess().getAlternatives()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:468:1: ( rule__Terminal_RATE_Expr__Alternatives )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:468:2: rule__Terminal_RATE_Expr__Alternatives
            {
            pushFollow(FOLLOW_rule__Terminal_RATE_Expr__Alternatives_in_ruleTerminal_RATE_Expr934);
            rule__Terminal_RATE_Expr__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTerminal_RATE_ExprAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerminal_RATE_Expr"


    // $ANTLR start "entryRuleDist"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:480:1: entryRuleDist : ruleDist EOF ;
    public final void entryRuleDist() throws RecognitionException {
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:481:1: ( ruleDist EOF )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:482:1: ruleDist EOF
            {
             before(grammarAccess.getDistRule()); 
            pushFollow(FOLLOW_ruleDist_in_entryRuleDist961);
            ruleDist();

            state._fsp--;

             after(grammarAccess.getDistRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDist968); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDist"


    // $ANTLR start "ruleDist"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:489:1: ruleDist : ( ( rule__Dist__Group__0 ) ) ;
    public final void ruleDist() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:493:2: ( ( ( rule__Dist__Group__0 ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:494:1: ( ( rule__Dist__Group__0 ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:494:1: ( ( rule__Dist__Group__0 ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:495:1: ( rule__Dist__Group__0 )
            {
             before(grammarAccess.getDistAccess().getGroup()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:496:1: ( rule__Dist__Group__0 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:496:2: rule__Dist__Group__0
            {
            pushFollow(FOLLOW_rule__Dist__Group__0_in_ruleDist994);
            rule__Dist__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDistAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDist"


    // $ANTLR start "entryRuleAGENT_NUM"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:508:1: entryRuleAGENT_NUM : ruleAGENT_NUM EOF ;
    public final void entryRuleAGENT_NUM() throws RecognitionException {
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:509:1: ( ruleAGENT_NUM EOF )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:510:1: ruleAGENT_NUM EOF
            {
             before(grammarAccess.getAGENT_NUMRule()); 
            pushFollow(FOLLOW_ruleAGENT_NUM_in_entryRuleAGENT_NUM1021);
            ruleAGENT_NUM();

            state._fsp--;

             after(grammarAccess.getAGENT_NUMRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAGENT_NUM1028); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAGENT_NUM"


    // $ANTLR start "ruleAGENT_NUM"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:517:1: ruleAGENT_NUM : ( ( rule__AGENT_NUM__Group__0 ) ) ;
    public final void ruleAGENT_NUM() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:521:2: ( ( ( rule__AGENT_NUM__Group__0 ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:522:1: ( ( rule__AGENT_NUM__Group__0 ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:522:1: ( ( rule__AGENT_NUM__Group__0 ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:523:1: ( rule__AGENT_NUM__Group__0 )
            {
             before(grammarAccess.getAGENT_NUMAccess().getGroup()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:524:1: ( rule__AGENT_NUM__Group__0 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:524:2: rule__AGENT_NUM__Group__0
            {
            pushFollow(FOLLOW_rule__AGENT_NUM__Group__0_in_ruleAGENT_NUM1054);
            rule__AGENT_NUM__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAGENT_NUMAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAGENT_NUM"


    // $ANTLR start "entryRulePOPULATION"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:536:1: entryRulePOPULATION : rulePOPULATION EOF ;
    public final void entryRulePOPULATION() throws RecognitionException {
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:537:1: ( rulePOPULATION EOF )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:538:1: rulePOPULATION EOF
            {
             before(grammarAccess.getPOPULATIONRule()); 
            pushFollow(FOLLOW_rulePOPULATION_in_entryRulePOPULATION1081);
            rulePOPULATION();

            state._fsp--;

             after(grammarAccess.getPOPULATIONRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePOPULATION1088); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePOPULATION"


    // $ANTLR start "rulePOPULATION"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:545:1: rulePOPULATION : ( ( rule__POPULATION__Group__0 ) ) ;
    public final void rulePOPULATION() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:549:2: ( ( ( rule__POPULATION__Group__0 ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:550:1: ( ( rule__POPULATION__Group__0 ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:550:1: ( ( rule__POPULATION__Group__0 ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:551:1: ( rule__POPULATION__Group__0 )
            {
             before(grammarAccess.getPOPULATIONAccess().getGroup()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:552:1: ( rule__POPULATION__Group__0 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:552:2: rule__POPULATION__Group__0
            {
            pushFollow(FOLLOW_rule__POPULATION__Group__0_in_rulePOPULATION1114);
            rule__POPULATION__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPOPULATIONAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePOPULATION"


    // $ANTLR start "entryRuleAGENTS"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:564:1: entryRuleAGENTS : ruleAGENTS EOF ;
    public final void entryRuleAGENTS() throws RecognitionException {
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:565:1: ( ruleAGENTS EOF )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:566:1: ruleAGENTS EOF
            {
             before(grammarAccess.getAGENTSRule()); 
            pushFollow(FOLLOW_ruleAGENTS_in_entryRuleAGENTS1141);
            ruleAGENTS();

            state._fsp--;

             after(grammarAccess.getAGENTSRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAGENTS1148); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAGENTS"


    // $ANTLR start "ruleAGENTS"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:573:1: ruleAGENTS : ( ( rule__AGENTS__Group__0 ) ) ;
    public final void ruleAGENTS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:577:2: ( ( ( rule__AGENTS__Group__0 ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:578:1: ( ( rule__AGENTS__Group__0 ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:578:1: ( ( rule__AGENTS__Group__0 ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:579:1: ( rule__AGENTS__Group__0 )
            {
             before(grammarAccess.getAGENTSAccess().getGroup()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:580:1: ( rule__AGENTS__Group__0 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:580:2: rule__AGENTS__Group__0
            {
            pushFollow(FOLLOW_rule__AGENTS__Group__0_in_ruleAGENTS1174);
            rule__AGENTS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAGENTSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAGENTS"


    // $ANTLR start "entryRuleMATH_OP"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:592:1: entryRuleMATH_OP : ruleMATH_OP EOF ;
    public final void entryRuleMATH_OP() throws RecognitionException {
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:593:1: ( ruleMATH_OP EOF )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:594:1: ruleMATH_OP EOF
            {
             before(grammarAccess.getMATH_OPRule()); 
            pushFollow(FOLLOW_ruleMATH_OP_in_entryRuleMATH_OP1201);
            ruleMATH_OP();

            state._fsp--;

             after(grammarAccess.getMATH_OPRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMATH_OP1208); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMATH_OP"


    // $ANTLR start "ruleMATH_OP"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:601:1: ruleMATH_OP : ( ( rule__MATH_OP__Alternatives ) ) ;
    public final void ruleMATH_OP() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:605:2: ( ( ( rule__MATH_OP__Alternatives ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:606:1: ( ( rule__MATH_OP__Alternatives ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:606:1: ( ( rule__MATH_OP__Alternatives ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:607:1: ( rule__MATH_OP__Alternatives )
            {
             before(grammarAccess.getMATH_OPAccess().getAlternatives()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:608:1: ( rule__MATH_OP__Alternatives )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:608:2: rule__MATH_OP__Alternatives
            {
            pushFollow(FOLLOW_rule__MATH_OP__Alternatives_in_ruleMATH_OP1234);
            rule__MATH_OP__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMATH_OPAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMATH_OP"


    // $ANTLR start "entryRuleNUMBER"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:620:1: entryRuleNUMBER : ruleNUMBER EOF ;
    public final void entryRuleNUMBER() throws RecognitionException {
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:621:1: ( ruleNUMBER EOF )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:622:1: ruleNUMBER EOF
            {
             before(grammarAccess.getNUMBERRule()); 
            pushFollow(FOLLOW_ruleNUMBER_in_entryRuleNUMBER1261);
            ruleNUMBER();

            state._fsp--;

             after(grammarAccess.getNUMBERRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNUMBER1268); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNUMBER"


    // $ANTLR start "ruleNUMBER"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:629:1: ruleNUMBER : ( ( rule__NUMBER__Alternatives ) ) ;
    public final void ruleNUMBER() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:633:2: ( ( ( rule__NUMBER__Alternatives ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:634:1: ( ( rule__NUMBER__Alternatives ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:634:1: ( ( rule__NUMBER__Alternatives ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:635:1: ( rule__NUMBER__Alternatives )
            {
             before(grammarAccess.getNUMBERAccess().getAlternatives()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:636:1: ( rule__NUMBER__Alternatives )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:636:2: rule__NUMBER__Alternatives
            {
            pushFollow(FOLLOW_rule__NUMBER__Alternatives_in_ruleNUMBER1294);
            rule__NUMBER__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNUMBERAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNUMBER"


    // $ANTLR start "entryRuleLOC"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:648:1: entryRuleLOC : ruleLOC EOF ;
    public final void entryRuleLOC() throws RecognitionException {
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:649:1: ( ruleLOC EOF )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:650:1: ruleLOC EOF
            {
             before(grammarAccess.getLOCRule()); 
            pushFollow(FOLLOW_ruleLOC_in_entryRuleLOC1321);
            ruleLOC();

            state._fsp--;

             after(grammarAccess.getLOCRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLOC1328); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLOC"


    // $ANTLR start "ruleLOC"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:657:1: ruleLOC : ( ( rule__LOC__Group__0 ) ) ;
    public final void ruleLOC() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:661:2: ( ( ( rule__LOC__Group__0 ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:662:1: ( ( rule__LOC__Group__0 ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:662:1: ( ( rule__LOC__Group__0 ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:663:1: ( rule__LOC__Group__0 )
            {
             before(grammarAccess.getLOCAccess().getGroup()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:664:1: ( rule__LOC__Group__0 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:664:2: rule__LOC__Group__0
            {
            pushFollow(FOLLOW_rule__LOC__Group__0_in_ruleLOC1354);
            rule__LOC__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLOCAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLOC"


    // $ANTLR start "entryRuleAGENT"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:676:1: entryRuleAGENT : ruleAGENT EOF ;
    public final void entryRuleAGENT() throws RecognitionException {
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:677:1: ( ruleAGENT EOF )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:678:1: ruleAGENT EOF
            {
             before(grammarAccess.getAGENTRule()); 
            pushFollow(FOLLOW_ruleAGENT_in_entryRuleAGENT1381);
            ruleAGENT();

            state._fsp--;

             after(grammarAccess.getAGENTRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAGENT1388); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAGENT"


    // $ANTLR start "ruleAGENT"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:685:1: ruleAGENT : ( ( rule__AGENT__Group__0 ) ) ;
    public final void ruleAGENT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:689:2: ( ( ( rule__AGENT__Group__0 ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:690:1: ( ( rule__AGENT__Group__0 ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:690:1: ( ( rule__AGENT__Group__0 ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:691:1: ( rule__AGENT__Group__0 )
            {
             before(grammarAccess.getAGENTAccess().getGroup()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:692:1: ( rule__AGENT__Group__0 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:692:2: rule__AGENT__Group__0
            {
            pushFollow(FOLLOW_rule__AGENT__Group__0_in_ruleAGENT1414);
            rule__AGENT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAGENTAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAGENT"


    // $ANTLR start "entryRuleMATH_Expr"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:704:1: entryRuleMATH_Expr : ruleMATH_Expr EOF ;
    public final void entryRuleMATH_Expr() throws RecognitionException {
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:705:1: ( ruleMATH_Expr EOF )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:706:1: ruleMATH_Expr EOF
            {
             before(grammarAccess.getMATH_ExprRule()); 
            pushFollow(FOLLOW_ruleMATH_Expr_in_entryRuleMATH_Expr1441);
            ruleMATH_Expr();

            state._fsp--;

             after(grammarAccess.getMATH_ExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMATH_Expr1448); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMATH_Expr"


    // $ANTLR start "ruleMATH_Expr"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:713:1: ruleMATH_Expr : ( ( rule__MATH_Expr__Group__0 ) ) ;
    public final void ruleMATH_Expr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:717:2: ( ( ( rule__MATH_Expr__Group__0 ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:718:1: ( ( rule__MATH_Expr__Group__0 ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:718:1: ( ( rule__MATH_Expr__Group__0 ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:719:1: ( rule__MATH_Expr__Group__0 )
            {
             before(grammarAccess.getMATH_ExprAccess().getGroup()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:720:1: ( rule__MATH_Expr__Group__0 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:720:2: rule__MATH_Expr__Group__0
            {
            pushFollow(FOLLOW_rule__MATH_Expr__Group__0_in_ruleMATH_Expr1474);
            rule__MATH_Expr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMATH_ExprAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMATH_Expr"


    // $ANTLR start "entryRuleTerminal_Math_Expr"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:732:1: entryRuleTerminal_Math_Expr : ruleTerminal_Math_Expr EOF ;
    public final void entryRuleTerminal_Math_Expr() throws RecognitionException {
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:733:1: ( ruleTerminal_Math_Expr EOF )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:734:1: ruleTerminal_Math_Expr EOF
            {
             before(grammarAccess.getTerminal_Math_ExprRule()); 
            pushFollow(FOLLOW_ruleTerminal_Math_Expr_in_entryRuleTerminal_Math_Expr1501);
            ruleTerminal_Math_Expr();

            state._fsp--;

             after(grammarAccess.getTerminal_Math_ExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminal_Math_Expr1508); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerminal_Math_Expr"


    // $ANTLR start "ruleTerminal_Math_Expr"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:741:1: ruleTerminal_Math_Expr : ( ( rule__Terminal_Math_Expr__Alternatives ) ) ;
    public final void ruleTerminal_Math_Expr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:745:2: ( ( ( rule__Terminal_Math_Expr__Alternatives ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:746:1: ( ( rule__Terminal_Math_Expr__Alternatives ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:746:1: ( ( rule__Terminal_Math_Expr__Alternatives ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:747:1: ( rule__Terminal_Math_Expr__Alternatives )
            {
             before(grammarAccess.getTerminal_Math_ExprAccess().getAlternatives()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:748:1: ( rule__Terminal_Math_Expr__Alternatives )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:748:2: rule__Terminal_Math_Expr__Alternatives
            {
            pushFollow(FOLLOW_rule__Terminal_Math_Expr__Alternatives_in_ruleTerminal_Math_Expr1534);
            rule__Terminal_Math_Expr__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTerminal_Math_ExprAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerminal_Math_Expr"


    // $ANTLR start "rule__ACTION__Alternatives"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:760:1: rule__ACTION__Alternatives : ( ( ruleACT_SpNoMsg ) | ( ruleACT_SpBr ) | ( ruleACT_SpUni ) | ( ruleACT_InBr ) | ( ruleACT_InUni ) );
    public final void rule__ACTION__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:764:1: ( ( ruleACT_SpNoMsg ) | ( ruleACT_SpBr ) | ( ruleACT_SpUni ) | ( ruleACT_InBr ) | ( ruleACT_InUni ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt1=1;
                }
                break;
            case 35:
                {
                alt1=2;
                }
                break;
            case 40:
                {
                alt1=3;
                }
                break;
            case 41:
                {
                alt1=4;
                }
                break;
            case 43:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:765:1: ( ruleACT_SpNoMsg )
                    {
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:765:1: ( ruleACT_SpNoMsg )
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:766:1: ruleACT_SpNoMsg
                    {
                     before(grammarAccess.getACTIONAccess().getACT_SpNoMsgParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleACT_SpNoMsg_in_rule__ACTION__Alternatives1570);
                    ruleACT_SpNoMsg();

                    state._fsp--;

                     after(grammarAccess.getACTIONAccess().getACT_SpNoMsgParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:771:6: ( ruleACT_SpBr )
                    {
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:771:6: ( ruleACT_SpBr )
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:772:1: ruleACT_SpBr
                    {
                     before(grammarAccess.getACTIONAccess().getACT_SpBrParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleACT_SpBr_in_rule__ACTION__Alternatives1587);
                    ruleACT_SpBr();

                    state._fsp--;

                     after(grammarAccess.getACTIONAccess().getACT_SpBrParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:777:6: ( ruleACT_SpUni )
                    {
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:777:6: ( ruleACT_SpUni )
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:778:1: ruleACT_SpUni
                    {
                     before(grammarAccess.getACTIONAccess().getACT_SpUniParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleACT_SpUni_in_rule__ACTION__Alternatives1604);
                    ruleACT_SpUni();

                    state._fsp--;

                     after(grammarAccess.getACTIONAccess().getACT_SpUniParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:783:6: ( ruleACT_InBr )
                    {
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:783:6: ( ruleACT_InBr )
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:784:1: ruleACT_InBr
                    {
                     before(grammarAccess.getACTIONAccess().getACT_InBrParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleACT_InBr_in_rule__ACTION__Alternatives1621);
                    ruleACT_InBr();

                    state._fsp--;

                     after(grammarAccess.getACTIONAccess().getACT_InBrParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:789:6: ( ruleACT_InUni )
                    {
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:789:6: ( ruleACT_InUni )
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:790:1: ruleACT_InUni
                    {
                     before(grammarAccess.getACTIONAccess().getACT_InUniParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleACT_InUni_in_rule__ACTION__Alternatives1638);
                    ruleACT_InUni();

                    state._fsp--;

                     after(grammarAccess.getACTIONAccess().getACT_InUniParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACTION__Alternatives"


    // $ANTLR start "rule__IRange__Alternatives"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:800:1: rule__IRange__Alternatives : ( ( 'local' ) | ( 'all' ) | ( ( rule__IRange__Group_2__0 ) ) | ( ( rule__IRange__Group_3__0 ) ) );
    public final void rule__IRange__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:804:1: ( ( 'local' ) | ( 'all' ) | ( ( rule__IRange__Group_2__0 ) ) | ( ( rule__IRange__Group_3__0 ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 45:
                {
                alt2=3;
                }
                break;
            case 31:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:805:1: ( 'local' )
                    {
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:805:1: ( 'local' )
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:806:1: 'local'
                    {
                     before(grammarAccess.getIRangeAccess().getLocalKeyword_0()); 
                    match(input,14,FOLLOW_14_in_rule__IRange__Alternatives1671); 
                     after(grammarAccess.getIRangeAccess().getLocalKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:813:6: ( 'all' )
                    {
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:813:6: ( 'all' )
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:814:1: 'all'
                    {
                     before(grammarAccess.getIRangeAccess().getAllKeyword_1()); 
                    match(input,15,FOLLOW_15_in_rule__IRange__Alternatives1691); 
                     after(grammarAccess.getIRangeAccess().getAllKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:821:6: ( ( rule__IRange__Group_2__0 ) )
                    {
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:821:6: ( ( rule__IRange__Group_2__0 ) )
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:822:1: ( rule__IRange__Group_2__0 )
                    {
                     before(grammarAccess.getIRangeAccess().getGroup_2()); 
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:823:1: ( rule__IRange__Group_2__0 )
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:823:2: rule__IRange__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__IRange__Group_2__0_in_rule__IRange__Alternatives1710);
                    rule__IRange__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIRangeAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:827:6: ( ( rule__IRange__Group_3__0 ) )
                    {
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:827:6: ( ( rule__IRange__Group_3__0 ) )
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:828:1: ( rule__IRange__Group_3__0 )
                    {
                     before(grammarAccess.getIRangeAccess().getGroup_3()); 
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:829:1: ( rule__IRange__Group_3__0 )
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:829:2: rule__IRange__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__IRange__Group_3__0_in_rule__IRange__Alternatives1728);
                    rule__IRange__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIRangeAccess().getGroup_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IRange__Alternatives"


    // $ANTLR start "rule__Terminal_PR_Expr__Alternatives"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:838:1: rule__Terminal_PR_Expr__Alternatives : ( ( ( rule__Terminal_PR_Expr__Group_0__0 ) ) | ( ( rule__Terminal_PR_Expr__Alternatives_1 ) ) );
    public final void rule__Terminal_PR_Expr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:842:1: ( ( ( rule__Terminal_PR_Expr__Group_0__0 ) ) | ( ( rule__Terminal_PR_Expr__Alternatives_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==31) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=RULE_INT && LA3_0<=RULE_ID)||(LA3_0>=46 && LA3_0<=47)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:843:1: ( ( rule__Terminal_PR_Expr__Group_0__0 ) )
                    {
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:843:1: ( ( rule__Terminal_PR_Expr__Group_0__0 ) )
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:844:1: ( rule__Terminal_PR_Expr__Group_0__0 )
                    {
                     before(grammarAccess.getTerminal_PR_ExprAccess().getGroup_0()); 
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:845:1: ( rule__Terminal_PR_Expr__Group_0__0 )
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:845:2: rule__Terminal_PR_Expr__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Terminal_PR_Expr__Group_0__0_in_rule__Terminal_PR_Expr__Alternatives1761);
                    rule__Terminal_PR_Expr__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminal_PR_ExprAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:849:6: ( ( rule__Terminal_PR_Expr__Alternatives_1 ) )
                    {
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:849:6: ( ( rule__Terminal_PR_Expr__Alternatives_1 ) )
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:850:1: ( rule__Terminal_PR_Expr__Alternatives_1 )
                    {
                     before(grammarAccess.getTerminal_PR_ExprAccess().getAlternatives_1()); 
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:851:1: ( rule__Terminal_PR_Expr__Alternatives_1 )
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:851:2: rule__Terminal_PR_Expr__Alternatives_1
                    {
                    pushFollow(FOLLOW_rule__Terminal_PR_Expr__Alternatives_1_in_rule__Terminal_PR_Expr__Alternatives1779);
                    rule__Terminal_PR_Expr__Alternatives_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminal_PR_ExprAccess().getAlternatives_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal_PR_Expr__Alternatives"


    // $ANTLR start "rule__Terminal_PR_Expr__Alternatives_1"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:860:1: rule__Terminal_PR_Expr__Alternatives_1 : ( ( ruleNUMBER ) | ( ( rule__Terminal_PR_Expr__LinkedParamAssignment_1_1 ) ) | ( ruleDist ) | ( ruleAGENT_NUM ) );
    public final void rule__Terminal_PR_Expr__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:864:1: ( ( ruleNUMBER ) | ( ( rule__Terminal_PR_Expr__LinkedParamAssignment_1_1 ) ) | ( ruleDist ) | ( ruleAGENT_NUM ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_DOUBLE:
            case RULE_DOUBLE_SCIENTIFIC:
                {
                alt4=1;
                }
                break;
            case RULE_ID:
                {
                alt4=2;
                }
                break;
            case 46:
                {
                alt4=3;
                }
                break;
            case 47:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:865:1: ( ruleNUMBER )
                    {
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:865:1: ( ruleNUMBER )
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:866:1: ruleNUMBER
                    {
                     before(grammarAccess.getTerminal_PR_ExprAccess().getNUMBERParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_ruleNUMBER_in_rule__Terminal_PR_Expr__Alternatives_11812);
                    ruleNUMBER();

                    state._fsp--;

                     after(grammarAccess.getTerminal_PR_ExprAccess().getNUMBERParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:871:6: ( ( rule__Terminal_PR_Expr__LinkedParamAssignment_1_1 ) )
                    {
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:871:6: ( ( rule__Terminal_PR_Expr__LinkedParamAssignment_1_1 ) )
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:872:1: ( rule__Terminal_PR_Expr__LinkedParamAssignment_1_1 )
                    {
                     before(grammarAccess.getTerminal_PR_ExprAccess().getLinkedParamAssignment_1_1()); 
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:873:1: ( rule__Terminal_PR_Expr__LinkedParamAssignment_1_1 )
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:873:2: rule__Terminal_PR_Expr__LinkedParamAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__Terminal_PR_Expr__LinkedParamAssignment_1_1_in_rule__Terminal_PR_Expr__Alternatives_11829);
                    rule__Terminal_PR_Expr__LinkedParamAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminal_PR_ExprAccess().getLinkedParamAssignment_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:877:6: ( ruleDist )
                    {
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:877:6: ( ruleDist )
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:878:1: ruleDist
                    {
                     before(grammarAccess.getTerminal_PR_ExprAccess().getDistParserRuleCall_1_2()); 
                    pushFollow(FOLLOW_ruleDist_in_rule__Terminal_PR_Expr__Alternatives_11847);
                    ruleDist();

                    state._fsp--;

                     after(grammarAccess.getTerminal_PR_ExprAccess().getDistParserRuleCall_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:883:6: ( ruleAGENT_NUM )
                    {
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:883:6: ( ruleAGENT_NUM )
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:884:1: ruleAGENT_NUM
                    {
                     before(grammarAccess.getTerminal_PR_ExprAccess().getAGENT_NUMParserRuleCall_1_3()); 
                    pushFollow(FOLLOW_ruleAGENT_NUM_in_rule__Terminal_PR_Expr__Alternatives_11864);
                    ruleAGENT_NUM();

                    state._fsp--;

                     after(grammarAccess.getTerminal_PR_ExprAccess().getAGENT_NUMParserRuleCall_1_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal_PR_Expr__Alternatives_1"


    // $ANTLR start "rule__Terminal_RATE_Expr__Alternatives"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:894:1: rule__Terminal_RATE_Expr__Alternatives : ( ( ( rule__Terminal_RATE_Expr__Group_0__0 ) ) | ( ( rule__Terminal_RATE_Expr__Alternatives_1 ) ) );
    public final void rule__Terminal_RATE_Expr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:898:1: ( ( ( rule__Terminal_RATE_Expr__Group_0__0 ) ) | ( ( rule__Terminal_RATE_Expr__Alternatives_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==31) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=RULE_INT && LA5_0<=RULE_ID)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:899:1: ( ( rule__Terminal_RATE_Expr__Group_0__0 ) )
                    {
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:899:1: ( ( rule__Terminal_RATE_Expr__Group_0__0 ) )
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:900:1: ( rule__Terminal_RATE_Expr__Group_0__0 )
                    {
                     before(grammarAccess.getTerminal_RATE_ExprAccess().getGroup_0()); 
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:901:1: ( rule__Terminal_RATE_Expr__Group_0__0 )
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:901:2: rule__Terminal_RATE_Expr__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Terminal_RATE_Expr__Group_0__0_in_rule__Terminal_RATE_Expr__Alternatives1896);
                    rule__Terminal_RATE_Expr__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminal_RATE_ExprAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:905:6: ( ( rule__Terminal_RATE_Expr__Alternatives_1 ) )
                    {
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:905:6: ( ( rule__Terminal_RATE_Expr__Alternatives_1 ) )
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:906:1: ( rule__Terminal_RATE_Expr__Alternatives_1 )
                    {
                     before(grammarAccess.getTerminal_RATE_ExprAccess().getAlternatives_1()); 
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:907:1: ( rule__Terminal_RATE_Expr__Alternatives_1 )
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:907:2: rule__Terminal_RATE_Expr__Alternatives_1
                    {
                    pushFollow(FOLLOW_rule__Terminal_RATE_Expr__Alternatives_1_in_rule__Terminal_RATE_Expr__Alternatives1914);
                    rule__Terminal_RATE_Expr__Alternatives_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminal_RATE_ExprAccess().getAlternatives_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal_RATE_Expr__Alternatives"


    // $ANTLR start "rule__Terminal_RATE_Expr__Alternatives_1"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:916:1: rule__Terminal_RATE_Expr__Alternatives_1 : ( ( ruleNUMBER ) | ( ( rule__Terminal_RATE_Expr__LinkedParamAssignment_1_1 ) ) );
    public final void rule__Terminal_RATE_Expr__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:920:1: ( ( ruleNUMBER ) | ( ( rule__Terminal_RATE_Expr__LinkedParamAssignment_1_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_INT && LA6_0<=RULE_DOUBLE_SCIENTIFIC)) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:921:1: ( ruleNUMBER )
                    {
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:921:1: ( ruleNUMBER )
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:922:1: ruleNUMBER
                    {
                     before(grammarAccess.getTerminal_RATE_ExprAccess().getNUMBERParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_ruleNUMBER_in_rule__Terminal_RATE_Expr__Alternatives_11947);
                    ruleNUMBER();

                    state._fsp--;

                     after(grammarAccess.getTerminal_RATE_ExprAccess().getNUMBERParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:927:6: ( ( rule__Terminal_RATE_Expr__LinkedParamAssignment_1_1 ) )
                    {
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:927:6: ( ( rule__Terminal_RATE_Expr__LinkedParamAssignment_1_1 ) )
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:928:1: ( rule__Terminal_RATE_Expr__LinkedParamAssignment_1_1 )
                    {
                     before(grammarAccess.getTerminal_RATE_ExprAccess().getLinkedParamAssignment_1_1()); 
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:929:1: ( rule__Terminal_RATE_Expr__LinkedParamAssignment_1_1 )
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:929:2: rule__Terminal_RATE_Expr__LinkedParamAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__Terminal_RATE_Expr__LinkedParamAssignment_1_1_in_rule__Terminal_RATE_Expr__Alternatives_11964);
                    rule__Terminal_RATE_Expr__LinkedParamAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminal_RATE_ExprAccess().getLinkedParamAssignment_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal_RATE_Expr__Alternatives_1"


    // $ANTLR start "rule__Dist__Alternatives_2"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:938:1: rule__Dist__Alternatives_2 : ( ( 'loc_s' ) | ( 'loc_r' ) | ( ruleLOC ) );
    public final void rule__Dist__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:942:1: ( ( 'loc_s' ) | ( 'loc_r' ) | ( ruleLOC ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt7=1;
                }
                break;
            case 17:
                {
                alt7=2;
                }
                break;
            case 31:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:943:1: ( 'loc_s' )
                    {
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:943:1: ( 'loc_s' )
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:944:1: 'loc_s'
                    {
                     before(grammarAccess.getDistAccess().getLoc_sKeyword_2_0()); 
                    match(input,16,FOLLOW_16_in_rule__Dist__Alternatives_21998); 
                     after(grammarAccess.getDistAccess().getLoc_sKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:951:6: ( 'loc_r' )
                    {
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:951:6: ( 'loc_r' )
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:952:1: 'loc_r'
                    {
                     before(grammarAccess.getDistAccess().getLoc_rKeyword_2_1()); 
                    match(input,17,FOLLOW_17_in_rule__Dist__Alternatives_22018); 
                     after(grammarAccess.getDistAccess().getLoc_rKeyword_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:959:6: ( ruleLOC )
                    {
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:959:6: ( ruleLOC )
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:960:1: ruleLOC
                    {
                     before(grammarAccess.getDistAccess().getLOCParserRuleCall_2_2()); 
                    pushFollow(FOLLOW_ruleLOC_in_rule__Dist__Alternatives_22037);
                    ruleLOC();

                    state._fsp--;

                     after(grammarAccess.getDistAccess().getLOCParserRuleCall_2_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dist__Alternatives_2"


    // $ANTLR start "rule__Dist__Alternatives_4"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:970:1: rule__Dist__Alternatives_4 : ( ( 'loc_s' ) | ( 'loc_r' ) | ( ruleLOC ) );
    public final void rule__Dist__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:974:1: ( ( 'loc_s' ) | ( 'loc_r' ) | ( ruleLOC ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt8=1;
                }
                break;
            case 17:
                {
                alt8=2;
                }
                break;
            case 31:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:975:1: ( 'loc_s' )
                    {
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:975:1: ( 'loc_s' )
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:976:1: 'loc_s'
                    {
                     before(grammarAccess.getDistAccess().getLoc_sKeyword_4_0()); 
                    match(input,16,FOLLOW_16_in_rule__Dist__Alternatives_42070); 
                     after(grammarAccess.getDistAccess().getLoc_sKeyword_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:983:6: ( 'loc_r' )
                    {
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:983:6: ( 'loc_r' )
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:984:1: 'loc_r'
                    {
                     before(grammarAccess.getDistAccess().getLoc_rKeyword_4_1()); 
                    match(input,17,FOLLOW_17_in_rule__Dist__Alternatives_42090); 
                     after(grammarAccess.getDistAccess().getLoc_rKeyword_4_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:991:6: ( ruleLOC )
                    {
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:991:6: ( ruleLOC )
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:992:1: ruleLOC
                    {
                     before(grammarAccess.getDistAccess().getLOCParserRuleCall_4_2()); 
                    pushFollow(FOLLOW_ruleLOC_in_rule__Dist__Alternatives_42109);
                    ruleLOC();

                    state._fsp--;

                     after(grammarAccess.getDistAccess().getLOCParserRuleCall_4_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dist__Alternatives_4"


    // $ANTLR start "rule__MATH_OP__Alternatives"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1002:1: rule__MATH_OP__Alternatives : ( ( '^' ) | ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '%' ) );
    public final void rule__MATH_OP__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1006:1: ( ( '^' ) | ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '%' ) )
            int alt9=6;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt9=1;
                }
                break;
            case 19:
                {
                alt9=2;
                }
                break;
            case 20:
                {
                alt9=3;
                }
                break;
            case 21:
                {
                alt9=4;
                }
                break;
            case 22:
                {
                alt9=5;
                }
                break;
            case 23:
                {
                alt9=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1007:1: ( '^' )
                    {
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1007:1: ( '^' )
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1008:1: '^'
                    {
                     before(grammarAccess.getMATH_OPAccess().getCircumflexAccentKeyword_0()); 
                    match(input,18,FOLLOW_18_in_rule__MATH_OP__Alternatives2142); 
                     after(grammarAccess.getMATH_OPAccess().getCircumflexAccentKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1015:6: ( '+' )
                    {
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1015:6: ( '+' )
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1016:1: '+'
                    {
                     before(grammarAccess.getMATH_OPAccess().getPlusSignKeyword_1()); 
                    match(input,19,FOLLOW_19_in_rule__MATH_OP__Alternatives2162); 
                     after(grammarAccess.getMATH_OPAccess().getPlusSignKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1023:6: ( '-' )
                    {
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1023:6: ( '-' )
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1024:1: '-'
                    {
                     before(grammarAccess.getMATH_OPAccess().getHyphenMinusKeyword_2()); 
                    match(input,20,FOLLOW_20_in_rule__MATH_OP__Alternatives2182); 
                     after(grammarAccess.getMATH_OPAccess().getHyphenMinusKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1031:6: ( '*' )
                    {
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1031:6: ( '*' )
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1032:1: '*'
                    {
                     before(grammarAccess.getMATH_OPAccess().getAsteriskKeyword_3()); 
                    match(input,21,FOLLOW_21_in_rule__MATH_OP__Alternatives2202); 
                     after(grammarAccess.getMATH_OPAccess().getAsteriskKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1039:6: ( '/' )
                    {
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1039:6: ( '/' )
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1040:1: '/'
                    {
                     before(grammarAccess.getMATH_OPAccess().getSolidusKeyword_4()); 
                    match(input,22,FOLLOW_22_in_rule__MATH_OP__Alternatives2222); 
                     after(grammarAccess.getMATH_OPAccess().getSolidusKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1047:6: ( '%' )
                    {
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1047:6: ( '%' )
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1048:1: '%'
                    {
                     before(grammarAccess.getMATH_OPAccess().getPercentSignKeyword_5()); 
                    match(input,23,FOLLOW_23_in_rule__MATH_OP__Alternatives2242); 
                     after(grammarAccess.getMATH_OPAccess().getPercentSignKeyword_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MATH_OP__Alternatives"


    // $ANTLR start "rule__NUMBER__Alternatives"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1060:1: rule__NUMBER__Alternatives : ( ( RULE_INT ) | ( RULE_DOUBLE ) | ( RULE_DOUBLE_SCIENTIFIC ) );
    public final void rule__NUMBER__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1064:1: ( ( RULE_INT ) | ( RULE_DOUBLE ) | ( RULE_DOUBLE_SCIENTIFIC ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt10=1;
                }
                break;
            case RULE_DOUBLE:
                {
                alt10=2;
                }
                break;
            case RULE_DOUBLE_SCIENTIFIC:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1065:1: ( RULE_INT )
                    {
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1065:1: ( RULE_INT )
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1066:1: RULE_INT
                    {
                     before(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__NUMBER__Alternatives2276); 
                     after(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1071:6: ( RULE_DOUBLE )
                    {
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1071:6: ( RULE_DOUBLE )
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1072:1: RULE_DOUBLE
                    {
                     before(grammarAccess.getNUMBERAccess().getDOUBLETerminalRuleCall_1()); 
                    match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__NUMBER__Alternatives2293); 
                     after(grammarAccess.getNUMBERAccess().getDOUBLETerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1077:6: ( RULE_DOUBLE_SCIENTIFIC )
                    {
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1077:6: ( RULE_DOUBLE_SCIENTIFIC )
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1078:1: RULE_DOUBLE_SCIENTIFIC
                    {
                     before(grammarAccess.getNUMBERAccess().getDOUBLE_SCIENTIFICTerminalRuleCall_2()); 
                    match(input,RULE_DOUBLE_SCIENTIFIC,FOLLOW_RULE_DOUBLE_SCIENTIFIC_in_rule__NUMBER__Alternatives2310); 
                     after(grammarAccess.getNUMBERAccess().getDOUBLE_SCIENTIFICTerminalRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Alternatives"


    // $ANTLR start "rule__Terminal_Math_Expr__Alternatives"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1088:1: rule__Terminal_Math_Expr__Alternatives : ( ( ( rule__Terminal_Math_Expr__Group_0__0 ) ) | ( ruleNUMBER ) );
    public final void rule__Terminal_Math_Expr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1092:1: ( ( ( rule__Terminal_Math_Expr__Group_0__0 ) ) | ( ruleNUMBER ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=RULE_INT && LA11_0<=RULE_DOUBLE_SCIENTIFIC)) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1093:1: ( ( rule__Terminal_Math_Expr__Group_0__0 ) )
                    {
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1093:1: ( ( rule__Terminal_Math_Expr__Group_0__0 ) )
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1094:1: ( rule__Terminal_Math_Expr__Group_0__0 )
                    {
                     before(grammarAccess.getTerminal_Math_ExprAccess().getGroup_0()); 
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1095:1: ( rule__Terminal_Math_Expr__Group_0__0 )
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1095:2: rule__Terminal_Math_Expr__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Terminal_Math_Expr__Group_0__0_in_rule__Terminal_Math_Expr__Alternatives2342);
                    rule__Terminal_Math_Expr__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminal_Math_ExprAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1099:6: ( ruleNUMBER )
                    {
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1099:6: ( ruleNUMBER )
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1100:1: ruleNUMBER
                    {
                     before(grammarAccess.getTerminal_Math_ExprAccess().getNUMBERParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleNUMBER_in_rule__Terminal_Math_Expr__Alternatives2360);
                    ruleNUMBER();

                    state._fsp--;

                     after(grammarAccess.getTerminal_Math_ExprAccess().getNUMBERParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal_Math_Expr__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1112:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1116:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1117:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02390);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02393);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1124:1: rule__Model__Group__0__Impl : ( '#params' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1128:1: ( ( '#params' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1129:1: ( '#params' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1129:1: ( '#params' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1130:1: '#params'
            {
             before(grammarAccess.getModelAccess().getParamsKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Model__Group__0__Impl2421); 
             after(grammarAccess.getModelAccess().getParamsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1143:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1147:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1148:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12452);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12455);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1155:1: rule__Model__Group__1__Impl : ( ( rule__Model__ParamsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1159:1: ( ( ( rule__Model__ParamsAssignment_1 )* ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1160:1: ( ( rule__Model__ParamsAssignment_1 )* )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1160:1: ( ( rule__Model__ParamsAssignment_1 )* )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1161:1: ( rule__Model__ParamsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getParamsAssignment_1()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1162:1: ( rule__Model__ParamsAssignment_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1162:2: rule__Model__ParamsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__ParamsAssignment_1_in_rule__Model__Group__1__Impl2482);
            	    rule__Model__ParamsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getParamsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1172:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1176:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1177:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__22513);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__22516);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1184:1: rule__Model__Group__2__Impl : ( '#states' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1188:1: ( ( '#states' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1189:1: ( '#states' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1189:1: ( '#states' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1190:1: '#states'
            {
             before(grammarAccess.getModelAccess().getStatesKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__Model__Group__2__Impl2544); 
             after(grammarAccess.getModelAccess().getStatesKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1203:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1207:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1208:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__32575);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__32578);
            rule__Model__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1215:1: rule__Model__Group__3__Impl : ( ( ( rule__Model__StatesAssignment_3 ) ) ( ( rule__Model__StatesAssignment_3 )* ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1219:1: ( ( ( ( rule__Model__StatesAssignment_3 ) ) ( ( rule__Model__StatesAssignment_3 )* ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1220:1: ( ( ( rule__Model__StatesAssignment_3 ) ) ( ( rule__Model__StatesAssignment_3 )* ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1220:1: ( ( ( rule__Model__StatesAssignment_3 ) ) ( ( rule__Model__StatesAssignment_3 )* ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1221:1: ( ( rule__Model__StatesAssignment_3 ) ) ( ( rule__Model__StatesAssignment_3 )* )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1221:1: ( ( rule__Model__StatesAssignment_3 ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1222:1: ( rule__Model__StatesAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getStatesAssignment_3()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1223:1: ( rule__Model__StatesAssignment_3 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1223:2: rule__Model__StatesAssignment_3
            {
            pushFollow(FOLLOW_rule__Model__StatesAssignment_3_in_rule__Model__Group__3__Impl2607);
            rule__Model__StatesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getStatesAssignment_3()); 

            }

            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1226:1: ( ( rule__Model__StatesAssignment_3 )* )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1227:1: ( rule__Model__StatesAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getStatesAssignment_3()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1228:1: ( rule__Model__StatesAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1228:2: rule__Model__StatesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Model__StatesAssignment_3_in_rule__Model__Group__3__Impl2619);
            	    rule__Model__StatesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getStatesAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1239:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1243:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1244:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__42652);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__5_in_rule__Model__Group__42655);
            rule__Model__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1251:1: rule__Model__Group__4__Impl : ( '#agents' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1255:1: ( ( '#agents' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1256:1: ( '#agents' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1256:1: ( '#agents' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1257:1: '#agents'
            {
             before(grammarAccess.getModelAccess().getAgentsKeyword_4()); 
            match(input,26,FOLLOW_26_in_rule__Model__Group__4__Impl2683); 
             after(grammarAccess.getModelAccess().getAgentsKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1270:1: rule__Model__Group__5 : rule__Model__Group__5__Impl ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1274:1: ( rule__Model__Group__5__Impl )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1275:2: rule__Model__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__52714);
            rule__Model__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1281:1: rule__Model__Group__5__Impl : ( ( rule__Model__PopulationAssignment_5 ) ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1285:1: ( ( ( rule__Model__PopulationAssignment_5 ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1286:1: ( ( rule__Model__PopulationAssignment_5 ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1286:1: ( ( rule__Model__PopulationAssignment_5 ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1287:1: ( rule__Model__PopulationAssignment_5 )
            {
             before(grammarAccess.getModelAccess().getPopulationAssignment_5()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1288:1: ( rule__Model__PopulationAssignment_5 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1288:2: rule__Model__PopulationAssignment_5
            {
            pushFollow(FOLLOW_rule__Model__PopulationAssignment_5_in_rule__Model__Group__5__Impl2741);
            rule__Model__PopulationAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getPopulationAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__Param__Group__0"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1310:1: rule__Param__Group__0 : rule__Param__Group__0__Impl rule__Param__Group__1 ;
    public final void rule__Param__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1314:1: ( rule__Param__Group__0__Impl rule__Param__Group__1 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1315:2: rule__Param__Group__0__Impl rule__Param__Group__1
            {
            pushFollow(FOLLOW_rule__Param__Group__0__Impl_in_rule__Param__Group__02783);
            rule__Param__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Param__Group__1_in_rule__Param__Group__02786);
            rule__Param__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Param__Group__0"


    // $ANTLR start "rule__Param__Group__0__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1322:1: rule__Param__Group__0__Impl : ( 'param' ) ;
    public final void rule__Param__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1326:1: ( ( 'param' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1327:1: ( 'param' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1327:1: ( 'param' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1328:1: 'param'
            {
             before(grammarAccess.getParamAccess().getParamKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__Param__Group__0__Impl2814); 
             after(grammarAccess.getParamAccess().getParamKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Param__Group__0__Impl"


    // $ANTLR start "rule__Param__Group__1"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1341:1: rule__Param__Group__1 : rule__Param__Group__1__Impl rule__Param__Group__2 ;
    public final void rule__Param__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1345:1: ( rule__Param__Group__1__Impl rule__Param__Group__2 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1346:2: rule__Param__Group__1__Impl rule__Param__Group__2
            {
            pushFollow(FOLLOW_rule__Param__Group__1__Impl_in_rule__Param__Group__12845);
            rule__Param__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Param__Group__2_in_rule__Param__Group__12848);
            rule__Param__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Param__Group__1"


    // $ANTLR start "rule__Param__Group__1__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1353:1: rule__Param__Group__1__Impl : ( ( rule__Param__NameAssignment_1 ) ) ;
    public final void rule__Param__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1357:1: ( ( ( rule__Param__NameAssignment_1 ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1358:1: ( ( rule__Param__NameAssignment_1 ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1358:1: ( ( rule__Param__NameAssignment_1 ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1359:1: ( rule__Param__NameAssignment_1 )
            {
             before(grammarAccess.getParamAccess().getNameAssignment_1()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1360:1: ( rule__Param__NameAssignment_1 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1360:2: rule__Param__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Param__NameAssignment_1_in_rule__Param__Group__1__Impl2875);
            rule__Param__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParamAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Param__Group__1__Impl"


    // $ANTLR start "rule__Param__Group__2"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1370:1: rule__Param__Group__2 : rule__Param__Group__2__Impl rule__Param__Group__3 ;
    public final void rule__Param__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1374:1: ( rule__Param__Group__2__Impl rule__Param__Group__3 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1375:2: rule__Param__Group__2__Impl rule__Param__Group__3
            {
            pushFollow(FOLLOW_rule__Param__Group__2__Impl_in_rule__Param__Group__22905);
            rule__Param__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Param__Group__3_in_rule__Param__Group__22908);
            rule__Param__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Param__Group__2"


    // $ANTLR start "rule__Param__Group__2__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1382:1: rule__Param__Group__2__Impl : ( '=' ) ;
    public final void rule__Param__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1386:1: ( ( '=' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1387:1: ( '=' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1387:1: ( '=' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1388:1: '='
            {
             before(grammarAccess.getParamAccess().getEqualsSignKeyword_2()); 
            match(input,28,FOLLOW_28_in_rule__Param__Group__2__Impl2936); 
             after(grammarAccess.getParamAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Param__Group__2__Impl"


    // $ANTLR start "rule__Param__Group__3"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1401:1: rule__Param__Group__3 : rule__Param__Group__3__Impl rule__Param__Group__4 ;
    public final void rule__Param__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1405:1: ( rule__Param__Group__3__Impl rule__Param__Group__4 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1406:2: rule__Param__Group__3__Impl rule__Param__Group__4
            {
            pushFollow(FOLLOW_rule__Param__Group__3__Impl_in_rule__Param__Group__32967);
            rule__Param__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Param__Group__4_in_rule__Param__Group__32970);
            rule__Param__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Param__Group__3"


    // $ANTLR start "rule__Param__Group__3__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1413:1: rule__Param__Group__3__Impl : ( ( rule__Param__ValueAssignment_3 ) ) ;
    public final void rule__Param__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1417:1: ( ( ( rule__Param__ValueAssignment_3 ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1418:1: ( ( rule__Param__ValueAssignment_3 ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1418:1: ( ( rule__Param__ValueAssignment_3 ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1419:1: ( rule__Param__ValueAssignment_3 )
            {
             before(grammarAccess.getParamAccess().getValueAssignment_3()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1420:1: ( rule__Param__ValueAssignment_3 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1420:2: rule__Param__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__Param__ValueAssignment_3_in_rule__Param__Group__3__Impl2997);
            rule__Param__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getParamAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Param__Group__3__Impl"


    // $ANTLR start "rule__Param__Group__4"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1430:1: rule__Param__Group__4 : rule__Param__Group__4__Impl ;
    public final void rule__Param__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1434:1: ( rule__Param__Group__4__Impl )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1435:2: rule__Param__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Param__Group__4__Impl_in_rule__Param__Group__43027);
            rule__Param__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Param__Group__4"


    // $ANTLR start "rule__Param__Group__4__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1441:1: rule__Param__Group__4__Impl : ( ';' ) ;
    public final void rule__Param__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1445:1: ( ( ';' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1446:1: ( ';' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1446:1: ( ';' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1447:1: ';'
            {
             before(grammarAccess.getParamAccess().getSemicolonKeyword_4()); 
            match(input,29,FOLLOW_29_in_rule__Param__Group__4__Impl3055); 
             after(grammarAccess.getParamAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Param__Group__4__Impl"


    // $ANTLR start "rule__AgentState__Group__0"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1470:1: rule__AgentState__Group__0 : rule__AgentState__Group__0__Impl rule__AgentState__Group__1 ;
    public final void rule__AgentState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1474:1: ( rule__AgentState__Group__0__Impl rule__AgentState__Group__1 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1475:2: rule__AgentState__Group__0__Impl rule__AgentState__Group__1
            {
            pushFollow(FOLLOW_rule__AgentState__Group__0__Impl_in_rule__AgentState__Group__03096);
            rule__AgentState__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AgentState__Group__1_in_rule__AgentState__Group__03099);
            rule__AgentState__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentState__Group__0"


    // $ANTLR start "rule__AgentState__Group__0__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1482:1: rule__AgentState__Group__0__Impl : ( ( rule__AgentState__NameAssignment_0 ) ) ;
    public final void rule__AgentState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1486:1: ( ( ( rule__AgentState__NameAssignment_0 ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1487:1: ( ( rule__AgentState__NameAssignment_0 ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1487:1: ( ( rule__AgentState__NameAssignment_0 ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1488:1: ( rule__AgentState__NameAssignment_0 )
            {
             before(grammarAccess.getAgentStateAccess().getNameAssignment_0()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1489:1: ( rule__AgentState__NameAssignment_0 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1489:2: rule__AgentState__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__AgentState__NameAssignment_0_in_rule__AgentState__Group__0__Impl3126);
            rule__AgentState__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAgentStateAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentState__Group__0__Impl"


    // $ANTLR start "rule__AgentState__Group__1"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1499:1: rule__AgentState__Group__1 : rule__AgentState__Group__1__Impl rule__AgentState__Group__2 ;
    public final void rule__AgentState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1503:1: ( rule__AgentState__Group__1__Impl rule__AgentState__Group__2 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1504:2: rule__AgentState__Group__1__Impl rule__AgentState__Group__2
            {
            pushFollow(FOLLOW_rule__AgentState__Group__1__Impl_in_rule__AgentState__Group__13156);
            rule__AgentState__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AgentState__Group__2_in_rule__AgentState__Group__13159);
            rule__AgentState__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentState__Group__1"


    // $ANTLR start "rule__AgentState__Group__1__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1511:1: rule__AgentState__Group__1__Impl : ( ':=' ) ;
    public final void rule__AgentState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1515:1: ( ( ':=' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1516:1: ( ':=' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1516:1: ( ':=' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1517:1: ':='
            {
             before(grammarAccess.getAgentStateAccess().getColonEqualsSignKeyword_1()); 
            match(input,30,FOLLOW_30_in_rule__AgentState__Group__1__Impl3187); 
             after(grammarAccess.getAgentStateAccess().getColonEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentState__Group__1__Impl"


    // $ANTLR start "rule__AgentState__Group__2"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1530:1: rule__AgentState__Group__2 : rule__AgentState__Group__2__Impl rule__AgentState__Group__3 ;
    public final void rule__AgentState__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1534:1: ( rule__AgentState__Group__2__Impl rule__AgentState__Group__3 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1535:2: rule__AgentState__Group__2__Impl rule__AgentState__Group__3
            {
            pushFollow(FOLLOW_rule__AgentState__Group__2__Impl_in_rule__AgentState__Group__23218);
            rule__AgentState__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AgentState__Group__3_in_rule__AgentState__Group__23221);
            rule__AgentState__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentState__Group__2"


    // $ANTLR start "rule__AgentState__Group__2__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1542:1: rule__AgentState__Group__2__Impl : ( ( rule__AgentState__PrefixsAssignment_2 ) ) ;
    public final void rule__AgentState__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1546:1: ( ( ( rule__AgentState__PrefixsAssignment_2 ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1547:1: ( ( rule__AgentState__PrefixsAssignment_2 ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1547:1: ( ( rule__AgentState__PrefixsAssignment_2 ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1548:1: ( rule__AgentState__PrefixsAssignment_2 )
            {
             before(grammarAccess.getAgentStateAccess().getPrefixsAssignment_2()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1549:1: ( rule__AgentState__PrefixsAssignment_2 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1549:2: rule__AgentState__PrefixsAssignment_2
            {
            pushFollow(FOLLOW_rule__AgentState__PrefixsAssignment_2_in_rule__AgentState__Group__2__Impl3248);
            rule__AgentState__PrefixsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAgentStateAccess().getPrefixsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentState__Group__2__Impl"


    // $ANTLR start "rule__AgentState__Group__3"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1559:1: rule__AgentState__Group__3 : rule__AgentState__Group__3__Impl rule__AgentState__Group__4 ;
    public final void rule__AgentState__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1563:1: ( rule__AgentState__Group__3__Impl rule__AgentState__Group__4 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1564:2: rule__AgentState__Group__3__Impl rule__AgentState__Group__4
            {
            pushFollow(FOLLOW_rule__AgentState__Group__3__Impl_in_rule__AgentState__Group__33278);
            rule__AgentState__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AgentState__Group__4_in_rule__AgentState__Group__33281);
            rule__AgentState__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentState__Group__3"


    // $ANTLR start "rule__AgentState__Group__3__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1571:1: rule__AgentState__Group__3__Impl : ( ( rule__AgentState__Group_3__0 )* ) ;
    public final void rule__AgentState__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1575:1: ( ( ( rule__AgentState__Group_3__0 )* ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1576:1: ( ( rule__AgentState__Group_3__0 )* )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1576:1: ( ( rule__AgentState__Group_3__0 )* )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1577:1: ( rule__AgentState__Group_3__0 )*
            {
             before(grammarAccess.getAgentStateAccess().getGroup_3()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1578:1: ( rule__AgentState__Group_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==19) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1578:2: rule__AgentState__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__AgentState__Group_3__0_in_rule__AgentState__Group__3__Impl3308);
            	    rule__AgentState__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getAgentStateAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentState__Group__3__Impl"


    // $ANTLR start "rule__AgentState__Group__4"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1588:1: rule__AgentState__Group__4 : rule__AgentState__Group__4__Impl ;
    public final void rule__AgentState__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1592:1: ( rule__AgentState__Group__4__Impl )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1593:2: rule__AgentState__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__AgentState__Group__4__Impl_in_rule__AgentState__Group__43339);
            rule__AgentState__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentState__Group__4"


    // $ANTLR start "rule__AgentState__Group__4__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1599:1: rule__AgentState__Group__4__Impl : ( ';' ) ;
    public final void rule__AgentState__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1603:1: ( ( ';' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1604:1: ( ';' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1604:1: ( ';' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1605:1: ';'
            {
             before(grammarAccess.getAgentStateAccess().getSemicolonKeyword_4()); 
            match(input,29,FOLLOW_29_in_rule__AgentState__Group__4__Impl3367); 
             after(grammarAccess.getAgentStateAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentState__Group__4__Impl"


    // $ANTLR start "rule__AgentState__Group_3__0"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1628:1: rule__AgentState__Group_3__0 : rule__AgentState__Group_3__0__Impl rule__AgentState__Group_3__1 ;
    public final void rule__AgentState__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1632:1: ( rule__AgentState__Group_3__0__Impl rule__AgentState__Group_3__1 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1633:2: rule__AgentState__Group_3__0__Impl rule__AgentState__Group_3__1
            {
            pushFollow(FOLLOW_rule__AgentState__Group_3__0__Impl_in_rule__AgentState__Group_3__03408);
            rule__AgentState__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AgentState__Group_3__1_in_rule__AgentState__Group_3__03411);
            rule__AgentState__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentState__Group_3__0"


    // $ANTLR start "rule__AgentState__Group_3__0__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1640:1: rule__AgentState__Group_3__0__Impl : ( '+' ) ;
    public final void rule__AgentState__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1644:1: ( ( '+' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1645:1: ( '+' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1645:1: ( '+' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1646:1: '+'
            {
             before(grammarAccess.getAgentStateAccess().getPlusSignKeyword_3_0()); 
            match(input,19,FOLLOW_19_in_rule__AgentState__Group_3__0__Impl3439); 
             after(grammarAccess.getAgentStateAccess().getPlusSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentState__Group_3__0__Impl"


    // $ANTLR start "rule__AgentState__Group_3__1"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1659:1: rule__AgentState__Group_3__1 : rule__AgentState__Group_3__1__Impl ;
    public final void rule__AgentState__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1663:1: ( rule__AgentState__Group_3__1__Impl )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1664:2: rule__AgentState__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__AgentState__Group_3__1__Impl_in_rule__AgentState__Group_3__13470);
            rule__AgentState__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentState__Group_3__1"


    // $ANTLR start "rule__AgentState__Group_3__1__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1670:1: rule__AgentState__Group_3__1__Impl : ( ( rule__AgentState__PrefixsAssignment_3_1 ) ) ;
    public final void rule__AgentState__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1674:1: ( ( ( rule__AgentState__PrefixsAssignment_3_1 ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1675:1: ( ( rule__AgentState__PrefixsAssignment_3_1 ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1675:1: ( ( rule__AgentState__PrefixsAssignment_3_1 ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1676:1: ( rule__AgentState__PrefixsAssignment_3_1 )
            {
             before(grammarAccess.getAgentStateAccess().getPrefixsAssignment_3_1()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1677:1: ( rule__AgentState__PrefixsAssignment_3_1 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1677:2: rule__AgentState__PrefixsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__AgentState__PrefixsAssignment_3_1_in_rule__AgentState__Group_3__1__Impl3497);
            rule__AgentState__PrefixsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAgentStateAccess().getPrefixsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentState__Group_3__1__Impl"


    // $ANTLR start "rule__Prefix__Group__0"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1691:1: rule__Prefix__Group__0 : rule__Prefix__Group__0__Impl rule__Prefix__Group__1 ;
    public final void rule__Prefix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1695:1: ( rule__Prefix__Group__0__Impl rule__Prefix__Group__1 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1696:2: rule__Prefix__Group__0__Impl rule__Prefix__Group__1
            {
            pushFollow(FOLLOW_rule__Prefix__Group__0__Impl_in_rule__Prefix__Group__03531);
            rule__Prefix__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Prefix__Group__1_in_rule__Prefix__Group__03534);
            rule__Prefix__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__Group__0"


    // $ANTLR start "rule__Prefix__Group__0__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1703:1: rule__Prefix__Group__0__Impl : ( ( rule__Prefix__ActionAssignment_0 ) ) ;
    public final void rule__Prefix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1707:1: ( ( ( rule__Prefix__ActionAssignment_0 ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1708:1: ( ( rule__Prefix__ActionAssignment_0 ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1708:1: ( ( rule__Prefix__ActionAssignment_0 ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1709:1: ( rule__Prefix__ActionAssignment_0 )
            {
             before(grammarAccess.getPrefixAccess().getActionAssignment_0()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1710:1: ( rule__Prefix__ActionAssignment_0 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1710:2: rule__Prefix__ActionAssignment_0
            {
            pushFollow(FOLLOW_rule__Prefix__ActionAssignment_0_in_rule__Prefix__Group__0__Impl3561);
            rule__Prefix__ActionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPrefixAccess().getActionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__Group__0__Impl"


    // $ANTLR start "rule__Prefix__Group__1"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1720:1: rule__Prefix__Group__1 : rule__Prefix__Group__1__Impl ;
    public final void rule__Prefix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1724:1: ( rule__Prefix__Group__1__Impl )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1725:2: rule__Prefix__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Prefix__Group__1__Impl_in_rule__Prefix__Group__13591);
            rule__Prefix__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__Group__1"


    // $ANTLR start "rule__Prefix__Group__1__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1731:1: rule__Prefix__Group__1__Impl : ( ( rule__Prefix__ContinueAssignment_1 ) ) ;
    public final void rule__Prefix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1735:1: ( ( ( rule__Prefix__ContinueAssignment_1 ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1736:1: ( ( rule__Prefix__ContinueAssignment_1 ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1736:1: ( ( rule__Prefix__ContinueAssignment_1 ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1737:1: ( rule__Prefix__ContinueAssignment_1 )
            {
             before(grammarAccess.getPrefixAccess().getContinueAssignment_1()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1738:1: ( rule__Prefix__ContinueAssignment_1 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1738:2: rule__Prefix__ContinueAssignment_1
            {
            pushFollow(FOLLOW_rule__Prefix__ContinueAssignment_1_in_rule__Prefix__Group__1__Impl3618);
            rule__Prefix__ContinueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPrefixAccess().getContinueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__Group__1__Impl"


    // $ANTLR start "rule__ACT_SpNoMsg__Group__0"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1752:1: rule__ACT_SpNoMsg__Group__0 : rule__ACT_SpNoMsg__Group__0__Impl rule__ACT_SpNoMsg__Group__1 ;
    public final void rule__ACT_SpNoMsg__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1756:1: ( rule__ACT_SpNoMsg__Group__0__Impl rule__ACT_SpNoMsg__Group__1 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1757:2: rule__ACT_SpNoMsg__Group__0__Impl rule__ACT_SpNoMsg__Group__1
            {
            pushFollow(FOLLOW_rule__ACT_SpNoMsg__Group__0__Impl_in_rule__ACT_SpNoMsg__Group__03652);
            rule__ACT_SpNoMsg__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ACT_SpNoMsg__Group__1_in_rule__ACT_SpNoMsg__Group__03655);
            rule__ACT_SpNoMsg__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_SpNoMsg__Group__0"


    // $ANTLR start "rule__ACT_SpNoMsg__Group__0__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1764:1: rule__ACT_SpNoMsg__Group__0__Impl : ( '(' ) ;
    public final void rule__ACT_SpNoMsg__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1768:1: ( ( '(' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1769:1: ( '(' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1769:1: ( '(' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1770:1: '('
            {
             before(grammarAccess.getACT_SpNoMsgAccess().getLeftParenthesisKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__ACT_SpNoMsg__Group__0__Impl3683); 
             after(grammarAccess.getACT_SpNoMsgAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_SpNoMsg__Group__0__Impl"


    // $ANTLR start "rule__ACT_SpNoMsg__Group__1"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1783:1: rule__ACT_SpNoMsg__Group__1 : rule__ACT_SpNoMsg__Group__1__Impl rule__ACT_SpNoMsg__Group__2 ;
    public final void rule__ACT_SpNoMsg__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1787:1: ( rule__ACT_SpNoMsg__Group__1__Impl rule__ACT_SpNoMsg__Group__2 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1788:2: rule__ACT_SpNoMsg__Group__1__Impl rule__ACT_SpNoMsg__Group__2
            {
            pushFollow(FOLLOW_rule__ACT_SpNoMsg__Group__1__Impl_in_rule__ACT_SpNoMsg__Group__13714);
            rule__ACT_SpNoMsg__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ACT_SpNoMsg__Group__2_in_rule__ACT_SpNoMsg__Group__13717);
            rule__ACT_SpNoMsg__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_SpNoMsg__Group__1"


    // $ANTLR start "rule__ACT_SpNoMsg__Group__1__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1795:1: rule__ACT_SpNoMsg__Group__1__Impl : ( ( rule__ACT_SpNoMsg__NameAssignment_1 ) ) ;
    public final void rule__ACT_SpNoMsg__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1799:1: ( ( ( rule__ACT_SpNoMsg__NameAssignment_1 ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1800:1: ( ( rule__ACT_SpNoMsg__NameAssignment_1 ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1800:1: ( ( rule__ACT_SpNoMsg__NameAssignment_1 ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1801:1: ( rule__ACT_SpNoMsg__NameAssignment_1 )
            {
             before(grammarAccess.getACT_SpNoMsgAccess().getNameAssignment_1()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1802:1: ( rule__ACT_SpNoMsg__NameAssignment_1 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1802:2: rule__ACT_SpNoMsg__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ACT_SpNoMsg__NameAssignment_1_in_rule__ACT_SpNoMsg__Group__1__Impl3744);
            rule__ACT_SpNoMsg__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getACT_SpNoMsgAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_SpNoMsg__Group__1__Impl"


    // $ANTLR start "rule__ACT_SpNoMsg__Group__2"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1812:1: rule__ACT_SpNoMsg__Group__2 : rule__ACT_SpNoMsg__Group__2__Impl rule__ACT_SpNoMsg__Group__3 ;
    public final void rule__ACT_SpNoMsg__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1816:1: ( rule__ACT_SpNoMsg__Group__2__Impl rule__ACT_SpNoMsg__Group__3 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1817:2: rule__ACT_SpNoMsg__Group__2__Impl rule__ACT_SpNoMsg__Group__3
            {
            pushFollow(FOLLOW_rule__ACT_SpNoMsg__Group__2__Impl_in_rule__ACT_SpNoMsg__Group__23774);
            rule__ACT_SpNoMsg__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ACT_SpNoMsg__Group__3_in_rule__ACT_SpNoMsg__Group__23777);
            rule__ACT_SpNoMsg__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_SpNoMsg__Group__2"


    // $ANTLR start "rule__ACT_SpNoMsg__Group__2__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1824:1: rule__ACT_SpNoMsg__Group__2__Impl : ( ',' ) ;
    public final void rule__ACT_SpNoMsg__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1828:1: ( ( ',' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1829:1: ( ',' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1829:1: ( ',' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1830:1: ','
            {
             before(grammarAccess.getACT_SpNoMsgAccess().getCommaKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__ACT_SpNoMsg__Group__2__Impl3805); 
             after(grammarAccess.getACT_SpNoMsgAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_SpNoMsg__Group__2__Impl"


    // $ANTLR start "rule__ACT_SpNoMsg__Group__3"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1843:1: rule__ACT_SpNoMsg__Group__3 : rule__ACT_SpNoMsg__Group__3__Impl rule__ACT_SpNoMsg__Group__4 ;
    public final void rule__ACT_SpNoMsg__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1847:1: ( rule__ACT_SpNoMsg__Group__3__Impl rule__ACT_SpNoMsg__Group__4 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1848:2: rule__ACT_SpNoMsg__Group__3__Impl rule__ACT_SpNoMsg__Group__4
            {
            pushFollow(FOLLOW_rule__ACT_SpNoMsg__Group__3__Impl_in_rule__ACT_SpNoMsg__Group__33836);
            rule__ACT_SpNoMsg__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ACT_SpNoMsg__Group__4_in_rule__ACT_SpNoMsg__Group__33839);
            rule__ACT_SpNoMsg__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_SpNoMsg__Group__3"


    // $ANTLR start "rule__ACT_SpNoMsg__Group__3__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1855:1: rule__ACT_SpNoMsg__Group__3__Impl : ( ( rule__ACT_SpNoMsg__RateAssignment_3 ) ) ;
    public final void rule__ACT_SpNoMsg__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1859:1: ( ( ( rule__ACT_SpNoMsg__RateAssignment_3 ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1860:1: ( ( rule__ACT_SpNoMsg__RateAssignment_3 ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1860:1: ( ( rule__ACT_SpNoMsg__RateAssignment_3 ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1861:1: ( rule__ACT_SpNoMsg__RateAssignment_3 )
            {
             before(grammarAccess.getACT_SpNoMsgAccess().getRateAssignment_3()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1862:1: ( rule__ACT_SpNoMsg__RateAssignment_3 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1862:2: rule__ACT_SpNoMsg__RateAssignment_3
            {
            pushFollow(FOLLOW_rule__ACT_SpNoMsg__RateAssignment_3_in_rule__ACT_SpNoMsg__Group__3__Impl3866);
            rule__ACT_SpNoMsg__RateAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getACT_SpNoMsgAccess().getRateAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_SpNoMsg__Group__3__Impl"


    // $ANTLR start "rule__ACT_SpNoMsg__Group__4"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1872:1: rule__ACT_SpNoMsg__Group__4 : rule__ACT_SpNoMsg__Group__4__Impl rule__ACT_SpNoMsg__Group__5 ;
    public final void rule__ACT_SpNoMsg__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1876:1: ( rule__ACT_SpNoMsg__Group__4__Impl rule__ACT_SpNoMsg__Group__5 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1877:2: rule__ACT_SpNoMsg__Group__4__Impl rule__ACT_SpNoMsg__Group__5
            {
            pushFollow(FOLLOW_rule__ACT_SpNoMsg__Group__4__Impl_in_rule__ACT_SpNoMsg__Group__43896);
            rule__ACT_SpNoMsg__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ACT_SpNoMsg__Group__5_in_rule__ACT_SpNoMsg__Group__43899);
            rule__ACT_SpNoMsg__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_SpNoMsg__Group__4"


    // $ANTLR start "rule__ACT_SpNoMsg__Group__4__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1884:1: rule__ACT_SpNoMsg__Group__4__Impl : ( ')' ) ;
    public final void rule__ACT_SpNoMsg__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1888:1: ( ( ')' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1889:1: ( ')' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1889:1: ( ')' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1890:1: ')'
            {
             before(grammarAccess.getACT_SpNoMsgAccess().getRightParenthesisKeyword_4()); 
            match(input,33,FOLLOW_33_in_rule__ACT_SpNoMsg__Group__4__Impl3927); 
             after(grammarAccess.getACT_SpNoMsgAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_SpNoMsg__Group__4__Impl"


    // $ANTLR start "rule__ACT_SpNoMsg__Group__5"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1903:1: rule__ACT_SpNoMsg__Group__5 : rule__ACT_SpNoMsg__Group__5__Impl ;
    public final void rule__ACT_SpNoMsg__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1907:1: ( rule__ACT_SpNoMsg__Group__5__Impl )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1908:2: rule__ACT_SpNoMsg__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__ACT_SpNoMsg__Group__5__Impl_in_rule__ACT_SpNoMsg__Group__53958);
            rule__ACT_SpNoMsg__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_SpNoMsg__Group__5"


    // $ANTLR start "rule__ACT_SpNoMsg__Group__5__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1914:1: rule__ACT_SpNoMsg__Group__5__Impl : ( '.' ) ;
    public final void rule__ACT_SpNoMsg__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1918:1: ( ( '.' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1919:1: ( '.' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1919:1: ( '.' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1920:1: '.'
            {
             before(grammarAccess.getACT_SpNoMsgAccess().getFullStopKeyword_5()); 
            match(input,34,FOLLOW_34_in_rule__ACT_SpNoMsg__Group__5__Impl3986); 
             after(grammarAccess.getACT_SpNoMsgAccess().getFullStopKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_SpNoMsg__Group__5__Impl"


    // $ANTLR start "rule__ACT_SpBr__Group__0"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1945:1: rule__ACT_SpBr__Group__0 : rule__ACT_SpBr__Group__0__Impl rule__ACT_SpBr__Group__1 ;
    public final void rule__ACT_SpBr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1949:1: ( rule__ACT_SpBr__Group__0__Impl rule__ACT_SpBr__Group__1 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1950:2: rule__ACT_SpBr__Group__0__Impl rule__ACT_SpBr__Group__1
            {
            pushFollow(FOLLOW_rule__ACT_SpBr__Group__0__Impl_in_rule__ACT_SpBr__Group__04029);
            rule__ACT_SpBr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ACT_SpBr__Group__1_in_rule__ACT_SpBr__Group__04032);
            rule__ACT_SpBr__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_SpBr__Group__0"


    // $ANTLR start "rule__ACT_SpBr__Group__0__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1957:1: rule__ACT_SpBr__Group__0__Impl : ( '!(' ) ;
    public final void rule__ACT_SpBr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1961:1: ( ( '!(' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1962:1: ( '!(' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1962:1: ( '!(' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1963:1: '!('
            {
             before(grammarAccess.getACT_SpBrAccess().getExclamationMarkLeftParenthesisKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__ACT_SpBr__Group__0__Impl4060); 
             after(grammarAccess.getACT_SpBrAccess().getExclamationMarkLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_SpBr__Group__0__Impl"


    // $ANTLR start "rule__ACT_SpBr__Group__1"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1976:1: rule__ACT_SpBr__Group__1 : rule__ACT_SpBr__Group__1__Impl rule__ACT_SpBr__Group__2 ;
    public final void rule__ACT_SpBr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1980:1: ( rule__ACT_SpBr__Group__1__Impl rule__ACT_SpBr__Group__2 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1981:2: rule__ACT_SpBr__Group__1__Impl rule__ACT_SpBr__Group__2
            {
            pushFollow(FOLLOW_rule__ACT_SpBr__Group__1__Impl_in_rule__ACT_SpBr__Group__14091);
            rule__ACT_SpBr__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ACT_SpBr__Group__2_in_rule__ACT_SpBr__Group__14094);
            rule__ACT_SpBr__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_SpBr__Group__1"


    // $ANTLR start "rule__ACT_SpBr__Group__1__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1988:1: rule__ACT_SpBr__Group__1__Impl : ( ( rule__ACT_SpBr__NameAssignment_1 ) ) ;
    public final void rule__ACT_SpBr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1992:1: ( ( ( rule__ACT_SpBr__NameAssignment_1 ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1993:1: ( ( rule__ACT_SpBr__NameAssignment_1 ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1993:1: ( ( rule__ACT_SpBr__NameAssignment_1 ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1994:1: ( rule__ACT_SpBr__NameAssignment_1 )
            {
             before(grammarAccess.getACT_SpBrAccess().getNameAssignment_1()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1995:1: ( rule__ACT_SpBr__NameAssignment_1 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:1995:2: rule__ACT_SpBr__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ACT_SpBr__NameAssignment_1_in_rule__ACT_SpBr__Group__1__Impl4121);
            rule__ACT_SpBr__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getACT_SpBrAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_SpBr__Group__1__Impl"


    // $ANTLR start "rule__ACT_SpBr__Group__2"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2005:1: rule__ACT_SpBr__Group__2 : rule__ACT_SpBr__Group__2__Impl rule__ACT_SpBr__Group__3 ;
    public final void rule__ACT_SpBr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2009:1: ( rule__ACT_SpBr__Group__2__Impl rule__ACT_SpBr__Group__3 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2010:2: rule__ACT_SpBr__Group__2__Impl rule__ACT_SpBr__Group__3
            {
            pushFollow(FOLLOW_rule__ACT_SpBr__Group__2__Impl_in_rule__ACT_SpBr__Group__24151);
            rule__ACT_SpBr__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ACT_SpBr__Group__3_in_rule__ACT_SpBr__Group__24154);
            rule__ACT_SpBr__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_SpBr__Group__2"


    // $ANTLR start "rule__ACT_SpBr__Group__2__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2017:1: rule__ACT_SpBr__Group__2__Impl : ( ',' ) ;
    public final void rule__ACT_SpBr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2021:1: ( ( ',' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2022:1: ( ',' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2022:1: ( ',' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2023:1: ','
            {
             before(grammarAccess.getACT_SpBrAccess().getCommaKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__ACT_SpBr__Group__2__Impl4182); 
             after(grammarAccess.getACT_SpBrAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_SpBr__Group__2__Impl"


    // $ANTLR start "rule__ACT_SpBr__Group__3"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2036:1: rule__ACT_SpBr__Group__3 : rule__ACT_SpBr__Group__3__Impl rule__ACT_SpBr__Group__4 ;
    public final void rule__ACT_SpBr__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2040:1: ( rule__ACT_SpBr__Group__3__Impl rule__ACT_SpBr__Group__4 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2041:2: rule__ACT_SpBr__Group__3__Impl rule__ACT_SpBr__Group__4
            {
            pushFollow(FOLLOW_rule__ACT_SpBr__Group__3__Impl_in_rule__ACT_SpBr__Group__34213);
            rule__ACT_SpBr__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ACT_SpBr__Group__4_in_rule__ACT_SpBr__Group__34216);
            rule__ACT_SpBr__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_SpBr__Group__3"


    // $ANTLR start "rule__ACT_SpBr__Group__3__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2048:1: rule__ACT_SpBr__Group__3__Impl : ( ( rule__ACT_SpBr__RateAssignment_3 ) ) ;
    public final void rule__ACT_SpBr__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2052:1: ( ( ( rule__ACT_SpBr__RateAssignment_3 ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2053:1: ( ( rule__ACT_SpBr__RateAssignment_3 ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2053:1: ( ( rule__ACT_SpBr__RateAssignment_3 ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2054:1: ( rule__ACT_SpBr__RateAssignment_3 )
            {
             before(grammarAccess.getACT_SpBrAccess().getRateAssignment_3()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2055:1: ( rule__ACT_SpBr__RateAssignment_3 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2055:2: rule__ACT_SpBr__RateAssignment_3
            {
            pushFollow(FOLLOW_rule__ACT_SpBr__RateAssignment_3_in_rule__ACT_SpBr__Group__3__Impl4243);
            rule__ACT_SpBr__RateAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getACT_SpBrAccess().getRateAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_SpBr__Group__3__Impl"


    // $ANTLR start "rule__ACT_SpBr__Group__4"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2065:1: rule__ACT_SpBr__Group__4 : rule__ACT_SpBr__Group__4__Impl rule__ACT_SpBr__Group__5 ;
    public final void rule__ACT_SpBr__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2069:1: ( rule__ACT_SpBr__Group__4__Impl rule__ACT_SpBr__Group__5 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2070:2: rule__ACT_SpBr__Group__4__Impl rule__ACT_SpBr__Group__5
            {
            pushFollow(FOLLOW_rule__ACT_SpBr__Group__4__Impl_in_rule__ACT_SpBr__Group__44273);
            rule__ACT_SpBr__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ACT_SpBr__Group__5_in_rule__ACT_SpBr__Group__44276);
            rule__ACT_SpBr__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_SpBr__Group__4"


    // $ANTLR start "rule__ACT_SpBr__Group__4__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2077:1: rule__ACT_SpBr__Group__4__Impl : ( ')@' ) ;
    public final void rule__ACT_SpBr__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2081:1: ( ( ')@' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2082:1: ( ')@' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2082:1: ( ')@' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2083:1: ')@'
            {
             before(grammarAccess.getACT_SpBrAccess().getRightParenthesisCommercialAtKeyword_4()); 
            match(input,36,FOLLOW_36_in_rule__ACT_SpBr__Group__4__Impl4304); 
             after(grammarAccess.getACT_SpBrAccess().getRightParenthesisCommercialAtKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_SpBr__Group__4__Impl"


    // $ANTLR start "rule__ACT_SpBr__Group__5"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2096:1: rule__ACT_SpBr__Group__5 : rule__ACT_SpBr__Group__5__Impl rule__ACT_SpBr__Group__6 ;
    public final void rule__ACT_SpBr__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2100:1: ( rule__ACT_SpBr__Group__5__Impl rule__ACT_SpBr__Group__6 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2101:2: rule__ACT_SpBr__Group__5__Impl rule__ACT_SpBr__Group__6
            {
            pushFollow(FOLLOW_rule__ACT_SpBr__Group__5__Impl_in_rule__ACT_SpBr__Group__54335);
            rule__ACT_SpBr__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ACT_SpBr__Group__6_in_rule__ACT_SpBr__Group__54338);
            rule__ACT_SpBr__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_SpBr__Group__5"


    // $ANTLR start "rule__ACT_SpBr__Group__5__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2108:1: rule__ACT_SpBr__Group__5__Impl : ( 'IR' ) ;
    public final void rule__ACT_SpBr__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2112:1: ( ( 'IR' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2113:1: ( 'IR' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2113:1: ( 'IR' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2114:1: 'IR'
            {
             before(grammarAccess.getACT_SpBrAccess().getIRKeyword_5()); 
            match(input,37,FOLLOW_37_in_rule__ACT_SpBr__Group__5__Impl4366); 
             after(grammarAccess.getACT_SpBrAccess().getIRKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_SpBr__Group__5__Impl"


    // $ANTLR start "rule__ACT_SpBr__Group__6"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2127:1: rule__ACT_SpBr__Group__6 : rule__ACT_SpBr__Group__6__Impl rule__ACT_SpBr__Group__7 ;
    public final void rule__ACT_SpBr__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2131:1: ( rule__ACT_SpBr__Group__6__Impl rule__ACT_SpBr__Group__7 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2132:2: rule__ACT_SpBr__Group__6__Impl rule__ACT_SpBr__Group__7
            {
            pushFollow(FOLLOW_rule__ACT_SpBr__Group__6__Impl_in_rule__ACT_SpBr__Group__64397);
            rule__ACT_SpBr__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ACT_SpBr__Group__7_in_rule__ACT_SpBr__Group__64400);
            rule__ACT_SpBr__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_SpBr__Group__6"


    // $ANTLR start "rule__ACT_SpBr__Group__6__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2139:1: rule__ACT_SpBr__Group__6__Impl : ( '{' ) ;
    public final void rule__ACT_SpBr__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2143:1: ( ( '{' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2144:1: ( '{' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2144:1: ( '{' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2145:1: '{'
            {
             before(grammarAccess.getACT_SpBrAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,38,FOLLOW_38_in_rule__ACT_SpBr__Group__6__Impl4428); 
             after(grammarAccess.getACT_SpBrAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_SpBr__Group__6__Impl"


    // $ANTLR start "rule__ACT_SpBr__Group__7"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2158:1: rule__ACT_SpBr__Group__7 : rule__ACT_SpBr__Group__7__Impl rule__ACT_SpBr__Group__8 ;
    public final void rule__ACT_SpBr__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2162:1: ( rule__ACT_SpBr__Group__7__Impl rule__ACT_SpBr__Group__8 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2163:2: rule__ACT_SpBr__Group__7__Impl rule__ACT_SpBr__Group__8
            {
            pushFollow(FOLLOW_rule__ACT_SpBr__Group__7__Impl_in_rule__ACT_SpBr__Group__74459);
            rule__ACT_SpBr__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ACT_SpBr__Group__8_in_rule__ACT_SpBr__Group__74462);
            rule__ACT_SpBr__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_SpBr__Group__7"


    // $ANTLR start "rule__ACT_SpBr__Group__7__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2170:1: rule__ACT_SpBr__Group__7__Impl : ( ( rule__ACT_SpBr__RangeAssignment_7 ) ) ;
    public final void rule__ACT_SpBr__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2174:1: ( ( ( rule__ACT_SpBr__RangeAssignment_7 ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2175:1: ( ( rule__ACT_SpBr__RangeAssignment_7 ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2175:1: ( ( rule__ACT_SpBr__RangeAssignment_7 ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2176:1: ( rule__ACT_SpBr__RangeAssignment_7 )
            {
             before(grammarAccess.getACT_SpBrAccess().getRangeAssignment_7()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2177:1: ( rule__ACT_SpBr__RangeAssignment_7 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2177:2: rule__ACT_SpBr__RangeAssignment_7
            {
            pushFollow(FOLLOW_rule__ACT_SpBr__RangeAssignment_7_in_rule__ACT_SpBr__Group__7__Impl4489);
            rule__ACT_SpBr__RangeAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getACT_SpBrAccess().getRangeAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_SpBr__Group__7__Impl"


    // $ANTLR start "rule__ACT_SpBr__Group__8"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2187:1: rule__ACT_SpBr__Group__8 : rule__ACT_SpBr__Group__8__Impl ;
    public final void rule__ACT_SpBr__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2191:1: ( rule__ACT_SpBr__Group__8__Impl )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2192:2: rule__ACT_SpBr__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__ACT_SpBr__Group__8__Impl_in_rule__ACT_SpBr__Group__84519);
            rule__ACT_SpBr__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_SpBr__Group__8"


    // $ANTLR start "rule__ACT_SpBr__Group__8__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2198:1: rule__ACT_SpBr__Group__8__Impl : ( '}.' ) ;
    public final void rule__ACT_SpBr__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2202:1: ( ( '}.' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2203:1: ( '}.' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2203:1: ( '}.' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2204:1: '}.'
            {
             before(grammarAccess.getACT_SpBrAccess().getRightCurlyBracketFullStopKeyword_8()); 
            match(input,39,FOLLOW_39_in_rule__ACT_SpBr__Group__8__Impl4547); 
             after(grammarAccess.getACT_SpBrAccess().getRightCurlyBracketFullStopKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_SpBr__Group__8__Impl"


    // $ANTLR start "rule__ACT_SpUni__Group__0"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2235:1: rule__ACT_SpUni__Group__0 : rule__ACT_SpUni__Group__0__Impl rule__ACT_SpUni__Group__1 ;
    public final void rule__ACT_SpUni__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2239:1: ( rule__ACT_SpUni__Group__0__Impl rule__ACT_SpUni__Group__1 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2240:2: rule__ACT_SpUni__Group__0__Impl rule__ACT_SpUni__Group__1
            {
            pushFollow(FOLLOW_rule__ACT_SpUni__Group__0__Impl_in_rule__ACT_SpUni__Group__04596);
            rule__ACT_SpUni__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ACT_SpUni__Group__1_in_rule__ACT_SpUni__Group__04599);
            rule__ACT_SpUni__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_SpUni__Group__0"


    // $ANTLR start "rule__ACT_SpUni__Group__0__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2247:1: rule__ACT_SpUni__Group__0__Impl : ( '!!(' ) ;
    public final void rule__ACT_SpUni__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2251:1: ( ( '!!(' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2252:1: ( '!!(' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2252:1: ( '!!(' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2253:1: '!!('
            {
             before(grammarAccess.getACT_SpUniAccess().getExclamationMarkExclamationMarkLeftParenthesisKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__ACT_SpUni__Group__0__Impl4627); 
             after(grammarAccess.getACT_SpUniAccess().getExclamationMarkExclamationMarkLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_SpUni__Group__0__Impl"


    // $ANTLR start "rule__ACT_SpUni__Group__1"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2266:1: rule__ACT_SpUni__Group__1 : rule__ACT_SpUni__Group__1__Impl rule__ACT_SpUni__Group__2 ;
    public final void rule__ACT_SpUni__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2270:1: ( rule__ACT_SpUni__Group__1__Impl rule__ACT_SpUni__Group__2 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2271:2: rule__ACT_SpUni__Group__1__Impl rule__ACT_SpUni__Group__2
            {
            pushFollow(FOLLOW_rule__ACT_SpUni__Group__1__Impl_in_rule__ACT_SpUni__Group__14658);
            rule__ACT_SpUni__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ACT_SpUni__Group__2_in_rule__ACT_SpUni__Group__14661);
            rule__ACT_SpUni__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_SpUni__Group__1"


    // $ANTLR start "rule__ACT_SpUni__Group__1__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2278:1: rule__ACT_SpUni__Group__1__Impl : ( ( rule__ACT_SpUni__NameAssignment_1 ) ) ;
    public final void rule__ACT_SpUni__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2282:1: ( ( ( rule__ACT_SpUni__NameAssignment_1 ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2283:1: ( ( rule__ACT_SpUni__NameAssignment_1 ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2283:1: ( ( rule__ACT_SpUni__NameAssignment_1 ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2284:1: ( rule__ACT_SpUni__NameAssignment_1 )
            {
             before(grammarAccess.getACT_SpUniAccess().getNameAssignment_1()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2285:1: ( rule__ACT_SpUni__NameAssignment_1 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2285:2: rule__ACT_SpUni__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ACT_SpUni__NameAssignment_1_in_rule__ACT_SpUni__Group__1__Impl4688);
            rule__ACT_SpUni__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getACT_SpUniAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_SpUni__Group__1__Impl"


    // $ANTLR start "rule__ACT_SpUni__Group__2"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2295:1: rule__ACT_SpUni__Group__2 : rule__ACT_SpUni__Group__2__Impl rule__ACT_SpUni__Group__3 ;
    public final void rule__ACT_SpUni__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2299:1: ( rule__ACT_SpUni__Group__2__Impl rule__ACT_SpUni__Group__3 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2300:2: rule__ACT_SpUni__Group__2__Impl rule__ACT_SpUni__Group__3
            {
            pushFollow(FOLLOW_rule__ACT_SpUni__Group__2__Impl_in_rule__ACT_SpUni__Group__24718);
            rule__ACT_SpUni__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ACT_SpUni__Group__3_in_rule__ACT_SpUni__Group__24721);
            rule__ACT_SpUni__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_SpUni__Group__2"


    // $ANTLR start "rule__ACT_SpUni__Group__2__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2307:1: rule__ACT_SpUni__Group__2__Impl : ( ',' ) ;
    public final void rule__ACT_SpUni__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2311:1: ( ( ',' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2312:1: ( ',' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2312:1: ( ',' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2313:1: ','
            {
             before(grammarAccess.getACT_SpUniAccess().getCommaKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__ACT_SpUni__Group__2__Impl4749); 
             after(grammarAccess.getACT_SpUniAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_SpUni__Group__2__Impl"


    // $ANTLR start "rule__ACT_SpUni__Group__3"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2326:1: rule__ACT_SpUni__Group__3 : rule__ACT_SpUni__Group__3__Impl rule__ACT_SpUni__Group__4 ;
    public final void rule__ACT_SpUni__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2330:1: ( rule__ACT_SpUni__Group__3__Impl rule__ACT_SpUni__Group__4 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2331:2: rule__ACT_SpUni__Group__3__Impl rule__ACT_SpUni__Group__4
            {
            pushFollow(FOLLOW_rule__ACT_SpUni__Group__3__Impl_in_rule__ACT_SpUni__Group__34780);
            rule__ACT_SpUni__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ACT_SpUni__Group__4_in_rule__ACT_SpUni__Group__34783);
            rule__ACT_SpUni__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_SpUni__Group__3"


    // $ANTLR start "rule__ACT_SpUni__Group__3__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2338:1: rule__ACT_SpUni__Group__3__Impl : ( ( rule__ACT_SpUni__RateAssignment_3 ) ) ;
    public final void rule__ACT_SpUni__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2342:1: ( ( ( rule__ACT_SpUni__RateAssignment_3 ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2343:1: ( ( rule__ACT_SpUni__RateAssignment_3 ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2343:1: ( ( rule__ACT_SpUni__RateAssignment_3 ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2344:1: ( rule__ACT_SpUni__RateAssignment_3 )
            {
             before(grammarAccess.getACT_SpUniAccess().getRateAssignment_3()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2345:1: ( rule__ACT_SpUni__RateAssignment_3 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2345:2: rule__ACT_SpUni__RateAssignment_3
            {
            pushFollow(FOLLOW_rule__ACT_SpUni__RateAssignment_3_in_rule__ACT_SpUni__Group__3__Impl4810);
            rule__ACT_SpUni__RateAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getACT_SpUniAccess().getRateAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_SpUni__Group__3__Impl"


    // $ANTLR start "rule__ACT_SpUni__Group__4"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2355:1: rule__ACT_SpUni__Group__4 : rule__ACT_SpUni__Group__4__Impl rule__ACT_SpUni__Group__5 ;
    public final void rule__ACT_SpUni__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2359:1: ( rule__ACT_SpUni__Group__4__Impl rule__ACT_SpUni__Group__5 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2360:2: rule__ACT_SpUni__Group__4__Impl rule__ACT_SpUni__Group__5
            {
            pushFollow(FOLLOW_rule__ACT_SpUni__Group__4__Impl_in_rule__ACT_SpUni__Group__44840);
            rule__ACT_SpUni__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ACT_SpUni__Group__5_in_rule__ACT_SpUni__Group__44843);
            rule__ACT_SpUni__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_SpUni__Group__4"


    // $ANTLR start "rule__ACT_SpUni__Group__4__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2367:1: rule__ACT_SpUni__Group__4__Impl : ( ')@' ) ;
    public final void rule__ACT_SpUni__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2371:1: ( ( ')@' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2372:1: ( ')@' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2372:1: ( ')@' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2373:1: ')@'
            {
             before(grammarAccess.getACT_SpUniAccess().getRightParenthesisCommercialAtKeyword_4()); 
            match(input,36,FOLLOW_36_in_rule__ACT_SpUni__Group__4__Impl4871); 
             after(grammarAccess.getACT_SpUniAccess().getRightParenthesisCommercialAtKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_SpUni__Group__4__Impl"


    // $ANTLR start "rule__ACT_SpUni__Group__5"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2386:1: rule__ACT_SpUni__Group__5 : rule__ACT_SpUni__Group__5__Impl rule__ACT_SpUni__Group__6 ;
    public final void rule__ACT_SpUni__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2390:1: ( rule__ACT_SpUni__Group__5__Impl rule__ACT_SpUni__Group__6 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2391:2: rule__ACT_SpUni__Group__5__Impl rule__ACT_SpUni__Group__6
            {
            pushFollow(FOLLOW_rule__ACT_SpUni__Group__5__Impl_in_rule__ACT_SpUni__Group__54902);
            rule__ACT_SpUni__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ACT_SpUni__Group__6_in_rule__ACT_SpUni__Group__54905);
            rule__ACT_SpUni__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_SpUni__Group__5"


    // $ANTLR start "rule__ACT_SpUni__Group__5__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2398:1: rule__ACT_SpUni__Group__5__Impl : ( 'IR' ) ;
    public final void rule__ACT_SpUni__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2402:1: ( ( 'IR' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2403:1: ( 'IR' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2403:1: ( 'IR' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2404:1: 'IR'
            {
             before(grammarAccess.getACT_SpUniAccess().getIRKeyword_5()); 
            match(input,37,FOLLOW_37_in_rule__ACT_SpUni__Group__5__Impl4933); 
             after(grammarAccess.getACT_SpUniAccess().getIRKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_SpUni__Group__5__Impl"


    // $ANTLR start "rule__ACT_SpUni__Group__6"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2417:1: rule__ACT_SpUni__Group__6 : rule__ACT_SpUni__Group__6__Impl rule__ACT_SpUni__Group__7 ;
    public final void rule__ACT_SpUni__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2421:1: ( rule__ACT_SpUni__Group__6__Impl rule__ACT_SpUni__Group__7 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2422:2: rule__ACT_SpUni__Group__6__Impl rule__ACT_SpUni__Group__7
            {
            pushFollow(FOLLOW_rule__ACT_SpUni__Group__6__Impl_in_rule__ACT_SpUni__Group__64964);
            rule__ACT_SpUni__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ACT_SpUni__Group__7_in_rule__ACT_SpUni__Group__64967);
            rule__ACT_SpUni__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_SpUni__Group__6"


    // $ANTLR start "rule__ACT_SpUni__Group__6__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2429:1: rule__ACT_SpUni__Group__6__Impl : ( '{' ) ;
    public final void rule__ACT_SpUni__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2433:1: ( ( '{' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2434:1: ( '{' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2434:1: ( '{' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2435:1: '{'
            {
             before(grammarAccess.getACT_SpUniAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,38,FOLLOW_38_in_rule__ACT_SpUni__Group__6__Impl4995); 
             after(grammarAccess.getACT_SpUniAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_SpUni__Group__6__Impl"


    // $ANTLR start "rule__ACT_SpUni__Group__7"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2448:1: rule__ACT_SpUni__Group__7 : rule__ACT_SpUni__Group__7__Impl rule__ACT_SpUni__Group__8 ;
    public final void rule__ACT_SpUni__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2452:1: ( rule__ACT_SpUni__Group__7__Impl rule__ACT_SpUni__Group__8 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2453:2: rule__ACT_SpUni__Group__7__Impl rule__ACT_SpUni__Group__8
            {
            pushFollow(FOLLOW_rule__ACT_SpUni__Group__7__Impl_in_rule__ACT_SpUni__Group__75026);
            rule__ACT_SpUni__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ACT_SpUni__Group__8_in_rule__ACT_SpUni__Group__75029);
            rule__ACT_SpUni__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_SpUni__Group__7"


    // $ANTLR start "rule__ACT_SpUni__Group__7__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2460:1: rule__ACT_SpUni__Group__7__Impl : ( ( rule__ACT_SpUni__RangeAssignment_7 ) ) ;
    public final void rule__ACT_SpUni__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2464:1: ( ( ( rule__ACT_SpUni__RangeAssignment_7 ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2465:1: ( ( rule__ACT_SpUni__RangeAssignment_7 ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2465:1: ( ( rule__ACT_SpUni__RangeAssignment_7 ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2466:1: ( rule__ACT_SpUni__RangeAssignment_7 )
            {
             before(grammarAccess.getACT_SpUniAccess().getRangeAssignment_7()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2467:1: ( rule__ACT_SpUni__RangeAssignment_7 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2467:2: rule__ACT_SpUni__RangeAssignment_7
            {
            pushFollow(FOLLOW_rule__ACT_SpUni__RangeAssignment_7_in_rule__ACT_SpUni__Group__7__Impl5056);
            rule__ACT_SpUni__RangeAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getACT_SpUniAccess().getRangeAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_SpUni__Group__7__Impl"


    // $ANTLR start "rule__ACT_SpUni__Group__8"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2477:1: rule__ACT_SpUni__Group__8 : rule__ACT_SpUni__Group__8__Impl ;
    public final void rule__ACT_SpUni__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2481:1: ( rule__ACT_SpUni__Group__8__Impl )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2482:2: rule__ACT_SpUni__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__ACT_SpUni__Group__8__Impl_in_rule__ACT_SpUni__Group__85086);
            rule__ACT_SpUni__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_SpUni__Group__8"


    // $ANTLR start "rule__ACT_SpUni__Group__8__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2488:1: rule__ACT_SpUni__Group__8__Impl : ( '}.' ) ;
    public final void rule__ACT_SpUni__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2492:1: ( ( '}.' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2493:1: ( '}.' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2493:1: ( '}.' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2494:1: '}.'
            {
             before(grammarAccess.getACT_SpUniAccess().getRightCurlyBracketFullStopKeyword_8()); 
            match(input,39,FOLLOW_39_in_rule__ACT_SpUni__Group__8__Impl5114); 
             after(grammarAccess.getACT_SpUniAccess().getRightCurlyBracketFullStopKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_SpUni__Group__8__Impl"


    // $ANTLR start "rule__ACT_InBr__Group__0"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2525:1: rule__ACT_InBr__Group__0 : rule__ACT_InBr__Group__0__Impl rule__ACT_InBr__Group__1 ;
    public final void rule__ACT_InBr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2529:1: ( rule__ACT_InBr__Group__0__Impl rule__ACT_InBr__Group__1 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2530:2: rule__ACT_InBr__Group__0__Impl rule__ACT_InBr__Group__1
            {
            pushFollow(FOLLOW_rule__ACT_InBr__Group__0__Impl_in_rule__ACT_InBr__Group__05163);
            rule__ACT_InBr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ACT_InBr__Group__1_in_rule__ACT_InBr__Group__05166);
            rule__ACT_InBr__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_InBr__Group__0"


    // $ANTLR start "rule__ACT_InBr__Group__0__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2537:1: rule__ACT_InBr__Group__0__Impl : ( '?(' ) ;
    public final void rule__ACT_InBr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2541:1: ( ( '?(' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2542:1: ( '?(' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2542:1: ( '?(' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2543:1: '?('
            {
             before(grammarAccess.getACT_InBrAccess().getQuestionMarkLeftParenthesisKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__ACT_InBr__Group__0__Impl5194); 
             after(grammarAccess.getACT_InBrAccess().getQuestionMarkLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_InBr__Group__0__Impl"


    // $ANTLR start "rule__ACT_InBr__Group__1"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2556:1: rule__ACT_InBr__Group__1 : rule__ACT_InBr__Group__1__Impl rule__ACT_InBr__Group__2 ;
    public final void rule__ACT_InBr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2560:1: ( rule__ACT_InBr__Group__1__Impl rule__ACT_InBr__Group__2 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2561:2: rule__ACT_InBr__Group__1__Impl rule__ACT_InBr__Group__2
            {
            pushFollow(FOLLOW_rule__ACT_InBr__Group__1__Impl_in_rule__ACT_InBr__Group__15225);
            rule__ACT_InBr__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ACT_InBr__Group__2_in_rule__ACT_InBr__Group__15228);
            rule__ACT_InBr__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_InBr__Group__1"


    // $ANTLR start "rule__ACT_InBr__Group__1__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2568:1: rule__ACT_InBr__Group__1__Impl : ( ( rule__ACT_InBr__NameAssignment_1 ) ) ;
    public final void rule__ACT_InBr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2572:1: ( ( ( rule__ACT_InBr__NameAssignment_1 ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2573:1: ( ( rule__ACT_InBr__NameAssignment_1 ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2573:1: ( ( rule__ACT_InBr__NameAssignment_1 ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2574:1: ( rule__ACT_InBr__NameAssignment_1 )
            {
             before(grammarAccess.getACT_InBrAccess().getNameAssignment_1()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2575:1: ( rule__ACT_InBr__NameAssignment_1 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2575:2: rule__ACT_InBr__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ACT_InBr__NameAssignment_1_in_rule__ACT_InBr__Group__1__Impl5255);
            rule__ACT_InBr__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getACT_InBrAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_InBr__Group__1__Impl"


    // $ANTLR start "rule__ACT_InBr__Group__2"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2585:1: rule__ACT_InBr__Group__2 : rule__ACT_InBr__Group__2__Impl rule__ACT_InBr__Group__3 ;
    public final void rule__ACT_InBr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2589:1: ( rule__ACT_InBr__Group__2__Impl rule__ACT_InBr__Group__3 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2590:2: rule__ACT_InBr__Group__2__Impl rule__ACT_InBr__Group__3
            {
            pushFollow(FOLLOW_rule__ACT_InBr__Group__2__Impl_in_rule__ACT_InBr__Group__25285);
            rule__ACT_InBr__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ACT_InBr__Group__3_in_rule__ACT_InBr__Group__25288);
            rule__ACT_InBr__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_InBr__Group__2"


    // $ANTLR start "rule__ACT_InBr__Group__2__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2597:1: rule__ACT_InBr__Group__2__Impl : ( ',' ) ;
    public final void rule__ACT_InBr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2601:1: ( ( ',' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2602:1: ( ',' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2602:1: ( ',' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2603:1: ','
            {
             before(grammarAccess.getACT_InBrAccess().getCommaKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__ACT_InBr__Group__2__Impl5316); 
             after(grammarAccess.getACT_InBrAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_InBr__Group__2__Impl"


    // $ANTLR start "rule__ACT_InBr__Group__3"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2616:1: rule__ACT_InBr__Group__3 : rule__ACT_InBr__Group__3__Impl rule__ACT_InBr__Group__4 ;
    public final void rule__ACT_InBr__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2620:1: ( rule__ACT_InBr__Group__3__Impl rule__ACT_InBr__Group__4 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2621:2: rule__ACT_InBr__Group__3__Impl rule__ACT_InBr__Group__4
            {
            pushFollow(FOLLOW_rule__ACT_InBr__Group__3__Impl_in_rule__ACT_InBr__Group__35347);
            rule__ACT_InBr__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ACT_InBr__Group__4_in_rule__ACT_InBr__Group__35350);
            rule__ACT_InBr__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_InBr__Group__3"


    // $ANTLR start "rule__ACT_InBr__Group__3__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2628:1: rule__ACT_InBr__Group__3__Impl : ( ( rule__ACT_InBr__RateAssignment_3 ) ) ;
    public final void rule__ACT_InBr__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2632:1: ( ( ( rule__ACT_InBr__RateAssignment_3 ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2633:1: ( ( rule__ACT_InBr__RateAssignment_3 ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2633:1: ( ( rule__ACT_InBr__RateAssignment_3 ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2634:1: ( rule__ACT_InBr__RateAssignment_3 )
            {
             before(grammarAccess.getACT_InBrAccess().getRateAssignment_3()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2635:1: ( rule__ACT_InBr__RateAssignment_3 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2635:2: rule__ACT_InBr__RateAssignment_3
            {
            pushFollow(FOLLOW_rule__ACT_InBr__RateAssignment_3_in_rule__ACT_InBr__Group__3__Impl5377);
            rule__ACT_InBr__RateAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getACT_InBrAccess().getRateAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_InBr__Group__3__Impl"


    // $ANTLR start "rule__ACT_InBr__Group__4"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2645:1: rule__ACT_InBr__Group__4 : rule__ACT_InBr__Group__4__Impl rule__ACT_InBr__Group__5 ;
    public final void rule__ACT_InBr__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2649:1: ( rule__ACT_InBr__Group__4__Impl rule__ACT_InBr__Group__5 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2650:2: rule__ACT_InBr__Group__4__Impl rule__ACT_InBr__Group__5
            {
            pushFollow(FOLLOW_rule__ACT_InBr__Group__4__Impl_in_rule__ACT_InBr__Group__45407);
            rule__ACT_InBr__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ACT_InBr__Group__5_in_rule__ACT_InBr__Group__45410);
            rule__ACT_InBr__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_InBr__Group__4"


    // $ANTLR start "rule__ACT_InBr__Group__4__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2657:1: rule__ACT_InBr__Group__4__Impl : ( ')@' ) ;
    public final void rule__ACT_InBr__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2661:1: ( ( ')@' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2662:1: ( ')@' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2662:1: ( ')@' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2663:1: ')@'
            {
             before(grammarAccess.getACT_InBrAccess().getRightParenthesisCommercialAtKeyword_4()); 
            match(input,36,FOLLOW_36_in_rule__ACT_InBr__Group__4__Impl5438); 
             after(grammarAccess.getACT_InBrAccess().getRightParenthesisCommercialAtKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_InBr__Group__4__Impl"


    // $ANTLR start "rule__ACT_InBr__Group__5"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2676:1: rule__ACT_InBr__Group__5 : rule__ACT_InBr__Group__5__Impl rule__ACT_InBr__Group__6 ;
    public final void rule__ACT_InBr__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2680:1: ( rule__ACT_InBr__Group__5__Impl rule__ACT_InBr__Group__6 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2681:2: rule__ACT_InBr__Group__5__Impl rule__ACT_InBr__Group__6
            {
            pushFollow(FOLLOW_rule__ACT_InBr__Group__5__Impl_in_rule__ACT_InBr__Group__55469);
            rule__ACT_InBr__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ACT_InBr__Group__6_in_rule__ACT_InBr__Group__55472);
            rule__ACT_InBr__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_InBr__Group__5"


    // $ANTLR start "rule__ACT_InBr__Group__5__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2688:1: rule__ACT_InBr__Group__5__Impl : ( 'Pr' ) ;
    public final void rule__ACT_InBr__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2692:1: ( ( 'Pr' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2693:1: ( 'Pr' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2693:1: ( 'Pr' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2694:1: 'Pr'
            {
             before(grammarAccess.getACT_InBrAccess().getPrKeyword_5()); 
            match(input,42,FOLLOW_42_in_rule__ACT_InBr__Group__5__Impl5500); 
             after(grammarAccess.getACT_InBrAccess().getPrKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_InBr__Group__5__Impl"


    // $ANTLR start "rule__ACT_InBr__Group__6"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2707:1: rule__ACT_InBr__Group__6 : rule__ACT_InBr__Group__6__Impl rule__ACT_InBr__Group__7 ;
    public final void rule__ACT_InBr__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2711:1: ( rule__ACT_InBr__Group__6__Impl rule__ACT_InBr__Group__7 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2712:2: rule__ACT_InBr__Group__6__Impl rule__ACT_InBr__Group__7
            {
            pushFollow(FOLLOW_rule__ACT_InBr__Group__6__Impl_in_rule__ACT_InBr__Group__65531);
            rule__ACT_InBr__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ACT_InBr__Group__7_in_rule__ACT_InBr__Group__65534);
            rule__ACT_InBr__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_InBr__Group__6"


    // $ANTLR start "rule__ACT_InBr__Group__6__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2719:1: rule__ACT_InBr__Group__6__Impl : ( '{' ) ;
    public final void rule__ACT_InBr__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2723:1: ( ( '{' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2724:1: ( '{' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2724:1: ( '{' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2725:1: '{'
            {
             before(grammarAccess.getACT_InBrAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,38,FOLLOW_38_in_rule__ACT_InBr__Group__6__Impl5562); 
             after(grammarAccess.getACT_InBrAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_InBr__Group__6__Impl"


    // $ANTLR start "rule__ACT_InBr__Group__7"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2738:1: rule__ACT_InBr__Group__7 : rule__ACT_InBr__Group__7__Impl rule__ACT_InBr__Group__8 ;
    public final void rule__ACT_InBr__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2742:1: ( rule__ACT_InBr__Group__7__Impl rule__ACT_InBr__Group__8 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2743:2: rule__ACT_InBr__Group__7__Impl rule__ACT_InBr__Group__8
            {
            pushFollow(FOLLOW_rule__ACT_InBr__Group__7__Impl_in_rule__ACT_InBr__Group__75593);
            rule__ACT_InBr__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ACT_InBr__Group__8_in_rule__ACT_InBr__Group__75596);
            rule__ACT_InBr__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_InBr__Group__7"


    // $ANTLR start "rule__ACT_InBr__Group__7__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2750:1: rule__ACT_InBr__Group__7__Impl : ( ( rule__ACT_InBr__ValueAssignment_7 ) ) ;
    public final void rule__ACT_InBr__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2754:1: ( ( ( rule__ACT_InBr__ValueAssignment_7 ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2755:1: ( ( rule__ACT_InBr__ValueAssignment_7 ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2755:1: ( ( rule__ACT_InBr__ValueAssignment_7 ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2756:1: ( rule__ACT_InBr__ValueAssignment_7 )
            {
             before(grammarAccess.getACT_InBrAccess().getValueAssignment_7()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2757:1: ( rule__ACT_InBr__ValueAssignment_7 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2757:2: rule__ACT_InBr__ValueAssignment_7
            {
            pushFollow(FOLLOW_rule__ACT_InBr__ValueAssignment_7_in_rule__ACT_InBr__Group__7__Impl5623);
            rule__ACT_InBr__ValueAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getACT_InBrAccess().getValueAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_InBr__Group__7__Impl"


    // $ANTLR start "rule__ACT_InBr__Group__8"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2767:1: rule__ACT_InBr__Group__8 : rule__ACT_InBr__Group__8__Impl ;
    public final void rule__ACT_InBr__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2771:1: ( rule__ACT_InBr__Group__8__Impl )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2772:2: rule__ACT_InBr__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__ACT_InBr__Group__8__Impl_in_rule__ACT_InBr__Group__85653);
            rule__ACT_InBr__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_InBr__Group__8"


    // $ANTLR start "rule__ACT_InBr__Group__8__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2778:1: rule__ACT_InBr__Group__8__Impl : ( '}.' ) ;
    public final void rule__ACT_InBr__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2782:1: ( ( '}.' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2783:1: ( '}.' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2783:1: ( '}.' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2784:1: '}.'
            {
             before(grammarAccess.getACT_InBrAccess().getRightCurlyBracketFullStopKeyword_8()); 
            match(input,39,FOLLOW_39_in_rule__ACT_InBr__Group__8__Impl5681); 
             after(grammarAccess.getACT_InBrAccess().getRightCurlyBracketFullStopKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_InBr__Group__8__Impl"


    // $ANTLR start "rule__ACT_InUni__Group__0"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2815:1: rule__ACT_InUni__Group__0 : rule__ACT_InUni__Group__0__Impl rule__ACT_InUni__Group__1 ;
    public final void rule__ACT_InUni__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2819:1: ( rule__ACT_InUni__Group__0__Impl rule__ACT_InUni__Group__1 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2820:2: rule__ACT_InUni__Group__0__Impl rule__ACT_InUni__Group__1
            {
            pushFollow(FOLLOW_rule__ACT_InUni__Group__0__Impl_in_rule__ACT_InUni__Group__05730);
            rule__ACT_InUni__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ACT_InUni__Group__1_in_rule__ACT_InUni__Group__05733);
            rule__ACT_InUni__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_InUni__Group__0"


    // $ANTLR start "rule__ACT_InUni__Group__0__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2827:1: rule__ACT_InUni__Group__0__Impl : ( '??(' ) ;
    public final void rule__ACT_InUni__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2831:1: ( ( '??(' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2832:1: ( '??(' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2832:1: ( '??(' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2833:1: '??('
            {
             before(grammarAccess.getACT_InUniAccess().getQuestionMarkQuestionMarkLeftParenthesisKeyword_0()); 
            match(input,43,FOLLOW_43_in_rule__ACT_InUni__Group__0__Impl5761); 
             after(grammarAccess.getACT_InUniAccess().getQuestionMarkQuestionMarkLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_InUni__Group__0__Impl"


    // $ANTLR start "rule__ACT_InUni__Group__1"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2846:1: rule__ACT_InUni__Group__1 : rule__ACT_InUni__Group__1__Impl rule__ACT_InUni__Group__2 ;
    public final void rule__ACT_InUni__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2850:1: ( rule__ACT_InUni__Group__1__Impl rule__ACT_InUni__Group__2 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2851:2: rule__ACT_InUni__Group__1__Impl rule__ACT_InUni__Group__2
            {
            pushFollow(FOLLOW_rule__ACT_InUni__Group__1__Impl_in_rule__ACT_InUni__Group__15792);
            rule__ACT_InUni__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ACT_InUni__Group__2_in_rule__ACT_InUni__Group__15795);
            rule__ACT_InUni__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_InUni__Group__1"


    // $ANTLR start "rule__ACT_InUni__Group__1__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2858:1: rule__ACT_InUni__Group__1__Impl : ( ( rule__ACT_InUni__NameAssignment_1 ) ) ;
    public final void rule__ACT_InUni__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2862:1: ( ( ( rule__ACT_InUni__NameAssignment_1 ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2863:1: ( ( rule__ACT_InUni__NameAssignment_1 ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2863:1: ( ( rule__ACT_InUni__NameAssignment_1 ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2864:1: ( rule__ACT_InUni__NameAssignment_1 )
            {
             before(grammarAccess.getACT_InUniAccess().getNameAssignment_1()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2865:1: ( rule__ACT_InUni__NameAssignment_1 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2865:2: rule__ACT_InUni__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ACT_InUni__NameAssignment_1_in_rule__ACT_InUni__Group__1__Impl5822);
            rule__ACT_InUni__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getACT_InUniAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_InUni__Group__1__Impl"


    // $ANTLR start "rule__ACT_InUni__Group__2"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2875:1: rule__ACT_InUni__Group__2 : rule__ACT_InUni__Group__2__Impl rule__ACT_InUni__Group__3 ;
    public final void rule__ACT_InUni__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2879:1: ( rule__ACT_InUni__Group__2__Impl rule__ACT_InUni__Group__3 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2880:2: rule__ACT_InUni__Group__2__Impl rule__ACT_InUni__Group__3
            {
            pushFollow(FOLLOW_rule__ACT_InUni__Group__2__Impl_in_rule__ACT_InUni__Group__25852);
            rule__ACT_InUni__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ACT_InUni__Group__3_in_rule__ACT_InUni__Group__25855);
            rule__ACT_InUni__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_InUni__Group__2"


    // $ANTLR start "rule__ACT_InUni__Group__2__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2887:1: rule__ACT_InUni__Group__2__Impl : ( ',' ) ;
    public final void rule__ACT_InUni__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2891:1: ( ( ',' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2892:1: ( ',' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2892:1: ( ',' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2893:1: ','
            {
             before(grammarAccess.getACT_InUniAccess().getCommaKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__ACT_InUni__Group__2__Impl5883); 
             after(grammarAccess.getACT_InUniAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_InUni__Group__2__Impl"


    // $ANTLR start "rule__ACT_InUni__Group__3"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2906:1: rule__ACT_InUni__Group__3 : rule__ACT_InUni__Group__3__Impl rule__ACT_InUni__Group__4 ;
    public final void rule__ACT_InUni__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2910:1: ( rule__ACT_InUni__Group__3__Impl rule__ACT_InUni__Group__4 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2911:2: rule__ACT_InUni__Group__3__Impl rule__ACT_InUni__Group__4
            {
            pushFollow(FOLLOW_rule__ACT_InUni__Group__3__Impl_in_rule__ACT_InUni__Group__35914);
            rule__ACT_InUni__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ACT_InUni__Group__4_in_rule__ACT_InUni__Group__35917);
            rule__ACT_InUni__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_InUni__Group__3"


    // $ANTLR start "rule__ACT_InUni__Group__3__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2918:1: rule__ACT_InUni__Group__3__Impl : ( ( rule__ACT_InUni__RateAssignment_3 ) ) ;
    public final void rule__ACT_InUni__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2922:1: ( ( ( rule__ACT_InUni__RateAssignment_3 ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2923:1: ( ( rule__ACT_InUni__RateAssignment_3 ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2923:1: ( ( rule__ACT_InUni__RateAssignment_3 ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2924:1: ( rule__ACT_InUni__RateAssignment_3 )
            {
             before(grammarAccess.getACT_InUniAccess().getRateAssignment_3()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2925:1: ( rule__ACT_InUni__RateAssignment_3 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2925:2: rule__ACT_InUni__RateAssignment_3
            {
            pushFollow(FOLLOW_rule__ACT_InUni__RateAssignment_3_in_rule__ACT_InUni__Group__3__Impl5944);
            rule__ACT_InUni__RateAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getACT_InUniAccess().getRateAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_InUni__Group__3__Impl"


    // $ANTLR start "rule__ACT_InUni__Group__4"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2935:1: rule__ACT_InUni__Group__4 : rule__ACT_InUni__Group__4__Impl rule__ACT_InUni__Group__5 ;
    public final void rule__ACT_InUni__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2939:1: ( rule__ACT_InUni__Group__4__Impl rule__ACT_InUni__Group__5 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2940:2: rule__ACT_InUni__Group__4__Impl rule__ACT_InUni__Group__5
            {
            pushFollow(FOLLOW_rule__ACT_InUni__Group__4__Impl_in_rule__ACT_InUni__Group__45974);
            rule__ACT_InUni__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ACT_InUni__Group__5_in_rule__ACT_InUni__Group__45977);
            rule__ACT_InUni__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_InUni__Group__4"


    // $ANTLR start "rule__ACT_InUni__Group__4__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2947:1: rule__ACT_InUni__Group__4__Impl : ( ')@' ) ;
    public final void rule__ACT_InUni__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2951:1: ( ( ')@' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2952:1: ( ')@' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2952:1: ( ')@' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2953:1: ')@'
            {
             before(grammarAccess.getACT_InUniAccess().getRightParenthesisCommercialAtKeyword_4()); 
            match(input,36,FOLLOW_36_in_rule__ACT_InUni__Group__4__Impl6005); 
             after(grammarAccess.getACT_InUniAccess().getRightParenthesisCommercialAtKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_InUni__Group__4__Impl"


    // $ANTLR start "rule__ACT_InUni__Group__5"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2966:1: rule__ACT_InUni__Group__5 : rule__ACT_InUni__Group__5__Impl rule__ACT_InUni__Group__6 ;
    public final void rule__ACT_InUni__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2970:1: ( rule__ACT_InUni__Group__5__Impl rule__ACT_InUni__Group__6 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2971:2: rule__ACT_InUni__Group__5__Impl rule__ACT_InUni__Group__6
            {
            pushFollow(FOLLOW_rule__ACT_InUni__Group__5__Impl_in_rule__ACT_InUni__Group__56036);
            rule__ACT_InUni__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ACT_InUni__Group__6_in_rule__ACT_InUni__Group__56039);
            rule__ACT_InUni__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_InUni__Group__5"


    // $ANTLR start "rule__ACT_InUni__Group__5__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2978:1: rule__ACT_InUni__Group__5__Impl : ( 'Wt' ) ;
    public final void rule__ACT_InUni__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2982:1: ( ( 'Wt' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2983:1: ( 'Wt' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2983:1: ( 'Wt' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2984:1: 'Wt'
            {
             before(grammarAccess.getACT_InUniAccess().getWtKeyword_5()); 
            match(input,44,FOLLOW_44_in_rule__ACT_InUni__Group__5__Impl6067); 
             after(grammarAccess.getACT_InUniAccess().getWtKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_InUni__Group__5__Impl"


    // $ANTLR start "rule__ACT_InUni__Group__6"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:2997:1: rule__ACT_InUni__Group__6 : rule__ACT_InUni__Group__6__Impl rule__ACT_InUni__Group__7 ;
    public final void rule__ACT_InUni__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3001:1: ( rule__ACT_InUni__Group__6__Impl rule__ACT_InUni__Group__7 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3002:2: rule__ACT_InUni__Group__6__Impl rule__ACT_InUni__Group__7
            {
            pushFollow(FOLLOW_rule__ACT_InUni__Group__6__Impl_in_rule__ACT_InUni__Group__66098);
            rule__ACT_InUni__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ACT_InUni__Group__7_in_rule__ACT_InUni__Group__66101);
            rule__ACT_InUni__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_InUni__Group__6"


    // $ANTLR start "rule__ACT_InUni__Group__6__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3009:1: rule__ACT_InUni__Group__6__Impl : ( '{' ) ;
    public final void rule__ACT_InUni__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3013:1: ( ( '{' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3014:1: ( '{' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3014:1: ( '{' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3015:1: '{'
            {
             before(grammarAccess.getACT_InUniAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,38,FOLLOW_38_in_rule__ACT_InUni__Group__6__Impl6129); 
             after(grammarAccess.getACT_InUniAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_InUni__Group__6__Impl"


    // $ANTLR start "rule__ACT_InUni__Group__7"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3028:1: rule__ACT_InUni__Group__7 : rule__ACT_InUni__Group__7__Impl rule__ACT_InUni__Group__8 ;
    public final void rule__ACT_InUni__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3032:1: ( rule__ACT_InUni__Group__7__Impl rule__ACT_InUni__Group__8 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3033:2: rule__ACT_InUni__Group__7__Impl rule__ACT_InUni__Group__8
            {
            pushFollow(FOLLOW_rule__ACT_InUni__Group__7__Impl_in_rule__ACT_InUni__Group__76160);
            rule__ACT_InUni__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ACT_InUni__Group__8_in_rule__ACT_InUni__Group__76163);
            rule__ACT_InUni__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_InUni__Group__7"


    // $ANTLR start "rule__ACT_InUni__Group__7__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3040:1: rule__ACT_InUni__Group__7__Impl : ( ( rule__ACT_InUni__ValueAssignment_7 ) ) ;
    public final void rule__ACT_InUni__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3044:1: ( ( ( rule__ACT_InUni__ValueAssignment_7 ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3045:1: ( ( rule__ACT_InUni__ValueAssignment_7 ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3045:1: ( ( rule__ACT_InUni__ValueAssignment_7 ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3046:1: ( rule__ACT_InUni__ValueAssignment_7 )
            {
             before(grammarAccess.getACT_InUniAccess().getValueAssignment_7()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3047:1: ( rule__ACT_InUni__ValueAssignment_7 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3047:2: rule__ACT_InUni__ValueAssignment_7
            {
            pushFollow(FOLLOW_rule__ACT_InUni__ValueAssignment_7_in_rule__ACT_InUni__Group__7__Impl6190);
            rule__ACT_InUni__ValueAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getACT_InUniAccess().getValueAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_InUni__Group__7__Impl"


    // $ANTLR start "rule__ACT_InUni__Group__8"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3057:1: rule__ACT_InUni__Group__8 : rule__ACT_InUni__Group__8__Impl ;
    public final void rule__ACT_InUni__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3061:1: ( rule__ACT_InUni__Group__8__Impl )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3062:2: rule__ACT_InUni__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__ACT_InUni__Group__8__Impl_in_rule__ACT_InUni__Group__86220);
            rule__ACT_InUni__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_InUni__Group__8"


    // $ANTLR start "rule__ACT_InUni__Group__8__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3068:1: rule__ACT_InUni__Group__8__Impl : ( '}.' ) ;
    public final void rule__ACT_InUni__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3072:1: ( ( '}.' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3073:1: ( '}.' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3073:1: ( '}.' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3074:1: '}.'
            {
             before(grammarAccess.getACT_InUniAccess().getRightCurlyBracketFullStopKeyword_8()); 
            match(input,39,FOLLOW_39_in_rule__ACT_InUni__Group__8__Impl6248); 
             after(grammarAccess.getACT_InUniAccess().getRightCurlyBracketFullStopKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_InUni__Group__8__Impl"


    // $ANTLR start "rule__IRange__Group_2__0"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3105:1: rule__IRange__Group_2__0 : rule__IRange__Group_2__0__Impl rule__IRange__Group_2__1 ;
    public final void rule__IRange__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3109:1: ( rule__IRange__Group_2__0__Impl rule__IRange__Group_2__1 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3110:2: rule__IRange__Group_2__0__Impl rule__IRange__Group_2__1
            {
            pushFollow(FOLLOW_rule__IRange__Group_2__0__Impl_in_rule__IRange__Group_2__06297);
            rule__IRange__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IRange__Group_2__1_in_rule__IRange__Group_2__06300);
            rule__IRange__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IRange__Group_2__0"


    // $ANTLR start "rule__IRange__Group_2__0__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3117:1: rule__IRange__Group_2__0__Impl : ( 'range' ) ;
    public final void rule__IRange__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3121:1: ( ( 'range' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3122:1: ( 'range' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3122:1: ( 'range' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3123:1: 'range'
            {
             before(grammarAccess.getIRangeAccess().getRangeKeyword_2_0()); 
            match(input,45,FOLLOW_45_in_rule__IRange__Group_2__0__Impl6328); 
             after(grammarAccess.getIRangeAccess().getRangeKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IRange__Group_2__0__Impl"


    // $ANTLR start "rule__IRange__Group_2__1"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3136:1: rule__IRange__Group_2__1 : rule__IRange__Group_2__1__Impl rule__IRange__Group_2__2 ;
    public final void rule__IRange__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3140:1: ( rule__IRange__Group_2__1__Impl rule__IRange__Group_2__2 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3141:2: rule__IRange__Group_2__1__Impl rule__IRange__Group_2__2
            {
            pushFollow(FOLLOW_rule__IRange__Group_2__1__Impl_in_rule__IRange__Group_2__16359);
            rule__IRange__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IRange__Group_2__2_in_rule__IRange__Group_2__16362);
            rule__IRange__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IRange__Group_2__1"


    // $ANTLR start "rule__IRange__Group_2__1__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3148:1: rule__IRange__Group_2__1__Impl : ( '(' ) ;
    public final void rule__IRange__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3152:1: ( ( '(' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3153:1: ( '(' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3153:1: ( '(' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3154:1: '('
            {
             before(grammarAccess.getIRangeAccess().getLeftParenthesisKeyword_2_1()); 
            match(input,31,FOLLOW_31_in_rule__IRange__Group_2__1__Impl6390); 
             after(grammarAccess.getIRangeAccess().getLeftParenthesisKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IRange__Group_2__1__Impl"


    // $ANTLR start "rule__IRange__Group_2__2"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3167:1: rule__IRange__Group_2__2 : rule__IRange__Group_2__2__Impl rule__IRange__Group_2__3 ;
    public final void rule__IRange__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3171:1: ( rule__IRange__Group_2__2__Impl rule__IRange__Group_2__3 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3172:2: rule__IRange__Group_2__2__Impl rule__IRange__Group_2__3
            {
            pushFollow(FOLLOW_rule__IRange__Group_2__2__Impl_in_rule__IRange__Group_2__26421);
            rule__IRange__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IRange__Group_2__3_in_rule__IRange__Group_2__26424);
            rule__IRange__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IRange__Group_2__2"


    // $ANTLR start "rule__IRange__Group_2__2__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3179:1: rule__IRange__Group_2__2__Impl : ( ruleRATE_Expr ) ;
    public final void rule__IRange__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3183:1: ( ( ruleRATE_Expr ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3184:1: ( ruleRATE_Expr )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3184:1: ( ruleRATE_Expr )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3185:1: ruleRATE_Expr
            {
             before(grammarAccess.getIRangeAccess().getRATE_ExprParserRuleCall_2_2()); 
            pushFollow(FOLLOW_ruleRATE_Expr_in_rule__IRange__Group_2__2__Impl6451);
            ruleRATE_Expr();

            state._fsp--;

             after(grammarAccess.getIRangeAccess().getRATE_ExprParserRuleCall_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IRange__Group_2__2__Impl"


    // $ANTLR start "rule__IRange__Group_2__3"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3196:1: rule__IRange__Group_2__3 : rule__IRange__Group_2__3__Impl ;
    public final void rule__IRange__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3200:1: ( rule__IRange__Group_2__3__Impl )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3201:2: rule__IRange__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__IRange__Group_2__3__Impl_in_rule__IRange__Group_2__36480);
            rule__IRange__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IRange__Group_2__3"


    // $ANTLR start "rule__IRange__Group_2__3__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3207:1: rule__IRange__Group_2__3__Impl : ( ')' ) ;
    public final void rule__IRange__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3211:1: ( ( ')' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3212:1: ( ')' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3212:1: ( ')' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3213:1: ')'
            {
             before(grammarAccess.getIRangeAccess().getRightParenthesisKeyword_2_3()); 
            match(input,33,FOLLOW_33_in_rule__IRange__Group_2__3__Impl6508); 
             after(grammarAccess.getIRangeAccess().getRightParenthesisKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IRange__Group_2__3__Impl"


    // $ANTLR start "rule__IRange__Group_3__0"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3234:1: rule__IRange__Group_3__0 : rule__IRange__Group_3__0__Impl rule__IRange__Group_3__1 ;
    public final void rule__IRange__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3238:1: ( rule__IRange__Group_3__0__Impl rule__IRange__Group_3__1 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3239:2: rule__IRange__Group_3__0__Impl rule__IRange__Group_3__1
            {
            pushFollow(FOLLOW_rule__IRange__Group_3__0__Impl_in_rule__IRange__Group_3__06547);
            rule__IRange__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IRange__Group_3__1_in_rule__IRange__Group_3__06550);
            rule__IRange__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IRange__Group_3__0"


    // $ANTLR start "rule__IRange__Group_3__0__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3246:1: rule__IRange__Group_3__0__Impl : ( ruleLOC ) ;
    public final void rule__IRange__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3250:1: ( ( ruleLOC ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3251:1: ( ruleLOC )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3251:1: ( ruleLOC )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3252:1: ruleLOC
            {
             before(grammarAccess.getIRangeAccess().getLOCParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleLOC_in_rule__IRange__Group_3__0__Impl6577);
            ruleLOC();

            state._fsp--;

             after(grammarAccess.getIRangeAccess().getLOCParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IRange__Group_3__0__Impl"


    // $ANTLR start "rule__IRange__Group_3__1"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3263:1: rule__IRange__Group_3__1 : rule__IRange__Group_3__1__Impl ;
    public final void rule__IRange__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3267:1: ( rule__IRange__Group_3__1__Impl )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3268:2: rule__IRange__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__IRange__Group_3__1__Impl_in_rule__IRange__Group_3__16606);
            rule__IRange__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IRange__Group_3__1"


    // $ANTLR start "rule__IRange__Group_3__1__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3274:1: rule__IRange__Group_3__1__Impl : ( ( rule__IRange__Group_3_1__0 )* ) ;
    public final void rule__IRange__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3278:1: ( ( ( rule__IRange__Group_3_1__0 )* ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3279:1: ( ( rule__IRange__Group_3_1__0 )* )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3279:1: ( ( rule__IRange__Group_3_1__0 )* )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3280:1: ( rule__IRange__Group_3_1__0 )*
            {
             before(grammarAccess.getIRangeAccess().getGroup_3_1()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3281:1: ( rule__IRange__Group_3_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==32) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3281:2: rule__IRange__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__IRange__Group_3_1__0_in_rule__IRange__Group_3__1__Impl6633);
            	    rule__IRange__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getIRangeAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IRange__Group_3__1__Impl"


    // $ANTLR start "rule__IRange__Group_3_1__0"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3295:1: rule__IRange__Group_3_1__0 : rule__IRange__Group_3_1__0__Impl rule__IRange__Group_3_1__1 ;
    public final void rule__IRange__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3299:1: ( rule__IRange__Group_3_1__0__Impl rule__IRange__Group_3_1__1 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3300:2: rule__IRange__Group_3_1__0__Impl rule__IRange__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__IRange__Group_3_1__0__Impl_in_rule__IRange__Group_3_1__06668);
            rule__IRange__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IRange__Group_3_1__1_in_rule__IRange__Group_3_1__06671);
            rule__IRange__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IRange__Group_3_1__0"


    // $ANTLR start "rule__IRange__Group_3_1__0__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3307:1: rule__IRange__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__IRange__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3311:1: ( ( ',' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3312:1: ( ',' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3312:1: ( ',' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3313:1: ','
            {
             before(grammarAccess.getIRangeAccess().getCommaKeyword_3_1_0()); 
            match(input,32,FOLLOW_32_in_rule__IRange__Group_3_1__0__Impl6699); 
             after(grammarAccess.getIRangeAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IRange__Group_3_1__0__Impl"


    // $ANTLR start "rule__IRange__Group_3_1__1"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3326:1: rule__IRange__Group_3_1__1 : rule__IRange__Group_3_1__1__Impl ;
    public final void rule__IRange__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3330:1: ( rule__IRange__Group_3_1__1__Impl )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3331:2: rule__IRange__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__IRange__Group_3_1__1__Impl_in_rule__IRange__Group_3_1__16730);
            rule__IRange__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IRange__Group_3_1__1"


    // $ANTLR start "rule__IRange__Group_3_1__1__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3337:1: rule__IRange__Group_3_1__1__Impl : ( ruleLOC ) ;
    public final void rule__IRange__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3341:1: ( ( ruleLOC ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3342:1: ( ruleLOC )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3342:1: ( ruleLOC )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3343:1: ruleLOC
            {
             before(grammarAccess.getIRangeAccess().getLOCParserRuleCall_3_1_1()); 
            pushFollow(FOLLOW_ruleLOC_in_rule__IRange__Group_3_1__1__Impl6757);
            ruleLOC();

            state._fsp--;

             after(grammarAccess.getIRangeAccess().getLOCParserRuleCall_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IRange__Group_3_1__1__Impl"


    // $ANTLR start "rule__PR_Expr__Group__0"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3358:1: rule__PR_Expr__Group__0 : rule__PR_Expr__Group__0__Impl rule__PR_Expr__Group__1 ;
    public final void rule__PR_Expr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3362:1: ( rule__PR_Expr__Group__0__Impl rule__PR_Expr__Group__1 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3363:2: rule__PR_Expr__Group__0__Impl rule__PR_Expr__Group__1
            {
            pushFollow(FOLLOW_rule__PR_Expr__Group__0__Impl_in_rule__PR_Expr__Group__06790);
            rule__PR_Expr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PR_Expr__Group__1_in_rule__PR_Expr__Group__06793);
            rule__PR_Expr__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PR_Expr__Group__0"


    // $ANTLR start "rule__PR_Expr__Group__0__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3370:1: rule__PR_Expr__Group__0__Impl : ( ( rule__PR_Expr__PrEAssignment_0 ) ) ;
    public final void rule__PR_Expr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3374:1: ( ( ( rule__PR_Expr__PrEAssignment_0 ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3375:1: ( ( rule__PR_Expr__PrEAssignment_0 ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3375:1: ( ( rule__PR_Expr__PrEAssignment_0 ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3376:1: ( rule__PR_Expr__PrEAssignment_0 )
            {
             before(grammarAccess.getPR_ExprAccess().getPrEAssignment_0()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3377:1: ( rule__PR_Expr__PrEAssignment_0 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3377:2: rule__PR_Expr__PrEAssignment_0
            {
            pushFollow(FOLLOW_rule__PR_Expr__PrEAssignment_0_in_rule__PR_Expr__Group__0__Impl6820);
            rule__PR_Expr__PrEAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPR_ExprAccess().getPrEAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PR_Expr__Group__0__Impl"


    // $ANTLR start "rule__PR_Expr__Group__1"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3387:1: rule__PR_Expr__Group__1 : rule__PR_Expr__Group__1__Impl ;
    public final void rule__PR_Expr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3391:1: ( rule__PR_Expr__Group__1__Impl )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3392:2: rule__PR_Expr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PR_Expr__Group__1__Impl_in_rule__PR_Expr__Group__16850);
            rule__PR_Expr__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PR_Expr__Group__1"


    // $ANTLR start "rule__PR_Expr__Group__1__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3398:1: rule__PR_Expr__Group__1__Impl : ( ( rule__PR_Expr__Group_1__0 )* ) ;
    public final void rule__PR_Expr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3402:1: ( ( ( rule__PR_Expr__Group_1__0 )* ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3403:1: ( ( rule__PR_Expr__Group_1__0 )* )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3403:1: ( ( rule__PR_Expr__Group_1__0 )* )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3404:1: ( rule__PR_Expr__Group_1__0 )*
            {
             before(grammarAccess.getPR_ExprAccess().getGroup_1()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3405:1: ( rule__PR_Expr__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=18 && LA16_0<=23)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3405:2: rule__PR_Expr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__PR_Expr__Group_1__0_in_rule__PR_Expr__Group__1__Impl6877);
            	    rule__PR_Expr__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getPR_ExprAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PR_Expr__Group__1__Impl"


    // $ANTLR start "rule__PR_Expr__Group_1__0"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3419:1: rule__PR_Expr__Group_1__0 : rule__PR_Expr__Group_1__0__Impl rule__PR_Expr__Group_1__1 ;
    public final void rule__PR_Expr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3423:1: ( rule__PR_Expr__Group_1__0__Impl rule__PR_Expr__Group_1__1 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3424:2: rule__PR_Expr__Group_1__0__Impl rule__PR_Expr__Group_1__1
            {
            pushFollow(FOLLOW_rule__PR_Expr__Group_1__0__Impl_in_rule__PR_Expr__Group_1__06912);
            rule__PR_Expr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PR_Expr__Group_1__1_in_rule__PR_Expr__Group_1__06915);
            rule__PR_Expr__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PR_Expr__Group_1__0"


    // $ANTLR start "rule__PR_Expr__Group_1__0__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3431:1: rule__PR_Expr__Group_1__0__Impl : ( ruleMATH_OP ) ;
    public final void rule__PR_Expr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3435:1: ( ( ruleMATH_OP ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3436:1: ( ruleMATH_OP )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3436:1: ( ruleMATH_OP )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3437:1: ruleMATH_OP
            {
             before(grammarAccess.getPR_ExprAccess().getMATH_OPParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMATH_OP_in_rule__PR_Expr__Group_1__0__Impl6942);
            ruleMATH_OP();

            state._fsp--;

             after(grammarAccess.getPR_ExprAccess().getMATH_OPParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PR_Expr__Group_1__0__Impl"


    // $ANTLR start "rule__PR_Expr__Group_1__1"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3448:1: rule__PR_Expr__Group_1__1 : rule__PR_Expr__Group_1__1__Impl ;
    public final void rule__PR_Expr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3452:1: ( rule__PR_Expr__Group_1__1__Impl )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3453:2: rule__PR_Expr__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PR_Expr__Group_1__1__Impl_in_rule__PR_Expr__Group_1__16971);
            rule__PR_Expr__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PR_Expr__Group_1__1"


    // $ANTLR start "rule__PR_Expr__Group_1__1__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3459:1: rule__PR_Expr__Group_1__1__Impl : ( ( rule__PR_Expr__PrEAssignment_1_1 ) ) ;
    public final void rule__PR_Expr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3463:1: ( ( ( rule__PR_Expr__PrEAssignment_1_1 ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3464:1: ( ( rule__PR_Expr__PrEAssignment_1_1 ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3464:1: ( ( rule__PR_Expr__PrEAssignment_1_1 ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3465:1: ( rule__PR_Expr__PrEAssignment_1_1 )
            {
             before(grammarAccess.getPR_ExprAccess().getPrEAssignment_1_1()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3466:1: ( rule__PR_Expr__PrEAssignment_1_1 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3466:2: rule__PR_Expr__PrEAssignment_1_1
            {
            pushFollow(FOLLOW_rule__PR_Expr__PrEAssignment_1_1_in_rule__PR_Expr__Group_1__1__Impl6998);
            rule__PR_Expr__PrEAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPR_ExprAccess().getPrEAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PR_Expr__Group_1__1__Impl"


    // $ANTLR start "rule__Terminal_PR_Expr__Group_0__0"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3480:1: rule__Terminal_PR_Expr__Group_0__0 : rule__Terminal_PR_Expr__Group_0__0__Impl rule__Terminal_PR_Expr__Group_0__1 ;
    public final void rule__Terminal_PR_Expr__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3484:1: ( rule__Terminal_PR_Expr__Group_0__0__Impl rule__Terminal_PR_Expr__Group_0__1 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3485:2: rule__Terminal_PR_Expr__Group_0__0__Impl rule__Terminal_PR_Expr__Group_0__1
            {
            pushFollow(FOLLOW_rule__Terminal_PR_Expr__Group_0__0__Impl_in_rule__Terminal_PR_Expr__Group_0__07032);
            rule__Terminal_PR_Expr__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Terminal_PR_Expr__Group_0__1_in_rule__Terminal_PR_Expr__Group_0__07035);
            rule__Terminal_PR_Expr__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal_PR_Expr__Group_0__0"


    // $ANTLR start "rule__Terminal_PR_Expr__Group_0__0__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3492:1: rule__Terminal_PR_Expr__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Terminal_PR_Expr__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3496:1: ( ( '(' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3497:1: ( '(' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3497:1: ( '(' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3498:1: '('
            {
             before(grammarAccess.getTerminal_PR_ExprAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,31,FOLLOW_31_in_rule__Terminal_PR_Expr__Group_0__0__Impl7063); 
             after(grammarAccess.getTerminal_PR_ExprAccess().getLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal_PR_Expr__Group_0__0__Impl"


    // $ANTLR start "rule__Terminal_PR_Expr__Group_0__1"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3511:1: rule__Terminal_PR_Expr__Group_0__1 : rule__Terminal_PR_Expr__Group_0__1__Impl rule__Terminal_PR_Expr__Group_0__2 ;
    public final void rule__Terminal_PR_Expr__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3515:1: ( rule__Terminal_PR_Expr__Group_0__1__Impl rule__Terminal_PR_Expr__Group_0__2 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3516:2: rule__Terminal_PR_Expr__Group_0__1__Impl rule__Terminal_PR_Expr__Group_0__2
            {
            pushFollow(FOLLOW_rule__Terminal_PR_Expr__Group_0__1__Impl_in_rule__Terminal_PR_Expr__Group_0__17094);
            rule__Terminal_PR_Expr__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Terminal_PR_Expr__Group_0__2_in_rule__Terminal_PR_Expr__Group_0__17097);
            rule__Terminal_PR_Expr__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal_PR_Expr__Group_0__1"


    // $ANTLR start "rule__Terminal_PR_Expr__Group_0__1__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3523:1: rule__Terminal_PR_Expr__Group_0__1__Impl : ( rulePR_Expr ) ;
    public final void rule__Terminal_PR_Expr__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3527:1: ( ( rulePR_Expr ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3528:1: ( rulePR_Expr )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3528:1: ( rulePR_Expr )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3529:1: rulePR_Expr
            {
             before(grammarAccess.getTerminal_PR_ExprAccess().getPR_ExprParserRuleCall_0_1()); 
            pushFollow(FOLLOW_rulePR_Expr_in_rule__Terminal_PR_Expr__Group_0__1__Impl7124);
            rulePR_Expr();

            state._fsp--;

             after(grammarAccess.getTerminal_PR_ExprAccess().getPR_ExprParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal_PR_Expr__Group_0__1__Impl"


    // $ANTLR start "rule__Terminal_PR_Expr__Group_0__2"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3540:1: rule__Terminal_PR_Expr__Group_0__2 : rule__Terminal_PR_Expr__Group_0__2__Impl ;
    public final void rule__Terminal_PR_Expr__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3544:1: ( rule__Terminal_PR_Expr__Group_0__2__Impl )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3545:2: rule__Terminal_PR_Expr__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Terminal_PR_Expr__Group_0__2__Impl_in_rule__Terminal_PR_Expr__Group_0__27153);
            rule__Terminal_PR_Expr__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal_PR_Expr__Group_0__2"


    // $ANTLR start "rule__Terminal_PR_Expr__Group_0__2__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3551:1: rule__Terminal_PR_Expr__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Terminal_PR_Expr__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3555:1: ( ( ')' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3556:1: ( ')' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3556:1: ( ')' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3557:1: ')'
            {
             before(grammarAccess.getTerminal_PR_ExprAccess().getRightParenthesisKeyword_0_2()); 
            match(input,33,FOLLOW_33_in_rule__Terminal_PR_Expr__Group_0__2__Impl7181); 
             after(grammarAccess.getTerminal_PR_ExprAccess().getRightParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal_PR_Expr__Group_0__2__Impl"


    // $ANTLR start "rule__RATE_Expr__Group__0"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3576:1: rule__RATE_Expr__Group__0 : rule__RATE_Expr__Group__0__Impl rule__RATE_Expr__Group__1 ;
    public final void rule__RATE_Expr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3580:1: ( rule__RATE_Expr__Group__0__Impl rule__RATE_Expr__Group__1 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3581:2: rule__RATE_Expr__Group__0__Impl rule__RATE_Expr__Group__1
            {
            pushFollow(FOLLOW_rule__RATE_Expr__Group__0__Impl_in_rule__RATE_Expr__Group__07218);
            rule__RATE_Expr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RATE_Expr__Group__1_in_rule__RATE_Expr__Group__07221);
            rule__RATE_Expr__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RATE_Expr__Group__0"


    // $ANTLR start "rule__RATE_Expr__Group__0__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3588:1: rule__RATE_Expr__Group__0__Impl : ( ( rule__RATE_Expr__RtAssignment_0 ) ) ;
    public final void rule__RATE_Expr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3592:1: ( ( ( rule__RATE_Expr__RtAssignment_0 ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3593:1: ( ( rule__RATE_Expr__RtAssignment_0 ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3593:1: ( ( rule__RATE_Expr__RtAssignment_0 ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3594:1: ( rule__RATE_Expr__RtAssignment_0 )
            {
             before(grammarAccess.getRATE_ExprAccess().getRtAssignment_0()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3595:1: ( rule__RATE_Expr__RtAssignment_0 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3595:2: rule__RATE_Expr__RtAssignment_0
            {
            pushFollow(FOLLOW_rule__RATE_Expr__RtAssignment_0_in_rule__RATE_Expr__Group__0__Impl7248);
            rule__RATE_Expr__RtAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRATE_ExprAccess().getRtAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RATE_Expr__Group__0__Impl"


    // $ANTLR start "rule__RATE_Expr__Group__1"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3605:1: rule__RATE_Expr__Group__1 : rule__RATE_Expr__Group__1__Impl ;
    public final void rule__RATE_Expr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3609:1: ( rule__RATE_Expr__Group__1__Impl )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3610:2: rule__RATE_Expr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__RATE_Expr__Group__1__Impl_in_rule__RATE_Expr__Group__17278);
            rule__RATE_Expr__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RATE_Expr__Group__1"


    // $ANTLR start "rule__RATE_Expr__Group__1__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3616:1: rule__RATE_Expr__Group__1__Impl : ( ( rule__RATE_Expr__Group_1__0 )* ) ;
    public final void rule__RATE_Expr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3620:1: ( ( ( rule__RATE_Expr__Group_1__0 )* ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3621:1: ( ( rule__RATE_Expr__Group_1__0 )* )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3621:1: ( ( rule__RATE_Expr__Group_1__0 )* )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3622:1: ( rule__RATE_Expr__Group_1__0 )*
            {
             before(grammarAccess.getRATE_ExprAccess().getGroup_1()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3623:1: ( rule__RATE_Expr__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=18 && LA17_0<=23)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3623:2: rule__RATE_Expr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__RATE_Expr__Group_1__0_in_rule__RATE_Expr__Group__1__Impl7305);
            	    rule__RATE_Expr__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getRATE_ExprAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RATE_Expr__Group__1__Impl"


    // $ANTLR start "rule__RATE_Expr__Group_1__0"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3637:1: rule__RATE_Expr__Group_1__0 : rule__RATE_Expr__Group_1__0__Impl rule__RATE_Expr__Group_1__1 ;
    public final void rule__RATE_Expr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3641:1: ( rule__RATE_Expr__Group_1__0__Impl rule__RATE_Expr__Group_1__1 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3642:2: rule__RATE_Expr__Group_1__0__Impl rule__RATE_Expr__Group_1__1
            {
            pushFollow(FOLLOW_rule__RATE_Expr__Group_1__0__Impl_in_rule__RATE_Expr__Group_1__07340);
            rule__RATE_Expr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RATE_Expr__Group_1__1_in_rule__RATE_Expr__Group_1__07343);
            rule__RATE_Expr__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RATE_Expr__Group_1__0"


    // $ANTLR start "rule__RATE_Expr__Group_1__0__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3649:1: rule__RATE_Expr__Group_1__0__Impl : ( ruleMATH_OP ) ;
    public final void rule__RATE_Expr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3653:1: ( ( ruleMATH_OP ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3654:1: ( ruleMATH_OP )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3654:1: ( ruleMATH_OP )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3655:1: ruleMATH_OP
            {
             before(grammarAccess.getRATE_ExprAccess().getMATH_OPParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMATH_OP_in_rule__RATE_Expr__Group_1__0__Impl7370);
            ruleMATH_OP();

            state._fsp--;

             after(grammarAccess.getRATE_ExprAccess().getMATH_OPParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RATE_Expr__Group_1__0__Impl"


    // $ANTLR start "rule__RATE_Expr__Group_1__1"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3666:1: rule__RATE_Expr__Group_1__1 : rule__RATE_Expr__Group_1__1__Impl ;
    public final void rule__RATE_Expr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3670:1: ( rule__RATE_Expr__Group_1__1__Impl )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3671:2: rule__RATE_Expr__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__RATE_Expr__Group_1__1__Impl_in_rule__RATE_Expr__Group_1__17399);
            rule__RATE_Expr__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RATE_Expr__Group_1__1"


    // $ANTLR start "rule__RATE_Expr__Group_1__1__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3677:1: rule__RATE_Expr__Group_1__1__Impl : ( ( rule__RATE_Expr__RtAssignment_1_1 ) ) ;
    public final void rule__RATE_Expr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3681:1: ( ( ( rule__RATE_Expr__RtAssignment_1_1 ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3682:1: ( ( rule__RATE_Expr__RtAssignment_1_1 ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3682:1: ( ( rule__RATE_Expr__RtAssignment_1_1 ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3683:1: ( rule__RATE_Expr__RtAssignment_1_1 )
            {
             before(grammarAccess.getRATE_ExprAccess().getRtAssignment_1_1()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3684:1: ( rule__RATE_Expr__RtAssignment_1_1 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3684:2: rule__RATE_Expr__RtAssignment_1_1
            {
            pushFollow(FOLLOW_rule__RATE_Expr__RtAssignment_1_1_in_rule__RATE_Expr__Group_1__1__Impl7426);
            rule__RATE_Expr__RtAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRATE_ExprAccess().getRtAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RATE_Expr__Group_1__1__Impl"


    // $ANTLR start "rule__Terminal_RATE_Expr__Group_0__0"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3698:1: rule__Terminal_RATE_Expr__Group_0__0 : rule__Terminal_RATE_Expr__Group_0__0__Impl rule__Terminal_RATE_Expr__Group_0__1 ;
    public final void rule__Terminal_RATE_Expr__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3702:1: ( rule__Terminal_RATE_Expr__Group_0__0__Impl rule__Terminal_RATE_Expr__Group_0__1 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3703:2: rule__Terminal_RATE_Expr__Group_0__0__Impl rule__Terminal_RATE_Expr__Group_0__1
            {
            pushFollow(FOLLOW_rule__Terminal_RATE_Expr__Group_0__0__Impl_in_rule__Terminal_RATE_Expr__Group_0__07460);
            rule__Terminal_RATE_Expr__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Terminal_RATE_Expr__Group_0__1_in_rule__Terminal_RATE_Expr__Group_0__07463);
            rule__Terminal_RATE_Expr__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal_RATE_Expr__Group_0__0"


    // $ANTLR start "rule__Terminal_RATE_Expr__Group_0__0__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3710:1: rule__Terminal_RATE_Expr__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Terminal_RATE_Expr__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3714:1: ( ( '(' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3715:1: ( '(' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3715:1: ( '(' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3716:1: '('
            {
             before(grammarAccess.getTerminal_RATE_ExprAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,31,FOLLOW_31_in_rule__Terminal_RATE_Expr__Group_0__0__Impl7491); 
             after(grammarAccess.getTerminal_RATE_ExprAccess().getLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal_RATE_Expr__Group_0__0__Impl"


    // $ANTLR start "rule__Terminal_RATE_Expr__Group_0__1"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3729:1: rule__Terminal_RATE_Expr__Group_0__1 : rule__Terminal_RATE_Expr__Group_0__1__Impl rule__Terminal_RATE_Expr__Group_0__2 ;
    public final void rule__Terminal_RATE_Expr__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3733:1: ( rule__Terminal_RATE_Expr__Group_0__1__Impl rule__Terminal_RATE_Expr__Group_0__2 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3734:2: rule__Terminal_RATE_Expr__Group_0__1__Impl rule__Terminal_RATE_Expr__Group_0__2
            {
            pushFollow(FOLLOW_rule__Terminal_RATE_Expr__Group_0__1__Impl_in_rule__Terminal_RATE_Expr__Group_0__17522);
            rule__Terminal_RATE_Expr__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Terminal_RATE_Expr__Group_0__2_in_rule__Terminal_RATE_Expr__Group_0__17525);
            rule__Terminal_RATE_Expr__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal_RATE_Expr__Group_0__1"


    // $ANTLR start "rule__Terminal_RATE_Expr__Group_0__1__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3741:1: rule__Terminal_RATE_Expr__Group_0__1__Impl : ( ruleRATE_Expr ) ;
    public final void rule__Terminal_RATE_Expr__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3745:1: ( ( ruleRATE_Expr ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3746:1: ( ruleRATE_Expr )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3746:1: ( ruleRATE_Expr )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3747:1: ruleRATE_Expr
            {
             before(grammarAccess.getTerminal_RATE_ExprAccess().getRATE_ExprParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleRATE_Expr_in_rule__Terminal_RATE_Expr__Group_0__1__Impl7552);
            ruleRATE_Expr();

            state._fsp--;

             after(grammarAccess.getTerminal_RATE_ExprAccess().getRATE_ExprParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal_RATE_Expr__Group_0__1__Impl"


    // $ANTLR start "rule__Terminal_RATE_Expr__Group_0__2"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3758:1: rule__Terminal_RATE_Expr__Group_0__2 : rule__Terminal_RATE_Expr__Group_0__2__Impl ;
    public final void rule__Terminal_RATE_Expr__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3762:1: ( rule__Terminal_RATE_Expr__Group_0__2__Impl )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3763:2: rule__Terminal_RATE_Expr__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Terminal_RATE_Expr__Group_0__2__Impl_in_rule__Terminal_RATE_Expr__Group_0__27581);
            rule__Terminal_RATE_Expr__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal_RATE_Expr__Group_0__2"


    // $ANTLR start "rule__Terminal_RATE_Expr__Group_0__2__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3769:1: rule__Terminal_RATE_Expr__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Terminal_RATE_Expr__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3773:1: ( ( ')' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3774:1: ( ')' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3774:1: ( ')' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3775:1: ')'
            {
             before(grammarAccess.getTerminal_RATE_ExprAccess().getRightParenthesisKeyword_0_2()); 
            match(input,33,FOLLOW_33_in_rule__Terminal_RATE_Expr__Group_0__2__Impl7609); 
             after(grammarAccess.getTerminal_RATE_ExprAccess().getRightParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal_RATE_Expr__Group_0__2__Impl"


    // $ANTLR start "rule__Dist__Group__0"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3794:1: rule__Dist__Group__0 : rule__Dist__Group__0__Impl rule__Dist__Group__1 ;
    public final void rule__Dist__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3798:1: ( rule__Dist__Group__0__Impl rule__Dist__Group__1 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3799:2: rule__Dist__Group__0__Impl rule__Dist__Group__1
            {
            pushFollow(FOLLOW_rule__Dist__Group__0__Impl_in_rule__Dist__Group__07646);
            rule__Dist__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Dist__Group__1_in_rule__Dist__Group__07649);
            rule__Dist__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dist__Group__0"


    // $ANTLR start "rule__Dist__Group__0__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3806:1: rule__Dist__Group__0__Impl : ( 'dist' ) ;
    public final void rule__Dist__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3810:1: ( ( 'dist' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3811:1: ( 'dist' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3811:1: ( 'dist' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3812:1: 'dist'
            {
             before(grammarAccess.getDistAccess().getDistKeyword_0()); 
            match(input,46,FOLLOW_46_in_rule__Dist__Group__0__Impl7677); 
             after(grammarAccess.getDistAccess().getDistKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dist__Group__0__Impl"


    // $ANTLR start "rule__Dist__Group__1"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3825:1: rule__Dist__Group__1 : rule__Dist__Group__1__Impl rule__Dist__Group__2 ;
    public final void rule__Dist__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3829:1: ( rule__Dist__Group__1__Impl rule__Dist__Group__2 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3830:2: rule__Dist__Group__1__Impl rule__Dist__Group__2
            {
            pushFollow(FOLLOW_rule__Dist__Group__1__Impl_in_rule__Dist__Group__17708);
            rule__Dist__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Dist__Group__2_in_rule__Dist__Group__17711);
            rule__Dist__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dist__Group__1"


    // $ANTLR start "rule__Dist__Group__1__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3837:1: rule__Dist__Group__1__Impl : ( '(' ) ;
    public final void rule__Dist__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3841:1: ( ( '(' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3842:1: ( '(' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3842:1: ( '(' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3843:1: '('
            {
             before(grammarAccess.getDistAccess().getLeftParenthesisKeyword_1()); 
            match(input,31,FOLLOW_31_in_rule__Dist__Group__1__Impl7739); 
             after(grammarAccess.getDistAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dist__Group__1__Impl"


    // $ANTLR start "rule__Dist__Group__2"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3856:1: rule__Dist__Group__2 : rule__Dist__Group__2__Impl rule__Dist__Group__3 ;
    public final void rule__Dist__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3860:1: ( rule__Dist__Group__2__Impl rule__Dist__Group__3 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3861:2: rule__Dist__Group__2__Impl rule__Dist__Group__3
            {
            pushFollow(FOLLOW_rule__Dist__Group__2__Impl_in_rule__Dist__Group__27770);
            rule__Dist__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Dist__Group__3_in_rule__Dist__Group__27773);
            rule__Dist__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dist__Group__2"


    // $ANTLR start "rule__Dist__Group__2__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3868:1: rule__Dist__Group__2__Impl : ( ( rule__Dist__Alternatives_2 ) ) ;
    public final void rule__Dist__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3872:1: ( ( ( rule__Dist__Alternatives_2 ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3873:1: ( ( rule__Dist__Alternatives_2 ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3873:1: ( ( rule__Dist__Alternatives_2 ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3874:1: ( rule__Dist__Alternatives_2 )
            {
             before(grammarAccess.getDistAccess().getAlternatives_2()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3875:1: ( rule__Dist__Alternatives_2 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3875:2: rule__Dist__Alternatives_2
            {
            pushFollow(FOLLOW_rule__Dist__Alternatives_2_in_rule__Dist__Group__2__Impl7800);
            rule__Dist__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getDistAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dist__Group__2__Impl"


    // $ANTLR start "rule__Dist__Group__3"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3885:1: rule__Dist__Group__3 : rule__Dist__Group__3__Impl rule__Dist__Group__4 ;
    public final void rule__Dist__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3889:1: ( rule__Dist__Group__3__Impl rule__Dist__Group__4 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3890:2: rule__Dist__Group__3__Impl rule__Dist__Group__4
            {
            pushFollow(FOLLOW_rule__Dist__Group__3__Impl_in_rule__Dist__Group__37830);
            rule__Dist__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Dist__Group__4_in_rule__Dist__Group__37833);
            rule__Dist__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dist__Group__3"


    // $ANTLR start "rule__Dist__Group__3__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3897:1: rule__Dist__Group__3__Impl : ( ',' ) ;
    public final void rule__Dist__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3901:1: ( ( ',' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3902:1: ( ',' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3902:1: ( ',' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3903:1: ','
            {
             before(grammarAccess.getDistAccess().getCommaKeyword_3()); 
            match(input,32,FOLLOW_32_in_rule__Dist__Group__3__Impl7861); 
             after(grammarAccess.getDistAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dist__Group__3__Impl"


    // $ANTLR start "rule__Dist__Group__4"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3916:1: rule__Dist__Group__4 : rule__Dist__Group__4__Impl rule__Dist__Group__5 ;
    public final void rule__Dist__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3920:1: ( rule__Dist__Group__4__Impl rule__Dist__Group__5 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3921:2: rule__Dist__Group__4__Impl rule__Dist__Group__5
            {
            pushFollow(FOLLOW_rule__Dist__Group__4__Impl_in_rule__Dist__Group__47892);
            rule__Dist__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Dist__Group__5_in_rule__Dist__Group__47895);
            rule__Dist__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dist__Group__4"


    // $ANTLR start "rule__Dist__Group__4__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3928:1: rule__Dist__Group__4__Impl : ( ( rule__Dist__Alternatives_4 ) ) ;
    public final void rule__Dist__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3932:1: ( ( ( rule__Dist__Alternatives_4 ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3933:1: ( ( rule__Dist__Alternatives_4 ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3933:1: ( ( rule__Dist__Alternatives_4 ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3934:1: ( rule__Dist__Alternatives_4 )
            {
             before(grammarAccess.getDistAccess().getAlternatives_4()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3935:1: ( rule__Dist__Alternatives_4 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3935:2: rule__Dist__Alternatives_4
            {
            pushFollow(FOLLOW_rule__Dist__Alternatives_4_in_rule__Dist__Group__4__Impl7922);
            rule__Dist__Alternatives_4();

            state._fsp--;


            }

             after(grammarAccess.getDistAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dist__Group__4__Impl"


    // $ANTLR start "rule__Dist__Group__5"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3945:1: rule__Dist__Group__5 : rule__Dist__Group__5__Impl ;
    public final void rule__Dist__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3949:1: ( rule__Dist__Group__5__Impl )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3950:2: rule__Dist__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Dist__Group__5__Impl_in_rule__Dist__Group__57952);
            rule__Dist__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dist__Group__5"


    // $ANTLR start "rule__Dist__Group__5__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3956:1: rule__Dist__Group__5__Impl : ( ')' ) ;
    public final void rule__Dist__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3960:1: ( ( ')' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3961:1: ( ')' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3961:1: ( ')' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3962:1: ')'
            {
             before(grammarAccess.getDistAccess().getRightParenthesisKeyword_5()); 
            match(input,33,FOLLOW_33_in_rule__Dist__Group__5__Impl7980); 
             after(grammarAccess.getDistAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dist__Group__5__Impl"


    // $ANTLR start "rule__AGENT_NUM__Group__0"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3987:1: rule__AGENT_NUM__Group__0 : rule__AGENT_NUM__Group__0__Impl rule__AGENT_NUM__Group__1 ;
    public final void rule__AGENT_NUM__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3991:1: ( rule__AGENT_NUM__Group__0__Impl rule__AGENT_NUM__Group__1 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3992:2: rule__AGENT_NUM__Group__0__Impl rule__AGENT_NUM__Group__1
            {
            pushFollow(FOLLOW_rule__AGENT_NUM__Group__0__Impl_in_rule__AGENT_NUM__Group__08023);
            rule__AGENT_NUM__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AGENT_NUM__Group__1_in_rule__AGENT_NUM__Group__08026);
            rule__AGENT_NUM__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AGENT_NUM__Group__0"


    // $ANTLR start "rule__AGENT_NUM__Group__0__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:3999:1: rule__AGENT_NUM__Group__0__Impl : ( '|' ) ;
    public final void rule__AGENT_NUM__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4003:1: ( ( '|' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4004:1: ( '|' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4004:1: ( '|' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4005:1: '|'
            {
             before(grammarAccess.getAGENT_NUMAccess().getVerticalLineKeyword_0()); 
            match(input,47,FOLLOW_47_in_rule__AGENT_NUM__Group__0__Impl8054); 
             after(grammarAccess.getAGENT_NUMAccess().getVerticalLineKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AGENT_NUM__Group__0__Impl"


    // $ANTLR start "rule__AGENT_NUM__Group__1"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4018:1: rule__AGENT_NUM__Group__1 : rule__AGENT_NUM__Group__1__Impl rule__AGENT_NUM__Group__2 ;
    public final void rule__AGENT_NUM__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4022:1: ( rule__AGENT_NUM__Group__1__Impl rule__AGENT_NUM__Group__2 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4023:2: rule__AGENT_NUM__Group__1__Impl rule__AGENT_NUM__Group__2
            {
            pushFollow(FOLLOW_rule__AGENT_NUM__Group__1__Impl_in_rule__AGENT_NUM__Group__18085);
            rule__AGENT_NUM__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AGENT_NUM__Group__2_in_rule__AGENT_NUM__Group__18088);
            rule__AGENT_NUM__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AGENT_NUM__Group__1"


    // $ANTLR start "rule__AGENT_NUM__Group__1__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4030:1: rule__AGENT_NUM__Group__1__Impl : ( ( rule__AGENT_NUM__TypeAssignment_1 ) ) ;
    public final void rule__AGENT_NUM__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4034:1: ( ( ( rule__AGENT_NUM__TypeAssignment_1 ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4035:1: ( ( rule__AGENT_NUM__TypeAssignment_1 ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4035:1: ( ( rule__AGENT_NUM__TypeAssignment_1 ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4036:1: ( rule__AGENT_NUM__TypeAssignment_1 )
            {
             before(grammarAccess.getAGENT_NUMAccess().getTypeAssignment_1()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4037:1: ( rule__AGENT_NUM__TypeAssignment_1 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4037:2: rule__AGENT_NUM__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__AGENT_NUM__TypeAssignment_1_in_rule__AGENT_NUM__Group__1__Impl8115);
            rule__AGENT_NUM__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAGENT_NUMAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AGENT_NUM__Group__1__Impl"


    // $ANTLR start "rule__AGENT_NUM__Group__2"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4047:1: rule__AGENT_NUM__Group__2 : rule__AGENT_NUM__Group__2__Impl ;
    public final void rule__AGENT_NUM__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4051:1: ( rule__AGENT_NUM__Group__2__Impl )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4052:2: rule__AGENT_NUM__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AGENT_NUM__Group__2__Impl_in_rule__AGENT_NUM__Group__28145);
            rule__AGENT_NUM__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AGENT_NUM__Group__2"


    // $ANTLR start "rule__AGENT_NUM__Group__2__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4058:1: rule__AGENT_NUM__Group__2__Impl : ( '|' ) ;
    public final void rule__AGENT_NUM__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4062:1: ( ( '|' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4063:1: ( '|' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4063:1: ( '|' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4064:1: '|'
            {
             before(grammarAccess.getAGENT_NUMAccess().getVerticalLineKeyword_2()); 
            match(input,47,FOLLOW_47_in_rule__AGENT_NUM__Group__2__Impl8173); 
             after(grammarAccess.getAGENT_NUMAccess().getVerticalLineKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AGENT_NUM__Group__2__Impl"


    // $ANTLR start "rule__POPULATION__Group__0"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4083:1: rule__POPULATION__Group__0 : rule__POPULATION__Group__0__Impl rule__POPULATION__Group__1 ;
    public final void rule__POPULATION__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4087:1: ( rule__POPULATION__Group__0__Impl rule__POPULATION__Group__1 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4088:2: rule__POPULATION__Group__0__Impl rule__POPULATION__Group__1
            {
            pushFollow(FOLLOW_rule__POPULATION__Group__0__Impl_in_rule__POPULATION__Group__08210);
            rule__POPULATION__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__POPULATION__Group__1_in_rule__POPULATION__Group__08213);
            rule__POPULATION__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__POPULATION__Group__0"


    // $ANTLR start "rule__POPULATION__Group__0__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4095:1: rule__POPULATION__Group__0__Impl : ( ( rule__POPULATION__PopuAssignment_0 ) ) ;
    public final void rule__POPULATION__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4099:1: ( ( ( rule__POPULATION__PopuAssignment_0 ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4100:1: ( ( rule__POPULATION__PopuAssignment_0 ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4100:1: ( ( rule__POPULATION__PopuAssignment_0 ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4101:1: ( rule__POPULATION__PopuAssignment_0 )
            {
             before(grammarAccess.getPOPULATIONAccess().getPopuAssignment_0()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4102:1: ( rule__POPULATION__PopuAssignment_0 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4102:2: rule__POPULATION__PopuAssignment_0
            {
            pushFollow(FOLLOW_rule__POPULATION__PopuAssignment_0_in_rule__POPULATION__Group__0__Impl8240);
            rule__POPULATION__PopuAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPOPULATIONAccess().getPopuAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__POPULATION__Group__0__Impl"


    // $ANTLR start "rule__POPULATION__Group__1"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4112:1: rule__POPULATION__Group__1 : rule__POPULATION__Group__1__Impl ;
    public final void rule__POPULATION__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4116:1: ( rule__POPULATION__Group__1__Impl )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4117:2: rule__POPULATION__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__POPULATION__Group__1__Impl_in_rule__POPULATION__Group__18270);
            rule__POPULATION__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__POPULATION__Group__1"


    // $ANTLR start "rule__POPULATION__Group__1__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4123:1: rule__POPULATION__Group__1__Impl : ( ( rule__POPULATION__Group_1__0 )* ) ;
    public final void rule__POPULATION__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4127:1: ( ( ( rule__POPULATION__Group_1__0 )* ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4128:1: ( ( rule__POPULATION__Group_1__0 )* )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4128:1: ( ( rule__POPULATION__Group_1__0 )* )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4129:1: ( rule__POPULATION__Group_1__0 )*
            {
             before(grammarAccess.getPOPULATIONAccess().getGroup_1()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4130:1: ( rule__POPULATION__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==48) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4130:2: rule__POPULATION__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__POPULATION__Group_1__0_in_rule__POPULATION__Group__1__Impl8297);
            	    rule__POPULATION__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getPOPULATIONAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__POPULATION__Group__1__Impl"


    // $ANTLR start "rule__POPULATION__Group_1__0"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4144:1: rule__POPULATION__Group_1__0 : rule__POPULATION__Group_1__0__Impl rule__POPULATION__Group_1__1 ;
    public final void rule__POPULATION__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4148:1: ( rule__POPULATION__Group_1__0__Impl rule__POPULATION__Group_1__1 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4149:2: rule__POPULATION__Group_1__0__Impl rule__POPULATION__Group_1__1
            {
            pushFollow(FOLLOW_rule__POPULATION__Group_1__0__Impl_in_rule__POPULATION__Group_1__08332);
            rule__POPULATION__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__POPULATION__Group_1__1_in_rule__POPULATION__Group_1__08335);
            rule__POPULATION__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__POPULATION__Group_1__0"


    // $ANTLR start "rule__POPULATION__Group_1__0__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4156:1: rule__POPULATION__Group_1__0__Impl : ( '||' ) ;
    public final void rule__POPULATION__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4160:1: ( ( '||' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4161:1: ( '||' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4161:1: ( '||' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4162:1: '||'
            {
             before(grammarAccess.getPOPULATIONAccess().getVerticalLineVerticalLineKeyword_1_0()); 
            match(input,48,FOLLOW_48_in_rule__POPULATION__Group_1__0__Impl8363); 
             after(grammarAccess.getPOPULATIONAccess().getVerticalLineVerticalLineKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__POPULATION__Group_1__0__Impl"


    // $ANTLR start "rule__POPULATION__Group_1__1"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4175:1: rule__POPULATION__Group_1__1 : rule__POPULATION__Group_1__1__Impl ;
    public final void rule__POPULATION__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4179:1: ( rule__POPULATION__Group_1__1__Impl )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4180:2: rule__POPULATION__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__POPULATION__Group_1__1__Impl_in_rule__POPULATION__Group_1__18394);
            rule__POPULATION__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__POPULATION__Group_1__1"


    // $ANTLR start "rule__POPULATION__Group_1__1__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4186:1: rule__POPULATION__Group_1__1__Impl : ( ( rule__POPULATION__PopuAssignment_1_1 ) ) ;
    public final void rule__POPULATION__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4190:1: ( ( ( rule__POPULATION__PopuAssignment_1_1 ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4191:1: ( ( rule__POPULATION__PopuAssignment_1_1 ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4191:1: ( ( rule__POPULATION__PopuAssignment_1_1 ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4192:1: ( rule__POPULATION__PopuAssignment_1_1 )
            {
             before(grammarAccess.getPOPULATIONAccess().getPopuAssignment_1_1()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4193:1: ( rule__POPULATION__PopuAssignment_1_1 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4193:2: rule__POPULATION__PopuAssignment_1_1
            {
            pushFollow(FOLLOW_rule__POPULATION__PopuAssignment_1_1_in_rule__POPULATION__Group_1__1__Impl8421);
            rule__POPULATION__PopuAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPOPULATIONAccess().getPopuAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__POPULATION__Group_1__1__Impl"


    // $ANTLR start "rule__AGENTS__Group__0"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4207:1: rule__AGENTS__Group__0 : rule__AGENTS__Group__0__Impl rule__AGENTS__Group__1 ;
    public final void rule__AGENTS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4211:1: ( rule__AGENTS__Group__0__Impl rule__AGENTS__Group__1 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4212:2: rule__AGENTS__Group__0__Impl rule__AGENTS__Group__1
            {
            pushFollow(FOLLOW_rule__AGENTS__Group__0__Impl_in_rule__AGENTS__Group__08455);
            rule__AGENTS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AGENTS__Group__1_in_rule__AGENTS__Group__08458);
            rule__AGENTS__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AGENTS__Group__0"


    // $ANTLR start "rule__AGENTS__Group__0__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4219:1: rule__AGENTS__Group__0__Impl : ( ( rule__AGENTS__TypeAssignment_0 ) ) ;
    public final void rule__AGENTS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4223:1: ( ( ( rule__AGENTS__TypeAssignment_0 ) ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4224:1: ( ( rule__AGENTS__TypeAssignment_0 ) )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4224:1: ( ( rule__AGENTS__TypeAssignment_0 ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4225:1: ( rule__AGENTS__TypeAssignment_0 )
            {
             before(grammarAccess.getAGENTSAccess().getTypeAssignment_0()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4226:1: ( rule__AGENTS__TypeAssignment_0 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4226:2: rule__AGENTS__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__AGENTS__TypeAssignment_0_in_rule__AGENTS__Group__0__Impl8485);
            rule__AGENTS__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAGENTSAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AGENTS__Group__0__Impl"


    // $ANTLR start "rule__AGENTS__Group__1"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4236:1: rule__AGENTS__Group__1 : rule__AGENTS__Group__1__Impl ;
    public final void rule__AGENTS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4240:1: ( rule__AGENTS__Group__1__Impl )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4241:2: rule__AGENTS__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AGENTS__Group__1__Impl_in_rule__AGENTS__Group__18515);
            rule__AGENTS__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AGENTS__Group__1"


    // $ANTLR start "rule__AGENTS__Group__1__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4247:1: rule__AGENTS__Group__1__Impl : ( ( rule__AGENTS__Group_1__0 )? ) ;
    public final void rule__AGENTS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4251:1: ( ( ( rule__AGENTS__Group_1__0 )? ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4252:1: ( ( rule__AGENTS__Group_1__0 )? )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4252:1: ( ( rule__AGENTS__Group_1__0 )? )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4253:1: ( rule__AGENTS__Group_1__0 )?
            {
             before(grammarAccess.getAGENTSAccess().getGroup_1()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4254:1: ( rule__AGENTS__Group_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==49) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4254:2: rule__AGENTS__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__AGENTS__Group_1__0_in_rule__AGENTS__Group__1__Impl8542);
                    rule__AGENTS__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAGENTSAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AGENTS__Group__1__Impl"


    // $ANTLR start "rule__AGENTS__Group_1__0"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4268:1: rule__AGENTS__Group_1__0 : rule__AGENTS__Group_1__0__Impl rule__AGENTS__Group_1__1 ;
    public final void rule__AGENTS__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4272:1: ( rule__AGENTS__Group_1__0__Impl rule__AGENTS__Group_1__1 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4273:2: rule__AGENTS__Group_1__0__Impl rule__AGENTS__Group_1__1
            {
            pushFollow(FOLLOW_rule__AGENTS__Group_1__0__Impl_in_rule__AGENTS__Group_1__08577);
            rule__AGENTS__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AGENTS__Group_1__1_in_rule__AGENTS__Group_1__08580);
            rule__AGENTS__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AGENTS__Group_1__0"


    // $ANTLR start "rule__AGENTS__Group_1__0__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4280:1: rule__AGENTS__Group_1__0__Impl : ( '[' ) ;
    public final void rule__AGENTS__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4284:1: ( ( '[' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4285:1: ( '[' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4285:1: ( '[' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4286:1: '['
            {
             before(grammarAccess.getAGENTSAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,49,FOLLOW_49_in_rule__AGENTS__Group_1__0__Impl8608); 
             after(grammarAccess.getAGENTSAccess().getLeftSquareBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AGENTS__Group_1__0__Impl"


    // $ANTLR start "rule__AGENTS__Group_1__1"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4299:1: rule__AGENTS__Group_1__1 : rule__AGENTS__Group_1__1__Impl rule__AGENTS__Group_1__2 ;
    public final void rule__AGENTS__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4303:1: ( rule__AGENTS__Group_1__1__Impl rule__AGENTS__Group_1__2 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4304:2: rule__AGENTS__Group_1__1__Impl rule__AGENTS__Group_1__2
            {
            pushFollow(FOLLOW_rule__AGENTS__Group_1__1__Impl_in_rule__AGENTS__Group_1__18639);
            rule__AGENTS__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AGENTS__Group_1__2_in_rule__AGENTS__Group_1__18642);
            rule__AGENTS__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AGENTS__Group_1__1"


    // $ANTLR start "rule__AGENTS__Group_1__1__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4311:1: rule__AGENTS__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__AGENTS__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4315:1: ( ( RULE_INT ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4316:1: ( RULE_INT )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4316:1: ( RULE_INT )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4317:1: RULE_INT
            {
             before(grammarAccess.getAGENTSAccess().getINTTerminalRuleCall_1_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__AGENTS__Group_1__1__Impl8669); 
             after(grammarAccess.getAGENTSAccess().getINTTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AGENTS__Group_1__1__Impl"


    // $ANTLR start "rule__AGENTS__Group_1__2"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4328:1: rule__AGENTS__Group_1__2 : rule__AGENTS__Group_1__2__Impl ;
    public final void rule__AGENTS__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4332:1: ( rule__AGENTS__Group_1__2__Impl )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4333:2: rule__AGENTS__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__AGENTS__Group_1__2__Impl_in_rule__AGENTS__Group_1__28698);
            rule__AGENTS__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AGENTS__Group_1__2"


    // $ANTLR start "rule__AGENTS__Group_1__2__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4339:1: rule__AGENTS__Group_1__2__Impl : ( ']' ) ;
    public final void rule__AGENTS__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4343:1: ( ( ']' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4344:1: ( ']' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4344:1: ( ']' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4345:1: ']'
            {
             before(grammarAccess.getAGENTSAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,50,FOLLOW_50_in_rule__AGENTS__Group_1__2__Impl8726); 
             after(grammarAccess.getAGENTSAccess().getRightSquareBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AGENTS__Group_1__2__Impl"


    // $ANTLR start "rule__LOC__Group__0"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4364:1: rule__LOC__Group__0 : rule__LOC__Group__0__Impl rule__LOC__Group__1 ;
    public final void rule__LOC__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4368:1: ( rule__LOC__Group__0__Impl rule__LOC__Group__1 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4369:2: rule__LOC__Group__0__Impl rule__LOC__Group__1
            {
            pushFollow(FOLLOW_rule__LOC__Group__0__Impl_in_rule__LOC__Group__08763);
            rule__LOC__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LOC__Group__1_in_rule__LOC__Group__08766);
            rule__LOC__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LOC__Group__0"


    // $ANTLR start "rule__LOC__Group__0__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4376:1: rule__LOC__Group__0__Impl : ( '(' ) ;
    public final void rule__LOC__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4380:1: ( ( '(' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4381:1: ( '(' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4381:1: ( '(' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4382:1: '('
            {
             before(grammarAccess.getLOCAccess().getLeftParenthesisKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__LOC__Group__0__Impl8794); 
             after(grammarAccess.getLOCAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LOC__Group__0__Impl"


    // $ANTLR start "rule__LOC__Group__1"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4395:1: rule__LOC__Group__1 : rule__LOC__Group__1__Impl rule__LOC__Group__2 ;
    public final void rule__LOC__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4399:1: ( rule__LOC__Group__1__Impl rule__LOC__Group__2 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4400:2: rule__LOC__Group__1__Impl rule__LOC__Group__2
            {
            pushFollow(FOLLOW_rule__LOC__Group__1__Impl_in_rule__LOC__Group__18825);
            rule__LOC__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LOC__Group__2_in_rule__LOC__Group__18828);
            rule__LOC__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LOC__Group__1"


    // $ANTLR start "rule__LOC__Group__1__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4407:1: rule__LOC__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__LOC__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4411:1: ( ( RULE_INT ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4412:1: ( RULE_INT )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4412:1: ( RULE_INT )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4413:1: RULE_INT
            {
             before(grammarAccess.getLOCAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__LOC__Group__1__Impl8855); 
             after(grammarAccess.getLOCAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LOC__Group__1__Impl"


    // $ANTLR start "rule__LOC__Group__2"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4424:1: rule__LOC__Group__2 : rule__LOC__Group__2__Impl rule__LOC__Group__3 ;
    public final void rule__LOC__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4428:1: ( rule__LOC__Group__2__Impl rule__LOC__Group__3 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4429:2: rule__LOC__Group__2__Impl rule__LOC__Group__3
            {
            pushFollow(FOLLOW_rule__LOC__Group__2__Impl_in_rule__LOC__Group__28884);
            rule__LOC__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LOC__Group__3_in_rule__LOC__Group__28887);
            rule__LOC__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LOC__Group__2"


    // $ANTLR start "rule__LOC__Group__2__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4436:1: rule__LOC__Group__2__Impl : ( ',' ) ;
    public final void rule__LOC__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4440:1: ( ( ',' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4441:1: ( ',' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4441:1: ( ',' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4442:1: ','
            {
             before(grammarAccess.getLOCAccess().getCommaKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__LOC__Group__2__Impl8915); 
             after(grammarAccess.getLOCAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LOC__Group__2__Impl"


    // $ANTLR start "rule__LOC__Group__3"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4455:1: rule__LOC__Group__3 : rule__LOC__Group__3__Impl rule__LOC__Group__4 ;
    public final void rule__LOC__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4459:1: ( rule__LOC__Group__3__Impl rule__LOC__Group__4 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4460:2: rule__LOC__Group__3__Impl rule__LOC__Group__4
            {
            pushFollow(FOLLOW_rule__LOC__Group__3__Impl_in_rule__LOC__Group__38946);
            rule__LOC__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LOC__Group__4_in_rule__LOC__Group__38949);
            rule__LOC__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LOC__Group__3"


    // $ANTLR start "rule__LOC__Group__3__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4467:1: rule__LOC__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__LOC__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4471:1: ( ( RULE_INT ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4472:1: ( RULE_INT )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4472:1: ( RULE_INT )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4473:1: RULE_INT
            {
             before(grammarAccess.getLOCAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__LOC__Group__3__Impl8976); 
             after(grammarAccess.getLOCAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LOC__Group__3__Impl"


    // $ANTLR start "rule__LOC__Group__4"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4484:1: rule__LOC__Group__4 : rule__LOC__Group__4__Impl ;
    public final void rule__LOC__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4488:1: ( rule__LOC__Group__4__Impl )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4489:2: rule__LOC__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__LOC__Group__4__Impl_in_rule__LOC__Group__49005);
            rule__LOC__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LOC__Group__4"


    // $ANTLR start "rule__LOC__Group__4__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4495:1: rule__LOC__Group__4__Impl : ( ')' ) ;
    public final void rule__LOC__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4499:1: ( ( ')' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4500:1: ( ')' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4500:1: ( ')' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4501:1: ')'
            {
             before(grammarAccess.getLOCAccess().getRightParenthesisKeyword_4()); 
            match(input,33,FOLLOW_33_in_rule__LOC__Group__4__Impl9033); 
             after(grammarAccess.getLOCAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LOC__Group__4__Impl"


    // $ANTLR start "rule__AGENT__Group__0"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4524:1: rule__AGENT__Group__0 : rule__AGENT__Group__0__Impl rule__AGENT__Group__1 ;
    public final void rule__AGENT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4528:1: ( rule__AGENT__Group__0__Impl rule__AGENT__Group__1 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4529:2: rule__AGENT__Group__0__Impl rule__AGENT__Group__1
            {
            pushFollow(FOLLOW_rule__AGENT__Group__0__Impl_in_rule__AGENT__Group__09074);
            rule__AGENT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AGENT__Group__1_in_rule__AGENT__Group__09077);
            rule__AGENT__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AGENT__Group__0"


    // $ANTLR start "rule__AGENT__Group__0__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4536:1: rule__AGENT__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__AGENT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4540:1: ( ( RULE_ID ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4541:1: ( RULE_ID )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4541:1: ( RULE_ID )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4542:1: RULE_ID
            {
             before(grammarAccess.getAGENTAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AGENT__Group__0__Impl9104); 
             after(grammarAccess.getAGENTAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AGENT__Group__0__Impl"


    // $ANTLR start "rule__AGENT__Group__1"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4553:1: rule__AGENT__Group__1 : rule__AGENT__Group__1__Impl ;
    public final void rule__AGENT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4557:1: ( rule__AGENT__Group__1__Impl )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4558:2: rule__AGENT__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AGENT__Group__1__Impl_in_rule__AGENT__Group__19133);
            rule__AGENT__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AGENT__Group__1"


    // $ANTLR start "rule__AGENT__Group__1__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4564:1: rule__AGENT__Group__1__Impl : ( ruleLOC ) ;
    public final void rule__AGENT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4568:1: ( ( ruleLOC ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4569:1: ( ruleLOC )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4569:1: ( ruleLOC )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4570:1: ruleLOC
            {
             before(grammarAccess.getAGENTAccess().getLOCParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleLOC_in_rule__AGENT__Group__1__Impl9160);
            ruleLOC();

            state._fsp--;

             after(grammarAccess.getAGENTAccess().getLOCParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AGENT__Group__1__Impl"


    // $ANTLR start "rule__MATH_Expr__Group__0"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4585:1: rule__MATH_Expr__Group__0 : rule__MATH_Expr__Group__0__Impl rule__MATH_Expr__Group__1 ;
    public final void rule__MATH_Expr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4589:1: ( rule__MATH_Expr__Group__0__Impl rule__MATH_Expr__Group__1 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4590:2: rule__MATH_Expr__Group__0__Impl rule__MATH_Expr__Group__1
            {
            pushFollow(FOLLOW_rule__MATH_Expr__Group__0__Impl_in_rule__MATH_Expr__Group__09193);
            rule__MATH_Expr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MATH_Expr__Group__1_in_rule__MATH_Expr__Group__09196);
            rule__MATH_Expr__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MATH_Expr__Group__0"


    // $ANTLR start "rule__MATH_Expr__Group__0__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4597:1: rule__MATH_Expr__Group__0__Impl : ( ruleTerminal_Math_Expr ) ;
    public final void rule__MATH_Expr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4601:1: ( ( ruleTerminal_Math_Expr ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4602:1: ( ruleTerminal_Math_Expr )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4602:1: ( ruleTerminal_Math_Expr )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4603:1: ruleTerminal_Math_Expr
            {
             before(grammarAccess.getMATH_ExprAccess().getTerminal_Math_ExprParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleTerminal_Math_Expr_in_rule__MATH_Expr__Group__0__Impl9223);
            ruleTerminal_Math_Expr();

            state._fsp--;

             after(grammarAccess.getMATH_ExprAccess().getTerminal_Math_ExprParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MATH_Expr__Group__0__Impl"


    // $ANTLR start "rule__MATH_Expr__Group__1"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4614:1: rule__MATH_Expr__Group__1 : rule__MATH_Expr__Group__1__Impl ;
    public final void rule__MATH_Expr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4618:1: ( rule__MATH_Expr__Group__1__Impl )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4619:2: rule__MATH_Expr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MATH_Expr__Group__1__Impl_in_rule__MATH_Expr__Group__19252);
            rule__MATH_Expr__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MATH_Expr__Group__1"


    // $ANTLR start "rule__MATH_Expr__Group__1__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4625:1: rule__MATH_Expr__Group__1__Impl : ( ( rule__MATH_Expr__Group_1__0 )* ) ;
    public final void rule__MATH_Expr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4629:1: ( ( ( rule__MATH_Expr__Group_1__0 )* ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4630:1: ( ( rule__MATH_Expr__Group_1__0 )* )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4630:1: ( ( rule__MATH_Expr__Group_1__0 )* )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4631:1: ( rule__MATH_Expr__Group_1__0 )*
            {
             before(grammarAccess.getMATH_ExprAccess().getGroup_1()); 
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4632:1: ( rule__MATH_Expr__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=18 && LA20_0<=23)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4632:2: rule__MATH_Expr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__MATH_Expr__Group_1__0_in_rule__MATH_Expr__Group__1__Impl9279);
            	    rule__MATH_Expr__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getMATH_ExprAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MATH_Expr__Group__1__Impl"


    // $ANTLR start "rule__MATH_Expr__Group_1__0"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4646:1: rule__MATH_Expr__Group_1__0 : rule__MATH_Expr__Group_1__0__Impl rule__MATH_Expr__Group_1__1 ;
    public final void rule__MATH_Expr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4650:1: ( rule__MATH_Expr__Group_1__0__Impl rule__MATH_Expr__Group_1__1 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4651:2: rule__MATH_Expr__Group_1__0__Impl rule__MATH_Expr__Group_1__1
            {
            pushFollow(FOLLOW_rule__MATH_Expr__Group_1__0__Impl_in_rule__MATH_Expr__Group_1__09314);
            rule__MATH_Expr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MATH_Expr__Group_1__1_in_rule__MATH_Expr__Group_1__09317);
            rule__MATH_Expr__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MATH_Expr__Group_1__0"


    // $ANTLR start "rule__MATH_Expr__Group_1__0__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4658:1: rule__MATH_Expr__Group_1__0__Impl : ( ruleMATH_OP ) ;
    public final void rule__MATH_Expr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4662:1: ( ( ruleMATH_OP ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4663:1: ( ruleMATH_OP )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4663:1: ( ruleMATH_OP )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4664:1: ruleMATH_OP
            {
             before(grammarAccess.getMATH_ExprAccess().getMATH_OPParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMATH_OP_in_rule__MATH_Expr__Group_1__0__Impl9344);
            ruleMATH_OP();

            state._fsp--;

             after(grammarAccess.getMATH_ExprAccess().getMATH_OPParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MATH_Expr__Group_1__0__Impl"


    // $ANTLR start "rule__MATH_Expr__Group_1__1"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4675:1: rule__MATH_Expr__Group_1__1 : rule__MATH_Expr__Group_1__1__Impl ;
    public final void rule__MATH_Expr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4679:1: ( rule__MATH_Expr__Group_1__1__Impl )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4680:2: rule__MATH_Expr__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__MATH_Expr__Group_1__1__Impl_in_rule__MATH_Expr__Group_1__19373);
            rule__MATH_Expr__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MATH_Expr__Group_1__1"


    // $ANTLR start "rule__MATH_Expr__Group_1__1__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4686:1: rule__MATH_Expr__Group_1__1__Impl : ( ruleTerminal_Math_Expr ) ;
    public final void rule__MATH_Expr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4690:1: ( ( ruleTerminal_Math_Expr ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4691:1: ( ruleTerminal_Math_Expr )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4691:1: ( ruleTerminal_Math_Expr )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4692:1: ruleTerminal_Math_Expr
            {
             before(grammarAccess.getMATH_ExprAccess().getTerminal_Math_ExprParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleTerminal_Math_Expr_in_rule__MATH_Expr__Group_1__1__Impl9400);
            ruleTerminal_Math_Expr();

            state._fsp--;

             after(grammarAccess.getMATH_ExprAccess().getTerminal_Math_ExprParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MATH_Expr__Group_1__1__Impl"


    // $ANTLR start "rule__Terminal_Math_Expr__Group_0__0"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4707:1: rule__Terminal_Math_Expr__Group_0__0 : rule__Terminal_Math_Expr__Group_0__0__Impl rule__Terminal_Math_Expr__Group_0__1 ;
    public final void rule__Terminal_Math_Expr__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4711:1: ( rule__Terminal_Math_Expr__Group_0__0__Impl rule__Terminal_Math_Expr__Group_0__1 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4712:2: rule__Terminal_Math_Expr__Group_0__0__Impl rule__Terminal_Math_Expr__Group_0__1
            {
            pushFollow(FOLLOW_rule__Terminal_Math_Expr__Group_0__0__Impl_in_rule__Terminal_Math_Expr__Group_0__09433);
            rule__Terminal_Math_Expr__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Terminal_Math_Expr__Group_0__1_in_rule__Terminal_Math_Expr__Group_0__09436);
            rule__Terminal_Math_Expr__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal_Math_Expr__Group_0__0"


    // $ANTLR start "rule__Terminal_Math_Expr__Group_0__0__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4719:1: rule__Terminal_Math_Expr__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Terminal_Math_Expr__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4723:1: ( ( '(' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4724:1: ( '(' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4724:1: ( '(' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4725:1: '('
            {
             before(grammarAccess.getTerminal_Math_ExprAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,31,FOLLOW_31_in_rule__Terminal_Math_Expr__Group_0__0__Impl9464); 
             after(grammarAccess.getTerminal_Math_ExprAccess().getLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal_Math_Expr__Group_0__0__Impl"


    // $ANTLR start "rule__Terminal_Math_Expr__Group_0__1"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4738:1: rule__Terminal_Math_Expr__Group_0__1 : rule__Terminal_Math_Expr__Group_0__1__Impl rule__Terminal_Math_Expr__Group_0__2 ;
    public final void rule__Terminal_Math_Expr__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4742:1: ( rule__Terminal_Math_Expr__Group_0__1__Impl rule__Terminal_Math_Expr__Group_0__2 )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4743:2: rule__Terminal_Math_Expr__Group_0__1__Impl rule__Terminal_Math_Expr__Group_0__2
            {
            pushFollow(FOLLOW_rule__Terminal_Math_Expr__Group_0__1__Impl_in_rule__Terminal_Math_Expr__Group_0__19495);
            rule__Terminal_Math_Expr__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Terminal_Math_Expr__Group_0__2_in_rule__Terminal_Math_Expr__Group_0__19498);
            rule__Terminal_Math_Expr__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal_Math_Expr__Group_0__1"


    // $ANTLR start "rule__Terminal_Math_Expr__Group_0__1__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4750:1: rule__Terminal_Math_Expr__Group_0__1__Impl : ( ruleMATH_Expr ) ;
    public final void rule__Terminal_Math_Expr__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4754:1: ( ( ruleMATH_Expr ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4755:1: ( ruleMATH_Expr )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4755:1: ( ruleMATH_Expr )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4756:1: ruleMATH_Expr
            {
             before(grammarAccess.getTerminal_Math_ExprAccess().getMATH_ExprParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleMATH_Expr_in_rule__Terminal_Math_Expr__Group_0__1__Impl9525);
            ruleMATH_Expr();

            state._fsp--;

             after(grammarAccess.getTerminal_Math_ExprAccess().getMATH_ExprParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal_Math_Expr__Group_0__1__Impl"


    // $ANTLR start "rule__Terminal_Math_Expr__Group_0__2"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4767:1: rule__Terminal_Math_Expr__Group_0__2 : rule__Terminal_Math_Expr__Group_0__2__Impl ;
    public final void rule__Terminal_Math_Expr__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4771:1: ( rule__Terminal_Math_Expr__Group_0__2__Impl )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4772:2: rule__Terminal_Math_Expr__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Terminal_Math_Expr__Group_0__2__Impl_in_rule__Terminal_Math_Expr__Group_0__29554);
            rule__Terminal_Math_Expr__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal_Math_Expr__Group_0__2"


    // $ANTLR start "rule__Terminal_Math_Expr__Group_0__2__Impl"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4778:1: rule__Terminal_Math_Expr__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Terminal_Math_Expr__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4782:1: ( ( ')' ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4783:1: ( ')' )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4783:1: ( ')' )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4784:1: ')'
            {
             before(grammarAccess.getTerminal_Math_ExprAccess().getRightParenthesisKeyword_0_2()); 
            match(input,33,FOLLOW_33_in_rule__Terminal_Math_Expr__Group_0__2__Impl9582); 
             after(grammarAccess.getTerminal_Math_ExprAccess().getRightParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal_Math_Expr__Group_0__2__Impl"


    // $ANTLR start "rule__Model__ParamsAssignment_1"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4804:1: rule__Model__ParamsAssignment_1 : ( ruleParam ) ;
    public final void rule__Model__ParamsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4808:1: ( ( ruleParam ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4809:1: ( ruleParam )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4809:1: ( ruleParam )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4810:1: ruleParam
            {
             before(grammarAccess.getModelAccess().getParamsParamParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleParam_in_rule__Model__ParamsAssignment_19624);
            ruleParam();

            state._fsp--;

             after(grammarAccess.getModelAccess().getParamsParamParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ParamsAssignment_1"


    // $ANTLR start "rule__Model__StatesAssignment_3"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4819:1: rule__Model__StatesAssignment_3 : ( ruleAgentState ) ;
    public final void rule__Model__StatesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4823:1: ( ( ruleAgentState ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4824:1: ( ruleAgentState )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4824:1: ( ruleAgentState )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4825:1: ruleAgentState
            {
             before(grammarAccess.getModelAccess().getStatesAgentStateParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAgentState_in_rule__Model__StatesAssignment_39655);
            ruleAgentState();

            state._fsp--;

             after(grammarAccess.getModelAccess().getStatesAgentStateParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__StatesAssignment_3"


    // $ANTLR start "rule__Model__PopulationAssignment_5"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4834:1: rule__Model__PopulationAssignment_5 : ( rulePOPULATION ) ;
    public final void rule__Model__PopulationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4838:1: ( ( rulePOPULATION ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4839:1: ( rulePOPULATION )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4839:1: ( rulePOPULATION )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4840:1: rulePOPULATION
            {
             before(grammarAccess.getModelAccess().getPopulationPOPULATIONParserRuleCall_5_0()); 
            pushFollow(FOLLOW_rulePOPULATION_in_rule__Model__PopulationAssignment_59686);
            rulePOPULATION();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPopulationPOPULATIONParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PopulationAssignment_5"


    // $ANTLR start "rule__Param__NameAssignment_1"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4849:1: rule__Param__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Param__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4853:1: ( ( RULE_ID ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4854:1: ( RULE_ID )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4854:1: ( RULE_ID )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4855:1: RULE_ID
            {
             before(grammarAccess.getParamAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Param__NameAssignment_19717); 
             after(grammarAccess.getParamAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Param__NameAssignment_1"


    // $ANTLR start "rule__Param__ValueAssignment_3"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4864:1: rule__Param__ValueAssignment_3 : ( ruleMATH_Expr ) ;
    public final void rule__Param__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4868:1: ( ( ruleMATH_Expr ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4869:1: ( ruleMATH_Expr )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4869:1: ( ruleMATH_Expr )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4870:1: ruleMATH_Expr
            {
             before(grammarAccess.getParamAccess().getValueMATH_ExprParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleMATH_Expr_in_rule__Param__ValueAssignment_39748);
            ruleMATH_Expr();

            state._fsp--;

             after(grammarAccess.getParamAccess().getValueMATH_ExprParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Param__ValueAssignment_3"


    // $ANTLR start "rule__AgentState__NameAssignment_0"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4879:1: rule__AgentState__NameAssignment_0 : ( ruleAGENT ) ;
    public final void rule__AgentState__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4883:1: ( ( ruleAGENT ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4884:1: ( ruleAGENT )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4884:1: ( ruleAGENT )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4885:1: ruleAGENT
            {
             before(grammarAccess.getAgentStateAccess().getNameAGENTParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAGENT_in_rule__AgentState__NameAssignment_09779);
            ruleAGENT();

            state._fsp--;

             after(grammarAccess.getAgentStateAccess().getNameAGENTParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentState__NameAssignment_0"


    // $ANTLR start "rule__AgentState__PrefixsAssignment_2"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4894:1: rule__AgentState__PrefixsAssignment_2 : ( rulePrefix ) ;
    public final void rule__AgentState__PrefixsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4898:1: ( ( rulePrefix ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4899:1: ( rulePrefix )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4899:1: ( rulePrefix )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4900:1: rulePrefix
            {
             before(grammarAccess.getAgentStateAccess().getPrefixsPrefixParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulePrefix_in_rule__AgentState__PrefixsAssignment_29810);
            rulePrefix();

            state._fsp--;

             after(grammarAccess.getAgentStateAccess().getPrefixsPrefixParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentState__PrefixsAssignment_2"


    // $ANTLR start "rule__AgentState__PrefixsAssignment_3_1"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4909:1: rule__AgentState__PrefixsAssignment_3_1 : ( rulePrefix ) ;
    public final void rule__AgentState__PrefixsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4913:1: ( ( rulePrefix ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4914:1: ( rulePrefix )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4914:1: ( rulePrefix )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4915:1: rulePrefix
            {
             before(grammarAccess.getAgentStateAccess().getPrefixsPrefixParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_rulePrefix_in_rule__AgentState__PrefixsAssignment_3_19841);
            rulePrefix();

            state._fsp--;

             after(grammarAccess.getAgentStateAccess().getPrefixsPrefixParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AgentState__PrefixsAssignment_3_1"


    // $ANTLR start "rule__Prefix__ActionAssignment_0"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4924:1: rule__Prefix__ActionAssignment_0 : ( ruleACTION ) ;
    public final void rule__Prefix__ActionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4928:1: ( ( ruleACTION ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4929:1: ( ruleACTION )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4929:1: ( ruleACTION )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4930:1: ruleACTION
            {
             before(grammarAccess.getPrefixAccess().getActionACTIONParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleACTION_in_rule__Prefix__ActionAssignment_09872);
            ruleACTION();

            state._fsp--;

             after(grammarAccess.getPrefixAccess().getActionACTIONParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__ActionAssignment_0"


    // $ANTLR start "rule__Prefix__ContinueAssignment_1"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4939:1: rule__Prefix__ContinueAssignment_1 : ( ruleAGENT ) ;
    public final void rule__Prefix__ContinueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4943:1: ( ( ruleAGENT ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4944:1: ( ruleAGENT )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4944:1: ( ruleAGENT )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4945:1: ruleAGENT
            {
             before(grammarAccess.getPrefixAccess().getContinueAGENTParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAGENT_in_rule__Prefix__ContinueAssignment_19903);
            ruleAGENT();

            state._fsp--;

             after(grammarAccess.getPrefixAccess().getContinueAGENTParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__ContinueAssignment_1"


    // $ANTLR start "rule__ACT_SpNoMsg__NameAssignment_1"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4954:1: rule__ACT_SpNoMsg__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ACT_SpNoMsg__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4958:1: ( ( RULE_ID ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4959:1: ( RULE_ID )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4959:1: ( RULE_ID )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4960:1: RULE_ID
            {
             before(grammarAccess.getACT_SpNoMsgAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ACT_SpNoMsg__NameAssignment_19934); 
             after(grammarAccess.getACT_SpNoMsgAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_SpNoMsg__NameAssignment_1"


    // $ANTLR start "rule__ACT_SpNoMsg__RateAssignment_3"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4969:1: rule__ACT_SpNoMsg__RateAssignment_3 : ( ruleRATE_Expr ) ;
    public final void rule__ACT_SpNoMsg__RateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4973:1: ( ( ruleRATE_Expr ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4974:1: ( ruleRATE_Expr )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4974:1: ( ruleRATE_Expr )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4975:1: ruleRATE_Expr
            {
             before(grammarAccess.getACT_SpNoMsgAccess().getRateRATE_ExprParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleRATE_Expr_in_rule__ACT_SpNoMsg__RateAssignment_39965);
            ruleRATE_Expr();

            state._fsp--;

             after(grammarAccess.getACT_SpNoMsgAccess().getRateRATE_ExprParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_SpNoMsg__RateAssignment_3"


    // $ANTLR start "rule__ACT_SpBr__NameAssignment_1"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4984:1: rule__ACT_SpBr__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ACT_SpBr__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4988:1: ( ( RULE_ID ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4989:1: ( RULE_ID )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4989:1: ( RULE_ID )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4990:1: RULE_ID
            {
             before(grammarAccess.getACT_SpBrAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ACT_SpBr__NameAssignment_19996); 
             after(grammarAccess.getACT_SpBrAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_SpBr__NameAssignment_1"


    // $ANTLR start "rule__ACT_SpBr__RateAssignment_3"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:4999:1: rule__ACT_SpBr__RateAssignment_3 : ( ruleRATE_Expr ) ;
    public final void rule__ACT_SpBr__RateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5003:1: ( ( ruleRATE_Expr ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5004:1: ( ruleRATE_Expr )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5004:1: ( ruleRATE_Expr )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5005:1: ruleRATE_Expr
            {
             before(grammarAccess.getACT_SpBrAccess().getRateRATE_ExprParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleRATE_Expr_in_rule__ACT_SpBr__RateAssignment_310027);
            ruleRATE_Expr();

            state._fsp--;

             after(grammarAccess.getACT_SpBrAccess().getRateRATE_ExprParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_SpBr__RateAssignment_3"


    // $ANTLR start "rule__ACT_SpBr__RangeAssignment_7"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5014:1: rule__ACT_SpBr__RangeAssignment_7 : ( ruleIRange ) ;
    public final void rule__ACT_SpBr__RangeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5018:1: ( ( ruleIRange ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5019:1: ( ruleIRange )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5019:1: ( ruleIRange )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5020:1: ruleIRange
            {
             before(grammarAccess.getACT_SpBrAccess().getRangeIRangeParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleIRange_in_rule__ACT_SpBr__RangeAssignment_710058);
            ruleIRange();

            state._fsp--;

             after(grammarAccess.getACT_SpBrAccess().getRangeIRangeParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_SpBr__RangeAssignment_7"


    // $ANTLR start "rule__ACT_SpUni__NameAssignment_1"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5029:1: rule__ACT_SpUni__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ACT_SpUni__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5033:1: ( ( RULE_ID ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5034:1: ( RULE_ID )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5034:1: ( RULE_ID )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5035:1: RULE_ID
            {
             before(grammarAccess.getACT_SpUniAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ACT_SpUni__NameAssignment_110089); 
             after(grammarAccess.getACT_SpUniAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_SpUni__NameAssignment_1"


    // $ANTLR start "rule__ACT_SpUni__RateAssignment_3"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5044:1: rule__ACT_SpUni__RateAssignment_3 : ( ruleRATE_Expr ) ;
    public final void rule__ACT_SpUni__RateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5048:1: ( ( ruleRATE_Expr ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5049:1: ( ruleRATE_Expr )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5049:1: ( ruleRATE_Expr )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5050:1: ruleRATE_Expr
            {
             before(grammarAccess.getACT_SpUniAccess().getRateRATE_ExprParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleRATE_Expr_in_rule__ACT_SpUni__RateAssignment_310120);
            ruleRATE_Expr();

            state._fsp--;

             after(grammarAccess.getACT_SpUniAccess().getRateRATE_ExprParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_SpUni__RateAssignment_3"


    // $ANTLR start "rule__ACT_SpUni__RangeAssignment_7"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5059:1: rule__ACT_SpUni__RangeAssignment_7 : ( ruleIRange ) ;
    public final void rule__ACT_SpUni__RangeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5063:1: ( ( ruleIRange ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5064:1: ( ruleIRange )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5064:1: ( ruleIRange )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5065:1: ruleIRange
            {
             before(grammarAccess.getACT_SpUniAccess().getRangeIRangeParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleIRange_in_rule__ACT_SpUni__RangeAssignment_710151);
            ruleIRange();

            state._fsp--;

             after(grammarAccess.getACT_SpUniAccess().getRangeIRangeParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_SpUni__RangeAssignment_7"


    // $ANTLR start "rule__ACT_InBr__NameAssignment_1"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5074:1: rule__ACT_InBr__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ACT_InBr__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5078:1: ( ( RULE_ID ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5079:1: ( RULE_ID )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5079:1: ( RULE_ID )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5080:1: RULE_ID
            {
             before(grammarAccess.getACT_InBrAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ACT_InBr__NameAssignment_110182); 
             after(grammarAccess.getACT_InBrAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_InBr__NameAssignment_1"


    // $ANTLR start "rule__ACT_InBr__RateAssignment_3"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5089:1: rule__ACT_InBr__RateAssignment_3 : ( ruleRATE_Expr ) ;
    public final void rule__ACT_InBr__RateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5093:1: ( ( ruleRATE_Expr ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5094:1: ( ruleRATE_Expr )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5094:1: ( ruleRATE_Expr )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5095:1: ruleRATE_Expr
            {
             before(grammarAccess.getACT_InBrAccess().getRateRATE_ExprParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleRATE_Expr_in_rule__ACT_InBr__RateAssignment_310213);
            ruleRATE_Expr();

            state._fsp--;

             after(grammarAccess.getACT_InBrAccess().getRateRATE_ExprParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_InBr__RateAssignment_3"


    // $ANTLR start "rule__ACT_InBr__ValueAssignment_7"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5104:1: rule__ACT_InBr__ValueAssignment_7 : ( rulePR_Expr ) ;
    public final void rule__ACT_InBr__ValueAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5108:1: ( ( rulePR_Expr ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5109:1: ( rulePR_Expr )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5109:1: ( rulePR_Expr )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5110:1: rulePR_Expr
            {
             before(grammarAccess.getACT_InBrAccess().getValuePR_ExprParserRuleCall_7_0()); 
            pushFollow(FOLLOW_rulePR_Expr_in_rule__ACT_InBr__ValueAssignment_710244);
            rulePR_Expr();

            state._fsp--;

             after(grammarAccess.getACT_InBrAccess().getValuePR_ExprParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_InBr__ValueAssignment_7"


    // $ANTLR start "rule__ACT_InUni__NameAssignment_1"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5119:1: rule__ACT_InUni__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ACT_InUni__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5123:1: ( ( RULE_ID ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5124:1: ( RULE_ID )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5124:1: ( RULE_ID )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5125:1: RULE_ID
            {
             before(grammarAccess.getACT_InUniAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ACT_InUni__NameAssignment_110275); 
             after(grammarAccess.getACT_InUniAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_InUni__NameAssignment_1"


    // $ANTLR start "rule__ACT_InUni__RateAssignment_3"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5134:1: rule__ACT_InUni__RateAssignment_3 : ( ruleRATE_Expr ) ;
    public final void rule__ACT_InUni__RateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5138:1: ( ( ruleRATE_Expr ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5139:1: ( ruleRATE_Expr )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5139:1: ( ruleRATE_Expr )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5140:1: ruleRATE_Expr
            {
             before(grammarAccess.getACT_InUniAccess().getRateRATE_ExprParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleRATE_Expr_in_rule__ACT_InUni__RateAssignment_310306);
            ruleRATE_Expr();

            state._fsp--;

             after(grammarAccess.getACT_InUniAccess().getRateRATE_ExprParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_InUni__RateAssignment_3"


    // $ANTLR start "rule__ACT_InUni__ValueAssignment_7"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5149:1: rule__ACT_InUni__ValueAssignment_7 : ( rulePR_Expr ) ;
    public final void rule__ACT_InUni__ValueAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5153:1: ( ( rulePR_Expr ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5154:1: ( rulePR_Expr )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5154:1: ( rulePR_Expr )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5155:1: rulePR_Expr
            {
             before(grammarAccess.getACT_InUniAccess().getValuePR_ExprParserRuleCall_7_0()); 
            pushFollow(FOLLOW_rulePR_Expr_in_rule__ACT_InUni__ValueAssignment_710337);
            rulePR_Expr();

            state._fsp--;

             after(grammarAccess.getACT_InUniAccess().getValuePR_ExprParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACT_InUni__ValueAssignment_7"


    // $ANTLR start "rule__PR_Expr__PrEAssignment_0"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5164:1: rule__PR_Expr__PrEAssignment_0 : ( ruleTerminal_PR_Expr ) ;
    public final void rule__PR_Expr__PrEAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5168:1: ( ( ruleTerminal_PR_Expr ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5169:1: ( ruleTerminal_PR_Expr )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5169:1: ( ruleTerminal_PR_Expr )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5170:1: ruleTerminal_PR_Expr
            {
             before(grammarAccess.getPR_ExprAccess().getPrETerminal_PR_ExprParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTerminal_PR_Expr_in_rule__PR_Expr__PrEAssignment_010368);
            ruleTerminal_PR_Expr();

            state._fsp--;

             after(grammarAccess.getPR_ExprAccess().getPrETerminal_PR_ExprParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PR_Expr__PrEAssignment_0"


    // $ANTLR start "rule__PR_Expr__PrEAssignment_1_1"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5179:1: rule__PR_Expr__PrEAssignment_1_1 : ( ruleTerminal_PR_Expr ) ;
    public final void rule__PR_Expr__PrEAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5183:1: ( ( ruleTerminal_PR_Expr ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5184:1: ( ruleTerminal_PR_Expr )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5184:1: ( ruleTerminal_PR_Expr )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5185:1: ruleTerminal_PR_Expr
            {
             before(grammarAccess.getPR_ExprAccess().getPrETerminal_PR_ExprParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleTerminal_PR_Expr_in_rule__PR_Expr__PrEAssignment_1_110399);
            ruleTerminal_PR_Expr();

            state._fsp--;

             after(grammarAccess.getPR_ExprAccess().getPrETerminal_PR_ExprParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PR_Expr__PrEAssignment_1_1"


    // $ANTLR start "rule__Terminal_PR_Expr__LinkedParamAssignment_1_1"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5194:1: rule__Terminal_PR_Expr__LinkedParamAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Terminal_PR_Expr__LinkedParamAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5198:1: ( ( RULE_ID ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5199:1: ( RULE_ID )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5199:1: ( RULE_ID )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5200:1: RULE_ID
            {
             before(grammarAccess.getTerminal_PR_ExprAccess().getLinkedParamIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Terminal_PR_Expr__LinkedParamAssignment_1_110430); 
             after(grammarAccess.getTerminal_PR_ExprAccess().getLinkedParamIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal_PR_Expr__LinkedParamAssignment_1_1"


    // $ANTLR start "rule__RATE_Expr__RtAssignment_0"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5209:1: rule__RATE_Expr__RtAssignment_0 : ( ruleTerminal_RATE_Expr ) ;
    public final void rule__RATE_Expr__RtAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5213:1: ( ( ruleTerminal_RATE_Expr ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5214:1: ( ruleTerminal_RATE_Expr )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5214:1: ( ruleTerminal_RATE_Expr )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5215:1: ruleTerminal_RATE_Expr
            {
             before(grammarAccess.getRATE_ExprAccess().getRtTerminal_RATE_ExprParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTerminal_RATE_Expr_in_rule__RATE_Expr__RtAssignment_010461);
            ruleTerminal_RATE_Expr();

            state._fsp--;

             after(grammarAccess.getRATE_ExprAccess().getRtTerminal_RATE_ExprParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RATE_Expr__RtAssignment_0"


    // $ANTLR start "rule__RATE_Expr__RtAssignment_1_1"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5224:1: rule__RATE_Expr__RtAssignment_1_1 : ( ruleTerminal_RATE_Expr ) ;
    public final void rule__RATE_Expr__RtAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5228:1: ( ( ruleTerminal_RATE_Expr ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5229:1: ( ruleTerminal_RATE_Expr )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5229:1: ( ruleTerminal_RATE_Expr )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5230:1: ruleTerminal_RATE_Expr
            {
             before(grammarAccess.getRATE_ExprAccess().getRtTerminal_RATE_ExprParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleTerminal_RATE_Expr_in_rule__RATE_Expr__RtAssignment_1_110492);
            ruleTerminal_RATE_Expr();

            state._fsp--;

             after(grammarAccess.getRATE_ExprAccess().getRtTerminal_RATE_ExprParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RATE_Expr__RtAssignment_1_1"


    // $ANTLR start "rule__Terminal_RATE_Expr__LinkedParamAssignment_1_1"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5239:1: rule__Terminal_RATE_Expr__LinkedParamAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Terminal_RATE_Expr__LinkedParamAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5243:1: ( ( RULE_ID ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5244:1: ( RULE_ID )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5244:1: ( RULE_ID )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5245:1: RULE_ID
            {
             before(grammarAccess.getTerminal_RATE_ExprAccess().getLinkedParamIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Terminal_RATE_Expr__LinkedParamAssignment_1_110523); 
             after(grammarAccess.getTerminal_RATE_ExprAccess().getLinkedParamIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal_RATE_Expr__LinkedParamAssignment_1_1"


    // $ANTLR start "rule__AGENT_NUM__TypeAssignment_1"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5254:1: rule__AGENT_NUM__TypeAssignment_1 : ( ruleAGENT ) ;
    public final void rule__AGENT_NUM__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5258:1: ( ( ruleAGENT ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5259:1: ( ruleAGENT )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5259:1: ( ruleAGENT )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5260:1: ruleAGENT
            {
             before(grammarAccess.getAGENT_NUMAccess().getTypeAGENTParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAGENT_in_rule__AGENT_NUM__TypeAssignment_110554);
            ruleAGENT();

            state._fsp--;

             after(grammarAccess.getAGENT_NUMAccess().getTypeAGENTParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AGENT_NUM__TypeAssignment_1"


    // $ANTLR start "rule__POPULATION__PopuAssignment_0"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5269:1: rule__POPULATION__PopuAssignment_0 : ( ruleAGENTS ) ;
    public final void rule__POPULATION__PopuAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5273:1: ( ( ruleAGENTS ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5274:1: ( ruleAGENTS )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5274:1: ( ruleAGENTS )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5275:1: ruleAGENTS
            {
             before(grammarAccess.getPOPULATIONAccess().getPopuAGENTSParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAGENTS_in_rule__POPULATION__PopuAssignment_010585);
            ruleAGENTS();

            state._fsp--;

             after(grammarAccess.getPOPULATIONAccess().getPopuAGENTSParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__POPULATION__PopuAssignment_0"


    // $ANTLR start "rule__POPULATION__PopuAssignment_1_1"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5284:1: rule__POPULATION__PopuAssignment_1_1 : ( ruleAGENTS ) ;
    public final void rule__POPULATION__PopuAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5288:1: ( ( ruleAGENTS ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5289:1: ( ruleAGENTS )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5289:1: ( ruleAGENTS )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5290:1: ruleAGENTS
            {
             before(grammarAccess.getPOPULATIONAccess().getPopuAGENTSParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAGENTS_in_rule__POPULATION__PopuAssignment_1_110616);
            ruleAGENTS();

            state._fsp--;

             after(grammarAccess.getPOPULATIONAccess().getPopuAGENTSParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__POPULATION__PopuAssignment_1_1"


    // $ANTLR start "rule__AGENTS__TypeAssignment_0"
    // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5299:1: rule__AGENTS__TypeAssignment_0 : ( ruleAGENT ) ;
    public final void rule__AGENTS__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5303:1: ( ( ruleAGENT ) )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5304:1: ( ruleAGENT )
            {
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5304:1: ( ruleAGENT )
            // ../org.xtext.edinburgh.paloma.ui/src-gen/org/xtext/edinburgh/ui/contentassist/antlr/internal/InternalPaloma.g:5305:1: ruleAGENT
            {
             before(grammarAccess.getAGENTSAccess().getTypeAGENTParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAGENT_in_rule__AGENTS__TypeAssignment_010647);
            ruleAGENT();

            state._fsp--;

             after(grammarAccess.getAGENTSAccess().getTypeAGENTParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AGENTS__TypeAssignment_0"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_entryRuleParam121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParam128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group__0_in_ruleParam154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAgentState_in_entryRuleAgentState181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAgentState188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AgentState__Group__0_in_ruleAgentState214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_entryRulePrefix241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrefix248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prefix__Group__0_in_rulePrefix274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleACTION_in_entryRuleACTION301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleACTION308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACTION__Alternatives_in_ruleACTION334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleACT_SpNoMsg_in_entryRuleACT_SpNoMsg361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleACT_SpNoMsg368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_SpNoMsg__Group__0_in_ruleACT_SpNoMsg394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleACT_SpBr_in_entryRuleACT_SpBr421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleACT_SpBr428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_SpBr__Group__0_in_ruleACT_SpBr454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleACT_SpUni_in_entryRuleACT_SpUni481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleACT_SpUni488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_SpUni__Group__0_in_ruleACT_SpUni514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleACT_InBr_in_entryRuleACT_InBr541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleACT_InBr548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_InBr__Group__0_in_ruleACT_InBr574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleACT_InUni_in_entryRuleACT_InUni601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleACT_InUni608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_InUni__Group__0_in_ruleACT_InUni634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIRange_in_entryRuleIRange661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIRange668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IRange__Alternatives_in_ruleIRange694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePR_Expr_in_entryRulePR_Expr721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePR_Expr728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PR_Expr__Group__0_in_rulePR_Expr754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminal_PR_Expr_in_entryRuleTerminal_PR_Expr781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminal_PR_Expr788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminal_PR_Expr__Alternatives_in_ruleTerminal_PR_Expr814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRATE_Expr_in_entryRuleRATE_Expr841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRATE_Expr848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RATE_Expr__Group__0_in_ruleRATE_Expr874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminal_RATE_Expr_in_entryRuleTerminal_RATE_Expr901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminal_RATE_Expr908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminal_RATE_Expr__Alternatives_in_ruleTerminal_RATE_Expr934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDist_in_entryRuleDist961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDist968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dist__Group__0_in_ruleDist994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAGENT_NUM_in_entryRuleAGENT_NUM1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAGENT_NUM1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AGENT_NUM__Group__0_in_ruleAGENT_NUM1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePOPULATION_in_entryRulePOPULATION1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePOPULATION1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__POPULATION__Group__0_in_rulePOPULATION1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAGENTS_in_entryRuleAGENTS1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAGENTS1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AGENTS__Group__0_in_ruleAGENTS1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMATH_OP_in_entryRuleMATH_OP1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMATH_OP1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MATH_OP__Alternatives_in_ruleMATH_OP1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_entryRuleNUMBER1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNUMBER1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NUMBER__Alternatives_in_ruleNUMBER1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLOC_in_entryRuleLOC1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLOC1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LOC__Group__0_in_ruleLOC1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAGENT_in_entryRuleAGENT1381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAGENT1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AGENT__Group__0_in_ruleAGENT1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMATH_Expr_in_entryRuleMATH_Expr1441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMATH_Expr1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MATH_Expr__Group__0_in_ruleMATH_Expr1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminal_Math_Expr_in_entryRuleTerminal_Math_Expr1501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminal_Math_Expr1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminal_Math_Expr__Alternatives_in_ruleTerminal_Math_Expr1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleACT_SpNoMsg_in_rule__ACTION__Alternatives1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleACT_SpBr_in_rule__ACTION__Alternatives1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleACT_SpUni_in_rule__ACTION__Alternatives1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleACT_InBr_in_rule__ACTION__Alternatives1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleACT_InUni_in_rule__ACTION__Alternatives1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__IRange__Alternatives1671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__IRange__Alternatives1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IRange__Group_2__0_in_rule__IRange__Alternatives1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IRange__Group_3__0_in_rule__IRange__Alternatives1728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminal_PR_Expr__Group_0__0_in_rule__Terminal_PR_Expr__Alternatives1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminal_PR_Expr__Alternatives_1_in_rule__Terminal_PR_Expr__Alternatives1779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_rule__Terminal_PR_Expr__Alternatives_11812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminal_PR_Expr__LinkedParamAssignment_1_1_in_rule__Terminal_PR_Expr__Alternatives_11829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDist_in_rule__Terminal_PR_Expr__Alternatives_11847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAGENT_NUM_in_rule__Terminal_PR_Expr__Alternatives_11864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminal_RATE_Expr__Group_0__0_in_rule__Terminal_RATE_Expr__Alternatives1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminal_RATE_Expr__Alternatives_1_in_rule__Terminal_RATE_Expr__Alternatives1914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_rule__Terminal_RATE_Expr__Alternatives_11947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminal_RATE_Expr__LinkedParamAssignment_1_1_in_rule__Terminal_RATE_Expr__Alternatives_11964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Dist__Alternatives_21998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Dist__Alternatives_22018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLOC_in_rule__Dist__Alternatives_22037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Dist__Alternatives_42070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Dist__Alternatives_42090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLOC_in_rule__Dist__Alternatives_42109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__MATH_OP__Alternatives2142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__MATH_OP__Alternatives2162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__MATH_OP__Alternatives2182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__MATH_OP__Alternatives2202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__MATH_OP__Alternatives2222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__MATH_OP__Alternatives2242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__NUMBER__Alternatives2276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__NUMBER__Alternatives2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_SCIENTIFIC_in_rule__NUMBER__Alternatives2310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminal_Math_Expr__Group_0__0_in_rule__Terminal_Math_Expr__Alternatives2342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_rule__Terminal_Math_Expr__Alternatives2360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02390 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Model__Group__0__Impl2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12452 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ParamsAssignment_1_in_rule__Model__Group__1__Impl2482 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__22513 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__22516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Model__Group__2__Impl2544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__32575 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__32578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__StatesAssignment_3_in_rule__Model__Group__3__Impl2607 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__Model__StatesAssignment_3_in_rule__Model__Group__3__Impl2619 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__42652 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Model__Group__5_in_rule__Model__Group__42655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Model__Group__4__Impl2683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__52714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PopulationAssignment_5_in_rule__Model__Group__5__Impl2741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group__0__Impl_in_rule__Param__Group__02783 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Param__Group__1_in_rule__Param__Group__02786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Param__Group__0__Impl2814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group__1__Impl_in_rule__Param__Group__12845 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Param__Group__2_in_rule__Param__Group__12848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__NameAssignment_1_in_rule__Param__Group__1__Impl2875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group__2__Impl_in_rule__Param__Group__22905 = new BitSet(new long[]{0x0000000080000070L});
    public static final BitSet FOLLOW_rule__Param__Group__3_in_rule__Param__Group__22908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Param__Group__2__Impl2936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group__3__Impl_in_rule__Param__Group__32967 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Param__Group__4_in_rule__Param__Group__32970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__ValueAssignment_3_in_rule__Param__Group__3__Impl2997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group__4__Impl_in_rule__Param__Group__43027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Param__Group__4__Impl3055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AgentState__Group__0__Impl_in_rule__AgentState__Group__03096 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__AgentState__Group__1_in_rule__AgentState__Group__03099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AgentState__NameAssignment_0_in_rule__AgentState__Group__0__Impl3126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AgentState__Group__1__Impl_in_rule__AgentState__Group__13156 = new BitSet(new long[]{0x00000B0880000000L});
    public static final BitSet FOLLOW_rule__AgentState__Group__2_in_rule__AgentState__Group__13159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__AgentState__Group__1__Impl3187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AgentState__Group__2__Impl_in_rule__AgentState__Group__23218 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_rule__AgentState__Group__3_in_rule__AgentState__Group__23221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AgentState__PrefixsAssignment_2_in_rule__AgentState__Group__2__Impl3248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AgentState__Group__3__Impl_in_rule__AgentState__Group__33278 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_rule__AgentState__Group__4_in_rule__AgentState__Group__33281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AgentState__Group_3__0_in_rule__AgentState__Group__3__Impl3308 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__AgentState__Group__4__Impl_in_rule__AgentState__Group__43339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__AgentState__Group__4__Impl3367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AgentState__Group_3__0__Impl_in_rule__AgentState__Group_3__03408 = new BitSet(new long[]{0x00000B0880000000L});
    public static final BitSet FOLLOW_rule__AgentState__Group_3__1_in_rule__AgentState__Group_3__03411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__AgentState__Group_3__0__Impl3439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AgentState__Group_3__1__Impl_in_rule__AgentState__Group_3__13470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AgentState__PrefixsAssignment_3_1_in_rule__AgentState__Group_3__1__Impl3497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prefix__Group__0__Impl_in_rule__Prefix__Group__03531 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Prefix__Group__1_in_rule__Prefix__Group__03534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prefix__ActionAssignment_0_in_rule__Prefix__Group__0__Impl3561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prefix__Group__1__Impl_in_rule__Prefix__Group__13591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prefix__ContinueAssignment_1_in_rule__Prefix__Group__1__Impl3618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_SpNoMsg__Group__0__Impl_in_rule__ACT_SpNoMsg__Group__03652 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__ACT_SpNoMsg__Group__1_in_rule__ACT_SpNoMsg__Group__03655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ACT_SpNoMsg__Group__0__Impl3683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_SpNoMsg__Group__1__Impl_in_rule__ACT_SpNoMsg__Group__13714 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ACT_SpNoMsg__Group__2_in_rule__ACT_SpNoMsg__Group__13717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_SpNoMsg__NameAssignment_1_in_rule__ACT_SpNoMsg__Group__1__Impl3744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_SpNoMsg__Group__2__Impl_in_rule__ACT_SpNoMsg__Group__23774 = new BitSet(new long[]{0x00000000800000F0L});
    public static final BitSet FOLLOW_rule__ACT_SpNoMsg__Group__3_in_rule__ACT_SpNoMsg__Group__23777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ACT_SpNoMsg__Group__2__Impl3805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_SpNoMsg__Group__3__Impl_in_rule__ACT_SpNoMsg__Group__33836 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ACT_SpNoMsg__Group__4_in_rule__ACT_SpNoMsg__Group__33839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_SpNoMsg__RateAssignment_3_in_rule__ACT_SpNoMsg__Group__3__Impl3866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_SpNoMsg__Group__4__Impl_in_rule__ACT_SpNoMsg__Group__43896 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__ACT_SpNoMsg__Group__5_in_rule__ACT_SpNoMsg__Group__43899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ACT_SpNoMsg__Group__4__Impl3927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_SpNoMsg__Group__5__Impl_in_rule__ACT_SpNoMsg__Group__53958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ACT_SpNoMsg__Group__5__Impl3986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_SpBr__Group__0__Impl_in_rule__ACT_SpBr__Group__04029 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__ACT_SpBr__Group__1_in_rule__ACT_SpBr__Group__04032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ACT_SpBr__Group__0__Impl4060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_SpBr__Group__1__Impl_in_rule__ACT_SpBr__Group__14091 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ACT_SpBr__Group__2_in_rule__ACT_SpBr__Group__14094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_SpBr__NameAssignment_1_in_rule__ACT_SpBr__Group__1__Impl4121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_SpBr__Group__2__Impl_in_rule__ACT_SpBr__Group__24151 = new BitSet(new long[]{0x00000000800000F0L});
    public static final BitSet FOLLOW_rule__ACT_SpBr__Group__3_in_rule__ACT_SpBr__Group__24154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ACT_SpBr__Group__2__Impl4182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_SpBr__Group__3__Impl_in_rule__ACT_SpBr__Group__34213 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__ACT_SpBr__Group__4_in_rule__ACT_SpBr__Group__34216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_SpBr__RateAssignment_3_in_rule__ACT_SpBr__Group__3__Impl4243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_SpBr__Group__4__Impl_in_rule__ACT_SpBr__Group__44273 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__ACT_SpBr__Group__5_in_rule__ACT_SpBr__Group__44276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ACT_SpBr__Group__4__Impl4304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_SpBr__Group__5__Impl_in_rule__ACT_SpBr__Group__54335 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__ACT_SpBr__Group__6_in_rule__ACT_SpBr__Group__54338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ACT_SpBr__Group__5__Impl4366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_SpBr__Group__6__Impl_in_rule__ACT_SpBr__Group__64397 = new BitSet(new long[]{0x000020008000C000L});
    public static final BitSet FOLLOW_rule__ACT_SpBr__Group__7_in_rule__ACT_SpBr__Group__64400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ACT_SpBr__Group__6__Impl4428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_SpBr__Group__7__Impl_in_rule__ACT_SpBr__Group__74459 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__ACT_SpBr__Group__8_in_rule__ACT_SpBr__Group__74462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_SpBr__RangeAssignment_7_in_rule__ACT_SpBr__Group__7__Impl4489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_SpBr__Group__8__Impl_in_rule__ACT_SpBr__Group__84519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ACT_SpBr__Group__8__Impl4547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_SpUni__Group__0__Impl_in_rule__ACT_SpUni__Group__04596 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__ACT_SpUni__Group__1_in_rule__ACT_SpUni__Group__04599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ACT_SpUni__Group__0__Impl4627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_SpUni__Group__1__Impl_in_rule__ACT_SpUni__Group__14658 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ACT_SpUni__Group__2_in_rule__ACT_SpUni__Group__14661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_SpUni__NameAssignment_1_in_rule__ACT_SpUni__Group__1__Impl4688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_SpUni__Group__2__Impl_in_rule__ACT_SpUni__Group__24718 = new BitSet(new long[]{0x00000000800000F0L});
    public static final BitSet FOLLOW_rule__ACT_SpUni__Group__3_in_rule__ACT_SpUni__Group__24721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ACT_SpUni__Group__2__Impl4749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_SpUni__Group__3__Impl_in_rule__ACT_SpUni__Group__34780 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__ACT_SpUni__Group__4_in_rule__ACT_SpUni__Group__34783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_SpUni__RateAssignment_3_in_rule__ACT_SpUni__Group__3__Impl4810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_SpUni__Group__4__Impl_in_rule__ACT_SpUni__Group__44840 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__ACT_SpUni__Group__5_in_rule__ACT_SpUni__Group__44843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ACT_SpUni__Group__4__Impl4871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_SpUni__Group__5__Impl_in_rule__ACT_SpUni__Group__54902 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__ACT_SpUni__Group__6_in_rule__ACT_SpUni__Group__54905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ACT_SpUni__Group__5__Impl4933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_SpUni__Group__6__Impl_in_rule__ACT_SpUni__Group__64964 = new BitSet(new long[]{0x000020008000C000L});
    public static final BitSet FOLLOW_rule__ACT_SpUni__Group__7_in_rule__ACT_SpUni__Group__64967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ACT_SpUni__Group__6__Impl4995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_SpUni__Group__7__Impl_in_rule__ACT_SpUni__Group__75026 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__ACT_SpUni__Group__8_in_rule__ACT_SpUni__Group__75029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_SpUni__RangeAssignment_7_in_rule__ACT_SpUni__Group__7__Impl5056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_SpUni__Group__8__Impl_in_rule__ACT_SpUni__Group__85086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ACT_SpUni__Group__8__Impl5114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_InBr__Group__0__Impl_in_rule__ACT_InBr__Group__05163 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__ACT_InBr__Group__1_in_rule__ACT_InBr__Group__05166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ACT_InBr__Group__0__Impl5194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_InBr__Group__1__Impl_in_rule__ACT_InBr__Group__15225 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ACT_InBr__Group__2_in_rule__ACT_InBr__Group__15228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_InBr__NameAssignment_1_in_rule__ACT_InBr__Group__1__Impl5255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_InBr__Group__2__Impl_in_rule__ACT_InBr__Group__25285 = new BitSet(new long[]{0x00000000800000F0L});
    public static final BitSet FOLLOW_rule__ACT_InBr__Group__3_in_rule__ACT_InBr__Group__25288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ACT_InBr__Group__2__Impl5316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_InBr__Group__3__Impl_in_rule__ACT_InBr__Group__35347 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__ACT_InBr__Group__4_in_rule__ACT_InBr__Group__35350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_InBr__RateAssignment_3_in_rule__ACT_InBr__Group__3__Impl5377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_InBr__Group__4__Impl_in_rule__ACT_InBr__Group__45407 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__ACT_InBr__Group__5_in_rule__ACT_InBr__Group__45410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ACT_InBr__Group__4__Impl5438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_InBr__Group__5__Impl_in_rule__ACT_InBr__Group__55469 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__ACT_InBr__Group__6_in_rule__ACT_InBr__Group__55472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__ACT_InBr__Group__5__Impl5500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_InBr__Group__6__Impl_in_rule__ACT_InBr__Group__65531 = new BitSet(new long[]{0x0000C000800000F0L});
    public static final BitSet FOLLOW_rule__ACT_InBr__Group__7_in_rule__ACT_InBr__Group__65534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ACT_InBr__Group__6__Impl5562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_InBr__Group__7__Impl_in_rule__ACT_InBr__Group__75593 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__ACT_InBr__Group__8_in_rule__ACT_InBr__Group__75596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_InBr__ValueAssignment_7_in_rule__ACT_InBr__Group__7__Impl5623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_InBr__Group__8__Impl_in_rule__ACT_InBr__Group__85653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ACT_InBr__Group__8__Impl5681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_InUni__Group__0__Impl_in_rule__ACT_InUni__Group__05730 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__ACT_InUni__Group__1_in_rule__ACT_InUni__Group__05733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__ACT_InUni__Group__0__Impl5761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_InUni__Group__1__Impl_in_rule__ACT_InUni__Group__15792 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ACT_InUni__Group__2_in_rule__ACT_InUni__Group__15795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_InUni__NameAssignment_1_in_rule__ACT_InUni__Group__1__Impl5822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_InUni__Group__2__Impl_in_rule__ACT_InUni__Group__25852 = new BitSet(new long[]{0x00000000800000F0L});
    public static final BitSet FOLLOW_rule__ACT_InUni__Group__3_in_rule__ACT_InUni__Group__25855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ACT_InUni__Group__2__Impl5883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_InUni__Group__3__Impl_in_rule__ACT_InUni__Group__35914 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__ACT_InUni__Group__4_in_rule__ACT_InUni__Group__35917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_InUni__RateAssignment_3_in_rule__ACT_InUni__Group__3__Impl5944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_InUni__Group__4__Impl_in_rule__ACT_InUni__Group__45974 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__ACT_InUni__Group__5_in_rule__ACT_InUni__Group__45977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ACT_InUni__Group__4__Impl6005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_InUni__Group__5__Impl_in_rule__ACT_InUni__Group__56036 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__ACT_InUni__Group__6_in_rule__ACT_InUni__Group__56039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__ACT_InUni__Group__5__Impl6067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_InUni__Group__6__Impl_in_rule__ACT_InUni__Group__66098 = new BitSet(new long[]{0x0000C000800000F0L});
    public static final BitSet FOLLOW_rule__ACT_InUni__Group__7_in_rule__ACT_InUni__Group__66101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ACT_InUni__Group__6__Impl6129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_InUni__Group__7__Impl_in_rule__ACT_InUni__Group__76160 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__ACT_InUni__Group__8_in_rule__ACT_InUni__Group__76163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_InUni__ValueAssignment_7_in_rule__ACT_InUni__Group__7__Impl6190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ACT_InUni__Group__8__Impl_in_rule__ACT_InUni__Group__86220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ACT_InUni__Group__8__Impl6248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IRange__Group_2__0__Impl_in_rule__IRange__Group_2__06297 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__IRange__Group_2__1_in_rule__IRange__Group_2__06300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__IRange__Group_2__0__Impl6328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IRange__Group_2__1__Impl_in_rule__IRange__Group_2__16359 = new BitSet(new long[]{0x00000000800000F0L});
    public static final BitSet FOLLOW_rule__IRange__Group_2__2_in_rule__IRange__Group_2__16362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__IRange__Group_2__1__Impl6390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IRange__Group_2__2__Impl_in_rule__IRange__Group_2__26421 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__IRange__Group_2__3_in_rule__IRange__Group_2__26424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRATE_Expr_in_rule__IRange__Group_2__2__Impl6451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IRange__Group_2__3__Impl_in_rule__IRange__Group_2__36480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__IRange__Group_2__3__Impl6508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IRange__Group_3__0__Impl_in_rule__IRange__Group_3__06547 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__IRange__Group_3__1_in_rule__IRange__Group_3__06550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLOC_in_rule__IRange__Group_3__0__Impl6577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IRange__Group_3__1__Impl_in_rule__IRange__Group_3__16606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IRange__Group_3_1__0_in_rule__IRange__Group_3__1__Impl6633 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__IRange__Group_3_1__0__Impl_in_rule__IRange__Group_3_1__06668 = new BitSet(new long[]{0x000020008000C000L});
    public static final BitSet FOLLOW_rule__IRange__Group_3_1__1_in_rule__IRange__Group_3_1__06671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__IRange__Group_3_1__0__Impl6699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IRange__Group_3_1__1__Impl_in_rule__IRange__Group_3_1__16730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLOC_in_rule__IRange__Group_3_1__1__Impl6757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PR_Expr__Group__0__Impl_in_rule__PR_Expr__Group__06790 = new BitSet(new long[]{0x0000000000FC0000L});
    public static final BitSet FOLLOW_rule__PR_Expr__Group__1_in_rule__PR_Expr__Group__06793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PR_Expr__PrEAssignment_0_in_rule__PR_Expr__Group__0__Impl6820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PR_Expr__Group__1__Impl_in_rule__PR_Expr__Group__16850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PR_Expr__Group_1__0_in_rule__PR_Expr__Group__1__Impl6877 = new BitSet(new long[]{0x0000000000FC0002L});
    public static final BitSet FOLLOW_rule__PR_Expr__Group_1__0__Impl_in_rule__PR_Expr__Group_1__06912 = new BitSet(new long[]{0x0000C000800000F0L});
    public static final BitSet FOLLOW_rule__PR_Expr__Group_1__1_in_rule__PR_Expr__Group_1__06915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMATH_OP_in_rule__PR_Expr__Group_1__0__Impl6942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PR_Expr__Group_1__1__Impl_in_rule__PR_Expr__Group_1__16971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PR_Expr__PrEAssignment_1_1_in_rule__PR_Expr__Group_1__1__Impl6998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminal_PR_Expr__Group_0__0__Impl_in_rule__Terminal_PR_Expr__Group_0__07032 = new BitSet(new long[]{0x0000C000800000F0L});
    public static final BitSet FOLLOW_rule__Terminal_PR_Expr__Group_0__1_in_rule__Terminal_PR_Expr__Group_0__07035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Terminal_PR_Expr__Group_0__0__Impl7063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminal_PR_Expr__Group_0__1__Impl_in_rule__Terminal_PR_Expr__Group_0__17094 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Terminal_PR_Expr__Group_0__2_in_rule__Terminal_PR_Expr__Group_0__17097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePR_Expr_in_rule__Terminal_PR_Expr__Group_0__1__Impl7124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminal_PR_Expr__Group_0__2__Impl_in_rule__Terminal_PR_Expr__Group_0__27153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Terminal_PR_Expr__Group_0__2__Impl7181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RATE_Expr__Group__0__Impl_in_rule__RATE_Expr__Group__07218 = new BitSet(new long[]{0x0000000000FC0000L});
    public static final BitSet FOLLOW_rule__RATE_Expr__Group__1_in_rule__RATE_Expr__Group__07221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RATE_Expr__RtAssignment_0_in_rule__RATE_Expr__Group__0__Impl7248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RATE_Expr__Group__1__Impl_in_rule__RATE_Expr__Group__17278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RATE_Expr__Group_1__0_in_rule__RATE_Expr__Group__1__Impl7305 = new BitSet(new long[]{0x0000000000FC0002L});
    public static final BitSet FOLLOW_rule__RATE_Expr__Group_1__0__Impl_in_rule__RATE_Expr__Group_1__07340 = new BitSet(new long[]{0x00000000800000F0L});
    public static final BitSet FOLLOW_rule__RATE_Expr__Group_1__1_in_rule__RATE_Expr__Group_1__07343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMATH_OP_in_rule__RATE_Expr__Group_1__0__Impl7370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RATE_Expr__Group_1__1__Impl_in_rule__RATE_Expr__Group_1__17399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RATE_Expr__RtAssignment_1_1_in_rule__RATE_Expr__Group_1__1__Impl7426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminal_RATE_Expr__Group_0__0__Impl_in_rule__Terminal_RATE_Expr__Group_0__07460 = new BitSet(new long[]{0x00000000800000F0L});
    public static final BitSet FOLLOW_rule__Terminal_RATE_Expr__Group_0__1_in_rule__Terminal_RATE_Expr__Group_0__07463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Terminal_RATE_Expr__Group_0__0__Impl7491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminal_RATE_Expr__Group_0__1__Impl_in_rule__Terminal_RATE_Expr__Group_0__17522 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Terminal_RATE_Expr__Group_0__2_in_rule__Terminal_RATE_Expr__Group_0__17525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRATE_Expr_in_rule__Terminal_RATE_Expr__Group_0__1__Impl7552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminal_RATE_Expr__Group_0__2__Impl_in_rule__Terminal_RATE_Expr__Group_0__27581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Terminal_RATE_Expr__Group_0__2__Impl7609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dist__Group__0__Impl_in_rule__Dist__Group__07646 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Dist__Group__1_in_rule__Dist__Group__07649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Dist__Group__0__Impl7677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dist__Group__1__Impl_in_rule__Dist__Group__17708 = new BitSet(new long[]{0x000020008003C000L});
    public static final BitSet FOLLOW_rule__Dist__Group__2_in_rule__Dist__Group__17711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Dist__Group__1__Impl7739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dist__Group__2__Impl_in_rule__Dist__Group__27770 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Dist__Group__3_in_rule__Dist__Group__27773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dist__Alternatives_2_in_rule__Dist__Group__2__Impl7800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dist__Group__3__Impl_in_rule__Dist__Group__37830 = new BitSet(new long[]{0x000020008003C000L});
    public static final BitSet FOLLOW_rule__Dist__Group__4_in_rule__Dist__Group__37833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Dist__Group__3__Impl7861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dist__Group__4__Impl_in_rule__Dist__Group__47892 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Dist__Group__5_in_rule__Dist__Group__47895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dist__Alternatives_4_in_rule__Dist__Group__4__Impl7922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dist__Group__5__Impl_in_rule__Dist__Group__57952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Dist__Group__5__Impl7980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AGENT_NUM__Group__0__Impl_in_rule__AGENT_NUM__Group__08023 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__AGENT_NUM__Group__1_in_rule__AGENT_NUM__Group__08026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__AGENT_NUM__Group__0__Impl8054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AGENT_NUM__Group__1__Impl_in_rule__AGENT_NUM__Group__18085 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__AGENT_NUM__Group__2_in_rule__AGENT_NUM__Group__18088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AGENT_NUM__TypeAssignment_1_in_rule__AGENT_NUM__Group__1__Impl8115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AGENT_NUM__Group__2__Impl_in_rule__AGENT_NUM__Group__28145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__AGENT_NUM__Group__2__Impl8173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__POPULATION__Group__0__Impl_in_rule__POPULATION__Group__08210 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__POPULATION__Group__1_in_rule__POPULATION__Group__08213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__POPULATION__PopuAssignment_0_in_rule__POPULATION__Group__0__Impl8240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__POPULATION__Group__1__Impl_in_rule__POPULATION__Group__18270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__POPULATION__Group_1__0_in_rule__POPULATION__Group__1__Impl8297 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_rule__POPULATION__Group_1__0__Impl_in_rule__POPULATION__Group_1__08332 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__POPULATION__Group_1__1_in_rule__POPULATION__Group_1__08335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__POPULATION__Group_1__0__Impl8363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__POPULATION__Group_1__1__Impl_in_rule__POPULATION__Group_1__18394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__POPULATION__PopuAssignment_1_1_in_rule__POPULATION__Group_1__1__Impl8421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AGENTS__Group__0__Impl_in_rule__AGENTS__Group__08455 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__AGENTS__Group__1_in_rule__AGENTS__Group__08458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AGENTS__TypeAssignment_0_in_rule__AGENTS__Group__0__Impl8485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AGENTS__Group__1__Impl_in_rule__AGENTS__Group__18515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AGENTS__Group_1__0_in_rule__AGENTS__Group__1__Impl8542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AGENTS__Group_1__0__Impl_in_rule__AGENTS__Group_1__08577 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AGENTS__Group_1__1_in_rule__AGENTS__Group_1__08580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__AGENTS__Group_1__0__Impl8608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AGENTS__Group_1__1__Impl_in_rule__AGENTS__Group_1__18639 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__AGENTS__Group_1__2_in_rule__AGENTS__Group_1__18642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__AGENTS__Group_1__1__Impl8669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AGENTS__Group_1__2__Impl_in_rule__AGENTS__Group_1__28698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__AGENTS__Group_1__2__Impl8726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LOC__Group__0__Impl_in_rule__LOC__Group__08763 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LOC__Group__1_in_rule__LOC__Group__08766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__LOC__Group__0__Impl8794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LOC__Group__1__Impl_in_rule__LOC__Group__18825 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__LOC__Group__2_in_rule__LOC__Group__18828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__LOC__Group__1__Impl8855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LOC__Group__2__Impl_in_rule__LOC__Group__28884 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LOC__Group__3_in_rule__LOC__Group__28887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__LOC__Group__2__Impl8915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LOC__Group__3__Impl_in_rule__LOC__Group__38946 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__LOC__Group__4_in_rule__LOC__Group__38949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__LOC__Group__3__Impl8976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LOC__Group__4__Impl_in_rule__LOC__Group__49005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__LOC__Group__4__Impl9033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AGENT__Group__0__Impl_in_rule__AGENT__Group__09074 = new BitSet(new long[]{0x000020008000C000L});
    public static final BitSet FOLLOW_rule__AGENT__Group__1_in_rule__AGENT__Group__09077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AGENT__Group__0__Impl9104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AGENT__Group__1__Impl_in_rule__AGENT__Group__19133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLOC_in_rule__AGENT__Group__1__Impl9160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MATH_Expr__Group__0__Impl_in_rule__MATH_Expr__Group__09193 = new BitSet(new long[]{0x0000000000FC0000L});
    public static final BitSet FOLLOW_rule__MATH_Expr__Group__1_in_rule__MATH_Expr__Group__09196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminal_Math_Expr_in_rule__MATH_Expr__Group__0__Impl9223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MATH_Expr__Group__1__Impl_in_rule__MATH_Expr__Group__19252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MATH_Expr__Group_1__0_in_rule__MATH_Expr__Group__1__Impl9279 = new BitSet(new long[]{0x0000000000FC0002L});
    public static final BitSet FOLLOW_rule__MATH_Expr__Group_1__0__Impl_in_rule__MATH_Expr__Group_1__09314 = new BitSet(new long[]{0x0000000080000070L});
    public static final BitSet FOLLOW_rule__MATH_Expr__Group_1__1_in_rule__MATH_Expr__Group_1__09317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMATH_OP_in_rule__MATH_Expr__Group_1__0__Impl9344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MATH_Expr__Group_1__1__Impl_in_rule__MATH_Expr__Group_1__19373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminal_Math_Expr_in_rule__MATH_Expr__Group_1__1__Impl9400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminal_Math_Expr__Group_0__0__Impl_in_rule__Terminal_Math_Expr__Group_0__09433 = new BitSet(new long[]{0x0000000080000070L});
    public static final BitSet FOLLOW_rule__Terminal_Math_Expr__Group_0__1_in_rule__Terminal_Math_Expr__Group_0__09436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Terminal_Math_Expr__Group_0__0__Impl9464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminal_Math_Expr__Group_0__1__Impl_in_rule__Terminal_Math_Expr__Group_0__19495 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Terminal_Math_Expr__Group_0__2_in_rule__Terminal_Math_Expr__Group_0__19498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMATH_Expr_in_rule__Terminal_Math_Expr__Group_0__1__Impl9525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminal_Math_Expr__Group_0__2__Impl_in_rule__Terminal_Math_Expr__Group_0__29554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Terminal_Math_Expr__Group_0__2__Impl9582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_rule__Model__ParamsAssignment_19624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAgentState_in_rule__Model__StatesAssignment_39655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePOPULATION_in_rule__Model__PopulationAssignment_59686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Param__NameAssignment_19717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMATH_Expr_in_rule__Param__ValueAssignment_39748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAGENT_in_rule__AgentState__NameAssignment_09779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_rule__AgentState__PrefixsAssignment_29810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_rule__AgentState__PrefixsAssignment_3_19841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleACTION_in_rule__Prefix__ActionAssignment_09872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAGENT_in_rule__Prefix__ContinueAssignment_19903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ACT_SpNoMsg__NameAssignment_19934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRATE_Expr_in_rule__ACT_SpNoMsg__RateAssignment_39965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ACT_SpBr__NameAssignment_19996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRATE_Expr_in_rule__ACT_SpBr__RateAssignment_310027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIRange_in_rule__ACT_SpBr__RangeAssignment_710058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ACT_SpUni__NameAssignment_110089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRATE_Expr_in_rule__ACT_SpUni__RateAssignment_310120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIRange_in_rule__ACT_SpUni__RangeAssignment_710151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ACT_InBr__NameAssignment_110182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRATE_Expr_in_rule__ACT_InBr__RateAssignment_310213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePR_Expr_in_rule__ACT_InBr__ValueAssignment_710244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ACT_InUni__NameAssignment_110275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRATE_Expr_in_rule__ACT_InUni__RateAssignment_310306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePR_Expr_in_rule__ACT_InUni__ValueAssignment_710337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminal_PR_Expr_in_rule__PR_Expr__PrEAssignment_010368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminal_PR_Expr_in_rule__PR_Expr__PrEAssignment_1_110399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Terminal_PR_Expr__LinkedParamAssignment_1_110430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminal_RATE_Expr_in_rule__RATE_Expr__RtAssignment_010461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminal_RATE_Expr_in_rule__RATE_Expr__RtAssignment_1_110492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Terminal_RATE_Expr__LinkedParamAssignment_1_110523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAGENT_in_rule__AGENT_NUM__TypeAssignment_110554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAGENTS_in_rule__POPULATION__PopuAssignment_010585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAGENTS_in_rule__POPULATION__PopuAssignment_1_110616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAGENT_in_rule__AGENTS__TypeAssignment_010647 = new BitSet(new long[]{0x0000000000000002L});

}