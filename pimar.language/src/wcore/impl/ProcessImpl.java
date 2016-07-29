/**
 */
package wcore.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENamedElementImpl;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import wcore.Task;
import wcore.Variable;
import wcore.WcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link wcore.impl.ProcessImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link wcore.impl.ProcessImpl#getStartTask <em>Start Task</em>}</li>
 *   <li>{@link wcore.impl.ProcessImpl#getReturn <em>Return</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessImpl extends ENamedElementImpl implements wcore.Process {
	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variables;

	/**
	 * The cached value of the '{@link #getStartTask() <em>Start Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTask()
	 * @generated
	 * @ordered
	 */
	protected Task startTask;

	/**
	 * The cached value of the '{@link #getReturn() <em>Return</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturn()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> return_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WcorePackage.Literals.PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentEList<Variable>(Variable.class, this, WcorePackage.PROCESS__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getStartTask() {
		return startTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartTask(Task newStartTask, NotificationChain msgs) {
		Task oldStartTask = startTask;
		startTask = newStartTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WcorePackage.PROCESS__START_TASK, oldStartTask, newStartTask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTask(Task newStartTask) {
		if (newStartTask != startTask) {
			NotificationChain msgs = null;
			if (startTask != null)
				msgs = ((InternalEObject)startTask).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WcorePackage.PROCESS__START_TASK, null, msgs);
			if (newStartTask != null)
				msgs = ((InternalEObject)newStartTask).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WcorePackage.PROCESS__START_TASK, null, msgs);
			msgs = basicSetStartTask(newStartTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcorePackage.PROCESS__START_TASK, newStartTask, newStartTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getReturn() {
		if (return_ == null) {
			return_ = new EObjectContainmentEList<Variable>(Variable.class, this, WcorePackage.PROCESS__RETURN);
		}
		return return_;
	}

	/**
	 * The cached invocation delegate for the '{@link #containProcessSelectorTask(wcore.Task) <em>Contain Process Selector Task</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #containProcessSelectorTask(wcore.Task)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate CONTAIN_PROCESS_SELECTOR_TASK_TASK__EINVOCATION_DELEGATE = ((EOperation.Internal)WcorePackage.Literals.PROCESS___CONTAIN_PROCESS_SELECTOR_TASK__TASK).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean containProcessSelectorTask(Task t) {
		try {
			return (Boolean)CONTAIN_PROCESS_SELECTOR_TASK_TASK__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{t}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WcorePackage.PROCESS__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
			case WcorePackage.PROCESS__START_TASK:
				return basicSetStartTask(null, msgs);
			case WcorePackage.PROCESS__RETURN:
				return ((InternalEList<?>)getReturn()).basicRemove(otherEnd, msgs);
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
			case WcorePackage.PROCESS__VARIABLES:
				return getVariables();
			case WcorePackage.PROCESS__START_TASK:
				return getStartTask();
			case WcorePackage.PROCESS__RETURN:
				return getReturn();
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
			case WcorePackage.PROCESS__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case WcorePackage.PROCESS__START_TASK:
				setStartTask((Task)newValue);
				return;
			case WcorePackage.PROCESS__RETURN:
				getReturn().clear();
				getReturn().addAll((Collection<? extends Variable>)newValue);
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
			case WcorePackage.PROCESS__VARIABLES:
				getVariables().clear();
				return;
			case WcorePackage.PROCESS__START_TASK:
				setStartTask((Task)null);
				return;
			case WcorePackage.PROCESS__RETURN:
				getReturn().clear();
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
			case WcorePackage.PROCESS__VARIABLES:
				return variables != null && !variables.isEmpty();
			case WcorePackage.PROCESS__START_TASK:
				return startTask != null;
			case WcorePackage.PROCESS__RETURN:
				return return_ != null && !return_.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case WcorePackage.PROCESS___CONTAIN_PROCESS_SELECTOR_TASK__TASK:
				return containProcessSelectorTask((Task)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ProcessImpl
