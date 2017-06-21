package org.gemoc.rover.rcl.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.gemoc.rover.rcl.semantics.BooleanValueAspect;
import org.gemoc.rover.rcl.semantics.NumberValueAspect;
import org.gemoc.rover.rcl.semantics.RoverProgramAspect;
import org.gemoc.rover.rcl.semantics.StatementAspect;
import org.gemoc.rover.rcl.semantics.StringValueAspect;
import org.gemoc.rover.rcl.semantics.VarRefAspectVarRefAspectProperties;
import rcl.BooleanValue;
import rcl.NumberValue;
import rcl.RoverProgram;
import rcl.RoverValue;
import rcl.StringValue;
import rcl.VarRef;

@Aspect(className = VarRef.class, with = { BooleanValueAspect.class, StringValueAspect.class, StatementAspect.class })
@SuppressWarnings("all")
public class VarRefAspect extends NumberValueAspect {
  @OverrideAspectMethod
  public static int getIntValue(final VarRef _self) {
    final org.gemoc.rover.rcl.semantics.VarRefAspectVarRefAspectProperties _self_ = org.gemoc.rover.rcl.semantics.VarRefAspectVarRefAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof rcl.VarRef){
    					result = org.gemoc.rover.rcl.semantics.VarRefAspect._privk3_getIntValue(_self_, (rcl.VarRef)_self);
    } else  if (_self instanceof rcl.NumberValue){
    					result = org.gemoc.rover.rcl.semantics.NumberValueAspect.getIntValue((rcl.NumberValue)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (int)result;
  }
  
  @OverrideAspectMethod
  public static boolean getBooleanValue(final VarRef _self) {
    final org.gemoc.rover.rcl.semantics.VarRefAspectVarRefAspectProperties _self_ = org.gemoc.rover.rcl.semantics.VarRefAspectVarRefAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_getBooleanValue(_self_, _self);;
    return (boolean)result;
  }
  
  @OverrideAspectMethod
  public static String getStringValue(final VarRef _self) {
    final org.gemoc.rover.rcl.semantics.VarRefAspectVarRefAspectProperties _self_ = org.gemoc.rover.rcl.semantics.VarRefAspectVarRefAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_getStringValue(_self_, _self);;
    return (java.lang.String)result;
  }
  
  @OverrideAspectMethod
  public static void eval(final VarRef _self) {
    final org.gemoc.rover.rcl.semantics.VarRefAspectVarRefAspectProperties _self_ = org.gemoc.rover.rcl.semantics.VarRefAspectVarRefAspectContext.getSelf(_self);
    _privk3_eval(_self_, _self);;
  }
  
  private static RoverProgram getProgram(final VarRef _self) {
    final org.gemoc.rover.rcl.semantics.VarRefAspectVarRefAspectProperties _self_ = org.gemoc.rover.rcl.semantics.VarRefAspectVarRefAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_getProgram(_self_, _self);;
    return (rcl.RoverProgram)result;
  }
  
  private static int super_getIntValue(final VarRef _self) {
    final org.gemoc.rover.rcl.semantics.NumberValueAspectNumberValueAspectProperties _self_ = org.gemoc.rover.rcl.semantics.NumberValueAspectNumberValueAspectContext.getSelf(_self);
    return  org.gemoc.rover.rcl.semantics.NumberValueAspect._privk3_getIntValue(_self_, _self);
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
    final org.gemoc.rover.rcl.semantics.BooleanValueAspectBooleanValueAspectProperties _self_ = org.gemoc.rover.rcl.semantics.BooleanValueAspectBooleanValueAspectContext.getSelf(_self);
    return  org.gemoc.rover.rcl.semantics.BooleanValueAspect._privk3_getBooleanValue(_self_, _self);
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
    final org.gemoc.rover.rcl.semantics.StringValueAspectStringValueAspectProperties _self_ = org.gemoc.rover.rcl.semantics.StringValueAspectStringValueAspectContext.getSelf(_self);
    return  org.gemoc.rover.rcl.semantics.StringValueAspect._privk3_getStringValue(_self_, _self);
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
