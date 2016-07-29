package pimar.editor.textual.xgcore.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import gcore.ARPage;
import gcore.CustomPage;
import gcore.ELearningPage;
import gcore.EditPage;
import gcore.GcorePackage;
import gcore.ListPage;
import gcore.LoginPage;
import gcore.MapPage;
import gcore.MediaPage;
import gcore.Menu;
import gcore.PageContainer;
import gcore.ProcessSelectorPage;
import gcore.RGBColor;
import gcore.RecordAudioPage;
import gcore.SelectableListPage;
import gcore.StyleListSettings;
import gcore.StyleMenuSettings;
import gcore.StylePageSettings;
import gcore.StyleSelectionSettings;
import gcore.StyleSetting;
import gcore.TakePicturePage;
import gcore.ViewPage;
import org.eclipse.emf.common.util.BasicEMap.Entry;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import pimar.editor.textual.xgcore.services.XgcoreGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractXgcoreSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private XgcoreGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == EcorePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case EcorePackage.EANNOTATION:
				if(context == grammarAccess.getEAnnotationRule()) {
					sequence_EAnnotation(context, (EAnnotation) semanticObject); 
					return; 
				}
				else break;
			case EcorePackage.ESTRING_TO_STRING_MAP_ENTRY:
				if(context == grammarAccess.getEStringToStringMapEntryRule()) {
					sequence_EStringToStringMapEntry(context, (Entry<?, ?>) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == GcorePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case GcorePackage.AR_PAGE:
				if(context == grammarAccess.getARPageRule() ||
				   context == grammarAccess.getPageRule()) {
					sequence_ARPage(context, (ARPage) semanticObject); 
					return; 
				}
				else break;
			case GcorePackage.CUSTOM_PAGE:
				if(context == grammarAccess.getCustomPageRule() ||
				   context == grammarAccess.getPageRule()) {
					sequence_CustomPage(context, (CustomPage) semanticObject); 
					return; 
				}
				else break;
			case GcorePackage.ELEARNING_PAGE:
				if(context == grammarAccess.getELearningPageRule() ||
				   context == grammarAccess.getMenuablePageRule() ||
				   context == grammarAccess.getPageRule()) {
					sequence_ELearningPage(context, (ELearningPage) semanticObject); 
					return; 
				}
				else break;
			case GcorePackage.EDIT_PAGE:
				if(context == grammarAccess.getEditPageRule() ||
				   context == grammarAccess.getPageRule()) {
					sequence_EditPage(context, (EditPage) semanticObject); 
					return; 
				}
				else break;
			case GcorePackage.LIST_PAGE:
				if(context == grammarAccess.getListPageRule() ||
				   context == grammarAccess.getListablePageRule() ||
				   context == grammarAccess.getMenuablePageRule() ||
				   context == grammarAccess.getPageRule()) {
					sequence_ListPage(context, (ListPage) semanticObject); 
					return; 
				}
				else break;
			case GcorePackage.LOGIN_PAGE:
				if(context == grammarAccess.getLoginPageRule() ||
				   context == grammarAccess.getPageRule()) {
					sequence_LoginPage(context, (LoginPage) semanticObject); 
					return; 
				}
				else break;
			case GcorePackage.MAP_PAGE:
				if(context == grammarAccess.getMapPageRule() ||
				   context == grammarAccess.getPageRule()) {
					sequence_MapPage(context, (MapPage) semanticObject); 
					return; 
				}
				else break;
			case GcorePackage.MEDIA_PAGE:
				if(context == grammarAccess.getMediaPageRule() ||
				   context == grammarAccess.getPageRule()) {
					sequence_MediaPage(context, (MediaPage) semanticObject); 
					return; 
				}
				else break;
			case GcorePackage.MENU:
				if(context == grammarAccess.getMenuRule()) {
					sequence_Menu(context, (Menu) semanticObject); 
					return; 
				}
				else break;
			case GcorePackage.PAGE_CONTAINER:
				if(context == grammarAccess.getPageContainerRule()) {
					sequence_PageContainer(context, (PageContainer) semanticObject); 
					return; 
				}
				else break;
			case GcorePackage.PROCESS_SELECTOR_PAGE:
				if(context == grammarAccess.getMenuablePageRule() ||
				   context == grammarAccess.getPageRule() ||
				   context == grammarAccess.getProcessSelectorPageRule()) {
					sequence_ProcessSelectorPage(context, (ProcessSelectorPage) semanticObject); 
					return; 
				}
				else break;
			case GcorePackage.RGB_COLOR:
				if(context == grammarAccess.getRGBColorRule()) {
					sequence_RGBColor(context, (RGBColor) semanticObject); 
					return; 
				}
				else break;
			case GcorePackage.RECORD_AUDIO_PAGE:
				if(context == grammarAccess.getPageRule() ||
				   context == grammarAccess.getRecordAudioPageRule()) {
					sequence_RecordAudioPage(context, (RecordAudioPage) semanticObject); 
					return; 
				}
				else break;
			case GcorePackage.SELECTABLE_LIST_PAGE:
				if(context == grammarAccess.getListablePageRule() ||
				   context == grammarAccess.getPageRule() ||
				   context == grammarAccess.getSelectableListPageRule() ||
				   context == grammarAccess.getSelectablePageRule()) {
					sequence_SelectableListPage(context, (SelectableListPage) semanticObject); 
					return; 
				}
				else break;
			case GcorePackage.STYLE_LIST_SETTINGS:
				if(context == grammarAccess.getStyleListSettingsRule()) {
					sequence_StyleListSettings(context, (StyleListSettings) semanticObject); 
					return; 
				}
				else break;
			case GcorePackage.STYLE_MENU_SETTINGS:
				if(context == grammarAccess.getStyleMenuSettingsRule()) {
					sequence_StyleMenuSettings(context, (StyleMenuSettings) semanticObject); 
					return; 
				}
				else break;
			case GcorePackage.STYLE_PAGE_SETTINGS:
				if(context == grammarAccess.getStylePageSettingsRule()) {
					sequence_StylePageSettings(context, (StylePageSettings) semanticObject); 
					return; 
				}
				else break;
			case GcorePackage.STYLE_SELECTION_SETTINGS:
				if(context == grammarAccess.getStyleSelectionSettingsRule()) {
					sequence_StyleSelectionSettings(context, (StyleSelectionSettings) semanticObject); 
					return; 
				}
				else break;
			case GcorePackage.STYLE_SETTING:
				if(context == grammarAccess.getStyleSettingRule()) {
					sequence_StyleSetting(context, (StyleSetting) semanticObject); 
					return; 
				}
				else break;
			case GcorePackage.TAKE_PICTURE_PAGE:
				if(context == grammarAccess.getPageRule() ||
				   context == grammarAccess.getTakePicturePageRule()) {
					sequence_TakePicturePage(context, (TakePicturePage) semanticObject); 
					return; 
				}
				else break;
			case GcorePackage.VIEW_PAGE:
				if(context == grammarAccess.getMenuablePageRule() ||
				   context == grammarAccess.getPageRule() ||
				   context == grammarAccess.getViewPageRule()) {
					sequence_ViewPage(context, (ViewPage) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     ((eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? name=EString pageStyle=[StylePageSettings|EString])
	 */
	protected void sequence_ARPage(EObject context, ARPage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? name=EString pageStyle=[StylePageSettings|EString])
	 */
	protected void sequence_CustomPage(EObject context, CustomPage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (source=EString? (details+=EStringToStringMapEntry details+=EStringToStringMapEntry*)?)
	 */
	protected void sequence_EAnnotation(EObject context, EAnnotation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? name=EString pageStyle=[StylePageSettings|EString] menu=[Menu|EString]?)
	 */
	protected void sequence_ELearningPage(EObject context, ELearningPage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (key=EString value=EString)
	 */
	protected void sequence_EStringToStringMapEntry(EObject context, Entry<?, ?> semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY__KEY));
			if(transientValues.isValueTransient((EObject)semanticObject, EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getEStringToStringMapEntryAccess().getKeyEStringParserRuleCall_1_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getEStringToStringMapEntryAccess().getValueEStringParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? name=EString pageStyle=[StylePageSettings|EString])
	 */
	protected void sequence_EditPage(EObject context, EditPage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         name=EString 
	 *         pageStyle=[StylePageSettings|EString] 
	 *         listablepageStyle=[StyleListSettings|EString] 
	 *         menu=[Menu|EString]?
	 *     )
	 */
	protected void sequence_ListPage(EObject context, ListPage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? name=EString pageStyle=[StylePageSettings|EString])
	 */
	protected void sequence_LoginPage(EObject context, LoginPage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? name=EString pageStyle=[StylePageSettings|EString])
	 */
	protected void sequence_MapPage(EObject context, MapPage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? name=EString pageStyle=[StylePageSettings|EString])
	 */
	protected void sequence_MediaPage(EObject context, MediaPage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? name=EString menuStyle=[StyleMenuSettings|EString])
	 */
	protected void sequence_Menu(EObject context, Menu semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         name=EString 
	 *         nsURI=EString? 
	 *         nsPrefix=EString? 
	 *         (styleSettings+=StyleSetting styleSettings+=StyleSetting*)? 
	 *         (menues+=Menu menues+=Menu*)? 
	 *         (pages+=Page pages+=Page*)? 
	 *         (menuablePages+=MenuablePage menuablePages+=MenuablePage*)? 
	 *         (listablePages+=ListablePage listablePages+=ListablePage*)? 
	 *         (selectablePages+=SelectablePage selectablePages+=SelectablePage*)?
	 *     )
	 */
	protected void sequence_PageContainer(EObject context, PageContainer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? name=EString pageStyle=[StylePageSettings|EString] menu=[Menu|EString]?)
	 */
	protected void sequence_ProcessSelectorPage(EObject context, ProcessSelectorPage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? name=EString red=EInt? green=EInt? blue=EInt?)
	 */
	protected void sequence_RGBColor(EObject context, RGBColor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? name=EString pageStyle=[StylePageSettings|EString])
	 */
	protected void sequence_RecordAudioPage(EObject context, RecordAudioPage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         multiSelection?='multiSelection'? 
	 *         name=EString 
	 *         pageStyle=[StylePageSettings|EString] 
	 *         selectablepageStyle=[StyleSelectionSettings|EString] 
	 *         listablepageStyle=[StyleListSettings|EString]
	 *     )
	 */
	protected void sequence_SelectableListPage(EObject context, SelectableListPage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (separatorShow?='separatorShow'? separatorColor=[RGBColor|ID] listStyle=ListStyle?)
	 */
	protected void sequence_StyleListSettings(EObject context, StyleListSettings semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (fixedMenu?='fixedMenu'? menuStyle=MenuStyle?)
	 */
	protected void sequence_StyleMenuSettings(EObject context, StyleMenuSettings semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (frameColor=[RGBColor|ID] imagePosition=EInt? textPosition=EInt? frame=EInt?)
	 */
	protected void sequence_StylePageSettings(EObject context, StylePageSettings semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     selectionColor=[RGBColor|ID]
	 */
	protected void sequence_StyleSelectionSettings(EObject context, StyleSelectionSettings semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GcorePackage.Literals.STYLE_SELECTION_SETTINGS__SELECTION_COLOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GcorePackage.Literals.STYLE_SELECTION_SETTINGS__SELECTION_COLOR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStyleSelectionSettingsAccess().getSelectionColorRGBColorIDTerminalRuleCall_2_0_1(), semanticObject.getSelectionColor());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (rgbColors+=RGBColor rgbColors+=RGBColor*)? 
	 *         fontColor=[RGBColor|ID] 
	 *         backColor=[RGBColor|ID] 
	 *         pageStyle=StylePageSettings 
	 *         menuStyle=StyleMenuSettings? 
	 *         selectionStyle=StyleSelectionSettings? 
	 *         listStyle=StyleListSettings?
	 *     )
	 */
	protected void sequence_StyleSetting(EObject context, StyleSetting semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? name=EString pageStyle=[StylePageSettings|EString])
	 */
	protected void sequence_TakePicturePage(EObject context, TakePicturePage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? name=EString pageStyle=[StylePageSettings|EString] menu=[Menu|EString]?)
	 */
	protected void sequence_ViewPage(EObject context, ViewPage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
