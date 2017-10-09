package org.modelexecution.units.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.modelexecution.units.AngleUnit;
import org.modelexecution.units.LengthUnit;
import org.modelexecution.units.Quantity;
import org.modelexecution.units.Unit;
import org.modelexecution.units.semantics.AngleUnitAspect;
import org.modelexecution.units.semantics.LengthUnitAspect;
import org.modelexecution.units.semantics.QuantityAspectQuantityAspectProperties;

@Aspect(className = Quantity.class)
@SuppressWarnings("all")
public abstract class QuantityAspect {
  @Abstract
  public static String print(final Quantity _self) {
    final org.modelexecution.units.semantics.QuantityAspectQuantityAspectProperties _self_ = org.modelexecution.units.semantics.QuantityAspectQuantityAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.modelexecution.units.Angle){
    					result = org.modelexecution.units.semantics.AngleAspect.print((org.modelexecution.units.Angle)_self);
    } else  if (_self instanceof org.modelexecution.units.Length){
    					result = org.modelexecution.units.semantics.LengthAspect.print((org.modelexecution.units.Length)_self);
    } else  if (_self instanceof org.modelexecution.units.Quantity){
    					result = org.modelexecution.units.semantics.QuantityAspect._privk3_print(_self_, (org.modelexecution.units.Quantity)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.String)result;
  }
  
  public static double getNormalized(final Quantity _self) {
    final org.modelexecution.units.semantics.QuantityAspectQuantityAspectProperties _self_ = org.modelexecution.units.semantics.QuantityAspectQuantityAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_getNormalized(_self_, _self);;
    return (double)result;
  }
  
  protected static String _privk3_print(final QuantityAspectQuantityAspectProperties _self_, final Quantity _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
  
  protected static double _privk3_getNormalized(final QuantityAspectQuantityAspectProperties _self_, final Quantity _self) {
    double _switchResult = (double) 0;
    Unit _unit = _self.getUnit();
    boolean _matched = false;
    if (_unit instanceof AngleUnit) {
      _matched=true;
      Unit _unit_1 = _self.getUnit();
      _switchResult = AngleUnitAspect.toRad(((AngleUnit) _unit_1), _self.getValue().getValue());
    }
    if (!_matched) {
      if (_unit instanceof LengthUnit) {
        _matched=true;
        Unit _unit_1 = _self.getUnit();
        _switchResult = LengthUnitAspect.toCm(((LengthUnit) _unit_1), _self.getValue().getValue());
      }
    }
    if (!_matched) {
      _switchResult = 0;
    }
    return _switchResult;
  }
}
