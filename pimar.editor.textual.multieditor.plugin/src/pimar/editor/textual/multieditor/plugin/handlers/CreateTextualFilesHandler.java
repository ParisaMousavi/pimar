package pimar.editor.textual.multieditor.plugin.handlers;

import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.wizards.IWizardDescriptor;

import pimar.editor.textual.multieditor.plugin.wizards.PimarNewTextualEditorWizard;

/**
 * for handling the creation of textual editor file from toolbar
 * 
 * @modified 24042016
 * @author Parisa
 *
 */
public class CreateTextualFilesHandler extends AbstractHandler {


	/**
	 * opening the wizard directly without using wizard Id to set
	 * the container text if the StructureSelection has a value or a structure
	 * is selected
	 * @modified 24042016
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		IWorkbenchWindow window = HandlerUtil
				.getActiveWorkbenchWindowChecked(event);
		ISelectionService service = window.getSelectionService();
		
		
		PimarNewTextualEditorWizard iWizard = new PimarNewTextualEditorWizard();
		iWizard.setSelection(((IStructuredSelection) service.getSelection()));
		
		WizardDialog dialog = new WizardDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), iWizard);
	    dialog.open();
		
		return null;
	}

}
