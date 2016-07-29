/*
 * generated by Xtext
 */
package pimar.editor.textual.xwcore;

import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.resource.DerivedStateAwareResourceDescriptionManager;
import org.eclipse.xtext.resource.IDerivedStateComputer;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.scoping.IScopeProvider;

import pimar.editor.textual.xwcore.postprocessor.XwcoreDerivedStateComputer;
import pimar.editor.textual.xwcore.scoping.XwcoreScopeProvider;

import com.google.inject.Binder;

/**
 * Use this class to register components to be used at runtime / without the
 * Equinox extension registry.
 */
public class XwcoreRuntimeModule extends
		pimar.editor.textual.xwcore.AbstractXwcoreRuntimeModule {

	@Override
	public Class<? extends IScopeProvider> bindIScopeProvider() {
		return super.bindIScopeProvider();
	}

	@Override
	public void configureSerializerIScopeProvider(Binder binder) {
		binder.bind(org.eclipse.xtext.scoping.IScopeProvider.class)
				.annotatedWith(
						org.eclipse.xtext.serializer.tokens.SerializerScopeProviderBinding.class)
				.to(XwcoreScopeProvider.class);
	}

	@Override
	public Class<? extends XtextResource> bindXtextResource() {
		return DerivedStateAwareResource.class;
	}

	public Class<? extends IResourceDescription.Manager> bindIResourceDescriptionManager() {
		return DerivedStateAwareResourceDescriptionManager.class;
	}

	public Class<? extends IDerivedStateComputer> bindIDerivedStateComputer() {
		return XwcoreDerivedStateComputer.class;
	}
	
	
}
