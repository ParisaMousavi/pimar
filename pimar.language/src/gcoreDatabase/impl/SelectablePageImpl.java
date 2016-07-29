/**
 */
package gcoreDatabase.impl;

import gcoreDatabase.GcoreDatabasePackage;
import gcoreDatabase.SelectablePage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selectable Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gcoreDatabase.impl.SelectablePageImpl#isMultiSelection <em>Multi Selection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SelectablePageImpl extends MinimalEObjectImpl.Container implements SelectablePage {
	/**
	 * The default value of the '{@link #isMultiSelection() <em>Multi Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultiSelection()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTI_SELECTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMultiSelection() <em>Multi Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultiSelection()
	 * @generated
	 * @ordered
	 */
	protected boolean multiSelection = MULTI_SELECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectablePageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GcoreDatabasePackage.Literals.SELECTABLE_PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultiSelection() {
		return multiSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiSelection(boolean newMultiSelection) {
		boolean oldMultiSelection = multiSelection;
		multiSelection = newMultiSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GcoreDatabasePackage.SELECTABLE_PAGE__MULTI_SELECTION, oldMultiSelection, multiSelection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GcoreDatabasePackage.SELECTABLE_PAGE__MULTI_SELECTION:
				return isMultiSelection();
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
			case GcoreDatabasePackage.SELECTABLE_PAGE__MULTI_SELECTION:
				setMultiSelection((Boolean)newValue);
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
			case GcoreDatabasePackage.SELECTABLE_PAGE__MULTI_SELECTION:
				setMultiSelection(MULTI_SELECTION_EDEFAULT);
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
			case GcoreDatabasePackage.SELECTABLE_PAGE__MULTI_SELECTION:
				return multiSelection != MULTI_SELECTION_EDEFAULT;
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
		result.append(" (multiSelection: ");
		result.append(multiSelection);
		result.append(')');
		return result.toString();
	}

} //SelectablePageImpl
