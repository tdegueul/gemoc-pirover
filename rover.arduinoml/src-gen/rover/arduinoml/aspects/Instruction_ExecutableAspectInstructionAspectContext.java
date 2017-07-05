package rover.arduinoml.aspects;

import java.util.Map;
import rover.arduinoml.aspects.Instruction_ExecutableAspectInstructionAspectProperties;
import rover.arduinoml.arduino.Instruction;

@SuppressWarnings("all")
public class Instruction_ExecutableAspectInstructionAspectContext {
  public final static Instruction_ExecutableAspectInstructionAspectContext INSTANCE = new Instruction_ExecutableAspectInstructionAspectContext();
  
  public static Instruction_ExecutableAspectInstructionAspectProperties getSelf(final Instruction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.arduinoml.aspects.Instruction_ExecutableAspectInstructionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Instruction, Instruction_ExecutableAspectInstructionAspectProperties> map = new java.util.WeakHashMap<rover.arduinoml.arduino.Instruction, rover.arduinoml.aspects.Instruction_ExecutableAspectInstructionAspectProperties>();
  
  public Map<Instruction, Instruction_ExecutableAspectInstructionAspectProperties> getMap() {
    return map;
  }
}
