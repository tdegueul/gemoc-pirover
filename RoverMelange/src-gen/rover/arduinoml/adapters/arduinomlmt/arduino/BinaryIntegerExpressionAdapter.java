package rover.arduinoml.adapters.arduinomlmt.arduino;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory;
import rover.arduinoml.arduino.BinaryIntegerExpression;
import rover.arduinomlmt.arduino.BinaryIntegerOperatorKind;
import rover.arduinomlmt.arduino.Expression;

@SuppressWarnings("all")
public class BinaryIntegerExpressionAdapter extends EObjectAdapter<BinaryIntegerExpression> implements rover.arduinomlmt.arduino.BinaryIntegerExpression {
  private ArduinoMLMTAdaptersFactory adaptersFactory;
  
  public BinaryIntegerExpressionAdapter() {
    super(rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory.getInstance());
    adaptersFactory = rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public BinaryIntegerOperatorKind getOperator() {
    return rover.arduinomlmt.arduino.BinaryIntegerOperatorKind.get(adaptee.getOperator().getValue());
  }
  
  @Override
  public void setOperator(final BinaryIntegerOperatorKind o) {
    adaptee.setOperator(rover.arduinoml.arduino.BinaryIntegerOperatorKind.get(o.getValue()));
  }
  
  @Override
  public Expression getLeft() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getLeft(), eResource);
  }
  
  @Override
  public void setLeft(final Expression o) {
    if (o != null)
    	adaptee.setLeft(((rover.arduinoml.adapters.arduinomlmt.arduino.ExpressionAdapter) o).getAdaptee());
    else adaptee.setLeft(null);
  }
  
  @Override
  public Expression getRight() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getRight(), eResource);
  }
  
  @Override
  public void setRight(final Expression o) {
    if (o != null)
    	adaptee.setRight(((rover.arduinoml.adapters.arduinomlmt.arduino.ExpressionAdapter) o).getAdaptee());
    else adaptee.setRight(null);
  }
  
  @Override
  public Object evaluate() {
    return rover.arduinoml.aspects.BinaryIntegerExpression_EvaluableAspect.evaluate(adaptee);
  }
  
  protected final static BinaryIntegerOperatorKind OPERATOR_EDEFAULT = rover.arduinomlmt.arduino.BinaryIntegerOperatorKind.MINUS;
  
  @Override
  public EClass eClass() {
    return rover.arduinomlmt.arduino.ArduinoPackage.eINSTANCE.getBinaryIntegerExpression();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.BINARY_INTEGER_EXPRESSION__LEFT:
    		return getLeft();
    	case rover.arduinomlmt.arduino.ArduinoPackage.BINARY_INTEGER_EXPRESSION__RIGHT:
    		return getRight();
    	case rover.arduinomlmt.arduino.ArduinoPackage.BINARY_INTEGER_EXPRESSION__OPERATOR:
    		return getOperator();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.BINARY_INTEGER_EXPRESSION__LEFT:
    		return getLeft() != null;
    	case rover.arduinomlmt.arduino.ArduinoPackage.BINARY_INTEGER_EXPRESSION__RIGHT:
    		return getRight() != null;
    	case rover.arduinomlmt.arduino.ArduinoPackage.BINARY_INTEGER_EXPRESSION__OPERATOR:
    		return getOperator() != OPERATOR_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.BINARY_INTEGER_EXPRESSION__LEFT:
    		setLeft(
    		(rover.arduinomlmt.arduino.Expression)
    		 newValue);
    		return;
    	case rover.arduinomlmt.arduino.ArduinoPackage.BINARY_INTEGER_EXPRESSION__RIGHT:
    		setRight(
    		(rover.arduinomlmt.arduino.Expression)
    		 newValue);
    		return;
    	case rover.arduinomlmt.arduino.ArduinoPackage.BINARY_INTEGER_EXPRESSION__OPERATOR:
    		setOperator(
    		(rover.arduinomlmt.arduino.BinaryIntegerOperatorKind)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
