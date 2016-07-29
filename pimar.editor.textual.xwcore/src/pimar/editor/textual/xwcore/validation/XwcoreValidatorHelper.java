package pimar.editor.textual.xwcore.validation;

import java.util.List;

import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification;
import org.eclipse.xtext.ui.editor.model.edit.IssueModificationContext;
import org.eclipse.xtext.ui.editor.model.edit.SemanticModificationWrapper;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolution;
import org.eclipse.xtext.validation.Issue;

import com.google.common.collect.Lists;
import com.google.inject.Inject;


public class XwcoreValidatorHelper {

	
	public static long getCurrentTimeMillis(){
		return System.currentTimeMillis();
	}
	private List<IssueResolution> issueResolutions = Lists.newArrayList();
	private IssueModificationContext.Factory modificationContextFactory;
	
	@Inject
	public XwcoreValidatorHelper(IssueModificationContext.Factory modificationContextFactory) {
		this.modificationContextFactory = modificationContextFactory;
	}
	
	public void accept(Issue issue, String label, String description, String image, ISemanticModification semanticModification) {
		SemanticModificationWrapper modificationWrapper = new SemanticModificationWrapper(issue.getUriToProblem(), semanticModification);
		issueResolutions.add(new IssueResolution(label, description, image, modificationContextFactory.createModificationContext(issue),
				modificationWrapper));
	}
}
