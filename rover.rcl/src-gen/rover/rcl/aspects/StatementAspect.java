package rover.rcl.aspects;

import com.google.common.collect.Iterators;
import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import rover.rcl.aspects.StatementAspectStatementAspectProperties;
import rover.rcl.rcl.RoverProgram;
import rover.rcl.rcl.Statement;

@Aspect(className = Statement.class)
@SuppressWarnings("all")
public abstract class StatementAspect {
  @Abstract
  public static void eval(final Statement _self) {
	final rover.rcl.aspects.StatementAspectStatementAspectProperties _self_ = rover.rcl.aspects.StatementAspectStatementAspectContext
			.getSelf(_self);
	if (_self instanceof rover.rcl.rcl.BackwardMinAction) {
		rover.rcl.aspects.BackwardMinActionAspect.eval((rover.rcl.rcl.BackwardMinAction) _self);
	} else if (_self instanceof rover.rcl.rcl.TurnAction) {
		rover.rcl.aspects.TurnActionAspect.eval((rover.rcl.rcl.TurnAction) _self);
	} else if (_self instanceof rover.rcl.rcl.ForwardAction) {
		rover.rcl.aspects.ForwardActionAspect.eval((rover.rcl.rcl.ForwardAction) _self);
	} else if (_self instanceof rover.rcl.rcl.VarRef) {
		rover.rcl.aspects.StatementAspect._privk3_eval(_self_, (rover.rcl.rcl.VarRef) _self);
	} else if (_self instanceof rover.rcl.rcl.LogAction) {
		rover.rcl.aspects.LogActionAspect.eval((rover.rcl.rcl.LogAction) _self);
	} else if (_self instanceof rover.rcl.rcl.StopAction) {
		rover.rcl.aspects.StopActionAspect.eval((rover.rcl.rcl.StopAction) _self);
	} else if (_self instanceof rover.rcl.rcl.BackwardAction) {
		rover.rcl.aspects.BackwardActionAspect.eval((rover.rcl.rcl.BackwardAction) _self);
	} else if (_self instanceof rover.rcl.rcl.TurnDegAction) {
		rover.rcl.aspects.TurnDegActionAspect.eval((rover.rcl.rcl.TurnDegAction) _self);
	} else if (_self instanceof rover.rcl.rcl.ForwardMinAction) {
		rover.rcl.aspects.ForwardMinActionAspect.eval((rover.rcl.rcl.ForwardMinAction) _self);
	} else if (_self instanceof rover.rcl.rcl.SendAction) {
		rover.rcl.aspects.SendActionAspect.eval((rover.rcl.rcl.SendAction) _self);
	} else if (_self instanceof rover.rcl.rcl.Action) {
		rover.rcl.aspects.StatementAspect._privk3_eval(_self_, (rover.rcl.rcl.Action) _self);
	} else if (_self instanceof rover.rcl.rcl.Conditional) {
		rover.rcl.aspects.ConditionalAspect.eval((rover.rcl.rcl.Conditional) _self);
	} else if (_self instanceof rover.rcl.rcl.Loop) {
		rover.rcl.aspects.LoopAspect.eval((rover.rcl.rcl.Loop) _self);
	} else if (_self instanceof rover.rcl.rcl.RclBlock) {
		rover.rcl.aspects.RclBlockAspect.eval((rover.rcl.rcl.RclBlock) _self);
	} else if (_self instanceof rover.rcl.rcl.VarAssignment) {
		rover.rcl.aspects.VarAssignmentAspect.eval((rover.rcl.rcl.VarAssignment) _self);
	} else if (_self instanceof rover.rcl.rcl.Statement) {
		rover.rcl.aspects.StatementAspect._privk3_eval(_self_, (rover.rcl.rcl.Statement) _self);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
}
  
  public static RoverProgram getProgram(final Statement _self) {
	final rover.rcl.aspects.StatementAspectStatementAspectProperties _self_ = rover.rcl.aspects.StatementAspectStatementAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_getProgram(_self_, _self);
	;
	return (rover.rcl.rcl.RoverProgram) result;
}
  
  protected static void _privk3_eval(final StatementAspectStatementAspectProperties _self_, final Statement _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
  
  protected static RoverProgram _privk3_getProgram(final StatementAspectStatementAspectProperties _self_, final Statement _self) {
    return IteratorExtensions.<RoverProgram>head(Iterators.<RoverProgram>filter(_self.eResource().getAllContents(), RoverProgram.class));
  }
}
