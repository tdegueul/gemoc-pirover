package org.gemoc.rover.rcl.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.rover.rcl.semantics.RoverProgramAspect;
import org.gemoc.rover.rcl.semantics.StatementAspect;
import org.gemoc.rover.rcl.semantics.VarAssignmentAspectVarAssignmentAspectProperties;
import rcl.VarAssignment;

@Aspect(className = VarAssignment.class)
@SuppressWarnings("all")
public class VarAssignmentAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void eval(final VarAssignment _self) {
    final org.gemoc.rover.rcl.semantics.VarAssignmentAspectVarAssignmentAspectProperties _self_ = org.gemoc.rover.rcl.semantics.VarAssignmentAspectVarAssignmentAspectContext.getSelf(_self);
     if (_self instanceof rcl.VarAssignment){
    					org.gemoc.rover.rcl.semantics.VarAssignmentAspect._privk3_eval(_self_, (rcl.VarAssignment)_self);
    } else  if (_self instanceof rcl.Statement){
    					org.gemoc.rover.rcl.semantics.StatementAspect.eval((rcl.Statement)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_eval(final VarAssignmentAspectVarAssignmentAspectProperties _self_, final VarAssignment _self) {
    RoverProgramAspect.bindVar(StatementAspect.getProgram(_self), _self.getName(), _self.getValue());
  }
}
