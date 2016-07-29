/**
 */
package wcoreExtended;

import org.eclipse.emf.common.util.EList;

import wcore.Task;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link wcoreExtended.Process#getRefsTrue <em>Refs True</em>}</li>
 *   <li>{@link wcoreExtended.Process#getRefsFalse <em>Refs False</em>}</li>
 *   <li>{@link wcoreExtended.Process#getAllTasks <em>All Tasks</em>}</li>
 * </ul>
 * </p>
 *
 * @see wcoreExtended.WcoreExtendedPackage#getProcess()
 * @model
 * @generated
 */
public interface Process extends wcore.Process {
	/**
	 * Returns the value of the '<em><b>Refs True</b></em>' containment reference list.
	 * The list contents are of type {@link wcoreExtended.RefTrue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refs True</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refs True</em>' containment reference list.
	 * @see wcoreExtended.WcoreExtendedPackage#getProcess_RefsTrue()
	 * @model containment="true"
	 * @generated
	 */
	EList<RefTrue> getRefsTrue();

	/**
	 * Returns the value of the '<em><b>Refs False</b></em>' containment reference list.
	 * The list contents are of type {@link wcoreExtended.RefFalse}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refs False</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refs False</em>' containment reference list.
	 * @see wcoreExtended.WcoreExtendedPackage#getProcess_RefsFalse()
	 * @model containment="true"
	 * @generated
	 */
	EList<RefFalse> getRefsFalse();

	/**
	 * Returns the value of the '<em><b>All Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link wcore.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Tasks</em>' containment reference list.
	 * @see wcoreExtended.WcoreExtendedPackage#getProcess_AllTasks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Task> getAllTasks();

} // Process
