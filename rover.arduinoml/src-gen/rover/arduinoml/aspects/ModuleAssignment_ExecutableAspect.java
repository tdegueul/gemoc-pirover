package rover.arduinoml.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.emf.common.util.EList;
import rover.arduinoml.aspects.BluetoothTransceiver_PushAspect;
import rover.arduinoml.aspects.Expression_EvaluableAspect;
import rover.arduinoml.aspects.Instruction_UtilitesAspect;
import rover.arduinoml.aspects.ModuleAssignment_ExecutableAspectModuleAssignmentAspectProperties;
import rover.arduinoml.aspects.ModuleInstruction_ExecutableAspect;
import rover.arduinoml.aspects.Pin_EvaluableAspect;
import rover.arduinoml.arduino.BluetoothTransceiver;
import rover.arduinoml.arduino.BooleanExpression;
import rover.arduinoml.arduino.Expression;
import rover.arduinoml.arduino.IntegerExpression;
import rover.arduinoml.arduino.Module;
import rover.arduinoml.arduino.ModuleAssignment;
import rover.arduinoml.arduino.Pin;

@Aspect(className = ModuleAssignment.class)
@SuppressWarnings("all")
public class ModuleAssignment_ExecutableAspect extends ModuleInstruction_ExecutableAspect {
  @Step
  @OverrideAspectMethod
  public static void execute(final ModuleAssignment _self) {
	final rover.arduinoml.aspects.ModuleAssignment_ExecutableAspectModuleAssignmentAspectProperties _self_ = rover.arduinoml.aspects.ModuleAssignment_ExecutableAspectModuleAssignmentAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_execute(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "ModuleAssignment", "execute");
	} else {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.EventManagerRegistry
				.getInstance().findEventManager(null);
		if (eventManager != null) {
			eventManager.manageEvents();
		}
		command.execute();
	}
	;
	;
}
  
  private static void super_execute(final ModuleAssignment _self) {
    final rover.arduinoml.aspects.ModuleInstruction_ExecutableAspectModuleInstructionAspectProperties _self_ = rover.arduinoml.aspects.ModuleInstruction_ExecutableAspectModuleInstructionAspectContext.getSelf(_self);
     rover.arduinoml.aspects.ModuleInstruction_ExecutableAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final ModuleAssignment_ExecutableAspectModuleAssignmentAspectProperties _self_, final ModuleAssignment _self) {
    Module _module = _self.getModule();
    final Pin pin = Instruction_UtilitesAspect.getPin(_self, _module);
    Expression _operand = _self.getOperand();
    if ((_operand instanceof IntegerExpression)) {
      Expression _operand_1 = _self.getOperand();
      Object _evaluate = Expression_EvaluableAspect.evaluate(_operand_1);
      Pin_EvaluableAspect.level(pin, (((Integer) _evaluate)).intValue());
    }
    Expression _operand_2 = _self.getOperand();
    if ((_operand_2 instanceof BooleanExpression)) {
      Expression _operand_3 = _self.getOperand();
      Object _evaluate_1 = Expression_EvaluableAspect.evaluate(_operand_3);
      if ((((Boolean) _evaluate_1)).booleanValue()) {
        Pin_EvaluableAspect.level(pin, (Pin_EvaluableAspect.HIGH).intValue());
      } else {
        Pin_EvaluableAspect.level(pin, (Pin_EvaluableAspect.LOW).intValue());
      }
    }
    Module _module_1 = _self.getModule();
    if ((_module_1 instanceof BluetoothTransceiver)) {
      Module _module_2 = _self.getModule();
      EList<Integer> _dataToSend = BluetoothTransceiver_PushAspect.dataToSend(((BluetoothTransceiver) _module_2));
      int _level = Pin_EvaluableAspect.level(pin);
      _dataToSend.add(Integer.valueOf(_level));
      Module _module_3 = _self.getModule();
      BluetoothTransceiver_PushAspect.push(((BluetoothTransceiver) _module_3));
    }
  }
}
