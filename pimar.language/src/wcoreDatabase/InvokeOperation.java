/**
 */
package wcoreDatabase;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EOperation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invoke Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link wcoreDatabase.InvokeOperation#getContext <em>Context</em>}</li>
 *   <li>{@link wcoreDatabase.InvokeOperation#getOperation <em>Operation</em>}</li>
 *   <li>{@link wcoreDatabase.InvokeOperation#getArguments <em>Arguments</em>}</li>
 *   <li>{@link wcoreDatabase.InvokeOperation#getReturn <em>Return</em>}</li>
 *   <li>{@link wcoreDatabase.InvokeOperation#isLong <em>Long</em>}</li>
 * </ul>
 * </p>
 *
 * @see wcoreDatabase.WcoreDatabasePackage#getInvokeOperation()
 * @model
 * @generated
 */
public interface InvokeOperation extends Task {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(Variable)
	 * @see wcoreDatabase.WcoreDatabasePackage#getInvokeOperation_Context()
	 * @model required="true"
	 * @generated
	 */
	Variable getContext();

	/**
	 * Sets the value of the '{@link wcoreDatabase.InvokeOperation#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Variable value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' reference.
	 * @see #setOperation(EOperation)
	 * @see wcoreDatabase.WcoreDatabasePackage#getInvokeOperation_Operation()
	 * @model required="true"
	 * @generated
	 */
	EOperation getOperation();

	/**
	 * Sets the value of the '{@link wcoreDatabase.InvokeOperation#getOperation <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(EOperation value);

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
	 * @see wcoreDatabase.WcoreDatabasePackage#getInvokeOperation_Arguments()
	 * @model
	 * @generated
	 */
	EList<Variable> getArguments();

	/**
	 * Returns the value of the '<em><b>Return</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return</em>' reference.
	 * @see #setReturn(Variable)
	 * @see wcoreDatabase.WcoreDatabasePackage#getInvokeOperation_Return()
	 * @model
	 * @generated
	 */
	Variable getReturn();

	/**
	 * Sets the value of the '{@link wcoreDatabase.InvokeOperation#getReturn <em>Return</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return</em>' reference.
	 * @see #getReturn()
	 * @generated
	 */
	void setReturn(Variable value);

	/**
	 * Returns the value of the '<em><b>Long</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Long</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long</em>' attribute.
	 * @see #setLong(boolean)
	 * @see wcoreDatabase.WcoreDatabasePackage#getInvokeOperation_Long()
	 * @model
	 * @generated
	 */
	boolean isLong();

	/**
	 * Sets the value of the '{@link wcoreDatabase.InvokeOperation#isLong <em>Long</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long</em>' attribute.
	 * @see #isLong()
	 * @generated
	 */
	void setLong(boolean value);

} // InvokeOperation
