/**
 */
package wcore.impl;

import gcore.Page;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import wcore.InvokeGUI;
import wcore.Variable;
import wcore.WcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invoke GUI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link wcore.impl.InvokeGUIImpl#getOutputAction <em>Output Action</em>}</li>
 *   <li>{@link wcore.impl.InvokeGUIImpl#getOutputData <em>Output Data</em>}</li>
 *   <li>{@link wcore.impl.InvokeGUIImpl#getInput <em>Input</em>}</li>
 *   <li>{@link wcore.impl.InvokeGUIImpl#getPage <em>Page</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InvokeGUIImpl extends TaskImpl implements InvokeGUI {
	/**
	 * The cached value of the '{@link #getOutputAction() <em>Output Action</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputAction()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> outputAction;

	/**
	 * The cached value of the '{@link #getOutputData() <em>Output Data</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputData()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> outputData;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> input;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvokeGUIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WcorePackage.Literals.INVOKE_GUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getOutputAction() {
		if (outputAction == null) {
			outputAction = new EObjectResolvingEList<Variable>(Variable.class, this, WcorePackage.INVOKE_GUI__OUTPUT_ACTION);
		}
		return outputAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getOutputData() {
		if (outputData == null) {
			outputData = new EObjectResolvingEList<Variable>(Variable.class, this, WcorePackage.INVOKE_GUI__OUTPUT_DATA);
		}
		return outputData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getInput() {
		if (input == null) {
			input = new EObjectResolvingEList<Variable>(Variable.class, this, WcorePackage.INVOKE_GUI__INPUT);
		}
		return input;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WcorePackage.INVOKE_GUI__PAGE, oldPage, page));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WcorePackage.INVOKE_GUI__PAGE, oldPage, page));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WcorePackage.INVOKE_GUI__OUTPUT_ACTION:
				return getOutputAction();
			case WcorePackage.INVOKE_GUI__OUTPUT_DATA:
				return getOutputData();
			case WcorePackage.INVOKE_GUI__INPUT:
				return getInput();
			case WcorePackage.INVOKE_GUI__PAGE:
				if (resolve) return getPage();
				return basicGetPage();
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
			case WcorePackage.INVOKE_GUI__OUTPUT_ACTION:
				getOutputAction().clear();
				getOutputAction().addAll((Collection<? extends Variable>)newValue);
				return;
			case WcorePackage.INVOKE_GUI__OUTPUT_DATA:
				getOutputData().clear();
				getOutputData().addAll((Collection<? extends Variable>)newValue);
				return;
			case WcorePackage.INVOKE_GUI__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends Variable>)newValue);
				return;
			case WcorePackage.INVOKE_GUI__PAGE:
				setPage((Page)newValue);
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
			case WcorePackage.INVOKE_GUI__OUTPUT_ACTION:
				getOutputAction().clear();
				return;
			case WcorePackage.INVOKE_GUI__OUTPUT_DATA:
				getOutputData().clear();
				return;
			case WcorePackage.INVOKE_GUI__INPUT:
				getInput().clear();
				return;
			case WcorePackage.INVOKE_GUI__PAGE:
				setPage((Page)null);
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
			case WcorePackage.INVOKE_GUI__OUTPUT_ACTION:
				return outputAction != null && !outputAction.isEmpty();
			case WcorePackage.INVOKE_GUI__OUTPUT_DATA:
				return outputData != null && !outputData.isEmpty();
			case WcorePackage.INVOKE_GUI__INPUT:
				return input != null && !input.isEmpty();
			case WcorePackage.INVOKE_GUI__PAGE:
				return page != null;
		}
		return super.eIsSet(featureID);
	}

} //InvokeGUIImpl
