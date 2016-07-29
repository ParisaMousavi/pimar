/**
 */
package wcore;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.ENamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link wcore.Task#getPermissions <em>Permissions</em>}</li>
 * </ul>
 * </p>
 *
 * @see wcore.WcorePackage#getTask()
 * @model abstract="true"
 * @generated
 */
public interface Task extends ENamedElement {
	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' containment reference list.
	 * The list contents are of type {@link wcore.Permission}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permissions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions</em>' containment reference list.
	 * @see wcore.WcorePackage#getTask_Permissions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Permission> getPermissions();

} // Task
