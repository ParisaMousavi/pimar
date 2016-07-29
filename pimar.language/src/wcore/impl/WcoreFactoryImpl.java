/**
 */
package wcore.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import wcore.Assign;
import wcore.BinaryExpression;
import wcore.BinaryOperators;
import wcore.Create;
import wcore.CrudGui;
import wcore.Delete;
import wcore.If;
import wcore.IfElse;
import wcore.InvokeGUI;
import wcore.InvokeOperation;
import wcore.InvokeProcess;
import wcore.Permission;
import wcore.Permissions;
import wcore.Privileges;
import wcore.ProcessContainer;
import wcore.ProcessSelector;
import wcore.Read;
import wcore.Scope;
import wcore.Sequence;
import wcore.TerminalExpression;
import wcore.UnaryExpression;
import wcore.UnaryOperators;
import wcore.Variable;
import wcore.WcoreFactory;
import wcore.WcorePackage;
import wcore.While;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WcoreFactoryImpl extends EFactoryImpl implements WcoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WcoreFactory init() {
		try {
			WcoreFactory theWcoreFactory = (WcoreFactory)EPackage.Registry.INSTANCE.getEFactory(WcorePackage.eNS_URI);
			if (theWcoreFactory != null) {
				return theWcoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WcoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WcoreFactoryImpl() {
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
			case WcorePackage.PROCESS_CONTAINER: return createProcessContainer();
			case WcorePackage.PROCESS: return createProcess();
			case WcorePackage.PERMISSION: return createPermission();
			case WcorePackage.VARIABLE: return createVariable();
			case WcorePackage.CREATE: return createCreate();
			case WcorePackage.INVOKE_OPERATION: return createInvokeOperation();
			case WcorePackage.INVOKE_PROCESS: return createInvokeProcess();
			case WcorePackage.INVOKE_GUI: return createInvokeGUI();
			case WcorePackage.IF: return createIf();
			case WcorePackage.IF_ELSE: return createIfElse();
			case WcorePackage.WHILE: return createWhile();
			case WcorePackage.ASSIGN: return createAssign();
			case WcorePackage.SEQUENCE: return createSequence();
			case WcorePackage.TERMINAL_EXPRESSION: return createTerminalExpression();
			case WcorePackage.UNARY_EXPRESSION: return createUnaryExpression();
			case WcorePackage.BINARY_EXPRESSION: return createBinaryExpression();
			case WcorePackage.DELETE: return createDelete();
			case WcorePackage.READ: return createRead();
			case WcorePackage.CRUD_GUI: return createCrudGui();
			case WcorePackage.PROCESS_SELECTOR: return createProcessSelector();
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
			case WcorePackage.PERMISSIONS:
				return createPermissionsFromString(eDataType, initialValue);
			case WcorePackage.UNARY_OPERATORS:
				return createUnaryOperatorsFromString(eDataType, initialValue);
			case WcorePackage.BINARY_OPERATORS:
				return createBinaryOperatorsFromString(eDataType, initialValue);
			case WcorePackage.PRIVILEGES:
				return createPrivilegesFromString(eDataType, initialValue);
			case WcorePackage.SCOPE:
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
			case WcorePackage.PERMISSIONS:
				return convertPermissionsToString(eDataType, instanceValue);
			case WcorePackage.UNARY_OPERATORS:
				return convertUnaryOperatorsToString(eDataType, instanceValue);
			case WcorePackage.BINARY_OPERATORS:
				return convertBinaryOperatorsToString(eDataType, instanceValue);
			case WcorePackage.PRIVILEGES:
				return convertPrivilegesToString(eDataType, instanceValue);
			case WcorePackage.SCOPE:
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
	public wcore.Process createProcess() {
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
	public WcorePackage getWcorePackage() {
		return (WcorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WcorePackage getPackage() {
		return WcorePackage.eINSTANCE;
	}

} //WcoreFactoryImpl
