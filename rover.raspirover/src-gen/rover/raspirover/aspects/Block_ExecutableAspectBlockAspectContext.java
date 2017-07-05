package rover.raspirover.aspects;

import java.util.Map;
import rover.raspirover.aspects.Block_ExecutableAspectBlockAspectProperties;
import rover.raspirover.raspirover.Block;

@SuppressWarnings("all")
public class Block_ExecutableAspectBlockAspectContext {
  public final static Block_ExecutableAspectBlockAspectContext INSTANCE = new Block_ExecutableAspectBlockAspectContext();
  
  public static Block_ExecutableAspectBlockAspectProperties getSelf(final Block _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.raspirover.aspects.Block_ExecutableAspectBlockAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Block, Block_ExecutableAspectBlockAspectProperties> map = new java.util.WeakHashMap<rover.raspirover.raspirover.Block, rover.raspirover.aspects.Block_ExecutableAspectBlockAspectProperties>();
  
  public Map<Block, Block_ExecutableAspectBlockAspectProperties> getMap() {
    return map;
  }
}
