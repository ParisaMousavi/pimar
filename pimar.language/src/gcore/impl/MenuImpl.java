/**
 */
package gcore.impl;

import gcore.GcorePackage;
import gcore.Menu;
import gcore.StyleMenuSettings;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENamedElementImpl;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Menu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gcore.impl.MenuImpl#getMenuStyle <em>Menu Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MenuImpl extends ENamedElementImpl implements Menu {
	/**
	 * The cached value of the '{@link #getMenuStyle() <em>Menu Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenuStyle()
	 * @generated
	 * @ordered
	 */
	protected StyleMenuSettings menuStyle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MenuImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GcorePackage.Literals.MENU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleMenuSettings getMenuStyle() {
		if (menuStyle != null && menuStyle.eIsProxy()) {
			InternalEObject oldMenuStyle = (InternalEObject)menuStyle;
			menuStyle = (StyleMenuSettings)eResolveProxy(oldMenuStyle);
			if (menuStyle != oldMenuStyle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GcorePackage.MENU__MENU_STYLE, oldMenuStyle, menuStyle));
			}
		}
		return menuStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleMenuSettings basicGetMenuStyle() {
		return menuStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMenuStyle(StyleMenuSettings newMenuStyle) {
		StyleMenuSettings oldMenuStyle = menuStyle;
		menuStyle = newMenuStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GcorePackage.MENU__MENU_STYLE, oldMenuStyle, menuStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GcorePackage.MENU__MENU_STYLE:
				if (resolve) return getMenuStyle();
				return basicGetMenuStyle();
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
			case GcorePackage.MENU__MENU_STYLE:
				setMenuStyle((StyleMenuSettings)newValue);
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
			case GcorePackage.MENU__MENU_STYLE:
				setMenuStyle((StyleMenuSettings)null);
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
			case GcorePackage.MENU__MENU_STYLE:
				return menuStyle != null;
		}
		return super.eIsSet(featureID);
	}

} //MenuImpl
