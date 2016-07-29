/**
 */
package wcore.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import wcore.BinaryExpression;
import wcore.BinaryOperators;
import wcore.Expression;
import wcore.WcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link wcore.impl.BinaryExpressionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link wcore.impl.BinaryExpressionImpl#getLeftExpressions <em>Left Expressions</em>}</li>
 *   <li>{@link wcore.impl.BinaryExpressionImpl#getRightExpression <em>Right Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BinaryExpressionImpl extends ExpressionImpl implements BinaryExpression {
	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final BinaryOperators OPERATOR_EDEFAULT = BinaryOperators.AND;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected BinaryOperators operator = OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLeftExpressions() <em>Left Expressions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftExpressions()
	 * @generated
	 * @ordered
	 */
	protected Expression leftExpressions;

	/**
	 * The cached value of the '{@link #getRightExpression() <em>Right Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression rightExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WcorePackage.Literals.BINARY_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryOperators getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(BinaryOperators newOperator) {
		BinaryOperators oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcorePackage.BINARY_EXPRESSION__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getLeftExpressions() {
		return leftExpressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftExpressions(Expression newLeftExpressions, NotificationChain msgs) {
		Expression oldLeftExpressions = leftExpressions;
		leftExpressions = newLeftExpressions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WcorePackage.BINARY_EXPRESSION__LEFT_EXPRESSIONS, oldLeftExpressions, newLeftExpressions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftExpressions(Expression newLeftExpressions) {
		if (newLeftExpressions != leftExpressions) {
			NotificationChain msgs = null;
			if (leftExpressions != null)
				msgs = ((InternalEObject)leftExpressions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WcorePackage.BINARY_EXPRESSION__LEFT_EXPRESSIONS, null, msgs);
			if (newLeftExpressions != null)
				msgs = ((InternalEObject)newLeftExpressions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WcorePackage.BINARY_EXPRESSION__LEFT_EXPRESSIONS, null, msgs);
			msgs = basicSetLeftExpressions(newLeftExpressions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcorePackage.BINARY_EXPRESSION__LEFT_EXPRESSIONS, newLeftExpressions, newLeftExpressions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getRightExpression() {
		return rightExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightExpression(Expression newRightExpression, NotificationChain msgs) {
		Expression oldRightExpression = rightExpression;
		rightExpression = newRightExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WcorePackage.BINARY_EXPRESSION__RIGHT_EXPRESSION, oldRightExpression, newRightExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightExpression(Expression newRightExpression) {
		if (newRightExpression != rightExpression) {
			NotificationChain msgs = null;
			if (rightExpression != null)
				msgs = ((InternalEObject)rightExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WcorePackage.BINARY_EXPRESSION__RIGHT_EXPRESSION, null, msgs);
			if (newRightExpression != null)
				msgs = ((InternalEObject)newRightExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WcorePackage.BINARY_EXPRESSION__RIGHT_EXPRESSION, null, msgs);
			msgs = basicSetRightExpression(newRightExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcorePackage.BINARY_EXPRESSION__RIGHT_EXPRESSION, newRightExpression, newRightExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WcorePackage.BINARY_EXPRESSION__LEFT_EXPRESSIONS:
				return basicSetLeftExpressions(null, msgs);
			case WcorePackage.BINARY_EXPRESSION__RIGHT_EXPRESSION:
				return basicSetRightExpression(null, msgs);
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
			case WcorePackage.BINARY_EXPRESSION__OPERATOR:
				return getOperator();
			case WcorePackage.BINARY_EXPRESSION__LEFT_EXPRESSIONS:
				return getLeftExpressions();
			case WcorePackage.BINARY_EXPRESSION__RIGHT_EXPRESSION:
				return getRightExpression();
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
			case WcorePackage.BINARY_EXPRESSION__OPERATOR:
				setOperator((BinaryOperators)newValue);
				return;
			case WcorePackage.BINARY_EXPRESSION__LEFT_EXPRESSIONS:
				setLeftExpressions((Expression)newValue);
				return;
			case WcorePackage.BINARY_EXPRESSION__RIGHT_EXPRESSION:
				setRightExpression((Expression)newValue);
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
			case WcorePackage.BINARY_EXPRESSION__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case WcorePackage.BINARY_EXPRESSION__LEFT_EXPRESSIONS:
				setLeftExpressions((Expression)null);
				return;
			case WcorePackage.BINARY_EXPRESSION__RIGHT_EXPRESSION:
				setRightExpression((Expression)null);
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
			case WcorePackage.BINARY_EXPRESSION__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
			case WcorePackage.BINARY_EXPRESSION__LEFT_EXPRESSIONS:
				return leftExpressions != null;
			case WcorePackage.BINARY_EXPRESSION__RIGHT_EXPRESSION:
				return rightExpression != null;
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
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //BinaryExpressionImpl
