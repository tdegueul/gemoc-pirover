package rover.raspirover.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.melange.annotation.Containment;
import rover.raspirover.aspects.Project_ExecutableAspect;
import rover.raspirover.raspirover.Project;
import rover.raspirover.raspirover.RoverProgram;
import rover.raspirover.aspects.ProjectToProgramGlueProjectAspectProperties;

@Aspect(className = Project.class)
@SuppressWarnings("all")
public class ProjectToProgramGlue extends Project_ExecutableAspect {
  @Containment
  public static RoverProgram program(final Project _self) {
	final rover.raspirover.aspects.ProjectToProgramGlueProjectAspectProperties _self_ = rover.raspirover.aspects.ProjectToProgramGlueProjectAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_program(_self_, _self);
	;
	return (rover.raspirover.raspirover.RoverProgram) result;
}
  
  @Containment
  public static void program(final Project _self, final RoverProgram program) {
	final rover.raspirover.aspects.ProjectToProgramGlueProjectAspectProperties _self_ = rover.raspirover.aspects.ProjectToProgramGlueProjectAspectContext
			.getSelf(_self);
	_privk3_program(_self_, _self, program);
	;
}
  
  protected static RoverProgram _privk3_program(final ProjectToProgramGlueProjectAspectProperties _self_, final Project _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getProgram") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (rover.raspirover.raspirover.RoverProgram) ret;
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
