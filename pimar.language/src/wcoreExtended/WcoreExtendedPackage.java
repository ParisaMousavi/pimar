/**
 */
package wcoreExtended;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import wcore.WcorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see wcoreExtended.WcoreExtendedFactory
 * @model kind="package"
 * @generated
 */
public interface WcoreExtendedPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "wcoreExtended";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/2002/WcoreExtended";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "wcoreExtended";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WcoreExtendedPackage eINSTANCE = wcoreExtended.impl.WcoreExtendedPackageImpl.init();

	/**
	 * The meta object id for the '{@link wcoreExtended.impl.ProcessContainerImpl <em>Process Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wcoreExtended.impl.ProcessContainerImpl
	 * @see wcoreExtended.impl.WcoreExtendedPackageImpl#getProcessContainer()
	 * @generated
	 */
	int PROCESS_CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CONTAINER__EANNOTATIONS = WcorePackage.PROCESS_CONTAINER__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CONTAINER__NAME = WcorePackage.PROCESS_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CONTAINER__NS_URI = WcorePackage.PROCESS_CONTAINER__NS_URI;

	/**
	 * The feature id for the '<em><b>Ns Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CONTAINER__NS_PREFIX = WcorePackage.PROCESS_CONTAINER__NS_PREFIX;

	/**
	 * The feature id for the '<em><b>EFactory Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CONTAINER__EFACTORY_INSTANCE = WcorePackage.PROCESS_CONTAINER__EFACTORY_INSTANCE;

	/**
	 * The feature id for the '<em><b>EClassifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CONTAINER__ECLASSIFIERS = WcorePackage.PROCESS_CONTAINER__ECLASSIFIERS;

	/**
	 * The feature id for the '<em><b>ESubpackages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CONTAINER__ESUBPACKAGES = WcorePackage.PROCESS_CONTAINER__ESUBPACKAGES;

	/**
	 * The feature id for the '<em><b>ESuper Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CONTAINER__ESUPER_PACKAGE = WcorePackage.PROCESS_CONTAINER__ESUPER_PACKAGE;

	/**
	 * The feature id for the '<em><b>Processes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CONTAINER__PROCESSES = WcorePackage.PROCESS_CONTAINER__PROCESSES;

	/**
	 * The number of structural features of the '<em>Process Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CONTAINER_FEATURE_COUNT = WcorePackage.PROCESS_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CONTAINER___GET_EANNOTATION__STRING = WcorePackage.PROCESS_CONTAINER___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get EClassifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CONTAINER___GET_ECLASSIFIER__STRING = WcorePackage.PROCESS_CONTAINER___GET_ECLASSIFIER__STRING;

	/**
	 * The number of operations of the '<em>Process Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CONTAINER_OPERATION_COUNT = WcorePackage.PROCESS_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wcoreExtended.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wcoreExtended.impl.ProcessImpl
	 * @see wcoreExtended.impl.WcoreExtendedPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 1;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__EANNOTATIONS = WcorePackage.PROCESS__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAME = WcorePackage.PROCESS__NAME;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__VARIABLES = WcorePackage.PROCESS__VARIABLES;

	/**
	 * The feature id for the '<em><b>Start Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__START_TASK = WcorePackage.PROCESS__START_TASK;

	/**
	 * The feature id for the '<em><b>Return</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__RETURN = WcorePackage.PROCESS__RETURN;

	/**
	 * The feature id for the '<em><b>Refs True</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__REFS_TRUE = WcorePackage.PROCESS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Refs False</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__REFS_FALSE = WcorePackage.PROCESS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>All Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ALL_TASKS = WcorePackage.PROCESS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = WcorePackage.PROCESS_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___GET_EANNOTATION__STRING = WcorePackage.PROCESS___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Contain Process Selector Task</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___CONTAIN_PROCESS_SELECTOR_TASK__TASK = WcorePackage.PROCESS___CONTAIN_PROCESS_SELECTOR_TASK__TASK;

	/**
	 * The number of operations of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OPERATION_COUNT = WcorePackage.PROCESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wcoreExtended.impl.If1Impl <em>If1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wcoreExtended.impl.If1Impl
	 * @see wcoreExtended.impl.WcoreExtendedPackageImpl#getIf1()
	 * @generated
	 */
	int IF1 = 2;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF1__EANNOTATIONS = WcorePackage.TASK__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF1__NAME = WcorePackage.TASK__NAME;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF1__PERMISSIONS = WcorePackage.TASK__PERMISSIONS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF1__CONDITION = WcorePackage.TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>If1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF1_FEATURE_COUNT = WcorePackage.TASK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF1___GET_EANNOTATION__STRING = WcorePackage.TASK___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>If1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF1_OPERATION_COUNT = WcorePackage.TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wcoreExtended.impl.IfElse1Impl <em>If Else1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wcoreExtended.impl.IfElse1Impl
	 * @see wcoreExtended.impl.WcoreExtendedPackageImpl#getIfElse1()
	 * @generated
	 */
	int IF_ELSE1 = 3;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_ELSE1__EANNOTATIONS = WcorePackage.TASK__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_ELSE1__NAME = WcorePackage.TASK__NAME;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_ELSE1__PERMISSIONS = WcorePackage.TASK__PERMISSIONS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_ELSE1__CONDITION = WcorePackage.TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>If Else1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_ELSE1_FEATURE_COUNT = WcorePackage.TASK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_ELSE1___GET_EANNOTATION__STRING = WcorePackage.TASK___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>If Else1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_ELSE1_OPERATION_COUNT = WcorePackage.TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wcoreExtended.impl.While1Impl <em>While1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wcoreExtended.impl.While1Impl
	 * @see wcoreExtended.impl.WcoreExtendedPackageImpl#getWhile1()
	 * @generated
	 */
	int WHILE1 = 4;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE1__EANNOTATIONS = WcorePackage.TASK__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE1__NAME = WcorePackage.TASK__NAME;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE1__PERMISSIONS = WcorePackage.TASK__PERMISSIONS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE1__CONDITION = WcorePackage.TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>While1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE1_FEATURE_COUNT = WcorePackage.TASK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE1___GET_EANNOTATION__STRING = WcorePackage.TASK___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>While1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE1_OPERATION_COUNT = WcorePackage.TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wcoreExtended.impl.RefTrueImpl <em>Ref True</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wcoreExtended.impl.RefTrueImpl
	 * @see wcoreExtended.impl.WcoreExtendedPackageImpl#getRefTrue()
	 * @generated
	 */
	int REF_TRUE = 5;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_TRUE__EANNOTATIONS = EcorePackage.ENAMED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_TRUE__NAME = EcorePackage.ENAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_TRUE__PRE = EcorePackage.ENAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Suc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_TRUE__SUC = EcorePackage.ENAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ref True</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_TRUE_FEATURE_COUNT = EcorePackage.ENAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_TRUE___GET_EANNOTATION__STRING = EcorePackage.ENAMED_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Ref True</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_TRUE_OPERATION_COUNT = EcorePackage.ENAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wcoreExtended.impl.RefFalseImpl <em>Ref False</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wcoreExtended.impl.RefFalseImpl
	 * @see wcoreExtended.impl.WcoreExtendedPackageImpl#getRefFalse()
	 * @generated
	 */
	int REF_FALSE = 6;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_FALSE__EANNOTATIONS = EcorePackage.ENAMED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_FALSE__NAME = EcorePackage.ENAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_FALSE__PRE = EcorePackage.ENAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Suc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_FALSE__SUC = EcorePackage.ENAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ref False</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_FALSE_FEATURE_COUNT = EcorePackage.ENAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_FALSE___GET_EANNOTATION__STRING = EcorePackage.ENAMED_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Ref False</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_FALSE_OPERATION_COUNT = EcorePackage.ENAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wcoreExtended.impl.ConditionalNodeImpl <em>Conditional Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wcoreExtended.impl.ConditionalNodeImpl
	 * @see wcoreExtended.impl.WcoreExtendedPackageImpl#getConditionalNode()
	 * @generated
	 */
	int CONDITIONAL_NODE = 7;

	/**
	 * The number of structural features of the '<em>Conditional Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Conditional Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wcoreExtended.impl.Assign1Impl <em>Assign1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wcoreExtended.impl.Assign1Impl
	 * @see wcoreExtended.impl.WcoreExtendedPackageImpl#getAssign1()
	 * @generated
	 */
	int ASSIGN1 = 8;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN1__EANNOTATIONS = WcorePackage.TASK__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN1__NAME = WcorePackage.TASK__NAME;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN1__PERMISSIONS = WcorePackage.TASK__PERMISSIONS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN1__RHS = WcorePackage.TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN1__LHS = WcorePackage.TASK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assign1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN1_FEATURE_COUNT = WcorePackage.TASK_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN1___GET_EANNOTATION__STRING = WcorePackage.TASK___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Assign1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN1_OPERATION_COUNT = WcorePackage.TASK_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link wcoreExtended.ProcessContainer <em>Process Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Container</em>'.
	 * @see wcoreExtended.ProcessContainer
	 * @generated
	 */
	EClass getProcessContainer();

	/**
	 * Returns the meta object for class '{@link wcoreExtended.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see wcoreExtended.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the containment reference list '{@link wcoreExtended.Process#getRefsTrue <em>Refs True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Refs True</em>'.
	 * @see wcoreExtended.Process#getRefsTrue()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_RefsTrue();

	/**
	 * Returns the meta object for the containment reference list '{@link wcoreExtended.Process#getRefsFalse <em>Refs False</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Refs False</em>'.
	 * @see wcoreExtended.Process#getRefsFalse()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_RefsFalse();

	/**
	 * Returns the meta object for the containment reference list '{@link wcoreExtended.Process#getAllTasks <em>All Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>All Tasks</em>'.
	 * @see wcoreExtended.Process#getAllTasks()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_AllTasks();

	/**
	 * Returns the meta object for class '{@link wcoreExtended.If1 <em>If1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If1</em>'.
	 * @see wcoreExtended.If1
	 * @generated
	 */
	EClass getIf1();

	/**
	 * Returns the meta object for the attribute '{@link wcoreExtended.If1#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see wcoreExtended.If1#getCondition()
	 * @see #getIf1()
	 * @generated
	 */
	EAttribute getIf1_Condition();

	/**
	 * Returns the meta object for class '{@link wcoreExtended.IfElse1 <em>If Else1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Else1</em>'.
	 * @see wcoreExtended.IfElse1
	 * @generated
	 */
	EClass getIfElse1();

	/**
	 * Returns the meta object for the attribute '{@link wcoreExtended.IfElse1#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see wcoreExtended.IfElse1#getCondition()
	 * @see #getIfElse1()
	 * @generated
	 */
	EAttribute getIfElse1_Condition();

	/**
	 * Returns the meta object for class '{@link wcoreExtended.While1 <em>While1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While1</em>'.
	 * @see wcoreExtended.While1
	 * @generated
	 */
	EClass getWhile1();

	/**
	 * Returns the meta object for the attribute '{@link wcoreExtended.While1#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see wcoreExtended.While1#getCondition()
	 * @see #getWhile1()
	 * @generated
	 */
	EAttribute getWhile1_Condition();

	/**
	 * Returns the meta object for class '{@link wcoreExtended.RefTrue <em>Ref True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref True</em>'.
	 * @see wcoreExtended.RefTrue
	 * @generated
	 */
	EClass getRefTrue();

	/**
	 * Returns the meta object for the reference '{@link wcoreExtended.RefTrue#getPre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pre</em>'.
	 * @see wcoreExtended.RefTrue#getPre()
	 * @see #getRefTrue()
	 * @generated
	 */
	EReference getRefTrue_Pre();

	/**
	 * Returns the meta object for the reference '{@link wcoreExtended.RefTrue#getSuc <em>Suc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Suc</em>'.
	 * @see wcoreExtended.RefTrue#getSuc()
	 * @see #getRefTrue()
	 * @generated
	 */
	EReference getRefTrue_Suc();

	/**
	 * Returns the meta object for class '{@link wcoreExtended.RefFalse <em>Ref False</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref False</em>'.
	 * @see wcoreExtended.RefFalse
	 * @generated
	 */
	EClass getRefFalse();

	/**
	 * Returns the meta object for the reference '{@link wcoreExtended.RefFalse#getPre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pre</em>'.
	 * @see wcoreExtended.RefFalse#getPre()
	 * @see #getRefFalse()
	 * @generated
	 */
	EReference getRefFalse_Pre();

	/**
	 * Returns the meta object for the reference '{@link wcoreExtended.RefFalse#getSuc <em>Suc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Suc</em>'.
	 * @see wcoreExtended.RefFalse#getSuc()
	 * @see #getRefFalse()
	 * @generated
	 */
	EReference getRefFalse_Suc();

	/**
	 * Returns the meta object for class '{@link wcoreExtended.ConditionalNode <em>Conditional Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Node</em>'.
	 * @see wcoreExtended.ConditionalNode
	 * @generated
	 */
	EClass getConditionalNode();

	/**
	 * Returns the meta object for class '{@link wcoreExtended.Assign1 <em>Assign1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assign1</em>'.
	 * @see wcoreExtended.Assign1
	 * @generated
	 */
	EClass getAssign1();

	/**
	 * Returns the meta object for the attribute '{@link wcoreExtended.Assign1#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rhs</em>'.
	 * @see wcoreExtended.Assign1#getRhs()
	 * @see #getAssign1()
	 * @generated
	 */
	EAttribute getAssign1_Rhs();

	/**
	 * Returns the meta object for the reference '{@link wcoreExtended.Assign1#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lhs</em>'.
	 * @see wcoreExtended.Assign1#getLhs()
	 * @see #getAssign1()
	 * @generated
	 */
	EReference getAssign1_Lhs();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WcoreExtendedFactory getWcoreExtendedFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link wcoreExtended.impl.ProcessContainerImpl <em>Process Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wcoreExtended.impl.ProcessContainerImpl
		 * @see wcoreExtended.impl.WcoreExtendedPackageImpl#getProcessContainer()
		 * @generated
		 */
		EClass PROCESS_CONTAINER = eINSTANCE.getProcessContainer();

		/**
		 * The meta object literal for the '{@link wcoreExtended.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wcoreExtended.impl.ProcessImpl
		 * @see wcoreExtended.impl.WcoreExtendedPackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '<em><b>Refs True</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__REFS_TRUE = eINSTANCE.getProcess_RefsTrue();

		/**
		 * The meta object literal for the '<em><b>Refs False</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__REFS_FALSE = eINSTANCE.getProcess_RefsFalse();

		/**
		 * The meta object literal for the '<em><b>All Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__ALL_TASKS = eINSTANCE.getProcess_AllTasks();

		/**
		 * The meta object literal for the '{@link wcoreExtended.impl.If1Impl <em>If1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wcoreExtended.impl.If1Impl
		 * @see wcoreExtended.impl.WcoreExtendedPackageImpl#getIf1()
		 * @generated
		 */
		EClass IF1 = eINSTANCE.getIf1();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IF1__CONDITION = eINSTANCE.getIf1_Condition();

		/**
		 * The meta object literal for the '{@link wcoreExtended.impl.IfElse1Impl <em>If Else1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wcoreExtended.impl.IfElse1Impl
		 * @see wcoreExtended.impl.WcoreExtendedPackageImpl#getIfElse1()
		 * @generated
		 */
		EClass IF_ELSE1 = eINSTANCE.getIfElse1();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IF_ELSE1__CONDITION = eINSTANCE.getIfElse1_Condition();

		/**
		 * The meta object literal for the '{@link wcoreExtended.impl.While1Impl <em>While1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wcoreExtended.impl.While1Impl
		 * @see wcoreExtended.impl.WcoreExtendedPackageImpl#getWhile1()
		 * @generated
		 */
		EClass WHILE1 = eINSTANCE.getWhile1();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHILE1__CONDITION = eINSTANCE.getWhile1_Condition();

		/**
		 * The meta object literal for the '{@link wcoreExtended.impl.RefTrueImpl <em>Ref True</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wcoreExtended.impl.RefTrueImpl
		 * @see wcoreExtended.impl.WcoreExtendedPackageImpl#getRefTrue()
		 * @generated
		 */
		EClass REF_TRUE = eINSTANCE.getRefTrue();

		/**
		 * The meta object literal for the '<em><b>Pre</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_TRUE__PRE = eINSTANCE.getRefTrue_Pre();

		/**
		 * The meta object literal for the '<em><b>Suc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_TRUE__SUC = eINSTANCE.getRefTrue_Suc();

		/**
		 * The meta object literal for the '{@link wcoreExtended.impl.RefFalseImpl <em>Ref False</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wcoreExtended.impl.RefFalseImpl
		 * @see wcoreExtended.impl.WcoreExtendedPackageImpl#getRefFalse()
		 * @generated
		 */
		EClass REF_FALSE = eINSTANCE.getRefFalse();

		/**
		 * The meta object literal for the '<em><b>Pre</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_FALSE__PRE = eINSTANCE.getRefFalse_Pre();

		/**
		 * The meta object literal for the '<em><b>Suc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_FALSE__SUC = eINSTANCE.getRefFalse_Suc();

		/**
		 * The meta object literal for the '{@link wcoreExtended.impl.ConditionalNodeImpl <em>Conditional Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wcoreExtended.impl.ConditionalNodeImpl
		 * @see wcoreExtended.impl.WcoreExtendedPackageImpl#getConditionalNode()
		 * @generated
		 */
		EClass CONDITIONAL_NODE = eINSTANCE.getConditionalNode();

		/**
		 * The meta object literal for the '{@link wcoreExtended.impl.Assign1Impl <em>Assign1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wcoreExtended.impl.Assign1Impl
		 * @see wcoreExtended.impl.WcoreExtendedPackageImpl#getAssign1()
		 * @generated
		 */
		EClass ASSIGN1 = eINSTANCE.getAssign1();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGN1__RHS = eINSTANCE.getAssign1_Rhs();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGN1__LHS = eINSTANCE.getAssign1_Lhs();

	}

} //WcoreExtendedPackage
