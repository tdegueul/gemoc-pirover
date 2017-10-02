package rover.raspirover.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.InputOutput;
import rover.raspirover.aspects.Pin_EvaluableAspect;
import rover.raspirover.aspects.BackwardMinActionAspect;
import rover.raspirover.raspirover.Pin;
import rover.raspirover.raspirover.BackwardMinAction;
import rover.raspirover.aspects.ActionToPin;
import rover.raspirover.aspects.BackwardMinActionWithPinBackwardMinActionAspectProperties;
import rover.raspirover.aspects.NumberValueUnit;

@Aspect(className = BackwardMinAction.class)
@SuppressWarnings("all")
public class BackwardMinActionWithPin extends BackwardMinActionAspect {
  @OverrideAspectMethod
  public static void eval(final BackwardMinAction _self) {
	final rover.raspirover.aspects.BackwardMinActionWithPinBackwardMinActionAspectProperties _self_ = rover.raspirover.aspects.BackwardMinActionWithPinBackwardMinActionAspectContext
			.getSelf(_self);
	_privk3_eval(_self_, _self);
	;
}
  
  private static void super_eval(final BackwardMinAction _self) {
    final rover.raspirover.aspects.BackwardMinActionAspectBackwardMinActionAspectProperties _self_ = rover.raspirover.aspects.BackwardMinActionAspectBackwardMinActionAspectContext.getSelf(_self);
     rover.raspirover.aspects.BackwardMinActionAspect._privk3_eval(_self_, _self);
  }
  
  protected static void _privk3_eval(final BackwardMinActionWithPinBackwardMinActionAspectProperties _self_, final BackwardMinAction _self) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<backward (");
    String _print = NumberValueUnit.print(_self.getDistance());
    _builder.append(_print);
    _builder.append(" = ");
    int _intValue = NumberValueUnit.getIntValue(_self.getDistance());
    _builder.append(_intValue);
    _builder.append("cm)>\"");
    InputOutput.<String>println(_builder.toString());
    Pin _associatedPin = ActionToPin.associatedPin(_self);
    Pin_EvaluableAspect.level(_associatedPin, 1);
  }
}
