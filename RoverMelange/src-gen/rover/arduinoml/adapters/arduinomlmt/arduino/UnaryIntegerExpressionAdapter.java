package rover.arduinoml.adapters.arduinomlmt.arduino;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory;
import rover.arduinoml.arduino.UnaryIntegerExpression;
import rover.arduinomlmt.arduino.Expression;
import rover.arduinomlmt.arduino.UnaryIntegerOperatorKind;

@SuppressWarnings("all")
public class UnaryIntegerExpressionAdapter extends EObjectAdapter<UnaryIntegerExpression> implements rover.arduinomlmt.arduino.UnaryIntegerExpression {
  private ArduinoMLMTAdaptersFactory adaptersFactory;
  
  public UnaryIntegerExpressionAdapter() {
    super(rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory.getInstance());
    adaptersFactory = rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public UnaryIntegerOperatorKind getOperator() {
    return rover.arduinomlmt.arduino.UnaryIntegerOperatorKind.get(adaptee.getOperator().getValue());
  }
  
  @Override
  public void setOperator(final UnaryIntegerOperatorKind o) {
    adaptee.setOperator(rover.arduinoml.arduino.UnaryIntegerOperatorKind.get(o.getValue()));
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
  public Object evaluate() {
    return rover.arduinoml.aspects.Expression_EvaluableAspect.evaluate(adaptee);
  }
  
  protected final static UnaryIntegerOperatorKind OPERATOR_EDEFAULT = rover.arduinomlmt.arduino.UnaryIntegerOperatorKind.MINUS;
  
  @Override
  public EClass eClass() {
    return rover.arduinomlmt.arduino.ArduinoPackage.eINSTANCE.getUnaryIntegerExpression();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.UNARY_INTEGER_EXPRESSION__OPERAND:
    		return getOperand();
    	case rover.arduinomlmt.arduino.ArduinoPackage.UNARY_INTEGER_EXPRESSION__OPERATOR:
    		return getOperator();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.UNARY_INTEGER_EXPRESSION__OPERAND:
    		return getOperand() != null;
    	case rover.arduinomlmt.arduino.ArduinoPackage.UNARY_INTEGER_EXPRESSION__OPERATOR:
    		return getOperator() != OPERATOR_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.UNARY_INTEGER_EXPRESSION__OPERAND:
    		setOperand(
    		(rover.arduinomlmt.arduino.Expression)
    		 newValue);
    		return;
    	case rover.arduinomlmt.arduino.ArduinoPackage.UNARY_INTEGER_EXPRESSION__OPERATOR:
    		setOperator(
    		(rover.arduinomlmt.arduino.UnaryIntegerOperatorKind)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
