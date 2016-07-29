/**
 */
package gcore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selectable Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gcore.SelectablePage#isMultiSelection <em>Multi Selection</em>}</li>
 *   <li>{@link gcore.SelectablePage#getSelectablepageStyle <em>Selectablepage Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see gcore.GcorePackage#getSelectablePage()
 * @model abstract="true"
 * @generated
 */
public interface SelectablePage extends EObject {
	/**
	 * Returns the value of the '<em><b>Multi Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Selection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Selection</em>' attribute.
	 * @see #setMultiSelection(boolean)
	 * @see gcore.GcorePackage#getSelectablePage_MultiSelection()
	 * @model
	 * @generated
	 */
	boolean isMultiSelection();

	/**
	 * Sets the value of the '{@link gcore.SelectablePage#isMultiSelection <em>Multi Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Selection</em>' attribute.
	 * @see #isMultiSelection()
	 * @generated
	 */
	void setMultiSelection(boolean value);

	/**
	 * Returns the value of the '<em><b>Selectablepage Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selectablepage Style</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selectablepage Style</em>' reference.
	 * @see #setSelectablepageStyle(StyleSelectionSettings)
	 * @see gcore.GcorePackage#getSelectablePage_SelectablepageStyle()
	 * @model required="true"
	 * @generated
	 */
	StyleSelectionSettings getSelectablepageStyle();

	/**
	 * Sets the value of the '{@link gcore.SelectablePage#getSelectablepageStyle <em>Selectablepage Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selectablepage Style</em>' reference.
	 * @see #getSelectablepageStyle()
	 * @generated
	 */
	void setSelectablepageStyle(StyleSelectionSettings value);

} // SelectablePage
