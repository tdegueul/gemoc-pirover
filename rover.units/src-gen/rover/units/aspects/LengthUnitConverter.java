package rover.units.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import rover.units.units.LengthUnit;
import rover.units.aspects.LengthUnitConverterLengthUnitAspectProperties;

@Aspect(className = LengthUnit.class)
@SuppressWarnings("all")
public class LengthUnitConverter {
  public static int asCentimeters(final LengthUnit _self) {
	final rover.units.aspects.LengthUnitConverterLengthUnitAspectProperties _self_ = rover.units.aspects.LengthUnitConverterLengthUnitAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_asCentimeters(_self_, _self);
	;
	return (int) result;
}
  
  protected static int _privk3_asCentimeters(final LengthUnitConverterLengthUnitAspectProperties _self_, final LengthUnit _self) {
    throw new UnsupportedOperationException();
  }
}
