package rover.raspirover.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import rover.raspirover.xtext.services.RaspiRoverGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRaspiRoverParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_DOUBLE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<'", "'=='", "'<>'", "'>'", "'<='", "'>='", "'!='", "'raspi-project'", "'{'", "'}'", "'boards'", "'['", "']'", "'program'", "'params'", "','", "'digital-pin'", "'analog-pin'", "'var'", "':='", "'if'", "'('", "')'", "'else'", "'while'", "'forward'", "'backward'", "'turn'", "'stop'", "'log'", "'send'", "'query-temp'", "'query-humidity'", "'query-msg'", "'query'", "'obstacle'", "'cm'", "'mm'", "'m'", "'ft'", "'in'", "'yd'", "'rad'", "'deg'", "'grad'", "'pin'", "'front'", "'true'"
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

    	public void setGrammarAccess(RaspiRoverGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleProject"
    // InternalRaspiRover.g:53:1: entryRuleProject : ruleProject EOF ;
    public final void entryRuleProject() throws RecognitionException {
        try {
            // InternalRaspiRover.g:54:1: ( ruleProject EOF )
            // InternalRaspiRover.g:55:1: ruleProject EOF
            {
             before(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_1);
            ruleProject();

            state._fsp--;

             after(grammarAccess.getProjectRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // InternalRaspiRover.g:62:1: ruleProject : ( ( rule__Project__Group__0 ) ) ;
    public final void ruleProject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:66:2: ( ( ( rule__Project__Group__0 ) ) )
            // InternalRaspiRover.g:67:2: ( ( rule__Project__Group__0 ) )
            {
            // InternalRaspiRover.g:67:2: ( ( rule__Project__Group__0 ) )
            // InternalRaspiRover.g:68:3: ( rule__Project__Group__0 )
            {
             before(grammarAccess.getProjectAccess().getGroup()); 
            // InternalRaspiRover.g:69:3: ( rule__Project__Group__0 )
            // InternalRaspiRover.g:69:4: rule__Project__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Project__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getGroup()); 

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
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleBoard"
    // InternalRaspiRover.g:78:1: entryRuleBoard : ruleBoard EOF ;
    public final void entryRuleBoard() throws RecognitionException {
        try {
            // InternalRaspiRover.g:79:1: ( ruleBoard EOF )
            // InternalRaspiRover.g:80:1: ruleBoard EOF
            {
             before(grammarAccess.getBoardRule()); 
            pushFollow(FOLLOW_1);
            ruleBoard();

            state._fsp--;

             after(grammarAccess.getBoardRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBoard"


    // $ANTLR start "ruleBoard"
    // InternalRaspiRover.g:87:1: ruleBoard : ( ruleRasPiBoard ) ;
    public final void ruleBoard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:91:2: ( ( ruleRasPiBoard ) )
            // InternalRaspiRover.g:92:2: ( ruleRasPiBoard )
            {
            // InternalRaspiRover.g:92:2: ( ruleRasPiBoard )
            // InternalRaspiRover.g:93:3: ruleRasPiBoard
            {
             before(grammarAccess.getBoardAccess().getRasPiBoardParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleRasPiBoard();

            state._fsp--;

             after(grammarAccess.getBoardAccess().getRasPiBoardParserRuleCall()); 

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
    // $ANTLR end "ruleBoard"


    // $ANTLR start "entryRuleStatement"
    // InternalRaspiRover.g:103:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalRaspiRover.g:104:1: ( ruleStatement EOF )
            // InternalRaspiRover.g:105:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalRaspiRover.g:112:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:116:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalRaspiRover.g:117:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalRaspiRover.g:117:2: ( ( rule__Statement__Alternatives ) )
            // InternalRaspiRover.g:118:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalRaspiRover.g:119:3: ( rule__Statement__Alternatives )
            // InternalRaspiRover.g:119:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleRoverValue"
    // InternalRaspiRover.g:128:1: entryRuleRoverValue : ruleRoverValue EOF ;
    public final void entryRuleRoverValue() throws RecognitionException {
        try {
            // InternalRaspiRover.g:129:1: ( ruleRoverValue EOF )
            // InternalRaspiRover.g:130:1: ruleRoverValue EOF
            {
             before(grammarAccess.getRoverValueRule()); 
            pushFollow(FOLLOW_1);
            ruleRoverValue();

            state._fsp--;

             after(grammarAccess.getRoverValueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRoverValue"


    // $ANTLR start "ruleRoverValue"
    // InternalRaspiRover.g:137:1: ruleRoverValue : ( ( rule__RoverValue__Alternatives ) ) ;
    public final void ruleRoverValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:141:2: ( ( ( rule__RoverValue__Alternatives ) ) )
            // InternalRaspiRover.g:142:2: ( ( rule__RoverValue__Alternatives ) )
            {
            // InternalRaspiRover.g:142:2: ( ( rule__RoverValue__Alternatives ) )
            // InternalRaspiRover.g:143:3: ( rule__RoverValue__Alternatives )
            {
             before(grammarAccess.getRoverValueAccess().getAlternatives()); 
            // InternalRaspiRover.g:144:3: ( rule__RoverValue__Alternatives )
            // InternalRaspiRover.g:144:4: rule__RoverValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RoverValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRoverValueAccess().getAlternatives()); 

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
    // $ANTLR end "ruleRoverValue"


    // $ANTLR start "entryRuleRoverExpression"
    // InternalRaspiRover.g:153:1: entryRuleRoverExpression : ruleRoverExpression EOF ;
    public final void entryRuleRoverExpression() throws RecognitionException {
        try {
            // InternalRaspiRover.g:154:1: ( ruleRoverExpression EOF )
            // InternalRaspiRover.g:155:1: ruleRoverExpression EOF
            {
             before(grammarAccess.getRoverExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleRoverExpression();

            state._fsp--;

             after(grammarAccess.getRoverExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRoverExpression"


    // $ANTLR start "ruleRoverExpression"
    // InternalRaspiRover.g:162:1: ruleRoverExpression : ( ( rule__RoverExpression__Alternatives ) ) ;
    public final void ruleRoverExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:166:2: ( ( ( rule__RoverExpression__Alternatives ) ) )
            // InternalRaspiRover.g:167:2: ( ( rule__RoverExpression__Alternatives ) )
            {
            // InternalRaspiRover.g:167:2: ( ( rule__RoverExpression__Alternatives ) )
            // InternalRaspiRover.g:168:3: ( rule__RoverExpression__Alternatives )
            {
             before(grammarAccess.getRoverExpressionAccess().getAlternatives()); 
            // InternalRaspiRover.g:169:3: ( rule__RoverExpression__Alternatives )
            // InternalRaspiRover.g:169:4: rule__RoverExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RoverExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRoverExpressionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleRoverExpression"


    // $ANTLR start "entryRuleNumberValue"
    // InternalRaspiRover.g:178:1: entryRuleNumberValue : ruleNumberValue EOF ;
    public final void entryRuleNumberValue() throws RecognitionException {
        try {
            // InternalRaspiRover.g:179:1: ( ruleNumberValue EOF )
            // InternalRaspiRover.g:180:1: ruleNumberValue EOF
            {
             before(grammarAccess.getNumberValueRule()); 
            pushFollow(FOLLOW_1);
            ruleNumberValue();

            state._fsp--;

             after(grammarAccess.getNumberValueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNumberValue"


    // $ANTLR start "ruleNumberValue"
    // InternalRaspiRover.g:187:1: ruleNumberValue : ( ( rule__NumberValue__Alternatives ) ) ;
    public final void ruleNumberValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:191:2: ( ( ( rule__NumberValue__Alternatives ) ) )
            // InternalRaspiRover.g:192:2: ( ( rule__NumberValue__Alternatives ) )
            {
            // InternalRaspiRover.g:192:2: ( ( rule__NumberValue__Alternatives ) )
            // InternalRaspiRover.g:193:3: ( rule__NumberValue__Alternatives )
            {
             before(grammarAccess.getNumberValueAccess().getAlternatives()); 
            // InternalRaspiRover.g:194:3: ( rule__NumberValue__Alternatives )
            // InternalRaspiRover.g:194:4: rule__NumberValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NumberValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNumberValueAccess().getAlternatives()); 

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
    // $ANTLR end "ruleNumberValue"


    // $ANTLR start "entryRuleUnit"
    // InternalRaspiRover.g:203:1: entryRuleUnit : ruleUnit EOF ;
    public final void entryRuleUnit() throws RecognitionException {
        try {
            // InternalRaspiRover.g:204:1: ( ruleUnit EOF )
            // InternalRaspiRover.g:205:1: ruleUnit EOF
            {
             before(grammarAccess.getUnitRule()); 
            pushFollow(FOLLOW_1);
            ruleUnit();

            state._fsp--;

             after(grammarAccess.getUnitRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUnit"


    // $ANTLR start "ruleUnit"
    // InternalRaspiRover.g:212:1: ruleUnit : ( ( rule__Unit__Alternatives ) ) ;
    public final void ruleUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:216:2: ( ( ( rule__Unit__Alternatives ) ) )
            // InternalRaspiRover.g:217:2: ( ( rule__Unit__Alternatives ) )
            {
            // InternalRaspiRover.g:217:2: ( ( rule__Unit__Alternatives ) )
            // InternalRaspiRover.g:218:3: ( rule__Unit__Alternatives )
            {
             before(grammarAccess.getUnitAccess().getAlternatives()); 
            // InternalRaspiRover.g:219:3: ( rule__Unit__Alternatives )
            // InternalRaspiRover.g:219:4: rule__Unit__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Unit__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnitAccess().getAlternatives()); 

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
    // $ANTLR end "ruleUnit"


    // $ANTLR start "entryRuleStringValue"
    // InternalRaspiRover.g:228:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalRaspiRover.g:229:1: ( ruleStringValue EOF )
            // InternalRaspiRover.g:230:1: ruleStringValue EOF
            {
             before(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_1);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getStringValueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalRaspiRover.g:237:1: ruleStringValue : ( ( rule__StringValue__Alternatives ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:241:2: ( ( ( rule__StringValue__Alternatives ) ) )
            // InternalRaspiRover.g:242:2: ( ( rule__StringValue__Alternatives ) )
            {
            // InternalRaspiRover.g:242:2: ( ( rule__StringValue__Alternatives ) )
            // InternalRaspiRover.g:243:3: ( rule__StringValue__Alternatives )
            {
             before(grammarAccess.getStringValueAccess().getAlternatives()); 
            // InternalRaspiRover.g:244:3: ( rule__StringValue__Alternatives )
            // InternalRaspiRover.g:244:4: rule__StringValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__StringValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStringValueAccess().getAlternatives()); 

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
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleBooleanValue"
    // InternalRaspiRover.g:253:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // InternalRaspiRover.g:254:1: ( ruleBooleanValue EOF )
            // InternalRaspiRover.g:255:1: ruleBooleanValue EOF
            {
             before(grammarAccess.getBooleanValueRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanValue();

            state._fsp--;

             after(grammarAccess.getBooleanValueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // InternalRaspiRover.g:262:1: ruleBooleanValue : ( ( rule__BooleanValue__Alternatives ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:266:2: ( ( ( rule__BooleanValue__Alternatives ) ) )
            // InternalRaspiRover.g:267:2: ( ( rule__BooleanValue__Alternatives ) )
            {
            // InternalRaspiRover.g:267:2: ( ( rule__BooleanValue__Alternatives ) )
            // InternalRaspiRover.g:268:3: ( rule__BooleanValue__Alternatives )
            {
             before(grammarAccess.getBooleanValueAccess().getAlternatives()); 
            // InternalRaspiRover.g:269:3: ( rule__BooleanValue__Alternatives )
            // InternalRaspiRover.g:269:4: rule__BooleanValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BooleanValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBooleanValueAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleRoverProgram"
    // InternalRaspiRover.g:278:1: entryRuleRoverProgram : ruleRoverProgram EOF ;
    public final void entryRuleRoverProgram() throws RecognitionException {
        try {
            // InternalRaspiRover.g:279:1: ( ruleRoverProgram EOF )
            // InternalRaspiRover.g:280:1: ruleRoverProgram EOF
            {
             before(grammarAccess.getRoverProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleRoverProgram();

            state._fsp--;

             after(grammarAccess.getRoverProgramRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRoverProgram"


    // $ANTLR start "ruleRoverProgram"
    // InternalRaspiRover.g:287:1: ruleRoverProgram : ( ( rule__RoverProgram__Group__0 ) ) ;
    public final void ruleRoverProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:291:2: ( ( ( rule__RoverProgram__Group__0 ) ) )
            // InternalRaspiRover.g:292:2: ( ( rule__RoverProgram__Group__0 ) )
            {
            // InternalRaspiRover.g:292:2: ( ( rule__RoverProgram__Group__0 ) )
            // InternalRaspiRover.g:293:3: ( rule__RoverProgram__Group__0 )
            {
             before(grammarAccess.getRoverProgramAccess().getGroup()); 
            // InternalRaspiRover.g:294:3: ( rule__RoverProgram__Group__0 )
            // InternalRaspiRover.g:294:4: rule__RoverProgram__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RoverProgram__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoverProgramAccess().getGroup()); 

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
    // $ANTLR end "ruleRoverProgram"


    // $ANTLR start "entryRuleRasPiBoard"
    // InternalRaspiRover.g:303:1: entryRuleRasPiBoard : ruleRasPiBoard EOF ;
    public final void entryRuleRasPiBoard() throws RecognitionException {
        try {
            // InternalRaspiRover.g:304:1: ( ruleRasPiBoard EOF )
            // InternalRaspiRover.g:305:1: ruleRasPiBoard EOF
            {
             before(grammarAccess.getRasPiBoardRule()); 
            pushFollow(FOLLOW_1);
            ruleRasPiBoard();

            state._fsp--;

             after(grammarAccess.getRasPiBoardRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRasPiBoard"


    // $ANTLR start "ruleRasPiBoard"
    // InternalRaspiRover.g:312:1: ruleRasPiBoard : ( ( rule__RasPiBoard__Group__0 ) ) ;
    public final void ruleRasPiBoard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:316:2: ( ( ( rule__RasPiBoard__Group__0 ) ) )
            // InternalRaspiRover.g:317:2: ( ( rule__RasPiBoard__Group__0 ) )
            {
            // InternalRaspiRover.g:317:2: ( ( rule__RasPiBoard__Group__0 ) )
            // InternalRaspiRover.g:318:3: ( rule__RasPiBoard__Group__0 )
            {
             before(grammarAccess.getRasPiBoardAccess().getGroup()); 
            // InternalRaspiRover.g:319:3: ( rule__RasPiBoard__Group__0 )
            // InternalRaspiRover.g:319:4: rule__RasPiBoard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RasPiBoard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRasPiBoardAccess().getGroup()); 

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
    // $ANTLR end "ruleRasPiBoard"


    // $ANTLR start "entryRuleDigitalPin"
    // InternalRaspiRover.g:328:1: entryRuleDigitalPin : ruleDigitalPin EOF ;
    public final void entryRuleDigitalPin() throws RecognitionException {
        try {
            // InternalRaspiRover.g:329:1: ( ruleDigitalPin EOF )
            // InternalRaspiRover.g:330:1: ruleDigitalPin EOF
            {
             before(grammarAccess.getDigitalPinRule()); 
            pushFollow(FOLLOW_1);
            ruleDigitalPin();

            state._fsp--;

             after(grammarAccess.getDigitalPinRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDigitalPin"


    // $ANTLR start "ruleDigitalPin"
    // InternalRaspiRover.g:337:1: ruleDigitalPin : ( ( rule__DigitalPin__Group__0 ) ) ;
    public final void ruleDigitalPin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:341:2: ( ( ( rule__DigitalPin__Group__0 ) ) )
            // InternalRaspiRover.g:342:2: ( ( rule__DigitalPin__Group__0 ) )
            {
            // InternalRaspiRover.g:342:2: ( ( rule__DigitalPin__Group__0 ) )
            // InternalRaspiRover.g:343:3: ( rule__DigitalPin__Group__0 )
            {
             before(grammarAccess.getDigitalPinAccess().getGroup()); 
            // InternalRaspiRover.g:344:3: ( rule__DigitalPin__Group__0 )
            // InternalRaspiRover.g:344:4: rule__DigitalPin__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DigitalPin__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDigitalPinAccess().getGroup()); 

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
    // $ANTLR end "ruleDigitalPin"


    // $ANTLR start "entryRuleAnalogPin"
    // InternalRaspiRover.g:353:1: entryRuleAnalogPin : ruleAnalogPin EOF ;
    public final void entryRuleAnalogPin() throws RecognitionException {
        try {
            // InternalRaspiRover.g:354:1: ( ruleAnalogPin EOF )
            // InternalRaspiRover.g:355:1: ruleAnalogPin EOF
            {
             before(grammarAccess.getAnalogPinRule()); 
            pushFollow(FOLLOW_1);
            ruleAnalogPin();

            state._fsp--;

             after(grammarAccess.getAnalogPinRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAnalogPin"


    // $ANTLR start "ruleAnalogPin"
    // InternalRaspiRover.g:362:1: ruleAnalogPin : ( ( rule__AnalogPin__Group__0 ) ) ;
    public final void ruleAnalogPin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:366:2: ( ( ( rule__AnalogPin__Group__0 ) ) )
            // InternalRaspiRover.g:367:2: ( ( rule__AnalogPin__Group__0 ) )
            {
            // InternalRaspiRover.g:367:2: ( ( rule__AnalogPin__Group__0 ) )
            // InternalRaspiRover.g:368:3: ( rule__AnalogPin__Group__0 )
            {
             before(grammarAccess.getAnalogPinAccess().getGroup()); 
            // InternalRaspiRover.g:369:3: ( rule__AnalogPin__Group__0 )
            // InternalRaspiRover.g:369:4: rule__AnalogPin__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AnalogPin__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnalogPinAccess().getGroup()); 

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
    // $ANTLR end "ruleAnalogPin"


    // $ANTLR start "entryRuleParam"
    // InternalRaspiRover.g:378:1: entryRuleParam : ruleParam EOF ;
    public final void entryRuleParam() throws RecognitionException {
        try {
            // InternalRaspiRover.g:379:1: ( ruleParam EOF )
            // InternalRaspiRover.g:380:1: ruleParam EOF
            {
             before(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_1);
            ruleParam();

            state._fsp--;

             after(grammarAccess.getParamRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRaspiRover.g:387:1: ruleParam : ( ( rule__Param__NameAssignment ) ) ;
    public final void ruleParam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:391:2: ( ( ( rule__Param__NameAssignment ) ) )
            // InternalRaspiRover.g:392:2: ( ( rule__Param__NameAssignment ) )
            {
            // InternalRaspiRover.g:392:2: ( ( rule__Param__NameAssignment ) )
            // InternalRaspiRover.g:393:3: ( rule__Param__NameAssignment )
            {
             before(grammarAccess.getParamAccess().getNameAssignment()); 
            // InternalRaspiRover.g:394:3: ( rule__Param__NameAssignment )
            // InternalRaspiRover.g:394:4: rule__Param__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Param__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getParamAccess().getNameAssignment()); 

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


    // $ANTLR start "entryRuleRclBlock"
    // InternalRaspiRover.g:403:1: entryRuleRclBlock : ruleRclBlock EOF ;
    public final void entryRuleRclBlock() throws RecognitionException {
        try {
            // InternalRaspiRover.g:404:1: ( ruleRclBlock EOF )
            // InternalRaspiRover.g:405:1: ruleRclBlock EOF
            {
             before(grammarAccess.getRclBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleRclBlock();

            state._fsp--;

             after(grammarAccess.getRclBlockRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRclBlock"


    // $ANTLR start "ruleRclBlock"
    // InternalRaspiRover.g:412:1: ruleRclBlock : ( ( rule__RclBlock__Group__0 ) ) ;
    public final void ruleRclBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:416:2: ( ( ( rule__RclBlock__Group__0 ) ) )
            // InternalRaspiRover.g:417:2: ( ( rule__RclBlock__Group__0 ) )
            {
            // InternalRaspiRover.g:417:2: ( ( rule__RclBlock__Group__0 ) )
            // InternalRaspiRover.g:418:3: ( rule__RclBlock__Group__0 )
            {
             before(grammarAccess.getRclBlockAccess().getGroup()); 
            // InternalRaspiRover.g:419:3: ( rule__RclBlock__Group__0 )
            // InternalRaspiRover.g:419:4: rule__RclBlock__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RclBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRclBlockAccess().getGroup()); 

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
    // $ANTLR end "ruleRclBlock"


    // $ANTLR start "entryRuleVarAssignment"
    // InternalRaspiRover.g:428:1: entryRuleVarAssignment : ruleVarAssignment EOF ;
    public final void entryRuleVarAssignment() throws RecognitionException {
        try {
            // InternalRaspiRover.g:429:1: ( ruleVarAssignment EOF )
            // InternalRaspiRover.g:430:1: ruleVarAssignment EOF
            {
             before(grammarAccess.getVarAssignmentRule()); 
            pushFollow(FOLLOW_1);
            ruleVarAssignment();

            state._fsp--;

             after(grammarAccess.getVarAssignmentRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVarAssignment"


    // $ANTLR start "ruleVarAssignment"
    // InternalRaspiRover.g:437:1: ruleVarAssignment : ( ( rule__VarAssignment__Group__0 ) ) ;
    public final void ruleVarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:441:2: ( ( ( rule__VarAssignment__Group__0 ) ) )
            // InternalRaspiRover.g:442:2: ( ( rule__VarAssignment__Group__0 ) )
            {
            // InternalRaspiRover.g:442:2: ( ( rule__VarAssignment__Group__0 ) )
            // InternalRaspiRover.g:443:3: ( rule__VarAssignment__Group__0 )
            {
             before(grammarAccess.getVarAssignmentAccess().getGroup()); 
            // InternalRaspiRover.g:444:3: ( rule__VarAssignment__Group__0 )
            // InternalRaspiRover.g:444:4: rule__VarAssignment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VarAssignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVarAssignmentAccess().getGroup()); 

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
    // $ANTLR end "ruleVarAssignment"


    // $ANTLR start "entryRuleConditional"
    // InternalRaspiRover.g:453:1: entryRuleConditional : ruleConditional EOF ;
    public final void entryRuleConditional() throws RecognitionException {
        try {
            // InternalRaspiRover.g:454:1: ( ruleConditional EOF )
            // InternalRaspiRover.g:455:1: ruleConditional EOF
            {
             before(grammarAccess.getConditionalRule()); 
            pushFollow(FOLLOW_1);
            ruleConditional();

            state._fsp--;

             after(grammarAccess.getConditionalRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConditional"


    // $ANTLR start "ruleConditional"
    // InternalRaspiRover.g:462:1: ruleConditional : ( ( rule__Conditional__Group__0 ) ) ;
    public final void ruleConditional() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:466:2: ( ( ( rule__Conditional__Group__0 ) ) )
            // InternalRaspiRover.g:467:2: ( ( rule__Conditional__Group__0 ) )
            {
            // InternalRaspiRover.g:467:2: ( ( rule__Conditional__Group__0 ) )
            // InternalRaspiRover.g:468:3: ( rule__Conditional__Group__0 )
            {
             before(grammarAccess.getConditionalAccess().getGroup()); 
            // InternalRaspiRover.g:469:3: ( rule__Conditional__Group__0 )
            // InternalRaspiRover.g:469:4: rule__Conditional__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Conditional__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionalAccess().getGroup()); 

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
    // $ANTLR end "ruleConditional"


    // $ANTLR start "entryRuleLoop"
    // InternalRaspiRover.g:478:1: entryRuleLoop : ruleLoop EOF ;
    public final void entryRuleLoop() throws RecognitionException {
        try {
            // InternalRaspiRover.g:479:1: ( ruleLoop EOF )
            // InternalRaspiRover.g:480:1: ruleLoop EOF
            {
             before(grammarAccess.getLoopRule()); 
            pushFollow(FOLLOW_1);
            ruleLoop();

            state._fsp--;

             after(grammarAccess.getLoopRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLoop"


    // $ANTLR start "ruleLoop"
    // InternalRaspiRover.g:487:1: ruleLoop : ( ( rule__Loop__Group__0 ) ) ;
    public final void ruleLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:491:2: ( ( ( rule__Loop__Group__0 ) ) )
            // InternalRaspiRover.g:492:2: ( ( rule__Loop__Group__0 ) )
            {
            // InternalRaspiRover.g:492:2: ( ( rule__Loop__Group__0 ) )
            // InternalRaspiRover.g:493:3: ( rule__Loop__Group__0 )
            {
             before(grammarAccess.getLoopAccess().getGroup()); 
            // InternalRaspiRover.g:494:3: ( rule__Loop__Group__0 )
            // InternalRaspiRover.g:494:4: rule__Loop__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getGroup()); 

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
    // $ANTLR end "ruleLoop"


    // $ANTLR start "entryRuleForwardAction"
    // InternalRaspiRover.g:503:1: entryRuleForwardAction : ruleForwardAction EOF ;
    public final void entryRuleForwardAction() throws RecognitionException {
        try {
            // InternalRaspiRover.g:504:1: ( ruleForwardAction EOF )
            // InternalRaspiRover.g:505:1: ruleForwardAction EOF
            {
             before(grammarAccess.getForwardActionRule()); 
            pushFollow(FOLLOW_1);
            ruleForwardAction();

            state._fsp--;

             after(grammarAccess.getForwardActionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleForwardAction"


    // $ANTLR start "ruleForwardAction"
    // InternalRaspiRover.g:512:1: ruleForwardAction : ( ( rule__ForwardAction__Group__0 ) ) ;
    public final void ruleForwardAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:516:2: ( ( ( rule__ForwardAction__Group__0 ) ) )
            // InternalRaspiRover.g:517:2: ( ( rule__ForwardAction__Group__0 ) )
            {
            // InternalRaspiRover.g:517:2: ( ( rule__ForwardAction__Group__0 ) )
            // InternalRaspiRover.g:518:3: ( rule__ForwardAction__Group__0 )
            {
             before(grammarAccess.getForwardActionAccess().getGroup()); 
            // InternalRaspiRover.g:519:3: ( rule__ForwardAction__Group__0 )
            // InternalRaspiRover.g:519:4: rule__ForwardAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ForwardAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForwardActionAccess().getGroup()); 

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
    // $ANTLR end "ruleForwardAction"


    // $ANTLR start "entryRuleForwardMinAction"
    // InternalRaspiRover.g:528:1: entryRuleForwardMinAction : ruleForwardMinAction EOF ;
    public final void entryRuleForwardMinAction() throws RecognitionException {
        try {
            // InternalRaspiRover.g:529:1: ( ruleForwardMinAction EOF )
            // InternalRaspiRover.g:530:1: ruleForwardMinAction EOF
            {
             before(grammarAccess.getForwardMinActionRule()); 
            pushFollow(FOLLOW_1);
            ruleForwardMinAction();

            state._fsp--;

             after(grammarAccess.getForwardMinActionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleForwardMinAction"


    // $ANTLR start "ruleForwardMinAction"
    // InternalRaspiRover.g:537:1: ruleForwardMinAction : ( ( rule__ForwardMinAction__Group__0 ) ) ;
    public final void ruleForwardMinAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:541:2: ( ( ( rule__ForwardMinAction__Group__0 ) ) )
            // InternalRaspiRover.g:542:2: ( ( rule__ForwardMinAction__Group__0 ) )
            {
            // InternalRaspiRover.g:542:2: ( ( rule__ForwardMinAction__Group__0 ) )
            // InternalRaspiRover.g:543:3: ( rule__ForwardMinAction__Group__0 )
            {
             before(grammarAccess.getForwardMinActionAccess().getGroup()); 
            // InternalRaspiRover.g:544:3: ( rule__ForwardMinAction__Group__0 )
            // InternalRaspiRover.g:544:4: rule__ForwardMinAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ForwardMinAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForwardMinActionAccess().getGroup()); 

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
    // $ANTLR end "ruleForwardMinAction"


    // $ANTLR start "entryRuleBackwardAction"
    // InternalRaspiRover.g:553:1: entryRuleBackwardAction : ruleBackwardAction EOF ;
    public final void entryRuleBackwardAction() throws RecognitionException {
        try {
            // InternalRaspiRover.g:554:1: ( ruleBackwardAction EOF )
            // InternalRaspiRover.g:555:1: ruleBackwardAction EOF
            {
             before(grammarAccess.getBackwardActionRule()); 
            pushFollow(FOLLOW_1);
            ruleBackwardAction();

            state._fsp--;

             after(grammarAccess.getBackwardActionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBackwardAction"


    // $ANTLR start "ruleBackwardAction"
    // InternalRaspiRover.g:562:1: ruleBackwardAction : ( ( rule__BackwardAction__Group__0 ) ) ;
    public final void ruleBackwardAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:566:2: ( ( ( rule__BackwardAction__Group__0 ) ) )
            // InternalRaspiRover.g:567:2: ( ( rule__BackwardAction__Group__0 ) )
            {
            // InternalRaspiRover.g:567:2: ( ( rule__BackwardAction__Group__0 ) )
            // InternalRaspiRover.g:568:3: ( rule__BackwardAction__Group__0 )
            {
             before(grammarAccess.getBackwardActionAccess().getGroup()); 
            // InternalRaspiRover.g:569:3: ( rule__BackwardAction__Group__0 )
            // InternalRaspiRover.g:569:4: rule__BackwardAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BackwardAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBackwardActionAccess().getGroup()); 

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
    // $ANTLR end "ruleBackwardAction"


    // $ANTLR start "entryRuleBackwardMinAction"
    // InternalRaspiRover.g:578:1: entryRuleBackwardMinAction : ruleBackwardMinAction EOF ;
    public final void entryRuleBackwardMinAction() throws RecognitionException {
        try {
            // InternalRaspiRover.g:579:1: ( ruleBackwardMinAction EOF )
            // InternalRaspiRover.g:580:1: ruleBackwardMinAction EOF
            {
             before(grammarAccess.getBackwardMinActionRule()); 
            pushFollow(FOLLOW_1);
            ruleBackwardMinAction();

            state._fsp--;

             after(grammarAccess.getBackwardMinActionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBackwardMinAction"


    // $ANTLR start "ruleBackwardMinAction"
    // InternalRaspiRover.g:587:1: ruleBackwardMinAction : ( ( rule__BackwardMinAction__Group__0 ) ) ;
    public final void ruleBackwardMinAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:591:2: ( ( ( rule__BackwardMinAction__Group__0 ) ) )
            // InternalRaspiRover.g:592:2: ( ( rule__BackwardMinAction__Group__0 ) )
            {
            // InternalRaspiRover.g:592:2: ( ( rule__BackwardMinAction__Group__0 ) )
            // InternalRaspiRover.g:593:3: ( rule__BackwardMinAction__Group__0 )
            {
             before(grammarAccess.getBackwardMinActionAccess().getGroup()); 
            // InternalRaspiRover.g:594:3: ( rule__BackwardMinAction__Group__0 )
            // InternalRaspiRover.g:594:4: rule__BackwardMinAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BackwardMinAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBackwardMinActionAccess().getGroup()); 

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
    // $ANTLR end "ruleBackwardMinAction"


    // $ANTLR start "entryRuleTurnAction"
    // InternalRaspiRover.g:603:1: entryRuleTurnAction : ruleTurnAction EOF ;
    public final void entryRuleTurnAction() throws RecognitionException {
        try {
            // InternalRaspiRover.g:604:1: ( ruleTurnAction EOF )
            // InternalRaspiRover.g:605:1: ruleTurnAction EOF
            {
             before(grammarAccess.getTurnActionRule()); 
            pushFollow(FOLLOW_1);
            ruleTurnAction();

            state._fsp--;

             after(grammarAccess.getTurnActionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTurnAction"


    // $ANTLR start "ruleTurnAction"
    // InternalRaspiRover.g:612:1: ruleTurnAction : ( ( rule__TurnAction__Group__0 ) ) ;
    public final void ruleTurnAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:616:2: ( ( ( rule__TurnAction__Group__0 ) ) )
            // InternalRaspiRover.g:617:2: ( ( rule__TurnAction__Group__0 ) )
            {
            // InternalRaspiRover.g:617:2: ( ( rule__TurnAction__Group__0 ) )
            // InternalRaspiRover.g:618:3: ( rule__TurnAction__Group__0 )
            {
             before(grammarAccess.getTurnActionAccess().getGroup()); 
            // InternalRaspiRover.g:619:3: ( rule__TurnAction__Group__0 )
            // InternalRaspiRover.g:619:4: rule__TurnAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TurnAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTurnActionAccess().getGroup()); 

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
    // $ANTLR end "ruleTurnAction"


    // $ANTLR start "entryRuleTurnDegAction"
    // InternalRaspiRover.g:628:1: entryRuleTurnDegAction : ruleTurnDegAction EOF ;
    public final void entryRuleTurnDegAction() throws RecognitionException {
        try {
            // InternalRaspiRover.g:629:1: ( ruleTurnDegAction EOF )
            // InternalRaspiRover.g:630:1: ruleTurnDegAction EOF
            {
             before(grammarAccess.getTurnDegActionRule()); 
            pushFollow(FOLLOW_1);
            ruleTurnDegAction();

            state._fsp--;

             after(grammarAccess.getTurnDegActionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTurnDegAction"


    // $ANTLR start "ruleTurnDegAction"
    // InternalRaspiRover.g:637:1: ruleTurnDegAction : ( ( rule__TurnDegAction__Group__0 ) ) ;
    public final void ruleTurnDegAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:641:2: ( ( ( rule__TurnDegAction__Group__0 ) ) )
            // InternalRaspiRover.g:642:2: ( ( rule__TurnDegAction__Group__0 ) )
            {
            // InternalRaspiRover.g:642:2: ( ( rule__TurnDegAction__Group__0 ) )
            // InternalRaspiRover.g:643:3: ( rule__TurnDegAction__Group__0 )
            {
             before(grammarAccess.getTurnDegActionAccess().getGroup()); 
            // InternalRaspiRover.g:644:3: ( rule__TurnDegAction__Group__0 )
            // InternalRaspiRover.g:644:4: rule__TurnDegAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TurnDegAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTurnDegActionAccess().getGroup()); 

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
    // $ANTLR end "ruleTurnDegAction"


    // $ANTLR start "entryRuleStopAction"
    // InternalRaspiRover.g:653:1: entryRuleStopAction : ruleStopAction EOF ;
    public final void entryRuleStopAction() throws RecognitionException {
        try {
            // InternalRaspiRover.g:654:1: ( ruleStopAction EOF )
            // InternalRaspiRover.g:655:1: ruleStopAction EOF
            {
             before(grammarAccess.getStopActionRule()); 
            pushFollow(FOLLOW_1);
            ruleStopAction();

            state._fsp--;

             after(grammarAccess.getStopActionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStopAction"


    // $ANTLR start "ruleStopAction"
    // InternalRaspiRover.g:662:1: ruleStopAction : ( ( rule__StopAction__Group__0 ) ) ;
    public final void ruleStopAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:666:2: ( ( ( rule__StopAction__Group__0 ) ) )
            // InternalRaspiRover.g:667:2: ( ( rule__StopAction__Group__0 ) )
            {
            // InternalRaspiRover.g:667:2: ( ( rule__StopAction__Group__0 ) )
            // InternalRaspiRover.g:668:3: ( rule__StopAction__Group__0 )
            {
             before(grammarAccess.getStopActionAccess().getGroup()); 
            // InternalRaspiRover.g:669:3: ( rule__StopAction__Group__0 )
            // InternalRaspiRover.g:669:4: rule__StopAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StopAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStopActionAccess().getGroup()); 

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
    // $ANTLR end "ruleStopAction"


    // $ANTLR start "entryRuleLogAction"
    // InternalRaspiRover.g:678:1: entryRuleLogAction : ruleLogAction EOF ;
    public final void entryRuleLogAction() throws RecognitionException {
        try {
            // InternalRaspiRover.g:679:1: ( ruleLogAction EOF )
            // InternalRaspiRover.g:680:1: ruleLogAction EOF
            {
             before(grammarAccess.getLogActionRule()); 
            pushFollow(FOLLOW_1);
            ruleLogAction();

            state._fsp--;

             after(grammarAccess.getLogActionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLogAction"


    // $ANTLR start "ruleLogAction"
    // InternalRaspiRover.g:687:1: ruleLogAction : ( ( rule__LogAction__Group__0 ) ) ;
    public final void ruleLogAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:691:2: ( ( ( rule__LogAction__Group__0 ) ) )
            // InternalRaspiRover.g:692:2: ( ( rule__LogAction__Group__0 ) )
            {
            // InternalRaspiRover.g:692:2: ( ( rule__LogAction__Group__0 ) )
            // InternalRaspiRover.g:693:3: ( rule__LogAction__Group__0 )
            {
             before(grammarAccess.getLogActionAccess().getGroup()); 
            // InternalRaspiRover.g:694:3: ( rule__LogAction__Group__0 )
            // InternalRaspiRover.g:694:4: rule__LogAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LogAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLogActionAccess().getGroup()); 

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
    // $ANTLR end "ruleLogAction"


    // $ANTLR start "entryRuleSendAction"
    // InternalRaspiRover.g:703:1: entryRuleSendAction : ruleSendAction EOF ;
    public final void entryRuleSendAction() throws RecognitionException {
        try {
            // InternalRaspiRover.g:704:1: ( ruleSendAction EOF )
            // InternalRaspiRover.g:705:1: ruleSendAction EOF
            {
             before(grammarAccess.getSendActionRule()); 
            pushFollow(FOLLOW_1);
            ruleSendAction();

            state._fsp--;

             after(grammarAccess.getSendActionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSendAction"


    // $ANTLR start "ruleSendAction"
    // InternalRaspiRover.g:712:1: ruleSendAction : ( ( rule__SendAction__Group__0 ) ) ;
    public final void ruleSendAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:716:2: ( ( ( rule__SendAction__Group__0 ) ) )
            // InternalRaspiRover.g:717:2: ( ( rule__SendAction__Group__0 ) )
            {
            // InternalRaspiRover.g:717:2: ( ( rule__SendAction__Group__0 ) )
            // InternalRaspiRover.g:718:3: ( rule__SendAction__Group__0 )
            {
             before(grammarAccess.getSendActionAccess().getGroup()); 
            // InternalRaspiRover.g:719:3: ( rule__SendAction__Group__0 )
            // InternalRaspiRover.g:719:4: rule__SendAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SendAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSendActionAccess().getGroup()); 

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
    // $ANTLR end "ruleSendAction"


    // $ANTLR start "entryRuleVarRef"
    // InternalRaspiRover.g:728:1: entryRuleVarRef : ruleVarRef EOF ;
    public final void entryRuleVarRef() throws RecognitionException {
        try {
            // InternalRaspiRover.g:729:1: ( ruleVarRef EOF )
            // InternalRaspiRover.g:730:1: ruleVarRef EOF
            {
             before(grammarAccess.getVarRefRule()); 
            pushFollow(FOLLOW_1);
            ruleVarRef();

            state._fsp--;

             after(grammarAccess.getVarRefRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVarRef"


    // $ANTLR start "ruleVarRef"
    // InternalRaspiRover.g:737:1: ruleVarRef : ( ( rule__VarRef__NameAssignment ) ) ;
    public final void ruleVarRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:741:2: ( ( ( rule__VarRef__NameAssignment ) ) )
            // InternalRaspiRover.g:742:2: ( ( rule__VarRef__NameAssignment ) )
            {
            // InternalRaspiRover.g:742:2: ( ( rule__VarRef__NameAssignment ) )
            // InternalRaspiRover.g:743:3: ( rule__VarRef__NameAssignment )
            {
             before(grammarAccess.getVarRefAccess().getNameAssignment()); 
            // InternalRaspiRover.g:744:3: ( rule__VarRef__NameAssignment )
            // InternalRaspiRover.g:744:4: rule__VarRef__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__VarRef__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVarRefAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleVarRef"


    // $ANTLR start "entryRuleTemperatureQuery"
    // InternalRaspiRover.g:753:1: entryRuleTemperatureQuery : ruleTemperatureQuery EOF ;
    public final void entryRuleTemperatureQuery() throws RecognitionException {
        try {
            // InternalRaspiRover.g:754:1: ( ruleTemperatureQuery EOF )
            // InternalRaspiRover.g:755:1: ruleTemperatureQuery EOF
            {
             before(grammarAccess.getTemperatureQueryRule()); 
            pushFollow(FOLLOW_1);
            ruleTemperatureQuery();

            state._fsp--;

             after(grammarAccess.getTemperatureQueryRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTemperatureQuery"


    // $ANTLR start "ruleTemperatureQuery"
    // InternalRaspiRover.g:762:1: ruleTemperatureQuery : ( ( rule__TemperatureQuery__Group__0 ) ) ;
    public final void ruleTemperatureQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:766:2: ( ( ( rule__TemperatureQuery__Group__0 ) ) )
            // InternalRaspiRover.g:767:2: ( ( rule__TemperatureQuery__Group__0 ) )
            {
            // InternalRaspiRover.g:767:2: ( ( rule__TemperatureQuery__Group__0 ) )
            // InternalRaspiRover.g:768:3: ( rule__TemperatureQuery__Group__0 )
            {
             before(grammarAccess.getTemperatureQueryAccess().getGroup()); 
            // InternalRaspiRover.g:769:3: ( rule__TemperatureQuery__Group__0 )
            // InternalRaspiRover.g:769:4: rule__TemperatureQuery__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TemperatureQuery__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTemperatureQueryAccess().getGroup()); 

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
    // $ANTLR end "ruleTemperatureQuery"


    // $ANTLR start "entryRuleHumidityQuery"
    // InternalRaspiRover.g:778:1: entryRuleHumidityQuery : ruleHumidityQuery EOF ;
    public final void entryRuleHumidityQuery() throws RecognitionException {
        try {
            // InternalRaspiRover.g:779:1: ( ruleHumidityQuery EOF )
            // InternalRaspiRover.g:780:1: ruleHumidityQuery EOF
            {
             before(grammarAccess.getHumidityQueryRule()); 
            pushFollow(FOLLOW_1);
            ruleHumidityQuery();

            state._fsp--;

             after(grammarAccess.getHumidityQueryRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleHumidityQuery"


    // $ANTLR start "ruleHumidityQuery"
    // InternalRaspiRover.g:787:1: ruleHumidityQuery : ( ( rule__HumidityQuery__Group__0 ) ) ;
    public final void ruleHumidityQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:791:2: ( ( ( rule__HumidityQuery__Group__0 ) ) )
            // InternalRaspiRover.g:792:2: ( ( rule__HumidityQuery__Group__0 ) )
            {
            // InternalRaspiRover.g:792:2: ( ( rule__HumidityQuery__Group__0 ) )
            // InternalRaspiRover.g:793:3: ( rule__HumidityQuery__Group__0 )
            {
             before(grammarAccess.getHumidityQueryAccess().getGroup()); 
            // InternalRaspiRover.g:794:3: ( rule__HumidityQuery__Group__0 )
            // InternalRaspiRover.g:794:4: rule__HumidityQuery__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HumidityQuery__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHumidityQueryAccess().getGroup()); 

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
    // $ANTLR end "ruleHumidityQuery"


    // $ANTLR start "entryRuleMessageQuery"
    // InternalRaspiRover.g:803:1: entryRuleMessageQuery : ruleMessageQuery EOF ;
    public final void entryRuleMessageQuery() throws RecognitionException {
        try {
            // InternalRaspiRover.g:804:1: ( ruleMessageQuery EOF )
            // InternalRaspiRover.g:805:1: ruleMessageQuery EOF
            {
             before(grammarAccess.getMessageQueryRule()); 
            pushFollow(FOLLOW_1);
            ruleMessageQuery();

            state._fsp--;

             after(grammarAccess.getMessageQueryRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMessageQuery"


    // $ANTLR start "ruleMessageQuery"
    // InternalRaspiRover.g:812:1: ruleMessageQuery : ( ( rule__MessageQuery__Group__0 ) ) ;
    public final void ruleMessageQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:816:2: ( ( ( rule__MessageQuery__Group__0 ) ) )
            // InternalRaspiRover.g:817:2: ( ( rule__MessageQuery__Group__0 ) )
            {
            // InternalRaspiRover.g:817:2: ( ( rule__MessageQuery__Group__0 ) )
            // InternalRaspiRover.g:818:3: ( rule__MessageQuery__Group__0 )
            {
             before(grammarAccess.getMessageQueryAccess().getGroup()); 
            // InternalRaspiRover.g:819:3: ( rule__MessageQuery__Group__0 )
            // InternalRaspiRover.g:819:4: rule__MessageQuery__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MessageQuery__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMessageQueryAccess().getGroup()); 

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
    // $ANTLR end "ruleMessageQuery"


    // $ANTLR start "entryRuleObstacleQuery"
    // InternalRaspiRover.g:828:1: entryRuleObstacleQuery : ruleObstacleQuery EOF ;
    public final void entryRuleObstacleQuery() throws RecognitionException {
        try {
            // InternalRaspiRover.g:829:1: ( ruleObstacleQuery EOF )
            // InternalRaspiRover.g:830:1: ruleObstacleQuery EOF
            {
             before(grammarAccess.getObstacleQueryRule()); 
            pushFollow(FOLLOW_1);
            ruleObstacleQuery();

            state._fsp--;

             after(grammarAccess.getObstacleQueryRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleObstacleQuery"


    // $ANTLR start "ruleObstacleQuery"
    // InternalRaspiRover.g:837:1: ruleObstacleQuery : ( ( rule__ObstacleQuery__Group__0 ) ) ;
    public final void ruleObstacleQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:841:2: ( ( ( rule__ObstacleQuery__Group__0 ) ) )
            // InternalRaspiRover.g:842:2: ( ( rule__ObstacleQuery__Group__0 ) )
            {
            // InternalRaspiRover.g:842:2: ( ( rule__ObstacleQuery__Group__0 ) )
            // InternalRaspiRover.g:843:3: ( rule__ObstacleQuery__Group__0 )
            {
             before(grammarAccess.getObstacleQueryAccess().getGroup()); 
            // InternalRaspiRover.g:844:3: ( rule__ObstacleQuery__Group__0 )
            // InternalRaspiRover.g:844:4: rule__ObstacleQuery__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ObstacleQuery__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObstacleQueryAccess().getGroup()); 

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
    // $ANTLR end "ruleObstacleQuery"


    // $ANTLR start "entryRuleNumberValue_Impl"
    // InternalRaspiRover.g:853:1: entryRuleNumberValue_Impl : ruleNumberValue_Impl EOF ;
    public final void entryRuleNumberValue_Impl() throws RecognitionException {
        try {
            // InternalRaspiRover.g:854:1: ( ruleNumberValue_Impl EOF )
            // InternalRaspiRover.g:855:1: ruleNumberValue_Impl EOF
            {
             before(grammarAccess.getNumberValue_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleNumberValue_Impl();

            state._fsp--;

             after(grammarAccess.getNumberValue_ImplRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNumberValue_Impl"


    // $ANTLR start "ruleNumberValue_Impl"
    // InternalRaspiRover.g:862:1: ruleNumberValue_Impl : ( ( rule__NumberValue_Impl__Group__0 ) ) ;
    public final void ruleNumberValue_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:866:2: ( ( ( rule__NumberValue_Impl__Group__0 ) ) )
            // InternalRaspiRover.g:867:2: ( ( rule__NumberValue_Impl__Group__0 ) )
            {
            // InternalRaspiRover.g:867:2: ( ( rule__NumberValue_Impl__Group__0 ) )
            // InternalRaspiRover.g:868:3: ( rule__NumberValue_Impl__Group__0 )
            {
             before(grammarAccess.getNumberValue_ImplAccess().getGroup()); 
            // InternalRaspiRover.g:869:3: ( rule__NumberValue_Impl__Group__0 )
            // InternalRaspiRover.g:869:4: rule__NumberValue_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NumberValue_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumberValue_ImplAccess().getGroup()); 

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
    // $ANTLR end "ruleNumberValue_Impl"


    // $ANTLR start "entryRuleQuantity"
    // InternalRaspiRover.g:878:1: entryRuleQuantity : ruleQuantity EOF ;
    public final void entryRuleQuantity() throws RecognitionException {
        try {
            // InternalRaspiRover.g:879:1: ( ruleQuantity EOF )
            // InternalRaspiRover.g:880:1: ruleQuantity EOF
            {
             before(grammarAccess.getQuantityRule()); 
            pushFollow(FOLLOW_1);
            ruleQuantity();

            state._fsp--;

             after(grammarAccess.getQuantityRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQuantity"


    // $ANTLR start "ruleQuantity"
    // InternalRaspiRover.g:887:1: ruleQuantity : ( ( rule__Quantity__Group__0 ) ) ;
    public final void ruleQuantity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:891:2: ( ( ( rule__Quantity__Group__0 ) ) )
            // InternalRaspiRover.g:892:2: ( ( rule__Quantity__Group__0 ) )
            {
            // InternalRaspiRover.g:892:2: ( ( rule__Quantity__Group__0 ) )
            // InternalRaspiRover.g:893:3: ( rule__Quantity__Group__0 )
            {
             before(grammarAccess.getQuantityAccess().getGroup()); 
            // InternalRaspiRover.g:894:3: ( rule__Quantity__Group__0 )
            // InternalRaspiRover.g:894:4: rule__Quantity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Quantity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuantityAccess().getGroup()); 

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
    // $ANTLR end "ruleQuantity"


    // $ANTLR start "entryRuleStringValue_Impl"
    // InternalRaspiRover.g:903:1: entryRuleStringValue_Impl : ruleStringValue_Impl EOF ;
    public final void entryRuleStringValue_Impl() throws RecognitionException {
        try {
            // InternalRaspiRover.g:904:1: ( ruleStringValue_Impl EOF )
            // InternalRaspiRover.g:905:1: ruleStringValue_Impl EOF
            {
             before(grammarAccess.getStringValue_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleStringValue_Impl();

            state._fsp--;

             after(grammarAccess.getStringValue_ImplRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStringValue_Impl"


    // $ANTLR start "ruleStringValue_Impl"
    // InternalRaspiRover.g:912:1: ruleStringValue_Impl : ( ( rule__StringValue_Impl__Group__0 ) ) ;
    public final void ruleStringValue_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:916:2: ( ( ( rule__StringValue_Impl__Group__0 ) ) )
            // InternalRaspiRover.g:917:2: ( ( rule__StringValue_Impl__Group__0 ) )
            {
            // InternalRaspiRover.g:917:2: ( ( rule__StringValue_Impl__Group__0 ) )
            // InternalRaspiRover.g:918:3: ( rule__StringValue_Impl__Group__0 )
            {
             before(grammarAccess.getStringValue_ImplAccess().getGroup()); 
            // InternalRaspiRover.g:919:3: ( rule__StringValue_Impl__Group__0 )
            // InternalRaspiRover.g:919:4: rule__StringValue_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringValue_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringValue_ImplAccess().getGroup()); 

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
    // $ANTLR end "ruleStringValue_Impl"


    // $ANTLR start "entryRuleBooleanValue_Impl"
    // InternalRaspiRover.g:928:1: entryRuleBooleanValue_Impl : ruleBooleanValue_Impl EOF ;
    public final void entryRuleBooleanValue_Impl() throws RecognitionException {
        try {
            // InternalRaspiRover.g:929:1: ( ruleBooleanValue_Impl EOF )
            // InternalRaspiRover.g:930:1: ruleBooleanValue_Impl EOF
            {
             before(grammarAccess.getBooleanValue_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanValue_Impl();

            state._fsp--;

             after(grammarAccess.getBooleanValue_ImplRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBooleanValue_Impl"


    // $ANTLR start "ruleBooleanValue_Impl"
    // InternalRaspiRover.g:937:1: ruleBooleanValue_Impl : ( ( rule__BooleanValue_Impl__Group__0 ) ) ;
    public final void ruleBooleanValue_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:941:2: ( ( ( rule__BooleanValue_Impl__Group__0 ) ) )
            // InternalRaspiRover.g:942:2: ( ( rule__BooleanValue_Impl__Group__0 ) )
            {
            // InternalRaspiRover.g:942:2: ( ( rule__BooleanValue_Impl__Group__0 ) )
            // InternalRaspiRover.g:943:3: ( rule__BooleanValue_Impl__Group__0 )
            {
             before(grammarAccess.getBooleanValue_ImplAccess().getGroup()); 
            // InternalRaspiRover.g:944:3: ( rule__BooleanValue_Impl__Group__0 )
            // InternalRaspiRover.g:944:4: rule__BooleanValue_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanValue_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanValue_ImplAccess().getGroup()); 

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
    // $ANTLR end "ruleBooleanValue_Impl"


    // $ANTLR start "entryRuleCentimeter"
    // InternalRaspiRover.g:953:1: entryRuleCentimeter : ruleCentimeter EOF ;
    public final void entryRuleCentimeter() throws RecognitionException {
        try {
            // InternalRaspiRover.g:954:1: ( ruleCentimeter EOF )
            // InternalRaspiRover.g:955:1: ruleCentimeter EOF
            {
             before(grammarAccess.getCentimeterRule()); 
            pushFollow(FOLLOW_1);
            ruleCentimeter();

            state._fsp--;

             after(grammarAccess.getCentimeterRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCentimeter"


    // $ANTLR start "ruleCentimeter"
    // InternalRaspiRover.g:962:1: ruleCentimeter : ( ( rule__Centimeter__Group__0 ) ) ;
    public final void ruleCentimeter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:966:2: ( ( ( rule__Centimeter__Group__0 ) ) )
            // InternalRaspiRover.g:967:2: ( ( rule__Centimeter__Group__0 ) )
            {
            // InternalRaspiRover.g:967:2: ( ( rule__Centimeter__Group__0 ) )
            // InternalRaspiRover.g:968:3: ( rule__Centimeter__Group__0 )
            {
             before(grammarAccess.getCentimeterAccess().getGroup()); 
            // InternalRaspiRover.g:969:3: ( rule__Centimeter__Group__0 )
            // InternalRaspiRover.g:969:4: rule__Centimeter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Centimeter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCentimeterAccess().getGroup()); 

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
    // $ANTLR end "ruleCentimeter"


    // $ANTLR start "entryRuleMillimeter"
    // InternalRaspiRover.g:978:1: entryRuleMillimeter : ruleMillimeter EOF ;
    public final void entryRuleMillimeter() throws RecognitionException {
        try {
            // InternalRaspiRover.g:979:1: ( ruleMillimeter EOF )
            // InternalRaspiRover.g:980:1: ruleMillimeter EOF
            {
             before(grammarAccess.getMillimeterRule()); 
            pushFollow(FOLLOW_1);
            ruleMillimeter();

            state._fsp--;

             after(grammarAccess.getMillimeterRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMillimeter"


    // $ANTLR start "ruleMillimeter"
    // InternalRaspiRover.g:987:1: ruleMillimeter : ( ( rule__Millimeter__Group__0 ) ) ;
    public final void ruleMillimeter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:991:2: ( ( ( rule__Millimeter__Group__0 ) ) )
            // InternalRaspiRover.g:992:2: ( ( rule__Millimeter__Group__0 ) )
            {
            // InternalRaspiRover.g:992:2: ( ( rule__Millimeter__Group__0 ) )
            // InternalRaspiRover.g:993:3: ( rule__Millimeter__Group__0 )
            {
             before(grammarAccess.getMillimeterAccess().getGroup()); 
            // InternalRaspiRover.g:994:3: ( rule__Millimeter__Group__0 )
            // InternalRaspiRover.g:994:4: rule__Millimeter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Millimeter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMillimeterAccess().getGroup()); 

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
    // $ANTLR end "ruleMillimeter"


    // $ANTLR start "entryRuleMeter"
    // InternalRaspiRover.g:1003:1: entryRuleMeter : ruleMeter EOF ;
    public final void entryRuleMeter() throws RecognitionException {
        try {
            // InternalRaspiRover.g:1004:1: ( ruleMeter EOF )
            // InternalRaspiRover.g:1005:1: ruleMeter EOF
            {
             before(grammarAccess.getMeterRule()); 
            pushFollow(FOLLOW_1);
            ruleMeter();

            state._fsp--;

             after(grammarAccess.getMeterRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMeter"


    // $ANTLR start "ruleMeter"
    // InternalRaspiRover.g:1012:1: ruleMeter : ( ( rule__Meter__Group__0 ) ) ;
    public final void ruleMeter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:1016:2: ( ( ( rule__Meter__Group__0 ) ) )
            // InternalRaspiRover.g:1017:2: ( ( rule__Meter__Group__0 ) )
            {
            // InternalRaspiRover.g:1017:2: ( ( rule__Meter__Group__0 ) )
            // InternalRaspiRover.g:1018:3: ( rule__Meter__Group__0 )
            {
             before(grammarAccess.getMeterAccess().getGroup()); 
            // InternalRaspiRover.g:1019:3: ( rule__Meter__Group__0 )
            // InternalRaspiRover.g:1019:4: rule__Meter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Meter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMeterAccess().getGroup()); 

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
    // $ANTLR end "ruleMeter"


    // $ANTLR start "entryRuleFoot"
    // InternalRaspiRover.g:1028:1: entryRuleFoot : ruleFoot EOF ;
    public final void entryRuleFoot() throws RecognitionException {
        try {
            // InternalRaspiRover.g:1029:1: ( ruleFoot EOF )
            // InternalRaspiRover.g:1030:1: ruleFoot EOF
            {
             before(grammarAccess.getFootRule()); 
            pushFollow(FOLLOW_1);
            ruleFoot();

            state._fsp--;

             after(grammarAccess.getFootRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFoot"


    // $ANTLR start "ruleFoot"
    // InternalRaspiRover.g:1037:1: ruleFoot : ( ( rule__Foot__Group__0 ) ) ;
    public final void ruleFoot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:1041:2: ( ( ( rule__Foot__Group__0 ) ) )
            // InternalRaspiRover.g:1042:2: ( ( rule__Foot__Group__0 ) )
            {
            // InternalRaspiRover.g:1042:2: ( ( rule__Foot__Group__0 ) )
            // InternalRaspiRover.g:1043:3: ( rule__Foot__Group__0 )
            {
             before(grammarAccess.getFootAccess().getGroup()); 
            // InternalRaspiRover.g:1044:3: ( rule__Foot__Group__0 )
            // InternalRaspiRover.g:1044:4: rule__Foot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Foot__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFootAccess().getGroup()); 

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
    // $ANTLR end "ruleFoot"


    // $ANTLR start "entryRuleInch"
    // InternalRaspiRover.g:1053:1: entryRuleInch : ruleInch EOF ;
    public final void entryRuleInch() throws RecognitionException {
        try {
            // InternalRaspiRover.g:1054:1: ( ruleInch EOF )
            // InternalRaspiRover.g:1055:1: ruleInch EOF
            {
             before(grammarAccess.getInchRule()); 
            pushFollow(FOLLOW_1);
            ruleInch();

            state._fsp--;

             after(grammarAccess.getInchRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInch"


    // $ANTLR start "ruleInch"
    // InternalRaspiRover.g:1062:1: ruleInch : ( ( rule__Inch__Group__0 ) ) ;
    public final void ruleInch() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:1066:2: ( ( ( rule__Inch__Group__0 ) ) )
            // InternalRaspiRover.g:1067:2: ( ( rule__Inch__Group__0 ) )
            {
            // InternalRaspiRover.g:1067:2: ( ( rule__Inch__Group__0 ) )
            // InternalRaspiRover.g:1068:3: ( rule__Inch__Group__0 )
            {
             before(grammarAccess.getInchAccess().getGroup()); 
            // InternalRaspiRover.g:1069:3: ( rule__Inch__Group__0 )
            // InternalRaspiRover.g:1069:4: rule__Inch__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Inch__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInchAccess().getGroup()); 

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
    // $ANTLR end "ruleInch"


    // $ANTLR start "entryRuleYard"
    // InternalRaspiRover.g:1078:1: entryRuleYard : ruleYard EOF ;
    public final void entryRuleYard() throws RecognitionException {
        try {
            // InternalRaspiRover.g:1079:1: ( ruleYard EOF )
            // InternalRaspiRover.g:1080:1: ruleYard EOF
            {
             before(grammarAccess.getYardRule()); 
            pushFollow(FOLLOW_1);
            ruleYard();

            state._fsp--;

             after(grammarAccess.getYardRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleYard"


    // $ANTLR start "ruleYard"
    // InternalRaspiRover.g:1087:1: ruleYard : ( ( rule__Yard__Group__0 ) ) ;
    public final void ruleYard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:1091:2: ( ( ( rule__Yard__Group__0 ) ) )
            // InternalRaspiRover.g:1092:2: ( ( rule__Yard__Group__0 ) )
            {
            // InternalRaspiRover.g:1092:2: ( ( rule__Yard__Group__0 ) )
            // InternalRaspiRover.g:1093:3: ( rule__Yard__Group__0 )
            {
             before(grammarAccess.getYardAccess().getGroup()); 
            // InternalRaspiRover.g:1094:3: ( rule__Yard__Group__0 )
            // InternalRaspiRover.g:1094:4: rule__Yard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Yard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getYardAccess().getGroup()); 

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
    // $ANTLR end "ruleYard"


    // $ANTLR start "entryRuleRadian"
    // InternalRaspiRover.g:1103:1: entryRuleRadian : ruleRadian EOF ;
    public final void entryRuleRadian() throws RecognitionException {
        try {
            // InternalRaspiRover.g:1104:1: ( ruleRadian EOF )
            // InternalRaspiRover.g:1105:1: ruleRadian EOF
            {
             before(grammarAccess.getRadianRule()); 
            pushFollow(FOLLOW_1);
            ruleRadian();

            state._fsp--;

             after(grammarAccess.getRadianRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRadian"


    // $ANTLR start "ruleRadian"
    // InternalRaspiRover.g:1112:1: ruleRadian : ( ( rule__Radian__Group__0 ) ) ;
    public final void ruleRadian() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:1116:2: ( ( ( rule__Radian__Group__0 ) ) )
            // InternalRaspiRover.g:1117:2: ( ( rule__Radian__Group__0 ) )
            {
            // InternalRaspiRover.g:1117:2: ( ( rule__Radian__Group__0 ) )
            // InternalRaspiRover.g:1118:3: ( rule__Radian__Group__0 )
            {
             before(grammarAccess.getRadianAccess().getGroup()); 
            // InternalRaspiRover.g:1119:3: ( rule__Radian__Group__0 )
            // InternalRaspiRover.g:1119:4: rule__Radian__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Radian__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRadianAccess().getGroup()); 

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
    // $ANTLR end "ruleRadian"


    // $ANTLR start "entryRuleDegree"
    // InternalRaspiRover.g:1128:1: entryRuleDegree : ruleDegree EOF ;
    public final void entryRuleDegree() throws RecognitionException {
        try {
            // InternalRaspiRover.g:1129:1: ( ruleDegree EOF )
            // InternalRaspiRover.g:1130:1: ruleDegree EOF
            {
             before(grammarAccess.getDegreeRule()); 
            pushFollow(FOLLOW_1);
            ruleDegree();

            state._fsp--;

             after(grammarAccess.getDegreeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDegree"


    // $ANTLR start "ruleDegree"
    // InternalRaspiRover.g:1137:1: ruleDegree : ( ( rule__Degree__Group__0 ) ) ;
    public final void ruleDegree() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:1141:2: ( ( ( rule__Degree__Group__0 ) ) )
            // InternalRaspiRover.g:1142:2: ( ( rule__Degree__Group__0 ) )
            {
            // InternalRaspiRover.g:1142:2: ( ( rule__Degree__Group__0 ) )
            // InternalRaspiRover.g:1143:3: ( rule__Degree__Group__0 )
            {
             before(grammarAccess.getDegreeAccess().getGroup()); 
            // InternalRaspiRover.g:1144:3: ( rule__Degree__Group__0 )
            // InternalRaspiRover.g:1144:4: rule__Degree__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Degree__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDegreeAccess().getGroup()); 

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
    // $ANTLR end "ruleDegree"


    // $ANTLR start "entryRuleTurn"
    // InternalRaspiRover.g:1153:1: entryRuleTurn : ruleTurn EOF ;
    public final void entryRuleTurn() throws RecognitionException {
        try {
            // InternalRaspiRover.g:1154:1: ( ruleTurn EOF )
            // InternalRaspiRover.g:1155:1: ruleTurn EOF
            {
             before(grammarAccess.getTurnRule()); 
            pushFollow(FOLLOW_1);
            ruleTurn();

            state._fsp--;

             after(grammarAccess.getTurnRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTurn"


    // $ANTLR start "ruleTurn"
    // InternalRaspiRover.g:1162:1: ruleTurn : ( ( rule__Turn__Group__0 ) ) ;
    public final void ruleTurn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:1166:2: ( ( ( rule__Turn__Group__0 ) ) )
            // InternalRaspiRover.g:1167:2: ( ( rule__Turn__Group__0 ) )
            {
            // InternalRaspiRover.g:1167:2: ( ( rule__Turn__Group__0 ) )
            // InternalRaspiRover.g:1168:3: ( rule__Turn__Group__0 )
            {
             before(grammarAccess.getTurnAccess().getGroup()); 
            // InternalRaspiRover.g:1169:3: ( rule__Turn__Group__0 )
            // InternalRaspiRover.g:1169:4: rule__Turn__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Turn__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTurnAccess().getGroup()); 

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
    // $ANTLR end "ruleTurn"


    // $ANTLR start "entryRuleGradian"
    // InternalRaspiRover.g:1178:1: entryRuleGradian : ruleGradian EOF ;
    public final void entryRuleGradian() throws RecognitionException {
        try {
            // InternalRaspiRover.g:1179:1: ( ruleGradian EOF )
            // InternalRaspiRover.g:1180:1: ruleGradian EOF
            {
             before(grammarAccess.getGradianRule()); 
            pushFollow(FOLLOW_1);
            ruleGradian();

            state._fsp--;

             after(grammarAccess.getGradianRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGradian"


    // $ANTLR start "ruleGradian"
    // InternalRaspiRover.g:1187:1: ruleGradian : ( ( rule__Gradian__Group__0 ) ) ;
    public final void ruleGradian() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:1191:2: ( ( ( rule__Gradian__Group__0 ) ) )
            // InternalRaspiRover.g:1192:2: ( ( rule__Gradian__Group__0 ) )
            {
            // InternalRaspiRover.g:1192:2: ( ( rule__Gradian__Group__0 ) )
            // InternalRaspiRover.g:1193:3: ( rule__Gradian__Group__0 )
            {
             before(grammarAccess.getGradianAccess().getGroup()); 
            // InternalRaspiRover.g:1194:3: ( rule__Gradian__Group__0 )
            // InternalRaspiRover.g:1194:4: rule__Gradian__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Gradian__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGradianAccess().getGroup()); 

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
    // $ANTLR end "ruleGradian"


    // $ANTLR start "entryRuleNumericExpression"
    // InternalRaspiRover.g:1203:1: entryRuleNumericExpression : ruleNumericExpression EOF ;
    public final void entryRuleNumericExpression() throws RecognitionException {
        try {
            // InternalRaspiRover.g:1204:1: ( ruleNumericExpression EOF )
            // InternalRaspiRover.g:1205:1: ruleNumericExpression EOF
            {
             before(grammarAccess.getNumericExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleNumericExpression();

            state._fsp--;

             after(grammarAccess.getNumericExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNumericExpression"


    // $ANTLR start "ruleNumericExpression"
    // InternalRaspiRover.g:1212:1: ruleNumericExpression : ( ( rule__NumericExpression__Group__0 ) ) ;
    public final void ruleNumericExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:1216:2: ( ( ( rule__NumericExpression__Group__0 ) ) )
            // InternalRaspiRover.g:1217:2: ( ( rule__NumericExpression__Group__0 ) )
            {
            // InternalRaspiRover.g:1217:2: ( ( rule__NumericExpression__Group__0 ) )
            // InternalRaspiRover.g:1218:3: ( rule__NumericExpression__Group__0 )
            {
             before(grammarAccess.getNumericExpressionAccess().getGroup()); 
            // InternalRaspiRover.g:1219:3: ( rule__NumericExpression__Group__0 )
            // InternalRaspiRover.g:1219:4: rule__NumericExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NumericExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumericExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleNumericExpression"


    // $ANTLR start "entryRuleStringExpression"
    // InternalRaspiRover.g:1228:1: entryRuleStringExpression : ruleStringExpression EOF ;
    public final void entryRuleStringExpression() throws RecognitionException {
        try {
            // InternalRaspiRover.g:1229:1: ( ruleStringExpression EOF )
            // InternalRaspiRover.g:1230:1: ruleStringExpression EOF
            {
             before(grammarAccess.getStringExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleStringExpression();

            state._fsp--;

             after(grammarAccess.getStringExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStringExpression"


    // $ANTLR start "ruleStringExpression"
    // InternalRaspiRover.g:1237:1: ruleStringExpression : ( ( rule__StringExpression__Group__0 ) ) ;
    public final void ruleStringExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:1241:2: ( ( ( rule__StringExpression__Group__0 ) ) )
            // InternalRaspiRover.g:1242:2: ( ( rule__StringExpression__Group__0 ) )
            {
            // InternalRaspiRover.g:1242:2: ( ( rule__StringExpression__Group__0 ) )
            // InternalRaspiRover.g:1243:3: ( rule__StringExpression__Group__0 )
            {
             before(grammarAccess.getStringExpressionAccess().getGroup()); 
            // InternalRaspiRover.g:1244:3: ( rule__StringExpression__Group__0 )
            // InternalRaspiRover.g:1244:4: rule__StringExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleStringExpression"


    // $ANTLR start "entryRuleBooleanExpression"
    // InternalRaspiRover.g:1253:1: entryRuleBooleanExpression : ruleBooleanExpression EOF ;
    public final void entryRuleBooleanExpression() throws RecognitionException {
        try {
            // InternalRaspiRover.g:1254:1: ( ruleBooleanExpression EOF )
            // InternalRaspiRover.g:1255:1: ruleBooleanExpression EOF
            {
             before(grammarAccess.getBooleanExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanExpression();

            state._fsp--;

             after(grammarAccess.getBooleanExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBooleanExpression"


    // $ANTLR start "ruleBooleanExpression"
    // InternalRaspiRover.g:1262:1: ruleBooleanExpression : ( ( rule__BooleanExpression__Group__0 ) ) ;
    public final void ruleBooleanExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:1266:2: ( ( ( rule__BooleanExpression__Group__0 ) ) )
            // InternalRaspiRover.g:1267:2: ( ( rule__BooleanExpression__Group__0 ) )
            {
            // InternalRaspiRover.g:1267:2: ( ( rule__BooleanExpression__Group__0 ) )
            // InternalRaspiRover.g:1268:3: ( rule__BooleanExpression__Group__0 )
            {
             before(grammarAccess.getBooleanExpressionAccess().getGroup()); 
            // InternalRaspiRover.g:1269:3: ( rule__BooleanExpression__Group__0 )
            // InternalRaspiRover.g:1269:4: rule__BooleanExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleBooleanExpression"


    // $ANTLR start "entryRulePin_Impl"
    // InternalRaspiRover.g:1278:1: entryRulePin_Impl : rulePin_Impl EOF ;
    public final void entryRulePin_Impl() throws RecognitionException {
        try {
            // InternalRaspiRover.g:1279:1: ( rulePin_Impl EOF )
            // InternalRaspiRover.g:1280:1: rulePin_Impl EOF
            {
             before(grammarAccess.getPin_ImplRule()); 
            pushFollow(FOLLOW_1);
            rulePin_Impl();

            state._fsp--;

             after(grammarAccess.getPin_ImplRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePin_Impl"


    // $ANTLR start "rulePin_Impl"
    // InternalRaspiRover.g:1287:1: rulePin_Impl : ( ( rule__Pin_Impl__Group__0 ) ) ;
    public final void rulePin_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:1291:2: ( ( ( rule__Pin_Impl__Group__0 ) ) )
            // InternalRaspiRover.g:1292:2: ( ( rule__Pin_Impl__Group__0 ) )
            {
            // InternalRaspiRover.g:1292:2: ( ( rule__Pin_Impl__Group__0 ) )
            // InternalRaspiRover.g:1293:3: ( rule__Pin_Impl__Group__0 )
            {
             before(grammarAccess.getPin_ImplAccess().getGroup()); 
            // InternalRaspiRover.g:1294:3: ( rule__Pin_Impl__Group__0 )
            // InternalRaspiRover.g:1294:4: rule__Pin_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Pin_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPin_ImplAccess().getGroup()); 

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
    // $ANTLR end "rulePin_Impl"


    // $ANTLR start "ruleNumericOperator"
    // InternalRaspiRover.g:1303:1: ruleNumericOperator : ( ( rule__NumericOperator__Alternatives ) ) ;
    public final void ruleNumericOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:1307:1: ( ( ( rule__NumericOperator__Alternatives ) ) )
            // InternalRaspiRover.g:1308:2: ( ( rule__NumericOperator__Alternatives ) )
            {
            // InternalRaspiRover.g:1308:2: ( ( rule__NumericOperator__Alternatives ) )
            // InternalRaspiRover.g:1309:3: ( rule__NumericOperator__Alternatives )
            {
             before(grammarAccess.getNumericOperatorAccess().getAlternatives()); 
            // InternalRaspiRover.g:1310:3: ( rule__NumericOperator__Alternatives )
            // InternalRaspiRover.g:1310:4: rule__NumericOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NumericOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNumericOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleNumericOperator"


    // $ANTLR start "ruleStringOperator"
    // InternalRaspiRover.g:1319:1: ruleStringOperator : ( ( rule__StringOperator__Alternatives ) ) ;
    public final void ruleStringOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:1323:1: ( ( ( rule__StringOperator__Alternatives ) ) )
            // InternalRaspiRover.g:1324:2: ( ( rule__StringOperator__Alternatives ) )
            {
            // InternalRaspiRover.g:1324:2: ( ( rule__StringOperator__Alternatives ) )
            // InternalRaspiRover.g:1325:3: ( rule__StringOperator__Alternatives )
            {
             before(grammarAccess.getStringOperatorAccess().getAlternatives()); 
            // InternalRaspiRover.g:1326:3: ( rule__StringOperator__Alternatives )
            // InternalRaspiRover.g:1326:4: rule__StringOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__StringOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStringOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleStringOperator"


    // $ANTLR start "ruleBooleanOperator"
    // InternalRaspiRover.g:1335:1: ruleBooleanOperator : ( ( rule__BooleanOperator__Alternatives ) ) ;
    public final void ruleBooleanOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:1339:1: ( ( ( rule__BooleanOperator__Alternatives ) ) )
            // InternalRaspiRover.g:1340:2: ( ( rule__BooleanOperator__Alternatives ) )
            {
            // InternalRaspiRover.g:1340:2: ( ( rule__BooleanOperator__Alternatives ) )
            // InternalRaspiRover.g:1341:3: ( rule__BooleanOperator__Alternatives )
            {
             before(grammarAccess.getBooleanOperatorAccess().getAlternatives()); 
            // InternalRaspiRover.g:1342:3: ( rule__BooleanOperator__Alternatives )
            // InternalRaspiRover.g:1342:4: rule__BooleanOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BooleanOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBooleanOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBooleanOperator"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalRaspiRover.g:1350:1: rule__Statement__Alternatives : ( ( ruleVarAssignment ) | ( ruleConditional ) | ( ruleLoop ) | ( ruleRclBlock ) | ( ruleForwardAction ) | ( ruleForwardMinAction ) | ( ruleBackwardAction ) | ( ruleBackwardMinAction ) | ( ruleTurnAction ) | ( ruleTurnDegAction ) | ( ruleStopAction ) | ( ruleLogAction ) | ( ruleSendAction ) | ( ruleVarRef ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:1354:1: ( ( ruleVarAssignment ) | ( ruleConditional ) | ( ruleLoop ) | ( ruleRclBlock ) | ( ruleForwardAction ) | ( ruleForwardMinAction ) | ( ruleBackwardAction ) | ( ruleBackwardMinAction ) | ( ruleTurnAction ) | ( ruleTurnDegAction ) | ( ruleStopAction ) | ( ruleLogAction ) | ( ruleSendAction ) | ( ruleVarRef ) )
            int alt1=14;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalRaspiRover.g:1355:2: ( ruleVarAssignment )
                    {
                    // InternalRaspiRover.g:1355:2: ( ruleVarAssignment )
                    // InternalRaspiRover.g:1356:3: ruleVarAssignment
                    {
                     before(grammarAccess.getStatementAccess().getVarAssignmentParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleVarAssignment();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getVarAssignmentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRaspiRover.g:1361:2: ( ruleConditional )
                    {
                    // InternalRaspiRover.g:1361:2: ( ruleConditional )
                    // InternalRaspiRover.g:1362:3: ruleConditional
                    {
                     before(grammarAccess.getStatementAccess().getConditionalParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleConditional();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getConditionalParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRaspiRover.g:1367:2: ( ruleLoop )
                    {
                    // InternalRaspiRover.g:1367:2: ( ruleLoop )
                    // InternalRaspiRover.g:1368:3: ruleLoop
                    {
                     before(grammarAccess.getStatementAccess().getLoopParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleLoop();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getLoopParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRaspiRover.g:1373:2: ( ruleRclBlock )
                    {
                    // InternalRaspiRover.g:1373:2: ( ruleRclBlock )
                    // InternalRaspiRover.g:1374:3: ruleRclBlock
                    {
                     before(grammarAccess.getStatementAccess().getRclBlockParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleRclBlock();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getRclBlockParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRaspiRover.g:1379:2: ( ruleForwardAction )
                    {
                    // InternalRaspiRover.g:1379:2: ( ruleForwardAction )
                    // InternalRaspiRover.g:1380:3: ruleForwardAction
                    {
                     before(grammarAccess.getStatementAccess().getForwardActionParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleForwardAction();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getForwardActionParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRaspiRover.g:1385:2: ( ruleForwardMinAction )
                    {
                    // InternalRaspiRover.g:1385:2: ( ruleForwardMinAction )
                    // InternalRaspiRover.g:1386:3: ruleForwardMinAction
                    {
                     before(grammarAccess.getStatementAccess().getForwardMinActionParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleForwardMinAction();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getForwardMinActionParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalRaspiRover.g:1391:2: ( ruleBackwardAction )
                    {
                    // InternalRaspiRover.g:1391:2: ( ruleBackwardAction )
                    // InternalRaspiRover.g:1392:3: ruleBackwardAction
                    {
                     before(grammarAccess.getStatementAccess().getBackwardActionParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleBackwardAction();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getBackwardActionParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalRaspiRover.g:1397:2: ( ruleBackwardMinAction )
                    {
                    // InternalRaspiRover.g:1397:2: ( ruleBackwardMinAction )
                    // InternalRaspiRover.g:1398:3: ruleBackwardMinAction
                    {
                     before(grammarAccess.getStatementAccess().getBackwardMinActionParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleBackwardMinAction();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getBackwardMinActionParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalRaspiRover.g:1403:2: ( ruleTurnAction )
                    {
                    // InternalRaspiRover.g:1403:2: ( ruleTurnAction )
                    // InternalRaspiRover.g:1404:3: ruleTurnAction
                    {
                     before(grammarAccess.getStatementAccess().getTurnActionParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleTurnAction();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getTurnActionParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalRaspiRover.g:1409:2: ( ruleTurnDegAction )
                    {
                    // InternalRaspiRover.g:1409:2: ( ruleTurnDegAction )
                    // InternalRaspiRover.g:1410:3: ruleTurnDegAction
                    {
                     before(grammarAccess.getStatementAccess().getTurnDegActionParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleTurnDegAction();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getTurnDegActionParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalRaspiRover.g:1415:2: ( ruleStopAction )
                    {
                    // InternalRaspiRover.g:1415:2: ( ruleStopAction )
                    // InternalRaspiRover.g:1416:3: ruleStopAction
                    {
                     before(grammarAccess.getStatementAccess().getStopActionParserRuleCall_10()); 
                    pushFollow(FOLLOW_2);
                    ruleStopAction();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getStopActionParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalRaspiRover.g:1421:2: ( ruleLogAction )
                    {
                    // InternalRaspiRover.g:1421:2: ( ruleLogAction )
                    // InternalRaspiRover.g:1422:3: ruleLogAction
                    {
                     before(grammarAccess.getStatementAccess().getLogActionParserRuleCall_11()); 
                    pushFollow(FOLLOW_2);
                    ruleLogAction();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getLogActionParserRuleCall_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalRaspiRover.g:1427:2: ( ruleSendAction )
                    {
                    // InternalRaspiRover.g:1427:2: ( ruleSendAction )
                    // InternalRaspiRover.g:1428:3: ruleSendAction
                    {
                     before(grammarAccess.getStatementAccess().getSendActionParserRuleCall_12()); 
                    pushFollow(FOLLOW_2);
                    ruleSendAction();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getSendActionParserRuleCall_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalRaspiRover.g:1433:2: ( ruleVarRef )
                    {
                    // InternalRaspiRover.g:1433:2: ( ruleVarRef )
                    // InternalRaspiRover.g:1434:3: ruleVarRef
                    {
                     before(grammarAccess.getStatementAccess().getVarRefParserRuleCall_13()); 
                    pushFollow(FOLLOW_2);
                    ruleVarRef();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getVarRefParserRuleCall_13()); 

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
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__RoverValue__Alternatives"
    // InternalRaspiRover.g:1443:1: rule__RoverValue__Alternatives : ( ( ruleNumberValue ) | ( ruleStringValue ) | ( ruleBooleanValue ) );
    public final void rule__RoverValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:1447:1: ( ( ruleNumberValue ) | ( ruleStringValue ) | ( ruleBooleanValue ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_DOUBLE:
            case 43:
            case 44:
                {
                alt2=1;
                }
                break;
            case RULE_ID:
                {
                alt2=1;
                }
                break;
            case RULE_STRING:
            case 45:
                {
                alt2=2;
                }
                break;
            case 46:
            case 59:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalRaspiRover.g:1448:2: ( ruleNumberValue )
                    {
                    // InternalRaspiRover.g:1448:2: ( ruleNumberValue )
                    // InternalRaspiRover.g:1449:3: ruleNumberValue
                    {
                     before(grammarAccess.getRoverValueAccess().getNumberValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNumberValue();

                    state._fsp--;

                     after(grammarAccess.getRoverValueAccess().getNumberValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRaspiRover.g:1454:2: ( ruleStringValue )
                    {
                    // InternalRaspiRover.g:1454:2: ( ruleStringValue )
                    // InternalRaspiRover.g:1455:3: ruleStringValue
                    {
                     before(grammarAccess.getRoverValueAccess().getStringValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStringValue();

                    state._fsp--;

                     after(grammarAccess.getRoverValueAccess().getStringValueParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRaspiRover.g:1460:2: ( ruleBooleanValue )
                    {
                    // InternalRaspiRover.g:1460:2: ( ruleBooleanValue )
                    // InternalRaspiRover.g:1461:3: ruleBooleanValue
                    {
                     before(grammarAccess.getRoverValueAccess().getBooleanValueParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleanValue();

                    state._fsp--;

                     after(grammarAccess.getRoverValueAccess().getBooleanValueParserRuleCall_2()); 

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
    // $ANTLR end "rule__RoverValue__Alternatives"


    // $ANTLR start "rule__RoverExpression__Alternatives"
    // InternalRaspiRover.g:1470:1: rule__RoverExpression__Alternatives : ( ( ruleNumericExpression ) | ( ruleStringExpression ) | ( ruleBooleanExpression ) );
    public final void rule__RoverExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:1474:1: ( ( ruleNumericExpression ) | ( ruleStringExpression ) | ( ruleBooleanExpression ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_DOUBLE:
            case 43:
            case 44:
                {
                alt3=1;
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case 13:
                    {
                    switch ( input.LA(3) ) {
                    case 46:
                    case 59:
                        {
                        alt3=3;
                        }
                        break;
                    case RULE_ID:
                    case RULE_DOUBLE:
                    case 43:
                    case 44:
                        {
                        alt3=1;
                        }
                        break;
                    case RULE_STRING:
                    case 45:
                        {
                        alt3=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 5, input);

                        throw nvae;
                    }

                    }
                    break;
                case 18:
                    {
                    switch ( input.LA(3) ) {
                    case RULE_STRING:
                    case 45:
                        {
                        alt3=2;
                        }
                        break;
                    case RULE_ID:
                        {
                        alt3=2;
                        }
                        break;
                    case 46:
                    case 59:
                        {
                        alt3=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 6, input);

                        throw nvae;
                    }

                    }
                    break;
                case 12:
                case 14:
                case 15:
                case 16:
                case 17:
                    {
                    alt3=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }

                }
                break;
            case RULE_STRING:
            case 45:
                {
                alt3=2;
                }
                break;
            case 46:
            case 59:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalRaspiRover.g:1475:2: ( ruleNumericExpression )
                    {
                    // InternalRaspiRover.g:1475:2: ( ruleNumericExpression )
                    // InternalRaspiRover.g:1476:3: ruleNumericExpression
                    {
                     before(grammarAccess.getRoverExpressionAccess().getNumericExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNumericExpression();

                    state._fsp--;

                     after(grammarAccess.getRoverExpressionAccess().getNumericExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRaspiRover.g:1481:2: ( ruleStringExpression )
                    {
                    // InternalRaspiRover.g:1481:2: ( ruleStringExpression )
                    // InternalRaspiRover.g:1482:3: ruleStringExpression
                    {
                     before(grammarAccess.getRoverExpressionAccess().getStringExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStringExpression();

                    state._fsp--;

                     after(grammarAccess.getRoverExpressionAccess().getStringExpressionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRaspiRover.g:1487:2: ( ruleBooleanExpression )
                    {
                    // InternalRaspiRover.g:1487:2: ( ruleBooleanExpression )
                    // InternalRaspiRover.g:1488:3: ruleBooleanExpression
                    {
                     before(grammarAccess.getRoverExpressionAccess().getBooleanExpressionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleanExpression();

                    state._fsp--;

                     after(grammarAccess.getRoverExpressionAccess().getBooleanExpressionParserRuleCall_2()); 

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
    // $ANTLR end "rule__RoverExpression__Alternatives"


    // $ANTLR start "rule__NumberValue__Alternatives"
    // InternalRaspiRover.g:1497:1: rule__NumberValue__Alternatives : ( ( ruleNumberValue_Impl ) | ( ruleTemperatureQuery ) | ( ruleHumidityQuery ) | ( ruleVarRef ) );
    public final void rule__NumberValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:1501:1: ( ( ruleNumberValue_Impl ) | ( ruleTemperatureQuery ) | ( ruleHumidityQuery ) | ( ruleVarRef ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_DOUBLE:
                {
                alt4=1;
                }
                break;
            case 43:
                {
                alt4=2;
                }
                break;
            case 44:
                {
                alt4=3;
                }
                break;
            case RULE_ID:
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
                    // InternalRaspiRover.g:1502:2: ( ruleNumberValue_Impl )
                    {
                    // InternalRaspiRover.g:1502:2: ( ruleNumberValue_Impl )
                    // InternalRaspiRover.g:1503:3: ruleNumberValue_Impl
                    {
                     before(grammarAccess.getNumberValueAccess().getNumberValue_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNumberValue_Impl();

                    state._fsp--;

                     after(grammarAccess.getNumberValueAccess().getNumberValue_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRaspiRover.g:1508:2: ( ruleTemperatureQuery )
                    {
                    // InternalRaspiRover.g:1508:2: ( ruleTemperatureQuery )
                    // InternalRaspiRover.g:1509:3: ruleTemperatureQuery
                    {
                     before(grammarAccess.getNumberValueAccess().getTemperatureQueryParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTemperatureQuery();

                    state._fsp--;

                     after(grammarAccess.getNumberValueAccess().getTemperatureQueryParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRaspiRover.g:1514:2: ( ruleHumidityQuery )
                    {
                    // InternalRaspiRover.g:1514:2: ( ruleHumidityQuery )
                    // InternalRaspiRover.g:1515:3: ruleHumidityQuery
                    {
                     before(grammarAccess.getNumberValueAccess().getHumidityQueryParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleHumidityQuery();

                    state._fsp--;

                     after(grammarAccess.getNumberValueAccess().getHumidityQueryParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRaspiRover.g:1520:2: ( ruleVarRef )
                    {
                    // InternalRaspiRover.g:1520:2: ( ruleVarRef )
                    // InternalRaspiRover.g:1521:3: ruleVarRef
                    {
                     before(grammarAccess.getNumberValueAccess().getVarRefParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleVarRef();

                    state._fsp--;

                     after(grammarAccess.getNumberValueAccess().getVarRefParserRuleCall_3()); 

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
    // $ANTLR end "rule__NumberValue__Alternatives"


    // $ANTLR start "rule__Unit__Alternatives"
    // InternalRaspiRover.g:1530:1: rule__Unit__Alternatives : ( ( ruleCentimeter ) | ( ruleMillimeter ) | ( ruleMeter ) | ( ruleFoot ) | ( ruleInch ) | ( ruleYard ) | ( ruleRadian ) | ( ruleDegree ) | ( ruleTurn ) | ( ruleGradian ) );
    public final void rule__Unit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:1534:1: ( ( ruleCentimeter ) | ( ruleMillimeter ) | ( ruleMeter ) | ( ruleFoot ) | ( ruleInch ) | ( ruleYard ) | ( ruleRadian ) | ( ruleDegree ) | ( ruleTurn ) | ( ruleGradian ) )
            int alt5=10;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt5=1;
                }
                break;
            case 49:
                {
                alt5=2;
                }
                break;
            case 50:
                {
                alt5=3;
                }
                break;
            case 51:
                {
                alt5=4;
                }
                break;
            case 52:
                {
                alt5=5;
                }
                break;
            case 53:
                {
                alt5=6;
                }
                break;
            case 54:
                {
                alt5=7;
                }
                break;
            case 55:
                {
                alt5=8;
                }
                break;
            case 39:
                {
                alt5=9;
                }
                break;
            case 56:
                {
                alt5=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalRaspiRover.g:1535:2: ( ruleCentimeter )
                    {
                    // InternalRaspiRover.g:1535:2: ( ruleCentimeter )
                    // InternalRaspiRover.g:1536:3: ruleCentimeter
                    {
                     before(grammarAccess.getUnitAccess().getCentimeterParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCentimeter();

                    state._fsp--;

                     after(grammarAccess.getUnitAccess().getCentimeterParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRaspiRover.g:1541:2: ( ruleMillimeter )
                    {
                    // InternalRaspiRover.g:1541:2: ( ruleMillimeter )
                    // InternalRaspiRover.g:1542:3: ruleMillimeter
                    {
                     before(grammarAccess.getUnitAccess().getMillimeterParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMillimeter();

                    state._fsp--;

                     after(grammarAccess.getUnitAccess().getMillimeterParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRaspiRover.g:1547:2: ( ruleMeter )
                    {
                    // InternalRaspiRover.g:1547:2: ( ruleMeter )
                    // InternalRaspiRover.g:1548:3: ruleMeter
                    {
                     before(grammarAccess.getUnitAccess().getMeterParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMeter();

                    state._fsp--;

                     after(grammarAccess.getUnitAccess().getMeterParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRaspiRover.g:1553:2: ( ruleFoot )
                    {
                    // InternalRaspiRover.g:1553:2: ( ruleFoot )
                    // InternalRaspiRover.g:1554:3: ruleFoot
                    {
                     before(grammarAccess.getUnitAccess().getFootParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleFoot();

                    state._fsp--;

                     after(grammarAccess.getUnitAccess().getFootParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRaspiRover.g:1559:2: ( ruleInch )
                    {
                    // InternalRaspiRover.g:1559:2: ( ruleInch )
                    // InternalRaspiRover.g:1560:3: ruleInch
                    {
                     before(grammarAccess.getUnitAccess().getInchParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleInch();

                    state._fsp--;

                     after(grammarAccess.getUnitAccess().getInchParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRaspiRover.g:1565:2: ( ruleYard )
                    {
                    // InternalRaspiRover.g:1565:2: ( ruleYard )
                    // InternalRaspiRover.g:1566:3: ruleYard
                    {
                     before(grammarAccess.getUnitAccess().getYardParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleYard();

                    state._fsp--;

                     after(grammarAccess.getUnitAccess().getYardParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalRaspiRover.g:1571:2: ( ruleRadian )
                    {
                    // InternalRaspiRover.g:1571:2: ( ruleRadian )
                    // InternalRaspiRover.g:1572:3: ruleRadian
                    {
                     before(grammarAccess.getUnitAccess().getRadianParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleRadian();

                    state._fsp--;

                     after(grammarAccess.getUnitAccess().getRadianParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalRaspiRover.g:1577:2: ( ruleDegree )
                    {
                    // InternalRaspiRover.g:1577:2: ( ruleDegree )
                    // InternalRaspiRover.g:1578:3: ruleDegree
                    {
                     before(grammarAccess.getUnitAccess().getDegreeParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleDegree();

                    state._fsp--;

                     after(grammarAccess.getUnitAccess().getDegreeParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalRaspiRover.g:1583:2: ( ruleTurn )
                    {
                    // InternalRaspiRover.g:1583:2: ( ruleTurn )
                    // InternalRaspiRover.g:1584:3: ruleTurn
                    {
                     before(grammarAccess.getUnitAccess().getTurnParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleTurn();

                    state._fsp--;

                     after(grammarAccess.getUnitAccess().getTurnParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalRaspiRover.g:1589:2: ( ruleGradian )
                    {
                    // InternalRaspiRover.g:1589:2: ( ruleGradian )
                    // InternalRaspiRover.g:1590:3: ruleGradian
                    {
                     before(grammarAccess.getUnitAccess().getGradianParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleGradian();

                    state._fsp--;

                     after(grammarAccess.getUnitAccess().getGradianParserRuleCall_9()); 

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
    // $ANTLR end "rule__Unit__Alternatives"


    // $ANTLR start "rule__StringValue__Alternatives"
    // InternalRaspiRover.g:1599:1: rule__StringValue__Alternatives : ( ( ruleStringValue_Impl ) | ( ruleMessageQuery ) | ( ruleVarRef ) );
    public final void rule__StringValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:1603:1: ( ( ruleStringValue_Impl ) | ( ruleMessageQuery ) | ( ruleVarRef ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt6=1;
                }
                break;
            case 45:
                {
                alt6=2;
                }
                break;
            case RULE_ID:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalRaspiRover.g:1604:2: ( ruleStringValue_Impl )
                    {
                    // InternalRaspiRover.g:1604:2: ( ruleStringValue_Impl )
                    // InternalRaspiRover.g:1605:3: ruleStringValue_Impl
                    {
                     before(grammarAccess.getStringValueAccess().getStringValue_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStringValue_Impl();

                    state._fsp--;

                     after(grammarAccess.getStringValueAccess().getStringValue_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRaspiRover.g:1610:2: ( ruleMessageQuery )
                    {
                    // InternalRaspiRover.g:1610:2: ( ruleMessageQuery )
                    // InternalRaspiRover.g:1611:3: ruleMessageQuery
                    {
                     before(grammarAccess.getStringValueAccess().getMessageQueryParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMessageQuery();

                    state._fsp--;

                     after(grammarAccess.getStringValueAccess().getMessageQueryParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRaspiRover.g:1616:2: ( ruleVarRef )
                    {
                    // InternalRaspiRover.g:1616:2: ( ruleVarRef )
                    // InternalRaspiRover.g:1617:3: ruleVarRef
                    {
                     before(grammarAccess.getStringValueAccess().getVarRefParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleVarRef();

                    state._fsp--;

                     after(grammarAccess.getStringValueAccess().getVarRefParserRuleCall_2()); 

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
    // $ANTLR end "rule__StringValue__Alternatives"


    // $ANTLR start "rule__BooleanValue__Alternatives"
    // InternalRaspiRover.g:1626:1: rule__BooleanValue__Alternatives : ( ( ruleBooleanValue_Impl ) | ( ruleObstacleQuery ) | ( ruleVarRef ) );
    public final void rule__BooleanValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:1630:1: ( ( ruleBooleanValue_Impl ) | ( ruleObstacleQuery ) | ( ruleVarRef ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt7=1;
                }
                break;
            case 46:
                {
                alt7=2;
                }
                break;
            case RULE_ID:
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
                    // InternalRaspiRover.g:1631:2: ( ruleBooleanValue_Impl )
                    {
                    // InternalRaspiRover.g:1631:2: ( ruleBooleanValue_Impl )
                    // InternalRaspiRover.g:1632:3: ruleBooleanValue_Impl
                    {
                     before(grammarAccess.getBooleanValueAccess().getBooleanValue_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleanValue_Impl();

                    state._fsp--;

                     after(grammarAccess.getBooleanValueAccess().getBooleanValue_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRaspiRover.g:1637:2: ( ruleObstacleQuery )
                    {
                    // InternalRaspiRover.g:1637:2: ( ruleObstacleQuery )
                    // InternalRaspiRover.g:1638:3: ruleObstacleQuery
                    {
                     before(grammarAccess.getBooleanValueAccess().getObstacleQueryParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleObstacleQuery();

                    state._fsp--;

                     after(grammarAccess.getBooleanValueAccess().getObstacleQueryParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRaspiRover.g:1643:2: ( ruleVarRef )
                    {
                    // InternalRaspiRover.g:1643:2: ( ruleVarRef )
                    // InternalRaspiRover.g:1644:3: ruleVarRef
                    {
                     before(grammarAccess.getBooleanValueAccess().getVarRefParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleVarRef();

                    state._fsp--;

                     after(grammarAccess.getBooleanValueAccess().getVarRefParserRuleCall_2()); 

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
    // $ANTLR end "rule__BooleanValue__Alternatives"


    // $ANTLR start "rule__NumericOperator__Alternatives"
    // InternalRaspiRover.g:1653:1: rule__NumericOperator__Alternatives : ( ( ( '<' ) ) | ( ( '==' ) ) | ( ( '<>' ) ) | ( ( '>' ) ) | ( ( '<=' ) ) | ( ( '>=' ) ) );
    public final void rule__NumericOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:1657:1: ( ( ( '<' ) ) | ( ( '==' ) ) | ( ( '<>' ) ) | ( ( '>' ) ) | ( ( '<=' ) ) | ( ( '>=' ) ) )
            int alt8=6;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt8=1;
                }
                break;
            case 13:
                {
                alt8=2;
                }
                break;
            case 14:
                {
                alt8=3;
                }
                break;
            case 15:
                {
                alt8=4;
                }
                break;
            case 16:
                {
                alt8=5;
                }
                break;
            case 17:
                {
                alt8=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalRaspiRover.g:1658:2: ( ( '<' ) )
                    {
                    // InternalRaspiRover.g:1658:2: ( ( '<' ) )
                    // InternalRaspiRover.g:1659:3: ( '<' )
                    {
                     before(grammarAccess.getNumericOperatorAccess().getLtEnumLiteralDeclaration_0()); 
                    // InternalRaspiRover.g:1660:3: ( '<' )
                    // InternalRaspiRover.g:1660:4: '<'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getNumericOperatorAccess().getLtEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRaspiRover.g:1664:2: ( ( '==' ) )
                    {
                    // InternalRaspiRover.g:1664:2: ( ( '==' ) )
                    // InternalRaspiRover.g:1665:3: ( '==' )
                    {
                     before(grammarAccess.getNumericOperatorAccess().getEqEnumLiteralDeclaration_1()); 
                    // InternalRaspiRover.g:1666:3: ( '==' )
                    // InternalRaspiRover.g:1666:4: '=='
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getNumericOperatorAccess().getEqEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRaspiRover.g:1670:2: ( ( '<>' ) )
                    {
                    // InternalRaspiRover.g:1670:2: ( ( '<>' ) )
                    // InternalRaspiRover.g:1671:3: ( '<>' )
                    {
                     before(grammarAccess.getNumericOperatorAccess().getNeqEnumLiteralDeclaration_2()); 
                    // InternalRaspiRover.g:1672:3: ( '<>' )
                    // InternalRaspiRover.g:1672:4: '<>'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getNumericOperatorAccess().getNeqEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRaspiRover.g:1676:2: ( ( '>' ) )
                    {
                    // InternalRaspiRover.g:1676:2: ( ( '>' ) )
                    // InternalRaspiRover.g:1677:3: ( '>' )
                    {
                     before(grammarAccess.getNumericOperatorAccess().getGtEnumLiteralDeclaration_3()); 
                    // InternalRaspiRover.g:1678:3: ( '>' )
                    // InternalRaspiRover.g:1678:4: '>'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getNumericOperatorAccess().getGtEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRaspiRover.g:1682:2: ( ( '<=' ) )
                    {
                    // InternalRaspiRover.g:1682:2: ( ( '<=' ) )
                    // InternalRaspiRover.g:1683:3: ( '<=' )
                    {
                     before(grammarAccess.getNumericOperatorAccess().getLeqEnumLiteralDeclaration_4()); 
                    // InternalRaspiRover.g:1684:3: ( '<=' )
                    // InternalRaspiRover.g:1684:4: '<='
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getNumericOperatorAccess().getLeqEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRaspiRover.g:1688:2: ( ( '>=' ) )
                    {
                    // InternalRaspiRover.g:1688:2: ( ( '>=' ) )
                    // InternalRaspiRover.g:1689:3: ( '>=' )
                    {
                     before(grammarAccess.getNumericOperatorAccess().getGeqEnumLiteralDeclaration_5()); 
                    // InternalRaspiRover.g:1690:3: ( '>=' )
                    // InternalRaspiRover.g:1690:4: '>='
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getNumericOperatorAccess().getGeqEnumLiteralDeclaration_5()); 

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
    // $ANTLR end "rule__NumericOperator__Alternatives"


    // $ANTLR start "rule__StringOperator__Alternatives"
    // InternalRaspiRover.g:1698:1: rule__StringOperator__Alternatives : ( ( ( '==' ) ) | ( ( '!=' ) ) );
    public final void rule__StringOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:1702:1: ( ( ( '==' ) ) | ( ( '!=' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==13) ) {
                alt9=1;
            }
            else if ( (LA9_0==18) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalRaspiRover.g:1703:2: ( ( '==' ) )
                    {
                    // InternalRaspiRover.g:1703:2: ( ( '==' ) )
                    // InternalRaspiRover.g:1704:3: ( '==' )
                    {
                     before(grammarAccess.getStringOperatorAccess().getEqEnumLiteralDeclaration_0()); 
                    // InternalRaspiRover.g:1705:3: ( '==' )
                    // InternalRaspiRover.g:1705:4: '=='
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getStringOperatorAccess().getEqEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRaspiRover.g:1709:2: ( ( '!=' ) )
                    {
                    // InternalRaspiRover.g:1709:2: ( ( '!=' ) )
                    // InternalRaspiRover.g:1710:3: ( '!=' )
                    {
                     before(grammarAccess.getStringOperatorAccess().getNeqEnumLiteralDeclaration_1()); 
                    // InternalRaspiRover.g:1711:3: ( '!=' )
                    // InternalRaspiRover.g:1711:4: '!='
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getStringOperatorAccess().getNeqEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__StringOperator__Alternatives"


    // $ANTLR start "rule__BooleanOperator__Alternatives"
    // InternalRaspiRover.g:1719:1: rule__BooleanOperator__Alternatives : ( ( ( '==' ) ) | ( ( '!=' ) ) );
    public final void rule__BooleanOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:1723:1: ( ( ( '==' ) ) | ( ( '!=' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13) ) {
                alt10=1;
            }
            else if ( (LA10_0==18) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalRaspiRover.g:1724:2: ( ( '==' ) )
                    {
                    // InternalRaspiRover.g:1724:2: ( ( '==' ) )
                    // InternalRaspiRover.g:1725:3: ( '==' )
                    {
                     before(grammarAccess.getBooleanOperatorAccess().getEqEnumLiteralDeclaration_0()); 
                    // InternalRaspiRover.g:1726:3: ( '==' )
                    // InternalRaspiRover.g:1726:4: '=='
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getBooleanOperatorAccess().getEqEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRaspiRover.g:1730:2: ( ( '!=' ) )
                    {
                    // InternalRaspiRover.g:1730:2: ( ( '!=' ) )
                    // InternalRaspiRover.g:1731:3: ( '!=' )
                    {
                     before(grammarAccess.getBooleanOperatorAccess().getNeqEnumLiteralDeclaration_1()); 
                    // InternalRaspiRover.g:1732:3: ( '!=' )
                    // InternalRaspiRover.g:1732:4: '!='
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getBooleanOperatorAccess().getNeqEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__BooleanOperator__Alternatives"


    // $ANTLR start "rule__Project__Group__0"
    // InternalRaspiRover.g:1740:1: rule__Project__Group__0 : rule__Project__Group__0__Impl rule__Project__Group__1 ;
    public final void rule__Project__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:1744:1: ( rule__Project__Group__0__Impl rule__Project__Group__1 )
            // InternalRaspiRover.g:1745:2: rule__Project__Group__0__Impl rule__Project__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Project__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__1();

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
    // $ANTLR end "rule__Project__Group__0"


    // $ANTLR start "rule__Project__Group__0__Impl"
    // InternalRaspiRover.g:1752:1: rule__Project__Group__0__Impl : ( 'raspi-project' ) ;
    public final void rule__Project__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:1756:1: ( ( 'raspi-project' ) )
            // InternalRaspiRover.g:1757:1: ( 'raspi-project' )
            {
            // InternalRaspiRover.g:1757:1: ( 'raspi-project' )
            // InternalRaspiRover.g:1758:2: 'raspi-project'
            {
             before(grammarAccess.getProjectAccess().getRaspiProjectKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getRaspiProjectKeyword_0()); 

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
    // $ANTLR end "rule__Project__Group__0__Impl"


    // $ANTLR start "rule__Project__Group__1"
    // InternalRaspiRover.g:1767:1: rule__Project__Group__1 : rule__Project__Group__1__Impl rule__Project__Group__2 ;
    public final void rule__Project__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:1771:1: ( rule__Project__Group__1__Impl rule__Project__Group__2 )
            // InternalRaspiRover.g:1772:2: rule__Project__Group__1__Impl rule__Project__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Project__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__2();

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
    // $ANTLR end "rule__Project__Group__1"


    // $ANTLR start "rule__Project__Group__1__Impl"
    // InternalRaspiRover.g:1779:1: rule__Project__Group__1__Impl : ( '{' ) ;
    public final void rule__Project__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:1783:1: ( ( '{' ) )
            // InternalRaspiRover.g:1784:1: ( '{' )
            {
            // InternalRaspiRover.g:1784:1: ( '{' )
            // InternalRaspiRover.g:1785:2: '{'
            {
             before(grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Project__Group__1__Impl"


    // $ANTLR start "rule__Project__Group__2"
    // InternalRaspiRover.g:1794:1: rule__Project__Group__2 : rule__Project__Group__2__Impl rule__Project__Group__3 ;
    public final void rule__Project__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:1798:1: ( rule__Project__Group__2__Impl rule__Project__Group__3 )
            // InternalRaspiRover.g:1799:2: rule__Project__Group__2__Impl rule__Project__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Project__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__3();

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
    // $ANTLR end "rule__Project__Group__2"


    // $ANTLR start "rule__Project__Group__2__Impl"
    // InternalRaspiRover.g:1806:1: rule__Project__Group__2__Impl : ( ( rule__Project__Group_2__0 )? ) ;
    public final void rule__Project__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:1810:1: ( ( ( rule__Project__Group_2__0 )? ) )
            // InternalRaspiRover.g:1811:1: ( ( rule__Project__Group_2__0 )? )
            {
            // InternalRaspiRover.g:1811:1: ( ( rule__Project__Group_2__0 )? )
            // InternalRaspiRover.g:1812:2: ( rule__Project__Group_2__0 )?
            {
             before(grammarAccess.getProjectAccess().getGroup_2()); 
            // InternalRaspiRover.g:1813:2: ( rule__Project__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRaspiRover.g:1813:3: rule__Project__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Project__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProjectAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Project__Group__2__Impl"


    // $ANTLR start "rule__Project__Group__3"
    // InternalRaspiRover.g:1821:1: rule__Project__Group__3 : rule__Project__Group__3__Impl rule__Project__Group__4 ;
    public final void rule__Project__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:1825:1: ( rule__Project__Group__3__Impl rule__Project__Group__4 )
            // InternalRaspiRover.g:1826:2: rule__Project__Group__3__Impl rule__Project__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Project__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__4();

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
    // $ANTLR end "rule__Project__Group__3"


    // $ANTLR start "rule__Project__Group__3__Impl"
    // InternalRaspiRover.g:1833:1: rule__Project__Group__3__Impl : ( ( rule__Project__ProgramAssignment_3 ) ) ;
    public final void rule__Project__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:1837:1: ( ( ( rule__Project__ProgramAssignment_3 ) ) )
            // InternalRaspiRover.g:1838:1: ( ( rule__Project__ProgramAssignment_3 ) )
            {
            // InternalRaspiRover.g:1838:1: ( ( rule__Project__ProgramAssignment_3 ) )
            // InternalRaspiRover.g:1839:2: ( rule__Project__ProgramAssignment_3 )
            {
             before(grammarAccess.getProjectAccess().getProgramAssignment_3()); 
            // InternalRaspiRover.g:1840:2: ( rule__Project__ProgramAssignment_3 )
            // InternalRaspiRover.g:1840:3: rule__Project__ProgramAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Project__ProgramAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getProgramAssignment_3()); 

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
    // $ANTLR end "rule__Project__Group__3__Impl"


    // $ANTLR start "rule__Project__Group__4"
    // InternalRaspiRover.g:1848:1: rule__Project__Group__4 : rule__Project__Group__4__Impl ;
    public final void rule__Project__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:1852:1: ( rule__Project__Group__4__Impl )
            // InternalRaspiRover.g:1853:2: rule__Project__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Project__Group__4__Impl();

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
    // $ANTLR end "rule__Project__Group__4"


    // $ANTLR start "rule__Project__Group__4__Impl"
    // InternalRaspiRover.g:1859:1: rule__Project__Group__4__Impl : ( '}' ) ;
    public final void rule__Project__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:1863:1: ( ( '}' ) )
            // InternalRaspiRover.g:1864:1: ( '}' )
            {
            // InternalRaspiRover.g:1864:1: ( '}' )
            // InternalRaspiRover.g:1865:2: '}'
            {
             before(grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Project__Group__4__Impl"


    // $ANTLR start "rule__Project__Group_2__0"
    // InternalRaspiRover.g:1875:1: rule__Project__Group_2__0 : rule__Project__Group_2__0__Impl rule__Project__Group_2__1 ;
    public final void rule__Project__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:1879:1: ( rule__Project__Group_2__0__Impl rule__Project__Group_2__1 )
            // InternalRaspiRover.g:1880:2: rule__Project__Group_2__0__Impl rule__Project__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__Project__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group_2__1();

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
    // $ANTLR end "rule__Project__Group_2__0"


    // $ANTLR start "rule__Project__Group_2__0__Impl"
    // InternalRaspiRover.g:1887:1: rule__Project__Group_2__0__Impl : ( 'boards' ) ;
    public final void rule__Project__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:1891:1: ( ( 'boards' ) )
            // InternalRaspiRover.g:1892:1: ( 'boards' )
            {
            // InternalRaspiRover.g:1892:1: ( 'boards' )
            // InternalRaspiRover.g:1893:2: 'boards'
            {
             before(grammarAccess.getProjectAccess().getBoardsKeyword_2_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getBoardsKeyword_2_0()); 

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
    // $ANTLR end "rule__Project__Group_2__0__Impl"


    // $ANTLR start "rule__Project__Group_2__1"
    // InternalRaspiRover.g:1902:1: rule__Project__Group_2__1 : rule__Project__Group_2__1__Impl rule__Project__Group_2__2 ;
    public final void rule__Project__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:1906:1: ( rule__Project__Group_2__1__Impl rule__Project__Group_2__2 )
            // InternalRaspiRover.g:1907:2: rule__Project__Group_2__1__Impl rule__Project__Group_2__2
            {
            pushFollow(FOLLOW_7);
            rule__Project__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group_2__2();

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
    // $ANTLR end "rule__Project__Group_2__1"


    // $ANTLR start "rule__Project__Group_2__1__Impl"
    // InternalRaspiRover.g:1914:1: rule__Project__Group_2__1__Impl : ( '[' ) ;
    public final void rule__Project__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:1918:1: ( ( '[' ) )
            // InternalRaspiRover.g:1919:1: ( '[' )
            {
            // InternalRaspiRover.g:1919:1: ( '[' )
            // InternalRaspiRover.g:1920:2: '['
            {
             before(grammarAccess.getProjectAccess().getLeftSquareBracketKeyword_2_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getLeftSquareBracketKeyword_2_1()); 

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
    // $ANTLR end "rule__Project__Group_2__1__Impl"


    // $ANTLR start "rule__Project__Group_2__2"
    // InternalRaspiRover.g:1929:1: rule__Project__Group_2__2 : rule__Project__Group_2__2__Impl rule__Project__Group_2__3 ;
    public final void rule__Project__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:1933:1: ( rule__Project__Group_2__2__Impl rule__Project__Group_2__3 )
            // InternalRaspiRover.g:1934:2: rule__Project__Group_2__2__Impl rule__Project__Group_2__3
            {
            pushFollow(FOLLOW_7);
            rule__Project__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group_2__3();

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
    // $ANTLR end "rule__Project__Group_2__2"


    // $ANTLR start "rule__Project__Group_2__2__Impl"
    // InternalRaspiRover.g:1941:1: rule__Project__Group_2__2__Impl : ( ( rule__Project__BoardsAssignment_2_2 )* ) ;
    public final void rule__Project__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:1945:1: ( ( ( rule__Project__BoardsAssignment_2_2 )* ) )
            // InternalRaspiRover.g:1946:1: ( ( rule__Project__BoardsAssignment_2_2 )* )
            {
            // InternalRaspiRover.g:1946:1: ( ( rule__Project__BoardsAssignment_2_2 )* )
            // InternalRaspiRover.g:1947:2: ( rule__Project__BoardsAssignment_2_2 )*
            {
             before(grammarAccess.getProjectAccess().getBoardsAssignment_2_2()); 
            // InternalRaspiRover.g:1948:2: ( rule__Project__BoardsAssignment_2_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRaspiRover.g:1948:3: rule__Project__BoardsAssignment_2_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Project__BoardsAssignment_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getProjectAccess().getBoardsAssignment_2_2()); 

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
    // $ANTLR end "rule__Project__Group_2__2__Impl"


    // $ANTLR start "rule__Project__Group_2__3"
    // InternalRaspiRover.g:1956:1: rule__Project__Group_2__3 : rule__Project__Group_2__3__Impl ;
    public final void rule__Project__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:1960:1: ( rule__Project__Group_2__3__Impl )
            // InternalRaspiRover.g:1961:2: rule__Project__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Project__Group_2__3__Impl();

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
    // $ANTLR end "rule__Project__Group_2__3"


    // $ANTLR start "rule__Project__Group_2__3__Impl"
    // InternalRaspiRover.g:1967:1: rule__Project__Group_2__3__Impl : ( ']' ) ;
    public final void rule__Project__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:1971:1: ( ( ']' ) )
            // InternalRaspiRover.g:1972:1: ( ']' )
            {
            // InternalRaspiRover.g:1972:1: ( ']' )
            // InternalRaspiRover.g:1973:2: ']'
            {
             before(grammarAccess.getProjectAccess().getRightSquareBracketKeyword_2_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getRightSquareBracketKeyword_2_3()); 

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
    // $ANTLR end "rule__Project__Group_2__3__Impl"


    // $ANTLR start "rule__RoverProgram__Group__0"
    // InternalRaspiRover.g:1983:1: rule__RoverProgram__Group__0 : rule__RoverProgram__Group__0__Impl rule__RoverProgram__Group__1 ;
    public final void rule__RoverProgram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:1987:1: ( rule__RoverProgram__Group__0__Impl rule__RoverProgram__Group__1 )
            // InternalRaspiRover.g:1988:2: rule__RoverProgram__Group__0__Impl rule__RoverProgram__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__RoverProgram__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoverProgram__Group__1();

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
    // $ANTLR end "rule__RoverProgram__Group__0"


    // $ANTLR start "rule__RoverProgram__Group__0__Impl"
    // InternalRaspiRover.g:1995:1: rule__RoverProgram__Group__0__Impl : ( 'program' ) ;
    public final void rule__RoverProgram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:1999:1: ( ( 'program' ) )
            // InternalRaspiRover.g:2000:1: ( 'program' )
            {
            // InternalRaspiRover.g:2000:1: ( 'program' )
            // InternalRaspiRover.g:2001:2: 'program'
            {
             before(grammarAccess.getRoverProgramAccess().getProgramKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRoverProgramAccess().getProgramKeyword_0()); 

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
    // $ANTLR end "rule__RoverProgram__Group__0__Impl"


    // $ANTLR start "rule__RoverProgram__Group__1"
    // InternalRaspiRover.g:2010:1: rule__RoverProgram__Group__1 : rule__RoverProgram__Group__1__Impl rule__RoverProgram__Group__2 ;
    public final void rule__RoverProgram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2014:1: ( rule__RoverProgram__Group__1__Impl rule__RoverProgram__Group__2 )
            // InternalRaspiRover.g:2015:2: rule__RoverProgram__Group__1__Impl rule__RoverProgram__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__RoverProgram__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoverProgram__Group__2();

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
    // $ANTLR end "rule__RoverProgram__Group__1"


    // $ANTLR start "rule__RoverProgram__Group__1__Impl"
    // InternalRaspiRover.g:2022:1: rule__RoverProgram__Group__1__Impl : ( ( rule__RoverProgram__NameAssignment_1 ) ) ;
    public final void rule__RoverProgram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2026:1: ( ( ( rule__RoverProgram__NameAssignment_1 ) ) )
            // InternalRaspiRover.g:2027:1: ( ( rule__RoverProgram__NameAssignment_1 ) )
            {
            // InternalRaspiRover.g:2027:1: ( ( rule__RoverProgram__NameAssignment_1 ) )
            // InternalRaspiRover.g:2028:2: ( rule__RoverProgram__NameAssignment_1 )
            {
             before(grammarAccess.getRoverProgramAccess().getNameAssignment_1()); 
            // InternalRaspiRover.g:2029:2: ( rule__RoverProgram__NameAssignment_1 )
            // InternalRaspiRover.g:2029:3: rule__RoverProgram__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RoverProgram__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRoverProgramAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__RoverProgram__Group__1__Impl"


    // $ANTLR start "rule__RoverProgram__Group__2"
    // InternalRaspiRover.g:2037:1: rule__RoverProgram__Group__2 : rule__RoverProgram__Group__2__Impl rule__RoverProgram__Group__3 ;
    public final void rule__RoverProgram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2041:1: ( rule__RoverProgram__Group__2__Impl rule__RoverProgram__Group__3 )
            // InternalRaspiRover.g:2042:2: rule__RoverProgram__Group__2__Impl rule__RoverProgram__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__RoverProgram__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoverProgram__Group__3();

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
    // $ANTLR end "rule__RoverProgram__Group__2"


    // $ANTLR start "rule__RoverProgram__Group__2__Impl"
    // InternalRaspiRover.g:2049:1: rule__RoverProgram__Group__2__Impl : ( '[' ) ;
    public final void rule__RoverProgram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2053:1: ( ( '[' ) )
            // InternalRaspiRover.g:2054:1: ( '[' )
            {
            // InternalRaspiRover.g:2054:1: ( '[' )
            // InternalRaspiRover.g:2055:2: '['
            {
             before(grammarAccess.getRoverProgramAccess().getLeftSquareBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRoverProgramAccess().getLeftSquareBracketKeyword_2()); 

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
    // $ANTLR end "rule__RoverProgram__Group__2__Impl"


    // $ANTLR start "rule__RoverProgram__Group__3"
    // InternalRaspiRover.g:2064:1: rule__RoverProgram__Group__3 : rule__RoverProgram__Group__3__Impl rule__RoverProgram__Group__4 ;
    public final void rule__RoverProgram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2068:1: ( rule__RoverProgram__Group__3__Impl rule__RoverProgram__Group__4 )
            // InternalRaspiRover.g:2069:2: rule__RoverProgram__Group__3__Impl rule__RoverProgram__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__RoverProgram__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoverProgram__Group__4();

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
    // $ANTLR end "rule__RoverProgram__Group__3"


    // $ANTLR start "rule__RoverProgram__Group__3__Impl"
    // InternalRaspiRover.g:2076:1: rule__RoverProgram__Group__3__Impl : ( ( rule__RoverProgram__Group_3__0 )? ) ;
    public final void rule__RoverProgram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2080:1: ( ( ( rule__RoverProgram__Group_3__0 )? ) )
            // InternalRaspiRover.g:2081:1: ( ( rule__RoverProgram__Group_3__0 )? )
            {
            // InternalRaspiRover.g:2081:1: ( ( rule__RoverProgram__Group_3__0 )? )
            // InternalRaspiRover.g:2082:2: ( rule__RoverProgram__Group_3__0 )?
            {
             before(grammarAccess.getRoverProgramAccess().getGroup_3()); 
            // InternalRaspiRover.g:2083:2: ( rule__RoverProgram__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRaspiRover.g:2083:3: rule__RoverProgram__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RoverProgram__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRoverProgramAccess().getGroup_3()); 

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
    // $ANTLR end "rule__RoverProgram__Group__3__Impl"


    // $ANTLR start "rule__RoverProgram__Group__4"
    // InternalRaspiRover.g:2091:1: rule__RoverProgram__Group__4 : rule__RoverProgram__Group__4__Impl rule__RoverProgram__Group__5 ;
    public final void rule__RoverProgram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2095:1: ( rule__RoverProgram__Group__4__Impl rule__RoverProgram__Group__5 )
            // InternalRaspiRover.g:2096:2: rule__RoverProgram__Group__4__Impl rule__RoverProgram__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__RoverProgram__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoverProgram__Group__5();

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
    // $ANTLR end "rule__RoverProgram__Group__4"


    // $ANTLR start "rule__RoverProgram__Group__4__Impl"
    // InternalRaspiRover.g:2103:1: rule__RoverProgram__Group__4__Impl : ( ( rule__RoverProgram__BlockAssignment_4 ) ) ;
    public final void rule__RoverProgram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2107:1: ( ( ( rule__RoverProgram__BlockAssignment_4 ) ) )
            // InternalRaspiRover.g:2108:1: ( ( rule__RoverProgram__BlockAssignment_4 ) )
            {
            // InternalRaspiRover.g:2108:1: ( ( rule__RoverProgram__BlockAssignment_4 ) )
            // InternalRaspiRover.g:2109:2: ( rule__RoverProgram__BlockAssignment_4 )
            {
             before(grammarAccess.getRoverProgramAccess().getBlockAssignment_4()); 
            // InternalRaspiRover.g:2110:2: ( rule__RoverProgram__BlockAssignment_4 )
            // InternalRaspiRover.g:2110:3: rule__RoverProgram__BlockAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RoverProgram__BlockAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRoverProgramAccess().getBlockAssignment_4()); 

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
    // $ANTLR end "rule__RoverProgram__Group__4__Impl"


    // $ANTLR start "rule__RoverProgram__Group__5"
    // InternalRaspiRover.g:2118:1: rule__RoverProgram__Group__5 : rule__RoverProgram__Group__5__Impl ;
    public final void rule__RoverProgram__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2122:1: ( rule__RoverProgram__Group__5__Impl )
            // InternalRaspiRover.g:2123:2: rule__RoverProgram__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RoverProgram__Group__5__Impl();

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
    // $ANTLR end "rule__RoverProgram__Group__5"


    // $ANTLR start "rule__RoverProgram__Group__5__Impl"
    // InternalRaspiRover.g:2129:1: rule__RoverProgram__Group__5__Impl : ( ']' ) ;
    public final void rule__RoverProgram__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2133:1: ( ( ']' ) )
            // InternalRaspiRover.g:2134:1: ( ']' )
            {
            // InternalRaspiRover.g:2134:1: ( ']' )
            // InternalRaspiRover.g:2135:2: ']'
            {
             before(grammarAccess.getRoverProgramAccess().getRightSquareBracketKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRoverProgramAccess().getRightSquareBracketKeyword_5()); 

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
    // $ANTLR end "rule__RoverProgram__Group__5__Impl"


    // $ANTLR start "rule__RoverProgram__Group_3__0"
    // InternalRaspiRover.g:2145:1: rule__RoverProgram__Group_3__0 : rule__RoverProgram__Group_3__0__Impl rule__RoverProgram__Group_3__1 ;
    public final void rule__RoverProgram__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2149:1: ( rule__RoverProgram__Group_3__0__Impl rule__RoverProgram__Group_3__1 )
            // InternalRaspiRover.g:2150:2: rule__RoverProgram__Group_3__0__Impl rule__RoverProgram__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__RoverProgram__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoverProgram__Group_3__1();

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
    // $ANTLR end "rule__RoverProgram__Group_3__0"


    // $ANTLR start "rule__RoverProgram__Group_3__0__Impl"
    // InternalRaspiRover.g:2157:1: rule__RoverProgram__Group_3__0__Impl : ( 'params' ) ;
    public final void rule__RoverProgram__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2161:1: ( ( 'params' ) )
            // InternalRaspiRover.g:2162:1: ( 'params' )
            {
            // InternalRaspiRover.g:2162:1: ( 'params' )
            // InternalRaspiRover.g:2163:2: 'params'
            {
             before(grammarAccess.getRoverProgramAccess().getParamsKeyword_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRoverProgramAccess().getParamsKeyword_3_0()); 

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
    // $ANTLR end "rule__RoverProgram__Group_3__0__Impl"


    // $ANTLR start "rule__RoverProgram__Group_3__1"
    // InternalRaspiRover.g:2172:1: rule__RoverProgram__Group_3__1 : rule__RoverProgram__Group_3__1__Impl rule__RoverProgram__Group_3__2 ;
    public final void rule__RoverProgram__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2176:1: ( rule__RoverProgram__Group_3__1__Impl rule__RoverProgram__Group_3__2 )
            // InternalRaspiRover.g:2177:2: rule__RoverProgram__Group_3__1__Impl rule__RoverProgram__Group_3__2
            {
            pushFollow(FOLLOW_9);
            rule__RoverProgram__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoverProgram__Group_3__2();

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
    // $ANTLR end "rule__RoverProgram__Group_3__1"


    // $ANTLR start "rule__RoverProgram__Group_3__1__Impl"
    // InternalRaspiRover.g:2184:1: rule__RoverProgram__Group_3__1__Impl : ( '{' ) ;
    public final void rule__RoverProgram__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2188:1: ( ( '{' ) )
            // InternalRaspiRover.g:2189:1: ( '{' )
            {
            // InternalRaspiRover.g:2189:1: ( '{' )
            // InternalRaspiRover.g:2190:2: '{'
            {
             before(grammarAccess.getRoverProgramAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRoverProgramAccess().getLeftCurlyBracketKeyword_3_1()); 

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
    // $ANTLR end "rule__RoverProgram__Group_3__1__Impl"


    // $ANTLR start "rule__RoverProgram__Group_3__2"
    // InternalRaspiRover.g:2199:1: rule__RoverProgram__Group_3__2 : rule__RoverProgram__Group_3__2__Impl rule__RoverProgram__Group_3__3 ;
    public final void rule__RoverProgram__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2203:1: ( rule__RoverProgram__Group_3__2__Impl rule__RoverProgram__Group_3__3 )
            // InternalRaspiRover.g:2204:2: rule__RoverProgram__Group_3__2__Impl rule__RoverProgram__Group_3__3
            {
            pushFollow(FOLLOW_12);
            rule__RoverProgram__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoverProgram__Group_3__3();

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
    // $ANTLR end "rule__RoverProgram__Group_3__2"


    // $ANTLR start "rule__RoverProgram__Group_3__2__Impl"
    // InternalRaspiRover.g:2211:1: rule__RoverProgram__Group_3__2__Impl : ( ( rule__RoverProgram__ParamsAssignment_3_2 ) ) ;
    public final void rule__RoverProgram__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2215:1: ( ( ( rule__RoverProgram__ParamsAssignment_3_2 ) ) )
            // InternalRaspiRover.g:2216:1: ( ( rule__RoverProgram__ParamsAssignment_3_2 ) )
            {
            // InternalRaspiRover.g:2216:1: ( ( rule__RoverProgram__ParamsAssignment_3_2 ) )
            // InternalRaspiRover.g:2217:2: ( rule__RoverProgram__ParamsAssignment_3_2 )
            {
             before(grammarAccess.getRoverProgramAccess().getParamsAssignment_3_2()); 
            // InternalRaspiRover.g:2218:2: ( rule__RoverProgram__ParamsAssignment_3_2 )
            // InternalRaspiRover.g:2218:3: rule__RoverProgram__ParamsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__RoverProgram__ParamsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getRoverProgramAccess().getParamsAssignment_3_2()); 

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
    // $ANTLR end "rule__RoverProgram__Group_3__2__Impl"


    // $ANTLR start "rule__RoverProgram__Group_3__3"
    // InternalRaspiRover.g:2226:1: rule__RoverProgram__Group_3__3 : rule__RoverProgram__Group_3__3__Impl rule__RoverProgram__Group_3__4 ;
    public final void rule__RoverProgram__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2230:1: ( rule__RoverProgram__Group_3__3__Impl rule__RoverProgram__Group_3__4 )
            // InternalRaspiRover.g:2231:2: rule__RoverProgram__Group_3__3__Impl rule__RoverProgram__Group_3__4
            {
            pushFollow(FOLLOW_12);
            rule__RoverProgram__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoverProgram__Group_3__4();

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
    // $ANTLR end "rule__RoverProgram__Group_3__3"


    // $ANTLR start "rule__RoverProgram__Group_3__3__Impl"
    // InternalRaspiRover.g:2238:1: rule__RoverProgram__Group_3__3__Impl : ( ( rule__RoverProgram__Group_3_3__0 )* ) ;
    public final void rule__RoverProgram__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2242:1: ( ( ( rule__RoverProgram__Group_3_3__0 )* ) )
            // InternalRaspiRover.g:2243:1: ( ( rule__RoverProgram__Group_3_3__0 )* )
            {
            // InternalRaspiRover.g:2243:1: ( ( rule__RoverProgram__Group_3_3__0 )* )
            // InternalRaspiRover.g:2244:2: ( rule__RoverProgram__Group_3_3__0 )*
            {
             before(grammarAccess.getRoverProgramAccess().getGroup_3_3()); 
            // InternalRaspiRover.g:2245:2: ( rule__RoverProgram__Group_3_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==27) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalRaspiRover.g:2245:3: rule__RoverProgram__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__RoverProgram__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getRoverProgramAccess().getGroup_3_3()); 

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
    // $ANTLR end "rule__RoverProgram__Group_3__3__Impl"


    // $ANTLR start "rule__RoverProgram__Group_3__4"
    // InternalRaspiRover.g:2253:1: rule__RoverProgram__Group_3__4 : rule__RoverProgram__Group_3__4__Impl ;
    public final void rule__RoverProgram__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2257:1: ( rule__RoverProgram__Group_3__4__Impl )
            // InternalRaspiRover.g:2258:2: rule__RoverProgram__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RoverProgram__Group_3__4__Impl();

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
    // $ANTLR end "rule__RoverProgram__Group_3__4"


    // $ANTLR start "rule__RoverProgram__Group_3__4__Impl"
    // InternalRaspiRover.g:2264:1: rule__RoverProgram__Group_3__4__Impl : ( '}' ) ;
    public final void rule__RoverProgram__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2268:1: ( ( '}' ) )
            // InternalRaspiRover.g:2269:1: ( '}' )
            {
            // InternalRaspiRover.g:2269:1: ( '}' )
            // InternalRaspiRover.g:2270:2: '}'
            {
             before(grammarAccess.getRoverProgramAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRoverProgramAccess().getRightCurlyBracketKeyword_3_4()); 

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
    // $ANTLR end "rule__RoverProgram__Group_3__4__Impl"


    // $ANTLR start "rule__RoverProgram__Group_3_3__0"
    // InternalRaspiRover.g:2280:1: rule__RoverProgram__Group_3_3__0 : rule__RoverProgram__Group_3_3__0__Impl rule__RoverProgram__Group_3_3__1 ;
    public final void rule__RoverProgram__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2284:1: ( rule__RoverProgram__Group_3_3__0__Impl rule__RoverProgram__Group_3_3__1 )
            // InternalRaspiRover.g:2285:2: rule__RoverProgram__Group_3_3__0__Impl rule__RoverProgram__Group_3_3__1
            {
            pushFollow(FOLLOW_9);
            rule__RoverProgram__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoverProgram__Group_3_3__1();

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
    // $ANTLR end "rule__RoverProgram__Group_3_3__0"


    // $ANTLR start "rule__RoverProgram__Group_3_3__0__Impl"
    // InternalRaspiRover.g:2292:1: rule__RoverProgram__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__RoverProgram__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2296:1: ( ( ',' ) )
            // InternalRaspiRover.g:2297:1: ( ',' )
            {
            // InternalRaspiRover.g:2297:1: ( ',' )
            // InternalRaspiRover.g:2298:2: ','
            {
             before(grammarAccess.getRoverProgramAccess().getCommaKeyword_3_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRoverProgramAccess().getCommaKeyword_3_3_0()); 

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
    // $ANTLR end "rule__RoverProgram__Group_3_3__0__Impl"


    // $ANTLR start "rule__RoverProgram__Group_3_3__1"
    // InternalRaspiRover.g:2307:1: rule__RoverProgram__Group_3_3__1 : rule__RoverProgram__Group_3_3__1__Impl ;
    public final void rule__RoverProgram__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2311:1: ( rule__RoverProgram__Group_3_3__1__Impl )
            // InternalRaspiRover.g:2312:2: rule__RoverProgram__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RoverProgram__Group_3_3__1__Impl();

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
    // $ANTLR end "rule__RoverProgram__Group_3_3__1"


    // $ANTLR start "rule__RoverProgram__Group_3_3__1__Impl"
    // InternalRaspiRover.g:2318:1: rule__RoverProgram__Group_3_3__1__Impl : ( ( rule__RoverProgram__ParamsAssignment_3_3_1 ) ) ;
    public final void rule__RoverProgram__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2322:1: ( ( ( rule__RoverProgram__ParamsAssignment_3_3_1 ) ) )
            // InternalRaspiRover.g:2323:1: ( ( rule__RoverProgram__ParamsAssignment_3_3_1 ) )
            {
            // InternalRaspiRover.g:2323:1: ( ( rule__RoverProgram__ParamsAssignment_3_3_1 ) )
            // InternalRaspiRover.g:2324:2: ( rule__RoverProgram__ParamsAssignment_3_3_1 )
            {
             before(grammarAccess.getRoverProgramAccess().getParamsAssignment_3_3_1()); 
            // InternalRaspiRover.g:2325:2: ( rule__RoverProgram__ParamsAssignment_3_3_1 )
            // InternalRaspiRover.g:2325:3: rule__RoverProgram__ParamsAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RoverProgram__ParamsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRoverProgramAccess().getParamsAssignment_3_3_1()); 

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
    // $ANTLR end "rule__RoverProgram__Group_3_3__1__Impl"


    // $ANTLR start "rule__RasPiBoard__Group__0"
    // InternalRaspiRover.g:2334:1: rule__RasPiBoard__Group__0 : rule__RasPiBoard__Group__0__Impl rule__RasPiBoard__Group__1 ;
    public final void rule__RasPiBoard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2338:1: ( rule__RasPiBoard__Group__0__Impl rule__RasPiBoard__Group__1 )
            // InternalRaspiRover.g:2339:2: rule__RasPiBoard__Group__0__Impl rule__RasPiBoard__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RasPiBoard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RasPiBoard__Group__1();

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
    // $ANTLR end "rule__RasPiBoard__Group__0"


    // $ANTLR start "rule__RasPiBoard__Group__0__Impl"
    // InternalRaspiRover.g:2346:1: rule__RasPiBoard__Group__0__Impl : ( ( rule__RasPiBoard__NameAssignment_0 ) ) ;
    public final void rule__RasPiBoard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2350:1: ( ( ( rule__RasPiBoard__NameAssignment_0 ) ) )
            // InternalRaspiRover.g:2351:1: ( ( rule__RasPiBoard__NameAssignment_0 ) )
            {
            // InternalRaspiRover.g:2351:1: ( ( rule__RasPiBoard__NameAssignment_0 ) )
            // InternalRaspiRover.g:2352:2: ( rule__RasPiBoard__NameAssignment_0 )
            {
             before(grammarAccess.getRasPiBoardAccess().getNameAssignment_0()); 
            // InternalRaspiRover.g:2353:2: ( rule__RasPiBoard__NameAssignment_0 )
            // InternalRaspiRover.g:2353:3: rule__RasPiBoard__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RasPiBoard__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRasPiBoardAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__RasPiBoard__Group__0__Impl"


    // $ANTLR start "rule__RasPiBoard__Group__1"
    // InternalRaspiRover.g:2361:1: rule__RasPiBoard__Group__1 : rule__RasPiBoard__Group__1__Impl rule__RasPiBoard__Group__2 ;
    public final void rule__RasPiBoard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2365:1: ( rule__RasPiBoard__Group__1__Impl rule__RasPiBoard__Group__2 )
            // InternalRaspiRover.g:2366:2: rule__RasPiBoard__Group__1__Impl rule__RasPiBoard__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__RasPiBoard__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RasPiBoard__Group__2();

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
    // $ANTLR end "rule__RasPiBoard__Group__1"


    // $ANTLR start "rule__RasPiBoard__Group__1__Impl"
    // InternalRaspiRover.g:2373:1: rule__RasPiBoard__Group__1__Impl : ( '{' ) ;
    public final void rule__RasPiBoard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2377:1: ( ( '{' ) )
            // InternalRaspiRover.g:2378:1: ( '{' )
            {
            // InternalRaspiRover.g:2378:1: ( '{' )
            // InternalRaspiRover.g:2379:2: '{'
            {
             before(grammarAccess.getRasPiBoardAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRasPiBoardAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__RasPiBoard__Group__1__Impl"


    // $ANTLR start "rule__RasPiBoard__Group__2"
    // InternalRaspiRover.g:2388:1: rule__RasPiBoard__Group__2 : rule__RasPiBoard__Group__2__Impl rule__RasPiBoard__Group__3 ;
    public final void rule__RasPiBoard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2392:1: ( rule__RasPiBoard__Group__2__Impl rule__RasPiBoard__Group__3 )
            // InternalRaspiRover.g:2393:2: rule__RasPiBoard__Group__2__Impl rule__RasPiBoard__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__RasPiBoard__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RasPiBoard__Group__3();

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
    // $ANTLR end "rule__RasPiBoard__Group__2"


    // $ANTLR start "rule__RasPiBoard__Group__2__Impl"
    // InternalRaspiRover.g:2400:1: rule__RasPiBoard__Group__2__Impl : ( ( rule__RasPiBoard__DigitalPinsAssignment_2 )* ) ;
    public final void rule__RasPiBoard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2404:1: ( ( ( rule__RasPiBoard__DigitalPinsAssignment_2 )* ) )
            // InternalRaspiRover.g:2405:1: ( ( rule__RasPiBoard__DigitalPinsAssignment_2 )* )
            {
            // InternalRaspiRover.g:2405:1: ( ( rule__RasPiBoard__DigitalPinsAssignment_2 )* )
            // InternalRaspiRover.g:2406:2: ( rule__RasPiBoard__DigitalPinsAssignment_2 )*
            {
             before(grammarAccess.getRasPiBoardAccess().getDigitalPinsAssignment_2()); 
            // InternalRaspiRover.g:2407:2: ( rule__RasPiBoard__DigitalPinsAssignment_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==28) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalRaspiRover.g:2407:3: rule__RasPiBoard__DigitalPinsAssignment_2
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__RasPiBoard__DigitalPinsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getRasPiBoardAccess().getDigitalPinsAssignment_2()); 

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
    // $ANTLR end "rule__RasPiBoard__Group__2__Impl"


    // $ANTLR start "rule__RasPiBoard__Group__3"
    // InternalRaspiRover.g:2415:1: rule__RasPiBoard__Group__3 : rule__RasPiBoard__Group__3__Impl rule__RasPiBoard__Group__4 ;
    public final void rule__RasPiBoard__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2419:1: ( rule__RasPiBoard__Group__3__Impl rule__RasPiBoard__Group__4 )
            // InternalRaspiRover.g:2420:2: rule__RasPiBoard__Group__3__Impl rule__RasPiBoard__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__RasPiBoard__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RasPiBoard__Group__4();

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
    // $ANTLR end "rule__RasPiBoard__Group__3"


    // $ANTLR start "rule__RasPiBoard__Group__3__Impl"
    // InternalRaspiRover.g:2427:1: rule__RasPiBoard__Group__3__Impl : ( ( rule__RasPiBoard__AnalogPinsAssignment_3 ) ) ;
    public final void rule__RasPiBoard__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2431:1: ( ( ( rule__RasPiBoard__AnalogPinsAssignment_3 ) ) )
            // InternalRaspiRover.g:2432:1: ( ( rule__RasPiBoard__AnalogPinsAssignment_3 ) )
            {
            // InternalRaspiRover.g:2432:1: ( ( rule__RasPiBoard__AnalogPinsAssignment_3 ) )
            // InternalRaspiRover.g:2433:2: ( rule__RasPiBoard__AnalogPinsAssignment_3 )
            {
             before(grammarAccess.getRasPiBoardAccess().getAnalogPinsAssignment_3()); 
            // InternalRaspiRover.g:2434:2: ( rule__RasPiBoard__AnalogPinsAssignment_3 )
            // InternalRaspiRover.g:2434:3: rule__RasPiBoard__AnalogPinsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RasPiBoard__AnalogPinsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRasPiBoardAccess().getAnalogPinsAssignment_3()); 

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
    // $ANTLR end "rule__RasPiBoard__Group__3__Impl"


    // $ANTLR start "rule__RasPiBoard__Group__4"
    // InternalRaspiRover.g:2442:1: rule__RasPiBoard__Group__4 : rule__RasPiBoard__Group__4__Impl ;
    public final void rule__RasPiBoard__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2446:1: ( rule__RasPiBoard__Group__4__Impl )
            // InternalRaspiRover.g:2447:2: rule__RasPiBoard__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RasPiBoard__Group__4__Impl();

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
    // $ANTLR end "rule__RasPiBoard__Group__4"


    // $ANTLR start "rule__RasPiBoard__Group__4__Impl"
    // InternalRaspiRover.g:2453:1: rule__RasPiBoard__Group__4__Impl : ( '}' ) ;
    public final void rule__RasPiBoard__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2457:1: ( ( '}' ) )
            // InternalRaspiRover.g:2458:1: ( '}' )
            {
            // InternalRaspiRover.g:2458:1: ( '}' )
            // InternalRaspiRover.g:2459:2: '}'
            {
             before(grammarAccess.getRasPiBoardAccess().getRightCurlyBracketKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRasPiBoardAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__RasPiBoard__Group__4__Impl"


    // $ANTLR start "rule__DigitalPin__Group__0"
    // InternalRaspiRover.g:2469:1: rule__DigitalPin__Group__0 : rule__DigitalPin__Group__0__Impl rule__DigitalPin__Group__1 ;
    public final void rule__DigitalPin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2473:1: ( rule__DigitalPin__Group__0__Impl rule__DigitalPin__Group__1 )
            // InternalRaspiRover.g:2474:2: rule__DigitalPin__Group__0__Impl rule__DigitalPin__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__DigitalPin__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DigitalPin__Group__1();

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
    // $ANTLR end "rule__DigitalPin__Group__0"


    // $ANTLR start "rule__DigitalPin__Group__0__Impl"
    // InternalRaspiRover.g:2481:1: rule__DigitalPin__Group__0__Impl : ( 'digital-pin' ) ;
    public final void rule__DigitalPin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2485:1: ( ( 'digital-pin' ) )
            // InternalRaspiRover.g:2486:1: ( 'digital-pin' )
            {
            // InternalRaspiRover.g:2486:1: ( 'digital-pin' )
            // InternalRaspiRover.g:2487:2: 'digital-pin'
            {
             before(grammarAccess.getDigitalPinAccess().getDigitalPinKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getDigitalPinAccess().getDigitalPinKeyword_0()); 

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
    // $ANTLR end "rule__DigitalPin__Group__0__Impl"


    // $ANTLR start "rule__DigitalPin__Group__1"
    // InternalRaspiRover.g:2496:1: rule__DigitalPin__Group__1 : rule__DigitalPin__Group__1__Impl ;
    public final void rule__DigitalPin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2500:1: ( rule__DigitalPin__Group__1__Impl )
            // InternalRaspiRover.g:2501:2: rule__DigitalPin__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DigitalPin__Group__1__Impl();

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
    // $ANTLR end "rule__DigitalPin__Group__1"


    // $ANTLR start "rule__DigitalPin__Group__1__Impl"
    // InternalRaspiRover.g:2507:1: rule__DigitalPin__Group__1__Impl : ( ( rule__DigitalPin__NameAssignment_1 ) ) ;
    public final void rule__DigitalPin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2511:1: ( ( ( rule__DigitalPin__NameAssignment_1 ) ) )
            // InternalRaspiRover.g:2512:1: ( ( rule__DigitalPin__NameAssignment_1 ) )
            {
            // InternalRaspiRover.g:2512:1: ( ( rule__DigitalPin__NameAssignment_1 ) )
            // InternalRaspiRover.g:2513:2: ( rule__DigitalPin__NameAssignment_1 )
            {
             before(grammarAccess.getDigitalPinAccess().getNameAssignment_1()); 
            // InternalRaspiRover.g:2514:2: ( rule__DigitalPin__NameAssignment_1 )
            // InternalRaspiRover.g:2514:3: rule__DigitalPin__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DigitalPin__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDigitalPinAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__DigitalPin__Group__1__Impl"


    // $ANTLR start "rule__AnalogPin__Group__0"
    // InternalRaspiRover.g:2523:1: rule__AnalogPin__Group__0 : rule__AnalogPin__Group__0__Impl rule__AnalogPin__Group__1 ;
    public final void rule__AnalogPin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2527:1: ( rule__AnalogPin__Group__0__Impl rule__AnalogPin__Group__1 )
            // InternalRaspiRover.g:2528:2: rule__AnalogPin__Group__0__Impl rule__AnalogPin__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__AnalogPin__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnalogPin__Group__1();

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
    // $ANTLR end "rule__AnalogPin__Group__0"


    // $ANTLR start "rule__AnalogPin__Group__0__Impl"
    // InternalRaspiRover.g:2535:1: rule__AnalogPin__Group__0__Impl : ( 'analog-pin' ) ;
    public final void rule__AnalogPin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2539:1: ( ( 'analog-pin' ) )
            // InternalRaspiRover.g:2540:1: ( 'analog-pin' )
            {
            // InternalRaspiRover.g:2540:1: ( 'analog-pin' )
            // InternalRaspiRover.g:2541:2: 'analog-pin'
            {
             before(grammarAccess.getAnalogPinAccess().getAnalogPinKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getAnalogPinAccess().getAnalogPinKeyword_0()); 

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
    // $ANTLR end "rule__AnalogPin__Group__0__Impl"


    // $ANTLR start "rule__AnalogPin__Group__1"
    // InternalRaspiRover.g:2550:1: rule__AnalogPin__Group__1 : rule__AnalogPin__Group__1__Impl ;
    public final void rule__AnalogPin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2554:1: ( rule__AnalogPin__Group__1__Impl )
            // InternalRaspiRover.g:2555:2: rule__AnalogPin__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AnalogPin__Group__1__Impl();

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
    // $ANTLR end "rule__AnalogPin__Group__1"


    // $ANTLR start "rule__AnalogPin__Group__1__Impl"
    // InternalRaspiRover.g:2561:1: rule__AnalogPin__Group__1__Impl : ( ( rule__AnalogPin__NameAssignment_1 ) ) ;
    public final void rule__AnalogPin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2565:1: ( ( ( rule__AnalogPin__NameAssignment_1 ) ) )
            // InternalRaspiRover.g:2566:1: ( ( rule__AnalogPin__NameAssignment_1 ) )
            {
            // InternalRaspiRover.g:2566:1: ( ( rule__AnalogPin__NameAssignment_1 ) )
            // InternalRaspiRover.g:2567:2: ( rule__AnalogPin__NameAssignment_1 )
            {
             before(grammarAccess.getAnalogPinAccess().getNameAssignment_1()); 
            // InternalRaspiRover.g:2568:2: ( rule__AnalogPin__NameAssignment_1 )
            // InternalRaspiRover.g:2568:3: rule__AnalogPin__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AnalogPin__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAnalogPinAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__AnalogPin__Group__1__Impl"


    // $ANTLR start "rule__RclBlock__Group__0"
    // InternalRaspiRover.g:2577:1: rule__RclBlock__Group__0 : rule__RclBlock__Group__0__Impl rule__RclBlock__Group__1 ;
    public final void rule__RclBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2581:1: ( rule__RclBlock__Group__0__Impl rule__RclBlock__Group__1 )
            // InternalRaspiRover.g:2582:2: rule__RclBlock__Group__0__Impl rule__RclBlock__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__RclBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RclBlock__Group__1();

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
    // $ANTLR end "rule__RclBlock__Group__0"


    // $ANTLR start "rule__RclBlock__Group__0__Impl"
    // InternalRaspiRover.g:2589:1: rule__RclBlock__Group__0__Impl : ( '{' ) ;
    public final void rule__RclBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2593:1: ( ( '{' ) )
            // InternalRaspiRover.g:2594:1: ( '{' )
            {
            // InternalRaspiRover.g:2594:1: ( '{' )
            // InternalRaspiRover.g:2595:2: '{'
            {
             before(grammarAccess.getRclBlockAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRclBlockAccess().getLeftCurlyBracketKeyword_0()); 

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
    // $ANTLR end "rule__RclBlock__Group__0__Impl"


    // $ANTLR start "rule__RclBlock__Group__1"
    // InternalRaspiRover.g:2604:1: rule__RclBlock__Group__1 : rule__RclBlock__Group__1__Impl rule__RclBlock__Group__2 ;
    public final void rule__RclBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2608:1: ( rule__RclBlock__Group__1__Impl rule__RclBlock__Group__2 )
            // InternalRaspiRover.g:2609:2: rule__RclBlock__Group__1__Impl rule__RclBlock__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__RclBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RclBlock__Group__2();

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
    // $ANTLR end "rule__RclBlock__Group__1"


    // $ANTLR start "rule__RclBlock__Group__1__Impl"
    // InternalRaspiRover.g:2616:1: rule__RclBlock__Group__1__Impl : ( ( ( rule__RclBlock__StmtsAssignment_1 ) ) ( ( rule__RclBlock__StmtsAssignment_1 )* ) ) ;
    public final void rule__RclBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2620:1: ( ( ( ( rule__RclBlock__StmtsAssignment_1 ) ) ( ( rule__RclBlock__StmtsAssignment_1 )* ) ) )
            // InternalRaspiRover.g:2621:1: ( ( ( rule__RclBlock__StmtsAssignment_1 ) ) ( ( rule__RclBlock__StmtsAssignment_1 )* ) )
            {
            // InternalRaspiRover.g:2621:1: ( ( ( rule__RclBlock__StmtsAssignment_1 ) ) ( ( rule__RclBlock__StmtsAssignment_1 )* ) )
            // InternalRaspiRover.g:2622:2: ( ( rule__RclBlock__StmtsAssignment_1 ) ) ( ( rule__RclBlock__StmtsAssignment_1 )* )
            {
            // InternalRaspiRover.g:2622:2: ( ( rule__RclBlock__StmtsAssignment_1 ) )
            // InternalRaspiRover.g:2623:3: ( rule__RclBlock__StmtsAssignment_1 )
            {
             before(grammarAccess.getRclBlockAccess().getStmtsAssignment_1()); 
            // InternalRaspiRover.g:2624:3: ( rule__RclBlock__StmtsAssignment_1 )
            // InternalRaspiRover.g:2624:4: rule__RclBlock__StmtsAssignment_1
            {
            pushFollow(FOLLOW_17);
            rule__RclBlock__StmtsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRclBlockAccess().getStmtsAssignment_1()); 

            }

            // InternalRaspiRover.g:2627:2: ( ( rule__RclBlock__StmtsAssignment_1 )* )
            // InternalRaspiRover.g:2628:3: ( rule__RclBlock__StmtsAssignment_1 )*
            {
             before(grammarAccess.getRclBlockAccess().getStmtsAssignment_1()); 
            // InternalRaspiRover.g:2629:3: ( rule__RclBlock__StmtsAssignment_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID||LA16_0==20||LA16_0==30||LA16_0==32||(LA16_0>=36 && LA16_0<=42)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalRaspiRover.g:2629:4: rule__RclBlock__StmtsAssignment_1
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__RclBlock__StmtsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getRclBlockAccess().getStmtsAssignment_1()); 

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
    // $ANTLR end "rule__RclBlock__Group__1__Impl"


    // $ANTLR start "rule__RclBlock__Group__2"
    // InternalRaspiRover.g:2638:1: rule__RclBlock__Group__2 : rule__RclBlock__Group__2__Impl ;
    public final void rule__RclBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2642:1: ( rule__RclBlock__Group__2__Impl )
            // InternalRaspiRover.g:2643:2: rule__RclBlock__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RclBlock__Group__2__Impl();

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
    // $ANTLR end "rule__RclBlock__Group__2"


    // $ANTLR start "rule__RclBlock__Group__2__Impl"
    // InternalRaspiRover.g:2649:1: rule__RclBlock__Group__2__Impl : ( '}' ) ;
    public final void rule__RclBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2653:1: ( ( '}' ) )
            // InternalRaspiRover.g:2654:1: ( '}' )
            {
            // InternalRaspiRover.g:2654:1: ( '}' )
            // InternalRaspiRover.g:2655:2: '}'
            {
             before(grammarAccess.getRclBlockAccess().getRightCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRclBlockAccess().getRightCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__RclBlock__Group__2__Impl"


    // $ANTLR start "rule__VarAssignment__Group__0"
    // InternalRaspiRover.g:2665:1: rule__VarAssignment__Group__0 : rule__VarAssignment__Group__0__Impl rule__VarAssignment__Group__1 ;
    public final void rule__VarAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2669:1: ( rule__VarAssignment__Group__0__Impl rule__VarAssignment__Group__1 )
            // InternalRaspiRover.g:2670:2: rule__VarAssignment__Group__0__Impl rule__VarAssignment__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__VarAssignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarAssignment__Group__1();

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
    // $ANTLR end "rule__VarAssignment__Group__0"


    // $ANTLR start "rule__VarAssignment__Group__0__Impl"
    // InternalRaspiRover.g:2677:1: rule__VarAssignment__Group__0__Impl : ( 'var' ) ;
    public final void rule__VarAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2681:1: ( ( 'var' ) )
            // InternalRaspiRover.g:2682:1: ( 'var' )
            {
            // InternalRaspiRover.g:2682:1: ( 'var' )
            // InternalRaspiRover.g:2683:2: 'var'
            {
             before(grammarAccess.getVarAssignmentAccess().getVarKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getVarAssignmentAccess().getVarKeyword_0()); 

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
    // $ANTLR end "rule__VarAssignment__Group__0__Impl"


    // $ANTLR start "rule__VarAssignment__Group__1"
    // InternalRaspiRover.g:2692:1: rule__VarAssignment__Group__1 : rule__VarAssignment__Group__1__Impl rule__VarAssignment__Group__2 ;
    public final void rule__VarAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2696:1: ( rule__VarAssignment__Group__1__Impl rule__VarAssignment__Group__2 )
            // InternalRaspiRover.g:2697:2: rule__VarAssignment__Group__1__Impl rule__VarAssignment__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__VarAssignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarAssignment__Group__2();

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
    // $ANTLR end "rule__VarAssignment__Group__1"


    // $ANTLR start "rule__VarAssignment__Group__1__Impl"
    // InternalRaspiRover.g:2704:1: rule__VarAssignment__Group__1__Impl : ( ( rule__VarAssignment__NameAssignment_1 ) ) ;
    public final void rule__VarAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2708:1: ( ( ( rule__VarAssignment__NameAssignment_1 ) ) )
            // InternalRaspiRover.g:2709:1: ( ( rule__VarAssignment__NameAssignment_1 ) )
            {
            // InternalRaspiRover.g:2709:1: ( ( rule__VarAssignment__NameAssignment_1 ) )
            // InternalRaspiRover.g:2710:2: ( rule__VarAssignment__NameAssignment_1 )
            {
             before(grammarAccess.getVarAssignmentAccess().getNameAssignment_1()); 
            // InternalRaspiRover.g:2711:2: ( rule__VarAssignment__NameAssignment_1 )
            // InternalRaspiRover.g:2711:3: rule__VarAssignment__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VarAssignment__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVarAssignmentAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__VarAssignment__Group__1__Impl"


    // $ANTLR start "rule__VarAssignment__Group__2"
    // InternalRaspiRover.g:2719:1: rule__VarAssignment__Group__2 : rule__VarAssignment__Group__2__Impl rule__VarAssignment__Group__3 ;
    public final void rule__VarAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2723:1: ( rule__VarAssignment__Group__2__Impl rule__VarAssignment__Group__3 )
            // InternalRaspiRover.g:2724:2: rule__VarAssignment__Group__2__Impl rule__VarAssignment__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__VarAssignment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarAssignment__Group__3();

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
    // $ANTLR end "rule__VarAssignment__Group__2"


    // $ANTLR start "rule__VarAssignment__Group__2__Impl"
    // InternalRaspiRover.g:2731:1: rule__VarAssignment__Group__2__Impl : ( ':=' ) ;
    public final void rule__VarAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2735:1: ( ( ':=' ) )
            // InternalRaspiRover.g:2736:1: ( ':=' )
            {
            // InternalRaspiRover.g:2736:1: ( ':=' )
            // InternalRaspiRover.g:2737:2: ':='
            {
             before(grammarAccess.getVarAssignmentAccess().getColonEqualsSignKeyword_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getVarAssignmentAccess().getColonEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__VarAssignment__Group__2__Impl"


    // $ANTLR start "rule__VarAssignment__Group__3"
    // InternalRaspiRover.g:2746:1: rule__VarAssignment__Group__3 : rule__VarAssignment__Group__3__Impl ;
    public final void rule__VarAssignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2750:1: ( rule__VarAssignment__Group__3__Impl )
            // InternalRaspiRover.g:2751:2: rule__VarAssignment__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VarAssignment__Group__3__Impl();

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
    // $ANTLR end "rule__VarAssignment__Group__3"


    // $ANTLR start "rule__VarAssignment__Group__3__Impl"
    // InternalRaspiRover.g:2757:1: rule__VarAssignment__Group__3__Impl : ( ( rule__VarAssignment__ValueAssignment_3 ) ) ;
    public final void rule__VarAssignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2761:1: ( ( ( rule__VarAssignment__ValueAssignment_3 ) ) )
            // InternalRaspiRover.g:2762:1: ( ( rule__VarAssignment__ValueAssignment_3 ) )
            {
            // InternalRaspiRover.g:2762:1: ( ( rule__VarAssignment__ValueAssignment_3 ) )
            // InternalRaspiRover.g:2763:2: ( rule__VarAssignment__ValueAssignment_3 )
            {
             before(grammarAccess.getVarAssignmentAccess().getValueAssignment_3()); 
            // InternalRaspiRover.g:2764:2: ( rule__VarAssignment__ValueAssignment_3 )
            // InternalRaspiRover.g:2764:3: rule__VarAssignment__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__VarAssignment__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVarAssignmentAccess().getValueAssignment_3()); 

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
    // $ANTLR end "rule__VarAssignment__Group__3__Impl"


    // $ANTLR start "rule__Conditional__Group__0"
    // InternalRaspiRover.g:2773:1: rule__Conditional__Group__0 : rule__Conditional__Group__0__Impl rule__Conditional__Group__1 ;
    public final void rule__Conditional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2777:1: ( rule__Conditional__Group__0__Impl rule__Conditional__Group__1 )
            // InternalRaspiRover.g:2778:2: rule__Conditional__Group__0__Impl rule__Conditional__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Conditional__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional__Group__1();

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
    // $ANTLR end "rule__Conditional__Group__0"


    // $ANTLR start "rule__Conditional__Group__0__Impl"
    // InternalRaspiRover.g:2785:1: rule__Conditional__Group__0__Impl : ( 'if' ) ;
    public final void rule__Conditional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2789:1: ( ( 'if' ) )
            // InternalRaspiRover.g:2790:1: ( 'if' )
            {
            // InternalRaspiRover.g:2790:1: ( 'if' )
            // InternalRaspiRover.g:2791:2: 'if'
            {
             before(grammarAccess.getConditionalAccess().getIfKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getConditionalAccess().getIfKeyword_0()); 

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
    // $ANTLR end "rule__Conditional__Group__0__Impl"


    // $ANTLR start "rule__Conditional__Group__1"
    // InternalRaspiRover.g:2800:1: rule__Conditional__Group__1 : rule__Conditional__Group__1__Impl rule__Conditional__Group__2 ;
    public final void rule__Conditional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2804:1: ( rule__Conditional__Group__1__Impl rule__Conditional__Group__2 )
            // InternalRaspiRover.g:2805:2: rule__Conditional__Group__1__Impl rule__Conditional__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Conditional__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional__Group__2();

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
    // $ANTLR end "rule__Conditional__Group__1"


    // $ANTLR start "rule__Conditional__Group__1__Impl"
    // InternalRaspiRover.g:2812:1: rule__Conditional__Group__1__Impl : ( '(' ) ;
    public final void rule__Conditional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2816:1: ( ( '(' ) )
            // InternalRaspiRover.g:2817:1: ( '(' )
            {
            // InternalRaspiRover.g:2817:1: ( '(' )
            // InternalRaspiRover.g:2818:2: '('
            {
             before(grammarAccess.getConditionalAccess().getLeftParenthesisKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getConditionalAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Conditional__Group__1__Impl"


    // $ANTLR start "rule__Conditional__Group__2"
    // InternalRaspiRover.g:2827:1: rule__Conditional__Group__2 : rule__Conditional__Group__2__Impl rule__Conditional__Group__3 ;
    public final void rule__Conditional__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2831:1: ( rule__Conditional__Group__2__Impl rule__Conditional__Group__3 )
            // InternalRaspiRover.g:2832:2: rule__Conditional__Group__2__Impl rule__Conditional__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Conditional__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional__Group__3();

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
    // $ANTLR end "rule__Conditional__Group__2"


    // $ANTLR start "rule__Conditional__Group__2__Impl"
    // InternalRaspiRover.g:2839:1: rule__Conditional__Group__2__Impl : ( ( rule__Conditional__ExprAssignment_2 ) ) ;
    public final void rule__Conditional__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2843:1: ( ( ( rule__Conditional__ExprAssignment_2 ) ) )
            // InternalRaspiRover.g:2844:1: ( ( rule__Conditional__ExprAssignment_2 ) )
            {
            // InternalRaspiRover.g:2844:1: ( ( rule__Conditional__ExprAssignment_2 ) )
            // InternalRaspiRover.g:2845:2: ( rule__Conditional__ExprAssignment_2 )
            {
             before(grammarAccess.getConditionalAccess().getExprAssignment_2()); 
            // InternalRaspiRover.g:2846:2: ( rule__Conditional__ExprAssignment_2 )
            // InternalRaspiRover.g:2846:3: rule__Conditional__ExprAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Conditional__ExprAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConditionalAccess().getExprAssignment_2()); 

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
    // $ANTLR end "rule__Conditional__Group__2__Impl"


    // $ANTLR start "rule__Conditional__Group__3"
    // InternalRaspiRover.g:2854:1: rule__Conditional__Group__3 : rule__Conditional__Group__3__Impl rule__Conditional__Group__4 ;
    public final void rule__Conditional__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2858:1: ( rule__Conditional__Group__3__Impl rule__Conditional__Group__4 )
            // InternalRaspiRover.g:2859:2: rule__Conditional__Group__3__Impl rule__Conditional__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Conditional__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional__Group__4();

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
    // $ANTLR end "rule__Conditional__Group__3"


    // $ANTLR start "rule__Conditional__Group__3__Impl"
    // InternalRaspiRover.g:2866:1: rule__Conditional__Group__3__Impl : ( ')' ) ;
    public final void rule__Conditional__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2870:1: ( ( ')' ) )
            // InternalRaspiRover.g:2871:1: ( ')' )
            {
            // InternalRaspiRover.g:2871:1: ( ')' )
            // InternalRaspiRover.g:2872:2: ')'
            {
             before(grammarAccess.getConditionalAccess().getRightParenthesisKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getConditionalAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Conditional__Group__3__Impl"


    // $ANTLR start "rule__Conditional__Group__4"
    // InternalRaspiRover.g:2881:1: rule__Conditional__Group__4 : rule__Conditional__Group__4__Impl rule__Conditional__Group__5 ;
    public final void rule__Conditional__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2885:1: ( rule__Conditional__Group__4__Impl rule__Conditional__Group__5 )
            // InternalRaspiRover.g:2886:2: rule__Conditional__Group__4__Impl rule__Conditional__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__Conditional__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional__Group__5();

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
    // $ANTLR end "rule__Conditional__Group__4"


    // $ANTLR start "rule__Conditional__Group__4__Impl"
    // InternalRaspiRover.g:2893:1: rule__Conditional__Group__4__Impl : ( ( rule__Conditional__CondTrueAssignment_4 ) ) ;
    public final void rule__Conditional__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2897:1: ( ( ( rule__Conditional__CondTrueAssignment_4 ) ) )
            // InternalRaspiRover.g:2898:1: ( ( rule__Conditional__CondTrueAssignment_4 ) )
            {
            // InternalRaspiRover.g:2898:1: ( ( rule__Conditional__CondTrueAssignment_4 ) )
            // InternalRaspiRover.g:2899:2: ( rule__Conditional__CondTrueAssignment_4 )
            {
             before(grammarAccess.getConditionalAccess().getCondTrueAssignment_4()); 
            // InternalRaspiRover.g:2900:2: ( rule__Conditional__CondTrueAssignment_4 )
            // InternalRaspiRover.g:2900:3: rule__Conditional__CondTrueAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Conditional__CondTrueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getConditionalAccess().getCondTrueAssignment_4()); 

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
    // $ANTLR end "rule__Conditional__Group__4__Impl"


    // $ANTLR start "rule__Conditional__Group__5"
    // InternalRaspiRover.g:2908:1: rule__Conditional__Group__5 : rule__Conditional__Group__5__Impl rule__Conditional__Group__6 ;
    public final void rule__Conditional__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2912:1: ( rule__Conditional__Group__5__Impl rule__Conditional__Group__6 )
            // InternalRaspiRover.g:2913:2: rule__Conditional__Group__5__Impl rule__Conditional__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Conditional__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional__Group__6();

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
    // $ANTLR end "rule__Conditional__Group__5"


    // $ANTLR start "rule__Conditional__Group__5__Impl"
    // InternalRaspiRover.g:2920:1: rule__Conditional__Group__5__Impl : ( 'else' ) ;
    public final void rule__Conditional__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2924:1: ( ( 'else' ) )
            // InternalRaspiRover.g:2925:1: ( 'else' )
            {
            // InternalRaspiRover.g:2925:1: ( 'else' )
            // InternalRaspiRover.g:2926:2: 'else'
            {
             before(grammarAccess.getConditionalAccess().getElseKeyword_5()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getConditionalAccess().getElseKeyword_5()); 

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
    // $ANTLR end "rule__Conditional__Group__5__Impl"


    // $ANTLR start "rule__Conditional__Group__6"
    // InternalRaspiRover.g:2935:1: rule__Conditional__Group__6 : rule__Conditional__Group__6__Impl ;
    public final void rule__Conditional__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2939:1: ( rule__Conditional__Group__6__Impl )
            // InternalRaspiRover.g:2940:2: rule__Conditional__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conditional__Group__6__Impl();

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
    // $ANTLR end "rule__Conditional__Group__6"


    // $ANTLR start "rule__Conditional__Group__6__Impl"
    // InternalRaspiRover.g:2946:1: rule__Conditional__Group__6__Impl : ( ( rule__Conditional__CondFalseAssignment_6 ) ) ;
    public final void rule__Conditional__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2950:1: ( ( ( rule__Conditional__CondFalseAssignment_6 ) ) )
            // InternalRaspiRover.g:2951:1: ( ( rule__Conditional__CondFalseAssignment_6 ) )
            {
            // InternalRaspiRover.g:2951:1: ( ( rule__Conditional__CondFalseAssignment_6 ) )
            // InternalRaspiRover.g:2952:2: ( rule__Conditional__CondFalseAssignment_6 )
            {
             before(grammarAccess.getConditionalAccess().getCondFalseAssignment_6()); 
            // InternalRaspiRover.g:2953:2: ( rule__Conditional__CondFalseAssignment_6 )
            // InternalRaspiRover.g:2953:3: rule__Conditional__CondFalseAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Conditional__CondFalseAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getConditionalAccess().getCondFalseAssignment_6()); 

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
    // $ANTLR end "rule__Conditional__Group__6__Impl"


    // $ANTLR start "rule__Loop__Group__0"
    // InternalRaspiRover.g:2962:1: rule__Loop__Group__0 : rule__Loop__Group__0__Impl rule__Loop__Group__1 ;
    public final void rule__Loop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2966:1: ( rule__Loop__Group__0__Impl rule__Loop__Group__1 )
            // InternalRaspiRover.g:2967:2: rule__Loop__Group__0__Impl rule__Loop__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Loop__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__1();

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
    // $ANTLR end "rule__Loop__Group__0"


    // $ANTLR start "rule__Loop__Group__0__Impl"
    // InternalRaspiRover.g:2974:1: rule__Loop__Group__0__Impl : ( 'while' ) ;
    public final void rule__Loop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2978:1: ( ( 'while' ) )
            // InternalRaspiRover.g:2979:1: ( 'while' )
            {
            // InternalRaspiRover.g:2979:1: ( 'while' )
            // InternalRaspiRover.g:2980:2: 'while'
            {
             before(grammarAccess.getLoopAccess().getWhileKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getWhileKeyword_0()); 

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
    // $ANTLR end "rule__Loop__Group__0__Impl"


    // $ANTLR start "rule__Loop__Group__1"
    // InternalRaspiRover.g:2989:1: rule__Loop__Group__1 : rule__Loop__Group__1__Impl rule__Loop__Group__2 ;
    public final void rule__Loop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:2993:1: ( rule__Loop__Group__1__Impl rule__Loop__Group__2 )
            // InternalRaspiRover.g:2994:2: rule__Loop__Group__1__Impl rule__Loop__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Loop__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__2();

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
    // $ANTLR end "rule__Loop__Group__1"


    // $ANTLR start "rule__Loop__Group__1__Impl"
    // InternalRaspiRover.g:3001:1: rule__Loop__Group__1__Impl : ( '(' ) ;
    public final void rule__Loop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3005:1: ( ( '(' ) )
            // InternalRaspiRover.g:3006:1: ( '(' )
            {
            // InternalRaspiRover.g:3006:1: ( '(' )
            // InternalRaspiRover.g:3007:2: '('
            {
             before(grammarAccess.getLoopAccess().getLeftParenthesisKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Loop__Group__1__Impl"


    // $ANTLR start "rule__Loop__Group__2"
    // InternalRaspiRover.g:3016:1: rule__Loop__Group__2 : rule__Loop__Group__2__Impl rule__Loop__Group__3 ;
    public final void rule__Loop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3020:1: ( rule__Loop__Group__2__Impl rule__Loop__Group__3 )
            // InternalRaspiRover.g:3021:2: rule__Loop__Group__2__Impl rule__Loop__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Loop__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__3();

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
    // $ANTLR end "rule__Loop__Group__2"


    // $ANTLR start "rule__Loop__Group__2__Impl"
    // InternalRaspiRover.g:3028:1: rule__Loop__Group__2__Impl : ( ( rule__Loop__ExprAssignment_2 ) ) ;
    public final void rule__Loop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3032:1: ( ( ( rule__Loop__ExprAssignment_2 ) ) )
            // InternalRaspiRover.g:3033:1: ( ( rule__Loop__ExprAssignment_2 ) )
            {
            // InternalRaspiRover.g:3033:1: ( ( rule__Loop__ExprAssignment_2 ) )
            // InternalRaspiRover.g:3034:2: ( rule__Loop__ExprAssignment_2 )
            {
             before(grammarAccess.getLoopAccess().getExprAssignment_2()); 
            // InternalRaspiRover.g:3035:2: ( rule__Loop__ExprAssignment_2 )
            // InternalRaspiRover.g:3035:3: rule__Loop__ExprAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Loop__ExprAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getExprAssignment_2()); 

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
    // $ANTLR end "rule__Loop__Group__2__Impl"


    // $ANTLR start "rule__Loop__Group__3"
    // InternalRaspiRover.g:3043:1: rule__Loop__Group__3 : rule__Loop__Group__3__Impl rule__Loop__Group__4 ;
    public final void rule__Loop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3047:1: ( rule__Loop__Group__3__Impl rule__Loop__Group__4 )
            // InternalRaspiRover.g:3048:2: rule__Loop__Group__3__Impl rule__Loop__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Loop__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__4();

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
    // $ANTLR end "rule__Loop__Group__3"


    // $ANTLR start "rule__Loop__Group__3__Impl"
    // InternalRaspiRover.g:3055:1: rule__Loop__Group__3__Impl : ( ')' ) ;
    public final void rule__Loop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3059:1: ( ( ')' ) )
            // InternalRaspiRover.g:3060:1: ( ')' )
            {
            // InternalRaspiRover.g:3060:1: ( ')' )
            // InternalRaspiRover.g:3061:2: ')'
            {
             before(grammarAccess.getLoopAccess().getRightParenthesisKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Loop__Group__3__Impl"


    // $ANTLR start "rule__Loop__Group__4"
    // InternalRaspiRover.g:3070:1: rule__Loop__Group__4 : rule__Loop__Group__4__Impl rule__Loop__Group__5 ;
    public final void rule__Loop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3074:1: ( rule__Loop__Group__4__Impl rule__Loop__Group__5 )
            // InternalRaspiRover.g:3075:2: rule__Loop__Group__4__Impl rule__Loop__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Loop__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__5();

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
    // $ANTLR end "rule__Loop__Group__4"


    // $ANTLR start "rule__Loop__Group__4__Impl"
    // InternalRaspiRover.g:3082:1: rule__Loop__Group__4__Impl : ( '{' ) ;
    public final void rule__Loop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3086:1: ( ( '{' ) )
            // InternalRaspiRover.g:3087:1: ( '{' )
            {
            // InternalRaspiRover.g:3087:1: ( '{' )
            // InternalRaspiRover.g:3088:2: '{'
            {
             before(grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Loop__Group__4__Impl"


    // $ANTLR start "rule__Loop__Group__5"
    // InternalRaspiRover.g:3097:1: rule__Loop__Group__5 : rule__Loop__Group__5__Impl rule__Loop__Group__6 ;
    public final void rule__Loop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3101:1: ( rule__Loop__Group__5__Impl rule__Loop__Group__6 )
            // InternalRaspiRover.g:3102:2: rule__Loop__Group__5__Impl rule__Loop__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__Loop__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__6();

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
    // $ANTLR end "rule__Loop__Group__5"


    // $ANTLR start "rule__Loop__Group__5__Impl"
    // InternalRaspiRover.g:3109:1: rule__Loop__Group__5__Impl : ( ( rule__Loop__BlockAssignment_5 ) ) ;
    public final void rule__Loop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3113:1: ( ( ( rule__Loop__BlockAssignment_5 ) ) )
            // InternalRaspiRover.g:3114:1: ( ( rule__Loop__BlockAssignment_5 ) )
            {
            // InternalRaspiRover.g:3114:1: ( ( rule__Loop__BlockAssignment_5 ) )
            // InternalRaspiRover.g:3115:2: ( rule__Loop__BlockAssignment_5 )
            {
             before(grammarAccess.getLoopAccess().getBlockAssignment_5()); 
            // InternalRaspiRover.g:3116:2: ( rule__Loop__BlockAssignment_5 )
            // InternalRaspiRover.g:3116:3: rule__Loop__BlockAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Loop__BlockAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getBlockAssignment_5()); 

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
    // $ANTLR end "rule__Loop__Group__5__Impl"


    // $ANTLR start "rule__Loop__Group__6"
    // InternalRaspiRover.g:3124:1: rule__Loop__Group__6 : rule__Loop__Group__6__Impl ;
    public final void rule__Loop__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3128:1: ( rule__Loop__Group__6__Impl )
            // InternalRaspiRover.g:3129:2: rule__Loop__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group__6__Impl();

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
    // $ANTLR end "rule__Loop__Group__6"


    // $ANTLR start "rule__Loop__Group__6__Impl"
    // InternalRaspiRover.g:3135:1: rule__Loop__Group__6__Impl : ( '}' ) ;
    public final void rule__Loop__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3139:1: ( ( '}' ) )
            // InternalRaspiRover.g:3140:1: ( '}' )
            {
            // InternalRaspiRover.g:3140:1: ( '}' )
            // InternalRaspiRover.g:3141:2: '}'
            {
             before(grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Loop__Group__6__Impl"


    // $ANTLR start "rule__ForwardAction__Group__0"
    // InternalRaspiRover.g:3151:1: rule__ForwardAction__Group__0 : rule__ForwardAction__Group__0__Impl rule__ForwardAction__Group__1 ;
    public final void rule__ForwardAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3155:1: ( rule__ForwardAction__Group__0__Impl rule__ForwardAction__Group__1 )
            // InternalRaspiRover.g:3156:2: rule__ForwardAction__Group__0__Impl rule__ForwardAction__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__ForwardAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForwardAction__Group__1();

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
    // $ANTLR end "rule__ForwardAction__Group__0"


    // $ANTLR start "rule__ForwardAction__Group__0__Impl"
    // InternalRaspiRover.g:3163:1: rule__ForwardAction__Group__0__Impl : ( () ) ;
    public final void rule__ForwardAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3167:1: ( ( () ) )
            // InternalRaspiRover.g:3168:1: ( () )
            {
            // InternalRaspiRover.g:3168:1: ( () )
            // InternalRaspiRover.g:3169:2: ()
            {
             before(grammarAccess.getForwardActionAccess().getForwardActionAction_0()); 
            // InternalRaspiRover.g:3170:2: ()
            // InternalRaspiRover.g:3170:3: 
            {
            }

             after(grammarAccess.getForwardActionAccess().getForwardActionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForwardAction__Group__0__Impl"


    // $ANTLR start "rule__ForwardAction__Group__1"
    // InternalRaspiRover.g:3178:1: rule__ForwardAction__Group__1 : rule__ForwardAction__Group__1__Impl ;
    public final void rule__ForwardAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3182:1: ( rule__ForwardAction__Group__1__Impl )
            // InternalRaspiRover.g:3183:2: rule__ForwardAction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForwardAction__Group__1__Impl();

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
    // $ANTLR end "rule__ForwardAction__Group__1"


    // $ANTLR start "rule__ForwardAction__Group__1__Impl"
    // InternalRaspiRover.g:3189:1: rule__ForwardAction__Group__1__Impl : ( 'forward' ) ;
    public final void rule__ForwardAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3193:1: ( ( 'forward' ) )
            // InternalRaspiRover.g:3194:1: ( 'forward' )
            {
            // InternalRaspiRover.g:3194:1: ( 'forward' )
            // InternalRaspiRover.g:3195:2: 'forward'
            {
             before(grammarAccess.getForwardActionAccess().getForwardKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getForwardActionAccess().getForwardKeyword_1()); 

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
    // $ANTLR end "rule__ForwardAction__Group__1__Impl"


    // $ANTLR start "rule__ForwardMinAction__Group__0"
    // InternalRaspiRover.g:3205:1: rule__ForwardMinAction__Group__0 : rule__ForwardMinAction__Group__0__Impl rule__ForwardMinAction__Group__1 ;
    public final void rule__ForwardMinAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3209:1: ( rule__ForwardMinAction__Group__0__Impl rule__ForwardMinAction__Group__1 )
            // InternalRaspiRover.g:3210:2: rule__ForwardMinAction__Group__0__Impl rule__ForwardMinAction__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__ForwardMinAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForwardMinAction__Group__1();

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
    // $ANTLR end "rule__ForwardMinAction__Group__0"


    // $ANTLR start "rule__ForwardMinAction__Group__0__Impl"
    // InternalRaspiRover.g:3217:1: rule__ForwardMinAction__Group__0__Impl : ( () ) ;
    public final void rule__ForwardMinAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3221:1: ( ( () ) )
            // InternalRaspiRover.g:3222:1: ( () )
            {
            // InternalRaspiRover.g:3222:1: ( () )
            // InternalRaspiRover.g:3223:2: ()
            {
             before(grammarAccess.getForwardMinActionAccess().getForwardMinActionAction_0()); 
            // InternalRaspiRover.g:3224:2: ()
            // InternalRaspiRover.g:3224:3: 
            {
            }

             after(grammarAccess.getForwardMinActionAccess().getForwardMinActionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForwardMinAction__Group__0__Impl"


    // $ANTLR start "rule__ForwardMinAction__Group__1"
    // InternalRaspiRover.g:3232:1: rule__ForwardMinAction__Group__1 : rule__ForwardMinAction__Group__1__Impl rule__ForwardMinAction__Group__2 ;
    public final void rule__ForwardMinAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3236:1: ( rule__ForwardMinAction__Group__1__Impl rule__ForwardMinAction__Group__2 )
            // InternalRaspiRover.g:3237:2: rule__ForwardMinAction__Group__1__Impl rule__ForwardMinAction__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__ForwardMinAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForwardMinAction__Group__2();

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
    // $ANTLR end "rule__ForwardMinAction__Group__1"


    // $ANTLR start "rule__ForwardMinAction__Group__1__Impl"
    // InternalRaspiRover.g:3244:1: rule__ForwardMinAction__Group__1__Impl : ( 'forward' ) ;
    public final void rule__ForwardMinAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3248:1: ( ( 'forward' ) )
            // InternalRaspiRover.g:3249:1: ( 'forward' )
            {
            // InternalRaspiRover.g:3249:1: ( 'forward' )
            // InternalRaspiRover.g:3250:2: 'forward'
            {
             before(grammarAccess.getForwardMinActionAccess().getForwardKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getForwardMinActionAccess().getForwardKeyword_1()); 

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
    // $ANTLR end "rule__ForwardMinAction__Group__1__Impl"


    // $ANTLR start "rule__ForwardMinAction__Group__2"
    // InternalRaspiRover.g:3259:1: rule__ForwardMinAction__Group__2 : rule__ForwardMinAction__Group__2__Impl ;
    public final void rule__ForwardMinAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3263:1: ( rule__ForwardMinAction__Group__2__Impl )
            // InternalRaspiRover.g:3264:2: rule__ForwardMinAction__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForwardMinAction__Group__2__Impl();

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
    // $ANTLR end "rule__ForwardMinAction__Group__2"


    // $ANTLR start "rule__ForwardMinAction__Group__2__Impl"
    // InternalRaspiRover.g:3270:1: rule__ForwardMinAction__Group__2__Impl : ( ( rule__ForwardMinAction__DistanceAssignment_2 ) ) ;
    public final void rule__ForwardMinAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3274:1: ( ( ( rule__ForwardMinAction__DistanceAssignment_2 ) ) )
            // InternalRaspiRover.g:3275:1: ( ( rule__ForwardMinAction__DistanceAssignment_2 ) )
            {
            // InternalRaspiRover.g:3275:1: ( ( rule__ForwardMinAction__DistanceAssignment_2 ) )
            // InternalRaspiRover.g:3276:2: ( rule__ForwardMinAction__DistanceAssignment_2 )
            {
             before(grammarAccess.getForwardMinActionAccess().getDistanceAssignment_2()); 
            // InternalRaspiRover.g:3277:2: ( rule__ForwardMinAction__DistanceAssignment_2 )
            // InternalRaspiRover.g:3277:3: rule__ForwardMinAction__DistanceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ForwardMinAction__DistanceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getForwardMinActionAccess().getDistanceAssignment_2()); 

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
    // $ANTLR end "rule__ForwardMinAction__Group__2__Impl"


    // $ANTLR start "rule__BackwardAction__Group__0"
    // InternalRaspiRover.g:3286:1: rule__BackwardAction__Group__0 : rule__BackwardAction__Group__0__Impl rule__BackwardAction__Group__1 ;
    public final void rule__BackwardAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3290:1: ( rule__BackwardAction__Group__0__Impl rule__BackwardAction__Group__1 )
            // InternalRaspiRover.g:3291:2: rule__BackwardAction__Group__0__Impl rule__BackwardAction__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__BackwardAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BackwardAction__Group__1();

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
    // $ANTLR end "rule__BackwardAction__Group__0"


    // $ANTLR start "rule__BackwardAction__Group__0__Impl"
    // InternalRaspiRover.g:3298:1: rule__BackwardAction__Group__0__Impl : ( () ) ;
    public final void rule__BackwardAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3302:1: ( ( () ) )
            // InternalRaspiRover.g:3303:1: ( () )
            {
            // InternalRaspiRover.g:3303:1: ( () )
            // InternalRaspiRover.g:3304:2: ()
            {
             before(grammarAccess.getBackwardActionAccess().getBackwardActionAction_0()); 
            // InternalRaspiRover.g:3305:2: ()
            // InternalRaspiRover.g:3305:3: 
            {
            }

             after(grammarAccess.getBackwardActionAccess().getBackwardActionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackwardAction__Group__0__Impl"


    // $ANTLR start "rule__BackwardAction__Group__1"
    // InternalRaspiRover.g:3313:1: rule__BackwardAction__Group__1 : rule__BackwardAction__Group__1__Impl ;
    public final void rule__BackwardAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3317:1: ( rule__BackwardAction__Group__1__Impl )
            // InternalRaspiRover.g:3318:2: rule__BackwardAction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BackwardAction__Group__1__Impl();

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
    // $ANTLR end "rule__BackwardAction__Group__1"


    // $ANTLR start "rule__BackwardAction__Group__1__Impl"
    // InternalRaspiRover.g:3324:1: rule__BackwardAction__Group__1__Impl : ( 'backward' ) ;
    public final void rule__BackwardAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3328:1: ( ( 'backward' ) )
            // InternalRaspiRover.g:3329:1: ( 'backward' )
            {
            // InternalRaspiRover.g:3329:1: ( 'backward' )
            // InternalRaspiRover.g:3330:2: 'backward'
            {
             before(grammarAccess.getBackwardActionAccess().getBackwardKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getBackwardActionAccess().getBackwardKeyword_1()); 

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
    // $ANTLR end "rule__BackwardAction__Group__1__Impl"


    // $ANTLR start "rule__BackwardMinAction__Group__0"
    // InternalRaspiRover.g:3340:1: rule__BackwardMinAction__Group__0 : rule__BackwardMinAction__Group__0__Impl rule__BackwardMinAction__Group__1 ;
    public final void rule__BackwardMinAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3344:1: ( rule__BackwardMinAction__Group__0__Impl rule__BackwardMinAction__Group__1 )
            // InternalRaspiRover.g:3345:2: rule__BackwardMinAction__Group__0__Impl rule__BackwardMinAction__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__BackwardMinAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BackwardMinAction__Group__1();

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
    // $ANTLR end "rule__BackwardMinAction__Group__0"


    // $ANTLR start "rule__BackwardMinAction__Group__0__Impl"
    // InternalRaspiRover.g:3352:1: rule__BackwardMinAction__Group__0__Impl : ( () ) ;
    public final void rule__BackwardMinAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3356:1: ( ( () ) )
            // InternalRaspiRover.g:3357:1: ( () )
            {
            // InternalRaspiRover.g:3357:1: ( () )
            // InternalRaspiRover.g:3358:2: ()
            {
             before(grammarAccess.getBackwardMinActionAccess().getBackwardMinActionAction_0()); 
            // InternalRaspiRover.g:3359:2: ()
            // InternalRaspiRover.g:3359:3: 
            {
            }

             after(grammarAccess.getBackwardMinActionAccess().getBackwardMinActionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackwardMinAction__Group__0__Impl"


    // $ANTLR start "rule__BackwardMinAction__Group__1"
    // InternalRaspiRover.g:3367:1: rule__BackwardMinAction__Group__1 : rule__BackwardMinAction__Group__1__Impl rule__BackwardMinAction__Group__2 ;
    public final void rule__BackwardMinAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3371:1: ( rule__BackwardMinAction__Group__1__Impl rule__BackwardMinAction__Group__2 )
            // InternalRaspiRover.g:3372:2: rule__BackwardMinAction__Group__1__Impl rule__BackwardMinAction__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__BackwardMinAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BackwardMinAction__Group__2();

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
    // $ANTLR end "rule__BackwardMinAction__Group__1"


    // $ANTLR start "rule__BackwardMinAction__Group__1__Impl"
    // InternalRaspiRover.g:3379:1: rule__BackwardMinAction__Group__1__Impl : ( 'backward' ) ;
    public final void rule__BackwardMinAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3383:1: ( ( 'backward' ) )
            // InternalRaspiRover.g:3384:1: ( 'backward' )
            {
            // InternalRaspiRover.g:3384:1: ( 'backward' )
            // InternalRaspiRover.g:3385:2: 'backward'
            {
             before(grammarAccess.getBackwardMinActionAccess().getBackwardKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getBackwardMinActionAccess().getBackwardKeyword_1()); 

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
    // $ANTLR end "rule__BackwardMinAction__Group__1__Impl"


    // $ANTLR start "rule__BackwardMinAction__Group__2"
    // InternalRaspiRover.g:3394:1: rule__BackwardMinAction__Group__2 : rule__BackwardMinAction__Group__2__Impl ;
    public final void rule__BackwardMinAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3398:1: ( rule__BackwardMinAction__Group__2__Impl )
            // InternalRaspiRover.g:3399:2: rule__BackwardMinAction__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BackwardMinAction__Group__2__Impl();

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
    // $ANTLR end "rule__BackwardMinAction__Group__2"


    // $ANTLR start "rule__BackwardMinAction__Group__2__Impl"
    // InternalRaspiRover.g:3405:1: rule__BackwardMinAction__Group__2__Impl : ( ( rule__BackwardMinAction__DistanceAssignment_2 ) ) ;
    public final void rule__BackwardMinAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3409:1: ( ( ( rule__BackwardMinAction__DistanceAssignment_2 ) ) )
            // InternalRaspiRover.g:3410:1: ( ( rule__BackwardMinAction__DistanceAssignment_2 ) )
            {
            // InternalRaspiRover.g:3410:1: ( ( rule__BackwardMinAction__DistanceAssignment_2 ) )
            // InternalRaspiRover.g:3411:2: ( rule__BackwardMinAction__DistanceAssignment_2 )
            {
             before(grammarAccess.getBackwardMinActionAccess().getDistanceAssignment_2()); 
            // InternalRaspiRover.g:3412:2: ( rule__BackwardMinAction__DistanceAssignment_2 )
            // InternalRaspiRover.g:3412:3: rule__BackwardMinAction__DistanceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BackwardMinAction__DistanceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBackwardMinActionAccess().getDistanceAssignment_2()); 

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
    // $ANTLR end "rule__BackwardMinAction__Group__2__Impl"


    // $ANTLR start "rule__TurnAction__Group__0"
    // InternalRaspiRover.g:3421:1: rule__TurnAction__Group__0 : rule__TurnAction__Group__0__Impl rule__TurnAction__Group__1 ;
    public final void rule__TurnAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3425:1: ( rule__TurnAction__Group__0__Impl rule__TurnAction__Group__1 )
            // InternalRaspiRover.g:3426:2: rule__TurnAction__Group__0__Impl rule__TurnAction__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__TurnAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurnAction__Group__1();

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
    // $ANTLR end "rule__TurnAction__Group__0"


    // $ANTLR start "rule__TurnAction__Group__0__Impl"
    // InternalRaspiRover.g:3433:1: rule__TurnAction__Group__0__Impl : ( () ) ;
    public final void rule__TurnAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3437:1: ( ( () ) )
            // InternalRaspiRover.g:3438:1: ( () )
            {
            // InternalRaspiRover.g:3438:1: ( () )
            // InternalRaspiRover.g:3439:2: ()
            {
             before(grammarAccess.getTurnActionAccess().getTurnActionAction_0()); 
            // InternalRaspiRover.g:3440:2: ()
            // InternalRaspiRover.g:3440:3: 
            {
            }

             after(grammarAccess.getTurnActionAccess().getTurnActionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnAction__Group__0__Impl"


    // $ANTLR start "rule__TurnAction__Group__1"
    // InternalRaspiRover.g:3448:1: rule__TurnAction__Group__1 : rule__TurnAction__Group__1__Impl ;
    public final void rule__TurnAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3452:1: ( rule__TurnAction__Group__1__Impl )
            // InternalRaspiRover.g:3453:2: rule__TurnAction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TurnAction__Group__1__Impl();

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
    // $ANTLR end "rule__TurnAction__Group__1"


    // $ANTLR start "rule__TurnAction__Group__1__Impl"
    // InternalRaspiRover.g:3459:1: rule__TurnAction__Group__1__Impl : ( 'turn' ) ;
    public final void rule__TurnAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3463:1: ( ( 'turn' ) )
            // InternalRaspiRover.g:3464:1: ( 'turn' )
            {
            // InternalRaspiRover.g:3464:1: ( 'turn' )
            // InternalRaspiRover.g:3465:2: 'turn'
            {
             before(grammarAccess.getTurnActionAccess().getTurnKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTurnActionAccess().getTurnKeyword_1()); 

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
    // $ANTLR end "rule__TurnAction__Group__1__Impl"


    // $ANTLR start "rule__TurnDegAction__Group__0"
    // InternalRaspiRover.g:3475:1: rule__TurnDegAction__Group__0 : rule__TurnDegAction__Group__0__Impl rule__TurnDegAction__Group__1 ;
    public final void rule__TurnDegAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3479:1: ( rule__TurnDegAction__Group__0__Impl rule__TurnDegAction__Group__1 )
            // InternalRaspiRover.g:3480:2: rule__TurnDegAction__Group__0__Impl rule__TurnDegAction__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__TurnDegAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurnDegAction__Group__1();

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
    // $ANTLR end "rule__TurnDegAction__Group__0"


    // $ANTLR start "rule__TurnDegAction__Group__0__Impl"
    // InternalRaspiRover.g:3487:1: rule__TurnDegAction__Group__0__Impl : ( () ) ;
    public final void rule__TurnDegAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3491:1: ( ( () ) )
            // InternalRaspiRover.g:3492:1: ( () )
            {
            // InternalRaspiRover.g:3492:1: ( () )
            // InternalRaspiRover.g:3493:2: ()
            {
             before(grammarAccess.getTurnDegActionAccess().getTurnDegActionAction_0()); 
            // InternalRaspiRover.g:3494:2: ()
            // InternalRaspiRover.g:3494:3: 
            {
            }

             after(grammarAccess.getTurnDegActionAccess().getTurnDegActionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnDegAction__Group__0__Impl"


    // $ANTLR start "rule__TurnDegAction__Group__1"
    // InternalRaspiRover.g:3502:1: rule__TurnDegAction__Group__1 : rule__TurnDegAction__Group__1__Impl rule__TurnDegAction__Group__2 ;
    public final void rule__TurnDegAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3506:1: ( rule__TurnDegAction__Group__1__Impl rule__TurnDegAction__Group__2 )
            // InternalRaspiRover.g:3507:2: rule__TurnDegAction__Group__1__Impl rule__TurnDegAction__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__TurnDegAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurnDegAction__Group__2();

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
    // $ANTLR end "rule__TurnDegAction__Group__1"


    // $ANTLR start "rule__TurnDegAction__Group__1__Impl"
    // InternalRaspiRover.g:3514:1: rule__TurnDegAction__Group__1__Impl : ( 'turn' ) ;
    public final void rule__TurnDegAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3518:1: ( ( 'turn' ) )
            // InternalRaspiRover.g:3519:1: ( 'turn' )
            {
            // InternalRaspiRover.g:3519:1: ( 'turn' )
            // InternalRaspiRover.g:3520:2: 'turn'
            {
             before(grammarAccess.getTurnDegActionAccess().getTurnKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTurnDegActionAccess().getTurnKeyword_1()); 

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
    // $ANTLR end "rule__TurnDegAction__Group__1__Impl"


    // $ANTLR start "rule__TurnDegAction__Group__2"
    // InternalRaspiRover.g:3529:1: rule__TurnDegAction__Group__2 : rule__TurnDegAction__Group__2__Impl ;
    public final void rule__TurnDegAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3533:1: ( rule__TurnDegAction__Group__2__Impl )
            // InternalRaspiRover.g:3534:2: rule__TurnDegAction__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TurnDegAction__Group__2__Impl();

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
    // $ANTLR end "rule__TurnDegAction__Group__2"


    // $ANTLR start "rule__TurnDegAction__Group__2__Impl"
    // InternalRaspiRover.g:3540:1: rule__TurnDegAction__Group__2__Impl : ( ( rule__TurnDegAction__DegreesAssignment_2 ) ) ;
    public final void rule__TurnDegAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3544:1: ( ( ( rule__TurnDegAction__DegreesAssignment_2 ) ) )
            // InternalRaspiRover.g:3545:1: ( ( rule__TurnDegAction__DegreesAssignment_2 ) )
            {
            // InternalRaspiRover.g:3545:1: ( ( rule__TurnDegAction__DegreesAssignment_2 ) )
            // InternalRaspiRover.g:3546:2: ( rule__TurnDegAction__DegreesAssignment_2 )
            {
             before(grammarAccess.getTurnDegActionAccess().getDegreesAssignment_2()); 
            // InternalRaspiRover.g:3547:2: ( rule__TurnDegAction__DegreesAssignment_2 )
            // InternalRaspiRover.g:3547:3: rule__TurnDegAction__DegreesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TurnDegAction__DegreesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTurnDegActionAccess().getDegreesAssignment_2()); 

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
    // $ANTLR end "rule__TurnDegAction__Group__2__Impl"


    // $ANTLR start "rule__StopAction__Group__0"
    // InternalRaspiRover.g:3556:1: rule__StopAction__Group__0 : rule__StopAction__Group__0__Impl rule__StopAction__Group__1 ;
    public final void rule__StopAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3560:1: ( rule__StopAction__Group__0__Impl rule__StopAction__Group__1 )
            // InternalRaspiRover.g:3561:2: rule__StopAction__Group__0__Impl rule__StopAction__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__StopAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StopAction__Group__1();

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
    // $ANTLR end "rule__StopAction__Group__0"


    // $ANTLR start "rule__StopAction__Group__0__Impl"
    // InternalRaspiRover.g:3568:1: rule__StopAction__Group__0__Impl : ( () ) ;
    public final void rule__StopAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3572:1: ( ( () ) )
            // InternalRaspiRover.g:3573:1: ( () )
            {
            // InternalRaspiRover.g:3573:1: ( () )
            // InternalRaspiRover.g:3574:2: ()
            {
             before(grammarAccess.getStopActionAccess().getStopActionAction_0()); 
            // InternalRaspiRover.g:3575:2: ()
            // InternalRaspiRover.g:3575:3: 
            {
            }

             after(grammarAccess.getStopActionAccess().getStopActionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopAction__Group__0__Impl"


    // $ANTLR start "rule__StopAction__Group__1"
    // InternalRaspiRover.g:3583:1: rule__StopAction__Group__1 : rule__StopAction__Group__1__Impl ;
    public final void rule__StopAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3587:1: ( rule__StopAction__Group__1__Impl )
            // InternalRaspiRover.g:3588:2: rule__StopAction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StopAction__Group__1__Impl();

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
    // $ANTLR end "rule__StopAction__Group__1"


    // $ANTLR start "rule__StopAction__Group__1__Impl"
    // InternalRaspiRover.g:3594:1: rule__StopAction__Group__1__Impl : ( 'stop' ) ;
    public final void rule__StopAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3598:1: ( ( 'stop' ) )
            // InternalRaspiRover.g:3599:1: ( 'stop' )
            {
            // InternalRaspiRover.g:3599:1: ( 'stop' )
            // InternalRaspiRover.g:3600:2: 'stop'
            {
             before(grammarAccess.getStopActionAccess().getStopKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getStopActionAccess().getStopKeyword_1()); 

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
    // $ANTLR end "rule__StopAction__Group__1__Impl"


    // $ANTLR start "rule__LogAction__Group__0"
    // InternalRaspiRover.g:3610:1: rule__LogAction__Group__0 : rule__LogAction__Group__0__Impl rule__LogAction__Group__1 ;
    public final void rule__LogAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3614:1: ( rule__LogAction__Group__0__Impl rule__LogAction__Group__1 )
            // InternalRaspiRover.g:3615:2: rule__LogAction__Group__0__Impl rule__LogAction__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__LogAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogAction__Group__1();

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
    // $ANTLR end "rule__LogAction__Group__0"


    // $ANTLR start "rule__LogAction__Group__0__Impl"
    // InternalRaspiRover.g:3622:1: rule__LogAction__Group__0__Impl : ( () ) ;
    public final void rule__LogAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3626:1: ( ( () ) )
            // InternalRaspiRover.g:3627:1: ( () )
            {
            // InternalRaspiRover.g:3627:1: ( () )
            // InternalRaspiRover.g:3628:2: ()
            {
             before(grammarAccess.getLogActionAccess().getLogActionAction_0()); 
            // InternalRaspiRover.g:3629:2: ()
            // InternalRaspiRover.g:3629:3: 
            {
            }

             after(grammarAccess.getLogActionAccess().getLogActionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogAction__Group__0__Impl"


    // $ANTLR start "rule__LogAction__Group__1"
    // InternalRaspiRover.g:3637:1: rule__LogAction__Group__1 : rule__LogAction__Group__1__Impl rule__LogAction__Group__2 ;
    public final void rule__LogAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3641:1: ( rule__LogAction__Group__1__Impl rule__LogAction__Group__2 )
            // InternalRaspiRover.g:3642:2: rule__LogAction__Group__1__Impl rule__LogAction__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__LogAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogAction__Group__2();

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
    // $ANTLR end "rule__LogAction__Group__1"


    // $ANTLR start "rule__LogAction__Group__1__Impl"
    // InternalRaspiRover.g:3649:1: rule__LogAction__Group__1__Impl : ( 'log' ) ;
    public final void rule__LogAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3653:1: ( ( 'log' ) )
            // InternalRaspiRover.g:3654:1: ( 'log' )
            {
            // InternalRaspiRover.g:3654:1: ( 'log' )
            // InternalRaspiRover.g:3655:2: 'log'
            {
             before(grammarAccess.getLogActionAccess().getLogKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getLogActionAccess().getLogKeyword_1()); 

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
    // $ANTLR end "rule__LogAction__Group__1__Impl"


    // $ANTLR start "rule__LogAction__Group__2"
    // InternalRaspiRover.g:3664:1: rule__LogAction__Group__2 : rule__LogAction__Group__2__Impl ;
    public final void rule__LogAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3668:1: ( rule__LogAction__Group__2__Impl )
            // InternalRaspiRover.g:3669:2: rule__LogAction__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogAction__Group__2__Impl();

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
    // $ANTLR end "rule__LogAction__Group__2"


    // $ANTLR start "rule__LogAction__Group__2__Impl"
    // InternalRaspiRover.g:3675:1: rule__LogAction__Group__2__Impl : ( ( rule__LogAction__MessageAssignment_2 ) ) ;
    public final void rule__LogAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3679:1: ( ( ( rule__LogAction__MessageAssignment_2 ) ) )
            // InternalRaspiRover.g:3680:1: ( ( rule__LogAction__MessageAssignment_2 ) )
            {
            // InternalRaspiRover.g:3680:1: ( ( rule__LogAction__MessageAssignment_2 ) )
            // InternalRaspiRover.g:3681:2: ( rule__LogAction__MessageAssignment_2 )
            {
             before(grammarAccess.getLogActionAccess().getMessageAssignment_2()); 
            // InternalRaspiRover.g:3682:2: ( rule__LogAction__MessageAssignment_2 )
            // InternalRaspiRover.g:3682:3: rule__LogAction__MessageAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LogAction__MessageAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLogActionAccess().getMessageAssignment_2()); 

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
    // $ANTLR end "rule__LogAction__Group__2__Impl"


    // $ANTLR start "rule__SendAction__Group__0"
    // InternalRaspiRover.g:3691:1: rule__SendAction__Group__0 : rule__SendAction__Group__0__Impl rule__SendAction__Group__1 ;
    public final void rule__SendAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3695:1: ( rule__SendAction__Group__0__Impl rule__SendAction__Group__1 )
            // InternalRaspiRover.g:3696:2: rule__SendAction__Group__0__Impl rule__SendAction__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__SendAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SendAction__Group__1();

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
    // $ANTLR end "rule__SendAction__Group__0"


    // $ANTLR start "rule__SendAction__Group__0__Impl"
    // InternalRaspiRover.g:3703:1: rule__SendAction__Group__0__Impl : ( () ) ;
    public final void rule__SendAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3707:1: ( ( () ) )
            // InternalRaspiRover.g:3708:1: ( () )
            {
            // InternalRaspiRover.g:3708:1: ( () )
            // InternalRaspiRover.g:3709:2: ()
            {
             before(grammarAccess.getSendActionAccess().getSendActionAction_0()); 
            // InternalRaspiRover.g:3710:2: ()
            // InternalRaspiRover.g:3710:3: 
            {
            }

             after(grammarAccess.getSendActionAccess().getSendActionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SendAction__Group__0__Impl"


    // $ANTLR start "rule__SendAction__Group__1"
    // InternalRaspiRover.g:3718:1: rule__SendAction__Group__1 : rule__SendAction__Group__1__Impl rule__SendAction__Group__2 ;
    public final void rule__SendAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3722:1: ( rule__SendAction__Group__1__Impl rule__SendAction__Group__2 )
            // InternalRaspiRover.g:3723:2: rule__SendAction__Group__1__Impl rule__SendAction__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__SendAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SendAction__Group__2();

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
    // $ANTLR end "rule__SendAction__Group__1"


    // $ANTLR start "rule__SendAction__Group__1__Impl"
    // InternalRaspiRover.g:3730:1: rule__SendAction__Group__1__Impl : ( 'send' ) ;
    public final void rule__SendAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3734:1: ( ( 'send' ) )
            // InternalRaspiRover.g:3735:1: ( 'send' )
            {
            // InternalRaspiRover.g:3735:1: ( 'send' )
            // InternalRaspiRover.g:3736:2: 'send'
            {
             before(grammarAccess.getSendActionAccess().getSendKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getSendActionAccess().getSendKeyword_1()); 

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
    // $ANTLR end "rule__SendAction__Group__1__Impl"


    // $ANTLR start "rule__SendAction__Group__2"
    // InternalRaspiRover.g:3745:1: rule__SendAction__Group__2 : rule__SendAction__Group__2__Impl ;
    public final void rule__SendAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3749:1: ( rule__SendAction__Group__2__Impl )
            // InternalRaspiRover.g:3750:2: rule__SendAction__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SendAction__Group__2__Impl();

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
    // $ANTLR end "rule__SendAction__Group__2"


    // $ANTLR start "rule__SendAction__Group__2__Impl"
    // InternalRaspiRover.g:3756:1: rule__SendAction__Group__2__Impl : ( ( rule__SendAction__MessageAssignment_2 ) ) ;
    public final void rule__SendAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3760:1: ( ( ( rule__SendAction__MessageAssignment_2 ) ) )
            // InternalRaspiRover.g:3761:1: ( ( rule__SendAction__MessageAssignment_2 ) )
            {
            // InternalRaspiRover.g:3761:1: ( ( rule__SendAction__MessageAssignment_2 ) )
            // InternalRaspiRover.g:3762:2: ( rule__SendAction__MessageAssignment_2 )
            {
             before(grammarAccess.getSendActionAccess().getMessageAssignment_2()); 
            // InternalRaspiRover.g:3763:2: ( rule__SendAction__MessageAssignment_2 )
            // InternalRaspiRover.g:3763:3: rule__SendAction__MessageAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SendAction__MessageAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSendActionAccess().getMessageAssignment_2()); 

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
    // $ANTLR end "rule__SendAction__Group__2__Impl"


    // $ANTLR start "rule__TemperatureQuery__Group__0"
    // InternalRaspiRover.g:3772:1: rule__TemperatureQuery__Group__0 : rule__TemperatureQuery__Group__0__Impl rule__TemperatureQuery__Group__1 ;
    public final void rule__TemperatureQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3776:1: ( rule__TemperatureQuery__Group__0__Impl rule__TemperatureQuery__Group__1 )
            // InternalRaspiRover.g:3777:2: rule__TemperatureQuery__Group__0__Impl rule__TemperatureQuery__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__TemperatureQuery__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemperatureQuery__Group__1();

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
    // $ANTLR end "rule__TemperatureQuery__Group__0"


    // $ANTLR start "rule__TemperatureQuery__Group__0__Impl"
    // InternalRaspiRover.g:3784:1: rule__TemperatureQuery__Group__0__Impl : ( () ) ;
    public final void rule__TemperatureQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3788:1: ( ( () ) )
            // InternalRaspiRover.g:3789:1: ( () )
            {
            // InternalRaspiRover.g:3789:1: ( () )
            // InternalRaspiRover.g:3790:2: ()
            {
             before(grammarAccess.getTemperatureQueryAccess().getTemperatureQueryAction_0()); 
            // InternalRaspiRover.g:3791:2: ()
            // InternalRaspiRover.g:3791:3: 
            {
            }

             after(grammarAccess.getTemperatureQueryAccess().getTemperatureQueryAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemperatureQuery__Group__0__Impl"


    // $ANTLR start "rule__TemperatureQuery__Group__1"
    // InternalRaspiRover.g:3799:1: rule__TemperatureQuery__Group__1 : rule__TemperatureQuery__Group__1__Impl ;
    public final void rule__TemperatureQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3803:1: ( rule__TemperatureQuery__Group__1__Impl )
            // InternalRaspiRover.g:3804:2: rule__TemperatureQuery__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TemperatureQuery__Group__1__Impl();

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
    // $ANTLR end "rule__TemperatureQuery__Group__1"


    // $ANTLR start "rule__TemperatureQuery__Group__1__Impl"
    // InternalRaspiRover.g:3810:1: rule__TemperatureQuery__Group__1__Impl : ( 'query-temp' ) ;
    public final void rule__TemperatureQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3814:1: ( ( 'query-temp' ) )
            // InternalRaspiRover.g:3815:1: ( 'query-temp' )
            {
            // InternalRaspiRover.g:3815:1: ( 'query-temp' )
            // InternalRaspiRover.g:3816:2: 'query-temp'
            {
             before(grammarAccess.getTemperatureQueryAccess().getQueryTempKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getTemperatureQueryAccess().getQueryTempKeyword_1()); 

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
    // $ANTLR end "rule__TemperatureQuery__Group__1__Impl"


    // $ANTLR start "rule__HumidityQuery__Group__0"
    // InternalRaspiRover.g:3826:1: rule__HumidityQuery__Group__0 : rule__HumidityQuery__Group__0__Impl rule__HumidityQuery__Group__1 ;
    public final void rule__HumidityQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3830:1: ( rule__HumidityQuery__Group__0__Impl rule__HumidityQuery__Group__1 )
            // InternalRaspiRover.g:3831:2: rule__HumidityQuery__Group__0__Impl rule__HumidityQuery__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__HumidityQuery__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HumidityQuery__Group__1();

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
    // $ANTLR end "rule__HumidityQuery__Group__0"


    // $ANTLR start "rule__HumidityQuery__Group__0__Impl"
    // InternalRaspiRover.g:3838:1: rule__HumidityQuery__Group__0__Impl : ( () ) ;
    public final void rule__HumidityQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3842:1: ( ( () ) )
            // InternalRaspiRover.g:3843:1: ( () )
            {
            // InternalRaspiRover.g:3843:1: ( () )
            // InternalRaspiRover.g:3844:2: ()
            {
             before(grammarAccess.getHumidityQueryAccess().getHumidityQueryAction_0()); 
            // InternalRaspiRover.g:3845:2: ()
            // InternalRaspiRover.g:3845:3: 
            {
            }

             after(grammarAccess.getHumidityQueryAccess().getHumidityQueryAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HumidityQuery__Group__0__Impl"


    // $ANTLR start "rule__HumidityQuery__Group__1"
    // InternalRaspiRover.g:3853:1: rule__HumidityQuery__Group__1 : rule__HumidityQuery__Group__1__Impl ;
    public final void rule__HumidityQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3857:1: ( rule__HumidityQuery__Group__1__Impl )
            // InternalRaspiRover.g:3858:2: rule__HumidityQuery__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HumidityQuery__Group__1__Impl();

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
    // $ANTLR end "rule__HumidityQuery__Group__1"


    // $ANTLR start "rule__HumidityQuery__Group__1__Impl"
    // InternalRaspiRover.g:3864:1: rule__HumidityQuery__Group__1__Impl : ( 'query-humidity' ) ;
    public final void rule__HumidityQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3868:1: ( ( 'query-humidity' ) )
            // InternalRaspiRover.g:3869:1: ( 'query-humidity' )
            {
            // InternalRaspiRover.g:3869:1: ( 'query-humidity' )
            // InternalRaspiRover.g:3870:2: 'query-humidity'
            {
             before(grammarAccess.getHumidityQueryAccess().getQueryHumidityKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getHumidityQueryAccess().getQueryHumidityKeyword_1()); 

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
    // $ANTLR end "rule__HumidityQuery__Group__1__Impl"


    // $ANTLR start "rule__MessageQuery__Group__0"
    // InternalRaspiRover.g:3880:1: rule__MessageQuery__Group__0 : rule__MessageQuery__Group__0__Impl rule__MessageQuery__Group__1 ;
    public final void rule__MessageQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3884:1: ( rule__MessageQuery__Group__0__Impl rule__MessageQuery__Group__1 )
            // InternalRaspiRover.g:3885:2: rule__MessageQuery__Group__0__Impl rule__MessageQuery__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__MessageQuery__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageQuery__Group__1();

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
    // $ANTLR end "rule__MessageQuery__Group__0"


    // $ANTLR start "rule__MessageQuery__Group__0__Impl"
    // InternalRaspiRover.g:3892:1: rule__MessageQuery__Group__0__Impl : ( () ) ;
    public final void rule__MessageQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3896:1: ( ( () ) )
            // InternalRaspiRover.g:3897:1: ( () )
            {
            // InternalRaspiRover.g:3897:1: ( () )
            // InternalRaspiRover.g:3898:2: ()
            {
             before(grammarAccess.getMessageQueryAccess().getMessageQueryAction_0()); 
            // InternalRaspiRover.g:3899:2: ()
            // InternalRaspiRover.g:3899:3: 
            {
            }

             after(grammarAccess.getMessageQueryAccess().getMessageQueryAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageQuery__Group__0__Impl"


    // $ANTLR start "rule__MessageQuery__Group__1"
    // InternalRaspiRover.g:3907:1: rule__MessageQuery__Group__1 : rule__MessageQuery__Group__1__Impl ;
    public final void rule__MessageQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3911:1: ( rule__MessageQuery__Group__1__Impl )
            // InternalRaspiRover.g:3912:2: rule__MessageQuery__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MessageQuery__Group__1__Impl();

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
    // $ANTLR end "rule__MessageQuery__Group__1"


    // $ANTLR start "rule__MessageQuery__Group__1__Impl"
    // InternalRaspiRover.g:3918:1: rule__MessageQuery__Group__1__Impl : ( 'query-msg' ) ;
    public final void rule__MessageQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3922:1: ( ( 'query-msg' ) )
            // InternalRaspiRover.g:3923:1: ( 'query-msg' )
            {
            // InternalRaspiRover.g:3923:1: ( 'query-msg' )
            // InternalRaspiRover.g:3924:2: 'query-msg'
            {
             before(grammarAccess.getMessageQueryAccess().getQueryMsgKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getMessageQueryAccess().getQueryMsgKeyword_1()); 

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
    // $ANTLR end "rule__MessageQuery__Group__1__Impl"


    // $ANTLR start "rule__ObstacleQuery__Group__0"
    // InternalRaspiRover.g:3934:1: rule__ObstacleQuery__Group__0 : rule__ObstacleQuery__Group__0__Impl rule__ObstacleQuery__Group__1 ;
    public final void rule__ObstacleQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3938:1: ( rule__ObstacleQuery__Group__0__Impl rule__ObstacleQuery__Group__1 )
            // InternalRaspiRover.g:3939:2: rule__ObstacleQuery__Group__0__Impl rule__ObstacleQuery__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__ObstacleQuery__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObstacleQuery__Group__1();

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
    // $ANTLR end "rule__ObstacleQuery__Group__0"


    // $ANTLR start "rule__ObstacleQuery__Group__0__Impl"
    // InternalRaspiRover.g:3946:1: rule__ObstacleQuery__Group__0__Impl : ( () ) ;
    public final void rule__ObstacleQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3950:1: ( ( () ) )
            // InternalRaspiRover.g:3951:1: ( () )
            {
            // InternalRaspiRover.g:3951:1: ( () )
            // InternalRaspiRover.g:3952:2: ()
            {
             before(grammarAccess.getObstacleQueryAccess().getObstacleQueryAction_0()); 
            // InternalRaspiRover.g:3953:2: ()
            // InternalRaspiRover.g:3953:3: 
            {
            }

             after(grammarAccess.getObstacleQueryAccess().getObstacleQueryAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObstacleQuery__Group__0__Impl"


    // $ANTLR start "rule__ObstacleQuery__Group__1"
    // InternalRaspiRover.g:3961:1: rule__ObstacleQuery__Group__1 : rule__ObstacleQuery__Group__1__Impl rule__ObstacleQuery__Group__2 ;
    public final void rule__ObstacleQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3965:1: ( rule__ObstacleQuery__Group__1__Impl rule__ObstacleQuery__Group__2 )
            // InternalRaspiRover.g:3966:2: rule__ObstacleQuery__Group__1__Impl rule__ObstacleQuery__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__ObstacleQuery__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObstacleQuery__Group__2();

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
    // $ANTLR end "rule__ObstacleQuery__Group__1"


    // $ANTLR start "rule__ObstacleQuery__Group__1__Impl"
    // InternalRaspiRover.g:3973:1: rule__ObstacleQuery__Group__1__Impl : ( 'query' ) ;
    public final void rule__ObstacleQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3977:1: ( ( 'query' ) )
            // InternalRaspiRover.g:3978:1: ( 'query' )
            {
            // InternalRaspiRover.g:3978:1: ( 'query' )
            // InternalRaspiRover.g:3979:2: 'query'
            {
             before(grammarAccess.getObstacleQueryAccess().getQueryKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getObstacleQueryAccess().getQueryKeyword_1()); 

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
    // $ANTLR end "rule__ObstacleQuery__Group__1__Impl"


    // $ANTLR start "rule__ObstacleQuery__Group__2"
    // InternalRaspiRover.g:3988:1: rule__ObstacleQuery__Group__2 : rule__ObstacleQuery__Group__2__Impl rule__ObstacleQuery__Group__3 ;
    public final void rule__ObstacleQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:3992:1: ( rule__ObstacleQuery__Group__2__Impl rule__ObstacleQuery__Group__3 )
            // InternalRaspiRover.g:3993:2: rule__ObstacleQuery__Group__2__Impl rule__ObstacleQuery__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__ObstacleQuery__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObstacleQuery__Group__3();

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
    // $ANTLR end "rule__ObstacleQuery__Group__2"


    // $ANTLR start "rule__ObstacleQuery__Group__2__Impl"
    // InternalRaspiRover.g:4000:1: rule__ObstacleQuery__Group__2__Impl : ( ( rule__ObstacleQuery__FrontAssignment_2 )? ) ;
    public final void rule__ObstacleQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4004:1: ( ( ( rule__ObstacleQuery__FrontAssignment_2 )? ) )
            // InternalRaspiRover.g:4005:1: ( ( rule__ObstacleQuery__FrontAssignment_2 )? )
            {
            // InternalRaspiRover.g:4005:1: ( ( rule__ObstacleQuery__FrontAssignment_2 )? )
            // InternalRaspiRover.g:4006:2: ( rule__ObstacleQuery__FrontAssignment_2 )?
            {
             before(grammarAccess.getObstacleQueryAccess().getFrontAssignment_2()); 
            // InternalRaspiRover.g:4007:2: ( rule__ObstacleQuery__FrontAssignment_2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==58) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRaspiRover.g:4007:3: rule__ObstacleQuery__FrontAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ObstacleQuery__FrontAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObstacleQueryAccess().getFrontAssignment_2()); 

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
    // $ANTLR end "rule__ObstacleQuery__Group__2__Impl"


    // $ANTLR start "rule__ObstacleQuery__Group__3"
    // InternalRaspiRover.g:4015:1: rule__ObstacleQuery__Group__3 : rule__ObstacleQuery__Group__3__Impl ;
    public final void rule__ObstacleQuery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4019:1: ( rule__ObstacleQuery__Group__3__Impl )
            // InternalRaspiRover.g:4020:2: rule__ObstacleQuery__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObstacleQuery__Group__3__Impl();

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
    // $ANTLR end "rule__ObstacleQuery__Group__3"


    // $ANTLR start "rule__ObstacleQuery__Group__3__Impl"
    // InternalRaspiRover.g:4026:1: rule__ObstacleQuery__Group__3__Impl : ( 'obstacle' ) ;
    public final void rule__ObstacleQuery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4030:1: ( ( 'obstacle' ) )
            // InternalRaspiRover.g:4031:1: ( 'obstacle' )
            {
            // InternalRaspiRover.g:4031:1: ( 'obstacle' )
            // InternalRaspiRover.g:4032:2: 'obstacle'
            {
             before(grammarAccess.getObstacleQueryAccess().getObstacleKeyword_3()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getObstacleQueryAccess().getObstacleKeyword_3()); 

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
    // $ANTLR end "rule__ObstacleQuery__Group__3__Impl"


    // $ANTLR start "rule__NumberValue_Impl__Group__0"
    // InternalRaspiRover.g:4042:1: rule__NumberValue_Impl__Group__0 : rule__NumberValue_Impl__Group__0__Impl rule__NumberValue_Impl__Group__1 ;
    public final void rule__NumberValue_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4046:1: ( rule__NumberValue_Impl__Group__0__Impl rule__NumberValue_Impl__Group__1 )
            // InternalRaspiRover.g:4047:2: rule__NumberValue_Impl__Group__0__Impl rule__NumberValue_Impl__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__NumberValue_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumberValue_Impl__Group__1();

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
    // $ANTLR end "rule__NumberValue_Impl__Group__0"


    // $ANTLR start "rule__NumberValue_Impl__Group__0__Impl"
    // InternalRaspiRover.g:4054:1: rule__NumberValue_Impl__Group__0__Impl : ( () ) ;
    public final void rule__NumberValue_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4058:1: ( ( () ) )
            // InternalRaspiRover.g:4059:1: ( () )
            {
            // InternalRaspiRover.g:4059:1: ( () )
            // InternalRaspiRover.g:4060:2: ()
            {
             before(grammarAccess.getNumberValue_ImplAccess().getNumberValueAction_0()); 
            // InternalRaspiRover.g:4061:2: ()
            // InternalRaspiRover.g:4061:3: 
            {
            }

             after(grammarAccess.getNumberValue_ImplAccess().getNumberValueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberValue_Impl__Group__0__Impl"


    // $ANTLR start "rule__NumberValue_Impl__Group__1"
    // InternalRaspiRover.g:4069:1: rule__NumberValue_Impl__Group__1 : rule__NumberValue_Impl__Group__1__Impl ;
    public final void rule__NumberValue_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4073:1: ( rule__NumberValue_Impl__Group__1__Impl )
            // InternalRaspiRover.g:4074:2: rule__NumberValue_Impl__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumberValue_Impl__Group__1__Impl();

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
    // $ANTLR end "rule__NumberValue_Impl__Group__1"


    // $ANTLR start "rule__NumberValue_Impl__Group__1__Impl"
    // InternalRaspiRover.g:4080:1: rule__NumberValue_Impl__Group__1__Impl : ( ( rule__NumberValue_Impl__QuantityAssignment_1 ) ) ;
    public final void rule__NumberValue_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4084:1: ( ( ( rule__NumberValue_Impl__QuantityAssignment_1 ) ) )
            // InternalRaspiRover.g:4085:1: ( ( rule__NumberValue_Impl__QuantityAssignment_1 ) )
            {
            // InternalRaspiRover.g:4085:1: ( ( rule__NumberValue_Impl__QuantityAssignment_1 ) )
            // InternalRaspiRover.g:4086:2: ( rule__NumberValue_Impl__QuantityAssignment_1 )
            {
             before(grammarAccess.getNumberValue_ImplAccess().getQuantityAssignment_1()); 
            // InternalRaspiRover.g:4087:2: ( rule__NumberValue_Impl__QuantityAssignment_1 )
            // InternalRaspiRover.g:4087:3: rule__NumberValue_Impl__QuantityAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NumberValue_Impl__QuantityAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNumberValue_ImplAccess().getQuantityAssignment_1()); 

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
    // $ANTLR end "rule__NumberValue_Impl__Group__1__Impl"


    // $ANTLR start "rule__Quantity__Group__0"
    // InternalRaspiRover.g:4096:1: rule__Quantity__Group__0 : rule__Quantity__Group__0__Impl rule__Quantity__Group__1 ;
    public final void rule__Quantity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4100:1: ( rule__Quantity__Group__0__Impl rule__Quantity__Group__1 )
            // InternalRaspiRover.g:4101:2: rule__Quantity__Group__0__Impl rule__Quantity__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__Quantity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Quantity__Group__1();

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
    // $ANTLR end "rule__Quantity__Group__0"


    // $ANTLR start "rule__Quantity__Group__0__Impl"
    // InternalRaspiRover.g:4108:1: rule__Quantity__Group__0__Impl : ( () ) ;
    public final void rule__Quantity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4112:1: ( ( () ) )
            // InternalRaspiRover.g:4113:1: ( () )
            {
            // InternalRaspiRover.g:4113:1: ( () )
            // InternalRaspiRover.g:4114:2: ()
            {
             before(grammarAccess.getQuantityAccess().getQuantityAction_0()); 
            // InternalRaspiRover.g:4115:2: ()
            // InternalRaspiRover.g:4115:3: 
            {
            }

             after(grammarAccess.getQuantityAccess().getQuantityAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantity__Group__0__Impl"


    // $ANTLR start "rule__Quantity__Group__1"
    // InternalRaspiRover.g:4123:1: rule__Quantity__Group__1 : rule__Quantity__Group__1__Impl rule__Quantity__Group__2 ;
    public final void rule__Quantity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4127:1: ( rule__Quantity__Group__1__Impl rule__Quantity__Group__2 )
            // InternalRaspiRover.g:4128:2: rule__Quantity__Group__1__Impl rule__Quantity__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__Quantity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Quantity__Group__2();

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
    // $ANTLR end "rule__Quantity__Group__1"


    // $ANTLR start "rule__Quantity__Group__1__Impl"
    // InternalRaspiRover.g:4135:1: rule__Quantity__Group__1__Impl : ( ( rule__Quantity__ValueAssignment_1 ) ) ;
    public final void rule__Quantity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4139:1: ( ( ( rule__Quantity__ValueAssignment_1 ) ) )
            // InternalRaspiRover.g:4140:1: ( ( rule__Quantity__ValueAssignment_1 ) )
            {
            // InternalRaspiRover.g:4140:1: ( ( rule__Quantity__ValueAssignment_1 ) )
            // InternalRaspiRover.g:4141:2: ( rule__Quantity__ValueAssignment_1 )
            {
             before(grammarAccess.getQuantityAccess().getValueAssignment_1()); 
            // InternalRaspiRover.g:4142:2: ( rule__Quantity__ValueAssignment_1 )
            // InternalRaspiRover.g:4142:3: rule__Quantity__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Quantity__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQuantityAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__Quantity__Group__1__Impl"


    // $ANTLR start "rule__Quantity__Group__2"
    // InternalRaspiRover.g:4150:1: rule__Quantity__Group__2 : rule__Quantity__Group__2__Impl ;
    public final void rule__Quantity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4154:1: ( rule__Quantity__Group__2__Impl )
            // InternalRaspiRover.g:4155:2: rule__Quantity__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Quantity__Group__2__Impl();

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
    // $ANTLR end "rule__Quantity__Group__2"


    // $ANTLR start "rule__Quantity__Group__2__Impl"
    // InternalRaspiRover.g:4161:1: rule__Quantity__Group__2__Impl : ( ( rule__Quantity__UnitAssignment_2 ) ) ;
    public final void rule__Quantity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4165:1: ( ( ( rule__Quantity__UnitAssignment_2 ) ) )
            // InternalRaspiRover.g:4166:1: ( ( rule__Quantity__UnitAssignment_2 ) )
            {
            // InternalRaspiRover.g:4166:1: ( ( rule__Quantity__UnitAssignment_2 ) )
            // InternalRaspiRover.g:4167:2: ( rule__Quantity__UnitAssignment_2 )
            {
             before(grammarAccess.getQuantityAccess().getUnitAssignment_2()); 
            // InternalRaspiRover.g:4168:2: ( rule__Quantity__UnitAssignment_2 )
            // InternalRaspiRover.g:4168:3: rule__Quantity__UnitAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Quantity__UnitAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getQuantityAccess().getUnitAssignment_2()); 

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
    // $ANTLR end "rule__Quantity__Group__2__Impl"


    // $ANTLR start "rule__StringValue_Impl__Group__0"
    // InternalRaspiRover.g:4177:1: rule__StringValue_Impl__Group__0 : rule__StringValue_Impl__Group__0__Impl rule__StringValue_Impl__Group__1 ;
    public final void rule__StringValue_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4181:1: ( rule__StringValue_Impl__Group__0__Impl rule__StringValue_Impl__Group__1 )
            // InternalRaspiRover.g:4182:2: rule__StringValue_Impl__Group__0__Impl rule__StringValue_Impl__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__StringValue_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringValue_Impl__Group__1();

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
    // $ANTLR end "rule__StringValue_Impl__Group__0"


    // $ANTLR start "rule__StringValue_Impl__Group__0__Impl"
    // InternalRaspiRover.g:4189:1: rule__StringValue_Impl__Group__0__Impl : ( () ) ;
    public final void rule__StringValue_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4193:1: ( ( () ) )
            // InternalRaspiRover.g:4194:1: ( () )
            {
            // InternalRaspiRover.g:4194:1: ( () )
            // InternalRaspiRover.g:4195:2: ()
            {
             before(grammarAccess.getStringValue_ImplAccess().getStringValueAction_0()); 
            // InternalRaspiRover.g:4196:2: ()
            // InternalRaspiRover.g:4196:3: 
            {
            }

             after(grammarAccess.getStringValue_ImplAccess().getStringValueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue_Impl__Group__0__Impl"


    // $ANTLR start "rule__StringValue_Impl__Group__1"
    // InternalRaspiRover.g:4204:1: rule__StringValue_Impl__Group__1 : rule__StringValue_Impl__Group__1__Impl ;
    public final void rule__StringValue_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4208:1: ( rule__StringValue_Impl__Group__1__Impl )
            // InternalRaspiRover.g:4209:2: rule__StringValue_Impl__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringValue_Impl__Group__1__Impl();

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
    // $ANTLR end "rule__StringValue_Impl__Group__1"


    // $ANTLR start "rule__StringValue_Impl__Group__1__Impl"
    // InternalRaspiRover.g:4215:1: rule__StringValue_Impl__Group__1__Impl : ( ( rule__StringValue_Impl__SValueAssignment_1 ) ) ;
    public final void rule__StringValue_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4219:1: ( ( ( rule__StringValue_Impl__SValueAssignment_1 ) ) )
            // InternalRaspiRover.g:4220:1: ( ( rule__StringValue_Impl__SValueAssignment_1 ) )
            {
            // InternalRaspiRover.g:4220:1: ( ( rule__StringValue_Impl__SValueAssignment_1 ) )
            // InternalRaspiRover.g:4221:2: ( rule__StringValue_Impl__SValueAssignment_1 )
            {
             before(grammarAccess.getStringValue_ImplAccess().getSValueAssignment_1()); 
            // InternalRaspiRover.g:4222:2: ( rule__StringValue_Impl__SValueAssignment_1 )
            // InternalRaspiRover.g:4222:3: rule__StringValue_Impl__SValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StringValue_Impl__SValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStringValue_ImplAccess().getSValueAssignment_1()); 

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
    // $ANTLR end "rule__StringValue_Impl__Group__1__Impl"


    // $ANTLR start "rule__BooleanValue_Impl__Group__0"
    // InternalRaspiRover.g:4231:1: rule__BooleanValue_Impl__Group__0 : rule__BooleanValue_Impl__Group__0__Impl rule__BooleanValue_Impl__Group__1 ;
    public final void rule__BooleanValue_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4235:1: ( rule__BooleanValue_Impl__Group__0__Impl rule__BooleanValue_Impl__Group__1 )
            // InternalRaspiRover.g:4236:2: rule__BooleanValue_Impl__Group__0__Impl rule__BooleanValue_Impl__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__BooleanValue_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanValue_Impl__Group__1();

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
    // $ANTLR end "rule__BooleanValue_Impl__Group__0"


    // $ANTLR start "rule__BooleanValue_Impl__Group__0__Impl"
    // InternalRaspiRover.g:4243:1: rule__BooleanValue_Impl__Group__0__Impl : ( () ) ;
    public final void rule__BooleanValue_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4247:1: ( ( () ) )
            // InternalRaspiRover.g:4248:1: ( () )
            {
            // InternalRaspiRover.g:4248:1: ( () )
            // InternalRaspiRover.g:4249:2: ()
            {
             before(grammarAccess.getBooleanValue_ImplAccess().getBooleanValueAction_0()); 
            // InternalRaspiRover.g:4250:2: ()
            // InternalRaspiRover.g:4250:3: 
            {
            }

             after(grammarAccess.getBooleanValue_ImplAccess().getBooleanValueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue_Impl__Group__0__Impl"


    // $ANTLR start "rule__BooleanValue_Impl__Group__1"
    // InternalRaspiRover.g:4258:1: rule__BooleanValue_Impl__Group__1 : rule__BooleanValue_Impl__Group__1__Impl ;
    public final void rule__BooleanValue_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4262:1: ( rule__BooleanValue_Impl__Group__1__Impl )
            // InternalRaspiRover.g:4263:2: rule__BooleanValue_Impl__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanValue_Impl__Group__1__Impl();

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
    // $ANTLR end "rule__BooleanValue_Impl__Group__1"


    // $ANTLR start "rule__BooleanValue_Impl__Group__1__Impl"
    // InternalRaspiRover.g:4269:1: rule__BooleanValue_Impl__Group__1__Impl : ( ( rule__BooleanValue_Impl__BValueAssignment_1 ) ) ;
    public final void rule__BooleanValue_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4273:1: ( ( ( rule__BooleanValue_Impl__BValueAssignment_1 ) ) )
            // InternalRaspiRover.g:4274:1: ( ( rule__BooleanValue_Impl__BValueAssignment_1 ) )
            {
            // InternalRaspiRover.g:4274:1: ( ( rule__BooleanValue_Impl__BValueAssignment_1 ) )
            // InternalRaspiRover.g:4275:2: ( rule__BooleanValue_Impl__BValueAssignment_1 )
            {
             before(grammarAccess.getBooleanValue_ImplAccess().getBValueAssignment_1()); 
            // InternalRaspiRover.g:4276:2: ( rule__BooleanValue_Impl__BValueAssignment_1 )
            // InternalRaspiRover.g:4276:3: rule__BooleanValue_Impl__BValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BooleanValue_Impl__BValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBooleanValue_ImplAccess().getBValueAssignment_1()); 

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
    // $ANTLR end "rule__BooleanValue_Impl__Group__1__Impl"


    // $ANTLR start "rule__Centimeter__Group__0"
    // InternalRaspiRover.g:4285:1: rule__Centimeter__Group__0 : rule__Centimeter__Group__0__Impl rule__Centimeter__Group__1 ;
    public final void rule__Centimeter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4289:1: ( rule__Centimeter__Group__0__Impl rule__Centimeter__Group__1 )
            // InternalRaspiRover.g:4290:2: rule__Centimeter__Group__0__Impl rule__Centimeter__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__Centimeter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Centimeter__Group__1();

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
    // $ANTLR end "rule__Centimeter__Group__0"


    // $ANTLR start "rule__Centimeter__Group__0__Impl"
    // InternalRaspiRover.g:4297:1: rule__Centimeter__Group__0__Impl : ( () ) ;
    public final void rule__Centimeter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4301:1: ( ( () ) )
            // InternalRaspiRover.g:4302:1: ( () )
            {
            // InternalRaspiRover.g:4302:1: ( () )
            // InternalRaspiRover.g:4303:2: ()
            {
             before(grammarAccess.getCentimeterAccess().getCentimeterAction_0()); 
            // InternalRaspiRover.g:4304:2: ()
            // InternalRaspiRover.g:4304:3: 
            {
            }

             after(grammarAccess.getCentimeterAccess().getCentimeterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Centimeter__Group__0__Impl"


    // $ANTLR start "rule__Centimeter__Group__1"
    // InternalRaspiRover.g:4312:1: rule__Centimeter__Group__1 : rule__Centimeter__Group__1__Impl ;
    public final void rule__Centimeter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4316:1: ( rule__Centimeter__Group__1__Impl )
            // InternalRaspiRover.g:4317:2: rule__Centimeter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Centimeter__Group__1__Impl();

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
    // $ANTLR end "rule__Centimeter__Group__1"


    // $ANTLR start "rule__Centimeter__Group__1__Impl"
    // InternalRaspiRover.g:4323:1: rule__Centimeter__Group__1__Impl : ( 'cm' ) ;
    public final void rule__Centimeter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4327:1: ( ( 'cm' ) )
            // InternalRaspiRover.g:4328:1: ( 'cm' )
            {
            // InternalRaspiRover.g:4328:1: ( 'cm' )
            // InternalRaspiRover.g:4329:2: 'cm'
            {
             before(grammarAccess.getCentimeterAccess().getCmKeyword_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getCentimeterAccess().getCmKeyword_1()); 

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
    // $ANTLR end "rule__Centimeter__Group__1__Impl"


    // $ANTLR start "rule__Millimeter__Group__0"
    // InternalRaspiRover.g:4339:1: rule__Millimeter__Group__0 : rule__Millimeter__Group__0__Impl rule__Millimeter__Group__1 ;
    public final void rule__Millimeter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4343:1: ( rule__Millimeter__Group__0__Impl rule__Millimeter__Group__1 )
            // InternalRaspiRover.g:4344:2: rule__Millimeter__Group__0__Impl rule__Millimeter__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__Millimeter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Millimeter__Group__1();

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
    // $ANTLR end "rule__Millimeter__Group__0"


    // $ANTLR start "rule__Millimeter__Group__0__Impl"
    // InternalRaspiRover.g:4351:1: rule__Millimeter__Group__0__Impl : ( () ) ;
    public final void rule__Millimeter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4355:1: ( ( () ) )
            // InternalRaspiRover.g:4356:1: ( () )
            {
            // InternalRaspiRover.g:4356:1: ( () )
            // InternalRaspiRover.g:4357:2: ()
            {
             before(grammarAccess.getMillimeterAccess().getMillimeterAction_0()); 
            // InternalRaspiRover.g:4358:2: ()
            // InternalRaspiRover.g:4358:3: 
            {
            }

             after(grammarAccess.getMillimeterAccess().getMillimeterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Millimeter__Group__0__Impl"


    // $ANTLR start "rule__Millimeter__Group__1"
    // InternalRaspiRover.g:4366:1: rule__Millimeter__Group__1 : rule__Millimeter__Group__1__Impl ;
    public final void rule__Millimeter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4370:1: ( rule__Millimeter__Group__1__Impl )
            // InternalRaspiRover.g:4371:2: rule__Millimeter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Millimeter__Group__1__Impl();

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
    // $ANTLR end "rule__Millimeter__Group__1"


    // $ANTLR start "rule__Millimeter__Group__1__Impl"
    // InternalRaspiRover.g:4377:1: rule__Millimeter__Group__1__Impl : ( 'mm' ) ;
    public final void rule__Millimeter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4381:1: ( ( 'mm' ) )
            // InternalRaspiRover.g:4382:1: ( 'mm' )
            {
            // InternalRaspiRover.g:4382:1: ( 'mm' )
            // InternalRaspiRover.g:4383:2: 'mm'
            {
             before(grammarAccess.getMillimeterAccess().getMmKeyword_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getMillimeterAccess().getMmKeyword_1()); 

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
    // $ANTLR end "rule__Millimeter__Group__1__Impl"


    // $ANTLR start "rule__Meter__Group__0"
    // InternalRaspiRover.g:4393:1: rule__Meter__Group__0 : rule__Meter__Group__0__Impl rule__Meter__Group__1 ;
    public final void rule__Meter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4397:1: ( rule__Meter__Group__0__Impl rule__Meter__Group__1 )
            // InternalRaspiRover.g:4398:2: rule__Meter__Group__0__Impl rule__Meter__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__Meter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Meter__Group__1();

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
    // $ANTLR end "rule__Meter__Group__0"


    // $ANTLR start "rule__Meter__Group__0__Impl"
    // InternalRaspiRover.g:4405:1: rule__Meter__Group__0__Impl : ( () ) ;
    public final void rule__Meter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4409:1: ( ( () ) )
            // InternalRaspiRover.g:4410:1: ( () )
            {
            // InternalRaspiRover.g:4410:1: ( () )
            // InternalRaspiRover.g:4411:2: ()
            {
             before(grammarAccess.getMeterAccess().getMeterAction_0()); 
            // InternalRaspiRover.g:4412:2: ()
            // InternalRaspiRover.g:4412:3: 
            {
            }

             after(grammarAccess.getMeterAccess().getMeterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meter__Group__0__Impl"


    // $ANTLR start "rule__Meter__Group__1"
    // InternalRaspiRover.g:4420:1: rule__Meter__Group__1 : rule__Meter__Group__1__Impl ;
    public final void rule__Meter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4424:1: ( rule__Meter__Group__1__Impl )
            // InternalRaspiRover.g:4425:2: rule__Meter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Meter__Group__1__Impl();

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
    // $ANTLR end "rule__Meter__Group__1"


    // $ANTLR start "rule__Meter__Group__1__Impl"
    // InternalRaspiRover.g:4431:1: rule__Meter__Group__1__Impl : ( 'm' ) ;
    public final void rule__Meter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4435:1: ( ( 'm' ) )
            // InternalRaspiRover.g:4436:1: ( 'm' )
            {
            // InternalRaspiRover.g:4436:1: ( 'm' )
            // InternalRaspiRover.g:4437:2: 'm'
            {
             before(grammarAccess.getMeterAccess().getMKeyword_1()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getMeterAccess().getMKeyword_1()); 

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
    // $ANTLR end "rule__Meter__Group__1__Impl"


    // $ANTLR start "rule__Foot__Group__0"
    // InternalRaspiRover.g:4447:1: rule__Foot__Group__0 : rule__Foot__Group__0__Impl rule__Foot__Group__1 ;
    public final void rule__Foot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4451:1: ( rule__Foot__Group__0__Impl rule__Foot__Group__1 )
            // InternalRaspiRover.g:4452:2: rule__Foot__Group__0__Impl rule__Foot__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__Foot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Foot__Group__1();

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
    // $ANTLR end "rule__Foot__Group__0"


    // $ANTLR start "rule__Foot__Group__0__Impl"
    // InternalRaspiRover.g:4459:1: rule__Foot__Group__0__Impl : ( () ) ;
    public final void rule__Foot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4463:1: ( ( () ) )
            // InternalRaspiRover.g:4464:1: ( () )
            {
            // InternalRaspiRover.g:4464:1: ( () )
            // InternalRaspiRover.g:4465:2: ()
            {
             before(grammarAccess.getFootAccess().getFootAction_0()); 
            // InternalRaspiRover.g:4466:2: ()
            // InternalRaspiRover.g:4466:3: 
            {
            }

             after(grammarAccess.getFootAccess().getFootAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foot__Group__0__Impl"


    // $ANTLR start "rule__Foot__Group__1"
    // InternalRaspiRover.g:4474:1: rule__Foot__Group__1 : rule__Foot__Group__1__Impl ;
    public final void rule__Foot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4478:1: ( rule__Foot__Group__1__Impl )
            // InternalRaspiRover.g:4479:2: rule__Foot__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Foot__Group__1__Impl();

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
    // $ANTLR end "rule__Foot__Group__1"


    // $ANTLR start "rule__Foot__Group__1__Impl"
    // InternalRaspiRover.g:4485:1: rule__Foot__Group__1__Impl : ( 'ft' ) ;
    public final void rule__Foot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4489:1: ( ( 'ft' ) )
            // InternalRaspiRover.g:4490:1: ( 'ft' )
            {
            // InternalRaspiRover.g:4490:1: ( 'ft' )
            // InternalRaspiRover.g:4491:2: 'ft'
            {
             before(grammarAccess.getFootAccess().getFtKeyword_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getFootAccess().getFtKeyword_1()); 

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
    // $ANTLR end "rule__Foot__Group__1__Impl"


    // $ANTLR start "rule__Inch__Group__0"
    // InternalRaspiRover.g:4501:1: rule__Inch__Group__0 : rule__Inch__Group__0__Impl rule__Inch__Group__1 ;
    public final void rule__Inch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4505:1: ( rule__Inch__Group__0__Impl rule__Inch__Group__1 )
            // InternalRaspiRover.g:4506:2: rule__Inch__Group__0__Impl rule__Inch__Group__1
            {
            pushFollow(FOLLOW_43);
            rule__Inch__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inch__Group__1();

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
    // $ANTLR end "rule__Inch__Group__0"


    // $ANTLR start "rule__Inch__Group__0__Impl"
    // InternalRaspiRover.g:4513:1: rule__Inch__Group__0__Impl : ( () ) ;
    public final void rule__Inch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4517:1: ( ( () ) )
            // InternalRaspiRover.g:4518:1: ( () )
            {
            // InternalRaspiRover.g:4518:1: ( () )
            // InternalRaspiRover.g:4519:2: ()
            {
             before(grammarAccess.getInchAccess().getInchAction_0()); 
            // InternalRaspiRover.g:4520:2: ()
            // InternalRaspiRover.g:4520:3: 
            {
            }

             after(grammarAccess.getInchAccess().getInchAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inch__Group__0__Impl"


    // $ANTLR start "rule__Inch__Group__1"
    // InternalRaspiRover.g:4528:1: rule__Inch__Group__1 : rule__Inch__Group__1__Impl ;
    public final void rule__Inch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4532:1: ( rule__Inch__Group__1__Impl )
            // InternalRaspiRover.g:4533:2: rule__Inch__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Inch__Group__1__Impl();

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
    // $ANTLR end "rule__Inch__Group__1"


    // $ANTLR start "rule__Inch__Group__1__Impl"
    // InternalRaspiRover.g:4539:1: rule__Inch__Group__1__Impl : ( 'in' ) ;
    public final void rule__Inch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4543:1: ( ( 'in' ) )
            // InternalRaspiRover.g:4544:1: ( 'in' )
            {
            // InternalRaspiRover.g:4544:1: ( 'in' )
            // InternalRaspiRover.g:4545:2: 'in'
            {
             before(grammarAccess.getInchAccess().getInKeyword_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getInchAccess().getInKeyword_1()); 

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
    // $ANTLR end "rule__Inch__Group__1__Impl"


    // $ANTLR start "rule__Yard__Group__0"
    // InternalRaspiRover.g:4555:1: rule__Yard__Group__0 : rule__Yard__Group__0__Impl rule__Yard__Group__1 ;
    public final void rule__Yard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4559:1: ( rule__Yard__Group__0__Impl rule__Yard__Group__1 )
            // InternalRaspiRover.g:4560:2: rule__Yard__Group__0__Impl rule__Yard__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__Yard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Yard__Group__1();

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
    // $ANTLR end "rule__Yard__Group__0"


    // $ANTLR start "rule__Yard__Group__0__Impl"
    // InternalRaspiRover.g:4567:1: rule__Yard__Group__0__Impl : ( () ) ;
    public final void rule__Yard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4571:1: ( ( () ) )
            // InternalRaspiRover.g:4572:1: ( () )
            {
            // InternalRaspiRover.g:4572:1: ( () )
            // InternalRaspiRover.g:4573:2: ()
            {
             before(grammarAccess.getYardAccess().getYardAction_0()); 
            // InternalRaspiRover.g:4574:2: ()
            // InternalRaspiRover.g:4574:3: 
            {
            }

             after(grammarAccess.getYardAccess().getYardAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Yard__Group__0__Impl"


    // $ANTLR start "rule__Yard__Group__1"
    // InternalRaspiRover.g:4582:1: rule__Yard__Group__1 : rule__Yard__Group__1__Impl ;
    public final void rule__Yard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4586:1: ( rule__Yard__Group__1__Impl )
            // InternalRaspiRover.g:4587:2: rule__Yard__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Yard__Group__1__Impl();

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
    // $ANTLR end "rule__Yard__Group__1"


    // $ANTLR start "rule__Yard__Group__1__Impl"
    // InternalRaspiRover.g:4593:1: rule__Yard__Group__1__Impl : ( 'yd' ) ;
    public final void rule__Yard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4597:1: ( ( 'yd' ) )
            // InternalRaspiRover.g:4598:1: ( 'yd' )
            {
            // InternalRaspiRover.g:4598:1: ( 'yd' )
            // InternalRaspiRover.g:4599:2: 'yd'
            {
             before(grammarAccess.getYardAccess().getYdKeyword_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getYardAccess().getYdKeyword_1()); 

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
    // $ANTLR end "rule__Yard__Group__1__Impl"


    // $ANTLR start "rule__Radian__Group__0"
    // InternalRaspiRover.g:4609:1: rule__Radian__Group__0 : rule__Radian__Group__0__Impl rule__Radian__Group__1 ;
    public final void rule__Radian__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4613:1: ( rule__Radian__Group__0__Impl rule__Radian__Group__1 )
            // InternalRaspiRover.g:4614:2: rule__Radian__Group__0__Impl rule__Radian__Group__1
            {
            pushFollow(FOLLOW_45);
            rule__Radian__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Radian__Group__1();

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
    // $ANTLR end "rule__Radian__Group__0"


    // $ANTLR start "rule__Radian__Group__0__Impl"
    // InternalRaspiRover.g:4621:1: rule__Radian__Group__0__Impl : ( () ) ;
    public final void rule__Radian__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4625:1: ( ( () ) )
            // InternalRaspiRover.g:4626:1: ( () )
            {
            // InternalRaspiRover.g:4626:1: ( () )
            // InternalRaspiRover.g:4627:2: ()
            {
             before(grammarAccess.getRadianAccess().getRadianAction_0()); 
            // InternalRaspiRover.g:4628:2: ()
            // InternalRaspiRover.g:4628:3: 
            {
            }

             after(grammarAccess.getRadianAccess().getRadianAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Radian__Group__0__Impl"


    // $ANTLR start "rule__Radian__Group__1"
    // InternalRaspiRover.g:4636:1: rule__Radian__Group__1 : rule__Radian__Group__1__Impl ;
    public final void rule__Radian__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4640:1: ( rule__Radian__Group__1__Impl )
            // InternalRaspiRover.g:4641:2: rule__Radian__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Radian__Group__1__Impl();

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
    // $ANTLR end "rule__Radian__Group__1"


    // $ANTLR start "rule__Radian__Group__1__Impl"
    // InternalRaspiRover.g:4647:1: rule__Radian__Group__1__Impl : ( 'rad' ) ;
    public final void rule__Radian__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4651:1: ( ( 'rad' ) )
            // InternalRaspiRover.g:4652:1: ( 'rad' )
            {
            // InternalRaspiRover.g:4652:1: ( 'rad' )
            // InternalRaspiRover.g:4653:2: 'rad'
            {
             before(grammarAccess.getRadianAccess().getRadKeyword_1()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getRadianAccess().getRadKeyword_1()); 

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
    // $ANTLR end "rule__Radian__Group__1__Impl"


    // $ANTLR start "rule__Degree__Group__0"
    // InternalRaspiRover.g:4663:1: rule__Degree__Group__0 : rule__Degree__Group__0__Impl rule__Degree__Group__1 ;
    public final void rule__Degree__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4667:1: ( rule__Degree__Group__0__Impl rule__Degree__Group__1 )
            // InternalRaspiRover.g:4668:2: rule__Degree__Group__0__Impl rule__Degree__Group__1
            {
            pushFollow(FOLLOW_46);
            rule__Degree__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Degree__Group__1();

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
    // $ANTLR end "rule__Degree__Group__0"


    // $ANTLR start "rule__Degree__Group__0__Impl"
    // InternalRaspiRover.g:4675:1: rule__Degree__Group__0__Impl : ( () ) ;
    public final void rule__Degree__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4679:1: ( ( () ) )
            // InternalRaspiRover.g:4680:1: ( () )
            {
            // InternalRaspiRover.g:4680:1: ( () )
            // InternalRaspiRover.g:4681:2: ()
            {
             before(grammarAccess.getDegreeAccess().getDegreeAction_0()); 
            // InternalRaspiRover.g:4682:2: ()
            // InternalRaspiRover.g:4682:3: 
            {
            }

             after(grammarAccess.getDegreeAccess().getDegreeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Degree__Group__0__Impl"


    // $ANTLR start "rule__Degree__Group__1"
    // InternalRaspiRover.g:4690:1: rule__Degree__Group__1 : rule__Degree__Group__1__Impl ;
    public final void rule__Degree__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4694:1: ( rule__Degree__Group__1__Impl )
            // InternalRaspiRover.g:4695:2: rule__Degree__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Degree__Group__1__Impl();

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
    // $ANTLR end "rule__Degree__Group__1"


    // $ANTLR start "rule__Degree__Group__1__Impl"
    // InternalRaspiRover.g:4701:1: rule__Degree__Group__1__Impl : ( 'deg' ) ;
    public final void rule__Degree__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4705:1: ( ( 'deg' ) )
            // InternalRaspiRover.g:4706:1: ( 'deg' )
            {
            // InternalRaspiRover.g:4706:1: ( 'deg' )
            // InternalRaspiRover.g:4707:2: 'deg'
            {
             before(grammarAccess.getDegreeAccess().getDegKeyword_1()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getDegreeAccess().getDegKeyword_1()); 

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
    // $ANTLR end "rule__Degree__Group__1__Impl"


    // $ANTLR start "rule__Turn__Group__0"
    // InternalRaspiRover.g:4717:1: rule__Turn__Group__0 : rule__Turn__Group__0__Impl rule__Turn__Group__1 ;
    public final void rule__Turn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4721:1: ( rule__Turn__Group__0__Impl rule__Turn__Group__1 )
            // InternalRaspiRover.g:4722:2: rule__Turn__Group__0__Impl rule__Turn__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Turn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Turn__Group__1();

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
    // $ANTLR end "rule__Turn__Group__0"


    // $ANTLR start "rule__Turn__Group__0__Impl"
    // InternalRaspiRover.g:4729:1: rule__Turn__Group__0__Impl : ( () ) ;
    public final void rule__Turn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4733:1: ( ( () ) )
            // InternalRaspiRover.g:4734:1: ( () )
            {
            // InternalRaspiRover.g:4734:1: ( () )
            // InternalRaspiRover.g:4735:2: ()
            {
             before(grammarAccess.getTurnAccess().getTurnAction_0()); 
            // InternalRaspiRover.g:4736:2: ()
            // InternalRaspiRover.g:4736:3: 
            {
            }

             after(grammarAccess.getTurnAccess().getTurnAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Turn__Group__0__Impl"


    // $ANTLR start "rule__Turn__Group__1"
    // InternalRaspiRover.g:4744:1: rule__Turn__Group__1 : rule__Turn__Group__1__Impl ;
    public final void rule__Turn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4748:1: ( rule__Turn__Group__1__Impl )
            // InternalRaspiRover.g:4749:2: rule__Turn__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Turn__Group__1__Impl();

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
    // $ANTLR end "rule__Turn__Group__1"


    // $ANTLR start "rule__Turn__Group__1__Impl"
    // InternalRaspiRover.g:4755:1: rule__Turn__Group__1__Impl : ( 'turn' ) ;
    public final void rule__Turn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4759:1: ( ( 'turn' ) )
            // InternalRaspiRover.g:4760:1: ( 'turn' )
            {
            // InternalRaspiRover.g:4760:1: ( 'turn' )
            // InternalRaspiRover.g:4761:2: 'turn'
            {
             before(grammarAccess.getTurnAccess().getTurnKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTurnAccess().getTurnKeyword_1()); 

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
    // $ANTLR end "rule__Turn__Group__1__Impl"


    // $ANTLR start "rule__Gradian__Group__0"
    // InternalRaspiRover.g:4771:1: rule__Gradian__Group__0 : rule__Gradian__Group__0__Impl rule__Gradian__Group__1 ;
    public final void rule__Gradian__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4775:1: ( rule__Gradian__Group__0__Impl rule__Gradian__Group__1 )
            // InternalRaspiRover.g:4776:2: rule__Gradian__Group__0__Impl rule__Gradian__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__Gradian__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gradian__Group__1();

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
    // $ANTLR end "rule__Gradian__Group__0"


    // $ANTLR start "rule__Gradian__Group__0__Impl"
    // InternalRaspiRover.g:4783:1: rule__Gradian__Group__0__Impl : ( () ) ;
    public final void rule__Gradian__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4787:1: ( ( () ) )
            // InternalRaspiRover.g:4788:1: ( () )
            {
            // InternalRaspiRover.g:4788:1: ( () )
            // InternalRaspiRover.g:4789:2: ()
            {
             before(grammarAccess.getGradianAccess().getGradianAction_0()); 
            // InternalRaspiRover.g:4790:2: ()
            // InternalRaspiRover.g:4790:3: 
            {
            }

             after(grammarAccess.getGradianAccess().getGradianAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gradian__Group__0__Impl"


    // $ANTLR start "rule__Gradian__Group__1"
    // InternalRaspiRover.g:4798:1: rule__Gradian__Group__1 : rule__Gradian__Group__1__Impl ;
    public final void rule__Gradian__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4802:1: ( rule__Gradian__Group__1__Impl )
            // InternalRaspiRover.g:4803:2: rule__Gradian__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Gradian__Group__1__Impl();

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
    // $ANTLR end "rule__Gradian__Group__1"


    // $ANTLR start "rule__Gradian__Group__1__Impl"
    // InternalRaspiRover.g:4809:1: rule__Gradian__Group__1__Impl : ( 'grad' ) ;
    public final void rule__Gradian__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4813:1: ( ( 'grad' ) )
            // InternalRaspiRover.g:4814:1: ( 'grad' )
            {
            // InternalRaspiRover.g:4814:1: ( 'grad' )
            // InternalRaspiRover.g:4815:2: 'grad'
            {
             before(grammarAccess.getGradianAccess().getGradKeyword_1()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getGradianAccess().getGradKeyword_1()); 

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
    // $ANTLR end "rule__Gradian__Group__1__Impl"


    // $ANTLR start "rule__NumericExpression__Group__0"
    // InternalRaspiRover.g:4825:1: rule__NumericExpression__Group__0 : rule__NumericExpression__Group__0__Impl rule__NumericExpression__Group__1 ;
    public final void rule__NumericExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4829:1: ( rule__NumericExpression__Group__0__Impl rule__NumericExpression__Group__1 )
            // InternalRaspiRover.g:4830:2: rule__NumericExpression__Group__0__Impl rule__NumericExpression__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__NumericExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericExpression__Group__1();

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
    // $ANTLR end "rule__NumericExpression__Group__0"


    // $ANTLR start "rule__NumericExpression__Group__0__Impl"
    // InternalRaspiRover.g:4837:1: rule__NumericExpression__Group__0__Impl : ( () ) ;
    public final void rule__NumericExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4841:1: ( ( () ) )
            // InternalRaspiRover.g:4842:1: ( () )
            {
            // InternalRaspiRover.g:4842:1: ( () )
            // InternalRaspiRover.g:4843:2: ()
            {
             before(grammarAccess.getNumericExpressionAccess().getNumericExpressionAction_0()); 
            // InternalRaspiRover.g:4844:2: ()
            // InternalRaspiRover.g:4844:3: 
            {
            }

             after(grammarAccess.getNumericExpressionAccess().getNumericExpressionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericExpression__Group__0__Impl"


    // $ANTLR start "rule__NumericExpression__Group__1"
    // InternalRaspiRover.g:4852:1: rule__NumericExpression__Group__1 : rule__NumericExpression__Group__1__Impl rule__NumericExpression__Group__2 ;
    public final void rule__NumericExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4856:1: ( rule__NumericExpression__Group__1__Impl rule__NumericExpression__Group__2 )
            // InternalRaspiRover.g:4857:2: rule__NumericExpression__Group__1__Impl rule__NumericExpression__Group__2
            {
            pushFollow(FOLLOW_47);
            rule__NumericExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericExpression__Group__2();

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
    // $ANTLR end "rule__NumericExpression__Group__1"


    // $ANTLR start "rule__NumericExpression__Group__1__Impl"
    // InternalRaspiRover.g:4864:1: rule__NumericExpression__Group__1__Impl : ( ( rule__NumericExpression__LhsAssignment_1 ) ) ;
    public final void rule__NumericExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4868:1: ( ( ( rule__NumericExpression__LhsAssignment_1 ) ) )
            // InternalRaspiRover.g:4869:1: ( ( rule__NumericExpression__LhsAssignment_1 ) )
            {
            // InternalRaspiRover.g:4869:1: ( ( rule__NumericExpression__LhsAssignment_1 ) )
            // InternalRaspiRover.g:4870:2: ( rule__NumericExpression__LhsAssignment_1 )
            {
             before(grammarAccess.getNumericExpressionAccess().getLhsAssignment_1()); 
            // InternalRaspiRover.g:4871:2: ( rule__NumericExpression__LhsAssignment_1 )
            // InternalRaspiRover.g:4871:3: rule__NumericExpression__LhsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NumericExpression__LhsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNumericExpressionAccess().getLhsAssignment_1()); 

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
    // $ANTLR end "rule__NumericExpression__Group__1__Impl"


    // $ANTLR start "rule__NumericExpression__Group__2"
    // InternalRaspiRover.g:4879:1: rule__NumericExpression__Group__2 : rule__NumericExpression__Group__2__Impl rule__NumericExpression__Group__3 ;
    public final void rule__NumericExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4883:1: ( rule__NumericExpression__Group__2__Impl rule__NumericExpression__Group__3 )
            // InternalRaspiRover.g:4884:2: rule__NumericExpression__Group__2__Impl rule__NumericExpression__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__NumericExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericExpression__Group__3();

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
    // $ANTLR end "rule__NumericExpression__Group__2"


    // $ANTLR start "rule__NumericExpression__Group__2__Impl"
    // InternalRaspiRover.g:4891:1: rule__NumericExpression__Group__2__Impl : ( ( rule__NumericExpression__OpAssignment_2 ) ) ;
    public final void rule__NumericExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4895:1: ( ( ( rule__NumericExpression__OpAssignment_2 ) ) )
            // InternalRaspiRover.g:4896:1: ( ( rule__NumericExpression__OpAssignment_2 ) )
            {
            // InternalRaspiRover.g:4896:1: ( ( rule__NumericExpression__OpAssignment_2 ) )
            // InternalRaspiRover.g:4897:2: ( rule__NumericExpression__OpAssignment_2 )
            {
             before(grammarAccess.getNumericExpressionAccess().getOpAssignment_2()); 
            // InternalRaspiRover.g:4898:2: ( rule__NumericExpression__OpAssignment_2 )
            // InternalRaspiRover.g:4898:3: rule__NumericExpression__OpAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__NumericExpression__OpAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNumericExpressionAccess().getOpAssignment_2()); 

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
    // $ANTLR end "rule__NumericExpression__Group__2__Impl"


    // $ANTLR start "rule__NumericExpression__Group__3"
    // InternalRaspiRover.g:4906:1: rule__NumericExpression__Group__3 : rule__NumericExpression__Group__3__Impl ;
    public final void rule__NumericExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4910:1: ( rule__NumericExpression__Group__3__Impl )
            // InternalRaspiRover.g:4911:2: rule__NumericExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumericExpression__Group__3__Impl();

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
    // $ANTLR end "rule__NumericExpression__Group__3"


    // $ANTLR start "rule__NumericExpression__Group__3__Impl"
    // InternalRaspiRover.g:4917:1: rule__NumericExpression__Group__3__Impl : ( ( rule__NumericExpression__RhsAssignment_3 ) ) ;
    public final void rule__NumericExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4921:1: ( ( ( rule__NumericExpression__RhsAssignment_3 ) ) )
            // InternalRaspiRover.g:4922:1: ( ( rule__NumericExpression__RhsAssignment_3 ) )
            {
            // InternalRaspiRover.g:4922:1: ( ( rule__NumericExpression__RhsAssignment_3 ) )
            // InternalRaspiRover.g:4923:2: ( rule__NumericExpression__RhsAssignment_3 )
            {
             before(grammarAccess.getNumericExpressionAccess().getRhsAssignment_3()); 
            // InternalRaspiRover.g:4924:2: ( rule__NumericExpression__RhsAssignment_3 )
            // InternalRaspiRover.g:4924:3: rule__NumericExpression__RhsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__NumericExpression__RhsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getNumericExpressionAccess().getRhsAssignment_3()); 

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
    // $ANTLR end "rule__NumericExpression__Group__3__Impl"


    // $ANTLR start "rule__StringExpression__Group__0"
    // InternalRaspiRover.g:4933:1: rule__StringExpression__Group__0 : rule__StringExpression__Group__0__Impl rule__StringExpression__Group__1 ;
    public final void rule__StringExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4937:1: ( rule__StringExpression__Group__0__Impl rule__StringExpression__Group__1 )
            // InternalRaspiRover.g:4938:2: rule__StringExpression__Group__0__Impl rule__StringExpression__Group__1
            {
            pushFollow(FOLLOW_48);
            rule__StringExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringExpression__Group__1();

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
    // $ANTLR end "rule__StringExpression__Group__0"


    // $ANTLR start "rule__StringExpression__Group__0__Impl"
    // InternalRaspiRover.g:4945:1: rule__StringExpression__Group__0__Impl : ( () ) ;
    public final void rule__StringExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4949:1: ( ( () ) )
            // InternalRaspiRover.g:4950:1: ( () )
            {
            // InternalRaspiRover.g:4950:1: ( () )
            // InternalRaspiRover.g:4951:2: ()
            {
             before(grammarAccess.getStringExpressionAccess().getStringExpressionAction_0()); 
            // InternalRaspiRover.g:4952:2: ()
            // InternalRaspiRover.g:4952:3: 
            {
            }

             after(grammarAccess.getStringExpressionAccess().getStringExpressionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringExpression__Group__0__Impl"


    // $ANTLR start "rule__StringExpression__Group__1"
    // InternalRaspiRover.g:4960:1: rule__StringExpression__Group__1 : rule__StringExpression__Group__1__Impl rule__StringExpression__Group__2 ;
    public final void rule__StringExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4964:1: ( rule__StringExpression__Group__1__Impl rule__StringExpression__Group__2 )
            // InternalRaspiRover.g:4965:2: rule__StringExpression__Group__1__Impl rule__StringExpression__Group__2
            {
            pushFollow(FOLLOW_49);
            rule__StringExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringExpression__Group__2();

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
    // $ANTLR end "rule__StringExpression__Group__1"


    // $ANTLR start "rule__StringExpression__Group__1__Impl"
    // InternalRaspiRover.g:4972:1: rule__StringExpression__Group__1__Impl : ( ( rule__StringExpression__LhsAssignment_1 ) ) ;
    public final void rule__StringExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4976:1: ( ( ( rule__StringExpression__LhsAssignment_1 ) ) )
            // InternalRaspiRover.g:4977:1: ( ( rule__StringExpression__LhsAssignment_1 ) )
            {
            // InternalRaspiRover.g:4977:1: ( ( rule__StringExpression__LhsAssignment_1 ) )
            // InternalRaspiRover.g:4978:2: ( rule__StringExpression__LhsAssignment_1 )
            {
             before(grammarAccess.getStringExpressionAccess().getLhsAssignment_1()); 
            // InternalRaspiRover.g:4979:2: ( rule__StringExpression__LhsAssignment_1 )
            // InternalRaspiRover.g:4979:3: rule__StringExpression__LhsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StringExpression__LhsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStringExpressionAccess().getLhsAssignment_1()); 

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
    // $ANTLR end "rule__StringExpression__Group__1__Impl"


    // $ANTLR start "rule__StringExpression__Group__2"
    // InternalRaspiRover.g:4987:1: rule__StringExpression__Group__2 : rule__StringExpression__Group__2__Impl rule__StringExpression__Group__3 ;
    public final void rule__StringExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:4991:1: ( rule__StringExpression__Group__2__Impl rule__StringExpression__Group__3 )
            // InternalRaspiRover.g:4992:2: rule__StringExpression__Group__2__Impl rule__StringExpression__Group__3
            {
            pushFollow(FOLLOW_48);
            rule__StringExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringExpression__Group__3();

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
    // $ANTLR end "rule__StringExpression__Group__2"


    // $ANTLR start "rule__StringExpression__Group__2__Impl"
    // InternalRaspiRover.g:4999:1: rule__StringExpression__Group__2__Impl : ( ( rule__StringExpression__OpAssignment_2 ) ) ;
    public final void rule__StringExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5003:1: ( ( ( rule__StringExpression__OpAssignment_2 ) ) )
            // InternalRaspiRover.g:5004:1: ( ( rule__StringExpression__OpAssignment_2 ) )
            {
            // InternalRaspiRover.g:5004:1: ( ( rule__StringExpression__OpAssignment_2 ) )
            // InternalRaspiRover.g:5005:2: ( rule__StringExpression__OpAssignment_2 )
            {
             before(grammarAccess.getStringExpressionAccess().getOpAssignment_2()); 
            // InternalRaspiRover.g:5006:2: ( rule__StringExpression__OpAssignment_2 )
            // InternalRaspiRover.g:5006:3: rule__StringExpression__OpAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__StringExpression__OpAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStringExpressionAccess().getOpAssignment_2()); 

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
    // $ANTLR end "rule__StringExpression__Group__2__Impl"


    // $ANTLR start "rule__StringExpression__Group__3"
    // InternalRaspiRover.g:5014:1: rule__StringExpression__Group__3 : rule__StringExpression__Group__3__Impl ;
    public final void rule__StringExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5018:1: ( rule__StringExpression__Group__3__Impl )
            // InternalRaspiRover.g:5019:2: rule__StringExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringExpression__Group__3__Impl();

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
    // $ANTLR end "rule__StringExpression__Group__3"


    // $ANTLR start "rule__StringExpression__Group__3__Impl"
    // InternalRaspiRover.g:5025:1: rule__StringExpression__Group__3__Impl : ( ( rule__StringExpression__RhsAssignment_3 ) ) ;
    public final void rule__StringExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5029:1: ( ( ( rule__StringExpression__RhsAssignment_3 ) ) )
            // InternalRaspiRover.g:5030:1: ( ( rule__StringExpression__RhsAssignment_3 ) )
            {
            // InternalRaspiRover.g:5030:1: ( ( rule__StringExpression__RhsAssignment_3 ) )
            // InternalRaspiRover.g:5031:2: ( rule__StringExpression__RhsAssignment_3 )
            {
             before(grammarAccess.getStringExpressionAccess().getRhsAssignment_3()); 
            // InternalRaspiRover.g:5032:2: ( rule__StringExpression__RhsAssignment_3 )
            // InternalRaspiRover.g:5032:3: rule__StringExpression__RhsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__StringExpression__RhsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStringExpressionAccess().getRhsAssignment_3()); 

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
    // $ANTLR end "rule__StringExpression__Group__3__Impl"


    // $ANTLR start "rule__BooleanExpression__Group__0"
    // InternalRaspiRover.g:5041:1: rule__BooleanExpression__Group__0 : rule__BooleanExpression__Group__0__Impl rule__BooleanExpression__Group__1 ;
    public final void rule__BooleanExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5045:1: ( rule__BooleanExpression__Group__0__Impl rule__BooleanExpression__Group__1 )
            // InternalRaspiRover.g:5046:2: rule__BooleanExpression__Group__0__Impl rule__BooleanExpression__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__BooleanExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanExpression__Group__1();

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
    // $ANTLR end "rule__BooleanExpression__Group__0"


    // $ANTLR start "rule__BooleanExpression__Group__0__Impl"
    // InternalRaspiRover.g:5053:1: rule__BooleanExpression__Group__0__Impl : ( () ) ;
    public final void rule__BooleanExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5057:1: ( ( () ) )
            // InternalRaspiRover.g:5058:1: ( () )
            {
            // InternalRaspiRover.g:5058:1: ( () )
            // InternalRaspiRover.g:5059:2: ()
            {
             before(grammarAccess.getBooleanExpressionAccess().getBooleanExpressionAction_0()); 
            // InternalRaspiRover.g:5060:2: ()
            // InternalRaspiRover.g:5060:3: 
            {
            }

             after(grammarAccess.getBooleanExpressionAccess().getBooleanExpressionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpression__Group__0__Impl"


    // $ANTLR start "rule__BooleanExpression__Group__1"
    // InternalRaspiRover.g:5068:1: rule__BooleanExpression__Group__1 : rule__BooleanExpression__Group__1__Impl rule__BooleanExpression__Group__2 ;
    public final void rule__BooleanExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5072:1: ( rule__BooleanExpression__Group__1__Impl rule__BooleanExpression__Group__2 )
            // InternalRaspiRover.g:5073:2: rule__BooleanExpression__Group__1__Impl rule__BooleanExpression__Group__2
            {
            pushFollow(FOLLOW_49);
            rule__BooleanExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanExpression__Group__2();

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
    // $ANTLR end "rule__BooleanExpression__Group__1"


    // $ANTLR start "rule__BooleanExpression__Group__1__Impl"
    // InternalRaspiRover.g:5080:1: rule__BooleanExpression__Group__1__Impl : ( ( rule__BooleanExpression__LhsAssignment_1 ) ) ;
    public final void rule__BooleanExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5084:1: ( ( ( rule__BooleanExpression__LhsAssignment_1 ) ) )
            // InternalRaspiRover.g:5085:1: ( ( rule__BooleanExpression__LhsAssignment_1 ) )
            {
            // InternalRaspiRover.g:5085:1: ( ( rule__BooleanExpression__LhsAssignment_1 ) )
            // InternalRaspiRover.g:5086:2: ( rule__BooleanExpression__LhsAssignment_1 )
            {
             before(grammarAccess.getBooleanExpressionAccess().getLhsAssignment_1()); 
            // InternalRaspiRover.g:5087:2: ( rule__BooleanExpression__LhsAssignment_1 )
            // InternalRaspiRover.g:5087:3: rule__BooleanExpression__LhsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpression__LhsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBooleanExpressionAccess().getLhsAssignment_1()); 

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
    // $ANTLR end "rule__BooleanExpression__Group__1__Impl"


    // $ANTLR start "rule__BooleanExpression__Group__2"
    // InternalRaspiRover.g:5095:1: rule__BooleanExpression__Group__2 : rule__BooleanExpression__Group__2__Impl rule__BooleanExpression__Group__3 ;
    public final void rule__BooleanExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5099:1: ( rule__BooleanExpression__Group__2__Impl rule__BooleanExpression__Group__3 )
            // InternalRaspiRover.g:5100:2: rule__BooleanExpression__Group__2__Impl rule__BooleanExpression__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__BooleanExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanExpression__Group__3();

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
    // $ANTLR end "rule__BooleanExpression__Group__2"


    // $ANTLR start "rule__BooleanExpression__Group__2__Impl"
    // InternalRaspiRover.g:5107:1: rule__BooleanExpression__Group__2__Impl : ( ( rule__BooleanExpression__OpAssignment_2 ) ) ;
    public final void rule__BooleanExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5111:1: ( ( ( rule__BooleanExpression__OpAssignment_2 ) ) )
            // InternalRaspiRover.g:5112:1: ( ( rule__BooleanExpression__OpAssignment_2 ) )
            {
            // InternalRaspiRover.g:5112:1: ( ( rule__BooleanExpression__OpAssignment_2 ) )
            // InternalRaspiRover.g:5113:2: ( rule__BooleanExpression__OpAssignment_2 )
            {
             before(grammarAccess.getBooleanExpressionAccess().getOpAssignment_2()); 
            // InternalRaspiRover.g:5114:2: ( rule__BooleanExpression__OpAssignment_2 )
            // InternalRaspiRover.g:5114:3: rule__BooleanExpression__OpAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpression__OpAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBooleanExpressionAccess().getOpAssignment_2()); 

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
    // $ANTLR end "rule__BooleanExpression__Group__2__Impl"


    // $ANTLR start "rule__BooleanExpression__Group__3"
    // InternalRaspiRover.g:5122:1: rule__BooleanExpression__Group__3 : rule__BooleanExpression__Group__3__Impl ;
    public final void rule__BooleanExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5126:1: ( rule__BooleanExpression__Group__3__Impl )
            // InternalRaspiRover.g:5127:2: rule__BooleanExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpression__Group__3__Impl();

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
    // $ANTLR end "rule__BooleanExpression__Group__3"


    // $ANTLR start "rule__BooleanExpression__Group__3__Impl"
    // InternalRaspiRover.g:5133:1: rule__BooleanExpression__Group__3__Impl : ( ( rule__BooleanExpression__RhsAssignment_3 ) ) ;
    public final void rule__BooleanExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5137:1: ( ( ( rule__BooleanExpression__RhsAssignment_3 ) ) )
            // InternalRaspiRover.g:5138:1: ( ( rule__BooleanExpression__RhsAssignment_3 ) )
            {
            // InternalRaspiRover.g:5138:1: ( ( rule__BooleanExpression__RhsAssignment_3 ) )
            // InternalRaspiRover.g:5139:2: ( rule__BooleanExpression__RhsAssignment_3 )
            {
             before(grammarAccess.getBooleanExpressionAccess().getRhsAssignment_3()); 
            // InternalRaspiRover.g:5140:2: ( rule__BooleanExpression__RhsAssignment_3 )
            // InternalRaspiRover.g:5140:3: rule__BooleanExpression__RhsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpression__RhsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBooleanExpressionAccess().getRhsAssignment_3()); 

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
    // $ANTLR end "rule__BooleanExpression__Group__3__Impl"


    // $ANTLR start "rule__Pin_Impl__Group__0"
    // InternalRaspiRover.g:5149:1: rule__Pin_Impl__Group__0 : rule__Pin_Impl__Group__0__Impl rule__Pin_Impl__Group__1 ;
    public final void rule__Pin_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5153:1: ( rule__Pin_Impl__Group__0__Impl rule__Pin_Impl__Group__1 )
            // InternalRaspiRover.g:5154:2: rule__Pin_Impl__Group__0__Impl rule__Pin_Impl__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Pin_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pin_Impl__Group__1();

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
    // $ANTLR end "rule__Pin_Impl__Group__0"


    // $ANTLR start "rule__Pin_Impl__Group__0__Impl"
    // InternalRaspiRover.g:5161:1: rule__Pin_Impl__Group__0__Impl : ( 'pin' ) ;
    public final void rule__Pin_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5165:1: ( ( 'pin' ) )
            // InternalRaspiRover.g:5166:1: ( 'pin' )
            {
            // InternalRaspiRover.g:5166:1: ( 'pin' )
            // InternalRaspiRover.g:5167:2: 'pin'
            {
             before(grammarAccess.getPin_ImplAccess().getPinKeyword_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getPin_ImplAccess().getPinKeyword_0()); 

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
    // $ANTLR end "rule__Pin_Impl__Group__0__Impl"


    // $ANTLR start "rule__Pin_Impl__Group__1"
    // InternalRaspiRover.g:5176:1: rule__Pin_Impl__Group__1 : rule__Pin_Impl__Group__1__Impl rule__Pin_Impl__Group__2 ;
    public final void rule__Pin_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5180:1: ( rule__Pin_Impl__Group__1__Impl rule__Pin_Impl__Group__2 )
            // InternalRaspiRover.g:5181:2: rule__Pin_Impl__Group__1__Impl rule__Pin_Impl__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Pin_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pin_Impl__Group__2();

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
    // $ANTLR end "rule__Pin_Impl__Group__1"


    // $ANTLR start "rule__Pin_Impl__Group__1__Impl"
    // InternalRaspiRover.g:5188:1: rule__Pin_Impl__Group__1__Impl : ( ( rule__Pin_Impl__NameAssignment_1 ) ) ;
    public final void rule__Pin_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5192:1: ( ( ( rule__Pin_Impl__NameAssignment_1 ) ) )
            // InternalRaspiRover.g:5193:1: ( ( rule__Pin_Impl__NameAssignment_1 ) )
            {
            // InternalRaspiRover.g:5193:1: ( ( rule__Pin_Impl__NameAssignment_1 ) )
            // InternalRaspiRover.g:5194:2: ( rule__Pin_Impl__NameAssignment_1 )
            {
             before(grammarAccess.getPin_ImplAccess().getNameAssignment_1()); 
            // InternalRaspiRover.g:5195:2: ( rule__Pin_Impl__NameAssignment_1 )
            // InternalRaspiRover.g:5195:3: rule__Pin_Impl__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Pin_Impl__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPin_ImplAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Pin_Impl__Group__1__Impl"


    // $ANTLR start "rule__Pin_Impl__Group__2"
    // InternalRaspiRover.g:5203:1: rule__Pin_Impl__Group__2 : rule__Pin_Impl__Group__2__Impl ;
    public final void rule__Pin_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5207:1: ( rule__Pin_Impl__Group__2__Impl )
            // InternalRaspiRover.g:5208:2: rule__Pin_Impl__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pin_Impl__Group__2__Impl();

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
    // $ANTLR end "rule__Pin_Impl__Group__2"


    // $ANTLR start "rule__Pin_Impl__Group__2__Impl"
    // InternalRaspiRover.g:5214:1: rule__Pin_Impl__Group__2__Impl : ( ( rule__Pin_Impl__Group_2__0 )? ) ;
    public final void rule__Pin_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5218:1: ( ( ( rule__Pin_Impl__Group_2__0 )? ) )
            // InternalRaspiRover.g:5219:1: ( ( rule__Pin_Impl__Group_2__0 )? )
            {
            // InternalRaspiRover.g:5219:1: ( ( rule__Pin_Impl__Group_2__0 )? )
            // InternalRaspiRover.g:5220:2: ( rule__Pin_Impl__Group_2__0 )?
            {
             before(grammarAccess.getPin_ImplAccess().getGroup_2()); 
            // InternalRaspiRover.g:5221:2: ( rule__Pin_Impl__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRaspiRover.g:5221:3: rule__Pin_Impl__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pin_Impl__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPin_ImplAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Pin_Impl__Group__2__Impl"


    // $ANTLR start "rule__Pin_Impl__Group_2__0"
    // InternalRaspiRover.g:5230:1: rule__Pin_Impl__Group_2__0 : rule__Pin_Impl__Group_2__0__Impl rule__Pin_Impl__Group_2__1 ;
    public final void rule__Pin_Impl__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5234:1: ( rule__Pin_Impl__Group_2__0__Impl rule__Pin_Impl__Group_2__1 )
            // InternalRaspiRover.g:5235:2: rule__Pin_Impl__Group_2__0__Impl rule__Pin_Impl__Group_2__1
            {
            pushFollow(FOLLOW_50);
            rule__Pin_Impl__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pin_Impl__Group_2__1();

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
    // $ANTLR end "rule__Pin_Impl__Group_2__0"


    // $ANTLR start "rule__Pin_Impl__Group_2__0__Impl"
    // InternalRaspiRover.g:5242:1: rule__Pin_Impl__Group_2__0__Impl : ( '[' ) ;
    public final void rule__Pin_Impl__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5246:1: ( ( '[' ) )
            // InternalRaspiRover.g:5247:1: ( '[' )
            {
            // InternalRaspiRover.g:5247:1: ( '[' )
            // InternalRaspiRover.g:5248:2: '['
            {
             before(grammarAccess.getPin_ImplAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPin_ImplAccess().getLeftSquareBracketKeyword_2_0()); 

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
    // $ANTLR end "rule__Pin_Impl__Group_2__0__Impl"


    // $ANTLR start "rule__Pin_Impl__Group_2__1"
    // InternalRaspiRover.g:5257:1: rule__Pin_Impl__Group_2__1 : rule__Pin_Impl__Group_2__1__Impl rule__Pin_Impl__Group_2__2 ;
    public final void rule__Pin_Impl__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5261:1: ( rule__Pin_Impl__Group_2__1__Impl rule__Pin_Impl__Group_2__2 )
            // InternalRaspiRover.g:5262:2: rule__Pin_Impl__Group_2__1__Impl rule__Pin_Impl__Group_2__2
            {
            pushFollow(FOLLOW_11);
            rule__Pin_Impl__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pin_Impl__Group_2__2();

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
    // $ANTLR end "rule__Pin_Impl__Group_2__1"


    // $ANTLR start "rule__Pin_Impl__Group_2__1__Impl"
    // InternalRaspiRover.g:5269:1: rule__Pin_Impl__Group_2__1__Impl : ( ( rule__Pin_Impl__LevelAssignment_2_1 ) ) ;
    public final void rule__Pin_Impl__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5273:1: ( ( ( rule__Pin_Impl__LevelAssignment_2_1 ) ) )
            // InternalRaspiRover.g:5274:1: ( ( rule__Pin_Impl__LevelAssignment_2_1 ) )
            {
            // InternalRaspiRover.g:5274:1: ( ( rule__Pin_Impl__LevelAssignment_2_1 ) )
            // InternalRaspiRover.g:5275:2: ( rule__Pin_Impl__LevelAssignment_2_1 )
            {
             before(grammarAccess.getPin_ImplAccess().getLevelAssignment_2_1()); 
            // InternalRaspiRover.g:5276:2: ( rule__Pin_Impl__LevelAssignment_2_1 )
            // InternalRaspiRover.g:5276:3: rule__Pin_Impl__LevelAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Pin_Impl__LevelAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPin_ImplAccess().getLevelAssignment_2_1()); 

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
    // $ANTLR end "rule__Pin_Impl__Group_2__1__Impl"


    // $ANTLR start "rule__Pin_Impl__Group_2__2"
    // InternalRaspiRover.g:5284:1: rule__Pin_Impl__Group_2__2 : rule__Pin_Impl__Group_2__2__Impl ;
    public final void rule__Pin_Impl__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5288:1: ( rule__Pin_Impl__Group_2__2__Impl )
            // InternalRaspiRover.g:5289:2: rule__Pin_Impl__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pin_Impl__Group_2__2__Impl();

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
    // $ANTLR end "rule__Pin_Impl__Group_2__2"


    // $ANTLR start "rule__Pin_Impl__Group_2__2__Impl"
    // InternalRaspiRover.g:5295:1: rule__Pin_Impl__Group_2__2__Impl : ( ']' ) ;
    public final void rule__Pin_Impl__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5299:1: ( ( ']' ) )
            // InternalRaspiRover.g:5300:1: ( ']' )
            {
            // InternalRaspiRover.g:5300:1: ( ']' )
            // InternalRaspiRover.g:5301:2: ']'
            {
             before(grammarAccess.getPin_ImplAccess().getRightSquareBracketKeyword_2_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPin_ImplAccess().getRightSquareBracketKeyword_2_2()); 

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
    // $ANTLR end "rule__Pin_Impl__Group_2__2__Impl"


    // $ANTLR start "rule__Project__BoardsAssignment_2_2"
    // InternalRaspiRover.g:5311:1: rule__Project__BoardsAssignment_2_2 : ( ruleBoard ) ;
    public final void rule__Project__BoardsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5315:1: ( ( ruleBoard ) )
            // InternalRaspiRover.g:5316:2: ( ruleBoard )
            {
            // InternalRaspiRover.g:5316:2: ( ruleBoard )
            // InternalRaspiRover.g:5317:3: ruleBoard
            {
             before(grammarAccess.getProjectAccess().getBoardsBoardParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBoard();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getBoardsBoardParserRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__Project__BoardsAssignment_2_2"


    // $ANTLR start "rule__Project__ProgramAssignment_3"
    // InternalRaspiRover.g:5326:1: rule__Project__ProgramAssignment_3 : ( ruleRoverProgram ) ;
    public final void rule__Project__ProgramAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5330:1: ( ( ruleRoverProgram ) )
            // InternalRaspiRover.g:5331:2: ( ruleRoverProgram )
            {
            // InternalRaspiRover.g:5331:2: ( ruleRoverProgram )
            // InternalRaspiRover.g:5332:3: ruleRoverProgram
            {
             before(grammarAccess.getProjectAccess().getProgramRoverProgramParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRoverProgram();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getProgramRoverProgramParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Project__ProgramAssignment_3"


    // $ANTLR start "rule__RoverProgram__NameAssignment_1"
    // InternalRaspiRover.g:5341:1: rule__RoverProgram__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RoverProgram__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5345:1: ( ( RULE_ID ) )
            // InternalRaspiRover.g:5346:2: ( RULE_ID )
            {
            // InternalRaspiRover.g:5346:2: ( RULE_ID )
            // InternalRaspiRover.g:5347:3: RULE_ID
            {
             before(grammarAccess.getRoverProgramAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRoverProgramAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__RoverProgram__NameAssignment_1"


    // $ANTLR start "rule__RoverProgram__ParamsAssignment_3_2"
    // InternalRaspiRover.g:5356:1: rule__RoverProgram__ParamsAssignment_3_2 : ( ruleParam ) ;
    public final void rule__RoverProgram__ParamsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5360:1: ( ( ruleParam ) )
            // InternalRaspiRover.g:5361:2: ( ruleParam )
            {
            // InternalRaspiRover.g:5361:2: ( ruleParam )
            // InternalRaspiRover.g:5362:3: ruleParam
            {
             before(grammarAccess.getRoverProgramAccess().getParamsParamParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParam();

            state._fsp--;

             after(grammarAccess.getRoverProgramAccess().getParamsParamParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__RoverProgram__ParamsAssignment_3_2"


    // $ANTLR start "rule__RoverProgram__ParamsAssignment_3_3_1"
    // InternalRaspiRover.g:5371:1: rule__RoverProgram__ParamsAssignment_3_3_1 : ( ruleParam ) ;
    public final void rule__RoverProgram__ParamsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5375:1: ( ( ruleParam ) )
            // InternalRaspiRover.g:5376:2: ( ruleParam )
            {
            // InternalRaspiRover.g:5376:2: ( ruleParam )
            // InternalRaspiRover.g:5377:3: ruleParam
            {
             before(grammarAccess.getRoverProgramAccess().getParamsParamParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParam();

            state._fsp--;

             after(grammarAccess.getRoverProgramAccess().getParamsParamParserRuleCall_3_3_1_0()); 

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
    // $ANTLR end "rule__RoverProgram__ParamsAssignment_3_3_1"


    // $ANTLR start "rule__RoverProgram__BlockAssignment_4"
    // InternalRaspiRover.g:5386:1: rule__RoverProgram__BlockAssignment_4 : ( ruleRclBlock ) ;
    public final void rule__RoverProgram__BlockAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5390:1: ( ( ruleRclBlock ) )
            // InternalRaspiRover.g:5391:2: ( ruleRclBlock )
            {
            // InternalRaspiRover.g:5391:2: ( ruleRclBlock )
            // InternalRaspiRover.g:5392:3: ruleRclBlock
            {
             before(grammarAccess.getRoverProgramAccess().getBlockRclBlockParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRclBlock();

            state._fsp--;

             after(grammarAccess.getRoverProgramAccess().getBlockRclBlockParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__RoverProgram__BlockAssignment_4"


    // $ANTLR start "rule__RasPiBoard__NameAssignment_0"
    // InternalRaspiRover.g:5401:1: rule__RasPiBoard__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__RasPiBoard__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5405:1: ( ( RULE_ID ) )
            // InternalRaspiRover.g:5406:2: ( RULE_ID )
            {
            // InternalRaspiRover.g:5406:2: ( RULE_ID )
            // InternalRaspiRover.g:5407:3: RULE_ID
            {
             before(grammarAccess.getRasPiBoardAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRasPiBoardAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__RasPiBoard__NameAssignment_0"


    // $ANTLR start "rule__RasPiBoard__DigitalPinsAssignment_2"
    // InternalRaspiRover.g:5416:1: rule__RasPiBoard__DigitalPinsAssignment_2 : ( ruleDigitalPin ) ;
    public final void rule__RasPiBoard__DigitalPinsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5420:1: ( ( ruleDigitalPin ) )
            // InternalRaspiRover.g:5421:2: ( ruleDigitalPin )
            {
            // InternalRaspiRover.g:5421:2: ( ruleDigitalPin )
            // InternalRaspiRover.g:5422:3: ruleDigitalPin
            {
             before(grammarAccess.getRasPiBoardAccess().getDigitalPinsDigitalPinParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDigitalPin();

            state._fsp--;

             after(grammarAccess.getRasPiBoardAccess().getDigitalPinsDigitalPinParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__RasPiBoard__DigitalPinsAssignment_2"


    // $ANTLR start "rule__RasPiBoard__AnalogPinsAssignment_3"
    // InternalRaspiRover.g:5431:1: rule__RasPiBoard__AnalogPinsAssignment_3 : ( ruleAnalogPin ) ;
    public final void rule__RasPiBoard__AnalogPinsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5435:1: ( ( ruleAnalogPin ) )
            // InternalRaspiRover.g:5436:2: ( ruleAnalogPin )
            {
            // InternalRaspiRover.g:5436:2: ( ruleAnalogPin )
            // InternalRaspiRover.g:5437:3: ruleAnalogPin
            {
             before(grammarAccess.getRasPiBoardAccess().getAnalogPinsAnalogPinParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAnalogPin();

            state._fsp--;

             after(grammarAccess.getRasPiBoardAccess().getAnalogPinsAnalogPinParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__RasPiBoard__AnalogPinsAssignment_3"


    // $ANTLR start "rule__DigitalPin__NameAssignment_1"
    // InternalRaspiRover.g:5446:1: rule__DigitalPin__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DigitalPin__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5450:1: ( ( RULE_ID ) )
            // InternalRaspiRover.g:5451:2: ( RULE_ID )
            {
            // InternalRaspiRover.g:5451:2: ( RULE_ID )
            // InternalRaspiRover.g:5452:3: RULE_ID
            {
             before(grammarAccess.getDigitalPinAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDigitalPinAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__DigitalPin__NameAssignment_1"


    // $ANTLR start "rule__AnalogPin__NameAssignment_1"
    // InternalRaspiRover.g:5461:1: rule__AnalogPin__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AnalogPin__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5465:1: ( ( RULE_ID ) )
            // InternalRaspiRover.g:5466:2: ( RULE_ID )
            {
            // InternalRaspiRover.g:5466:2: ( RULE_ID )
            // InternalRaspiRover.g:5467:3: RULE_ID
            {
             before(grammarAccess.getAnalogPinAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAnalogPinAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__AnalogPin__NameAssignment_1"


    // $ANTLR start "rule__Param__NameAssignment"
    // InternalRaspiRover.g:5476:1: rule__Param__NameAssignment : ( RULE_ID ) ;
    public final void rule__Param__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5480:1: ( ( RULE_ID ) )
            // InternalRaspiRover.g:5481:2: ( RULE_ID )
            {
            // InternalRaspiRover.g:5481:2: ( RULE_ID )
            // InternalRaspiRover.g:5482:3: RULE_ID
            {
             before(grammarAccess.getParamAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParamAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Param__NameAssignment"


    // $ANTLR start "rule__RclBlock__StmtsAssignment_1"
    // InternalRaspiRover.g:5491:1: rule__RclBlock__StmtsAssignment_1 : ( ruleStatement ) ;
    public final void rule__RclBlock__StmtsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5495:1: ( ( ruleStatement ) )
            // InternalRaspiRover.g:5496:2: ( ruleStatement )
            {
            // InternalRaspiRover.g:5496:2: ( ruleStatement )
            // InternalRaspiRover.g:5497:3: ruleStatement
            {
             before(grammarAccess.getRclBlockAccess().getStmtsStatementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getRclBlockAccess().getStmtsStatementParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__RclBlock__StmtsAssignment_1"


    // $ANTLR start "rule__VarAssignment__NameAssignment_1"
    // InternalRaspiRover.g:5506:1: rule__VarAssignment__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VarAssignment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5510:1: ( ( RULE_ID ) )
            // InternalRaspiRover.g:5511:2: ( RULE_ID )
            {
            // InternalRaspiRover.g:5511:2: ( RULE_ID )
            // InternalRaspiRover.g:5512:3: RULE_ID
            {
             before(grammarAccess.getVarAssignmentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVarAssignmentAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__VarAssignment__NameAssignment_1"


    // $ANTLR start "rule__VarAssignment__ValueAssignment_3"
    // InternalRaspiRover.g:5521:1: rule__VarAssignment__ValueAssignment_3 : ( ruleRoverValue ) ;
    public final void rule__VarAssignment__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5525:1: ( ( ruleRoverValue ) )
            // InternalRaspiRover.g:5526:2: ( ruleRoverValue )
            {
            // InternalRaspiRover.g:5526:2: ( ruleRoverValue )
            // InternalRaspiRover.g:5527:3: ruleRoverValue
            {
             before(grammarAccess.getVarAssignmentAccess().getValueRoverValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRoverValue();

            state._fsp--;

             after(grammarAccess.getVarAssignmentAccess().getValueRoverValueParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__VarAssignment__ValueAssignment_3"


    // $ANTLR start "rule__Conditional__ExprAssignment_2"
    // InternalRaspiRover.g:5536:1: rule__Conditional__ExprAssignment_2 : ( ruleRoverExpression ) ;
    public final void rule__Conditional__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5540:1: ( ( ruleRoverExpression ) )
            // InternalRaspiRover.g:5541:2: ( ruleRoverExpression )
            {
            // InternalRaspiRover.g:5541:2: ( ruleRoverExpression )
            // InternalRaspiRover.g:5542:3: ruleRoverExpression
            {
             before(grammarAccess.getConditionalAccess().getExprRoverExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRoverExpression();

            state._fsp--;

             after(grammarAccess.getConditionalAccess().getExprRoverExpressionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Conditional__ExprAssignment_2"


    // $ANTLR start "rule__Conditional__CondTrueAssignment_4"
    // InternalRaspiRover.g:5551:1: rule__Conditional__CondTrueAssignment_4 : ( ruleRclBlock ) ;
    public final void rule__Conditional__CondTrueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5555:1: ( ( ruleRclBlock ) )
            // InternalRaspiRover.g:5556:2: ( ruleRclBlock )
            {
            // InternalRaspiRover.g:5556:2: ( ruleRclBlock )
            // InternalRaspiRover.g:5557:3: ruleRclBlock
            {
             before(grammarAccess.getConditionalAccess().getCondTrueRclBlockParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRclBlock();

            state._fsp--;

             after(grammarAccess.getConditionalAccess().getCondTrueRclBlockParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Conditional__CondTrueAssignment_4"


    // $ANTLR start "rule__Conditional__CondFalseAssignment_6"
    // InternalRaspiRover.g:5566:1: rule__Conditional__CondFalseAssignment_6 : ( ruleRclBlock ) ;
    public final void rule__Conditional__CondFalseAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5570:1: ( ( ruleRclBlock ) )
            // InternalRaspiRover.g:5571:2: ( ruleRclBlock )
            {
            // InternalRaspiRover.g:5571:2: ( ruleRclBlock )
            // InternalRaspiRover.g:5572:3: ruleRclBlock
            {
             before(grammarAccess.getConditionalAccess().getCondFalseRclBlockParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleRclBlock();

            state._fsp--;

             after(grammarAccess.getConditionalAccess().getCondFalseRclBlockParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Conditional__CondFalseAssignment_6"


    // $ANTLR start "rule__Loop__ExprAssignment_2"
    // InternalRaspiRover.g:5581:1: rule__Loop__ExprAssignment_2 : ( ruleRoverExpression ) ;
    public final void rule__Loop__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5585:1: ( ( ruleRoverExpression ) )
            // InternalRaspiRover.g:5586:2: ( ruleRoverExpression )
            {
            // InternalRaspiRover.g:5586:2: ( ruleRoverExpression )
            // InternalRaspiRover.g:5587:3: ruleRoverExpression
            {
             before(grammarAccess.getLoopAccess().getExprRoverExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRoverExpression();

            state._fsp--;

             after(grammarAccess.getLoopAccess().getExprRoverExpressionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Loop__ExprAssignment_2"


    // $ANTLR start "rule__Loop__BlockAssignment_5"
    // InternalRaspiRover.g:5596:1: rule__Loop__BlockAssignment_5 : ( ruleRclBlock ) ;
    public final void rule__Loop__BlockAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5600:1: ( ( ruleRclBlock ) )
            // InternalRaspiRover.g:5601:2: ( ruleRclBlock )
            {
            // InternalRaspiRover.g:5601:2: ( ruleRclBlock )
            // InternalRaspiRover.g:5602:3: ruleRclBlock
            {
             before(grammarAccess.getLoopAccess().getBlockRclBlockParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleRclBlock();

            state._fsp--;

             after(grammarAccess.getLoopAccess().getBlockRclBlockParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Loop__BlockAssignment_5"


    // $ANTLR start "rule__ForwardMinAction__DistanceAssignment_2"
    // InternalRaspiRover.g:5611:1: rule__ForwardMinAction__DistanceAssignment_2 : ( ruleNumberValue ) ;
    public final void rule__ForwardMinAction__DistanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5615:1: ( ( ruleNumberValue ) )
            // InternalRaspiRover.g:5616:2: ( ruleNumberValue )
            {
            // InternalRaspiRover.g:5616:2: ( ruleNumberValue )
            // InternalRaspiRover.g:5617:3: ruleNumberValue
            {
             before(grammarAccess.getForwardMinActionAccess().getDistanceNumberValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNumberValue();

            state._fsp--;

             after(grammarAccess.getForwardMinActionAccess().getDistanceNumberValueParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ForwardMinAction__DistanceAssignment_2"


    // $ANTLR start "rule__BackwardMinAction__DistanceAssignment_2"
    // InternalRaspiRover.g:5626:1: rule__BackwardMinAction__DistanceAssignment_2 : ( ruleNumberValue ) ;
    public final void rule__BackwardMinAction__DistanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5630:1: ( ( ruleNumberValue ) )
            // InternalRaspiRover.g:5631:2: ( ruleNumberValue )
            {
            // InternalRaspiRover.g:5631:2: ( ruleNumberValue )
            // InternalRaspiRover.g:5632:3: ruleNumberValue
            {
             before(grammarAccess.getBackwardMinActionAccess().getDistanceNumberValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNumberValue();

            state._fsp--;

             after(grammarAccess.getBackwardMinActionAccess().getDistanceNumberValueParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__BackwardMinAction__DistanceAssignment_2"


    // $ANTLR start "rule__TurnDegAction__DegreesAssignment_2"
    // InternalRaspiRover.g:5641:1: rule__TurnDegAction__DegreesAssignment_2 : ( ruleNumberValue ) ;
    public final void rule__TurnDegAction__DegreesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5645:1: ( ( ruleNumberValue ) )
            // InternalRaspiRover.g:5646:2: ( ruleNumberValue )
            {
            // InternalRaspiRover.g:5646:2: ( ruleNumberValue )
            // InternalRaspiRover.g:5647:3: ruleNumberValue
            {
             before(grammarAccess.getTurnDegActionAccess().getDegreesNumberValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNumberValue();

            state._fsp--;

             after(grammarAccess.getTurnDegActionAccess().getDegreesNumberValueParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__TurnDegAction__DegreesAssignment_2"


    // $ANTLR start "rule__LogAction__MessageAssignment_2"
    // InternalRaspiRover.g:5656:1: rule__LogAction__MessageAssignment_2 : ( RULE_STRING ) ;
    public final void rule__LogAction__MessageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5660:1: ( ( RULE_STRING ) )
            // InternalRaspiRover.g:5661:2: ( RULE_STRING )
            {
            // InternalRaspiRover.g:5661:2: ( RULE_STRING )
            // InternalRaspiRover.g:5662:3: RULE_STRING
            {
             before(grammarAccess.getLogActionAccess().getMessageSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLogActionAccess().getMessageSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__LogAction__MessageAssignment_2"


    // $ANTLR start "rule__SendAction__MessageAssignment_2"
    // InternalRaspiRover.g:5671:1: rule__SendAction__MessageAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SendAction__MessageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5675:1: ( ( RULE_STRING ) )
            // InternalRaspiRover.g:5676:2: ( RULE_STRING )
            {
            // InternalRaspiRover.g:5676:2: ( RULE_STRING )
            // InternalRaspiRover.g:5677:3: RULE_STRING
            {
             before(grammarAccess.getSendActionAccess().getMessageSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSendActionAccess().getMessageSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__SendAction__MessageAssignment_2"


    // $ANTLR start "rule__VarRef__NameAssignment"
    // InternalRaspiRover.g:5686:1: rule__VarRef__NameAssignment : ( RULE_ID ) ;
    public final void rule__VarRef__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5690:1: ( ( RULE_ID ) )
            // InternalRaspiRover.g:5691:2: ( RULE_ID )
            {
            // InternalRaspiRover.g:5691:2: ( RULE_ID )
            // InternalRaspiRover.g:5692:3: RULE_ID
            {
             before(grammarAccess.getVarRefAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVarRefAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__VarRef__NameAssignment"


    // $ANTLR start "rule__ObstacleQuery__FrontAssignment_2"
    // InternalRaspiRover.g:5701:1: rule__ObstacleQuery__FrontAssignment_2 : ( ( 'front' ) ) ;
    public final void rule__ObstacleQuery__FrontAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5705:1: ( ( ( 'front' ) ) )
            // InternalRaspiRover.g:5706:2: ( ( 'front' ) )
            {
            // InternalRaspiRover.g:5706:2: ( ( 'front' ) )
            // InternalRaspiRover.g:5707:3: ( 'front' )
            {
             before(grammarAccess.getObstacleQueryAccess().getFrontFrontKeyword_2_0()); 
            // InternalRaspiRover.g:5708:3: ( 'front' )
            // InternalRaspiRover.g:5709:4: 'front'
            {
             before(grammarAccess.getObstacleQueryAccess().getFrontFrontKeyword_2_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getObstacleQueryAccess().getFrontFrontKeyword_2_0()); 

            }

             after(grammarAccess.getObstacleQueryAccess().getFrontFrontKeyword_2_0()); 

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
    // $ANTLR end "rule__ObstacleQuery__FrontAssignment_2"


    // $ANTLR start "rule__NumberValue_Impl__QuantityAssignment_1"
    // InternalRaspiRover.g:5720:1: rule__NumberValue_Impl__QuantityAssignment_1 : ( ruleQuantity ) ;
    public final void rule__NumberValue_Impl__QuantityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5724:1: ( ( ruleQuantity ) )
            // InternalRaspiRover.g:5725:2: ( ruleQuantity )
            {
            // InternalRaspiRover.g:5725:2: ( ruleQuantity )
            // InternalRaspiRover.g:5726:3: ruleQuantity
            {
             before(grammarAccess.getNumberValue_ImplAccess().getQuantityQuantityParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQuantity();

            state._fsp--;

             after(grammarAccess.getNumberValue_ImplAccess().getQuantityQuantityParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__NumberValue_Impl__QuantityAssignment_1"


    // $ANTLR start "rule__Quantity__ValueAssignment_1"
    // InternalRaspiRover.g:5735:1: rule__Quantity__ValueAssignment_1 : ( RULE_DOUBLE ) ;
    public final void rule__Quantity__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5739:1: ( ( RULE_DOUBLE ) )
            // InternalRaspiRover.g:5740:2: ( RULE_DOUBLE )
            {
            // InternalRaspiRover.g:5740:2: ( RULE_DOUBLE )
            // InternalRaspiRover.g:5741:3: RULE_DOUBLE
            {
             before(grammarAccess.getQuantityAccess().getValueDOUBLETerminalRuleCall_1_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getQuantityAccess().getValueDOUBLETerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Quantity__ValueAssignment_1"


    // $ANTLR start "rule__Quantity__UnitAssignment_2"
    // InternalRaspiRover.g:5750:1: rule__Quantity__UnitAssignment_2 : ( ruleUnit ) ;
    public final void rule__Quantity__UnitAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5754:1: ( ( ruleUnit ) )
            // InternalRaspiRover.g:5755:2: ( ruleUnit )
            {
            // InternalRaspiRover.g:5755:2: ( ruleUnit )
            // InternalRaspiRover.g:5756:3: ruleUnit
            {
             before(grammarAccess.getQuantityAccess().getUnitUnitParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnit();

            state._fsp--;

             after(grammarAccess.getQuantityAccess().getUnitUnitParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Quantity__UnitAssignment_2"


    // $ANTLR start "rule__StringValue_Impl__SValueAssignment_1"
    // InternalRaspiRover.g:5765:1: rule__StringValue_Impl__SValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__StringValue_Impl__SValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5769:1: ( ( RULE_STRING ) )
            // InternalRaspiRover.g:5770:2: ( RULE_STRING )
            {
            // InternalRaspiRover.g:5770:2: ( RULE_STRING )
            // InternalRaspiRover.g:5771:3: RULE_STRING
            {
             before(grammarAccess.getStringValue_ImplAccess().getSValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringValue_ImplAccess().getSValueSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__StringValue_Impl__SValueAssignment_1"


    // $ANTLR start "rule__BooleanValue_Impl__BValueAssignment_1"
    // InternalRaspiRover.g:5780:1: rule__BooleanValue_Impl__BValueAssignment_1 : ( ( 'true' ) ) ;
    public final void rule__BooleanValue_Impl__BValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5784:1: ( ( ( 'true' ) ) )
            // InternalRaspiRover.g:5785:2: ( ( 'true' ) )
            {
            // InternalRaspiRover.g:5785:2: ( ( 'true' ) )
            // InternalRaspiRover.g:5786:3: ( 'true' )
            {
             before(grammarAccess.getBooleanValue_ImplAccess().getBValueTrueKeyword_1_0()); 
            // InternalRaspiRover.g:5787:3: ( 'true' )
            // InternalRaspiRover.g:5788:4: 'true'
            {
             before(grammarAccess.getBooleanValue_ImplAccess().getBValueTrueKeyword_1_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getBooleanValue_ImplAccess().getBValueTrueKeyword_1_0()); 

            }

             after(grammarAccess.getBooleanValue_ImplAccess().getBValueTrueKeyword_1_0()); 

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
    // $ANTLR end "rule__BooleanValue_Impl__BValueAssignment_1"


    // $ANTLR start "rule__NumericExpression__LhsAssignment_1"
    // InternalRaspiRover.g:5799:1: rule__NumericExpression__LhsAssignment_1 : ( ruleNumberValue ) ;
    public final void rule__NumericExpression__LhsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5803:1: ( ( ruleNumberValue ) )
            // InternalRaspiRover.g:5804:2: ( ruleNumberValue )
            {
            // InternalRaspiRover.g:5804:2: ( ruleNumberValue )
            // InternalRaspiRover.g:5805:3: ruleNumberValue
            {
             before(grammarAccess.getNumericExpressionAccess().getLhsNumberValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNumberValue();

            state._fsp--;

             after(grammarAccess.getNumericExpressionAccess().getLhsNumberValueParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__NumericExpression__LhsAssignment_1"


    // $ANTLR start "rule__NumericExpression__OpAssignment_2"
    // InternalRaspiRover.g:5814:1: rule__NumericExpression__OpAssignment_2 : ( ruleNumericOperator ) ;
    public final void rule__NumericExpression__OpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5818:1: ( ( ruleNumericOperator ) )
            // InternalRaspiRover.g:5819:2: ( ruleNumericOperator )
            {
            // InternalRaspiRover.g:5819:2: ( ruleNumericOperator )
            // InternalRaspiRover.g:5820:3: ruleNumericOperator
            {
             before(grammarAccess.getNumericExpressionAccess().getOpNumericOperatorEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNumericOperator();

            state._fsp--;

             after(grammarAccess.getNumericExpressionAccess().getOpNumericOperatorEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__NumericExpression__OpAssignment_2"


    // $ANTLR start "rule__NumericExpression__RhsAssignment_3"
    // InternalRaspiRover.g:5829:1: rule__NumericExpression__RhsAssignment_3 : ( ruleNumberValue ) ;
    public final void rule__NumericExpression__RhsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5833:1: ( ( ruleNumberValue ) )
            // InternalRaspiRover.g:5834:2: ( ruleNumberValue )
            {
            // InternalRaspiRover.g:5834:2: ( ruleNumberValue )
            // InternalRaspiRover.g:5835:3: ruleNumberValue
            {
             before(grammarAccess.getNumericExpressionAccess().getRhsNumberValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleNumberValue();

            state._fsp--;

             after(grammarAccess.getNumericExpressionAccess().getRhsNumberValueParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__NumericExpression__RhsAssignment_3"


    // $ANTLR start "rule__StringExpression__LhsAssignment_1"
    // InternalRaspiRover.g:5844:1: rule__StringExpression__LhsAssignment_1 : ( ruleStringValue ) ;
    public final void rule__StringExpression__LhsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5848:1: ( ( ruleStringValue ) )
            // InternalRaspiRover.g:5849:2: ( ruleStringValue )
            {
            // InternalRaspiRover.g:5849:2: ( ruleStringValue )
            // InternalRaspiRover.g:5850:3: ruleStringValue
            {
             before(grammarAccess.getStringExpressionAccess().getLhsStringValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getStringExpressionAccess().getLhsStringValueParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__StringExpression__LhsAssignment_1"


    // $ANTLR start "rule__StringExpression__OpAssignment_2"
    // InternalRaspiRover.g:5859:1: rule__StringExpression__OpAssignment_2 : ( ruleStringOperator ) ;
    public final void rule__StringExpression__OpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5863:1: ( ( ruleStringOperator ) )
            // InternalRaspiRover.g:5864:2: ( ruleStringOperator )
            {
            // InternalRaspiRover.g:5864:2: ( ruleStringOperator )
            // InternalRaspiRover.g:5865:3: ruleStringOperator
            {
             before(grammarAccess.getStringExpressionAccess().getOpStringOperatorEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStringOperator();

            state._fsp--;

             after(grammarAccess.getStringExpressionAccess().getOpStringOperatorEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__StringExpression__OpAssignment_2"


    // $ANTLR start "rule__StringExpression__RhsAssignment_3"
    // InternalRaspiRover.g:5874:1: rule__StringExpression__RhsAssignment_3 : ( ruleStringValue ) ;
    public final void rule__StringExpression__RhsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5878:1: ( ( ruleStringValue ) )
            // InternalRaspiRover.g:5879:2: ( ruleStringValue )
            {
            // InternalRaspiRover.g:5879:2: ( ruleStringValue )
            // InternalRaspiRover.g:5880:3: ruleStringValue
            {
             before(grammarAccess.getStringExpressionAccess().getRhsStringValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getStringExpressionAccess().getRhsStringValueParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__StringExpression__RhsAssignment_3"


    // $ANTLR start "rule__BooleanExpression__LhsAssignment_1"
    // InternalRaspiRover.g:5889:1: rule__BooleanExpression__LhsAssignment_1 : ( ruleBooleanValue ) ;
    public final void rule__BooleanExpression__LhsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5893:1: ( ( ruleBooleanValue ) )
            // InternalRaspiRover.g:5894:2: ( ruleBooleanValue )
            {
            // InternalRaspiRover.g:5894:2: ( ruleBooleanValue )
            // InternalRaspiRover.g:5895:3: ruleBooleanValue
            {
             before(grammarAccess.getBooleanExpressionAccess().getLhsBooleanValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBooleanValue();

            state._fsp--;

             after(grammarAccess.getBooleanExpressionAccess().getLhsBooleanValueParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__BooleanExpression__LhsAssignment_1"


    // $ANTLR start "rule__BooleanExpression__OpAssignment_2"
    // InternalRaspiRover.g:5904:1: rule__BooleanExpression__OpAssignment_2 : ( ruleBooleanOperator ) ;
    public final void rule__BooleanExpression__OpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5908:1: ( ( ruleBooleanOperator ) )
            // InternalRaspiRover.g:5909:2: ( ruleBooleanOperator )
            {
            // InternalRaspiRover.g:5909:2: ( ruleBooleanOperator )
            // InternalRaspiRover.g:5910:3: ruleBooleanOperator
            {
             before(grammarAccess.getBooleanExpressionAccess().getOpBooleanOperatorEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBooleanOperator();

            state._fsp--;

             after(grammarAccess.getBooleanExpressionAccess().getOpBooleanOperatorEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__BooleanExpression__OpAssignment_2"


    // $ANTLR start "rule__BooleanExpression__RhsAssignment_3"
    // InternalRaspiRover.g:5919:1: rule__BooleanExpression__RhsAssignment_3 : ( ruleBooleanValue ) ;
    public final void rule__BooleanExpression__RhsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5923:1: ( ( ruleBooleanValue ) )
            // InternalRaspiRover.g:5924:2: ( ruleBooleanValue )
            {
            // InternalRaspiRover.g:5924:2: ( ruleBooleanValue )
            // InternalRaspiRover.g:5925:3: ruleBooleanValue
            {
             before(grammarAccess.getBooleanExpressionAccess().getRhsBooleanValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBooleanValue();

            state._fsp--;

             after(grammarAccess.getBooleanExpressionAccess().getRhsBooleanValueParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__BooleanExpression__RhsAssignment_3"


    // $ANTLR start "rule__Pin_Impl__NameAssignment_1"
    // InternalRaspiRover.g:5934:1: rule__Pin_Impl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Pin_Impl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5938:1: ( ( RULE_ID ) )
            // InternalRaspiRover.g:5939:2: ( RULE_ID )
            {
            // InternalRaspiRover.g:5939:2: ( RULE_ID )
            // InternalRaspiRover.g:5940:3: RULE_ID
            {
             before(grammarAccess.getPin_ImplAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPin_ImplAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Pin_Impl__NameAssignment_1"


    // $ANTLR start "rule__Pin_Impl__LevelAssignment_2_1"
    // InternalRaspiRover.g:5949:1: rule__Pin_Impl__LevelAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__Pin_Impl__LevelAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRaspiRover.g:5953:1: ( ( RULE_INT ) )
            // InternalRaspiRover.g:5954:2: ( RULE_INT )
            {
            // InternalRaspiRover.g:5954:2: ( RULE_INT )
            // InternalRaspiRover.g:5955:3: RULE_INT
            {
             before(grammarAccess.getPin_ImplAccess().getLevelINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPin_ImplAccess().getLevelINTTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Pin_Impl__LevelAssignment_2_1"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String dfa_1s = "\23\uffff";
    static final String dfa_2s = "\5\uffff\1\14\1\20\1\22\13\uffff";
    static final String dfa_3s = "\1\4\4\uffff\3\4\13\uffff";
    static final String dfa_4s = "\1\52\4\uffff\3\54\13\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\3\1\4\3\uffff\1\13\1\14\1\15\1\16\2\5\1\6\1\10\1\7\1\12\1\11";
    static final String dfa_6s = "\23\uffff}>";
    static final String[] dfa_7s = {
            "\1\13\17\uffff\1\4\11\uffff\1\1\1\uffff\1\2\3\uffff\1\3\1\5\1\6\1\7\1\10\1\11\1\12",
            "",
            "",
            "",
            "",
            "\1\15\1\uffff\1\16\15\uffff\1\14\1\15\10\uffff\1\14\1\uffff\1\14\3\uffff\7\14\2\16",
            "\1\20\1\uffff\1\17\15\uffff\2\20\10\uffff\1\20\1\uffff\1\20\3\uffff\7\20\2\17",
            "\1\22\1\uffff\1\21\15\uffff\2\22\10\uffff\1\22\1\uffff\1\22\3\uffff\7\22\2\21",
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

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1350:1: rule__Statement__Alternatives : ( ( ruleVarAssignment ) | ( ruleConditional ) | ( ruleLoop ) | ( ruleRclBlock ) | ( ruleForwardAction ) | ( ruleForwardMinAction ) | ( ruleBackwardAction ) | ( ruleBackwardMinAction ) | ( ruleTurnAction ) | ( ruleTurnDegAction ) | ( ruleStopAction ) | ( ruleLogAction ) | ( ruleSendAction ) | ( ruleVarRef ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000007F144100010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000007F144100012L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x08007FF144100070L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00001FF144100050L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0400800000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x01FF008000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x000000000003F000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x000027F144100030L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000080L});

}