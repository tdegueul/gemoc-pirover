package rover.rcl.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.InputOutput;
import rover.rcl.aspects.ActionAspect;
import rover.rcl.aspects.TurnDegActionAspectTurnDegActionAspectProperties;
import rover.rcl.rcl.NumberValue;
import rover.rcl.rcl.TurnDegAction;

@Aspect(className = TurnDegAction.class)
@SuppressWarnings("all")
public class TurnDegActionAspect extends ActionAspect {
  @OverrideAspectMethod
  public static void eval(final TurnDegAction _self) {
	final rover.rcl.aspects.TurnDegActionAspectTurnDegActionAspectProperties _self_ = rover.rcl.aspects.TurnDegActionAspectTurnDegActionAspectContext
			.getSelf(_self);
	_privk3_eval(_self_, _self);
	;
}
  
  protected static void _privk3_eval(final TurnDegActionAspectTurnDegActionAspectProperties _self_, final TurnDegAction _self) {
    NumberValue _degrees = _self.getDegrees();
    String _plus = ("<turn (" + _degrees);
    String _plus_1 = (_plus + ")>");
    InputOutput.<String>println(_plus_1);
  }
}
