/**
 */
package gcoreDatabase.impl;

import gcoreDatabase.ARPage;
import gcoreDatabase.CustomPage;
import gcoreDatabase.ELearningPage;
import gcoreDatabase.EditPage;
import gcoreDatabase.GcoreDatabaseFactory;
import gcoreDatabase.GcoreDatabasePackage;
import gcoreDatabase.ListPage;
import gcoreDatabase.ListStyle;
import gcoreDatabase.ListablePage;
import gcoreDatabase.LoginPage;
import gcoreDatabase.MapPage;
import gcoreDatabase.MediaPage;
import gcoreDatabase.Menu;
import gcoreDatabase.MenuStyle;
import gcoreDatabase.MenuablePage;
import gcoreDatabase.Page;
import gcoreDatabase.PageContainer;
import gcoreDatabase.ProcessSelectorPage;
import gcoreDatabase.RGBColor;
import gcoreDatabase.RecordAudioPage;
import gcoreDatabase.SelectableListPage;
import gcoreDatabase.SelectablePage;
import gcoreDatabase.StyleListSettings;
import gcoreDatabase.StyleMenuSettings;
import gcoreDatabase.StylePageSettings;
import gcoreDatabase.StyleSelectionSettings;
import gcoreDatabase.StyleSetting;
import gcoreDatabase.TakePicturePage;
import gcoreDatabase.ViewPage;

