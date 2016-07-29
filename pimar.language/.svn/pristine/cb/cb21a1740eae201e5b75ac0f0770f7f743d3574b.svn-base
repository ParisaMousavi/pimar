/**
 */
package wcoreDatabase.impl;

import gcoreDatabase.GcoreDatabasePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
import wcoreDatabase.WcoreDatabaseFactory;
import wcoreDatabase.WcoreDatabasePackage;
import wcoreDatabase.While;

import wcoreDatabase.util.WcoreDatabaseValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WcoreDatabasePackageImpl extends EPackageImpl implements WcoreDatabasePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permissionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invokeOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invokeProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invokeGUIEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifElseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass crudGuiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processSelectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum permissionsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unaryOperatorsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum binaryOperatorsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum privilegesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum scopeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see wcoreDatabase.WcoreDatabasePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WcoreDatabasePackageImpl() {
		super(eNS_URI, WcoreDatabaseFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link WcoreDatabasePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WcoreDatabasePackage init() {
		if (isInited) return (WcoreDatabasePackage)EPackage.Registry.INSTANCE.getEPackage(WcoreDatabasePackage.eNS_URI);

		// Obtain or create and register package
		WcoreDatabasePackageImpl theWcoreDatabasePackage = (WcoreDatabasePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WcoreDatabasePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WcoreDatabasePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		GcoreDatabasePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theWcoreDatabasePackage.createPackageContents();

		// Initialize created meta-data
		theWcoreDatabasePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theWcoreDatabasePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return WcoreDatabaseValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theWcoreDatabasePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WcoreDatabasePackage.eNS_URI, theWcoreDatabasePackage);
		return theWcoreDatabasePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessContainer() {
		return processContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessContainer_Processes() {
		return (EReference)processContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcess() {
		return processEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_Variables() {
		return (EReference)processEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_StartTask() {
		return (EReference)processEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_Return() {
		return (EReference)processEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcess__ContainProcessSelectorTask__Task() {
		return processEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Permissions() {
		return (EReference)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPermission() {
		return permissionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPermission_Permission() {
		return (EAttribute)permissionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Changeable() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_DefaultValue() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_Value() {
		return (EReference)variableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Scope() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreate() {
		return createEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreate_EClass() {
		return (EReference)createEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreate_Return() {
		return (EReference)createEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreate_Anchor() {
		return (EReference)createEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvokeOperation() {
		return invokeOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvokeOperation_Context() {
		return (EReference)invokeOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvokeOperation_Operation() {
		return (EReference)invokeOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvokeOperation_Arguments() {
		return (EReference)invokeOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvokeOperation_Return() {
		return (EReference)invokeOperationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvokeOperation_Long() {
		return (EAttribute)invokeOperationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvokeProcess() {
		return invokeProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvokeProcess_SubProcess() {
		return (EReference)invokeProcessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvokeProcess_Arguments() {
		return (EReference)invokeProcessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvokeProcess_Return() {
		return (EReference)invokeProcessEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvokeProcess_Synchronized() {
		return (EAttribute)invokeProcessEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvokeGUI() {
		return invokeGUIEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvokeGUI_OutputAction() {
		return (EReference)invokeGUIEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvokeGUI_OutputData() {
		return (EReference)invokeGUIEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvokeGUI_Input() {
		return (EReference)invokeGUIEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvokeGUI_Page() {
		return (EReference)invokeGUIEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIf() {
		return ifEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIf_Condition() {
		return (EReference)ifEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIf_Body() {
		return (EReference)ifEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIfElse() {
		return ifElseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfElse_ElseBody() {
		return (EReference)ifElseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhile() {
		return whileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssign() {
		return assignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssign_Lhs() {
		return (EReference)assignEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssign_Rhs() {
		return (EReference)assignEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequence() {
		return sequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequence_Body() {
		return (EReference)sequenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequence_Follower() {
		return (EReference)sequenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminalExpression() {
		return terminalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerminalExpression_Refers() {
		return (EReference)terminalExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryExpression() {
		return unaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnaryExpression_Operator() {
		return (EAttribute)unaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnaryExpression_RightExpression() {
		return (EReference)unaryExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryExpression() {
		return binaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryExpression_Operator() {
		return (EAttribute)binaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExpression_LeftExpressions() {
		return (EReference)binaryExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExpression_RightExpression() {
		return (EReference)binaryExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelete() {
		return deleteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelete_Object() {
		return (EReference)deleteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRead() {
		return readEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRead_Object() {
		return (EReference)readEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRead_Return() {
		return (EReference)readEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCrudGui() {
		return crudGuiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrudGui_Contain() {
		return (EReference)crudGuiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrudGui_Privileges() {
		return (EAttribute)crudGuiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrudGui_Anchor() {
		return (EReference)crudGuiEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessSelector() {
		return processSelectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessSelector_Page() {
		return (EReference)processSelectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessSelector_Processes() {
		return (EReference)processSelectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcessSelector__ContainInvokeGUITask__Task() {
		return processSelectorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPermissions() {
		return permissionsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnaryOperators() {
		return unaryOperatorsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBinaryOperators() {
		return binaryOperatorsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrivileges() {
		return privilegesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getScope() {
		return scopeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WcoreDatabaseFactory getWcoreDatabaseFactory() {
		return (WcoreDatabaseFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		processContainerEClass = createEClass(PROCESS_CONTAINER);
		createEReference(processContainerEClass, PROCESS_CONTAINER__PROCESSES);

		processEClass = createEClass(PROCESS);
		createEReference(processEClass, PROCESS__VARIABLES);
		createEReference(processEClass, PROCESS__START_TASK);
		createEReference(processEClass, PROCESS__RETURN);
		createEOperation(processEClass, PROCESS___CONTAIN_PROCESS_SELECTOR_TASK__TASK);

		taskEClass = createEClass(TASK);
		createEReference(taskEClass, TASK__PERMISSIONS);

		permissionEClass = createEClass(PERMISSION);
		createEAttribute(permissionEClass, PERMISSION__PERMISSION);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__CHANGEABLE);
		createEAttribute(variableEClass, VARIABLE__DEFAULT_VALUE);
		createEReference(variableEClass, VARIABLE__VALUE);
		createEAttribute(variableEClass, VARIABLE__SCOPE);

		createEClass = createEClass(CREATE);
		createEReference(createEClass, CREATE__ECLASS);
		createEReference(createEClass, CREATE__RETURN);
		createEReference(createEClass, CREATE__ANCHOR);

		invokeOperationEClass = createEClass(INVOKE_OPERATION);
		createEReference(invokeOperationEClass, INVOKE_OPERATION__CONTEXT);
		createEReference(invokeOperationEClass, INVOKE_OPERATION__OPERATION);
		createEReference(invokeOperationEClass, INVOKE_OPERATION__ARGUMENTS);
		createEReference(invokeOperationEClass, INVOKE_OPERATION__RETURN);
		createEAttribute(invokeOperationEClass, INVOKE_OPERATION__LONG);

		invokeProcessEClass = createEClass(INVOKE_PROCESS);
		createEReference(invokeProcessEClass, INVOKE_PROCESS__SUB_PROCESS);
		createEReference(invokeProcessEClass, INVOKE_PROCESS__ARGUMENTS);
		createEReference(invokeProcessEClass, INVOKE_PROCESS__RETURN);
		createEAttribute(invokeProcessEClass, INVOKE_PROCESS__SYNCHRONIZED);

		invokeGUIEClass = createEClass(INVOKE_GUI);
		createEReference(invokeGUIEClass, INVOKE_GUI__OUTPUT_ACTION);
		createEReference(invokeGUIEClass, INVOKE_GUI__OUTPUT_DATA);
		createEReference(invokeGUIEClass, INVOKE_GUI__INPUT);
		createEReference(invokeGUIEClass, INVOKE_GUI__PAGE);

		ifEClass = createEClass(IF);
		createEReference(ifEClass, IF__CONDITION);
		createEReference(ifEClass, IF__BODY);

		ifElseEClass = createEClass(IF_ELSE);
		createEReference(ifElseEClass, IF_ELSE__ELSE_BODY);

		whileEClass = createEClass(WHILE);

		assignEClass = createEClass(ASSIGN);
		createEReference(assignEClass, ASSIGN__LHS);
		createEReference(assignEClass, ASSIGN__RHS);

		sequenceEClass = createEClass(SEQUENCE);
		createEReference(sequenceEClass, SEQUENCE__BODY);
		createEReference(sequenceEClass, SEQUENCE__FOLLOWER);

		expressionEClass = createEClass(EXPRESSION);

		terminalExpressionEClass = createEClass(TERMINAL_EXPRESSION);
		createEReference(terminalExpressionEClass, TERMINAL_EXPRESSION__REFERS);

		unaryExpressionEClass = createEClass(UNARY_EXPRESSION);
		createEAttribute(unaryExpressionEClass, UNARY_EXPRESSION__OPERATOR);
		createEReference(unaryExpressionEClass, UNARY_EXPRESSION__RIGHT_EXPRESSION);

		binaryExpressionEClass = createEClass(BINARY_EXPRESSION);
		createEAttribute(binaryExpressionEClass, BINARY_EXPRESSION__OPERATOR);
		createEReference(binaryExpressionEClass, BINARY_EXPRESSION__LEFT_EXPRESSIONS);
		createEReference(binaryExpressionEClass, BINARY_EXPRESSION__RIGHT_EXPRESSION);

		deleteEClass = createEClass(DELETE);
		createEReference(deleteEClass, DELETE__OBJECT);

		readEClass = createEClass(READ);
		createEReference(readEClass, READ__OBJECT);
		createEReference(readEClass, READ__RETURN);

		crudGuiEClass = createEClass(CRUD_GUI);
		createEReference(crudGuiEClass, CRUD_GUI__CONTAIN);
		createEAttribute(crudGuiEClass, CRUD_GUI__PRIVILEGES);
		createEReference(crudGuiEClass, CRUD_GUI__ANCHOR);

		processSelectorEClass = createEClass(PROCESS_SELECTOR);
		createEReference(processSelectorEClass, PROCESS_SELECTOR__PAGE);
		createEReference(processSelectorEClass, PROCESS_SELECTOR__PROCESSES);
		createEOperation(processSelectorEClass, PROCESS_SELECTOR___CONTAIN_INVOKE_GUI_TASK__TASK);

		// Create enums
		permissionsEEnum = createEEnum(PERMISSIONS);
		unaryOperatorsEEnum = createEEnum(UNARY_OPERATORS);
		binaryOperatorsEEnum = createEEnum(BINARY_OPERATORS);
		privilegesEEnum = createEEnum(PRIVILEGES);
		scopeEEnum = createEEnum(SCOPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		GcoreDatabasePackage theGcoreDatabasePackage = (GcoreDatabasePackage)EPackage.Registry.INSTANCE.getEPackage(GcoreDatabasePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		processContainerEClass.getESuperTypes().add(theEcorePackage.getEPackage());
		processEClass.getESuperTypes().add(theEcorePackage.getENamedElement());
		taskEClass.getESuperTypes().add(theEcorePackage.getENamedElement());
		permissionEClass.getESuperTypes().add(theEcorePackage.getENamedElement());
		variableEClass.getESuperTypes().add(theEcorePackage.getETypedElement());
		createEClass.getESuperTypes().add(this.getTask());
		invokeOperationEClass.getESuperTypes().add(this.getTask());
		invokeProcessEClass.getESuperTypes().add(this.getTask());
		invokeGUIEClass.getESuperTypes().add(this.getTask());
		ifEClass.getESuperTypes().add(this.getTask());
		ifElseEClass.getESuperTypes().add(this.getIf());
		whileEClass.getESuperTypes().add(this.getIf());
		assignEClass.getESuperTypes().add(this.getTask());
		sequenceEClass.getESuperTypes().add(this.getTask());
		terminalExpressionEClass.getESuperTypes().add(this.getExpression());
		unaryExpressionEClass.getESuperTypes().add(this.getExpression());
		binaryExpressionEClass.getESuperTypes().add(this.getExpression());
		deleteEClass.getESuperTypes().add(this.getTask());
		readEClass.getESuperTypes().add(this.getTask());
		crudGuiEClass.getESuperTypes().add(this.getTask());
		processSelectorEClass.getESuperTypes().add(this.getTask());

		// Initialize classes, features, and operations; add parameters
		initEClass(processContainerEClass, ProcessContainer.class, "ProcessContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessContainer_Processes(), this.getProcess(), null, "processes", null, 0, -1, ProcessContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processEClass, wcoreDatabase.Process.class, "Process", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcess_Variables(), this.getVariable(), null, "variables", null, 0, -1, wcoreDatabase.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_StartTask(), this.getTask(), null, "startTask", null, 1, 1, wcoreDatabase.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_Return(), this.getVariable(), null, "return", null, 0, -1, wcoreDatabase.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getProcess__ContainProcessSelectorTask__Task(), ecorePackage.getEBoolean(), "containProcessSelectorTask", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTask(), "t", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTask_Permissions(), this.getPermission(), null, "permissions", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(permissionEClass, Permission.class, "Permission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPermission_Permission(), this.getPermissions(), "permission", null, 1, 1, Permission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_Changeable(), ecorePackage.getEBoolean(), "changeable", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariable_Value(), theEcorePackage.getEObject(), null, "value", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Scope(), this.getScope(), "scope", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createEClass, Create.class, "Create", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCreate_EClass(), theEcorePackage.getEClass(), null, "eClass", null, 1, 1, Create.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCreate_Return(), this.getVariable(), null, "return", null, 1, 1, Create.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCreate_Anchor(), theEcorePackage.getEObject(), null, "anchor", null, 0, 1, Create.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(invokeOperationEClass, InvokeOperation.class, "InvokeOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInvokeOperation_Context(), this.getVariable(), null, "context", null, 1, 1, InvokeOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInvokeOperation_Operation(), theEcorePackage.getEOperation(), null, "operation", null, 1, 1, InvokeOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInvokeOperation_Arguments(), this.getVariable(), null, "arguments", null, 0, -1, InvokeOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInvokeOperation_Return(), this.getVariable(), null, "return", null, 0, 1, InvokeOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvokeOperation_Long(), ecorePackage.getEBoolean(), "long", null, 0, 1, InvokeOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(invokeProcessEClass, InvokeProcess.class, "InvokeProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInvokeProcess_SubProcess(), this.getProcess(), null, "subProcess", null, 1, 1, InvokeProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInvokeProcess_Arguments(), this.getVariable(), null, "arguments", null, 0, -1, InvokeProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInvokeProcess_Return(), this.getVariable(), null, "return", null, 0, -1, InvokeProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvokeProcess_Synchronized(), ecorePackage.getEBoolean(), "synchronized", null, 0, 1, InvokeProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(invokeGUIEClass, InvokeGUI.class, "InvokeGUI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInvokeGUI_OutputAction(), this.getVariable(), null, "outputAction", null, 0, -1, InvokeGUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInvokeGUI_OutputData(), this.getVariable(), null, "outputData", null, 0, -1, InvokeGUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInvokeGUI_Input(), this.getVariable(), null, "input", null, 0, -1, InvokeGUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInvokeGUI_Page(), theGcoreDatabasePackage.getPage(), null, "page", null, 1, 1, InvokeGUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ifEClass, If.class, "If", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIf_Condition(), this.getExpression(), null, "condition", null, 1, 1, If.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIf_Body(), this.getTask(), null, "body", null, 1, 1, If.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ifElseEClass, IfElse.class, "IfElse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIfElse_ElseBody(), this.getTask(), null, "elseBody", null, 1, 1, IfElse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(whileEClass, While.class, "While", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assignEClass, Assign.class, "Assign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssign_Lhs(), this.getVariable(), null, "lhs", null, 1, 1, Assign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssign_Rhs(), this.getExpression(), null, "rhs", null, 1, 1, Assign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sequenceEClass, Sequence.class, "Sequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSequence_Body(), this.getTask(), null, "body", null, 1, 1, Sequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequence_Follower(), this.getTask(), null, "follower", null, 1, 1, Sequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(terminalExpressionEClass, TerminalExpression.class, "TerminalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTerminalExpression_Refers(), this.getVariable(), null, "refers", null, 1, 1, TerminalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unaryExpressionEClass, UnaryExpression.class, "UnaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnaryExpression_Operator(), this.getUnaryOperators(), "operator", null, 1, 1, UnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnaryExpression_RightExpression(), this.getExpression(), null, "rightExpression", null, 1, 1, UnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryExpressionEClass, BinaryExpression.class, "BinaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBinaryExpression_Operator(), this.getBinaryOperators(), "operator", null, 1, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryExpression_LeftExpressions(), this.getExpression(), null, "leftExpressions", null, 1, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryExpression_RightExpression(), this.getExpression(), null, "rightExpression", null, 1, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deleteEClass, Delete.class, "Delete", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDelete_Object(), this.getVariable(), null, "object", null, 1, 1, Delete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(readEClass, Read.class, "Read", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRead_Object(), this.getVariable(), null, "object", null, 0, 1, Read.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRead_Return(), this.getVariable(), null, "return", null, 1, 1, Read.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(crudGuiEClass, CrudGui.class, "CrudGui", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCrudGui_Contain(), theEcorePackage.getEClass(), null, "contain", null, 1, 1, CrudGui.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCrudGui_Privileges(), this.getPrivileges(), "privileges", null, 1, 1, CrudGui.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCrudGui_Anchor(), theEcorePackage.getEObject(), null, "anchor", null, 0, 1, CrudGui.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processSelectorEClass, ProcessSelector.class, "ProcessSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessSelector_Page(), theGcoreDatabasePackage.getPage(), null, "page", null, 1, 1, ProcessSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessSelector_Processes(), this.getProcess(), null, "processes", null, 1, -1, ProcessSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getProcessSelector__ContainInvokeGUITask__Task(), ecorePackage.getEBoolean(), "containInvokeGUITask", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTask(), "t", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(permissionsEEnum, Permissions.class, "Permissions");
		addEEnumLiteral(permissionsEEnum, Permissions.INTERNET);
		addEEnumLiteral(permissionsEEnum, Permissions.FILE_SYSTEM);
		addEEnumLiteral(permissionsEEnum, Permissions.CALL);
		addEEnumLiteral(permissionsEEnum, Permissions.ACCESS_FINE_LOCATION);
		addEEnumLiteral(permissionsEEnum, Permissions.ACCESS_NETWORK_STATE);
		addEEnumLiteral(permissionsEEnum, Permissions.CAMERA);
		addEEnumLiteral(permissionsEEnum, Permissions.WRITE_CALENDAR);
		addEEnumLiteral(permissionsEEnum, Permissions.READ_CALENDAR);
		addEEnumLiteral(permissionsEEnum, Permissions.MICROPHONE);

		initEEnum(unaryOperatorsEEnum, UnaryOperators.class, "UnaryOperators");
		addEEnumLiteral(unaryOperatorsEEnum, UnaryOperators.NOT);
		addEEnumLiteral(unaryOperatorsEEnum, UnaryOperators.HEAD);
		addEEnumLiteral(unaryOperatorsEEnum, UnaryOperators.ID);

		initEEnum(binaryOperatorsEEnum, BinaryOperators.class, "BinaryOperators");
		addEEnumLiteral(binaryOperatorsEEnum, BinaryOperators.AND);
		addEEnumLiteral(binaryOperatorsEEnum, BinaryOperators.CONTAINS);
		addEEnumLiteral(binaryOperatorsEEnum, BinaryOperators.CONCAT);
		addEEnumLiteral(binaryOperatorsEEnum, BinaryOperators.EQUAL);

		initEEnum(privilegesEEnum, Privileges.class, "Privileges");
		addEEnumLiteral(privilegesEEnum, Privileges.READ_ONLY);
		addEEnumLiteral(privilegesEEnum, Privileges.MODIFY);
		addEEnumLiteral(privilegesEEnum, Privileges.MODIFY_CREATE);
		addEEnumLiteral(privilegesEEnum, Privileges.ALL);

		initEEnum(scopeEEnum, Scope.class, "Scope");
		addEEnumLiteral(scopeEEnum, Scope.LOCAL);
		addEEnumLiteral(scopeEEnum, Scope.GLOBAL);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });	
		addAnnotation
		  (processContainerEClass, 
		   source, 
		   new String[] {
			 "constraints", "oneMainProcess"
		   });	
		addAnnotation
		  (processEClass, 
		   source, 
		   new String[] {
			 "constraints", "oneProcessSelectorInMainProcess"
		   });	
		addAnnotation
		  (invokeProcessEClass, 
		   source, 
		   new String[] {
			 "constraints", "conformingArgumentsToParameters"
		   });	
		addAnnotation
		  (invokeGUIEClass, 
		   source, 
		   new String[] {
			 "constraints", "MapPageOutput LoginPageOutput LoginPageInput ViewPageOutput EditPage SelectableListPageOutput SelectablePageInput"
		   });	
		addAnnotation
		  (processSelectorEClass, 
		   source, 
		   new String[] {
			 "constraints", "oneGUITaskInAllSubProcesses"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";	
		addAnnotation
		  (processContainerEClass, 
		   source, 
		   new String[] {
			 "oneMainProcess", "self.processes->select(p : Process | p.name = \'Main\')->size() = 1"
		   });	
		addAnnotation
		  (processEClass, 
		   source, 
		   new String[] {
			 "oneProcessSelectorInMainProcess", "self.name = \'Main\' implies containProcessSelectorTask(self.startTask.oclAsType(wcore::Task))"
		   });	
		addAnnotation
		  (getProcess__ContainProcessSelectorTask__Task(), 
		   source, 
		   new String[] {
			 "body", "if (t.oclIsTypeOf(wcore::If)) then containProcessSelectorTask(t.oclAsType(wcore::If)._body.oclAsType(wcore::Task)) else\r\nif (t.oclIsTypeOf(wcore::While)) then containProcessSelectorTask(t.oclAsType(wcore::While)._body.oclAsType(wcore::Task)) else\r\nif (t.oclIsTypeOf(wcore::IfElse)) then containProcessSelectorTask(t.oclAsType(wcore::IfElse)._body.oclAsType(wcore::Task)) and containProcessSelectorTask(t.oclAsType(wcore::IfElse)._elseBody.oclAsType(wcore::Task)) else\r\nif (t.oclIsTypeOf(wcore::Sequence)) then containProcessSelectorTask(t.oclAsType(wcore::Sequence)._body.oclAsType(wcore::Task)) or containProcessSelectorTask(t.oclAsType(wcore::Sequence).follower.oclAsType(wcore::Task)) else\r\nt.oclIsTypeOf(wcore::ProcessSelector) \r\nendif endif endif endif"
		   });	
		addAnnotation
		  (invokeProcessEClass, 
		   source, 
		   new String[] {
			 "conformingArgumentsToParameters", "self.arguments -> size() = self.subProcess.variables -> select(v:wcore::Variable|v.scope.oclAsType(wcore::Scope)=wcore::Scope::GLOBAL) ->size() and\r\nSequence{1..self.arguments -> size()} -> forAll(i:Integer | let var1:wcore::Variable = self.arguments->at(i), var2:wcore::Variable=self.subProcess.variables->select(v:wcore::Variable|v.scope.oclAsType(wcore::Scope)=wcore::Scope::GLOBAL)->at(i) in var1.oclAsType(wcore::Variable).eType=var2.oclAsType(wcore::Variable).eType)"
		   });	
		addAnnotation
		  (invokeGUIEClass, 
		   source, 
		   new String[] {
			 "MapPageOutput", "self.page.oclIsTypeOf(GcoreDatabase::MapPage) implies self.outputData -> size() = 2 and self.outputData -> forAll(var:Variable|var.eType=ecore::EDouble)",
			 "LoginPageOutput", "self.page.oclIsTypeOf(GcoreDatabase::LoginPage) implies self.outputData -> size() = 1 and self.outputData -> forAll(var:Variable|var.eType=ecore::EBoolean)",
			 "LoginPageInput", "self.page.oclIsTypeOf(GcoreDatabase::LoginPage) implies self.input -> size() = 2 and self.input -> forAll(var:Variable|var.eType=ecore::EString)",
			 "ViewPageOutput", "self.page.oclIsTypeOf(GcoreDatabase::ViewPage) implies self.outputData -> size() = 1 and self.outputData -> forAll(var:Variable|var.eType.oclIsKindOf(ecore::EObject))",
			 "EditPage", "self.page.oclIsTypeOf(GcoreDatabase::EditPage) implies self.outputData -> size() = 1 and self.input -> size() = 1 and self.input -> forAll(var:Variable|var.eType=self.outputData -> at(1).eType)",
			 "SelectableListPageOutput", "self.page.oclIsTypeOf(GcoreDatabase::SelectableListPage) or self.page.oclIsTypeOf(GcoreDatabase::ListPage) implies self.outputData -> size() = 1 and self.outputData -> forAll(var:Variable|var.upperBound=-1)",
			 "SelectablePageInput", "self.page.oclIsTypeOf(GcoreDatabase::SelectableListPage) implies self.input -> size() = 1 and self.input -> forAll(var:Variable|var.eType=self.outputData -> at(1).eType and var.upperBound=1)"
		   });	
		addAnnotation
		  (processSelectorEClass, 
		   source, 
		   new String[] {
			 "oneGUITaskInAllSubProcesses", "self.oclAsType(wcore::ProcessSelector).processes -> select(proc:wcore::Process|containInvokeGUITask(proc.startTask.oclAsType(wcore::Task))) -> size() = (self.oclAsType(wcore::ProcessSelector).processes -> size())"
		   });	
		addAnnotation
		  (getProcessSelector__ContainInvokeGUITask__Task(), 
		   source, 
		   new String[] {
			 "body", "if (t.oclIsTypeOf(wcore::If)) then containInvokeGUITask(t.oclAsType(wcore::If)._body.oclAsType(wcore::Task)) else\r\nif (t.oclIsTypeOf(wcore::While)) then containInvokeGUITask(t.oclAsType(wcore::While)._body.oclAsType(wcore::Task)) else\r\nif (t.oclIsTypeOf(wcore::IfElse)) then containInvokeGUITask(t.oclAsType(wcore::IfElse)._body.oclAsType(wcore::Task)) or containInvokeGUITask(t.oclAsType\r\r\n(wcore::IfElse)._elseBody.oclAsType(wcore::Task)) else\r\nif (t.oclIsTypeOf(wcore::Sequence)) then containInvokeGUITask(t.oclAsType(wcore::Sequence)._body.oclAsType(wcore::Task)) or containInvokeGUITask(t.oclAsType\r\r\n(wcore::Sequence).follower.oclAsType(wcore::Task)) else\r\nif (t.oclIsTypeOf(wcore::InvokeProcess)) then containInvokeGUITask(t.oclAsType(wcore::InvokeProcess).subProcess.startTask.oclAsType(wcore::Task)) else\r\nif (t.oclIsTypeOf(wcore::ProcessSelector)) then t.oclAsType(wcore::ProcessSelector).processes -> select(proc:wcore::Process|containInvokeGUITask\r\r\n(proc.startTask.oclAsType(wcore::Task))) -> size() = (t.oclAsType(wcore::ProcessSelector).processes -> size()) else\r\nt.oclIsTypeOf(wcore::InvokeGUI) or t.oclIsTypeOf(wcore::CrudGui)\r\nendif endif endif endif endif endif"
		   });
	}

} //WcoreDatabasePackageImpl
