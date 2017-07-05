package rover.arduinoml.aspects;

import java.util.Map;
import rover.arduinoml.aspects.VariableRef_EvaluableAspectVariableRefAspectProperties;
import rover.arduinoml.arduino.VariableRef;

@SuppressWarnings("all")
public class VariableRef_EvaluableAspectVariableRefAspectContext {
  public final static VariableRef_EvaluableAspectVariableRefAspectContext INSTANCE = new VariableRef_EvaluableAspectVariableRefAspectContext();
  
  public static VariableRef_EvaluableAspectVariableRefAspectProperties getSelf(final VariableRef _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.arduinoml.aspects.VariableRef_EvaluableAspectVariableRefAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<VariableRef, VariableRef_EvaluableAspectVariableRefAspectProperties> map = new java.util.WeakHashMap<rover.arduinoml.arduino.VariableRef, rover.arduinoml.aspects.VariableRef_EvaluableAspectVariableRefAspectProperties>();
  
  public Map<VariableRef, VariableRef_EvaluableAspectVariableRefAspectProperties> getMap() {
    return map;
  }
}
