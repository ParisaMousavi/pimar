/**
 */
package gcore.impl;

import gcore.GcorePackage;
import gcore.Page;
import gcore.StylePageSettings;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENamedElementImpl;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gcore.impl.PageImpl#getPageStyle <em>Page Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PageImpl extends ENamedElementImpl implements Page {
	/**
	 * The cached value of the '{@link #getPageStyle() <em>Page Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageStyle()
	 * @generated
	 * @ordered
	 */
	protected StylePageSettings pageStyle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GcorePackage.Literals.PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StylePageSettings getPageStyle() {
		if (pageStyle != null && pageStyle.eIsProxy()) {
			InternalEObject oldPageStyle = (InternalEObject)pageStyle;
			pageStyle = (StylePageSettings)eResolveProxy(oldPageStyle);
			if (pageStyle != oldPageStyle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GcorePackage.PAGE__PAGE_STYLE, oldPageStyle, pageStyle));
			}
		}
		return pageStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StylePageSettings basicGetPageStyle() {
		return pageStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageStyle(StylePageSettings newPageStyle) {
		StylePageSettings oldPageStyle = pageStyle;
		pageStyle = newPageStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GcorePackage.PAGE__PAGE_STYLE, oldPageStyle, pageStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GcorePackage.PAGE__PAGE_STYLE:
				if (resolve) return getPageStyle();
				return basicGetPageStyle();
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
			case GcorePackage.PAGE__PAGE_STYLE:
				setPageStyle((StylePageSettings)newValue);
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
			case GcorePackage.PAGE__PAGE_STYLE:
				setPageStyle((StylePageSettings)null);
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
			case GcorePackage.PAGE__PAGE_STYLE:
				return pageStyle != null;
		}
		return super.eIsSet(featureID);
	}

} //PageImpl
