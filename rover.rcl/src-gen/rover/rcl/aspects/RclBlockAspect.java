package rover.rcl.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.function.Consumer;
import rover.rcl.aspects.RclBlockAspectRclBlockAspectProperties;
import rover.rcl.aspects.StatementAspect;
import rover.rcl.rcl.RclBlock;
import rover.rcl.rcl.Statement;

@Aspect(className = RclBlock.class)
@SuppressWarnings("all")
public class RclBlockAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void eval(final RclBlock _self) {
	final rover.rcl.aspects.RclBlockAspectRclBlockAspectProperties _self_ = rover.rcl.aspects.RclBlockAspectRclBlockAspectContext
			.getSelf(_self);
	_privk3_eval(_self_, _self);
	;
}
  
  protected static void _privk3_eval(final RclBlockAspectRclBlockAspectProperties _self_, final RclBlock _self) {
    final Consumer<Statement> _function = (Statement it) -> {
      StatementAspect.eval(it);
    };
    _self.getStmts().forEach(_function);
  }
}
