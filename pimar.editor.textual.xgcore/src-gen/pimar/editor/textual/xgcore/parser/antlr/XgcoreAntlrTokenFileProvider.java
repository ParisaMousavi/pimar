/*
* generated by Xtext
*/
package pimar.editor.textual.xgcore.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class XgcoreAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("pimar/editor/textual/xgcore/parser/antlr/internal/InternalXgcore.tokens");
	}
}
