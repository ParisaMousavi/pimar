package pimar.editor.textual.multieditor.plugin.editors;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.ICoolBarManager;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IActionBars2;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.ide.IDEActionFactory;
import org.eclipse.ui.part.EditorActionBarContributor;
import org.eclipse.ui.texteditor.ITextEditor;
import org.eclipse.ui.texteditor.ITextEditorActionConstants;

public class PimarTextualMultiEditorContributor extends
		EditorActionBarContributor {

	private IActionBars bars;
	private IWorkbenchPage page;
	private Action sampleAction;
	private IEditorPart activeEditorPart;

	public PimarTextualMultiEditorContributor() {
		super();
	}


	protected IAction getAction(ITextEditor editor, String actionID) {
		return (editor == null ? null : editor.getAction(actionID));
	}
	
	/* (non-JavaDoc)
	 * Method declared in AbstractMultiPageEditorActionBarContributor.
	 */

	public void setActivePage(IEditorPart part) {
		if (activeEditorPart == part)
			return;

		activeEditorPart = part;

		IActionBars actionBars = getActionBars();
		if (actionBars != null) {

			ITextEditor editor = (part instanceof ITextEditor) ? (ITextEditor) part : null;

			actionBars.setGlobalActionHandler(
				ActionFactory.DELETE.getId(),
				getAction(editor, ITextEditorActionConstants.DELETE));
			actionBars.setGlobalActionHandler(
				ActionFactory.UNDO.getId(),
				getAction(editor, ITextEditorActionConstants.UNDO));
			actionBars.setGlobalActionHandler(
				ActionFactory.REDO.getId(),
				getAction(editor, ITextEditorActionConstants.REDO));
			actionBars.setGlobalActionHandler(
				ActionFactory.CUT.getId(),
				getAction(editor, ITextEditorActionConstants.CUT));
			actionBars.setGlobalActionHandler(
				ActionFactory.COPY.getId(),
				getAction(editor, ITextEditorActionConstants.COPY));
			actionBars.setGlobalActionHandler(
				ActionFactory.PASTE.getId(),
				getAction(editor, ITextEditorActionConstants.PASTE));
			actionBars.setGlobalActionHandler(
				ActionFactory.SELECT_ALL.getId(),
				getAction(editor, ITextEditorActionConstants.SELECT_ALL));
			actionBars.setGlobalActionHandler(
				ActionFactory.FIND.getId(),
				getAction(editor, ITextEditorActionConstants.FIND));
			actionBars.setGlobalActionHandler(
				IDEActionFactory.BOOKMARK.getId(),
				getAction(editor, IDEActionFactory.BOOKMARK.getId()));
			actionBars.updateActionBars();
		}
	}
	
	
	@Override
	public void contributeToMenu(IMenuManager manager) {

	}

	@Override
	public void contributeToStatusLine(IStatusLineManager statusLineManager) {

	}

	@Override
	public void contributeToToolBar(IToolBarManager manager) {

	}

	@Override
	public void contributeToCoolBar(ICoolBarManager coolBarManager) {

	}

	@Override
	public IWorkbenchPage getPage() {
		// TODO Auto-generated method stub
		return page;
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		// super.dispose();
	}

	@Override
	public void init(IActionBars bars, IWorkbenchPage page) {
		this.page = page;
		super.init(bars);
	}

	@Override
	public void init(IActionBars bars) {
		this.bars = bars;
		contributeToMenu(bars.getMenuManager());
		contributeToToolBar(bars.getToolBarManager());
		if (bars instanceof IActionBars2) {
			contributeToCoolBar(((IActionBars2) bars).getCoolBarManager());
		}
		contributeToStatusLine(bars.getStatusLineManager());
	}


	
	@Override
	public IActionBars getActionBars() {
		return bars;
	}

	/*
	 * When a new Editor is set active, by calling {@link #setActiveEditor(PagePart)}, following actions are 
	 * performed: 
	 * <ul> 
	 * <li>deactivate services: nested site and keybinding</li> 
	 * <li>An event is sent to the ActionBarContributor if it accept it (by implementing {@link IMultiPageEditorActionBarContributor})</li> 
	 * <li>Send {@link SelectionChangedEvent} to the main editor. The event contains the current selection of the new active editor.</li> 
	 * <li>Connect the keybinding service to the new Editor.</li> 
	 * </ul> 
	 *  
	 */
	@Override
	public void setActiveEditor(IEditorPart part) {

	}
}
