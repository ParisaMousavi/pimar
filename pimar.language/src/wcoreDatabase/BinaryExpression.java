/**
 */
package wcoreDatabase;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link wcoreDatabase.BinaryExpression#getOperator <em>Operator</em>}</li>
 *   <li>{@link wcoreDatabase.BinaryExpression#getLeftExpressions <em>Left Expressions</em>}</li>
 *   <li>{@link wcoreDatabase.BinaryExpression#getRightExpression <em>Right Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see wcoreDatabase.WcoreDatabasePackage#getBinaryExpression()
 * @model
 * @generated
 */
public interface BinaryExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link wcoreDatabase.BinaryOperators}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see wcoreDatabase.BinaryOperators
	 * @see #setOperator(BinaryOperators)
	 * @see wcoreDatabase.WcoreDatabasePackage#getBinaryExpression_Operator()
	 * @model required="true"
	 * @generated
	 */
	BinaryOperators getOperator();

	/**
	 * Sets the value of the '{@link wcoreDatabase.BinaryExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see wcoreDatabase.BinaryOperators
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(BinaryOperators value);

	/**
	 * Returns the value of the '<em><b>Left Expressions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Expressions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Expressions</em>' containment reference.
	 * @see #setLeftExpressions(Expression)
	 * @see wcoreDatabase.WcoreDatabasePackage#getBinaryExpression_LeftExpressions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getLeftExpressions();

	/**
	 * Sets the value of the '{@link wcoreDatabase.BinaryExpression#getLeftExpressions <em>Left Expressions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Expressions</em>' containment reference.
	 * @see #getLeftExpressions()
	 * @generated
	 */
	void setLeftExpressions(Expression value);

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
	 * @see wcoreDatabase.WcoreDatabasePackage#getBinaryExpression_RightExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getRightExpression();

	/**
	 * Sets the value of the '{@link wcoreDatabase.BinaryExpression#getRightExpression <em>Right Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Expression</em>' containment reference.
	 * @see #getRightExpression()
	 * @generated
	 */
	void setRightExpression(Expression value);

} // BinaryExpression
