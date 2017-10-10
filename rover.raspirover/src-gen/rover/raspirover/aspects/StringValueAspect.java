package rover.raspirover.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import rover.raspirover.aspects.StringValueAspectStringValueAspectProperties;
import rover.raspirover.raspirover.StringValue;

@Aspect(className = StringValue.class)
@SuppressWarnings("all")
public class StringValueAspect {
  public static String getStringValue(final StringValue _self) {
    final rover.raspirover.aspects.StringValueAspectStringValueAspectProperties _self_ = rover.raspirover.aspects.StringValueAspectStringValueAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof rover.raspirover.raspirover.MessageQuery){
    					result = rover.raspirover.aspects.MessageQueryAspect.getStringValue((rover.raspirover.raspirover.MessageQuery)_self);
    } else  if (_self instanceof rover.raspirover.raspirover.StringValue){
    					result = rover.raspirover.aspects.StringValueAspect._privk3_getStringValue(_self_, (rover.raspirover.raspirover.StringValue)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.String)result;
  }
  
  protected static String _privk3_getStringValue(final StringValueAspectStringValueAspectProperties _self_, final StringValue _self) {
    return _self.getSValue();
  }
}
