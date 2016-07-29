/**
 */
package gcore;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see gcore.GcoreFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface GcorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gcore";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/2002/Gcore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gcore";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GcorePackage eINSTANCE = gcore.impl.GcorePackageImpl.init();

	/**
	 * The meta object id for the '{@link gcore.impl.PageContainerImpl <em>Page Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gcore.impl.PageContainerImpl
	 * @see gcore.impl.GcorePackageImpl#getPageContainer()
	 * @generated
	 */
	int PAGE_CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_CONTAINER__EANNOTATIONS = EcorePackage.EPACKAGE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_CONTAINER__NAME = EcorePackage.EPACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_CONTAINER__NS_URI = EcorePackage.EPACKAGE__NS_URI;

	/**
	 * The feature id for the '<em><b>Ns Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_CONTAINER__NS_PREFIX = EcorePackage.EPACKAGE__NS_PREFIX;

	/**
	 * The feature id for the '<em><b>EFactory Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_CONTAINER__EFACTORY_INSTANCE = EcorePackage.EPACKAGE__EFACTORY_INSTANCE;

	/**
	 * The feature id for the '<em><b>EClassifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_CONTAINER__ECLASSIFIERS = EcorePackage.EPACKAGE__ECLASSIFIERS;

	/**
	 * The feature id for the '<em><b>ESubpackages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_CONTAINER__ESUBPACKAGES = EcorePackage.EPACKAGE__ESUBPACKAGES;

	/**
	 * The feature id for the '<em><b>ESuper Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_CONTAINER__ESUPER_PACKAGE = EcorePackage.EPACKAGE__ESUPER_PACKAGE;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_CONTAINER__PAGES = EcorePackage.EPACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Menuable Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_CONTAINER__MENUABLE_PAGES = EcorePackage.EPACKAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Menues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_CONTAINER__MENUES = EcorePackage.EPACKAGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Listable Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_CONTAINER__LISTABLE_PAGES = EcorePackage.EPACKAGE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Style Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_CONTAINER__STYLE_SETTINGS = EcorePackage.EPACKAGE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Selectable Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_CONTAINER__SELECTABLE_PAGES = EcorePackage.EPACKAGE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Page Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_CONTAINER_FEATURE_COUNT = EcorePackage.EPACKAGE_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_CONTAINER___GET_EANNOTATION__STRING = EcorePackage.EPACKAGE___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get EClassifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_CONTAINER___GET_ECLASSIFIER__STRING = EcorePackage.EPACKAGE___GET_ECLASSIFIER__STRING;

	/**
	 * The number of operations of the '<em>Page Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_CONTAINER_OPERATION_COUNT = EcorePackage.EPACKAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gcore.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gcore.impl.PageImpl
	 * @see gcore.impl.GcorePackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 1;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__EANNOTATIONS = EcorePackage.ENAMED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NAME = EcorePackage.ENAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Page Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__PAGE_STYLE = EcorePackage.ENAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = EcorePackage.ENAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE___GET_EANNOTATION__STRING = EcorePackage.ENAMED_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = EcorePackage.ENAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gcore.impl.RGBColorImpl <em>RGB Color</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gcore.impl.RGBColorImpl
	 * @see gcore.impl.GcorePackageImpl#getRGBColor()
	 * @generated
	 */
	int RGB_COLOR = 2;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_COLOR__EANNOTATIONS = EcorePackage.ENAMED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_COLOR__NAME = EcorePackage.ENAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Blue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_COLOR__BLUE = EcorePackage.ENAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Red</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_COLOR__RED = EcorePackage.ENAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Green</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_COLOR__GREEN = EcorePackage.ENAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>RGB Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_COLOR_FEATURE_COUNT = EcorePackage.ENAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_COLOR___GET_EANNOTATION__STRING = EcorePackage.ENAMED_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>RGB Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_COLOR_OPERATION_COUNT = EcorePackage.ENAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gcore.impl.EditPageImpl <em>Edit Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gcore.impl.EditPageImpl
	 * @see gcore.impl.GcorePackageImpl#getEditPage()
	 * @generated
	 */
	int EDIT_PAGE = 3;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_PAGE__EANNOTATIONS = PAGE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_PAGE__NAME = PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Page Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_PAGE__PAGE_STYLE = PAGE__PAGE_STYLE;

	/**
	 * The number of structural features of the '<em>Edit Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_PAGE_FEATURE_COUNT = PAGE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_PAGE___GET_EANNOTATION__STRING = PAGE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Edit Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_PAGE_OPERATION_COUNT = PAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gcore.impl.ListPageImpl <em>List Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gcore.impl.ListPageImpl
	 * @see gcore.impl.GcorePackageImpl#getListPage()
	 * @generated
	 */
	int LIST_PAGE = 4;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PAGE__EANNOTATIONS = PAGE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PAGE__NAME = PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Page Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PAGE__PAGE_STYLE = PAGE__PAGE_STYLE;

	/**
	 * The feature id for the '<em><b>Listablepage Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PAGE__LISTABLEPAGE_STYLE = PAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PAGE__MENU = PAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>List Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PAGE_FEATURE_COUNT = PAGE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PAGE___GET_EANNOTATION__STRING = PAGE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>List Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PAGE_OPERATION_COUNT = PAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gcore.impl.ViewPageImpl <em>View Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gcore.impl.ViewPageImpl
	 * @see gcore.impl.GcorePackageImpl#getViewPage()
	 * @generated
	 */
	int VIEW_PAGE = 5;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_PAGE__EANNOTATIONS = PAGE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_PAGE__NAME = PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Page Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_PAGE__PAGE_STYLE = PAGE__PAGE_STYLE;

	/**
	 * The feature id for the '<em><b>Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_PAGE__MENU = PAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_PAGE_FEATURE_COUNT = PAGE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_PAGE___GET_EANNOTATION__STRING = PAGE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>View Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_PAGE_OPERATION_COUNT = PAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gcore.impl.CustomPageImpl <em>Custom Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gcore.impl.CustomPageImpl
	 * @see gcore.impl.GcorePackageImpl#getCustomPage()
	 * @generated
	 */
	int CUSTOM_PAGE = 6;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_PAGE__EANNOTATIONS = PAGE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_PAGE__NAME = PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Page Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_PAGE__PAGE_STYLE = PAGE__PAGE_STYLE;

	/**
	 * The number of structural features of the '<em>Custom Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_PAGE_FEATURE_COUNT = PAGE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_PAGE___GET_EANNOTATION__STRING = PAGE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Custom Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_PAGE_OPERATION_COUNT = PAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gcore.impl.LoginPageImpl <em>Login Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gcore.impl.LoginPageImpl
	 * @see gcore.impl.GcorePackageImpl#getLoginPage()
	 * @generated
	 */
	int LOGIN_PAGE = 7;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_PAGE__EANNOTATIONS = PAGE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_PAGE__NAME = PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Page Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_PAGE__PAGE_STYLE = PAGE__PAGE_STYLE;

	/**
	 * The number of structural features of the '<em>Login Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_PAGE_FEATURE_COUNT = PAGE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_PAGE___GET_EANNOTATION__STRING = PAGE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Login Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_PAGE_OPERATION_COUNT = PAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gcore.impl.ProcessSelectorPageImpl <em>Process Selector Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gcore.impl.ProcessSelectorPageImpl
	 * @see gcore.impl.GcorePackageImpl#getProcessSelectorPage()
	 * @generated
	 */
	int PROCESS_SELECTOR_PAGE = 8;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_SELECTOR_PAGE__EANNOTATIONS = PAGE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_SELECTOR_PAGE__NAME = PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Page Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_SELECTOR_PAGE__PAGE_STYLE = PAGE__PAGE_STYLE;

	/**
	 * The feature id for the '<em><b>Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_SELECTOR_PAGE__MENU = PAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Process Selector Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_SELECTOR_PAGE_FEATURE_COUNT = PAGE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_SELECTOR_PAGE___GET_EANNOTATION__STRING = PAGE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Process Selector Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_SELECTOR_PAGE_OPERATION_COUNT = PAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gcore.impl.SelectableListPageImpl <em>Selectable List Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gcore.impl.SelectableListPageImpl
	 * @see gcore.impl.GcorePackageImpl#getSelectableListPage()
	 * @generated
	 */
	int SELECTABLE_LIST_PAGE = 9;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTABLE_LIST_PAGE__EANNOTATIONS = PAGE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTABLE_LIST_PAGE__NAME = PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Page Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTABLE_LIST_PAGE__PAGE_STYLE = PAGE__PAGE_STYLE;

	/**
	 * The feature id for the '<em><b>Multi Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTABLE_LIST_PAGE__MULTI_SELECTION = PAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Selectablepage Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTABLE_LIST_PAGE__SELECTABLEPAGE_STYLE = PAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Listablepage Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTABLE_LIST_PAGE__LISTABLEPAGE_STYLE = PAGE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Selectable List Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTABLE_LIST_PAGE_FEATURE_COUNT = PAGE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTABLE_LIST_PAGE___GET_EANNOTATION__STRING = PAGE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Selectable List Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTABLE_LIST_PAGE_OPERATION_COUNT = PAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gcore.impl.ListablePageImpl <em>Listable Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gcore.impl.ListablePageImpl
	 * @see gcore.impl.GcorePackageImpl#getListablePage()
	 * @generated
	 */
	int LISTABLE_PAGE = 10;

	/**
	 * The feature id for the '<em><b>Listablepage Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTABLE_PAGE__LISTABLEPAGE_STYLE = 0;

	/**
	 * The number of structural features of the '<em>Listable Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTABLE_PAGE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Listable Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTABLE_PAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gcore.impl.SelectablePageImpl <em>Selectable Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gcore.impl.SelectablePageImpl
	 * @see gcore.impl.GcorePackageImpl#getSelectablePage()
	 * @generated
	 */
	int SELECTABLE_PAGE = 11;

	/**
	 * The feature id for the '<em><b>Multi Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTABLE_PAGE__MULTI_SELECTION = 0;

	/**
	 * The feature id for the '<em><b>Selectablepage Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTABLE_PAGE__SELECTABLEPAGE_STYLE = 1;

	/**
	 * The number of structural features of the '<em>Selectable Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTABLE_PAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Selectable Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTABLE_PAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gcore.impl.MenuablePageImpl <em>Menuable Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gcore.impl.MenuablePageImpl
	 * @see gcore.impl.GcorePackageImpl#getMenuablePage()
	 * @generated
	 */
	int MENUABLE_PAGE = 12;

	/**
	 * The feature id for the '<em><b>Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENUABLE_PAGE__MENU = 0;

	/**
	 * The number of structural features of the '<em>Menuable Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENUABLE_PAGE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Menuable Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENUABLE_PAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gcore.impl.MenuImpl <em>Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gcore.impl.MenuImpl
	 * @see gcore.impl.GcorePackageImpl#getMenu()
	 * @generated
	 */
	int MENU = 13;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__EANNOTATIONS = EcorePackage.ENAMED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__NAME = EcorePackage.ENAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Menu Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__MENU_STYLE = EcorePackage.ENAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_FEATURE_COUNT = EcorePackage.ENAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU___GET_EANNOTATION__STRING = EcorePackage.ENAMED_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_OPERATION_COUNT = EcorePackage.ENAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gcore.impl.StyleSettingImpl <em>Style Setting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gcore.impl.StyleSettingImpl
	 * @see gcore.impl.GcorePackageImpl#getStyleSetting()
	 * @generated
	 */
	int STYLE_SETTING = 14;

	/**
	 * The feature id for the '<em><b>Rgb Colors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_SETTING__RGB_COLORS = 0;

	/**
	 * The feature id for the '<em><b>Menu Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_SETTING__MENU_STYLE = 1;

	/**
	 * The feature id for the '<em><b>Selection Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_SETTING__SELECTION_STYLE = 2;

	/**
	 * The feature id for the '<em><b>Page Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_SETTING__PAGE_STYLE = 3;

	/**
	 * The feature id for the '<em><b>Font Color</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_SETTING__FONT_COLOR = 4;

	/**
	 * The feature id for the '<em><b>Back Color</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_SETTING__BACK_COLOR = 5;

	/**
	 * The feature id for the '<em><b>List Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_SETTING__LIST_STYLE = 6;

	/**
	 * The number of structural features of the '<em>Style Setting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_SETTING_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Style Setting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_SETTING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gcore.impl.StylePageSettingsImpl <em>Style Page Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gcore.impl.StylePageSettingsImpl
	 * @see gcore.impl.GcorePackageImpl#getStylePageSettings()
	 * @generated
	 */
	int STYLE_PAGE_SETTINGS = 15;

	/**
	 * The feature id for the '<em><b>Image Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_PAGE_SETTINGS__IMAGE_POSITION = 0;

	/**
	 * The feature id for the '<em><b>Text Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_PAGE_SETTINGS__TEXT_POSITION = 1;

	/**
	 * The feature id for the '<em><b>Frame</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_PAGE_SETTINGS__FRAME = 2;

	/**
	 * The feature id for the '<em><b>Frame Color</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_PAGE_SETTINGS__FRAME_COLOR = 3;

	/**
	 * The number of structural features of the '<em>Style Page Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_PAGE_SETTINGS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Style Page Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_PAGE_SETTINGS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gcore.impl.StyleListSettingsImpl <em>Style List Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gcore.impl.StyleListSettingsImpl
	 * @see gcore.impl.GcorePackageImpl#getStyleListSettings()
	 * @generated
	 */
	int STYLE_LIST_SETTINGS = 16;

	/**
	 * The feature id for the '<em><b>Separator Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_LIST_SETTINGS__SEPARATOR_SHOW = 0;

	/**
	 * The feature id for the '<em><b>List Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_LIST_SETTINGS__LIST_STYLE = 1;

	/**
	 * The feature id for the '<em><b>Separator Color</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_LIST_SETTINGS__SEPARATOR_COLOR = 2;

	/**
	 * The number of structural features of the '<em>Style List Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_LIST_SETTINGS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Style List Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_LIST_SETTINGS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gcore.impl.StyleMenuSettingsImpl <em>Style Menu Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gcore.impl.StyleMenuSettingsImpl
	 * @see gcore.impl.GcorePackageImpl#getStyleMenuSettings()
	 * @generated
	 */
	int STYLE_MENU_SETTINGS = 17;

	/**
	 * The feature id for the '<em><b>Menu Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_MENU_SETTINGS__MENU_STYLE = 0;

	/**
	 * The feature id for the '<em><b>Fixed Menu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_MENU_SETTINGS__FIXED_MENU = 1;

	/**
	 * The number of structural features of the '<em>Style Menu Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_MENU_SETTINGS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Style Menu Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_MENU_SETTINGS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gcore.impl.StyleSelectionSettingsImpl <em>Style Selection Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gcore.impl.StyleSelectionSettingsImpl
	 * @see gcore.impl.GcorePackageImpl#getStyleSelectionSettings()
	 * @generated
	 */
	int STYLE_SELECTION_SETTINGS = 18;

	/**
	 * The feature id for the '<em><b>Selection Color</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_SELECTION_SETTINGS__SELECTION_COLOR = 0;

	/**
	 * The number of structural features of the '<em>Style Selection Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_SELECTION_SETTINGS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Style Selection Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_SELECTION_SETTINGS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gcore.impl.MapPageImpl <em>Map Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gcore.impl.MapPageImpl
	 * @see gcore.impl.GcorePackageImpl#getMapPage()
	 * @generated
	 */
	int MAP_PAGE = 19;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_PAGE__EANNOTATIONS = PAGE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_PAGE__NAME = PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Page Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_PAGE__PAGE_STYLE = PAGE__PAGE_STYLE;

	/**
	 * The number of structural features of the '<em>Map Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_PAGE_FEATURE_COUNT = PAGE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_PAGE___GET_EANNOTATION__STRING = PAGE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Map Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_PAGE_OPERATION_COUNT = PAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gcore.impl.MediaPageImpl <em>Media Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gcore.impl.MediaPageImpl
	 * @see gcore.impl.GcorePackageImpl#getMediaPage()
	 * @generated
	 */
	int MEDIA_PAGE = 20;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_PAGE__EANNOTATIONS = PAGE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_PAGE__NAME = PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Page Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_PAGE__PAGE_STYLE = PAGE__PAGE_STYLE;

	/**
	 * The number of structural features of the '<em>Media Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_PAGE_FEATURE_COUNT = PAGE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_PAGE___GET_EANNOTATION__STRING = PAGE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Media Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_PAGE_OPERATION_COUNT = PAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gcore.impl.ELearningPageImpl <em>ELearning Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gcore.impl.ELearningPageImpl
	 * @see gcore.impl.GcorePackageImpl#getELearningPage()
	 * @generated
	 */
	int ELEARNING_PAGE = 21;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEARNING_PAGE__EANNOTATIONS = PAGE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEARNING_PAGE__NAME = PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Page Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEARNING_PAGE__PAGE_STYLE = PAGE__PAGE_STYLE;

	/**
	 * The feature id for the '<em><b>Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEARNING_PAGE__MENU = PAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ELearning Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEARNING_PAGE_FEATURE_COUNT = PAGE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEARNING_PAGE___GET_EANNOTATION__STRING = PAGE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>ELearning Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEARNING_PAGE_OPERATION_COUNT = PAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gcore.impl.TakePicturePageImpl <em>Take Picture Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gcore.impl.TakePicturePageImpl
	 * @see gcore.impl.GcorePackageImpl#getTakePicturePage()
	 * @generated
	 */
	int TAKE_PICTURE_PAGE = 22;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAKE_PICTURE_PAGE__EANNOTATIONS = PAGE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAKE_PICTURE_PAGE__NAME = PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Page Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAKE_PICTURE_PAGE__PAGE_STYLE = PAGE__PAGE_STYLE;

	/**
	 * The number of structural features of the '<em>Take Picture Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAKE_PICTURE_PAGE_FEATURE_COUNT = PAGE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAKE_PICTURE_PAGE___GET_EANNOTATION__STRING = PAGE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Take Picture Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAKE_PICTURE_PAGE_OPERATION_COUNT = PAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gcore.impl.RecordAudioPageImpl <em>Record Audio Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gcore.impl.RecordAudioPageImpl
	 * @see gcore.impl.GcorePackageImpl#getRecordAudioPage()
	 * @generated
	 */
	int RECORD_AUDIO_PAGE = 23;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_AUDIO_PAGE__EANNOTATIONS = PAGE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_AUDIO_PAGE__NAME = PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Page Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_AUDIO_PAGE__PAGE_STYLE = PAGE__PAGE_STYLE;

	/**
	 * The number of structural features of the '<em>Record Audio Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_AUDIO_PAGE_FEATURE_COUNT = PAGE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_AUDIO_PAGE___GET_EANNOTATION__STRING = PAGE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Record Audio Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_AUDIO_PAGE_OPERATION_COUNT = PAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gcore.impl.ARPageImpl <em>AR Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gcore.impl.ARPageImpl
	 * @see gcore.impl.GcorePackageImpl#getARPage()
	 * @generated
	 */
	int AR_PAGE = 24;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR_PAGE__EANNOTATIONS = PAGE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR_PAGE__NAME = PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Page Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR_PAGE__PAGE_STYLE = PAGE__PAGE_STYLE;

	/**
	 * The number of structural features of the '<em>AR Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR_PAGE_FEATURE_COUNT = PAGE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR_PAGE___GET_EANNOTATION__STRING = PAGE___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>AR Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR_PAGE_OPERATION_COUNT = PAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gcore.MenuStyle <em>Menu Style</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gcore.MenuStyle
	 * @see gcore.impl.GcorePackageImpl#getMenuStyle()
	 * @generated
	 */
	int MENU_STYLE = 25;

	/**
	 * The meta object id for the '{@link gcore.ListStyle <em>List Style</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gcore.ListStyle
	 * @see gcore.impl.GcorePackageImpl#getListStyle()
	 * @generated
	 */
	int LIST_STYLE = 26;


	/**
	 * Returns the meta object for class '{@link gcore.PageContainer <em>Page Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page Container</em>'.
	 * @see gcore.PageContainer
	 * @generated
	 */
	EClass getPageContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link gcore.PageContainer#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pages</em>'.
	 * @see gcore.PageContainer#getPages()
	 * @see #getPageContainer()
	 * @generated
	 */
	EReference getPageContainer_Pages();

	/**
	 * Returns the meta object for the containment reference list '{@link gcore.PageContainer#getMenuablePages <em>Menuable Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Menuable Pages</em>'.
	 * @see gcore.PageContainer#getMenuablePages()
	 * @see #getPageContainer()
	 * @generated
	 */
	EReference getPageContainer_MenuablePages();

	/**
	 * Returns the meta object for the containment reference list '{@link gcore.PageContainer#getMenues <em>Menues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Menues</em>'.
	 * @see gcore.PageContainer#getMenues()
	 * @see #getPageContainer()
	 * @generated
	 */
	EReference getPageContainer_Menues();

	/**
	 * Returns the meta object for the containment reference list '{@link gcore.PageContainer#getListablePages <em>Listable Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Listable Pages</em>'.
	 * @see gcore.PageContainer#getListablePages()
	 * @see #getPageContainer()
	 * @generated
	 */
	EReference getPageContainer_ListablePages();

	/**
	 * Returns the meta object for the containment reference list '{@link gcore.PageContainer#getStyleSettings <em>Style Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Style Settings</em>'.
	 * @see gcore.PageContainer#getStyleSettings()
	 * @see #getPageContainer()
	 * @generated
	 */
	EReference getPageContainer_StyleSettings();

	/**
	 * Returns the meta object for the containment reference list '{@link gcore.PageContainer#getSelectablePages <em>Selectable Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Selectable Pages</em>'.
	 * @see gcore.PageContainer#getSelectablePages()
	 * @see #getPageContainer()
	 * @generated
	 */
	EReference getPageContainer_SelectablePages();

	/**
	 * Returns the meta object for class '{@link gcore.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see gcore.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the reference '{@link gcore.Page#getPageStyle <em>Page Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Page Style</em>'.
	 * @see gcore.Page#getPageStyle()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_PageStyle();

	/**
	 * Returns the meta object for class '{@link gcore.RGBColor <em>RGB Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RGB Color</em>'.
	 * @see gcore.RGBColor
	 * @generated
	 */
	EClass getRGBColor();

	/**
	 * Returns the meta object for the attribute '{@link gcore.RGBColor#getBlue <em>Blue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blue</em>'.
	 * @see gcore.RGBColor#getBlue()
	 * @see #getRGBColor()
	 * @generated
	 */
	EAttribute getRGBColor_Blue();

	/**
	 * Returns the meta object for the attribute '{@link gcore.RGBColor#getRed <em>Red</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Red</em>'.
	 * @see gcore.RGBColor#getRed()
	 * @see #getRGBColor()
	 * @generated
	 */
	EAttribute getRGBColor_Red();

	/**
	 * Returns the meta object for the attribute '{@link gcore.RGBColor#getGreen <em>Green</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Green</em>'.
	 * @see gcore.RGBColor#getGreen()
	 * @see #getRGBColor()
	 * @generated
	 */
	EAttribute getRGBColor_Green();

	/**
	 * Returns the meta object for class '{@link gcore.EditPage <em>Edit Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edit Page</em>'.
	 * @see gcore.EditPage
	 * @generated
	 */
	EClass getEditPage();

	/**
	 * Returns the meta object for class '{@link gcore.ListPage <em>List Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Page</em>'.
	 * @see gcore.ListPage
	 * @generated
	 */
	EClass getListPage();

	/**
	 * Returns the meta object for class '{@link gcore.ViewPage <em>View Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Page</em>'.
	 * @see gcore.ViewPage
	 * @generated
	 */
	EClass getViewPage();

	/**
	 * Returns the meta object for class '{@link gcore.CustomPage <em>Custom Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Page</em>'.
	 * @see gcore.CustomPage
	 * @generated
	 */
	EClass getCustomPage();

	/**
	 * Returns the meta object for class '{@link gcore.LoginPage <em>Login Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Login Page</em>'.
	 * @see gcore.LoginPage
	 * @generated
	 */
	EClass getLoginPage();

	/**
	 * Returns the meta object for class '{@link gcore.ProcessSelectorPage <em>Process Selector Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Selector Page</em>'.
	 * @see gcore.ProcessSelectorPage
	 * @generated
	 */
	EClass getProcessSelectorPage();

	/**
	 * Returns the meta object for class '{@link gcore.SelectableListPage <em>Selectable List Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selectable List Page</em>'.
	 * @see gcore.SelectableListPage
	 * @generated
	 */
	EClass getSelectableListPage();

	/**
	 * Returns the meta object for class '{@link gcore.ListablePage <em>Listable Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Listable Page</em>'.
	 * @see gcore.ListablePage
	 * @generated
	 */
	EClass getListablePage();

	/**
	 * Returns the meta object for the reference '{@link gcore.ListablePage#getListablepageStyle <em>Listablepage Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Listablepage Style</em>'.
	 * @see gcore.ListablePage#getListablepageStyle()
	 * @see #getListablePage()
	 * @generated
	 */
	EReference getListablePage_ListablepageStyle();

	/**
	 * Returns the meta object for class '{@link gcore.SelectablePage <em>Selectable Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selectable Page</em>'.
	 * @see gcore.SelectablePage
	 * @generated
	 */
	EClass getSelectablePage();

	/**
	 * Returns the meta object for the attribute '{@link gcore.SelectablePage#isMultiSelection <em>Multi Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi Selection</em>'.
	 * @see gcore.SelectablePage#isMultiSelection()
	 * @see #getSelectablePage()
	 * @generated
	 */
	EAttribute getSelectablePage_MultiSelection();

	/**
	 * Returns the meta object for the reference '{@link gcore.SelectablePage#getSelectablepageStyle <em>Selectablepage Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selectablepage Style</em>'.
	 * @see gcore.SelectablePage#getSelectablepageStyle()
	 * @see #getSelectablePage()
	 * @generated
	 */
	EReference getSelectablePage_SelectablepageStyle();

	/**
	 * Returns the meta object for class '{@link gcore.MenuablePage <em>Menuable Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menuable Page</em>'.
	 * @see gcore.MenuablePage
	 * @generated
	 */
	EClass getMenuablePage();

	/**
	 * Returns the meta object for the reference '{@link gcore.MenuablePage#getMenu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Menu</em>'.
	 * @see gcore.MenuablePage#getMenu()
	 * @see #getMenuablePage()
	 * @generated
	 */
	EReference getMenuablePage_Menu();

	/**
	 * Returns the meta object for class '{@link gcore.Menu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu</em>'.
	 * @see gcore.Menu
	 * @generated
	 */
	EClass getMenu();

	/**
	 * Returns the meta object for the reference '{@link gcore.Menu#getMenuStyle <em>Menu Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Menu Style</em>'.
	 * @see gcore.Menu#getMenuStyle()
	 * @see #getMenu()
	 * @generated
	 */
	EReference getMenu_MenuStyle();

	/**
	 * Returns the meta object for class '{@link gcore.StyleSetting <em>Style Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Style Setting</em>'.
	 * @see gcore.StyleSetting
	 * @generated
	 */
	EClass getStyleSetting();

	/**
	 * Returns the meta object for the containment reference list '{@link gcore.StyleSetting#getRgbColors <em>Rgb Colors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rgb Colors</em>'.
	 * @see gcore.StyleSetting#getRgbColors()
	 * @see #getStyleSetting()
	 * @generated
	 */
	EReference getStyleSetting_RgbColors();

	/**
	 * Returns the meta object for the containment reference '{@link gcore.StyleSetting#getMenuStyle <em>Menu Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Menu Style</em>'.
	 * @see gcore.StyleSetting#getMenuStyle()
	 * @see #getStyleSetting()
	 * @generated
	 */
	EReference getStyleSetting_MenuStyle();

	/**
	 * Returns the meta object for the containment reference '{@link gcore.StyleSetting#getSelectionStyle <em>Selection Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Selection Style</em>'.
	 * @see gcore.StyleSetting#getSelectionStyle()
	 * @see #getStyleSetting()
	 * @generated
	 */
	EReference getStyleSetting_SelectionStyle();

	/**
	 * Returns the meta object for the containment reference '{@link gcore.StyleSetting#getPageStyle <em>Page Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Page Style</em>'.
	 * @see gcore.StyleSetting#getPageStyle()
	 * @see #getStyleSetting()
	 * @generated
	 */
	EReference getStyleSetting_PageStyle();

	/**
	 * Returns the meta object for the reference '{@link gcore.StyleSetting#getFontColor <em>Font Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Font Color</em>'.
	 * @see gcore.StyleSetting#getFontColor()
	 * @see #getStyleSetting()
	 * @generated
	 */
	EReference getStyleSetting_FontColor();

	/**
	 * Returns the meta object for the reference '{@link gcore.StyleSetting#getBackColor <em>Back Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Back Color</em>'.
	 * @see gcore.StyleSetting#getBackColor()
	 * @see #getStyleSetting()
	 * @generated
	 */
	EReference getStyleSetting_BackColor();

	/**
	 * Returns the meta object for the containment reference '{@link gcore.StyleSetting#getListStyle <em>List Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List Style</em>'.
	 * @see gcore.StyleSetting#getListStyle()
	 * @see #getStyleSetting()
	 * @generated
	 */
	EReference getStyleSetting_ListStyle();

	/**
	 * Returns the meta object for class '{@link gcore.StylePageSettings <em>Style Page Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Style Page Settings</em>'.
	 * @see gcore.StylePageSettings
	 * @generated
	 */
	EClass getStylePageSettings();

	/**
	 * Returns the meta object for the attribute '{@link gcore.StylePageSettings#getImagePosition <em>Image Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Position</em>'.
	 * @see gcore.StylePageSettings#getImagePosition()
	 * @see #getStylePageSettings()
	 * @generated
	 */
	EAttribute getStylePageSettings_ImagePosition();

	/**
	 * Returns the meta object for the attribute '{@link gcore.StylePageSettings#getTextPosition <em>Text Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Position</em>'.
	 * @see gcore.StylePageSettings#getTextPosition()
	 * @see #getStylePageSettings()
	 * @generated
	 */
	EAttribute getStylePageSettings_TextPosition();

	/**
	 * Returns the meta object for the attribute '{@link gcore.StylePageSettings#getFrame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frame</em>'.
	 * @see gcore.StylePageSettings#getFrame()
	 * @see #getStylePageSettings()
	 * @generated
	 */
	EAttribute getStylePageSettings_Frame();

	/**
	 * Returns the meta object for the reference '{@link gcore.StylePageSettings#getFrameColor <em>Frame Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Frame Color</em>'.
	 * @see gcore.StylePageSettings#getFrameColor()
	 * @see #getStylePageSettings()
	 * @generated
	 */
	EReference getStylePageSettings_FrameColor();

	/**
	 * Returns the meta object for class '{@link gcore.StyleListSettings <em>Style List Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Style List Settings</em>'.
	 * @see gcore.StyleListSettings
	 * @generated
	 */
	EClass getStyleListSettings();

	/**
	 * Returns the meta object for the attribute '{@link gcore.StyleListSettings#isSeparatorShow <em>Separator Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Separator Show</em>'.
	 * @see gcore.StyleListSettings#isSeparatorShow()
	 * @see #getStyleListSettings()
	 * @generated
	 */
	EAttribute getStyleListSettings_SeparatorShow();

	/**
	 * Returns the meta object for the attribute '{@link gcore.StyleListSettings#getListStyle <em>List Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>List Style</em>'.
	 * @see gcore.StyleListSettings#getListStyle()
	 * @see #getStyleListSettings()
	 * @generated
	 */
	EAttribute getStyleListSettings_ListStyle();

	/**
	 * Returns the meta object for the reference '{@link gcore.StyleListSettings#getSeparatorColor <em>Separator Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Separator Color</em>'.
	 * @see gcore.StyleListSettings#getSeparatorColor()
	 * @see #getStyleListSettings()
	 * @generated
	 */
	EReference getStyleListSettings_SeparatorColor();

	/**
	 * Returns the meta object for class '{@link gcore.StyleMenuSettings <em>Style Menu Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Style Menu Settings</em>'.
	 * @see gcore.StyleMenuSettings
	 * @generated
	 */
	EClass getStyleMenuSettings();

	/**
	 * Returns the meta object for the attribute '{@link gcore.StyleMenuSettings#getMenuStyle <em>Menu Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Menu Style</em>'.
	 * @see gcore.StyleMenuSettings#getMenuStyle()
	 * @see #getStyleMenuSettings()
	 * @generated
	 */
	EAttribute getStyleMenuSettings_MenuStyle();

	/**
	 * Returns the meta object for the attribute '{@link gcore.StyleMenuSettings#isFixedMenu <em>Fixed Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed Menu</em>'.
	 * @see gcore.StyleMenuSettings#isFixedMenu()
	 * @see #getStyleMenuSettings()
	 * @generated
	 */
	EAttribute getStyleMenuSettings_FixedMenu();

	/**
	 * Returns the meta object for class '{@link gcore.StyleSelectionSettings <em>Style Selection Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Style Selection Settings</em>'.
	 * @see gcore.StyleSelectionSettings
	 * @generated
	 */
	EClass getStyleSelectionSettings();

	/**
	 * Returns the meta object for the reference '{@link gcore.StyleSelectionSettings#getSelectionColor <em>Selection Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selection Color</em>'.
	 * @see gcore.StyleSelectionSettings#getSelectionColor()
	 * @see #getStyleSelectionSettings()
	 * @generated
	 */
	EReference getStyleSelectionSettings_SelectionColor();

	/**
	 * Returns the meta object for class '{@link gcore.MapPage <em>Map Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Page</em>'.
	 * @see gcore.MapPage
	 * @generated
	 */
	EClass getMapPage();

	/**
	 * Returns the meta object for class '{@link gcore.MediaPage <em>Media Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Media Page</em>'.
	 * @see gcore.MediaPage
	 * @generated
	 */
	EClass getMediaPage();

	/**
	 * Returns the meta object for class '{@link gcore.ELearningPage <em>ELearning Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ELearning Page</em>'.
	 * @see gcore.ELearningPage
	 * @generated
	 */
	EClass getELearningPage();

	/**
	 * Returns the meta object for class '{@link gcore.TakePicturePage <em>Take Picture Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Take Picture Page</em>'.
	 * @see gcore.TakePicturePage
	 * @generated
	 */
	EClass getTakePicturePage();

	/**
	 * Returns the meta object for class '{@link gcore.RecordAudioPage <em>Record Audio Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record Audio Page</em>'.
	 * @see gcore.RecordAudioPage
	 * @generated
	 */
	EClass getRecordAudioPage();

	/**
	 * Returns the meta object for class '{@link gcore.ARPage <em>AR Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AR Page</em>'.
	 * @see gcore.ARPage
	 * @generated
	 */
	EClass getARPage();

	/**
	 * Returns the meta object for enum '{@link gcore.MenuStyle <em>Menu Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Menu Style</em>'.
	 * @see gcore.MenuStyle
	 * @generated
	 */
	EEnum getMenuStyle();

	/**
	 * Returns the meta object for enum '{@link gcore.ListStyle <em>List Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>List Style</em>'.
	 * @see gcore.ListStyle
	 * @generated
	 */
	EEnum getListStyle();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GcoreFactory getGcoreFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link gcore.impl.PageContainerImpl <em>Page Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gcore.impl.PageContainerImpl
		 * @see gcore.impl.GcorePackageImpl#getPageContainer()
		 * @generated
		 */
		EClass PAGE_CONTAINER = eINSTANCE.getPageContainer();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_CONTAINER__PAGES = eINSTANCE.getPageContainer_Pages();

		/**
		 * The meta object literal for the '<em><b>Menuable Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_CONTAINER__MENUABLE_PAGES = eINSTANCE.getPageContainer_MenuablePages();

		/**
		 * The meta object literal for the '<em><b>Menues</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_CONTAINER__MENUES = eINSTANCE.getPageContainer_Menues();

		/**
		 * The meta object literal for the '<em><b>Listable Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_CONTAINER__LISTABLE_PAGES = eINSTANCE.getPageContainer_ListablePages();

		/**
		 * The meta object literal for the '<em><b>Style Settings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_CONTAINER__STYLE_SETTINGS = eINSTANCE.getPageContainer_StyleSettings();

		/**
		 * The meta object literal for the '<em><b>Selectable Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_CONTAINER__SELECTABLE_PAGES = eINSTANCE.getPageContainer_SelectablePages();

		/**
		 * The meta object literal for the '{@link gcore.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gcore.impl.PageImpl
		 * @see gcore.impl.GcorePackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Page Style</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__PAGE_STYLE = eINSTANCE.getPage_PageStyle();

		/**
		 * The meta object literal for the '{@link gcore.impl.RGBColorImpl <em>RGB Color</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gcore.impl.RGBColorImpl
		 * @see gcore.impl.GcorePackageImpl#getRGBColor()
		 * @generated
		 */
		EClass RGB_COLOR = eINSTANCE.getRGBColor();

		/**
		 * The meta object literal for the '<em><b>Blue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RGB_COLOR__BLUE = eINSTANCE.getRGBColor_Blue();

		/**
		 * The meta object literal for the '<em><b>Red</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RGB_COLOR__RED = eINSTANCE.getRGBColor_Red();

		/**
		 * The meta object literal for the '<em><b>Green</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RGB_COLOR__GREEN = eINSTANCE.getRGBColor_Green();

		/**
		 * The meta object literal for the '{@link gcore.impl.EditPageImpl <em>Edit Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gcore.impl.EditPageImpl
		 * @see gcore.impl.GcorePackageImpl#getEditPage()
		 * @generated
		 */
		EClass EDIT_PAGE = eINSTANCE.getEditPage();

		/**
		 * The meta object literal for the '{@link gcore.impl.ListPageImpl <em>List Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gcore.impl.ListPageImpl
		 * @see gcore.impl.GcorePackageImpl#getListPage()
		 * @generated
		 */
		EClass LIST_PAGE = eINSTANCE.getListPage();

		/**
		 * The meta object literal for the '{@link gcore.impl.ViewPageImpl <em>View Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gcore.impl.ViewPageImpl
		 * @see gcore.impl.GcorePackageImpl#getViewPage()
		 * @generated
		 */
		EClass VIEW_PAGE = eINSTANCE.getViewPage();

		/**
		 * The meta object literal for the '{@link gcore.impl.CustomPageImpl <em>Custom Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gcore.impl.CustomPageImpl
		 * @see gcore.impl.GcorePackageImpl#getCustomPage()
		 * @generated
		 */
		EClass CUSTOM_PAGE = eINSTANCE.getCustomPage();

		/**
		 * The meta object literal for the '{@link gcore.impl.LoginPageImpl <em>Login Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gcore.impl.LoginPageImpl
		 * @see gcore.impl.GcorePackageImpl#getLoginPage()
		 * @generated
		 */
		EClass LOGIN_PAGE = eINSTANCE.getLoginPage();

		/**
		 * The meta object literal for the '{@link gcore.impl.ProcessSelectorPageImpl <em>Process Selector Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gcore.impl.ProcessSelectorPageImpl
		 * @see gcore.impl.GcorePackageImpl#getProcessSelectorPage()
		 * @generated
		 */
		EClass PROCESS_SELECTOR_PAGE = eINSTANCE.getProcessSelectorPage();

		/**
		 * The meta object literal for the '{@link gcore.impl.SelectableListPageImpl <em>Selectable List Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gcore.impl.SelectableListPageImpl
		 * @see gcore.impl.GcorePackageImpl#getSelectableListPage()
		 * @generated
		 */
		EClass SELECTABLE_LIST_PAGE = eINSTANCE.getSelectableListPage();

		/**
		 * The meta object literal for the '{@link gcore.impl.ListablePageImpl <em>Listable Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gcore.impl.ListablePageImpl
		 * @see gcore.impl.GcorePackageImpl#getListablePage()
		 * @generated
		 */
		EClass LISTABLE_PAGE = eINSTANCE.getListablePage();

		/**
		 * The meta object literal for the '<em><b>Listablepage Style</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LISTABLE_PAGE__LISTABLEPAGE_STYLE = eINSTANCE.getListablePage_ListablepageStyle();

		/**
		 * The meta object literal for the '{@link gcore.impl.SelectablePageImpl <em>Selectable Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gcore.impl.SelectablePageImpl
		 * @see gcore.impl.GcorePackageImpl#getSelectablePage()
		 * @generated
		 */
		EClass SELECTABLE_PAGE = eINSTANCE.getSelectablePage();

		/**
		 * The meta object literal for the '<em><b>Multi Selection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTABLE_PAGE__MULTI_SELECTION = eINSTANCE.getSelectablePage_MultiSelection();

		/**
		 * The meta object literal for the '<em><b>Selectablepage Style</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTABLE_PAGE__SELECTABLEPAGE_STYLE = eINSTANCE.getSelectablePage_SelectablepageStyle();

		/**
		 * The meta object literal for the '{@link gcore.impl.MenuablePageImpl <em>Menuable Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gcore.impl.MenuablePageImpl
		 * @see gcore.impl.GcorePackageImpl#getMenuablePage()
		 * @generated
		 */
		EClass MENUABLE_PAGE = eINSTANCE.getMenuablePage();

		/**
		 * The meta object literal for the '<em><b>Menu</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENUABLE_PAGE__MENU = eINSTANCE.getMenuablePage_Menu();

		/**
		 * The meta object literal for the '{@link gcore.impl.MenuImpl <em>Menu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gcore.impl.MenuImpl
		 * @see gcore.impl.GcorePackageImpl#getMenu()
		 * @generated
		 */
		EClass MENU = eINSTANCE.getMenu();

		/**
		 * The meta object literal for the '<em><b>Menu Style</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU__MENU_STYLE = eINSTANCE.getMenu_MenuStyle();

		/**
		 * The meta object literal for the '{@link gcore.impl.StyleSettingImpl <em>Style Setting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gcore.impl.StyleSettingImpl
		 * @see gcore.impl.GcorePackageImpl#getStyleSetting()
		 * @generated
		 */
		EClass STYLE_SETTING = eINSTANCE.getStyleSetting();

		/**
		 * The meta object literal for the '<em><b>Rgb Colors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE_SETTING__RGB_COLORS = eINSTANCE.getStyleSetting_RgbColors();

		/**
		 * The meta object literal for the '<em><b>Menu Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE_SETTING__MENU_STYLE = eINSTANCE.getStyleSetting_MenuStyle();

		/**
		 * The meta object literal for the '<em><b>Selection Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE_SETTING__SELECTION_STYLE = eINSTANCE.getStyleSetting_SelectionStyle();

		/**
		 * The meta object literal for the '<em><b>Page Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE_SETTING__PAGE_STYLE = eINSTANCE.getStyleSetting_PageStyle();

		/**
		 * The meta object literal for the '<em><b>Font Color</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE_SETTING__FONT_COLOR = eINSTANCE.getStyleSetting_FontColor();

		/**
		 * The meta object literal for the '<em><b>Back Color</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE_SETTING__BACK_COLOR = eINSTANCE.getStyleSetting_BackColor();

		/**
		 * The meta object literal for the '<em><b>List Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE_SETTING__LIST_STYLE = eINSTANCE.getStyleSetting_ListStyle();

		/**
		 * The meta object literal for the '{@link gcore.impl.StylePageSettingsImpl <em>Style Page Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gcore.impl.StylePageSettingsImpl
		 * @see gcore.impl.GcorePackageImpl#getStylePageSettings()
		 * @generated
		 */
		EClass STYLE_PAGE_SETTINGS = eINSTANCE.getStylePageSettings();

		/**
		 * The meta object literal for the '<em><b>Image Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE_PAGE_SETTINGS__IMAGE_POSITION = eINSTANCE.getStylePageSettings_ImagePosition();

		/**
		 * The meta object literal for the '<em><b>Text Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE_PAGE_SETTINGS__TEXT_POSITION = eINSTANCE.getStylePageSettings_TextPosition();

		/**
		 * The meta object literal for the '<em><b>Frame</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE_PAGE_SETTINGS__FRAME = eINSTANCE.getStylePageSettings_Frame();

		/**
		 * The meta object literal for the '<em><b>Frame Color</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE_PAGE_SETTINGS__FRAME_COLOR = eINSTANCE.getStylePageSettings_FrameColor();

		/**
		 * The meta object literal for the '{@link gcore.impl.StyleListSettingsImpl <em>Style List Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gcore.impl.StyleListSettingsImpl
		 * @see gcore.impl.GcorePackageImpl#getStyleListSettings()
		 * @generated
		 */
		EClass STYLE_LIST_SETTINGS = eINSTANCE.getStyleListSettings();

		/**
		 * The meta object literal for the '<em><b>Separator Show</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE_LIST_SETTINGS__SEPARATOR_SHOW = eINSTANCE.getStyleListSettings_SeparatorShow();

		/**
		 * The meta object literal for the '<em><b>List Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE_LIST_SETTINGS__LIST_STYLE = eINSTANCE.getStyleListSettings_ListStyle();

		/**
		 * The meta object literal for the '<em><b>Separator Color</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE_LIST_SETTINGS__SEPARATOR_COLOR = eINSTANCE.getStyleListSettings_SeparatorColor();

		/**
		 * The meta object literal for the '{@link gcore.impl.StyleMenuSettingsImpl <em>Style Menu Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gcore.impl.StyleMenuSettingsImpl
		 * @see gcore.impl.GcorePackageImpl#getStyleMenuSettings()
		 * @generated
		 */
		EClass STYLE_MENU_SETTINGS = eINSTANCE.getStyleMenuSettings();

		/**
		 * The meta object literal for the '<em><b>Menu Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE_MENU_SETTINGS__MENU_STYLE = eINSTANCE.getStyleMenuSettings_MenuStyle();

		/**
		 * The meta object literal for the '<em><b>Fixed Menu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE_MENU_SETTINGS__FIXED_MENU = eINSTANCE.getStyleMenuSettings_FixedMenu();

		/**
		 * The meta object literal for the '{@link gcore.impl.StyleSelectionSettingsImpl <em>Style Selection Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gcore.impl.StyleSelectionSettingsImpl
		 * @see gcore.impl.GcorePackageImpl#getStyleSelectionSettings()
		 * @generated
		 */
		EClass STYLE_SELECTION_SETTINGS = eINSTANCE.getStyleSelectionSettings();

		/**
		 * The meta object literal for the '<em><b>Selection Color</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE_SELECTION_SETTINGS__SELECTION_COLOR = eINSTANCE.getStyleSelectionSettings_SelectionColor();

		/**
		 * The meta object literal for the '{@link gcore.impl.MapPageImpl <em>Map Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gcore.impl.MapPageImpl
		 * @see gcore.impl.GcorePackageImpl#getMapPage()
		 * @generated
		 */
		EClass MAP_PAGE = eINSTANCE.getMapPage();

		/**
		 * The meta object literal for the '{@link gcore.impl.MediaPageImpl <em>Media Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gcore.impl.MediaPageImpl
		 * @see gcore.impl.GcorePackageImpl#getMediaPage()
		 * @generated
		 */
		EClass MEDIA_PAGE = eINSTANCE.getMediaPage();

		/**
		 * The meta object literal for the '{@link gcore.impl.ELearningPageImpl <em>ELearning Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gcore.impl.ELearningPageImpl
		 * @see gcore.impl.GcorePackageImpl#getELearningPage()
		 * @generated
		 */
		EClass ELEARNING_PAGE = eINSTANCE.getELearningPage();

		/**
		 * The meta object literal for the '{@link gcore.impl.TakePicturePageImpl <em>Take Picture Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gcore.impl.TakePicturePageImpl
		 * @see gcore.impl.GcorePackageImpl#getTakePicturePage()
		 * @generated
		 */
		EClass TAKE_PICTURE_PAGE = eINSTANCE.getTakePicturePage();

		/**
		 * The meta object literal for the '{@link gcore.impl.RecordAudioPageImpl <em>Record Audio Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gcore.impl.RecordAudioPageImpl
		 * @see gcore.impl.GcorePackageImpl#getRecordAudioPage()
		 * @generated
		 */
		EClass RECORD_AUDIO_PAGE = eINSTANCE.getRecordAudioPage();

		/**
		 * The meta object literal for the '{@link gcore.impl.ARPageImpl <em>AR Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gcore.impl.ARPageImpl
		 * @see gcore.impl.GcorePackageImpl#getARPage()
		 * @generated
		 */
		EClass AR_PAGE = eINSTANCE.getARPage();

		/**
		 * The meta object literal for the '{@link gcore.MenuStyle <em>Menu Style</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gcore.MenuStyle
		 * @see gcore.impl.GcorePackageImpl#getMenuStyle()
		 * @generated
		 */
		EEnum MENU_STYLE = eINSTANCE.getMenuStyle();

		/**
		 * The meta object literal for the '{@link gcore.ListStyle <em>List Style</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gcore.ListStyle
		 * @see gcore.impl.GcorePackageImpl#getListStyle()
		 * @generated
		 */
		EEnum LIST_STYLE = eINSTANCE.getListStyle();

	}

} //GcorePackage
