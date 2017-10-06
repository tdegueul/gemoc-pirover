package org.modelexecution.units.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.modelexecution.units.NumericValue;
import org.modelexecution.units.semantics.NumericValueAspectNumericValueAspectProperties;

@Aspect(className = NumericValue.class)
@SuppressWarnings("all")
public class NumericValueAspect {
  public static String print(final NumericValue _self) {
    final org.modelexecution.units.semantics.NumericValueAspectNumericValueAspectProperties _self_ = org.modelexecution.units.semantics.NumericValueAspectNumericValueAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_print(_self_, _self);;
    return (java.lang.String)result;
  }
  
  protected static String _privk3_print(final NumericValueAspectNumericValueAspectProperties _self_, final NumericValue _self) {
    return Double.toString(_self.getValue());
  }
}
