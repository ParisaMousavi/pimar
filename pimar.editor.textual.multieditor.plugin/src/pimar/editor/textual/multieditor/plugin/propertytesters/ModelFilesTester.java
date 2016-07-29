package pimar.editor.textual.multieditor.plugin.propertytesters;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IPackageFragment;

public class ModelFilesTester extends PropertyTester {

	public ModelFilesTester() {
	}

	
	
	public boolean test(Object receiver, String property, Object[] args,
			Object expectedValue) {
		System.out.println(" receiver : " + receiver.getClass());
		System.out.println(" property : " + property);
		System.out.println(" expectedValue : " + expectedValue);
		try {
			
			if (receiver instanceof IFolder) {
				System.out.println("in test method");
				// Checking if the model files are existed in selected folder or
				// not!
				IFolder folder = (IFolder) receiver;
				boolean ecore = false, gcore = false, wcore = false;
				for (IResource iresource : folder.members()) {
					if (iresource instanceof IFile) {
						IFile file = (IFile) iresource;
						if (iresource.getFileExtension().contains("xcore")) {
							ecore = true;
						}
						if (iresource.getFileExtension().contains("xgcore")) {
							gcore = true;
						}
						if (iresource.getFileExtension().contains("xwcore")) {
							wcore = true;
						}
					}
				}

				if (ecore == true && gcore == true && wcore == true) {
					System.out.println("all model files are existed");
					return true;
				} else {
					System.out.println("all model files are not existed");
					System.out.println(":( PIMAR models are not there");
					return false;
				}
			} else {
				// :) Do Nothing
				System.out.println(":( recoever is not instance of Folder");
				return false;
			}
		} catch (CoreException e) {
			e.printStackTrace();
			return false;
		}
	}

}
