/**
 */
package wcore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link wcore.UnaryExpression#getOperator <em>Operator</em>}</li>
 *   <li>{@link wcore.UnaryExpression#getRightExpression <em>Right Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see wcore.WcorePackage#getUnaryExpression()
 * @model
 * @generated
 */
public interface UnaryExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link wcore.UnaryOperators}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see wcore.UnaryOperators
	 * @see #setOperator(UnaryOperators)
	 * @see wcore.WcorePackage#getUnaryExpression_Operator()
	 * @model required="true"
	 * @generated
	 */
	UnaryOperators getOperator();

	/**
	 * Sets the value of the '{@link wcore.UnaryExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see wcore.UnaryOperators
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(UnaryOperators value);

	/**
	 * Returns the value of the '<em><b>Right Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Expression</em>' containment reference.
	 * @see #setRightExpression(Expression)
	 * @see wcore.WcorePackage#getUnaryExpression_RightExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getRightExpression();

	/**
	 * Sets the value of the '{@link wcore.UnaryExpression#getRightExpression <em>Right Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Expression</em>' containment reference.
	 * @see #getRightExpression()
	 * @generated
	 */
	void setRightExpression(Expression value);

} // UnaryExpression
