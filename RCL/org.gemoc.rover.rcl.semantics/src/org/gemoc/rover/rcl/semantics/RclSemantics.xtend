package org.gemoc.rover.rcl.semantics

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import java.util.Map
import java.util.concurrent.ThreadLocalRandom
import rcl.Action
import rcl.VarAssignment
import rcl.BackwardAction
import rcl.BackwardMinAction
import rcl.RclBlock
import rcl.BooleanExpression
import rcl.BooleanOperator
import rcl.BooleanValue
import rcl.Conditional
import rcl.ForwardAction
import rcl.ForwardMinAction
import rcl.HumidityQuery
import rcl.LogAction
import rcl.Loop
import rcl.MessageQuery
import rcl.NumberValue
import rcl.NumericExpression
import rcl.NumericOperator
import rcl.ObstacleQuery
import rcl.RclFactory
import rcl.RoverExpression
import rcl.RoverProgram
import rcl.RoverValue
import rcl.SendAction
import rcl.Statement
import rcl.StopAction
import rcl.StringExpression
import rcl.StringOperator
import rcl.StringValue
import rcl.TemperatureQuery
import rcl.TurnAction
import rcl.TurnDegAction
import rcl.VarRef

import static extension org.gemoc.rover.rcl.semantics.BooleanValueAspect.*
import static extension org.gemoc.rover.rcl.semantics.NumberValueAspect.*
import static extension org.gemoc.rover.rcl.semantics.RoverExpressionAspect.*
import static extension org.gemoc.rover.rcl.semantics.RoverProgramAspect.*
import static extension org.gemoc.rover.rcl.semantics.StatementAspect.*
import static extension org.gemoc.rover.rcl.semantics.StringValueAspect.*

@Aspect(className = RoverProgram)
class RoverProgramAspect {
	// Dirty global context
	Map<String, RoverValue> vars = newHashMap
	def RoverValue getVar(String n) {
		return _self.vars.get(n);
	}

	def void bindVar(String n, RoverValue v) {
		_self.vars.put(n, v)
	}

	@Main
	def void run() {
		_self.params.forEach[
			_self.bindVar(name, RclFactory.eINSTANCE.createNumberValue)
		]
		_self.block.eval
	}
}

@Aspect(className = Statement)
abstract class StatementAspect {
	abstract def void eval()
	def RoverProgram getProgram() {
		return _self.eResource.allContents.filter(RoverProgram).head
	}
}

@Aspect(className = VarAssignment)
class VarAssignmentAspect extends StatementAspect {
	@OverrideAspectMethod
	def void eval() {
		_self.program.bindVar(_self.name, _self.value)
	}
}

@Aspect(className = Conditional)
class ConditionalAspect extends StatementAspect {
	@OverrideAspectMethod
	def void eval() {
		if (_self.expr.eval)
			_self.condTrue.eval
		else
			_self.condFalse.eval
	}
}

@Aspect(className = Loop)
class LoopAspect extends StatementAspect {
	@OverrideAspectMethod
	def void eval() {
		while (_self.expr.eval)
			_self.block.eval
	}
}

@Aspect(className = RclBlock)
class RclBlockAspect extends StatementAspect {
	@OverrideAspectMethod
	def void eval() {
		_self.stmts.forEach[eval]
	}
}

@Aspect(className = TemperatureQuery)
class TemperatureQueryAspect extends NumberValueAspect {
	@OverrideAspectMethod
	def int getIntValue() {
		// Just some placeholder
		return ThreadLocalRandom.current().nextInt(12, 24)
	}
}

@Aspect(className = HumidityQuery)
class HumidityQueryAspect extends NumberValueAspect {
	@OverrideAspectMethod
	def int getIntValue() {
		// Just some placeholder
		return ThreadLocalRandom.current().nextInt(65, 95)
	}
}

@Aspect(className = MessageQuery)
class MessageQueryAspect extends StringValueAspect {
	@OverrideAspectMethod
	def String getStringValue() {
		// Just some placeholder
		val messages = #["start", "stop", "pause", "whatever"]
		return messages.get(ThreadLocalRandom.current().nextInt(0, 4))
	}
}

@Aspect(className = ObstacleQuery)
class ObstacleQueryAspect extends BooleanValueAspect {
	@OverrideAspectMethod
	def boolean getBooleanValue() {
		// Just some placeholder
		return ThreadLocalRandom.current().nextInt(0, 2) == 0
	}
}

@Aspect(className = NumberValue)
class NumberValueAspect {
	def int getIntValue() {
		return _self.NValue
	}
	
	def String print() {
		return _self.NValue.toString
	}
}

@Aspect(className = BooleanValue)
class BooleanValueAspect {
	def boolean getBooleanValue() {
		return _self.BValue
	}
}

