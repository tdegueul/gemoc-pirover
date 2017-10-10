package org.modelexecution.units.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.modelexecution.units.Angle;
import org.modelexecution.units.AngleUnit;
import org.modelexecution.units.Unit;
import org.modelexecution.units.semantics.AngleAspectAngleAspectProperties;
import org.modelexecution.units.semantics.AngleUnitAspect;
import org.modelexecution.units.semantics.QuantityAspect;
import org.modelexecution.units.semantics.UnitAspect;

@Aspect(className = Angle.class)
@SuppressWarnings("all")
public class AngleAspect extends QuantityAspect {
  public static double toRad(final Angle _self) {
    final org.modelexecution.units.semantics.AngleAspectAngleAspectProperties _self_ = org.modelexecution.units.semantics.AngleAspectAngleAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_toRad(_self_, _self);;
    return (double)result;
  }
  
  @OverrideAspectMethod
  public static String print(final Angle _self) {
    final org.modelexecution.units.semantics.AngleAspectAngleAspectProperties _self_ = org.modelexecution.units.semantics.AngleAspectAngleAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.modelexecution.units.Angle){
    					result = org.modelexecution.units.semantics.AngleAspect._privk3_print(_self_, (org.modelexecution.units.Angle)_self);
    } else  if (_self instanceof org.modelexecution.units.Quantity){
    					result = org.modelexecution.units.semantics.QuantityAspect.print((org.modelexecution.units.Quantity)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.String)result;
  }
  
  protected static double _privk3_toRad(final AngleAspectAngleAspectProperties _self_, final Angle _self) {
    Unit _unit = _self.getUnit();
    return AngleUnitAspect.toRad(((AngleUnit) _unit), _self.getValue());
  }
  
  protected static String _privk3_print(final AngleAspectAngleAspectProperties _self_, final Angle _self) {
    StringConcatenation _builder = new StringConcatenation();
    double _value = _self.getValue();
    _builder.append(_value);
    String _symbol = UnitAspect.getSymbol(_self.getUnit());
    _builder.append(_symbol);
    _builder.append(" [");
    double _rad = AngleAspect.toRad(_self);
    _builder.append(_rad);
    _builder.append("rad]");
    return _builder.toString();
  }
}
