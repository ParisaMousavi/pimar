package pimar.editor.textual.xwcore.serializer;

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
import gcore.ProcessSelectorPage;
import gcore.RGBColor;
import gcore.RecordAudioPage;
import gcore.SelectableListPage;
import gcore.StyleListSettings;
import gcore.StyleMenuSettings;
import gcore.StylePageSettings;
import gcore.StyleSelectionSettings;
import gcore.TakePicturePage;
import gcore.ViewPage;
import org.eclipse.emf.common.util.BasicEMap.Entry;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
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
import pimar.editor.textual.xwcore.services.XwcoreGrammarAccess;
import wcore.Assign;
import wcore.BinaryExpression;
import wcore.Create;
import wcore.CrudGui;
import wcore.Delete;
import wcore.If;
import wcore.IfElse;
import wcore.InvokeGUI;
import wcore.InvokeOperation;
import wcore.InvokeProcess;
import wcore.Permission;
import wcore.ProcessContainer;
import wcore.ProcessSelector;
import wcore.Read;
import wcore.Sequence;
import wcore.TerminalExpression;
import wcore.UnaryExpression;
import wcore.Variable;
import wcore.WcorePackage;
import wcore.While;

@SuppressWarnings("all")
public abstract class AbstractXwcoreSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private XwcoreGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == EcorePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case EcorePackage.EANNOTATION:
				if(context == grammarAccess.getEAnnotationRule()) {
					sequence_EAnnotation(context, (EAnnotation) semanticObject); 
					return; 
				}
				else break;
			case EcorePackage.EATTRIBUTE:
				if(context == grammarAccess.getEAttributeRule() ||
				   context == grammarAccess.getEStructuralFeatureRule()) {
					sequence_EAttribute(context, (EAttribute) semanticObject); 
					return; 
				}
				else break;
			case EcorePackage.ECLASS:
				if(context == grammarAccess.getEClassRule() ||
				   context == grammarAccess.getEClassifierRule()) {
					sequence_EClass(context, (EClass) semanticObject); 
					return; 
				}
				else break;
			case EcorePackage.EDATA_TYPE:
				if(context == grammarAccess.getEClassifierRule() ||
				   context == grammarAccess.getEDataType_ImplRule()) {
					sequence_EDataType_Impl(context, (EDataType) semanticObject); 
					return; 
				}
				else break;
			case EcorePackage.EENUM:
				if(context == grammarAccess.getEClassifierRule() ||
				   context == grammarAccess.getEEnumRule()) {
					sequence_EEnum(context, (EEnum) semanticObject); 
					return; 
				}
				else break;
			case EcorePackage.EENUM_LITERAL:
				if(context == grammarAccess.getEEnumLiteralRule()) {
					sequence_EEnumLiteral(context, (EEnumLiteral) semanticObject); 
					return; 
				}
				else break;
			case EcorePackage.EGENERIC_TYPE:
				if(context == grammarAccess.getEGenericTypeRule()) {
					sequence_EGenericType(context, (EGenericType) semanticObject); 
					return; 
				}
				else break;
			case EcorePackage.EOBJECT:
				if(context == grammarAccess.getEObjectRule()) {
					sequence_EObject(context, (EObject) semanticObject); 
					return; 
				}
				else break;
			case EcorePackage.EOPERATION:
				if(context == grammarAccess.getEOperationRule()) {
					sequence_EOperation(context, (EOperation) semanticObject); 
					return; 
				}
				else break;
			case EcorePackage.EPACKAGE:
				if(context == grammarAccess.getEPackageRule()) {
					sequence_EPackage(context, (EPackage) semanticObject); 
					return; 
				}
				else break;
			case EcorePackage.EPARAMETER:
				if(context == grammarAccess.getEParameterRule()) {
					sequence_EParameter(context, (EParameter) semanticObject); 
					return; 
				}
				else break;
			case EcorePackage.EREFERENCE:
				if(context == grammarAccess.getEReferenceRule() ||
				   context == grammarAccess.getEStructuralFeatureRule()) {
					sequence_EReference(context, (EReference) semanticObject); 
					return; 
				}
				else break;
			case EcorePackage.ESTRING_TO_STRING_MAP_ENTRY:
				if(context == grammarAccess.getEStringToStringMapEntryRule()) {
					sequence_EStringToStringMapEntry(context, (Entry<?, ?>) semanticObject); 
					return; 
				}
				else break;
			case EcorePackage.ETYPE_PARAMETER:
				if(context == grammarAccess.getETypeParameterRule()) {
					sequence_ETypeParameter(context, (ETypeParameter) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == GcorePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case GcorePackage.AR_PAGE:
				if(context == grammarAccess.getARPageRule()) {
					sequence_ARPage(context, (ARPage) semanticObject); 
					return; 
				}
				else break;
			case GcorePackage.CUSTOM_PAGE:
				if(context == grammarAccess.getCustomPageRule()) {
					sequence_CustomPage(context, (CustomPage) semanticObject); 
					return; 
				}
				else break;
			case GcorePackage.ELEARNING_PAGE:
				if(context == grammarAccess.getELearningPageRule()) {
					sequence_ELearningPage(context, (ELearningPage) semanticObject); 
					return; 
				}
				else break;
			case GcorePackage.EDIT_PAGE:
				if(context == grammarAccess.getEditPageRule()) {
					sequence_EditPage(context, (EditPage) semanticObject); 
					return; 
				}
				else break;
			case GcorePackage.LIST_PAGE:
				if(context == grammarAccess.getListPageRule()) {
					sequence_ListPage(context, (ListPage) semanticObject); 
					return; 
				}
				else break;
			case GcorePackage.LOGIN_PAGE:
				if(context == grammarAccess.getLoginPageRule()) {
					sequence_LoginPage(context, (LoginPage) semanticObject); 
					return; 
				}
				else break;
			case GcorePackage.MAP_PAGE:
				if(context == grammarAccess.getMapPageRule()) {
					sequence_MapPage(context, (MapPage) semanticObject); 
					return; 
				}
				else break;
			case GcorePackage.MEDIA_PAGE:
				if(context == grammarAccess.getMediaPageRule()) {
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
			case GcorePackage.PROCESS_SELECTOR_PAGE:
				if(context == grammarAccess.getProcessSelectorPageRule()) {
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
				if(context == grammarAccess.getRecordAudioPageRule()) {
					sequence_RecordAudioPage(context, (RecordAudioPage) semanticObject); 
					return; 
				}
				else break;
			case GcorePackage.SELECTABLE_LIST_PAGE:
				if(context == grammarAccess.getSelectableListPageRule()) {
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
			case GcorePackage.TAKE_PICTURE_PAGE:
				if(context == grammarAccess.getTakePicturePageRule()) {
					sequence_TakePicturePage(context, (TakePicturePage) semanticObject); 
					return; 
				}
				else break;
			case GcorePackage.VIEW_PAGE:
				if(context == grammarAccess.getViewPageRule()) {
					sequence_ViewPage(context, (ViewPage) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == WcorePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case WcorePackage.ASSIGN:
				if(context == grammarAccess.getAssignRule() ||
				   context == grammarAccess.getTaskRule()) {
					sequence_Assign(context, (Assign) semanticObject); 
					return; 
				}
				else break;
			case WcorePackage.BINARY_EXPRESSION:
				if(context == grammarAccess.getBinaryExpressionRule() ||
				   context == grammarAccess.getExpressionRule()) {
					sequence_BinaryExpression(context, (BinaryExpression) semanticObject); 
					return; 
				}
				else break;
			case WcorePackage.CREATE:
				if(context == grammarAccess.getCreateRule() ||
				   context == grammarAccess.getTaskRule()) {
					sequence_Create(context, (Create) semanticObject); 
					return; 
				}
				else break;
			case WcorePackage.CRUD_GUI:
				if(context == grammarAccess.getCrudGuiRule() ||
				   context == grammarAccess.getTaskRule()) {
					sequence_CrudGui(context, (CrudGui) semanticObject); 
					return; 
				}
				else break;
			case WcorePackage.DELETE:
				if(context == grammarAccess.getDeleteRule() ||
				   context == grammarAccess.getTaskRule()) {
					sequence_Delete(context, (Delete) semanticObject); 
					return; 
				}
				else break;
			case WcorePackage.IF:
				if(context == grammarAccess.getIf_ImplRule() ||
				   context == grammarAccess.getTaskRule()) {
					sequence_If_Impl(context, (If) semanticObject); 
					return; 
				}
				else break;
			case WcorePackage.IF_ELSE:
				if(context == grammarAccess.getIfElseRule() ||
				   context == grammarAccess.getTaskRule()) {
					sequence_IfElse(context, (IfElse) semanticObject); 
					return; 
				}
				else break;
			case WcorePackage.INVOKE_GUI:
				if(context == grammarAccess.getInvokeGUIRule() ||
				   context == grammarAccess.getTaskRule()) {
					sequence_InvokeGUI(context, (InvokeGUI) semanticObject); 
					return; 
				}
				else break;
			case WcorePackage.INVOKE_OPERATION:
				if(context == grammarAccess.getInvokeOperationRule() ||
				   context == grammarAccess.getTaskRule()) {
					sequence_InvokeOperation(context, (InvokeOperation) semanticObject); 
					return; 
				}
				else break;
			case WcorePackage.INVOKE_PROCESS:
				if(context == grammarAccess.getInvokeProcessRule() ||
				   context == grammarAccess.getTaskRule()) {
					sequence_InvokeProcess(context, (InvokeProcess) semanticObject); 
					return; 
				}
				else break;
			case WcorePackage.PERMISSION:
				if(context == grammarAccess.getPermissionRule()) {
					sequence_Permission(context, (Permission) semanticObject); 
					return; 
				}
				else break;
			case WcorePackage.PROCESS:
				if(context == grammarAccess.getProcessRule()) {
					sequence_Process(context, (wcore.Process) semanticObject); 
					return; 
				}
				else break;
			case WcorePackage.PROCESS_CONTAINER:
				if(context == grammarAccess.getProcessContainerRule()) {
					sequence_ProcessContainer(context, (ProcessContainer) semanticObject); 
					return; 
				}
				else break;
			case WcorePackage.PROCESS_SELECTOR:
				if(context == grammarAccess.getProcessSelectorRule() ||
				   context == grammarAccess.getTaskRule()) {
					sequence_ProcessSelector(context, (ProcessSelector) semanticObject); 
					return; 
				}
				else break;
			case WcorePackage.READ:
				if(context == grammarAccess.getReadRule() ||
				   context == grammarAccess.getTaskRule()) {
					sequence_Read(context, (Read) semanticObject); 
					return; 
				}
				else break;
			case WcorePackage.SEQUENCE:
				if(context == grammarAccess.getSequenceRule() ||
				   context == grammarAccess.getTaskRule()) {
					sequence_Sequence(context, (Sequence) semanticObject); 
					return; 
				}
				else break;
			case WcorePackage.TERMINAL_EXPRESSION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getTerminalExpressionRule()) {
					sequence_TerminalExpression(context, (TerminalExpression) semanticObject); 
					return; 
				}
				else break;
			case WcorePackage.UNARY_EXPRESSION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getUnaryExpressionRule()) {
					sequence_UnaryExpression(context, (UnaryExpression) semanticObject); 
					return; 
				}
				else break;
			case WcorePackage.VARIABLE:
				if(context == grammarAccess.getVariableRule()) {
					sequence_Variable(context, (Variable) semanticObject); 
					return; 
				}
				else break;
			case WcorePackage.WHILE:
				if(context == grammarAccess.getTaskRule() ||
				   context == grammarAccess.getWhileRule()) {
					sequence_While(context, (While) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=EString pageStyle=[StylePageSettings|EString] (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)?)
	 */
	protected void sequence_ARPage(EObject context, ARPage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         (permissions+=Permission permissions+=Permission*)? 
	 *         name=EString? 
	 *         lhs=[Variable|ID] 
	 *         rhs=Expression
	 *     )
	 */
	protected void sequence_Assign(EObject context, Assign semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (leftExpressions=Expression operator=BinaryOperators rightExpression=Expression)
	 */
	protected void sequence_BinaryExpression(EObject context, BinaryExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, WcorePackage.Literals.BINARY_EXPRESSION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WcorePackage.Literals.BINARY_EXPRESSION__OPERATOR));
			if(transientValues.isValueTransient(semanticObject, WcorePackage.Literals.BINARY_EXPRESSION__LEFT_EXPRESSIONS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WcorePackage.Literals.BINARY_EXPRESSION__LEFT_EXPRESSIONS));
			if(transientValues.isValueTransient(semanticObject, WcorePackage.Literals.BINARY_EXPRESSION__RIGHT_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WcorePackage.Literals.BINARY_EXPRESSION__RIGHT_EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBinaryExpressionAccess().getLeftExpressionsExpressionParserRuleCall_1_0(), semanticObject.getLeftExpressions());
		feeder.accept(grammarAccess.getBinaryExpressionAccess().getOperatorBinaryOperatorsEnumRuleCall_2_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getBinaryExpressionAccess().getRightExpressionExpressionParserRuleCall_3_0(), semanticObject.getRightExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         (permissions+=Permission permissions+=Permission*)? 
	 *         name=EString? 
	 *         return=[Variable|ID] 
	 *         anchor=[EObject|QualifiedName]? 
	 *         eClass=[EClass|QualifiedName]
	 *     )
	 */
	protected void sequence_Create(EObject context, Create semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         (permissions+=Permission permissions+=Permission*)? 
	 *         name=EString? 
	 *         privileges=Privileges 
	 *         anchor=[EObject|QualifiedName]? 
	 *         contain=[EClass|QualifiedName]
	 *     )
	 */
	protected void sequence_CrudGui(EObject context, CrudGui semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString pageStyle=[StylePageSettings|EString] (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)?)
	 */
	protected void sequence_CustomPage(EObject context, CustomPage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? (permissions+=Permission permissions+=Permission*)? name=EString? object=[Variable|ID])
	 */
	protected void sequence_Delete(EObject context, Delete semanticObject) {
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
	 *     (
	 *         volatile?='volatile'? 
	 *         transient?='transient'? 
	 *         unsettable?='unsettable'? 
	 *         derived?='derived'? 
	 *         iD?='iD'? 
	 *         name=EString 
	 *         ordered=EBoolean? 
	 *         unique=EBoolean? 
	 *         lowerBound=EInt? 
	 *         upperBound=EInt? 
	 *         changeable=EBoolean? 
	 *         defaultValueLiteral=EString? 
	 *         eType=[EClassifier|EString]? 
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         eGenericType=EGenericType?
	 *     )
	 */
	protected void sequence_EAttribute(EObject context, EAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         abstract?='abstract'? 
	 *         interface?='interface'? 
	 *         name=EString 
	 *         instanceClassName=EString? 
	 *         instanceTypeName=EString? 
	 *         (eSuperTypes+=[EClass|EString] eSuperTypes+=[EClass|EString]*)? 
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         (eTypeParameters+=ETypeParameter eTypeParameters+=ETypeParameter*)? 
	 *         (eOperations+=EOperation eOperations+=EOperation*)? 
	 *         (eStructuralFeatures+=EStructuralFeature eStructuralFeatures+=EStructuralFeature*)? 
	 *         (eGenericSuperTypes+=EGenericType eGenericSuperTypes+=EGenericType*)?
	 *     )
	 */
	protected void sequence_EClass(EObject context, EClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         instanceClassName=EString? 
	 *         instanceTypeName=EString? 
	 *         serializable=EBoolean? 
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         (eTypeParameters+=ETypeParameter eTypeParameters+=ETypeParameter*)?
	 *     )
	 */
	protected void sequence_EDataType_Impl(EObject context, EDataType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString value=EInt? literal=EString? (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)?)
	 */
	protected void sequence_EEnumLiteral(EObject context, EEnumLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         instanceClassName=EString? 
	 *         instanceTypeName=EString? 
	 *         serializable=EBoolean? 
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         (eTypeParameters+=ETypeParameter eTypeParameters+=ETypeParameter*)? 
	 *         (eLiterals+=EEnumLiteral eLiterals+=EEnumLiteral*)?
	 *     )
	 */
	protected void sequence_EEnum(EObject context, EEnum semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         eTypeParameter=[ETypeParameter|EString]? 
	 *         eClassifier=[EClassifier|EString]? 
	 *         eUpperBound=EGenericType? 
	 *         (eTypeArguments+=EGenericType eTypeArguments+=EGenericType*)? 
	 *         eLowerBound=EGenericType?
	 *     )
	 */
	protected void sequence_EGenericType(EObject context, EGenericType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString pageStyle=[StylePageSettings|EString] menu=[Menu|EString]? (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)?)
	 */
	protected void sequence_ELearningPage(EObject context, ELearningPage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {EObject}
	 */
	protected void sequence_EObject(EObject context, EObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         ordered=EBoolean? 
	 *         unique=EBoolean? 
	 *         lowerBound=EInt? 
	 *         upperBound=EInt? 
	 *         eType=[EClassifier|EString]? 
	 *         (eExceptions+=[EClassifier|EString] eExceptions+=[EClassifier|EString]*)? 
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         eGenericType=EGenericType? 
	 *         (eTypeParameters+=ETypeParameter eTypeParameters+=ETypeParameter*)? 
	 *         (eParameters+=EParameter eParameters+=EParameter*)? 
	 *         (eGenericExceptions+=EGenericType eGenericExceptions+=EGenericType*)?
	 *     )
	 */
	protected void sequence_EOperation(EObject context, EOperation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         nsURI=EString? 
	 *         nsPrefix=EString? 
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         (eClassifiers+=EClassifier eClassifiers+=EClassifier*)? 
	 *         (eSubpackages+=EPackage eSubpackages+=EPackage*)?
	 *     )
	 */
	protected void sequence_EPackage(EObject context, EPackage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         ordered=EBoolean? 
	 *         unique=EBoolean? 
	 *         lowerBound=EInt? 
	 *         upperBound=EInt? 
	 *         eType=[EClassifier|EString]? 
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         eGenericType=EGenericType?
	 *     )
	 */
	protected void sequence_EParameter(EObject context, EParameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         volatile?='volatile'? 
	 *         transient?='transient'? 
	 *         unsettable?='unsettable'? 
	 *         derived?='derived'? 
	 *         containment?='containment'? 
	 *         name=EString 
	 *         ordered=EBoolean? 
	 *         unique=EBoolean? 
	 *         lowerBound=EInt? 
	 *         upperBound=EInt? 
	 *         changeable=EBoolean? 
	 *         defaultValueLiteral=EString? 
	 *         resolveProxies=EBoolean? 
	 *         eType=[EClassifier|EString]? 
	 *         eOpposite=[EReference|EString]? 
	 *         (eKeys+=[EAttribute|EString] eKeys+=[EAttribute|EString]*)? 
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         eGenericType=EGenericType?
	 *     )
	 */
	protected void sequence_EReference(EObject context, EReference semanticObject) {
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
	 *     (name=EString (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? (eBounds+=EGenericType eBounds+=EGenericType*)?)
	 */
	protected void sequence_ETypeParameter(EObject context, ETypeParameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString pageStyle=[StylePageSettings|EString] (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)?)
	 */
	protected void sequence_EditPage(EObject context, EditPage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         (permissions+=Permission permissions+=Permission*)? 
	 *         name=EString? 
	 *         condition=Expression 
	 *         body=Task 
	 *         elseBody=Task
	 *     )
	 */
	protected void sequence_IfElse(EObject context, IfElse semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         (permissions+=Permission permissions+=Permission*)? 
	 *         name=EString? 
	 *         condition=Expression 
	 *         body=Task
	 *     )
	 */
	protected void sequence_If_Impl(EObject context, If semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         (permissions+=Permission permissions+=Permission*)? 
	 *         name=EString? 
	 *         (outputData+=[Variable|ID] outputData+=[Variable|ID]*)? 
	 *         page=[Page|QualifiedName] 
	 *         (input+=[Variable|ID] input+=[Variable|ID]*)?
	 *     )
	 */
	protected void sequence_InvokeGUI(EObject context, InvokeGUI semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         (permissions+=Permission permissions+=Permission*)? 
	 *         name=EString? 
	 *         return=[Variable|ID]? 
	 *         long?='long'? 
	 *         context=[Variable|ID] 
	 *         operation=[EOperation|QualifiedName] 
	 *         (arguments+=[Variable|ID] arguments+=[Variable|ID]*)?
	 *     )
	 */
	protected void sequence_InvokeOperation(EObject context, InvokeOperation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         (permissions+=Permission permissions+=Permission*)? 
	 *         name=EString? 
	 *         (return+=[Variable|ID] return+=[Variable|ID]*)? 
	 *         synchronized?='synchronized'? 
	 *         subProcess=[Process|QualifiedName] 
	 *         (arguments+=[Variable|ID] arguments+=[Variable|ID]*)?
	 *     )
	 */
	protected void sequence_InvokeProcess(EObject context, InvokeProcess semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         pageStyle=[StylePageSettings|EString] 
	 *         listablepageStyle=[StyleListSettings|EString] 
	 *         menu=[Menu|EString]? 
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)?
	 *     )
	 */
	protected void sequence_ListPage(EObject context, ListPage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString pageStyle=[StylePageSettings|EString] (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)?)
	 */
	protected void sequence_LoginPage(EObject context, LoginPage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString pageStyle=[StylePageSettings|EString] (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)?)
	 */
	protected void sequence_MapPage(EObject context, MapPage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString pageStyle=[StylePageSettings|EString] (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)?)
	 */
	protected void sequence_MediaPage(EObject context, MediaPage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString menuStyle=[StyleMenuSettings|EString] (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)?)
	 */
	protected void sequence_Menu(EObject context, Menu semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? name=EString? permission=Permissions)
	 */
	protected void sequence_Permission(EObject context, Permission semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString nsURI=EString? nsPrefix=EString? (processes+=Process processes+=Process*)?)
	 */
	protected void sequence_ProcessContainer(EObject context, ProcessContainer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString pageStyle=[StylePageSettings|EString] menu=[Menu|EString]? (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)?)
	 */
	protected void sequence_ProcessSelectorPage(EObject context, ProcessSelectorPage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         (permissions+=Permission permissions+=Permission*)? 
	 *         name=EString? 
	 *         page=[Page|QualifiedName] 
	 *         processes+=[Process|EString] 
	 *         processes+=[Process|EString]*
	 *     )
	 */
	protected void sequence_ProcessSelector(EObject context, ProcessSelector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         name=EString 
	 *         (variables+=Variable variables+=Variable*)? 
	 *         (return+=Variable return+=Variable*)? 
	 *         startTask=Task
	 *     )
	 */
	protected void sequence_Process(EObject context, wcore.Process semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString blue=EInt? red=EInt? green=EInt? (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)?)
	 */
	protected void sequence_RGBColor(EObject context, RGBColor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         (permissions+=Permission permissions+=Permission*)? 
	 *         name=EString? 
	 *         return=[Variable|ID] 
	 *         object=[Variable|ID]?
	 *     )
	 */
	protected void sequence_Read(EObject context, Read semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString pageStyle=[StylePageSettings|EString] (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)?)
	 */
	protected void sequence_RecordAudioPage(EObject context, RecordAudioPage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         multiSelection?='multiSelection'? 
	 *         name=EString 
	 *         pageStyle=[StylePageSettings|EString] 
	 *         selectablepageStyle=[StyleSelectionSettings|EString] 
	 *         listablepageStyle=[StyleListSettings|EString] 
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)?
	 *     )
	 */
	protected void sequence_SelectableListPage(EObject context, SelectableListPage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((permissions+=Permission permissions+=Permission*)? name=EString? body=Task follower=Task)
	 */
	protected void sequence_Sequence(EObject context, Sequence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (separatorShow?='separatorShow'? listStyle=ListStyle? separatorColor=[RGBColor|EString])
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
	 *     (imagePosition=EInt? textPosition=EInt? frame=EInt? frameColor=[RGBColor|EString])
	 */
	protected void sequence_StylePageSettings(EObject context, StylePageSettings semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     selectionColor=[RGBColor|EString]
	 */
	protected void sequence_StyleSelectionSettings(EObject context, StyleSelectionSettings semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GcorePackage.Literals.STYLE_SELECTION_SETTINGS__SELECTION_COLOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GcorePackage.Literals.STYLE_SELECTION_SETTINGS__SELECTION_COLOR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStyleSelectionSettingsAccess().getSelectionColorRGBColorEStringParserRuleCall_3_0_1(), semanticObject.getSelectionColor());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString pageStyle=[StylePageSettings|EString] (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)?)
	 */
	protected void sequence_TakePicturePage(EObject context, TakePicturePage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     refers=[Variable|ID]
	 */
	protected void sequence_TerminalExpression(EObject context, TerminalExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, WcorePackage.Literals.TERMINAL_EXPRESSION__REFERS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WcorePackage.Literals.TERMINAL_EXPRESSION__REFERS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTerminalExpressionAccess().getRefersVariableIDTerminalRuleCall_0_1(), semanticObject.getRefers());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (operator=UnaryOperators rightExpression=Expression)
	 */
	protected void sequence_UnaryExpression(EObject context, UnaryExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, WcorePackage.Literals.UNARY_EXPRESSION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WcorePackage.Literals.UNARY_EXPRESSION__OPERATOR));
			if(transientValues.isValueTransient(semanticObject, WcorePackage.Literals.UNARY_EXPRESSION__RIGHT_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WcorePackage.Literals.UNARY_EXPRESSION__RIGHT_EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUnaryExpressionAccess().getOperatorUnaryOperatorsEnumRuleCall_0_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getUnaryExpressionAccess().getRightExpressionExpressionParserRuleCall_1_0(), semanticObject.getRightExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         changeable?='changeable'? 
	 *         scope=Scope? 
	 *         eType=[EClassifier|QualifiedName]? 
	 *         (lowerBound=EInt upperBound=EInt)? 
	 *         name=EString 
	 *         defaultValue=EString?
	 *     )
	 */
	protected void sequence_Variable(EObject context, Variable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString pageStyle=[StylePageSettings|EString] menu=[Menu|EString]? (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)?)
	 */
	protected void sequence_ViewPage(EObject context, ViewPage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         (permissions+=Permission permissions+=Permission*)? 
	 *         name=EString? 
	 *         condition=Expression 
	 *         body=Task
	 *     )
	 */
	protected void sequence_While(EObject context, While semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
