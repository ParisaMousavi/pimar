/**
 */
package gcore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Listable Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gcore.ListablePage#getListablepageStyle <em>Listablepage Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see gcore.GcorePackage#getListablePage()
 * @model abstract="true"
 * @generated
 */
public interface ListablePage extends EObject {
	/**
	 * Returns the value of the '<em><b>Listablepage Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Listablepage Style</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listablepage Style</em>' reference.
	 * @see #setListablepageStyle(StyleListSettings)
	 * @see gcore.GcorePackage#getListablePage_ListablepageStyle()
	 * @model required="true"
	 * @generated
	 */
	StyleListSettings getListablepageStyle();

	/**
	 * Sets the value of the '{@link gcore.ListablePage#getListablepageStyle <em>Listablepage Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Listablepage Style</em>' reference.
	 * @see #getListablepageStyle()
	 * @generated
	 */
	void setListablepageStyle(StyleListSettings value);

} // ListablePage
