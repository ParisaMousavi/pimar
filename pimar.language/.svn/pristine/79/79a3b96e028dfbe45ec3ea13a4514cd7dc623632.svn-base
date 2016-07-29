/**
 */
package wcoreDatabase;

import gcoreDatabase.Page;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link wcoreDatabase.ProcessSelector#getPage <em>Page</em>}</li>
 *   <li>{@link wcoreDatabase.ProcessSelector#getProcesses <em>Processes</em>}</li>
 * </ul>
 * </p>
 *
 * @see wcoreDatabase.WcoreDatabasePackage#getProcessSelector()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='oneGUITaskInAllSubProcesses'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL oneGUITaskInAllSubProcesses='self.oclAsType(wcore::ProcessSelector).processes -> select(proc:wcore::Process|containInvokeGUITask(proc.startTask.oclAsType(wcore::Task))) -> size() = (self.oclAsType(wcore::ProcessSelector).processes -> size())'"
 * @generated
 */
public interface ProcessSelector extends Task {
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
	 * @see wcoreDatabase.WcoreDatabasePackage#getProcessSelector_Page()
	 * @model required="true"
	 * @generated
	 */
	Page getPage();

	/**
	 * Sets the value of the '{@link wcoreDatabase.ProcessSelector#getPage <em>Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page</em>' reference.
	 * @see #getPage()
	 * @generated
	 */
	void setPage(Page value);

	/**
	 * Returns the value of the '<em><b>Processes</b></em>' reference list.
	 * The list contents are of type {@link wcoreDatabase.Process}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processes</em>' reference list.
	 * @see wcoreDatabase.WcoreDatabasePackage#getProcessSelector_Processes()
	 * @model required="true"
	 * @generated
	 */
	EList<wcoreDatabase.Process> getProcesses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if (t.oclIsTypeOf(wcore::If)) then containInvokeGUITask(t.oclAsType(wcore::If)._body.oclAsType(wcore::Task)) else\r\nif (t.oclIsTypeOf(wcore::While)) then containInvokeGUITask(t.oclAsType(wcore::While)._body.oclAsType(wcore::Task)) else\r\nif (t.oclIsTypeOf(wcore::IfElse)) then containInvokeGUITask(t.oclAsType(wcore::IfElse)._body.oclAsType(wcore::Task)) or containInvokeGUITask(t.oclAsType\r\r\n(wcore::IfElse)._elseBody.oclAsType(wcore::Task)) else\r\nif (t.oclIsTypeOf(wcore::Sequence)) then containInvokeGUITask(t.oclAsType(wcore::Sequence)._body.oclAsType(wcore::Task)) or containInvokeGUITask(t.oclAsType\r\r\n(wcore::Sequence).follower.oclAsType(wcore::Task)) else\r\nif (t.oclIsTypeOf(wcore::InvokeProcess)) then containInvokeGUITask(t.oclAsType(wcore::InvokeProcess).subProcess.startTask.oclAsType(wcore::Task)) else\r\nif (t.oclIsTypeOf(wcore::ProcessSelector)) then t.oclAsType(wcore::ProcessSelector).processes -> select(proc:wcore::Process|containInvokeGUITask\r\r\n(proc.startTask.oclAsType(wcore::Task))) -> size() = (t.oclAsType(wcore::ProcessSelector).processes -> size()) else\r\nt.oclIsTypeOf(wcore::InvokeGUI) or t.oclIsTypeOf(wcore::CrudGui)\r\nendif endif endif endif endif endif'"
	 * @generated
	 */
	boolean containInvokeGUITask(Task t);

} // ProcessSelector
