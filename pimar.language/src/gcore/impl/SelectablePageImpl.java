/**
 */
package gcore.impl;

import gcore.GcorePackage;
import gcore.SelectablePage;
import gcore.StyleSelectionSettings;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selectable Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gcore.impl.SelectablePageImpl#isMultiSelection <em>Multi Selection</em>}</li>
 *   <li>{@link gcore.impl.SelectablePageImpl#getSelectablepageStyle <em>Selectablepage Style</em>}</li>
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
	 * The cached value of the '{@link #getSelectablepageStyle() <em>Selectablepage Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectablepageStyle()
	 * @generated
	 * @ordered
	 */
	protected StyleSelectionSettings selectablepageStyle;

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
		return GcorePackage.Literals.SELECTABLE_PAGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GcorePackage.SELECTABLE_PAGE__MULTI_SELECTION, oldMultiSelection, multiSelection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleSelectionSettings getSelectablepageStyle() {
		if (selectablepageStyle != null && selectablepageStyle.eIsProxy()) {
			InternalEObject oldSelectablepageStyle = (InternalEObject)selectablepageStyle;
			selectablepageStyle = (StyleSelectionSettings)eResolveProxy(oldSelectablepageStyle);
			if (selectablepageStyle != oldSelectablepageStyle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GcorePackage.SELECTABLE_PAGE__SELECTABLEPAGE_STYLE, oldSelectablepageStyle, selectablepageStyle));
			}
		}
		return selectablepageStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleSelectionSettings basicGetSelectablepageStyle() {
		return selectablepageStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectablepageStyle(StyleSelectionSettings newSelectablepageStyle) {
		StyleSelectionSettings oldSelectablepageStyle = selectablepageStyle;
		selectablepageStyle = newSelectablepageStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GcorePackage.SELECTABLE_PAGE__SELECTABLEPAGE_STYLE, oldSelectablepageStyle, selectablepageStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GcorePackage.SELECTABLE_PAGE__MULTI_SELECTION:
				return isMultiSelection();
			case GcorePackage.SELECTABLE_PAGE__SELECTABLEPAGE_STYLE:
				if (resolve) return getSelectablepageStyle();
				return basicGetSelectablepageStyle();
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
			case GcorePackage.SELECTABLE_PAGE__MULTI_SELECTION:
				setMultiSelection((Boolean)newValue);
				return;
			case GcorePackage.SELECTABLE_PAGE__SELECTABLEPAGE_STYLE:
				setSelectablepageStyle((StyleSelectionSettings)newValue);
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
			case GcorePackage.SELECTABLE_PAGE__MULTI_SELECTION:
				setMultiSelection(MULTI_SELECTION_EDEFAULT);
				return;
			case GcorePackage.SELECTABLE_PAGE__SELECTABLEPAGE_STYLE:
				setSelectablepageStyle((StyleSelectionSettings)null);
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
			case GcorePackage.SELECTABLE_PAGE__MULTI_SELECTION:
				return multiSelection != MULTI_SELECTION_EDEFAULT;
			case GcorePackage.SELECTABLE_PAGE__SELECTABLEPAGE_STYLE:
				return selectablepageStyle != null;
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
