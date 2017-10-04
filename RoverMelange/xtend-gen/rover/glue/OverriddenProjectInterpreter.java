package rover.glue;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.arduino.sequential.k3dsa.Project_ExecutableAspect;
import org.gemoc.rover.rcl.semantics.RoverProgramAspect;
import org.gemoc.sequential.model.arduino.Project;
import rover.glue.OverriddenProjectInterpreterProjectAspectProperties;
import rover.glue.ProjectToProgramGlue;

@Aspect(className = Project.class)
@SuppressWarnings("all")
public class OverriddenProjectInterpreter extends Project_ExecutableAspect {
  @OverrideAspectMethod
  public static void execute(final Project _self) {
    final rover.glue.OverriddenProjectInterpreterProjectAspectProperties _self_ = rover.glue.OverriddenProjectInterpreterProjectAspectContext.getSelf(_self);
    _privk3_execute(_self_, _self);;
  }
  
  private static void super_execute(final Project _self) {
    final org.gemoc.arduino.sequential.k3dsa.Project_ExecutableAspectProjectAspectProperties _self_ = org.gemoc.arduino.sequential.k3dsa.Project_ExecutableAspectProjectAspectContext.getSelf(_self);
     org.gemoc.arduino.sequential.k3dsa.Project_ExecutableAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final OverriddenProjectInterpreterProjectAspectProperties _self_, final Project _self) {
    RoverProgramAspect.run(ProjectToProgramGlue.program(_self));
  }
}
