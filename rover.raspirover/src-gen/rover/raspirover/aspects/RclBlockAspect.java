package rover.raspirover.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import rover.raspirover.aspects.RclBlockAspectRclBlockAspectProperties;
import rover.raspirover.aspects.StatementAspect;
import rover.raspirover.raspirover.RclBlock;
import rover.raspirover.raspirover.Statement;

@Aspect(className = RclBlock.class)
@SuppressWarnings("all")
public class RclBlockAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void eval(final RclBlock _self) {
	final rover.raspirover.aspects.RclBlockAspectRclBlockAspectProperties _self_ = rover.raspirover.aspects.RclBlockAspectRclBlockAspectContext
			.getSelf(_self);
	_privk3_eval(_self_, _self);
	;
}
  
  protected static void _privk3_eval(final RclBlockAspectRclBlockAspectProperties _self_, final RclBlock _self) {
    EList<Statement> _stmts = _self.getStmts();
    final Consumer<Statement> _function = (Statement it) -> {
      StatementAspect.eval(it);
    };
    _stmts.forEach(_function);
  }
}
