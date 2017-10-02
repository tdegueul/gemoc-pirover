package rover

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.inria.diverse.melange.annotation.Containment
import org.gemoc.arduino.sequential.k3dsa.Project_ExecutableAspect
import org.gemoc.rover.rcl.semantics.ActionAspect
import org.gemoc.rover.rcl.semantics.BackwardMinActionAspect
import org.gemoc.rover.rcl.semantics.NumberValueAspect
import org.gemoc.sequential.model.arduino.Pin
import org.gemoc.sequential.model.arduino.Project
import org.modelexecution.units.Unit
import rcl.Action
import rcl.BackwardMinAction
import rcl.NumberValue
import rcl.RoverProgram

import static extension org.gemoc.arduino.sequential.k3dsa.Pin_EvaluableAspect.*
import static extension org.gemoc.rover.rcl.semantics.RoverProgramAspect.*
import static extension org.modelexecution.units.semantics.LengthUnitAspect.*
import static extension rover.ActionToPin.*
import static extension rover.NumberValueUnit.*

@Aspect(className = Project)
class ProjectProgramGlue extends Project_ExecutableAspect {
	@Containment public RoverProgram program

	@OverrideAspectMethod
	override void execute() {
		_self.program.run
	}
}

@Aspect(className = Action)
class ActionToPin extends ActionAspect {
	public Pin associatedPin
}

@Aspect(className = BackwardMinAction)
class BackwardMinActionWithPin extends BackwardMinActionAspect {
	@OverrideAspectMethod
	override void eval() {
		println('''<backward («_self.distance.print» = «_self.distance.intValue»cm)>"''')
		_self.associatedPin.level = 1
	}
}

@Aspect(className = NumberValue)
class NumberValueUnit extends NumberValueAspect {
	@Containment public Unit unit
	
	@OverrideAspectMethod
	override int getIntValue() {
		return
			if (_self.unit !== null)
				Math::round(_self.unit.toCentimeters(_self.NValue)) as int
			else
				_self.super_getIntValue
	}
	
	@OverrideAspectMethod
	override String print() {
		return _self.super_print + _self.unit.print
	}
}