@Aspect(className = StringValue)
class StringValueAspect {
	def String getStringValue() {
		return _self.SValue
	}
}

@Aspect(className = RoverExpression)
abstract class RoverExpressionAspect {
	abstract def boolean eval()
}

@Aspect(className = NumericExpression)
class NumericExpressionASpect extends RoverExpressionAspect {
	@OverrideAspectMethod
	def boolean eval() {
		return
			switch (_self.op) {
				case NumericOperator::LT:  _self.lhs.intValue <  _self.rhs.intValue
				case NumericOperator::EQ:  _self.lhs.intValue == _self.rhs.intValue
				case NumericOperator::NEQ: _self.lhs.intValue != _self.rhs.intValue
				case NumericOperator::GT:  _self.lhs.intValue >  _self.rhs.intValue
				case NumericOperator::LEQ: _self.lhs.intValue <= _self.rhs.intValue
				case NumericOperator::GEQ: _self.lhs.intValue >= _self.rhs.intValue
			}
	}
}

@Aspect(className = BooleanExpression)
class BooleanExpressionASpect extends RoverExpressionAspect {
	@OverrideAspectMethod
	def boolean eval() {
		return
			switch (_self.op) {
				case BooleanOperator::EQ:  _self.lhs.booleanValue == _self.rhs.booleanValue
				case BooleanOperator::NEQ: _self.lhs.booleanValue != _self.rhs.booleanValue
			}
	}
}

@Aspect(className = StringExpression)
class StringExpressionASpect extends RoverExpressionAspect {
	@OverrideAspectMethod
	def boolean eval() {
		return
			switch (_self.op) {
				case StringOperator::EQ:  _self.lhs.stringValue == _self.rhs.stringValue
				case StringOperator::NEQ: _self.lhs.stringValue != _self.rhs.stringValue
			}
	}
}

@Aspect(className = Action)
abstract class ActionAspect extends StatementAspect {}

@Aspect(className = ForwardAction)
class ForwardActionAspect extends ActionAspect {
	@OverrideAspectMethod
	def void eval() {
		println("<forward>")
	}
}

@Aspect(className = ForwardMinAction)
class ForwardMinActionAspect extends ActionAspect {
	@OverrideAspectMethod
	def void eval() {
		println("<forward (" + _self.distance + ")>")
	}
}

@Aspect(className = BackwardAction)
class BackwardActionAspect extends ActionAspect {
	@OverrideAspectMethod
	def void eval() {
		println("<backward>")
	}
}

@Aspect(className = BackwardMinAction)
class BackwardMinActionAspect extends ActionAspect {
	@OverrideAspectMethod
	def void eval() {
		println("<backward (" + _self.distance.print + ")>")
	}
}

@Aspect(className = TurnAction)
class TurnActionAspect extends ActionAspect {
	@OverrideAspectMethod
	def void eval() {
		println("<turn>")
	}
}

@Aspect(className = TurnDegAction)
class TurnDegActionAspect extends ActionAspect {
	@OverrideAspectMethod
	def void eval() {
		println("<turn (" + _self.degrees + ")>")
	}
}

@Aspect(className = StopAction)
class StopActionAspect extends ActionAspect {
	@OverrideAspectMethod
	def void eval() {
		println("<stop>")
	}
}

@Aspect(className = LogAction)
class LogActionAspect extends ActionAspect {
	@OverrideAspectMethod
	def void eval() {
		println("<log (" + _self.message + ")>")
	}
}

@Aspect(className = SendAction)
class SendActionAspect extends ActionAspect {
	@OverrideAspectMethod
	def void eval() {
		println("<send (" + _self.message + ")>")
	}
}

@Aspect(className = VarRef, with=#[BooleanValueAspect, StringValueAspect, StatementAspect])
class VarRefAspect extends NumberValueAspect {
	@OverrideAspectMethod
	def int getIntValue() {
		val v = _self.program.getVar(_self.name) as NumberValue
		println(_self.name + " == " + v.intValue)
		return v.intValue
	}

	@OverrideAspectMethod
	def boolean getBooleanValue() {
		val v = _self.program.getVar(_self.name) as BooleanValue
		println(_self.name + " == " + v.booleanValue)
		return v.booleanValue
	}

	@OverrideAspectMethod
	def String getStringValue() {
		val v = _self.program.getVar(_self.name) as StringValue
		println(_self.name + " == " + v.stringValue)
		return v.stringValue
	}
	
	@OverrideAspectMethod
	def void eval() {
		
	}
	
	private def RoverProgram getProgram() {
		return _self.eResource.allContents.filter(RoverProgram).head
	}
}
