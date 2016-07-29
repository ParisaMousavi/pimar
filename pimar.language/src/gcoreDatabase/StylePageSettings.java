/**
 */
package gcoreDatabase;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Style Page Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gcoreDatabase.StylePageSettings#getImagePosition <em>Image Position</em>}</li>
 *   <li>{@link gcoreDatabase.StylePageSettings#getTextPosition <em>Text Position</em>}</li>
 *   <li>{@link gcoreDatabase.StylePageSettings#getFrame <em>Frame</em>}</li>
 *   <li>{@link gcoreDatabase.StylePageSettings#getFrameColor <em>Frame Color</em>}</li>
 * </ul>
 * </p>
 *
 * @see gcoreDatabase.GcoreDatabasePackage#getStylePageSettings()
 * @model
 * @generated
 */
public interface StylePageSettings extends EObject {
	/**
	 * Returns the value of the '<em><b>Image Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Position</em>' attribute.
	 * @see #setImagePosition(int)
	 * @see gcoreDatabase.GcoreDatabasePackage#getStylePageSettings_ImagePosition()
	 * @model
	 * @generated
	 */
	int getImagePosition();

	/**
	 * Sets the value of the '{@link gcoreDatabase.StylePageSettings#getImagePosition <em>Image Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Position</em>' attribute.
	 * @see #getImagePosition()
	 * @generated
	 */
	void setImagePosition(int value);

	/**
	 * Returns the value of the '<em><b>Text Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Position</em>' attribute.
	 * @see #setTextPosition(int)
	 * @see gcoreDatabase.GcoreDatabasePackage#getStylePageSettings_TextPosition()
	 * @model
	 * @generated
	 */
	int getTextPosition();

	/**
	 * Sets the value of the '{@link gcoreDatabase.StylePageSettings#getTextPosition <em>Text Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Position</em>' attribute.
	 * @see #getTextPosition()
	 * @generated
	 */
	void setTextPosition(int value);

	/**
	 * Returns the value of the '<em><b>Frame</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frame</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame</em>' attribute.
	 * @see #setFrame(int)
	 * @see gcoreDatabase.GcoreDatabasePackage#getStylePageSettings_Frame()
	 * @model
	 * @generated
	 */
	int getFrame();

	/**
	 * Sets the value of the '{@link gcoreDatabase.StylePageSettings#getFrame <em>Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame</em>' attribute.
	 * @see #getFrame()
	 * @generated
	 */
	void setFrame(int value);

	/**
	 * Returns the value of the '<em><b>Frame Color</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frame Color</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame Color</em>' reference.
	 * @see #setFrameColor(RGBColor)
	 * @see gcoreDatabase.GcoreDatabasePackage#getStylePageSettings_FrameColor()
	 * @model required="true"
	 * @generated
	 */
	RGBColor getFrameColor();

	/**
	 * Sets the value of the '{@link gcoreDatabase.StylePageSettings#getFrameColor <em>Frame Color</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame Color</em>' reference.
	 * @see #getFrameColor()
	 * @generated
	 */
	void setFrameColor(RGBColor value);

} // StylePageSettings
