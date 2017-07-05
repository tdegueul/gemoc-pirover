package rover.arduinoml.aspects;

import java.util.Map;
import rover.arduinoml.aspects.BooleanVariable_EvaluableAspectBooleanVariableAspectProperties;
import rover.arduinoml.arduino.BooleanVariable;

@SuppressWarnings("all")
public class BooleanVariable_EvaluableAspectBooleanVariableAspectContext {
  public final static BooleanVariable_EvaluableAspectBooleanVariableAspectContext INSTANCE = new BooleanVariable_EvaluableAspectBooleanVariableAspectContext();
  
  public static BooleanVariable_EvaluableAspectBooleanVariableAspectProperties getSelf(final BooleanVariable _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.arduinoml.aspects.BooleanVariable_EvaluableAspectBooleanVariableAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BooleanVariable, BooleanVariable_EvaluableAspectBooleanVariableAspectProperties> map = new java.util.WeakHashMap<rover.arduinoml.arduino.BooleanVariable, rover.arduinoml.aspects.BooleanVariable_EvaluableAspectBooleanVariableAspectProperties>();
  
  public Map<BooleanVariable, BooleanVariable_EvaluableAspectBooleanVariableAspectProperties> getMap() {
    return map;
  }
}
