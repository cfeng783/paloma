package org.xtext.edinburgh.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.edinburgh.services.PalomaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPalomaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_DOUBLE", "RULE_DOUBLE_SCIENTIFIC", "RULE_EXPONENT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'#params'", "'#states'", "'#agents'", "'param'", "'='", "';'", "':='", "'+'", "'('", "','", "')'", "'.'", "'!('", "')@'", "'IR'", "'{'", "'}.'", "'!!('", "'?('", "'Pr'", "'??('", "'Wt'", "'local'", "'all'", "'range'", "'dist'", "'loc_s'", "'loc_r'", "'|'", "'||'", "'['", "']'", "'^'", "'-'", "'*'", "'/'", "'%'"
    };
    public static final int RULE_ID=4;
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
    public static final int RULE_INT=5;
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
    public static final int RULE_DOUBLE=6;
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
    public static final int RULE_DOUBLE_SCIENTIFIC=7;
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
    public String getGrammarFileName() { return "../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g"; }



     	private PalomaGrammarAccess grammarAccess;
     	
        public InternalPalomaParser(TokenStream input, PalomaGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected PalomaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:76:1: ruleModel returns [EObject current=null] : (otherlv_0= '#params' ( (lv_params_1_0= ruleParam ) )* otherlv_2= '#states' ( (lv_states_3_0= ruleAgentState ) )+ otherlv_4= '#agents' ( (lv_population_5_0= rulePOPULATION ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_params_1_0 = null;

        EObject lv_states_3_0 = null;

        EObject lv_population_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:79:28: ( (otherlv_0= '#params' ( (lv_params_1_0= ruleParam ) )* otherlv_2= '#states' ( (lv_states_3_0= ruleAgentState ) )+ otherlv_4= '#agents' ( (lv_population_5_0= rulePOPULATION ) ) ) )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:80:1: (otherlv_0= '#params' ( (lv_params_1_0= ruleParam ) )* otherlv_2= '#states' ( (lv_states_3_0= ruleAgentState ) )+ otherlv_4= '#agents' ( (lv_population_5_0= rulePOPULATION ) ) )
            {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:80:1: (otherlv_0= '#params' ( (lv_params_1_0= ruleParam ) )* otherlv_2= '#states' ( (lv_states_3_0= ruleAgentState ) )+ otherlv_4= '#agents' ( (lv_population_5_0= rulePOPULATION ) ) )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:80:3: otherlv_0= '#params' ( (lv_params_1_0= ruleParam ) )* otherlv_2= '#states' ( (lv_states_3_0= ruleAgentState ) )+ otherlv_4= '#agents' ( (lv_population_5_0= rulePOPULATION ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getParamsKeyword_0());
                
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:84:1: ( (lv_params_1_0= ruleParam ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:85:1: (lv_params_1_0= ruleParam )
            	    {
            	    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:85:1: (lv_params_1_0= ruleParam )
            	    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:86:3: lv_params_1_0= ruleParam
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getParamsParamParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParam_in_ruleModel143);
            	    lv_params_1_0=ruleParam();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"params",
            	            		lv_params_1_0, 
            	            		"Param");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleModel156); 

                	newLeafNode(otherlv_2, grammarAccess.getModelAccess().getStatesKeyword_2());
                
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:106:1: ( (lv_states_3_0= ruleAgentState ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:107:1: (lv_states_3_0= ruleAgentState )
            	    {
            	    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:107:1: (lv_states_3_0= ruleAgentState )
            	    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:108:3: lv_states_3_0= ruleAgentState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getStatesAgentStateParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAgentState_in_ruleModel177);
            	    lv_states_3_0=ruleAgentState();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"states",
            	            		lv_states_3_0, 
            	            		"AgentState");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


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

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleModel190); 

                	newLeafNode(otherlv_4, grammarAccess.getModelAccess().getAgentsKeyword_4());
                
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:128:1: ( (lv_population_5_0= rulePOPULATION ) )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:129:1: (lv_population_5_0= rulePOPULATION )
            {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:129:1: (lv_population_5_0= rulePOPULATION )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:130:3: lv_population_5_0= rulePOPULATION
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getPopulationPOPULATIONParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_rulePOPULATION_in_ruleModel211);
            lv_population_5_0=rulePOPULATION();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"population",
                    		lv_population_5_0, 
                    		"POPULATION");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleParam"
    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:154:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:155:2: (iv_ruleParam= ruleParam EOF )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:156:2: iv_ruleParam= ruleParam EOF
            {
             newCompositeNode(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_ruleParam_in_entryRuleParam247);
            iv_ruleParam=ruleParam();

            state._fsp--;

             current =iv_ruleParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParam257); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParam"


    // $ANTLR start "ruleParam"
    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:163:1: ruleParam returns [EObject current=null] : (otherlv_0= 'param' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleMATH_Expr ) ) otherlv_4= ';' ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:166:28: ( (otherlv_0= 'param' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleMATH_Expr ) ) otherlv_4= ';' ) )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:167:1: (otherlv_0= 'param' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleMATH_Expr ) ) otherlv_4= ';' )
            {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:167:1: (otherlv_0= 'param' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleMATH_Expr ) ) otherlv_4= ';' )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:167:3: otherlv_0= 'param' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleMATH_Expr ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleParam294); 

                	newLeafNode(otherlv_0, grammarAccess.getParamAccess().getParamKeyword_0());
                
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:171:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:172:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:172:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:173:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParam311); 

            			newLeafNode(lv_name_1_0, grammarAccess.getParamAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getParamRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleParam328); 

                	newLeafNode(otherlv_2, grammarAccess.getParamAccess().getEqualsSignKeyword_2());
                
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:193:1: ( (lv_value_3_0= ruleMATH_Expr ) )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:194:1: (lv_value_3_0= ruleMATH_Expr )
            {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:194:1: (lv_value_3_0= ruleMATH_Expr )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:195:3: lv_value_3_0= ruleMATH_Expr
            {
             
            	        newCompositeNode(grammarAccess.getParamAccess().getValueMATH_ExprParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleMATH_Expr_in_ruleParam349);
            lv_value_3_0=ruleMATH_Expr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParamRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"MATH_Expr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleParam361); 

                	newLeafNode(otherlv_4, grammarAccess.getParamAccess().getSemicolonKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParam"


    // $ANTLR start "entryRuleAgentState"
    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:223:1: entryRuleAgentState returns [EObject current=null] : iv_ruleAgentState= ruleAgentState EOF ;
    public final EObject entryRuleAgentState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAgentState = null;


        try {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:224:2: (iv_ruleAgentState= ruleAgentState EOF )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:225:2: iv_ruleAgentState= ruleAgentState EOF
            {
             newCompositeNode(grammarAccess.getAgentStateRule()); 
            pushFollow(FOLLOW_ruleAgentState_in_entryRuleAgentState397);
            iv_ruleAgentState=ruleAgentState();

            state._fsp--;

             current =iv_ruleAgentState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAgentState407); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAgentState"


    // $ANTLR start "ruleAgentState"
    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:232:1: ruleAgentState returns [EObject current=null] : ( ( (lv_name_0_0= ruleAGENT ) ) otherlv_1= ':=' ( (lv_prefixs_2_0= rulePrefix ) ) (otherlv_3= '+' ( (lv_prefixs_4_0= rulePrefix ) ) )* otherlv_5= ';' ) ;
    public final EObject ruleAgentState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_prefixs_2_0 = null;

        EObject lv_prefixs_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:235:28: ( ( ( (lv_name_0_0= ruleAGENT ) ) otherlv_1= ':=' ( (lv_prefixs_2_0= rulePrefix ) ) (otherlv_3= '+' ( (lv_prefixs_4_0= rulePrefix ) ) )* otherlv_5= ';' ) )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:236:1: ( ( (lv_name_0_0= ruleAGENT ) ) otherlv_1= ':=' ( (lv_prefixs_2_0= rulePrefix ) ) (otherlv_3= '+' ( (lv_prefixs_4_0= rulePrefix ) ) )* otherlv_5= ';' )
            {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:236:1: ( ( (lv_name_0_0= ruleAGENT ) ) otherlv_1= ':=' ( (lv_prefixs_2_0= rulePrefix ) ) (otherlv_3= '+' ( (lv_prefixs_4_0= rulePrefix ) ) )* otherlv_5= ';' )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:236:2: ( (lv_name_0_0= ruleAGENT ) ) otherlv_1= ':=' ( (lv_prefixs_2_0= rulePrefix ) ) (otherlv_3= '+' ( (lv_prefixs_4_0= rulePrefix ) ) )* otherlv_5= ';'
            {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:236:2: ( (lv_name_0_0= ruleAGENT ) )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:237:1: (lv_name_0_0= ruleAGENT )
            {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:237:1: (lv_name_0_0= ruleAGENT )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:238:3: lv_name_0_0= ruleAGENT
            {
             
            	        newCompositeNode(grammarAccess.getAgentStateAccess().getNameAGENTParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAGENT_in_ruleAgentState453);
            lv_name_0_0=ruleAGENT();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAgentStateRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"AGENT");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleAgentState465); 

                	newLeafNode(otherlv_1, grammarAccess.getAgentStateAccess().getColonEqualsSignKeyword_1());
                
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:258:1: ( (lv_prefixs_2_0= rulePrefix ) )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:259:1: (lv_prefixs_2_0= rulePrefix )
            {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:259:1: (lv_prefixs_2_0= rulePrefix )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:260:3: lv_prefixs_2_0= rulePrefix
            {
             
            	        newCompositeNode(grammarAccess.getAgentStateAccess().getPrefixsPrefixParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulePrefix_in_ruleAgentState486);
            lv_prefixs_2_0=rulePrefix();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAgentStateRule());
            	        }
                   		add(
                   			current, 
                   			"prefixs",
                    		lv_prefixs_2_0, 
                    		"Prefix");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:276:2: (otherlv_3= '+' ( (lv_prefixs_4_0= rulePrefix ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==21) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:276:4: otherlv_3= '+' ( (lv_prefixs_4_0= rulePrefix ) )
            	    {
            	    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleAgentState499); 

            	        	newLeafNode(otherlv_3, grammarAccess.getAgentStateAccess().getPlusSignKeyword_3_0());
            	        
            	    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:280:1: ( (lv_prefixs_4_0= rulePrefix ) )
            	    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:281:1: (lv_prefixs_4_0= rulePrefix )
            	    {
            	    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:281:1: (lv_prefixs_4_0= rulePrefix )
            	    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:282:3: lv_prefixs_4_0= rulePrefix
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAgentStateAccess().getPrefixsPrefixParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrefix_in_ruleAgentState520);
            	    lv_prefixs_4_0=rulePrefix();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAgentStateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"prefixs",
            	            		lv_prefixs_4_0, 
            	            		"Prefix");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleAgentState534); 

                	newLeafNode(otherlv_5, grammarAccess.getAgentStateAccess().getSemicolonKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAgentState"


    // $ANTLR start "entryRulePrefix"
    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:310:1: entryRulePrefix returns [EObject current=null] : iv_rulePrefix= rulePrefix EOF ;
    public final EObject entryRulePrefix() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefix = null;


        try {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:311:2: (iv_rulePrefix= rulePrefix EOF )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:312:2: iv_rulePrefix= rulePrefix EOF
            {
             newCompositeNode(grammarAccess.getPrefixRule()); 
            pushFollow(FOLLOW_rulePrefix_in_entryRulePrefix570);
            iv_rulePrefix=rulePrefix();

            state._fsp--;

             current =iv_rulePrefix; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrefix580); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrefix"


    // $ANTLR start "rulePrefix"
    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:319:1: rulePrefix returns [EObject current=null] : ( ( (lv_action_0_0= ruleACTION ) ) ( (lv_continue_1_0= ruleAGENT ) ) ) ;
    public final EObject rulePrefix() throws RecognitionException {
        EObject current = null;

        EObject lv_action_0_0 = null;

        AntlrDatatypeRuleToken lv_continue_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:322:28: ( ( ( (lv_action_0_0= ruleACTION ) ) ( (lv_continue_1_0= ruleAGENT ) ) ) )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:323:1: ( ( (lv_action_0_0= ruleACTION ) ) ( (lv_continue_1_0= ruleAGENT ) ) )
            {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:323:1: ( ( (lv_action_0_0= ruleACTION ) ) ( (lv_continue_1_0= ruleAGENT ) ) )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:323:2: ( (lv_action_0_0= ruleACTION ) ) ( (lv_continue_1_0= ruleAGENT ) )
            {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:323:2: ( (lv_action_0_0= ruleACTION ) )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:324:1: (lv_action_0_0= ruleACTION )
            {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:324:1: (lv_action_0_0= ruleACTION )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:325:3: lv_action_0_0= ruleACTION
            {
             
            	        newCompositeNode(grammarAccess.getPrefixAccess().getActionACTIONParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleACTION_in_rulePrefix626);
            lv_action_0_0=ruleACTION();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPrefixRule());
            	        }
                   		set(
                   			current, 
                   			"action",
                    		lv_action_0_0, 
                    		"ACTION");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:341:2: ( (lv_continue_1_0= ruleAGENT ) )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:342:1: (lv_continue_1_0= ruleAGENT )
            {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:342:1: (lv_continue_1_0= ruleAGENT )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:343:3: lv_continue_1_0= ruleAGENT
            {
             
            	        newCompositeNode(grammarAccess.getPrefixAccess().getContinueAGENTParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAGENT_in_rulePrefix647);
            lv_continue_1_0=ruleAGENT();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPrefixRule());
            	        }
                   		set(
                   			current, 
                   			"continue",
                    		lv_continue_1_0, 
                    		"AGENT");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrefix"


    // $ANTLR start "entryRuleACTION"
    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:367:1: entryRuleACTION returns [EObject current=null] : iv_ruleACTION= ruleACTION EOF ;
    public final EObject entryRuleACTION() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleACTION = null;


        try {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:368:2: (iv_ruleACTION= ruleACTION EOF )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:369:2: iv_ruleACTION= ruleACTION EOF
            {
             newCompositeNode(grammarAccess.getACTIONRule()); 
            pushFollow(FOLLOW_ruleACTION_in_entryRuleACTION683);
            iv_ruleACTION=ruleACTION();

            state._fsp--;

             current =iv_ruleACTION; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleACTION693); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleACTION"


    // $ANTLR start "ruleACTION"
    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:376:1: ruleACTION returns [EObject current=null] : (this_ACT_SpNoMsg_0= ruleACT_SpNoMsg | this_ACT_SpBr_1= ruleACT_SpBr | this_ACT_SpUni_2= ruleACT_SpUni | this_ACT_InBr_3= ruleACT_InBr | this_ACT_InUni_4= ruleACT_InUni ) ;
    public final EObject ruleACTION() throws RecognitionException {
        EObject current = null;

        EObject this_ACT_SpNoMsg_0 = null;

        EObject this_ACT_SpBr_1 = null;

        EObject this_ACT_SpUni_2 = null;

        EObject this_ACT_InBr_3 = null;

        EObject this_ACT_InUni_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:379:28: ( (this_ACT_SpNoMsg_0= ruleACT_SpNoMsg | this_ACT_SpBr_1= ruleACT_SpBr | this_ACT_SpUni_2= ruleACT_SpUni | this_ACT_InBr_3= ruleACT_InBr | this_ACT_InUni_4= ruleACT_InUni ) )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:380:1: (this_ACT_SpNoMsg_0= ruleACT_SpNoMsg | this_ACT_SpBr_1= ruleACT_SpBr | this_ACT_SpUni_2= ruleACT_SpUni | this_ACT_InBr_3= ruleACT_InBr | this_ACT_InUni_4= ruleACT_InUni )
            {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:380:1: (this_ACT_SpNoMsg_0= ruleACT_SpNoMsg | this_ACT_SpBr_1= ruleACT_SpBr | this_ACT_SpUni_2= ruleACT_SpUni | this_ACT_InBr_3= ruleACT_InBr | this_ACT_InUni_4= ruleACT_InUni )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt4=1;
                }
                break;
            case 26:
                {
                alt4=2;
                }
                break;
            case 31:
                {
                alt4=3;
                }
                break;
            case 32:
                {
                alt4=4;
                }
                break;
            case 34:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:381:5: this_ACT_SpNoMsg_0= ruleACT_SpNoMsg
                    {
                     
                            newCompositeNode(grammarAccess.getACTIONAccess().getACT_SpNoMsgParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleACT_SpNoMsg_in_ruleACTION740);
                    this_ACT_SpNoMsg_0=ruleACT_SpNoMsg();

                    state._fsp--;

                     
                            current = this_ACT_SpNoMsg_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:391:5: this_ACT_SpBr_1= ruleACT_SpBr
                    {
                     
                            newCompositeNode(grammarAccess.getACTIONAccess().getACT_SpBrParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleACT_SpBr_in_ruleACTION767);
                    this_ACT_SpBr_1=ruleACT_SpBr();

                    state._fsp--;

                     
                            current = this_ACT_SpBr_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:401:5: this_ACT_SpUni_2= ruleACT_SpUni
                    {
                     
                            newCompositeNode(grammarAccess.getACTIONAccess().getACT_SpUniParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleACT_SpUni_in_ruleACTION794);
                    this_ACT_SpUni_2=ruleACT_SpUni();

                    state._fsp--;

                     
                            current = this_ACT_SpUni_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:411:5: this_ACT_InBr_3= ruleACT_InBr
                    {
                     
                            newCompositeNode(grammarAccess.getACTIONAccess().getACT_InBrParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleACT_InBr_in_ruleACTION821);
                    this_ACT_InBr_3=ruleACT_InBr();

                    state._fsp--;

                     
                            current = this_ACT_InBr_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:421:5: this_ACT_InUni_4= ruleACT_InUni
                    {
                     
                            newCompositeNode(grammarAccess.getACTIONAccess().getACT_InUniParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleACT_InUni_in_ruleACTION848);
                    this_ACT_InUni_4=ruleACT_InUni();

                    state._fsp--;

                     
                            current = this_ACT_InUni_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleACTION"


    // $ANTLR start "entryRuleACT_SpNoMsg"
    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:437:1: entryRuleACT_SpNoMsg returns [EObject current=null] : iv_ruleACT_SpNoMsg= ruleACT_SpNoMsg EOF ;
    public final EObject entryRuleACT_SpNoMsg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleACT_SpNoMsg = null;


        try {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:438:2: (iv_ruleACT_SpNoMsg= ruleACT_SpNoMsg EOF )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:439:2: iv_ruleACT_SpNoMsg= ruleACT_SpNoMsg EOF
            {
             newCompositeNode(grammarAccess.getACT_SpNoMsgRule()); 
            pushFollow(FOLLOW_ruleACT_SpNoMsg_in_entryRuleACT_SpNoMsg883);
            iv_ruleACT_SpNoMsg=ruleACT_SpNoMsg();

            state._fsp--;

             current =iv_ruleACT_SpNoMsg; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleACT_SpNoMsg893); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleACT_SpNoMsg"


    // $ANTLR start "ruleACT_SpNoMsg"
    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:446:1: ruleACT_SpNoMsg returns [EObject current=null] : (otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_rate_3_0= ruleRATE_Expr ) ) otherlv_4= ')' otherlv_5= '.' ) ;
    public final EObject ruleACT_SpNoMsg() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_rate_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:449:28: ( (otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_rate_3_0= ruleRATE_Expr ) ) otherlv_4= ')' otherlv_5= '.' ) )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:450:1: (otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_rate_3_0= ruleRATE_Expr ) ) otherlv_4= ')' otherlv_5= '.' )
            {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:450:1: (otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_rate_3_0= ruleRATE_Expr ) ) otherlv_4= ')' otherlv_5= '.' )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:450:3: otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_rate_3_0= ruleRATE_Expr ) ) otherlv_4= ')' otherlv_5= '.'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleACT_SpNoMsg930); 

                	newLeafNode(otherlv_0, grammarAccess.getACT_SpNoMsgAccess().getLeftParenthesisKeyword_0());
                
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:454:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:455:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:455:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:456:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleACT_SpNoMsg947); 

            			newLeafNode(lv_name_1_0, grammarAccess.getACT_SpNoMsgAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getACT_SpNoMsgRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleACT_SpNoMsg964); 

                	newLeafNode(otherlv_2, grammarAccess.getACT_SpNoMsgAccess().getCommaKeyword_2());
                
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:476:1: ( (lv_rate_3_0= ruleRATE_Expr ) )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:477:1: (lv_rate_3_0= ruleRATE_Expr )
            {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:477:1: (lv_rate_3_0= ruleRATE_Expr )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:478:3: lv_rate_3_0= ruleRATE_Expr
            {
             
            	        newCompositeNode(grammarAccess.getACT_SpNoMsgAccess().getRateRATE_ExprParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleRATE_Expr_in_ruleACT_SpNoMsg985);
            lv_rate_3_0=ruleRATE_Expr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getACT_SpNoMsgRule());
            	        }
                   		set(
                   			current, 
                   			"rate",
                    		lv_rate_3_0, 
                    		"RATE_Expr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleACT_SpNoMsg997); 

                	newLeafNode(otherlv_4, grammarAccess.getACT_SpNoMsgAccess().getRightParenthesisKeyword_4());
                
            otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleACT_SpNoMsg1009); 

                	newLeafNode(otherlv_5, grammarAccess.getACT_SpNoMsgAccess().getFullStopKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleACT_SpNoMsg"


    // $ANTLR start "entryRuleACT_SpBr"
    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:510:1: entryRuleACT_SpBr returns [EObject current=null] : iv_ruleACT_SpBr= ruleACT_SpBr EOF ;
    public final EObject entryRuleACT_SpBr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleACT_SpBr = null;


        try {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:511:2: (iv_ruleACT_SpBr= ruleACT_SpBr EOF )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:512:2: iv_ruleACT_SpBr= ruleACT_SpBr EOF
            {
             newCompositeNode(grammarAccess.getACT_SpBrRule()); 
            pushFollow(FOLLOW_ruleACT_SpBr_in_entryRuleACT_SpBr1045);
            iv_ruleACT_SpBr=ruleACT_SpBr();

            state._fsp--;

             current =iv_ruleACT_SpBr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleACT_SpBr1055); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleACT_SpBr"


    // $ANTLR start "ruleACT_SpBr"
    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:519:1: ruleACT_SpBr returns [EObject current=null] : (otherlv_0= '!(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_rate_3_0= ruleRATE_Expr ) ) otherlv_4= ')@' otherlv_5= 'IR' otherlv_6= '{' ( (lv_range_7_0= ruleIRange ) ) otherlv_8= '}.' ) ;
    public final EObject ruleACT_SpBr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_rate_3_0 = null;

        EObject lv_range_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:522:28: ( (otherlv_0= '!(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_rate_3_0= ruleRATE_Expr ) ) otherlv_4= ')@' otherlv_5= 'IR' otherlv_6= '{' ( (lv_range_7_0= ruleIRange ) ) otherlv_8= '}.' ) )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:523:1: (otherlv_0= '!(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_rate_3_0= ruleRATE_Expr ) ) otherlv_4= ')@' otherlv_5= 'IR' otherlv_6= '{' ( (lv_range_7_0= ruleIRange ) ) otherlv_8= '}.' )
            {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:523:1: (otherlv_0= '!(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_rate_3_0= ruleRATE_Expr ) ) otherlv_4= ')@' otherlv_5= 'IR' otherlv_6= '{' ( (lv_range_7_0= ruleIRange ) ) otherlv_8= '}.' )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:523:3: otherlv_0= '!(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_rate_3_0= ruleRATE_Expr ) ) otherlv_4= ')@' otherlv_5= 'IR' otherlv_6= '{' ( (lv_range_7_0= ruleIRange ) ) otherlv_8= '}.'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleACT_SpBr1092); 

                	newLeafNode(otherlv_0, grammarAccess.getACT_SpBrAccess().getExclamationMarkLeftParenthesisKeyword_0());
                
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:527:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:528:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:528:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:529:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleACT_SpBr1109); 

            			newLeafNode(lv_name_1_0, grammarAccess.getACT_SpBrAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getACT_SpBrRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleACT_SpBr1126); 

                	newLeafNode(otherlv_2, grammarAccess.getACT_SpBrAccess().getCommaKeyword_2());
                
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:549:1: ( (lv_rate_3_0= ruleRATE_Expr ) )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:550:1: (lv_rate_3_0= ruleRATE_Expr )
            {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:550:1: (lv_rate_3_0= ruleRATE_Expr )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:551:3: lv_rate_3_0= ruleRATE_Expr
            {
             
            	        newCompositeNode(grammarAccess.getACT_SpBrAccess().getRateRATE_ExprParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleRATE_Expr_in_ruleACT_SpBr1147);
            lv_rate_3_0=ruleRATE_Expr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getACT_SpBrRule());
            	        }
                   		set(
                   			current, 
                   			"rate",
                    		lv_rate_3_0, 
                    		"RATE_Expr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleACT_SpBr1159); 

                	newLeafNode(otherlv_4, grammarAccess.getACT_SpBrAccess().getRightParenthesisCommercialAtKeyword_4());
                
            otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleACT_SpBr1171); 

                	newLeafNode(otherlv_5, grammarAccess.getACT_SpBrAccess().getIRKeyword_5());
                
            otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleACT_SpBr1183); 

                	newLeafNode(otherlv_6, grammarAccess.getACT_SpBrAccess().getLeftCurlyBracketKeyword_6());
                
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:579:1: ( (lv_range_7_0= ruleIRange ) )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:580:1: (lv_range_7_0= ruleIRange )
            {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:580:1: (lv_range_7_0= ruleIRange )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:581:3: lv_range_7_0= ruleIRange
            {
             
            	        newCompositeNode(grammarAccess.getACT_SpBrAccess().getRangeIRangeParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleIRange_in_ruleACT_SpBr1204);
            lv_range_7_0=ruleIRange();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getACT_SpBrRule());
            	        }
                   		set(
                   			current, 
                   			"range",
                    		lv_range_7_0, 
                    		"IRange");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,30,FOLLOW_30_in_ruleACT_SpBr1216); 

                	newLeafNode(otherlv_8, grammarAccess.getACT_SpBrAccess().getRightCurlyBracketFullStopKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleACT_SpBr"


    // $ANTLR start "entryRuleACT_SpUni"
    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:609:1: entryRuleACT_SpUni returns [EObject current=null] : iv_ruleACT_SpUni= ruleACT_SpUni EOF ;
    public final EObject entryRuleACT_SpUni() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleACT_SpUni = null;


        try {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:610:2: (iv_ruleACT_SpUni= ruleACT_SpUni EOF )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:611:2: iv_ruleACT_SpUni= ruleACT_SpUni EOF
            {
             newCompositeNode(grammarAccess.getACT_SpUniRule()); 
            pushFollow(FOLLOW_ruleACT_SpUni_in_entryRuleACT_SpUni1252);
            iv_ruleACT_SpUni=ruleACT_SpUni();

            state._fsp--;

             current =iv_ruleACT_SpUni; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleACT_SpUni1262); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleACT_SpUni"


    // $ANTLR start "ruleACT_SpUni"
    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:618:1: ruleACT_SpUni returns [EObject current=null] : (otherlv_0= '!!(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_rate_3_0= ruleRATE_Expr ) ) otherlv_4= ')@' otherlv_5= 'IR' otherlv_6= '{' ( (lv_range_7_0= ruleIRange ) ) otherlv_8= '}.' ) ;
    public final EObject ruleACT_SpUni() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_rate_3_0 = null;

        EObject lv_range_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:621:28: ( (otherlv_0= '!!(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_rate_3_0= ruleRATE_Expr ) ) otherlv_4= ')@' otherlv_5= 'IR' otherlv_6= '{' ( (lv_range_7_0= ruleIRange ) ) otherlv_8= '}.' ) )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:622:1: (otherlv_0= '!!(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_rate_3_0= ruleRATE_Expr ) ) otherlv_4= ')@' otherlv_5= 'IR' otherlv_6= '{' ( (lv_range_7_0= ruleIRange ) ) otherlv_8= '}.' )
            {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:622:1: (otherlv_0= '!!(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_rate_3_0= ruleRATE_Expr ) ) otherlv_4= ')@' otherlv_5= 'IR' otherlv_6= '{' ( (lv_range_7_0= ruleIRange ) ) otherlv_8= '}.' )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:622:3: otherlv_0= '!!(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_rate_3_0= ruleRATE_Expr ) ) otherlv_4= ')@' otherlv_5= 'IR' otherlv_6= '{' ( (lv_range_7_0= ruleIRange ) ) otherlv_8= '}.'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleACT_SpUni1299); 

                	newLeafNode(otherlv_0, grammarAccess.getACT_SpUniAccess().getExclamationMarkExclamationMarkLeftParenthesisKeyword_0());
                
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:626:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:627:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:627:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:628:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleACT_SpUni1316); 

            			newLeafNode(lv_name_1_0, grammarAccess.getACT_SpUniAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getACT_SpUniRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleACT_SpUni1333); 

                	newLeafNode(otherlv_2, grammarAccess.getACT_SpUniAccess().getCommaKeyword_2());
                
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:648:1: ( (lv_rate_3_0= ruleRATE_Expr ) )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:649:1: (lv_rate_3_0= ruleRATE_Expr )
            {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:649:1: (lv_rate_3_0= ruleRATE_Expr )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:650:3: lv_rate_3_0= ruleRATE_Expr
            {
             
            	        newCompositeNode(grammarAccess.getACT_SpUniAccess().getRateRATE_ExprParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleRATE_Expr_in_ruleACT_SpUni1354);
            lv_rate_3_0=ruleRATE_Expr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getACT_SpUniRule());
            	        }
                   		set(
                   			current, 
                   			"rate",
                    		lv_rate_3_0, 
                    		"RATE_Expr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleACT_SpUni1366); 

                	newLeafNode(otherlv_4, grammarAccess.getACT_SpUniAccess().getRightParenthesisCommercialAtKeyword_4());
                
            otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleACT_SpUni1378); 

                	newLeafNode(otherlv_5, grammarAccess.getACT_SpUniAccess().getIRKeyword_5());
                
            otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleACT_SpUni1390); 

                	newLeafNode(otherlv_6, grammarAccess.getACT_SpUniAccess().getLeftCurlyBracketKeyword_6());
                
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:678:1: ( (lv_range_7_0= ruleIRange ) )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:679:1: (lv_range_7_0= ruleIRange )
            {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:679:1: (lv_range_7_0= ruleIRange )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:680:3: lv_range_7_0= ruleIRange
            {
             
            	        newCompositeNode(grammarAccess.getACT_SpUniAccess().getRangeIRangeParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleIRange_in_ruleACT_SpUni1411);
            lv_range_7_0=ruleIRange();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getACT_SpUniRule());
            	        }
                   		set(
                   			current, 
                   			"range",
                    		lv_range_7_0, 
                    		"IRange");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,30,FOLLOW_30_in_ruleACT_SpUni1423); 

                	newLeafNode(otherlv_8, grammarAccess.getACT_SpUniAccess().getRightCurlyBracketFullStopKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleACT_SpUni"


    // $ANTLR start "entryRuleACT_InBr"
    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:708:1: entryRuleACT_InBr returns [EObject current=null] : iv_ruleACT_InBr= ruleACT_InBr EOF ;
    public final EObject entryRuleACT_InBr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleACT_InBr = null;


        try {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:709:2: (iv_ruleACT_InBr= ruleACT_InBr EOF )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:710:2: iv_ruleACT_InBr= ruleACT_InBr EOF
            {
             newCompositeNode(grammarAccess.getACT_InBrRule()); 
            pushFollow(FOLLOW_ruleACT_InBr_in_entryRuleACT_InBr1459);
            iv_ruleACT_InBr=ruleACT_InBr();

            state._fsp--;

             current =iv_ruleACT_InBr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleACT_InBr1469); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleACT_InBr"


    // $ANTLR start "ruleACT_InBr"
    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:717:1: ruleACT_InBr returns [EObject current=null] : (otherlv_0= '?(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_rate_3_0= ruleRATE_Expr ) ) otherlv_4= ')@' otherlv_5= 'Pr' otherlv_6= '{' ( (lv_value_7_0= rulePR_Expr ) ) otherlv_8= '}.' ) ;
    public final EObject ruleACT_InBr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_rate_3_0 = null;

        EObject lv_value_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:720:28: ( (otherlv_0= '?(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_rate_3_0= ruleRATE_Expr ) ) otherlv_4= ')@' otherlv_5= 'Pr' otherlv_6= '{' ( (lv_value_7_0= rulePR_Expr ) ) otherlv_8= '}.' ) )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:721:1: (otherlv_0= '?(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_rate_3_0= ruleRATE_Expr ) ) otherlv_4= ')@' otherlv_5= 'Pr' otherlv_6= '{' ( (lv_value_7_0= rulePR_Expr ) ) otherlv_8= '}.' )
            {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:721:1: (otherlv_0= '?(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_rate_3_0= ruleRATE_Expr ) ) otherlv_4= ')@' otherlv_5= 'Pr' otherlv_6= '{' ( (lv_value_7_0= rulePR_Expr ) ) otherlv_8= '}.' )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:721:3: otherlv_0= '?(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_rate_3_0= ruleRATE_Expr ) ) otherlv_4= ')@' otherlv_5= 'Pr' otherlv_6= '{' ( (lv_value_7_0= rulePR_Expr ) ) otherlv_8= '}.'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleACT_InBr1506); 

                	newLeafNode(otherlv_0, grammarAccess.getACT_InBrAccess().getQuestionMarkLeftParenthesisKeyword_0());
                
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:725:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:726:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:726:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:727:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleACT_InBr1523); 

            			newLeafNode(lv_name_1_0, grammarAccess.getACT_InBrAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getACT_InBrRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleACT_InBr1540); 

                	newLeafNode(otherlv_2, grammarAccess.getACT_InBrAccess().getCommaKeyword_2());
                
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:747:1: ( (lv_rate_3_0= ruleRATE_Expr ) )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:748:1: (lv_rate_3_0= ruleRATE_Expr )
            {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:748:1: (lv_rate_3_0= ruleRATE_Expr )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:749:3: lv_rate_3_0= ruleRATE_Expr
            {
             
            	        newCompositeNode(grammarAccess.getACT_InBrAccess().getRateRATE_ExprParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleRATE_Expr_in_ruleACT_InBr1561);
            lv_rate_3_0=ruleRATE_Expr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getACT_InBrRule());
            	        }
                   		set(
                   			current, 
                   			"rate",
                    		lv_rate_3_0, 
                    		"RATE_Expr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleACT_InBr1573); 

                	newLeafNode(otherlv_4, grammarAccess.getACT_InBrAccess().getRightParenthesisCommercialAtKeyword_4());
                
            otherlv_5=(Token)match(input,33,FOLLOW_33_in_ruleACT_InBr1585); 

                	newLeafNode(otherlv_5, grammarAccess.getACT_InBrAccess().getPrKeyword_5());
                
            otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleACT_InBr1597); 

                	newLeafNode(otherlv_6, grammarAccess.getACT_InBrAccess().getLeftCurlyBracketKeyword_6());
                
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:777:1: ( (lv_value_7_0= rulePR_Expr ) )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:778:1: (lv_value_7_0= rulePR_Expr )
            {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:778:1: (lv_value_7_0= rulePR_Expr )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:779:3: lv_value_7_0= rulePR_Expr
            {
             
            	        newCompositeNode(grammarAccess.getACT_InBrAccess().getValuePR_ExprParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_rulePR_Expr_in_ruleACT_InBr1618);
            lv_value_7_0=rulePR_Expr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getACT_InBrRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_7_0, 
                    		"PR_Expr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,30,FOLLOW_30_in_ruleACT_InBr1630); 

                	newLeafNode(otherlv_8, grammarAccess.getACT_InBrAccess().getRightCurlyBracketFullStopKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleACT_InBr"


    // $ANTLR start "entryRuleACT_InUni"
    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:807:1: entryRuleACT_InUni returns [EObject current=null] : iv_ruleACT_InUni= ruleACT_InUni EOF ;
    public final EObject entryRuleACT_InUni() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleACT_InUni = null;


        try {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:808:2: (iv_ruleACT_InUni= ruleACT_InUni EOF )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:809:2: iv_ruleACT_InUni= ruleACT_InUni EOF
            {
             newCompositeNode(grammarAccess.getACT_InUniRule()); 
            pushFollow(FOLLOW_ruleACT_InUni_in_entryRuleACT_InUni1666);
            iv_ruleACT_InUni=ruleACT_InUni();

            state._fsp--;

             current =iv_ruleACT_InUni; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleACT_InUni1676); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleACT_InUni"


    // $ANTLR start "ruleACT_InUni"
    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:816:1: ruleACT_InUni returns [EObject current=null] : (otherlv_0= '??(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_rate_3_0= ruleRATE_Expr ) ) otherlv_4= ')@' otherlv_5= 'Wt' otherlv_6= '{' ( (lv_value_7_0= rulePR_Expr ) ) otherlv_8= '}.' ) ;
    public final EObject ruleACT_InUni() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_rate_3_0 = null;

        EObject lv_value_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:819:28: ( (otherlv_0= '??(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_rate_3_0= ruleRATE_Expr ) ) otherlv_4= ')@' otherlv_5= 'Wt' otherlv_6= '{' ( (lv_value_7_0= rulePR_Expr ) ) otherlv_8= '}.' ) )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:820:1: (otherlv_0= '??(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_rate_3_0= ruleRATE_Expr ) ) otherlv_4= ')@' otherlv_5= 'Wt' otherlv_6= '{' ( (lv_value_7_0= rulePR_Expr ) ) otherlv_8= '}.' )
            {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:820:1: (otherlv_0= '??(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_rate_3_0= ruleRATE_Expr ) ) otherlv_4= ')@' otherlv_5= 'Wt' otherlv_6= '{' ( (lv_value_7_0= rulePR_Expr ) ) otherlv_8= '}.' )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:820:3: otherlv_0= '??(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_rate_3_0= ruleRATE_Expr ) ) otherlv_4= ')@' otherlv_5= 'Wt' otherlv_6= '{' ( (lv_value_7_0= rulePR_Expr ) ) otherlv_8= '}.'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleACT_InUni1713); 

                	newLeafNode(otherlv_0, grammarAccess.getACT_InUniAccess().getQuestionMarkQuestionMarkLeftParenthesisKeyword_0());
                
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:824:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:825:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:825:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:826:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleACT_InUni1730); 

            			newLeafNode(lv_name_1_0, grammarAccess.getACT_InUniAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getACT_InUniRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleACT_InUni1747); 

                	newLeafNode(otherlv_2, grammarAccess.getACT_InUniAccess().getCommaKeyword_2());
                
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:846:1: ( (lv_rate_3_0= ruleRATE_Expr ) )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:847:1: (lv_rate_3_0= ruleRATE_Expr )
            {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:847:1: (lv_rate_3_0= ruleRATE_Expr )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:848:3: lv_rate_3_0= ruleRATE_Expr
            {
             
            	        newCompositeNode(grammarAccess.getACT_InUniAccess().getRateRATE_ExprParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleRATE_Expr_in_ruleACT_InUni1768);
            lv_rate_3_0=ruleRATE_Expr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getACT_InUniRule());
            	        }
                   		set(
                   			current, 
                   			"rate",
                    		lv_rate_3_0, 
                    		"RATE_Expr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleACT_InUni1780); 

                	newLeafNode(otherlv_4, grammarAccess.getACT_InUniAccess().getRightParenthesisCommercialAtKeyword_4());
                
            otherlv_5=(Token)match(input,35,FOLLOW_35_in_ruleACT_InUni1792); 

                	newLeafNode(otherlv_5, grammarAccess.getACT_InUniAccess().getWtKeyword_5());
                
            otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleACT_InUni1804); 

                	newLeafNode(otherlv_6, grammarAccess.getACT_InUniAccess().getLeftCurlyBracketKeyword_6());
                
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:876:1: ( (lv_value_7_0= rulePR_Expr ) )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:877:1: (lv_value_7_0= rulePR_Expr )
            {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:877:1: (lv_value_7_0= rulePR_Expr )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:878:3: lv_value_7_0= rulePR_Expr
            {
             
            	        newCompositeNode(grammarAccess.getACT_InUniAccess().getValuePR_ExprParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_rulePR_Expr_in_ruleACT_InUni1825);
            lv_value_7_0=rulePR_Expr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getACT_InUniRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_7_0, 
                    		"PR_Expr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,30,FOLLOW_30_in_ruleACT_InUni1837); 

                	newLeafNode(otherlv_8, grammarAccess.getACT_InUniAccess().getRightCurlyBracketFullStopKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleACT_InUni"


    // $ANTLR start "entryRuleIRange"
    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:906:1: entryRuleIRange returns [EObject current=null] : iv_ruleIRange= ruleIRange EOF ;
    public final EObject entryRuleIRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIRange = null;


        try {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:907:2: (iv_ruleIRange= ruleIRange EOF )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:908:2: iv_ruleIRange= ruleIRange EOF
            {
             newCompositeNode(grammarAccess.getIRangeRule()); 
            pushFollow(FOLLOW_ruleIRange_in_entryRuleIRange1873);
            iv_ruleIRange=ruleIRange();

            state._fsp--;

             current =iv_ruleIRange; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIRange1883); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIRange"


    // $ANTLR start "ruleIRange"
    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:915:1: ruleIRange returns [EObject current=null] : (otherlv_0= 'local' | otherlv_1= 'all' | (otherlv_2= 'range' otherlv_3= '(' this_RATE_Expr_4= ruleRATE_Expr otherlv_5= ')' ) | ( ruleLOC (otherlv_7= ',' ruleLOC )* ) ) ;
    public final EObject ruleIRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_RATE_Expr_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:918:28: ( (otherlv_0= 'local' | otherlv_1= 'all' | (otherlv_2= 'range' otherlv_3= '(' this_RATE_Expr_4= ruleRATE_Expr otherlv_5= ')' ) | ( ruleLOC (otherlv_7= ',' ruleLOC )* ) ) )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:919:1: (otherlv_0= 'local' | otherlv_1= 'all' | (otherlv_2= 'range' otherlv_3= '(' this_RATE_Expr_4= ruleRATE_Expr otherlv_5= ')' ) | ( ruleLOC (otherlv_7= ',' ruleLOC )* ) )
            {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:919:1: (otherlv_0= 'local' | otherlv_1= 'all' | (otherlv_2= 'range' otherlv_3= '(' this_RATE_Expr_4= ruleRATE_Expr otherlv_5= ')' ) | ( ruleLOC (otherlv_7= ',' ruleLOC )* ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt6=1;
                }
                break;
            case 37:
                {
                alt6=2;
                }
                break;
            case 38:
                {
                alt6=3;
                }
                break;
            case 22:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:919:3: otherlv_0= 'local'
                    {
                    otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleIRange1920); 

                        	newLeafNode(otherlv_0, grammarAccess.getIRangeAccess().getLocalKeyword_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:924:7: otherlv_1= 'all'
                    {
                    otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleIRange1938); 

                        	newLeafNode(otherlv_1, grammarAccess.getIRangeAccess().getAllKeyword_1());
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:929:6: (otherlv_2= 'range' otherlv_3= '(' this_RATE_Expr_4= ruleRATE_Expr otherlv_5= ')' )
                    {
                    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:929:6: (otherlv_2= 'range' otherlv_3= '(' this_RATE_Expr_4= ruleRATE_Expr otherlv_5= ')' )
                    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:929:8: otherlv_2= 'range' otherlv_3= '(' this_RATE_Expr_4= ruleRATE_Expr otherlv_5= ')'
                    {
                    otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleIRange1957); 

                        	newLeafNode(otherlv_2, grammarAccess.getIRangeAccess().getRangeKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleIRange1969); 

                        	newLeafNode(otherlv_3, grammarAccess.getIRangeAccess().getLeftParenthesisKeyword_2_1());
                        
                     
                            newCompositeNode(grammarAccess.getIRangeAccess().getRATE_ExprParserRuleCall_2_2()); 
                        
                    pushFollow(FOLLOW_ruleRATE_Expr_in_ruleIRange1991);
                    this_RATE_Expr_4=ruleRATE_Expr();

                    state._fsp--;

                     
                            current = this_RATE_Expr_4; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleIRange2002); 

                        	newLeafNode(otherlv_5, grammarAccess.getIRangeAccess().getRightParenthesisKeyword_2_3());
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:951:6: ( ruleLOC (otherlv_7= ',' ruleLOC )* )
                    {
                    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:951:6: ( ruleLOC (otherlv_7= ',' ruleLOC )* )
                    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:952:5: ruleLOC (otherlv_7= ',' ruleLOC )*
                    {
                     
                            newCompositeNode(grammarAccess.getIRangeAccess().getLOCParserRuleCall_3_0()); 
                        
                    pushFollow(FOLLOW_ruleLOC_in_ruleIRange2026);
                    ruleLOC();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:959:1: (otherlv_7= ',' ruleLOC )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==23) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:959:3: otherlv_7= ',' ruleLOC
                    	    {
                    	    otherlv_7=(Token)match(input,23,FOLLOW_23_in_ruleIRange2038); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getIRangeAccess().getCommaKeyword_3_1_0());
                    	        
                    	     
                    	            newCompositeNode(grammarAccess.getIRangeAccess().getLOCParserRuleCall_3_1_1()); 
                    	        
                    	    pushFollow(FOLLOW_ruleLOC_in_ruleIRange2054);
                    	    ruleLOC();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIRange"


    // $ANTLR start "entryRulePR_Expr"
    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:979:1: entryRulePR_Expr returns [EObject current=null] : iv_rulePR_Expr= rulePR_Expr EOF ;
    public final EObject entryRulePR_Expr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePR_Expr = null;


        try {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:980:2: (iv_rulePR_Expr= rulePR_Expr EOF )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:981:2: iv_rulePR_Expr= rulePR_Expr EOF
            {
             newCompositeNode(grammarAccess.getPR_ExprRule()); 
            pushFollow(FOLLOW_rulePR_Expr_in_entryRulePR_Expr2092);
            iv_rulePR_Expr=rulePR_Expr();

            state._fsp--;

             current =iv_rulePR_Expr; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePR_Expr2102); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePR_Expr"


    // $ANTLR start "rulePR_Expr"
    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:988:1: rulePR_Expr returns [EObject current=null] : ( ( (lv_prE_0_0= ruleTerminal_PR_Expr ) ) ( ruleMATH_OP ( (lv_prE_2_0= ruleTerminal_PR_Expr ) ) )* ) ;
    public final EObject rulePR_Expr() throws RecognitionException {
        EObject current = null;

        EObject lv_prE_0_0 = null;

        EObject lv_prE_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:991:28: ( ( ( (lv_prE_0_0= ruleTerminal_PR_Expr ) ) ( ruleMATH_OP ( (lv_prE_2_0= ruleTerminal_PR_Expr ) ) )* ) )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:992:1: ( ( (lv_prE_0_0= ruleTerminal_PR_Expr ) ) ( ruleMATH_OP ( (lv_prE_2_0= ruleTerminal_PR_Expr ) ) )* )
            {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:992:1: ( ( (lv_prE_0_0= ruleTerminal_PR_Expr ) ) ( ruleMATH_OP ( (lv_prE_2_0= ruleTerminal_PR_Expr ) ) )* )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:992:2: ( (lv_prE_0_0= ruleTerminal_PR_Expr ) ) ( ruleMATH_OP ( (lv_prE_2_0= ruleTerminal_PR_Expr ) ) )*
            {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:992:2: ( (lv_prE_0_0= ruleTerminal_PR_Expr ) )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:993:1: (lv_prE_0_0= ruleTerminal_PR_Expr )
            {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:993:1: (lv_prE_0_0= ruleTerminal_PR_Expr )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:994:3: lv_prE_0_0= ruleTerminal_PR_Expr
            {
             
            	        newCompositeNode(grammarAccess.getPR_ExprAccess().getPrETerminal_PR_ExprParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleTerminal_PR_Expr_in_rulePR_Expr2148);
            lv_prE_0_0=ruleTerminal_PR_Expr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPR_ExprRule());
            	        }
                   		add(
                   			current, 
                   			"prE",
                    		lv_prE_0_0, 
                    		"Terminal_PR_Expr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1010:2: ( ruleMATH_OP ( (lv_prE_2_0= ruleTerminal_PR_Expr ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21||(LA7_0>=46 && LA7_0<=50)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1011:5: ruleMATH_OP ( (lv_prE_2_0= ruleTerminal_PR_Expr ) )
            	    {
            	     
            	            newCompositeNode(grammarAccess.getPR_ExprAccess().getMATH_OPParserRuleCall_1_0()); 
            	        
            	    pushFollow(FOLLOW_ruleMATH_OP_in_rulePR_Expr2165);
            	    ruleMATH_OP();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1018:1: ( (lv_prE_2_0= ruleTerminal_PR_Expr ) )
            	    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1019:1: (lv_prE_2_0= ruleTerminal_PR_Expr )
            	    {
            	    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1019:1: (lv_prE_2_0= ruleTerminal_PR_Expr )
            	    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1020:3: lv_prE_2_0= ruleTerminal_PR_Expr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPR_ExprAccess().getPrETerminal_PR_ExprParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTerminal_PR_Expr_in_rulePR_Expr2185);
            	    lv_prE_2_0=ruleTerminal_PR_Expr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPR_ExprRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"prE",
            	            		lv_prE_2_0, 
            	            		"Terminal_PR_Expr");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePR_Expr"


    // $ANTLR start "entryRuleTerminal_PR_Expr"
    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1044:1: entryRuleTerminal_PR_Expr returns [EObject current=null] : iv_ruleTerminal_PR_Expr= ruleTerminal_PR_Expr EOF ;
    public final EObject entryRuleTerminal_PR_Expr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminal_PR_Expr = null;


        try {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1045:2: (iv_ruleTerminal_PR_Expr= ruleTerminal_PR_Expr EOF )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1046:2: iv_ruleTerminal_PR_Expr= ruleTerminal_PR_Expr EOF
            {
             newCompositeNode(grammarAccess.getTerminal_PR_ExprRule()); 
            pushFollow(FOLLOW_ruleTerminal_PR_Expr_in_entryRuleTerminal_PR_Expr2223);
            iv_ruleTerminal_PR_Expr=ruleTerminal_PR_Expr();

            state._fsp--;

             current =iv_ruleTerminal_PR_Expr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminal_PR_Expr2233); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerminal_PR_Expr"


    // $ANTLR start "ruleTerminal_PR_Expr"
    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1053:1: ruleTerminal_PR_Expr returns [EObject current=null] : ( (otherlv_0= '(' this_PR_Expr_1= rulePR_Expr otherlv_2= ')' ) | ( ruleNUMBER | ( (lv_linkedParam_4_0= RULE_ID ) ) | ruleDist | this_AGENT_NUM_6= ruleAGENT_NUM ) ) ;
    public final EObject ruleTerminal_PR_Expr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_linkedParam_4_0=null;
        EObject this_PR_Expr_1 = null;

        EObject this_AGENT_NUM_6 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1056:28: ( ( (otherlv_0= '(' this_PR_Expr_1= rulePR_Expr otherlv_2= ')' ) | ( ruleNUMBER | ( (lv_linkedParam_4_0= RULE_ID ) ) | ruleDist | this_AGENT_NUM_6= ruleAGENT_NUM ) ) )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1057:1: ( (otherlv_0= '(' this_PR_Expr_1= rulePR_Expr otherlv_2= ')' ) | ( ruleNUMBER | ( (lv_linkedParam_4_0= RULE_ID ) ) | ruleDist | this_AGENT_NUM_6= ruleAGENT_NUM ) )
            {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1057:1: ( (otherlv_0= '(' this_PR_Expr_1= rulePR_Expr otherlv_2= ')' ) | ( ruleNUMBER | ( (lv_linkedParam_4_0= RULE_ID ) ) | ruleDist | this_AGENT_NUM_6= ruleAGENT_NUM ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_DOUBLE_SCIENTIFIC)||LA9_0==39||LA9_0==42) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1057:2: (otherlv_0= '(' this_PR_Expr_1= rulePR_Expr otherlv_2= ')' )
                    {
                    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1057:2: (otherlv_0= '(' this_PR_Expr_1= rulePR_Expr otherlv_2= ')' )
                    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1057:4: otherlv_0= '(' this_PR_Expr_1= rulePR_Expr otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleTerminal_PR_Expr2271); 

                        	newLeafNode(otherlv_0, grammarAccess.getTerminal_PR_ExprAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getTerminal_PR_ExprAccess().getPR_ExprParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_rulePR_Expr_in_ruleTerminal_PR_Expr2293);
                    this_PR_Expr_1=rulePR_Expr();

                    state._fsp--;

                     
                            current = this_PR_Expr_1; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleTerminal_PR_Expr2304); 

                        	newLeafNode(otherlv_2, grammarAccess.getTerminal_PR_ExprAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1075:6: ( ruleNUMBER | ( (lv_linkedParam_4_0= RULE_ID ) ) | ruleDist | this_AGENT_NUM_6= ruleAGENT_NUM )
                    {
                    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1075:6: ( ruleNUMBER | ( (lv_linkedParam_4_0= RULE_ID ) ) | ruleDist | this_AGENT_NUM_6= ruleAGENT_NUM )
                    int alt8=4;
                    switch ( input.LA(1) ) {
                    case RULE_INT:
                    case RULE_DOUBLE:
                    case RULE_DOUBLE_SCIENTIFIC:
                        {
                        alt8=1;
                        }
                        break;
                    case RULE_ID:
                        {
                        alt8=2;
                        }
                        break;
                    case 39:
                        {
                        alt8=3;
                        }
                        break;
                    case 42:
                        {
                        alt8=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }

                    switch (alt8) {
                        case 1 :
                            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1076:5: ruleNUMBER
                            {
                             
                                    newCompositeNode(grammarAccess.getTerminal_PR_ExprAccess().getNUMBERParserRuleCall_1_0()); 
                                
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleTerminal_PR_Expr2328);
                            ruleNUMBER();

                            state._fsp--;

                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;
                        case 2 :
                            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1084:6: ( (lv_linkedParam_4_0= RULE_ID ) )
                            {
                            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1084:6: ( (lv_linkedParam_4_0= RULE_ID ) )
                            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1085:1: (lv_linkedParam_4_0= RULE_ID )
                            {
                            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1085:1: (lv_linkedParam_4_0= RULE_ID )
                            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1086:3: lv_linkedParam_4_0= RULE_ID
                            {
                            lv_linkedParam_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTerminal_PR_Expr2350); 

                            			newLeafNode(lv_linkedParam_4_0, grammarAccess.getTerminal_PR_ExprAccess().getLinkedParamIDTerminalRuleCall_1_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getTerminal_PR_ExprRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"linkedParam",
                                    		lv_linkedParam_4_0, 
                                    		"ID");
                            	    

                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1104:5: ruleDist
                            {
                             
                                    newCompositeNode(grammarAccess.getTerminal_PR_ExprAccess().getDistParserRuleCall_1_2()); 
                                
                            pushFollow(FOLLOW_ruleDist_in_ruleTerminal_PR_Expr2377);
                            ruleDist();

                            state._fsp--;

                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;
                        case 4 :
                            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1113:5: this_AGENT_NUM_6= ruleAGENT_NUM
                            {
                             
                                    newCompositeNode(grammarAccess.getTerminal_PR_ExprAccess().getAGENT_NUMParserRuleCall_1_3()); 
                                
                            pushFollow(FOLLOW_ruleAGENT_NUM_in_ruleTerminal_PR_Expr2404);
                            this_AGENT_NUM_6=ruleAGENT_NUM();

                            state._fsp--;

                             
                                    current = this_AGENT_NUM_6; 
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerminal_PR_Expr"


    // $ANTLR start "entryRuleRATE_Expr"
    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1129:1: entryRuleRATE_Expr returns [EObject current=null] : iv_ruleRATE_Expr= ruleRATE_Expr EOF ;
    public final EObject entryRuleRATE_Expr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRATE_Expr = null;


        try {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1130:2: (iv_ruleRATE_Expr= ruleRATE_Expr EOF )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1131:2: iv_ruleRATE_Expr= ruleRATE_Expr EOF
            {
             newCompositeNode(grammarAccess.getRATE_ExprRule()); 
            pushFollow(FOLLOW_ruleRATE_Expr_in_entryRuleRATE_Expr2440);
            iv_ruleRATE_Expr=ruleRATE_Expr();

            state._fsp--;

             current =iv_ruleRATE_Expr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRATE_Expr2450); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRATE_Expr"


    // $ANTLR start "ruleRATE_Expr"
    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1138:1: ruleRATE_Expr returns [EObject current=null] : ( ( (lv_rt_0_0= ruleTerminal_RATE_Expr ) ) ( ruleMATH_OP ( (lv_rt_2_0= ruleTerminal_RATE_Expr ) ) )* ) ;
    public final EObject ruleRATE_Expr() throws RecognitionException {
        EObject current = null;

        EObject lv_rt_0_0 = null;

        EObject lv_rt_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1141:28: ( ( ( (lv_rt_0_0= ruleTerminal_RATE_Expr ) ) ( ruleMATH_OP ( (lv_rt_2_0= ruleTerminal_RATE_Expr ) ) )* ) )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1142:1: ( ( (lv_rt_0_0= ruleTerminal_RATE_Expr ) ) ( ruleMATH_OP ( (lv_rt_2_0= ruleTerminal_RATE_Expr ) ) )* )
            {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1142:1: ( ( (lv_rt_0_0= ruleTerminal_RATE_Expr ) ) ( ruleMATH_OP ( (lv_rt_2_0= ruleTerminal_RATE_Expr ) ) )* )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1142:2: ( (lv_rt_0_0= ruleTerminal_RATE_Expr ) ) ( ruleMATH_OP ( (lv_rt_2_0= ruleTerminal_RATE_Expr ) ) )*
            {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1142:2: ( (lv_rt_0_0= ruleTerminal_RATE_Expr ) )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1143:1: (lv_rt_0_0= ruleTerminal_RATE_Expr )
            {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1143:1: (lv_rt_0_0= ruleTerminal_RATE_Expr )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1144:3: lv_rt_0_0= ruleTerminal_RATE_Expr
            {
             
            	        newCompositeNode(grammarAccess.getRATE_ExprAccess().getRtTerminal_RATE_ExprParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleTerminal_RATE_Expr_in_ruleRATE_Expr2496);
            lv_rt_0_0=ruleTerminal_RATE_Expr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRATE_ExprRule());
            	        }
                   		add(
                   			current, 
                   			"rt",
                    		lv_rt_0_0, 
                    		"Terminal_RATE_Expr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1160:2: ( ruleMATH_OP ( (lv_rt_2_0= ruleTerminal_RATE_Expr ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21||(LA10_0>=46 && LA10_0<=50)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1161:5: ruleMATH_OP ( (lv_rt_2_0= ruleTerminal_RATE_Expr ) )
            	    {
            	     
            	            newCompositeNode(grammarAccess.getRATE_ExprAccess().getMATH_OPParserRuleCall_1_0()); 
            	        
            	    pushFollow(FOLLOW_ruleMATH_OP_in_ruleRATE_Expr2513);
            	    ruleMATH_OP();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1168:1: ( (lv_rt_2_0= ruleTerminal_RATE_Expr ) )
            	    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1169:1: (lv_rt_2_0= ruleTerminal_RATE_Expr )
            	    {
            	    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1169:1: (lv_rt_2_0= ruleTerminal_RATE_Expr )
            	    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1170:3: lv_rt_2_0= ruleTerminal_RATE_Expr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRATE_ExprAccess().getRtTerminal_RATE_ExprParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTerminal_RATE_Expr_in_ruleRATE_Expr2533);
            	    lv_rt_2_0=ruleTerminal_RATE_Expr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRATE_ExprRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rt",
            	            		lv_rt_2_0, 
            	            		"Terminal_RATE_Expr");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRATE_Expr"


    // $ANTLR start "entryRuleTerminal_RATE_Expr"
    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1194:1: entryRuleTerminal_RATE_Expr returns [EObject current=null] : iv_ruleTerminal_RATE_Expr= ruleTerminal_RATE_Expr EOF ;
    public final EObject entryRuleTerminal_RATE_Expr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminal_RATE_Expr = null;


        try {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1195:2: (iv_ruleTerminal_RATE_Expr= ruleTerminal_RATE_Expr EOF )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1196:2: iv_ruleTerminal_RATE_Expr= ruleTerminal_RATE_Expr EOF
            {
             newCompositeNode(grammarAccess.getTerminal_RATE_ExprRule()); 
            pushFollow(FOLLOW_ruleTerminal_RATE_Expr_in_entryRuleTerminal_RATE_Expr2571);
            iv_ruleTerminal_RATE_Expr=ruleTerminal_RATE_Expr();

            state._fsp--;

             current =iv_ruleTerminal_RATE_Expr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminal_RATE_Expr2581); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerminal_RATE_Expr"


    // $ANTLR start "ruleTerminal_RATE_Expr"
    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1203:1: ruleTerminal_RATE_Expr returns [EObject current=null] : ( (otherlv_0= '(' this_RATE_Expr_1= ruleRATE_Expr otherlv_2= ')' ) | ( ruleNUMBER | ( (lv_linkedParam_4_0= RULE_ID ) ) ) ) ;
    public final EObject ruleTerminal_RATE_Expr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_linkedParam_4_0=null;
        EObject this_RATE_Expr_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1206:28: ( ( (otherlv_0= '(' this_RATE_Expr_1= ruleRATE_Expr otherlv_2= ')' ) | ( ruleNUMBER | ( (lv_linkedParam_4_0= RULE_ID ) ) ) ) )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1207:1: ( (otherlv_0= '(' this_RATE_Expr_1= ruleRATE_Expr otherlv_2= ')' ) | ( ruleNUMBER | ( (lv_linkedParam_4_0= RULE_ID ) ) ) )
            {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1207:1: ( (otherlv_0= '(' this_RATE_Expr_1= ruleRATE_Expr otherlv_2= ')' ) | ( ruleNUMBER | ( (lv_linkedParam_4_0= RULE_ID ) ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            else if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_DOUBLE_SCIENTIFIC)) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1207:2: (otherlv_0= '(' this_RATE_Expr_1= ruleRATE_Expr otherlv_2= ')' )
                    {
                    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1207:2: (otherlv_0= '(' this_RATE_Expr_1= ruleRATE_Expr otherlv_2= ')' )
                    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1207:4: otherlv_0= '(' this_RATE_Expr_1= ruleRATE_Expr otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleTerminal_RATE_Expr2619); 

                        	newLeafNode(otherlv_0, grammarAccess.getTerminal_RATE_ExprAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getTerminal_RATE_ExprAccess().getRATE_ExprParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleRATE_Expr_in_ruleTerminal_RATE_Expr2641);
                    this_RATE_Expr_1=ruleRATE_Expr();

                    state._fsp--;

                     
                            current = this_RATE_Expr_1; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleTerminal_RATE_Expr2652); 

                        	newLeafNode(otherlv_2, grammarAccess.getTerminal_RATE_ExprAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1225:6: ( ruleNUMBER | ( (lv_linkedParam_4_0= RULE_ID ) ) )
                    {
                    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1225:6: ( ruleNUMBER | ( (lv_linkedParam_4_0= RULE_ID ) ) )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( ((LA11_0>=RULE_INT && LA11_0<=RULE_DOUBLE_SCIENTIFIC)) ) {
                        alt11=1;
                    }
                    else if ( (LA11_0==RULE_ID) ) {
                        alt11=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1226:5: ruleNUMBER
                            {
                             
                                    newCompositeNode(grammarAccess.getTerminal_RATE_ExprAccess().getNUMBERParserRuleCall_1_0()); 
                                
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleTerminal_RATE_Expr2676);
                            ruleNUMBER();

                            state._fsp--;

                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;
                        case 2 :
                            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1234:6: ( (lv_linkedParam_4_0= RULE_ID ) )
                            {
                            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1234:6: ( (lv_linkedParam_4_0= RULE_ID ) )
                            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1235:1: (lv_linkedParam_4_0= RULE_ID )
                            {
                            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1235:1: (lv_linkedParam_4_0= RULE_ID )
                            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1236:3: lv_linkedParam_4_0= RULE_ID
                            {
                            lv_linkedParam_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTerminal_RATE_Expr2698); 

                            			newLeafNode(lv_linkedParam_4_0, grammarAccess.getTerminal_RATE_ExprAccess().getLinkedParamIDTerminalRuleCall_1_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getTerminal_RATE_ExprRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"linkedParam",
                                    		lv_linkedParam_4_0, 
                                    		"ID");
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerminal_RATE_Expr"


    // $ANTLR start "entryRuleDist"
    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1260:1: entryRuleDist returns [String current=null] : iv_ruleDist= ruleDist EOF ;
    public final String entryRuleDist() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDist = null;


        try {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1261:2: (iv_ruleDist= ruleDist EOF )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1262:2: iv_ruleDist= ruleDist EOF
            {
             newCompositeNode(grammarAccess.getDistRule()); 
            pushFollow(FOLLOW_ruleDist_in_entryRuleDist2741);
            iv_ruleDist=ruleDist();

            state._fsp--;

             current =iv_ruleDist.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDist2752); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDist"


    // $ANTLR start "ruleDist"
    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1269:1: ruleDist returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'dist' kw= '(' (kw= 'loc_s' | kw= 'loc_r' | this_LOC_4= ruleLOC ) kw= ',' (kw= 'loc_s' | kw= 'loc_r' | this_LOC_8= ruleLOC ) kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleDist() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_LOC_4 = null;

        AntlrDatatypeRuleToken this_LOC_8 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1272:28: ( (kw= 'dist' kw= '(' (kw= 'loc_s' | kw= 'loc_r' | this_LOC_4= ruleLOC ) kw= ',' (kw= 'loc_s' | kw= 'loc_r' | this_LOC_8= ruleLOC ) kw= ')' ) )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1273:1: (kw= 'dist' kw= '(' (kw= 'loc_s' | kw= 'loc_r' | this_LOC_4= ruleLOC ) kw= ',' (kw= 'loc_s' | kw= 'loc_r' | this_LOC_8= ruleLOC ) kw= ')' )
            {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1273:1: (kw= 'dist' kw= '(' (kw= 'loc_s' | kw= 'loc_r' | this_LOC_4= ruleLOC ) kw= ',' (kw= 'loc_s' | kw= 'loc_r' | this_LOC_8= ruleLOC ) kw= ')' )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1274:2: kw= 'dist' kw= '(' (kw= 'loc_s' | kw= 'loc_r' | this_LOC_4= ruleLOC ) kw= ',' (kw= 'loc_s' | kw= 'loc_r' | this_LOC_8= ruleLOC ) kw= ')'
            {
            kw=(Token)match(input,39,FOLLOW_39_in_ruleDist2790); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDistAccess().getDistKeyword_0()); 
                
            kw=(Token)match(input,22,FOLLOW_22_in_ruleDist2803); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDistAccess().getLeftParenthesisKeyword_1()); 
                
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1285:1: (kw= 'loc_s' | kw= 'loc_r' | this_LOC_4= ruleLOC )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt13=1;
                }
                break;
            case 41:
                {
                alt13=2;
                }
                break;
            case 22:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1286:2: kw= 'loc_s'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleDist2817); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDistAccess().getLoc_sKeyword_2_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1293:2: kw= 'loc_r'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleDist2836); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDistAccess().getLoc_rKeyword_2_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1300:5: this_LOC_4= ruleLOC
                    {
                     
                            newCompositeNode(grammarAccess.getDistAccess().getLOCParserRuleCall_2_2()); 
                        
                    pushFollow(FOLLOW_ruleLOC_in_ruleDist2864);
                    this_LOC_4=ruleLOC();

                    state._fsp--;


                    		current.merge(this_LOC_4);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            kw=(Token)match(input,23,FOLLOW_23_in_ruleDist2883); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDistAccess().getCommaKeyword_3()); 
                
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1316:1: (kw= 'loc_s' | kw= 'loc_r' | this_LOC_8= ruleLOC )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt14=1;
                }
                break;
            case 41:
                {
                alt14=2;
                }
                break;
            case 22:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1317:2: kw= 'loc_s'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleDist2897); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDistAccess().getLoc_sKeyword_4_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1324:2: kw= 'loc_r'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleDist2916); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDistAccess().getLoc_rKeyword_4_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1331:5: this_LOC_8= ruleLOC
                    {
                     
                            newCompositeNode(grammarAccess.getDistAccess().getLOCParserRuleCall_4_2()); 
                        
                    pushFollow(FOLLOW_ruleLOC_in_ruleDist2944);
                    this_LOC_8=ruleLOC();

                    state._fsp--;


                    		current.merge(this_LOC_8);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            kw=(Token)match(input,24,FOLLOW_24_in_ruleDist2963); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDistAccess().getRightParenthesisKeyword_5()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDist"


    // $ANTLR start "entryRuleAGENT_NUM"
    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1355:1: entryRuleAGENT_NUM returns [EObject current=null] : iv_ruleAGENT_NUM= ruleAGENT_NUM EOF ;
    public final EObject entryRuleAGENT_NUM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAGENT_NUM = null;


        try {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1356:2: (iv_ruleAGENT_NUM= ruleAGENT_NUM EOF )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1357:2: iv_ruleAGENT_NUM= ruleAGENT_NUM EOF
            {
             newCompositeNode(grammarAccess.getAGENT_NUMRule()); 
            pushFollow(FOLLOW_ruleAGENT_NUM_in_entryRuleAGENT_NUM3003);
            iv_ruleAGENT_NUM=ruleAGENT_NUM();

            state._fsp--;

             current =iv_ruleAGENT_NUM; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAGENT_NUM3013); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAGENT_NUM"


    // $ANTLR start "ruleAGENT_NUM"
    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1364:1: ruleAGENT_NUM returns [EObject current=null] : (otherlv_0= '|' ( (lv_type_1_0= ruleAGENT ) ) otherlv_2= '|' ) ;
    public final EObject ruleAGENT_NUM() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1367:28: ( (otherlv_0= '|' ( (lv_type_1_0= ruleAGENT ) ) otherlv_2= '|' ) )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1368:1: (otherlv_0= '|' ( (lv_type_1_0= ruleAGENT ) ) otherlv_2= '|' )
            {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1368:1: (otherlv_0= '|' ( (lv_type_1_0= ruleAGENT ) ) otherlv_2= '|' )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1368:3: otherlv_0= '|' ( (lv_type_1_0= ruleAGENT ) ) otherlv_2= '|'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleAGENT_NUM3050); 

                	newLeafNode(otherlv_0, grammarAccess.getAGENT_NUMAccess().getVerticalLineKeyword_0());
                
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1372:1: ( (lv_type_1_0= ruleAGENT ) )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1373:1: (lv_type_1_0= ruleAGENT )
            {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1373:1: (lv_type_1_0= ruleAGENT )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1374:3: lv_type_1_0= ruleAGENT
            {
             
            	        newCompositeNode(grammarAccess.getAGENT_NUMAccess().getTypeAGENTParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAGENT_in_ruleAGENT_NUM3071);
            lv_type_1_0=ruleAGENT();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAGENT_NUMRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"AGENT");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleAGENT_NUM3083); 

                	newLeafNode(otherlv_2, grammarAccess.getAGENT_NUMAccess().getVerticalLineKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAGENT_NUM"


    // $ANTLR start "entryRulePOPULATION"
    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1402:1: entryRulePOPULATION returns [EObject current=null] : iv_rulePOPULATION= rulePOPULATION EOF ;
    public final EObject entryRulePOPULATION() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePOPULATION = null;


        try {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1403:2: (iv_rulePOPULATION= rulePOPULATION EOF )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1404:2: iv_rulePOPULATION= rulePOPULATION EOF
            {
             newCompositeNode(grammarAccess.getPOPULATIONRule()); 
            pushFollow(FOLLOW_rulePOPULATION_in_entryRulePOPULATION3119);
            iv_rulePOPULATION=rulePOPULATION();

            state._fsp--;

             current =iv_rulePOPULATION; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePOPULATION3129); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePOPULATION"


    // $ANTLR start "rulePOPULATION"
    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1411:1: rulePOPULATION returns [EObject current=null] : ( ( (lv_popu_0_0= ruleAGENTS ) ) (otherlv_1= '||' ( (lv_popu_2_0= ruleAGENTS ) ) )* ) ;
    public final EObject rulePOPULATION() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_popu_0_0 = null;

        EObject lv_popu_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1414:28: ( ( ( (lv_popu_0_0= ruleAGENTS ) ) (otherlv_1= '||' ( (lv_popu_2_0= ruleAGENTS ) ) )* ) )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1415:1: ( ( (lv_popu_0_0= ruleAGENTS ) ) (otherlv_1= '||' ( (lv_popu_2_0= ruleAGENTS ) ) )* )
            {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1415:1: ( ( (lv_popu_0_0= ruleAGENTS ) ) (otherlv_1= '||' ( (lv_popu_2_0= ruleAGENTS ) ) )* )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1415:2: ( (lv_popu_0_0= ruleAGENTS ) ) (otherlv_1= '||' ( (lv_popu_2_0= ruleAGENTS ) ) )*
            {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1415:2: ( (lv_popu_0_0= ruleAGENTS ) )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1416:1: (lv_popu_0_0= ruleAGENTS )
            {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1416:1: (lv_popu_0_0= ruleAGENTS )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1417:3: lv_popu_0_0= ruleAGENTS
            {
             
            	        newCompositeNode(grammarAccess.getPOPULATIONAccess().getPopuAGENTSParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAGENTS_in_rulePOPULATION3175);
            lv_popu_0_0=ruleAGENTS();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPOPULATIONRule());
            	        }
                   		add(
                   			current, 
                   			"popu",
                    		lv_popu_0_0, 
                    		"AGENTS");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1433:2: (otherlv_1= '||' ( (lv_popu_2_0= ruleAGENTS ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==43) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1433:4: otherlv_1= '||' ( (lv_popu_2_0= ruleAGENTS ) )
            	    {
            	    otherlv_1=(Token)match(input,43,FOLLOW_43_in_rulePOPULATION3188); 

            	        	newLeafNode(otherlv_1, grammarAccess.getPOPULATIONAccess().getVerticalLineVerticalLineKeyword_1_0());
            	        
            	    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1437:1: ( (lv_popu_2_0= ruleAGENTS ) )
            	    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1438:1: (lv_popu_2_0= ruleAGENTS )
            	    {
            	    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1438:1: (lv_popu_2_0= ruleAGENTS )
            	    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1439:3: lv_popu_2_0= ruleAGENTS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPOPULATIONAccess().getPopuAGENTSParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAGENTS_in_rulePOPULATION3209);
            	    lv_popu_2_0=ruleAGENTS();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPOPULATIONRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"popu",
            	            		lv_popu_2_0, 
            	            		"AGENTS");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePOPULATION"


    // $ANTLR start "entryRuleAGENTS"
    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1463:1: entryRuleAGENTS returns [EObject current=null] : iv_ruleAGENTS= ruleAGENTS EOF ;
    public final EObject entryRuleAGENTS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAGENTS = null;


        try {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1464:2: (iv_ruleAGENTS= ruleAGENTS EOF )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1465:2: iv_ruleAGENTS= ruleAGENTS EOF
            {
             newCompositeNode(grammarAccess.getAGENTSRule()); 
            pushFollow(FOLLOW_ruleAGENTS_in_entryRuleAGENTS3247);
            iv_ruleAGENTS=ruleAGENTS();

            state._fsp--;

             current =iv_ruleAGENTS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAGENTS3257); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAGENTS"


    // $ANTLR start "ruleAGENTS"
    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1472:1: ruleAGENTS returns [EObject current=null] : ( ( (lv_type_0_0= ruleAGENT ) ) (otherlv_1= '[' this_INT_2= RULE_INT otherlv_3= ']' )? ) ;
    public final EObject ruleAGENTS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_INT_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1475:28: ( ( ( (lv_type_0_0= ruleAGENT ) ) (otherlv_1= '[' this_INT_2= RULE_INT otherlv_3= ']' )? ) )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1476:1: ( ( (lv_type_0_0= ruleAGENT ) ) (otherlv_1= '[' this_INT_2= RULE_INT otherlv_3= ']' )? )
            {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1476:1: ( ( (lv_type_0_0= ruleAGENT ) ) (otherlv_1= '[' this_INT_2= RULE_INT otherlv_3= ']' )? )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1476:2: ( (lv_type_0_0= ruleAGENT ) ) (otherlv_1= '[' this_INT_2= RULE_INT otherlv_3= ']' )?
            {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1476:2: ( (lv_type_0_0= ruleAGENT ) )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1477:1: (lv_type_0_0= ruleAGENT )
            {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1477:1: (lv_type_0_0= ruleAGENT )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1478:3: lv_type_0_0= ruleAGENT
            {
             
            	        newCompositeNode(grammarAccess.getAGENTSAccess().getTypeAGENTParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAGENT_in_ruleAGENTS3303);
            lv_type_0_0=ruleAGENT();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAGENTSRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"AGENT");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1494:2: (otherlv_1= '[' this_INT_2= RULE_INT otherlv_3= ']' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==44) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1494:4: otherlv_1= '[' this_INT_2= RULE_INT otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleAGENTS3316); 

                        	newLeafNode(otherlv_1, grammarAccess.getAGENTSAccess().getLeftSquareBracketKeyword_1_0());
                        
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAGENTS3327); 
                     
                        newLeafNode(this_INT_2, grammarAccess.getAGENTSAccess().getINTTerminalRuleCall_1_1()); 
                        
                    otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleAGENTS3338); 

                        	newLeafNode(otherlv_3, grammarAccess.getAGENTSAccess().getRightSquareBracketKeyword_1_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAGENTS"


    // $ANTLR start "entryRuleMATH_OP"
    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1514:1: entryRuleMATH_OP returns [String current=null] : iv_ruleMATH_OP= ruleMATH_OP EOF ;
    public final String entryRuleMATH_OP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMATH_OP = null;


        try {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1515:2: (iv_ruleMATH_OP= ruleMATH_OP EOF )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1516:2: iv_ruleMATH_OP= ruleMATH_OP EOF
            {
             newCompositeNode(grammarAccess.getMATH_OPRule()); 
            pushFollow(FOLLOW_ruleMATH_OP_in_entryRuleMATH_OP3377);
            iv_ruleMATH_OP=ruleMATH_OP();

            state._fsp--;

             current =iv_ruleMATH_OP.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMATH_OP3388); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMATH_OP"


    // $ANTLR start "ruleMATH_OP"
    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1523:1: ruleMATH_OP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '^' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleMATH_OP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1526:28: ( (kw= '^' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' ) )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1527:1: (kw= '^' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' )
            {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1527:1: (kw= '^' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' )
            int alt17=6;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt17=1;
                }
                break;
            case 21:
                {
                alt17=2;
                }
                break;
            case 47:
                {
                alt17=3;
                }
                break;
            case 48:
                {
                alt17=4;
                }
                break;
            case 49:
                {
                alt17=5;
                }
                break;
            case 50:
                {
                alt17=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1528:2: kw= '^'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleMATH_OP3426); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMATH_OPAccess().getCircumflexAccentKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1535:2: kw= '+'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleMATH_OP3445); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMATH_OPAccess().getPlusSignKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1542:2: kw= '-'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleMATH_OP3464); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMATH_OPAccess().getHyphenMinusKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1549:2: kw= '*'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleMATH_OP3483); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMATH_OPAccess().getAsteriskKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1556:2: kw= '/'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleMATH_OP3502); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMATH_OPAccess().getSolidusKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1563:2: kw= '%'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleMATH_OP3521); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMATH_OPAccess().getPercentSignKeyword_5()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMATH_OP"


    // $ANTLR start "entryRuleNUMBER"
    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1576:1: entryRuleNUMBER returns [String current=null] : iv_ruleNUMBER= ruleNUMBER EOF ;
    public final String entryRuleNUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER = null;


        try {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1577:2: (iv_ruleNUMBER= ruleNUMBER EOF )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1578:2: iv_ruleNUMBER= ruleNUMBER EOF
            {
             newCompositeNode(grammarAccess.getNUMBERRule()); 
            pushFollow(FOLLOW_ruleNUMBER_in_entryRuleNUMBER3562);
            iv_ruleNUMBER=ruleNUMBER();

            state._fsp--;

             current =iv_ruleNUMBER.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNUMBER3573); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNUMBER"


    // $ANTLR start "ruleNUMBER"
    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1585:1: ruleNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_DOUBLE_1= RULE_DOUBLE | this_DOUBLE_SCIENTIFIC_2= RULE_DOUBLE_SCIENTIFIC ) ;
    public final AntlrDatatypeRuleToken ruleNUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_DOUBLE_1=null;
        Token this_DOUBLE_SCIENTIFIC_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1588:28: ( (this_INT_0= RULE_INT | this_DOUBLE_1= RULE_DOUBLE | this_DOUBLE_SCIENTIFIC_2= RULE_DOUBLE_SCIENTIFIC ) )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1589:1: (this_INT_0= RULE_INT | this_DOUBLE_1= RULE_DOUBLE | this_DOUBLE_SCIENTIFIC_2= RULE_DOUBLE_SCIENTIFIC )
            {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1589:1: (this_INT_0= RULE_INT | this_DOUBLE_1= RULE_DOUBLE | this_DOUBLE_SCIENTIFIC_2= RULE_DOUBLE_SCIENTIFIC )
            int alt18=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt18=1;
                }
                break;
            case RULE_DOUBLE:
                {
                alt18=2;
                }
                break;
            case RULE_DOUBLE_SCIENTIFIC:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1589:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNUMBER3613); 

                    		current.merge(this_INT_0);
                        
                     
                        newLeafNode(this_INT_0, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1597:10: this_DOUBLE_1= RULE_DOUBLE
                    {
                    this_DOUBLE_1=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleNUMBER3639); 

                    		current.merge(this_DOUBLE_1);
                        
                     
                        newLeafNode(this_DOUBLE_1, grammarAccess.getNUMBERAccess().getDOUBLETerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1605:10: this_DOUBLE_SCIENTIFIC_2= RULE_DOUBLE_SCIENTIFIC
                    {
                    this_DOUBLE_SCIENTIFIC_2=(Token)match(input,RULE_DOUBLE_SCIENTIFIC,FOLLOW_RULE_DOUBLE_SCIENTIFIC_in_ruleNUMBER3665); 

                    		current.merge(this_DOUBLE_SCIENTIFIC_2);
                        
                     
                        newLeafNode(this_DOUBLE_SCIENTIFIC_2, grammarAccess.getNUMBERAccess().getDOUBLE_SCIENTIFICTerminalRuleCall_2()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNUMBER"


    // $ANTLR start "entryRuleLOC"
    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1620:1: entryRuleLOC returns [String current=null] : iv_ruleLOC= ruleLOC EOF ;
    public final String entryRuleLOC() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLOC = null;


        try {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1621:2: (iv_ruleLOC= ruleLOC EOF )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1622:2: iv_ruleLOC= ruleLOC EOF
            {
             newCompositeNode(grammarAccess.getLOCRule()); 
            pushFollow(FOLLOW_ruleLOC_in_entryRuleLOC3711);
            iv_ruleLOC=ruleLOC();

            state._fsp--;

             current =iv_ruleLOC.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLOC3722); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLOC"


    // $ANTLR start "ruleLOC"
    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1629:1: ruleLOC returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' this_INT_1= RULE_INT kw= ',' this_INT_3= RULE_INT kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleLOC() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1632:28: ( (kw= '(' this_INT_1= RULE_INT kw= ',' this_INT_3= RULE_INT kw= ')' ) )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1633:1: (kw= '(' this_INT_1= RULE_INT kw= ',' this_INT_3= RULE_INT kw= ')' )
            {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1633:1: (kw= '(' this_INT_1= RULE_INT kw= ',' this_INT_3= RULE_INT kw= ')' )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1634:2: kw= '(' this_INT_1= RULE_INT kw= ',' this_INT_3= RULE_INT kw= ')'
            {
            kw=(Token)match(input,22,FOLLOW_22_in_ruleLOC3760); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getLOCAccess().getLeftParenthesisKeyword_0()); 
                
            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLOC3775); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getLOCAccess().getINTTerminalRuleCall_1()); 
                
            kw=(Token)match(input,23,FOLLOW_23_in_ruleLOC3793); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getLOCAccess().getCommaKeyword_2()); 
                
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLOC3808); 

            		current.merge(this_INT_3);
                
             
                newLeafNode(this_INT_3, grammarAccess.getLOCAccess().getINTTerminalRuleCall_3()); 
                
            kw=(Token)match(input,24,FOLLOW_24_in_ruleLOC3826); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getLOCAccess().getRightParenthesisKeyword_4()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLOC"


    // $ANTLR start "entryRuleAGENT"
    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1673:1: entryRuleAGENT returns [String current=null] : iv_ruleAGENT= ruleAGENT EOF ;
    public final String entryRuleAGENT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAGENT = null;


        try {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1674:2: (iv_ruleAGENT= ruleAGENT EOF )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1675:2: iv_ruleAGENT= ruleAGENT EOF
            {
             newCompositeNode(grammarAccess.getAGENTRule()); 
            pushFollow(FOLLOW_ruleAGENT_in_entryRuleAGENT3867);
            iv_ruleAGENT=ruleAGENT();

            state._fsp--;

             current =iv_ruleAGENT.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAGENT3878); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAGENT"


    // $ANTLR start "ruleAGENT"
    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1682:1: ruleAGENT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID this_LOC_1= ruleLOC ) ;
    public final AntlrDatatypeRuleToken ruleAGENT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        AntlrDatatypeRuleToken this_LOC_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1685:28: ( (this_ID_0= RULE_ID this_LOC_1= ruleLOC ) )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1686:1: (this_ID_0= RULE_ID this_LOC_1= ruleLOC )
            {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1686:1: (this_ID_0= RULE_ID this_LOC_1= ruleLOC )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1686:6: this_ID_0= RULE_ID this_LOC_1= ruleLOC
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAGENT3918); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getAGENTAccess().getIDTerminalRuleCall_0()); 
                
             
                    newCompositeNode(grammarAccess.getAGENTAccess().getLOCParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleLOC_in_ruleAGENT3945);
            this_LOC_1=ruleLOC();

            state._fsp--;


            		current.merge(this_LOC_1);
                
             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAGENT"


    // $ANTLR start "entryRuleMATH_Expr"
    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1712:1: entryRuleMATH_Expr returns [String current=null] : iv_ruleMATH_Expr= ruleMATH_Expr EOF ;
    public final String entryRuleMATH_Expr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMATH_Expr = null;


        try {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1713:2: (iv_ruleMATH_Expr= ruleMATH_Expr EOF )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1714:2: iv_ruleMATH_Expr= ruleMATH_Expr EOF
            {
             newCompositeNode(grammarAccess.getMATH_ExprRule()); 
            pushFollow(FOLLOW_ruleMATH_Expr_in_entryRuleMATH_Expr3991);
            iv_ruleMATH_Expr=ruleMATH_Expr();

            state._fsp--;

             current =iv_ruleMATH_Expr.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMATH_Expr4002); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMATH_Expr"


    // $ANTLR start "ruleMATH_Expr"
    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1721:1: ruleMATH_Expr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Terminal_Math_Expr_0= ruleTerminal_Math_Expr (this_MATH_OP_1= ruleMATH_OP this_Terminal_Math_Expr_2= ruleTerminal_Math_Expr )* ) ;
    public final AntlrDatatypeRuleToken ruleMATH_Expr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Terminal_Math_Expr_0 = null;

        AntlrDatatypeRuleToken this_MATH_OP_1 = null;

        AntlrDatatypeRuleToken this_Terminal_Math_Expr_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1724:28: ( (this_Terminal_Math_Expr_0= ruleTerminal_Math_Expr (this_MATH_OP_1= ruleMATH_OP this_Terminal_Math_Expr_2= ruleTerminal_Math_Expr )* ) )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1725:1: (this_Terminal_Math_Expr_0= ruleTerminal_Math_Expr (this_MATH_OP_1= ruleMATH_OP this_Terminal_Math_Expr_2= ruleTerminal_Math_Expr )* )
            {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1725:1: (this_Terminal_Math_Expr_0= ruleTerminal_Math_Expr (this_MATH_OP_1= ruleMATH_OP this_Terminal_Math_Expr_2= ruleTerminal_Math_Expr )* )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1726:5: this_Terminal_Math_Expr_0= ruleTerminal_Math_Expr (this_MATH_OP_1= ruleMATH_OP this_Terminal_Math_Expr_2= ruleTerminal_Math_Expr )*
            {
             
                    newCompositeNode(grammarAccess.getMATH_ExprAccess().getTerminal_Math_ExprParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleTerminal_Math_Expr_in_ruleMATH_Expr4049);
            this_Terminal_Math_Expr_0=ruleTerminal_Math_Expr();

            state._fsp--;


            		current.merge(this_Terminal_Math_Expr_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1736:1: (this_MATH_OP_1= ruleMATH_OP this_Terminal_Math_Expr_2= ruleTerminal_Math_Expr )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==21||(LA19_0>=46 && LA19_0<=50)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1737:5: this_MATH_OP_1= ruleMATH_OP this_Terminal_Math_Expr_2= ruleTerminal_Math_Expr
            	    {
            	     
            	            newCompositeNode(grammarAccess.getMATH_ExprAccess().getMATH_OPParserRuleCall_1_0()); 
            	        
            	    pushFollow(FOLLOW_ruleMATH_OP_in_ruleMATH_Expr4077);
            	    this_MATH_OP_1=ruleMATH_OP();

            	    state._fsp--;


            	    		current.merge(this_MATH_OP_1);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        
            	     
            	            newCompositeNode(grammarAccess.getMATH_ExprAccess().getTerminal_Math_ExprParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleTerminal_Math_Expr_in_ruleMATH_Expr4104);
            	    this_Terminal_Math_Expr_2=ruleTerminal_Math_Expr();

            	    state._fsp--;


            	    		current.merge(this_Terminal_Math_Expr_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMATH_Expr"


    // $ANTLR start "entryRuleTerminal_Math_Expr"
    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1766:1: entryRuleTerminal_Math_Expr returns [String current=null] : iv_ruleTerminal_Math_Expr= ruleTerminal_Math_Expr EOF ;
    public final String entryRuleTerminal_Math_Expr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTerminal_Math_Expr = null;


        try {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1767:2: (iv_ruleTerminal_Math_Expr= ruleTerminal_Math_Expr EOF )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1768:2: iv_ruleTerminal_Math_Expr= ruleTerminal_Math_Expr EOF
            {
             newCompositeNode(grammarAccess.getTerminal_Math_ExprRule()); 
            pushFollow(FOLLOW_ruleTerminal_Math_Expr_in_entryRuleTerminal_Math_Expr4152);
            iv_ruleTerminal_Math_Expr=ruleTerminal_Math_Expr();

            state._fsp--;

             current =iv_ruleTerminal_Math_Expr.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminal_Math_Expr4163); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerminal_Math_Expr"


    // $ANTLR start "ruleTerminal_Math_Expr"
    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1775:1: ruleTerminal_Math_Expr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '(' this_MATH_Expr_1= ruleMATH_Expr kw= ')' ) | this_NUMBER_3= ruleNUMBER ) ;
    public final AntlrDatatypeRuleToken ruleTerminal_Math_Expr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_MATH_Expr_1 = null;

        AntlrDatatypeRuleToken this_NUMBER_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1778:28: ( ( (kw= '(' this_MATH_Expr_1= ruleMATH_Expr kw= ')' ) | this_NUMBER_3= ruleNUMBER ) )
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1779:1: ( (kw= '(' this_MATH_Expr_1= ruleMATH_Expr kw= ')' ) | this_NUMBER_3= ruleNUMBER )
            {
            // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1779:1: ( (kw= '(' this_MATH_Expr_1= ruleMATH_Expr kw= ')' ) | this_NUMBER_3= ruleNUMBER )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==22) ) {
                alt20=1;
            }
            else if ( ((LA20_0>=RULE_INT && LA20_0<=RULE_DOUBLE_SCIENTIFIC)) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1779:2: (kw= '(' this_MATH_Expr_1= ruleMATH_Expr kw= ')' )
                    {
                    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1779:2: (kw= '(' this_MATH_Expr_1= ruleMATH_Expr kw= ')' )
                    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1780:2: kw= '(' this_MATH_Expr_1= ruleMATH_Expr kw= ')'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleTerminal_Math_Expr4202); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTerminal_Math_ExprAccess().getLeftParenthesisKeyword_0_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getTerminal_Math_ExprAccess().getMATH_ExprParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleMATH_Expr_in_ruleTerminal_Math_Expr4224);
                    this_MATH_Expr_1=ruleMATH_Expr();

                    state._fsp--;


                    		current.merge(this_MATH_Expr_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleTerminal_Math_Expr4242); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTerminal_Math_ExprAccess().getRightParenthesisKeyword_0_2()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.edinburgh.paloma/src-gen/org/xtext/edinburgh/parser/antlr/internal/InternalPaloma.g:1804:5: this_NUMBER_3= ruleNUMBER
                    {
                     
                            newCompositeNode(grammarAccess.getTerminal_Math_ExprAccess().getNUMBERParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNUMBER_in_ruleTerminal_Math_Expr4271);
                    this_NUMBER_3=ruleNUMBER();

                    state._fsp--;


                    		current.merge(this_NUMBER_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerminal_Math_Expr"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleModel122 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_ruleParam_in_ruleModel143 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_15_in_ruleModel156 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAgentState_in_ruleModel177 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleModel190 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePOPULATION_in_ruleModel211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_entryRuleParam247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParam257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleParam294 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParam311 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleParam328 = new BitSet(new long[]{0x00000000004000E0L});
    public static final BitSet FOLLOW_ruleMATH_Expr_in_ruleParam349 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleParam361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAgentState_in_entryRuleAgentState397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAgentState407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAGENT_in_ruleAgentState453 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleAgentState465 = new BitSet(new long[]{0x0000000584400000L});
    public static final BitSet FOLLOW_rulePrefix_in_ruleAgentState486 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_21_in_ruleAgentState499 = new BitSet(new long[]{0x0000000584400000L});
    public static final BitSet FOLLOW_rulePrefix_in_ruleAgentState520 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_19_in_ruleAgentState534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_entryRulePrefix570 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrefix580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleACTION_in_rulePrefix626 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAGENT_in_rulePrefix647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleACTION_in_entryRuleACTION683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleACTION693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleACT_SpNoMsg_in_ruleACTION740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleACT_SpBr_in_ruleACTION767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleACT_SpUni_in_ruleACTION794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleACT_InBr_in_ruleACTION821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleACT_InUni_in_ruleACTION848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleACT_SpNoMsg_in_entryRuleACT_SpNoMsg883 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleACT_SpNoMsg893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleACT_SpNoMsg930 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleACT_SpNoMsg947 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleACT_SpNoMsg964 = new BitSet(new long[]{0x00000000004000F0L});
    public static final BitSet FOLLOW_ruleRATE_Expr_in_ruleACT_SpNoMsg985 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleACT_SpNoMsg997 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleACT_SpNoMsg1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleACT_SpBr_in_entryRuleACT_SpBr1045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleACT_SpBr1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleACT_SpBr1092 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleACT_SpBr1109 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleACT_SpBr1126 = new BitSet(new long[]{0x00000000004000F0L});
    public static final BitSet FOLLOW_ruleRATE_Expr_in_ruleACT_SpBr1147 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleACT_SpBr1159 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleACT_SpBr1171 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleACT_SpBr1183 = new BitSet(new long[]{0x0000007000400000L});
    public static final BitSet FOLLOW_ruleIRange_in_ruleACT_SpBr1204 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleACT_SpBr1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleACT_SpUni_in_entryRuleACT_SpUni1252 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleACT_SpUni1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleACT_SpUni1299 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleACT_SpUni1316 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleACT_SpUni1333 = new BitSet(new long[]{0x00000000004000F0L});
    public static final BitSet FOLLOW_ruleRATE_Expr_in_ruleACT_SpUni1354 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleACT_SpUni1366 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleACT_SpUni1378 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleACT_SpUni1390 = new BitSet(new long[]{0x0000007000400000L});
    public static final BitSet FOLLOW_ruleIRange_in_ruleACT_SpUni1411 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleACT_SpUni1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleACT_InBr_in_entryRuleACT_InBr1459 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleACT_InBr1469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleACT_InBr1506 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleACT_InBr1523 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleACT_InBr1540 = new BitSet(new long[]{0x00000000004000F0L});
    public static final BitSet FOLLOW_ruleRATE_Expr_in_ruleACT_InBr1561 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleACT_InBr1573 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleACT_InBr1585 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleACT_InBr1597 = new BitSet(new long[]{0x00000480004000F0L});
    public static final BitSet FOLLOW_rulePR_Expr_in_ruleACT_InBr1618 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleACT_InBr1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleACT_InUni_in_entryRuleACT_InUni1666 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleACT_InUni1676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleACT_InUni1713 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleACT_InUni1730 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleACT_InUni1747 = new BitSet(new long[]{0x00000000004000F0L});
    public static final BitSet FOLLOW_ruleRATE_Expr_in_ruleACT_InUni1768 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleACT_InUni1780 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleACT_InUni1792 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleACT_InUni1804 = new BitSet(new long[]{0x00000480004000F0L});
    public static final BitSet FOLLOW_rulePR_Expr_in_ruleACT_InUni1825 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleACT_InUni1837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIRange_in_entryRuleIRange1873 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIRange1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleIRange1920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleIRange1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleIRange1957 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleIRange1969 = new BitSet(new long[]{0x00000000004000F0L});
    public static final BitSet FOLLOW_ruleRATE_Expr_in_ruleIRange1991 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleIRange2002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLOC_in_ruleIRange2026 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleIRange2038 = new BitSet(new long[]{0x0000007000400000L});
    public static final BitSet FOLLOW_ruleLOC_in_ruleIRange2054 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rulePR_Expr_in_entryRulePR_Expr2092 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePR_Expr2102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminal_PR_Expr_in_rulePR_Expr2148 = new BitSet(new long[]{0x0007C00000200002L});
    public static final BitSet FOLLOW_ruleMATH_OP_in_rulePR_Expr2165 = new BitSet(new long[]{0x00000480004000F0L});
    public static final BitSet FOLLOW_ruleTerminal_PR_Expr_in_rulePR_Expr2185 = new BitSet(new long[]{0x0007C00000200002L});
    public static final BitSet FOLLOW_ruleTerminal_PR_Expr_in_entryRuleTerminal_PR_Expr2223 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminal_PR_Expr2233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleTerminal_PR_Expr2271 = new BitSet(new long[]{0x00000480004000F0L});
    public static final BitSet FOLLOW_rulePR_Expr_in_ruleTerminal_PR_Expr2293 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleTerminal_PR_Expr2304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleTerminal_PR_Expr2328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTerminal_PR_Expr2350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDist_in_ruleTerminal_PR_Expr2377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAGENT_NUM_in_ruleTerminal_PR_Expr2404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRATE_Expr_in_entryRuleRATE_Expr2440 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRATE_Expr2450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminal_RATE_Expr_in_ruleRATE_Expr2496 = new BitSet(new long[]{0x0007C00000200002L});
    public static final BitSet FOLLOW_ruleMATH_OP_in_ruleRATE_Expr2513 = new BitSet(new long[]{0x00000000004000F0L});
    public static final BitSet FOLLOW_ruleTerminal_RATE_Expr_in_ruleRATE_Expr2533 = new BitSet(new long[]{0x0007C00000200002L});
    public static final BitSet FOLLOW_ruleTerminal_RATE_Expr_in_entryRuleTerminal_RATE_Expr2571 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminal_RATE_Expr2581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleTerminal_RATE_Expr2619 = new BitSet(new long[]{0x00000000004000F0L});
    public static final BitSet FOLLOW_ruleRATE_Expr_in_ruleTerminal_RATE_Expr2641 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleTerminal_RATE_Expr2652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleTerminal_RATE_Expr2676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTerminal_RATE_Expr2698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDist_in_entryRuleDist2741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDist2752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleDist2790 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleDist2803 = new BitSet(new long[]{0x0000037000400000L});
    public static final BitSet FOLLOW_40_in_ruleDist2817 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_41_in_ruleDist2836 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ruleLOC_in_ruleDist2864 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleDist2883 = new BitSet(new long[]{0x0000037000400000L});
    public static final BitSet FOLLOW_40_in_ruleDist2897 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_41_in_ruleDist2916 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleLOC_in_ruleDist2944 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleDist2963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAGENT_NUM_in_entryRuleAGENT_NUM3003 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAGENT_NUM3013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleAGENT_NUM3050 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAGENT_in_ruleAGENT_NUM3071 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleAGENT_NUM3083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePOPULATION_in_entryRulePOPULATION3119 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePOPULATION3129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAGENTS_in_rulePOPULATION3175 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_rulePOPULATION3188 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAGENTS_in_rulePOPULATION3209 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ruleAGENTS_in_entryRuleAGENTS3247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAGENTS3257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAGENT_in_ruleAGENTS3303 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleAGENTS3316 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAGENTS3327 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleAGENTS3338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMATH_OP_in_entryRuleMATH_OP3377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMATH_OP3388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleMATH_OP3426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleMATH_OP3445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleMATH_OP3464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleMATH_OP3483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleMATH_OP3502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleMATH_OP3521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_entryRuleNUMBER3562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNUMBER3573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNUMBER3613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleNUMBER3639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_SCIENTIFIC_in_ruleNUMBER3665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLOC_in_entryRuleLOC3711 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLOC3722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleLOC3760 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLOC3775 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleLOC3793 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLOC3808 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleLOC3826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAGENT_in_entryRuleAGENT3867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAGENT3878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAGENT3918 = new BitSet(new long[]{0x0000007000400000L});
    public static final BitSet FOLLOW_ruleLOC_in_ruleAGENT3945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMATH_Expr_in_entryRuleMATH_Expr3991 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMATH_Expr4002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminal_Math_Expr_in_ruleMATH_Expr4049 = new BitSet(new long[]{0x0007C00000200002L});
    public static final BitSet FOLLOW_ruleMATH_OP_in_ruleMATH_Expr4077 = new BitSet(new long[]{0x00000000004000E0L});
    public static final BitSet FOLLOW_ruleTerminal_Math_Expr_in_ruleMATH_Expr4104 = new BitSet(new long[]{0x0007C00000200002L});
    public static final BitSet FOLLOW_ruleTerminal_Math_Expr_in_entryRuleTerminal_Math_Expr4152 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminal_Math_Expr4163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleTerminal_Math_Expr4202 = new BitSet(new long[]{0x00000000004000E0L});
    public static final BitSet FOLLOW_ruleMATH_Expr_in_ruleTerminal_Math_Expr4224 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleTerminal_Math_Expr4242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleTerminal_Math_Expr4271 = new BitSet(new long[]{0x0000000000000002L});

}