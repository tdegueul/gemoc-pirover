package org.gemoc.rover.rcl.semantics;

import java.util.Map;
import org.gemoc.rover.rcl.semantics.BooleanExpressionASpectBooleanExpressionAspectProperties;
import rcl.BooleanExpression;

@SuppressWarnings("all")
public class BooleanExpressionASpectBooleanExpressionAspectContext {
  public final static BooleanExpressionASpectBooleanExpressionAspectContext INSTANCE = new BooleanExpressionASpectBooleanExpressionAspectContext();
  
  public static BooleanExpressionASpectBooleanExpressionAspectProperties getSelf(final BooleanExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.rover.rcl.semantics.BooleanExpressionASpectBooleanExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BooleanExpression, BooleanExpressionASpectBooleanExpressionAspectProperties> map = new java.util.WeakHashMap<rcl.BooleanExpression, org.gemoc.rover.rcl.semantics.BooleanExpressionASpectBooleanExpressionAspectProperties>();
  
  public Map<BooleanExpression, BooleanExpressionASpectBooleanExpressionAspectProperties> getMap() {
    return map;
  }
}
