package rover.rcl.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import java.util.Map;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import rover.rcl.aspects.RoverProgramAspectRoverProgramAspectProperties;
import rover.rcl.aspects.StatementAspect;
import rover.rcl.rcl.NumberValue;
import rover.rcl.rcl.Param;
import rover.rcl.rcl.RclBlock;
import rover.rcl.rcl.RclFactory;
import rover.rcl.rcl.RoverProgram;
import rover.rcl.rcl.RoverValue;

@Aspect(className = RoverProgram.class)
@SuppressWarnings("all")
public class RoverProgramAspect {
  public static RoverValue getVar(final RoverProgram _self, final String n) {
	final rover.rcl.aspects.RoverProgramAspectRoverProgramAspectProperties _self_ = rover.rcl.aspects.RoverProgramAspectRoverProgramAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_getVar(_self_, _self, n);
	;
	return (rover.rcl.rcl.RoverValue) result;
}
  
  public static void bindVar(final RoverProgram _self, final String n, final RoverValue v) {
	final rover.rcl.aspects.RoverProgramAspectRoverProgramAspectProperties _self_ = rover.rcl.aspects.RoverProgramAspectRoverProgramAspectContext
			.getSelf(_self);
	_privk3_bindVar(_self_, _self, n, v);
	;
}
  
  @Main
  public static void run(final RoverProgram _self) {
	final rover.rcl.aspects.RoverProgramAspectRoverProgramAspectProperties _self_ = rover.rcl.aspects.RoverProgramAspectRoverProgramAspectContext
			.getSelf(_self);
	_privk3_run(_self_, _self);
	;
}
  
  private static Map<String, RoverValue> vars(final RoverProgram _self) {
    final rover.rcl.aspects.RoverProgramAspectRoverProgramAspectProperties _self_ = rover.rcl.aspects.RoverProgramAspectRoverProgramAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_vars(_self_, _self);;
    return (java.util.Map<java.lang.String, rover.rcl.rcl.RoverValue>)result;
  }
  
  private static void vars(final RoverProgram _self, final Map<String, RoverValue> vars) {
    final rover.rcl.aspects.RoverProgramAspectRoverProgramAspectProperties _self_ = rover.rcl.aspects.RoverProgramAspectRoverProgramAspectContext.getSelf(_self);
    _privk3_vars(_self_, _self,vars);;
  }
  
  protected static RoverValue _privk3_getVar(final RoverProgramAspectRoverProgramAspectProperties _self_, final RoverProgram _self, final String n) {
    Map<String, RoverValue> _vars = RoverProgramAspect.vars(_self);
    return _vars.get(n);
  }
  
  protected static void _privk3_bindVar(final RoverProgramAspectRoverProgramAspectProperties _self_, final RoverProgram _self, final String n, final RoverValue v) {
    Map<String, RoverValue> _vars = RoverProgramAspect.vars(_self);
    _vars.put(n, v);
  }
  
  protected static void _privk3_run(final RoverProgramAspectRoverProgramAspectProperties _self_, final RoverProgram _self) {
    EList<Param> _params = _self.getParams();
    final Consumer<Param> _function = (Param it) -> {
      String _name = it.getName();
      NumberValue _createNumberValue = RclFactory.eINSTANCE.createNumberValue();
      RoverProgramAspect.bindVar(_self, _name, _createNumberValue);
    };
    _params.forEach(_function);
    RclBlock _block = _self.getBlock();
    StatementAspect.eval(_block);
  }
  
  protected static Map<String, RoverValue> _privk3_vars(final RoverProgramAspectRoverProgramAspectProperties _self_, final RoverProgram _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getVars") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.util.Map) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.vars;
  }
  
  protected static void _privk3_vars(final RoverProgramAspectRoverProgramAspectProperties _self_, final RoverProgram _self, final Map<String, RoverValue> vars) {
    _self_.vars = vars; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setVars")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, vars);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
