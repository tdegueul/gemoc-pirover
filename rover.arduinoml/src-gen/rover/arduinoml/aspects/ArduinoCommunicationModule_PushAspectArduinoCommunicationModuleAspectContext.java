package rover.arduinoml.aspects;

import java.util.Map;
import rover.arduinoml.aspects.ArduinoCommunicationModule_PushAspectArduinoCommunicationModuleAspectProperties;
import rover.arduinoml.arduino.ArduinoCommunicationModule;

@SuppressWarnings("all")
public class ArduinoCommunicationModule_PushAspectArduinoCommunicationModuleAspectContext {
  public final static ArduinoCommunicationModule_PushAspectArduinoCommunicationModuleAspectContext INSTANCE = new ArduinoCommunicationModule_PushAspectArduinoCommunicationModuleAspectContext();
  
  public static ArduinoCommunicationModule_PushAspectArduinoCommunicationModuleAspectProperties getSelf(final ArduinoCommunicationModule _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.arduinoml.aspects.ArduinoCommunicationModule_PushAspectArduinoCommunicationModuleAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ArduinoCommunicationModule, ArduinoCommunicationModule_PushAspectArduinoCommunicationModuleAspectProperties> map = new java.util.WeakHashMap<rover.arduinoml.arduino.ArduinoCommunicationModule, rover.arduinoml.aspects.ArduinoCommunicationModule_PushAspectArduinoCommunicationModuleAspectProperties>();
  
  public Map<ArduinoCommunicationModule, ArduinoCommunicationModule_PushAspectArduinoCommunicationModuleAspectProperties> getMap() {
    return map;
  }
}
