package pimar.editor.textual.xgcore.parser.antlr.internal; 

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
import pimar.editor.textual.xgcore.services.XgcoreGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXgcoreParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "','", "'PageAndSettingContainer'", "'{'", "'nsURI'", "'nsPrefix'", "'styleSettings'", "'}'", "'menues'", "'pages'", "'menuablePages'", "'listablePages'", "'selectablePages'", "'withStyle'", "'rgbColors'", "'fontColor'", "'backColor'", "'PageSettings'", "'('", "')'", "'EditPage'", "'ListPage'", "'ViewPage'", "'CustomPage'", "'LoginPage'", "'ProcessSelectorPage'", "'multiSelection'", "'SelectableListPage'", "'MapPage'", "'MediaPage'", "'ELearningPage'", "'TakePicturePage'", "'RecordAudioPage'", "'ARPage'", "'separatorShow'", "'ListSettings'", "'SelectionSettings'", "'fixedMenu'", "'MenuSettings'", "'='", "'@'", "'-'", "'GRID'", "'LIST'", "'TILE'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
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
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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


        public InternalXgcoreParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXgcoreParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXgcoreParser.tokenNames; }
    public String getGrammarFileName() { return "../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g"; }



     	private XgcoreGrammarAccess grammarAccess;
     	
        public InternalXgcoreParser(TokenStream input, XgcoreGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "PageContainer";	
       	}
       	
       	@Override
       	protected XgcoreGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRulePageContainer"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:68:1: entryRulePageContainer returns [EObject current=null] : iv_rulePageContainer= rulePageContainer EOF ;
    public final EObject entryRulePageContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageContainer = null;


        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:69:2: (iv_rulePageContainer= rulePageContainer EOF )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:70:2: iv_rulePageContainer= rulePageContainer EOF
            {
             newCompositeNode(grammarAccess.getPageContainerRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePageContainer_in_entryRulePageContainer75);
            iv_rulePageContainer=rulePageContainer();

            state._fsp--;

             current =iv_rulePageContainer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePageContainer85); 

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
    // $ANTLR end "entryRulePageContainer"


    // $ANTLR start "rulePageContainer"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:77:1: rulePageContainer returns [EObject current=null] : ( () ( ( (lv_eAnnotations_1_0= ruleEAnnotation ) ) (otherlv_2= ',' ( (lv_eAnnotations_3_0= ruleEAnnotation ) ) )* )? otherlv_4= 'PageAndSettingContainer' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' (otherlv_7= 'nsURI' ( (lv_nsURI_8_0= ruleEString ) ) )? (otherlv_9= 'nsPrefix' ( (lv_nsPrefix_10_0= ruleEString ) ) )? (otherlv_11= 'styleSettings' otherlv_12= '{' ( (lv_styleSettings_13_0= ruleStyleSetting ) ) (otherlv_14= ',' ( (lv_styleSettings_15_0= ruleStyleSetting ) ) )* otherlv_16= '}' )? (otherlv_17= 'menues' otherlv_18= '{' ( (lv_menues_19_0= ruleMenu ) ) (otherlv_20= ',' ( (lv_menues_21_0= ruleMenu ) ) )* otherlv_22= '}' )? (otherlv_23= 'pages' otherlv_24= '{' ( (lv_pages_25_0= rulePage ) ) (otherlv_26= ',' ( (lv_pages_27_0= rulePage ) ) )* otherlv_28= '}' )? (otherlv_29= 'menuablePages' otherlv_30= '{' ( (lv_menuablePages_31_0= ruleMenuablePage ) ) (otherlv_32= ',' ( (lv_menuablePages_33_0= ruleMenuablePage ) ) )* otherlv_34= '}' )? (otherlv_35= 'listablePages' otherlv_36= '{' ( (lv_listablePages_37_0= ruleListablePage ) ) (otherlv_38= ',' ( (lv_listablePages_39_0= ruleListablePage ) ) )* otherlv_40= '}' )? (otherlv_41= 'selectablePages' otherlv_42= '{' ( (lv_selectablePages_43_0= ruleSelectablePage ) ) (otherlv_44= ',' ( (lv_selectablePages_45_0= ruleSelectablePage ) ) )* otherlv_46= '}' )? otherlv_47= '}' ) ;
    public final EObject rulePageContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_44=null;
        Token otherlv_46=null;
        Token otherlv_47=null;
        EObject lv_eAnnotations_1_0 = null;

        EObject lv_eAnnotations_3_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        AntlrDatatypeRuleToken lv_nsURI_8_0 = null;

        AntlrDatatypeRuleToken lv_nsPrefix_10_0 = null;

        EObject lv_styleSettings_13_0 = null;

        EObject lv_styleSettings_15_0 = null;

        EObject lv_menues_19_0 = null;

        EObject lv_menues_21_0 = null;

        EObject lv_pages_25_0 = null;

        EObject lv_pages_27_0 = null;

        EObject lv_menuablePages_31_0 = null;

        EObject lv_menuablePages_33_0 = null;

        EObject lv_listablePages_37_0 = null;

        EObject lv_listablePages_39_0 = null;

        EObject lv_selectablePages_43_0 = null;

        EObject lv_selectablePages_45_0 = null;


         enterRule(); 
            
        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:80:28: ( ( () ( ( (lv_eAnnotations_1_0= ruleEAnnotation ) ) (otherlv_2= ',' ( (lv_eAnnotations_3_0= ruleEAnnotation ) ) )* )? otherlv_4= 'PageAndSettingContainer' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' (otherlv_7= 'nsURI' ( (lv_nsURI_8_0= ruleEString ) ) )? (otherlv_9= 'nsPrefix' ( (lv_nsPrefix_10_0= ruleEString ) ) )? (otherlv_11= 'styleSettings' otherlv_12= '{' ( (lv_styleSettings_13_0= ruleStyleSetting ) ) (otherlv_14= ',' ( (lv_styleSettings_15_0= ruleStyleSetting ) ) )* otherlv_16= '}' )? (otherlv_17= 'menues' otherlv_18= '{' ( (lv_menues_19_0= ruleMenu ) ) (otherlv_20= ',' ( (lv_menues_21_0= ruleMenu ) ) )* otherlv_22= '}' )? (otherlv_23= 'pages' otherlv_24= '{' ( (lv_pages_25_0= rulePage ) ) (otherlv_26= ',' ( (lv_pages_27_0= rulePage ) ) )* otherlv_28= '}' )? (otherlv_29= 'menuablePages' otherlv_30= '{' ( (lv_menuablePages_31_0= ruleMenuablePage ) ) (otherlv_32= ',' ( (lv_menuablePages_33_0= ruleMenuablePage ) ) )* otherlv_34= '}' )? (otherlv_35= 'listablePages' otherlv_36= '{' ( (lv_listablePages_37_0= ruleListablePage ) ) (otherlv_38= ',' ( (lv_listablePages_39_0= ruleListablePage ) ) )* otherlv_40= '}' )? (otherlv_41= 'selectablePages' otherlv_42= '{' ( (lv_selectablePages_43_0= ruleSelectablePage ) ) (otherlv_44= ',' ( (lv_selectablePages_45_0= ruleSelectablePage ) ) )* otherlv_46= '}' )? otherlv_47= '}' ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:81:1: ( () ( ( (lv_eAnnotations_1_0= ruleEAnnotation ) ) (otherlv_2= ',' ( (lv_eAnnotations_3_0= ruleEAnnotation ) ) )* )? otherlv_4= 'PageAndSettingContainer' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' (otherlv_7= 'nsURI' ( (lv_nsURI_8_0= ruleEString ) ) )? (otherlv_9= 'nsPrefix' ( (lv_nsPrefix_10_0= ruleEString ) ) )? (otherlv_11= 'styleSettings' otherlv_12= '{' ( (lv_styleSettings_13_0= ruleStyleSetting ) ) (otherlv_14= ',' ( (lv_styleSettings_15_0= ruleStyleSetting ) ) )* otherlv_16= '}' )? (otherlv_17= 'menues' otherlv_18= '{' ( (lv_menues_19_0= ruleMenu ) ) (otherlv_20= ',' ( (lv_menues_21_0= ruleMenu ) ) )* otherlv_22= '}' )? (otherlv_23= 'pages' otherlv_24= '{' ( (lv_pages_25_0= rulePage ) ) (otherlv_26= ',' ( (lv_pages_27_0= rulePage ) ) )* otherlv_28= '}' )? (otherlv_29= 'menuablePages' otherlv_30= '{' ( (lv_menuablePages_31_0= ruleMenuablePage ) ) (otherlv_32= ',' ( (lv_menuablePages_33_0= ruleMenuablePage ) ) )* otherlv_34= '}' )? (otherlv_35= 'listablePages' otherlv_36= '{' ( (lv_listablePages_37_0= ruleListablePage ) ) (otherlv_38= ',' ( (lv_listablePages_39_0= ruleListablePage ) ) )* otherlv_40= '}' )? (otherlv_41= 'selectablePages' otherlv_42= '{' ( (lv_selectablePages_43_0= ruleSelectablePage ) ) (otherlv_44= ',' ( (lv_selectablePages_45_0= ruleSelectablePage ) ) )* otherlv_46= '}' )? otherlv_47= '}' )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:81:1: ( () ( ( (lv_eAnnotations_1_0= ruleEAnnotation ) ) (otherlv_2= ',' ( (lv_eAnnotations_3_0= ruleEAnnotation ) ) )* )? otherlv_4= 'PageAndSettingContainer' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' (otherlv_7= 'nsURI' ( (lv_nsURI_8_0= ruleEString ) ) )? (otherlv_9= 'nsPrefix' ( (lv_nsPrefix_10_0= ruleEString ) ) )? (otherlv_11= 'styleSettings' otherlv_12= '{' ( (lv_styleSettings_13_0= ruleStyleSetting ) ) (otherlv_14= ',' ( (lv_styleSettings_15_0= ruleStyleSetting ) ) )* otherlv_16= '}' )? (otherlv_17= 'menues' otherlv_18= '{' ( (lv_menues_19_0= ruleMenu ) ) (otherlv_20= ',' ( (lv_menues_21_0= ruleMenu ) ) )* otherlv_22= '}' )? (otherlv_23= 'pages' otherlv_24= '{' ( (lv_pages_25_0= rulePage ) ) (otherlv_26= ',' ( (lv_pages_27_0= rulePage ) ) )* otherlv_28= '}' )? (otherlv_29= 'menuablePages' otherlv_30= '{' ( (lv_menuablePages_31_0= ruleMenuablePage ) ) (otherlv_32= ',' ( (lv_menuablePages_33_0= ruleMenuablePage ) ) )* otherlv_34= '}' )? (otherlv_35= 'listablePages' otherlv_36= '{' ( (lv_listablePages_37_0= ruleListablePage ) ) (otherlv_38= ',' ( (lv_listablePages_39_0= ruleListablePage ) ) )* otherlv_40= '}' )? (otherlv_41= 'selectablePages' otherlv_42= '{' ( (lv_selectablePages_43_0= ruleSelectablePage ) ) (otherlv_44= ',' ( (lv_selectablePages_45_0= ruleSelectablePage ) ) )* otherlv_46= '}' )? otherlv_47= '}' )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:81:2: () ( ( (lv_eAnnotations_1_0= ruleEAnnotation ) ) (otherlv_2= ',' ( (lv_eAnnotations_3_0= ruleEAnnotation ) ) )* )? otherlv_4= 'PageAndSettingContainer' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' (otherlv_7= 'nsURI' ( (lv_nsURI_8_0= ruleEString ) ) )? (otherlv_9= 'nsPrefix' ( (lv_nsPrefix_10_0= ruleEString ) ) )? (otherlv_11= 'styleSettings' otherlv_12= '{' ( (lv_styleSettings_13_0= ruleStyleSetting ) ) (otherlv_14= ',' ( (lv_styleSettings_15_0= ruleStyleSetting ) ) )* otherlv_16= '}' )? (otherlv_17= 'menues' otherlv_18= '{' ( (lv_menues_19_0= ruleMenu ) ) (otherlv_20= ',' ( (lv_menues_21_0= ruleMenu ) ) )* otherlv_22= '}' )? (otherlv_23= 'pages' otherlv_24= '{' ( (lv_pages_25_0= rulePage ) ) (otherlv_26= ',' ( (lv_pages_27_0= rulePage ) ) )* otherlv_28= '}' )? (otherlv_29= 'menuablePages' otherlv_30= '{' ( (lv_menuablePages_31_0= ruleMenuablePage ) ) (otherlv_32= ',' ( (lv_menuablePages_33_0= ruleMenuablePage ) ) )* otherlv_34= '}' )? (otherlv_35= 'listablePages' otherlv_36= '{' ( (lv_listablePages_37_0= ruleListablePage ) ) (otherlv_38= ',' ( (lv_listablePages_39_0= ruleListablePage ) ) )* otherlv_40= '}' )? (otherlv_41= 'selectablePages' otherlv_42= '{' ( (lv_selectablePages_43_0= ruleSelectablePage ) ) (otherlv_44= ',' ( (lv_selectablePages_45_0= ruleSelectablePage ) ) )* otherlv_46= '}' )? otherlv_47= '}'
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:81:2: ()
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPageContainerAccess().getPageContainerAction_0(),
                        current);
                

            }

            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:87:2: ( ( (lv_eAnnotations_1_0= ruleEAnnotation ) ) (otherlv_2= ',' ( (lv_eAnnotations_3_0= ruleEAnnotation ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==50) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:87:3: ( (lv_eAnnotations_1_0= ruleEAnnotation ) ) (otherlv_2= ',' ( (lv_eAnnotations_3_0= ruleEAnnotation ) ) )*
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:87:3: ( (lv_eAnnotations_1_0= ruleEAnnotation ) )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:88:1: (lv_eAnnotations_1_0= ruleEAnnotation )
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:88:1: (lv_eAnnotations_1_0= ruleEAnnotation )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:89:3: lv_eAnnotations_1_0= ruleEAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getPageContainerAccess().getEAnnotationsEAnnotationParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_rulePageContainer141);
                    lv_eAnnotations_1_0=ruleEAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPageContainerRule());
                    	        }
                           		add(
                           			current, 
                           			"eAnnotations",
                            		lv_eAnnotations_1_0, 
                            		"EAnnotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:105:2: (otherlv_2= ',' ( (lv_eAnnotations_3_0= ruleEAnnotation ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==11) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:105:4: otherlv_2= ',' ( (lv_eAnnotations_3_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_rulePageContainer154); 

                    	        	newLeafNode(otherlv_2, grammarAccess.getPageContainerAccess().getCommaKeyword_1_1_0());
                    	        
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:109:1: ( (lv_eAnnotations_3_0= ruleEAnnotation ) )
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:110:1: (lv_eAnnotations_3_0= ruleEAnnotation )
                    	    {
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:110:1: (lv_eAnnotations_3_0= ruleEAnnotation )
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:111:3: lv_eAnnotations_3_0= ruleEAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPageContainerAccess().getEAnnotationsEAnnotationParserRuleCall_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_rulePageContainer175);
                    	    lv_eAnnotations_3_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPageContainerRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"eAnnotations",
                    	            		lv_eAnnotations_3_0, 
                    	            		"EAnnotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePageContainer191); 

                	newLeafNode(otherlv_4, grammarAccess.getPageContainerAccess().getPageAndSettingContainerKeyword_2());
                
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:131:1: ( (lv_name_5_0= ruleEString ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:132:1: (lv_name_5_0= ruleEString )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:132:1: (lv_name_5_0= ruleEString )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:133:3: lv_name_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getPageContainerAccess().getNameEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePageContainer212);
            lv_name_5_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPageContainerRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_5_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulePageContainer224); 

                	newLeafNode(otherlv_6, grammarAccess.getPageContainerAccess().getLeftCurlyBracketKeyword_4());
                
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:153:1: (otherlv_7= 'nsURI' ( (lv_nsURI_8_0= ruleEString ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:153:3: otherlv_7= 'nsURI' ( (lv_nsURI_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulePageContainer237); 

                        	newLeafNode(otherlv_7, grammarAccess.getPageContainerAccess().getNsURIKeyword_5_0());
                        
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:157:1: ( (lv_nsURI_8_0= ruleEString ) )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:158:1: (lv_nsURI_8_0= ruleEString )
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:158:1: (lv_nsURI_8_0= ruleEString )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:159:3: lv_nsURI_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPageContainerAccess().getNsURIEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePageContainer258);
                    lv_nsURI_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPageContainerRule());
                    	        }
                           		set(
                           			current, 
                           			"nsURI",
                            		lv_nsURI_8_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:175:4: (otherlv_9= 'nsPrefix' ( (lv_nsPrefix_10_0= ruleEString ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:175:6: otherlv_9= 'nsPrefix' ( (lv_nsPrefix_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePageContainer273); 

                        	newLeafNode(otherlv_9, grammarAccess.getPageContainerAccess().getNsPrefixKeyword_6_0());
                        
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:179:1: ( (lv_nsPrefix_10_0= ruleEString ) )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:180:1: (lv_nsPrefix_10_0= ruleEString )
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:180:1: (lv_nsPrefix_10_0= ruleEString )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:181:3: lv_nsPrefix_10_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPageContainerAccess().getNsPrefixEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePageContainer294);
                    lv_nsPrefix_10_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPageContainerRule());
                    	        }
                           		set(
                           			current, 
                           			"nsPrefix",
                            		lv_nsPrefix_10_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:197:4: (otherlv_11= 'styleSettings' otherlv_12= '{' ( (lv_styleSettings_13_0= ruleStyleSetting ) ) (otherlv_14= ',' ( (lv_styleSettings_15_0= ruleStyleSetting ) ) )* otherlv_16= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:197:6: otherlv_11= 'styleSettings' otherlv_12= '{' ( (lv_styleSettings_13_0= ruleStyleSetting ) ) (otherlv_14= ',' ( (lv_styleSettings_15_0= ruleStyleSetting ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulePageContainer309); 

                        	newLeafNode(otherlv_11, grammarAccess.getPageContainerAccess().getStyleSettingsKeyword_7_0());
                        
                    otherlv_12=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulePageContainer321); 

                        	newLeafNode(otherlv_12, grammarAccess.getPageContainerAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:205:1: ( (lv_styleSettings_13_0= ruleStyleSetting ) )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:206:1: (lv_styleSettings_13_0= ruleStyleSetting )
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:206:1: (lv_styleSettings_13_0= ruleStyleSetting )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:207:3: lv_styleSettings_13_0= ruleStyleSetting
                    {
                     
                    	        newCompositeNode(grammarAccess.getPageContainerAccess().getStyleSettingsStyleSettingParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStyleSetting_in_rulePageContainer342);
                    lv_styleSettings_13_0=ruleStyleSetting();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPageContainerRule());
                    	        }
                           		add(
                           			current, 
                           			"styleSettings",
                            		lv_styleSettings_13_0, 
                            		"StyleSetting");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:223:2: (otherlv_14= ',' ( (lv_styleSettings_15_0= ruleStyleSetting ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==11) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:223:4: otherlv_14= ',' ( (lv_styleSettings_15_0= ruleStyleSetting ) )
                    	    {
                    	    otherlv_14=(Token)match(input,11,FollowSets000.FOLLOW_11_in_rulePageContainer355); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getPageContainerAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:227:1: ( (lv_styleSettings_15_0= ruleStyleSetting ) )
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:228:1: (lv_styleSettings_15_0= ruleStyleSetting )
                    	    {
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:228:1: (lv_styleSettings_15_0= ruleStyleSetting )
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:229:3: lv_styleSettings_15_0= ruleStyleSetting
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPageContainerAccess().getStyleSettingsStyleSettingParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleStyleSetting_in_rulePageContainer376);
                    	    lv_styleSettings_15_0=ruleStyleSetting();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPageContainerRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"styleSettings",
                    	            		lv_styleSettings_15_0, 
                    	            		"StyleSetting");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulePageContainer390); 

                        	newLeafNode(otherlv_16, grammarAccess.getPageContainerAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:249:3: (otherlv_17= 'menues' otherlv_18= '{' ( (lv_menues_19_0= ruleMenu ) ) (otherlv_20= ',' ( (lv_menues_21_0= ruleMenu ) ) )* otherlv_22= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:249:5: otherlv_17= 'menues' otherlv_18= '{' ( (lv_menues_19_0= ruleMenu ) ) (otherlv_20= ',' ( (lv_menues_21_0= ruleMenu ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,18,FollowSets000.FOLLOW_18_in_rulePageContainer405); 

                        	newLeafNode(otherlv_17, grammarAccess.getPageContainerAccess().getMenuesKeyword_8_0());
                        
                    otherlv_18=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulePageContainer417); 

                        	newLeafNode(otherlv_18, grammarAccess.getPageContainerAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:257:1: ( (lv_menues_19_0= ruleMenu ) )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:258:1: (lv_menues_19_0= ruleMenu )
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:258:1: (lv_menues_19_0= ruleMenu )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:259:3: lv_menues_19_0= ruleMenu
                    {
                     
                    	        newCompositeNode(grammarAccess.getPageContainerAccess().getMenuesMenuParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleMenu_in_rulePageContainer438);
                    lv_menues_19_0=ruleMenu();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPageContainerRule());
                    	        }
                           		add(
                           			current, 
                           			"menues",
                            		lv_menues_19_0, 
                            		"Menu");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:275:2: (otherlv_20= ',' ( (lv_menues_21_0= ruleMenu ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==11) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:275:4: otherlv_20= ',' ( (lv_menues_21_0= ruleMenu ) )
                    	    {
                    	    otherlv_20=(Token)match(input,11,FollowSets000.FOLLOW_11_in_rulePageContainer451); 

                    	        	newLeafNode(otherlv_20, grammarAccess.getPageContainerAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:279:1: ( (lv_menues_21_0= ruleMenu ) )
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:280:1: (lv_menues_21_0= ruleMenu )
                    	    {
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:280:1: (lv_menues_21_0= ruleMenu )
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:281:3: lv_menues_21_0= ruleMenu
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPageContainerAccess().getMenuesMenuParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleMenu_in_rulePageContainer472);
                    	    lv_menues_21_0=ruleMenu();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPageContainerRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"menues",
                    	            		lv_menues_21_0, 
                    	            		"Menu");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulePageContainer486); 

                        	newLeafNode(otherlv_22, grammarAccess.getPageContainerAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:301:3: (otherlv_23= 'pages' otherlv_24= '{' ( (lv_pages_25_0= rulePage ) ) (otherlv_26= ',' ( (lv_pages_27_0= rulePage ) ) )* otherlv_28= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:301:5: otherlv_23= 'pages' otherlv_24= '{' ( (lv_pages_25_0= rulePage ) ) (otherlv_26= ',' ( (lv_pages_27_0= rulePage ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,19,FollowSets000.FOLLOW_19_in_rulePageContainer501); 

                        	newLeafNode(otherlv_23, grammarAccess.getPageContainerAccess().getPagesKeyword_9_0());
                        
                    otherlv_24=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulePageContainer513); 

                        	newLeafNode(otherlv_24, grammarAccess.getPageContainerAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:309:1: ( (lv_pages_25_0= rulePage ) )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:310:1: (lv_pages_25_0= rulePage )
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:310:1: (lv_pages_25_0= rulePage )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:311:3: lv_pages_25_0= rulePage
                    {
                     
                    	        newCompositeNode(grammarAccess.getPageContainerAccess().getPagesPageParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePage_in_rulePageContainer534);
                    lv_pages_25_0=rulePage();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPageContainerRule());
                    	        }
                           		add(
                           			current, 
                           			"pages",
                            		lv_pages_25_0, 
                            		"Page");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:327:2: (otherlv_26= ',' ( (lv_pages_27_0= rulePage ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==11) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:327:4: otherlv_26= ',' ( (lv_pages_27_0= rulePage ) )
                    	    {
                    	    otherlv_26=(Token)match(input,11,FollowSets000.FOLLOW_11_in_rulePageContainer547); 

                    	        	newLeafNode(otherlv_26, grammarAccess.getPageContainerAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:331:1: ( (lv_pages_27_0= rulePage ) )
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:332:1: (lv_pages_27_0= rulePage )
                    	    {
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:332:1: (lv_pages_27_0= rulePage )
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:333:3: lv_pages_27_0= rulePage
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPageContainerAccess().getPagesPageParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_rulePage_in_rulePageContainer568);
                    	    lv_pages_27_0=rulePage();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPageContainerRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"pages",
                    	            		lv_pages_27_0, 
                    	            		"Page");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulePageContainer582); 

                        	newLeafNode(otherlv_28, grammarAccess.getPageContainerAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:353:3: (otherlv_29= 'menuablePages' otherlv_30= '{' ( (lv_menuablePages_31_0= ruleMenuablePage ) ) (otherlv_32= ',' ( (lv_menuablePages_33_0= ruleMenuablePage ) ) )* otherlv_34= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:353:5: otherlv_29= 'menuablePages' otherlv_30= '{' ( (lv_menuablePages_31_0= ruleMenuablePage ) ) (otherlv_32= ',' ( (lv_menuablePages_33_0= ruleMenuablePage ) ) )* otherlv_34= '}'
                    {
                    otherlv_29=(Token)match(input,20,FollowSets000.FOLLOW_20_in_rulePageContainer597); 

                        	newLeafNode(otherlv_29, grammarAccess.getPageContainerAccess().getMenuablePagesKeyword_10_0());
                        
                    otherlv_30=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulePageContainer609); 

                        	newLeafNode(otherlv_30, grammarAccess.getPageContainerAccess().getLeftCurlyBracketKeyword_10_1());
                        
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:361:1: ( (lv_menuablePages_31_0= ruleMenuablePage ) )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:362:1: (lv_menuablePages_31_0= ruleMenuablePage )
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:362:1: (lv_menuablePages_31_0= ruleMenuablePage )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:363:3: lv_menuablePages_31_0= ruleMenuablePage
                    {
                     
                    	        newCompositeNode(grammarAccess.getPageContainerAccess().getMenuablePagesMenuablePageParserRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleMenuablePage_in_rulePageContainer630);
                    lv_menuablePages_31_0=ruleMenuablePage();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPageContainerRule());
                    	        }
                           		add(
                           			current, 
                           			"menuablePages",
                            		lv_menuablePages_31_0, 
                            		"MenuablePage");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:379:2: (otherlv_32= ',' ( (lv_menuablePages_33_0= ruleMenuablePage ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==11) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:379:4: otherlv_32= ',' ( (lv_menuablePages_33_0= ruleMenuablePage ) )
                    	    {
                    	    otherlv_32=(Token)match(input,11,FollowSets000.FOLLOW_11_in_rulePageContainer643); 

                    	        	newLeafNode(otherlv_32, grammarAccess.getPageContainerAccess().getCommaKeyword_10_3_0());
                    	        
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:383:1: ( (lv_menuablePages_33_0= ruleMenuablePage ) )
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:384:1: (lv_menuablePages_33_0= ruleMenuablePage )
                    	    {
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:384:1: (lv_menuablePages_33_0= ruleMenuablePage )
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:385:3: lv_menuablePages_33_0= ruleMenuablePage
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPageContainerAccess().getMenuablePagesMenuablePageParserRuleCall_10_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleMenuablePage_in_rulePageContainer664);
                    	    lv_menuablePages_33_0=ruleMenuablePage();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPageContainerRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"menuablePages",
                    	            		lv_menuablePages_33_0, 
                    	            		"MenuablePage");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_34=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulePageContainer678); 

                        	newLeafNode(otherlv_34, grammarAccess.getPageContainerAccess().getRightCurlyBracketKeyword_10_4());
                        

                    }
                    break;

            }

            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:405:3: (otherlv_35= 'listablePages' otherlv_36= '{' ( (lv_listablePages_37_0= ruleListablePage ) ) (otherlv_38= ',' ( (lv_listablePages_39_0= ruleListablePage ) ) )* otherlv_40= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:405:5: otherlv_35= 'listablePages' otherlv_36= '{' ( (lv_listablePages_37_0= ruleListablePage ) ) (otherlv_38= ',' ( (lv_listablePages_39_0= ruleListablePage ) ) )* otherlv_40= '}'
                    {
                    otherlv_35=(Token)match(input,21,FollowSets000.FOLLOW_21_in_rulePageContainer693); 

                        	newLeafNode(otherlv_35, grammarAccess.getPageContainerAccess().getListablePagesKeyword_11_0());
                        
                    otherlv_36=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulePageContainer705); 

                        	newLeafNode(otherlv_36, grammarAccess.getPageContainerAccess().getLeftCurlyBracketKeyword_11_1());
                        
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:413:1: ( (lv_listablePages_37_0= ruleListablePage ) )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:414:1: (lv_listablePages_37_0= ruleListablePage )
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:414:1: (lv_listablePages_37_0= ruleListablePage )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:415:3: lv_listablePages_37_0= ruleListablePage
                    {
                     
                    	        newCompositeNode(grammarAccess.getPageContainerAccess().getListablePagesListablePageParserRuleCall_11_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleListablePage_in_rulePageContainer726);
                    lv_listablePages_37_0=ruleListablePage();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPageContainerRule());
                    	        }
                           		add(
                           			current, 
                           			"listablePages",
                            		lv_listablePages_37_0, 
                            		"ListablePage");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:431:2: (otherlv_38= ',' ( (lv_listablePages_39_0= ruleListablePage ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==11) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:431:4: otherlv_38= ',' ( (lv_listablePages_39_0= ruleListablePage ) )
                    	    {
                    	    otherlv_38=(Token)match(input,11,FollowSets000.FOLLOW_11_in_rulePageContainer739); 

                    	        	newLeafNode(otherlv_38, grammarAccess.getPageContainerAccess().getCommaKeyword_11_3_0());
                    	        
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:435:1: ( (lv_listablePages_39_0= ruleListablePage ) )
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:436:1: (lv_listablePages_39_0= ruleListablePage )
                    	    {
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:436:1: (lv_listablePages_39_0= ruleListablePage )
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:437:3: lv_listablePages_39_0= ruleListablePage
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPageContainerAccess().getListablePagesListablePageParserRuleCall_11_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleListablePage_in_rulePageContainer760);
                    	    lv_listablePages_39_0=ruleListablePage();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPageContainerRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"listablePages",
                    	            		lv_listablePages_39_0, 
                    	            		"ListablePage");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_40=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulePageContainer774); 

                        	newLeafNode(otherlv_40, grammarAccess.getPageContainerAccess().getRightCurlyBracketKeyword_11_4());
                        

                    }
                    break;

            }

            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:457:3: (otherlv_41= 'selectablePages' otherlv_42= '{' ( (lv_selectablePages_43_0= ruleSelectablePage ) ) (otherlv_44= ',' ( (lv_selectablePages_45_0= ruleSelectablePage ) ) )* otherlv_46= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:457:5: otherlv_41= 'selectablePages' otherlv_42= '{' ( (lv_selectablePages_43_0= ruleSelectablePage ) ) (otherlv_44= ',' ( (lv_selectablePages_45_0= ruleSelectablePage ) ) )* otherlv_46= '}'
                    {
                    otherlv_41=(Token)match(input,22,FollowSets000.FOLLOW_22_in_rulePageContainer789); 

                        	newLeafNode(otherlv_41, grammarAccess.getPageContainerAccess().getSelectablePagesKeyword_12_0());
                        
                    otherlv_42=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulePageContainer801); 

                        	newLeafNode(otherlv_42, grammarAccess.getPageContainerAccess().getLeftCurlyBracketKeyword_12_1());
                        
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:465:1: ( (lv_selectablePages_43_0= ruleSelectablePage ) )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:466:1: (lv_selectablePages_43_0= ruleSelectablePage )
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:466:1: (lv_selectablePages_43_0= ruleSelectablePage )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:467:3: lv_selectablePages_43_0= ruleSelectablePage
                    {
                     
                    	        newCompositeNode(grammarAccess.getPageContainerAccess().getSelectablePagesSelectablePageParserRuleCall_12_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSelectablePage_in_rulePageContainer822);
                    lv_selectablePages_43_0=ruleSelectablePage();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPageContainerRule());
                    	        }
                           		add(
                           			current, 
                           			"selectablePages",
                            		lv_selectablePages_43_0, 
                            		"SelectablePage");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:483:2: (otherlv_44= ',' ( (lv_selectablePages_45_0= ruleSelectablePage ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==11) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:483:4: otherlv_44= ',' ( (lv_selectablePages_45_0= ruleSelectablePage ) )
                    	    {
                    	    otherlv_44=(Token)match(input,11,FollowSets000.FOLLOW_11_in_rulePageContainer835); 

                    	        	newLeafNode(otherlv_44, grammarAccess.getPageContainerAccess().getCommaKeyword_12_3_0());
                    	        
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:487:1: ( (lv_selectablePages_45_0= ruleSelectablePage ) )
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:488:1: (lv_selectablePages_45_0= ruleSelectablePage )
                    	    {
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:488:1: (lv_selectablePages_45_0= ruleSelectablePage )
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:489:3: lv_selectablePages_45_0= ruleSelectablePage
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPageContainerAccess().getSelectablePagesSelectablePageParserRuleCall_12_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSelectablePage_in_rulePageContainer856);
                    	    lv_selectablePages_45_0=ruleSelectablePage();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPageContainerRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"selectablePages",
                    	            		lv_selectablePages_45_0, 
                    	            		"SelectablePage");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_46=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulePageContainer870); 

                        	newLeafNode(otherlv_46, grammarAccess.getPageContainerAccess().getRightCurlyBracketKeyword_12_4());
                        

                    }
                    break;

            }

            otherlv_47=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulePageContainer884); 

                	newLeafNode(otherlv_47, grammarAccess.getPageContainerAccess().getRightCurlyBracketKeyword_13());
                

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
    // $ANTLR end "rulePageContainer"


    // $ANTLR start "entryRulePage"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:521:1: entryRulePage returns [EObject current=null] : iv_rulePage= rulePage EOF ;
    public final EObject entryRulePage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePage = null;


        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:522:2: (iv_rulePage= rulePage EOF )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:523:2: iv_rulePage= rulePage EOF
            {
             newCompositeNode(grammarAccess.getPageRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePage_in_entryRulePage920);
            iv_rulePage=rulePage();

            state._fsp--;

             current =iv_rulePage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePage930); 

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
    // $ANTLR end "entryRulePage"


    // $ANTLR start "rulePage"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:530:1: rulePage returns [EObject current=null] : (this_EditPage_0= ruleEditPage | this_ListPage_1= ruleListPage | this_ViewPage_2= ruleViewPage | this_CustomPage_3= ruleCustomPage | this_LoginPage_4= ruleLoginPage | this_ProcessSelectorPage_5= ruleProcessSelectorPage | this_SelectableListPage_6= ruleSelectableListPage | this_MapPage_7= ruleMapPage | this_MediaPage_8= ruleMediaPage | this_ELearningPage_9= ruleELearningPage | this_TakePicturePage_10= ruleTakePicturePage | this_RecordAudioPage_11= ruleRecordAudioPage | this_ARPage_12= ruleARPage ) ;
    public final EObject rulePage() throws RecognitionException {
        EObject current = null;

        EObject this_EditPage_0 = null;

        EObject this_ListPage_1 = null;

        EObject this_ViewPage_2 = null;

        EObject this_CustomPage_3 = null;

        EObject this_LoginPage_4 = null;

        EObject this_ProcessSelectorPage_5 = null;

        EObject this_SelectableListPage_6 = null;

        EObject this_MapPage_7 = null;

        EObject this_MediaPage_8 = null;

        EObject this_ELearningPage_9 = null;

        EObject this_TakePicturePage_10 = null;

        EObject this_RecordAudioPage_11 = null;

        EObject this_ARPage_12 = null;


         enterRule(); 
            
        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:533:28: ( (this_EditPage_0= ruleEditPage | this_ListPage_1= ruleListPage | this_ViewPage_2= ruleViewPage | this_CustomPage_3= ruleCustomPage | this_LoginPage_4= ruleLoginPage | this_ProcessSelectorPage_5= ruleProcessSelectorPage | this_SelectableListPage_6= ruleSelectableListPage | this_MapPage_7= ruleMapPage | this_MediaPage_8= ruleMediaPage | this_ELearningPage_9= ruleELearningPage | this_TakePicturePage_10= ruleTakePicturePage | this_RecordAudioPage_11= ruleRecordAudioPage | this_ARPage_12= ruleARPage ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:534:1: (this_EditPage_0= ruleEditPage | this_ListPage_1= ruleListPage | this_ViewPage_2= ruleViewPage | this_CustomPage_3= ruleCustomPage | this_LoginPage_4= ruleLoginPage | this_ProcessSelectorPage_5= ruleProcessSelectorPage | this_SelectableListPage_6= ruleSelectableListPage | this_MapPage_7= ruleMapPage | this_MediaPage_8= ruleMediaPage | this_ELearningPage_9= ruleELearningPage | this_TakePicturePage_10= ruleTakePicturePage | this_RecordAudioPage_11= ruleRecordAudioPage | this_ARPage_12= ruleARPage )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:534:1: (this_EditPage_0= ruleEditPage | this_ListPage_1= ruleListPage | this_ViewPage_2= ruleViewPage | this_CustomPage_3= ruleCustomPage | this_LoginPage_4= ruleLoginPage | this_ProcessSelectorPage_5= ruleProcessSelectorPage | this_SelectableListPage_6= ruleSelectableListPage | this_MapPage_7= ruleMapPage | this_MediaPage_8= ruleMediaPage | this_ELearningPage_9= ruleELearningPage | this_TakePicturePage_10= ruleTakePicturePage | this_RecordAudioPage_11= ruleRecordAudioPage | this_ARPage_12= ruleARPage )
            int alt17=13;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:535:5: this_EditPage_0= ruleEditPage
                    {
                     
                            newCompositeNode(grammarAccess.getPageAccess().getEditPageParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEditPage_in_rulePage977);
                    this_EditPage_0=ruleEditPage();

                    state._fsp--;

                     
                            current = this_EditPage_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:545:5: this_ListPage_1= ruleListPage
                    {
                     
                            newCompositeNode(grammarAccess.getPageAccess().getListPageParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleListPage_in_rulePage1004);
                    this_ListPage_1=ruleListPage();

                    state._fsp--;

                     
                            current = this_ListPage_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:555:5: this_ViewPage_2= ruleViewPage
                    {
                     
                            newCompositeNode(grammarAccess.getPageAccess().getViewPageParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleViewPage_in_rulePage1031);
                    this_ViewPage_2=ruleViewPage();

                    state._fsp--;

                     
                            current = this_ViewPage_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:565:5: this_CustomPage_3= ruleCustomPage
                    {
                     
                            newCompositeNode(grammarAccess.getPageAccess().getCustomPageParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCustomPage_in_rulePage1058);
                    this_CustomPage_3=ruleCustomPage();

                    state._fsp--;

                     
                            current = this_CustomPage_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:575:5: this_LoginPage_4= ruleLoginPage
                    {
                     
                            newCompositeNode(grammarAccess.getPageAccess().getLoginPageParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLoginPage_in_rulePage1085);
                    this_LoginPage_4=ruleLoginPage();

                    state._fsp--;

                     
                            current = this_LoginPage_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:585:5: this_ProcessSelectorPage_5= ruleProcessSelectorPage
                    {
                     
                            newCompositeNode(grammarAccess.getPageAccess().getProcessSelectorPageParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleProcessSelectorPage_in_rulePage1112);
                    this_ProcessSelectorPage_5=ruleProcessSelectorPage();

                    state._fsp--;

                     
                            current = this_ProcessSelectorPage_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:595:5: this_SelectableListPage_6= ruleSelectableListPage
                    {
                     
                            newCompositeNode(grammarAccess.getPageAccess().getSelectableListPageParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSelectableListPage_in_rulePage1139);
                    this_SelectableListPage_6=ruleSelectableListPage();

                    state._fsp--;

                     
                            current = this_SelectableListPage_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:605:5: this_MapPage_7= ruleMapPage
                    {
                     
                            newCompositeNode(grammarAccess.getPageAccess().getMapPageParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMapPage_in_rulePage1166);
                    this_MapPage_7=ruleMapPage();

                    state._fsp--;

                     
                            current = this_MapPage_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:615:5: this_MediaPage_8= ruleMediaPage
                    {
                     
                            newCompositeNode(grammarAccess.getPageAccess().getMediaPageParserRuleCall_8()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMediaPage_in_rulePage1193);
                    this_MediaPage_8=ruleMediaPage();

                    state._fsp--;

                     
                            current = this_MediaPage_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:625:5: this_ELearningPage_9= ruleELearningPage
                    {
                     
                            newCompositeNode(grammarAccess.getPageAccess().getELearningPageParserRuleCall_9()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleELearningPage_in_rulePage1220);
                    this_ELearningPage_9=ruleELearningPage();

                    state._fsp--;

                     
                            current = this_ELearningPage_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:635:5: this_TakePicturePage_10= ruleTakePicturePage
                    {
                     
                            newCompositeNode(grammarAccess.getPageAccess().getTakePicturePageParserRuleCall_10()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTakePicturePage_in_rulePage1247);
                    this_TakePicturePage_10=ruleTakePicturePage();

                    state._fsp--;

                     
                            current = this_TakePicturePage_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:645:5: this_RecordAudioPage_11= ruleRecordAudioPage
                    {
                     
                            newCompositeNode(grammarAccess.getPageAccess().getRecordAudioPageParserRuleCall_11()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRecordAudioPage_in_rulePage1274);
                    this_RecordAudioPage_11=ruleRecordAudioPage();

                    state._fsp--;

                     
                            current = this_RecordAudioPage_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 13 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:655:5: this_ARPage_12= ruleARPage
                    {
                     
                            newCompositeNode(grammarAccess.getPageAccess().getARPageParserRuleCall_12()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleARPage_in_rulePage1301);
                    this_ARPage_12=ruleARPage();

                    state._fsp--;

                     
                            current = this_ARPage_12; 
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
    // $ANTLR end "rulePage"


    // $ANTLR start "entryRuleMenuablePage"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:671:1: entryRuleMenuablePage returns [EObject current=null] : iv_ruleMenuablePage= ruleMenuablePage EOF ;
    public final EObject entryRuleMenuablePage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMenuablePage = null;


        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:672:2: (iv_ruleMenuablePage= ruleMenuablePage EOF )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:673:2: iv_ruleMenuablePage= ruleMenuablePage EOF
            {
             newCompositeNode(grammarAccess.getMenuablePageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMenuablePage_in_entryRuleMenuablePage1336);
            iv_ruleMenuablePage=ruleMenuablePage();

            state._fsp--;

             current =iv_ruleMenuablePage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMenuablePage1346); 

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
    // $ANTLR end "entryRuleMenuablePage"


    // $ANTLR start "ruleMenuablePage"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:680:1: ruleMenuablePage returns [EObject current=null] : (this_ListPage_0= ruleListPage | this_ViewPage_1= ruleViewPage | this_ProcessSelectorPage_2= ruleProcessSelectorPage | this_ELearningPage_3= ruleELearningPage ) ;
    public final EObject ruleMenuablePage() throws RecognitionException {
        EObject current = null;

        EObject this_ListPage_0 = null;

        EObject this_ViewPage_1 = null;

        EObject this_ProcessSelectorPage_2 = null;

        EObject this_ELearningPage_3 = null;


         enterRule(); 
            
        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:683:28: ( (this_ListPage_0= ruleListPage | this_ViewPage_1= ruleViewPage | this_ProcessSelectorPage_2= ruleProcessSelectorPage | this_ELearningPage_3= ruleELearningPage ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:684:1: (this_ListPage_0= ruleListPage | this_ViewPage_1= ruleViewPage | this_ProcessSelectorPage_2= ruleProcessSelectorPage | this_ELearningPage_3= ruleELearningPage )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:684:1: (this_ListPage_0= ruleListPage | this_ViewPage_1= ruleViewPage | this_ProcessSelectorPage_2= ruleProcessSelectorPage | this_ELearningPage_3= ruleELearningPage )
            int alt18=4;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:685:5: this_ListPage_0= ruleListPage
                    {
                     
                            newCompositeNode(grammarAccess.getMenuablePageAccess().getListPageParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleListPage_in_ruleMenuablePage1393);
                    this_ListPage_0=ruleListPage();

                    state._fsp--;

                     
                            current = this_ListPage_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:695:5: this_ViewPage_1= ruleViewPage
                    {
                     
                            newCompositeNode(grammarAccess.getMenuablePageAccess().getViewPageParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleViewPage_in_ruleMenuablePage1420);
                    this_ViewPage_1=ruleViewPage();

                    state._fsp--;

                     
                            current = this_ViewPage_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:705:5: this_ProcessSelectorPage_2= ruleProcessSelectorPage
                    {
                     
                            newCompositeNode(grammarAccess.getMenuablePageAccess().getProcessSelectorPageParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleProcessSelectorPage_in_ruleMenuablePage1447);
                    this_ProcessSelectorPage_2=ruleProcessSelectorPage();

                    state._fsp--;

                     
                            current = this_ProcessSelectorPage_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:715:5: this_ELearningPage_3= ruleELearningPage
                    {
                     
                            newCompositeNode(grammarAccess.getMenuablePageAccess().getELearningPageParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleELearningPage_in_ruleMenuablePage1474);
                    this_ELearningPage_3=ruleELearningPage();

                    state._fsp--;

                     
                            current = this_ELearningPage_3; 
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
    // $ANTLR end "ruleMenuablePage"


    // $ANTLR start "entryRuleListablePage"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:731:1: entryRuleListablePage returns [EObject current=null] : iv_ruleListablePage= ruleListablePage EOF ;
    public final EObject entryRuleListablePage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListablePage = null;


        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:732:2: (iv_ruleListablePage= ruleListablePage EOF )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:733:2: iv_ruleListablePage= ruleListablePage EOF
            {
             newCompositeNode(grammarAccess.getListablePageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleListablePage_in_entryRuleListablePage1509);
            iv_ruleListablePage=ruleListablePage();

            state._fsp--;

             current =iv_ruleListablePage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleListablePage1519); 

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
    // $ANTLR end "entryRuleListablePage"


    // $ANTLR start "ruleListablePage"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:740:1: ruleListablePage returns [EObject current=null] : (this_ListPage_0= ruleListPage | this_SelectableListPage_1= ruleSelectableListPage ) ;
    public final EObject ruleListablePage() throws RecognitionException {
        EObject current = null;

        EObject this_ListPage_0 = null;

        EObject this_SelectableListPage_1 = null;


         enterRule(); 
            
        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:743:28: ( (this_ListPage_0= ruleListPage | this_SelectableListPage_1= ruleSelectableListPage ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:744:1: (this_ListPage_0= ruleListPage | this_SelectableListPage_1= ruleSelectableListPage )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:744:1: (this_ListPage_0= ruleListPage | this_SelectableListPage_1= ruleSelectableListPage )
            int alt19=2;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:745:5: this_ListPage_0= ruleListPage
                    {
                     
                            newCompositeNode(grammarAccess.getListablePageAccess().getListPageParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleListPage_in_ruleListablePage1566);
                    this_ListPage_0=ruleListPage();

                    state._fsp--;

                     
                            current = this_ListPage_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:755:5: this_SelectableListPage_1= ruleSelectableListPage
                    {
                     
                            newCompositeNode(grammarAccess.getListablePageAccess().getSelectableListPageParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSelectableListPage_in_ruleListablePage1593);
                    this_SelectableListPage_1=ruleSelectableListPage();

                    state._fsp--;

                     
                            current = this_SelectableListPage_1; 
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
    // $ANTLR end "ruleListablePage"


    // $ANTLR start "entryRuleSelectablePage"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:771:1: entryRuleSelectablePage returns [EObject current=null] : iv_ruleSelectablePage= ruleSelectablePage EOF ;
    public final EObject entryRuleSelectablePage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectablePage = null;


        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:772:2: (iv_ruleSelectablePage= ruleSelectablePage EOF )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:773:2: iv_ruleSelectablePage= ruleSelectablePage EOF
            {
             newCompositeNode(grammarAccess.getSelectablePageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSelectablePage_in_entryRuleSelectablePage1628);
            iv_ruleSelectablePage=ruleSelectablePage();

            state._fsp--;

             current =iv_ruleSelectablePage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSelectablePage1638); 

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
    // $ANTLR end "entryRuleSelectablePage"


    // $ANTLR start "ruleSelectablePage"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:780:1: ruleSelectablePage returns [EObject current=null] : this_SelectableListPage_0= ruleSelectableListPage ;
    public final EObject ruleSelectablePage() throws RecognitionException {
        EObject current = null;

        EObject this_SelectableListPage_0 = null;


         enterRule(); 
            
        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:783:28: (this_SelectableListPage_0= ruleSelectableListPage )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:785:5: this_SelectableListPage_0= ruleSelectableListPage
            {
             
                    newCompositeNode(grammarAccess.getSelectablePageAccess().getSelectableListPageParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleSelectableListPage_in_ruleSelectablePage1684);
            this_SelectableListPage_0=ruleSelectableListPage();

            state._fsp--;

             
                    current = this_SelectableListPage_0; 
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
    // $ANTLR end "ruleSelectablePage"


    // $ANTLR start "entryRuleMenu"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:801:1: entryRuleMenu returns [EObject current=null] : iv_ruleMenu= ruleMenu EOF ;
    public final EObject entryRuleMenu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMenu = null;


        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:802:2: (iv_ruleMenu= ruleMenu EOF )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:803:2: iv_ruleMenu= ruleMenu EOF
            {
             newCompositeNode(grammarAccess.getMenuRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMenu_in_entryRuleMenu1718);
            iv_ruleMenu=ruleMenu();

            state._fsp--;

             current =iv_ruleMenu; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMenu1728); 

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
    // $ANTLR end "entryRuleMenu"


    // $ANTLR start "ruleMenu"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:810:1: ruleMenu returns [EObject current=null] : ( ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'withStyle' ( ( ruleEString ) ) ) ;
    public final EObject ruleMenu() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_eAnnotations_0_0 = null;

        EObject lv_eAnnotations_2_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;


         enterRule(); 
            
        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:813:28: ( ( ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'withStyle' ( ( ruleEString ) ) ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:814:1: ( ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'withStyle' ( ( ruleEString ) ) )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:814:1: ( ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'withStyle' ( ( ruleEString ) ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:814:2: ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'withStyle' ( ( ruleEString ) )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:814:2: ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==50) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:814:3: ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )*
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:814:3: ( (lv_eAnnotations_0_0= ruleEAnnotation ) )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:815:1: (lv_eAnnotations_0_0= ruleEAnnotation )
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:815:1: (lv_eAnnotations_0_0= ruleEAnnotation )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:816:3: lv_eAnnotations_0_0= ruleEAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getMenuAccess().getEAnnotationsEAnnotationParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleMenu1775);
                    lv_eAnnotations_0_0=ruleEAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMenuRule());
                    	        }
                           		add(
                           			current, 
                           			"eAnnotations",
                            		lv_eAnnotations_0_0, 
                            		"EAnnotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:832:2: (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==11) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:832:4: otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleMenu1788); 

                    	        	newLeafNode(otherlv_1, grammarAccess.getMenuAccess().getCommaKeyword_0_1_0());
                    	        
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:836:1: ( (lv_eAnnotations_2_0= ruleEAnnotation ) )
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:837:1: (lv_eAnnotations_2_0= ruleEAnnotation )
                    	    {
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:837:1: (lv_eAnnotations_2_0= ruleEAnnotation )
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:838:3: lv_eAnnotations_2_0= ruleEAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMenuAccess().getEAnnotationsEAnnotationParserRuleCall_0_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleMenu1809);
                    	    lv_eAnnotations_2_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMenuRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"eAnnotations",
                    	            		lv_eAnnotations_2_0, 
                    	            		"EAnnotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:854:6: ( (lv_name_3_0= ruleEString ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:855:1: (lv_name_3_0= ruleEString )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:855:1: (lv_name_3_0= ruleEString )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:856:3: lv_name_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMenuAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMenu1834);
            lv_name_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMenuRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMenu1846); 

                	newLeafNode(otherlv_4, grammarAccess.getMenuAccess().getWithStyleKeyword_2());
                
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:876:1: ( ( ruleEString ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:877:1: ( ruleEString )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:877:1: ( ruleEString )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:878:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMenuRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getMenuAccess().getMenuStyleStyleMenuSettingsCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMenu1869);
            ruleEString();

            state._fsp--;

             
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
    // $ANTLR end "ruleMenu"


    // $ANTLR start "entryRuleStyleSetting"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:899:1: entryRuleStyleSetting returns [EObject current=null] : iv_ruleStyleSetting= ruleStyleSetting EOF ;
    public final EObject entryRuleStyleSetting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyleSetting = null;


        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:900:2: (iv_ruleStyleSetting= ruleStyleSetting EOF )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:901:2: iv_ruleStyleSetting= ruleStyleSetting EOF
            {
             newCompositeNode(grammarAccess.getStyleSettingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStyleSetting_in_entryRuleStyleSetting1905);
            iv_ruleStyleSetting=ruleStyleSetting();

            state._fsp--;

             current =iv_ruleStyleSetting; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStyleSetting1915); 

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
    // $ANTLR end "entryRuleStyleSetting"


    // $ANTLR start "ruleStyleSetting"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:908:1: ruleStyleSetting returns [EObject current=null] : ( (otherlv_0= 'rgbColors' otherlv_1= '{' ( (lv_rgbColors_2_0= ruleRGBColor ) ) (otherlv_3= ',' ( (lv_rgbColors_4_0= ruleRGBColor ) ) )* otherlv_5= '}' )? otherlv_6= 'fontColor' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'backColor' ( (otherlv_9= RULE_ID ) ) ( (lv_pageStyle_10_0= ruleStylePageSettings ) ) ( (lv_menuStyle_11_0= ruleStyleMenuSettings ) )? ( (lv_selectionStyle_12_0= ruleStyleSelectionSettings ) )? ( (lv_listStyle_13_0= ruleStyleListSettings ) )? ) ;
    public final EObject ruleStyleSetting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_rgbColors_2_0 = null;

        EObject lv_rgbColors_4_0 = null;

        EObject lv_pageStyle_10_0 = null;

        EObject lv_menuStyle_11_0 = null;

        EObject lv_selectionStyle_12_0 = null;

        EObject lv_listStyle_13_0 = null;


         enterRule(); 
            
        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:911:28: ( ( (otherlv_0= 'rgbColors' otherlv_1= '{' ( (lv_rgbColors_2_0= ruleRGBColor ) ) (otherlv_3= ',' ( (lv_rgbColors_4_0= ruleRGBColor ) ) )* otherlv_5= '}' )? otherlv_6= 'fontColor' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'backColor' ( (otherlv_9= RULE_ID ) ) ( (lv_pageStyle_10_0= ruleStylePageSettings ) ) ( (lv_menuStyle_11_0= ruleStyleMenuSettings ) )? ( (lv_selectionStyle_12_0= ruleStyleSelectionSettings ) )? ( (lv_listStyle_13_0= ruleStyleListSettings ) )? ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:912:1: ( (otherlv_0= 'rgbColors' otherlv_1= '{' ( (lv_rgbColors_2_0= ruleRGBColor ) ) (otherlv_3= ',' ( (lv_rgbColors_4_0= ruleRGBColor ) ) )* otherlv_5= '}' )? otherlv_6= 'fontColor' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'backColor' ( (otherlv_9= RULE_ID ) ) ( (lv_pageStyle_10_0= ruleStylePageSettings ) ) ( (lv_menuStyle_11_0= ruleStyleMenuSettings ) )? ( (lv_selectionStyle_12_0= ruleStyleSelectionSettings ) )? ( (lv_listStyle_13_0= ruleStyleListSettings ) )? )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:912:1: ( (otherlv_0= 'rgbColors' otherlv_1= '{' ( (lv_rgbColors_2_0= ruleRGBColor ) ) (otherlv_3= ',' ( (lv_rgbColors_4_0= ruleRGBColor ) ) )* otherlv_5= '}' )? otherlv_6= 'fontColor' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'backColor' ( (otherlv_9= RULE_ID ) ) ( (lv_pageStyle_10_0= ruleStylePageSettings ) ) ( (lv_menuStyle_11_0= ruleStyleMenuSettings ) )? ( (lv_selectionStyle_12_0= ruleStyleSelectionSettings ) )? ( (lv_listStyle_13_0= ruleStyleListSettings ) )? )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:912:2: (otherlv_0= 'rgbColors' otherlv_1= '{' ( (lv_rgbColors_2_0= ruleRGBColor ) ) (otherlv_3= ',' ( (lv_rgbColors_4_0= ruleRGBColor ) ) )* otherlv_5= '}' )? otherlv_6= 'fontColor' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'backColor' ( (otherlv_9= RULE_ID ) ) ( (lv_pageStyle_10_0= ruleStylePageSettings ) ) ( (lv_menuStyle_11_0= ruleStyleMenuSettings ) )? ( (lv_selectionStyle_12_0= ruleStyleSelectionSettings ) )? ( (lv_listStyle_13_0= ruleStyleListSettings ) )?
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:912:2: (otherlv_0= 'rgbColors' otherlv_1= '{' ( (lv_rgbColors_2_0= ruleRGBColor ) ) (otherlv_3= ',' ( (lv_rgbColors_4_0= ruleRGBColor ) ) )* otherlv_5= '}' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==24) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:912:4: otherlv_0= 'rgbColors' otherlv_1= '{' ( (lv_rgbColors_2_0= ruleRGBColor ) ) (otherlv_3= ',' ( (lv_rgbColors_4_0= ruleRGBColor ) ) )* otherlv_5= '}'
                    {
                    otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleStyleSetting1953); 

                        	newLeafNode(otherlv_0, grammarAccess.getStyleSettingAccess().getRgbColorsKeyword_0_0());
                        
                    otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleStyleSetting1965); 

                        	newLeafNode(otherlv_1, grammarAccess.getStyleSettingAccess().getLeftCurlyBracketKeyword_0_1());
                        
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:920:1: ( (lv_rgbColors_2_0= ruleRGBColor ) )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:921:1: (lv_rgbColors_2_0= ruleRGBColor )
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:921:1: (lv_rgbColors_2_0= ruleRGBColor )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:922:3: lv_rgbColors_2_0= ruleRGBColor
                    {
                     
                    	        newCompositeNode(grammarAccess.getStyleSettingAccess().getRgbColorsRGBColorParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRGBColor_in_ruleStyleSetting1986);
                    lv_rgbColors_2_0=ruleRGBColor();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStyleSettingRule());
                    	        }
                           		add(
                           			current, 
                           			"rgbColors",
                            		lv_rgbColors_2_0, 
                            		"RGBColor");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:938:2: (otherlv_3= ',' ( (lv_rgbColors_4_0= ruleRGBColor ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==11) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:938:4: otherlv_3= ',' ( (lv_rgbColors_4_0= ruleRGBColor ) )
                    	    {
                    	    otherlv_3=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleStyleSetting1999); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getStyleSettingAccess().getCommaKeyword_0_3_0());
                    	        
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:942:1: ( (lv_rgbColors_4_0= ruleRGBColor ) )
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:943:1: (lv_rgbColors_4_0= ruleRGBColor )
                    	    {
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:943:1: (lv_rgbColors_4_0= ruleRGBColor )
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:944:3: lv_rgbColors_4_0= ruleRGBColor
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStyleSettingAccess().getRgbColorsRGBColorParserRuleCall_0_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRGBColor_in_ruleStyleSetting2020);
                    	    lv_rgbColors_4_0=ruleRGBColor();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStyleSettingRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"rgbColors",
                    	            		lv_rgbColors_4_0, 
                    	            		"RGBColor");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleStyleSetting2034); 

                        	newLeafNode(otherlv_5, grammarAccess.getStyleSettingAccess().getRightCurlyBracketKeyword_0_4());
                        

                    }
                    break;

            }

            otherlv_6=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleStyleSetting2048); 

                	newLeafNode(otherlv_6, grammarAccess.getStyleSettingAccess().getFontColorKeyword_1());
                
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:968:1: ( (otherlv_7= RULE_ID ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:969:1: (otherlv_7= RULE_ID )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:969:1: (otherlv_7= RULE_ID )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:970:3: otherlv_7= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStyleSettingRule());
            	        }
                    
            otherlv_7=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleStyleSetting2068); 

            		newLeafNode(otherlv_7, grammarAccess.getStyleSettingAccess().getFontColorRGBColorCrossReference_2_0()); 
            	

            }


            }

            otherlv_8=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleStyleSetting2080); 

                	newLeafNode(otherlv_8, grammarAccess.getStyleSettingAccess().getBackColorKeyword_3());
                
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:985:1: ( (otherlv_9= RULE_ID ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:986:1: (otherlv_9= RULE_ID )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:986:1: (otherlv_9= RULE_ID )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:987:3: otherlv_9= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStyleSettingRule());
            	        }
                    
            otherlv_9=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleStyleSetting2100); 

            		newLeafNode(otherlv_9, grammarAccess.getStyleSettingAccess().getBackColorRGBColorCrossReference_4_0()); 
            	

            }


            }

            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:998:2: ( (lv_pageStyle_10_0= ruleStylePageSettings ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:999:1: (lv_pageStyle_10_0= ruleStylePageSettings )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:999:1: (lv_pageStyle_10_0= ruleStylePageSettings )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1000:3: lv_pageStyle_10_0= ruleStylePageSettings
            {
             
            	        newCompositeNode(grammarAccess.getStyleSettingAccess().getPageStyleStylePageSettingsParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleStylePageSettings_in_ruleStyleSetting2121);
            lv_pageStyle_10_0=ruleStylePageSettings();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStyleSettingRule());
            	        }
                   		set(
                   			current, 
                   			"pageStyle",
                    		lv_pageStyle_10_0, 
                    		"StylePageSettings");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1016:2: ( (lv_menuStyle_11_0= ruleStyleMenuSettings ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=47 && LA24_0<=48)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1017:1: (lv_menuStyle_11_0= ruleStyleMenuSettings )
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1017:1: (lv_menuStyle_11_0= ruleStyleMenuSettings )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1018:3: lv_menuStyle_11_0= ruleStyleMenuSettings
                    {
                     
                    	        newCompositeNode(grammarAccess.getStyleSettingAccess().getMenuStyleStyleMenuSettingsParserRuleCall_6_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStyleMenuSettings_in_ruleStyleSetting2142);
                    lv_menuStyle_11_0=ruleStyleMenuSettings();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStyleSettingRule());
                    	        }
                           		set(
                           			current, 
                           			"menuStyle",
                            		lv_menuStyle_11_0, 
                            		"StyleMenuSettings");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1034:3: ( (lv_selectionStyle_12_0= ruleStyleSelectionSettings ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==46) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1035:1: (lv_selectionStyle_12_0= ruleStyleSelectionSettings )
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1035:1: (lv_selectionStyle_12_0= ruleStyleSelectionSettings )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1036:3: lv_selectionStyle_12_0= ruleStyleSelectionSettings
                    {
                     
                    	        newCompositeNode(grammarAccess.getStyleSettingAccess().getSelectionStyleStyleSelectionSettingsParserRuleCall_7_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStyleSelectionSettings_in_ruleStyleSetting2164);
                    lv_selectionStyle_12_0=ruleStyleSelectionSettings();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStyleSettingRule());
                    	        }
                           		set(
                           			current, 
                           			"selectionStyle",
                            		lv_selectionStyle_12_0, 
                            		"StyleSelectionSettings");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1052:3: ( (lv_listStyle_13_0= ruleStyleListSettings ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=44 && LA26_0<=45)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1053:1: (lv_listStyle_13_0= ruleStyleListSettings )
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1053:1: (lv_listStyle_13_0= ruleStyleListSettings )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1054:3: lv_listStyle_13_0= ruleStyleListSettings
                    {
                     
                    	        newCompositeNode(grammarAccess.getStyleSettingAccess().getListStyleStyleListSettingsParserRuleCall_8_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStyleListSettings_in_ruleStyleSetting2186);
                    lv_listStyle_13_0=ruleStyleListSettings();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStyleSettingRule());
                    	        }
                           		set(
                           			current, 
                           			"listStyle",
                            		lv_listStyle_13_0, 
                            		"StyleListSettings");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "ruleStyleSetting"


    // $ANTLR start "entryRuleStylePageSettings"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1078:1: entryRuleStylePageSettings returns [EObject current=null] : iv_ruleStylePageSettings= ruleStylePageSettings EOF ;
    public final EObject entryRuleStylePageSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStylePageSettings = null;


        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1079:2: (iv_ruleStylePageSettings= ruleStylePageSettings EOF )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1080:2: iv_ruleStylePageSettings= ruleStylePageSettings EOF
            {
             newCompositeNode(grammarAccess.getStylePageSettingsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStylePageSettings_in_entryRuleStylePageSettings2223);
            iv_ruleStylePageSettings=ruleStylePageSettings();

            state._fsp--;

             current =iv_ruleStylePageSettings; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStylePageSettings2233); 

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
    // $ANTLR end "entryRuleStylePageSettings"


    // $ANTLR start "ruleStylePageSettings"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1087:1: ruleStylePageSettings returns [EObject current=null] : (otherlv_0= 'PageSettings' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_imagePosition_4_0= ruleEInt ) )? otherlv_5= ',' ( (lv_textPosition_6_0= ruleEInt ) )? otherlv_7= ',' ( (lv_frame_8_0= ruleEInt ) )? otherlv_9= ')' ) ;
    public final EObject ruleStylePageSettings() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_imagePosition_4_0 = null;

        AntlrDatatypeRuleToken lv_textPosition_6_0 = null;

        AntlrDatatypeRuleToken lv_frame_8_0 = null;


         enterRule(); 
            
        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1090:28: ( (otherlv_0= 'PageSettings' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_imagePosition_4_0= ruleEInt ) )? otherlv_5= ',' ( (lv_textPosition_6_0= ruleEInt ) )? otherlv_7= ',' ( (lv_frame_8_0= ruleEInt ) )? otherlv_9= ')' ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1091:1: (otherlv_0= 'PageSettings' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_imagePosition_4_0= ruleEInt ) )? otherlv_5= ',' ( (lv_textPosition_6_0= ruleEInt ) )? otherlv_7= ',' ( (lv_frame_8_0= ruleEInt ) )? otherlv_9= ')' )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1091:1: (otherlv_0= 'PageSettings' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_imagePosition_4_0= ruleEInt ) )? otherlv_5= ',' ( (lv_textPosition_6_0= ruleEInt ) )? otherlv_7= ',' ( (lv_frame_8_0= ruleEInt ) )? otherlv_9= ')' )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1091:3: otherlv_0= 'PageSettings' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_imagePosition_4_0= ruleEInt ) )? otherlv_5= ',' ( (lv_textPosition_6_0= ruleEInt ) )? otherlv_7= ',' ( (lv_frame_8_0= ruleEInt ) )? otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleStylePageSettings2270); 

                	newLeafNode(otherlv_0, grammarAccess.getStylePageSettingsAccess().getPageSettingsKeyword_0());
                
            otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleStylePageSettings2282); 

                	newLeafNode(otherlv_1, grammarAccess.getStylePageSettingsAccess().getLeftParenthesisKeyword_1());
                
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1099:1: ( (otherlv_2= RULE_ID ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1100:1: (otherlv_2= RULE_ID )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1100:1: (otherlv_2= RULE_ID )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1101:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStylePageSettingsRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleStylePageSettings2302); 

            		newLeafNode(otherlv_2, grammarAccess.getStylePageSettingsAccess().getFrameColorRGBColorCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleStylePageSettings2314); 

                	newLeafNode(otherlv_3, grammarAccess.getStylePageSettingsAccess().getCommaKeyword_3());
                
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1116:1: ( (lv_imagePosition_4_0= ruleEInt ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_INT||LA27_0==51) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1117:1: (lv_imagePosition_4_0= ruleEInt )
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1117:1: (lv_imagePosition_4_0= ruleEInt )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1118:3: lv_imagePosition_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getStylePageSettingsAccess().getImagePositionEIntParserRuleCall_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleStylePageSettings2335);
                    lv_imagePosition_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStylePageSettingsRule());
                    	        }
                           		set(
                           			current, 
                           			"imagePosition",
                            		lv_imagePosition_4_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleStylePageSettings2348); 

                	newLeafNode(otherlv_5, grammarAccess.getStylePageSettingsAccess().getCommaKeyword_5());
                
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1138:1: ( (lv_textPosition_6_0= ruleEInt ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_INT||LA28_0==51) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1139:1: (lv_textPosition_6_0= ruleEInt )
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1139:1: (lv_textPosition_6_0= ruleEInt )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1140:3: lv_textPosition_6_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getStylePageSettingsAccess().getTextPositionEIntParserRuleCall_6_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleStylePageSettings2369);
                    lv_textPosition_6_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStylePageSettingsRule());
                    	        }
                           		set(
                           			current, 
                           			"textPosition",
                            		lv_textPosition_6_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleStylePageSettings2382); 

                	newLeafNode(otherlv_7, grammarAccess.getStylePageSettingsAccess().getCommaKeyword_7());
                
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1160:1: ( (lv_frame_8_0= ruleEInt ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_INT||LA29_0==51) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1161:1: (lv_frame_8_0= ruleEInt )
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1161:1: (lv_frame_8_0= ruleEInt )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1162:3: lv_frame_8_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getStylePageSettingsAccess().getFrameEIntParserRuleCall_8_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleStylePageSettings2403);
                    lv_frame_8_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStylePageSettingsRule());
                    	        }
                           		set(
                           			current, 
                           			"frame",
                            		lv_frame_8_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleStylePageSettings2416); 

                	newLeafNode(otherlv_9, grammarAccess.getStylePageSettingsAccess().getRightParenthesisKeyword_9());
                

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
    // $ANTLR end "ruleStylePageSettings"


    // $ANTLR start "entryRuleEditPage"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1190:1: entryRuleEditPage returns [EObject current=null] : iv_ruleEditPage= ruleEditPage EOF ;
    public final EObject entryRuleEditPage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEditPage = null;


        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1191:2: (iv_ruleEditPage= ruleEditPage EOF )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1192:2: iv_ruleEditPage= ruleEditPage EOF
            {
             newCompositeNode(grammarAccess.getEditPageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEditPage_in_entryRuleEditPage2452);
            iv_ruleEditPage=ruleEditPage();

            state._fsp--;

             current =iv_ruleEditPage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEditPage2462); 

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
    // $ANTLR end "entryRuleEditPage"


    // $ANTLR start "ruleEditPage"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1199:1: ruleEditPage returns [EObject current=null] : ( ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'EditPage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) otherlv_7= ')' ) ;
    public final EObject ruleEditPage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_eAnnotations_0_0 = null;

        EObject lv_eAnnotations_2_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;


         enterRule(); 
            
        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1202:28: ( ( ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'EditPage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) otherlv_7= ')' ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1203:1: ( ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'EditPage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) otherlv_7= ')' )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1203:1: ( ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'EditPage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) otherlv_7= ')' )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1203:2: ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'EditPage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) otherlv_7= ')'
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1203:2: ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==50) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1203:3: ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )*
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1203:3: ( (lv_eAnnotations_0_0= ruleEAnnotation ) )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1204:1: (lv_eAnnotations_0_0= ruleEAnnotation )
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1204:1: (lv_eAnnotations_0_0= ruleEAnnotation )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1205:3: lv_eAnnotations_0_0= ruleEAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getEditPageAccess().getEAnnotationsEAnnotationParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEditPage2509);
                    lv_eAnnotations_0_0=ruleEAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEditPageRule());
                    	        }
                           		add(
                           			current, 
                           			"eAnnotations",
                            		lv_eAnnotations_0_0, 
                            		"EAnnotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1221:2: (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==11) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1221:4: otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleEditPage2522); 

                    	        	newLeafNode(otherlv_1, grammarAccess.getEditPageAccess().getCommaKeyword_0_1_0());
                    	        
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1225:1: ( (lv_eAnnotations_2_0= ruleEAnnotation ) )
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1226:1: (lv_eAnnotations_2_0= ruleEAnnotation )
                    	    {
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1226:1: (lv_eAnnotations_2_0= ruleEAnnotation )
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1227:3: lv_eAnnotations_2_0= ruleEAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEditPageAccess().getEAnnotationsEAnnotationParserRuleCall_0_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleEditPage2543);
                    	    lv_eAnnotations_2_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEditPageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"eAnnotations",
                    	            		lv_eAnnotations_2_0, 
                    	            		"EAnnotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleEditPage2559); 

                	newLeafNode(otherlv_3, grammarAccess.getEditPageAccess().getEditPageKeyword_1());
                
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1247:1: ( (lv_name_4_0= ruleEString ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1248:1: (lv_name_4_0= ruleEString )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1248:1: (lv_name_4_0= ruleEString )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1249:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEditPageAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEditPage2580);
            lv_name_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEditPageRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleEditPage2592); 

                	newLeafNode(otherlv_5, grammarAccess.getEditPageAccess().getLeftParenthesisKeyword_3());
                
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1269:1: ( ( ruleEString ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1270:1: ( ruleEString )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1270:1: ( ruleEString )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1271:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEditPageRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getEditPageAccess().getPageStyleStylePageSettingsCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEditPage2615);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleEditPage2627); 

                	newLeafNode(otherlv_7, grammarAccess.getEditPageAccess().getRightParenthesisKeyword_5());
                

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
    // $ANTLR end "ruleEditPage"


    // $ANTLR start "entryRuleListPage"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1296:1: entryRuleListPage returns [EObject current=null] : iv_ruleListPage= ruleListPage EOF ;
    public final EObject entryRuleListPage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListPage = null;


        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1297:2: (iv_ruleListPage= ruleListPage EOF )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1298:2: iv_ruleListPage= ruleListPage EOF
            {
             newCompositeNode(grammarAccess.getListPageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleListPage_in_entryRuleListPage2663);
            iv_ruleListPage=ruleListPage();

            state._fsp--;

             current =iv_ruleListPage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleListPage2673); 

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
    // $ANTLR end "entryRuleListPage"


    // $ANTLR start "ruleListPage"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1305:1: ruleListPage returns [EObject current=null] : ( ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'ListPage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) otherlv_7= ',' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )? otherlv_11= ')' ) ;
    public final EObject ruleListPage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_eAnnotations_0_0 = null;

        EObject lv_eAnnotations_2_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;


         enterRule(); 
            
        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1308:28: ( ( ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'ListPage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) otherlv_7= ',' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )? otherlv_11= ')' ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1309:1: ( ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'ListPage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) otherlv_7= ',' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )? otherlv_11= ')' )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1309:1: ( ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'ListPage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) otherlv_7= ',' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )? otherlv_11= ')' )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1309:2: ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'ListPage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) otherlv_7= ',' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )? otherlv_11= ')'
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1309:2: ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==50) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1309:3: ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )*
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1309:3: ( (lv_eAnnotations_0_0= ruleEAnnotation ) )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1310:1: (lv_eAnnotations_0_0= ruleEAnnotation )
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1310:1: (lv_eAnnotations_0_0= ruleEAnnotation )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1311:3: lv_eAnnotations_0_0= ruleEAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getListPageAccess().getEAnnotationsEAnnotationParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleListPage2720);
                    lv_eAnnotations_0_0=ruleEAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getListPageRule());
                    	        }
                           		add(
                           			current, 
                           			"eAnnotations",
                            		lv_eAnnotations_0_0, 
                            		"EAnnotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1327:2: (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==11) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1327:4: otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleListPage2733); 

                    	        	newLeafNode(otherlv_1, grammarAccess.getListPageAccess().getCommaKeyword_0_1_0());
                    	        
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1331:1: ( (lv_eAnnotations_2_0= ruleEAnnotation ) )
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1332:1: (lv_eAnnotations_2_0= ruleEAnnotation )
                    	    {
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1332:1: (lv_eAnnotations_2_0= ruleEAnnotation )
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1333:3: lv_eAnnotations_2_0= ruleEAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getListPageAccess().getEAnnotationsEAnnotationParserRuleCall_0_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleListPage2754);
                    	    lv_eAnnotations_2_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getListPageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"eAnnotations",
                    	            		lv_eAnnotations_2_0, 
                    	            		"EAnnotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleListPage2770); 

                	newLeafNode(otherlv_3, grammarAccess.getListPageAccess().getListPageKeyword_1());
                
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1353:1: ( (lv_name_4_0= ruleEString ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1354:1: (lv_name_4_0= ruleEString )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1354:1: (lv_name_4_0= ruleEString )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1355:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getListPageAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleListPage2791);
            lv_name_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getListPageRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleListPage2803); 

                	newLeafNode(otherlv_5, grammarAccess.getListPageAccess().getLeftParenthesisKeyword_3());
                
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1375:1: ( ( ruleEString ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1376:1: ( ruleEString )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1376:1: ( ruleEString )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1377:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getListPageRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getListPageAccess().getPageStyleStylePageSettingsCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleListPage2826);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleListPage2838); 

                	newLeafNode(otherlv_7, grammarAccess.getListPageAccess().getCommaKeyword_5());
                
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1394:1: ( ( ruleEString ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1395:1: ( ruleEString )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1395:1: ( ruleEString )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1396:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getListPageRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getListPageAccess().getListablepageStyleStyleListSettingsCrossReference_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleListPage2861);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1409:2: (otherlv_9= ',' ( ( ruleEString ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==11) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1409:4: otherlv_9= ',' ( ( ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleListPage2874); 

                        	newLeafNode(otherlv_9, grammarAccess.getListPageAccess().getCommaKeyword_7_0());
                        
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1413:1: ( ( ruleEString ) )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1414:1: ( ruleEString )
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1414:1: ( ruleEString )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1415:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getListPageRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getListPageAccess().getMenuMenuCrossReference_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleListPage2897);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleListPage2911); 

                	newLeafNode(otherlv_11, grammarAccess.getListPageAccess().getRightParenthesisKeyword_8());
                

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
    // $ANTLR end "ruleListPage"


    // $ANTLR start "entryRuleViewPage"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1440:1: entryRuleViewPage returns [EObject current=null] : iv_ruleViewPage= ruleViewPage EOF ;
    public final EObject entryRuleViewPage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewPage = null;


        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1441:2: (iv_ruleViewPage= ruleViewPage EOF )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1442:2: iv_ruleViewPage= ruleViewPage EOF
            {
             newCompositeNode(grammarAccess.getViewPageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleViewPage_in_entryRuleViewPage2947);
            iv_ruleViewPage=ruleViewPage();

            state._fsp--;

             current =iv_ruleViewPage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleViewPage2957); 

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
    // $ANTLR end "entryRuleViewPage"


    // $ANTLR start "ruleViewPage"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1449:1: ruleViewPage returns [EObject current=null] : ( ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'ViewPage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )? otherlv_9= ')' ) ;
    public final EObject ruleViewPage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_eAnnotations_0_0 = null;

        EObject lv_eAnnotations_2_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;


         enterRule(); 
            
        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1452:28: ( ( ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'ViewPage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )? otherlv_9= ')' ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1453:1: ( ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'ViewPage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )? otherlv_9= ')' )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1453:1: ( ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'ViewPage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )? otherlv_9= ')' )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1453:2: ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'ViewPage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )? otherlv_9= ')'
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1453:2: ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==50) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1453:3: ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )*
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1453:3: ( (lv_eAnnotations_0_0= ruleEAnnotation ) )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1454:1: (lv_eAnnotations_0_0= ruleEAnnotation )
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1454:1: (lv_eAnnotations_0_0= ruleEAnnotation )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1455:3: lv_eAnnotations_0_0= ruleEAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getViewPageAccess().getEAnnotationsEAnnotationParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleViewPage3004);
                    lv_eAnnotations_0_0=ruleEAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getViewPageRule());
                    	        }
                           		add(
                           			current, 
                           			"eAnnotations",
                            		lv_eAnnotations_0_0, 
                            		"EAnnotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1471:2: (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==11) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1471:4: otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleViewPage3017); 

                    	        	newLeafNode(otherlv_1, grammarAccess.getViewPageAccess().getCommaKeyword_0_1_0());
                    	        
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1475:1: ( (lv_eAnnotations_2_0= ruleEAnnotation ) )
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1476:1: (lv_eAnnotations_2_0= ruleEAnnotation )
                    	    {
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1476:1: (lv_eAnnotations_2_0= ruleEAnnotation )
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1477:3: lv_eAnnotations_2_0= ruleEAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getViewPageAccess().getEAnnotationsEAnnotationParserRuleCall_0_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleViewPage3038);
                    	    lv_eAnnotations_2_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getViewPageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"eAnnotations",
                    	            		lv_eAnnotations_2_0, 
                    	            		"EAnnotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_3=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleViewPage3054); 

                	newLeafNode(otherlv_3, grammarAccess.getViewPageAccess().getViewPageKeyword_1());
                
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1497:1: ( (lv_name_4_0= ruleEString ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1498:1: (lv_name_4_0= ruleEString )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1498:1: (lv_name_4_0= ruleEString )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1499:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getViewPageAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleViewPage3075);
            lv_name_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getViewPageRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleViewPage3087); 

                	newLeafNode(otherlv_5, grammarAccess.getViewPageAccess().getLeftParenthesisKeyword_3());
                
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1519:1: ( ( ruleEString ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1520:1: ( ruleEString )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1520:1: ( ruleEString )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1521:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getViewPageRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getViewPageAccess().getPageStyleStylePageSettingsCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleViewPage3110);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1534:2: (otherlv_7= ',' ( ( ruleEString ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==11) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1534:4: otherlv_7= ',' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleViewPage3123); 

                        	newLeafNode(otherlv_7, grammarAccess.getViewPageAccess().getCommaKeyword_5_0());
                        
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1538:1: ( ( ruleEString ) )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1539:1: ( ruleEString )
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1539:1: ( ruleEString )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1540:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getViewPageRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getViewPageAccess().getMenuMenuCrossReference_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleViewPage3146);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleViewPage3160); 

                	newLeafNode(otherlv_9, grammarAccess.getViewPageAccess().getRightParenthesisKeyword_6());
                

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
    // $ANTLR end "ruleViewPage"


    // $ANTLR start "entryRuleCustomPage"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1565:1: entryRuleCustomPage returns [EObject current=null] : iv_ruleCustomPage= ruleCustomPage EOF ;
    public final EObject entryRuleCustomPage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomPage = null;


        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1566:2: (iv_ruleCustomPage= ruleCustomPage EOF )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1567:2: iv_ruleCustomPage= ruleCustomPage EOF
            {
             newCompositeNode(grammarAccess.getCustomPageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCustomPage_in_entryRuleCustomPage3196);
            iv_ruleCustomPage=ruleCustomPage();

            state._fsp--;

             current =iv_ruleCustomPage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCustomPage3206); 

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
    // $ANTLR end "entryRuleCustomPage"


    // $ANTLR start "ruleCustomPage"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1574:1: ruleCustomPage returns [EObject current=null] : ( ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'CustomPage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) otherlv_7= ')' ) ;
    public final EObject ruleCustomPage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_eAnnotations_0_0 = null;

        EObject lv_eAnnotations_2_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;


         enterRule(); 
            
        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1577:28: ( ( ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'CustomPage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) otherlv_7= ')' ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1578:1: ( ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'CustomPage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) otherlv_7= ')' )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1578:1: ( ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'CustomPage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) otherlv_7= ')' )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1578:2: ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'CustomPage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) otherlv_7= ')'
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1578:2: ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==50) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1578:3: ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )*
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1578:3: ( (lv_eAnnotations_0_0= ruleEAnnotation ) )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1579:1: (lv_eAnnotations_0_0= ruleEAnnotation )
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1579:1: (lv_eAnnotations_0_0= ruleEAnnotation )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1580:3: lv_eAnnotations_0_0= ruleEAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getCustomPageAccess().getEAnnotationsEAnnotationParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleCustomPage3253);
                    lv_eAnnotations_0_0=ruleEAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCustomPageRule());
                    	        }
                           		add(
                           			current, 
                           			"eAnnotations",
                            		lv_eAnnotations_0_0, 
                            		"EAnnotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1596:2: (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==11) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1596:4: otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleCustomPage3266); 

                    	        	newLeafNode(otherlv_1, grammarAccess.getCustomPageAccess().getCommaKeyword_0_1_0());
                    	        
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1600:1: ( (lv_eAnnotations_2_0= ruleEAnnotation ) )
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1601:1: (lv_eAnnotations_2_0= ruleEAnnotation )
                    	    {
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1601:1: (lv_eAnnotations_2_0= ruleEAnnotation )
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1602:3: lv_eAnnotations_2_0= ruleEAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCustomPageAccess().getEAnnotationsEAnnotationParserRuleCall_0_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleCustomPage3287);
                    	    lv_eAnnotations_2_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCustomPageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"eAnnotations",
                    	            		lv_eAnnotations_2_0, 
                    	            		"EAnnotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_3=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleCustomPage3303); 

                	newLeafNode(otherlv_3, grammarAccess.getCustomPageAccess().getCustomPageKeyword_1());
                
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1622:1: ( (lv_name_4_0= ruleEString ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1623:1: (lv_name_4_0= ruleEString )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1623:1: (lv_name_4_0= ruleEString )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1624:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCustomPageAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCustomPage3324);
            lv_name_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCustomPageRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleCustomPage3336); 

                	newLeafNode(otherlv_5, grammarAccess.getCustomPageAccess().getLeftParenthesisKeyword_3());
                
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1644:1: ( ( ruleEString ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1645:1: ( ruleEString )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1645:1: ( ruleEString )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1646:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCustomPageRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getCustomPageAccess().getPageStyleStylePageSettingsCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCustomPage3359);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleCustomPage3371); 

                	newLeafNode(otherlv_7, grammarAccess.getCustomPageAccess().getRightParenthesisKeyword_5());
                

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
    // $ANTLR end "ruleCustomPage"


    // $ANTLR start "entryRuleLoginPage"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1671:1: entryRuleLoginPage returns [EObject current=null] : iv_ruleLoginPage= ruleLoginPage EOF ;
    public final EObject entryRuleLoginPage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoginPage = null;


        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1672:2: (iv_ruleLoginPage= ruleLoginPage EOF )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1673:2: iv_ruleLoginPage= ruleLoginPage EOF
            {
             newCompositeNode(grammarAccess.getLoginPageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLoginPage_in_entryRuleLoginPage3407);
            iv_ruleLoginPage=ruleLoginPage();

            state._fsp--;

             current =iv_ruleLoginPage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLoginPage3417); 

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
    // $ANTLR end "entryRuleLoginPage"


    // $ANTLR start "ruleLoginPage"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1680:1: ruleLoginPage returns [EObject current=null] : ( ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'LoginPage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) otherlv_7= ')' ) ;
    public final EObject ruleLoginPage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_eAnnotations_0_0 = null;

        EObject lv_eAnnotations_2_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;


         enterRule(); 
            
        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1683:28: ( ( ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'LoginPage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) otherlv_7= ')' ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1684:1: ( ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'LoginPage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) otherlv_7= ')' )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1684:1: ( ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'LoginPage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) otherlv_7= ')' )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1684:2: ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'LoginPage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) otherlv_7= ')'
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1684:2: ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==50) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1684:3: ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )*
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1684:3: ( (lv_eAnnotations_0_0= ruleEAnnotation ) )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1685:1: (lv_eAnnotations_0_0= ruleEAnnotation )
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1685:1: (lv_eAnnotations_0_0= ruleEAnnotation )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1686:3: lv_eAnnotations_0_0= ruleEAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getLoginPageAccess().getEAnnotationsEAnnotationParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleLoginPage3464);
                    lv_eAnnotations_0_0=ruleEAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLoginPageRule());
                    	        }
                           		add(
                           			current, 
                           			"eAnnotations",
                            		lv_eAnnotations_0_0, 
                            		"EAnnotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1702:2: (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==11) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1702:4: otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleLoginPage3477); 

                    	        	newLeafNode(otherlv_1, grammarAccess.getLoginPageAccess().getCommaKeyword_0_1_0());
                    	        
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1706:1: ( (lv_eAnnotations_2_0= ruleEAnnotation ) )
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1707:1: (lv_eAnnotations_2_0= ruleEAnnotation )
                    	    {
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1707:1: (lv_eAnnotations_2_0= ruleEAnnotation )
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1708:3: lv_eAnnotations_2_0= ruleEAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getLoginPageAccess().getEAnnotationsEAnnotationParserRuleCall_0_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleLoginPage3498);
                    	    lv_eAnnotations_2_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getLoginPageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"eAnnotations",
                    	            		lv_eAnnotations_2_0, 
                    	            		"EAnnotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleLoginPage3514); 

                	newLeafNode(otherlv_3, grammarAccess.getLoginPageAccess().getLoginPageKeyword_1());
                
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1728:1: ( (lv_name_4_0= ruleEString ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1729:1: (lv_name_4_0= ruleEString )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1729:1: (lv_name_4_0= ruleEString )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1730:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getLoginPageAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleLoginPage3535);
            lv_name_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLoginPageRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleLoginPage3547); 

                	newLeafNode(otherlv_5, grammarAccess.getLoginPageAccess().getLeftParenthesisKeyword_3());
                
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1750:1: ( ( ruleEString ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1751:1: ( ruleEString )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1751:1: ( ruleEString )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1752:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLoginPageRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getLoginPageAccess().getPageStyleStylePageSettingsCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleLoginPage3570);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleLoginPage3582); 

                	newLeafNode(otherlv_7, grammarAccess.getLoginPageAccess().getRightParenthesisKeyword_5());
                

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
    // $ANTLR end "ruleLoginPage"


    // $ANTLR start "entryRuleProcessSelectorPage"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1777:1: entryRuleProcessSelectorPage returns [EObject current=null] : iv_ruleProcessSelectorPage= ruleProcessSelectorPage EOF ;
    public final EObject entryRuleProcessSelectorPage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessSelectorPage = null;


        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1778:2: (iv_ruleProcessSelectorPage= ruleProcessSelectorPage EOF )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1779:2: iv_ruleProcessSelectorPage= ruleProcessSelectorPage EOF
            {
             newCompositeNode(grammarAccess.getProcessSelectorPageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProcessSelectorPage_in_entryRuleProcessSelectorPage3618);
            iv_ruleProcessSelectorPage=ruleProcessSelectorPage();

            state._fsp--;

             current =iv_ruleProcessSelectorPage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProcessSelectorPage3628); 

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
    // $ANTLR end "entryRuleProcessSelectorPage"


    // $ANTLR start "ruleProcessSelectorPage"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1786:1: ruleProcessSelectorPage returns [EObject current=null] : ( ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'ProcessSelectorPage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )? otherlv_9= ')' ) ;
    public final EObject ruleProcessSelectorPage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_eAnnotations_0_0 = null;

        EObject lv_eAnnotations_2_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;


         enterRule(); 
            
        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1789:28: ( ( ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'ProcessSelectorPage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )? otherlv_9= ')' ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1790:1: ( ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'ProcessSelectorPage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )? otherlv_9= ')' )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1790:1: ( ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'ProcessSelectorPage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )? otherlv_9= ')' )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1790:2: ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'ProcessSelectorPage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )? otherlv_9= ')'
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1790:2: ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==50) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1790:3: ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )*
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1790:3: ( (lv_eAnnotations_0_0= ruleEAnnotation ) )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1791:1: (lv_eAnnotations_0_0= ruleEAnnotation )
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1791:1: (lv_eAnnotations_0_0= ruleEAnnotation )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1792:3: lv_eAnnotations_0_0= ruleEAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getProcessSelectorPageAccess().getEAnnotationsEAnnotationParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleProcessSelectorPage3675);
                    lv_eAnnotations_0_0=ruleEAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProcessSelectorPageRule());
                    	        }
                           		add(
                           			current, 
                           			"eAnnotations",
                            		lv_eAnnotations_0_0, 
                            		"EAnnotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1808:2: (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==11) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1808:4: otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleProcessSelectorPage3688); 

                    	        	newLeafNode(otherlv_1, grammarAccess.getProcessSelectorPageAccess().getCommaKeyword_0_1_0());
                    	        
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1812:1: ( (lv_eAnnotations_2_0= ruleEAnnotation ) )
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1813:1: (lv_eAnnotations_2_0= ruleEAnnotation )
                    	    {
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1813:1: (lv_eAnnotations_2_0= ruleEAnnotation )
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1814:3: lv_eAnnotations_2_0= ruleEAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProcessSelectorPageAccess().getEAnnotationsEAnnotationParserRuleCall_0_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleProcessSelectorPage3709);
                    	    lv_eAnnotations_2_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProcessSelectorPageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"eAnnotations",
                    	            		lv_eAnnotations_2_0, 
                    	            		"EAnnotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_3=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleProcessSelectorPage3725); 

                	newLeafNode(otherlv_3, grammarAccess.getProcessSelectorPageAccess().getProcessSelectorPageKeyword_1());
                
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1834:1: ( (lv_name_4_0= ruleEString ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1835:1: (lv_name_4_0= ruleEString )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1835:1: (lv_name_4_0= ruleEString )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1836:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getProcessSelectorPageAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleProcessSelectorPage3746);
            lv_name_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProcessSelectorPageRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleProcessSelectorPage3758); 

                	newLeafNode(otherlv_5, grammarAccess.getProcessSelectorPageAccess().getLeftParenthesisKeyword_3());
                
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1856:1: ( ( ruleEString ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1857:1: ( ruleEString )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1857:1: ( ruleEString )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1858:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getProcessSelectorPageRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getProcessSelectorPageAccess().getPageStyleStylePageSettingsCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleProcessSelectorPage3781);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1871:2: (otherlv_7= ',' ( ( ruleEString ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==11) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1871:4: otherlv_7= ',' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleProcessSelectorPage3794); 

                        	newLeafNode(otherlv_7, grammarAccess.getProcessSelectorPageAccess().getCommaKeyword_5_0());
                        
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1875:1: ( ( ruleEString ) )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1876:1: ( ruleEString )
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1876:1: ( ruleEString )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1877:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getProcessSelectorPageRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getProcessSelectorPageAccess().getMenuMenuCrossReference_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleProcessSelectorPage3817);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleProcessSelectorPage3831); 

                	newLeafNode(otherlv_9, grammarAccess.getProcessSelectorPageAccess().getRightParenthesisKeyword_6());
                

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
    // $ANTLR end "ruleProcessSelectorPage"


    // $ANTLR start "entryRuleSelectableListPage"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1902:1: entryRuleSelectableListPage returns [EObject current=null] : iv_ruleSelectableListPage= ruleSelectableListPage EOF ;
    public final EObject entryRuleSelectableListPage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectableListPage = null;


        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1903:2: (iv_ruleSelectableListPage= ruleSelectableListPage EOF )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1904:2: iv_ruleSelectableListPage= ruleSelectableListPage EOF
            {
             newCompositeNode(grammarAccess.getSelectableListPageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSelectableListPage_in_entryRuleSelectableListPage3867);
            iv_ruleSelectableListPage=ruleSelectableListPage();

            state._fsp--;

             current =iv_ruleSelectableListPage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSelectableListPage3877); 

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
    // $ANTLR end "entryRuleSelectableListPage"


    // $ANTLR start "ruleSelectableListPage"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1911:1: ruleSelectableListPage returns [EObject current=null] : ( ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? ( (lv_multiSelection_3_0= 'multiSelection' ) )? otherlv_4= 'SelectableListPage' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '(' ( ( ruleEString ) ) otherlv_8= ',' ( ( ruleEString ) ) otherlv_10= ',' ( ( ruleEString ) ) otherlv_12= ')' ) ;
    public final EObject ruleSelectableListPage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_multiSelection_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_eAnnotations_0_0 = null;

        EObject lv_eAnnotations_2_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;


         enterRule(); 
            
        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1914:28: ( ( ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? ( (lv_multiSelection_3_0= 'multiSelection' ) )? otherlv_4= 'SelectableListPage' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '(' ( ( ruleEString ) ) otherlv_8= ',' ( ( ruleEString ) ) otherlv_10= ',' ( ( ruleEString ) ) otherlv_12= ')' ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1915:1: ( ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? ( (lv_multiSelection_3_0= 'multiSelection' ) )? otherlv_4= 'SelectableListPage' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '(' ( ( ruleEString ) ) otherlv_8= ',' ( ( ruleEString ) ) otherlv_10= ',' ( ( ruleEString ) ) otherlv_12= ')' )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1915:1: ( ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? ( (lv_multiSelection_3_0= 'multiSelection' ) )? otherlv_4= 'SelectableListPage' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '(' ( ( ruleEString ) ) otherlv_8= ',' ( ( ruleEString ) ) otherlv_10= ',' ( ( ruleEString ) ) otherlv_12= ')' )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1915:2: ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? ( (lv_multiSelection_3_0= 'multiSelection' ) )? otherlv_4= 'SelectableListPage' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '(' ( ( ruleEString ) ) otherlv_8= ',' ( ( ruleEString ) ) otherlv_10= ',' ( ( ruleEString ) ) otherlv_12= ')'
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1915:2: ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==50) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1915:3: ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )*
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1915:3: ( (lv_eAnnotations_0_0= ruleEAnnotation ) )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1916:1: (lv_eAnnotations_0_0= ruleEAnnotation )
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1916:1: (lv_eAnnotations_0_0= ruleEAnnotation )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1917:3: lv_eAnnotations_0_0= ruleEAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getSelectableListPageAccess().getEAnnotationsEAnnotationParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleSelectableListPage3924);
                    lv_eAnnotations_0_0=ruleEAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSelectableListPageRule());
                    	        }
                           		add(
                           			current, 
                           			"eAnnotations",
                            		lv_eAnnotations_0_0, 
                            		"EAnnotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1933:2: (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==11) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1933:4: otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleSelectableListPage3937); 

                    	        	newLeafNode(otherlv_1, grammarAccess.getSelectableListPageAccess().getCommaKeyword_0_1_0());
                    	        
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1937:1: ( (lv_eAnnotations_2_0= ruleEAnnotation ) )
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1938:1: (lv_eAnnotations_2_0= ruleEAnnotation )
                    	    {
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1938:1: (lv_eAnnotations_2_0= ruleEAnnotation )
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1939:3: lv_eAnnotations_2_0= ruleEAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSelectableListPageAccess().getEAnnotationsEAnnotationParserRuleCall_0_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleSelectableListPage3958);
                    	    lv_eAnnotations_2_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSelectableListPageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"eAnnotations",
                    	            		lv_eAnnotations_2_0, 
                    	            		"EAnnotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1955:6: ( (lv_multiSelection_3_0= 'multiSelection' ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==36) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1956:1: (lv_multiSelection_3_0= 'multiSelection' )
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1956:1: (lv_multiSelection_3_0= 'multiSelection' )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1957:3: lv_multiSelection_3_0= 'multiSelection'
                    {
                    lv_multiSelection_3_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleSelectableListPage3980); 

                            newLeafNode(lv_multiSelection_3_0, grammarAccess.getSelectableListPageAccess().getMultiSelectionMultiSelectionKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSelectableListPageRule());
                    	        }
                           		setWithLastConsumed(current, "multiSelection", true, "multiSelection");
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleSelectableListPage4006); 

                	newLeafNode(otherlv_4, grammarAccess.getSelectableListPageAccess().getSelectableListPageKeyword_2());
                
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1974:1: ( (lv_name_5_0= ruleEString ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1975:1: (lv_name_5_0= ruleEString )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1975:1: (lv_name_5_0= ruleEString )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1976:3: lv_name_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSelectableListPageAccess().getNameEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSelectableListPage4027);
            lv_name_5_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSelectableListPageRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_5_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleSelectableListPage4039); 

                	newLeafNode(otherlv_6, grammarAccess.getSelectableListPageAccess().getLeftParenthesisKeyword_4());
                
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1996:1: ( ( ruleEString ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1997:1: ( ruleEString )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1997:1: ( ruleEString )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:1998:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSelectableListPageRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getSelectableListPageAccess().getPageStyleStylePageSettingsCrossReference_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSelectableListPage4062);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleSelectableListPage4074); 

                	newLeafNode(otherlv_8, grammarAccess.getSelectableListPageAccess().getCommaKeyword_6());
                
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2015:1: ( ( ruleEString ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2016:1: ( ruleEString )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2016:1: ( ruleEString )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2017:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSelectableListPageRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getSelectableListPageAccess().getSelectablepageStyleStyleSelectionSettingsCrossReference_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSelectableListPage4097);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_10=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleSelectableListPage4109); 

                	newLeafNode(otherlv_10, grammarAccess.getSelectableListPageAccess().getCommaKeyword_8());
                
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2034:1: ( ( ruleEString ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2035:1: ( ruleEString )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2035:1: ( ruleEString )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2036:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSelectableListPageRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getSelectableListPageAccess().getListablepageStyleStyleListSettingsCrossReference_9_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSelectableListPage4132);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_12=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleSelectableListPage4144); 

                	newLeafNode(otherlv_12, grammarAccess.getSelectableListPageAccess().getRightParenthesisKeyword_10());
                

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
    // $ANTLR end "ruleSelectableListPage"


    // $ANTLR start "entryRuleMapPage"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2061:1: entryRuleMapPage returns [EObject current=null] : iv_ruleMapPage= ruleMapPage EOF ;
    public final EObject entryRuleMapPage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapPage = null;


        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2062:2: (iv_ruleMapPage= ruleMapPage EOF )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2063:2: iv_ruleMapPage= ruleMapPage EOF
            {
             newCompositeNode(grammarAccess.getMapPageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMapPage_in_entryRuleMapPage4180);
            iv_ruleMapPage=ruleMapPage();

            state._fsp--;

             current =iv_ruleMapPage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMapPage4190); 

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
    // $ANTLR end "entryRuleMapPage"


    // $ANTLR start "ruleMapPage"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2070:1: ruleMapPage returns [EObject current=null] : ( ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'MapPage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) otherlv_7= ')' ) ;
    public final EObject ruleMapPage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_eAnnotations_0_0 = null;

        EObject lv_eAnnotations_2_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;


         enterRule(); 
            
        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2073:28: ( ( ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'MapPage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) otherlv_7= ')' ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2074:1: ( ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'MapPage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) otherlv_7= ')' )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2074:1: ( ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'MapPage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) otherlv_7= ')' )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2074:2: ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'MapPage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) otherlv_7= ')'
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2074:2: ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==50) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2074:3: ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )*
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2074:3: ( (lv_eAnnotations_0_0= ruleEAnnotation ) )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2075:1: (lv_eAnnotations_0_0= ruleEAnnotation )
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2075:1: (lv_eAnnotations_0_0= ruleEAnnotation )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2076:3: lv_eAnnotations_0_0= ruleEAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getMapPageAccess().getEAnnotationsEAnnotationParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleMapPage4237);
                    lv_eAnnotations_0_0=ruleEAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMapPageRule());
                    	        }
                           		add(
                           			current, 
                           			"eAnnotations",
                            		lv_eAnnotations_0_0, 
                            		"EAnnotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2092:2: (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==11) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2092:4: otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleMapPage4250); 

                    	        	newLeafNode(otherlv_1, grammarAccess.getMapPageAccess().getCommaKeyword_0_1_0());
                    	        
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2096:1: ( (lv_eAnnotations_2_0= ruleEAnnotation ) )
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2097:1: (lv_eAnnotations_2_0= ruleEAnnotation )
                    	    {
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2097:1: (lv_eAnnotations_2_0= ruleEAnnotation )
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2098:3: lv_eAnnotations_2_0= ruleEAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMapPageAccess().getEAnnotationsEAnnotationParserRuleCall_0_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleMapPage4271);
                    	    lv_eAnnotations_2_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMapPageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"eAnnotations",
                    	            		lv_eAnnotations_2_0, 
                    	            		"EAnnotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_3=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleMapPage4287); 

                	newLeafNode(otherlv_3, grammarAccess.getMapPageAccess().getMapPageKeyword_1());
                
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2118:1: ( (lv_name_4_0= ruleEString ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2119:1: (lv_name_4_0= ruleEString )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2119:1: (lv_name_4_0= ruleEString )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2120:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMapPageAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMapPage4308);
            lv_name_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMapPageRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleMapPage4320); 

                	newLeafNode(otherlv_5, grammarAccess.getMapPageAccess().getLeftParenthesisKeyword_3());
                
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2140:1: ( ( ruleEString ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2141:1: ( ruleEString )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2141:1: ( ruleEString )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2142:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMapPageRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getMapPageAccess().getPageStyleStylePageSettingsCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMapPage4343);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleMapPage4355); 

                	newLeafNode(otherlv_7, grammarAccess.getMapPageAccess().getRightParenthesisKeyword_5());
                

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
    // $ANTLR end "ruleMapPage"


    // $ANTLR start "entryRuleMediaPage"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2167:1: entryRuleMediaPage returns [EObject current=null] : iv_ruleMediaPage= ruleMediaPage EOF ;
    public final EObject entryRuleMediaPage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMediaPage = null;


        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2168:2: (iv_ruleMediaPage= ruleMediaPage EOF )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2169:2: iv_ruleMediaPage= ruleMediaPage EOF
            {
             newCompositeNode(grammarAccess.getMediaPageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMediaPage_in_entryRuleMediaPage4391);
            iv_ruleMediaPage=ruleMediaPage();

            state._fsp--;

             current =iv_ruleMediaPage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMediaPage4401); 

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
    // $ANTLR end "entryRuleMediaPage"


    // $ANTLR start "ruleMediaPage"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2176:1: ruleMediaPage returns [EObject current=null] : ( ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'MediaPage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) otherlv_7= ')' ) ;
    public final EObject ruleMediaPage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_eAnnotations_0_0 = null;

        EObject lv_eAnnotations_2_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;


         enterRule(); 
            
        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2179:28: ( ( ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'MediaPage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) otherlv_7= ')' ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2180:1: ( ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'MediaPage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) otherlv_7= ')' )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2180:1: ( ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'MediaPage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) otherlv_7= ')' )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2180:2: ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'MediaPage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) otherlv_7= ')'
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2180:2: ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==50) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2180:3: ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )*
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2180:3: ( (lv_eAnnotations_0_0= ruleEAnnotation ) )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2181:1: (lv_eAnnotations_0_0= ruleEAnnotation )
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2181:1: (lv_eAnnotations_0_0= ruleEAnnotation )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2182:3: lv_eAnnotations_0_0= ruleEAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getMediaPageAccess().getEAnnotationsEAnnotationParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleMediaPage4448);
                    lv_eAnnotations_0_0=ruleEAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMediaPageRule());
                    	        }
                           		add(
                           			current, 
                           			"eAnnotations",
                            		lv_eAnnotations_0_0, 
                            		"EAnnotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2198:2: (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==11) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2198:4: otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleMediaPage4461); 

                    	        	newLeafNode(otherlv_1, grammarAccess.getMediaPageAccess().getCommaKeyword_0_1_0());
                    	        
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2202:1: ( (lv_eAnnotations_2_0= ruleEAnnotation ) )
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2203:1: (lv_eAnnotations_2_0= ruleEAnnotation )
                    	    {
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2203:1: (lv_eAnnotations_2_0= ruleEAnnotation )
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2204:3: lv_eAnnotations_2_0= ruleEAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMediaPageAccess().getEAnnotationsEAnnotationParserRuleCall_0_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleMediaPage4482);
                    	    lv_eAnnotations_2_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMediaPageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"eAnnotations",
                    	            		lv_eAnnotations_2_0, 
                    	            		"EAnnotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_3=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleMediaPage4498); 

                	newLeafNode(otherlv_3, grammarAccess.getMediaPageAccess().getMediaPageKeyword_1());
                
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2224:1: ( (lv_name_4_0= ruleEString ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2225:1: (lv_name_4_0= ruleEString )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2225:1: (lv_name_4_0= ruleEString )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2226:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMediaPageAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMediaPage4519);
            lv_name_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMediaPageRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleMediaPage4531); 

                	newLeafNode(otherlv_5, grammarAccess.getMediaPageAccess().getLeftParenthesisKeyword_3());
                
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2246:1: ( ( ruleEString ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2247:1: ( ruleEString )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2247:1: ( ruleEString )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2248:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMediaPageRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getMediaPageAccess().getPageStyleStylePageSettingsCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMediaPage4554);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleMediaPage4566); 

                	newLeafNode(otherlv_7, grammarAccess.getMediaPageAccess().getRightParenthesisKeyword_5());
                

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
    // $ANTLR end "ruleMediaPage"


    // $ANTLR start "entryRuleELearningPage"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2273:1: entryRuleELearningPage returns [EObject current=null] : iv_ruleELearningPage= ruleELearningPage EOF ;
    public final EObject entryRuleELearningPage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELearningPage = null;


        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2274:2: (iv_ruleELearningPage= ruleELearningPage EOF )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2275:2: iv_ruleELearningPage= ruleELearningPage EOF
            {
             newCompositeNode(grammarAccess.getELearningPageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleELearningPage_in_entryRuleELearningPage4602);
            iv_ruleELearningPage=ruleELearningPage();

            state._fsp--;

             current =iv_ruleELearningPage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleELearningPage4612); 

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
    // $ANTLR end "entryRuleELearningPage"


    // $ANTLR start "ruleELearningPage"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2282:1: ruleELearningPage returns [EObject current=null] : ( ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'ELearningPage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )? otherlv_9= ')' ) ;
    public final EObject ruleELearningPage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_eAnnotations_0_0 = null;

        EObject lv_eAnnotations_2_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;


         enterRule(); 
            
        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2285:28: ( ( ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'ELearningPage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )? otherlv_9= ')' ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2286:1: ( ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'ELearningPage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )? otherlv_9= ')' )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2286:1: ( ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'ELearningPage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )? otherlv_9= ')' )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2286:2: ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'ELearningPage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )? otherlv_9= ')'
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2286:2: ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==50) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2286:3: ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )*
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2286:3: ( (lv_eAnnotations_0_0= ruleEAnnotation ) )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2287:1: (lv_eAnnotations_0_0= ruleEAnnotation )
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2287:1: (lv_eAnnotations_0_0= ruleEAnnotation )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2288:3: lv_eAnnotations_0_0= ruleEAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getELearningPageAccess().getEAnnotationsEAnnotationParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleELearningPage4659);
                    lv_eAnnotations_0_0=ruleEAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getELearningPageRule());
                    	        }
                           		add(
                           			current, 
                           			"eAnnotations",
                            		lv_eAnnotations_0_0, 
                            		"EAnnotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2304:2: (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==11) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2304:4: otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleELearningPage4672); 

                    	        	newLeafNode(otherlv_1, grammarAccess.getELearningPageAccess().getCommaKeyword_0_1_0());
                    	        
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2308:1: ( (lv_eAnnotations_2_0= ruleEAnnotation ) )
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2309:1: (lv_eAnnotations_2_0= ruleEAnnotation )
                    	    {
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2309:1: (lv_eAnnotations_2_0= ruleEAnnotation )
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2310:3: lv_eAnnotations_2_0= ruleEAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getELearningPageAccess().getEAnnotationsEAnnotationParserRuleCall_0_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleELearningPage4693);
                    	    lv_eAnnotations_2_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getELearningPageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"eAnnotations",
                    	            		lv_eAnnotations_2_0, 
                    	            		"EAnnotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_3=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleELearningPage4709); 

                	newLeafNode(otherlv_3, grammarAccess.getELearningPageAccess().getELearningPageKeyword_1());
                
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2330:1: ( (lv_name_4_0= ruleEString ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2331:1: (lv_name_4_0= ruleEString )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2331:1: (lv_name_4_0= ruleEString )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2332:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getELearningPageAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleELearningPage4730);
            lv_name_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getELearningPageRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleELearningPage4742); 

                	newLeafNode(otherlv_5, grammarAccess.getELearningPageAccess().getLeftParenthesisKeyword_3());
                
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2352:1: ( ( ruleEString ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2353:1: ( ruleEString )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2353:1: ( ruleEString )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2354:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getELearningPageRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getELearningPageAccess().getPageStyleStylePageSettingsCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleELearningPage4765);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2367:2: (otherlv_7= ',' ( ( ruleEString ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==11) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2367:4: otherlv_7= ',' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleELearningPage4778); 

                        	newLeafNode(otherlv_7, grammarAccess.getELearningPageAccess().getCommaKeyword_5_0());
                        
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2371:1: ( ( ruleEString ) )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2372:1: ( ruleEString )
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2372:1: ( ruleEString )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2373:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getELearningPageRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getELearningPageAccess().getMenuMenuCrossReference_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleELearningPage4801);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleELearningPage4815); 

                	newLeafNode(otherlv_9, grammarAccess.getELearningPageAccess().getRightParenthesisKeyword_6());
                

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
    // $ANTLR end "ruleELearningPage"


    // $ANTLR start "entryRuleTakePicturePage"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2398:1: entryRuleTakePicturePage returns [EObject current=null] : iv_ruleTakePicturePage= ruleTakePicturePage EOF ;
    public final EObject entryRuleTakePicturePage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTakePicturePage = null;


        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2399:2: (iv_ruleTakePicturePage= ruleTakePicturePage EOF )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2400:2: iv_ruleTakePicturePage= ruleTakePicturePage EOF
            {
             newCompositeNode(grammarAccess.getTakePicturePageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTakePicturePage_in_entryRuleTakePicturePage4851);
            iv_ruleTakePicturePage=ruleTakePicturePage();

            state._fsp--;

             current =iv_ruleTakePicturePage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTakePicturePage4861); 

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
    // $ANTLR end "entryRuleTakePicturePage"


    // $ANTLR start "ruleTakePicturePage"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2407:1: ruleTakePicturePage returns [EObject current=null] : ( ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'TakePicturePage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) otherlv_7= ')' ) ;
    public final EObject ruleTakePicturePage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_eAnnotations_0_0 = null;

        EObject lv_eAnnotations_2_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;


         enterRule(); 
            
        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2410:28: ( ( ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'TakePicturePage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) otherlv_7= ')' ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2411:1: ( ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'TakePicturePage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) otherlv_7= ')' )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2411:1: ( ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'TakePicturePage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) otherlv_7= ')' )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2411:2: ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'TakePicturePage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) otherlv_7= ')'
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2411:2: ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==50) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2411:3: ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )*
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2411:3: ( (lv_eAnnotations_0_0= ruleEAnnotation ) )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2412:1: (lv_eAnnotations_0_0= ruleEAnnotation )
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2412:1: (lv_eAnnotations_0_0= ruleEAnnotation )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2413:3: lv_eAnnotations_0_0= ruleEAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getTakePicturePageAccess().getEAnnotationsEAnnotationParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleTakePicturePage4908);
                    lv_eAnnotations_0_0=ruleEAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTakePicturePageRule());
                    	        }
                           		add(
                           			current, 
                           			"eAnnotations",
                            		lv_eAnnotations_0_0, 
                            		"EAnnotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2429:2: (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==11) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2429:4: otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleTakePicturePage4921); 

                    	        	newLeafNode(otherlv_1, grammarAccess.getTakePicturePageAccess().getCommaKeyword_0_1_0());
                    	        
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2433:1: ( (lv_eAnnotations_2_0= ruleEAnnotation ) )
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2434:1: (lv_eAnnotations_2_0= ruleEAnnotation )
                    	    {
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2434:1: (lv_eAnnotations_2_0= ruleEAnnotation )
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2435:3: lv_eAnnotations_2_0= ruleEAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTakePicturePageAccess().getEAnnotationsEAnnotationParserRuleCall_0_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleTakePicturePage4942);
                    	    lv_eAnnotations_2_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTakePicturePageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"eAnnotations",
                    	            		lv_eAnnotations_2_0, 
                    	            		"EAnnotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop55;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_3=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleTakePicturePage4958); 

                	newLeafNode(otherlv_3, grammarAccess.getTakePicturePageAccess().getTakePicturePageKeyword_1());
                
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2455:1: ( (lv_name_4_0= ruleEString ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2456:1: (lv_name_4_0= ruleEString )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2456:1: (lv_name_4_0= ruleEString )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2457:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTakePicturePageAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTakePicturePage4979);
            lv_name_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTakePicturePageRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleTakePicturePage4991); 

                	newLeafNode(otherlv_5, grammarAccess.getTakePicturePageAccess().getLeftParenthesisKeyword_3());
                
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2477:1: ( ( ruleEString ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2478:1: ( ruleEString )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2478:1: ( ruleEString )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2479:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTakePicturePageRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTakePicturePageAccess().getPageStyleStylePageSettingsCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTakePicturePage5014);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleTakePicturePage5026); 

                	newLeafNode(otherlv_7, grammarAccess.getTakePicturePageAccess().getRightParenthesisKeyword_5());
                

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
    // $ANTLR end "ruleTakePicturePage"


    // $ANTLR start "entryRuleRecordAudioPage"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2504:1: entryRuleRecordAudioPage returns [EObject current=null] : iv_ruleRecordAudioPage= ruleRecordAudioPage EOF ;
    public final EObject entryRuleRecordAudioPage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordAudioPage = null;


        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2505:2: (iv_ruleRecordAudioPage= ruleRecordAudioPage EOF )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2506:2: iv_ruleRecordAudioPage= ruleRecordAudioPage EOF
            {
             newCompositeNode(grammarAccess.getRecordAudioPageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRecordAudioPage_in_entryRuleRecordAudioPage5062);
            iv_ruleRecordAudioPage=ruleRecordAudioPage();

            state._fsp--;

             current =iv_ruleRecordAudioPage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRecordAudioPage5072); 

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
    // $ANTLR end "entryRuleRecordAudioPage"


    // $ANTLR start "ruleRecordAudioPage"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2513:1: ruleRecordAudioPage returns [EObject current=null] : ( ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'RecordAudioPage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) otherlv_7= ')' ) ;
    public final EObject ruleRecordAudioPage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_eAnnotations_0_0 = null;

        EObject lv_eAnnotations_2_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;


         enterRule(); 
            
        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2516:28: ( ( ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'RecordAudioPage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) otherlv_7= ')' ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2517:1: ( ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'RecordAudioPage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) otherlv_7= ')' )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2517:1: ( ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'RecordAudioPage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) otherlv_7= ')' )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2517:2: ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'RecordAudioPage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) otherlv_7= ')'
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2517:2: ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==50) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2517:3: ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )*
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2517:3: ( (lv_eAnnotations_0_0= ruleEAnnotation ) )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2518:1: (lv_eAnnotations_0_0= ruleEAnnotation )
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2518:1: (lv_eAnnotations_0_0= ruleEAnnotation )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2519:3: lv_eAnnotations_0_0= ruleEAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getRecordAudioPageAccess().getEAnnotationsEAnnotationParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleRecordAudioPage5119);
                    lv_eAnnotations_0_0=ruleEAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRecordAudioPageRule());
                    	        }
                           		add(
                           			current, 
                           			"eAnnotations",
                            		lv_eAnnotations_0_0, 
                            		"EAnnotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2535:2: (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==11) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2535:4: otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleRecordAudioPage5132); 

                    	        	newLeafNode(otherlv_1, grammarAccess.getRecordAudioPageAccess().getCommaKeyword_0_1_0());
                    	        
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2539:1: ( (lv_eAnnotations_2_0= ruleEAnnotation ) )
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2540:1: (lv_eAnnotations_2_0= ruleEAnnotation )
                    	    {
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2540:1: (lv_eAnnotations_2_0= ruleEAnnotation )
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2541:3: lv_eAnnotations_2_0= ruleEAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRecordAudioPageAccess().getEAnnotationsEAnnotationParserRuleCall_0_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleRecordAudioPage5153);
                    	    lv_eAnnotations_2_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRecordAudioPageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"eAnnotations",
                    	            		lv_eAnnotations_2_0, 
                    	            		"EAnnotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_3=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleRecordAudioPage5169); 

                	newLeafNode(otherlv_3, grammarAccess.getRecordAudioPageAccess().getRecordAudioPageKeyword_1());
                
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2561:1: ( (lv_name_4_0= ruleEString ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2562:1: (lv_name_4_0= ruleEString )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2562:1: (lv_name_4_0= ruleEString )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2563:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRecordAudioPageAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRecordAudioPage5190);
            lv_name_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRecordAudioPageRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleRecordAudioPage5202); 

                	newLeafNode(otherlv_5, grammarAccess.getRecordAudioPageAccess().getLeftParenthesisKeyword_3());
                
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2583:1: ( ( ruleEString ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2584:1: ( ruleEString )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2584:1: ( ruleEString )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2585:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRecordAudioPageRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRecordAudioPageAccess().getPageStyleStylePageSettingsCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRecordAudioPage5225);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleRecordAudioPage5237); 

                	newLeafNode(otherlv_7, grammarAccess.getRecordAudioPageAccess().getRightParenthesisKeyword_5());
                

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
    // $ANTLR end "ruleRecordAudioPage"


    // $ANTLR start "entryRuleARPage"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2610:1: entryRuleARPage returns [EObject current=null] : iv_ruleARPage= ruleARPage EOF ;
    public final EObject entryRuleARPage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleARPage = null;


        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2611:2: (iv_ruleARPage= ruleARPage EOF )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2612:2: iv_ruleARPage= ruleARPage EOF
            {
             newCompositeNode(grammarAccess.getARPageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleARPage_in_entryRuleARPage5273);
            iv_ruleARPage=ruleARPage();

            state._fsp--;

             current =iv_ruleARPage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleARPage5283); 

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
    // $ANTLR end "entryRuleARPage"


    // $ANTLR start "ruleARPage"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2619:1: ruleARPage returns [EObject current=null] : ( ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'ARPage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) otherlv_7= ')' ) ;
    public final EObject ruleARPage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_eAnnotations_0_0 = null;

        EObject lv_eAnnotations_2_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;


         enterRule(); 
            
        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2622:28: ( ( ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'ARPage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) otherlv_7= ')' ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2623:1: ( ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'ARPage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) otherlv_7= ')' )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2623:1: ( ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'ARPage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) otherlv_7= ')' )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2623:2: ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )? otherlv_3= 'ARPage' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( ruleEString ) ) otherlv_7= ')'
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2623:2: ( ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )* )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==50) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2623:3: ( (lv_eAnnotations_0_0= ruleEAnnotation ) ) (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )*
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2623:3: ( (lv_eAnnotations_0_0= ruleEAnnotation ) )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2624:1: (lv_eAnnotations_0_0= ruleEAnnotation )
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2624:1: (lv_eAnnotations_0_0= ruleEAnnotation )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2625:3: lv_eAnnotations_0_0= ruleEAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getARPageAccess().getEAnnotationsEAnnotationParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleARPage5330);
                    lv_eAnnotations_0_0=ruleEAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getARPageRule());
                    	        }
                           		add(
                           			current, 
                           			"eAnnotations",
                            		lv_eAnnotations_0_0, 
                            		"EAnnotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2641:2: (otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==11) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2641:4: otherlv_1= ',' ( (lv_eAnnotations_2_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleARPage5343); 

                    	        	newLeafNode(otherlv_1, grammarAccess.getARPageAccess().getCommaKeyword_0_1_0());
                    	        
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2645:1: ( (lv_eAnnotations_2_0= ruleEAnnotation ) )
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2646:1: (lv_eAnnotations_2_0= ruleEAnnotation )
                    	    {
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2646:1: (lv_eAnnotations_2_0= ruleEAnnotation )
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2647:3: lv_eAnnotations_2_0= ruleEAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getARPageAccess().getEAnnotationsEAnnotationParserRuleCall_0_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleARPage5364);
                    	    lv_eAnnotations_2_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getARPageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"eAnnotations",
                    	            		lv_eAnnotations_2_0, 
                    	            		"EAnnotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_3=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleARPage5380); 

                	newLeafNode(otherlv_3, grammarAccess.getARPageAccess().getARPageKeyword_1());
                
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2667:1: ( (lv_name_4_0= ruleEString ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2668:1: (lv_name_4_0= ruleEString )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2668:1: (lv_name_4_0= ruleEString )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2669:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getARPageAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleARPage5401);
            lv_name_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getARPageRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleARPage5413); 

                	newLeafNode(otherlv_5, grammarAccess.getARPageAccess().getLeftParenthesisKeyword_3());
                
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2689:1: ( ( ruleEString ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2690:1: ( ruleEString )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2690:1: ( ruleEString )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2691:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getARPageRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getARPageAccess().getPageStyleStylePageSettingsCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleARPage5436);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleARPage5448); 

                	newLeafNode(otherlv_7, grammarAccess.getARPageAccess().getRightParenthesisKeyword_5());
                

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
    // $ANTLR end "ruleARPage"


    // $ANTLR start "entryRuleRGBColor"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2716:1: entryRuleRGBColor returns [EObject current=null] : iv_ruleRGBColor= ruleRGBColor EOF ;
    public final EObject entryRuleRGBColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRGBColor = null;


        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2717:2: (iv_ruleRGBColor= ruleRGBColor EOF )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2718:2: iv_ruleRGBColor= ruleRGBColor EOF
            {
             newCompositeNode(grammarAccess.getRGBColorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRGBColor_in_entryRuleRGBColor5484);
            iv_ruleRGBColor=ruleRGBColor();

            state._fsp--;

             current =iv_ruleRGBColor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRGBColor5494); 

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
    // $ANTLR end "entryRuleRGBColor"


    // $ANTLR start "ruleRGBColor"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2725:1: ruleRGBColor returns [EObject current=null] : ( () ( ( (lv_eAnnotations_1_0= ruleEAnnotation ) ) (otherlv_2= ',' ( (lv_eAnnotations_3_0= ruleEAnnotation ) ) )* )? ( (lv_name_4_0= ruleEString ) ) (otherlv_5= '(' ( (lv_red_6_0= ruleEInt ) )? otherlv_7= ',' ( (lv_green_8_0= ruleEInt ) )? otherlv_9= ',' ( (lv_blue_10_0= ruleEInt ) )? otherlv_11= ')' ) ) ;
    public final EObject ruleRGBColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_eAnnotations_1_0 = null;

        EObject lv_eAnnotations_3_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_red_6_0 = null;

        AntlrDatatypeRuleToken lv_green_8_0 = null;

        AntlrDatatypeRuleToken lv_blue_10_0 = null;


         enterRule(); 
            
        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2728:28: ( ( () ( ( (lv_eAnnotations_1_0= ruleEAnnotation ) ) (otherlv_2= ',' ( (lv_eAnnotations_3_0= ruleEAnnotation ) ) )* )? ( (lv_name_4_0= ruleEString ) ) (otherlv_5= '(' ( (lv_red_6_0= ruleEInt ) )? otherlv_7= ',' ( (lv_green_8_0= ruleEInt ) )? otherlv_9= ',' ( (lv_blue_10_0= ruleEInt ) )? otherlv_11= ')' ) ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2729:1: ( () ( ( (lv_eAnnotations_1_0= ruleEAnnotation ) ) (otherlv_2= ',' ( (lv_eAnnotations_3_0= ruleEAnnotation ) ) )* )? ( (lv_name_4_0= ruleEString ) ) (otherlv_5= '(' ( (lv_red_6_0= ruleEInt ) )? otherlv_7= ',' ( (lv_green_8_0= ruleEInt ) )? otherlv_9= ',' ( (lv_blue_10_0= ruleEInt ) )? otherlv_11= ')' ) )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2729:1: ( () ( ( (lv_eAnnotations_1_0= ruleEAnnotation ) ) (otherlv_2= ',' ( (lv_eAnnotations_3_0= ruleEAnnotation ) ) )* )? ( (lv_name_4_0= ruleEString ) ) (otherlv_5= '(' ( (lv_red_6_0= ruleEInt ) )? otherlv_7= ',' ( (lv_green_8_0= ruleEInt ) )? otherlv_9= ',' ( (lv_blue_10_0= ruleEInt ) )? otherlv_11= ')' ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2729:2: () ( ( (lv_eAnnotations_1_0= ruleEAnnotation ) ) (otherlv_2= ',' ( (lv_eAnnotations_3_0= ruleEAnnotation ) ) )* )? ( (lv_name_4_0= ruleEString ) ) (otherlv_5= '(' ( (lv_red_6_0= ruleEInt ) )? otherlv_7= ',' ( (lv_green_8_0= ruleEInt ) )? otherlv_9= ',' ( (lv_blue_10_0= ruleEInt ) )? otherlv_11= ')' )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2729:2: ()
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2730:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRGBColorAccess().getRGBColorAction_0(),
                        current);
                

            }

            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2735:2: ( ( (lv_eAnnotations_1_0= ruleEAnnotation ) ) (otherlv_2= ',' ( (lv_eAnnotations_3_0= ruleEAnnotation ) ) )* )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==50) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2735:3: ( (lv_eAnnotations_1_0= ruleEAnnotation ) ) (otherlv_2= ',' ( (lv_eAnnotations_3_0= ruleEAnnotation ) ) )*
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2735:3: ( (lv_eAnnotations_1_0= ruleEAnnotation ) )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2736:1: (lv_eAnnotations_1_0= ruleEAnnotation )
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2736:1: (lv_eAnnotations_1_0= ruleEAnnotation )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2737:3: lv_eAnnotations_1_0= ruleEAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getRGBColorAccess().getEAnnotationsEAnnotationParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleRGBColor5550);
                    lv_eAnnotations_1_0=ruleEAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRGBColorRule());
                    	        }
                           		add(
                           			current, 
                           			"eAnnotations",
                            		lv_eAnnotations_1_0, 
                            		"EAnnotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2753:2: (otherlv_2= ',' ( (lv_eAnnotations_3_0= ruleEAnnotation ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==11) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2753:4: otherlv_2= ',' ( (lv_eAnnotations_3_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleRGBColor5563); 

                    	        	newLeafNode(otherlv_2, grammarAccess.getRGBColorAccess().getCommaKeyword_1_1_0());
                    	        
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2757:1: ( (lv_eAnnotations_3_0= ruleEAnnotation ) )
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2758:1: (lv_eAnnotations_3_0= ruleEAnnotation )
                    	    {
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2758:1: (lv_eAnnotations_3_0= ruleEAnnotation )
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2759:3: lv_eAnnotations_3_0= ruleEAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRGBColorAccess().getEAnnotationsEAnnotationParserRuleCall_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_ruleRGBColor5584);
                    	    lv_eAnnotations_3_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRGBColorRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"eAnnotations",
                    	            		lv_eAnnotations_3_0, 
                    	            		"EAnnotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2775:6: ( (lv_name_4_0= ruleEString ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2776:1: (lv_name_4_0= ruleEString )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2776:1: (lv_name_4_0= ruleEString )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2777:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRGBColorAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRGBColor5609);
            lv_name_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRGBColorRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2793:2: (otherlv_5= '(' ( (lv_red_6_0= ruleEInt ) )? otherlv_7= ',' ( (lv_green_8_0= ruleEInt ) )? otherlv_9= ',' ( (lv_blue_10_0= ruleEInt ) )? otherlv_11= ')' )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2793:4: otherlv_5= '(' ( (lv_red_6_0= ruleEInt ) )? otherlv_7= ',' ( (lv_green_8_0= ruleEInt ) )? otherlv_9= ',' ( (lv_blue_10_0= ruleEInt ) )? otherlv_11= ')'
            {
            otherlv_5=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleRGBColor5622); 

                	newLeafNode(otherlv_5, grammarAccess.getRGBColorAccess().getLeftParenthesisKeyword_3_0());
                
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2797:1: ( (lv_red_6_0= ruleEInt ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_INT||LA63_0==51) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2798:1: (lv_red_6_0= ruleEInt )
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2798:1: (lv_red_6_0= ruleEInt )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2799:3: lv_red_6_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getRGBColorAccess().getRedEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRGBColor5643);
                    lv_red_6_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRGBColorRule());
                    	        }
                           		set(
                           			current, 
                           			"red",
                            		lv_red_6_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleRGBColor5656); 

                	newLeafNode(otherlv_7, grammarAccess.getRGBColorAccess().getCommaKeyword_3_2());
                
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2819:1: ( (lv_green_8_0= ruleEInt ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_INT||LA64_0==51) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2820:1: (lv_green_8_0= ruleEInt )
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2820:1: (lv_green_8_0= ruleEInt )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2821:3: lv_green_8_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getRGBColorAccess().getGreenEIntParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRGBColor5677);
                    lv_green_8_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRGBColorRule());
                    	        }
                           		set(
                           			current, 
                           			"green",
                            		lv_green_8_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleRGBColor5690); 

                	newLeafNode(otherlv_9, grammarAccess.getRGBColorAccess().getCommaKeyword_3_4());
                
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2841:1: ( (lv_blue_10_0= ruleEInt ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_INT||LA65_0==51) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2842:1: (lv_blue_10_0= ruleEInt )
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2842:1: (lv_blue_10_0= ruleEInt )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2843:3: lv_blue_10_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getRGBColorAccess().getBlueEIntParserRuleCall_3_5_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRGBColor5711);
                    lv_blue_10_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRGBColorRule());
                    	        }
                           		set(
                           			current, 
                           			"blue",
                            		lv_blue_10_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleRGBColor5724); 

                	newLeafNode(otherlv_11, grammarAccess.getRGBColorAccess().getRightParenthesisKeyword_3_6());
                

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
    // $ANTLR end "ruleRGBColor"


    // $ANTLR start "entryRuleStyleListSettings"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2871:1: entryRuleStyleListSettings returns [EObject current=null] : iv_ruleStyleListSettings= ruleStyleListSettings EOF ;
    public final EObject entryRuleStyleListSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyleListSettings = null;


        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2872:2: (iv_ruleStyleListSettings= ruleStyleListSettings EOF )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2873:2: iv_ruleStyleListSettings= ruleStyleListSettings EOF
            {
             newCompositeNode(grammarAccess.getStyleListSettingsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStyleListSettings_in_entryRuleStyleListSettings5761);
            iv_ruleStyleListSettings=ruleStyleListSettings();

            state._fsp--;

             current =iv_ruleStyleListSettings; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStyleListSettings5771); 

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
    // $ANTLR end "entryRuleStyleListSettings"


    // $ANTLR start "ruleStyleListSettings"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2880:1: ruleStyleListSettings returns [EObject current=null] : ( ( (lv_separatorShow_0_0= 'separatorShow' ) )? otherlv_1= 'ListSettings' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (lv_listStyle_5_0= ruleListStyle ) ) )? otherlv_6= ')' ) ;
    public final EObject ruleStyleListSettings() throws RecognitionException {
        EObject current = null;

        Token lv_separatorShow_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_listStyle_5_0 = null;


         enterRule(); 
            
        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2883:28: ( ( ( (lv_separatorShow_0_0= 'separatorShow' ) )? otherlv_1= 'ListSettings' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (lv_listStyle_5_0= ruleListStyle ) ) )? otherlv_6= ')' ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2884:1: ( ( (lv_separatorShow_0_0= 'separatorShow' ) )? otherlv_1= 'ListSettings' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (lv_listStyle_5_0= ruleListStyle ) ) )? otherlv_6= ')' )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2884:1: ( ( (lv_separatorShow_0_0= 'separatorShow' ) )? otherlv_1= 'ListSettings' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (lv_listStyle_5_0= ruleListStyle ) ) )? otherlv_6= ')' )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2884:2: ( (lv_separatorShow_0_0= 'separatorShow' ) )? otherlv_1= 'ListSettings' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (lv_listStyle_5_0= ruleListStyle ) ) )? otherlv_6= ')'
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2884:2: ( (lv_separatorShow_0_0= 'separatorShow' ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==44) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2885:1: (lv_separatorShow_0_0= 'separatorShow' )
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2885:1: (lv_separatorShow_0_0= 'separatorShow' )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2886:3: lv_separatorShow_0_0= 'separatorShow'
                    {
                    lv_separatorShow_0_0=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleStyleListSettings5814); 

                            newLeafNode(lv_separatorShow_0_0, grammarAccess.getStyleListSettingsAccess().getSeparatorShowSeparatorShowKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStyleListSettingsRule());
                    	        }
                           		setWithLastConsumed(current, "separatorShow", true, "separatorShow");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleStyleListSettings5840); 

                	newLeafNode(otherlv_1, grammarAccess.getStyleListSettingsAccess().getListSettingsKeyword_1());
                
            otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleStyleListSettings5852); 

                	newLeafNode(otherlv_2, grammarAccess.getStyleListSettingsAccess().getLeftParenthesisKeyword_2());
                
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2907:1: ( (otherlv_3= RULE_ID ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2908:1: (otherlv_3= RULE_ID )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2908:1: (otherlv_3= RULE_ID )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2909:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStyleListSettingsRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleStyleListSettings5872); 

            		newLeafNode(otherlv_3, grammarAccess.getStyleListSettingsAccess().getSeparatorColorRGBColorCrossReference_3_0()); 
            	

            }


            }

            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2920:2: (otherlv_4= ',' ( (lv_listStyle_5_0= ruleListStyle ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==11) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2920:4: otherlv_4= ',' ( (lv_listStyle_5_0= ruleListStyle ) )
                    {
                    otherlv_4=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleStyleListSettings5885); 

                        	newLeafNode(otherlv_4, grammarAccess.getStyleListSettingsAccess().getCommaKeyword_4_0());
                        
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2924:1: ( (lv_listStyle_5_0= ruleListStyle ) )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2925:1: (lv_listStyle_5_0= ruleListStyle )
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2925:1: (lv_listStyle_5_0= ruleListStyle )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2926:3: lv_listStyle_5_0= ruleListStyle
                    {
                     
                    	        newCompositeNode(grammarAccess.getStyleListSettingsAccess().getListStyleListStyleEnumRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleListStyle_in_ruleStyleListSettings5906);
                    lv_listStyle_5_0=ruleListStyle();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStyleListSettingsRule());
                    	        }
                           		set(
                           			current, 
                           			"listStyle",
                            		lv_listStyle_5_0, 
                            		"ListStyle");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleStyleListSettings5920); 

                	newLeafNode(otherlv_6, grammarAccess.getStyleListSettingsAccess().getRightParenthesisKeyword_5());
                

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
    // $ANTLR end "ruleStyleListSettings"


    // $ANTLR start "entryRuleStyleSelectionSettings"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2954:1: entryRuleStyleSelectionSettings returns [EObject current=null] : iv_ruleStyleSelectionSettings= ruleStyleSelectionSettings EOF ;
    public final EObject entryRuleStyleSelectionSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyleSelectionSettings = null;


        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2955:2: (iv_ruleStyleSelectionSettings= ruleStyleSelectionSettings EOF )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2956:2: iv_ruleStyleSelectionSettings= ruleStyleSelectionSettings EOF
            {
             newCompositeNode(grammarAccess.getStyleSelectionSettingsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStyleSelectionSettings_in_entryRuleStyleSelectionSettings5956);
            iv_ruleStyleSelectionSettings=ruleStyleSelectionSettings();

            state._fsp--;

             current =iv_ruleStyleSelectionSettings; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStyleSelectionSettings5966); 

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
    // $ANTLR end "entryRuleStyleSelectionSettings"


    // $ANTLR start "ruleStyleSelectionSettings"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2963:1: ruleStyleSelectionSettings returns [EObject current=null] : (otherlv_0= 'SelectionSettings' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleStyleSelectionSettings() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2966:28: ( (otherlv_0= 'SelectionSettings' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2967:1: (otherlv_0= 'SelectionSettings' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2967:1: (otherlv_0= 'SelectionSettings' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2967:3: otherlv_0= 'SelectionSettings' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleStyleSelectionSettings6003); 

                	newLeafNode(otherlv_0, grammarAccess.getStyleSelectionSettingsAccess().getSelectionSettingsKeyword_0());
                
            otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleStyleSelectionSettings6015); 

                	newLeafNode(otherlv_1, grammarAccess.getStyleSelectionSettingsAccess().getLeftParenthesisKeyword_1());
                
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2975:1: ( (otherlv_2= RULE_ID ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2976:1: (otherlv_2= RULE_ID )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2976:1: (otherlv_2= RULE_ID )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:2977:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStyleSelectionSettingsRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleStyleSelectionSettings6035); 

            		newLeafNode(otherlv_2, grammarAccess.getStyleSelectionSettingsAccess().getSelectionColorRGBColorCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleStyleSelectionSettings6047); 

                	newLeafNode(otherlv_3, grammarAccess.getStyleSelectionSettingsAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleStyleSelectionSettings"


    // $ANTLR start "entryRuleStyleMenuSettings"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3000:1: entryRuleStyleMenuSettings returns [EObject current=null] : iv_ruleStyleMenuSettings= ruleStyleMenuSettings EOF ;
    public final EObject entryRuleStyleMenuSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyleMenuSettings = null;


        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3001:2: (iv_ruleStyleMenuSettings= ruleStyleMenuSettings EOF )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3002:2: iv_ruleStyleMenuSettings= ruleStyleMenuSettings EOF
            {
             newCompositeNode(grammarAccess.getStyleMenuSettingsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStyleMenuSettings_in_entryRuleStyleMenuSettings6083);
            iv_ruleStyleMenuSettings=ruleStyleMenuSettings();

            state._fsp--;

             current =iv_ruleStyleMenuSettings; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStyleMenuSettings6093); 

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
    // $ANTLR end "entryRuleStyleMenuSettings"


    // $ANTLR start "ruleStyleMenuSettings"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3009:1: ruleStyleMenuSettings returns [EObject current=null] : ( () ( (lv_fixedMenu_1_0= 'fixedMenu' ) )? otherlv_2= 'MenuSettings' otherlv_3= '(' ( (lv_menuStyle_4_0= ruleMenuStyle ) )? otherlv_5= ')' ) ;
    public final EObject ruleStyleMenuSettings() throws RecognitionException {
        EObject current = null;

        Token lv_fixedMenu_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_menuStyle_4_0 = null;


         enterRule(); 
            
        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3012:28: ( ( () ( (lv_fixedMenu_1_0= 'fixedMenu' ) )? otherlv_2= 'MenuSettings' otherlv_3= '(' ( (lv_menuStyle_4_0= ruleMenuStyle ) )? otherlv_5= ')' ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3013:1: ( () ( (lv_fixedMenu_1_0= 'fixedMenu' ) )? otherlv_2= 'MenuSettings' otherlv_3= '(' ( (lv_menuStyle_4_0= ruleMenuStyle ) )? otherlv_5= ')' )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3013:1: ( () ( (lv_fixedMenu_1_0= 'fixedMenu' ) )? otherlv_2= 'MenuSettings' otherlv_3= '(' ( (lv_menuStyle_4_0= ruleMenuStyle ) )? otherlv_5= ')' )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3013:2: () ( (lv_fixedMenu_1_0= 'fixedMenu' ) )? otherlv_2= 'MenuSettings' otherlv_3= '(' ( (lv_menuStyle_4_0= ruleMenuStyle ) )? otherlv_5= ')'
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3013:2: ()
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3014:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStyleMenuSettingsAccess().getStyleMenuSettingsAction_0(),
                        current);
                

            }

            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3019:2: ( (lv_fixedMenu_1_0= 'fixedMenu' ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==47) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3020:1: (lv_fixedMenu_1_0= 'fixedMenu' )
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3020:1: (lv_fixedMenu_1_0= 'fixedMenu' )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3021:3: lv_fixedMenu_1_0= 'fixedMenu'
                    {
                    lv_fixedMenu_1_0=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleStyleMenuSettings6145); 

                            newLeafNode(lv_fixedMenu_1_0, grammarAccess.getStyleMenuSettingsAccess().getFixedMenuFixedMenuKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStyleMenuSettingsRule());
                    	        }
                           		setWithLastConsumed(current, "fixedMenu", true, "fixedMenu");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleStyleMenuSettings6171); 

                	newLeafNode(otherlv_2, grammarAccess.getStyleMenuSettingsAccess().getMenuSettingsKeyword_2());
                
            otherlv_3=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleStyleMenuSettings6183); 

                	newLeafNode(otherlv_3, grammarAccess.getStyleMenuSettingsAccess().getLeftParenthesisKeyword_3());
                
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3042:1: ( (lv_menuStyle_4_0= ruleMenuStyle ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==52||LA69_0==54) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3043:1: (lv_menuStyle_4_0= ruleMenuStyle )
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3043:1: (lv_menuStyle_4_0= ruleMenuStyle )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3044:3: lv_menuStyle_4_0= ruleMenuStyle
                    {
                     
                    	        newCompositeNode(grammarAccess.getStyleMenuSettingsAccess().getMenuStyleMenuStyleEnumRuleCall_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleMenuStyle_in_ruleStyleMenuSettings6204);
                    lv_menuStyle_4_0=ruleMenuStyle();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStyleMenuSettingsRule());
                    	        }
                           		set(
                           			current, 
                           			"menuStyle",
                            		lv_menuStyle_4_0, 
                            		"MenuStyle");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleStyleMenuSettings6217); 

                	newLeafNode(otherlv_5, grammarAccess.getStyleMenuSettingsAccess().getRightParenthesisKeyword_5());
                

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
    // $ANTLR end "ruleStyleMenuSettings"


    // $ANTLR start "entryRuleEStringToStringMapEntry"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3072:1: entryRuleEStringToStringMapEntry returns [EObject current=null] : iv_ruleEStringToStringMapEntry= ruleEStringToStringMapEntry EOF ;
    public final EObject entryRuleEStringToStringMapEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEStringToStringMapEntry = null;


        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3073:2: (iv_ruleEStringToStringMapEntry= ruleEStringToStringMapEntry EOF )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3074:2: iv_ruleEStringToStringMapEntry= ruleEStringToStringMapEntry EOF
            {
             newCompositeNode(grammarAccess.getEStringToStringMapEntryRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEStringToStringMapEntry_in_entryRuleEStringToStringMapEntry6253);
            iv_ruleEStringToStringMapEntry=ruleEStringToStringMapEntry();

            state._fsp--;

             current =iv_ruleEStringToStringMapEntry; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEStringToStringMapEntry6263); 

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
    // $ANTLR end "entryRuleEStringToStringMapEntry"


    // $ANTLR start "ruleEStringToStringMapEntry"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3081:1: ruleEStringToStringMapEntry returns [EObject current=null] : ( () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) ) ;
    public final EObject ruleEStringToStringMapEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_key_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3084:28: ( ( () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3085:1: ( () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3085:1: ( () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3085:2: () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3085:2: ()
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3086:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEStringToStringMapEntryAccess().getEStringToStringMapEntryAction_0(),
                        current);
                

            }

            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3091:2: ( (lv_key_1_0= ruleEString ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3092:1: (lv_key_1_0= ruleEString )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3092:1: (lv_key_1_0= ruleEString )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3093:3: lv_key_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEStringToStringMapEntryAccess().getKeyEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEStringToStringMapEntry6318);
            lv_key_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEStringToStringMapEntryRule());
            	        }
                   		set(
                   			current, 
                   			"key",
                    		lv_key_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleEStringToStringMapEntry6330); 

                	newLeafNode(otherlv_2, grammarAccess.getEStringToStringMapEntryAccess().getEqualsSignKeyword_2());
                
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3113:1: ( (lv_value_3_0= ruleEString ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3114:1: (lv_value_3_0= ruleEString )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3114:1: (lv_value_3_0= ruleEString )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3115:3: lv_value_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEStringToStringMapEntryAccess().getValueEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEStringToStringMapEntry6351);
            lv_value_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEStringToStringMapEntryRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"EString");
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
    // $ANTLR end "ruleEStringToStringMapEntry"


    // $ANTLR start "entryRuleEAnnotation"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3139:1: entryRuleEAnnotation returns [EObject current=null] : iv_ruleEAnnotation= ruleEAnnotation EOF ;
    public final EObject entryRuleEAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAnnotation = null;


        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3140:2: (iv_ruleEAnnotation= ruleEAnnotation EOF )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3141:2: iv_ruleEAnnotation= ruleEAnnotation EOF
            {
             newCompositeNode(grammarAccess.getEAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEAnnotation_in_entryRuleEAnnotation6387);
            iv_ruleEAnnotation=ruleEAnnotation();

            state._fsp--;

             current =iv_ruleEAnnotation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEAnnotation6397); 

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
    // $ANTLR end "entryRuleEAnnotation"


    // $ANTLR start "ruleEAnnotation"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3148:1: ruleEAnnotation returns [EObject current=null] : ( () otherlv_1= '@' ( (lv_source_2_0= ruleEString ) )? (otherlv_3= '(' ( (lv_details_4_0= ruleEStringToStringMapEntry ) ) (otherlv_5= ',' ( (lv_details_6_0= ruleEStringToStringMapEntry ) ) )* otherlv_7= ')' )? ) ;
    public final EObject ruleEAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_source_2_0 = null;

        EObject lv_details_4_0 = null;

        EObject lv_details_6_0 = null;


         enterRule(); 
            
        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3151:28: ( ( () otherlv_1= '@' ( (lv_source_2_0= ruleEString ) )? (otherlv_3= '(' ( (lv_details_4_0= ruleEStringToStringMapEntry ) ) (otherlv_5= ',' ( (lv_details_6_0= ruleEStringToStringMapEntry ) ) )* otherlv_7= ')' )? ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3152:1: ( () otherlv_1= '@' ( (lv_source_2_0= ruleEString ) )? (otherlv_3= '(' ( (lv_details_4_0= ruleEStringToStringMapEntry ) ) (otherlv_5= ',' ( (lv_details_6_0= ruleEStringToStringMapEntry ) ) )* otherlv_7= ')' )? )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3152:1: ( () otherlv_1= '@' ( (lv_source_2_0= ruleEString ) )? (otherlv_3= '(' ( (lv_details_4_0= ruleEStringToStringMapEntry ) ) (otherlv_5= ',' ( (lv_details_6_0= ruleEStringToStringMapEntry ) ) )* otherlv_7= ')' )? )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3152:2: () otherlv_1= '@' ( (lv_source_2_0= ruleEString ) )? (otherlv_3= '(' ( (lv_details_4_0= ruleEStringToStringMapEntry ) ) (otherlv_5= ',' ( (lv_details_6_0= ruleEStringToStringMapEntry ) ) )* otherlv_7= ')' )?
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3152:2: ()
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3153:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEAnnotationAccess().getEAnnotationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleEAnnotation6443); 

                	newLeafNode(otherlv_1, grammarAccess.getEAnnotationAccess().getCommercialAtKeyword_1());
                
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3162:1: ( (lv_source_2_0= ruleEString ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_STRING) ) {
                int LA70_1 = input.LA(2);

                if ( (LA70_1==28) ) {
                    int LA70_4 = input.LA(3);

                    if ( ((LA70_4>=RULE_ID && LA70_4<=RULE_STRING)) ) {
                        alt70=1;
                    }
                }
                else if ( (LA70_1==EOF||(LA70_1>=RULE_ID && LA70_1<=RULE_STRING)||(LA70_1>=11 && LA70_1<=12)||(LA70_1>=30 && LA70_1<=43)) ) {
                    alt70=1;
                }
            }
            else if ( (LA70_0==RULE_ID) ) {
                int LA70_2 = input.LA(2);

                if ( (LA70_2==28) ) {
                    int LA70_4 = input.LA(3);

                    if ( ((LA70_4>=RULE_ID && LA70_4<=RULE_STRING)) ) {
                        alt70=1;
                    }
                }
                else if ( (LA70_2==EOF||(LA70_2>=RULE_ID && LA70_2<=RULE_STRING)||(LA70_2>=11 && LA70_2<=12)||(LA70_2>=30 && LA70_2<=43)) ) {
                    alt70=1;
                }
            }
            switch (alt70) {
                case 1 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3163:1: (lv_source_2_0= ruleEString )
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3163:1: (lv_source_2_0= ruleEString )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3164:3: lv_source_2_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEAnnotationAccess().getSourceEStringParserRuleCall_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEAnnotation6464);
                    lv_source_2_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEAnnotationRule());
                    	        }
                           		set(
                           			current, 
                           			"source",
                            		lv_source_2_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3180:3: (otherlv_3= '(' ( (lv_details_4_0= ruleEStringToStringMapEntry ) ) (otherlv_5= ',' ( (lv_details_6_0= ruleEStringToStringMapEntry ) ) )* otherlv_7= ')' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==28) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3180:5: otherlv_3= '(' ( (lv_details_4_0= ruleEStringToStringMapEntry ) ) (otherlv_5= ',' ( (lv_details_6_0= ruleEStringToStringMapEntry ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleEAnnotation6478); 

                        	newLeafNode(otherlv_3, grammarAccess.getEAnnotationAccess().getLeftParenthesisKeyword_3_0());
                        
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3184:1: ( (lv_details_4_0= ruleEStringToStringMapEntry ) )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3185:1: (lv_details_4_0= ruleEStringToStringMapEntry )
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3185:1: (lv_details_4_0= ruleEStringToStringMapEntry )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3186:3: lv_details_4_0= ruleEStringToStringMapEntry
                    {
                     
                    	        newCompositeNode(grammarAccess.getEAnnotationAccess().getDetailsEStringToStringMapEntryParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEStringToStringMapEntry_in_ruleEAnnotation6499);
                    lv_details_4_0=ruleEStringToStringMapEntry();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEAnnotationRule());
                    	        }
                           		add(
                           			current, 
                           			"details",
                            		lv_details_4_0, 
                            		"EStringToStringMapEntry");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3202:2: (otherlv_5= ',' ( (lv_details_6_0= ruleEStringToStringMapEntry ) ) )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==11) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3202:4: otherlv_5= ',' ( (lv_details_6_0= ruleEStringToStringMapEntry ) )
                    	    {
                    	    otherlv_5=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleEAnnotation6512); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getEAnnotationAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3206:1: ( (lv_details_6_0= ruleEStringToStringMapEntry ) )
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3207:1: (lv_details_6_0= ruleEStringToStringMapEntry )
                    	    {
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3207:1: (lv_details_6_0= ruleEStringToStringMapEntry )
                    	    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3208:3: lv_details_6_0= ruleEStringToStringMapEntry
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEAnnotationAccess().getDetailsEStringToStringMapEntryParserRuleCall_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEStringToStringMapEntry_in_ruleEAnnotation6533);
                    	    lv_details_6_0=ruleEStringToStringMapEntry();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEAnnotationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"details",
                    	            		lv_details_6_0, 
                    	            		"EStringToStringMapEntry");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop71;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleEAnnotation6547); 

                        	newLeafNode(otherlv_7, grammarAccess.getEAnnotationAccess().getRightParenthesisKeyword_3_3());
                        

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
    // $ANTLR end "ruleEAnnotation"


    // $ANTLR start "entryRuleEString"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3236:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3237:2: (iv_ruleEString= ruleEString EOF )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3238:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString6586);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString6597); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3245:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3248:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3249:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3249:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==RULE_STRING) ) {
                alt73=1;
            }
            else if ( (LA73_0==RULE_ID) ) {
                alt73=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3249:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString6637); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3257:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString6663); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3272:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3273:2: (iv_ruleEInt= ruleEInt EOF )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3274:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt6709);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt6720); 

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3281:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3284:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3285:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3285:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3285:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3285:2: (kw= '-' )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==51) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3286:2: kw= '-'
                    {
                    kw=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleEInt6759); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt6776); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleListStyle"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3306:1: ruleListStyle returns [Enumerator current=null] : ( (enumLiteral_0= 'GRID' ) | (enumLiteral_1= 'LIST' ) ) ;
    public final Enumerator ruleListStyle() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3308:28: ( ( (enumLiteral_0= 'GRID' ) | (enumLiteral_1= 'LIST' ) ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3309:1: ( (enumLiteral_0= 'GRID' ) | (enumLiteral_1= 'LIST' ) )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3309:1: ( (enumLiteral_0= 'GRID' ) | (enumLiteral_1= 'LIST' ) )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==52) ) {
                alt75=1;
            }
            else if ( (LA75_0==53) ) {
                alt75=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3309:2: (enumLiteral_0= 'GRID' )
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3309:2: (enumLiteral_0= 'GRID' )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3309:4: enumLiteral_0= 'GRID'
                    {
                    enumLiteral_0=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleListStyle6835); 

                            current = grammarAccess.getListStyleAccess().getGRIDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getListStyleAccess().getGRIDEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3315:6: (enumLiteral_1= 'LIST' )
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3315:6: (enumLiteral_1= 'LIST' )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3315:8: enumLiteral_1= 'LIST'
                    {
                    enumLiteral_1=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleListStyle6852); 

                            current = grammarAccess.getListStyleAccess().getLISTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getListStyleAccess().getLISTEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleListStyle"


    // $ANTLR start "ruleMenuStyle"
    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3325:1: ruleMenuStyle returns [Enumerator current=null] : ( (enumLiteral_0= 'TILE' ) | (enumLiteral_1= 'GRID' ) ) ;
    public final Enumerator ruleMenuStyle() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3327:28: ( ( (enumLiteral_0= 'TILE' ) | (enumLiteral_1= 'GRID' ) ) )
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3328:1: ( (enumLiteral_0= 'TILE' ) | (enumLiteral_1= 'GRID' ) )
            {
            // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3328:1: ( (enumLiteral_0= 'TILE' ) | (enumLiteral_1= 'GRID' ) )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==54) ) {
                alt76=1;
            }
            else if ( (LA76_0==52) ) {
                alt76=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3328:2: (enumLiteral_0= 'TILE' )
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3328:2: (enumLiteral_0= 'TILE' )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3328:4: enumLiteral_0= 'TILE'
                    {
                    enumLiteral_0=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleMenuStyle6897); 

                            current = grammarAccess.getMenuStyleAccess().getTILEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getMenuStyleAccess().getTILEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3334:6: (enumLiteral_1= 'GRID' )
                    {
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3334:6: (enumLiteral_1= 'GRID' )
                    // ../pimar.editor.textual.xgcore/src-gen/pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.g:3334:8: enumLiteral_1= 'GRID'
                    {
                    enumLiteral_1=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleMenuStyle6914); 

                            current = grammarAccess.getMenuStyleAccess().getGRIDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getMenuStyleAccess().getGRIDEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleMenuStyle"

    // Delegated rules


    protected DFA17 dfa17 = new DFA17(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA17_eotS =
        "\57\uffff";
    static final String DFA17_eofS =
        "\57\uffff";
    static final String DFA17_minS =
        "\1\36\1\4\15\uffff\2\13\1\4\1\62\2\61\2\4\2\13\1\4\2\13\2\61\1"+
        "\4\1\13\1\4\2\61\2\13\2\4\3\13\2\61\1\4\2\13";
    static final String DFA17_maxS =
        "\1\62\1\53\15\uffff\2\53\1\5\1\62\2\61\1\53\1\5\2\53\1\5\2\35\2"+
        "\61\1\5\1\53\1\5\2\61\2\35\2\5\1\53\2\35\2\61\1\5\2\35";
    static final String DFA17_acceptS =
        "\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\40\uffff";
    static final String DFA17_specialS =
        "\57\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\2\1\3\1\4\1\5\1\6\1\7\2\10\1\11\1\12\1\13\1\14\1\15\1\16"+
            "\6\uffff\1\1",
            "\1\20\1\17\5\uffff\1\22\20\uffff\1\21\1\uffff\1\2\1\3\1\4"+
            "\1\5\1\6\1\7\2\10\1\11\1\12\1\13\1\14\1\15\1\16",
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
            "",
            "",
            "\1\22\20\uffff\1\21\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7\2\10\1"+
            "\11\1\12\1\13\1\14\1\15\1\16",
            "\1\22\20\uffff\1\21\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7\2\10\1"+
            "\11\1\12\1\13\1\14\1\15\1\16",
            "\1\24\1\23",
            "\1\25",
            "\1\26",
            "\1\26",
            "\1\30\1\27\5\uffff\1\22\20\uffff\1\31\1\uffff\1\2\1\3\1\4"+
            "\1\5\1\6\1\7\2\10\1\11\1\12\1\13\1\14\1\15\1\16",
            "\1\33\1\32",
            "\1\22\20\uffff\1\31\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7\2\10\1"+
            "\11\1\12\1\13\1\14\1\15\1\16",
            "\1\22\20\uffff\1\31\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7\2\10\1"+
            "\11\1\12\1\13\1\14\1\15\1\16",
            "\1\35\1\34",
            "\1\36\21\uffff\1\37",
            "\1\36\21\uffff\1\37",
            "\1\40",
            "\1\40",
            "\1\42\1\41",
            "\1\22\22\uffff\1\2\1\3\1\4\1\5\1\6\1\7\2\10\1\11\1\12\1\13"+
            "\1\14\1\15\1\16",
            "\1\44\1\43",
            "\1\45",
            "\1\45",
            "\1\46\21\uffff\1\47",
            "\1\46\21\uffff\1\47",
            "\1\51\1\50",
            "\1\53\1\52",
            "\1\22\22\uffff\1\2\1\3\1\4\1\5\1\6\1\7\2\10\1\11\1\12\1\13"+
            "\1\14\1\15\1\16",
            "\1\36\21\uffff\1\37",
            "\1\36\21\uffff\1\37",
            "\1\54",
            "\1\54",
            "\1\56\1\55",
            "\1\46\21\uffff\1\47",
            "\1\46\21\uffff\1\47"
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "534:1: (this_EditPage_0= ruleEditPage | this_ListPage_1= ruleListPage | this_ViewPage_2= ruleViewPage | this_CustomPage_3= ruleCustomPage | this_LoginPage_4= ruleLoginPage | this_ProcessSelectorPage_5= ruleProcessSelectorPage | this_SelectableListPage_6= ruleSelectableListPage | this_MapPage_7= ruleMapPage | this_MediaPage_8= ruleMediaPage | this_ELearningPage_9= ruleELearningPage | this_TakePicturePage_10= ruleTakePicturePage | this_RecordAudioPage_11= ruleRecordAudioPage | this_ARPage_12= ruleARPage )";
        }
    }
    static final String DFA18_eotS =
        "\46\uffff";
    static final String DFA18_eofS =
        "\46\uffff";
    static final String DFA18_minS =
        "\1\37\1\4\4\uffff\2\13\1\4\1\62\2\61\2\4\2\13\1\4\2\13\2\61\1\4"+
        "\1\13\1\4\2\61\2\13\2\4\3\13\2\61\1\4\2\13";
    static final String DFA18_maxS =
        "\1\62\1\50\4\uffff\2\50\1\5\1\62\2\61\1\50\1\5\2\50\1\5\2\35\2"+
        "\61\1\5\1\50\1\5\2\61\2\35\2\5\1\50\2\35\2\61\1\5\2\35";
    static final String DFA18_acceptS =
        "\2\uffff\1\1\1\2\1\3\1\4\40\uffff";
    static final String DFA18_specialS =
        "\46\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\2\1\3\2\uffff\1\4\4\uffff\1\5\11\uffff\1\1",
            "\1\7\1\6\5\uffff\1\11\20\uffff\1\10\2\uffff\1\2\1\3\2\uffff"+
            "\1\4\4\uffff\1\5",
            "",
            "",
            "",
            "",
            "\1\11\20\uffff\1\10\2\uffff\1\2\1\3\2\uffff\1\4\4\uffff\1"+
            "\5",
            "\1\11\20\uffff\1\10\2\uffff\1\2\1\3\2\uffff\1\4\4\uffff\1"+
            "\5",
            "\1\13\1\12",
            "\1\14",
            "\1\15",
            "\1\15",
            "\1\17\1\16\5\uffff\1\11\20\uffff\1\20\2\uffff\1\2\1\3\2\uffff"+
            "\1\4\4\uffff\1\5",
            "\1\22\1\21",
            "\1\11\20\uffff\1\20\2\uffff\1\2\1\3\2\uffff\1\4\4\uffff\1"+
            "\5",
            "\1\11\20\uffff\1\20\2\uffff\1\2\1\3\2\uffff\1\4\4\uffff\1"+
            "\5",
            "\1\24\1\23",
            "\1\25\21\uffff\1\26",
            "\1\25\21\uffff\1\26",
            "\1\27",
            "\1\27",
            "\1\31\1\30",
            "\1\11\23\uffff\1\2\1\3\2\uffff\1\4\4\uffff\1\5",
            "\1\33\1\32",
            "\1\34",
            "\1\34",
            "\1\35\21\uffff\1\36",
            "\1\35\21\uffff\1\36",
            "\1\40\1\37",
            "\1\42\1\41",
            "\1\11\23\uffff\1\2\1\3\2\uffff\1\4\4\uffff\1\5",
            "\1\25\21\uffff\1\26",
            "\1\25\21\uffff\1\26",
            "\1\43",
            "\1\43",
            "\1\45\1\44",
            "\1\35\21\uffff\1\36",
            "\1\35\21\uffff\1\36"
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "684:1: (this_ListPage_0= ruleListPage | this_ViewPage_1= ruleViewPage | this_ProcessSelectorPage_2= ruleProcessSelectorPage | this_ELearningPage_3= ruleELearningPage )";
        }
    }
    static final String DFA19_eotS =
        "\44\uffff";
    static final String DFA19_eofS =
        "\44\uffff";
    static final String DFA19_minS =
        "\1\37\1\4\2\uffff\2\13\1\4\1\62\2\61\2\4\2\13\1\4\2\13\2\61\1\4"+
        "\1\13\1\4\2\61\2\13\2\4\3\13\2\61\1\4\2\13";
    static final String DFA19_maxS =
        "\1\62\1\45\2\uffff\2\45\1\5\1\62\2\61\1\45\1\5\2\45\1\5\2\35\2"+
        "\61\1\5\1\45\1\5\2\61\2\35\2\5\1\45\2\35\2\61\1\5\2\35";
    static final String DFA19_acceptS =
        "\2\uffff\1\1\1\2\40\uffff";
    static final String DFA19_specialS =
        "\44\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\2\4\uffff\2\3\14\uffff\1\1",
            "\1\5\1\4\5\uffff\1\7\20\uffff\1\6\2\uffff\1\2\4\uffff\2\3",
            "",
            "",
            "\1\7\20\uffff\1\6\2\uffff\1\2\4\uffff\2\3",
            "\1\7\20\uffff\1\6\2\uffff\1\2\4\uffff\2\3",
            "\1\11\1\10",
            "\1\12",
            "\1\13",
            "\1\13",
            "\1\15\1\14\5\uffff\1\7\20\uffff\1\16\2\uffff\1\2\4\uffff\2"+
            "\3",
            "\1\20\1\17",
            "\1\7\20\uffff\1\16\2\uffff\1\2\4\uffff\2\3",
            "\1\7\20\uffff\1\16\2\uffff\1\2\4\uffff\2\3",
            "\1\22\1\21",
            "\1\23\21\uffff\1\24",
            "\1\23\21\uffff\1\24",
            "\1\25",
            "\1\25",
            "\1\27\1\26",
            "\1\7\23\uffff\1\2\4\uffff\2\3",
            "\1\31\1\30",
            "\1\32",
            "\1\32",
            "\1\33\21\uffff\1\34",
            "\1\33\21\uffff\1\34",
            "\1\36\1\35",
            "\1\40\1\37",
            "\1\7\23\uffff\1\2\4\uffff\2\3",
            "\1\23\21\uffff\1\24",
            "\1\23\21\uffff\1\24",
            "\1\41",
            "\1\41",
            "\1\43\1\42",
            "\1\33\21\uffff\1\34",
            "\1\33\21\uffff\1\34"
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "744:1: (this_ListPage_0= ruleListPage | this_SelectableListPage_1= ruleSelectableListPage )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_rulePageContainer_in_entryRulePageContainer75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePageContainer85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_rulePageContainer141 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_11_in_rulePageContainer154 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_rulePageContainer175 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_12_in_rulePageContainer191 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulePageContainer212 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_rulePageContainer224 = new BitSet(new long[]{0x00000000007FC000L});
        public static final BitSet FOLLOW_14_in_rulePageContainer237 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulePageContainer258 = new BitSet(new long[]{0x00000000007F8000L});
        public static final BitSet FOLLOW_15_in_rulePageContainer273 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulePageContainer294 = new BitSet(new long[]{0x00000000007F0000L});
        public static final BitSet FOLLOW_16_in_rulePageContainer309 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_rulePageContainer321 = new BitSet(new long[]{0x0000000003000000L});
        public static final BitSet FOLLOW_ruleStyleSetting_in_rulePageContainer342 = new BitSet(new long[]{0x0000000000020800L});
        public static final BitSet FOLLOW_11_in_rulePageContainer355 = new BitSet(new long[]{0x0000000003000000L});
        public static final BitSet FOLLOW_ruleStyleSetting_in_rulePageContainer376 = new BitSet(new long[]{0x0000000000020800L});
        public static final BitSet FOLLOW_17_in_rulePageContainer390 = new BitSet(new long[]{0x00000000007E0000L});
        public static final BitSet FOLLOW_18_in_rulePageContainer405 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_rulePageContainer417 = new BitSet(new long[]{0x0004000000000030L});
        public static final BitSet FOLLOW_ruleMenu_in_rulePageContainer438 = new BitSet(new long[]{0x0000000000020800L});
        public static final BitSet FOLLOW_11_in_rulePageContainer451 = new BitSet(new long[]{0x0004000000000030L});
        public static final BitSet FOLLOW_ruleMenu_in_rulePageContainer472 = new BitSet(new long[]{0x0000000000020800L});
        public static final BitSet FOLLOW_17_in_rulePageContainer486 = new BitSet(new long[]{0x00000000007A0000L});
        public static final BitSet FOLLOW_19_in_rulePageContainer501 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_rulePageContainer513 = new BitSet(new long[]{0x00040FFFC0000000L});
        public static final BitSet FOLLOW_rulePage_in_rulePageContainer534 = new BitSet(new long[]{0x0000000000020800L});
        public static final BitSet FOLLOW_11_in_rulePageContainer547 = new BitSet(new long[]{0x00040FFFC0000000L});
        public static final BitSet FOLLOW_rulePage_in_rulePageContainer568 = new BitSet(new long[]{0x0000000000020800L});
        public static final BitSet FOLLOW_17_in_rulePageContainer582 = new BitSet(new long[]{0x0000000000720000L});
        public static final BitSet FOLLOW_20_in_rulePageContainer597 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_rulePageContainer609 = new BitSet(new long[]{0x0004010980000000L});
        public static final BitSet FOLLOW_ruleMenuablePage_in_rulePageContainer630 = new BitSet(new long[]{0x0000000000020800L});
        public static final BitSet FOLLOW_11_in_rulePageContainer643 = new BitSet(new long[]{0x0004010980000000L});
        public static final BitSet FOLLOW_ruleMenuablePage_in_rulePageContainer664 = new BitSet(new long[]{0x0000000000020800L});
        public static final BitSet FOLLOW_17_in_rulePageContainer678 = new BitSet(new long[]{0x0000000000620000L});
        public static final BitSet FOLLOW_21_in_rulePageContainer693 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_rulePageContainer705 = new BitSet(new long[]{0x0004003080000000L});
        public static final BitSet FOLLOW_ruleListablePage_in_rulePageContainer726 = new BitSet(new long[]{0x0000000000020800L});
        public static final BitSet FOLLOW_11_in_rulePageContainer739 = new BitSet(new long[]{0x0004003080000000L});
        public static final BitSet FOLLOW_ruleListablePage_in_rulePageContainer760 = new BitSet(new long[]{0x0000000000020800L});
        public static final BitSet FOLLOW_17_in_rulePageContainer774 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_rulePageContainer789 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_rulePageContainer801 = new BitSet(new long[]{0x0004003000000000L});
        public static final BitSet FOLLOW_ruleSelectablePage_in_rulePageContainer822 = new BitSet(new long[]{0x0000000000020800L});
        public static final BitSet FOLLOW_11_in_rulePageContainer835 = new BitSet(new long[]{0x0004003000000000L});
        public static final BitSet FOLLOW_ruleSelectablePage_in_rulePageContainer856 = new BitSet(new long[]{0x0000000000020800L});
        public static final BitSet FOLLOW_17_in_rulePageContainer870 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_rulePageContainer884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePage_in_entryRulePage920 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePage930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEditPage_in_rulePage977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleListPage_in_rulePage1004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleViewPage_in_rulePage1031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCustomPage_in_rulePage1058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLoginPage_in_rulePage1085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProcessSelectorPage_in_rulePage1112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelectableListPage_in_rulePage1139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMapPage_in_rulePage1166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMediaPage_in_rulePage1193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleELearningPage_in_rulePage1220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTakePicturePage_in_rulePage1247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRecordAudioPage_in_rulePage1274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleARPage_in_rulePage1301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMenuablePage_in_entryRuleMenuablePage1336 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMenuablePage1346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleListPage_in_ruleMenuablePage1393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleViewPage_in_ruleMenuablePage1420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProcessSelectorPage_in_ruleMenuablePage1447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleELearningPage_in_ruleMenuablePage1474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleListablePage_in_entryRuleListablePage1509 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleListablePage1519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleListPage_in_ruleListablePage1566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelectableListPage_in_ruleListablePage1593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelectablePage_in_entryRuleSelectablePage1628 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSelectablePage1638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelectableListPage_in_ruleSelectablePage1684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMenu_in_entryRuleMenu1718 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMenu1728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleMenu1775 = new BitSet(new long[]{0x0000000000000830L});
        public static final BitSet FOLLOW_11_in_ruleMenu1788 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleMenu1809 = new BitSet(new long[]{0x0000000000000830L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMenu1834 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleMenu1846 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMenu1869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStyleSetting_in_entryRuleStyleSetting1905 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStyleSetting1915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleStyleSetting1953 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleStyleSetting1965 = new BitSet(new long[]{0x0004000000000030L});
        public static final BitSet FOLLOW_ruleRGBColor_in_ruleStyleSetting1986 = new BitSet(new long[]{0x0000000000020800L});
        public static final BitSet FOLLOW_11_in_ruleStyleSetting1999 = new BitSet(new long[]{0x0004000000000030L});
        public static final BitSet FOLLOW_ruleRGBColor_in_ruleStyleSetting2020 = new BitSet(new long[]{0x0000000000020800L});
        public static final BitSet FOLLOW_17_in_ruleStyleSetting2034 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleStyleSetting2048 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleStyleSetting2068 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleStyleSetting2080 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleStyleSetting2100 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleStylePageSettings_in_ruleStyleSetting2121 = new BitSet(new long[]{0x0001F00000000002L});
        public static final BitSet FOLLOW_ruleStyleMenuSettings_in_ruleStyleSetting2142 = new BitSet(new long[]{0x0000700000000002L});
        public static final BitSet FOLLOW_ruleStyleSelectionSettings_in_ruleStyleSetting2164 = new BitSet(new long[]{0x0000300000000002L});
        public static final BitSet FOLLOW_ruleStyleListSettings_in_ruleStyleSetting2186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStylePageSettings_in_entryRuleStylePageSettings2223 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStylePageSettings2233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleStylePageSettings2270 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleStylePageSettings2282 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleStylePageSettings2302 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleStylePageSettings2314 = new BitSet(new long[]{0x0008000000000840L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleStylePageSettings2335 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleStylePageSettings2348 = new BitSet(new long[]{0x0008000000000840L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleStylePageSettings2369 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleStylePageSettings2382 = new BitSet(new long[]{0x0008000020000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleStylePageSettings2403 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleStylePageSettings2416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEditPage_in_entryRuleEditPage2452 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEditPage2462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEditPage2509 = new BitSet(new long[]{0x0000000040000800L});
        public static final BitSet FOLLOW_11_in_ruleEditPage2522 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleEditPage2543 = new BitSet(new long[]{0x0000000040000800L});
        public static final BitSet FOLLOW_30_in_ruleEditPage2559 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEditPage2580 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleEditPage2592 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEditPage2615 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleEditPage2627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleListPage_in_entryRuleListPage2663 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleListPage2673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleListPage2720 = new BitSet(new long[]{0x0000000080000800L});
        public static final BitSet FOLLOW_11_in_ruleListPage2733 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleListPage2754 = new BitSet(new long[]{0x0000000080000800L});
        public static final BitSet FOLLOW_31_in_ruleListPage2770 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleListPage2791 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleListPage2803 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleListPage2826 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleListPage2838 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleListPage2861 = new BitSet(new long[]{0x0000000020000800L});
        public static final BitSet FOLLOW_11_in_ruleListPage2874 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleListPage2897 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleListPage2911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleViewPage_in_entryRuleViewPage2947 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleViewPage2957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleViewPage3004 = new BitSet(new long[]{0x0000000100000800L});
        public static final BitSet FOLLOW_11_in_ruleViewPage3017 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleViewPage3038 = new BitSet(new long[]{0x0000000100000800L});
        public static final BitSet FOLLOW_32_in_ruleViewPage3054 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleViewPage3075 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleViewPage3087 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleViewPage3110 = new BitSet(new long[]{0x0000000020000800L});
        public static final BitSet FOLLOW_11_in_ruleViewPage3123 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleViewPage3146 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleViewPage3160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCustomPage_in_entryRuleCustomPage3196 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCustomPage3206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleCustomPage3253 = new BitSet(new long[]{0x0000000200000800L});
        public static final BitSet FOLLOW_11_in_ruleCustomPage3266 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleCustomPage3287 = new BitSet(new long[]{0x0000000200000800L});
        public static final BitSet FOLLOW_33_in_ruleCustomPage3303 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCustomPage3324 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleCustomPage3336 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCustomPage3359 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleCustomPage3371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLoginPage_in_entryRuleLoginPage3407 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLoginPage3417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleLoginPage3464 = new BitSet(new long[]{0x0000000400000800L});
        public static final BitSet FOLLOW_11_in_ruleLoginPage3477 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleLoginPage3498 = new BitSet(new long[]{0x0000000400000800L});
        public static final BitSet FOLLOW_34_in_ruleLoginPage3514 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleLoginPage3535 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleLoginPage3547 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleLoginPage3570 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleLoginPage3582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProcessSelectorPage_in_entryRuleProcessSelectorPage3618 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProcessSelectorPage3628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleProcessSelectorPage3675 = new BitSet(new long[]{0x0000000800000800L});
        public static final BitSet FOLLOW_11_in_ruleProcessSelectorPage3688 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleProcessSelectorPage3709 = new BitSet(new long[]{0x0000000800000800L});
        public static final BitSet FOLLOW_35_in_ruleProcessSelectorPage3725 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleProcessSelectorPage3746 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleProcessSelectorPage3758 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleProcessSelectorPage3781 = new BitSet(new long[]{0x0000000020000800L});
        public static final BitSet FOLLOW_11_in_ruleProcessSelectorPage3794 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleProcessSelectorPage3817 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleProcessSelectorPage3831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelectableListPage_in_entryRuleSelectableListPage3867 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSelectableListPage3877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleSelectableListPage3924 = new BitSet(new long[]{0x0000003000000800L});
        public static final BitSet FOLLOW_11_in_ruleSelectableListPage3937 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleSelectableListPage3958 = new BitSet(new long[]{0x0000003000000800L});
        public static final BitSet FOLLOW_36_in_ruleSelectableListPage3980 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleSelectableListPage4006 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSelectableListPage4027 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleSelectableListPage4039 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSelectableListPage4062 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleSelectableListPage4074 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSelectableListPage4097 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleSelectableListPage4109 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSelectableListPage4132 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleSelectableListPage4144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMapPage_in_entryRuleMapPage4180 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMapPage4190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleMapPage4237 = new BitSet(new long[]{0x0000004000000800L});
        public static final BitSet FOLLOW_11_in_ruleMapPage4250 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleMapPage4271 = new BitSet(new long[]{0x0000004000000800L});
        public static final BitSet FOLLOW_38_in_ruleMapPage4287 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMapPage4308 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleMapPage4320 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMapPage4343 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleMapPage4355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMediaPage_in_entryRuleMediaPage4391 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMediaPage4401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleMediaPage4448 = new BitSet(new long[]{0x0000008000000800L});
        public static final BitSet FOLLOW_11_in_ruleMediaPage4461 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleMediaPage4482 = new BitSet(new long[]{0x0000008000000800L});
        public static final BitSet FOLLOW_39_in_ruleMediaPage4498 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMediaPage4519 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleMediaPage4531 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMediaPage4554 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleMediaPage4566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleELearningPage_in_entryRuleELearningPage4602 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleELearningPage4612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleELearningPage4659 = new BitSet(new long[]{0x0000010000000800L});
        public static final BitSet FOLLOW_11_in_ruleELearningPage4672 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleELearningPage4693 = new BitSet(new long[]{0x0000010000000800L});
        public static final BitSet FOLLOW_40_in_ruleELearningPage4709 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleELearningPage4730 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleELearningPage4742 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleELearningPage4765 = new BitSet(new long[]{0x0000000020000800L});
        public static final BitSet FOLLOW_11_in_ruleELearningPage4778 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleELearningPage4801 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleELearningPage4815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTakePicturePage_in_entryRuleTakePicturePage4851 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTakePicturePage4861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleTakePicturePage4908 = new BitSet(new long[]{0x0000020000000800L});
        public static final BitSet FOLLOW_11_in_ruleTakePicturePage4921 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleTakePicturePage4942 = new BitSet(new long[]{0x0000020000000800L});
        public static final BitSet FOLLOW_41_in_ruleTakePicturePage4958 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTakePicturePage4979 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleTakePicturePage4991 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTakePicturePage5014 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleTakePicturePage5026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRecordAudioPage_in_entryRuleRecordAudioPage5062 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRecordAudioPage5072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleRecordAudioPage5119 = new BitSet(new long[]{0x0000040000000800L});
        public static final BitSet FOLLOW_11_in_ruleRecordAudioPage5132 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleRecordAudioPage5153 = new BitSet(new long[]{0x0000040000000800L});
        public static final BitSet FOLLOW_42_in_ruleRecordAudioPage5169 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRecordAudioPage5190 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleRecordAudioPage5202 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRecordAudioPage5225 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleRecordAudioPage5237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleARPage_in_entryRuleARPage5273 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleARPage5283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleARPage5330 = new BitSet(new long[]{0x0000080000000800L});
        public static final BitSet FOLLOW_11_in_ruleARPage5343 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleARPage5364 = new BitSet(new long[]{0x0000080000000800L});
        public static final BitSet FOLLOW_43_in_ruleARPage5380 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleARPage5401 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleARPage5413 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleARPage5436 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleARPage5448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRGBColor_in_entryRuleRGBColor5484 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRGBColor5494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleRGBColor5550 = new BitSet(new long[]{0x0000000000000830L});
        public static final BitSet FOLLOW_11_in_ruleRGBColor5563 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_ruleRGBColor5584 = new BitSet(new long[]{0x0000000000000830L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRGBColor5609 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleRGBColor5622 = new BitSet(new long[]{0x0008000000000840L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRGBColor5643 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleRGBColor5656 = new BitSet(new long[]{0x0008000000000840L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRGBColor5677 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleRGBColor5690 = new BitSet(new long[]{0x0008000020000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRGBColor5711 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleRGBColor5724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStyleListSettings_in_entryRuleStyleListSettings5761 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStyleListSettings5771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleStyleListSettings5814 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_45_in_ruleStyleListSettings5840 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleStyleListSettings5852 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleStyleListSettings5872 = new BitSet(new long[]{0x0000000020000800L});
        public static final BitSet FOLLOW_11_in_ruleStyleListSettings5885 = new BitSet(new long[]{0x0030000000000000L});
        public static final BitSet FOLLOW_ruleListStyle_in_ruleStyleListSettings5906 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleStyleListSettings5920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStyleSelectionSettings_in_entryRuleStyleSelectionSettings5956 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStyleSelectionSettings5966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleStyleSelectionSettings6003 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleStyleSelectionSettings6015 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleStyleSelectionSettings6035 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleStyleSelectionSettings6047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStyleMenuSettings_in_entryRuleStyleMenuSettings6083 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStyleMenuSettings6093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleStyleMenuSettings6145 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_48_in_ruleStyleMenuSettings6171 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleStyleMenuSettings6183 = new BitSet(new long[]{0x0050000020000000L});
        public static final BitSet FOLLOW_ruleMenuStyle_in_ruleStyleMenuSettings6204 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleStyleMenuSettings6217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEStringToStringMapEntry_in_entryRuleEStringToStringMapEntry6253 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEStringToStringMapEntry6263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEStringToStringMapEntry6318 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_49_in_ruleEStringToStringMapEntry6330 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEStringToStringMapEntry6351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEAnnotation_in_entryRuleEAnnotation6387 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEAnnotation6397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleEAnnotation6443 = new BitSet(new long[]{0x0000000010000032L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEAnnotation6464 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleEAnnotation6478 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEStringToStringMapEntry_in_ruleEAnnotation6499 = new BitSet(new long[]{0x0000000020000800L});
        public static final BitSet FOLLOW_11_in_ruleEAnnotation6512 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEStringToStringMapEntry_in_ruleEAnnotation6533 = new BitSet(new long[]{0x0000000020000800L});
        public static final BitSet FOLLOW_29_in_ruleEAnnotation6547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString6586 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString6597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString6637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString6663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt6709 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt6720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleEInt6759 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt6776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleListStyle6835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleListStyle6852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleMenuStyle6897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleMenuStyle6914 = new BitSet(new long[]{0x0000000000000002L});
    }


}