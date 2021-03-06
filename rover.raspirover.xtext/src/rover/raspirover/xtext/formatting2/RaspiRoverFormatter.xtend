/*
 * generated by Xtext 2.12.0
 */
package rover.raspirover.xtext.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import rover.raspirover.raspirover.Board
import rover.raspirover.raspirover.Param
import rover.raspirover.raspirover.Project
import rover.raspirover.raspirover.RoverProgram
import rover.raspirover.xtext.services.RaspiRoverGrammarAccess

class RaspiRoverFormatter extends AbstractFormatter2 {
	
	@Inject extension RaspiRoverGrammarAccess

	def dispatch void format(Project project, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Board board : project.getBoards()) {
			board.format;
		}
		project.getProgram.format;
	}

	def dispatch void format(RoverProgram roverProgram, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Param param : roverProgram.getParams()) {
			param.format;
		}
		roverProgram.getBlock.format;
	}
	
	// TODO: implement for RasPiBoard, RclBlock, VarAssignment, Conditional, Loop, ForwardMinAction, BackwardMinAction, TurnDegAction, VarRef, TemperatureQuery, HumidityQuery, NumberValue, NumericExpression, StringExpression, BooleanExpression
}
