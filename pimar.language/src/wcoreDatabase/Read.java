/**
 */
package wcoreDatabase;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Read</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link wcoreDatabase.Read#getObject <em>Object</em>}</li>
 *   <li>{@link wcoreDatabase.Read#getReturn <em>Return</em>}</li>
 * </ul>
 * </p>
 *
 * @see wcoreDatabase.WcoreDatabasePackage#getRead()
 * @model
 * @generated
 */
public interface Read extends Task {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' reference.
	 * @see #setObject(Variable)
	 * @see wcoreDatabase.WcoreDatabasePackage#getRead_Object()
	 * @model
	 * @generated
	 */
	Variable getObject();

	/**
	 * Sets the value of the '{@link wcoreDatabase.Read#getObject <em>Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(Variable value);

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
	 * @see wcoreDatabase.WcoreDatabasePackage#getRead_Return()
	 * @model required="true"
	 * @generated
	 */
	Variable getReturn();

	/**
	 * Sets the value of the '{@link wcoreDatabase.Read#getReturn <em>Return</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return</em>' reference.
	 * @see #getReturn()
	 * @generated
	 */
	void setReturn(Variable value);

} // Read
