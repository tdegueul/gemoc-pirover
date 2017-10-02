package rover;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.gemoc.arduino.sequential.k3dsa.Pin_EvaluableAspect;
import org.gemoc.rover.rcl.semantics.BackwardMinActionAspect;
import org.gemoc.sequential.model.arduino.Pin;
import rcl.BackwardMinAction;
import rover.ActionToPin;
import rover.BackwardMinActionWithPinBackwardMinActionAspectProperties;

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
    BackwardMinActionWithPin.super_eval(_self);
    InputOutput.<String>println("Setting associated pin on the board");
    Pin _associatedPin = ActionToPin.associatedPin(_self);
    Pin_EvaluableAspect.level(_associatedPin, 1);
  }
}
