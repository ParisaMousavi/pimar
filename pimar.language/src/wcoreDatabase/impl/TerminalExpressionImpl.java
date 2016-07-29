/**
 */
package wcoreDatabase.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import wcoreDatabase.TerminalExpression;
import wcoreDatabase.Variable;
import wcoreDatabase.WcoreDatabasePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Terminal Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link wcoreDatabase.impl.TerminalExpressionImpl#getRefers <em>Refers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TerminalExpressionImpl extends ExpressionImpl implements TerminalExpression {
	/**
	 * The cached value of the '{@link #getRefers() <em>Refers</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefers()
	 * @generated
	 * @ordered
	 */
	protected Variable refers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminalExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WcoreDatabasePackage.Literals.TERMINAL_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getRefers() {
		if (refers != null && refers.eIsProxy()) {
			InternalEObject oldRefers = (InternalEObject)refers;
			refers = (Variable)eResolveProxy(oldRefers);
			if (refers != oldRefers) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WcoreDatabasePackage.TERMINAL_EXPRESSION__REFERS, oldRefers, refers));
			}
		}
		return refers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetRefers() {
		return refers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefers(Variable newRefers) {
		Variable oldRefers = refers;
		refers = newRefers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcoreDatabasePackage.TERMINAL_EXPRESSION__REFERS, oldRefers, refers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WcoreDatabasePackage.TERMINAL_EXPRESSION__REFERS:
				if (resolve) return getRefers();
				return basicGetRefers();
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
			case WcoreDatabasePackage.TERMINAL_EXPRESSION__REFERS:
				setRefers((Variable)newValue);
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
			case WcoreDatabasePackage.TERMINAL_EXPRESSION__REFERS:
				setRefers((Variable)null);
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
			case WcoreDatabasePackage.TERMINAL_EXPRESSION__REFERS:
				return refers != null;
		}
		return super.eIsSet(featureID);
	}

} //TerminalExpressionImpl
