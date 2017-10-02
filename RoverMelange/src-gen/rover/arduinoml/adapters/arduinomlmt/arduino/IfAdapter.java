package rover.arduinoml.adapters.arduinomlmt.arduino;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory;
import rover.arduinoml.arduino.If;
import rover.arduinomlmt.arduino.Block;
import rover.arduinomlmt.arduino.BooleanExpression;

@SuppressWarnings("all")
public class IfAdapter extends EObjectAdapter<If> implements rover.arduinomlmt.arduino.If {
  private ArduinoMLMTAdaptersFactory adaptersFactory;
  
  public IfAdapter() {
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
  public Block getElseBlock() {
    return (Block) adaptersFactory.createAdapter(adaptee.getElseBlock(), eResource);
  }
  
  @Override
  public void setElseBlock(final Block o) {
    if (o != null)
    	adaptee.setElseBlock(((rover.arduinoml.adapters.arduinomlmt.arduino.BlockAdapter) o).getAdaptee());
    else adaptee.setElseBlock(null);
  }
  
  @Override
  public Boolean evaluate() {
    return rover.arduinoml.aspects.If_EvaluableAspect.evaluate(adaptee);
  }
  
  @Override
  public void execute() {
    rover.arduinoml.aspects.If_ExecutableAspect.execute(adaptee);
  }
  
  @Override
  public void finalize() {
    rover.arduinoml.aspects.Instruction_ExecutableAspect.finalize(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return rover.arduinomlmt.arduino.ArduinoPackage.eINSTANCE.getIf();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.IF__BLOCK:
    		return getBlock();
    	case rover.arduinomlmt.arduino.ArduinoPackage.IF__CONDITION:
    		return getCondition();
    	case rover.arduinomlmt.arduino.ArduinoPackage.IF__ELSE_BLOCK:
    		return getElseBlock();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.IF__BLOCK:
    		return getBlock() != null;
    	case rover.arduinomlmt.arduino.ArduinoPackage.IF__CONDITION:
    		return getCondition() != null;
    	case rover.arduinomlmt.arduino.ArduinoPackage.IF__ELSE_BLOCK:
    		return getElseBlock() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.IF__BLOCK:
    		setBlock(
    		(rover.arduinomlmt.arduino.Block)
    		 newValue);
    		return;
    	case rover.arduinomlmt.arduino.ArduinoPackage.IF__CONDITION:
    		setCondition(
    		(rover.arduinomlmt.arduino.BooleanExpression)
    		 newValue);
    		return;
    	case rover.arduinomlmt.arduino.ArduinoPackage.IF__ELSE_BLOCK:
    		setElseBlock(
    		(rover.arduinomlmt.arduino.Block)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
