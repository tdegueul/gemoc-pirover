package rover

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.inria.diverse.melange.annotation.Containment
import org.gemoc.arduino.sequential.k3dsa.Project_ExecutableAspect
import org.gemoc.rover.rcl.semantics.NumberValueAspect
import org.gemoc.sequential.model.arduino.Project
import org.modelexecution.units.Unit
import rcl.NumberValue
import rcl.RoverProgram

import static extension org.gemoc.rover.rcl.semantics.RoverProgramAspect.*

@Aspect(className = NumberValue)
class NumberValueUnit extends NumberValueAspect {
	@Containment public Unit unit
}

@Aspect(className = Project)
class ProjectProgramGlue extends Project_ExecutableAspect {
	@Containment public RoverProgram program

	@OverrideAspectMethod
	override void execute() {
		_self.program.run
	}
}
