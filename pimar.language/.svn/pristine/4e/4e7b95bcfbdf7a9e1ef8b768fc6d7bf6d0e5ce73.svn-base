/**
 */
package wcoreExtended.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WcoreExtendedFactoryImpl extends EFactoryImpl implements WcoreExtendedFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WcoreExtendedFactory init() {
		try {
			WcoreExtendedFactory theWcoreExtendedFactory = (WcoreExtendedFactory)EPackage.Registry.INSTANCE.getEFactory(WcoreExtendedPackage.eNS_URI);
			if (theWcoreExtendedFactory != null) {
				return theWcoreExtendedFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WcoreExtendedFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WcoreExtendedFactoryImpl() {
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
			case WcoreExtendedPackage.PROCESS_CONTAINER: return createProcessContainer();
			case WcoreExtendedPackage.PROCESS: return createProcess();
			case WcoreExtendedPackage.IF1: return createIf1();
			case WcoreExtendedPackage.IF_ELSE1: return createIfElse1();
			case WcoreExtendedPackage.WHILE1: return createWhile1();
			case WcoreExtendedPackage.REF_TRUE: return createRefTrue();
			case WcoreExtendedPackage.REF_FALSE: return createRefFalse();
			case WcoreExtendedPackage.CONDITIONAL_NODE: return createConditionalNode();
			case WcoreExtendedPackage.ASSIGN1: return createAssign1();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
	public wcoreExtended.Process createProcess() {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public If1 createIf1() {
		If1Impl if1 = new If1Impl();
		return if1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfElse1 createIfElse1() {
		IfElse1Impl ifElse1 = new IfElse1Impl();
		return ifElse1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public While1 createWhile1() {
		While1Impl while1 = new While1Impl();
		return while1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefTrue createRefTrue() {
		RefTrueImpl refTrue = new RefTrueImpl();
		return refTrue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefFalse createRefFalse() {
		RefFalseImpl refFalse = new RefFalseImpl();
		return refFalse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalNode createConditionalNode() {
		ConditionalNodeImpl conditionalNode = new ConditionalNodeImpl();
		return conditionalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assign1 createAssign1() {
		Assign1Impl assign1 = new Assign1Impl();
		return assign1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WcoreExtendedPackage getWcoreExtendedPackage() {
		return (WcoreExtendedPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WcoreExtendedPackage getPackage() {
		return WcoreExtendedPackage.eINSTANCE;
	}

} //WcoreExtendedFactoryImpl
