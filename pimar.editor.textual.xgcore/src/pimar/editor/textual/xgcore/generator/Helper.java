package pimar.editor.textual.xgcore.generator;

import gcore.GcorePackage;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xcore.XPackage;
import org.eclipse.emf.ecore.xcore.XcorePackage;
import org.eclipse.emf.ecore.xcore.importer.XcoreImporter;
import org.eclipse.emf.ecore.xcore.importer.ui.XcoreImporterWizard;
import org.eclipse.emf.ecore.xcore.util.XcoreEcoreBuilder;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.XbasePackage;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class Helper {

	  
	public static void saveRecourceAsXmi(Resource resource) {
		try {
			

			Map<String, String> saveOptions = new HashMap<String, String>();
			Resource xmiResource = new XMIResourceImpl(URI.createURI(resource
					.getURI().toString().replace("xgcore", "gcore")));
			xmiResource.getContents().add(resource.getContents().get(0));
			saveOptions.put(
					org.eclipse.emf.ecore.xmi.XMLResource.OPTION_ENCODING,
					"UTF-8");
			xmiResource.save(saveOptions);

			
			System.out.println(":) Xmi file created for gcore.");

		} catch (IOException e) {
			System.out.println(":( Error during creating Xmi for gcore.");
			e.printStackTrace();
		}

	}


	/**
	 * This methode is ok
	 * @param sourcename
	 * @param targetname
	 */
	public static void Xcore2Ecore_08042016(URI sourcename, URI targetname) {

		try {

			ResourceSet localResourceSet = new ResourceSetImpl();

			URI ecoreUri = URI.createURI(EcoreFactory.eINSTANCE.getEPackage().getNsURI(), true);

			Resource ecoreResource = localResourceSet.getResource(ecoreUri,true);
			
			Resource xcoreResource = localResourceSet.getResource(sourcename,true);
			
			EcoreUtil.resolveAll(localResourceSet);

			Resource ecoreOutputResource = new ResourceImpl();
			ecoreOutputResource.getContents().add(
					(EPackage) EcoreUtil.getObjectByType(
							xcoreResource.getContents(),
							EcorePackage.Literals.EPACKAGE));

			Map<String, String> saveOptions = new HashMap<String, String>();
			
			Resource xmiResource = new XMIResourceImpl(targetname);
			
			xmiResource.getContents().add(ecoreOutputResource.getContents().get(0));
			
			saveOptions.put(org.eclipse.emf.ecore.xmi.XMLResource.OPTION_ENCODING,"UTF-8");
			
			xmiResource.save(saveOptions);

			System.out.println(":) Xmi file created for ecore.");
			
		} catch (IOException e) {

			System.out.println(":( Error during creating Xmi for ecore.");
			
		}
	}
	
	public static void Xcore2Ecore(URI sourcename, URI targetname, IFileSystemAccess fsa) {
		
		try {

			
			ResourceSet localResourceSet = new ResourceSetImpl();
			
	
			if (!Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().containsKey("ecore")) {
				Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
			}
			if (!EPackage.Registry.INSTANCE.containsKey(EcorePackage.eNS_URI)){
				EPackage.Registry.INSTANCE.put(EcorePackage.eNS_URI,EcorePackage.eINSTANCE);
			}
			if (!EPackage.Registry.INSTANCE.containsKey(XbasePackage .eNS_URI)){
				EPackage.Registry.INSTANCE.put(XbasePackage.eNS_URI,XbasePackage .eINSTANCE);
			}
			if (!EPackage.Registry.INSTANCE.containsKey(XcorePackage  .eNS_URI)){
				EPackage.Registry.INSTANCE.put(XcorePackage.eNS_URI,XcorePackage .eINSTANCE);
			}
			
			
			Resource xcoreResource = localResourceSet.getResource(sourcename,true);
			
//			XcoreGeneratorHelper xcoreGeneratorHelper=new XcoreGeneratorHelper();
//			xcoreGeneratorHelper.doGenerate(xcoreResource, fsa);
			
			
			localResourceSet.getURIConverter().getURIMap().putAll(EcorePlugin.computePlatformURIMap(true));
			
			EcoreUtil.resolveAll(localResourceSet);
			
			Resource ecoreOutputResource = new ResourceImpl();
			ecoreOutputResource.getContents().add((EPackage) EcoreUtil.getObjectByType(	xcoreResource.getContents(),EcorePackage.Literals.EPACKAGE));
			
			Map<String, String> saveOptions = new HashMap<String, String>();
			
			Resource xmiResource = new XMIResourceImpl(targetname);
			xmiResource.getContents().add(ecoreOutputResource.getContents().get(0));
			saveOptions.put(org.eclipse.emf.ecore.xmi.XMLResource.OPTION_ENCODING,"UTF-8");
			xmiResource.save(saveOptions);

			System.out.println(":) Xmi file created for ecore.");
			
		} catch (IOException e) {

			System.out.println(":( Error during creating Xmi for ecore.");
			
		}
	}

}
