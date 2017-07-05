package rover.arduinoml.aspects;

import java.util.Map;
import rover.arduinoml.aspects.IntegerVariable_EvaluableAspectIntegerVariableAspectProperties;
import rover.arduinoml.arduino.IntegerVariable;

@SuppressWarnings("all")
public class IntegerVariable_EvaluableAspectIntegerVariableAspectContext {
  public final static IntegerVariable_EvaluableAspectIntegerVariableAspectContext INSTANCE = new IntegerVariable_EvaluableAspectIntegerVariableAspectContext();
  
  public static IntegerVariable_EvaluableAspectIntegerVariableAspectProperties getSelf(final IntegerVariable _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.arduinoml.aspects.IntegerVariable_EvaluableAspectIntegerVariableAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IntegerVariable, IntegerVariable_EvaluableAspectIntegerVariableAspectProperties> map = new java.util.WeakHashMap<rover.arduinoml.arduino.IntegerVariable, rover.arduinoml.aspects.IntegerVariable_EvaluableAspectIntegerVariableAspectProperties>();
  
  public Map<IntegerVariable, IntegerVariable_EvaluableAspectIntegerVariableAspectProperties> getMap() {
    return map;
  }
}
