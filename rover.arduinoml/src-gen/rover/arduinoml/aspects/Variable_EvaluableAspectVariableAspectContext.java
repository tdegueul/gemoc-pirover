package rover.arduinoml.aspects;

import java.util.Map;
import rover.arduinoml.aspects.Variable_EvaluableAspectVariableAspectProperties;
import rover.arduinoml.arduino.Variable;

@SuppressWarnings("all")
public class Variable_EvaluableAspectVariableAspectContext {
  public final static Variable_EvaluableAspectVariableAspectContext INSTANCE = new Variable_EvaluableAspectVariableAspectContext();
  
  public static Variable_EvaluableAspectVariableAspectProperties getSelf(final Variable _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.arduinoml.aspects.Variable_EvaluableAspectVariableAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Variable, Variable_EvaluableAspectVariableAspectProperties> map = new java.util.WeakHashMap<rover.arduinoml.arduino.Variable, rover.arduinoml.aspects.Variable_EvaluableAspectVariableAspectProperties>();
  
  public Map<Variable, Variable_EvaluableAspectVariableAspectProperties> getMap() {
    return map;
  }
}
