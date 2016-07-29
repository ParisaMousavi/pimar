/**
 */
package wcoreDatabase.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import wcoreDatabase.Sequence;
import wcoreDatabase.Task;
import wcoreDatabase.WcoreDatabasePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link wcoreDatabase.impl.SequenceImpl#getBody <em>Body</em>}</li>
 *   <li>{@link wcoreDatabase.impl.SequenceImpl#getFollower <em>Follower</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequenceImpl extends TaskImpl implements Sequence {
	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected Task body;

	/**
	 * The cached value of the '{@link #getFollower() <em>Follower</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollower()
	 * @generated
	 * @ordered
	 */
	protected Task follower;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WcoreDatabasePackage.Literals.SEQUENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(Task newBody, NotificationChain msgs) {
		Task oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WcoreDatabasePackage.SEQUENCE__BODY, oldBody, newBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(Task newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WcoreDatabasePackage.SEQUENCE__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WcoreDatabasePackage.SEQUENCE__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcoreDatabasePackage.SEQUENCE__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getFollower() {
		return follower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFollower(Task newFollower, NotificationChain msgs) {
		Task oldFollower = follower;
		follower = newFollower;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WcoreDatabasePackage.SEQUENCE__FOLLOWER, oldFollower, newFollower);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFollower(Task newFollower) {
		if (newFollower != follower) {
			NotificationChain msgs = null;
			if (follower != null)
				msgs = ((InternalEObject)follower).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WcoreDatabasePackage.SEQUENCE__FOLLOWER, null, msgs);
			if (newFollower != null)
				msgs = ((InternalEObject)newFollower).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WcoreDatabasePackage.SEQUENCE__FOLLOWER, null, msgs);
			msgs = basicSetFollower(newFollower, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcoreDatabasePackage.SEQUENCE__FOLLOWER, newFollower, newFollower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WcoreDatabasePackage.SEQUENCE__BODY:
				return basicSetBody(null, msgs);
			case WcoreDatabasePackage.SEQUENCE__FOLLOWER:
				return basicSetFollower(null, msgs);
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
			case WcoreDatabasePackage.SEQUENCE__BODY:
				return getBody();
			case WcoreDatabasePackage.SEQUENCE__FOLLOWER:
				return getFollower();
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
			case WcoreDatabasePackage.SEQUENCE__BODY:
				setBody((Task)newValue);
				return;
			case WcoreDatabasePackage.SEQUENCE__FOLLOWER:
				setFollower((Task)newValue);
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
			case WcoreDatabasePackage.SEQUENCE__BODY:
				setBody((Task)null);
				return;
			case WcoreDatabasePackage.SEQUENCE__FOLLOWER:
				setFollower((Task)null);
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
			case WcoreDatabasePackage.SEQUENCE__BODY:
				return body != null;
			case WcoreDatabasePackage.SEQUENCE__FOLLOWER:
				return follower != null;
		}
		return super.eIsSet(featureID);
	}

} //SequenceImpl
