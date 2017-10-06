package rover.glue;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.rover.rcl.semantics.NumberValueAspect;
import org.modelexecution.units.Quantity;
import org.modelexecution.units.semantics.QuantityAspect;
import rcl.NumberValue;
import rover.glue.NumberToQuantityGlue;
import rover.glue.OverriddenNumberInterpreterNumberValueAspectProperties;

@Aspect(className = NumberValue.class)
@SuppressWarnings("all")
public class OverriddenNumberInterpreter extends NumberValueAspect {
  @OverrideAspectMethod
  public static int getIntValue(final NumberValue _self) {
    final rover.glue.OverriddenNumberInterpreterNumberValueAspectProperties _self_ = rover.glue.OverriddenNumberInterpreterNumberValueAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_getIntValue(_self_, _self);;
    return (int)result;
  }
  
  @OverrideAspectMethod
  public static String print(final NumberValue _self) {
    final rover.glue.OverriddenNumberInterpreterNumberValueAspectProperties _self_ = rover.glue.OverriddenNumberInterpreterNumberValueAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_print(_self_, _self);;
    return (java.lang.String)result;
  }
  
  private static int super_getIntValue(final NumberValue _self) {
    final org.gemoc.rover.rcl.semantics.NumberValueAspectNumberValueAspectProperties _self_ = org.gemoc.rover.rcl.semantics.NumberValueAspectNumberValueAspectContext.getSelf(_self);
    return  org.gemoc.rover.rcl.semantics.NumberValueAspect._privk3_getIntValue(_self_, _self);
  }
  
  protected static int _privk3_getIntValue(final OverriddenNumberInterpreterNumberValueAspectProperties _self_, final NumberValue _self) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method toCentimeters(int) is undefined for the type Quantity");
  }
  
  private static String super_print(final NumberValue _self) {
    final org.gemoc.rover.rcl.semantics.NumberValueAspectNumberValueAspectProperties _self_ = org.gemoc.rover.rcl.semantics.NumberValueAspectNumberValueAspectContext.getSelf(_self);
    return  org.gemoc.rover.rcl.semantics.NumberValueAspect._privk3_print(_self_, _self);
  }
  
  protected static String _privk3_print(final OverriddenNumberInterpreterNumberValueAspectProperties _self_, final NumberValue _self) {
    String _xifexpression = null;
    Quantity _quantity = NumberToQuantityGlue.quantity(_self);
    boolean _tripleNotEquals = (_quantity != null);
    if (_tripleNotEquals) {
      _xifexpression = QuantityAspect.print(NumberToQuantityGlue.quantity(_self));
    } else {
      _xifexpression = OverriddenNumberInterpreter.super_print(_self);
    }
    return _xifexpression;
  }
}
