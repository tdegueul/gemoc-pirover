package rover.rcl.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import rover.rcl.aspects.BooleanValueAspect;
import rover.rcl.aspects.NumberValueAspect;
import rover.rcl.aspects.RoverProgramAspect;
import rover.rcl.aspects.StatementAspect;
import rover.rcl.aspects.StringValueAspect;
import rover.rcl.aspects.VarRefAspectVarRefAspectProperties;
import rover.rcl.rcl.BooleanValue;
import rover.rcl.rcl.NumberValue;
import rover.rcl.rcl.RoverProgram;
import rover.rcl.rcl.RoverValue;
import rover.rcl.rcl.StringValue;
import rover.rcl.rcl.VarRef;

@Aspect(className = VarRef.class, with = { BooleanValueAspect.class, StringValueAspect.class, StatementAspect.class })
@SuppressWarnings("all")
public class VarRefAspect extends NumberValueAspect {
  @OverrideAspectMethod
  public static int getIntValue(final VarRef _self) {
	final rover.rcl.aspects.VarRefAspectVarRefAspectProperties _self_ = rover.rcl.aspects.VarRefAspectVarRefAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_getIntValue(_self_, _self);
	;
	return (int) result;
}
  
  @OverrideAspectMethod
  public static boolean getBooleanValue(final VarRef _self) {
	final rover.rcl.aspects.VarRefAspectVarRefAspectProperties _self_ = rover.rcl.aspects.VarRefAspectVarRefAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_getBooleanValue(_self_, _self);
	;
	return (boolean) result;
}
  
  @OverrideAspectMethod
  public static String getStringValue(final VarRef _self) {
	final rover.rcl.aspects.VarRefAspectVarRefAspectProperties _self_ = rover.rcl.aspects.VarRefAspectVarRefAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_getStringValue(_self_, _self);
	;
	return (java.lang.String) result;
}
  
  @OverrideAspectMethod
  public static void eval(final VarRef _self) {
	final rover.rcl.aspects.VarRefAspectVarRefAspectProperties _self_ = rover.rcl.aspects.VarRefAspectVarRefAspectContext
			.getSelf(_self);
	_privk3_eval(_self_, _self);
	;
}
  
  private static RoverProgram getProgram(final VarRef _self) {
    final rover.rcl.aspects.VarRefAspectVarRefAspectProperties _self_ = rover.rcl.aspects.VarRefAspectVarRefAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_getProgram(_self_, _self);;
    return (rover.rcl.rcl.RoverProgram)result;
  }
  
  private static int super_getIntValue(final VarRef _self) {
    final rover.rcl.aspects.NumberValueAspectNumberValueAspectProperties _self_ = rover.rcl.aspects.NumberValueAspectNumberValueAspectContext.getSelf(_self);
    return  rover.rcl.aspects.NumberValueAspect._privk3_getIntValue(_self_, _self);
  }
  
  protected static int _privk3_getIntValue(final VarRefAspectVarRefAspectProperties _self_, final VarRef _self) {
    RoverProgram _program = VarRefAspect.getProgram(_self);
    String _name = _self.getName();
    RoverValue _var = RoverProgramAspect.getVar(_program, _name);
    final NumberValue v = ((NumberValue) _var);
    String _name_1 = _self.getName();
    String _plus = (_name_1 + " == ");
    int _intValue = NumberValueAspect.getIntValue(v);
    String _plus_1 = (_plus + Integer.valueOf(_intValue));
    InputOutput.<String>println(_plus_1);
    return NumberValueAspect.getIntValue(v);
  }
  
  private static boolean super_getBooleanValue(final VarRef _self) {
    final rover.rcl.aspects.BooleanValueAspectBooleanValueAspectProperties _self_ = rover.rcl.aspects.BooleanValueAspectBooleanValueAspectContext.getSelf(_self);
    return  rover.rcl.aspects.BooleanValueAspect._privk3_getBooleanValue(_self_, _self);
  }
  
  protected static boolean _privk3_getBooleanValue(final VarRefAspectVarRefAspectProperties _self_, final VarRef _self) {
    RoverProgram _program = VarRefAspect.getProgram(_self);
    String _name = _self.getName();
    RoverValue _var = RoverProgramAspect.getVar(_program, _name);
    final BooleanValue v = ((BooleanValue) _var);
    String _name_1 = _self.getName();
    String _plus = (_name_1 + " == ");
    boolean _booleanValue = BooleanValueAspect.getBooleanValue(v);
    String _plus_1 = (_plus + Boolean.valueOf(_booleanValue));
    InputOutput.<String>println(_plus_1);
    return BooleanValueAspect.getBooleanValue(v);
  }
  
  private static String super_getStringValue(final VarRef _self) {
    final rover.rcl.aspects.StringValueAspectStringValueAspectProperties _self_ = rover.rcl.aspects.StringValueAspectStringValueAspectContext.getSelf(_self);
    return  rover.rcl.aspects.StringValueAspect._privk3_getStringValue(_self_, _self);
  }
  
  protected static String _privk3_getStringValue(final VarRefAspectVarRefAspectProperties _self_, final VarRef _self) {
    RoverProgram _program = VarRefAspect.getProgram(_self);
    String _name = _self.getName();
    RoverValue _var = RoverProgramAspect.getVar(_program, _name);
    final StringValue v = ((StringValue) _var);
    String _name_1 = _self.getName();
    String _plus = (_name_1 + " == ");
    String _stringValue = StringValueAspect.getStringValue(v);
    String _plus_1 = (_plus + _stringValue);
    InputOutput.<String>println(_plus_1);
    return StringValueAspect.getStringValue(v);
  }
  
  protected static void _privk3_eval(final VarRefAspectVarRefAspectProperties _self_, final VarRef _self) {
  }
  
  protected static RoverProgram _privk3_getProgram(final VarRefAspectVarRefAspectProperties _self_, final VarRef _self) {
    Resource _eResource = _self.eResource();
    EList<EObject> _contents = _eResource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    return ((RoverProgram) _head);
  }
}
