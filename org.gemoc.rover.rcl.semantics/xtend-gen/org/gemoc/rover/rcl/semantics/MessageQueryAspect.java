package org.gemoc.rover.rcl.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.concurrent.ThreadLocalRandom;
import org.gemoc.rover.rcl.semantics.MessageQueryAspectMessageQueryAspectProperties;
import org.gemoc.rover.rcl.semantics.StringValueAspect;
import rcl.MessageQuery;

@Aspect(className = MessageQuery.class)
@SuppressWarnings("all")
public class MessageQueryAspect extends StringValueAspect {
  @OverrideAspectMethod
  public static String getStringValue(final MessageQuery _self) {
    final org.gemoc.rover.rcl.semantics.MessageQueryAspectMessageQueryAspectProperties _self_ = org.gemoc.rover.rcl.semantics.MessageQueryAspectMessageQueryAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof rcl.MessageQuery){
    					result = org.gemoc.rover.rcl.semantics.MessageQueryAspect._privk3_getStringValue(_self_, (rcl.MessageQuery)_self);
    } else  if (_self instanceof rcl.StringValue){
    					result = org.gemoc.rover.rcl.semantics.StringValueAspect.getStringValue((rcl.StringValue)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.String)result;
  }
  
  private static String super_getStringValue(final MessageQuery _self) {
    final org.gemoc.rover.rcl.semantics.StringValueAspectStringValueAspectProperties _self_ = org.gemoc.rover.rcl.semantics.StringValueAspectStringValueAspectContext.getSelf(_self);
    return  org.gemoc.rover.rcl.semantics.StringValueAspect._privk3_getStringValue(_self_, _self);
  }
  
  protected static String _privk3_getStringValue(final MessageQueryAspectMessageQueryAspectProperties _self_, final MessageQuery _self) {
    ThreadLocalRandom _current = ThreadLocalRandom.current();
    int _nextInt = _current.nextInt(0, 1000);
    return Integer.valueOf(_nextInt).toString();
  }
}
