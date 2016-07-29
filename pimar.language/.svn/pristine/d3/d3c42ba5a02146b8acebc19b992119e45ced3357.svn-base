/**
 */
package wcore.impl;

import gcore.Page;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import wcore.ProcessSelector;
import wcore.Task;
import wcore.WcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Selector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link wcore.impl.ProcessSelectorImpl#getPage <em>Page</em>}</li>
 *   <li>{@link wcore.impl.ProcessSelectorImpl#getProcesses <em>Processes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessSelectorImpl extends TaskImpl implements ProcessSelector {
	/**
	 * The cached value of the '{@link #getPage() <em>Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPage()
	 * @generated
	 * @ordered
	 */
	protected Page page;

	/**
	 * The cached value of the '{@link #getProcesses() <em>Processes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcesses()
	 * @generated
	 * @ordered
	 */
	protected EList<wcore.Process> processes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessSelectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WcorePackage.Literals.PROCESS_SELECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page getPage() {
		if (page != null && page.eIsProxy()) {
			InternalEObject oldPage = (InternalEObject)page;
			page = (Page)eResolveProxy(oldPage);
			if (page != oldPage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WcorePackage.PROCESS_SELECTOR__PAGE, oldPage, page));
			}
		}
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page basicGetPage() {
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPage(Page newPage) {
		Page oldPage = page;
		page = newPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WcorePackage.PROCESS_SELECTOR__PAGE, oldPage, page));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<wcore.Process> getProcesses() {
		if (processes == null) {
			processes = new EObjectResolvingEList<wcore.Process>(wcore.Process.class, this, WcorePackage.PROCESS_SELECTOR__PROCESSES);
		}
		return processes;
	}

	/**
	 * The cached invocation delegate for the '{@link #containInvokeGUITask(wcore.Task) <em>Contain Invoke GUI Task</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #containInvokeGUITask(wcore.Task)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate CONTAIN_INVOKE_GUI_TASK_TASK__EINVOCATION_DELEGATE = ((EOperation.Internal)WcorePackage.Literals.PROCESS_SELECTOR___CONTAIN_INVOKE_GUI_TASK__TASK).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean containInvokeGUITask(Task t) {
		try {
			return (Boolean)CONTAIN_INVOKE_GUI_TASK_TASK__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{t}));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WcorePackage.PROCESS_SELECTOR__PAGE:
				if (resolve) return getPage();
				return basicGetPage();
			case WcorePackage.PROCESS_SELECTOR__PROCESSES:
				return getProcesses();
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
			case WcorePackage.PROCESS_SELECTOR__PAGE:
				setPage((Page)newValue);
				return;
			case WcorePackage.PROCESS_SELECTOR__PROCESSES:
				getProcesses().clear();
				getProcesses().addAll((Collection<? extends wcore.Process>)newValue);
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
			case WcorePackage.PROCESS_SELECTOR__PAGE:
				setPage((Page)null);
				return;
			case WcorePackage.PROCESS_SELECTOR__PROCESSES:
				getProcesses().clear();
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
			case WcorePackage.PROCESS_SELECTOR__PAGE:
				return page != null;
			case WcorePackage.PROCESS_SELECTOR__PROCESSES:
				return processes != null && !processes.isEmpty();
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
			case WcorePackage.PROCESS_SELECTOR___CONTAIN_INVOKE_GUI_TASK__TASK:
				return containInvokeGUITask((Task)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ProcessSelectorImpl
