package pimar.editor.textual.multieditor.plugin.editors;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.ListenerList;
import org.eclipse.core.runtime.SafeRunner;
import org.eclipse.jface.util.SafeRunnable;
import org.eclipse.jface.viewers.IPostSelectionProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IEditorPart;




public class PimarTextualMultiEditorSelectionProvider implements IPostSelectionProvider {

	private ListenerList listeners = new ListenerList();
	private ListenerList postListeners = new ListenerList();
	private PimarTextualMultiEditor multiEditor;

	public PimarTextualMultiEditorSelectionProvider(PimarTextualMultiEditor multiEditor) {
		System.out.println("PIMAR TME: MultiEditorSelectionProvider.");
		Assert.isNotNull(multiEditor);
		this.multiEditor = multiEditor;
	}

	public void fireSelectionChanged(final SelectionChangedEvent event) {
		System.out.println("PIMAR TME: fireSelectionChanged.");
		Object[] listeners = this.listeners.getListeners();
		if(listeners != null)
		{
			System.out.println("listener is not null");
		fireEventChange(event, listeners);
		}
	}

	private void fireEventChange(final SelectionChangedEvent event,
			Object[] listeners) {
		System.out.println("PIMAR TME: fireEventChange.");
		for (int i = 0; i < listeners.length; ++i) {
			final ISelectionChangedListener l = (ISelectionChangedListener) listeners[i];
			SafeRunner.run(new SafeRunnable() {
				public void run() {
					l.selectionChanged(event);
				}
			});
		}
	}

	public void firePostSelectionChanged(final SelectionChangedEvent event) {
		System.out.println("PIMAR TME: firePostSelectionChanged.");
		Object[] listeners = postListeners.getListeners();
		fireEventChange(event, listeners);
	}

	public PimarTextualMultiEditor getMultiPageEditor() {
		System.out.println("PIMAR TME: PimarTextualMultiEditor.");
		return multiEditor;
	}
	
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		// TODO Auto-generated method stub

	}

	public ISelection getSelection() {
		System.out.println("PIMAR TME: getSelection.");
		IEditorPart activeEditor = multiEditor.getActiveEditor();
		if (activeEditor != null) {
			ISelectionProvider selectionProvider = activeEditor.getSite()
					.getSelectionProvider();
			if (selectionProvider != null) {
				return selectionProvider.getSelection();
			}
		}
		return StructuredSelection.EMPTY;
	}

	public void removeSelectionChangedListener(
			ISelectionChangedListener listener) {
		System.out.println("PIMAR TME: removeSelectionChangedListener.");
		listeners.remove(listener);

	}

	public void setSelection(ISelection selection) {
		System.out.println("PIMAR TME: setSelection.");
		IEditorPart activeEditor = multiEditor.getActiveEditor();
		if (activeEditor != null) {
			ISelectionProvider selectionProvider = activeEditor.getSite()
					.getSelectionProvider();
			if (selectionProvider != null) {
				selectionProvider.setSelection(selection);
			}
		}

	}

	public void addPostSelectionChangedListener(
			ISelectionChangedListener listener) {
		System.out.println("PIMAR TME: addPostSelectionChangedListener.");
		postListeners.add(listener);

	}

	public void removePostSelectionChangedListener(
			ISelectionChangedListener listener) {
		System.out.println("PIMAR TME: removePostSelectionChangedListener.");
		postListeners.remove(listener);

	}

}
