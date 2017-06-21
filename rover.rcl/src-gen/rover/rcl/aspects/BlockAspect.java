package rover.rcl.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import rover.rcl.aspects.BlockAspectBlockAspectProperties;
import rover.rcl.aspects.StatementAspect;
import rover.rcl.rcl.Block;
import rover.rcl.rcl.Statement;

@Aspect(className = Block.class)
@SuppressWarnings("all")
public class BlockAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void eval(final Block _self) {
	final rover.rcl.aspects.BlockAspectBlockAspectProperties _self_ = rover.rcl.aspects.BlockAspectBlockAspectContext
			.getSelf(_self);
	_privk3_eval(_self_, _self);
	;
}
  
  protected static void _privk3_eval(final BlockAspectBlockAspectProperties _self_, final Block _self) {
    EList<Statement> _stmts = _self.getStmts();
    final Consumer<Statement> _function = (Statement it) -> {
      StatementAspect.eval(it);
    };
    _stmts.forEach(_function);
  }
}
