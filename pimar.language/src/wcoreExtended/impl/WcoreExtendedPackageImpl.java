/**
 */
package wcoreExtended.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import wcore.WcorePackage;

import wcoreExtended.Assign1;
import wcoreExtended.ConditionalNode;
import wcoreExtended.If1;
import wcoreExtended.IfElse1;
import wcoreExtended.ProcessContainer;
import wcoreExtended.RefFalse;
import wcoreExtended.RefTrue;
import wcoreExtended.WcoreExtendedFactory;
import wcoreExtended.WcoreExtendedPackage;
import wcoreExtended.While1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WcoreExtendedPackageImpl extends EPackageImpl implements WcoreExtendedPackage {
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
	private EClass if1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifElse1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass while1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refTrueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refFalseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assign1EClass = null;

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
	 * @see wcoreExtended.WcoreExtendedPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WcoreExtendedPackageImpl() {
		super(eNS_URI, WcoreExtendedFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link WcoreExtendedPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WcoreExtendedPackage init() {
		if (isInited) return (WcoreExtendedPackage)EPackage.Registry.INSTANCE.getEPackage(WcoreExtendedPackage.eNS_URI);

		// Obtain or create and register package
		WcoreExtendedPackageImpl theWcoreExtendedPackage = (WcoreExtendedPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WcoreExtendedPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WcoreExtendedPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		WcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theWcoreExtendedPackage.createPackageContents();

		// Initialize created meta-data
		theWcoreExtendedPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWcoreExtendedPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WcoreExtendedPackage.eNS_URI, theWcoreExtendedPackage);
		return theWcoreExtendedPackage;
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
	public EClass getProcess() {
		return processEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_RefsTrue() {
		return (EReference)processEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_RefsFalse() {
		return (EReference)processEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_AllTasks() {
		return (EReference)processEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIf1() {
		return if1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIf1_Condition() {
		return (EAttribute)if1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIfElse1() {
		return ifElse1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIfElse1_Condition() {
		return (EAttribute)ifElse1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhile1() {
		return while1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWhile1_Condition() {
		return (EAttribute)while1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefTrue() {
		return refTrueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefTrue_Pre() {
		return (EReference)refTrueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefTrue_Suc() {
		return (EReference)refTrueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefFalse() {
		return refFalseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefFalse_Pre() {
		return (EReference)refFalseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefFalse_Suc() {
		return (EReference)refFalseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalNode() {
		return conditionalNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssign1() {
		return assign1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssign1_Rhs() {
		return (EAttribute)assign1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssign1_Lhs() {
		return (EReference)assign1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WcoreExtendedFactory getWcoreExtendedFactory() {
		return (WcoreExtendedFactory)getEFactoryInstance();
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

		processEClass = createEClass(PROCESS);
		createEReference(processEClass, PROCESS__REFS_TRUE);
		createEReference(processEClass, PROCESS__REFS_FALSE);
		createEReference(processEClass, PROCESS__ALL_TASKS);

		if1EClass = createEClass(IF1);
		createEAttribute(if1EClass, IF1__CONDITION);

		ifElse1EClass = createEClass(IF_ELSE1);
		createEAttribute(ifElse1EClass, IF_ELSE1__CONDITION);

		while1EClass = createEClass(WHILE1);
		createEAttribute(while1EClass, WHILE1__CONDITION);

		refTrueEClass = createEClass(REF_TRUE);
		createEReference(refTrueEClass, REF_TRUE__PRE);
		createEReference(refTrueEClass, REF_TRUE__SUC);

		refFalseEClass = createEClass(REF_FALSE);
		createEReference(refFalseEClass, REF_FALSE__PRE);
		createEReference(refFalseEClass, REF_FALSE__SUC);

		conditionalNodeEClass = createEClass(CONDITIONAL_NODE);

		assign1EClass = createEClass(ASSIGN1);
		createEAttribute(assign1EClass, ASSIGN1__RHS);
		createEReference(assign1EClass, ASSIGN1__LHS);
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
		WcorePackage theWcorePackage = (WcorePackage)EPackage.Registry.INSTANCE.getEPackage(WcorePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		processContainerEClass.getESuperTypes().add(theWcorePackage.getProcessContainer());
		processEClass.getESuperTypes().add(theWcorePackage.getProcess());
		if1EClass.getESuperTypes().add(theWcorePackage.getTask());
		if1EClass.getESuperTypes().add(this.getConditionalNode());
		ifElse1EClass.getESuperTypes().add(theWcorePackage.getTask());
		ifElse1EClass.getESuperTypes().add(this.getConditionalNode());
		while1EClass.getESuperTypes().add(theWcorePackage.getTask());
		while1EClass.getESuperTypes().add(this.getConditionalNode());
		refTrueEClass.getESuperTypes().add(theEcorePackage.getENamedElement());
		refFalseEClass.getESuperTypes().add(theEcorePackage.getENamedElement());
		assign1EClass.getESuperTypes().add(theWcorePackage.getTask());

		// Initialize classes, features, and operations; add parameters
		initEClass(processContainerEClass, ProcessContainer.class, "ProcessContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(processEClass, wcoreExtended.Process.class, "Process", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcess_RefsTrue(), this.getRefTrue(), null, "RefsTrue", null, 0, -1, wcoreExtended.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_RefsFalse(), this.getRefFalse(), null, "RefsFalse", null, 0, -1, wcoreExtended.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_AllTasks(), theWcorePackage.getTask(), null, "allTasks", null, 0, -1, wcoreExtended.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(if1EClass, If1.class, "If1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIf1_Condition(), theEcorePackage.getEString(), "Condition", null, 1, 1, If1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ifElse1EClass, IfElse1.class, "IfElse1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIfElse1_Condition(), theEcorePackage.getEString(), "Condition", null, 1, 1, IfElse1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(while1EClass, While1.class, "While1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWhile1_Condition(), theEcorePackage.getEString(), "Condition", null, 1, 1, While1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refTrueEClass, RefTrue.class, "RefTrue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRefTrue_Pre(), theWcorePackage.getTask(), null, "pre", null, 1, 1, RefTrue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRefTrue_Suc(), theWcorePackage.getTask(), null, "suc", null, 1, 1, RefTrue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refFalseEClass, RefFalse.class, "RefFalse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRefFalse_Pre(), this.getConditionalNode(), null, "pre", null, 1, 1, RefFalse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRefFalse_Suc(), theWcorePackage.getTask(), null, "suc", null, 1, 1, RefFalse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionalNodeEClass, ConditionalNode.class, "ConditionalNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assign1EClass, Assign1.class, "Assign1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssign1_Rhs(), theEcorePackage.getEString(), "rhs", null, 0, 1, Assign1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssign1_Lhs(), theWcorePackage.getVariable(), null, "lhs", null, 1, 1, Assign1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //WcoreExtendedPackageImpl
