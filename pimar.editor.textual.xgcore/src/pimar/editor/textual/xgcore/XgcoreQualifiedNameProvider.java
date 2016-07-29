package pimar.editor.textual.xgcore;

import gcore.StyleListSettings;
import gcore.StyleMenuSettings;
import gcore.StylePageSettings;
import gcore.StyleSelectionSettings;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

public class XgcoreQualifiedNameProvider extends
		DefaultDeclarativeQualifiedNameProvider {
	
	QualifiedName qualifiedName(StylePageSettings e) {
		return QualifiedName.create("StylePageSettings 0");
	}

	QualifiedName qualifiedName(StyleMenuSettings e) {
		return QualifiedName.create("StyleMenuSettings 1");
	}

	QualifiedName qualifiedName(StyleSelectionSettings e) {
		return QualifiedName.create("StyleSelectionSettings 2");
	}

	QualifiedName qualifiedName(StyleListSettings e) {
		return QualifiedName.create("StyleListSettings 3");
	}
}
