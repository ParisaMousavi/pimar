/**
 */
package gcore.impl;

import gcore.GcorePackage;
import gcore.RGBColor;
import gcore.StyleSelectionSettings;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Style Selection Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gcore.impl.StyleSelectionSettingsImpl#getSelectionColor <em>Selection Color</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StyleSelectionSettingsImpl extends MinimalEObjectImpl.Container implements StyleSelectionSettings {
	/**
	 * The cached value of the '{@link #getSelectionColor() <em>Selection Color</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectionColor()
	 * @generated
	 * @ordered
	 */
	protected RGBColor selectionColor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StyleSelectionSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GcorePackage.Literals.STYLE_SELECTION_SETTINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RGBColor getSelectionColor() {
		if (selectionColor != null && selectionColor.eIsProxy()) {
			InternalEObject oldSelectionColor = (InternalEObject)selectionColor;
			selectionColor = (RGBColor)eResolveProxy(oldSelectionColor);
			if (selectionColor != oldSelectionColor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GcorePackage.STYLE_SELECTION_SETTINGS__SELECTION_COLOR, oldSelectionColor, selectionColor));
			}
		}
		return selectionColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RGBColor basicGetSelectionColor() {
		return selectionColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectionColor(RGBColor newSelectionColor) {
		RGBColor oldSelectionColor = selectionColor;
		selectionColor = newSelectionColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GcorePackage.STYLE_SELECTION_SETTINGS__SELECTION_COLOR, oldSelectionColor, selectionColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GcorePackage.STYLE_SELECTION_SETTINGS__SELECTION_COLOR:
				if (resolve) return getSelectionColor();
				return basicGetSelectionColor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GcorePackage.STYLE_SELECTION_SETTINGS__SELECTION_COLOR:
				setSelectionColor((RGBColor)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GcorePackage.STYLE_SELECTION_SETTINGS__SELECTION_COLOR:
				setSelectionColor((RGBColor)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GcorePackage.STYLE_SELECTION_SETTINGS__SELECTION_COLOR:
				return selectionColor != null;
		}
		return super.eIsSet(featureID);
	}

} //StyleSelectionSettingsImpl
