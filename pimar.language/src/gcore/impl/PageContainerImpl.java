/**
 */
package gcore.impl;

import gcore.GcorePackage;
import gcore.ListablePage;
import gcore.Menu;
import gcore.MenuablePage;
import gcore.Page;
import gcore.PageContainer;
import gcore.SelectablePage;
import gcore.StyleSetting;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gcore.impl.PageContainerImpl#getPages <em>Pages</em>}</li>
 *   <li>{@link gcore.impl.PageContainerImpl#getMenuablePages <em>Menuable Pages</em>}</li>
 *   <li>{@link gcore.impl.PageContainerImpl#getMenues <em>Menues</em>}</li>
 *   <li>{@link gcore.impl.PageContainerImpl#getListablePages <em>Listable Pages</em>}</li>
 *   <li>{@link gcore.impl.PageContainerImpl#getStyleSettings <em>Style Settings</em>}</li>
 *   <li>{@link gcore.impl.PageContainerImpl#getSelectablePages <em>Selectable Pages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PageContainerImpl extends EPackageImpl implements PageContainer {
	/**
	 * The cached value of the '{@link #getPages() <em>Pages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPages()
	 * @generated
	 * @ordered
	 */
	protected EList<Page> pages;

	/**
	 * The cached value of the '{@link #getMenuablePages() <em>Menuable Pages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenuablePages()
	 * @generated
	 * @ordered
	 */
	protected EList<MenuablePage> menuablePages;

	/**
	 * The cached value of the '{@link #getMenues() <em>Menues</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenues()
	 * @generated
	 * @ordered
	 */
	protected EList<Menu> menues;

	/**
	 * The cached value of the '{@link #getListablePages() <em>Listable Pages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListablePages()
	 * @generated
	 * @ordered
	 */
	protected EList<ListablePage> listablePages;

	/**
	 * The cached value of the '{@link #getStyleSettings() <em>Style Settings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleSettings()
	 * @generated
	 * @ordered
	 */
	protected EList<StyleSetting> styleSettings;

	/**
	 * The cached value of the '{@link #getSelectablePages() <em>Selectable Pages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectablePages()
	 * @generated
	 * @ordered
	 */
	protected EList<SelectablePage> selectablePages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GcorePackage.Literals.PAGE_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Page> getPages() {
		if (pages == null) {
			pages = new EObjectContainmentEList<Page>(Page.class, this, GcorePackage.PAGE_CONTAINER__PAGES);
		}
		return pages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MenuablePage> getMenuablePages() {
		if (menuablePages == null) {
			menuablePages = new EObjectContainmentEList<MenuablePage>(MenuablePage.class, this, GcorePackage.PAGE_CONTAINER__MENUABLE_PAGES);
		}
		return menuablePages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Menu> getMenues() {
		if (menues == null) {
			menues = new EObjectContainmentEList<Menu>(Menu.class, this, GcorePackage.PAGE_CONTAINER__MENUES);
		}
		return menues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ListablePage> getListablePages() {
		if (listablePages == null) {
			listablePages = new EObjectContainmentEList<ListablePage>(ListablePage.class, this, GcorePackage.PAGE_CONTAINER__LISTABLE_PAGES);
		}
		return listablePages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StyleSetting> getStyleSettings() {
		if (styleSettings == null) {
			styleSettings = new EObjectContainmentEList<StyleSetting>(StyleSetting.class, this, GcorePackage.PAGE_CONTAINER__STYLE_SETTINGS);
		}
		return styleSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SelectablePage> getSelectablePages() {
		if (selectablePages == null) {
			selectablePages = new EObjectContainmentEList<SelectablePage>(SelectablePage.class, this, GcorePackage.PAGE_CONTAINER__SELECTABLE_PAGES);
		}
		return selectablePages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GcorePackage.PAGE_CONTAINER__PAGES:
				return ((InternalEList<?>)getPages()).basicRemove(otherEnd, msgs);
			case GcorePackage.PAGE_CONTAINER__MENUABLE_PAGES:
				return ((InternalEList<?>)getMenuablePages()).basicRemove(otherEnd, msgs);
			case GcorePackage.PAGE_CONTAINER__MENUES:
				return ((InternalEList<?>)getMenues()).basicRemove(otherEnd, msgs);
			case GcorePackage.PAGE_CONTAINER__LISTABLE_PAGES:
				return ((InternalEList<?>)getListablePages()).basicRemove(otherEnd, msgs);
			case GcorePackage.PAGE_CONTAINER__STYLE_SETTINGS:
				return ((InternalEList<?>)getStyleSettings()).basicRemove(otherEnd, msgs);
			case GcorePackage.PAGE_CONTAINER__SELECTABLE_PAGES:
				return ((InternalEList<?>)getSelectablePages()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GcorePackage.PAGE_CONTAINER__PAGES:
				return getPages();
			case GcorePackage.PAGE_CONTAINER__MENUABLE_PAGES:
				return getMenuablePages();
			case GcorePackage.PAGE_CONTAINER__MENUES:
				return getMenues();
			case GcorePackage.PAGE_CONTAINER__LISTABLE_PAGES:
				return getListablePages();
			case GcorePackage.PAGE_CONTAINER__STYLE_SETTINGS:
				return getStyleSettings();
			case GcorePackage.PAGE_CONTAINER__SELECTABLE_PAGES:
				return getSelectablePages();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GcorePackage.PAGE_CONTAINER__PAGES:
				getPages().clear();
				getPages().addAll((Collection<? extends Page>)newValue);
				return;
			case GcorePackage.PAGE_CONTAINER__MENUABLE_PAGES:
				getMenuablePages().clear();
				getMenuablePages().addAll((Collection<? extends MenuablePage>)newValue);
				return;
			case GcorePackage.PAGE_CONTAINER__MENUES:
				getMenues().clear();
				getMenues().addAll((Collection<? extends Menu>)newValue);
				return;
			case GcorePackage.PAGE_CONTAINER__LISTABLE_PAGES:
				getListablePages().clear();
				getListablePages().addAll((Collection<? extends ListablePage>)newValue);
				return;
			case GcorePackage.PAGE_CONTAINER__STYLE_SETTINGS:
				getStyleSettings().clear();
				getStyleSettings().addAll((Collection<? extends StyleSetting>)newValue);
				return;
			case GcorePackage.PAGE_CONTAINER__SELECTABLE_PAGES:
				getSelectablePages().clear();
				getSelectablePages().addAll((Collection<? extends SelectablePage>)newValue);
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
			case GcorePackage.PAGE_CONTAINER__PAGES:
				getPages().clear();
				return;
			case GcorePackage.PAGE_CONTAINER__MENUABLE_PAGES:
				getMenuablePages().clear();
				return;
			case GcorePackage.PAGE_CONTAINER__MENUES:
				getMenues().clear();
				return;
			case GcorePackage.PAGE_CONTAINER__LISTABLE_PAGES:
				getListablePages().clear();
				return;
			case GcorePackage.PAGE_CONTAINER__STYLE_SETTINGS:
				getStyleSettings().clear();
				return;
			case GcorePackage.PAGE_CONTAINER__SELECTABLE_PAGES:
				getSelectablePages().clear();
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
			case GcorePackage.PAGE_CONTAINER__PAGES:
				return pages != null && !pages.isEmpty();
			case GcorePackage.PAGE_CONTAINER__MENUABLE_PAGES:
				return menuablePages != null && !menuablePages.isEmpty();
			case GcorePackage.PAGE_CONTAINER__MENUES:
				return menues != null && !menues.isEmpty();
			case GcorePackage.PAGE_CONTAINER__LISTABLE_PAGES:
				return listablePages != null && !listablePages.isEmpty();
			case GcorePackage.PAGE_CONTAINER__STYLE_SETTINGS:
				return styleSettings != null && !styleSettings.isEmpty();
			case GcorePackage.PAGE_CONTAINER__SELECTABLE_PAGES:
				return selectablePages != null && !selectablePages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PageContainerImpl
