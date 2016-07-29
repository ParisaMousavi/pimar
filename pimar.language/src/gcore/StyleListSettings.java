/**
 */
package gcore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Style List Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gcore.StyleListSettings#isSeparatorShow <em>Separator Show</em>}</li>
 *   <li>{@link gcore.StyleListSettings#getListStyle <em>List Style</em>}</li>
 *   <li>{@link gcore.StyleListSettings#getSeparatorColor <em>Separator Color</em>}</li>
 * </ul>
 * </p>
 *
 * @see gcore.GcorePackage#getStyleListSettings()
 * @model
 * @generated
 */
public interface StyleListSettings extends EObject {
	/**
	 * Returns the value of the '<em><b>Separator Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Separator Show</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Separator Show</em>' attribute.
	 * @see #setSeparatorShow(boolean)
	 * @see gcore.GcorePackage#getStyleListSettings_SeparatorShow()
	 * @model
	 * @generated
	 */
	boolean isSeparatorShow();

	/**
	 * Sets the value of the '{@link gcore.StyleListSettings#isSeparatorShow <em>Separator Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Separator Show</em>' attribute.
	 * @see #isSeparatorShow()
	 * @generated
	 */
	void setSeparatorShow(boolean value);

	/**
	 * Returns the value of the '<em><b>List Style</b></em>' attribute.
	 * The literals are from the enumeration {@link gcore.ListStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Style</em>' attribute.
	 * @see gcore.ListStyle
	 * @see #setListStyle(ListStyle)
	 * @see gcore.GcorePackage#getStyleListSettings_ListStyle()
	 * @model
	 * @generated
	 */
	ListStyle getListStyle();

	/**
	 * Sets the value of the '{@link gcore.StyleListSettings#getListStyle <em>List Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Style</em>' attribute.
	 * @see gcore.ListStyle
	 * @see #getListStyle()
	 * @generated
	 */
	void setListStyle(ListStyle value);

	/**
	 * Returns the value of the '<em><b>Separator Color</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Separator Color</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Separator Color</em>' reference.
	 * @see #setSeparatorColor(RGBColor)
	 * @see gcore.GcorePackage#getStyleListSettings_SeparatorColor()
	 * @model required="true"
	 * @generated
	 */
	RGBColor getSeparatorColor();

	/**
	 * Sets the value of the '{@link gcore.StyleListSettings#getSeparatorColor <em>Separator Color</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Separator Color</em>' reference.
	 * @see #getSeparatorColor()
	 * @generated
	 */
	void setSeparatorColor(RGBColor value);

} // StyleListSettings
