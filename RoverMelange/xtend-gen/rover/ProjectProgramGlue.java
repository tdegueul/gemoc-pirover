package rover;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.melange.annotation.Containment;
import org.gemoc.arduino.sequential.k3dsa.Project_ExecutableAspect;
import org.gemoc.rover.rcl.semantics.RoverProgramAspect;
import org.gemoc.sequential.model.arduino.Project;
import rcl.RoverProgram;
import rover.ProjectProgramGlueProjectAspectProperties;

@Aspect(className = Project.class)
@SuppressWarnings("all")
public class ProjectProgramGlue extends Project_ExecutableAspect {
  @OverrideAspectMethod
  public static void execute(final Project _self) {
    final rover.ProjectProgramGlueProjectAspectProperties _self_ = rover.ProjectProgramGlueProjectAspectContext.getSelf(_self);
    _privk3_execute(_self_, _self);;
  }
  
  @Containment
  public static RoverProgram program(final Project _self) {
    final rover.ProjectProgramGlueProjectAspectProperties _self_ = rover.ProjectProgramGlueProjectAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_program(_self_, _self);;
    return (rcl.RoverProgram)result;
  }
  
  @Containment
  public static void program(final Project _self, final RoverProgram program) {
    final rover.ProjectProgramGlueProjectAspectProperties _self_ = rover.ProjectProgramGlueProjectAspectContext.getSelf(_self);
    _privk3_program(_self_, _self,program);;
  }
  
  private static void super_execute(final Project _self) {
    final org.gemoc.arduino.sequential.k3dsa.Project_ExecutableAspectProjectAspectProperties _self_ = org.gemoc.arduino.sequential.k3dsa.Project_ExecutableAspectProjectAspectContext.getSelf(_self);
     org.gemoc.arduino.sequential.k3dsa.Project_ExecutableAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final ProjectProgramGlueProjectAspectProperties _self_, final Project _self) {
    RoverProgram _program = ProjectProgramGlue.program(_self);
    RoverProgramAspect.run(_program);
  }
  
  protected static RoverProgram _privk3_program(final ProjectProgramGlueProjectAspectProperties _self_, final Project _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getProgram") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (rcl.RoverProgram) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.program;
  }
  
  protected static void _privk3_program(final ProjectProgramGlueProjectAspectProperties _self_, final Project _self, final RoverProgram program) {
    _self_.program = program; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setProgram")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, program);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
