package rover.rcl.aspects;

import java.util.Map;
import rover.rcl.aspects.StringExpressionASpectStringExpressionAspectProperties;
import rover.rcl.rcl.StringExpression;

@SuppressWarnings("all")
public class StringExpressionASpectStringExpressionAspectContext {
  public final static StringExpressionASpectStringExpressionAspectContext INSTANCE = new StringExpressionASpectStringExpressionAspectContext();
  
  public static StringExpressionASpectStringExpressionAspectProperties getSelf(final StringExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.rcl.aspects.StringExpressionASpectStringExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<StringExpression, StringExpressionASpectStringExpressionAspectProperties> map = new java.util.WeakHashMap<rover.rcl.rcl.StringExpression, rover.rcl.aspects.StringExpressionASpectStringExpressionAspectProperties>();
  
  public Map<StringExpression, StringExpressionASpectStringExpressionAspectProperties> getMap() {
    return map;
  }
}
