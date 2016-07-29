package pimar.editor.textual.xwcore.generator;

import gcore.GcorePackage;
import gcore.impl.GcoreFactoryImpl;
import gcore.impl.GcorePackageImpl;
import gcore.util.GcoreAdapterFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.nio.file.FileSystem;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import pimar.editor.textual.xwcore.XwcoreStandaloneSetup;

public class Helper {

	private static URIConverter uriConverter;
	private static URI _wcoreURI;

	// private static OutputStream _outputStream;

	public static void saveAndReplace(Resource resource) {
		saveRecourceAsXmi(resource);

		try {
			ReplaceInFile(_wcoreURI);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void saveRecourceAsXmi(Resource resource) {
		try {

			URI ecoreURI = resource.getURI().trimFileExtension()
					.appendFileExtension("ecore");
			URI gcoreURI = resource.getURI().trimFileExtension()
					.appendFileExtension("gcore");

			ResourceSet localResourceSet = new ResourceSetImpl();

			/*
			 * register your resource factory
			 * Resource.Factory.Registry.INSTANCE.
			 * getExtensionToFactoryMap().put( "<YOUR_FILE_EXTENSION>", new
			 * <YOUR_LANGUAGE_NAME>ResourceFactory() );
			 * 
			 * //register all ecore models needed for reference resolving as
			 * follows: EPackage.Registry.INSTANCE.put(
			 * "<METAMODEL_NAMESPACE_URI>", <METAMODEL_PACKAGE_NAME>Impl.init()
			 * );
			 */
			System.out.println("Global gcore : "
					+ Resource.Factory.Registry.INSTANCE
							.getExtensionToFactoryMap().containsKey("gcore"));
			if (!localResourceSet.getResourceFactoryRegistry()
					.getExtensionToFactoryMap().containsKey("gcore")) {
				localResourceSet.getResourceFactoryRegistry()
						.getExtensionToFactoryMap()
						.put("gcore", new XMIResourceFactoryImpl());
				if (!EPackage.Registry.INSTANCE
						.containsKey(GcorePackage.eNS_URI)) {
					EPackage.Registry.INSTANCE.put(GcorePackage.eNS_URI,
							GcorePackage.eINSTANCE);
				}

				System.out.println("gcore was not registered "
						+ GcorePackage.eNS_URI);
			}

			/*
			 * This is global
			 * !Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap
			 * ().containsKey("ecore") but I need it only in this ResourceSet
			 */
			System.out.println("Global ecore : "
					+ Resource.Factory.Registry.INSTANCE
							.getExtensionToFactoryMap().containsKey("ecore"));
			if (!localResourceSet.getResourceFactoryRegistry()
					.getExtensionToFactoryMap().containsKey("ecore")) {
				localResourceSet.getResourceFactoryRegistry()
						.getExtensionToFactoryMap()
						.put("ecore", new EcoreResourceFactoryImpl());
				if (!EPackage.Registry.INSTANCE
						.containsKey(EcorePackage.eNS_URI)) {
					EPackage.Registry.INSTANCE.put(EcorePackage.eNS_URI,
							EcorePackage.eINSTANCE);
				}
				System.out.println("ecore was not registered "
						+ EcorePackage.eNS_URI);
			}

			Resource ecoreRes = localResourceSet.getResource(ecoreURI, true);

			System.out.println("URI : " + ecoreURI.toString());
			Resource gcoreRes = localResourceSet.getResource(gcoreURI, true);
			System.out.println("URI : " + gcoreURI.toString());

			if (!localResourceSet.getResources().contains(resource)) {
				localResourceSet.getResources().add(resource);
			}

			EcoreUtil.resolveAll(localResourceSet);

			_wcoreURI = resource.getURI().trimFileExtension()
					.appendFileExtension("wcore");
			Map<String, String> saveOptions = new HashMap<String, String>();
			Resource xmiResource = new XMIResourceImpl(_wcoreURI);

			xmiResource.getContents()
					.add(localResourceSet.getResources().get(2).getContents()
							.get(0));
			saveOptions.put(
					org.eclipse.emf.ecore.xmi.XMLResource.OPTION_ENCODING,
					"UTF-8");
			xmiResource.save(saveOptions);

			uriConverter = localResourceSet.getURIConverter();

			System.out.println(":) Xmi file created for wcore. ");
		} catch (IOException e) {
			System.err.println(":( Error during creating Xmi for wcore.");
			System.err.println(e.getMessage());
		}
	}

	private static void ReplaceInFile(URI wcoreURI) throws IOException {
		String[] strs = _wcoreURI.path().split("/");
		
		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace()
				.getRoot();
		IProject myWebProject = myWorkspaceRoot.getProject(strs[2]);

		IResource ir = null;
		try {
			myWebProject.open(null);
			IFolder imagesFolder = myWebProject.getFolder(strs[3]);
			if (imagesFolder.exists()) {
				// create a new file
				IFile newLogo = imagesFolder.getFile(strs[4]);
				ir = (IResource) newLogo;

				System.out.println("ok" + ir.getLocationURI());

			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		File file = new File(ir.getLocationURI());
		String fileContext = FileUtils.readFileToString(file);
		fileContext = fileContext.replaceAll(".xgcore#", ".gcore#");
		fileContext = fileContext.replaceAll(".xcore#/EPackage/", ".ecore#//");
		FileUtils.write(file, fileContext);
		System.out.println(":) ReplaceInFile is done.");

	}

}
