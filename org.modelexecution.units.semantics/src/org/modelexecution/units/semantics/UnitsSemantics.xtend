package org.modelexecution.units.semantics

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import org.modelexecution.units.Centimeter
import org.modelexecution.units.Foot
import org.modelexecution.units.Inch
import org.modelexecution.units.LengthUnit
import org.modelexecution.units.Meter
import org.modelexecution.units.Millimeter
import org.modelexecution.units.Unit
import org.modelexecution.units.Yard

@Aspect(className = Unit)
abstract class UnitAspect {
	abstract def String print()
}

@Aspect(className = Centimeter)
class CentimeterAspect extends UnitAspect {
	@OverrideAspectMethod
	def String print() { return "cm" }
}

@Aspect(className = Foot)
class FootAspect extends UnitAspect {
	@OverrideAspectMethod
	def String print() { return "ft" }
}

@Aspect(className = Inch)
class InchAspect extends UnitAspect {
	@OverrideAspectMethod
	def String print() { return "in" }
}

@Aspect(className = Meter)
class MeterAspect extends UnitAspect {
	@OverrideAspectMethod
	def String print() { return "m" }
}

@Aspect(className = Millimeter)
class MillimeterAspect extends UnitAspect {
	@OverrideAspectMethod
	def String print() { return "mm" }
}

@Aspect(className = Yard)
class YardAspect extends UnitAspect {
	@OverrideAspectMethod
	def String print() { return "yd" }
}

@Aspect(className = LengthUnit)
class LengthUnitConverter {
	def int asCentimeters() {
		throw new UnsupportedOperationException
	}
}
