/**
 */
package wcoreDatabase;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invoke Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link wcoreDatabase.InvokeProcess#getSubProcess <em>Sub Process</em>}</li>
 *   <li>{@link wcoreDatabase.InvokeProcess#getArguments <em>Arguments</em>}</li>
 *   <li>{@link wcoreDatabase.InvokeProcess#getReturn <em>Return</em>}</li>
 *   <li>{@link wcoreDatabase.InvokeProcess#isSynchronized <em>Synchronized</em>}</li>
 * </ul>
 * </p>
 *
 * @see wcoreDatabase.WcoreDatabasePackage#getInvokeProcess()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='conformingArgumentsToParameters'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL conformingArgumentsToParameters='self.arguments -> size() = self.subProcess.variables -> select(v:wcore::Variable|v.scope.oclAsType(wcore::Scope)=wcore::Scope::GLOBAL) ->size() and\r\nSequence{1..self.arguments -> size()} -> forAll(i:Integer | let var1:wcore::Variable = self.arguments->at(i), var2:wcore::Variable=self.subProcess.variables->select(v:wcore::Variable|v.scope.oclAsType(wcore::Scope)=wcore::Scope::GLOBAL)->at(i) in var1.oclAsType(wcore::Variable).eType=var2.oclAsType(wcore::Variable).eType)'"
 * @generated
 */
public interface InvokeProcess extends Task {
	/**
	 * Returns the value of the '<em><b>Sub Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Process</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Process</em>' reference.
	 * @see #setSubProcess(wcoreDatabase.Process)
	 * @see wcoreDatabase.WcoreDatabasePackage#getInvokeProcess_SubProcess()
	 * @model required="true"
	 * @generated
	 */
	wcoreDatabase.Process getSubProcess();

	/**
	 * Sets the value of the '{@link wcoreDatabase.InvokeProcess#getSubProcess <em>Sub Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Process</em>' reference.
	 * @see #getSubProcess()
	 * @generated
	 */
	void setSubProcess(wcoreDatabase.Process value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' reference list.
	 * The list contents are of type {@link wcoreDatabase.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' reference list.
	 * @see wcoreDatabase.WcoreDatabasePackage#getInvokeProcess_Arguments()
	 * @model
	 * @generated
	 */
	EList<Variable> getArguments();

	/**
	 * Returns the value of the '<em><b>Return</b></em>' reference list.
	 * The list contents are of type {@link wcoreDatabase.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return</em>' reference list.
	 * @see wcoreDatabase.WcoreDatabasePackage#getInvokeProcess_Return()
	 * @model
	 * @generated
	 */
	EList<Variable> getReturn();

	/**
	 * Returns the value of the '<em><b>Synchronized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synchronized</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchronized</em>' attribute.
	 * @see #setSynchronized(boolean)
	 * @see wcoreDatabase.WcoreDatabasePackage#getInvokeProcess_Synchronized()
	 * @model
	 * @generated
	 */
	boolean isSynchronized();

	/**
	 * Sets the value of the '{@link wcoreDatabase.InvokeProcess#isSynchronized <em>Synchronized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synchronized</em>' attribute.
	 * @see #isSynchronized()
	 * @generated
	 */
	void setSynchronized(boolean value);

} // InvokeProcess
