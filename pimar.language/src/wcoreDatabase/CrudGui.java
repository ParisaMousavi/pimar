/**
 */
package wcoreDatabase;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Crud Gui</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link wcoreDatabase.CrudGui#getContain <em>Contain</em>}</li>
 *   <li>{@link wcoreDatabase.CrudGui#getPrivileges <em>Privileges</em>}</li>
 *   <li>{@link wcoreDatabase.CrudGui#getAnchor <em>Anchor</em>}</li>
 * </ul>
 * </p>
 *
 * @see wcoreDatabase.WcoreDatabasePackage#getCrudGui()
 * @model
 * @generated
 */
public interface CrudGui extends Task {
	/**
	 * Returns the value of the '<em><b>Contain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contain</em>' reference.
	 * @see #setContain(EClass)
	 * @see wcoreDatabase.WcoreDatabasePackage#getCrudGui_Contain()
	 * @model required="true"
	 * @generated
	 */
	EClass getContain();

	/**
	 * Sets the value of the '{@link wcoreDatabase.CrudGui#getContain <em>Contain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contain</em>' reference.
	 * @see #getContain()
	 * @generated
	 */
	void setContain(EClass value);

	/**
	 * Returns the value of the '<em><b>Privileges</b></em>' attribute.
	 * The literals are from the enumeration {@link wcoreDatabase.Privileges}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Privileges</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Privileges</em>' attribute.
	 * @see wcoreDatabase.Privileges
	 * @see #setPrivileges(Privileges)
	 * @see wcoreDatabase.WcoreDatabasePackage#getCrudGui_Privileges()
	 * @model required="true"
	 * @generated
	 */
	Privileges getPrivileges();

	/**
	 * Sets the value of the '{@link wcoreDatabase.CrudGui#getPrivileges <em>Privileges</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Privileges</em>' attribute.
	 * @see wcoreDatabase.Privileges
	 * @see #getPrivileges()
	 * @generated
	 */
	void setPrivileges(Privileges value);

	/**
	 * Returns the value of the '<em><b>Anchor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anchor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anchor</em>' reference.
	 * @see #setAnchor(EObject)
	 * @see wcoreDatabase.WcoreDatabasePackage#getCrudGui_Anchor()
	 * @model
	 * @generated
	 */
	EObject getAnchor();

	/**
	 * Sets the value of the '{@link wcoreDatabase.CrudGui#getAnchor <em>Anchor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anchor</em>' reference.
	 * @see #getAnchor()
	 * @generated
	 */
	void setAnchor(EObject value);

} // CrudGui
