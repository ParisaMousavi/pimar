/**
 */
package gcore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menuable Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gcore.MenuablePage#getMenu <em>Menu</em>}</li>
 * </ul>
 * </p>
 *
 * @see gcore.GcorePackage#getMenuablePage()
 * @model abstract="true"
 * @generated
 */
public interface MenuablePage extends EObject {
	/**
	 * Returns the value of the '<em><b>Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menu</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menu</em>' reference.
	 * @see #setMenu(Menu)
	 * @see gcore.GcorePackage#getMenuablePage_Menu()
	 * @model
	 * @generated
	 */
	Menu getMenu();

	/**
	 * Sets the value of the '{@link gcore.MenuablePage#getMenu <em>Menu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Menu</em>' reference.
	 * @see #getMenu()
	 * @generated
	 */
	void setMenu(Menu value);

} // MenuablePage
