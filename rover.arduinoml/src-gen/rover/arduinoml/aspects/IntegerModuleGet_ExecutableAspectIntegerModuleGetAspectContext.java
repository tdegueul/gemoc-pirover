package rover.arduinoml.aspects;

import java.util.Map;
import rover.arduinoml.aspects.IntegerModuleGet_ExecutableAspectIntegerModuleGetAspectProperties;
import rover.arduinoml.arduino.IntegerModuleGet;

@SuppressWarnings("all")
public class IntegerModuleGet_ExecutableAspectIntegerModuleGetAspectContext {
  public final static IntegerModuleGet_ExecutableAspectIntegerModuleGetAspectContext INSTANCE = new IntegerModuleGet_ExecutableAspectIntegerModuleGetAspectContext();
  
  public static IntegerModuleGet_ExecutableAspectIntegerModuleGetAspectProperties getSelf(final IntegerModuleGet _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.arduinoml.aspects.IntegerModuleGet_ExecutableAspectIntegerModuleGetAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IntegerModuleGet, IntegerModuleGet_ExecutableAspectIntegerModuleGetAspectProperties> map = new java.util.WeakHashMap<rover.arduinoml.arduino.IntegerModuleGet, rover.arduinoml.aspects.IntegerModuleGet_ExecutableAspectIntegerModuleGetAspectProperties>();
  
  public Map<IntegerModuleGet, IntegerModuleGet_ExecutableAspectIntegerModuleGetAspectProperties> getMap() {
    return map;
  }
}
