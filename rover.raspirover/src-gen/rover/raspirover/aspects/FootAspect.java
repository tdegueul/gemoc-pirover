package rover.raspirover.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import rover.raspirover.raspirover.Foot;
import rover.raspirover.aspects.FootAspectFootAspectProperties;
import rover.raspirover.aspects.UnitAspect;

@Aspect(className = Foot.class)
@SuppressWarnings("all")
public class FootAspect extends UnitAspect {
  @OverrideAspectMethod
  public static String print(final Foot _self) {
	final rover.raspirover.aspects.FootAspectFootAspectProperties _self_ = rover.raspirover.aspects.FootAspectFootAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_print(_self_, _self);
	;
	return (java.lang.String) result;
}
  
  protected static String _privk3_print(final FootAspectFootAspectProperties _self_, final Foot _self) {
    return "ft";
  }
}
