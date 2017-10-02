package org.gemoc.rover.rcl.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.function.Consumer;
import org.gemoc.rover.rcl.semantics.RclBlockAspectRclBlockAspectProperties;
import org.gemoc.rover.rcl.semantics.StatementAspect;
import rcl.RclBlock;
import rcl.Statement;

@Aspect(className = RclBlock.class)
@SuppressWarnings("all")
public class RclBlockAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void eval(final RclBlock _self) {
    final org.gemoc.rover.rcl.semantics.RclBlockAspectRclBlockAspectProperties _self_ = org.gemoc.rover.rcl.semantics.RclBlockAspectRclBlockAspectContext.getSelf(_self);
     if (_self instanceof rcl.RclBlock){
    					org.gemoc.rover.rcl.semantics.RclBlockAspect._privk3_eval(_self_, (rcl.RclBlock)_self);
    } else  if (_self instanceof rcl.Statement){
    					org.gemoc.rover.rcl.semantics.StatementAspect.eval((rcl.Statement)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_eval(final RclBlockAspectRclBlockAspectProperties _self_, final RclBlock _self) {
    final Consumer<Statement> _function = (Statement it) -> {
      StatementAspect.eval(it);
    };
    _self.getStmts().forEach(_function);
  }
}
