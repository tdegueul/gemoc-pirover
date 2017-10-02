package org.modelexecution.units.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.modelexecution.units.Millimeter;
import org.modelexecution.units.semantics.MillimeterAspectMillimeterAspectProperties;
import org.modelexecution.units.semantics.UnitAspect;

@Aspect(className = Millimeter.class)
@SuppressWarnings("all")
public class MillimeterAspect extends UnitAspect {
  @OverrideAspectMethod
  public static String print(final Millimeter _self) {
    final org.modelexecution.units.semantics.MillimeterAspectMillimeterAspectProperties _self_ = org.modelexecution.units.semantics.MillimeterAspectMillimeterAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.modelexecution.units.Millimeter){
    					result = org.modelexecution.units.semantics.MillimeterAspect._privk3_print(_self_, (org.modelexecution.units.Millimeter)_self);
    } else  if (_self instanceof org.modelexecution.units.Unit){
    					result = org.modelexecution.units.semantics.UnitAspect.print((org.modelexecution.units.Unit)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.String)result;
  }
  
  protected static String _privk3_print(final MillimeterAspectMillimeterAspectProperties _self_, final Millimeter _self) {
    return "mm";
  }
}
