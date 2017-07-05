package rover.raspirover.aspects;

import com.google.common.collect.Iterators;
import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Iterator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import rover.raspirover.aspects.StatementAspectStatementAspectProperties;
import rover.raspirover.raspirover.RoverProgram;
import rover.raspirover.raspirover.Statement;

@Aspect(className = Statement.class)
@SuppressWarnings("all")
public abstract class StatementAspect {
  @Abstract
  public static void eval(final Statement _self) {
	final rover.raspirover.aspects.StatementAspectStatementAspectProperties _self_ = rover.raspirover.aspects.StatementAspectStatementAspectContext
			.getSelf(_self);
	if (_self instanceof rover.raspirover.raspirover.ForwardAction) {
		rover.raspirover.aspects.ForwardActionAspect.eval((rover.raspirover.raspirover.ForwardAction) _self);
	} else if (_self instanceof rover.raspirover.raspirover.TurnDegAction) {
		rover.raspirover.aspects.TurnDegActionAspect.eval((rover.raspirover.raspirover.TurnDegAction) _self);
	} else if (_self instanceof rover.raspirover.raspirover.Loop) {
		rover.raspirover.aspects.LoopAspect.eval((rover.raspirover.raspirover.Loop) _self);
	} else if (_self instanceof rover.raspirover.raspirover.TurnAction) {
		rover.raspirover.aspects.TurnActionAspect.eval((rover.raspirover.raspirover.TurnAction) _self);
	} else if (_self instanceof rover.raspirover.raspirover.StopAction) {
		rover.raspirover.aspects.StopActionAspect.eval((rover.raspirover.raspirover.StopAction) _self);
	} else if (_self instanceof rover.raspirover.raspirover.SendAction) {
		rover.raspirover.aspects.SendActionAspect.eval((rover.raspirover.raspirover.SendAction) _self);
	} else if (_self instanceof rover.raspirover.raspirover.BackwardAction) {
		rover.raspirover.aspects.BackwardActionAspect.eval((rover.raspirover.raspirover.BackwardAction) _self);
	} else if (_self instanceof rover.raspirover.raspirover.VarAssignment) {
		rover.raspirover.aspects.VarAssignmentAspect.eval((rover.raspirover.raspirover.VarAssignment) _self);
	} else if (_self instanceof rover.raspirover.raspirover.LogAction) {
		rover.raspirover.aspects.LogActionAspect.eval((rover.raspirover.raspirover.LogAction) _self);
	} else if (_self instanceof rover.raspirover.raspirover.BackwardMinAction) {
		rover.raspirover.aspects.BackwardMinActionAspect.eval((rover.raspirover.raspirover.BackwardMinAction) _self);
	} else if (_self instanceof rover.raspirover.raspirover.ForwardMinAction) {
		rover.raspirover.aspects.ForwardMinActionAspect.eval((rover.raspirover.raspirover.ForwardMinAction) _self);
	} else if (_self instanceof rover.raspirover.raspirover.Action) {
		rover.raspirover.aspects.StatementAspect._privk3_eval(_self_, (rover.raspirover.raspirover.Action) _self);
	} else if (_self instanceof rover.raspirover.raspirover.VarRef) {
		rover.raspirover.aspects.StatementAspect._privk3_eval(_self_, (rover.raspirover.raspirover.VarRef) _self);
	} else if (_self instanceof rover.raspirover.raspirover.Conditional) {
		rover.raspirover.aspects.ConditionalAspect.eval((rover.raspirover.raspirover.Conditional) _self);
	} else if (_self instanceof rover.raspirover.raspirover.RclBlock) {
		rover.raspirover.aspects.RclBlockAspect.eval((rover.raspirover.raspirover.RclBlock) _self);
	} else if (_self instanceof rover.raspirover.raspirover.Statement) {
		rover.raspirover.aspects.StatementAspect._privk3_eval(_self_, (rover.raspirover.raspirover.Statement) _self);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
}
  
  public static RoverProgram getProgram(final Statement _self) {
	final rover.raspirover.aspects.StatementAspectStatementAspectProperties _self_ = rover.raspirover.aspects.StatementAspectStatementAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_getProgram(_self_, _self);
	;
	return (rover.raspirover.raspirover.RoverProgram) result;
}
  
  protected static void _privk3_eval(final StatementAspectStatementAspectProperties _self_, final Statement _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
  
  protected static RoverProgram _privk3_getProgram(final StatementAspectStatementAspectProperties _self_, final Statement _self) {
    Resource _eResource = _self.eResource();
    TreeIterator<EObject> _allContents = _eResource.getAllContents();
    Iterator<RoverProgram> _filter = Iterators.<RoverProgram>filter(_allContents, RoverProgram.class);
    return IteratorExtensions.<RoverProgram>head(_filter);
  }
}
