package rover.arduinoml.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import rover.arduinoml.aspects.BluetoothTransceiver_PushAspect;
import rover.arduinoml.aspects.Expression_EvaluableAspect;
import rover.arduinoml.aspects.Instruction_UtilitesAspect;
import rover.arduinoml.aspects.IntegerModuleGet_ExecutableAspectIntegerModuleGetAspectProperties;
import rover.arduinoml.aspects.Pin_EvaluableAspect;
import rover.arduinoml.arduino.BluetoothTransceiver;
import rover.arduinoml.arduino.Instruction;
import rover.arduinoml.arduino.IntegerModuleGet;
import rover.arduinoml.arduino.Module;
import rover.arduinoml.arduino.Pin;

@Aspect(className = IntegerModuleGet.class)
@SuppressWarnings("all")
public class IntegerModuleGet_ExecutableAspect extends Expression_EvaluableAspect {
  @OverrideAspectMethod
  public static Object evaluate(final IntegerModuleGet _self) {
	final rover.arduinoml.aspects.IntegerModuleGet_ExecutableAspectIntegerModuleGetAspectProperties _self_ = rover.arduinoml.aspects.IntegerModuleGet_ExecutableAspectIntegerModuleGetAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_evaluate(_self_, _self);
	;
	return (java.lang.Object) result;
}
  
  private static Object super_evaluate(final IntegerModuleGet _self) {
    final rover.arduinoml.aspects.Expression_EvaluableAspectExpressionAspectProperties _self_ = rover.arduinoml.aspects.Expression_EvaluableAspectExpressionAspectContext.getSelf(_self);
    return  rover.arduinoml.aspects.Expression_EvaluableAspect._privk3_evaluate(_self_, _self);
  }
  
  protected static Object _privk3_evaluate(final IntegerModuleGet_ExecutableAspectIntegerModuleGetAspectProperties _self_, final IntegerModuleGet _self) {
    Module _module = _self.getModule();
    if ((_module instanceof BluetoothTransceiver)) {
      Module _module_1 = _self.getModule();
      final EList<Integer> l = BluetoothTransceiver_PushAspect.dataReceived(((BluetoothTransceiver) _module_1));
      final Integer res = IterableExtensions.<Integer>head(l);
      boolean _notEquals = (!Objects.equal(res, null));
      if (_notEquals) {
        l.remove(0);
        return res;
      } else {
        return Integer.valueOf(0);
      }
    }
    Instruction _instruction = Expression_EvaluableAspect.getInstruction(_self);
    Module _module_2 = _self.getModule();
    final Pin pin = Instruction_UtilitesAspect.getPin(_instruction, _module_2);
    return Integer.valueOf(Pin_EvaluableAspect.level(pin));
  }
}
