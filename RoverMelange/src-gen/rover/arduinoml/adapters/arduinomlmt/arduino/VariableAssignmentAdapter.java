package rover.arduinoml.adapters.arduinomlmt.arduino;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory;
import rover.arduinoml.arduino.VariableAssignment;
import rover.arduinomlmt.arduino.Expression;
import rover.arduinomlmt.arduino.Variable;

@SuppressWarnings("all")
public class VariableAssignmentAdapter extends EObjectAdapter<VariableAssignment> implements rover.arduinomlmt.arduino.VariableAssignment {
  private ArduinoMLMTAdaptersFactory adaptersFactory;
  
  public VariableAssignmentAdapter() {
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
  public Variable getVariable() {
    return (Variable) adaptersFactory.createAdapter(adaptee.getVariable(), eResource);
  }
  
  @Override
  public void setVariable(final Variable o) {
    if (o != null)
    	adaptee.setVariable(((rover.arduinoml.adapters.arduinomlmt.arduino.VariableAdapter) o).getAdaptee());
    else adaptee.setVariable(null);
  }
  
  @Override
  public void execute() {
    rover.arduinoml.aspects.VariableAssignment_ExecutableAspect.execute(adaptee);
  }
  
  @Override
  public void finalize() {
    rover.arduinoml.aspects.Instruction_ExecutableAspect.finalize(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return rover.arduinomlmt.arduino.ArduinoPackage.eINSTANCE.getVariableAssignment();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.VARIABLE_ASSIGNMENT__OPERAND:
    		return getOperand();
    	case rover.arduinomlmt.arduino.ArduinoPackage.VARIABLE_ASSIGNMENT__VARIABLE:
    		return getVariable();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.VARIABLE_ASSIGNMENT__OPERAND:
    		return getOperand() != null;
    	case rover.arduinomlmt.arduino.ArduinoPackage.VARIABLE_ASSIGNMENT__VARIABLE:
    		return getVariable() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.VARIABLE_ASSIGNMENT__OPERAND:
    		setOperand(
    		(rover.arduinomlmt.arduino.Expression)
    		 newValue);
    		return;
    	case rover.arduinomlmt.arduino.ArduinoPackage.VARIABLE_ASSIGNMENT__VARIABLE:
    		setVariable(
    		(rover.arduinomlmt.arduino.Variable)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
    if (baseClass == rover.arduinomlmt.arduino.Assignment.class) {
    	switch (derivedFeatureID) {
    		case rover.arduinomlmt.arduino.ArduinoPackage.VARIABLE_ASSIGNMENT__OPERAND:
    			return rover.arduinomlmt.arduino.ArduinoPackage.ASSIGNMENT__OPERAND;
    		default: return -1;
    	}
    }
    
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }
  
  @Override
  public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass) {
    if (baseClass == rover.arduinomlmt.arduino.Assignment.class) {
    	switch (baseFeatureID) {
    		case rover.arduinomlmt.arduino.ArduinoPackage.ASSIGNMENT__OPERAND:
    			return rover.arduinomlmt.arduino.ArduinoPackage.VARIABLE_ASSIGNMENT__OPERAND;
    		default: return -1;
    	}
    }
    
    
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }
}
