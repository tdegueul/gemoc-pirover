package rover.rcl.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import rover.rcl.aspects.RoverProgramAspect;
import rover.rcl.aspects.StatementAspect;
import rover.rcl.aspects.VarAssignmentAspectVarAssignmentAspectProperties;
import rover.rcl.rcl.RoverProgram;
import rover.rcl.rcl.RoverValue;
import rover.rcl.rcl.VarAssignment;

@Aspect(className = VarAssignment.class)
@SuppressWarnings("all")
public class VarAssignmentAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void eval(final VarAssignment _self) {
	final rover.rcl.aspects.VarAssignmentAspectVarAssignmentAspectProperties _self_ = rover.rcl.aspects.VarAssignmentAspectVarAssignmentAspectContext
			.getSelf(_self);
	_privk3_eval(_self_, _self);
	;
}
  
  protected static void _privk3_eval(final VarAssignmentAspectVarAssignmentAspectProperties _self_, final VarAssignment _self) {
    RoverProgram _program = StatementAspect.getProgram(_self);
    String _name = _self.getName();
    RoverValue _value = _self.getValue();
    RoverProgramAspect.bindVar(_program, _name, _value);
  }
}
