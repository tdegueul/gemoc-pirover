package org.modelexecution.units.semantics

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import org.modelexecution.units.Centimeter
import org.modelexecution.units.Foot
import org.modelexecution.units.Inch
import org.modelexecution.units.Meter
import org.modelexecution.units.Millimeter
import org.modelexecution.units.Unit
import org.modelexecution.units.Yard

// Just some dummy helpers

@Aspect(className = Unit)
abstract class LengthUnitAspect {
	abstract def String print()
	abstract def double toCentimeters(double value)
}

@Aspect(className = Centimeter)
class CentimeterAspect extends LengthUnitAspect {
	@OverrideAspectMethod
	def String print() { return "cm" }
	
	@OverrideAspectMethod
	def double toCentimeters(double value) { return value }
}

@Aspect(className = Foot)
class FootAspect extends LengthUnitAspect {
	@OverrideAspectMethod
	def String print() { return "ft" }
	
	@OverrideAspectMethod
	def double toCentimeters(double value) { return value * 30.48 }
}

@Aspect(className = Inch)
class InchAspect extends LengthUnitAspect {
	@OverrideAspectMethod
	def String print() { return "in" }
	
	@OverrideAspectMethod
	def double toCentimeters(double value) { return value * 2.54 }
}

@Aspect(className = Meter)
class MeterAspect extends LengthUnitAspect {
	@OverrideAspectMethod
	def String print() { return "m" }
	
	@OverrideAspectMethod
	def double toCentimeters(double value) { return value * 100 }
}

@Aspect(className = Millimeter)
class MillimeterAspect extends LengthUnitAspect {
	@OverrideAspectMethod
	def String print() { return "mm" }
	
	@OverrideAspectMethod
	def double toCentimeters(double value) { return value * 0.1 }
}

@Aspect(className = Yard)
class YardAspect extends LengthUnitAspect {
	@OverrideAspectMethod
	def String print() { return "yd" }
	
	@OverrideAspectMethod
	def double toCentimeters(double value) { return value * 91.44 }
}
