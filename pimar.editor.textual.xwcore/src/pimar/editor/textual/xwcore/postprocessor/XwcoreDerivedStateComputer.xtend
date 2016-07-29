package pimar.editor.textual.xwcore.postprocessor

import org.eclipse.xtext.resource.IDerivedStateComputer
import org.eclipse.xtext.resource.DerivedStateAwareResource
import wcore.Sequence
import wcore.Create
import wcore.InvokeOperation
import wcore.Assign
import wcore.InvokeProcess
import wcore.InvokeGUI
import wcore.If
import wcore.IfElse
import wcore.While
import wcore.CrudGui
import wcore.Delete
import wcore.Read
import wcore.ProcessSelector
import wcore.Permission

class XwcoreDerivedStateComputer implements IDerivedStateComputer {



	override discardDerivedState(DerivedStateAwareResource resource) {
		//resource.allContents.filter(typeof(Sequence)).forEach[name = ""]
	}

	override installDerivedState(DerivedStateAwareResource resource, boolean preLinkingPhase) {
		
		var varAssign = 0
		var varCreate = 0
		var varCrudGui = 0
		var varDelete = 0
		var varIf = 0
		var varIfElse = 0
		var varInvokeGui = 0
		var varInvokeOperation = 0
		var varInvokeProcess = 0
		var varProcessSelector = 0
		var varRead = 0
		var varSequence = 0
		var varWhile = 0
		var varPermission = 0
		
		for (eobj : resource.allContents.toIterable) {

			if (eobj instanceof Sequence) {
				var objSequence = eobj as Sequence
				if (objSequence.name == null) {
					objSequence.name = "seq_" + varSequence
					varSequence = varSequence + 1
				}
			}

			if (eobj instanceof Create) {
				var objCreate = eobj as Create
				if (objCreate.name == null) {
					objCreate.name = "create_" + varCreate
					varCreate = varCreate + 1
				}
			}

			if (eobj instanceof InvokeOperation) {
				var objInvokeOperation = eobj as InvokeOperation
				if (objInvokeOperation.name == null) {
					objInvokeOperation.name = "invokeope_" + varInvokeOperation
					varInvokeOperation = varInvokeOperation + 1
				}
			}

			if (eobj instanceof Assign) {
				var objAssign = eobj as Assign
				if (objAssign.name == null) {
					objAssign.name = "assign_" + varAssign
					varAssign = varAssign + 1
				}
			}

			if (eobj instanceof InvokeProcess) {
				var objInvokeProcess = eobj as InvokeProcess
				if (objInvokeProcess.name == null) {
					objInvokeProcess.name = "invokeProc_" + varInvokeProcess
					varInvokeProcess = varInvokeProcess + 1
				}
			}

			if (eobj instanceof If) {
				var objIf = eobj as If
				if (objIf.name == null) {
					objIf.name = "if_" + varIf
					varIf = varIf + 1
				}
			}

			if (eobj instanceof IfElse) {
				var objIfElse = eobj as IfElse
				if (objIfElse.name == null) {
					objIfElse.name = "ifelse_" + varIfElse
					varIfElse = varIfElse + 1
				}
			}

			if (eobj instanceof While) {
				var objWhile = eobj as While
				if (objWhile.name == null) {
					objWhile.name = "while_" + varWhile
					varWhile = varWhile + 1
				}
			}

			if (eobj instanceof CrudGui) {
				var objCrudGui = eobj as CrudGui
				if (objCrudGui.name == null) {
					objCrudGui.name = "crudgui_" + varCrudGui
					varCrudGui = varCrudGui + 1
				}
			}

			if (eobj instanceof Delete) {
				var objDelete = eobj as Delete
				if (objDelete.name == null) {
					objDelete.name = "delete_" + varDelete
					varDelete = varDelete + 1
				}
			}

			if (eobj instanceof Read) {
				var objRead = eobj as Read
				if (objRead.name == null) {
					objRead.name = "read_" + varRead
					varRead = varRead + 1
				}
			}

			if (eobj instanceof ProcessSelector) {
				var objProcessSelector = eobj as ProcessSelector
				if (objProcessSelector.name == null) {
					objProcessSelector.name = "processselector_" + varProcessSelector
					varProcessSelector = varProcessSelector + 1
				}
			}

			if (eobj instanceof Permission) {
				var objPermission = eobj as Permission
				if (objPermission.name == null) {
					objPermission.name = "permission_" + varPermission
					varPermission = varPermission + 1
				}
			}

			if (eobj instanceof InvokeGUI) {
				var objInvokeGUI = eobj as InvokeGUI
				if (objInvokeGUI.name == null) {
					objInvokeGUI.name = "InvokeGUI_" + varInvokeGui
					varInvokeGui = varInvokeGui + 1
				}
			}
		}

	}
}
