/*
 * generated by Xtext 2.12.0
 */
package rover.raspirover.xtext.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class RaspiRoverAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("rover/raspirover/xtext/parser/antlr/internal/InternalRaspiRover.tokens");
	}
}
