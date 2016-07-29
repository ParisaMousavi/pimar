/**
 */
package gcore.impl;

import gcore.GcorePackage;
import gcore.ListablePage;
import gcore.StyleListSettings;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Listable Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gcore.impl.ListablePageImpl#getListablepageStyle <em>Listablepage Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ListablePageImpl extends MinimalEObjectImpl.Container implements ListablePage {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListablePageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GcorePackage.Literals.LISTABLE_PAGE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GcorePackage.LISTABLE_PAGE__LISTABLEPAGE_STYLE, oldListablepageStyle, listablepageStyle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GcorePackage.LISTABLE_PAGE__LISTABLEPAGE_STYLE, oldListablepageStyle, listablepageStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GcorePackage.LISTABLE_PAGE__LISTABLEPAGE_STYLE:
				if (resolve) return getListablepageStyle();
				return basicGetListablepageStyle();
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
			case GcorePackage.LISTABLE_PAGE__LISTABLEPAGE_STYLE:
				setListablepageStyle((StyleListSettings)newValue);
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
			case GcorePackage.LISTABLE_PAGE__LISTABLEPAGE_STYLE:
				setListablepageStyle((StyleListSettings)null);
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
			case GcorePackage.LISTABLE_PAGE__LISTABLEPAGE_STYLE:
				return listablepageStyle != null;
		}
		return super.eIsSet(featureID);
	}

} //ListablePageImpl
