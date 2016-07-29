/**
 */
package gcoreDatabase;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Style Selection Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gcoreDatabase.StyleSelectionSettings#getSelectionColor <em>Selection Color</em>}</li>
 * </ul>
 * </p>
 *
 * @see gcoreDatabase.GcoreDatabasePackage#getStyleSelectionSettings()
 * @model
 * @generated
 */
public interface StyleSelectionSettings extends EObject {
	/**
	 * Returns the value of the '<em><b>Selection Color</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection Color</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection Color</em>' reference.
	 * @see #setSelectionColor(RGBColor)
	 * @see gcoreDatabase.GcoreDatabasePackage#getStyleSelectionSettings_SelectionColor()
	 * @model required="true"
	 * @generated
	 */
	RGBColor getSelectionColor();

	/**
	 * Sets the value of the '{@link gcoreDatabase.StyleSelectionSettings#getSelectionColor <em>Selection Color</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection Color</em>' reference.
	 * @see #getSelectionColor()
	 * @generated
	 */
	void setSelectionColor(RGBColor value);

} // StyleSelectionSettings
