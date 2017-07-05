package rover.raspirover.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import rover.raspirover.aspects.RoverProgramAspect;
import rover.raspirover.aspects.StatementAspect;
import rover.raspirover.aspects.VarAssignmentAspectVarAssignmentAspectProperties;
import rover.raspirover.raspirover.RoverProgram;
import rover.raspirover.raspirover.RoverValue;
import rover.raspirover.raspirover.VarAssignment;

@Aspect(className = VarAssignment.class)
@SuppressWarnings("all")
public class VarAssignmentAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void eval(final VarAssignment _self) {
	final rover.raspirover.aspects.VarAssignmentAspectVarAssignmentAspectProperties _self_ = rover.raspirover.aspects.VarAssignmentAspectVarAssignmentAspectContext
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
