/**
 */
package wcoreExtended;

import org.eclipse.emf.ecore.ENamedElement;

import wcore.Task;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref False</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link wcoreExtended.RefFalse#getPre <em>Pre</em>}</li>
 *   <li>{@link wcoreExtended.RefFalse#getSuc <em>Suc</em>}</li>
 * </ul>
 * </p>
 *
 * @see wcoreExtended.WcoreExtendedPackage#getRefFalse()
 * @model
 * @generated
 */
public interface RefFalse extends ENamedElement {
	/**
	 * Returns the value of the '<em><b>Pre</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre</em>' reference.
	 * @see #setPre(ConditionalNode)
	 * @see wcoreExtended.WcoreExtendedPackage#getRefFalse_Pre()
	 * @model required="true"
	 * @generated
	 */
	ConditionalNode getPre();

	/**
	 * Sets the value of the '{@link wcoreExtended.RefFalse#getPre <em>Pre</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre</em>' reference.
	 * @see #getPre()
	 * @generated
	 */
	void setPre(ConditionalNode value);

	/**
	 * Returns the value of the '<em><b>Suc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suc</em>' reference.
	 * @see #setSuc(Task)
	 * @see wcoreExtended.WcoreExtendedPackage#getRefFalse_Suc()
	 * @model required="true"
	 * @generated
	 */
	Task getSuc();

	/**
	 * Sets the value of the '{@link wcoreExtended.RefFalse#getSuc <em>Suc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suc</em>' reference.
	 * @see #getSuc()
	 * @generated
	 */
	void setSuc(Task value);

} // RefFalse
