package org.modelexecution.units.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.modelexecution.units.Centimeter;
import org.modelexecution.units.semantics.CentimeterAspectCentimeterAspectProperties;
import org.modelexecution.units.semantics.LengthUnitAspect;

@Aspect(className = Centimeter.class)
@SuppressWarnings("all")
public class CentimeterAspect extends LengthUnitAspect {
  @OverrideAspectMethod
  public static String getSymbol(final Centimeter _self) {
    final org.modelexecution.units.semantics.CentimeterAspectCentimeterAspectProperties _self_ = org.modelexecution.units.semantics.CentimeterAspectCentimeterAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.modelexecution.units.Centimeter){
    					result = org.modelexecution.units.semantics.CentimeterAspect._privk3_getSymbol(_self_, (org.modelexecution.units.Centimeter)_self);
    } else  if (_self instanceof org.modelexecution.units.Unit){
    					result = org.modelexecution.units.semantics.UnitAspect.getSymbol((org.modelexecution.units.Unit)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.String)result;
  }
  
  @OverrideAspectMethod
  public static double toCm(final Centimeter _self, final double value) {
    final org.modelexecution.units.semantics.CentimeterAspectCentimeterAspectProperties _self_ = org.modelexecution.units.semantics.CentimeterAspectCentimeterAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.modelexecution.units.Centimeter){
    					result = org.modelexecution.units.semantics.CentimeterAspect._privk3_toCm(_self_, (org.modelexecution.units.Centimeter)_self,value);
    } else  if (_self instanceof org.modelexecution.units.LengthUnit){
    					result = org.modelexecution.units.semantics.LengthUnitAspect.toCm((org.modelexecution.units.LengthUnit)_self,value);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (double)result;
  }
  
  protected static String _privk3_getSymbol(final CentimeterAspectCentimeterAspectProperties _self_, final Centimeter _self) {
    return "cm";
  }
  
  protected static double _privk3_toCm(final CentimeterAspectCentimeterAspectProperties _self_, final Centimeter _self, final double value) {
    return value;
  }
}
