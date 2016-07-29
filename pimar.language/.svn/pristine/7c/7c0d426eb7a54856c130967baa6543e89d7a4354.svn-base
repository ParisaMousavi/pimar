/**
 */
package gcoreDatabase.util;

import gcoreDatabase.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EcoreValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see gcoreDatabase.GcoreDatabasePackage
 * @generated
 */
public class GcoreDatabaseValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final GcoreDatabaseValidator INSTANCE = new GcoreDatabaseValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "gcoreDatabase";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EcoreValidator ecoreValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GcoreDatabaseValidator() {
		super();
		ecoreValidator = EcoreValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return GcoreDatabasePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case GcoreDatabasePackage.PAGE_CONTAINER:
				return validatePageContainer((PageContainer)value, diagnostics, context);
			case GcoreDatabasePackage.PAGE:
				return validatePage((Page)value, diagnostics, context);
			case GcoreDatabasePackage.RGB_COLOR:
				return validateRGBColor((RGBColor)value, diagnostics, context);
			case GcoreDatabasePackage.EDIT_PAGE:
				return validateEditPage((EditPage)value, diagnostics, context);
			case GcoreDatabasePackage.LIST_PAGE:
				return validateListPage((ListPage)value, diagnostics, context);
			case GcoreDatabasePackage.VIEW_PAGE:
				return validateViewPage((ViewPage)value, diagnostics, context);
			case GcoreDatabasePackage.CUSTOM_PAGE:
				return validateCustomPage((CustomPage)value, diagnostics, context);
			case GcoreDatabasePackage.LOGIN_PAGE:
				return validateLoginPage((LoginPage)value, diagnostics, context);
			case GcoreDatabasePackage.PROCESS_SELECTOR_PAGE:
				return validateProcessSelectorPage((ProcessSelectorPage)value, diagnostics, context);
			case GcoreDatabasePackage.SELECTABLE_LIST_PAGE:
				return validateSelectableListPage((SelectableListPage)value, diagnostics, context);
			case GcoreDatabasePackage.LISTABLE_PAGE:
				return validateListablePage((ListablePage)value, diagnostics, context);
			case GcoreDatabasePackage.SELECTABLE_PAGE:
				return validateSelectablePage((SelectablePage)value, diagnostics, context);
			case GcoreDatabasePackage.MENUABLE_PAGE:
				return validateMenuablePage((MenuablePage)value, diagnostics, context);
			case GcoreDatabasePackage.MENU:
				return validateMenu((Menu)value, diagnostics, context);
			case GcoreDatabasePackage.STYLE_SETTING:
				return validateStyleSetting((StyleSetting)value, diagnostics, context);
			case GcoreDatabasePackage.STYLE_PAGE_SETTINGS:
				return validateStylePageSettings((StylePageSettings)value, diagnostics, context);
			case GcoreDatabasePackage.STYLE_LIST_SETTINGS:
				return validateStyleListSettings((StyleListSettings)value, diagnostics, context);
			case GcoreDatabasePackage.STYLE_MENU_SETTINGS:
				return validateStyleMenuSettings((StyleMenuSettings)value, diagnostics, context);
			case GcoreDatabasePackage.STYLE_SELECTION_SETTINGS:
				return validateStyleSelectionSettings((StyleSelectionSettings)value, diagnostics, context);
			case GcoreDatabasePackage.MAP_PAGE:
				return validateMapPage((MapPage)value, diagnostics, context);
			case GcoreDatabasePackage.MEDIA_PAGE:
				return validateMediaPage((MediaPage)value, diagnostics, context);
			case GcoreDatabasePackage.ELEARNING_PAGE:
				return validateELearningPage((ELearningPage)value, diagnostics, context);
			case GcoreDatabasePackage.TAKE_PICTURE_PAGE:
				return validateTakePicturePage((TakePicturePage)value, diagnostics, context);
			case GcoreDatabasePackage.RECORD_AUDIO_PAGE:
				return validateRecordAudioPage((RecordAudioPage)value, diagnostics, context);
			case GcoreDatabasePackage.AR_PAGE:
				return validateARPage((ARPage)value, diagnostics, context);
			case GcoreDatabasePackage.MENU_STYLE:
				return validateMenuStyle((MenuStyle)value, diagnostics, context);
			case GcoreDatabasePackage.LIST_STYLE:
				return validateListStyle((ListStyle)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePageContainer(PageContainer pageContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pageContainer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pageContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pageContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pageContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(pageContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pageContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pageContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pageContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pageContainer, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(pageContainer, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateEPackage_WellFormedNsURI(pageContainer, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateEPackage_WellFormedNsPrefix(pageContainer, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateEPackage_UniqueSubpackageNames(pageContainer, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateEPackage_UniqueClassifierNames(pageContainer, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateEPackage_UniqueNsURIs(pageContainer, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePage(Page page, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(page, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(page, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(page, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRGBColor(RGBColor rgbColor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rgbColor, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(rgbColor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(rgbColor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(rgbColor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(rgbColor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(rgbColor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(rgbColor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(rgbColor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(rgbColor, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(rgbColor, diagnostics, context);
		if (result || diagnostics != null) result &= validateRGBColor_validRGB(rgbColor, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the validRGB constraint of '<em>RGB Color</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RGB_COLOR__VALID_RGB__EEXPRESSION = "0 <= self.blue and self.blue <= 255 and 0 <= self.green and self.green <= 255 and 0 <= self.red and self.red <= 255";

	/**
	 * Validates the validRGB constraint of '<em>RGB Color</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRGBColor_validRGB(RGBColor rgbColor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GcoreDatabasePackage.Literals.RGB_COLOR,
				 rgbColor,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "validRGB",
				 RGB_COLOR__VALID_RGB__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEditPage(EditPage editPage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(editPage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(editPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(editPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(editPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(editPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(editPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(editPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(editPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(editPage, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(editPage, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListPage(ListPage listPage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(listPage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(listPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(listPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(listPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(listPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(listPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(listPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(listPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(listPage, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(listPage, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewPage(ViewPage viewPage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(viewPage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(viewPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(viewPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(viewPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(viewPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(viewPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(viewPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(viewPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(viewPage, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(viewPage, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomPage(CustomPage customPage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(customPage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(customPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(customPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(customPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(customPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(customPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(customPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(customPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(customPage, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(customPage, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoginPage(LoginPage loginPage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(loginPage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(loginPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(loginPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(loginPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(loginPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(loginPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(loginPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(loginPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(loginPage, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(loginPage, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessSelectorPage(ProcessSelectorPage processSelectorPage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(processSelectorPage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(processSelectorPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(processSelectorPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(processSelectorPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(processSelectorPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(processSelectorPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(processSelectorPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(processSelectorPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(processSelectorPage, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(processSelectorPage, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectableListPage(SelectableListPage selectableListPage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(selectableListPage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(selectableListPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(selectableListPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(selectableListPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(selectableListPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(selectableListPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(selectableListPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(selectableListPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(selectableListPage, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(selectableListPage, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListablePage(ListablePage listablePage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(listablePage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectablePage(SelectablePage selectablePage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(selectablePage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMenuablePage(MenuablePage menuablePage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(menuablePage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMenu(Menu menu, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(menu, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(menu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(menu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(menu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(menu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(menu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(menu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(menu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(menu, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(menu, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleSetting(StyleSetting styleSetting, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(styleSetting, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStylePageSettings(StylePageSettings stylePageSettings, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stylePageSettings, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleListSettings(StyleListSettings styleListSettings, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(styleListSettings, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleMenuSettings(StyleMenuSettings styleMenuSettings, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(styleMenuSettings, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleSelectionSettings(StyleSelectionSettings styleSelectionSettings, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(styleSelectionSettings, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMapPage(MapPage mapPage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mapPage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mapPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mapPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mapPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(mapPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mapPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mapPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mapPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mapPage, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(mapPage, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMediaPage(MediaPage mediaPage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mediaPage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mediaPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mediaPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mediaPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(mediaPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mediaPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mediaPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mediaPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mediaPage, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(mediaPage, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateELearningPage(ELearningPage eLearningPage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eLearningPage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eLearningPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eLearningPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eLearningPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eLearningPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eLearningPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eLearningPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eLearningPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eLearningPage, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(eLearningPage, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTakePicturePage(TakePicturePage takePicturePage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(takePicturePage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(takePicturePage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(takePicturePage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(takePicturePage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(takePicturePage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(takePicturePage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(takePicturePage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(takePicturePage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(takePicturePage, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(takePicturePage, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRecordAudioPage(RecordAudioPage recordAudioPage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(recordAudioPage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(recordAudioPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(recordAudioPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(recordAudioPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(recordAudioPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(recordAudioPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(recordAudioPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(recordAudioPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(recordAudioPage, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(recordAudioPage, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateARPage(ARPage arPage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(arPage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(arPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(arPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(arPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(arPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(arPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(arPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(arPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(arPage, diagnostics, context);
		if (result || diagnostics != null) result &= ecoreValidator.validateENamedElement_WellFormedName(arPage, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMenuStyle(MenuStyle menuStyle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListStyle(ListStyle listStyle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //GcoreDatabaseValidator
