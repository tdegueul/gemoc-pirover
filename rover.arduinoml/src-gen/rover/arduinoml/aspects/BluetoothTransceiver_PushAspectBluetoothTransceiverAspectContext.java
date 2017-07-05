package rover.arduinoml.aspects;

import java.util.Map;
import rover.arduinoml.aspects.BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties;
import rover.arduinoml.arduino.BluetoothTransceiver;

@SuppressWarnings("all")
public class BluetoothTransceiver_PushAspectBluetoothTransceiverAspectContext {
  public final static BluetoothTransceiver_PushAspectBluetoothTransceiverAspectContext INSTANCE = new BluetoothTransceiver_PushAspectBluetoothTransceiverAspectContext();
  
  public static BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties getSelf(final BluetoothTransceiver _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.arduinoml.aspects.BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BluetoothTransceiver, BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties> map = new java.util.WeakHashMap<rover.arduinoml.arduino.BluetoothTransceiver, rover.arduinoml.aspects.BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties>();
  
  public Map<BluetoothTransceiver, BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties> getMap() {
    return map;
  }
}
