package pimar.editor.textual.multieditor.plugin.editors;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorActionBarContributor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IPropertyListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.internal.util.Util;
import org.eclipse.ui.part.MultiEditor;
import org.eclipse.ui.views.contentoutline.ContentOutline;
import org.eclipse.ui.views.properties.PropertySheet;

public class PimarTextualMultiEditor extends MultiEditor implements
		IPartListener2 {

	public static final String MULTI_TEXTUAL_EDITOR_ID = "pimar.editor.textual.multieditor.plugin.editors.PimarTextualMultiEditor";

	private static final int DEFAULT_EDITOR = 1;

	private CTabFolder tabsContainer;

	private CTabItem[] tabs = new CTabItem[pimar.editor.textual.multieditor.plugin.util.PimarUtil.COUNT_OF_REQUIRED_FILES];

	private Composite[] contents = new Composite[pimar.editor.textual.multieditor.plugin.util.PimarUtil.COUNT_OF_REQUIRED_FILES];

	private IEditorPart[] innerEditors = new IEditorPart[pimar.editor.textual.multieditor.plugin.util.PimarUtil.COUNT_OF_REQUIRED_FILES];

	private List<ISelectionChangedListener> selectionListenerEditorParts = new ArrayList<ISelectionChangedListener>(
			pimar.editor.textual.multieditor.plugin.util.PimarUtil.COUNT_OF_REQUIRED_FILES);

	private List<IPropertyListener> propertyListenerEditorParts = new ArrayList<IPropertyListener>(
			pimar.editor.textual.multieditor.plugin.util.PimarUtil.COUNT_OF_REQUIRED_FILES);

	/**
	 * @serialData 05042016
	 * @modified 18042016
	 */
	public PimarTextualMultiEditor() {
		super();
	}

	/**
	 * @serialData 05042016
	 * @param site
	 * @param input
	 * @throws PartInitException
	 */
	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {

		setSite(site);
		setInput(input);
		setPartName("Pimar Textual Modeling Editor");
		setTitleToolTip(input.getToolTipText());
		site.setSelectionProvider(new PimarTextualMultiEditorSelectionProvider(
				this));
//		setupEvents();
		System.out.println(":) init was done.");
	}

	/**
	 * @modofied 30042016
	 */
	@Override
	protected void setInput(IEditorInput input) {

	}

	private void setupEvents() {
		try {//set field propagationListener
			Field x = this.getClass().getSuperclass().getSuperclass().getDeclaredField("propagationListener");
			x.setAccessible(true);
			x.set(this, this);
			getSite().getPage().addPartListener(this);
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @serialData 05042016
	 * @param innerEditor
	 * @param g
	 */
	@Override
	protected void drawGradient(IEditorPart innerEditor, Gradient g) {
		CTabItem item = tabs[getIndex(innerEditor)];
		if (item == null || item.isDisposed()) {
			return;
		}
		CTabFolder folder = item.getParent();
		folder.setSelectionForeground(g.fgColor);
		folder.setSelectionBackground(g.bgColors, g.bgPercents);
	}

	@Override
	public Object getAdapter(Class adapter) {
		Object result = super.getAdapter(adapter);
		// restrict delegating to the UI thread for bug 144851
		if (result == null && Display.getCurrent()!=null) {
			IEditorPart innerEditor = getActiveEditor();
			// see bug 138823 - prevent some subclasses from causing
			// an infinite loop
			if (innerEditor != null && innerEditor != this) {
				result = Util.getAdapter(innerEditor, adapter);
			}
		}
		return result;
	}
	

	
	/**
	 * @modified 18042016
	 */
	@Override
	public void dispose() {
		//super.dispose();
		IEditorPart[] innerEditors = getInnerEditors();
		for (int i = 0; i < innerEditors.length; i++) {// remove added listener
			innerEditors[i].removePropertyListener(propertyListenerEditorParts
					.get(i));
			((org.eclipse.xtext.ui.editor.XtextEditor) innerEditors[i])
					.getSelectionProvider().removeSelectionChangedListener(
							selectionListenerEditorParts.get(i));
			innerEditors[i].dispose();
		}
	}

	private void testCreateInnerPartControl(int editorIndex) {
		// TODO Auto-generated method stub
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
	      for (int i = 0; i < getInnerEditors().length; i++) {
	    	  //if(isDirty[i]){
	    		  IEditorPart e = getInnerEditors()[i];
	    		  e.doSave(monitor);
	    	  //}
	      }
	      monitor.done();
	}

	/**
	 * org.eclipse.ui.part.MultiPageEditorPart.activateSite() deactivates one
	 * inner site and activates the new inner site ... the
	 * NestableContextService would then swap active contexts, which cause the
	 * keybindings to be updated customizing the interface of the parent =
	 * Multieditor in workbench
	 * 
	 * @serialData 06042016
	 * 
	 * @modified 18042016
	 */
	@Override
	public void createPartControl(Composite parent) {

		parent = new Composite(parent, SWT.BORDER);
		parent.setLayout(new FillLayout());
		tabsContainer = new CTabFolder(parent, SWT.NONE);

		tabsContainer.addSelectionListener(new SelectionAdapter()
	    {
			@Override
	        public void widgetSelected(SelectionEvent e){
				if(isDirty()){//save if tab is changed
					doSave(new org.eclipse.core.runtime.NullProgressMonitor());
				}
				int newPageIndex = tabsContainer.indexOf((CTabItem) e.item);
	            PimarTextualMultiEditor.this.pageChange(newPageIndex);
	        }
	    });
		
		tabsContainer.addFocusListener(new FocusListener() 
		{
			public void focusLost(FocusEvent e) {
			}
			
			public void focusGained(FocusEvent e) {
				tabsContainer.setSelection(getIndex(getActiveEditor()));
				updateOutlineView();
				updatePropertyView();
				setFocus();
			}
		});
		
		createInnerEditorTabs();

		tabsContainer.setSelection(DEFAULT_EDITOR);
		activateEditor(innerEditors[DEFAULT_EDITOR]);
		updateActionBarContributor(DEFAULT_EDITOR);
		setFocus();

		System.out.println(":) createPartControl was done.");
	}


	
	private void createInnerEditorTabs() {
		IEditorPart innerEditors[] = getInnerEditors();
		for (int i = 0; i < innerEditors.length; i++) {
			final IEditorPart e = innerEditors[i];

			this.innerEditors[i] = e;
			CTabItem tab = new CTabItem(tabsContainer, SWT.MULTI);

			Composite content = createInnerPartControl(tabsContainer, e);
			content.addFocusListener(new FocusListener() {

				public void focusLost(FocusEvent e) {
					System.out.println("focusLost composite");

				}

				public void focusGained(FocusEvent e) {
					System.out.println("focusGained composite"
							+ e.widget.getClass());
					updateActionBarContributor(0);

				}
			});
			final int index = i;
			propertyListenerEditorParts.add(i, new IPropertyListener() {
				public void propertyChanged(Object source, int property) {
					if (property == IEditorPart.PROP_DIRTY || property == IWorkbenchPart.PROP_TITLE)
						if (source instanceof IEditorPart)
							updateInnerEditorTitle((IEditorPart) source, tabs[index]);
				}
			});
			
			selectionListenerEditorParts.add(i,
					new ISelectionChangedListener() {
						public void selectionChanged(SelectionChangedEvent event) {
							if(event!=null){
								PropertySheet propertyView = (PropertySheet) getSite().getPage().findView("org.eclipse.ui.views.PropertySheet");
								if(propertyView!=null){
									propertyView.selectionChanged(getActiveEditor(), event.getSelection());
									updateSelectionProvider(event);
								}
							}
						}
					});
			tab.setControl(content);

			contents[i] = content;

			tabs[i] = tab;

			updateInnerEditorTitle(e, tabs[i]);

		}
	}

	public void updateInnerEditorTitle(IEditorPart editor, CTabItem item) {
		if (item == null)// ||item.isDisposed()
			return;
		String title = editor.getTitle();
		if (title.startsWith(".")) {// Remove point
			title = title.substring(1, title.length());
		}
		if (editor.isDirty())
			title = "*" + title;
		item.setText(title);
		Image image = editor.getTitleImage();
		if (image != null)
			if (!image.equals(item.getImage()))
				item.setImage(image);
		item.setToolTipText(editor.getTitleToolTip());
	}

	private void updateOutlineView() {
		ContentOutline outlineView = (ContentOutline) getSite().getPage()
				.findView("org.eclipse.ui.views.ContentOutline");
		if (outlineView != null) {
			outlineView.partActivated(getActiveEditor());
		}
	}

	private void updatePropertyView() {
		PropertySheet propertyView = (PropertySheet) getSite().getPage()
				.findView("org.eclipse.ui.views.PropertySheet");
		if (propertyView != null) {
			propertyView.partActivated(getActiveEditor());
		}
	}

	private void updateSelectionProvider(SelectionChangedEvent event) {
		ISelectionProvider selectionProvider = getActiveEditor().getSite()
				.getSelectionProvider();
		if (selectionProvider != null) {
			ISelectionProvider outerProvider = getSite().getSelectionProvider();
			if (outerProvider instanceof PimarTextualMultiEditorSelectionProvider) {
				if (event == null) {
					event = new SelectionChangedEvent(selectionProvider,
							selectionProvider.getSelection());
				}
				PimarTextualMultiEditorSelectionProvider provider = (PimarTextualMultiEditorSelectionProvider) outerProvider;
				provider.fireSelectionChanged(event);
			}
		}
	}

	protected void pageChange(int newPageIndex) {
		tabsContainer.setSelection(newPageIndex);
		updateActionBarContributor(newPageIndex);
		updateOutlineView();
		updatePropertyView();
		updateSelectionProvider(null);
		activateEditor(getInnerEditors()[newPageIndex]);
		setFocus();
	}

	protected void updateActionBarContributor(int pageIndex) {
//		IEditorActionBarContributor contributor = getInnerEditors()[pageIndex]
//				.getEditorSite().getActionBarContributor();
//		if (contributor != null
//				&& contributor instanceof IEditorActionBarContributor) {
//			((IEditorActionBarContributor) contributor)
//					.setActiveEditor(getInnerEditors()[pageIndex]);
//		}
	}

	public void partActivated(IWorkbenchPartReference partRef) {
		IWorkbenchPart part = partRef.getPart(false);
		if (part == PimarTextualMultiEditor.this && getInnerEditors() != null) {
			updateOutlineView();
			updatePropertyView();
			pageChange(this.getIndex(getActiveEditor()));
		}

	}

	public void partBroughtToTop(IWorkbenchPartReference partRef) {
		// TODO Auto-generated method stub

	}

	public void partClosed(IWorkbenchPartReference partRef) {
		// TODO Auto-generated method stub

	}

	public void partDeactivated(IWorkbenchPartReference partRef) {
		// TODO Auto-generated method stub

	}

	public void partOpened(IWorkbenchPartReference partRef) {
		IWorkbenchPart part = partRef.getPart(false);
		if (part == PimarTextualMultiEditor.this && getInnerEditors() != null) {
			pageChange(this.getIndex(getActiveEditor()));
		}

	}

	public void partHidden(IWorkbenchPartReference partRef) {
		// TODO Auto-generated method stub

	}

	public void partVisible(IWorkbenchPartReference partRef) {
		IWorkbenchPart part = partRef.getPart(false);
		if (part == PimarTextualMultiEditor.this && getInnerEditors() != null) {
			updateOutlineView();
			updatePropertyView();
		}

	}

	public void partInputChanged(IWorkbenchPartReference partRef) {
		// TODO Auto-generated method stub

	}

}
