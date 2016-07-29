package pimar.editor.textual.multieditor.plugin.util;

import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.PlatformUI;

public class PimarUtil {

	//EditorId: org.eclipse.emf.ecore.xcore.Xcore
	//EditorId: pimar.editor.textual.xgcore.Xgcore
	//EditorId: pimar.editor.textual.xwcore.Xwcore
	
	
	
	/**
	 * the default content of xcore editor
	 * @modified 24042016
	 */
	//"@Ecore(nsURI='http://www.eclipse.org/emf/2002/EcoreI') package ecoreI class Entity{ unique String EntityName }";
	public static final String DEFAULT_CONTENT_XCORE = "@Ecore(nsURI='http://www.eclipse.org/emf/2002/EcoreI')\n"
			 + "package ecoreI \n"
			 + "class MyMessage{ \n"
			 + "	String strMessage = \"Hello World\" \n"
			 + "}\n";

	public static final String[] EDITORS_ID = {
		"org.eclipse.emf.ecore.xcore.Xcore",
		"pimar.editor.textual.xgcore.Xgcore",
		"pimar.editor.textual.xwcore.Xwcore"
	};
	
	
	/**
	 * the default content of xgcore editor
	 * @modified 24042016
	 */
	//"PageContainer gcoreI{ nsURI 'http://www.eclipse.org/emf/2002/GcoreI' 	nsPrefix 'gcoreI' }";
	public static final String DEFAULT_CONTENT_XGCORE = "PageAndSettingContainer gcoreI {\n"
		+"nsURI \"http://www.eclipse.org/emf/2002/GcoreI\" \n"
		+"nsPrefix gcoreI \n"
		+"styleSettings{ \n"
		+"	rgbColors { \n"
		+"		BLACK (,,), \n"
		+"		WHITE ( 45,255,255 ) \n"
		+"	} \n"
		+"	fontColor BLACK  \n"
		+"	backColor WHITE \n"
		+"	PageSettings ( WHITE,,,	) \n"
		+"	fixedMenu MenuSettings ( GRID ) \n"
		+"	SelectionSettings ( WHITE ) \n"
		+"	separatorShow ListSettings (BLACK,GRID ) \n"
		+"} \n"
		+"menues { \n"
		+"	Menu withStyle  \"StyleMenuSettings 1\" \n"
		+"} \n"
		+"pages { \n"
		+"	ProcessSelectorPage ProcessesOverview (\"StylePageSettings 0\" , Menu ), \n"
		+"	ViewPage View (\"StylePageSettings 0\" , Menu ) \n"
		+"} \n"
	+"} \n";
	/**
	 * the default content of xwcore editor
	 * @modified 24042016
	 */
	//"ProcessContainer wcoreI { nsURI 'http://www.eclipse.org/emf/2002/WcoreI' nsPrefix wcoreI processes { Process Main { startTask ProcessSelector MainProcesses {	} } }";
	public static final String DEFAULT_CONTENT_XWCORE = "ProcessContainer wcoreI { \n"
		+"nsURI \"http://www.eclipse.org/emf/2002/WcoreI\" \n"
		+"nsPrefix wcoreI \n"
		+"Method Main ( ) { \n"
		+"	@anno ( icon = \"uebersetzen\" , title = \"Hello World\" ) \n"
		+"	ProcessSelector MainProcesses page gcoreI.ProcessesOverview ( HelloWorld ); \n"
		+"} \n"
		+"Method HelloWorld ( ) { \n"
		+"	variables {	\n"
		+"		LOCAL ecoreI.MyMessage HelloMessage \n"
		+"	} \n"
		+"	InvokeGUI (HelloMessage) = page gcoreI.View ( HelloMessage ); \n"
		+"} \n"
	+"} \n";
	
	/**
	 * The count of required files which must be created 
	 * for opening the textual Multi-page editor.
	 * @modified 24042016
	 */
	public static final int COUNT_OF_REQUIRED_FILES = 3;

	/**
	 * The files name are kept here to be used latter in wizard. The order is important 
	 * and it must not be changed.
	 * 
	 * @modified 24042016
	 */
	public static String[] filesName = { "*.xcore", "*.xgcore", "*.xwcore" };

	/**
	 * the Id of editor is gained from default editor in workbench
	 * 
	 * @serialData 06042016
	 * @param filename
	 * @return
	 */
	private static String getEditorIdByFile(String filename) {

		IEditorDescriptor myEditorDescriptor = PlatformUI.getWorkbench()
				.getEditorRegistry().getDefaultEditor(filename);
		System.out.println("EditorId: " + myEditorDescriptor.getId());
		return myEditorDescriptor.getId();

	}

	/**
	 * The ID of editors are gained from the file which is going to be opened in
	 * the editor
	 * 
	 * @serialData 06042016
	 * @param editorInputs
	 * @return
	 */
	public static String[] getInnerEditorIDs(IEditorInput[] editorInputs) {

		String[] ids = new String[COUNT_OF_REQUIRED_FILES];
		for (int i = 0; i < editorInputs.length; i++) {
			if(editorInputs[i]== null)
				return null;
			ids[i] = getEditorIdByFile(editorInputs[i].getName());
			System.out.println(i + ": filename for editor"
					+ editorInputs[i].getName());
		}
		return ids;

	}

}
