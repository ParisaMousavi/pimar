/**
 */
package wcore;

import gcore.Page;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invoke GUI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link wcore.InvokeGUI#getOutputAction <em>Output Action</em>}</li>
 *   <li>{@link wcore.InvokeGUI#getOutputData <em>Output Data</em>}</li>
 *   <li>{@link wcore.InvokeGUI#getInput <em>Input</em>}</li>
 *   <li>{@link wcore.InvokeGUI#getPage <em>Page</em>}</li>
 * </ul>
 * </p>
 *
 * @see wcore.WcorePackage#getInvokeGUI()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='MapPageOutput LoginPageOutput LoginPageInput ViewPageOutput EditPage SelectableListPageOutput SelectablePageInput'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL MapPageOutput='self.page.oclIsTypeOf(gcore::MapPage) implies self.outputData -> size() = 2 and self.outputData -> forAll(var:Variable|var.eType=ecore::EDouble)' LoginPageOutput='self.page.oclIsTypeOf(gcore::LoginPage) implies self.outputData -> size() = 1 and self.outputData -> forAll(var:Variable|var.eType=ecore::EBoolean)' LoginPageInput='self.page.oclIsTypeOf(gcore::LoginPage) implies self.input -> size() = 2 and self.input -> forAll(var:Variable|var.eType=ecore::EString)' ViewPageOutput='self.page.oclIsTypeOf(gcore::ViewPage) implies self.outputData -> size() = 1 and self.outputData -> forAll(var:Variable|var.eType.oclIsKindOf(ecore::EObject))' EditPage='self.page.oclIsTypeOf(gcore::EditPage) implies self.outputData -> size() = 1 and self.input -> size() = 1 and self.input -> forAll(var:Variable|var.eType=self.outputData -> at(1).eType)' SelectableListPageOutput='self.page.oclIsTypeOf(gcore::SelectableListPage) or self.page.oclIsTypeOf(gcore::ListPage) implies self.outputData -> size() = 1 and self.outputData -> forAll(var:Variable|var.upperBound=-1)' SelectablePageInput='self.page.oclIsTypeOf(gcore::SelectableListPage) implies self.input -> size() = 1 and self.input -> forAll(var:Variable|var.eType=self.outputData -> at(1).eType and var.upperBound=1)'"
 * @generated
 */
public interface InvokeGUI extends Task {
	/**
	 * Returns the value of the '<em><b>Output Action</b></em>' reference list.
	 * The list contents are of type {@link wcore.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Action</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Action</em>' reference list.
	 * @see wcore.WcorePackage#getInvokeGUI_OutputAction()
	 * @model derived="true"
	 * @generated
	 */
	EList<Variable> getOutputAction();

	/**
	 * Returns the value of the '<em><b>Output Data</b></em>' reference list.
	 * The list contents are of type {@link wcore.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Data</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Data</em>' reference list.
	 * @see wcore.WcorePackage#getInvokeGUI_OutputData()
	 * @model
	 * @generated
	 */
	EList<Variable> getOutputData();

	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference list.
	 * The list contents are of type {@link wcore.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference list.
	 * @see wcore.WcorePackage#getInvokeGUI_Input()
	 * @model
	 * @generated
	 */
	EList<Variable> getInput();

	/**
	 * Returns the value of the '<em><b>Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page</em>' reference.
	 * @see #setPage(Page)
	 * @see wcore.WcorePackage#getInvokeGUI_Page()
	 * @model required="true"
	 * @generated
	 */
	Page getPage();

	/**
	 * Sets the value of the '{@link wcore.InvokeGUI#getPage <em>Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page</em>' reference.
	 * @see #getPage()
	 * @generated
	 */
	void setPage(Page value);

} // InvokeGUI
