package org.gemoc.rover.rcl.semantics;

import java.util.Map;
import org.gemoc.rover.rcl.semantics.NumericExpressionASpectNumericExpressionAspectProperties;
import rcl.NumericExpression;

@SuppressWarnings("all")
public class NumericExpressionASpectNumericExpressionAspectContext {
  public final static NumericExpressionASpectNumericExpressionAspectContext INSTANCE = new NumericExpressionASpectNumericExpressionAspectContext();
  
  public static NumericExpressionASpectNumericExpressionAspectProperties getSelf(final NumericExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.rover.rcl.semantics.NumericExpressionASpectNumericExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<NumericExpression, NumericExpressionASpectNumericExpressionAspectProperties> map = new java.util.WeakHashMap<rcl.NumericExpression, org.gemoc.rover.rcl.semantics.NumericExpressionASpectNumericExpressionAspectProperties>();
  
  public Map<NumericExpression, NumericExpressionASpectNumericExpressionAspectProperties> getMap() {
    return map;
  }
}
