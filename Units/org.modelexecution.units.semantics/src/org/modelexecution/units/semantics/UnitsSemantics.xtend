package org.modelexecution.units.semantics

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import org.modelexecution.units.Angle
import org.modelexecution.units.AngleUnit
import org.modelexecution.units.Centimeter
import org.modelexecution.units.Degree
import org.modelexecution.units.Foot
import org.modelexecution.units.Gradian
import org.modelexecution.units.Inch
import org.modelexecution.units.Length
import org.modelexecution.units.LengthUnit
import org.modelexecution.units.Meter
import org.modelexecution.units.Millimeter
import org.modelexecution.units.Quantity
import org.modelexecution.units.Radian
import org.modelexecution.units.Turn
import org.modelexecution.units.Unit
import org.modelexecution.units.Yard

import static extension org.modelexecution.units.semantics.AngleUnitAspect.*
import static extension org.modelexecution.units.semantics.LengthUnitAspect.*
import static extension org.modelexecution.units.semantics.UnitAspect.*

@Aspect(className = Quantity)
abstract class QuantityAspect {
	abstract def String print()
	def double getNormalized() {
		return switch (_self.unit) {
			AngleUnit: (_self.unit as AngleUnit).toRad(_self.value)
			LengthUnit: (_self.unit as LengthUnit).toCm(_self.value)
			default: 0
		}
	}
}

@Aspect(className = Unit)
abstract class UnitAspect {
	abstract def String getSymbol()
}

@Aspect(className = AngleUnit)
abstract class AngleUnitAspect extends UnitAspect {
	abstract def double toRad(double value)
}

@Aspect(className = LengthUnit)
abstract class LengthUnitAspect extends UnitAspect {
	abstract def double toCm(double value)
}

@Aspect(className = Angle)
class AngleAspect extends QuantityAspect {
	def double toRad() {
		return (_self.unit as AngleUnit).toRad(_self.value)
	}

	@OverrideAspectMethod
	def String print() {
		return '''«_self.value»«_self.unit.symbol» [«_self.toRad»rad]'''
	}
}

@Aspect(className = Radian)
class RadianAspect extends AngleUnitAspect {
	@OverrideAspectMethod
	def String getSymbol() { return "rad" }

	@OverrideAspectMethod
	def double toRad(double value) { return value }
}

@Aspect(className = Degree)
class DegreeAspect extends AngleUnitAspect {
	@OverrideAspectMethod
	def String getSymbol() { return "rad" }

	@OverrideAspectMethod
	def double toRad(double value) { return value * Math::PI / 180 }
}

@Aspect(className = Turn)
class TurnAspect extends AngleUnitAspect {
	@OverrideAspectMethod
	def String getSymbol() { return "rad" }

	@OverrideAspectMethod
	def double toRad(double value) { return value * 2 * Math::PI }
}

@Aspect(className = Gradian)
class GradianAspect extends AngleUnitAspect {
	@OverrideAspectMethod
	def String getSymbol() { return "rad" }

	@OverrideAspectMethod
	def double toRad(double value) { return value * Math::PI / 200 }
}

@Aspect(className = Length)
class LengthAspect extends QuantityAspect {
	def double toCm() {
		return (_self.unit as LengthUnit).toCm(_self.value)
	}

	def String print() {
		return '''«_self.value»«_self.unit.symbol» [«_self.toCm»cm]'''
	}
}

@Aspect(className = Centimeter)
class CentimeterAspect extends LengthUnitAspect {
	@OverrideAspectMethod
	def String getSymbol() { return "cm" }
	
	@OverrideAspectMethod
	def double toCm(double value) { return value }
}

@Aspect(className = Foot)
class FootAspect extends LengthUnitAspect {
	@OverrideAspectMethod
	def String getSymbol() { return "ft" }
	
	@OverrideAspectMethod
	def double toCm(double value) { return value * 30.48 }
}

@Aspect(className = Inch)
class InchAspect extends LengthUnitAspect {
	@OverrideAspectMethod
	def String getSymbol() { return "in" }
	
	@OverrideAspectMethod
	def double toCm(double value) { return value * 2.54 }
}

@Aspect(className = Meter)
class MeterAspect extends LengthUnitAspect {
	@OverrideAspectMethod
	def String getSymbol() { return "m" }
	
	@OverrideAspectMethod
	def double toCm(double value) { return value * 100 }
}

@Aspect(className = Millimeter)
class MillimeterAspect extends LengthUnitAspect {
	@OverrideAspectMethod
	def String getSymbol() { return "mm" }
	
	@OverrideAspectMethod
	def double toCm(double value) { return value * 0.1 }
}

@Aspect(className = Yard)
class YardAspect extends LengthUnitAspect {
	@OverrideAspectMethod
	def String getSymbol() { return "yd" }
	
	@OverrideAspectMethod
	def double toCm(double value) { return value * 91.44 }
}
