package rover.arduinoml.adapters.arduinomlmt.arduino;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory;
import rover.arduinoml.arduino.ModuleAssignment;
import rover.arduinomlmt.arduino.Expression;
import rover.arduinomlmt.arduino.Module;

@SuppressWarnings("all")
public class ModuleAssignmentAdapter extends EObjectAdapter<ModuleAssignment> implements rover.arduinomlmt.arduino.ModuleAssignment {
  private ArduinoMLMTAdaptersFactory adaptersFactory;
  
  public ModuleAssignmentAdapter() {
    super(rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory.getInstance());
    adaptersFactory = rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Module getModule() {
    return (Module) adaptersFactory.createAdapter(adaptee.getModule(), eResource);
  }
  
  @Override
  public void setModule(final Module o) {
    if (o != null)
    	adaptee.setModule(((rover.arduinoml.adapters.arduinomlmt.arduino.ModuleAdapter) o).getAdaptee());
    else adaptee.setModule(null);
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
    rover.arduinoml.aspects.ModuleAssignment_ExecutableAspect.execute(adaptee);
  }
  
  @Override
  public void finalize() {
    rover.arduinoml.aspects.Instruction_ExecutableAspect.finalize(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return rover.arduinomlmt.arduino.ArduinoPackage.eINSTANCE.getModuleAssignment();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.MODULE_ASSIGNMENT__MODULE:
    		return getModule();
    	case rover.arduinomlmt.arduino.ArduinoPackage.MODULE_ASSIGNMENT__OPERAND:
    		return getOperand();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.MODULE_ASSIGNMENT__MODULE:
    		return getModule() != null;
    	case rover.arduinomlmt.arduino.ArduinoPackage.MODULE_ASSIGNMENT__OPERAND:
    		return getOperand() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.MODULE_ASSIGNMENT__MODULE:
    		setModule(
    		(rover.arduinomlmt.arduino.Module)
    		 newValue);
    		return;
    	case rover.arduinomlmt.arduino.ArduinoPackage.MODULE_ASSIGNMENT__OPERAND:
    		setOperand(
    		(rover.arduinomlmt.arduino.Expression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
    if (baseClass == rover.arduinomlmt.arduino.Assignment.class) {
    	switch (derivedFeatureID) {
    		case rover.arduinomlmt.arduino.ArduinoPackage.MODULE_ASSIGNMENT__OPERAND:
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
    			return rover.arduinomlmt.arduino.ArduinoPackage.MODULE_ASSIGNMENT__OPERAND;
    		default: return -1;
    	}
    }
    
    
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }
}
