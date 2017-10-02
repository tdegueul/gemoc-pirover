package rover.raspirover.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import rover.raspirover.raspirover.Inch;
import rover.raspirover.aspects.InchAspectInchAspectProperties;
import rover.raspirover.aspects.UnitAspect;

@Aspect(className = Inch.class)
@SuppressWarnings("all")
public class InchAspect extends UnitAspect {
  @OverrideAspectMethod
  public static String print(final Inch _self) {
	final rover.raspirover.aspects.InchAspectInchAspectProperties _self_ = rover.raspirover.aspects.InchAspectInchAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_print(_self_, _self);
	;
	return (java.lang.String) result;
}
  
  protected static String _privk3_print(final InchAspectInchAspectProperties _self_, final Inch _self) {
    return "in";
  }
}