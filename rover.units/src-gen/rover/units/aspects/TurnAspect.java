package rover.units.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import rover.units.units.Turn;
import rover.units.aspects.AngleUnitAspect;
import rover.units.aspects.TurnAspectTurnAspectProperties;

@Aspect(className = Turn.class)
@SuppressWarnings("all")
public class TurnAspect extends AngleUnitAspect {
  @OverrideAspectMethod
  public static String getSymbol(final Turn _self) {
	final rover.units.aspects.TurnAspectTurnAspectProperties _self_ = rover.units.aspects.TurnAspectTurnAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_getSymbol(_self_, _self);
	;
	return (java.lang.String) result;
}
  
  @OverrideAspectMethod
  public static double toRad(final Turn _self, final double value) {
	final rover.units.aspects.TurnAspectTurnAspectProperties _self_ = rover.units.aspects.TurnAspectTurnAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_toRad(_self_, _self, value);
	;
	return (double) result;
}
  
  protected static String _privk3_getSymbol(final TurnAspectTurnAspectProperties _self_, final Turn _self) {
    return "rad";
  }
  
  protected static double _privk3_toRad(final TurnAspectTurnAspectProperties _self_, final Turn _self, final double value) {
    return ((value * 2) * Math.PI);
  }
}
