package rover.raspirover.aspects;

import java.util.Map;
import rover.raspirover.aspects.StringExpressionASpectStringExpressionAspectProperties;
import rover.raspirover.raspirover.StringExpression;

@SuppressWarnings("all")
public class StringExpressionASpectStringExpressionAspectContext {
  public final static StringExpressionASpectStringExpressionAspectContext INSTANCE = new StringExpressionASpectStringExpressionAspectContext();
  
  public static StringExpressionASpectStringExpressionAspectProperties getSelf(final StringExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.raspirover.aspects.StringExpressionASpectStringExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<StringExpression, StringExpressionASpectStringExpressionAspectProperties> map = new java.util.WeakHashMap<rover.raspirover.raspirover.StringExpression, rover.raspirover.aspects.StringExpressionASpectStringExpressionAspectProperties>();
  
  public Map<StringExpression, StringExpressionASpectStringExpressionAspectProperties> getMap() {
    return map;
  }
}
