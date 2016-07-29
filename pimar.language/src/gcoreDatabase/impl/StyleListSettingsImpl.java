/**
 */
package gcoreDatabase.impl;

import gcoreDatabase.GcoreDatabasePackage;
import gcoreDatabase.ListStyle;
import gcoreDatabase.RGBColor;
import gcoreDatabase.StyleListSettings;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Style List Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gcoreDatabase.impl.StyleListSettingsImpl#isSeparatorShow <em>Separator Show</em>}</li>
 *   <li>{@link gcoreDatabase.impl.StyleListSettingsImpl#getListStyle <em>List Style</em>}</li>
 *   <li>{@link gcoreDatabase.impl.StyleListSettingsImpl#getSeparatorColor <em>Separator Color</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StyleListSettingsImpl extends MinimalEObjectImpl.Container implements StyleListSettings {
	/**
	 * The default value of the '{@link #isSeparatorShow() <em>Separator Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSeparatorShow()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SEPARATOR_SHOW_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSeparatorShow() <em>Separator Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSeparatorShow()
	 * @generated
	 * @ordered
	 */
	protected boolean separatorShow = SEPARATOR_SHOW_EDEFAULT;

	/**
	 * The default value of the '{@link #getListStyle() <em>List Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListStyle()
	 * @generated
	 * @ordered
	 */
	protected static final ListStyle LIST_STYLE_EDEFAULT = ListStyle.GRID;

	/**
	 * The cached value of the '{@link #getListStyle() <em>List Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListStyle()
	 * @generated
	 * @ordered
	 */
	protected ListStyle listStyle = LIST_STYLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSeparatorColor() <em>Separator Color</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeparatorColor()
	 * @generated
	 * @ordered
	 */
	protected RGBColor separatorColor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StyleListSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GcoreDatabasePackage.Literals.STYLE_LIST_SETTINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSeparatorShow() {
		return separatorShow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeparatorShow(boolean newSeparatorShow) {
		boolean oldSeparatorShow = separatorShow;
		separatorShow = newSeparatorShow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GcoreDatabasePackage.STYLE_LIST_SETTINGS__SEPARATOR_SHOW, oldSeparatorShow, separatorShow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListStyle getListStyle() {
		return listStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListStyle(ListStyle newListStyle) {
		ListStyle oldListStyle = listStyle;
		listStyle = newListStyle == null ? LIST_STYLE_EDEFAULT : newListStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GcoreDatabasePackage.STYLE_LIST_SETTINGS__LIST_STYLE, oldListStyle, listStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RGBColor getSeparatorColor() {
		if (separatorColor != null && separatorColor.eIsProxy()) {
			InternalEObject oldSeparatorColor = (InternalEObject)separatorColor;
			separatorColor = (RGBColor)eResolveProxy(oldSeparatorColor);
			if (separatorColor != oldSeparatorColor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GcoreDatabasePackage.STYLE_LIST_SETTINGS__SEPARATOR_COLOR, oldSeparatorColor, separatorColor));
			}
		}
		return separatorColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RGBColor basicGetSeparatorColor() {
		return separatorColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeparatorColor(RGBColor newSeparatorColor) {
		RGBColor oldSeparatorColor = separatorColor;
		separatorColor = newSeparatorColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GcoreDatabasePackage.STYLE_LIST_SETTINGS__SEPARATOR_COLOR, oldSeparatorColor, separatorColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GcoreDatabasePackage.STYLE_LIST_SETTINGS__SEPARATOR_SHOW:
				return isSeparatorShow();
			case GcoreDatabasePackage.STYLE_LIST_SETTINGS__LIST_STYLE:
				return getListStyle();
			case GcoreDatabasePackage.STYLE_LIST_SETTINGS__SEPARATOR_COLOR:
				if (resolve) return getSeparatorColor();
				return basicGetSeparatorColor();
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
			case GcoreDatabasePackage.STYLE_LIST_SETTINGS__SEPARATOR_SHOW:
				setSeparatorShow((Boolean)newValue);
				return;
			case GcoreDatabasePackage.STYLE_LIST_SETTINGS__LIST_STYLE:
				setListStyle((ListStyle)newValue);
				return;
			case GcoreDatabasePackage.STYLE_LIST_SETTINGS__SEPARATOR_COLOR:
				setSeparatorColor((RGBColor)newValue);
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
			case GcoreDatabasePackage.STYLE_LIST_SETTINGS__SEPARATOR_SHOW:
				setSeparatorShow(SEPARATOR_SHOW_EDEFAULT);
				return;
			case GcoreDatabasePackage.STYLE_LIST_SETTINGS__LIST_STYLE:
				setListStyle(LIST_STYLE_EDEFAULT);
				return;
			case GcoreDatabasePackage.STYLE_LIST_SETTINGS__SEPARATOR_COLOR:
				setSeparatorColor((RGBColor)null);
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
			case GcoreDatabasePackage.STYLE_LIST_SETTINGS__SEPARATOR_SHOW:
				return separatorShow != SEPARATOR_SHOW_EDEFAULT;
			case GcoreDatabasePackage.STYLE_LIST_SETTINGS__LIST_STYLE:
				return listStyle != LIST_STYLE_EDEFAULT;
			case GcoreDatabasePackage.STYLE_LIST_SETTINGS__SEPARATOR_COLOR:
				return separatorColor != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (separatorShow: ");
		result.append(separatorShow);
		result.append(", listStyle: ");
		result.append(listStyle);
		result.append(')');
		return result.toString();
	}

} //StyleListSettingsImpl
