package rover.raspirover.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import rover.raspirover.aspects.Block_ExecutableAspect;
import rover.raspirover.aspects.Project_ExecutableAspectProjectAspectProperties;
import rover.raspirover.raspirover.Project;
import rover.raspirover.raspirover.Sketch;

@Aspect(className = Project.class)
@SuppressWarnings("all")
public class Project_ExecutableAspect {
  @Main
  public static void execute(final Project _self) {
	final rover.raspirover.aspects.Project_ExecutableAspectProjectAspectProperties _self_ = rover.raspirover.aspects.Project_ExecutableAspectProjectAspectContext
			.getSelf(_self);
	if (_self instanceof rover.raspirover.raspirover.Project) {
		rover.raspirover.aspects.OverriddenProjectInterpreter.execute((rover.raspirover.raspirover.Project) _self);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
}
  
  protected static void _privk3_execute(final Project_ExecutableAspectProjectAspectProperties _self_, final Project _self) {
    final EList<Sketch> sketches = _self.getSketches();
    while (true) {
      final Consumer<Sketch> _function = (Sketch s) -> {
        Block_ExecutableAspect.execute(s.getBlock());
      };
      sketches.forEach(_function);
    }
  }
}
