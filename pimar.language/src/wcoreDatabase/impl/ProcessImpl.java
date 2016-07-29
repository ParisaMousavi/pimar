/**
 */
package wcoreDatabase.impl;

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

import wcoreDatabase.Task;
import wcoreDatabase.Variable;
import wcoreDatabase.WcoreDatabasePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link wcoreDatabase.impl.ProcessImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link wcoreDatabase.impl.ProcessImpl#getStartTask <em>Start Task</em>}</li>
 *   <li>{@link wcoreDatabase.impl.ProcessImpl#getReturn <em>Return</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessImpl extends ENamedElementImpl implements wcoreDatabase.Process {
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
		return WcoreDatabasePackage.Literals.PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentEList<Variable>(Variable.class, this, WcoreDatabasePackage.PROCESS__VARIABLES);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WcoreDatabasePackage.PROCESS__START_TASK, oldStartTask, newStartTask);
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
				msgs = ((InternalEObject)startTask).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WcoreDatabasePackage.PROCESS__START_TASK, null, msgs);
			if (newStartTask != null)
				msgs = ((InternalEObject)newStartTask).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WcoreDatabasePackage.PROCESS__START_TASK, null, msgs);
			msgs = basicSetStartTask(newStartTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcoreDatabasePackage.PROCESS__START_TASK, newStartTask, newStartTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getReturn() {
		if (return_ == null) {
			return_ = new EObjectContainmentEList<Variable>(Variable.class, this, WcoreDatabasePackage.PROCESS__RETURN);
		}
		return return_;
	}

	/**
	 * The cached invocation delegate for the '{@link #containProcessSelectorTask(wcoreDatabase.Task) <em>Contain Process Selector Task</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #containProcessSelectorTask(wcoreDatabase.Task)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate CONTAIN_PROCESS_SELECTOR_TASK_TASK__EINVOCATION_DELEGATE = ((EOperation.Internal)WcoreDatabasePackage.Literals.PROCESS___CONTAIN_PROCESS_SELECTOR_TASK__TASK).getInvocationDelegate();

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
			case WcoreDatabasePackage.PROCESS__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
			case WcoreDatabasePackage.PROCESS__START_TASK:
				return basicSetStartTask(null, msgs);
			case WcoreDatabasePackage.PROCESS__RETURN:
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
			case WcoreDatabasePackage.PROCESS__VARIABLES:
				return getVariables();
			case WcoreDatabasePackage.PROCESS__START_TASK:
				return getStartTask();
			case WcoreDatabasePackage.PROCESS__RETURN:
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
			case WcoreDatabasePackage.PROCESS__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case WcoreDatabasePackage.PROCESS__START_TASK:
				setStartTask((Task)newValue);
				return;
			case WcoreDatabasePackage.PROCESS__RETURN:
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
			case WcoreDatabasePackage.PROCESS__VARIABLES:
				getVariables().clear();
				return;
			case WcoreDatabasePackage.PROCESS__START_TASK:
				setStartTask((Task)null);
				return;
			case WcoreDatabasePackage.PROCESS__RETURN:
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
			case WcoreDatabasePackage.PROCESS__VARIABLES:
				return variables != null && !variables.isEmpty();
			case WcoreDatabasePackage.PROCESS__START_TASK:
				return startTask != null;
			case WcoreDatabasePackage.PROCESS__RETURN:
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
			case WcoreDatabasePackage.PROCESS___CONTAIN_PROCESS_SELECTOR_TASK__TASK:
				return containProcessSelectorTask((Task)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ProcessImpl
