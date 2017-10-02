package rover.arduinoml.adapters.arduinomlmt.arduino;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory;
import rover.arduinoml.arduino.BluetoothTransceiver;

@SuppressWarnings("all")
public class BluetoothTransceiverAdapter extends EObjectAdapter<BluetoothTransceiver> implements rover.arduinomlmt.arduino.BluetoothTransceiver {
  private ArduinoMLMTAdaptersFactory adaptersFactory;
  
  public BluetoothTransceiverAdapter() {
    super(rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory.getInstance());
    adaptersFactory = rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  private EList<rover.arduinomlmt.arduino.BluetoothTransceiver> connectedTransceiver_;
  
  @Override
  public EList<rover.arduinomlmt.arduino.BluetoothTransceiver> getConnectedTransceiver() {
    if (connectedTransceiver_ == null)
    	connectedTransceiver_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getConnectedTransceiver(), adaptersFactory, eResource);
    return connectedTransceiver_;
  }
  
  @Override
  public EList<Integer> getDataReceived() {
    return rover.arduinoml.aspects.BluetoothTransceiver_PushAspect.dataReceived(adaptee);
  }
  
  @Override
  public EList<Integer> getDataToSend() {
    return rover.arduinoml.aspects.BluetoothTransceiver_PushAspect.dataToSend(adaptee);
  }
  
  @Override
  public void push() {
    rover.arduinoml.aspects.BluetoothTransceiver_PushAspect.push(adaptee);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return rover.arduinomlmt.arduino.ArduinoPackage.eINSTANCE.getBluetoothTransceiver();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.BLUETOOTH_TRANSCEIVER__NAME:
    		return getName();
    	case rover.arduinomlmt.arduino.ArduinoPackage.BLUETOOTH_TRANSCEIVER__CONNECTED_TRANSCEIVER:
    		return getConnectedTransceiver();
    	case rover.arduinomlmt.arduino.ArduinoPackage.BLUETOOTH_TRANSCEIVER__DATA_TO_SEND:
    		return getDataToSend();
    	case rover.arduinomlmt.arduino.ArduinoPackage.BLUETOOTH_TRANSCEIVER__DATA_RECEIVED:
    		return getDataReceived();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.BLUETOOTH_TRANSCEIVER__NAME:
    		return getName() != NAME_EDEFAULT;
    	case rover.arduinomlmt.arduino.ArduinoPackage.BLUETOOTH_TRANSCEIVER__CONNECTED_TRANSCEIVER:
    		return getConnectedTransceiver() != null && !getConnectedTransceiver().isEmpty();
    	case rover.arduinomlmt.arduino.ArduinoPackage.BLUETOOTH_TRANSCEIVER__DATA_TO_SEND:
    		return getDataToSend() != null && !getDataToSend().isEmpty();
    	case rover.arduinomlmt.arduino.ArduinoPackage.BLUETOOTH_TRANSCEIVER__DATA_RECEIVED:
    		return getDataReceived() != null && !getDataReceived().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.BLUETOOTH_TRANSCEIVER__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case rover.arduinomlmt.arduino.ArduinoPackage.BLUETOOTH_TRANSCEIVER__CONNECTED_TRANSCEIVER:
    		getConnectedTransceiver().clear();
    		getConnectedTransceiver().addAll((Collection) newValue);
    		return;
    	case rover.arduinomlmt.arduino.ArduinoPackage.BLUETOOTH_TRANSCEIVER__DATA_TO_SEND:
    		getDataToSend().clear();
    		getDataToSend().addAll((Collection) newValue);
    		return;
    	case rover.arduinomlmt.arduino.ArduinoPackage.BLUETOOTH_TRANSCEIVER__DATA_RECEIVED:
    		getDataReceived().clear();
    		getDataReceived().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
