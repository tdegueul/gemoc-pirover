package org.modelexecution.units.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.modelexecution.units.Inch;
import org.modelexecution.units.semantics.InchAspectInchAspectProperties;
import org.modelexecution.units.semantics.UnitAspect;

@Aspect(className = Inch.class)
@SuppressWarnings("all")
public class InchAspect extends UnitAspect {
  @OverrideAspectMethod
  public static String print(final Inch _self) {
    final org.modelexecution.units.semantics.InchAspectInchAspectProperties _self_ = org.modelexecution.units.semantics.InchAspectInchAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.modelexecution.units.Inch){
    					result = org.modelexecution.units.semantics.InchAspect._privk3_print(_self_, (org.modelexecution.units.Inch)_self);
    } else  if (_self instanceof org.modelexecution.units.Unit){
    					result = org.modelexecution.units.semantics.UnitAspect.print((org.modelexecution.units.Unit)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.String)result;
  }
  
  protected static String _privk3_print(final InchAspectInchAspectProperties _self_, final Inch _self) {
    return "in";
  }
}
