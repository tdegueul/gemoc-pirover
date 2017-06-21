package rover.rcl.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.concurrent.ThreadLocalRandom;
import rover.rcl.aspects.MessageQueryAspectMessageQueryAspectProperties;
import rover.rcl.aspects.StringValueAspect;
import rover.rcl.rcl.MessageQuery;

@Aspect(className = MessageQuery.class)
@SuppressWarnings("all")
public class MessageQueryAspect extends StringValueAspect {
  @OverrideAspectMethod
  public static String getStringValue(final MessageQuery _self) {
	final rover.rcl.aspects.MessageQueryAspectMessageQueryAspectProperties _self_ = rover.rcl.aspects.MessageQueryAspectMessageQueryAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_getStringValue(_self_, _self);
	;
	return (java.lang.String) result;
}
  
  private static String super_getStringValue(final MessageQuery _self) {
    final rover.rcl.aspects.StringValueAspectStringValueAspectProperties _self_ = rover.rcl.aspects.StringValueAspectStringValueAspectContext.getSelf(_self);
    return  rover.rcl.aspects.StringValueAspect._privk3_getStringValue(_self_, _self);
  }
  
  protected static String _privk3_getStringValue(final MessageQueryAspectMessageQueryAspectProperties _self_, final MessageQuery _self) {
    ThreadLocalRandom _current = ThreadLocalRandom.current();
    int _nextInt = _current.nextInt(0, 1000);
    return Integer.valueOf(_nextInt).toString();
  }
}
