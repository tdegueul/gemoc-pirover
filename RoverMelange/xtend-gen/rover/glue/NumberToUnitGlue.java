package rover.glue;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.melange.annotation.Containment;
import org.gemoc.rover.rcl.semantics.NumberValueAspect;
import org.modelexecution.units.Unit;
import rcl.NumberValue;
import rover.glue.NumberToUnitGlueNumberValueAspectProperties;

@Aspect(className = NumberValue.class)
@SuppressWarnings("all")
public class NumberToUnitGlue extends NumberValueAspect {
  @Containment
  public static Unit unit(final NumberValue _self) {
    final rover.glue.NumberToUnitGlueNumberValueAspectProperties _self_ = rover.glue.NumberToUnitGlueNumberValueAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_unit(_self_, _self);;
    return (org.modelexecution.units.Unit)result;
  }
  
  @Containment
  public static void unit(final NumberValue _self, final Unit unit) {
    final rover.glue.NumberToUnitGlueNumberValueAspectProperties _self_ = rover.glue.NumberToUnitGlueNumberValueAspectContext.getSelf(_self);
    _privk3_unit(_self_, _self,unit);;
  }
  
  protected static Unit _privk3_unit(final NumberToUnitGlueNumberValueAspectProperties _self_, final NumberValue _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getUnit") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.modelexecution.units.Unit) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.unit;
  }
  
  protected static void _privk3_unit(final NumberToUnitGlueNumberValueAspectProperties _self_, final NumberValue _self, final Unit unit) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setUnit")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, unit);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.unit = unit;
    }
  }
}
