package org.gemoc.rover.rcl.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.gemoc.rover.rcl.semantics.BlockAspectBlockAspectProperties;
import org.gemoc.rover.rcl.semantics.StatementAspect;
import rcl.Block;
import rcl.Statement;

@Aspect(className = Block.class)
@SuppressWarnings("all")
public class BlockAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void eval(final Block _self) {
    final org.gemoc.rover.rcl.semantics.BlockAspectBlockAspectProperties _self_ = org.gemoc.rover.rcl.semantics.BlockAspectBlockAspectContext.getSelf(_self);
     if (_self instanceof rcl.Block){
    					org.gemoc.rover.rcl.semantics.BlockAspect._privk3_eval(_self_, (rcl.Block)_self);
    } else  if (_self instanceof rcl.Statement){
    					org.gemoc.rover.rcl.semantics.StatementAspect.eval((rcl.Statement)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_eval(final BlockAspectBlockAspectProperties _self_, final Block _self) {
    EList<Statement> _stmts = _self.getStmts();
    final Consumer<Statement> _function = (Statement it) -> {
      StatementAspect.eval(it);
    };
    _stmts.forEach(_function);
  }
}
