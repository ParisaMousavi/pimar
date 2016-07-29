/**
 */
package wcoreDatabase.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import wcoreDatabase.Assign;
import wcoreDatabase.BinaryExpression;
import wcoreDatabase.BinaryOperators;
import wcoreDatabase.Create;
import wcoreDatabase.CrudGui;
import wcoreDatabase.Delete;
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
import wcoreDatabase.TerminalExpression;
import wcoreDatabase.UnaryExpression;
import wcoreDatabase.UnaryOperators;
import wcoreDatabase.Variable;
import wcoreDatabase.WcoreDatabaseFactory;
import wcoreDatabase.WcoreDatabasePackage;
import wcoreDatabase.While;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WcoreDatabaseFactoryImpl extends EFactoryImpl implements WcoreDatabaseFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WcoreDatabaseFactory init() {
		try {
			WcoreDatabaseFactory theWcoreDatabaseFactory = (WcoreDatabaseFactory)EPackage.Registry.INSTANCE.getEFactory(WcoreDatabasePackage.eNS_URI);
			if (theWcoreDatabaseFactory != null) {
				return theWcoreDatabaseFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WcoreDatabaseFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WcoreDatabaseFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case WcoreDatabasePackage.PROCESS_CONTAINER: return createProcessContainer();
			case WcoreDatabasePackage.PROCESS: return createProcess();
			case WcoreDatabasePackage.PERMISSION: return createPermission();
			case WcoreDatabasePackage.VARIABLE: return createVariable();
			case WcoreDatabasePackage.CREATE: return createCreate();
			case WcoreDatabasePackage.INVOKE_OPERATION: return createInvokeOperation();
			case WcoreDatabasePackage.INVOKE_PROCESS: return createInvokeProcess();
			case WcoreDatabasePackage.INVOKE_GUI: return createInvokeGUI();
			case WcoreDatabasePackage.IF: return createIf();
			case WcoreDatabasePackage.IF_ELSE: return createIfElse();
			case WcoreDatabasePackage.WHILE: return createWhile();
			case WcoreDatabasePackage.ASSIGN: return createAssign();
			case WcoreDatabasePackage.SEQUENCE: return createSequence();
			case WcoreDatabasePackage.TERMINAL_EXPRESSION: return createTerminalExpression();
			case WcoreDatabasePackage.UNARY_EXPRESSION: return createUnaryExpression();
			case WcoreDatabasePackage.BINARY_EXPRESSION: return createBinaryExpression();
			case WcoreDatabasePackage.DELETE: return createDelete();
			case WcoreDatabasePackage.READ: return createRead();
			case WcoreDatabasePackage.CRUD_GUI: return createCrudGui();
			case WcoreDatabasePackage.PROCESS_SELECTOR: return createProcessSelector();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case WcoreDatabasePackage.PERMISSIONS:
				return createPermissionsFromString(eDataType, initialValue);
			case WcoreDatabasePackage.UNARY_OPERATORS:
				return createUnaryOperatorsFromString(eDataType, initialValue);
			case WcoreDatabasePackage.BINARY_OPERATORS:
				return createBinaryOperatorsFromString(eDataType, initialValue);
			case WcoreDatabasePackage.PRIVILEGES:
				return createPrivilegesFromString(eDataType, initialValue);
			case WcoreDatabasePackage.SCOPE:
				return createScopeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case WcoreDatabasePackage.PERMISSIONS:
				return convertPermissionsToString(eDataType, instanceValue);
			case WcoreDatabasePackage.UNARY_OPERATORS:
				return convertUnaryOperatorsToString(eDataType, instanceValue);
			case WcoreDatabasePackage.BINARY_OPERATORS:
				return convertBinaryOperatorsToString(eDataType, instanceValue);
			case WcoreDatabasePackage.PRIVILEGES:
				return convertPrivilegesToString(eDataType, instanceValue);
			case WcoreDatabasePackage.SCOPE:
				return convertScopeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessContainer createProcessContainer() {
		ProcessContainerImpl processContainer = new ProcessContainerImpl();
		return processContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public wcoreDatabase.Process createProcess() {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Permission createPermission() {
		PermissionImpl permission = new PermissionImpl();
		return permission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Create createCreate() {
		CreateImpl create = new CreateImpl();
		return create;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvokeOperation createInvokeOperation() {
		InvokeOperationImpl invokeOperation = new InvokeOperationImpl();
		return invokeOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvokeProcess createInvokeProcess() {
		InvokeProcessImpl invokeProcess = new InvokeProcessImpl();
		return invokeProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvokeGUI createInvokeGUI() {
		InvokeGUIImpl invokeGUI = new InvokeGUIImpl();
		return invokeGUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public If createIf() {
		IfImpl if_ = new IfImpl();
		return if_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfElse createIfElse() {
		IfElseImpl ifElse = new IfElseImpl();
		return ifElse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public While createWhile() {
		WhileImpl while_ = new WhileImpl();
		return while_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assign createAssign() {
		AssignImpl assign = new AssignImpl();
		return assign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence createSequence() {
		SequenceImpl sequence = new SequenceImpl();
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminalExpression createTerminalExpression() {
		TerminalExpressionImpl terminalExpression = new TerminalExpressionImpl();
		return terminalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryExpression createUnaryExpression() {
		UnaryExpressionImpl unaryExpression = new UnaryExpressionImpl();
		return unaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryExpression createBinaryExpression() {
		BinaryExpressionImpl binaryExpression = new BinaryExpressionImpl();
		return binaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delete createDelete() {
		DeleteImpl delete = new DeleteImpl();
		return delete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Read createRead() {
		ReadImpl read = new ReadImpl();
		return read;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrudGui createCrudGui() {
		CrudGuiImpl crudGui = new CrudGuiImpl();
		return crudGui;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessSelector createProcessSelector() {
		ProcessSelectorImpl processSelector = new ProcessSelectorImpl();
		return processSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Permissions createPermissionsFromString(EDataType eDataType, String initialValue) {
		Permissions result = Permissions.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPermissionsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryOperators createUnaryOperatorsFromString(EDataType eDataType, String initialValue) {
		UnaryOperators result = UnaryOperators.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnaryOperatorsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryOperators createBinaryOperatorsFromString(EDataType eDataType, String initialValue) {
		BinaryOperators result = BinaryOperators.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBinaryOperatorsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Privileges createPrivilegesFromString(EDataType eDataType, String initialValue) {
		Privileges result = Privileges.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrivilegesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scope createScopeFromString(EDataType eDataType, String initialValue) {
		Scope result = Scope.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScopeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WcoreDatabasePackage getWcoreDatabasePackage() {
		return (WcoreDatabasePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WcoreDatabasePackage getPackage() {
		return WcoreDatabasePackage.eINSTANCE;
	}

} //WcoreDatabaseFactoryImpl
