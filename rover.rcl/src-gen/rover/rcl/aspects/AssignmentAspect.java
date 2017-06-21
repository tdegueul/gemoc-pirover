package rover.rcl.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import rover.rcl.aspects.AssignmentAspectAssignmentAspectProperties;
import rover.rcl.aspects.RoverProgramAspect;
import rover.rcl.aspects.StatementAspect;
import rover.rcl.rcl.Assignment;
import rover.rcl.rcl.RoverProgram;
import rover.rcl.rcl.RoverValue;

@Aspect(className = Assignment.class)
@SuppressWarnings("all")
public class AssignmentAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void eval(final Assignment _self) {
	final rover.rcl.aspects.AssignmentAspectAssignmentAspectProperties _self_ = rover.rcl.aspects.AssignmentAspectAssignmentAspectContext
			.getSelf(_self);
	_privk3_eval(_self_, _self);
	;
}
  
  protected static void _privk3_eval(final AssignmentAspectAssignmentAspectProperties _self_, final Assignment _self) {
    RoverProgram _program = StatementAspect.getProgram(_self);
    String _name = _self.getName();
    RoverValue _value = _self.getValue();
    RoverProgramAspect.bindVar(_program, _name, _value);
  }
}
