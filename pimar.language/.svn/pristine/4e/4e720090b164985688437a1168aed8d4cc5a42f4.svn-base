/**
 */
package gcore.impl;

import gcore.GcorePackage;
import gcore.RGBColor;
import gcore.StyleListSettings;
import gcore.StyleMenuSettings;
import gcore.StylePageSettings;
import gcore.StyleSelectionSettings;
import gcore.StyleSetting;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Style Setting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gcore.impl.StyleSettingImpl#getRgbColors <em>Rgb Colors</em>}</li>
 *   <li>{@link gcore.impl.StyleSettingImpl#getMenuStyle <em>Menu Style</em>}</li>
 *   <li>{@link gcore.impl.StyleSettingImpl#getSelectionStyle <em>Selection Style</em>}</li>
 *   <li>{@link gcore.impl.StyleSettingImpl#getPageStyle <em>Page Style</em>}</li>
 *   <li>{@link gcore.impl.StyleSettingImpl#getFontColor <em>Font Color</em>}</li>
 *   <li>{@link gcore.impl.StyleSettingImpl#getBackColor <em>Back Color</em>}</li>
 *   <li>{@link gcore.impl.StyleSettingImpl#getListStyle <em>List Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StyleSettingImpl extends MinimalEObjectImpl.Container implements StyleSetting {
	/**
	 * The cached value of the '{@link #getRgbColors() <em>Rgb Colors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRgbColors()
	 * @generated
	 * @ordered
	 */
	protected EList<RGBColor> rgbColors;

	/**
	 * The cached value of the '{@link #getMenuStyle() <em>Menu Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenuStyle()
	 * @generated
	 * @ordered
	 */
	protected StyleMenuSettings menuStyle;

	/**
	 * The cached value of the '{@link #getSelectionStyle() <em>Selection Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectionStyle()
	 * @generated
	 * @ordered
	 */
	protected StyleSelectionSettings selectionStyle;

	/**
	 * The cached value of the '{@link #getPageStyle() <em>Page Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageStyle()
	 * @generated
	 * @ordered
	 */
	protected StylePageSettings pageStyle;

	/**
	 * The cached value of the '{@link #getFontColor() <em>Font Color</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontColor()
	 * @generated
	 * @ordered
	 */
	protected RGBColor fontColor;

	/**
	 * The cached value of the '{@link #getBackColor() <em>Back Color</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackColor()
	 * @generated
	 * @ordered
	 */
	protected RGBColor backColor;

	/**
	 * The cached value of the '{@link #getListStyle() <em>List Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListStyle()
	 * @generated
	 * @ordered
	 */
	protected StyleListSettings listStyle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StyleSettingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GcorePackage.Literals.STYLE_SETTING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RGBColor> getRgbColors() {
		if (rgbColors == null) {
			rgbColors = new EObjectContainmentEList<RGBColor>(RGBColor.class, this, GcorePackage.STYLE_SETTING__RGB_COLORS);
		}
		return rgbColors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleMenuSettings getMenuStyle() {
		return menuStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMenuStyle(StyleMenuSettings newMenuStyle, NotificationChain msgs) {
		StyleMenuSettings oldMenuStyle = menuStyle;
		menuStyle = newMenuStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GcorePackage.STYLE_SETTING__MENU_STYLE, oldMenuStyle, newMenuStyle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMenuStyle(StyleMenuSettings newMenuStyle) {
		if (newMenuStyle != menuStyle) {
			NotificationChain msgs = null;
			if (menuStyle != null)
				msgs = ((InternalEObject)menuStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GcorePackage.STYLE_SETTING__MENU_STYLE, null, msgs);
			if (newMenuStyle != null)
				msgs = ((InternalEObject)newMenuStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GcorePackage.STYLE_SETTING__MENU_STYLE, null, msgs);
			msgs = basicSetMenuStyle(newMenuStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GcorePackage.STYLE_SETTING__MENU_STYLE, newMenuStyle, newMenuStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleSelectionSettings getSelectionStyle() {
		return selectionStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelectionStyle(StyleSelectionSettings newSelectionStyle, NotificationChain msgs) {
		StyleSelectionSettings oldSelectionStyle = selectionStyle;
		selectionStyle = newSelectionStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GcorePackage.STYLE_SETTING__SELECTION_STYLE, oldSelectionStyle, newSelectionStyle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectionStyle(StyleSelectionSettings newSelectionStyle) {
		if (newSelectionStyle != selectionStyle) {
			NotificationChain msgs = null;
			if (selectionStyle != null)
				msgs = ((InternalEObject)selectionStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GcorePackage.STYLE_SETTING__SELECTION_STYLE, null, msgs);
			if (newSelectionStyle != null)
				msgs = ((InternalEObject)newSelectionStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GcorePackage.STYLE_SETTING__SELECTION_STYLE, null, msgs);
			msgs = basicSetSelectionStyle(newSelectionStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GcorePackage.STYLE_SETTING__SELECTION_STYLE, newSelectionStyle, newSelectionStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StylePageSettings getPageStyle() {
		return pageStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPageStyle(StylePageSettings newPageStyle, NotificationChain msgs) {
		StylePageSettings oldPageStyle = pageStyle;
		pageStyle = newPageStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GcorePackage.STYLE_SETTING__PAGE_STYLE, oldPageStyle, newPageStyle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageStyle(StylePageSettings newPageStyle) {
		if (newPageStyle != pageStyle) {
			NotificationChain msgs = null;
			if (pageStyle != null)
				msgs = ((InternalEObject)pageStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GcorePackage.STYLE_SETTING__PAGE_STYLE, null, msgs);
			if (newPageStyle != null)
				msgs = ((InternalEObject)newPageStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GcorePackage.STYLE_SETTING__PAGE_STYLE, null, msgs);
			msgs = basicSetPageStyle(newPageStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GcorePackage.STYLE_SETTING__PAGE_STYLE, newPageStyle, newPageStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RGBColor getFontColor() {
		if (fontColor != null && fontColor.eIsProxy()) {
			InternalEObject oldFontColor = (InternalEObject)fontColor;
			fontColor = (RGBColor)eResolveProxy(oldFontColor);
			if (fontColor != oldFontColor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GcorePackage.STYLE_SETTING__FONT_COLOR, oldFontColor, fontColor));
			}
		}
		return fontColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RGBColor basicGetFontColor() {
		return fontColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontColor(RGBColor newFontColor) {
		RGBColor oldFontColor = fontColor;
		fontColor = newFontColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GcorePackage.STYLE_SETTING__FONT_COLOR, oldFontColor, fontColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RGBColor getBackColor() {
		if (backColor != null && backColor.eIsProxy()) {
			InternalEObject oldBackColor = (InternalEObject)backColor;
			backColor = (RGBColor)eResolveProxy(oldBackColor);
			if (backColor != oldBackColor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GcorePackage.STYLE_SETTING__BACK_COLOR, oldBackColor, backColor));
			}
		}
		return backColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RGBColor basicGetBackColor() {
		return backColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackColor(RGBColor newBackColor) {
		RGBColor oldBackColor = backColor;
		backColor = newBackColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GcorePackage.STYLE_SETTING__BACK_COLOR, oldBackColor, backColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleListSettings getListStyle() {
		return listStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListStyle(StyleListSettings newListStyle, NotificationChain msgs) {
		StyleListSettings oldListStyle = listStyle;
		listStyle = newListStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GcorePackage.STYLE_SETTING__LIST_STYLE, oldListStyle, newListStyle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListStyle(StyleListSettings newListStyle) {
		if (newListStyle != listStyle) {
			NotificationChain msgs = null;
			if (listStyle != null)
				msgs = ((InternalEObject)listStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GcorePackage.STYLE_SETTING__LIST_STYLE, null, msgs);
			if (newListStyle != null)
				msgs = ((InternalEObject)newListStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GcorePackage.STYLE_SETTING__LIST_STYLE, null, msgs);
			msgs = basicSetListStyle(newListStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GcorePackage.STYLE_SETTING__LIST_STYLE, newListStyle, newListStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GcorePackage.STYLE_SETTING__RGB_COLORS:
				return ((InternalEList<?>)getRgbColors()).basicRemove(otherEnd, msgs);
			case GcorePackage.STYLE_SETTING__MENU_STYLE:
				return basicSetMenuStyle(null, msgs);
			case GcorePackage.STYLE_SETTING__SELECTION_STYLE:
				return basicSetSelectionStyle(null, msgs);
			case GcorePackage.STYLE_SETTING__PAGE_STYLE:
				return basicSetPageStyle(null, msgs);
			case GcorePackage.STYLE_SETTING__LIST_STYLE:
				return basicSetListStyle(null, msgs);
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
			case GcorePackage.STYLE_SETTING__RGB_COLORS:
				return getRgbColors();
			case GcorePackage.STYLE_SETTING__MENU_STYLE:
				return getMenuStyle();
			case GcorePackage.STYLE_SETTING__SELECTION_STYLE:
				return getSelectionStyle();
			case GcorePackage.STYLE_SETTING__PAGE_STYLE:
				return getPageStyle();
			case GcorePackage.STYLE_SETTING__FONT_COLOR:
				if (resolve) return getFontColor();
				return basicGetFontColor();
			case GcorePackage.STYLE_SETTING__BACK_COLOR:
				if (resolve) return getBackColor();
				return basicGetBackColor();
			case GcorePackage.STYLE_SETTING__LIST_STYLE:
				return getListStyle();
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
			case GcorePackage.STYLE_SETTING__RGB_COLORS:
				getRgbColors().clear();
				getRgbColors().addAll((Collection<? extends RGBColor>)newValue);
				return;
			case GcorePackage.STYLE_SETTING__MENU_STYLE:
				setMenuStyle((StyleMenuSettings)newValue);
				return;
			case GcorePackage.STYLE_SETTING__SELECTION_STYLE:
				setSelectionStyle((StyleSelectionSettings)newValue);
				return;
			case GcorePackage.STYLE_SETTING__PAGE_STYLE:
				setPageStyle((StylePageSettings)newValue);
				return;
			case GcorePackage.STYLE_SETTING__FONT_COLOR:
				setFontColor((RGBColor)newValue);
				return;
			case GcorePackage.STYLE_SETTING__BACK_COLOR:
				setBackColor((RGBColor)newValue);
				return;
			case GcorePackage.STYLE_SETTING__LIST_STYLE:
				setListStyle((StyleListSettings)newValue);
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
			case GcorePackage.STYLE_SETTING__RGB_COLORS:
				getRgbColors().clear();
				return;
			case GcorePackage.STYLE_SETTING__MENU_STYLE:
				setMenuStyle((StyleMenuSettings)null);
				return;
			case GcorePackage.STYLE_SETTING__SELECTION_STYLE:
				setSelectionStyle((StyleSelectionSettings)null);
				return;
			case GcorePackage.STYLE_SETTING__PAGE_STYLE:
				setPageStyle((StylePageSettings)null);
				return;
			case GcorePackage.STYLE_SETTING__FONT_COLOR:
				setFontColor((RGBColor)null);
				return;
			case GcorePackage.STYLE_SETTING__BACK_COLOR:
				setBackColor((RGBColor)null);
				return;
			case GcorePackage.STYLE_SETTING__LIST_STYLE:
				setListStyle((StyleListSettings)null);
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
			case GcorePackage.STYLE_SETTING__RGB_COLORS:
				return rgbColors != null && !rgbColors.isEmpty();
			case GcorePackage.STYLE_SETTING__MENU_STYLE:
				return menuStyle != null;
			case GcorePackage.STYLE_SETTING__SELECTION_STYLE:
				return selectionStyle != null;
			case GcorePackage.STYLE_SETTING__PAGE_STYLE:
				return pageStyle != null;
			case GcorePackage.STYLE_SETTING__FONT_COLOR:
				return fontColor != null;
			case GcorePackage.STYLE_SETTING__BACK_COLOR:
				return backColor != null;
			case GcorePackage.STYLE_SETTING__LIST_STYLE:
				return listStyle != null;
		}
		return super.eIsSet(featureID);
	}

} //StyleSettingImpl
