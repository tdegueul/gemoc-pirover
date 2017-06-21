package org.gemoc.rover.rcl.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.rover.rcl.semantics.AssignmentAspectAssignmentAspectProperties;
import org.gemoc.rover.rcl.semantics.RoverProgramAspect;
import org.gemoc.rover.rcl.semantics.StatementAspect;
import rcl.Assignment;
import rcl.RoverProgram;
import rcl.RoverValue;

@Aspect(className = Assignment.class)
@SuppressWarnings("all")
public class AssignmentAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void eval(final Assignment _self) {
    final org.gemoc.rover.rcl.semantics.AssignmentAspectAssignmentAspectProperties _self_ = org.gemoc.rover.rcl.semantics.AssignmentAspectAssignmentAspectContext.getSelf(_self);
     if (_self instanceof rcl.Assignment){
    					org.gemoc.rover.rcl.semantics.AssignmentAspect._privk3_eval(_self_, (rcl.Assignment)_self);
    } else  if (_self instanceof rcl.Statement){
    					org.gemoc.rover.rcl.semantics.StatementAspect.eval((rcl.Statement)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_eval(final AssignmentAspectAssignmentAspectProperties _self_, final Assignment _self) {
    RoverProgram _program = StatementAspect.getProgram(_self);
    String _name = _self.getName();
    RoverValue _value = _self.getValue();
    RoverProgramAspect.bindVar(_program, _name, _value);
  }
}
