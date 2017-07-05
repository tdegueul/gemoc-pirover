package rover.arduinoml.adapters.arduinomlmt.arduino;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory;
import rover.arduinoml.arduino.UnaryBooleanExpression;
import rover.arduinomlmt.arduino.Expression;
import rover.arduinomlmt.arduino.UnaryBooleanOperatorKind;

@SuppressWarnings("all")
public class UnaryBooleanExpressionAdapter extends EObjectAdapter<UnaryBooleanExpression> implements rover.arduinomlmt.arduino.UnaryBooleanExpression {
  private ArduinoMLMTAdaptersFactory adaptersFactory;
  
  public UnaryBooleanExpressionAdapter() {
    super(rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory.getInstance());
    adaptersFactory = rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public UnaryBooleanOperatorKind getOperator() {
    return rover.arduinomlmt.arduino.UnaryBooleanOperatorKind.get(adaptee.getOperator().getValue());
  }
  
  @Override
  public void setOperator(final UnaryBooleanOperatorKind o) {
    adaptee.setOperator(rover.arduinoml.arduino.UnaryBooleanOperatorKind.get(o.getValue()));
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
  
  protected final static UnaryBooleanOperatorKind OPERATOR_EDEFAULT = rover.arduinomlmt.arduino.UnaryBooleanOperatorKind.NOT;
  
  @Override
  public EClass eClass() {
    return rover.arduinomlmt.arduino.ArduinoPackage.eINSTANCE.getUnaryBooleanExpression();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.UNARY_BOOLEAN_EXPRESSION__OPERAND:
    		return getOperand();
    	case rover.arduinomlmt.arduino.ArduinoPackage.UNARY_BOOLEAN_EXPRESSION__OPERATOR:
    		return getOperator();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.UNARY_BOOLEAN_EXPRESSION__OPERAND:
    		return getOperand() != null;
    	case rover.arduinomlmt.arduino.ArduinoPackage.UNARY_BOOLEAN_EXPRESSION__OPERATOR:
    		return getOperator() != OPERATOR_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.UNARY_BOOLEAN_EXPRESSION__OPERAND:
    		setOperand(
    		(rover.arduinomlmt.arduino.Expression)
    		 newValue);
    		return;
    	case rover.arduinomlmt.arduino.ArduinoPackage.UNARY_BOOLEAN_EXPRESSION__OPERATOR:
    		setOperator(
    		(rover.arduinomlmt.arduino.UnaryBooleanOperatorKind)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
