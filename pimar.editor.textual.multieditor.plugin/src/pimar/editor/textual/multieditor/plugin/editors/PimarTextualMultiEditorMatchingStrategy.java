package pimar.editor.textual.multieditor.plugin.editors;

import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorMatchingStrategy;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.MultiEditor;
import org.eclipse.ui.part.MultiEditorInput;

public class PimarTextualMultiEditorMatchingStrategy implements
		IEditorMatchingStrategy {

	public boolean matches(IEditorReference editorRef, IEditorInput input) {
		IEditorInput editorInput;
		IEditorInput[] inputEditorRef;
		IEditorInput[] inputParam;
		MultiEditor editor = (MultiEditor) editorRef.getEditor(true);
		IEditorPart[] parts = editor.getInnerEditors();
		try {
			editorInput = editorRef.getEditorInput();
			if(editorInput instanceof MultiEditorInput && input instanceof MultiEditorInput){
				inputEditorRef = ((MultiEditorInput)editorInput).getInput();
				inputParam = ((MultiEditorInput)input).getInput();
			}
			else return false;
		} catch (PartInitException e) {
			return false;
		}

		for (int i = 0; i < parts.length; i++) {
			if (inputEditorRef[i].equals(inputParam[i])) {
				return true;
			}
			if (inputEditorRef[i] instanceof URIEditorInput
					&& inputParam[i] instanceof URIEditorInput) {
				return ((URIEditorInput) inputEditorRef[i]).getURI().equals(
						((URIEditorInput) inputParam[i]).getURI());
			}
		}
		return false;
	}

}
