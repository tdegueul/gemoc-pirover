package rover.arduinoml.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import rover.arduinoml.aspects.ArduinoCommunicationModule_PushAspectArduinoCommunicationModuleAspectProperties;
import rover.arduinoml.arduino.ArduinoCommunicationModule;

@Aspect(className = ArduinoCommunicationModule.class)
@SuppressWarnings("all")
public abstract class ArduinoCommunicationModule_PushAspect {
  @Abstract
  public static void push(final ArduinoCommunicationModule _self) {
	final rover.arduinoml.aspects.ArduinoCommunicationModule_PushAspectArduinoCommunicationModuleAspectProperties _self_ = rover.arduinoml.aspects.ArduinoCommunicationModule_PushAspectArduinoCommunicationModuleAspectContext
			.getSelf(_self);
	if (_self instanceof rover.arduinoml.arduino.ArduinoCommunicationModule) {
		rover.arduinoml.aspects.ArduinoCommunicationModule_PushAspect._privk3_push(_self_,
				(rover.arduinoml.arduino.ArduinoCommunicationModule) _self);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
}
  
  protected static void _privk3_push(final ArduinoCommunicationModule_PushAspectArduinoCommunicationModuleAspectProperties _self_, final ArduinoCommunicationModule _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
