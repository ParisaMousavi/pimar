/**
 */
package gcore.impl;

import gcore.GcorePackage;
import gcore.ListPage;
import gcore.ListablePage;
import gcore.Menu;
import gcore.MenuablePage;
import gcore.StyleListSettings;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gcore.impl.ListPageImpl#getListablepageStyle <em>Listablepage Style</em>}</li>
 *   <li>{@link gcore.impl.ListPageImpl#getMenu <em>Menu</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListPageImpl extends PageImpl implements ListPage {
	/**
	 * The cached value of the '{@link #getListablepageStyle() <em>Listablepage Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListablepageStyle()
	 * @generated
	 * @ordered
	 */
	protected StyleListSettings listablepageStyle;

	/**
	 * The cached value of the '{@link #getMenu() <em>Menu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenu()
	 * @generated
	 * @ordered
	 */
	protected Menu menu;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListPageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GcorePackage.Literals.LIST_PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleListSettings getListablepageStyle() {
		if (listablepageStyle != null && listablepageStyle.eIsProxy()) {
			InternalEObject oldListablepageStyle = (InternalEObject)listablepageStyle;
			listablepageStyle = (StyleListSettings)eResolveProxy(oldListablepageStyle);
			if (listablepageStyle != oldListablepageStyle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GcorePackage.LIST_PAGE__LISTABLEPAGE_STYLE, oldListablepageStyle, listablepageStyle));
			}
		}
		return listablepageStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleListSettings basicGetListablepageStyle() {
		return listablepageStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListablepageStyle(StyleListSettings newListablepageStyle) {
		StyleListSettings oldListablepageStyle = listablepageStyle;
		listablepageStyle = newListablepageStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GcorePackage.LIST_PAGE__LISTABLEPAGE_STYLE, oldListablepageStyle, listablepageStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Menu getMenu() {
		if (menu != null && menu.eIsProxy()) {
			InternalEObject oldMenu = (InternalEObject)menu;
			menu = (Menu)eResolveProxy(oldMenu);
			if (menu != oldMenu) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GcorePackage.LIST_PAGE__MENU, oldMenu, menu));
			}
		}
		return menu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Menu basicGetMenu() {
		return menu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMenu(Menu newMenu) {
		Menu oldMenu = menu;
		menu = newMenu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GcorePackage.LIST_PAGE__MENU, oldMenu, menu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GcorePackage.LIST_PAGE__LISTABLEPAGE_STYLE:
				if (resolve) return getListablepageStyle();
				return basicGetListablepageStyle();
			case GcorePackage.LIST_PAGE__MENU:
				if (resolve) return getMenu();
				return basicGetMenu();
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
			case GcorePackage.LIST_PAGE__LISTABLEPAGE_STYLE:
				setListablepageStyle((StyleListSettings)newValue);
				return;
			case GcorePackage.LIST_PAGE__MENU:
				setMenu((Menu)newValue);
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
			case GcorePackage.LIST_PAGE__LISTABLEPAGE_STYLE:
				setListablepageStyle((StyleListSettings)null);
				return;
			case GcorePackage.LIST_PAGE__MENU:
				setMenu((Menu)null);
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
			case GcorePackage.LIST_PAGE__LISTABLEPAGE_STYLE:
				return listablepageStyle != null;
			case GcorePackage.LIST_PAGE__MENU:
				return menu != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ListablePage.class) {
			switch (derivedFeatureID) {
				case GcorePackage.LIST_PAGE__LISTABLEPAGE_STYLE: return GcorePackage.LISTABLE_PAGE__LISTABLEPAGE_STYLE;
				default: return -1;
			}
		}
		if (baseClass == MenuablePage.class) {
			switch (derivedFeatureID) {
				case GcorePackage.LIST_PAGE__MENU: return GcorePackage.MENUABLE_PAGE__MENU;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ListablePage.class) {
			switch (baseFeatureID) {
				case GcorePackage.LISTABLE_PAGE__LISTABLEPAGE_STYLE: return GcorePackage.LIST_PAGE__LISTABLEPAGE_STYLE;
				default: return -1;
			}
		}
		if (baseClass == MenuablePage.class) {
			switch (baseFeatureID) {
				case GcorePackage.MENUABLE_PAGE__MENU: return GcorePackage.LIST_PAGE__MENU;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ListPageImpl
