package rover;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.gemoc.arduino.sequential.k3dsa.Pin_EvaluableAspect;
import org.gemoc.rover.rcl.semantics.BackwardMinActionAspect;
import org.gemoc.sequential.model.arduino.Pin;
import rcl.BackwardMinAction;
import rover.ActionToPin;
import rover.BackwardMinActionWithPinBackwardMinActionAspectProperties;
import rover.NumberValueUnit;

@Aspect(className = BackwardMinAction.class)
@SuppressWarnings("all")
public class BackwardMinActionWithPin extends BackwardMinActionAspect {
  @OverrideAspectMethod
  public static void eval(final BackwardMinAction _self) {
    final rover.BackwardMinActionWithPinBackwardMinActionAspectProperties _self_ = rover.BackwardMinActionWithPinBackwardMinActionAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self);;
  }
  
  private static void super_eval(final BackwardMinAction _self) {
    final org.gemoc.rover.rcl.semantics.BackwardMinActionAspectBackwardMinActionAspectProperties _self_ = org.gemoc.rover.rcl.semantics.BackwardMinActionAspectBackwardMinActionAspectContext.getSelf(_self);
     org.gemoc.rover.rcl.semantics.BackwardMinActionAspect._privk3_eval(_self_, _self);
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
