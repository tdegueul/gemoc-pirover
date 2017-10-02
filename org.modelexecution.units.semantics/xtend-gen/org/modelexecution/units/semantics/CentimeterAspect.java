package org.modelexecution.units.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.modelexecution.units.Centimeter;
import org.modelexecution.units.semantics.CentimeterAspectCentimeterAspectProperties;
import org.modelexecution.units.semantics.UnitAspect;

@Aspect(className = Centimeter.class)
@SuppressWarnings("all")
public class CentimeterAspect extends UnitAspect {
  @OverrideAspectMethod
  public static String print(final Centimeter _self) {
    final org.modelexecution.units.semantics.CentimeterAspectCentimeterAspectProperties _self_ = org.modelexecution.units.semantics.CentimeterAspectCentimeterAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.modelexecution.units.Centimeter){
    					result = org.modelexecution.units.semantics.CentimeterAspect._privk3_print(_self_, (org.modelexecution.units.Centimeter)_self);
    } else  if (_self instanceof org.modelexecution.units.Unit){
    					result = org.modelexecution.units.semantics.UnitAspect.print((org.modelexecution.units.Unit)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.String)result;
  }
  
  protected static String _privk3_print(final CentimeterAspectCentimeterAspectProperties _self_, final Centimeter _self) {
    return "cm";
  }
}
