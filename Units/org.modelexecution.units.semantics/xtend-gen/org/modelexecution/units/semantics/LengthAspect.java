package org.modelexecution.units.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.modelexecution.units.Length;
import org.modelexecution.units.LengthUnit;
import org.modelexecution.units.Unit;
import org.modelexecution.units.semantics.LengthAspectLengthAspectProperties;
import org.modelexecution.units.semantics.LengthUnitAspect;
import org.modelexecution.units.semantics.QuantityAspect;
import org.modelexecution.units.semantics.UnitAspect;

@Aspect(className = Length.class)
@SuppressWarnings("all")
public class LengthAspect extends QuantityAspect {
  public static double toCm(final Length _self) {
    final org.modelexecution.units.semantics.LengthAspectLengthAspectProperties _self_ = org.modelexecution.units.semantics.LengthAspectLengthAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_toCm(_self_, _self);;
    return (double)result;
  }
  
  public static String print(final Length _self) {
    final org.modelexecution.units.semantics.LengthAspectLengthAspectProperties _self_ = org.modelexecution.units.semantics.LengthAspectLengthAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.modelexecution.units.Length){
    					result = org.modelexecution.units.semantics.LengthAspect._privk3_print(_self_, (org.modelexecution.units.Length)_self);
    } else  if (_self instanceof org.modelexecution.units.Quantity){
    					result = org.modelexecution.units.semantics.QuantityAspect.print((org.modelexecution.units.Quantity)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.String)result;
  }
  
  protected static double _privk3_toCm(final LengthAspectLengthAspectProperties _self_, final Length _self) {
    Unit _unit = _self.getUnit();
    return LengthUnitAspect.toCm(((LengthUnit) _unit), _self.getValue());
  }
  
  protected static String _privk3_print(final LengthAspectLengthAspectProperties _self_, final Length _self) {
    StringConcatenation _builder = new StringConcatenation();
    double _value = _self.getValue();
    _builder.append(_value);
    String _symbol = UnitAspect.getSymbol(_self.getUnit());
    _builder.append(_symbol);
    _builder.append(" [");
    double _cm = LengthAspect.toCm(_self);
    _builder.append(_cm);
    _builder.append("cm]");
    return _builder.toString();
  }
}
