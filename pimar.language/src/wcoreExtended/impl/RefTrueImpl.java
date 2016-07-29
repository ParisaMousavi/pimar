/**
 */
package wcoreExtended.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENamedElementImpl;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import wcore.Task;

import wcoreExtended.RefTrue;
import wcoreExtended.WcoreExtendedPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ref True</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link wcoreExtended.impl.RefTrueImpl#getPre <em>Pre</em>}</li>
 *   <li>{@link wcoreExtended.impl.RefTrueImpl#getSuc <em>Suc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RefTrueImpl extends ENamedElementImpl implements RefTrue {
	/**
	 * The cached value of the '{@link #getPre() <em>Pre</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPre()
	 * @generated
	 * @ordered
	 */
	protected Task pre;

	/**
	 * The cached value of the '{@link #getSuc() <em>Suc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuc()
	 * @generated
	 * @ordered
	 */
	protected Task suc;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefTrueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WcoreExtendedPackage.Literals.REF_TRUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getPre() {
		if (pre != null && pre.eIsProxy()) {
			InternalEObject oldPre = (InternalEObject)pre;
			pre = (Task)eResolveProxy(oldPre);
			if (pre != oldPre) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WcoreExtendedPackage.REF_TRUE__PRE, oldPre, pre));
			}
		}
		return pre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetPre() {
		return pre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPre(Task newPre) {
		Task oldPre = pre;
		pre = newPre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcoreExtendedPackage.REF_TRUE__PRE, oldPre, pre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getSuc() {
		if (suc != null && suc.eIsProxy()) {
			InternalEObject oldSuc = (InternalEObject)suc;
			suc = (Task)eResolveProxy(oldSuc);
			if (suc != oldSuc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WcoreExtendedPackage.REF_TRUE__SUC, oldSuc, suc));
			}
		}
		return suc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetSuc() {
		return suc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuc(Task newSuc) {
		Task oldSuc = suc;
		suc = newSuc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcoreExtendedPackage.REF_TRUE__SUC, oldSuc, suc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WcoreExtendedPackage.REF_TRUE__PRE:
				if (resolve) return getPre();
				return basicGetPre();
			case WcoreExtendedPackage.REF_TRUE__SUC:
				if (resolve) return getSuc();
				return basicGetSuc();
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
			case WcoreExtendedPackage.REF_TRUE__PRE:
				setPre((Task)newValue);
				return;
			case WcoreExtendedPackage.REF_TRUE__SUC:
				setSuc((Task)newValue);
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
			case WcoreExtendedPackage.REF_TRUE__PRE:
				setPre((Task)null);
				return;
			case WcoreExtendedPackage.REF_TRUE__SUC:
				setSuc((Task)null);
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
			case WcoreExtendedPackage.REF_TRUE__PRE:
				return pre != null;
			case WcoreExtendedPackage.REF_TRUE__SUC:
				return suc != null;
		}
		return super.eIsSet(featureID);
	}

} //RefTrueImpl
