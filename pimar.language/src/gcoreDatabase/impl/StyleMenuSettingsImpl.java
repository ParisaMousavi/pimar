/**
 */
package gcoreDatabase.impl;

import gcoreDatabase.GcoreDatabasePackage;
import gcoreDatabase.MenuStyle;
import gcoreDatabase.StyleMenuSettings;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Style Menu Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gcoreDatabase.impl.StyleMenuSettingsImpl#getMenuStyle <em>Menu Style</em>}</li>
 *   <li>{@link gcoreDatabase.impl.StyleMenuSettingsImpl#isFixedMenu <em>Fixed Menu</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StyleMenuSettingsImpl extends MinimalEObjectImpl.Container implements StyleMenuSettings {
	/**
	 * The default value of the '{@link #getMenuStyle() <em>Menu Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenuStyle()
	 * @generated
	 * @ordered
	 */
	protected static final MenuStyle MENU_STYLE_EDEFAULT = MenuStyle.TILE;

	/**
	 * The cached value of the '{@link #getMenuStyle() <em>Menu Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenuStyle()
	 * @generated
	 * @ordered
	 */
	protected MenuStyle menuStyle = MENU_STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isFixedMenu() <em>Fixed Menu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFixedMenu()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FIXED_MENU_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFixedMenu() <em>Fixed Menu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFixedMenu()
	 * @generated
	 * @ordered
	 */
	protected boolean fixedMenu = FIXED_MENU_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StyleMenuSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GcoreDatabasePackage.Literals.STYLE_MENU_SETTINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuStyle getMenuStyle() {
		return menuStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMenuStyle(MenuStyle newMenuStyle) {
		MenuStyle oldMenuStyle = menuStyle;
		menuStyle = newMenuStyle == null ? MENU_STYLE_EDEFAULT : newMenuStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GcoreDatabasePackage.STYLE_MENU_SETTINGS__MENU_STYLE, oldMenuStyle, menuStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFixedMenu() {
		return fixedMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedMenu(boolean newFixedMenu) {
		boolean oldFixedMenu = fixedMenu;
		fixedMenu = newFixedMenu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GcoreDatabasePackage.STYLE_MENU_SETTINGS__FIXED_MENU, oldFixedMenu, fixedMenu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GcoreDatabasePackage.STYLE_MENU_SETTINGS__MENU_STYLE:
				return getMenuStyle();
			case GcoreDatabasePackage.STYLE_MENU_SETTINGS__FIXED_MENU:
				return isFixedMenu();
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
			case GcoreDatabasePackage.STYLE_MENU_SETTINGS__MENU_STYLE:
				setMenuStyle((MenuStyle)newValue);
				return;
			case GcoreDatabasePackage.STYLE_MENU_SETTINGS__FIXED_MENU:
				setFixedMenu((Boolean)newValue);
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
			case GcoreDatabasePackage.STYLE_MENU_SETTINGS__MENU_STYLE:
				setMenuStyle(MENU_STYLE_EDEFAULT);
				return;
			case GcoreDatabasePackage.STYLE_MENU_SETTINGS__FIXED_MENU:
				setFixedMenu(FIXED_MENU_EDEFAULT);
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
			case GcoreDatabasePackage.STYLE_MENU_SETTINGS__MENU_STYLE:
				return menuStyle != MENU_STYLE_EDEFAULT;
			case GcoreDatabasePackage.STYLE_MENU_SETTINGS__FIXED_MENU:
				return fixedMenu != FIXED_MENU_EDEFAULT;
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
		result.append(" (menuStyle: ");
		result.append(menuStyle);
		result.append(", fixedMenu: ");
		result.append(fixedMenu);
		result.append(')');
		return result.toString();
	}

} //StyleMenuSettingsImpl