import gcoreDatabase.util.GcoreDatabaseValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GcoreDatabasePackageImpl extends EPackageImpl implements GcoreDatabasePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rgbColorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass editPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loginPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processSelectorPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectableListPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listablePageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectablePageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass menuablePageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass menuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleSettingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stylePageSettingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleListSettingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleMenuSettingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleSelectionSettingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mediaPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eLearningPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass takePicturePageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recordAudioPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum menuStyleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum listStyleEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see gcoreDatabase.GcoreDatabasePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GcoreDatabasePackageImpl() {
		super(eNS_URI, GcoreDatabaseFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link GcoreDatabasePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GcoreDatabasePackage init() {
		if (isInited) return (GcoreDatabasePackage)EPackage.Registry.INSTANCE.getEPackage(GcoreDatabasePackage.eNS_URI);

		// Obtain or create and register package
		GcoreDatabasePackageImpl theGcoreDatabasePackage = (GcoreDatabasePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GcoreDatabasePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GcoreDatabasePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGcoreDatabasePackage.createPackageContents();

		// Initialize created meta-data
		theGcoreDatabasePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theGcoreDatabasePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return GcoreDatabaseValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theGcoreDatabasePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GcoreDatabasePackage.eNS_URI, theGcoreDatabasePackage);
		return theGcoreDatabasePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPageContainer() {
		return pageContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageContainer_Pages() {
		return (EReference)pageContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageContainer_MenuablePages() {
		return (EReference)pageContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageContainer_Menues() {
		return (EReference)pageContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageContainer_ListablePages() {
		return (EReference)pageContainerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageContainer_StyleSettings() {
		return (EReference)pageContainerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageContainer_SelectablePages() {
		return (EReference)pageContainerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPage() {
		return pageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_PageStyle() {
		return (EReference)pageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRGBColor() {
		return rgbColorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRGBColor_Blue() {
		return (EAttribute)rgbColorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRGBColor_Red() {
		return (EAttribute)rgbColorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRGBColor_Green() {
		return (EAttribute)rgbColorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEditPage() {
		return editPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListPage() {
		return listPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListPage_Menu() {
		return (EReference)listPageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListPage_ListablepageStyle() {
		return (EReference)listPageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewPage() {
		return viewPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewPage_Menu() {
		return (EReference)viewPageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomPage() {
		return customPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoginPage() {
		return loginPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessSelectorPage() {
		return processSelectorPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessSelectorPage_Menu() {
		return (EReference)processSelectorPageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectableListPage() {
		return selectableListPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectableListPage_ListablepageStyle() {
		return (EReference)selectableListPageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectableListPage_SelectablepageStyle() {
		return (EReference)selectableListPageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListablePage() {
		return listablePageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectablePage() {
		return selectablePageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectablePage_MultiSelection() {
		return (EAttribute)selectablePageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMenuablePage() {
		return menuablePageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMenu() {
		return menuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMenu_MenuStyle() {
		return (EReference)menuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStyleSetting() {
		return styleSettingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyleSetting_RgbColors() {
		return (EReference)styleSettingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyleSetting_MenuStyle() {
		return (EReference)styleSettingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyleSetting_SelectionStyle() {
		return (EReference)styleSettingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyleSetting_PageStyle() {
		return (EReference)styleSettingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyleSetting_FontColor() {
		return (EReference)styleSettingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyleSetting_BackColor() {
		return (EReference)styleSettingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyleSetting_ListStyle() {
		return (EReference)styleSettingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStylePageSettings() {
		return stylePageSettingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStylePageSettings_ImagePosition() {
		return (EAttribute)stylePageSettingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStylePageSettings_TextPosition() {
		return (EAttribute)stylePageSettingsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStylePageSettings_Frame() {
		return (EAttribute)stylePageSettingsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStylePageSettings_FrameColor() {
		return (EReference)stylePageSettingsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStyleListSettings() {
		return styleListSettingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleListSettings_SeparatorShow() {
		return (EAttribute)styleListSettingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleListSettings_ListStyle() {
		return (EAttribute)styleListSettingsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyleListSettings_SeparatorColor() {
		return (EReference)styleListSettingsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStyleMenuSettings() {
		return styleMenuSettingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleMenuSettings_MenuStyle() {
		return (EAttribute)styleMenuSettingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleMenuSettings_FixedMenu() {
		return (EAttribute)styleMenuSettingsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStyleSelectionSettings() {
		return styleSelectionSettingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyleSelectionSettings_SelectionColor() {
		return (EReference)styleSelectionSettingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapPage() {
		return mapPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMediaPage() {
		return mediaPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getELearningPage() {
		return eLearningPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getELearningPage_Menu() {
		return (EReference)eLearningPageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTakePicturePage() {
		return takePicturePageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecordAudioPage() {
		return recordAudioPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getARPage() {
		return arPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMenuStyle() {
		return menuStyleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getListStyle() {
		return listStyleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GcoreDatabaseFactory getGcoreDatabaseFactory() {
		return (GcoreDatabaseFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		pageContainerEClass = createEClass(PAGE_CONTAINER);
		createEReference(pageContainerEClass, PAGE_CONTAINER__PAGES);
		createEReference(pageContainerEClass, PAGE_CONTAINER__MENUABLE_PAGES);
		createEReference(pageContainerEClass, PAGE_CONTAINER__MENUES);
		createEReference(pageContainerEClass, PAGE_CONTAINER__LISTABLE_PAGES);
		createEReference(pageContainerEClass, PAGE_CONTAINER__STYLE_SETTINGS);
		createEReference(pageContainerEClass, PAGE_CONTAINER__SELECTABLE_PAGES);

		pageEClass = createEClass(PAGE);
		createEReference(pageEClass, PAGE__PAGE_STYLE);

		rgbColorEClass = createEClass(RGB_COLOR);
		createEAttribute(rgbColorEClass, RGB_COLOR__BLUE);
		createEAttribute(rgbColorEClass, RGB_COLOR__RED);
		createEAttribute(rgbColorEClass, RGB_COLOR__GREEN);

		editPageEClass = createEClass(EDIT_PAGE);

		listPageEClass = createEClass(LIST_PAGE);
		createEReference(listPageEClass, LIST_PAGE__MENU);
		createEReference(listPageEClass, LIST_PAGE__LISTABLEPAGE_STYLE);

		viewPageEClass = createEClass(VIEW_PAGE);
		createEReference(viewPageEClass, VIEW_PAGE__MENU);

		customPageEClass = createEClass(CUSTOM_PAGE);

		loginPageEClass = createEClass(LOGIN_PAGE);

		processSelectorPageEClass = createEClass(PROCESS_SELECTOR_PAGE);
		createEReference(processSelectorPageEClass, PROCESS_SELECTOR_PAGE__MENU);

		selectableListPageEClass = createEClass(SELECTABLE_LIST_PAGE);
		createEReference(selectableListPageEClass, SELECTABLE_LIST_PAGE__LISTABLEPAGE_STYLE);
		createEReference(selectableListPageEClass, SELECTABLE_LIST_PAGE__SELECTABLEPAGE_STYLE);

		listablePageEClass = createEClass(LISTABLE_PAGE);

		selectablePageEClass = createEClass(SELECTABLE_PAGE);
		createEAttribute(selectablePageEClass, SELECTABLE_PAGE__MULTI_SELECTION);

		menuablePageEClass = createEClass(MENUABLE_PAGE);

		menuEClass = createEClass(MENU);
		createEReference(menuEClass, MENU__MENU_STYLE);

		styleSettingEClass = createEClass(STYLE_SETTING);
		createEReference(styleSettingEClass, STYLE_SETTING__RGB_COLORS);
		createEReference(styleSettingEClass, STYLE_SETTING__MENU_STYLE);
		createEReference(styleSettingEClass, STYLE_SETTING__SELECTION_STYLE);
		createEReference(styleSettingEClass, STYLE_SETTING__PAGE_STYLE);
		createEReference(styleSettingEClass, STYLE_SETTING__FONT_COLOR);
		createEReference(styleSettingEClass, STYLE_SETTING__BACK_COLOR);
		createEReference(styleSettingEClass, STYLE_SETTING__LIST_STYLE);

		stylePageSettingsEClass = createEClass(STYLE_PAGE_SETTINGS);
		createEAttribute(stylePageSettingsEClass, STYLE_PAGE_SETTINGS__IMAGE_POSITION);
		createEAttribute(stylePageSettingsEClass, STYLE_PAGE_SETTINGS__TEXT_POSITION);
		createEAttribute(stylePageSettingsEClass, STYLE_PAGE_SETTINGS__FRAME);
		createEReference(stylePageSettingsEClass, STYLE_PAGE_SETTINGS__FRAME_COLOR);

		styleListSettingsEClass = createEClass(STYLE_LIST_SETTINGS);
		createEAttribute(styleListSettingsEClass, STYLE_LIST_SETTINGS__SEPARATOR_SHOW);
		createEAttribute(styleListSettingsEClass, STYLE_LIST_SETTINGS__LIST_STYLE);
		createEReference(styleListSettingsEClass, STYLE_LIST_SETTINGS__SEPARATOR_COLOR);

		styleMenuSettingsEClass = createEClass(STYLE_MENU_SETTINGS);
		createEAttribute(styleMenuSettingsEClass, STYLE_MENU_SETTINGS__MENU_STYLE);
		createEAttribute(styleMenuSettingsEClass, STYLE_MENU_SETTINGS__FIXED_MENU);

		styleSelectionSettingsEClass = createEClass(STYLE_SELECTION_SETTINGS);
		createEReference(styleSelectionSettingsEClass, STYLE_SELECTION_SETTINGS__SELECTION_COLOR);

		mapPageEClass = createEClass(MAP_PAGE);

		mediaPageEClass = createEClass(MEDIA_PAGE);

		eLearningPageEClass = createEClass(ELEARNING_PAGE);
		createEReference(eLearningPageEClass, ELEARNING_PAGE__MENU);

		takePicturePageEClass = createEClass(TAKE_PICTURE_PAGE);

		recordAudioPageEClass = createEClass(RECORD_AUDIO_PAGE);

		arPageEClass = createEClass(AR_PAGE);

		// Create enums
		menuStyleEEnum = createEEnum(MENU_STYLE);
		listStyleEEnum = createEEnum(LIST_STYLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		pageContainerEClass.getESuperTypes().add(theEcorePackage.getEPackage());
		pageEClass.getESuperTypes().add(theEcorePackage.getENamedElement());
		rgbColorEClass.getESuperTypes().add(theEcorePackage.getENamedElement());
		editPageEClass.getESuperTypes().add(this.getPage());
		listPageEClass.getESuperTypes().add(this.getPage());
		listPageEClass.getESuperTypes().add(this.getListablePage());
		listPageEClass.getESuperTypes().add(this.getMenuablePage());
		viewPageEClass.getESuperTypes().add(this.getPage());
		viewPageEClass.getESuperTypes().add(this.getMenuablePage());
		customPageEClass.getESuperTypes().add(this.getPage());
		loginPageEClass.getESuperTypes().add(this.getPage());
		processSelectorPageEClass.getESuperTypes().add(this.getPage());
		processSelectorPageEClass.getESuperTypes().add(this.getMenuablePage());
		selectableListPageEClass.getESuperTypes().add(this.getPage());
		selectableListPageEClass.getESuperTypes().add(this.getSelectablePage());
		selectableListPageEClass.getESuperTypes().add(this.getListablePage());
		menuEClass.getESuperTypes().add(theEcorePackage.getENamedElement());
		mapPageEClass.getESuperTypes().add(this.getPage());
		mediaPageEClass.getESuperTypes().add(this.getPage());
		eLearningPageEClass.getESuperTypes().add(this.getPage());
		eLearningPageEClass.getESuperTypes().add(this.getMenuablePage());
		takePicturePageEClass.getESuperTypes().add(this.getPage());
		recordAudioPageEClass.getESuperTypes().add(this.getPage());
		arPageEClass.getESuperTypes().add(this.getPage());

		// Initialize classes, features, and operations; add parameters
		initEClass(pageContainerEClass, PageContainer.class, "PageContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPageContainer_Pages(), this.getPage(), null, "pages", null, 0, -1, PageContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPageContainer_MenuablePages(), this.getMenuablePage(), null, "menuablePages", null, 0, -1, PageContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPageContainer_Menues(), this.getMenu(), null, "menues", null, 0, -1, PageContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPageContainer_ListablePages(), this.getListablePage(), null, "listablePages", null, 0, -1, PageContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPageContainer_StyleSettings(), this.getStyleSetting(), null, "styleSettings", null, 0, -1, PageContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPageContainer_SelectablePages(), this.getSelectablePage(), null, "selectablePages", null, 0, -1, PageContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pageEClass, Page.class, "Page", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPage_PageStyle(), this.getStylePageSettings(), null, "pageStyle", null, 1, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rgbColorEClass, RGBColor.class, "RGBColor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRGBColor_Blue(), ecorePackage.getEInt(), "blue", null, 0, 1, RGBColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRGBColor_Red(), ecorePackage.getEInt(), "red", null, 0, 1, RGBColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRGBColor_Green(), ecorePackage.getEInt(), "green", null, 0, 1, RGBColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(editPageEClass, EditPage.class, "EditPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(listPageEClass, ListPage.class, "ListPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListPage_Menu(), this.getMenu(), null, "menu", null, 0, 1, ListPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getListPage_ListablepageStyle(), this.getStyleListSettings(), null, "listablepageStyle", null, 1, 1, ListPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewPageEClass, ViewPage.class, "ViewPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewPage_Menu(), this.getMenu(), null, "menu", null, 0, 1, ViewPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customPageEClass, CustomPage.class, "CustomPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(loginPageEClass, LoginPage.class, "LoginPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(processSelectorPageEClass, ProcessSelectorPage.class, "ProcessSelectorPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessSelectorPage_Menu(), this.getMenu(), null, "menu", null, 0, 1, ProcessSelectorPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectableListPageEClass, SelectableListPage.class, "SelectableListPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSelectableListPage_ListablepageStyle(), this.getStyleListSettings(), null, "listablepageStyle", null, 1, 1, SelectableListPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelectableListPage_SelectablepageStyle(), this.getStyleSelectionSettings(), null, "selectablepageStyle", null, 1, 1, SelectableListPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listablePageEClass, ListablePage.class, "ListablePage", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(selectablePageEClass, SelectablePage.class, "SelectablePage", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSelectablePage_MultiSelection(), ecorePackage.getEBoolean(), "multiSelection", null, 0, 1, SelectablePage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(menuablePageEClass, MenuablePage.class, "MenuablePage", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(menuEClass, Menu.class, "Menu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMenu_MenuStyle(), this.getStyleMenuSettings(), null, "menuStyle", null, 1, 1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(styleSettingEClass, StyleSetting.class, "StyleSetting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStyleSetting_RgbColors(), this.getRGBColor(), null, "rgbColors", null, 0, -1, StyleSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStyleSetting_MenuStyle(), this.getStyleMenuSettings(), null, "menuStyle", null, 0, 1, StyleSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStyleSetting_SelectionStyle(), this.getStyleSelectionSettings(), null, "selectionStyle", null, 0, 1, StyleSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStyleSetting_PageStyle(), this.getStylePageSettings(), null, "pageStyle", null, 1, 1, StyleSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStyleSetting_FontColor(), this.getRGBColor(), null, "fontColor", null, 1, 1, StyleSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStyleSetting_BackColor(), this.getRGBColor(), null, "backColor", null, 1, 1, StyleSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStyleSetting_ListStyle(), this.getStyleListSettings(), null, "listStyle", null, 0, 1, StyleSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stylePageSettingsEClass, StylePageSettings.class, "StylePageSettings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStylePageSettings_ImagePosition(), ecorePackage.getEInt(), "imagePosition", null, 0, 1, StylePageSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStylePageSettings_TextPosition(), ecorePackage.getEInt(), "textPosition", null, 0, 1, StylePageSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStylePageSettings_Frame(), ecorePackage.getEInt(), "frame", null, 0, 1, StylePageSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStylePageSettings_FrameColor(), this.getRGBColor(), null, "frameColor", null, 1, 1, StylePageSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(styleListSettingsEClass, StyleListSettings.class, "StyleListSettings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStyleListSettings_SeparatorShow(), ecorePackage.getEBoolean(), "separatorShow", null, 0, 1, StyleListSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyleListSettings_ListStyle(), this.getListStyle(), "listStyle", null, 0, 1, StyleListSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStyleListSettings_SeparatorColor(), this.getRGBColor(), null, "separatorColor", null, 1, 1, StyleListSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(styleMenuSettingsEClass, StyleMenuSettings.class, "StyleMenuSettings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStyleMenuSettings_MenuStyle(), this.getMenuStyle(), "menuStyle", null, 0, 1, StyleMenuSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyleMenuSettings_FixedMenu(), ecorePackage.getEBoolean(), "fixedMenu", null, 0, 1, StyleMenuSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(styleSelectionSettingsEClass, StyleSelectionSettings.class, "StyleSelectionSettings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStyleSelectionSettings_SelectionColor(), this.getRGBColor(), null, "selectionColor", null, 1, 1, StyleSelectionSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mapPageEClass, MapPage.class, "MapPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mediaPageEClass, MediaPage.class, "MediaPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eLearningPageEClass, ELearningPage.class, "ELearningPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getELearningPage_Menu(), this.getMenu(), null, "menu", null, 0, 1, ELearningPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(takePicturePageEClass, TakePicturePage.class, "TakePicturePage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(recordAudioPageEClass, RecordAudioPage.class, "RecordAudioPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arPageEClass, ARPage.class, "ARPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(menuStyleEEnum, MenuStyle.class, "MenuStyle");
		addEEnumLiteral(menuStyleEEnum, MenuStyle.TILE);
		addEEnumLiteral(menuStyleEEnum, MenuStyle.GRID);

		initEEnum(listStyleEEnum, ListStyle.class, "ListStyle");
		addEEnumLiteral(listStyleEEnum, ListStyle.GRID);
		addEEnumLiteral(listStyleEEnum, ListStyle.LIST);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });	
		addAnnotation
		  (rgbColorEClass, 
		   source, 
		   new String[] {
			 "constraints", "validRGB"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";	
		addAnnotation
		  (rgbColorEClass, 
		   source, 
		   new String[] {
			 "validRGB", "0 <= self.blue and self.blue <= 255 and 0 <= self.green and self.green <= 255 and 0 <= self.red and self.red <= 255"
		   });
	}

} //GcoreDatabasePackageImpl
