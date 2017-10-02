package org.gemoc.rover.rcl.semantics;

import java.util.Map;
import org.gemoc.rover.rcl.semantics.StringExpressionASpectStringExpressionAspectProperties;
import rcl.StringExpression;

@SuppressWarnings("all")
public class StringExpressionASpectStringExpressionAspectContext {
  public final static StringExpressionASpectStringExpressionAspectContext INSTANCE = new StringExpressionASpectStringExpressionAspectContext();
  
  public static StringExpressionASpectStringExpressionAspectProperties getSelf(final StringExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.rover.rcl.semantics.StringExpressionASpectStringExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<StringExpression, StringExpressionASpectStringExpressionAspectProperties> map = new java.util.WeakHashMap<rcl.StringExpression, org.gemoc.rover.rcl.semantics.StringExpressionASpectStringExpressionAspectProperties>();
  
  public Map<StringExpression, StringExpressionASpectStringExpressionAspectProperties> getMap() {
    return map;
  }
}
