package rover.arduinoml.adapters.arduinomlmt.arduino;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory;
import rover.arduinoml.arduino.While;
import rover.arduinomlmt.arduino.Block;
import rover.arduinomlmt.arduino.BooleanExpression;

@SuppressWarnings("all")
public class WhileAdapter extends EObjectAdapter<While> implements rover.arduinomlmt.arduino.While {
  private ArduinoMLMTAdaptersFactory adaptersFactory;
  
  public WhileAdapter() {
    super(rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory.getInstance());
    adaptersFactory = rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory.getInstance();
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
  public BooleanExpression getCondition() {
    return (BooleanExpression) adaptersFactory.createAdapter(adaptee.getCondition(), eResource);
  }
  
  @Override
  public void setCondition(final BooleanExpression o) {
    if (o != null)
    	adaptee.setCondition(((rover.arduinoml.adapters.arduinomlmt.arduino.BooleanExpressionAdapter) o).getAdaptee());
    else adaptee.setCondition(null);
  }
  
  @Override
  public void execute() {
    rover.arduinoml.aspects.While_ExecutableAspect.execute(adaptee);
  }
  
  @Override
  public Boolean evaluate() {
    return rover.arduinoml.aspects.While_EvaluableAspect.evaluate(adaptee);
  }
  
  @Override
  public void finalize() {
    rover.arduinoml.aspects.Instruction_ExecutableAspect.finalize(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return rover.arduinomlmt.arduino.ArduinoPackage.eINSTANCE.getWhile();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.WHILE__BLOCK:
    		return getBlock();
    	case rover.arduinomlmt.arduino.ArduinoPackage.WHILE__CONDITION:
    		return getCondition();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.WHILE__BLOCK:
    		return getBlock() != null;
    	case rover.arduinomlmt.arduino.ArduinoPackage.WHILE__CONDITION:
    		return getCondition() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.WHILE__BLOCK:
    		setBlock(
    		(rover.arduinomlmt.arduino.Block)
    		 newValue);
    		return;
    	case rover.arduinomlmt.arduino.ArduinoPackage.WHILE__CONDITION:
    		setCondition(
    		(rover.arduinomlmt.arduino.BooleanExpression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
