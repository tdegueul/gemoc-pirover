package rover.arduinoml.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import rover.arduinoml.aspects.Block_ExecutableAspect;
import rover.arduinoml.aspects.Project_ExecutableAspectProjectAspectProperties;
import rover.arduinoml.arduino.Project;
import rover.arduinoml.arduino.Sketch;

@Aspect(className = Project.class)
@SuppressWarnings("all")
public class Project_ExecutableAspect {
  @Main
  public static void execute(final Project _self) {
	final rover.arduinoml.aspects.Project_ExecutableAspectProjectAspectProperties _self_ = rover.arduinoml.aspects.Project_ExecutableAspectProjectAspectContext
			.getSelf(_self);
	_privk3_execute(_self_, _self);
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
