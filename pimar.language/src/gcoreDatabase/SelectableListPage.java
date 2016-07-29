/**
 */
package gcoreDatabase;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selectable List Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gcoreDatabase.SelectableListPage#getListablepageStyle <em>Listablepage Style</em>}</li>
 *   <li>{@link gcoreDatabase.SelectableListPage#getSelectablepageStyle <em>Selectablepage Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see gcoreDatabase.GcoreDatabasePackage#getSelectableListPage()
 * @model
 * @generated
 */
public interface SelectableListPage extends Page, SelectablePage, ListablePage {
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
	 * @see gcoreDatabase.GcoreDatabasePackage#getSelectableListPage_ListablepageStyle()
	 * @model required="true"
	 * @generated
	 */
	StyleListSettings getListablepageStyle();

	/**
	 * Sets the value of the '{@link gcoreDatabase.SelectableListPage#getListablepageStyle <em>Listablepage Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Listablepage Style</em>' reference.
	 * @see #getListablepageStyle()
	 * @generated
	 */
	void setListablepageStyle(StyleListSettings value);

	/**
	 * Returns the value of the '<em><b>Selectablepage Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selectablepage Style</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selectablepage Style</em>' reference.
	 * @see #setSelectablepageStyle(StyleSelectionSettings)
	 * @see gcoreDatabase.GcoreDatabasePackage#getSelectableListPage_SelectablepageStyle()
	 * @model required="true"
	 * @generated
	 */
	StyleSelectionSettings getSelectablepageStyle();

	/**
	 * Sets the value of the '{@link gcoreDatabase.SelectableListPage#getSelectablepageStyle <em>Selectablepage Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selectablepage Style</em>' reference.
	 * @see #getSelectablepageStyle()
	 * @generated
	 */
	void setSelectablepageStyle(StyleSelectionSettings value);

} // SelectableListPage
