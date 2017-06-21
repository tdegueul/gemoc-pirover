package rover.rcl.aspects;

import java.util.Map;
import rover.rcl.aspects.StatementAspectStatementAspectProperties;
import rover.rcl.rcl.Statement;

@SuppressWarnings("all")
public class StatementAspectStatementAspectContext {
  public final static StatementAspectStatementAspectContext INSTANCE = new StatementAspectStatementAspectContext();
  
  public static StatementAspectStatementAspectProperties getSelf(final Statement _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.rcl.aspects.StatementAspectStatementAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Statement, StatementAspectStatementAspectProperties> map = new java.util.WeakHashMap<rover.rcl.rcl.Statement, rover.rcl.aspects.StatementAspectStatementAspectProperties>();
  
  public Map<Statement, StatementAspectStatementAspectProperties> getMap() {
    return map;
  }
}
