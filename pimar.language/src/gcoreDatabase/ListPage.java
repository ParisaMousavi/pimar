/**
 */
package gcoreDatabase;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gcoreDatabase.ListPage#getMenu <em>Menu</em>}</li>
 *   <li>{@link gcoreDatabase.ListPage#getListablepageStyle <em>Listablepage Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see gcoreDatabase.GcoreDatabasePackage#getListPage()
 * @model
 * @generated
 */
public interface ListPage extends Page, ListablePage, MenuablePage {
	/**
	 * Returns the value of the '<em><b>Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menu</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menu</em>' reference.
	 * @see #setMenu(Menu)
	 * @see gcoreDatabase.GcoreDatabasePackage#getListPage_Menu()
	 * @model
	 * @generated
	 */
	Menu getMenu();

	/**
	 * Sets the value of the '{@link gcoreDatabase.ListPage#getMenu <em>Menu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Menu</em>' reference.
	 * @see #getMenu()
	 * @generated
	 */
	void setMenu(Menu value);

	/**
	 * Returns the value of the '<em><b>Listablepage Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Listablepage Style</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listablepage Style</em>' reference.
	 * @see #setListablepageStyle(StyleListSettings)
	 * @see gcoreDatabase.GcoreDatabasePackage#getListPage_ListablepageStyle()
	 * @model required="true"
	 * @generated
	 */
	StyleListSettings getListablepageStyle();

	/**
	 * Sets the value of the '{@link gcoreDatabase.ListPage#getListablepageStyle <em>Listablepage Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Listablepage Style</em>' reference.
	 * @see #getListablepageStyle()
	 * @generated
	 */
	void setListablepageStyle(StyleListSettings value);

} // ListPage
