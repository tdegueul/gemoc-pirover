package rover.raspirover.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import rover.raspirover.xtext.services.RaspiRoverGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRaspiRoverParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_DOUBLE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'raspi-project'", "'{'", "'boards'", "'['", "']'", "'}'", "'program'", "'params'", "','", "'digital-pin'", "'analog-pin'", "'var'", "':='", "'if'", "'('", "')'", "'else'", "'while'", "'forward'", "'backward'", "'turn'", "'stop'", "'log'", "'send'", "'query-temp'", "'query-humidity'", "'query-msg'", "'query'", "'front'", "'obstacle'", "'true'", "'cm'", "'mm'", "'m'", "'ft'", "'in'", "'yd'", "'rad'", "'deg'", "'grad'", "'pin'", "'<'", "'=='", "'<>'", "'>'", "'<='", "'>='", "'!='"
    };
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


        public InternalRaspiRoverParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRaspiRoverParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRaspiRoverParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRaspiRover.g"; }



     	private RaspiRoverGrammarAccess grammarAccess;

        public InternalRaspiRoverParser(TokenStream input, RaspiRoverGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Project";
       	}

       	@Override
       	protected RaspiRoverGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProject"
    // InternalRaspiRover.g:65:1: entryRuleProject returns [EObject current=null] : iv_ruleProject= ruleProject EOF ;
    public final EObject entryRuleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProject = null;


        try {
            // InternalRaspiRover.g:65:48: (iv_ruleProject= ruleProject EOF )
            // InternalRaspiRover.g:66:2: iv_ruleProject= ruleProject EOF
            {
             newCompositeNode(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProject=ruleProject();

            state._fsp--;

             current =iv_ruleProject; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // InternalRaspiRover.g:72:1: ruleProject returns [EObject current=null] : (otherlv_0= 'raspi-project' otherlv_1= '{' (otherlv_2= 'boards' otherlv_3= '[' ( (lv_boards_4_0= ruleBoard ) )* otherlv_5= ']' )? ( (lv_program_6_0= ruleRoverProgram ) ) otherlv_7= '}' ) ;
    public final EObject ruleProject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_boards_4_0 = null;

        EObject lv_program_6_0 = null;



        	enterRule();

        try {
            // InternalRaspiRover.g:78:2: ( (otherlv_0= 'raspi-project' otherlv_1= '{' (otherlv_2= 'boards' otherlv_3= '[' ( (lv_boards_4_0= ruleBoard ) )* otherlv_5= ']' )? ( (lv_program_6_0= ruleRoverProgram ) ) otherlv_7= '}' ) )
            // InternalRaspiRover.g:79:2: (otherlv_0= 'raspi-project' otherlv_1= '{' (otherlv_2= 'boards' otherlv_3= '[' ( (lv_boards_4_0= ruleBoard ) )* otherlv_5= ']' )? ( (lv_program_6_0= ruleRoverProgram ) ) otherlv_7= '}' )
            {
            // InternalRaspiRover.g:79:2: (otherlv_0= 'raspi-project' otherlv_1= '{' (otherlv_2= 'boards' otherlv_3= '[' ( (lv_boards_4_0= ruleBoard ) )* otherlv_5= ']' )? ( (lv_program_6_0= ruleRoverProgram ) ) otherlv_7= '}' )
            // InternalRaspiRover.g:80:3: otherlv_0= 'raspi-project' otherlv_1= '{' (otherlv_2= 'boards' otherlv_3= '[' ( (lv_boards_4_0= ruleBoard ) )* otherlv_5= ']' )? ( (lv_program_6_0= ruleRoverProgram ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProjectAccess().getRaspiProjectKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRaspiRover.g:88:3: (otherlv_2= 'boards' otherlv_3= '[' ( (lv_boards_4_0= ruleBoard ) )* otherlv_5= ']' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRaspiRover.g:89:4: otherlv_2= 'boards' otherlv_3= '[' ( (lv_boards_4_0= ruleBoard ) )* otherlv_5= ']'
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getProjectAccess().getBoardsKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,15,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getProjectAccess().getLeftSquareBracketKeyword_2_1());
                    			
                    // InternalRaspiRover.g:97:4: ( (lv_boards_4_0= ruleBoard ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==RULE_ID) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalRaspiRover.g:98:5: (lv_boards_4_0= ruleBoard )
                    	    {
                    	    // InternalRaspiRover.g:98:5: (lv_boards_4_0= ruleBoard )
                    	    // InternalRaspiRover.g:99:6: lv_boards_4_0= ruleBoard
                    	    {

                    	    						newCompositeNode(grammarAccess.getProjectAccess().getBoardsBoardParserRuleCall_2_2_0());
                    	    					
                    	    pushFollow(FOLLOW_6);
                    	    lv_boards_4_0=ruleBoard();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getProjectRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"boards",
                    	    							lv_boards_4_0,
                    	    							"rover.raspirover.xtext.RaspiRover.Board");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getProjectAccess().getRightSquareBracketKeyword_2_3());
                    			

                    }
                    break;

            }

            // InternalRaspiRover.g:121:3: ( (lv_program_6_0= ruleRoverProgram ) )
            // InternalRaspiRover.g:122:4: (lv_program_6_0= ruleRoverProgram )
            {
            // InternalRaspiRover.g:122:4: (lv_program_6_0= ruleRoverProgram )
            // InternalRaspiRover.g:123:5: lv_program_6_0= ruleRoverProgram
            {

            					newCompositeNode(grammarAccess.getProjectAccess().getProgramRoverProgramParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_program_6_0=ruleRoverProgram();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProjectRule());
            					}
            					set(
            						current,
            						"program",
            						lv_program_6_0,
            						"rover.raspirover.xtext.RaspiRover.RoverProgram");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleBoard"
    // InternalRaspiRover.g:148:1: entryRuleBoard returns [EObject current=null] : iv_ruleBoard= ruleBoard EOF ;
    public final EObject entryRuleBoard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoard = null;


        try {
            // InternalRaspiRover.g:148:46: (iv_ruleBoard= ruleBoard EOF )
            // InternalRaspiRover.g:149:2: iv_ruleBoard= ruleBoard EOF
            {
             newCompositeNode(grammarAccess.getBoardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoard=ruleBoard();

            state._fsp--;

             current =iv_ruleBoard; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBoard"


    // $ANTLR start "ruleBoard"
    // InternalRaspiRover.g:155:1: ruleBoard returns [EObject current=null] : this_RasPiBoard_0= ruleRasPiBoard ;
    public final EObject ruleBoard() throws RecognitionException {
        EObject current = null;

        EObject this_RasPiBoard_0 = null;



        	enterRule();

        try {
            // InternalRaspiRover.g:161:2: (this_RasPiBoard_0= ruleRasPiBoard )
            // InternalRaspiRover.g:162:2: this_RasPiBoard_0= ruleRasPiBoard
            {

            		newCompositeNode(grammarAccess.getBoardAccess().getRasPiBoardParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_RasPiBoard_0=ruleRasPiBoard();

            state._fsp--;


            		current = this_RasPiBoard_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleBoard"


    // $ANTLR start "entryRuleStatement"
    // InternalRaspiRover.g:173:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalRaspiRover.g:173:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalRaspiRover.g:174:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalRaspiRover.g:180:1: ruleStatement returns [EObject current=null] : (this_VarAssignment_0= ruleVarAssignment | this_Conditional_1= ruleConditional | this_Loop_2= ruleLoop | this_RclBlock_3= ruleRclBlock | this_ForwardAction_4= ruleForwardAction | this_ForwardMinAction_5= ruleForwardMinAction | this_BackwardAction_6= ruleBackwardAction | this_BackwardMinAction_7= ruleBackwardMinAction | this_TurnAction_8= ruleTurnAction | this_TurnDegAction_9= ruleTurnDegAction | this_StopAction_10= ruleStopAction | this_LogAction_11= ruleLogAction | this_SendAction_12= ruleSendAction | this_VarRef_13= ruleVarRef ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_VarAssignment_0 = null;

        EObject this_Conditional_1 = null;

        EObject this_Loop_2 = null;

        EObject this_RclBlock_3 = null;

        EObject this_ForwardAction_4 = null;

        EObject this_ForwardMinAction_5 = null;

        EObject this_BackwardAction_6 = null;

        EObject this_BackwardMinAction_7 = null;

        EObject this_TurnAction_8 = null;

        EObject this_TurnDegAction_9 = null;

        EObject this_StopAction_10 = null;

        EObject this_LogAction_11 = null;

        EObject this_SendAction_12 = null;

        EObject this_VarRef_13 = null;



        	enterRule();

        try {
            // InternalRaspiRover.g:186:2: ( (this_VarAssignment_0= ruleVarAssignment | this_Conditional_1= ruleConditional | this_Loop_2= ruleLoop | this_RclBlock_3= ruleRclBlock | this_ForwardAction_4= ruleForwardAction | this_ForwardMinAction_5= ruleForwardMinAction | this_BackwardAction_6= ruleBackwardAction | this_BackwardMinAction_7= ruleBackwardMinAction | this_TurnAction_8= ruleTurnAction | this_TurnDegAction_9= ruleTurnDegAction | this_StopAction_10= ruleStopAction | this_LogAction_11= ruleLogAction | this_SendAction_12= ruleSendAction | this_VarRef_13= ruleVarRef ) )
            // InternalRaspiRover.g:187:2: (this_VarAssignment_0= ruleVarAssignment | this_Conditional_1= ruleConditional | this_Loop_2= ruleLoop | this_RclBlock_3= ruleRclBlock | this_ForwardAction_4= ruleForwardAction | this_ForwardMinAction_5= ruleForwardMinAction | this_BackwardAction_6= ruleBackwardAction | this_BackwardMinAction_7= ruleBackwardMinAction | this_TurnAction_8= ruleTurnAction | this_TurnDegAction_9= ruleTurnDegAction | this_StopAction_10= ruleStopAction | this_LogAction_11= ruleLogAction | this_SendAction_12= ruleSendAction | this_VarRef_13= ruleVarRef )
            {
            // InternalRaspiRover.g:187:2: (this_VarAssignment_0= ruleVarAssignment | this_Conditional_1= ruleConditional | this_Loop_2= ruleLoop | this_RclBlock_3= ruleRclBlock | this_ForwardAction_4= ruleForwardAction | this_ForwardMinAction_5= ruleForwardMinAction | this_BackwardAction_6= ruleBackwardAction | this_BackwardMinAction_7= ruleBackwardMinAction | this_TurnAction_8= ruleTurnAction | this_TurnDegAction_9= ruleTurnDegAction | this_StopAction_10= ruleStopAction | this_LogAction_11= ruleLogAction | this_SendAction_12= ruleSendAction | this_VarRef_13= ruleVarRef )
            int alt3=14;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalRaspiRover.g:188:3: this_VarAssignment_0= ruleVarAssignment
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getVarAssignmentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_VarAssignment_0=ruleVarAssignment();

                    state._fsp--;


                    			current = this_VarAssignment_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRaspiRover.g:197:3: this_Conditional_1= ruleConditional
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getConditionalParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Conditional_1=ruleConditional();

                    state._fsp--;


                    			current = this_Conditional_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRaspiRover.g:206:3: this_Loop_2= ruleLoop
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getLoopParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Loop_2=ruleLoop();

                    state._fsp--;


                    			current = this_Loop_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRaspiRover.g:215:3: this_RclBlock_3= ruleRclBlock
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getRclBlockParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_RclBlock_3=ruleRclBlock();

                    state._fsp--;


                    			current = this_RclBlock_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRaspiRover.g:224:3: this_ForwardAction_4= ruleForwardAction
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getForwardActionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ForwardAction_4=ruleForwardAction();

                    state._fsp--;


                    			current = this_ForwardAction_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalRaspiRover.g:233:3: this_ForwardMinAction_5= ruleForwardMinAction
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getForwardMinActionParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ForwardMinAction_5=ruleForwardMinAction();

                    state._fsp--;


                    			current = this_ForwardMinAction_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalRaspiRover.g:242:3: this_BackwardAction_6= ruleBackwardAction
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getBackwardActionParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_BackwardAction_6=ruleBackwardAction();

                    state._fsp--;


                    			current = this_BackwardAction_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalRaspiRover.g:251:3: this_BackwardMinAction_7= ruleBackwardMinAction
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getBackwardMinActionParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_BackwardMinAction_7=ruleBackwardMinAction();

                    state._fsp--;


                    			current = this_BackwardMinAction_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalRaspiRover.g:260:3: this_TurnAction_8= ruleTurnAction
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getTurnActionParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_TurnAction_8=ruleTurnAction();

                    state._fsp--;


                    			current = this_TurnAction_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalRaspiRover.g:269:3: this_TurnDegAction_9= ruleTurnDegAction
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getTurnDegActionParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_TurnDegAction_9=ruleTurnDegAction();

                    state._fsp--;


                    			current = this_TurnDegAction_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalRaspiRover.g:278:3: this_StopAction_10= ruleStopAction
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getStopActionParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_StopAction_10=ruleStopAction();

                    state._fsp--;


                    			current = this_StopAction_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalRaspiRover.g:287:3: this_LogAction_11= ruleLogAction
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getLogActionParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogAction_11=ruleLogAction();

                    state._fsp--;


                    			current = this_LogAction_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalRaspiRover.g:296:3: this_SendAction_12= ruleSendAction
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getSendActionParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_SendAction_12=ruleSendAction();

                    state._fsp--;


                    			current = this_SendAction_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalRaspiRover.g:305:3: this_VarRef_13= ruleVarRef
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getVarRefParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_VarRef_13=ruleVarRef();

                    state._fsp--;


                    			current = this_VarRef_13;
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleRoverValue"
    // InternalRaspiRover.g:317:1: entryRuleRoverValue returns [EObject current=null] : iv_ruleRoverValue= ruleRoverValue EOF ;
    public final EObject entryRuleRoverValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoverValue = null;


        try {
            // InternalRaspiRover.g:317:51: (iv_ruleRoverValue= ruleRoverValue EOF )
            // InternalRaspiRover.g:318:2: iv_ruleRoverValue= ruleRoverValue EOF
            {
             newCompositeNode(grammarAccess.getRoverValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoverValue=ruleRoverValue();

            state._fsp--;

             current =iv_ruleRoverValue; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRoverValue"


    // $ANTLR start "ruleRoverValue"
    // InternalRaspiRover.g:324:1: ruleRoverValue returns [EObject current=null] : (this_NumberValue_0= ruleNumberValue | this_StringValue_1= ruleStringValue | this_BooleanValue_2= ruleBooleanValue ) ;
    public final EObject ruleRoverValue() throws RecognitionException {
        EObject current = null;

        EObject this_NumberValue_0 = null;

        EObject this_StringValue_1 = null;

        EObject this_BooleanValue_2 = null;



        	enterRule();

        try {
            // InternalRaspiRover.g:330:2: ( (this_NumberValue_0= ruleNumberValue | this_StringValue_1= ruleStringValue | this_BooleanValue_2= ruleBooleanValue ) )
            // InternalRaspiRover.g:331:2: (this_NumberValue_0= ruleNumberValue | this_StringValue_1= ruleStringValue | this_BooleanValue_2= ruleBooleanValue )
            {
            // InternalRaspiRover.g:331:2: (this_NumberValue_0= ruleNumberValue | this_StringValue_1= ruleStringValue | this_BooleanValue_2= ruleBooleanValue )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_DOUBLE:
            case 36:
            case 37:
                {
                alt4=1;
                }
                break;
            case RULE_ID:
                {
                alt4=1;
                }
                break;
            case RULE_STRING:
            case 38:
                {
                alt4=2;
                }
                break;
            case 39:
            case 42:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalRaspiRover.g:332:3: this_NumberValue_0= ruleNumberValue
                    {

                    			newCompositeNode(grammarAccess.getRoverValueAccess().getNumberValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumberValue_0=ruleNumberValue();

                    state._fsp--;


                    			current = this_NumberValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRaspiRover.g:341:3: this_StringValue_1= ruleStringValue
                    {

                    			newCompositeNode(grammarAccess.getRoverValueAccess().getStringValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringValue_1=ruleStringValue();

                    state._fsp--;


                    			current = this_StringValue_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRaspiRover.g:350:3: this_BooleanValue_2= ruleBooleanValue
                    {

                    			newCompositeNode(grammarAccess.getRoverValueAccess().getBooleanValueParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanValue_2=ruleBooleanValue();

                    state._fsp--;


                    			current = this_BooleanValue_2;
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
    // $ANTLR end "ruleRoverValue"


    // $ANTLR start "entryRuleRoverExpression"
    // InternalRaspiRover.g:362:1: entryRuleRoverExpression returns [EObject current=null] : iv_ruleRoverExpression= ruleRoverExpression EOF ;
    public final EObject entryRuleRoverExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoverExpression = null;


        try {
            // InternalRaspiRover.g:362:56: (iv_ruleRoverExpression= ruleRoverExpression EOF )
            // InternalRaspiRover.g:363:2: iv_ruleRoverExpression= ruleRoverExpression EOF
            {
             newCompositeNode(grammarAccess.getRoverExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoverExpression=ruleRoverExpression();

            state._fsp--;

             current =iv_ruleRoverExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRoverExpression"


    // $ANTLR start "ruleRoverExpression"
    // InternalRaspiRover.g:369:1: ruleRoverExpression returns [EObject current=null] : (this_NumericExpression_0= ruleNumericExpression | this_StringExpression_1= ruleStringExpression | this_BooleanExpression_2= ruleBooleanExpression ) ;
    public final EObject ruleRoverExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericExpression_0 = null;

        EObject this_StringExpression_1 = null;

        EObject this_BooleanExpression_2 = null;



        	enterRule();

        try {
            // InternalRaspiRover.g:375:2: ( (this_NumericExpression_0= ruleNumericExpression | this_StringExpression_1= ruleStringExpression | this_BooleanExpression_2= ruleBooleanExpression ) )
            // InternalRaspiRover.g:376:2: (this_NumericExpression_0= ruleNumericExpression | this_StringExpression_1= ruleStringExpression | this_BooleanExpression_2= ruleBooleanExpression )
            {
            // InternalRaspiRover.g:376:2: (this_NumericExpression_0= ruleNumericExpression | this_StringExpression_1= ruleStringExpression | this_BooleanExpression_2= ruleBooleanExpression )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_DOUBLE:
            case 36:
            case 37:
                {
                alt5=1;
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case 54:
                    {
                    switch ( input.LA(3) ) {
                    case 39:
                    case 42:
                        {
                        alt5=3;
                        }
                        break;
                    case RULE_ID:
                    case RULE_DOUBLE:
                    case 36:
                    case 37:
                        {
                        alt5=1;
                        }
                        break;
                    case RULE_STRING:
                    case 38:
                        {
                        alt5=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 5, input);

                        throw nvae;
                    }

                    }
                    break;
                case 59:
                    {
                    int LA5_6 = input.LA(3);

                    if ( (LA5_6==39||LA5_6==42) ) {
                        alt5=3;
                    }
                    else if ( ((LA5_6>=RULE_ID && LA5_6<=RULE_STRING)||LA5_6==38) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                case 53:
                case 55:
                case 56:
                case 57:
                case 58:
                    {
                    alt5=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }

                }
                break;
            case RULE_STRING:
            case 38:
                {
                alt5=2;
                }
                break;
            case 39:
            case 42:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalRaspiRover.g:377:3: this_NumericExpression_0= ruleNumericExpression
                    {

                    			newCompositeNode(grammarAccess.getRoverExpressionAccess().getNumericExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumericExpression_0=ruleNumericExpression();

                    state._fsp--;


                    			current = this_NumericExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRaspiRover.g:386:3: this_StringExpression_1= ruleStringExpression
                    {

                    			newCompositeNode(grammarAccess.getRoverExpressionAccess().getStringExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringExpression_1=ruleStringExpression();

                    state._fsp--;


                    			current = this_StringExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRaspiRover.g:395:3: this_BooleanExpression_2= ruleBooleanExpression
                    {

                    			newCompositeNode(grammarAccess.getRoverExpressionAccess().getBooleanExpressionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanExpression_2=ruleBooleanExpression();

                    state._fsp--;


                    			current = this_BooleanExpression_2;
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
    // $ANTLR end "ruleRoverExpression"


    // $ANTLR start "entryRuleNumberValue"
    // InternalRaspiRover.g:407:1: entryRuleNumberValue returns [EObject current=null] : iv_ruleNumberValue= ruleNumberValue EOF ;
    public final EObject entryRuleNumberValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberValue = null;


        try {
            // InternalRaspiRover.g:407:52: (iv_ruleNumberValue= ruleNumberValue EOF )
            // InternalRaspiRover.g:408:2: iv_ruleNumberValue= ruleNumberValue EOF
            {
             newCompositeNode(grammarAccess.getNumberValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberValue=ruleNumberValue();

            state._fsp--;

             current =iv_ruleNumberValue; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNumberValue"


    // $ANTLR start "ruleNumberValue"
    // InternalRaspiRover.g:414:1: ruleNumberValue returns [EObject current=null] : (this_NumberValue_Impl_0= ruleNumberValue_Impl | this_TemperatureQuery_1= ruleTemperatureQuery | this_HumidityQuery_2= ruleHumidityQuery | this_VarRef_3= ruleVarRef ) ;
    public final EObject ruleNumberValue() throws RecognitionException {
        EObject current = null;

        EObject this_NumberValue_Impl_0 = null;

        EObject this_TemperatureQuery_1 = null;

        EObject this_HumidityQuery_2 = null;

        EObject this_VarRef_3 = null;



        	enterRule();

        try {
            // InternalRaspiRover.g:420:2: ( (this_NumberValue_Impl_0= ruleNumberValue_Impl | this_TemperatureQuery_1= ruleTemperatureQuery | this_HumidityQuery_2= ruleHumidityQuery | this_VarRef_3= ruleVarRef ) )
            // InternalRaspiRover.g:421:2: (this_NumberValue_Impl_0= ruleNumberValue_Impl | this_TemperatureQuery_1= ruleTemperatureQuery | this_HumidityQuery_2= ruleHumidityQuery | this_VarRef_3= ruleVarRef )
            {
            // InternalRaspiRover.g:421:2: (this_NumberValue_Impl_0= ruleNumberValue_Impl | this_TemperatureQuery_1= ruleTemperatureQuery | this_HumidityQuery_2= ruleHumidityQuery | this_VarRef_3= ruleVarRef )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_DOUBLE:
                {
                alt6=1;
                }
                break;
            case 36:
                {
                alt6=2;
                }
                break;
            case 37:
                {
                alt6=3;
                }
                break;
            case RULE_ID:
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
                    // InternalRaspiRover.g:422:3: this_NumberValue_Impl_0= ruleNumberValue_Impl
                    {

                    			newCompositeNode(grammarAccess.getNumberValueAccess().getNumberValue_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumberValue_Impl_0=ruleNumberValue_Impl();

                    state._fsp--;


                    			current = this_NumberValue_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRaspiRover.g:431:3: this_TemperatureQuery_1= ruleTemperatureQuery
                    {

                    			newCompositeNode(grammarAccess.getNumberValueAccess().getTemperatureQueryParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TemperatureQuery_1=ruleTemperatureQuery();

                    state._fsp--;


                    			current = this_TemperatureQuery_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRaspiRover.g:440:3: this_HumidityQuery_2= ruleHumidityQuery
                    {

                    			newCompositeNode(grammarAccess.getNumberValueAccess().getHumidityQueryParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_HumidityQuery_2=ruleHumidityQuery();

                    state._fsp--;


                    			current = this_HumidityQuery_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRaspiRover.g:449:3: this_VarRef_3= ruleVarRef
                    {

                    			newCompositeNode(grammarAccess.getNumberValueAccess().getVarRefParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_VarRef_3=ruleVarRef();

                    state._fsp--;


                    			current = this_VarRef_3;
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
    // $ANTLR end "ruleNumberValue"


    // $ANTLR start "entryRuleUnit"
    // InternalRaspiRover.g:461:1: entryRuleUnit returns [EObject current=null] : iv_ruleUnit= ruleUnit EOF ;
    public final EObject entryRuleUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnit = null;


        try {
            // InternalRaspiRover.g:461:45: (iv_ruleUnit= ruleUnit EOF )
            // InternalRaspiRover.g:462:2: iv_ruleUnit= ruleUnit EOF
            {
             newCompositeNode(grammarAccess.getUnitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnit=ruleUnit();

            state._fsp--;

             current =iv_ruleUnit; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUnit"


    // $ANTLR start "ruleUnit"
    // InternalRaspiRover.g:468:1: ruleUnit returns [EObject current=null] : (this_Centimeter_0= ruleCentimeter | this_Millimeter_1= ruleMillimeter | this_Meter_2= ruleMeter | this_Foot_3= ruleFoot | this_Inch_4= ruleInch | this_Yard_5= ruleYard | this_Radian_6= ruleRadian | this_Degree_7= ruleDegree | this_Turn_8= ruleTurn | this_Gradian_9= ruleGradian ) ;
    public final EObject ruleUnit() throws RecognitionException {
        EObject current = null;

        EObject this_Centimeter_0 = null;

        EObject this_Millimeter_1 = null;

        EObject this_Meter_2 = null;

        EObject this_Foot_3 = null;

        EObject this_Inch_4 = null;

        EObject this_Yard_5 = null;

        EObject this_Radian_6 = null;

        EObject this_Degree_7 = null;

        EObject this_Turn_8 = null;

        EObject this_Gradian_9 = null;



        	enterRule();

        try {
            // InternalRaspiRover.g:474:2: ( (this_Centimeter_0= ruleCentimeter | this_Millimeter_1= ruleMillimeter | this_Meter_2= ruleMeter | this_Foot_3= ruleFoot | this_Inch_4= ruleInch | this_Yard_5= ruleYard | this_Radian_6= ruleRadian | this_Degree_7= ruleDegree | this_Turn_8= ruleTurn | this_Gradian_9= ruleGradian ) )
            // InternalRaspiRover.g:475:2: (this_Centimeter_0= ruleCentimeter | this_Millimeter_1= ruleMillimeter | this_Meter_2= ruleMeter | this_Foot_3= ruleFoot | this_Inch_4= ruleInch | this_Yard_5= ruleYard | this_Radian_6= ruleRadian | this_Degree_7= ruleDegree | this_Turn_8= ruleTurn | this_Gradian_9= ruleGradian )
            {
            // InternalRaspiRover.g:475:2: (this_Centimeter_0= ruleCentimeter | this_Millimeter_1= ruleMillimeter | this_Meter_2= ruleMeter | this_Foot_3= ruleFoot | this_Inch_4= ruleInch | this_Yard_5= ruleYard | this_Radian_6= ruleRadian | this_Degree_7= ruleDegree | this_Turn_8= ruleTurn | this_Gradian_9= ruleGradian )
            int alt7=10;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt7=1;
                }
                break;
            case 44:
                {
                alt7=2;
                }
                break;
            case 45:
                {
                alt7=3;
                }
                break;
            case 46:
                {
                alt7=4;
                }
                break;
            case 47:
                {
                alt7=5;
                }
                break;
            case 48:
                {
                alt7=6;
                }
                break;
            case 49:
                {
                alt7=7;
                }
                break;
            case 50:
                {
                alt7=8;
                }
                break;
            case 32:
                {
                alt7=9;
                }
                break;
            case 51:
                {
                alt7=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalRaspiRover.g:476:3: this_Centimeter_0= ruleCentimeter
                    {

                    			newCompositeNode(grammarAccess.getUnitAccess().getCentimeterParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Centimeter_0=ruleCentimeter();

                    state._fsp--;


                    			current = this_Centimeter_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRaspiRover.g:485:3: this_Millimeter_1= ruleMillimeter
                    {

                    			newCompositeNode(grammarAccess.getUnitAccess().getMillimeterParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Millimeter_1=ruleMillimeter();

                    state._fsp--;


                    			current = this_Millimeter_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRaspiRover.g:494:3: this_Meter_2= ruleMeter
                    {

                    			newCompositeNode(grammarAccess.getUnitAccess().getMeterParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Meter_2=ruleMeter();

                    state._fsp--;


                    			current = this_Meter_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRaspiRover.g:503:3: this_Foot_3= ruleFoot
                    {

                    			newCompositeNode(grammarAccess.getUnitAccess().getFootParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Foot_3=ruleFoot();

                    state._fsp--;


                    			current = this_Foot_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRaspiRover.g:512:3: this_Inch_4= ruleInch
                    {

                    			newCompositeNode(grammarAccess.getUnitAccess().getInchParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Inch_4=ruleInch();

                    state._fsp--;


                    			current = this_Inch_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalRaspiRover.g:521:3: this_Yard_5= ruleYard
                    {

                    			newCompositeNode(grammarAccess.getUnitAccess().getYardParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Yard_5=ruleYard();

                    state._fsp--;


                    			current = this_Yard_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalRaspiRover.g:530:3: this_Radian_6= ruleRadian
                    {

                    			newCompositeNode(grammarAccess.getUnitAccess().getRadianParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Radian_6=ruleRadian();

                    state._fsp--;


                    			current = this_Radian_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalRaspiRover.g:539:3: this_Degree_7= ruleDegree
                    {

                    			newCompositeNode(grammarAccess.getUnitAccess().getDegreeParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Degree_7=ruleDegree();

                    state._fsp--;


                    			current = this_Degree_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalRaspiRover.g:548:3: this_Turn_8= ruleTurn
                    {

                    			newCompositeNode(grammarAccess.getUnitAccess().getTurnParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Turn_8=ruleTurn();

                    state._fsp--;


                    			current = this_Turn_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalRaspiRover.g:557:3: this_Gradian_9= ruleGradian
                    {

                    			newCompositeNode(grammarAccess.getUnitAccess().getGradianParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_Gradian_9=ruleGradian();

                    state._fsp--;


                    			current = this_Gradian_9;
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
    // $ANTLR end "ruleUnit"


    // $ANTLR start "entryRuleStringValue"
    // InternalRaspiRover.g:569:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalRaspiRover.g:569:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalRaspiRover.g:570:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalRaspiRover.g:576:1: ruleStringValue returns [EObject current=null] : (this_StringValue_Impl_0= ruleStringValue_Impl | this_MessageQuery_1= ruleMessageQuery | this_VarRef_2= ruleVarRef ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        EObject this_StringValue_Impl_0 = null;

        EObject this_MessageQuery_1 = null;

        EObject this_VarRef_2 = null;



        	enterRule();

        try {
            // InternalRaspiRover.g:582:2: ( (this_StringValue_Impl_0= ruleStringValue_Impl | this_MessageQuery_1= ruleMessageQuery | this_VarRef_2= ruleVarRef ) )
            // InternalRaspiRover.g:583:2: (this_StringValue_Impl_0= ruleStringValue_Impl | this_MessageQuery_1= ruleMessageQuery | this_VarRef_2= ruleVarRef )
            {
            // InternalRaspiRover.g:583:2: (this_StringValue_Impl_0= ruleStringValue_Impl | this_MessageQuery_1= ruleMessageQuery | this_VarRef_2= ruleVarRef )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt8=1;
                }
                break;
            case 38:
                {
                alt8=2;
                }
                break;
            case RULE_ID:
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
                    // InternalRaspiRover.g:584:3: this_StringValue_Impl_0= ruleStringValue_Impl
                    {

                    			newCompositeNode(grammarAccess.getStringValueAccess().getStringValue_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringValue_Impl_0=ruleStringValue_Impl();

                    state._fsp--;


                    			current = this_StringValue_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRaspiRover.g:593:3: this_MessageQuery_1= ruleMessageQuery
                    {

                    			newCompositeNode(grammarAccess.getStringValueAccess().getMessageQueryParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MessageQuery_1=ruleMessageQuery();

                    state._fsp--;


                    			current = this_MessageQuery_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRaspiRover.g:602:3: this_VarRef_2= ruleVarRef
                    {

                    			newCompositeNode(grammarAccess.getStringValueAccess().getVarRefParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_VarRef_2=ruleVarRef();

                    state._fsp--;


                    			current = this_VarRef_2;
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
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleBooleanValue"
    // InternalRaspiRover.g:614:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalRaspiRover.g:614:53: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalRaspiRover.g:615:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
             newCompositeNode(grammarAccess.getBooleanValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanValue=ruleBooleanValue();

            state._fsp--;

             current =iv_ruleBooleanValue; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // InternalRaspiRover.g:621:1: ruleBooleanValue returns [EObject current=null] : (this_BooleanValue_Impl_0= ruleBooleanValue_Impl | this_ObstacleQuery_1= ruleObstacleQuery | this_VarRef_2= ruleVarRef ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanValue_Impl_0 = null;

        EObject this_ObstacleQuery_1 = null;

        EObject this_VarRef_2 = null;



        	enterRule();

        try {
            // InternalRaspiRover.g:627:2: ( (this_BooleanValue_Impl_0= ruleBooleanValue_Impl | this_ObstacleQuery_1= ruleObstacleQuery | this_VarRef_2= ruleVarRef ) )
            // InternalRaspiRover.g:628:2: (this_BooleanValue_Impl_0= ruleBooleanValue_Impl | this_ObstacleQuery_1= ruleObstacleQuery | this_VarRef_2= ruleVarRef )
            {
            // InternalRaspiRover.g:628:2: (this_BooleanValue_Impl_0= ruleBooleanValue_Impl | this_ObstacleQuery_1= ruleObstacleQuery | this_VarRef_2= ruleVarRef )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt9=1;
                }
                break;
            case 39:
                {
                alt9=2;
                }
                break;
            case RULE_ID:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalRaspiRover.g:629:3: this_BooleanValue_Impl_0= ruleBooleanValue_Impl
                    {

                    			newCompositeNode(grammarAccess.getBooleanValueAccess().getBooleanValue_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanValue_Impl_0=ruleBooleanValue_Impl();

                    state._fsp--;


                    			current = this_BooleanValue_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRaspiRover.g:638:3: this_ObstacleQuery_1= ruleObstacleQuery
                    {

                    			newCompositeNode(grammarAccess.getBooleanValueAccess().getObstacleQueryParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ObstacleQuery_1=ruleObstacleQuery();

                    state._fsp--;


                    			current = this_ObstacleQuery_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRaspiRover.g:647:3: this_VarRef_2= ruleVarRef
                    {

                    			newCompositeNode(grammarAccess.getBooleanValueAccess().getVarRefParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_VarRef_2=ruleVarRef();

                    state._fsp--;


                    			current = this_VarRef_2;
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
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleRoverProgram"
    // InternalRaspiRover.g:659:1: entryRuleRoverProgram returns [EObject current=null] : iv_ruleRoverProgram= ruleRoverProgram EOF ;
    public final EObject entryRuleRoverProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoverProgram = null;


        try {
            // InternalRaspiRover.g:659:53: (iv_ruleRoverProgram= ruleRoverProgram EOF )
            // InternalRaspiRover.g:660:2: iv_ruleRoverProgram= ruleRoverProgram EOF
            {
             newCompositeNode(grammarAccess.getRoverProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoverProgram=ruleRoverProgram();

            state._fsp--;

             current =iv_ruleRoverProgram; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRoverProgram"


    // $ANTLR start "ruleRoverProgram"
    // InternalRaspiRover.g:666:1: ruleRoverProgram returns [EObject current=null] : (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' (otherlv_3= 'params' otherlv_4= '{' ( (lv_params_5_0= ruleParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )* otherlv_8= '}' )? ( (lv_block_9_0= ruleRclBlock ) ) otherlv_10= ']' ) ;
    public final EObject ruleRoverProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_params_5_0 = null;

        EObject lv_params_7_0 = null;

        EObject lv_block_9_0 = null;



        	enterRule();

        try {
            // InternalRaspiRover.g:672:2: ( (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' (otherlv_3= 'params' otherlv_4= '{' ( (lv_params_5_0= ruleParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )* otherlv_8= '}' )? ( (lv_block_9_0= ruleRclBlock ) ) otherlv_10= ']' ) )
            // InternalRaspiRover.g:673:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' (otherlv_3= 'params' otherlv_4= '{' ( (lv_params_5_0= ruleParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )* otherlv_8= '}' )? ( (lv_block_9_0= ruleRclBlock ) ) otherlv_10= ']' )
            {
            // InternalRaspiRover.g:673:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' (otherlv_3= 'params' otherlv_4= '{' ( (lv_params_5_0= ruleParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )* otherlv_8= '}' )? ( (lv_block_9_0= ruleRclBlock ) ) otherlv_10= ']' )
            // InternalRaspiRover.g:674:3: otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' (otherlv_3= 'params' otherlv_4= '{' ( (lv_params_5_0= ruleParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )* otherlv_8= '}' )? ( (lv_block_9_0= ruleRclBlock ) ) otherlv_10= ']'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getRoverProgramAccess().getProgramKeyword_0());
            		
            // InternalRaspiRover.g:678:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRaspiRover.g:679:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRaspiRover.g:679:4: (lv_name_1_0= RULE_ID )
            // InternalRaspiRover.g:680:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRoverProgramAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoverProgramRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getRoverProgramAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalRaspiRover.g:700:3: (otherlv_3= 'params' otherlv_4= '{' ( (lv_params_5_0= ruleParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )* otherlv_8= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRaspiRover.g:701:4: otherlv_3= 'params' otherlv_4= '{' ( (lv_params_5_0= ruleParam ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getRoverProgramAccess().getParamsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,13,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getRoverProgramAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRaspiRover.g:709:4: ( (lv_params_5_0= ruleParam ) )
                    // InternalRaspiRover.g:710:5: (lv_params_5_0= ruleParam )
                    {
                    // InternalRaspiRover.g:710:5: (lv_params_5_0= ruleParam )
                    // InternalRaspiRover.g:711:6: lv_params_5_0= ruleParam
                    {

                    						newCompositeNode(grammarAccess.getRoverProgramAccess().getParamsParamParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_params_5_0=ruleParam();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRoverProgramRule());
                    						}
                    						add(
                    							current,
                    							"params",
                    							lv_params_5_0,
                    							"rover.raspirover.xtext.RaspiRover.Param");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRaspiRover.g:728:4: (otherlv_6= ',' ( (lv_params_7_0= ruleParam ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==20) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalRaspiRover.g:729:5: otherlv_6= ',' ( (lv_params_7_0= ruleParam ) )
                    	    {
                    	    otherlv_6=(Token)match(input,20,FOLLOW_8); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getRoverProgramAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRaspiRover.g:733:5: ( (lv_params_7_0= ruleParam ) )
                    	    // InternalRaspiRover.g:734:6: (lv_params_7_0= ruleParam )
                    	    {
                    	    // InternalRaspiRover.g:734:6: (lv_params_7_0= ruleParam )
                    	    // InternalRaspiRover.g:735:7: lv_params_7_0= ruleParam
                    	    {

                    	    							newCompositeNode(grammarAccess.getRoverProgramAccess().getParamsParamParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_params_7_0=ruleParam();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRoverProgramRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"params",
                    	    								lv_params_7_0,
                    	    								"rover.raspirover.xtext.RaspiRover.Param");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getRoverProgramAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalRaspiRover.g:758:3: ( (lv_block_9_0= ruleRclBlock ) )
            // InternalRaspiRover.g:759:4: (lv_block_9_0= ruleRclBlock )
            {
            // InternalRaspiRover.g:759:4: (lv_block_9_0= ruleRclBlock )
            // InternalRaspiRover.g:760:5: lv_block_9_0= ruleRclBlock
            {

            					newCompositeNode(grammarAccess.getRoverProgramAccess().getBlockRclBlockParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
            lv_block_9_0=ruleRclBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoverProgramRule());
            					}
            					set(
            						current,
            						"block",
            						lv_block_9_0,
            						"rover.raspirover.xtext.RaspiRover.RclBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getRoverProgramAccess().getRightSquareBracketKeyword_5());
            		

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
    // $ANTLR end "ruleRoverProgram"


    // $ANTLR start "entryRuleRasPiBoard"
    // InternalRaspiRover.g:785:1: entryRuleRasPiBoard returns [EObject current=null] : iv_ruleRasPiBoard= ruleRasPiBoard EOF ;
    public final EObject entryRuleRasPiBoard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRasPiBoard = null;


        try {
            // InternalRaspiRover.g:785:51: (iv_ruleRasPiBoard= ruleRasPiBoard EOF )
            // InternalRaspiRover.g:786:2: iv_ruleRasPiBoard= ruleRasPiBoard EOF
            {
             newCompositeNode(grammarAccess.getRasPiBoardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRasPiBoard=ruleRasPiBoard();

            state._fsp--;

             current =iv_ruleRasPiBoard; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRasPiBoard"


    // $ANTLR start "ruleRasPiBoard"
    // InternalRaspiRover.g:792:1: ruleRasPiBoard returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_digitalPins_2_0= ruleDigitalPin ) )* ( (lv_analogPins_3_0= ruleAnalogPin ) ) otherlv_4= '}' ) ;
    public final EObject ruleRasPiBoard() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_digitalPins_2_0 = null;

        EObject lv_analogPins_3_0 = null;



        	enterRule();

        try {
            // InternalRaspiRover.g:798:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_digitalPins_2_0= ruleDigitalPin ) )* ( (lv_analogPins_3_0= ruleAnalogPin ) ) otherlv_4= '}' ) )
            // InternalRaspiRover.g:799:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_digitalPins_2_0= ruleDigitalPin ) )* ( (lv_analogPins_3_0= ruleAnalogPin ) ) otherlv_4= '}' )
            {
            // InternalRaspiRover.g:799:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_digitalPins_2_0= ruleDigitalPin ) )* ( (lv_analogPins_3_0= ruleAnalogPin ) ) otherlv_4= '}' )
            // InternalRaspiRover.g:800:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_digitalPins_2_0= ruleDigitalPin ) )* ( (lv_analogPins_3_0= ruleAnalogPin ) ) otherlv_4= '}'
            {
            // InternalRaspiRover.g:800:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRaspiRover.g:801:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRaspiRover.g:801:4: (lv_name_0_0= RULE_ID )
            // InternalRaspiRover.g:802:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getRasPiBoardAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRasPiBoardRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getRasPiBoardAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRaspiRover.g:822:3: ( (lv_digitalPins_2_0= ruleDigitalPin ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==21) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRaspiRover.g:823:4: (lv_digitalPins_2_0= ruleDigitalPin )
            	    {
            	    // InternalRaspiRover.g:823:4: (lv_digitalPins_2_0= ruleDigitalPin )
            	    // InternalRaspiRover.g:824:5: lv_digitalPins_2_0= ruleDigitalPin
            	    {

            	    					newCompositeNode(grammarAccess.getRasPiBoardAccess().getDigitalPinsDigitalPinParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_digitalPins_2_0=ruleDigitalPin();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRasPiBoardRule());
            	    					}
            	    					add(
            	    						current,
            	    						"digitalPins",
            	    						lv_digitalPins_2_0,
            	    						"rover.raspirover.xtext.RaspiRover.DigitalPin");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalRaspiRover.g:841:3: ( (lv_analogPins_3_0= ruleAnalogPin ) )
            // InternalRaspiRover.g:842:4: (lv_analogPins_3_0= ruleAnalogPin )
            {
            // InternalRaspiRover.g:842:4: (lv_analogPins_3_0= ruleAnalogPin )
            // InternalRaspiRover.g:843:5: lv_analogPins_3_0= ruleAnalogPin
            {

            					newCompositeNode(grammarAccess.getRasPiBoardAccess().getAnalogPinsAnalogPinParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_analogPins_3_0=ruleAnalogPin();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRasPiBoardRule());
            					}
            					add(
            						current,
            						"analogPins",
            						lv_analogPins_3_0,
            						"rover.raspirover.xtext.RaspiRover.AnalogPin");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getRasPiBoardAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleRasPiBoard"


    // $ANTLR start "entryRuleDigitalPin"
    // InternalRaspiRover.g:868:1: entryRuleDigitalPin returns [EObject current=null] : iv_ruleDigitalPin= ruleDigitalPin EOF ;
    public final EObject entryRuleDigitalPin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDigitalPin = null;


        try {
            // InternalRaspiRover.g:868:51: (iv_ruleDigitalPin= ruleDigitalPin EOF )
            // InternalRaspiRover.g:869:2: iv_ruleDigitalPin= ruleDigitalPin EOF
            {
             newCompositeNode(grammarAccess.getDigitalPinRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDigitalPin=ruleDigitalPin();

            state._fsp--;

             current =iv_ruleDigitalPin; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDigitalPin"


    // $ANTLR start "ruleDigitalPin"
    // InternalRaspiRover.g:875:1: ruleDigitalPin returns [EObject current=null] : (otherlv_0= 'digital-pin' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDigitalPin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalRaspiRover.g:881:2: ( (otherlv_0= 'digital-pin' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalRaspiRover.g:882:2: (otherlv_0= 'digital-pin' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalRaspiRover.g:882:2: (otherlv_0= 'digital-pin' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalRaspiRover.g:883:3: otherlv_0= 'digital-pin' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getDigitalPinAccess().getDigitalPinKeyword_0());
            		
            // InternalRaspiRover.g:887:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRaspiRover.g:888:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRaspiRover.g:888:4: (lv_name_1_0= RULE_ID )
            // InternalRaspiRover.g:889:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDigitalPinAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDigitalPinRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleDigitalPin"


    // $ANTLR start "entryRuleAnalogPin"
    // InternalRaspiRover.g:909:1: entryRuleAnalogPin returns [EObject current=null] : iv_ruleAnalogPin= ruleAnalogPin EOF ;
    public final EObject entryRuleAnalogPin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnalogPin = null;


        try {
            // InternalRaspiRover.g:909:50: (iv_ruleAnalogPin= ruleAnalogPin EOF )
            // InternalRaspiRover.g:910:2: iv_ruleAnalogPin= ruleAnalogPin EOF
            {
             newCompositeNode(grammarAccess.getAnalogPinRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnalogPin=ruleAnalogPin();

            state._fsp--;

             current =iv_ruleAnalogPin; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAnalogPin"


    // $ANTLR start "ruleAnalogPin"
    // InternalRaspiRover.g:916:1: ruleAnalogPin returns [EObject current=null] : (otherlv_0= 'analog-pin' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAnalogPin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalRaspiRover.g:922:2: ( (otherlv_0= 'analog-pin' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalRaspiRover.g:923:2: (otherlv_0= 'analog-pin' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalRaspiRover.g:923:2: (otherlv_0= 'analog-pin' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalRaspiRover.g:924:3: otherlv_0= 'analog-pin' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getAnalogPinAccess().getAnalogPinKeyword_0());
            		
            // InternalRaspiRover.g:928:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRaspiRover.g:929:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRaspiRover.g:929:4: (lv_name_1_0= RULE_ID )
            // InternalRaspiRover.g:930:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAnalogPinAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnalogPinRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleAnalogPin"


    // $ANTLR start "entryRuleParam"
    // InternalRaspiRover.g:950:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // InternalRaspiRover.g:950:46: (iv_ruleParam= ruleParam EOF )
            // InternalRaspiRover.g:951:2: iv_ruleParam= ruleParam EOF
            {
             newCompositeNode(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParam=ruleParam();

            state._fsp--;

             current =iv_ruleParam; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRaspiRover.g:957:1: ruleParam returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalRaspiRover.g:963:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalRaspiRover.g:964:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalRaspiRover.g:964:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalRaspiRover.g:965:3: (lv_name_0_0= RULE_ID )
            {
            // InternalRaspiRover.g:965:3: (lv_name_0_0= RULE_ID )
            // InternalRaspiRover.g:966:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getParamAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getParamRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleParam"


    // $ANTLR start "entryRuleRclBlock"
    // InternalRaspiRover.g:985:1: entryRuleRclBlock returns [EObject current=null] : iv_ruleRclBlock= ruleRclBlock EOF ;
    public final EObject entryRuleRclBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRclBlock = null;


        try {
            // InternalRaspiRover.g:985:49: (iv_ruleRclBlock= ruleRclBlock EOF )
            // InternalRaspiRover.g:986:2: iv_ruleRclBlock= ruleRclBlock EOF
            {
             newCompositeNode(grammarAccess.getRclBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRclBlock=ruleRclBlock();

            state._fsp--;

             current =iv_ruleRclBlock; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRclBlock"


    // $ANTLR start "ruleRclBlock"
    // InternalRaspiRover.g:992:1: ruleRclBlock returns [EObject current=null] : (otherlv_0= '{' ( (lv_stmts_1_0= ruleStatement ) )+ otherlv_2= '}' ) ;
    public final EObject ruleRclBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_stmts_1_0 = null;



        	enterRule();

        try {
            // InternalRaspiRover.g:998:2: ( (otherlv_0= '{' ( (lv_stmts_1_0= ruleStatement ) )+ otherlv_2= '}' ) )
            // InternalRaspiRover.g:999:2: (otherlv_0= '{' ( (lv_stmts_1_0= ruleStatement ) )+ otherlv_2= '}' )
            {
            // InternalRaspiRover.g:999:2: (otherlv_0= '{' ( (lv_stmts_1_0= ruleStatement ) )+ otherlv_2= '}' )
            // InternalRaspiRover.g:1000:3: otherlv_0= '{' ( (lv_stmts_1_0= ruleStatement ) )+ otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getRclBlockAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalRaspiRover.g:1004:3: ( (lv_stmts_1_0= ruleStatement ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||LA13_0==13||LA13_0==23||LA13_0==25||(LA13_0>=29 && LA13_0<=35)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRaspiRover.g:1005:4: (lv_stmts_1_0= ruleStatement )
            	    {
            	    // InternalRaspiRover.g:1005:4: (lv_stmts_1_0= ruleStatement )
            	    // InternalRaspiRover.g:1006:5: lv_stmts_1_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getRclBlockAccess().getStmtsStatementParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_stmts_1_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRclBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"stmts",
            	    						lv_stmts_1_0,
            	    						"rover.raspirover.xtext.RaspiRover.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            otherlv_2=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getRclBlockAccess().getRightCurlyBracketKeyword_2());
            		

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
    // $ANTLR end "ruleRclBlock"


    // $ANTLR start "entryRuleVarAssignment"
    // InternalRaspiRover.g:1031:1: entryRuleVarAssignment returns [EObject current=null] : iv_ruleVarAssignment= ruleVarAssignment EOF ;
    public final EObject entryRuleVarAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarAssignment = null;


        try {
            // InternalRaspiRover.g:1031:54: (iv_ruleVarAssignment= ruleVarAssignment EOF )
            // InternalRaspiRover.g:1032:2: iv_ruleVarAssignment= ruleVarAssignment EOF
            {
             newCompositeNode(grammarAccess.getVarAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarAssignment=ruleVarAssignment();

            state._fsp--;

             current =iv_ruleVarAssignment; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVarAssignment"


    // $ANTLR start "ruleVarAssignment"
    // InternalRaspiRover.g:1038:1: ruleVarAssignment returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_value_3_0= ruleRoverValue ) ) ) ;
    public final EObject ruleVarAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalRaspiRover.g:1044:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_value_3_0= ruleRoverValue ) ) ) )
            // InternalRaspiRover.g:1045:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_value_3_0= ruleRoverValue ) ) )
            {
            // InternalRaspiRover.g:1045:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_value_3_0= ruleRoverValue ) ) )
            // InternalRaspiRover.g:1046:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_value_3_0= ruleRoverValue ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getVarAssignmentAccess().getVarKeyword_0());
            		
            // InternalRaspiRover.g:1050:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRaspiRover.g:1051:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRaspiRover.g:1051:4: (lv_name_1_0= RULE_ID )
            // InternalRaspiRover.g:1052:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVarAssignmentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarAssignmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getVarAssignmentAccess().getColonEqualsSignKeyword_2());
            		
            // InternalRaspiRover.g:1072:3: ( (lv_value_3_0= ruleRoverValue ) )
            // InternalRaspiRover.g:1073:4: (lv_value_3_0= ruleRoverValue )
            {
            // InternalRaspiRover.g:1073:4: (lv_value_3_0= ruleRoverValue )
            // InternalRaspiRover.g:1074:5: lv_value_3_0= ruleRoverValue
            {

            					newCompositeNode(grammarAccess.getVarAssignmentAccess().getValueRoverValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleRoverValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarAssignmentRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"rover.raspirover.xtext.RaspiRover.RoverValue");
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
    // $ANTLR end "ruleVarAssignment"


    // $ANTLR start "entryRuleConditional"
    // InternalRaspiRover.g:1095:1: entryRuleConditional returns [EObject current=null] : iv_ruleConditional= ruleConditional EOF ;
    public final EObject entryRuleConditional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditional = null;


        try {
            // InternalRaspiRover.g:1095:52: (iv_ruleConditional= ruleConditional EOF )
            // InternalRaspiRover.g:1096:2: iv_ruleConditional= ruleConditional EOF
            {
             newCompositeNode(grammarAccess.getConditionalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditional=ruleConditional();

            state._fsp--;

             current =iv_ruleConditional; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConditional"


    // $ANTLR start "ruleConditional"
    // InternalRaspiRover.g:1102:1: ruleConditional returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_expr_2_0= ruleRoverExpression ) ) otherlv_3= ')' ( (lv_condTrue_4_0= ruleRclBlock ) ) otherlv_5= 'else' ( (lv_condFalse_6_0= ruleRclBlock ) ) ) ;
    public final EObject ruleConditional() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_expr_2_0 = null;

        EObject lv_condTrue_4_0 = null;

        EObject lv_condFalse_6_0 = null;



        	enterRule();

        try {
            // InternalRaspiRover.g:1108:2: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_expr_2_0= ruleRoverExpression ) ) otherlv_3= ')' ( (lv_condTrue_4_0= ruleRclBlock ) ) otherlv_5= 'else' ( (lv_condFalse_6_0= ruleRclBlock ) ) ) )
            // InternalRaspiRover.g:1109:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expr_2_0= ruleRoverExpression ) ) otherlv_3= ')' ( (lv_condTrue_4_0= ruleRclBlock ) ) otherlv_5= 'else' ( (lv_condFalse_6_0= ruleRclBlock ) ) )
            {
            // InternalRaspiRover.g:1109:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expr_2_0= ruleRoverExpression ) ) otherlv_3= ')' ( (lv_condTrue_4_0= ruleRclBlock ) ) otherlv_5= 'else' ( (lv_condFalse_6_0= ruleRclBlock ) ) )
            // InternalRaspiRover.g:1110:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_expr_2_0= ruleRoverExpression ) ) otherlv_3= ')' ( (lv_condTrue_4_0= ruleRclBlock ) ) otherlv_5= 'else' ( (lv_condFalse_6_0= ruleRclBlock ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionalAccess().getIfKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionalAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRaspiRover.g:1118:3: ( (lv_expr_2_0= ruleRoverExpression ) )
            // InternalRaspiRover.g:1119:4: (lv_expr_2_0= ruleRoverExpression )
            {
            // InternalRaspiRover.g:1119:4: (lv_expr_2_0= ruleRoverExpression )
            // InternalRaspiRover.g:1120:5: lv_expr_2_0= ruleRoverExpression
            {

            					newCompositeNode(grammarAccess.getConditionalAccess().getExprRoverExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
            lv_expr_2_0=ruleRoverExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_2_0,
            						"rover.raspirover.xtext.RaspiRover.RoverExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getConditionalAccess().getRightParenthesisKeyword_3());
            		
            // InternalRaspiRover.g:1141:3: ( (lv_condTrue_4_0= ruleRclBlock ) )
            // InternalRaspiRover.g:1142:4: (lv_condTrue_4_0= ruleRclBlock )
            {
            // InternalRaspiRover.g:1142:4: (lv_condTrue_4_0= ruleRclBlock )
            // InternalRaspiRover.g:1143:5: lv_condTrue_4_0= ruleRclBlock
            {

            					newCompositeNode(grammarAccess.getConditionalAccess().getCondTrueRclBlockParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_19);
            lv_condTrue_4_0=ruleRclBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalRule());
            					}
            					set(
            						current,
            						"condTrue",
            						lv_condTrue_4_0,
            						"rover.raspirover.xtext.RaspiRover.RclBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getConditionalAccess().getElseKeyword_5());
            		
            // InternalRaspiRover.g:1164:3: ( (lv_condFalse_6_0= ruleRclBlock ) )
            // InternalRaspiRover.g:1165:4: (lv_condFalse_6_0= ruleRclBlock )
            {
            // InternalRaspiRover.g:1165:4: (lv_condFalse_6_0= ruleRclBlock )
            // InternalRaspiRover.g:1166:5: lv_condFalse_6_0= ruleRclBlock
            {

            					newCompositeNode(grammarAccess.getConditionalAccess().getCondFalseRclBlockParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_condFalse_6_0=ruleRclBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalRule());
            					}
            					set(
            						current,
            						"condFalse",
            						lv_condFalse_6_0,
            						"rover.raspirover.xtext.RaspiRover.RclBlock");
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
    // $ANTLR end "ruleConditional"


    // $ANTLR start "entryRuleLoop"
    // InternalRaspiRover.g:1187:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // InternalRaspiRover.g:1187:45: (iv_ruleLoop= ruleLoop EOF )
            // InternalRaspiRover.g:1188:2: iv_ruleLoop= ruleLoop EOF
            {
             newCompositeNode(grammarAccess.getLoopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoop=ruleLoop();

            state._fsp--;

             current =iv_ruleLoop; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLoop"


    // $ANTLR start "ruleLoop"
    // InternalRaspiRover.g:1194:1: ruleLoop returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( (lv_expr_2_0= ruleRoverExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_block_5_0= ruleRclBlock ) ) otherlv_6= '}' ) ;
    public final EObject ruleLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expr_2_0 = null;

        EObject lv_block_5_0 = null;



        	enterRule();

        try {
            // InternalRaspiRover.g:1200:2: ( (otherlv_0= 'while' otherlv_1= '(' ( (lv_expr_2_0= ruleRoverExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_block_5_0= ruleRclBlock ) ) otherlv_6= '}' ) )
            // InternalRaspiRover.g:1201:2: (otherlv_0= 'while' otherlv_1= '(' ( (lv_expr_2_0= ruleRoverExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_block_5_0= ruleRclBlock ) ) otherlv_6= '}' )
            {
            // InternalRaspiRover.g:1201:2: (otherlv_0= 'while' otherlv_1= '(' ( (lv_expr_2_0= ruleRoverExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_block_5_0= ruleRclBlock ) ) otherlv_6= '}' )
            // InternalRaspiRover.g:1202:3: otherlv_0= 'while' otherlv_1= '(' ( (lv_expr_2_0= ruleRoverExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_block_5_0= ruleRclBlock ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getLoopAccess().getWhileKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getLoopAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRaspiRover.g:1210:3: ( (lv_expr_2_0= ruleRoverExpression ) )
            // InternalRaspiRover.g:1211:4: (lv_expr_2_0= ruleRoverExpression )
            {
            // InternalRaspiRover.g:1211:4: (lv_expr_2_0= ruleRoverExpression )
            // InternalRaspiRover.g:1212:5: lv_expr_2_0= ruleRoverExpression
            {

            					newCompositeNode(grammarAccess.getLoopAccess().getExprRoverExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
            lv_expr_2_0=ruleRoverExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoopRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_2_0,
            						"rover.raspirover.xtext.RaspiRover.RoverExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getLoopAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalRaspiRover.g:1237:3: ( (lv_block_5_0= ruleRclBlock ) )
            // InternalRaspiRover.g:1238:4: (lv_block_5_0= ruleRclBlock )
            {
            // InternalRaspiRover.g:1238:4: (lv_block_5_0= ruleRclBlock )
            // InternalRaspiRover.g:1239:5: lv_block_5_0= ruleRclBlock
            {

            					newCompositeNode(grammarAccess.getLoopAccess().getBlockRclBlockParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_block_5_0=ruleRclBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoopRule());
            					}
            					set(
            						current,
            						"block",
            						lv_block_5_0,
            						"rover.raspirover.xtext.RaspiRover.RclBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleLoop"


    // $ANTLR start "entryRuleForwardAction"
    // InternalRaspiRover.g:1264:1: entryRuleForwardAction returns [EObject current=null] : iv_ruleForwardAction= ruleForwardAction EOF ;
    public final EObject entryRuleForwardAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForwardAction = null;


        try {
            // InternalRaspiRover.g:1264:54: (iv_ruleForwardAction= ruleForwardAction EOF )
            // InternalRaspiRover.g:1265:2: iv_ruleForwardAction= ruleForwardAction EOF
            {
             newCompositeNode(grammarAccess.getForwardActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForwardAction=ruleForwardAction();

            state._fsp--;

             current =iv_ruleForwardAction; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleForwardAction"


    // $ANTLR start "ruleForwardAction"
    // InternalRaspiRover.g:1271:1: ruleForwardAction returns [EObject current=null] : ( () otherlv_1= 'forward' ) ;
    public final EObject ruleForwardAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRaspiRover.g:1277:2: ( ( () otherlv_1= 'forward' ) )
            // InternalRaspiRover.g:1278:2: ( () otherlv_1= 'forward' )
            {
            // InternalRaspiRover.g:1278:2: ( () otherlv_1= 'forward' )
            // InternalRaspiRover.g:1279:3: () otherlv_1= 'forward'
            {
            // InternalRaspiRover.g:1279:3: ()
            // InternalRaspiRover.g:1280:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getForwardActionAccess().getForwardActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getForwardActionAccess().getForwardKeyword_1());
            		

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
    // $ANTLR end "ruleForwardAction"


    // $ANTLR start "entryRuleForwardMinAction"
    // InternalRaspiRover.g:1294:1: entryRuleForwardMinAction returns [EObject current=null] : iv_ruleForwardMinAction= ruleForwardMinAction EOF ;
    public final EObject entryRuleForwardMinAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForwardMinAction = null;


        try {
            // InternalRaspiRover.g:1294:57: (iv_ruleForwardMinAction= ruleForwardMinAction EOF )
            // InternalRaspiRover.g:1295:2: iv_ruleForwardMinAction= ruleForwardMinAction EOF
            {
             newCompositeNode(grammarAccess.getForwardMinActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForwardMinAction=ruleForwardMinAction();

            state._fsp--;

             current =iv_ruleForwardMinAction; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleForwardMinAction"


    // $ANTLR start "ruleForwardMinAction"
    // InternalRaspiRover.g:1301:1: ruleForwardMinAction returns [EObject current=null] : ( () otherlv_1= 'forward' ( (lv_distance_2_0= ruleNumberValue ) ) ) ;
    public final EObject ruleForwardMinAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_distance_2_0 = null;



        	enterRule();

        try {
            // InternalRaspiRover.g:1307:2: ( ( () otherlv_1= 'forward' ( (lv_distance_2_0= ruleNumberValue ) ) ) )
            // InternalRaspiRover.g:1308:2: ( () otherlv_1= 'forward' ( (lv_distance_2_0= ruleNumberValue ) ) )
            {
            // InternalRaspiRover.g:1308:2: ( () otherlv_1= 'forward' ( (lv_distance_2_0= ruleNumberValue ) ) )
            // InternalRaspiRover.g:1309:3: () otherlv_1= 'forward' ( (lv_distance_2_0= ruleNumberValue ) )
            {
            // InternalRaspiRover.g:1309:3: ()
            // InternalRaspiRover.g:1310:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getForwardMinActionAccess().getForwardMinActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getForwardMinActionAccess().getForwardKeyword_1());
            		
            // InternalRaspiRover.g:1320:3: ( (lv_distance_2_0= ruleNumberValue ) )
            // InternalRaspiRover.g:1321:4: (lv_distance_2_0= ruleNumberValue )
            {
            // InternalRaspiRover.g:1321:4: (lv_distance_2_0= ruleNumberValue )
            // InternalRaspiRover.g:1322:5: lv_distance_2_0= ruleNumberValue
            {

            					newCompositeNode(grammarAccess.getForwardMinActionAccess().getDistanceNumberValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_distance_2_0=ruleNumberValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForwardMinActionRule());
            					}
            					set(
            						current,
            						"distance",
            						lv_distance_2_0,
            						"rover.raspirover.xtext.RaspiRover.NumberValue");
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
    // $ANTLR end "ruleForwardMinAction"


    // $ANTLR start "entryRuleBackwardAction"
    // InternalRaspiRover.g:1343:1: entryRuleBackwardAction returns [EObject current=null] : iv_ruleBackwardAction= ruleBackwardAction EOF ;
    public final EObject entryRuleBackwardAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackwardAction = null;


        try {
            // InternalRaspiRover.g:1343:55: (iv_ruleBackwardAction= ruleBackwardAction EOF )
            // InternalRaspiRover.g:1344:2: iv_ruleBackwardAction= ruleBackwardAction EOF
            {
             newCompositeNode(grammarAccess.getBackwardActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBackwardAction=ruleBackwardAction();

            state._fsp--;

             current =iv_ruleBackwardAction; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBackwardAction"


    // $ANTLR start "ruleBackwardAction"
    // InternalRaspiRover.g:1350:1: ruleBackwardAction returns [EObject current=null] : ( () otherlv_1= 'backward' ) ;
    public final EObject ruleBackwardAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRaspiRover.g:1356:2: ( ( () otherlv_1= 'backward' ) )
            // InternalRaspiRover.g:1357:2: ( () otherlv_1= 'backward' )
            {
            // InternalRaspiRover.g:1357:2: ( () otherlv_1= 'backward' )
            // InternalRaspiRover.g:1358:3: () otherlv_1= 'backward'
            {
            // InternalRaspiRover.g:1358:3: ()
            // InternalRaspiRover.g:1359:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBackwardActionAccess().getBackwardActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getBackwardActionAccess().getBackwardKeyword_1());
            		

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
    // $ANTLR end "ruleBackwardAction"


    // $ANTLR start "entryRuleBackwardMinAction"
    // InternalRaspiRover.g:1373:1: entryRuleBackwardMinAction returns [EObject current=null] : iv_ruleBackwardMinAction= ruleBackwardMinAction EOF ;
    public final EObject entryRuleBackwardMinAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackwardMinAction = null;


        try {
            // InternalRaspiRover.g:1373:58: (iv_ruleBackwardMinAction= ruleBackwardMinAction EOF )
            // InternalRaspiRover.g:1374:2: iv_ruleBackwardMinAction= ruleBackwardMinAction EOF
            {
             newCompositeNode(grammarAccess.getBackwardMinActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBackwardMinAction=ruleBackwardMinAction();

            state._fsp--;

             current =iv_ruleBackwardMinAction; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBackwardMinAction"


    // $ANTLR start "ruleBackwardMinAction"
    // InternalRaspiRover.g:1380:1: ruleBackwardMinAction returns [EObject current=null] : ( () otherlv_1= 'backward' ( (lv_distance_2_0= ruleNumberValue ) ) ) ;
    public final EObject ruleBackwardMinAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_distance_2_0 = null;



        	enterRule();

        try {
            // InternalRaspiRover.g:1386:2: ( ( () otherlv_1= 'backward' ( (lv_distance_2_0= ruleNumberValue ) ) ) )
            // InternalRaspiRover.g:1387:2: ( () otherlv_1= 'backward' ( (lv_distance_2_0= ruleNumberValue ) ) )
            {
            // InternalRaspiRover.g:1387:2: ( () otherlv_1= 'backward' ( (lv_distance_2_0= ruleNumberValue ) ) )
            // InternalRaspiRover.g:1388:3: () otherlv_1= 'backward' ( (lv_distance_2_0= ruleNumberValue ) )
            {
            // InternalRaspiRover.g:1388:3: ()
            // InternalRaspiRover.g:1389:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBackwardMinActionAccess().getBackwardMinActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getBackwardMinActionAccess().getBackwardKeyword_1());
            		
            // InternalRaspiRover.g:1399:3: ( (lv_distance_2_0= ruleNumberValue ) )
            // InternalRaspiRover.g:1400:4: (lv_distance_2_0= ruleNumberValue )
            {
            // InternalRaspiRover.g:1400:4: (lv_distance_2_0= ruleNumberValue )
            // InternalRaspiRover.g:1401:5: lv_distance_2_0= ruleNumberValue
            {

            					newCompositeNode(grammarAccess.getBackwardMinActionAccess().getDistanceNumberValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_distance_2_0=ruleNumberValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBackwardMinActionRule());
            					}
            					set(
            						current,
            						"distance",
            						lv_distance_2_0,
            						"rover.raspirover.xtext.RaspiRover.NumberValue");
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
    // $ANTLR end "ruleBackwardMinAction"


    // $ANTLR start "entryRuleTurnAction"
    // InternalRaspiRover.g:1422:1: entryRuleTurnAction returns [EObject current=null] : iv_ruleTurnAction= ruleTurnAction EOF ;
    public final EObject entryRuleTurnAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurnAction = null;


        try {
            // InternalRaspiRover.g:1422:51: (iv_ruleTurnAction= ruleTurnAction EOF )
            // InternalRaspiRover.g:1423:2: iv_ruleTurnAction= ruleTurnAction EOF
            {
             newCompositeNode(grammarAccess.getTurnActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTurnAction=ruleTurnAction();

            state._fsp--;

             current =iv_ruleTurnAction; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTurnAction"


    // $ANTLR start "ruleTurnAction"
    // InternalRaspiRover.g:1429:1: ruleTurnAction returns [EObject current=null] : ( () otherlv_1= 'turn' ) ;
    public final EObject ruleTurnAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRaspiRover.g:1435:2: ( ( () otherlv_1= 'turn' ) )
            // InternalRaspiRover.g:1436:2: ( () otherlv_1= 'turn' )
            {
            // InternalRaspiRover.g:1436:2: ( () otherlv_1= 'turn' )
            // InternalRaspiRover.g:1437:3: () otherlv_1= 'turn'
            {
            // InternalRaspiRover.g:1437:3: ()
            // InternalRaspiRover.g:1438:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTurnActionAccess().getTurnActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getTurnActionAccess().getTurnKeyword_1());
            		

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
    // $ANTLR end "ruleTurnAction"


    // $ANTLR start "entryRuleTurnDegAction"
    // InternalRaspiRover.g:1452:1: entryRuleTurnDegAction returns [EObject current=null] : iv_ruleTurnDegAction= ruleTurnDegAction EOF ;
    public final EObject entryRuleTurnDegAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurnDegAction = null;


        try {
            // InternalRaspiRover.g:1452:54: (iv_ruleTurnDegAction= ruleTurnDegAction EOF )
            // InternalRaspiRover.g:1453:2: iv_ruleTurnDegAction= ruleTurnDegAction EOF
            {
             newCompositeNode(grammarAccess.getTurnDegActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTurnDegAction=ruleTurnDegAction();

            state._fsp--;

             current =iv_ruleTurnDegAction; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTurnDegAction"


    // $ANTLR start "ruleTurnDegAction"
    // InternalRaspiRover.g:1459:1: ruleTurnDegAction returns [EObject current=null] : ( () otherlv_1= 'turn' ( (lv_degrees_2_0= ruleNumberValue ) ) ) ;
    public final EObject ruleTurnDegAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_degrees_2_0 = null;



        	enterRule();

        try {
            // InternalRaspiRover.g:1465:2: ( ( () otherlv_1= 'turn' ( (lv_degrees_2_0= ruleNumberValue ) ) ) )
            // InternalRaspiRover.g:1466:2: ( () otherlv_1= 'turn' ( (lv_degrees_2_0= ruleNumberValue ) ) )
            {
            // InternalRaspiRover.g:1466:2: ( () otherlv_1= 'turn' ( (lv_degrees_2_0= ruleNumberValue ) ) )
            // InternalRaspiRover.g:1467:3: () otherlv_1= 'turn' ( (lv_degrees_2_0= ruleNumberValue ) )
            {
            // InternalRaspiRover.g:1467:3: ()
            // InternalRaspiRover.g:1468:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTurnDegActionAccess().getTurnDegActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getTurnDegActionAccess().getTurnKeyword_1());
            		
            // InternalRaspiRover.g:1478:3: ( (lv_degrees_2_0= ruleNumberValue ) )
            // InternalRaspiRover.g:1479:4: (lv_degrees_2_0= ruleNumberValue )
            {
            // InternalRaspiRover.g:1479:4: (lv_degrees_2_0= ruleNumberValue )
            // InternalRaspiRover.g:1480:5: lv_degrees_2_0= ruleNumberValue
            {

            					newCompositeNode(grammarAccess.getTurnDegActionAccess().getDegreesNumberValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_degrees_2_0=ruleNumberValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTurnDegActionRule());
            					}
            					set(
            						current,
            						"degrees",
            						lv_degrees_2_0,
            						"rover.raspirover.xtext.RaspiRover.NumberValue");
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
    // $ANTLR end "ruleTurnDegAction"


    // $ANTLR start "entryRuleStopAction"
    // InternalRaspiRover.g:1501:1: entryRuleStopAction returns [EObject current=null] : iv_ruleStopAction= ruleStopAction EOF ;
    public final EObject entryRuleStopAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStopAction = null;


        try {
            // InternalRaspiRover.g:1501:51: (iv_ruleStopAction= ruleStopAction EOF )
            // InternalRaspiRover.g:1502:2: iv_ruleStopAction= ruleStopAction EOF
            {
             newCompositeNode(grammarAccess.getStopActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStopAction=ruleStopAction();

            state._fsp--;

             current =iv_ruleStopAction; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStopAction"


    // $ANTLR start "ruleStopAction"
    // InternalRaspiRover.g:1508:1: ruleStopAction returns [EObject current=null] : ( () otherlv_1= 'stop' ) ;
    public final EObject ruleStopAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRaspiRover.g:1514:2: ( ( () otherlv_1= 'stop' ) )
            // InternalRaspiRover.g:1515:2: ( () otherlv_1= 'stop' )
            {
            // InternalRaspiRover.g:1515:2: ( () otherlv_1= 'stop' )
            // InternalRaspiRover.g:1516:3: () otherlv_1= 'stop'
            {
            // InternalRaspiRover.g:1516:3: ()
            // InternalRaspiRover.g:1517:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStopActionAccess().getStopActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getStopActionAccess().getStopKeyword_1());
            		

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
    // $ANTLR end "ruleStopAction"


    // $ANTLR start "entryRuleLogAction"
    // InternalRaspiRover.g:1531:1: entryRuleLogAction returns [EObject current=null] : iv_ruleLogAction= ruleLogAction EOF ;
    public final EObject entryRuleLogAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogAction = null;


        try {
            // InternalRaspiRover.g:1531:50: (iv_ruleLogAction= ruleLogAction EOF )
            // InternalRaspiRover.g:1532:2: iv_ruleLogAction= ruleLogAction EOF
            {
             newCompositeNode(grammarAccess.getLogActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogAction=ruleLogAction();

            state._fsp--;

             current =iv_ruleLogAction; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLogAction"


    // $ANTLR start "ruleLogAction"
    // InternalRaspiRover.g:1538:1: ruleLogAction returns [EObject current=null] : ( () otherlv_1= 'log' ( (lv_message_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleLogAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_message_2_0=null;


        	enterRule();

        try {
            // InternalRaspiRover.g:1544:2: ( ( () otherlv_1= 'log' ( (lv_message_2_0= RULE_STRING ) ) ) )
            // InternalRaspiRover.g:1545:2: ( () otherlv_1= 'log' ( (lv_message_2_0= RULE_STRING ) ) )
            {
            // InternalRaspiRover.g:1545:2: ( () otherlv_1= 'log' ( (lv_message_2_0= RULE_STRING ) ) )
            // InternalRaspiRover.g:1546:3: () otherlv_1= 'log' ( (lv_message_2_0= RULE_STRING ) )
            {
            // InternalRaspiRover.g:1546:3: ()
            // InternalRaspiRover.g:1547:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLogActionAccess().getLogActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getLogActionAccess().getLogKeyword_1());
            		
            // InternalRaspiRover.g:1557:3: ( (lv_message_2_0= RULE_STRING ) )
            // InternalRaspiRover.g:1558:4: (lv_message_2_0= RULE_STRING )
            {
            // InternalRaspiRover.g:1558:4: (lv_message_2_0= RULE_STRING )
            // InternalRaspiRover.g:1559:5: lv_message_2_0= RULE_STRING
            {
            lv_message_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_message_2_0, grammarAccess.getLogActionAccess().getMessageSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"message",
            						lv_message_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleLogAction"


    // $ANTLR start "entryRuleSendAction"
    // InternalRaspiRover.g:1579:1: entryRuleSendAction returns [EObject current=null] : iv_ruleSendAction= ruleSendAction EOF ;
    public final EObject entryRuleSendAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSendAction = null;


        try {
            // InternalRaspiRover.g:1579:51: (iv_ruleSendAction= ruleSendAction EOF )
            // InternalRaspiRover.g:1580:2: iv_ruleSendAction= ruleSendAction EOF
            {
             newCompositeNode(grammarAccess.getSendActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSendAction=ruleSendAction();

            state._fsp--;

             current =iv_ruleSendAction; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSendAction"


    // $ANTLR start "ruleSendAction"
    // InternalRaspiRover.g:1586:1: ruleSendAction returns [EObject current=null] : ( () otherlv_1= 'send' ( (lv_message_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleSendAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_message_2_0=null;


        	enterRule();

        try {
            // InternalRaspiRover.g:1592:2: ( ( () otherlv_1= 'send' ( (lv_message_2_0= RULE_STRING ) ) ) )
            // InternalRaspiRover.g:1593:2: ( () otherlv_1= 'send' ( (lv_message_2_0= RULE_STRING ) ) )
            {
            // InternalRaspiRover.g:1593:2: ( () otherlv_1= 'send' ( (lv_message_2_0= RULE_STRING ) ) )
            // InternalRaspiRover.g:1594:3: () otherlv_1= 'send' ( (lv_message_2_0= RULE_STRING ) )
            {
            // InternalRaspiRover.g:1594:3: ()
            // InternalRaspiRover.g:1595:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSendActionAccess().getSendActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getSendActionAccess().getSendKeyword_1());
            		
            // InternalRaspiRover.g:1605:3: ( (lv_message_2_0= RULE_STRING ) )
            // InternalRaspiRover.g:1606:4: (lv_message_2_0= RULE_STRING )
            {
            // InternalRaspiRover.g:1606:4: (lv_message_2_0= RULE_STRING )
            // InternalRaspiRover.g:1607:5: lv_message_2_0= RULE_STRING
            {
            lv_message_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_message_2_0, grammarAccess.getSendActionAccess().getMessageSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSendActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"message",
            						lv_message_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleSendAction"


    // $ANTLR start "entryRuleVarRef"
    // InternalRaspiRover.g:1627:1: entryRuleVarRef returns [EObject current=null] : iv_ruleVarRef= ruleVarRef EOF ;
    public final EObject entryRuleVarRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarRef = null;


        try {
            // InternalRaspiRover.g:1627:47: (iv_ruleVarRef= ruleVarRef EOF )
            // InternalRaspiRover.g:1628:2: iv_ruleVarRef= ruleVarRef EOF
            {
             newCompositeNode(grammarAccess.getVarRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarRef=ruleVarRef();

            state._fsp--;

             current =iv_ruleVarRef; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVarRef"


    // $ANTLR start "ruleVarRef"
    // InternalRaspiRover.g:1634:1: ruleVarRef returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVarRef() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalRaspiRover.g:1640:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalRaspiRover.g:1641:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalRaspiRover.g:1641:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalRaspiRover.g:1642:3: (lv_name_0_0= RULE_ID )
            {
            // InternalRaspiRover.g:1642:3: (lv_name_0_0= RULE_ID )
            // InternalRaspiRover.g:1643:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getVarRefAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVarRefRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleVarRef"


    // $ANTLR start "entryRuleTemperatureQuery"
    // InternalRaspiRover.g:1662:1: entryRuleTemperatureQuery returns [EObject current=null] : iv_ruleTemperatureQuery= ruleTemperatureQuery EOF ;
    public final EObject entryRuleTemperatureQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemperatureQuery = null;


        try {
            // InternalRaspiRover.g:1662:57: (iv_ruleTemperatureQuery= ruleTemperatureQuery EOF )
            // InternalRaspiRover.g:1663:2: iv_ruleTemperatureQuery= ruleTemperatureQuery EOF
            {
             newCompositeNode(grammarAccess.getTemperatureQueryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTemperatureQuery=ruleTemperatureQuery();

            state._fsp--;

             current =iv_ruleTemperatureQuery; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTemperatureQuery"


    // $ANTLR start "ruleTemperatureQuery"
    // InternalRaspiRover.g:1669:1: ruleTemperatureQuery returns [EObject current=null] : ( () otherlv_1= 'query-temp' ) ;
    public final EObject ruleTemperatureQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRaspiRover.g:1675:2: ( ( () otherlv_1= 'query-temp' ) )
            // InternalRaspiRover.g:1676:2: ( () otherlv_1= 'query-temp' )
            {
            // InternalRaspiRover.g:1676:2: ( () otherlv_1= 'query-temp' )
            // InternalRaspiRover.g:1677:3: () otherlv_1= 'query-temp'
            {
            // InternalRaspiRover.g:1677:3: ()
            // InternalRaspiRover.g:1678:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTemperatureQueryAccess().getTemperatureQueryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getTemperatureQueryAccess().getQueryTempKeyword_1());
            		

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
    // $ANTLR end "ruleTemperatureQuery"


    // $ANTLR start "entryRuleHumidityQuery"
    // InternalRaspiRover.g:1692:1: entryRuleHumidityQuery returns [EObject current=null] : iv_ruleHumidityQuery= ruleHumidityQuery EOF ;
    public final EObject entryRuleHumidityQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHumidityQuery = null;


        try {
            // InternalRaspiRover.g:1692:54: (iv_ruleHumidityQuery= ruleHumidityQuery EOF )
            // InternalRaspiRover.g:1693:2: iv_ruleHumidityQuery= ruleHumidityQuery EOF
            {
             newCompositeNode(grammarAccess.getHumidityQueryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHumidityQuery=ruleHumidityQuery();

            state._fsp--;

             current =iv_ruleHumidityQuery; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleHumidityQuery"


    // $ANTLR start "ruleHumidityQuery"
    // InternalRaspiRover.g:1699:1: ruleHumidityQuery returns [EObject current=null] : ( () otherlv_1= 'query-humidity' ) ;
    public final EObject ruleHumidityQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRaspiRover.g:1705:2: ( ( () otherlv_1= 'query-humidity' ) )
            // InternalRaspiRover.g:1706:2: ( () otherlv_1= 'query-humidity' )
            {
            // InternalRaspiRover.g:1706:2: ( () otherlv_1= 'query-humidity' )
            // InternalRaspiRover.g:1707:3: () otherlv_1= 'query-humidity'
            {
            // InternalRaspiRover.g:1707:3: ()
            // InternalRaspiRover.g:1708:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHumidityQueryAccess().getHumidityQueryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getHumidityQueryAccess().getQueryHumidityKeyword_1());
            		

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
    // $ANTLR end "ruleHumidityQuery"


    // $ANTLR start "entryRuleMessageQuery"
    // InternalRaspiRover.g:1722:1: entryRuleMessageQuery returns [EObject current=null] : iv_ruleMessageQuery= ruleMessageQuery EOF ;
    public final EObject entryRuleMessageQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageQuery = null;


        try {
            // InternalRaspiRover.g:1722:53: (iv_ruleMessageQuery= ruleMessageQuery EOF )
            // InternalRaspiRover.g:1723:2: iv_ruleMessageQuery= ruleMessageQuery EOF
            {
             newCompositeNode(grammarAccess.getMessageQueryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessageQuery=ruleMessageQuery();

            state._fsp--;

             current =iv_ruleMessageQuery; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMessageQuery"


    // $ANTLR start "ruleMessageQuery"
    // InternalRaspiRover.g:1729:1: ruleMessageQuery returns [EObject current=null] : ( () otherlv_1= 'query-msg' ) ;
    public final EObject ruleMessageQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRaspiRover.g:1735:2: ( ( () otherlv_1= 'query-msg' ) )
            // InternalRaspiRover.g:1736:2: ( () otherlv_1= 'query-msg' )
            {
            // InternalRaspiRover.g:1736:2: ( () otherlv_1= 'query-msg' )
            // InternalRaspiRover.g:1737:3: () otherlv_1= 'query-msg'
            {
            // InternalRaspiRover.g:1737:3: ()
            // InternalRaspiRover.g:1738:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMessageQueryAccess().getMessageQueryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getMessageQueryAccess().getQueryMsgKeyword_1());
            		

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
    // $ANTLR end "ruleMessageQuery"


    // $ANTLR start "entryRuleObstacleQuery"
    // InternalRaspiRover.g:1752:1: entryRuleObstacleQuery returns [EObject current=null] : iv_ruleObstacleQuery= ruleObstacleQuery EOF ;
    public final EObject entryRuleObstacleQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObstacleQuery = null;


        try {
            // InternalRaspiRover.g:1752:54: (iv_ruleObstacleQuery= ruleObstacleQuery EOF )
            // InternalRaspiRover.g:1753:2: iv_ruleObstacleQuery= ruleObstacleQuery EOF
            {
             newCompositeNode(grammarAccess.getObstacleQueryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObstacleQuery=ruleObstacleQuery();

            state._fsp--;

             current =iv_ruleObstacleQuery; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleObstacleQuery"


    // $ANTLR start "ruleObstacleQuery"
    // InternalRaspiRover.g:1759:1: ruleObstacleQuery returns [EObject current=null] : ( () otherlv_1= 'query' ( (lv_front_2_0= 'front' ) )? otherlv_3= 'obstacle' ) ;
    public final EObject ruleObstacleQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_front_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRaspiRover.g:1765:2: ( ( () otherlv_1= 'query' ( (lv_front_2_0= 'front' ) )? otherlv_3= 'obstacle' ) )
            // InternalRaspiRover.g:1766:2: ( () otherlv_1= 'query' ( (lv_front_2_0= 'front' ) )? otherlv_3= 'obstacle' )
            {
            // InternalRaspiRover.g:1766:2: ( () otherlv_1= 'query' ( (lv_front_2_0= 'front' ) )? otherlv_3= 'obstacle' )
            // InternalRaspiRover.g:1767:3: () otherlv_1= 'query' ( (lv_front_2_0= 'front' ) )? otherlv_3= 'obstacle'
            {
            // InternalRaspiRover.g:1767:3: ()
            // InternalRaspiRover.g:1768:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getObstacleQueryAccess().getObstacleQueryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getObstacleQueryAccess().getQueryKeyword_1());
            		
            // InternalRaspiRover.g:1778:3: ( (lv_front_2_0= 'front' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==40) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRaspiRover.g:1779:4: (lv_front_2_0= 'front' )
                    {
                    // InternalRaspiRover.g:1779:4: (lv_front_2_0= 'front' )
                    // InternalRaspiRover.g:1780:5: lv_front_2_0= 'front'
                    {
                    lv_front_2_0=(Token)match(input,40,FOLLOW_23); 

                    					newLeafNode(lv_front_2_0, grammarAccess.getObstacleQueryAccess().getFrontFrontKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getObstacleQueryRule());
                    					}
                    					setWithLastConsumed(current, "front", true, "front");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,41,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getObstacleQueryAccess().getObstacleKeyword_3());
            		

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
    // $ANTLR end "ruleObstacleQuery"


    // $ANTLR start "entryRuleNumberValue_Impl"
    // InternalRaspiRover.g:1800:1: entryRuleNumberValue_Impl returns [EObject current=null] : iv_ruleNumberValue_Impl= ruleNumberValue_Impl EOF ;
    public final EObject entryRuleNumberValue_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberValue_Impl = null;


        try {
            // InternalRaspiRover.g:1800:57: (iv_ruleNumberValue_Impl= ruleNumberValue_Impl EOF )
            // InternalRaspiRover.g:1801:2: iv_ruleNumberValue_Impl= ruleNumberValue_Impl EOF
            {
             newCompositeNode(grammarAccess.getNumberValue_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberValue_Impl=ruleNumberValue_Impl();

            state._fsp--;

             current =iv_ruleNumberValue_Impl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNumberValue_Impl"


    // $ANTLR start "ruleNumberValue_Impl"
    // InternalRaspiRover.g:1807:1: ruleNumberValue_Impl returns [EObject current=null] : ( () ( (lv_quantity_1_0= ruleQuantity ) ) ) ;
    public final EObject ruleNumberValue_Impl() throws RecognitionException {
        EObject current = null;

        EObject lv_quantity_1_0 = null;



        	enterRule();

        try {
            // InternalRaspiRover.g:1813:2: ( ( () ( (lv_quantity_1_0= ruleQuantity ) ) ) )
            // InternalRaspiRover.g:1814:2: ( () ( (lv_quantity_1_0= ruleQuantity ) ) )
            {
            // InternalRaspiRover.g:1814:2: ( () ( (lv_quantity_1_0= ruleQuantity ) ) )
            // InternalRaspiRover.g:1815:3: () ( (lv_quantity_1_0= ruleQuantity ) )
            {
            // InternalRaspiRover.g:1815:3: ()
            // InternalRaspiRover.g:1816:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNumberValue_ImplAccess().getNumberValueAction_0(),
            					current);
            			

            }

            // InternalRaspiRover.g:1822:3: ( (lv_quantity_1_0= ruleQuantity ) )
            // InternalRaspiRover.g:1823:4: (lv_quantity_1_0= ruleQuantity )
            {
            // InternalRaspiRover.g:1823:4: (lv_quantity_1_0= ruleQuantity )
            // InternalRaspiRover.g:1824:5: lv_quantity_1_0= ruleQuantity
            {

            					newCompositeNode(grammarAccess.getNumberValue_ImplAccess().getQuantityQuantityParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_quantity_1_0=ruleQuantity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNumberValue_ImplRule());
            					}
            					set(
            						current,
            						"quantity",
            						lv_quantity_1_0,
            						"rover.raspirover.xtext.RaspiRover.Quantity");
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
    // $ANTLR end "ruleNumberValue_Impl"


    // $ANTLR start "entryRuleQuantity"
    // InternalRaspiRover.g:1845:1: entryRuleQuantity returns [EObject current=null] : iv_ruleQuantity= ruleQuantity EOF ;
    public final EObject entryRuleQuantity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantity = null;


        try {
            // InternalRaspiRover.g:1845:49: (iv_ruleQuantity= ruleQuantity EOF )
            // InternalRaspiRover.g:1846:2: iv_ruleQuantity= ruleQuantity EOF
            {
             newCompositeNode(grammarAccess.getQuantityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuantity=ruleQuantity();

            state._fsp--;

             current =iv_ruleQuantity; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQuantity"


    // $ANTLR start "ruleQuantity"
    // InternalRaspiRover.g:1852:1: ruleQuantity returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_DOUBLE ) ) ( (lv_unit_2_0= ruleUnit ) ) ) ;
    public final EObject ruleQuantity() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        EObject lv_unit_2_0 = null;



        	enterRule();

        try {
            // InternalRaspiRover.g:1858:2: ( ( () ( (lv_value_1_0= RULE_DOUBLE ) ) ( (lv_unit_2_0= ruleUnit ) ) ) )
            // InternalRaspiRover.g:1859:2: ( () ( (lv_value_1_0= RULE_DOUBLE ) ) ( (lv_unit_2_0= ruleUnit ) ) )
            {
            // InternalRaspiRover.g:1859:2: ( () ( (lv_value_1_0= RULE_DOUBLE ) ) ( (lv_unit_2_0= ruleUnit ) ) )
            // InternalRaspiRover.g:1860:3: () ( (lv_value_1_0= RULE_DOUBLE ) ) ( (lv_unit_2_0= ruleUnit ) )
            {
            // InternalRaspiRover.g:1860:3: ()
            // InternalRaspiRover.g:1861:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getQuantityAccess().getQuantityAction_0(),
            					current);
            			

            }

            // InternalRaspiRover.g:1867:3: ( (lv_value_1_0= RULE_DOUBLE ) )
            // InternalRaspiRover.g:1868:4: (lv_value_1_0= RULE_DOUBLE )
            {
            // InternalRaspiRover.g:1868:4: (lv_value_1_0= RULE_DOUBLE )
            // InternalRaspiRover.g:1869:5: lv_value_1_0= RULE_DOUBLE
            {
            lv_value_1_0=(Token)match(input,RULE_DOUBLE,FOLLOW_24); 

            					newLeafNode(lv_value_1_0, grammarAccess.getQuantityAccess().getValueDOUBLETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQuantityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"rover.raspirover.xtext.RaspiRover.DOUBLE");
            				

            }


            }

            // InternalRaspiRover.g:1885:3: ( (lv_unit_2_0= ruleUnit ) )
            // InternalRaspiRover.g:1886:4: (lv_unit_2_0= ruleUnit )
            {
            // InternalRaspiRover.g:1886:4: (lv_unit_2_0= ruleUnit )
            // InternalRaspiRover.g:1887:5: lv_unit_2_0= ruleUnit
            {

            					newCompositeNode(grammarAccess.getQuantityAccess().getUnitUnitParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_unit_2_0=ruleUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQuantityRule());
            					}
            					set(
            						current,
            						"unit",
            						lv_unit_2_0,
            						"rover.raspirover.xtext.RaspiRover.Unit");
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
    // $ANTLR end "ruleQuantity"


    // $ANTLR start "entryRuleStringValue_Impl"
    // InternalRaspiRover.g:1908:1: entryRuleStringValue_Impl returns [EObject current=null] : iv_ruleStringValue_Impl= ruleStringValue_Impl EOF ;
    public final EObject entryRuleStringValue_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue_Impl = null;


        try {
            // InternalRaspiRover.g:1908:57: (iv_ruleStringValue_Impl= ruleStringValue_Impl EOF )
            // InternalRaspiRover.g:1909:2: iv_ruleStringValue_Impl= ruleStringValue_Impl EOF
            {
             newCompositeNode(grammarAccess.getStringValue_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringValue_Impl=ruleStringValue_Impl();

            state._fsp--;

             current =iv_ruleStringValue_Impl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStringValue_Impl"


    // $ANTLR start "ruleStringValue_Impl"
    // InternalRaspiRover.g:1915:1: ruleStringValue_Impl returns [EObject current=null] : ( () ( (lv_sValue_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringValue_Impl() throws RecognitionException {
        EObject current = null;

        Token lv_sValue_1_0=null;


        	enterRule();

        try {
            // InternalRaspiRover.g:1921:2: ( ( () ( (lv_sValue_1_0= RULE_STRING ) ) ) )
            // InternalRaspiRover.g:1922:2: ( () ( (lv_sValue_1_0= RULE_STRING ) ) )
            {
            // InternalRaspiRover.g:1922:2: ( () ( (lv_sValue_1_0= RULE_STRING ) ) )
            // InternalRaspiRover.g:1923:3: () ( (lv_sValue_1_0= RULE_STRING ) )
            {
            // InternalRaspiRover.g:1923:3: ()
            // InternalRaspiRover.g:1924:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringValue_ImplAccess().getStringValueAction_0(),
            					current);
            			

            }

            // InternalRaspiRover.g:1930:3: ( (lv_sValue_1_0= RULE_STRING ) )
            // InternalRaspiRover.g:1931:4: (lv_sValue_1_0= RULE_STRING )
            {
            // InternalRaspiRover.g:1931:4: (lv_sValue_1_0= RULE_STRING )
            // InternalRaspiRover.g:1932:5: lv_sValue_1_0= RULE_STRING
            {
            lv_sValue_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_sValue_1_0, grammarAccess.getStringValue_ImplAccess().getSValueSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStringValue_ImplRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sValue",
            						lv_sValue_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleStringValue_Impl"


    // $ANTLR start "entryRuleBooleanValue_Impl"
    // InternalRaspiRover.g:1952:1: entryRuleBooleanValue_Impl returns [EObject current=null] : iv_ruleBooleanValue_Impl= ruleBooleanValue_Impl EOF ;
    public final EObject entryRuleBooleanValue_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue_Impl = null;


        try {
            // InternalRaspiRover.g:1952:58: (iv_ruleBooleanValue_Impl= ruleBooleanValue_Impl EOF )
            // InternalRaspiRover.g:1953:2: iv_ruleBooleanValue_Impl= ruleBooleanValue_Impl EOF
            {
             newCompositeNode(grammarAccess.getBooleanValue_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanValue_Impl=ruleBooleanValue_Impl();

            state._fsp--;

             current =iv_ruleBooleanValue_Impl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBooleanValue_Impl"


    // $ANTLR start "ruleBooleanValue_Impl"
    // InternalRaspiRover.g:1959:1: ruleBooleanValue_Impl returns [EObject current=null] : ( () ( (lv_bValue_1_0= 'true' ) ) ) ;
    public final EObject ruleBooleanValue_Impl() throws RecognitionException {
        EObject current = null;

        Token lv_bValue_1_0=null;


        	enterRule();

        try {
            // InternalRaspiRover.g:1965:2: ( ( () ( (lv_bValue_1_0= 'true' ) ) ) )
            // InternalRaspiRover.g:1966:2: ( () ( (lv_bValue_1_0= 'true' ) ) )
            {
            // InternalRaspiRover.g:1966:2: ( () ( (lv_bValue_1_0= 'true' ) ) )
            // InternalRaspiRover.g:1967:3: () ( (lv_bValue_1_0= 'true' ) )
            {
            // InternalRaspiRover.g:1967:3: ()
            // InternalRaspiRover.g:1968:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanValue_ImplAccess().getBooleanValueAction_0(),
            					current);
            			

            }

            // InternalRaspiRover.g:1974:3: ( (lv_bValue_1_0= 'true' ) )
            // InternalRaspiRover.g:1975:4: (lv_bValue_1_0= 'true' )
            {
            // InternalRaspiRover.g:1975:4: (lv_bValue_1_0= 'true' )
            // InternalRaspiRover.g:1976:5: lv_bValue_1_0= 'true'
            {
            lv_bValue_1_0=(Token)match(input,42,FOLLOW_2); 

            					newLeafNode(lv_bValue_1_0, grammarAccess.getBooleanValue_ImplAccess().getBValueTrueKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBooleanValue_ImplRule());
            					}
            					setWithLastConsumed(current, "bValue", true, "true");
            				

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
    // $ANTLR end "ruleBooleanValue_Impl"


    // $ANTLR start "entryRuleCentimeter"
    // InternalRaspiRover.g:1992:1: entryRuleCentimeter returns [EObject current=null] : iv_ruleCentimeter= ruleCentimeter EOF ;
    public final EObject entryRuleCentimeter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCentimeter = null;


        try {
            // InternalRaspiRover.g:1992:51: (iv_ruleCentimeter= ruleCentimeter EOF )
            // InternalRaspiRover.g:1993:2: iv_ruleCentimeter= ruleCentimeter EOF
            {
             newCompositeNode(grammarAccess.getCentimeterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCentimeter=ruleCentimeter();

            state._fsp--;

             current =iv_ruleCentimeter; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCentimeter"


    // $ANTLR start "ruleCentimeter"
    // InternalRaspiRover.g:1999:1: ruleCentimeter returns [EObject current=null] : ( () otherlv_1= 'cm' ) ;
    public final EObject ruleCentimeter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRaspiRover.g:2005:2: ( ( () otherlv_1= 'cm' ) )
            // InternalRaspiRover.g:2006:2: ( () otherlv_1= 'cm' )
            {
            // InternalRaspiRover.g:2006:2: ( () otherlv_1= 'cm' )
            // InternalRaspiRover.g:2007:3: () otherlv_1= 'cm'
            {
            // InternalRaspiRover.g:2007:3: ()
            // InternalRaspiRover.g:2008:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCentimeterAccess().getCentimeterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getCentimeterAccess().getCmKeyword_1());
            		

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
    // $ANTLR end "ruleCentimeter"


    // $ANTLR start "entryRuleMillimeter"
    // InternalRaspiRover.g:2022:1: entryRuleMillimeter returns [EObject current=null] : iv_ruleMillimeter= ruleMillimeter EOF ;
    public final EObject entryRuleMillimeter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMillimeter = null;


        try {
            // InternalRaspiRover.g:2022:51: (iv_ruleMillimeter= ruleMillimeter EOF )
            // InternalRaspiRover.g:2023:2: iv_ruleMillimeter= ruleMillimeter EOF
            {
             newCompositeNode(grammarAccess.getMillimeterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMillimeter=ruleMillimeter();

            state._fsp--;

             current =iv_ruleMillimeter; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMillimeter"


    // $ANTLR start "ruleMillimeter"
    // InternalRaspiRover.g:2029:1: ruleMillimeter returns [EObject current=null] : ( () otherlv_1= 'mm' ) ;
    public final EObject ruleMillimeter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRaspiRover.g:2035:2: ( ( () otherlv_1= 'mm' ) )
            // InternalRaspiRover.g:2036:2: ( () otherlv_1= 'mm' )
            {
            // InternalRaspiRover.g:2036:2: ( () otherlv_1= 'mm' )
            // InternalRaspiRover.g:2037:3: () otherlv_1= 'mm'
            {
            // InternalRaspiRover.g:2037:3: ()
            // InternalRaspiRover.g:2038:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMillimeterAccess().getMillimeterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getMillimeterAccess().getMmKeyword_1());
            		

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
    // $ANTLR end "ruleMillimeter"


    // $ANTLR start "entryRuleMeter"
    // InternalRaspiRover.g:2052:1: entryRuleMeter returns [EObject current=null] : iv_ruleMeter= ruleMeter EOF ;
    public final EObject entryRuleMeter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeter = null;


        try {
            // InternalRaspiRover.g:2052:46: (iv_ruleMeter= ruleMeter EOF )
            // InternalRaspiRover.g:2053:2: iv_ruleMeter= ruleMeter EOF
            {
             newCompositeNode(grammarAccess.getMeterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeter=ruleMeter();

            state._fsp--;

             current =iv_ruleMeter; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMeter"


    // $ANTLR start "ruleMeter"
    // InternalRaspiRover.g:2059:1: ruleMeter returns [EObject current=null] : ( () otherlv_1= 'm' ) ;
    public final EObject ruleMeter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRaspiRover.g:2065:2: ( ( () otherlv_1= 'm' ) )
            // InternalRaspiRover.g:2066:2: ( () otherlv_1= 'm' )
            {
            // InternalRaspiRover.g:2066:2: ( () otherlv_1= 'm' )
            // InternalRaspiRover.g:2067:3: () otherlv_1= 'm'
            {
            // InternalRaspiRover.g:2067:3: ()
            // InternalRaspiRover.g:2068:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeterAccess().getMeterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,45,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getMeterAccess().getMKeyword_1());
            		

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
    // $ANTLR end "ruleMeter"


    // $ANTLR start "entryRuleFoot"
    // InternalRaspiRover.g:2082:1: entryRuleFoot returns [EObject current=null] : iv_ruleFoot= ruleFoot EOF ;
    public final EObject entryRuleFoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFoot = null;


        try {
            // InternalRaspiRover.g:2082:45: (iv_ruleFoot= ruleFoot EOF )
            // InternalRaspiRover.g:2083:2: iv_ruleFoot= ruleFoot EOF
            {
             newCompositeNode(grammarAccess.getFootRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFoot=ruleFoot();

            state._fsp--;

             current =iv_ruleFoot; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFoot"


    // $ANTLR start "ruleFoot"
    // InternalRaspiRover.g:2089:1: ruleFoot returns [EObject current=null] : ( () otherlv_1= 'ft' ) ;
    public final EObject ruleFoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRaspiRover.g:2095:2: ( ( () otherlv_1= 'ft' ) )
            // InternalRaspiRover.g:2096:2: ( () otherlv_1= 'ft' )
            {
            // InternalRaspiRover.g:2096:2: ( () otherlv_1= 'ft' )
            // InternalRaspiRover.g:2097:3: () otherlv_1= 'ft'
            {
            // InternalRaspiRover.g:2097:3: ()
            // InternalRaspiRover.g:2098:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFootAccess().getFootAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getFootAccess().getFtKeyword_1());
            		

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
    // $ANTLR end "ruleFoot"


    // $ANTLR start "entryRuleInch"
    // InternalRaspiRover.g:2112:1: entryRuleInch returns [EObject current=null] : iv_ruleInch= ruleInch EOF ;
    public final EObject entryRuleInch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInch = null;


        try {
            // InternalRaspiRover.g:2112:45: (iv_ruleInch= ruleInch EOF )
            // InternalRaspiRover.g:2113:2: iv_ruleInch= ruleInch EOF
            {
             newCompositeNode(grammarAccess.getInchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInch=ruleInch();

            state._fsp--;

             current =iv_ruleInch; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInch"


    // $ANTLR start "ruleInch"
    // InternalRaspiRover.g:2119:1: ruleInch returns [EObject current=null] : ( () otherlv_1= 'in' ) ;
    public final EObject ruleInch() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRaspiRover.g:2125:2: ( ( () otherlv_1= 'in' ) )
            // InternalRaspiRover.g:2126:2: ( () otherlv_1= 'in' )
            {
            // InternalRaspiRover.g:2126:2: ( () otherlv_1= 'in' )
            // InternalRaspiRover.g:2127:3: () otherlv_1= 'in'
            {
            // InternalRaspiRover.g:2127:3: ()
            // InternalRaspiRover.g:2128:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInchAccess().getInchAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getInchAccess().getInKeyword_1());
            		

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
    // $ANTLR end "ruleInch"


    // $ANTLR start "entryRuleYard"
    // InternalRaspiRover.g:2142:1: entryRuleYard returns [EObject current=null] : iv_ruleYard= ruleYard EOF ;
    public final EObject entryRuleYard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYard = null;


        try {
            // InternalRaspiRover.g:2142:45: (iv_ruleYard= ruleYard EOF )
            // InternalRaspiRover.g:2143:2: iv_ruleYard= ruleYard EOF
            {
             newCompositeNode(grammarAccess.getYardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleYard=ruleYard();

            state._fsp--;

             current =iv_ruleYard; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleYard"


    // $ANTLR start "ruleYard"
    // InternalRaspiRover.g:2149:1: ruleYard returns [EObject current=null] : ( () otherlv_1= 'yd' ) ;
    public final EObject ruleYard() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRaspiRover.g:2155:2: ( ( () otherlv_1= 'yd' ) )
            // InternalRaspiRover.g:2156:2: ( () otherlv_1= 'yd' )
            {
            // InternalRaspiRover.g:2156:2: ( () otherlv_1= 'yd' )
            // InternalRaspiRover.g:2157:3: () otherlv_1= 'yd'
            {
            // InternalRaspiRover.g:2157:3: ()
            // InternalRaspiRover.g:2158:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getYardAccess().getYardAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getYardAccess().getYdKeyword_1());
            		

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
    // $ANTLR end "ruleYard"


    // $ANTLR start "entryRuleRadian"
    // InternalRaspiRover.g:2172:1: entryRuleRadian returns [EObject current=null] : iv_ruleRadian= ruleRadian EOF ;
    public final EObject entryRuleRadian() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRadian = null;


        try {
            // InternalRaspiRover.g:2172:47: (iv_ruleRadian= ruleRadian EOF )
            // InternalRaspiRover.g:2173:2: iv_ruleRadian= ruleRadian EOF
            {
             newCompositeNode(grammarAccess.getRadianRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRadian=ruleRadian();

            state._fsp--;

             current =iv_ruleRadian; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRadian"


    // $ANTLR start "ruleRadian"
    // InternalRaspiRover.g:2179:1: ruleRadian returns [EObject current=null] : ( () otherlv_1= 'rad' ) ;
    public final EObject ruleRadian() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRaspiRover.g:2185:2: ( ( () otherlv_1= 'rad' ) )
            // InternalRaspiRover.g:2186:2: ( () otherlv_1= 'rad' )
            {
            // InternalRaspiRover.g:2186:2: ( () otherlv_1= 'rad' )
            // InternalRaspiRover.g:2187:3: () otherlv_1= 'rad'
            {
            // InternalRaspiRover.g:2187:3: ()
            // InternalRaspiRover.g:2188:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRadianAccess().getRadianAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,49,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getRadianAccess().getRadKeyword_1());
            		

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
    // $ANTLR end "ruleRadian"


    // $ANTLR start "entryRuleDegree"
    // InternalRaspiRover.g:2202:1: entryRuleDegree returns [EObject current=null] : iv_ruleDegree= ruleDegree EOF ;
    public final EObject entryRuleDegree() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDegree = null;


        try {
            // InternalRaspiRover.g:2202:47: (iv_ruleDegree= ruleDegree EOF )
            // InternalRaspiRover.g:2203:2: iv_ruleDegree= ruleDegree EOF
            {
             newCompositeNode(grammarAccess.getDegreeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDegree=ruleDegree();

            state._fsp--;

             current =iv_ruleDegree; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDegree"


    // $ANTLR start "ruleDegree"
    // InternalRaspiRover.g:2209:1: ruleDegree returns [EObject current=null] : ( () otherlv_1= 'deg' ) ;
    public final EObject ruleDegree() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRaspiRover.g:2215:2: ( ( () otherlv_1= 'deg' ) )
            // InternalRaspiRover.g:2216:2: ( () otherlv_1= 'deg' )
            {
            // InternalRaspiRover.g:2216:2: ( () otherlv_1= 'deg' )
            // InternalRaspiRover.g:2217:3: () otherlv_1= 'deg'
            {
            // InternalRaspiRover.g:2217:3: ()
            // InternalRaspiRover.g:2218:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDegreeAccess().getDegreeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,50,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getDegreeAccess().getDegKeyword_1());
            		

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
    // $ANTLR end "ruleDegree"


    // $ANTLR start "entryRuleTurn"
    // InternalRaspiRover.g:2232:1: entryRuleTurn returns [EObject current=null] : iv_ruleTurn= ruleTurn EOF ;
    public final EObject entryRuleTurn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurn = null;


        try {
            // InternalRaspiRover.g:2232:45: (iv_ruleTurn= ruleTurn EOF )
            // InternalRaspiRover.g:2233:2: iv_ruleTurn= ruleTurn EOF
            {
             newCompositeNode(grammarAccess.getTurnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTurn=ruleTurn();

            state._fsp--;

             current =iv_ruleTurn; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTurn"


    // $ANTLR start "ruleTurn"
    // InternalRaspiRover.g:2239:1: ruleTurn returns [EObject current=null] : ( () otherlv_1= 'turn' ) ;
    public final EObject ruleTurn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRaspiRover.g:2245:2: ( ( () otherlv_1= 'turn' ) )
            // InternalRaspiRover.g:2246:2: ( () otherlv_1= 'turn' )
            {
            // InternalRaspiRover.g:2246:2: ( () otherlv_1= 'turn' )
            // InternalRaspiRover.g:2247:3: () otherlv_1= 'turn'
            {
            // InternalRaspiRover.g:2247:3: ()
            // InternalRaspiRover.g:2248:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTurnAccess().getTurnAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getTurnAccess().getTurnKeyword_1());
            		

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
    // $ANTLR end "ruleTurn"


    // $ANTLR start "entryRuleGradian"
    // InternalRaspiRover.g:2262:1: entryRuleGradian returns [EObject current=null] : iv_ruleGradian= ruleGradian EOF ;
    public final EObject entryRuleGradian() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGradian = null;


        try {
            // InternalRaspiRover.g:2262:48: (iv_ruleGradian= ruleGradian EOF )
            // InternalRaspiRover.g:2263:2: iv_ruleGradian= ruleGradian EOF
            {
             newCompositeNode(grammarAccess.getGradianRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGradian=ruleGradian();

            state._fsp--;

             current =iv_ruleGradian; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGradian"


    // $ANTLR start "ruleGradian"
    // InternalRaspiRover.g:2269:1: ruleGradian returns [EObject current=null] : ( () otherlv_1= 'grad' ) ;
    public final EObject ruleGradian() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRaspiRover.g:2275:2: ( ( () otherlv_1= 'grad' ) )
            // InternalRaspiRover.g:2276:2: ( () otherlv_1= 'grad' )
            {
            // InternalRaspiRover.g:2276:2: ( () otherlv_1= 'grad' )
            // InternalRaspiRover.g:2277:3: () otherlv_1= 'grad'
            {
            // InternalRaspiRover.g:2277:3: ()
            // InternalRaspiRover.g:2278:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGradianAccess().getGradianAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,51,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getGradianAccess().getGradKeyword_1());
            		

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
    // $ANTLR end "ruleGradian"


    // $ANTLR start "entryRuleNumericExpression"
    // InternalRaspiRover.g:2292:1: entryRuleNumericExpression returns [EObject current=null] : iv_ruleNumericExpression= ruleNumericExpression EOF ;
    public final EObject entryRuleNumericExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericExpression = null;


        try {
            // InternalRaspiRover.g:2292:58: (iv_ruleNumericExpression= ruleNumericExpression EOF )
            // InternalRaspiRover.g:2293:2: iv_ruleNumericExpression= ruleNumericExpression EOF
            {
             newCompositeNode(grammarAccess.getNumericExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumericExpression=ruleNumericExpression();

            state._fsp--;

             current =iv_ruleNumericExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNumericExpression"


    // $ANTLR start "ruleNumericExpression"
    // InternalRaspiRover.g:2299:1: ruleNumericExpression returns [EObject current=null] : ( () ( (lv_lhs_1_0= ruleNumberValue ) ) ( (lv_op_2_0= ruleNumericOperator ) ) ( (lv_rhs_3_0= ruleNumberValue ) ) ) ;
    public final EObject ruleNumericExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_lhs_1_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_rhs_3_0 = null;



        	enterRule();

        try {
            // InternalRaspiRover.g:2305:2: ( ( () ( (lv_lhs_1_0= ruleNumberValue ) ) ( (lv_op_2_0= ruleNumericOperator ) ) ( (lv_rhs_3_0= ruleNumberValue ) ) ) )
            // InternalRaspiRover.g:2306:2: ( () ( (lv_lhs_1_0= ruleNumberValue ) ) ( (lv_op_2_0= ruleNumericOperator ) ) ( (lv_rhs_3_0= ruleNumberValue ) ) )
            {
            // InternalRaspiRover.g:2306:2: ( () ( (lv_lhs_1_0= ruleNumberValue ) ) ( (lv_op_2_0= ruleNumericOperator ) ) ( (lv_rhs_3_0= ruleNumberValue ) ) )
            // InternalRaspiRover.g:2307:3: () ( (lv_lhs_1_0= ruleNumberValue ) ) ( (lv_op_2_0= ruleNumericOperator ) ) ( (lv_rhs_3_0= ruleNumberValue ) )
            {
            // InternalRaspiRover.g:2307:3: ()
            // InternalRaspiRover.g:2308:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNumericExpressionAccess().getNumericExpressionAction_0(),
            					current);
            			

            }

            // InternalRaspiRover.g:2314:3: ( (lv_lhs_1_0= ruleNumberValue ) )
            // InternalRaspiRover.g:2315:4: (lv_lhs_1_0= ruleNumberValue )
            {
            // InternalRaspiRover.g:2315:4: (lv_lhs_1_0= ruleNumberValue )
            // InternalRaspiRover.g:2316:5: lv_lhs_1_0= ruleNumberValue
            {

            					newCompositeNode(grammarAccess.getNumericExpressionAccess().getLhsNumberValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_25);
            lv_lhs_1_0=ruleNumberValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNumericExpressionRule());
            					}
            					set(
            						current,
            						"lhs",
            						lv_lhs_1_0,
            						"rover.raspirover.xtext.RaspiRover.NumberValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRaspiRover.g:2333:3: ( (lv_op_2_0= ruleNumericOperator ) )
            // InternalRaspiRover.g:2334:4: (lv_op_2_0= ruleNumericOperator )
            {
            // InternalRaspiRover.g:2334:4: (lv_op_2_0= ruleNumericOperator )
            // InternalRaspiRover.g:2335:5: lv_op_2_0= ruleNumericOperator
            {

            					newCompositeNode(grammarAccess.getNumericExpressionAccess().getOpNumericOperatorEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
            lv_op_2_0=ruleNumericOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNumericExpressionRule());
            					}
            					set(
            						current,
            						"op",
            						lv_op_2_0,
            						"rover.raspirover.xtext.RaspiRover.NumericOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRaspiRover.g:2352:3: ( (lv_rhs_3_0= ruleNumberValue ) )
            // InternalRaspiRover.g:2353:4: (lv_rhs_3_0= ruleNumberValue )
            {
            // InternalRaspiRover.g:2353:4: (lv_rhs_3_0= ruleNumberValue )
            // InternalRaspiRover.g:2354:5: lv_rhs_3_0= ruleNumberValue
            {

            					newCompositeNode(grammarAccess.getNumericExpressionAccess().getRhsNumberValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_rhs_3_0=ruleNumberValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNumericExpressionRule());
            					}
            					set(
            						current,
            						"rhs",
            						lv_rhs_3_0,
            						"rover.raspirover.xtext.RaspiRover.NumberValue");
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
    // $ANTLR end "ruleNumericExpression"


    // $ANTLR start "entryRuleStringExpression"
    // InternalRaspiRover.g:2375:1: entryRuleStringExpression returns [EObject current=null] : iv_ruleStringExpression= ruleStringExpression EOF ;
    public final EObject entryRuleStringExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringExpression = null;


        try {
            // InternalRaspiRover.g:2375:57: (iv_ruleStringExpression= ruleStringExpression EOF )
            // InternalRaspiRover.g:2376:2: iv_ruleStringExpression= ruleStringExpression EOF
            {
             newCompositeNode(grammarAccess.getStringExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringExpression=ruleStringExpression();

            state._fsp--;

             current =iv_ruleStringExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStringExpression"


    // $ANTLR start "ruleStringExpression"
    // InternalRaspiRover.g:2382:1: ruleStringExpression returns [EObject current=null] : ( () ( (lv_lhs_1_0= ruleStringValue ) ) ( (lv_op_2_0= ruleStringOperator ) ) ( (lv_rhs_3_0= ruleStringValue ) ) ) ;
    public final EObject ruleStringExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_lhs_1_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_rhs_3_0 = null;



        	enterRule();

        try {
            // InternalRaspiRover.g:2388:2: ( ( () ( (lv_lhs_1_0= ruleStringValue ) ) ( (lv_op_2_0= ruleStringOperator ) ) ( (lv_rhs_3_0= ruleStringValue ) ) ) )
            // InternalRaspiRover.g:2389:2: ( () ( (lv_lhs_1_0= ruleStringValue ) ) ( (lv_op_2_0= ruleStringOperator ) ) ( (lv_rhs_3_0= ruleStringValue ) ) )
            {
            // InternalRaspiRover.g:2389:2: ( () ( (lv_lhs_1_0= ruleStringValue ) ) ( (lv_op_2_0= ruleStringOperator ) ) ( (lv_rhs_3_0= ruleStringValue ) ) )
            // InternalRaspiRover.g:2390:3: () ( (lv_lhs_1_0= ruleStringValue ) ) ( (lv_op_2_0= ruleStringOperator ) ) ( (lv_rhs_3_0= ruleStringValue ) )
            {
            // InternalRaspiRover.g:2390:3: ()
            // InternalRaspiRover.g:2391:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringExpressionAccess().getStringExpressionAction_0(),
            					current);
            			

            }

            // InternalRaspiRover.g:2397:3: ( (lv_lhs_1_0= ruleStringValue ) )
            // InternalRaspiRover.g:2398:4: (lv_lhs_1_0= ruleStringValue )
            {
            // InternalRaspiRover.g:2398:4: (lv_lhs_1_0= ruleStringValue )
            // InternalRaspiRover.g:2399:5: lv_lhs_1_0= ruleStringValue
            {

            					newCompositeNode(grammarAccess.getStringExpressionAccess().getLhsStringValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_26);
            lv_lhs_1_0=ruleStringValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStringExpressionRule());
            					}
            					set(
            						current,
            						"lhs",
            						lv_lhs_1_0,
            						"rover.raspirover.xtext.RaspiRover.StringValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRaspiRover.g:2416:3: ( (lv_op_2_0= ruleStringOperator ) )
            // InternalRaspiRover.g:2417:4: (lv_op_2_0= ruleStringOperator )
            {
            // InternalRaspiRover.g:2417:4: (lv_op_2_0= ruleStringOperator )
            // InternalRaspiRover.g:2418:5: lv_op_2_0= ruleStringOperator
            {

            					newCompositeNode(grammarAccess.getStringExpressionAccess().getOpStringOperatorEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_27);
            lv_op_2_0=ruleStringOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStringExpressionRule());
            					}
            					set(
            						current,
            						"op",
            						lv_op_2_0,
            						"rover.raspirover.xtext.RaspiRover.StringOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRaspiRover.g:2435:3: ( (lv_rhs_3_0= ruleStringValue ) )
            // InternalRaspiRover.g:2436:4: (lv_rhs_3_0= ruleStringValue )
            {
            // InternalRaspiRover.g:2436:4: (lv_rhs_3_0= ruleStringValue )
            // InternalRaspiRover.g:2437:5: lv_rhs_3_0= ruleStringValue
            {

            					newCompositeNode(grammarAccess.getStringExpressionAccess().getRhsStringValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_rhs_3_0=ruleStringValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStringExpressionRule());
            					}
            					set(
            						current,
            						"rhs",
            						lv_rhs_3_0,
            						"rover.raspirover.xtext.RaspiRover.StringValue");
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
    // $ANTLR end "ruleStringExpression"


    // $ANTLR start "entryRuleBooleanExpression"
    // InternalRaspiRover.g:2458:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // InternalRaspiRover.g:2458:58: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // InternalRaspiRover.g:2459:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
            {
             newCompositeNode(grammarAccess.getBooleanExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanExpression=ruleBooleanExpression();

            state._fsp--;

             current =iv_ruleBooleanExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBooleanExpression"


    // $ANTLR start "ruleBooleanExpression"
    // InternalRaspiRover.g:2465:1: ruleBooleanExpression returns [EObject current=null] : ( () ( (lv_lhs_1_0= ruleBooleanValue ) ) ( (lv_op_2_0= ruleBooleanOperator ) ) ( (lv_rhs_3_0= ruleBooleanValue ) ) ) ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_lhs_1_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_rhs_3_0 = null;



        	enterRule();

        try {
            // InternalRaspiRover.g:2471:2: ( ( () ( (lv_lhs_1_0= ruleBooleanValue ) ) ( (lv_op_2_0= ruleBooleanOperator ) ) ( (lv_rhs_3_0= ruleBooleanValue ) ) ) )
            // InternalRaspiRover.g:2472:2: ( () ( (lv_lhs_1_0= ruleBooleanValue ) ) ( (lv_op_2_0= ruleBooleanOperator ) ) ( (lv_rhs_3_0= ruleBooleanValue ) ) )
            {
            // InternalRaspiRover.g:2472:2: ( () ( (lv_lhs_1_0= ruleBooleanValue ) ) ( (lv_op_2_0= ruleBooleanOperator ) ) ( (lv_rhs_3_0= ruleBooleanValue ) ) )
            // InternalRaspiRover.g:2473:3: () ( (lv_lhs_1_0= ruleBooleanValue ) ) ( (lv_op_2_0= ruleBooleanOperator ) ) ( (lv_rhs_3_0= ruleBooleanValue ) )
            {
            // InternalRaspiRover.g:2473:3: ()
            // InternalRaspiRover.g:2474:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanExpressionAccess().getBooleanExpressionAction_0(),
            					current);
            			

            }

            // InternalRaspiRover.g:2480:3: ( (lv_lhs_1_0= ruleBooleanValue ) )
            // InternalRaspiRover.g:2481:4: (lv_lhs_1_0= ruleBooleanValue )
            {
            // InternalRaspiRover.g:2481:4: (lv_lhs_1_0= ruleBooleanValue )
            // InternalRaspiRover.g:2482:5: lv_lhs_1_0= ruleBooleanValue
            {

            					newCompositeNode(grammarAccess.getBooleanExpressionAccess().getLhsBooleanValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_26);
            lv_lhs_1_0=ruleBooleanValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBooleanExpressionRule());
            					}
            					set(
            						current,
            						"lhs",
            						lv_lhs_1_0,
            						"rover.raspirover.xtext.RaspiRover.BooleanValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRaspiRover.g:2499:3: ( (lv_op_2_0= ruleBooleanOperator ) )
            // InternalRaspiRover.g:2500:4: (lv_op_2_0= ruleBooleanOperator )
            {
            // InternalRaspiRover.g:2500:4: (lv_op_2_0= ruleBooleanOperator )
            // InternalRaspiRover.g:2501:5: lv_op_2_0= ruleBooleanOperator
            {

            					newCompositeNode(grammarAccess.getBooleanExpressionAccess().getOpBooleanOperatorEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
            lv_op_2_0=ruleBooleanOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBooleanExpressionRule());
            					}
            					set(
            						current,
            						"op",
            						lv_op_2_0,
            						"rover.raspirover.xtext.RaspiRover.BooleanOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRaspiRover.g:2518:3: ( (lv_rhs_3_0= ruleBooleanValue ) )
            // InternalRaspiRover.g:2519:4: (lv_rhs_3_0= ruleBooleanValue )
            {
            // InternalRaspiRover.g:2519:4: (lv_rhs_3_0= ruleBooleanValue )
            // InternalRaspiRover.g:2520:5: lv_rhs_3_0= ruleBooleanValue
            {

            					newCompositeNode(grammarAccess.getBooleanExpressionAccess().getRhsBooleanValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_rhs_3_0=ruleBooleanValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBooleanExpressionRule());
            					}
            					set(
            						current,
            						"rhs",
            						lv_rhs_3_0,
            						"rover.raspirover.xtext.RaspiRover.BooleanValue");
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
    // $ANTLR end "ruleBooleanExpression"


    // $ANTLR start "entryRulePin_Impl"
    // InternalRaspiRover.g:2541:1: entryRulePin_Impl returns [EObject current=null] : iv_rulePin_Impl= rulePin_Impl EOF ;
    public final EObject entryRulePin_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePin_Impl = null;


        try {
            // InternalRaspiRover.g:2541:49: (iv_rulePin_Impl= rulePin_Impl EOF )
            // InternalRaspiRover.g:2542:2: iv_rulePin_Impl= rulePin_Impl EOF
            {
             newCompositeNode(grammarAccess.getPin_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePin_Impl=rulePin_Impl();

            state._fsp--;

             current =iv_rulePin_Impl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePin_Impl"


    // $ANTLR start "rulePin_Impl"
    // InternalRaspiRover.g:2548:1: rulePin_Impl returns [EObject current=null] : (otherlv_0= 'pin' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_level_3_0= RULE_INT ) ) otherlv_4= ']' )? ) ;
    public final EObject rulePin_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_level_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalRaspiRover.g:2554:2: ( (otherlv_0= 'pin' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_level_3_0= RULE_INT ) ) otherlv_4= ']' )? ) )
            // InternalRaspiRover.g:2555:2: (otherlv_0= 'pin' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_level_3_0= RULE_INT ) ) otherlv_4= ']' )? )
            {
            // InternalRaspiRover.g:2555:2: (otherlv_0= 'pin' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_level_3_0= RULE_INT ) ) otherlv_4= ']' )? )
            // InternalRaspiRover.g:2556:3: otherlv_0= 'pin' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_level_3_0= RULE_INT ) ) otherlv_4= ']' )?
            {
            otherlv_0=(Token)match(input,52,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getPin_ImplAccess().getPinKeyword_0());
            		
            // InternalRaspiRover.g:2560:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRaspiRover.g:2561:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRaspiRover.g:2561:4: (lv_name_1_0= RULE_ID )
            // InternalRaspiRover.g:2562:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPin_ImplAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPin_ImplRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRaspiRover.g:2578:3: (otherlv_2= '[' ( (lv_level_3_0= RULE_INT ) ) otherlv_4= ']' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==15) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRaspiRover.g:2579:4: otherlv_2= '[' ( (lv_level_3_0= RULE_INT ) ) otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_29); 

                    				newLeafNode(otherlv_2, grammarAccess.getPin_ImplAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalRaspiRover.g:2583:4: ( (lv_level_3_0= RULE_INT ) )
                    // InternalRaspiRover.g:2584:5: (lv_level_3_0= RULE_INT )
                    {
                    // InternalRaspiRover.g:2584:5: (lv_level_3_0= RULE_INT )
                    // InternalRaspiRover.g:2585:6: lv_level_3_0= RULE_INT
                    {
                    lv_level_3_0=(Token)match(input,RULE_INT,FOLLOW_11); 

                    						newLeafNode(lv_level_3_0, grammarAccess.getPin_ImplAccess().getLevelINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPin_ImplRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"level",
                    							lv_level_3_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getPin_ImplAccess().getRightSquareBracketKeyword_2_2());
                    			

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
    // $ANTLR end "rulePin_Impl"


    // $ANTLR start "ruleNumericOperator"
    // InternalRaspiRover.g:2610:1: ruleNumericOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '==' ) | (enumLiteral_2= '<>' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '>=' ) ) ;
    public final Enumerator ruleNumericOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalRaspiRover.g:2616:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '==' ) | (enumLiteral_2= '<>' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '>=' ) ) )
            // InternalRaspiRover.g:2617:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '==' ) | (enumLiteral_2= '<>' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '>=' ) )
            {
            // InternalRaspiRover.g:2617:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '==' ) | (enumLiteral_2= '<>' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '>=' ) )
            int alt16=6;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt16=1;
                }
                break;
            case 54:
                {
                alt16=2;
                }
                break;
            case 55:
                {
                alt16=3;
                }
                break;
            case 56:
                {
                alt16=4;
                }
                break;
            case 57:
                {
                alt16=5;
                }
                break;
            case 58:
                {
                alt16=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalRaspiRover.g:2618:3: (enumLiteral_0= '<' )
                    {
                    // InternalRaspiRover.g:2618:3: (enumLiteral_0= '<' )
                    // InternalRaspiRover.g:2619:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getNumericOperatorAccess().getLtEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNumericOperatorAccess().getLtEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRaspiRover.g:2626:3: (enumLiteral_1= '==' )
                    {
                    // InternalRaspiRover.g:2626:3: (enumLiteral_1= '==' )
                    // InternalRaspiRover.g:2627:4: enumLiteral_1= '=='
                    {
                    enumLiteral_1=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getNumericOperatorAccess().getEqEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNumericOperatorAccess().getEqEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRaspiRover.g:2634:3: (enumLiteral_2= '<>' )
                    {
                    // InternalRaspiRover.g:2634:3: (enumLiteral_2= '<>' )
                    // InternalRaspiRover.g:2635:4: enumLiteral_2= '<>'
                    {
                    enumLiteral_2=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getNumericOperatorAccess().getNeqEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getNumericOperatorAccess().getNeqEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRaspiRover.g:2642:3: (enumLiteral_3= '>' )
                    {
                    // InternalRaspiRover.g:2642:3: (enumLiteral_3= '>' )
                    // InternalRaspiRover.g:2643:4: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getNumericOperatorAccess().getGtEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getNumericOperatorAccess().getGtEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRaspiRover.g:2650:3: (enumLiteral_4= '<=' )
                    {
                    // InternalRaspiRover.g:2650:3: (enumLiteral_4= '<=' )
                    // InternalRaspiRover.g:2651:4: enumLiteral_4= '<='
                    {
                    enumLiteral_4=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getNumericOperatorAccess().getLeqEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getNumericOperatorAccess().getLeqEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRaspiRover.g:2658:3: (enumLiteral_5= '>=' )
                    {
                    // InternalRaspiRover.g:2658:3: (enumLiteral_5= '>=' )
                    // InternalRaspiRover.g:2659:4: enumLiteral_5= '>='
                    {
                    enumLiteral_5=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getNumericOperatorAccess().getGeqEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getNumericOperatorAccess().getGeqEnumLiteralDeclaration_5());
                    			

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
    // $ANTLR end "ruleNumericOperator"


    // $ANTLR start "ruleStringOperator"
    // InternalRaspiRover.g:2669:1: ruleStringOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) ) ;
    public final Enumerator ruleStringOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRaspiRover.g:2675:2: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) ) )
            // InternalRaspiRover.g:2676:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) )
            {
            // InternalRaspiRover.g:2676:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==54) ) {
                alt17=1;
            }
            else if ( (LA17_0==59) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalRaspiRover.g:2677:3: (enumLiteral_0= '==' )
                    {
                    // InternalRaspiRover.g:2677:3: (enumLiteral_0= '==' )
                    // InternalRaspiRover.g:2678:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getStringOperatorAccess().getEqEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getStringOperatorAccess().getEqEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRaspiRover.g:2685:3: (enumLiteral_1= '!=' )
                    {
                    // InternalRaspiRover.g:2685:3: (enumLiteral_1= '!=' )
                    // InternalRaspiRover.g:2686:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getStringOperatorAccess().getNeqEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getStringOperatorAccess().getNeqEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleStringOperator"


    // $ANTLR start "ruleBooleanOperator"
    // InternalRaspiRover.g:2696:1: ruleBooleanOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) ) ;
    public final Enumerator ruleBooleanOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRaspiRover.g:2702:2: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) ) )
            // InternalRaspiRover.g:2703:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) )
            {
            // InternalRaspiRover.g:2703:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==54) ) {
                alt18=1;
            }
            else if ( (LA18_0==59) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalRaspiRover.g:2704:3: (enumLiteral_0= '==' )
                    {
                    // InternalRaspiRover.g:2704:3: (enumLiteral_0= '==' )
                    // InternalRaspiRover.g:2705:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getBooleanOperatorAccess().getEqEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBooleanOperatorAccess().getEqEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRaspiRover.g:2712:3: (enumLiteral_1= '!=' )
                    {
                    // InternalRaspiRover.g:2712:3: (enumLiteral_1= '!=' )
                    // InternalRaspiRover.g:2713:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getBooleanOperatorAccess().getNeqEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBooleanOperatorAccess().getNeqEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleBooleanOperator"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\23\uffff";
    static final String dfa_2s = "\5\uffff\1\14\1\20\1\22\13\uffff";
    static final String dfa_3s = "\1\4\4\uffff\3\4\13\uffff";
    static final String dfa_4s = "\1\43\4\uffff\3\45\13\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\3\1\4\3\uffff\1\13\1\14\1\15\1\16\2\5\1\6\1\10\1\7\1\12\1\11";
    static final String dfa_6s = "\23\uffff}>";
    static final String[] dfa_7s = {
            "\1\13\10\uffff\1\4\11\uffff\1\1\1\uffff\1\2\3\uffff\1\3\1\5\1\6\1\7\1\10\1\11\1\12",
            "",
            "",
            "",
            "",
            "\1\15\1\uffff\1\16\6\uffff\1\14\3\uffff\1\14\5\uffff\1\14\1\uffff\1\14\3\uffff\7\14\2\16",
            "\1\20\1\uffff\1\17\6\uffff\1\20\3\uffff\1\20\5\uffff\1\20\1\uffff\1\20\3\uffff\7\20\2\17",
            "\1\22\1\uffff\1\21\6\uffff\1\22\3\uffff\1\22\5\uffff\1\22\1\uffff\1\22\3\uffff\7\22\2\21",
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
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "187:2: (this_VarAssignment_0= ruleVarAssignment | this_Conditional_1= ruleConditional | this_Loop_2= ruleLoop | this_RclBlock_3= ruleRclBlock | this_ForwardAction_4= ruleForwardAction | this_ForwardMinAction_5= ruleForwardMinAction | this_BackwardAction_6= ruleBackwardAction | this_BackwardMinAction_7= ruleBackwardMinAction | this_TurnAction_8= ruleTurnAction | this_TurnDegAction_9= ruleTurnDegAction | this_StopAction_10= ruleStopAction | this_LogAction_11= ruleLogAction | this_SendAction_12= ruleSendAction | this_VarRef_13= ruleVarRef )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000FE2882010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000FE28A2010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000004FFE2882070L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000003FE2882050L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000FF80100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x07E0000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0840000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004FE2882030L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000080L});

}