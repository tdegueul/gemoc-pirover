package rover;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.melange.annotation.Containment;
import org.gemoc.rover.rcl.semantics.NumberValueAspect;
import org.modelexecution.units.Unit;
import org.modelexecution.units.semantics.LengthUnitAspect;
import rcl.NumberValue;
import rover.NumberValueUnitNumberValueAspectProperties;

@Aspect(className = NumberValue.class)
@SuppressWarnings("all")
public class NumberValueUnit extends NumberValueAspect {
  @OverrideAspectMethod
  public static int getIntValue(final NumberValue _self) {
    final rover.NumberValueUnitNumberValueAspectProperties _self_ = rover.NumberValueUnitNumberValueAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_getIntValue(_self_, _self);;
    return (int)result;
  }
  
  @OverrideAspectMethod
  public static String print(final NumberValue _self) {
    final rover.NumberValueUnitNumberValueAspectProperties _self_ = rover.NumberValueUnitNumberValueAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_print(_self_, _self);;
    return (java.lang.String)result;
  }
  
  @Containment
  public static Unit unit(final NumberValue _self) {
    final rover.NumberValueUnitNumberValueAspectProperties _self_ = rover.NumberValueUnitNumberValueAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_unit(_self_, _self);;
    return (org.modelexecution.units.Unit)result;
  }
  
  @Containment
  public static void unit(final NumberValue _self, final Unit unit) {
    final rover.NumberValueUnitNumberValueAspectProperties _self_ = rover.NumberValueUnitNumberValueAspectContext.getSelf(_self);
    _privk3_unit(_self_, _self,unit);;
  }
  
  private static int super_getIntValue(final NumberValue _self) {
    final org.gemoc.rover.rcl.semantics.NumberValueAspectNumberValueAspectProperties _self_ = org.gemoc.rover.rcl.semantics.NumberValueAspectNumberValueAspectContext.getSelf(_self);
    return  org.gemoc.rover.rcl.semantics.NumberValueAspect._privk3_getIntValue(_self_, _self);
  }
  
  protected static int _privk3_getIntValue(final NumberValueUnitNumberValueAspectProperties _self_, final NumberValue _self) {
    int _xifexpression = (int) 0;
    Unit _unit = NumberValueUnit.unit(_self);
    boolean _tripleNotEquals = (_unit != null);
    if (_tripleNotEquals) {
      long _round = Math.round(LengthUnitAspect.toCentimeters(NumberValueUnit.unit(_self), _self.getNValue()));
      _xifexpression = ((int) _round);
    } else {
      _xifexpression = NumberValueUnit.super_getIntValue(_self);
    }
    return _xifexpression;
  }
  
  private static String super_print(final NumberValue _self) {
    final org.gemoc.rover.rcl.semantics.NumberValueAspectNumberValueAspectProperties _self_ = org.gemoc.rover.rcl.semantics.NumberValueAspectNumberValueAspectContext.getSelf(_self);
    return  org.gemoc.rover.rcl.semantics.NumberValueAspect._privk3_print(_self_, _self);
  }
  
  protected static String _privk3_print(final NumberValueUnitNumberValueAspectProperties _self_, final NumberValue _self) {
    String _super_print = NumberValueUnit.super_print(_self);
    String _print = LengthUnitAspect.print(NumberValueUnit.unit(_self));
    return (_super_print + _print);
  }
  
  protected static Unit _privk3_unit(final NumberValueUnitNumberValueAspectProperties _self_, final NumberValue _self) {
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
  
  protected static void _privk3_unit(final NumberValueUnitNumberValueAspectProperties _self_, final NumberValue _self, final Unit unit) {
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
