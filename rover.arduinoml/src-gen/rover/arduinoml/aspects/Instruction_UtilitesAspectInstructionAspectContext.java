package rover.arduinoml.aspects;

import java.util.Map;
import rover.arduinoml.aspects.Instruction_UtilitesAspectInstructionAspectProperties;
import rover.arduinoml.arduino.Instruction;

@SuppressWarnings("all")
public class Instruction_UtilitesAspectInstructionAspectContext {
  public final static Instruction_UtilitesAspectInstructionAspectContext INSTANCE = new Instruction_UtilitesAspectInstructionAspectContext();
  
  public static Instruction_UtilitesAspectInstructionAspectProperties getSelf(final Instruction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.arduinoml.aspects.Instruction_UtilitesAspectInstructionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Instruction, Instruction_UtilitesAspectInstructionAspectProperties> map = new java.util.WeakHashMap<rover.arduinoml.arduino.Instruction, rover.arduinoml.aspects.Instruction_UtilitesAspectInstructionAspectProperties>();
  
  public Map<Instruction, Instruction_UtilitesAspectInstructionAspectProperties> getMap() {
    return map;
  }
}
