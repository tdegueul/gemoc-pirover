package rover.arduinoml.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import rover.arduinoml.aspects.Instruction_UtilitesAspectInstructionAspectProperties;
import rover.arduinoml.arduino.AnalogPin;
import rover.arduinoml.arduino.ArduinoAnalogModule;
import rover.arduinoml.arduino.ArduinoBoard;
import rover.arduinoml.arduino.ArduinoDigitalModule;
import rover.arduinoml.arduino.Board;
import rover.arduinoml.arduino.DigitalPin;
import rover.arduinoml.arduino.Instruction;
import rover.arduinoml.arduino.Module;
import rover.arduinoml.arduino.Pin;
import rover.arduinoml.arduino.Project;

@Aspect(className = Instruction.class)
@SuppressWarnings("all")
public class Instruction_UtilitesAspect {
  private static Project getProject(final Instruction _self, final Module module) {
    final rover.arduinoml.aspects.Instruction_UtilitesAspectInstructionAspectProperties _self_ = rover.arduinoml.aspects.Instruction_UtilitesAspectInstructionAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_getProject(_self_, _self,module);;
    return (rover.arduinoml.arduino.Project)result;
  }
  
  protected static Pin getPin(final Instruction _self, final Module module) {
    final rover.arduinoml.aspects.Instruction_UtilitesAspectInstructionAspectProperties _self_ = rover.arduinoml.aspects.Instruction_UtilitesAspectInstructionAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_getPin(_self_, _self,module);;
    return (rover.arduinoml.arduino.Pin)result;
  }
  
  protected static Project _privk3_getProject(final Instruction_UtilitesAspectInstructionAspectProperties _self_, final Instruction _self, final Module module) {
    Project project = null;
    EObject current = _self.eContainer();
    while ((!Objects.equal(current, null))) {
      {
        if ((current instanceof Project)) {
          project = ((Project) current);
          return project;
        }
        EObject _eContainer = current.eContainer();
        current = _eContainer;
      }
    }
    return project;
  }
  
  protected static Pin _privk3_getPin(final Instruction_UtilitesAspectInstructionAspectProperties _self_, final Instruction _self, final Module module) {
    Pin pin = null;
    final Project project = Instruction_UtilitesAspect.getProject(_self, module);
    EList<Board> _boards = project.getBoards();
    for (final Board board : _boards) {
      if (((!Objects.equal(board, null)) && (board instanceof ArduinoBoard))) {
        ArduinoBoard arduinoBoard = ((ArduinoBoard) board);
        EList<AnalogPin> _analogPins = arduinoBoard.getAnalogPins();
        for (final AnalogPin analogPin : _analogPins) {
          ArduinoAnalogModule _module = analogPin.getModule();
          boolean _equals = Objects.equal(_module, module);
          if (_equals) {
            return analogPin;
          }
        }
        EList<DigitalPin> _digitalPins = arduinoBoard.getDigitalPins();
        for (final DigitalPin digitalPin : _digitalPins) {
          ArduinoDigitalModule _module_1 = digitalPin.getModule();
          boolean _equals_1 = Objects.equal(_module_1, module);
          if (_equals_1) {
            return digitalPin;
          }
        }
      }
    }
    return pin;
  }
}
