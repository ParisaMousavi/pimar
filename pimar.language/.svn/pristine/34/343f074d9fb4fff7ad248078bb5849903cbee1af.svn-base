/**
 */
package wcoreExtended.util;

import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import wcore.Task;

import wcoreExtended.Assign1;
import wcoreExtended.ConditionalNode;
import wcoreExtended.If1;
import wcoreExtended.IfElse1;
import wcoreExtended.ProcessContainer;
import wcoreExtended.RefFalse;
import wcoreExtended.RefTrue;
import wcoreExtended.WcoreExtendedPackage;
import wcoreExtended.While1;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see wcoreExtended.WcoreExtendedPackage
 * @generated
 */
public class WcoreExtendedSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WcoreExtendedPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WcoreExtendedSwitch() {
		if (modelPackage == null) {
			modelPackage = WcoreExtendedPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case WcoreExtendedPackage.PROCESS_CONTAINER: {
				ProcessContainer processContainer = (ProcessContainer)theEObject;
				T result = caseProcessContainer(processContainer);
				if (result == null) result = caseWcore_ProcessContainer(processContainer);
				if (result == null) result = caseEPackage(processContainer);
				if (result == null) result = caseENamedElement(processContainer);
				if (result == null) result = caseEModelElement(processContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WcoreExtendedPackage.PROCESS: {
				wcoreExtended.Process process = (wcoreExtended.Process)theEObject;
				T result = caseProcess(process);
				if (result == null) result = caseWcore_Process(process);
				if (result == null) result = caseENamedElement(process);
				if (result == null) result = caseEModelElement(process);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WcoreExtendedPackage.IF1: {
				If1 if1 = (If1)theEObject;
				T result = caseIf1(if1);
				if (result == null) result = caseTask(if1);
				if (result == null) result = caseConditionalNode(if1);
				if (result == null) result = caseENamedElement(if1);
				if (result == null) result = caseEModelElement(if1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WcoreExtendedPackage.IF_ELSE1: {
				IfElse1 ifElse1 = (IfElse1)theEObject;
				T result = caseIfElse1(ifElse1);
				if (result == null) result = caseTask(ifElse1);
				if (result == null) result = caseConditionalNode(ifElse1);
				if (result == null) result = caseENamedElement(ifElse1);
				if (result == null) result = caseEModelElement(ifElse1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WcoreExtendedPackage.WHILE1: {
				While1 while1 = (While1)theEObject;
				T result = caseWhile1(while1);
				if (result == null) result = caseTask(while1);
				if (result == null) result = caseConditionalNode(while1);
				if (result == null) result = caseENamedElement(while1);
				if (result == null) result = caseEModelElement(while1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WcoreExtendedPackage.REF_TRUE: {
				RefTrue refTrue = (RefTrue)theEObject;
				T result = caseRefTrue(refTrue);
				if (result == null) result = caseENamedElement(refTrue);
				if (result == null) result = caseEModelElement(refTrue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WcoreExtendedPackage.REF_FALSE: {
				RefFalse refFalse = (RefFalse)theEObject;
				T result = caseRefFalse(refFalse);
				if (result == null) result = caseENamedElement(refFalse);
				if (result == null) result = caseEModelElement(refFalse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WcoreExtendedPackage.CONDITIONAL_NODE: {
				ConditionalNode conditionalNode = (ConditionalNode)theEObject;
				T result = caseConditionalNode(conditionalNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WcoreExtendedPackage.ASSIGN1: {
				Assign1 assign1 = (Assign1)theEObject;
				T result = caseAssign1(assign1);
				if (result == null) result = caseTask(assign1);
				if (result == null) result = caseENamedElement(assign1);
				if (result == null) result = caseEModelElement(assign1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessContainer(ProcessContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcess(wcoreExtended.Process object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIf1(If1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Else1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Else1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfElse1(IfElse1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>While1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>While1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhile1(While1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ref True</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ref True</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefTrue(RefTrue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ref False</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ref False</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefFalse(RefFalse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalNode(ConditionalNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assign1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assign1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssign1(Assign1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EModel Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EModel Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEModelElement(EModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ENamed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ENamed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseENamedElement(ENamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EPackage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEPackage(EPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWcore_ProcessContainer(wcore.ProcessContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWcore_Process(wcore.Process object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask(Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //WcoreExtendedSwitch
