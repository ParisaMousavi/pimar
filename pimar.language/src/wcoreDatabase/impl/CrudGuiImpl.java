/**
 */
package wcoreDatabase.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import wcoreDatabase.CrudGui;
import wcoreDatabase.Privileges;
import wcoreDatabase.WcoreDatabasePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Crud Gui</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link wcoreDatabase.impl.CrudGuiImpl#getContain <em>Contain</em>}</li>
 *   <li>{@link wcoreDatabase.impl.CrudGuiImpl#getPrivileges <em>Privileges</em>}</li>
 *   <li>{@link wcoreDatabase.impl.CrudGuiImpl#getAnchor <em>Anchor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CrudGuiImpl extends TaskImpl implements CrudGui {
	/**
	 * The cached value of the '{@link #getContain() <em>Contain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContain()
	 * @generated
	 * @ordered
	 */
	protected EClass contain;

	/**
	 * The default value of the '{@link #getPrivileges() <em>Privileges</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivileges()
	 * @generated
	 * @ordered
	 */
	protected static final Privileges PRIVILEGES_EDEFAULT = Privileges.READ_ONLY;

	/**
	 * The cached value of the '{@link #getPrivileges() <em>Privileges</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivileges()
	 * @generated
	 * @ordered
	 */
	protected Privileges privileges = PRIVILEGES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnchor() <em>Anchor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchor()
	 * @generated
	 * @ordered
	 */
	protected EObject anchor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CrudGuiImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WcoreDatabasePackage.Literals.CRUD_GUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContain() {
		if (contain != null && contain.eIsProxy()) {
			InternalEObject oldContain = (InternalEObject)contain;
			contain = (EClass)eResolveProxy(oldContain);
			if (contain != oldContain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WcoreDatabasePackage.CRUD_GUI__CONTAIN, oldContain, contain));
			}
		}
		return contain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetContain() {
		return contain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContain(EClass newContain) {
		EClass oldContain = contain;
		contain = newContain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcoreDatabasePackage.CRUD_GUI__CONTAIN, oldContain, contain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Privileges getPrivileges() {
		return privileges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivileges(Privileges newPrivileges) {
		Privileges oldPrivileges = privileges;
		privileges = newPrivileges == null ? PRIVILEGES_EDEFAULT : newPrivileges;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcoreDatabasePackage.CRUD_GUI__PRIVILEGES, oldPrivileges, privileges));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getAnchor() {
		if (anchor != null && anchor.eIsProxy()) {
			InternalEObject oldAnchor = (InternalEObject)anchor;
			anchor = eResolveProxy(oldAnchor);
			if (anchor != oldAnchor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WcoreDatabasePackage.CRUD_GUI__ANCHOR, oldAnchor, anchor));
			}
		}
		return anchor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetAnchor() {
		return anchor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnchor(EObject newAnchor) {
		EObject oldAnchor = anchor;
		anchor = newAnchor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcoreDatabasePackage.CRUD_GUI__ANCHOR, oldAnchor, anchor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WcoreDatabasePackage.CRUD_GUI__CONTAIN:
				if (resolve) return getContain();
				return basicGetContain();
			case WcoreDatabasePackage.CRUD_GUI__PRIVILEGES:
				return getPrivileges();
			case WcoreDatabasePackage.CRUD_GUI__ANCHOR:
				if (resolve) return getAnchor();
				return basicGetAnchor();
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
			case WcoreDatabasePackage.CRUD_GUI__CONTAIN:
				setContain((EClass)newValue);
				return;
			case WcoreDatabasePackage.CRUD_GUI__PRIVILEGES:
				setPrivileges((Privileges)newValue);
				return;
			case WcoreDatabasePackage.CRUD_GUI__ANCHOR:
				setAnchor((EObject)newValue);
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
			case WcoreDatabasePackage.CRUD_GUI__CONTAIN:
				setContain((EClass)null);
				return;
			case WcoreDatabasePackage.CRUD_GUI__PRIVILEGES:
				setPrivileges(PRIVILEGES_EDEFAULT);
				return;
			case WcoreDatabasePackage.CRUD_GUI__ANCHOR:
				setAnchor((EObject)null);
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
			case WcoreDatabasePackage.CRUD_GUI__CONTAIN:
				return contain != null;
			case WcoreDatabasePackage.CRUD_GUI__PRIVILEGES:
				return privileges != PRIVILEGES_EDEFAULT;
			case WcoreDatabasePackage.CRUD_GUI__ANCHOR:
				return anchor != null;
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
		result.append(" (privileges: ");
		result.append(privileges);
		result.append(')');
		return result.toString();
	}

} //CrudGuiImpl
