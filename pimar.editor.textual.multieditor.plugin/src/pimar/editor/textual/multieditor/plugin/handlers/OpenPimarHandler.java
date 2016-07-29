package pimar.editor.textual.multieditor.plugin.handlers;

import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.MultiEditorInput;

import pimar.editor.textual.multieditor.plugin.editors.PimarTextualMultiEditor;

public class OpenPimarHandler extends AbstractHandler {

	/**
	 * the editorinputs which are used in multieditor
	 * 
	 * @serial 05042016
	 */
	private IEditorInput[] editorInputs = new IEditorInput[pimar.editor.textual.multieditor.plugin.util.PimarUtil.COUNT_OF_REQUIRED_FILES];

	/**
	 * 
	 * @serial 06042016
	 */
	private IEditorPart textualMultiEditor;

	/**
	 * iterating through the resource to check the existence of xcore, xgcore
	 * and xwcore for opening the multieditor
	 * 
	 * @serialData 05042016
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {

		
		
		IWorkbenchWindow window = HandlerUtil
				.getActiveWorkbenchWindowChecked(event);
		ISelectionService service = window.getSelectionService();
		List<IResource> selection = ((IStructuredSelection) service
				.getSelection()).toList();
		IFolder folder = (IFolder) selection.get(0);
		try {
			for (IResource iresource : folder.members()) {

				if (iresource instanceof IFile) {
					IFile file = (IFile) iresource;

					if (file.getFileExtension().equals("xcore")) {
						editorInputs[0] = new FileEditorInput((IFile) file);
						//System.out.println("0 : " + editorInputs[0].getName());

					}
					if (file.getFileExtension().equals("xgcore")) {
						editorInputs[1] = new FileEditorInput((IFile) file);
						//System.out.println("1 : " + editorInputs[1].getName());

					}
					if (file.getFileExtension().equals("xwcore")) {
						editorInputs[2] = new FileEditorInput((IFile) file);
						//System.out.println("2 : " + editorInputs[2].getName());
					}
				}
			}

		} catch (CoreException e) {
			System.err.println(":O OpenPimarHandler.CoreException: "
					+ e.getMessage());
		}
		try {
			/*
			 * create MultiEditorInput with editor Ids which are gained from
			 * default editors of workbench
			 */
			String[] innerEditorIds = pimar.editor.textual.multieditor.plugin.util.PimarUtil
					.getInnerEditorIDs(editorInputs);

			if (innerEditorIds == null)
				throw new PartInitException(
						"The Id of the editor was not found.");

			MultiEditorInput multiEditorInput = new MultiEditorInput(
					innerEditorIds, editorInputs);
			
			IWorkbenchPage page = PlatformUI.getWorkbench()
					.getActiveWorkbenchWindow().getActivePage();
			/*
			 * open the multieditor according the Id which is defined in Plugin
			 * and is saved in class
			 */
			textualMultiEditor = page.openEditor(multiEditorInput,
					PimarTextualMultiEditor.MULTI_TEXTUAL_EDITOR_ID, true);
			
			
		} catch (PartInitException e) {
			System.err.println(":O OpenPimarHandler.PartInitException : "
					+ e.getMessage());
		}
		return null;
	}
}
