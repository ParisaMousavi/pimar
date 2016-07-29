/**
 */
package gcoreDatabase;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gcoreDatabase.PageContainer#getPages <em>Pages</em>}</li>
 *   <li>{@link gcoreDatabase.PageContainer#getMenuablePages <em>Menuable Pages</em>}</li>
 *   <li>{@link gcoreDatabase.PageContainer#getMenues <em>Menues</em>}</li>
 *   <li>{@link gcoreDatabase.PageContainer#getListablePages <em>Listable Pages</em>}</li>
 *   <li>{@link gcoreDatabase.PageContainer#getStyleSettings <em>Style Settings</em>}</li>
 *   <li>{@link gcoreDatabase.PageContainer#getSelectablePages <em>Selectable Pages</em>}</li>
 * </ul>
 * </p>
 *
 * @see gcoreDatabase.GcoreDatabasePackage#getPageContainer()
 * @model
 * @generated
 */
public interface PageContainer extends EPackage {
	/**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
	 * The list contents are of type {@link gcoreDatabase.Page}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' containment reference list.
	 * @see gcoreDatabase.GcoreDatabasePackage#getPageContainer_Pages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Page> getPages();

	/**
	 * Returns the value of the '<em><b>Menuable Pages</b></em>' containment reference list.
	 * The list contents are of type {@link gcoreDatabase.MenuablePage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menuable Pages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menuable Pages</em>' containment reference list.
	 * @see gcoreDatabase.GcoreDatabasePackage#getPageContainer_MenuablePages()
	 * @model containment="true"
	 * @generated
	 */
	EList<MenuablePage> getMenuablePages();

	/**
	 * Returns the value of the '<em><b>Menues</b></em>' containment reference list.
	 * The list contents are of type {@link gcoreDatabase.Menu}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menues</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menues</em>' containment reference list.
	 * @see gcoreDatabase.GcoreDatabasePackage#getPageContainer_Menues()
	 * @model containment="true"
	 * @generated
	 */
	EList<Menu> getMenues();

	/**
	 * Returns the value of the '<em><b>Listable Pages</b></em>' containment reference list.
	 * The list contents are of type {@link gcoreDatabase.ListablePage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Listable Pages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listable Pages</em>' containment reference list.
	 * @see gcoreDatabase.GcoreDatabasePackage#getPageContainer_ListablePages()
	 * @model containment="true"
	 * @generated
	 */
	EList<ListablePage> getListablePages();

	/**
	 * Returns the value of the '<em><b>Style Settings</b></em>' containment reference list.
	 * The list contents are of type {@link gcoreDatabase.StyleSetting}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Settings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Settings</em>' containment reference list.
	 * @see gcoreDatabase.GcoreDatabasePackage#getPageContainer_StyleSettings()
	 * @model containment="true"
	 * @generated
	 */
	EList<StyleSetting> getStyleSettings();

	/**
	 * Returns the value of the '<em><b>Selectable Pages</b></em>' containment reference list.
	 * The list contents are of type {@link gcoreDatabase.SelectablePage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selectable Pages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selectable Pages</em>' containment reference list.
	 * @see gcoreDatabase.GcoreDatabasePackage#getPageContainer_SelectablePages()
	 * @model containment="true"
	 * @generated
	 */
	EList<SelectablePage> getSelectablePages();

} // PageContainer
