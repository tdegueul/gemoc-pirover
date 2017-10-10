package rover.raspirover.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import rover.raspirover.aspects.MessageQueryAspectMessageQueryAspectProperties;
import rover.raspirover.aspects.StringValueAspect;
import rover.raspirover.raspirover.MessageQuery;

@Aspect(className = MessageQuery.class)
@SuppressWarnings("all")
public class MessageQueryAspect extends StringValueAspect {
  @OverrideAspectMethod
  public static String getStringValue(final MessageQuery _self) {
    final rover.raspirover.aspects.MessageQueryAspectMessageQueryAspectProperties _self_ = rover.raspirover.aspects.MessageQueryAspectMessageQueryAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof rover.raspirover.raspirover.MessageQuery){
    					result = rover.raspirover.aspects.MessageQueryAspect._privk3_getStringValue(_self_, (rover.raspirover.raspirover.MessageQuery)_self);
    } else  if (_self instanceof rover.raspirover.raspirover.StringValue){
    					result = rover.raspirover.aspects.StringValueAspect.getStringValue((rover.raspirover.raspirover.StringValue)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.String)result;
  }
  
  private static String super_getStringValue(final MessageQuery _self) {
    final rover.raspirover.aspects.StringValueAspectStringValueAspectProperties _self_ = rover.raspirover.aspects.StringValueAspectStringValueAspectContext.getSelf(_self);
    return  rover.raspirover.aspects.StringValueAspect._privk3_getStringValue(_self_, _self);
  }
  
  protected static String _privk3_getStringValue(final MessageQueryAspectMessageQueryAspectProperties _self_, final MessageQuery _self) {
    final List<String> messages = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("start", "stop", "pause", "whatever"));
    return messages.get(ThreadLocalRandom.current().nextInt(0, 4));
  }
}
