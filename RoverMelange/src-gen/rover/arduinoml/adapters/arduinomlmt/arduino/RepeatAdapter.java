package rover.arduinoml.adapters.arduinomlmt.arduino;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory;
import rover.arduinoml.arduino.Repeat;
import rover.arduinomlmt.arduino.Block;

@SuppressWarnings("all")
public class RepeatAdapter extends EObjectAdapter<Repeat> implements rover.arduinomlmt.arduino.Repeat {
  private ArduinoMLMTAdaptersFactory adaptersFactory;
  
  public RepeatAdapter() {
    super(rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory.getInstance());
    adaptersFactory = rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public int getIteration() {
    return adaptee.getIteration();
  }
  
  @Override
  public void setIteration(final int o) {
    adaptee.setIteration(o);
  }
  
  @Override
  public Block getBlock() {
    return (Block) adaptersFactory.createAdapter(adaptee.getBlock(), eResource);
  }
  
  @Override
  public void setBlock(final Block o) {
    if (o != null)
    	adaptee.setBlock(((rover.arduinoml.adapters.arduinomlmt.arduino.BlockAdapter) o).getAdaptee());
    else adaptee.setBlock(null);
  }
  
  @Override
  public void execute() {
    rover.arduinoml.aspects.Repeat_ExecutableAspect.execute(adaptee);
  }
  
  @Override
  public Boolean evaluate() {
    return rover.arduinoml.aspects.Repeat_EvaluableAspect.evaluate(adaptee);
  }
  
  @Override
  public void finalize() {
    rover.arduinoml.aspects.Repeat_EvaluableAspect.finalize(adaptee);
  }
  
  protected final static int ITERATION_EDEFAULT = 5;
  
  @Override
  public EClass eClass() {
    return rover.arduinomlmt.arduino.ArduinoPackage.eINSTANCE.getRepeat();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.REPEAT__BLOCK:
    		return getBlock();
    	case rover.arduinomlmt.arduino.ArduinoPackage.REPEAT__ITERATION:
    		return new java.lang.Integer(getIteration());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.REPEAT__BLOCK:
    		return getBlock() != null;
    	case rover.arduinomlmt.arduino.ArduinoPackage.REPEAT__ITERATION:
    		return getIteration() != ITERATION_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.REPEAT__BLOCK:
    		setBlock(
    		(rover.arduinomlmt.arduino.Block)
    		 newValue);
    		return;
    	case rover.arduinomlmt.arduino.ArduinoPackage.REPEAT__ITERATION:
    		setIteration(((java.lang.Integer) newValue).intValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
