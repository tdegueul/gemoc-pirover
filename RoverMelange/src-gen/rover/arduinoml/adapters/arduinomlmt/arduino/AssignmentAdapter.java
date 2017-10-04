package rover.arduinoml.adapters.arduinomlmt.arduino;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory;
import rover.arduinoml.arduino.Assignment;
import rover.arduinomlmt.arduino.Expression;

@SuppressWarnings("all")
public class AssignmentAdapter extends EObjectAdapter<Assignment> implements rover.arduinomlmt.arduino.Assignment {
  private ArduinoMLMTAdaptersFactory adaptersFactory;
  
  public AssignmentAdapter() {
    super(rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory.getInstance());
    adaptersFactory = rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Expression getOperand() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getOperand(), eResource);
  }
  
  @Override
  public void setOperand(final Expression o) {
    if (o != null)
    	adaptee.setOperand(((rover.arduinoml.adapters.arduinomlmt.arduino.ExpressionAdapter) o).getAdaptee());
    else adaptee.setOperand(null);
  }
  
  @Override
  public void execute() {
    rover.arduinoml.aspects.Instruction_ExecutableAspect.execute(adaptee);
  }
  
  @Override
  public void finalize() {
    rover.arduinoml.aspects.Instruction_ExecutableAspect.finalize(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return rover.arduinomlmt.arduino.ArduinoPackage.eINSTANCE.getAssignment();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.ASSIGNMENT__OPERAND:
    		return getOperand();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.ASSIGNMENT__OPERAND:
    		return getOperand() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.ASSIGNMENT__OPERAND:
    		setOperand(
    		(rover.arduinomlmt.arduino.Expression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
