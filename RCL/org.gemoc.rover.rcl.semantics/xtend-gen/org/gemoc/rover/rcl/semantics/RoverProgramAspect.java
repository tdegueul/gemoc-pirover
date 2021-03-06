package org.gemoc.rover.rcl.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import java.util.Map;
import java.util.function.Consumer;
import org.gemoc.rover.rcl.semantics.RoverProgramAspectRoverProgramAspectProperties;
import org.gemoc.rover.rcl.semantics.StatementAspect;
import rcl.Param;
import rcl.RclFactory;
import rcl.RoverProgram;
import rcl.RoverValue;

@Aspect(className = RoverProgram.class)
@SuppressWarnings("all")
public class RoverProgramAspect {
  public static RoverValue getVar(final RoverProgram _self, final String n) {
    final org.gemoc.rover.rcl.semantics.RoverProgramAspectRoverProgramAspectProperties _self_ = org.gemoc.rover.rcl.semantics.RoverProgramAspectRoverProgramAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_getVar(_self_, _self,n);;
    return (rcl.RoverValue)result;
  }
  
  public static void bindVar(final RoverProgram _self, final String n, final RoverValue v) {
    final org.gemoc.rover.rcl.semantics.RoverProgramAspectRoverProgramAspectProperties _self_ = org.gemoc.rover.rcl.semantics.RoverProgramAspectRoverProgramAspectContext.getSelf(_self);
    _privk3_bindVar(_self_, _self,n,v);;
  }
  
  @Main
  public static void run(final RoverProgram _self) {
    final org.gemoc.rover.rcl.semantics.RoverProgramAspectRoverProgramAspectProperties _self_ = org.gemoc.rover.rcl.semantics.RoverProgramAspectRoverProgramAspectContext.getSelf(_self);
    _privk3_run(_self_, _self);;
  }
  
  private static Map<String, RoverValue> vars(final RoverProgram _self) {
    final org.gemoc.rover.rcl.semantics.RoverProgramAspectRoverProgramAspectProperties _self_ = org.gemoc.rover.rcl.semantics.RoverProgramAspectRoverProgramAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_vars(_self_, _self);;
    return (java.util.Map<java.lang.String, rcl.RoverValue>)result;
  }
  
  private static void vars(final RoverProgram _self, final Map<String, RoverValue> vars) {
    final org.gemoc.rover.rcl.semantics.RoverProgramAspectRoverProgramAspectProperties _self_ = org.gemoc.rover.rcl.semantics.RoverProgramAspectRoverProgramAspectContext.getSelf(_self);
    _privk3_vars(_self_, _self,vars);;
  }
  
  protected static RoverValue _privk3_getVar(final RoverProgramAspectRoverProgramAspectProperties _self_, final RoverProgram _self, final String n) {
    return RoverProgramAspect.vars(_self).get(n);
  }
  
  protected static void _privk3_bindVar(final RoverProgramAspectRoverProgramAspectProperties _self_, final RoverProgram _self, final String n, final RoverValue v) {
    RoverProgramAspect.vars(_self).put(n, v);
  }
  
  protected static void _privk3_run(final RoverProgramAspectRoverProgramAspectProperties _self_, final RoverProgram _self) {
    final Consumer<Param> _function = (Param it) -> {
      RoverProgramAspect.bindVar(_self, it.getName(), RclFactory.eINSTANCE.createNumberValue());
    };
    _self.getParams().forEach(_function);
    StatementAspect.eval(_self.getBlock());
  }
  
  protected static Map<String, RoverValue> _privk3_vars(final RoverProgramAspectRoverProgramAspectProperties _self_, final RoverProgram _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getVars") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.util.Map) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.vars;
  }
  
  protected static void _privk3_vars(final RoverProgramAspectRoverProgramAspectProperties _self_, final RoverProgram _self, final Map<String, RoverValue> vars) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setVars")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, vars);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.vars = vars;
    }
  }
}
