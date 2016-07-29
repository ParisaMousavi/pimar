/**
 */
package wcore.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import wcore.IfElse;
import wcore.Task;
import wcore.WcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Else</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link wcore.impl.IfElseImpl#getElseBody <em>Else Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfElseImpl extends IfImpl implements IfElse {
	/**
	 * The cached value of the '{@link #getElseBody() <em>Else Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseBody()
	 * @generated
	 * @ordered
	 */
	protected Task elseBody;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfElseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WcorePackage.Literals.IF_ELSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getElseBody() {
		return elseBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElseBody(Task newElseBody, NotificationChain msgs) {
		Task oldElseBody = elseBody;
		elseBody = newElseBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WcorePackage.IF_ELSE__ELSE_BODY, oldElseBody, newElseBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElseBody(Task newElseBody) {
		if (newElseBody != elseBody) {
			NotificationChain msgs = null;
			if (elseBody != null)
				msgs = ((InternalEObject)elseBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WcorePackage.IF_ELSE__ELSE_BODY, null, msgs);
			if (newElseBody != null)
				msgs = ((InternalEObject)newElseBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WcorePackage.IF_ELSE__ELSE_BODY, null, msgs);
			msgs = basicSetElseBody(newElseBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcorePackage.IF_ELSE__ELSE_BODY, newElseBody, newElseBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WcorePackage.IF_ELSE__ELSE_BODY:
				return basicSetElseBody(null, msgs);
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
			case WcorePackage.IF_ELSE__ELSE_BODY:
				return getElseBody();
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
			case WcorePackage.IF_ELSE__ELSE_BODY:
				setElseBody((Task)newValue);
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
			case WcorePackage.IF_ELSE__ELSE_BODY:
				setElseBody((Task)null);
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
			case WcorePackage.IF_ELSE__ELSE_BODY:
				return elseBody != null;
		}
		return super.eIsSet(featureID);
	}

} //IfElseImpl
