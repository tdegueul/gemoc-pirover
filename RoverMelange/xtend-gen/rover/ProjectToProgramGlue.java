package rover;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.melange.annotation.Containment;
import org.gemoc.arduino.sequential.k3dsa.Project_ExecutableAspect;
import org.gemoc.sequential.model.arduino.Project;
import rcl.RoverProgram;
import rover.ProjectToProgramGlueProjectAspectProperties;

@Aspect(className = Project.class)
@SuppressWarnings("all")
public class ProjectToProgramGlue extends Project_ExecutableAspect {
  @Containment
  public static RoverProgram program(final Project _self) {
    final rover.ProjectToProgramGlueProjectAspectProperties _self_ = rover.ProjectToProgramGlueProjectAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_program(_self_, _self);;
    return (rcl.RoverProgram)result;
  }
  
  @Containment
  public static void program(final Project _self, final RoverProgram program) {
    final rover.ProjectToProgramGlueProjectAspectProperties _self_ = rover.ProjectToProgramGlueProjectAspectContext.getSelf(_self);
    _privk3_program(_self_, _self,program);;
  }
  
  protected static RoverProgram _privk3_program(final ProjectToProgramGlueProjectAspectProperties _self_, final Project _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getProgram") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (rcl.RoverProgram) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.program;
  }
  
  protected static void _privk3_program(final ProjectToProgramGlueProjectAspectProperties _self_, final Project _self, final RoverProgram program) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setProgram")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, program);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.program = program;
    }
  }
}
