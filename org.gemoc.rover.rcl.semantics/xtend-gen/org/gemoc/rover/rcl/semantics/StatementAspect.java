package org.gemoc.rover.rcl.semantics;

import com.google.common.collect.Iterators;
import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Iterator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.gemoc.rover.rcl.semantics.StatementAspectStatementAspectProperties;
import rcl.RoverProgram;
import rcl.Statement;

@Aspect(className = Statement.class)
@SuppressWarnings("all")
public abstract class StatementAspect {
  @Abstract
  public static void eval(final Statement _self) {
    final org.gemoc.rover.rcl.semantics.StatementAspectStatementAspectProperties _self_ = org.gemoc.rover.rcl.semantics.StatementAspectStatementAspectContext.getSelf(_self);
     if (_self instanceof rcl.ForwardMinAction){
    					org.gemoc.rover.rcl.semantics.ForwardMinActionAspect.eval((rcl.ForwardMinAction)_self);
    } else  if (_self instanceof rcl.TurnDegAction){
    					org.gemoc.rover.rcl.semantics.TurnDegActionAspect.eval((rcl.TurnDegAction)_self);
    } else  if (_self instanceof rcl.Loop){
    					org.gemoc.rover.rcl.semantics.LoopAspect.eval((rcl.Loop)_self);
    } else  if (_self instanceof rcl.RclBlock){
    					org.gemoc.rover.rcl.semantics.RclBlockAspect.eval((rcl.RclBlock)_self);
    } else  if (_self instanceof rcl.ForwardAction){
    					org.gemoc.rover.rcl.semantics.ForwardActionAspect.eval((rcl.ForwardAction)_self);
    } else  if (_self instanceof rcl.StopAction){
    					org.gemoc.rover.rcl.semantics.StopActionAspect.eval((rcl.StopAction)_self);
    } else  if (_self instanceof rcl.LogAction){
    					org.gemoc.rover.rcl.semantics.LogActionAspect.eval((rcl.LogAction)_self);
    } else  if (_self instanceof rcl.SendAction){
    					org.gemoc.rover.rcl.semantics.SendActionAspect.eval((rcl.SendAction)_self);
    } else  if (_self instanceof rcl.BackwardMinAction){
    					org.gemoc.rover.rcl.semantics.BackwardMinActionAspect.eval((rcl.BackwardMinAction)_self);
    } else  if (_self instanceof rcl.VarAssignment){
    					org.gemoc.rover.rcl.semantics.VarAssignmentAspect.eval((rcl.VarAssignment)_self);
    } else  if (_self instanceof rcl.Conditional){
    					org.gemoc.rover.rcl.semantics.ConditionalAspect.eval((rcl.Conditional)_self);
    } else  if (_self instanceof rcl.BackwardAction){
    					org.gemoc.rover.rcl.semantics.BackwardActionAspect.eval((rcl.BackwardAction)_self);
    } else  if (_self instanceof rcl.TurnAction){
    					org.gemoc.rover.rcl.semantics.TurnActionAspect.eval((rcl.TurnAction)_self);
    } else  if (_self instanceof rcl.Statement){
    					org.gemoc.rover.rcl.semantics.StatementAspect._privk3_eval(_self_, (rcl.Statement)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  public static RoverProgram getProgram(final Statement _self) {
    final org.gemoc.rover.rcl.semantics.StatementAspectStatementAspectProperties _self_ = org.gemoc.rover.rcl.semantics.StatementAspectStatementAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_getProgram(_self_, _self);;
    return (rcl.RoverProgram)result;
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
