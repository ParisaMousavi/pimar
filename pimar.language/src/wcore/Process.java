/**
 */
package wcore;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.ENamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link wcore.Process#getVariables <em>Variables</em>}</li>
 *   <li>{@link wcore.Process#getStartTask <em>Start Task</em>}</li>
 *   <li>{@link wcore.Process#getReturn <em>Return</em>}</li>
 * </ul>
 * </p>
 *
 * @see wcore.WcorePackage#getProcess()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='oneProcessSelectorInMainProcess'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL oneProcessSelectorInMainProcess='self.name = \'Main\' implies containProcessSelectorTask(self.startTask.oclAsType(wcore::Task))'"
 * @generated
 */
public interface Process extends ENamedElement {
	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link wcore.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see wcore.WcorePackage#getProcess_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariables();

	/**
	 * Returns the value of the '<em><b>Start Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Task</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Task</em>' containment reference.
	 * @see #setStartTask(Task)
	 * @see wcore.WcorePackage#getProcess_StartTask()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Task getStartTask();

	/**
	 * Sets the value of the '{@link wcore.Process#getStartTask <em>Start Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Task</em>' containment reference.
	 * @see #getStartTask()
	 * @generated
	 */
	void setStartTask(Task value);

	/**
	 * Returns the value of the '<em><b>Return</b></em>' containment reference list.
	 * The list contents are of type {@link wcore.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return</em>' containment reference list.
	 * @see wcore.WcorePackage#getProcess_Return()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getReturn();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if (t.oclIsTypeOf(wcore::If)) then containProcessSelectorTask(t.oclAsType(wcore::If)._body.oclAsType(wcore::Task)) else\r\nif (t.oclIsTypeOf(wcore::While)) then containProcessSelectorTask(t.oclAsType(wcore::While)._body.oclAsType(wcore::Task)) else\r\nif (t.oclIsTypeOf(wcore::IfElse)) then containProcessSelectorTask(t.oclAsType(wcore::IfElse)._body.oclAsType(wcore::Task)) and containProcessSelectorTask(t.oclAsType(wcore::IfElse)._elseBody.oclAsType(wcore::Task)) else\r\nif (t.oclIsTypeOf(wcore::Sequence)) then containProcessSelectorTask(t.oclAsType(wcore::Sequence)._body.oclAsType(wcore::Task)) or containProcessSelectorTask(t.oclAsType(wcore::Sequence).follower.oclAsType(wcore::Task)) else\r\nt.oclIsTypeOf(wcore::ProcessSelector) \r\nendif endif endif endif'"
	 * @generated
	 */
	boolean containProcessSelectorTask(Task t);

} // Process
