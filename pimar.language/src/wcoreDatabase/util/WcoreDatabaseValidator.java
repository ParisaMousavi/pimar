/**
 */
package wcoreDatabase.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EcoreValidator;

import wcoreDatabase.Assign;
import wcoreDatabase.BinaryExpression;
import wcoreDatabase.BinaryOperators;
import wcoreDatabase.Create;
import wcoreDatabase.CrudGui;
import wcoreDatabase.Delete;
import wcoreDatabase.Expression;
import wcoreDatabase.If;
import wcoreDatabase.IfElse;
import wcoreDatabase.InvokeGUI;
import wcoreDatabase.InvokeOperation;
import wcoreDatabase.InvokeProcess;
import wcoreDatabase.Permission;
import wcoreDatabase.Permissions;
import wcoreDatabase.Privileges;
import wcoreDatabase.ProcessContainer;
import wcoreDatabase.ProcessSelector;
import wcoreDatabase.Read;
import wcoreDatabase.Scope;
import wcoreDatabase.Sequence;
import wcoreDatabase.Task;
import wcoreDatabase.TerminalExpression;
import wcoreDatabase.UnaryExpression;
import wcoreDatabase.UnaryOperators;
import wcoreDatabase.Variable;
import wcoreDatabase.WcoreDatabasePackage;
import wcoreDatabase.While;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see wcoreDatabase.WcoreDatabasePackage
 * @generated
 */
