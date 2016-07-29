package pimar.editor.textual.multieditor.plugin.wizards;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.MultiEditorInput;

import pimar.editor.textual.multieditor.plugin.editors.PimarTextualMultiEditor;

/**
 * @modified 24.04.2016
 * @author Parisa
 * 
 */
public class PimarNewTextualEditorWizard extends Wizard implements INewWizard {

	public static final String MULTI_TEXTUAL_EDITOR_WIZARD_ID = "pimar.editor.textual.multieditor.plugin.wizards.PimarNewTextualEditorWizard";

	private PimarNewTextualEditorWizardPage page;

	private ISelection selection;

	/**
	 * to set the section for running wizard from toolbar
	 * because in this case the container is empty but it can have
	 * a value
	 * @modified
	 * @param selection
	 */
	public void setSelection(ISelection selection) {
		this.selection = selection;
	}

	/**
	 * correspondent editorInput for each file
	 * 
	 * @modified 24042016
	 */
	private IEditorInput[] editorInputs = new IEditorInput[pimar.editor.textual.multieditor.plugin.util.PimarUtil.COUNT_OF_REQUIRED_FILES];

	public PimarNewTextualEditorWizard() {
		super();
		setNeedsProgressMonitor(true);
	}

	/**
	 * This method is called just before the wizard becomes visible, to give the
	 * wizard the opportunity to add any lazily created pages
	 */
	public void addPages() {
		page = new PimarNewTextualEditorWizardPage(selection);
		addPage(page);
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;

	}

	@Override
	public boolean performFinish() {
		final String containerName = page.getContainerName();
		final String fileName = page.getFileName();
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor)
					throws InvocationTargetException {
				try {
					doFinish(containerName, fileName, monitor);
				} catch (CoreException e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};
		try {
			getContainer().run(true, false, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), "Error",
					realException.getMessage());
			return false;
		}
		return true;
	}

	/**
	 * Creating files which are required for textual multi-page editor
	 * 
	 * @modified 24042016
	 * @param containerName
	 * @param fileName
	 * @param monitor
	 * @throws CoreException
	 */
	private void doFinish(String containerName, String fileName,
			IProgressMonitor monitor) throws CoreException {
		// create a sample file
		monitor.beginTask(
				"Creating Textual Multi-page Editor Files" + fileName, 2);
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IResource resource = root.findMember(new Path(containerName));
		if (!resource.exists() || !(resource instanceof IContainer)) {
			throwCoreException("Container \"" + containerName
					+ "\" does not exist.");
		}
		IContainer container = (IContainer) resource;

		for (String strFileName : pimar.editor.textual.multieditor.plugin.util.PimarUtil.filesName) {

			// the default extensions are defined in array and the correspondent
			// files
			// are generated here for opening the textual multi-page editor

			strFileName = strFileName.replace("*", fileName);

			final IFile file = container.getFile(new Path(strFileName));

			InputStream stream = null;

			if (file.getFileExtension().equals("xcore")) {
				editorInputs[0] = new FileEditorInput((IFile) file);
				stream = openContentStream(pimar.editor.textual.multieditor.plugin.util.PimarUtil.DEFAULT_CONTENT_XCORE);
				System.out.println("w0 : " + editorInputs[0].getName());

			}
			if (file.getFileExtension().equals("xgcore")) {
				editorInputs[1] = new FileEditorInput((IFile) file);
				stream = openContentStream(pimar.editor.textual.multieditor.plugin.util.PimarUtil.DEFAULT_CONTENT_XGCORE);
				System.out.println("w1 : " + editorInputs[1].getName());

			}
			if (file.getFileExtension().equals("xwcore")) {
				editorInputs[2] = new FileEditorInput((IFile) file);
				stream = openContentStream(pimar.editor.textual.multieditor.plugin.util.PimarUtil.DEFAULT_CONTENT_XWCORE);
				System.out.println("w2 : " + editorInputs[2].getName());
			}

			try {

				if (stream == null)
					throw new IOException("The stream is null");
				if (file.exists()) {
					file.setContents(stream, true, true, monitor);
				} else {
					file.create(stream, true, monitor);
				}
				stream.close();
			} catch (IOException e) {
			}

			monitor.worked(1);
		}
		monitor.setTaskName("Opening PIMAR textual multi editor for editing...");
		getShell().getDisplay().asyncExec(new Runnable() {
			public void run() {
				IWorkbenchPage page = PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow().getActivePage();
				try {
					/*
					 * openEditor is customized here to open textual multi-page
					 * editor after creating the files IDE.openEditor(page,
					 * file, true);
					 */

					/*
					 * create MultiEditorInput with editor Ids which are gained
					 * from default editors of workbench
					 */
					String[] innerEditorIds = pimar.editor.textual.multieditor.plugin.util.PimarUtil
							.getInnerEditorIDs(editorInputs);

					if (innerEditorIds == null)
						throw new PartInitException(
								"The Id of the editor was not found.");

					MultiEditorInput multiEditorInput = new MultiEditorInput(
							innerEditorIds, editorInputs);
					/*
					 * open the multieditor according the Id which is defined in
					 * Plugin and is saved in class
					 */
					page.openEditor(multiEditorInput,
							PimarTextualMultiEditor.MULTI_TEXTUAL_EDITOR_ID,
							true);

				} catch (PartInitException e) {
				}
			}
		});
		monitor.worked(1);
	}

	private InputStream openContentStream(String contents) {
		// String contents =
		// "This is the correspondent name for all three files which cause to open the PIMAR textual multi editor.";
		return new ByteArrayInputStream(contents.getBytes());
	}

	private void throwCoreException(String message) throws CoreException {
		IStatus status = new Status(IStatus.ERROR,
				"pimar.editor.textual.multieditor.plugin", IStatus.OK, message,
				null);
		throw new CoreException(status);
	}

}
