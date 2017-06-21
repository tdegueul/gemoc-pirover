package org.gemoc.rover.rcl.semantics;

import java.util.Map;
import org.gemoc.rover.rcl.semantics.BlockAspectBlockAspectProperties;
import rcl.Block;

@SuppressWarnings("all")
public class BlockAspectBlockAspectContext {
  public final static BlockAspectBlockAspectContext INSTANCE = new BlockAspectBlockAspectContext();
  
  public static BlockAspectBlockAspectProperties getSelf(final Block _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.rover.rcl.semantics.BlockAspectBlockAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Block, BlockAspectBlockAspectProperties> map = new java.util.WeakHashMap<rcl.Block, org.gemoc.rover.rcl.semantics.BlockAspectBlockAspectProperties>();
  
  public Map<Block, BlockAspectBlockAspectProperties> getMap() {
    return map;
  }
}
