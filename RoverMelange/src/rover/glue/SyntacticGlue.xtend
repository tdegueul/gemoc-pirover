package rover.glue

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.melange.annotation.Containment
import org.gemoc.arduino.sequential.k3dsa.Project_ExecutableAspect
import org.gemoc.rover.rcl.semantics.ActionAspect
import org.gemoc.rover.rcl.semantics.NumberValueAspect
import org.gemoc.sequential.model.arduino.Pin
import org.gemoc.sequential.model.arduino.Project
import org.modelexecution.units.Unit
import rcl.Action
import rcl.NumberValue
import rcl.RoverProgram

@Aspect(className = Project)
class ProjectToProgramGlue extends Project_ExecutableAspect {
	@Containment public RoverProgram program
}

@Aspect(className = Action)
class ActionToPinGlue extends ActionAspect {
	public Pin associatedPin
}

@Aspect(className = NumberValue)
class NumberToUnitGlue extends NumberValueAspect {
	@Containment public Unit unit
}
