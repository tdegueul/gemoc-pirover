package rover.raspirover.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtend2.lib.StringConcatenation;
import rover.raspirover.raspirover.Length;
import rover.raspirover.raspirover.LengthUnit;
import rover.raspirover.raspirover.Unit;
import rover.raspirover.aspects.LengthAspectLengthAspectProperties;
import rover.raspirover.aspects.LengthUnitAspect;
import rover.raspirover.aspects.QuantityAspect;
import rover.raspirover.aspects.UnitAspect;

@Aspect(className = Length.class)
@SuppressWarnings("all")
public class LengthAspect extends QuantityAspect {
  public static double toCm(final Length _self) {
    final rover.raspirover.aspects.LengthAspectLengthAspectProperties _self_ = rover.raspirover.aspects.LengthAspectLengthAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_toCm(_self_, _self);;
    return (double)result;
  }
  
  public static String print(final Length _self) {
    final rover.raspirover.aspects.LengthAspectLengthAspectProperties _self_ = rover.raspirover.aspects.LengthAspectLengthAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof rover.raspirover.raspirover.Length){
    					result = rover.raspirover.aspects.LengthAspect._privk3_print(_self_, (rover.raspirover.raspirover.Length)_self);
    } else  if (_self instanceof rover.raspirover.raspirover.Quantity){
    					result = rover.raspirover.aspects.QuantityAspect.print((rover.raspirover.raspirover.Quantity)_self);
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
