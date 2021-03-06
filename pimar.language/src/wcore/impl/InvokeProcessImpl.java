/**
 */
package wcore.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import wcore.InvokeProcess;
import wcore.Variable;
import wcore.WcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invoke Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link wcore.impl.InvokeProcessImpl#getSubProcess <em>Sub Process</em>}</li>
 *   <li>{@link wcore.impl.InvokeProcessImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link wcore.impl.InvokeProcessImpl#getReturn <em>Return</em>}</li>
 *   <li>{@link wcore.impl.InvokeProcessImpl#isSynchronized <em>Synchronized</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InvokeProcessImpl extends TaskImpl implements InvokeProcess {
	/**
	 * The cached value of the '{@link #getSubProcess() <em>Sub Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubProcess()
	 * @generated
	 * @ordered
	 */
	protected wcore.Process subProcess;

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
	 * The cached value of the '{@link #getReturn() <em>Return</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturn()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> return_;

	/**
	 * The default value of the '{@link #isSynchronized() <em>Synchronized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSynchronized()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SYNCHRONIZED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSynchronized() <em>Synchronized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSynchronized()
	 * @generated
	 * @ordered
	 */
	protected boolean synchronized_ = SYNCHRONIZED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvokeProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WcorePackage.Literals.INVOKE_PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public wcore.Process getSubProcess() {
		if (subProcess != null && subProcess.eIsProxy()) {
			InternalEObject oldSubProcess = (InternalEObject)subProcess;
			subProcess = (wcore.Process)eResolveProxy(oldSubProcess);
			if (subProcess != oldSubProcess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WcorePackage.INVOKE_PROCESS__SUB_PROCESS, oldSubProcess, subProcess));
			}
		}
		return subProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public wcore.Process basicGetSubProcess() {
		return subProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubProcess(wcore.Process newSubProcess) {
		wcore.Process oldSubProcess = subProcess;
		subProcess = newSubProcess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcorePackage.INVOKE_PROCESS__SUB_PROCESS, oldSubProcess, subProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getArguments() {
		if (arguments == null) {
			arguments = new EObjectResolvingEList<Variable>(Variable.class, this, WcorePackage.INVOKE_PROCESS__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getReturn() {
		if (return_ == null) {
			return_ = new EObjectResolvingEList<Variable>(Variable.class, this, WcorePackage.INVOKE_PROCESS__RETURN);
		}
		return return_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSynchronized() {
		return synchronized_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynchronized(boolean newSynchronized) {
		boolean oldSynchronized = synchronized_;
		synchronized_ = newSynchronized;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcorePackage.INVOKE_PROCESS__SYNCHRONIZED, oldSynchronized, synchronized_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WcorePackage.INVOKE_PROCESS__SUB_PROCESS:
				if (resolve) return getSubProcess();
				return basicGetSubProcess();
			case WcorePackage.INVOKE_PROCESS__ARGUMENTS:
				return getArguments();
			case WcorePackage.INVOKE_PROCESS__RETURN:
				return getReturn();
			case WcorePackage.INVOKE_PROCESS__SYNCHRONIZED:
				return isSynchronized();
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
			case WcorePackage.INVOKE_PROCESS__SUB_PROCESS:
				setSubProcess((wcore.Process)newValue);
				return;
			case WcorePackage.INVOKE_PROCESS__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends Variable>)newValue);
				return;
			case WcorePackage.INVOKE_PROCESS__RETURN:
				getReturn().clear();
				getReturn().addAll((Collection<? extends Variable>)newValue);
				return;
			case WcorePackage.INVOKE_PROCESS__SYNCHRONIZED:
				setSynchronized((Boolean)newValue);
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
			case WcorePackage.INVOKE_PROCESS__SUB_PROCESS:
				setSubProcess((wcore.Process)null);
				return;
			case WcorePackage.INVOKE_PROCESS__ARGUMENTS:
				getArguments().clear();
				return;
			case WcorePackage.INVOKE_PROCESS__RETURN:
				getReturn().clear();
				return;
			case WcorePackage.INVOKE_PROCESS__SYNCHRONIZED:
				setSynchronized(SYNCHRONIZED_EDEFAULT);
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
			case WcorePackage.INVOKE_PROCESS__SUB_PROCESS:
				return subProcess != null;
			case WcorePackage.INVOKE_PROCESS__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
			case WcorePackage.INVOKE_PROCESS__RETURN:
				return return_ != null && !return_.isEmpty();
			case WcorePackage.INVOKE_PROCESS__SYNCHRONIZED:
				return synchronized_ != SYNCHRONIZED_EDEFAULT;
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
		result.append(" (synchronized: ");
		result.append(synchronized_);
		result.append(')');
		return result.toString();
	}

} //InvokeProcessImpl
