package rover.glue;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.gemoc.arduino.sequential.k3dsa.Pin_EvaluableAspect;
import org.gemoc.rover.rcl.semantics.LogActionAspect;
import org.gemoc.sequential.model.arduino.AnalogPin;
import org.gemoc.sequential.model.arduino.ArduinoBoard;
import org.gemoc.sequential.model.arduino.Board;
import org.gemoc.sequential.model.arduino.DigitalPin;
import org.gemoc.sequential.model.arduino.Project;
import rcl.LogAction;
import rover.glue.DebugLogActionLogActionAspectProperties;

@Aspect(className = LogAction.class)
@SuppressWarnings("all")
public class DebugLogAction extends LogActionAspect {
  @OverrideAspectMethod
  public static void eval(final LogAction _self) {
    final rover.glue.DebugLogActionLogActionAspectProperties _self_ = rover.glue.DebugLogActionLogActionAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self);;
  }
  
  private static ArduinoBoard getBoard(final LogAction _self) {
    final rover.glue.DebugLogActionLogActionAspectProperties _self_ = rover.glue.DebugLogActionLogActionAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_getBoard(_self_, _self);;
    return (org.gemoc.sequential.model.arduino.ArduinoBoard)result;
  }
  
  private static void super_eval(final LogAction _self) {
    final org.gemoc.rover.rcl.semantics.LogActionAspectLogActionAspectProperties _self_ = org.gemoc.rover.rcl.semantics.LogActionAspectLogActionAspectContext.getSelf(_self);
     org.gemoc.rover.rcl.semantics.LogActionAspect._privk3_eval(_self_, _self);
  }
  
  protected static void _privk3_eval(final DebugLogActionLogActionAspectProperties _self_, final LogAction _self) {
    DebugLogAction.super_eval(_self);
    final Function1<AnalogPin, Integer> _function = (AnalogPin it) -> {
      return Integer.valueOf(Pin_EvaluableAspect.level(it));
    };
    List<Integer> _map = ListExtensions.<AnalogPin, Integer>map(DebugLogAction.getBoard(_self).getAnalogPins(), _function);
    String _plus = ("Pins: " + _map);
    String _plus_1 = (_plus + " || ");
    final Function1<DigitalPin, Integer> _function_1 = (DigitalPin it) -> {
      return Integer.valueOf(Pin_EvaluableAspect.level(it));
    };
    List<Integer> _map_1 = ListExtensions.<DigitalPin, Integer>map(DebugLogAction.getBoard(_self).getDigitalPins(), _function_1);
    String _plus_2 = (_plus_1 + _map_1);
    InputOutput.<String>println(_plus_2);
  }
  
  protected static ArduinoBoard _privk3_getBoard(final DebugLogActionLogActionAspectProperties _self_, final LogAction _self) {
    EObject _head = IterableExtensions.<EObject>head(_self.eResource().getContents());
    Board _head_1 = IterableExtensions.<Board>head(((Project) _head).getBoards());
    return ((ArduinoBoard) _head_1);
  }
}
