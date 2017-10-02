package rover.arduinoml.adapters.arduinomlmt.arduino;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory;
import rover.arduinoml.arduino.Block;
import rover.arduinomlmt.arduino.Instruction;

@SuppressWarnings("all")
public class BlockAdapter extends EObjectAdapter<Block> implements rover.arduinomlmt.arduino.Block {
  private ArduinoMLMTAdaptersFactory adaptersFactory;
  
  public BlockAdapter() {
    super(rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory.getInstance());
    adaptersFactory = rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory.getInstance();
  }
  
  private EList<Instruction> instructions_;
  
  @Override
  public EList<Instruction> getInstructions() {
    if (instructions_ == null)
    	instructions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInstructions(), adaptersFactory, eResource);
    return instructions_;
  }
  
  @Override
  public void execute() {
    rover.arduinoml.aspects.Block_ExecutableAspect.execute(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return rover.arduinomlmt.arduino.ArduinoPackage.eINSTANCE.getBlock();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.BLOCK__INSTRUCTIONS:
    		return getInstructions();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.BLOCK__INSTRUCTIONS:
    		return getInstructions() != null && !getInstructions().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.BLOCK__INSTRUCTIONS:
    		getInstructions().clear();
    		getInstructions().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
