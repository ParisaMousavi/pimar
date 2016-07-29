package pimar.editor.textual.multieditor.plugin.actions;

import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.internal.core.PackageFragment;
import org.eclipse.jdt.internal.core.PackageFragmentRoot;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.m2e.core.embedder.ArtifactKey;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionDelegate;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.MultiEditorInput;

import pimar.editor.textual.multieditor.plugin.editors.PimarTextualMultiEditor;

public class OpenTextualModelEditor extends ActionDelegate {

	public OpenTextualModelEditor() {
		// TODO Auto-generated constructor stub
	}

	private IStructuredSelection selection;
	private IEditorInput[] editorInputs = new IEditorInput[pimar.editor.textual.multieditor.plugin.util.PimarUtil.COUNT_OF_REQUIRED_FILES];
	private IEditorPart textualMultiEditor;

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		System.out.println("selectionChanged");
		if (selection instanceof IStructuredSelection) {
			this.selection = (IStructuredSelection) selection;
			for (Iterator iterator = this.selection.iterator(); iterator
					.hasNext();) {
				Object element = iterator.next();
				if (element instanceof org.eclipse.jdt.internal.core.PackageFragmentRoot) {

					IPackageFragmentRoot sourceFolder = (IPackageFragmentRoot) element;
					// IPackageFragment packagefragment =
					// sourceFolder.getPackageFragment("");
					IResource iresource1 = sourceFolder.getResource();
					IFolder folder = (IFolder) iresource1;

					try {
						for (IResource iresource : folder.members()) {

							if (iresource instanceof IFile) {
								IFile file = (IFile) iresource;

								if (file.getFileExtension().equals("xcore")) {
									editorInputs[0] = new FileEditorInput(
											(IFile) file);
									System.out.println("0 : "
											+ editorInputs[0].getName());

								}
								if (file.getFileExtension().equals("xgcore")) {
									editorInputs[1] = new FileEditorInput(
											(IFile) file);
									System.out.println("1 : "
											+ editorInputs[1].getName());

								}
								if (file.getFileExtension().equals("xwcore")) {
									editorInputs[2] = new FileEditorInput(
											(IFile) file);
									System.out.println("2 : "
											+ editorInputs[2].getName());
								}
							}
						}

					} catch (CoreException e) {
						System.err
								.println(":O OpenPimarHandler.CoreException: "
										+ e.getMessage());
					}

				}

			}

		} else {
			this.selection = null;
		}
	}

	@Override
	public void run(IAction action) {

		if (selection != null) {
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
				 * open the multieditor according the Id which is defined in
				 * Plugin and is saved in class
				 */
				textualMultiEditor = page.openEditor(multiEditorInput,
						PimarTextualMultiEditor.MULTI_TEXTUAL_EDITOR_ID, true);

			} catch (PartInitException e) {
				System.err.println(":O OpenPimarHandler.PartInitException : "
						+ e.getMessage());
			}
			System.out.println("run");
		}
	}
}