public class WcoreDatabaseValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final WcoreDatabaseValidator INSTANCE = new WcoreDatabaseValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "wcoreDatabase";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EcoreValidator ecoreValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WcoreDatabaseValidator() {
		super();
		ecoreValidator = EcoreValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return WcoreDatabasePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case WcoreDatabasePackage.PROCESS_CONTAINER:
				return validateProcessContainer((ProcessContainer)value, diagnostics, context);
			case WcoreDatabasePackage.PROCESS:
				return validateProcess((wcoreDatabase.Process)value, diagnostics, context);
			case WcoreDatabasePackage.TASK:
				return validateTask((Task)value, diagnostics, context);
			case WcoreDatabasePackage.PERMISSION:
				return validatePermission((Permission)value, diagnostics, context);
			case WcoreDatabasePackage.VARIABLE:
				return validateVariable((Variable)value, diagnostics, context);
			case WcoreDatabasePackage.CREATE:
				return validateCreate((Create)value, diagnostics, context);
			case WcoreDatabasePackage.INVOKE_OPERATION:
				return validateInvokeOperation((InvokeOperation)value, diagnostics, context);
			case WcoreDatabasePackage.INVOKE_PROCESS:
				return validateInvokeProcess((InvokeProcess)value, diagnostics, context);
			case WcoreDatabasePackage.INVOKE_GUI:
				return validateInvokeGUI((InvokeGUI)value, diagnostics, context);
			case WcoreDatabasePackage.IF:
				return validateIf((If)value, diagnostics, context);
			case WcoreDatabasePackage.IF_ELSE:
				return validateIfElse((IfElse)value, diagnostics, context);
			case WcoreDatabasePackage.WHILE:
				return validateWhile((While)value, diagnostics, context);
			case WcoreDatabasePackage.ASSIGN:
				return validateAssign((Assign)value, diagnostics, context);
			case WcoreDatabasePackage.SEQUENCE:
				return validateSequence((Sequence)value, diagnostics, context);
			case WcoreDatabasePackage.EXPRESSION:
				return validateExpression((Expression)value, diagnostics, context);
			case WcoreDatabasePackage.TERMINAL_EXPRESSION:
				return validateTerminalExpression((TerminalExpression)value, diagnostics, context);
			case WcoreDatabasePackage.UNARY_EXPRESSION:
				return validateUnaryExpression((UnaryExpression)value, diagnostics, context);
			case WcoreDatabasePackage.BINARY_EXPRESSION:
				return validateBinaryExpression((BinaryExpression)value, diagnostics, context);
			case WcoreDatabasePackage.DELETE:
				return validateDelete((Delete)value, diagnostics, context);
			case WcoreDatabasePackage.READ:
				return validateRead((Read)value, diagnostics, context);
			case WcoreDatabasePackage.CRUD_GUI:
				return validateCrudGui((CrudGui)value, diagnostics, context);
			case WcoreDatabasePackage.PROCESS_SELECTOR:
				return validateProcessSelector((ProcessSelector)value, diagnostics, context);
			case WcoreDatabasePackage.PERMISSIONS:
				return validatePermissions((Permissions)value, diagnostics, context);
			case WcoreDatabasePackage.UNARY_OPERATORS:
				return validateUnaryOperators((UnaryOperators)value, diagnostics, context);
			case WcoreDatabasePackage.BINARY_OPERATORS:
				return validateBinaryOperators((BinaryOperators)value, diagnostics, context);
			case WcoreDatabasePackage.PRIVILEGES:
				return validatePrivileges((Privileges)value, diagnostics, context);
			case WcoreDatabasePackage.SCOPE:
				return validateScope((Scope)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessContainer(ProcessContainer processContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(processContainer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(processContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(processContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(processContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(processContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(processContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(processContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(processContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(processContainer, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(processContainer, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateEPackage_WellFormedNsURI(processContainer, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateEPackage_WellFormedNsPrefix(processContainer, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateEPackage_UniqueSubpackageNames(processContainer, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateEPackage_UniqueClassifierNames(processContainer, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateEPackage_UniqueNsURIs(processContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcessContainer_oneMainProcess(processContainer, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the oneMainProcess constraint of '<em>Process Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROCESS_CONTAINER__ONE_MAIN_PROCESS__EEXPRESSION = "self.processes->select(p : Process | p.name = 'Main')->size() = 1";

	/**
	 * Validates the oneMainProcess constraint of '<em>Process Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessContainer_oneMainProcess(ProcessContainer processContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WcoreDatabasePackage.Literals.PROCESS_CONTAINER,
				 processContainer,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "oneMainProcess",
				 PROCESS_CONTAINER__ONE_MAIN_PROCESS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcess(wcoreDatabase.Process process, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(process, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(process, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(process, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcess_oneProcessSelectorInMainProcess(process, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the oneProcessSelectorInMainProcess constraint of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROCESS__ONE_PROCESS_SELECTOR_IN_MAIN_PROCESS__EEXPRESSION = "self.name = 'Main' implies containProcessSelectorTask(self.startTask.oclAsType(wcore::Task))";

	/**
	 * Validates the oneProcessSelectorInMainProcess constraint of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcess_oneProcessSelectorInMainProcess(wcoreDatabase.Process process, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WcoreDatabasePackage.Literals.PROCESS,
				 process,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "oneProcessSelectorInMainProcess",
				 PROCESS__ONE_PROCESS_SELECTOR_IN_MAIN_PROCESS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(task, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(task, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(task, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePermission(Permission permission, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(permission, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(permission, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(permission, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(permission, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(permission, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(permission, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(permission, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(permission, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(permission, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(permission, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariable(Variable variable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(variable, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(variable, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(variable, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateETypedElement_ValidLowerBound(variable, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateETypedElement_ValidUpperBound(variable, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateETypedElement_ConsistentBounds(variable, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateETypedElement_ValidType(variable, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreate(Create create, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(create, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(create, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(create, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(create, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(create, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(create, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(create, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(create, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(create, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(create, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvokeOperation(InvokeOperation invokeOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(invokeOperation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(invokeOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(invokeOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(invokeOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(invokeOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(invokeOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(invokeOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(invokeOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(invokeOperation, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(invokeOperation, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvokeProcess(InvokeProcess invokeProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(invokeProcess, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(invokeProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(invokeProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(invokeProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(invokeProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(invokeProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(invokeProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(invokeProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(invokeProcess, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(invokeProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validateInvokeProcess_conformingArgumentsToParameters(invokeProcess, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the conformingArgumentsToParameters constraint of '<em>Invoke Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INVOKE_PROCESS__CONFORMING_ARGUMENTS_TO_PARAMETERS__EEXPRESSION = "self.arguments -> size() = self.subProcess.variables -> select(v:wcore::Variable|v.scope.oclAsType(wcore::Scope)=wcore::Scope::GLOBAL) ->size() and\r\n" +
		"Sequence{1..self.arguments -> size()} -> forAll(i:Integer | let var1:wcore::Variable = self.arguments->at(i), var2:wcore::Variable=self.subProcess.variables->select(v:wcore::Variable|v.scope.oclAsType(wcore::Scope)=wcore::Scope::GLOBAL)->at(i) in var1.oclAsType(wcore::Variable).eType=var2.oclAsType(wcore::Variable).eType)";

	/**
	 * Validates the conformingArgumentsToParameters constraint of '<em>Invoke Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvokeProcess_conformingArgumentsToParameters(InvokeProcess invokeProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WcoreDatabasePackage.Literals.INVOKE_PROCESS,
				 invokeProcess,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "conformingArgumentsToParameters",
				 INVOKE_PROCESS__CONFORMING_ARGUMENTS_TO_PARAMETERS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvokeGUI(InvokeGUI invokeGUI, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(invokeGUI, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(invokeGUI, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(invokeGUI, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(invokeGUI, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(invokeGUI, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(invokeGUI, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(invokeGUI, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(invokeGUI, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(invokeGUI, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(invokeGUI, diagnostics, context);
		if (result || diagnostics != null) result &= validateInvokeGUI_MapPageOutput(invokeGUI, diagnostics, context);
		if (result || diagnostics != null) result &= validateInvokeGUI_LoginPageOutput(invokeGUI, diagnostics, context);
		if (result || diagnostics != null) result &= validateInvokeGUI_LoginPageInput(invokeGUI, diagnostics, context);
		if (result || diagnostics != null) result &= validateInvokeGUI_ViewPageOutput(invokeGUI, diagnostics, context);
		if (result || diagnostics != null) result &= validateInvokeGUI_EditPage(invokeGUI, diagnostics, context);
		if (result || diagnostics != null) result &= validateInvokeGUI_SelectableListPageOutput(invokeGUI, diagnostics, context);
		if (result || diagnostics != null) result &= validateInvokeGUI_SelectablePageInput(invokeGUI, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the MapPageOutput constraint of '<em>Invoke GUI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INVOKE_GUI__MAP_PAGE_OUTPUT__EEXPRESSION = "self.page.oclIsTypeOf(GcoreDatabase::MapPage) implies self.outputData -> size() = 2 and self.outputData -> forAll(var:Variable|var.eType=ecore::EDouble)";

	/**
	 * Validates the MapPageOutput constraint of '<em>Invoke GUI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvokeGUI_MapPageOutput(InvokeGUI invokeGUI, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WcoreDatabasePackage.Literals.INVOKE_GUI,
				 invokeGUI,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "MapPageOutput",
				 INVOKE_GUI__MAP_PAGE_OUTPUT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the LoginPageOutput constraint of '<em>Invoke GUI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INVOKE_GUI__LOGIN_PAGE_OUTPUT__EEXPRESSION = "self.page.oclIsTypeOf(GcoreDatabase::LoginPage) implies self.outputData -> size() = 1 and self.outputData -> forAll(var:Variable|var.eType=ecore::EBoolean)";

	/**
	 * Validates the LoginPageOutput constraint of '<em>Invoke GUI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvokeGUI_LoginPageOutput(InvokeGUI invokeGUI, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WcoreDatabasePackage.Literals.INVOKE_GUI,
				 invokeGUI,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "LoginPageOutput",
				 INVOKE_GUI__LOGIN_PAGE_OUTPUT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the LoginPageInput constraint of '<em>Invoke GUI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INVOKE_GUI__LOGIN_PAGE_INPUT__EEXPRESSION = "self.page.oclIsTypeOf(GcoreDatabase::LoginPage) implies self.input -> size() = 2 and self.input -> forAll(var:Variable|var.eType=ecore::EString)";

	/**
	 * Validates the LoginPageInput constraint of '<em>Invoke GUI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvokeGUI_LoginPageInput(InvokeGUI invokeGUI, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WcoreDatabasePackage.Literals.INVOKE_GUI,
				 invokeGUI,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "LoginPageInput",
				 INVOKE_GUI__LOGIN_PAGE_INPUT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ViewPageOutput constraint of '<em>Invoke GUI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INVOKE_GUI__VIEW_PAGE_OUTPUT__EEXPRESSION = "self.page.oclIsTypeOf(GcoreDatabase::ViewPage) implies self.outputData -> size() = 1 and self.outputData -> forAll(var:Variable|var.eType.oclIsKindOf(ecore::EObject))";

	/**
	 * Validates the ViewPageOutput constraint of '<em>Invoke GUI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvokeGUI_ViewPageOutput(InvokeGUI invokeGUI, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WcoreDatabasePackage.Literals.INVOKE_GUI,
				 invokeGUI,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ViewPageOutput",
				 INVOKE_GUI__VIEW_PAGE_OUTPUT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the EditPage constraint of '<em>Invoke GUI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INVOKE_GUI__EDIT_PAGE__EEXPRESSION = "self.page.oclIsTypeOf(GcoreDatabase::EditPage) implies self.outputData -> size() = 1 and self.input -> size() = 1 and self.input -> forAll(var:Variable|var.eType=self.outputData -> at(1).eType)";

	/**
	 * Validates the EditPage constraint of '<em>Invoke GUI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvokeGUI_EditPage(InvokeGUI invokeGUI, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WcoreDatabasePackage.Literals.INVOKE_GUI,
				 invokeGUI,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "EditPage",
				 INVOKE_GUI__EDIT_PAGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the SelectableListPageOutput constraint of '<em>Invoke GUI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INVOKE_GUI__SELECTABLE_LIST_PAGE_OUTPUT__EEXPRESSION = "self.page.oclIsTypeOf(GcoreDatabase::SelectableListPage) or self.page.oclIsTypeOf(GcoreDatabase::ListPage) implies self.outputData -> size() = 1 and self.outputData -> forAll(var:Variable|var.upperBound=-1)";

	/**
	 * Validates the SelectableListPageOutput constraint of '<em>Invoke GUI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvokeGUI_SelectableListPageOutput(InvokeGUI invokeGUI, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WcoreDatabasePackage.Literals.INVOKE_GUI,
				 invokeGUI,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "SelectableListPageOutput",
				 INVOKE_GUI__SELECTABLE_LIST_PAGE_OUTPUT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the SelectablePageInput constraint of '<em>Invoke GUI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INVOKE_GUI__SELECTABLE_PAGE_INPUT__EEXPRESSION = "self.page.oclIsTypeOf(GcoreDatabase::SelectableListPage) implies self.input -> size() = 1 and self.input -> forAll(var:Variable|var.eType=self.outputData -> at(1).eType and var.upperBound=1)";

	/**
	 * Validates the SelectablePageInput constraint of '<em>Invoke GUI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvokeGUI_SelectablePageInput(InvokeGUI invokeGUI, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WcoreDatabasePackage.Literals.INVOKE_GUI,
				 invokeGUI,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "SelectablePageInput",
				 INVOKE_GUI__SELECTABLE_PAGE_INPUT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIf(If if_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(if_, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(if_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(if_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(if_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(if_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(if_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(if_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(if_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(if_, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(if_, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfElse(IfElse ifElse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ifElse, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ifElse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ifElse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ifElse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ifElse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ifElse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ifElse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ifElse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ifElse, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(ifElse, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWhile(While while_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(while_, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(while_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(while_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(while_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(while_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(while_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(while_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(while_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(while_, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(while_, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssign(Assign assign, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(assign, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(assign, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(assign, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(assign, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(assign, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(assign, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(assign, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(assign, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(assign, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(assign, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequence(Sequence sequence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sequence, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sequence, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(sequence, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpression(Expression expression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTerminalExpression(TerminalExpression terminalExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(terminalExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnaryExpression(UnaryExpression unaryExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unaryExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinaryExpression(BinaryExpression binaryExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(binaryExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelete(Delete delete, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(delete, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(delete, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(delete, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(delete, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(delete, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(delete, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(delete, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(delete, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(delete, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(delete, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRead(Read read, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(read, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(read, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(read, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(read, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(read, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(read, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(read, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(read, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(read, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(read, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCrudGui(CrudGui crudGui, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(crudGui, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(crudGui, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(crudGui, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(crudGui, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(crudGui, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(crudGui, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(crudGui, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(crudGui, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(crudGui, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(crudGui, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessSelector(ProcessSelector processSelector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(processSelector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(processSelector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(processSelector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(processSelector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(processSelector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(processSelector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(processSelector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(processSelector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(processSelector, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(processSelector, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcessSelector_oneGUITaskInAllSubProcesses(processSelector, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the oneGUITaskInAllSubProcesses constraint of '<em>Process Selector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROCESS_SELECTOR__ONE_GUI_TASK_IN_ALL_SUB_PROCESSES__EEXPRESSION = "self.oclAsType(wcore::ProcessSelector).processes -> select(proc:wcore::Process|containInvokeGUITask(proc.startTask.oclAsType(wcore::Task))) -> size() = (self.oclAsType(wcore::ProcessSelector).processes -> size())";

	/**
	 * Validates the oneGUITaskInAllSubProcesses constraint of '<em>Process Selector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessSelector_oneGUITaskInAllSubProcesses(ProcessSelector processSelector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WcoreDatabasePackage.Literals.PROCESS_SELECTOR,
				 processSelector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "oneGUITaskInAllSubProcesses",
				 PROCESS_SELECTOR__ONE_GUI_TASK_IN_ALL_SUB_PROCESSES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePermissions(Permissions permissions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnaryOperators(UnaryOperators unaryOperators, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinaryOperators(BinaryOperators binaryOperators, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivileges(Privileges privileges, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScope(Scope scope, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //WcoreDatabaseValidator
