/**
 */
package wcoreExtended;

import wcore.Task;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>While1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link wcoreExtended.While1#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see wcoreExtended.WcoreExtendedPackage#getWhile1()
 * @model
 * @generated
 */
public interface While1 extends Task, ConditionalNode {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see wcoreExtended.WcoreExtendedPackage#getWhile1_Condition()
	 * @model required="true"
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link wcoreExtended.While1#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

} // While1
