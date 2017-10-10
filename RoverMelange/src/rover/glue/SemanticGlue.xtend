package rover.glue

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import org.gemoc.arduino.sequential.k3dsa.Project_ExecutableAspect
import org.gemoc.rover.rcl.semantics.BackwardMinActionAspect
import org.gemoc.rover.rcl.semantics.LogActionAspect
import org.gemoc.rover.rcl.semantics.NumberValueAspect
import org.gemoc.sequential.model.arduino.ArduinoBoard
import org.gemoc.sequential.model.arduino.Project
import rcl.BackwardMinAction
import rcl.LogAction
import rcl.NumberValue

import static extension org.gemoc.arduino.sequential.k3dsa.Pin_EvaluableAspect.*
import static extension org.gemoc.rover.rcl.semantics.NumberValueAspect.*
import static extension org.gemoc.rover.rcl.semantics.RoverProgramAspect.*
import static extension org.modelexecution.units.semantics.QuantityAspect.*
import static extension rover.glue.ActionToPinGlue.*
import static extension rover.glue.NumberToQuantityGlue.*
import static extension rover.glue.ProjectToProgramGlue.*

@Aspect(className = Project)
class OverriddenProjectInterpreter extends Project_ExecutableAspect {
	@OverrideAspectMethod
	override void execute() {
		_self.program.run
	}
}

@Aspect(className = BackwardMinAction)
class OverriddenBackwardMinActionInterpreter extends BackwardMinActionAspect {
	@OverrideAspectMethod
	override void eval() {
		println('''<backward («_self.distance.print» = «_self.distance.intValue»cm)>"''')
		_self.associatedPin.level = 1
	}
}

@Aspect(className = NumberValue)
class OverriddenNumberInterpreter extends NumberValueAspect {	
	@OverrideAspectMethod
	override int getIntValue() {
		return
			if (_self.quantity !== null)
				_self.quantity.normalized as int
			else
				_self.super_getIntValue
	}
	
	@OverrideAspectMethod
	override String print() {
		return
			if (_self.quantity !== null)
				_self.quantity.print
			else
				_self.super_print
	}
}

@Aspect(className = LogAction)
class DebugLogAction extends LogActionAspect {
	@OverrideAspectMethod
	override void eval() {
		_self.super_eval
		println("Pins: " + _self.board.analogPins.map[level] + " || " + _self.board.digitalPins.map[level])
	}

	private def ArduinoBoard getBoard() {
		return (_self.eResource.contents.head as Project).boards.head as ArduinoBoard
	}
}
