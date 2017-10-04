package rover.raspirover.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import rover.raspirover.aspects.Project_ExecutableAspect;
import rover.raspirover.aspects.RoverProgramAspect;
import rover.raspirover.raspirover.Project;
import rover.raspirover.aspects.OverriddenProjectInterpreterProjectAspectProperties;
import rover.raspirover.aspects.ProjectToProgramGlue;

@Aspect(className = Project.class)
@SuppressWarnings("all")
public class OverriddenProjectInterpreter extends Project_ExecutableAspect {
  @OverrideAspectMethod
  public static void execute(final Project _self) {
	final rover.raspirover.aspects.OverriddenProjectInterpreterProjectAspectProperties _self_ = rover.raspirover.aspects.OverriddenProjectInterpreterProjectAspectContext
			.getSelf(_self);
	_privk3_execute(_self_, _self);
	;
}
  
  private static void super_execute(final Project _self) {
    final rover.raspirover.aspects.Project_ExecutableAspectProjectAspectProperties _self_ = rover.raspirover.aspects.Project_ExecutableAspectProjectAspectContext.getSelf(_self);
     rover.raspirover.aspects.Project_ExecutableAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final OverriddenProjectInterpreterProjectAspectProperties _self_, final Project _self) {
    RoverProgramAspect.run(ProjectToProgramGlue.program(_self));
  }
}
