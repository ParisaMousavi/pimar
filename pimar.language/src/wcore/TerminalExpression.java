/**
 */
package wcore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminal Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link wcore.TerminalExpression#getRefers <em>Refers</em>}</li>
 * </ul>
 * </p>
 *
 * @see wcore.WcorePackage#getTerminalExpression()
 * @model
 * @generated
 */
public interface TerminalExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Refers</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refers</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refers</em>' reference.
	 * @see #setRefers(Variable)
	 * @see wcore.WcorePackage#getTerminalExpression_Refers()
	 * @model required="true"
	 * @generated
	 */
	Variable getRefers();

	/**
	 * Sets the value of the '{@link wcore.TerminalExpression#getRefers <em>Refers</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refers</em>' reference.
	 * @see #getRefers()
	 * @generated
	 */
	void setRefers(Variable value);

} // TerminalExpression
