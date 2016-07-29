/**
 */
package wcoreDatabase.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import wcoreDatabase.InvokeOperation;
import wcoreDatabase.Variable;
import wcoreDatabase.WcoreDatabasePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invoke Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link wcoreDatabase.impl.InvokeOperationImpl#getContext <em>Context</em>}</li>
 *   <li>{@link wcoreDatabase.impl.InvokeOperationImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link wcoreDatabase.impl.InvokeOperationImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link wcoreDatabase.impl.InvokeOperationImpl#getReturn <em>Return</em>}</li>
 *   <li>{@link wcoreDatabase.impl.InvokeOperationImpl#isLong <em>Long</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InvokeOperationImpl extends TaskImpl implements InvokeOperation {
	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected Variable context;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected EOperation operation;

	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> arguments;

	/**
	 * The cached value of the '{@link #getReturn() <em>Return</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturn()
	 * @generated
	 * @ordered
	 */
	protected Variable return_;

	/**
	 * The default value of the '{@link #isLong() <em>Long</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLong()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LONG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLong() <em>Long</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLong()
	 * @generated
	 * @ordered
	 */
	protected boolean long_ = LONG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvokeOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WcoreDatabasePackage.Literals.INVOKE_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getContext() {
		if (context != null && context.eIsProxy()) {
			InternalEObject oldContext = (InternalEObject)context;
			context = (Variable)eResolveProxy(oldContext);
			if (context != oldContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WcoreDatabasePackage.INVOKE_OPERATION__CONTEXT, oldContext, context));
			}
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(Variable newContext) {
		Variable oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcoreDatabasePackage.INVOKE_OPERATION__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperation() {
		if (operation != null && operation.eIsProxy()) {
			InternalEObject oldOperation = (InternalEObject)operation;
			operation = (EOperation)eResolveProxy(oldOperation);
			if (operation != oldOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WcoreDatabasePackage.INVOKE_OPERATION__OPERATION, oldOperation, operation));
			}
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation basicGetOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(EOperation newOperation) {
		EOperation oldOperation = operation;
		operation = newOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcoreDatabasePackage.INVOKE_OPERATION__OPERATION, oldOperation, operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getArguments() {
		if (arguments == null) {
			arguments = new EObjectResolvingEList<Variable>(Variable.class, this, WcoreDatabasePackage.INVOKE_OPERATION__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getReturn() {
		if (return_ != null && return_.eIsProxy()) {
			InternalEObject oldReturn = (InternalEObject)return_;
			return_ = (Variable)eResolveProxy(oldReturn);
			if (return_ != oldReturn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WcoreDatabasePackage.INVOKE_OPERATION__RETURN, oldReturn, return_));
			}
		}
		return return_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetReturn() {
		return return_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturn(Variable newReturn) {
		Variable oldReturn = return_;
		return_ = newReturn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcoreDatabasePackage.INVOKE_OPERATION__RETURN, oldReturn, return_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLong() {
		return long_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLong(boolean newLong) {
		boolean oldLong = long_;
		long_ = newLong;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcoreDatabasePackage.INVOKE_OPERATION__LONG, oldLong, long_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WcoreDatabasePackage.INVOKE_OPERATION__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case WcoreDatabasePackage.INVOKE_OPERATION__OPERATION:
				if (resolve) return getOperation();
				return basicGetOperation();
			case WcoreDatabasePackage.INVOKE_OPERATION__ARGUMENTS:
				return getArguments();
			case WcoreDatabasePackage.INVOKE_OPERATION__RETURN:
				if (resolve) return getReturn();
				return basicGetReturn();
			case WcoreDatabasePackage.INVOKE_OPERATION__LONG:
				return isLong();
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
			case WcoreDatabasePackage.INVOKE_OPERATION__CONTEXT:
				setContext((Variable)newValue);
				return;
			case WcoreDatabasePackage.INVOKE_OPERATION__OPERATION:
				setOperation((EOperation)newValue);
				return;
			case WcoreDatabasePackage.INVOKE_OPERATION__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends Variable>)newValue);
				return;
			case WcoreDatabasePackage.INVOKE_OPERATION__RETURN:
				setReturn((Variable)newValue);
				return;
			case WcoreDatabasePackage.INVOKE_OPERATION__LONG:
				setLong((Boolean)newValue);
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
			case WcoreDatabasePackage.INVOKE_OPERATION__CONTEXT:
				setContext((Variable)null);
				return;
			case WcoreDatabasePackage.INVOKE_OPERATION__OPERATION:
				setOperation((EOperation)null);
				return;
			case WcoreDatabasePackage.INVOKE_OPERATION__ARGUMENTS:
				getArguments().clear();
				return;
			case WcoreDatabasePackage.INVOKE_OPERATION__RETURN:
				setReturn((Variable)null);
				return;
			case WcoreDatabasePackage.INVOKE_OPERATION__LONG:
				setLong(LONG_EDEFAULT);
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
			case WcoreDatabasePackage.INVOKE_OPERATION__CONTEXT:
				return context != null;
			case WcoreDatabasePackage.INVOKE_OPERATION__OPERATION:
				return operation != null;
			case WcoreDatabasePackage.INVOKE_OPERATION__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
			case WcoreDatabasePackage.INVOKE_OPERATION__RETURN:
				return return_ != null;
			case WcoreDatabasePackage.INVOKE_OPERATION__LONG:
				return long_ != LONG_EDEFAULT;
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
		result.append(" (long: ");
		result.append(long_);
		result.append(')');
		return result.toString();
	}

} //InvokeOperationImpl
