package org.modelexecution.units.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.modelexecution.units.LengthUnit;
import org.modelexecution.units.semantics.LengthUnitConverterLengthUnitAspectProperties;

@Aspect(className = LengthUnit.class)
@SuppressWarnings("all")
public class LengthUnitConverter {
  public static int asCentimeters(final LengthUnit _self) {
    final org.modelexecution.units.semantics.LengthUnitConverterLengthUnitAspectProperties _self_ = org.modelexecution.units.semantics.LengthUnitConverterLengthUnitAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_asCentimeters(_self_, _self);;
    return (int)result;
  }
  
  protected static int _privk3_asCentimeters(final LengthUnitConverterLengthUnitAspectProperties _self_, final LengthUnit _self) {
    throw new UnsupportedOperationException();
  }
}
