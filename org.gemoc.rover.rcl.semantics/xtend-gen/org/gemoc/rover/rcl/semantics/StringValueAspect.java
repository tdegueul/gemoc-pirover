package org.gemoc.rover.rcl.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.rover.rcl.semantics.StringValueAspectStringValueAspectProperties;
import rcl.StringValue;

@Aspect(className = StringValue.class)
@SuppressWarnings("all")
public class StringValueAspect {
  public static String getStringValue(final StringValue _self) {
    final org.gemoc.rover.rcl.semantics.StringValueAspectStringValueAspectProperties _self_ = org.gemoc.rover.rcl.semantics.StringValueAspectStringValueAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof rcl.MessageQuery){
    					result = org.gemoc.rover.rcl.semantics.MessageQueryAspect.getStringValue((rcl.MessageQuery)_self);
    } else  if (_self instanceof rcl.StringValue){
    					result = org.gemoc.rover.rcl.semantics.StringValueAspect._privk3_getStringValue(_self_, (rcl.StringValue)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.String)result;
  }
  
  protected static String _privk3_getStringValue(final StringValueAspectStringValueAspectProperties _self_, final StringValue _self) {
    return _self.getSValue();
  }
}
