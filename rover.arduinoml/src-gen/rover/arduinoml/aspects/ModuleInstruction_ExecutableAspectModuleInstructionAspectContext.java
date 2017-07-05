package rover.arduinoml.aspects;

import java.util.Map;
import rover.arduinoml.aspects.ModuleInstruction_ExecutableAspectModuleInstructionAspectProperties;
import rover.arduinoml.arduino.ModuleInstruction;

@SuppressWarnings("all")
public class ModuleInstruction_ExecutableAspectModuleInstructionAspectContext {
  public final static ModuleInstruction_ExecutableAspectModuleInstructionAspectContext INSTANCE = new ModuleInstruction_ExecutableAspectModuleInstructionAspectContext();
  
  public static ModuleInstruction_ExecutableAspectModuleInstructionAspectProperties getSelf(final ModuleInstruction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.arduinoml.aspects.ModuleInstruction_ExecutableAspectModuleInstructionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ModuleInstruction, ModuleInstruction_ExecutableAspectModuleInstructionAspectProperties> map = new java.util.WeakHashMap<rover.arduinoml.arduino.ModuleInstruction, rover.arduinoml.aspects.ModuleInstruction_ExecutableAspectModuleInstructionAspectProperties>();
  
  public Map<ModuleInstruction, ModuleInstruction_ExecutableAspectModuleInstructionAspectProperties> getMap() {
    return map;
  }
}
