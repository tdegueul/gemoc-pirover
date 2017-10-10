/*
 * generated by Xtext 2.12.0
 */
package rover.raspirover.xtext.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import rover.raspirover.raspirover.AnalogPin;
import rover.raspirover.raspirover.BackwardAction;
import rover.raspirover.raspirover.BackwardMinAction;
import rover.raspirover.raspirover.BooleanExpression;
import rover.raspirover.raspirover.BooleanValue;
import rover.raspirover.raspirover.Centimeter;
import rover.raspirover.raspirover.Conditional;
import rover.raspirover.raspirover.Degree;
import rover.raspirover.raspirover.DigitalPin;
import rover.raspirover.raspirover.Foot;
import rover.raspirover.raspirover.ForwardAction;
import rover.raspirover.raspirover.ForwardMinAction;
import rover.raspirover.raspirover.Gradian;
import rover.raspirover.raspirover.HumidityQuery;
import rover.raspirover.raspirover.Inch;
import rover.raspirover.raspirover.LogAction;
import rover.raspirover.raspirover.Loop;
import rover.raspirover.raspirover.MessageQuery;
import rover.raspirover.raspirover.Meter;
import rover.raspirover.raspirover.Millimeter;
import rover.raspirover.raspirover.NumberValue;
import rover.raspirover.raspirover.NumericExpression;
import rover.raspirover.raspirover.ObstacleQuery;
import rover.raspirover.raspirover.Param;
import rover.raspirover.raspirover.Pin;
import rover.raspirover.raspirover.Project;
import rover.raspirover.raspirover.Quantity;
import rover.raspirover.raspirover.Radian;
import rover.raspirover.raspirover.RasPiBoard;
import rover.raspirover.raspirover.RaspiroverPackage;
import rover.raspirover.raspirover.RclBlock;
import rover.raspirover.raspirover.RoverProgram;
import rover.raspirover.raspirover.SendAction;
import rover.raspirover.raspirover.StopAction;
import rover.raspirover.raspirover.StringExpression;
import rover.raspirover.raspirover.StringValue;
import rover.raspirover.raspirover.TemperatureQuery;
import rover.raspirover.raspirover.Turn;
import rover.raspirover.raspirover.TurnAction;
import rover.raspirover.raspirover.TurnDegAction;
import rover.raspirover.raspirover.VarAssignment;
import rover.raspirover.raspirover.VarRef;
import rover.raspirover.raspirover.Yard;
import rover.raspirover.xtext.services.RaspiRoverGrammarAccess;

@SuppressWarnings("all")
public class RaspiRoverSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RaspiRoverGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == RaspiroverPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case RaspiroverPackage.ANALOG_PIN:
				sequence_AnalogPin(context, (AnalogPin) semanticObject); 
				return; 
			case RaspiroverPackage.BACKWARD_ACTION:
				sequence_BackwardAction(context, (BackwardAction) semanticObject); 
				return; 
			case RaspiroverPackage.BACKWARD_MIN_ACTION:
				sequence_BackwardMinAction(context, (BackwardMinAction) semanticObject); 
				return; 
			case RaspiroverPackage.BOOLEAN_EXPRESSION:
				sequence_BooleanExpression(context, (BooleanExpression) semanticObject); 
				return; 
			case RaspiroverPackage.BOOLEAN_VALUE:
				sequence_BooleanValue_Impl(context, (BooleanValue) semanticObject); 
				return; 
			case RaspiroverPackage.CENTIMETER:
				sequence_Centimeter(context, (Centimeter) semanticObject); 
				return; 
			case RaspiroverPackage.CONDITIONAL:
				sequence_Conditional(context, (Conditional) semanticObject); 
				return; 
			case RaspiroverPackage.DEGREE:
				sequence_Degree(context, (Degree) semanticObject); 
				return; 
			case RaspiroverPackage.DIGITAL_PIN:
				sequence_DigitalPin(context, (DigitalPin) semanticObject); 
				return; 
			case RaspiroverPackage.FOOT:
				sequence_Foot(context, (Foot) semanticObject); 
				return; 
			case RaspiroverPackage.FORWARD_ACTION:
				sequence_ForwardAction(context, (ForwardAction) semanticObject); 
				return; 
			case RaspiroverPackage.FORWARD_MIN_ACTION:
				sequence_ForwardMinAction(context, (ForwardMinAction) semanticObject); 
				return; 
			case RaspiroverPackage.GRADIAN:
				sequence_Gradian(context, (Gradian) semanticObject); 
				return; 
			case RaspiroverPackage.HUMIDITY_QUERY:
				sequence_HumidityQuery(context, (HumidityQuery) semanticObject); 
				return; 
			case RaspiroverPackage.INCH:
				sequence_Inch(context, (Inch) semanticObject); 
				return; 
			case RaspiroverPackage.LOG_ACTION:
				sequence_LogAction(context, (LogAction) semanticObject); 
				return; 
			case RaspiroverPackage.LOOP:
				sequence_Loop(context, (Loop) semanticObject); 
				return; 
			case RaspiroverPackage.MESSAGE_QUERY:
				sequence_MessageQuery(context, (MessageQuery) semanticObject); 
				return; 
			case RaspiroverPackage.METER:
				sequence_Meter(context, (Meter) semanticObject); 
				return; 
			case RaspiroverPackage.MILLIMETER:
				sequence_Millimeter(context, (Millimeter) semanticObject); 
				return; 
			case RaspiroverPackage.NUMBER_VALUE:
				sequence_NumberValue_Impl(context, (NumberValue) semanticObject); 
				return; 
			case RaspiroverPackage.NUMERIC_EXPRESSION:
				sequence_NumericExpression(context, (NumericExpression) semanticObject); 
				return; 
			case RaspiroverPackage.OBSTACLE_QUERY:
				sequence_ObstacleQuery(context, (ObstacleQuery) semanticObject); 
				return; 
			case RaspiroverPackage.PARAM:
				sequence_Param(context, (Param) semanticObject); 
				return; 
			case RaspiroverPackage.PIN:
				sequence_Pin_Impl(context, (Pin) semanticObject); 
				return; 
			case RaspiroverPackage.PROJECT:
				sequence_Project(context, (Project) semanticObject); 
				return; 
			case RaspiroverPackage.QUANTITY:
				sequence_Quantity(context, (Quantity) semanticObject); 
				return; 
			case RaspiroverPackage.RADIAN:
				sequence_Radian(context, (Radian) semanticObject); 
				return; 
			case RaspiroverPackage.RAS_PI_BOARD:
				sequence_RasPiBoard(context, (RasPiBoard) semanticObject); 
				return; 
			case RaspiroverPackage.RCL_BLOCK:
				sequence_RclBlock(context, (RclBlock) semanticObject); 
				return; 
			case RaspiroverPackage.ROVER_PROGRAM:
				sequence_RoverProgram(context, (RoverProgram) semanticObject); 
				return; 
			case RaspiroverPackage.SEND_ACTION:
				sequence_SendAction(context, (SendAction) semanticObject); 
				return; 
			case RaspiroverPackage.STOP_ACTION:
				sequence_StopAction(context, (StopAction) semanticObject); 
				return; 
			case RaspiroverPackage.STRING_EXPRESSION:
				sequence_StringExpression(context, (StringExpression) semanticObject); 
				return; 
			case RaspiroverPackage.STRING_VALUE:
				sequence_StringValue_Impl(context, (StringValue) semanticObject); 
				return; 
			case RaspiroverPackage.TEMPERATURE_QUERY:
				sequence_TemperatureQuery(context, (TemperatureQuery) semanticObject); 
				return; 
			case RaspiroverPackage.TURN:
				sequence_Turn(context, (Turn) semanticObject); 
				return; 
			case RaspiroverPackage.TURN_ACTION:
				sequence_TurnAction(context, (TurnAction) semanticObject); 
				return; 
			case RaspiroverPackage.TURN_DEG_ACTION:
				sequence_TurnDegAction(context, (TurnDegAction) semanticObject); 
				return; 
			case RaspiroverPackage.VAR_ASSIGNMENT:
				sequence_VarAssignment(context, (VarAssignment) semanticObject); 
				return; 
			case RaspiroverPackage.VAR_REF:
				sequence_VarRef(context, (VarRef) semanticObject); 
				return; 
			case RaspiroverPackage.YARD:
				sequence_Yard(context, (Yard) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Pin returns AnalogPin
	 *     AnalogPin returns AnalogPin
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_AnalogPin(ISerializationContext context, AnalogPin semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RaspiroverPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RaspiroverPackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAnalogPinAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns BackwardAction
	 *     BackwardAction returns BackwardAction
	 *
	 * Constraint:
	 *     {BackwardAction}
	 */
	protected void sequence_BackwardAction(ISerializationContext context, BackwardAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns BackwardMinAction
	 *     BackwardMinAction returns BackwardMinAction
	 *
	 * Constraint:
	 *     distance=NumberValue
	 */
	protected void sequence_BackwardMinAction(ISerializationContext context, BackwardMinAction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RaspiroverPackage.Literals.BACKWARD_MIN_ACTION__DISTANCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RaspiroverPackage.Literals.BACKWARD_MIN_ACTION__DISTANCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBackwardMinActionAccess().getDistanceNumberValueParserRuleCall_2_0(), semanticObject.getDistance());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     RoverExpression returns BooleanExpression
	 *     BooleanExpression returns BooleanExpression
	 *
	 * Constraint:
	 *     (lhs=BooleanValue op=BooleanOperator rhs=BooleanValue)
	 */
	protected void sequence_BooleanExpression(ISerializationContext context, BooleanExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RaspiroverPackage.Literals.BOOLEAN_EXPRESSION__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RaspiroverPackage.Literals.BOOLEAN_EXPRESSION__LHS));
			if (transientValues.isValueTransient(semanticObject, RaspiroverPackage.Literals.BOOLEAN_EXPRESSION__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RaspiroverPackage.Literals.BOOLEAN_EXPRESSION__OP));
			if (transientValues.isValueTransient(semanticObject, RaspiroverPackage.Literals.BOOLEAN_EXPRESSION__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RaspiroverPackage.Literals.BOOLEAN_EXPRESSION__RHS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBooleanExpressionAccess().getLhsBooleanValueParserRuleCall_1_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getBooleanExpressionAccess().getOpBooleanOperatorEnumRuleCall_2_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getBooleanExpressionAccess().getRhsBooleanValueParserRuleCall_3_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     RoverValue returns BooleanValue
	 *     BooleanValue returns BooleanValue
	 *     BooleanValue_Impl returns BooleanValue
	 *
	 * Constraint:
	 *     bValue?='true'
	 */
	protected void sequence_BooleanValue_Impl(ISerializationContext context, BooleanValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RaspiroverPackage.Literals.BOOLEAN_VALUE__BVALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RaspiroverPackage.Literals.BOOLEAN_VALUE__BVALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBooleanValue_ImplAccess().getBValueTrueKeyword_1_0(), semanticObject.isBValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Unit returns Centimeter
	 *     Centimeter returns Centimeter
	 *
	 * Constraint:
	 *     {Centimeter}
	 */
	protected void sequence_Centimeter(ISerializationContext context, Centimeter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Conditional
	 *     Conditional returns Conditional
	 *
	 * Constraint:
	 *     (expr=RoverExpression condTrue=RclBlock condFalse=RclBlock)
	 */
	protected void sequence_Conditional(ISerializationContext context, Conditional semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RaspiroverPackage.Literals.CONDITIONAL__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RaspiroverPackage.Literals.CONDITIONAL__EXPR));
			if (transientValues.isValueTransient(semanticObject, RaspiroverPackage.Literals.CONDITIONAL__COND_TRUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RaspiroverPackage.Literals.CONDITIONAL__COND_TRUE));
			if (transientValues.isValueTransient(semanticObject, RaspiroverPackage.Literals.CONDITIONAL__COND_FALSE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RaspiroverPackage.Literals.CONDITIONAL__COND_FALSE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConditionalAccess().getExprRoverExpressionParserRuleCall_2_0(), semanticObject.getExpr());
		feeder.accept(grammarAccess.getConditionalAccess().getCondTrueRclBlockParserRuleCall_4_0(), semanticObject.getCondTrue());
		feeder.accept(grammarAccess.getConditionalAccess().getCondFalseRclBlockParserRuleCall_6_0(), semanticObject.getCondFalse());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Unit returns Degree
	 *     Degree returns Degree
	 *
	 * Constraint:
	 *     {Degree}
	 */
	protected void sequence_Degree(ISerializationContext context, Degree semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Pin returns DigitalPin
	 *     DigitalPin returns DigitalPin
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_DigitalPin(ISerializationContext context, DigitalPin semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RaspiroverPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RaspiroverPackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDigitalPinAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Unit returns Foot
	 *     Foot returns Foot
	 *
	 * Constraint:
	 *     {Foot}
	 */
	protected void sequence_Foot(ISerializationContext context, Foot semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns ForwardAction
	 *     ForwardAction returns ForwardAction
	 *
	 * Constraint:
	 *     {ForwardAction}
	 */
	protected void sequence_ForwardAction(ISerializationContext context, ForwardAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns ForwardMinAction
	 *     ForwardMinAction returns ForwardMinAction
	 *
	 * Constraint:
	 *     distance=NumberValue
	 */
	protected void sequence_ForwardMinAction(ISerializationContext context, ForwardMinAction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RaspiroverPackage.Literals.FORWARD_MIN_ACTION__DISTANCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RaspiroverPackage.Literals.FORWARD_MIN_ACTION__DISTANCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getForwardMinActionAccess().getDistanceNumberValueParserRuleCall_2_0(), semanticObject.getDistance());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Unit returns Gradian
	 *     Gradian returns Gradian
	 *
	 * Constraint:
	 *     {Gradian}
	 */
	protected void sequence_Gradian(ISerializationContext context, Gradian semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RoverValue returns HumidityQuery
	 *     NumberValue returns HumidityQuery
	 *     HumidityQuery returns HumidityQuery
	 *
	 * Constraint:
	 *     {HumidityQuery}
	 */
	protected void sequence_HumidityQuery(ISerializationContext context, HumidityQuery semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Unit returns Inch
	 *     Inch returns Inch
	 *
	 * Constraint:
	 *     {Inch}
	 */
	protected void sequence_Inch(ISerializationContext context, Inch semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns LogAction
	 *     LogAction returns LogAction
	 *
	 * Constraint:
	 *     message=STRING
	 */
	protected void sequence_LogAction(ISerializationContext context, LogAction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RaspiroverPackage.Literals.LOG_ACTION__MESSAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RaspiroverPackage.Literals.LOG_ACTION__MESSAGE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLogActionAccess().getMessageSTRINGTerminalRuleCall_2_0(), semanticObject.getMessage());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Loop
	 *     Loop returns Loop
	 *
	 * Constraint:
	 *     (expr=RoverExpression block=RclBlock)
	 */
	protected void sequence_Loop(ISerializationContext context, Loop semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RaspiroverPackage.Literals.LOOP__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RaspiroverPackage.Literals.LOOP__EXPR));
			if (transientValues.isValueTransient(semanticObject, RaspiroverPackage.Literals.LOOP__BLOCK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RaspiroverPackage.Literals.LOOP__BLOCK));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLoopAccess().getExprRoverExpressionParserRuleCall_2_0(), semanticObject.getExpr());
		feeder.accept(grammarAccess.getLoopAccess().getBlockRclBlockParserRuleCall_5_0(), semanticObject.getBlock());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     RoverValue returns MessageQuery
	 *     StringValue returns MessageQuery
	 *     MessageQuery returns MessageQuery
	 *
	 * Constraint:
	 *     {MessageQuery}
	 */
	protected void sequence_MessageQuery(ISerializationContext context, MessageQuery semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Unit returns Meter
	 *     Meter returns Meter
	 *
	 * Constraint:
	 *     {Meter}
	 */
	protected void sequence_Meter(ISerializationContext context, Meter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Unit returns Millimeter
	 *     Millimeter returns Millimeter
	 *
	 * Constraint:
	 *     {Millimeter}
	 */
	protected void sequence_Millimeter(ISerializationContext context, Millimeter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RoverValue returns NumberValue
	 *     NumberValue returns NumberValue
	 *     NumberValue_Impl returns NumberValue
	 *
	 * Constraint:
	 *     quantity=Quantity
	 */
	protected void sequence_NumberValue_Impl(ISerializationContext context, NumberValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RaspiroverPackage.Literals.NUMBER_VALUE__QUANTITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RaspiroverPackage.Literals.NUMBER_VALUE__QUANTITY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNumberValue_ImplAccess().getQuantityQuantityParserRuleCall_1_0(), semanticObject.getQuantity());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     RoverExpression returns NumericExpression
	 *     NumericExpression returns NumericExpression
	 *
	 * Constraint:
	 *     (lhs=NumberValue op=NumericOperator rhs=NumberValue)
	 */
	protected void sequence_NumericExpression(ISerializationContext context, NumericExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RaspiroverPackage.Literals.NUMERIC_EXPRESSION__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RaspiroverPackage.Literals.NUMERIC_EXPRESSION__LHS));
			if (transientValues.isValueTransient(semanticObject, RaspiroverPackage.Literals.NUMERIC_EXPRESSION__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RaspiroverPackage.Literals.NUMERIC_EXPRESSION__OP));
			if (transientValues.isValueTransient(semanticObject, RaspiroverPackage.Literals.NUMERIC_EXPRESSION__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RaspiroverPackage.Literals.NUMERIC_EXPRESSION__RHS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNumericExpressionAccess().getLhsNumberValueParserRuleCall_1_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getNumericExpressionAccess().getOpNumericOperatorEnumRuleCall_2_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getNumericExpressionAccess().getRhsNumberValueParserRuleCall_3_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     RoverValue returns ObstacleQuery
	 *     BooleanValue returns ObstacleQuery
	 *     ObstacleQuery returns ObstacleQuery
	 *
	 * Constraint:
	 *     front?='front'?
	 */
	protected void sequence_ObstacleQuery(ISerializationContext context, ObstacleQuery semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Param returns Param
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Param(ISerializationContext context, Param semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RaspiroverPackage.Literals.PARAM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RaspiroverPackage.Literals.PARAM__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParamAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Pin returns Pin
	 *     Pin_Impl returns Pin
	 *
	 * Constraint:
	 *     (name=ID level=INT?)
	 */
	protected void sequence_Pin_Impl(ISerializationContext context, Pin semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Project returns Project
	 *
	 * Constraint:
	 *     (boards+=Board* program=RoverProgram)
	 */
	protected void sequence_Project(ISerializationContext context, Project semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Quantity returns Quantity
	 *
	 * Constraint:
	 *     (value=DOUBLE unit=Unit)
	 */
	protected void sequence_Quantity(ISerializationContext context, Quantity semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RaspiroverPackage.Literals.QUANTITY__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RaspiroverPackage.Literals.QUANTITY__VALUE));
			if (transientValues.isValueTransient(semanticObject, RaspiroverPackage.Literals.QUANTITY__UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RaspiroverPackage.Literals.QUANTITY__UNIT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getQuantityAccess().getValueDOUBLETerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getQuantityAccess().getUnitUnitParserRuleCall_2_0(), semanticObject.getUnit());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Unit returns Radian
	 *     Radian returns Radian
	 *
	 * Constraint:
	 *     {Radian}
	 */
	protected void sequence_Radian(ISerializationContext context, Radian semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Board returns RasPiBoard
	 *     RasPiBoard returns RasPiBoard
	 *
	 * Constraint:
	 *     (name=ID digitalPins+=DigitalPin* analogPins+=AnalogPin)
	 */
	protected void sequence_RasPiBoard(ISerializationContext context, RasPiBoard semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns RclBlock
	 *     RclBlock returns RclBlock
	 *
	 * Constraint:
	 *     stmts+=Statement+
	 */
	protected void sequence_RclBlock(ISerializationContext context, RclBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RoverProgram returns RoverProgram
	 *
	 * Constraint:
	 *     (name=ID (params+=Param params+=Param*)? block=RclBlock)
	 */
	protected void sequence_RoverProgram(ISerializationContext context, RoverProgram semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns SendAction
	 *     SendAction returns SendAction
	 *
	 * Constraint:
	 *     message=STRING
	 */
	protected void sequence_SendAction(ISerializationContext context, SendAction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RaspiroverPackage.Literals.SEND_ACTION__MESSAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RaspiroverPackage.Literals.SEND_ACTION__MESSAGE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSendActionAccess().getMessageSTRINGTerminalRuleCall_2_0(), semanticObject.getMessage());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns StopAction
	 *     StopAction returns StopAction
	 *
	 * Constraint:
	 *     {StopAction}
	 */
	protected void sequence_StopAction(ISerializationContext context, StopAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RoverExpression returns StringExpression
	 *     StringExpression returns StringExpression
	 *
	 * Constraint:
	 *     (lhs=StringValue op=StringOperator rhs=StringValue)
	 */
	protected void sequence_StringExpression(ISerializationContext context, StringExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RaspiroverPackage.Literals.STRING_EXPRESSION__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RaspiroverPackage.Literals.STRING_EXPRESSION__LHS));
			if (transientValues.isValueTransient(semanticObject, RaspiroverPackage.Literals.STRING_EXPRESSION__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RaspiroverPackage.Literals.STRING_EXPRESSION__OP));
			if (transientValues.isValueTransient(semanticObject, RaspiroverPackage.Literals.STRING_EXPRESSION__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RaspiroverPackage.Literals.STRING_EXPRESSION__RHS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStringExpressionAccess().getLhsStringValueParserRuleCall_1_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getStringExpressionAccess().getOpStringOperatorEnumRuleCall_2_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getStringExpressionAccess().getRhsStringValueParserRuleCall_3_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     RoverValue returns StringValue
	 *     StringValue returns StringValue
	 *     StringValue_Impl returns StringValue
	 *
	 * Constraint:
	 *     sValue=STRING
	 */
	protected void sequence_StringValue_Impl(ISerializationContext context, StringValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RaspiroverPackage.Literals.STRING_VALUE__SVALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RaspiroverPackage.Literals.STRING_VALUE__SVALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStringValue_ImplAccess().getSValueSTRINGTerminalRuleCall_1_0(), semanticObject.getSValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     RoverValue returns TemperatureQuery
	 *     NumberValue returns TemperatureQuery
	 *     TemperatureQuery returns TemperatureQuery
	 *
	 * Constraint:
	 *     {TemperatureQuery}
	 */
	protected void sequence_TemperatureQuery(ISerializationContext context, TemperatureQuery semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns TurnAction
	 *     TurnAction returns TurnAction
	 *
	 * Constraint:
	 *     {TurnAction}
	 */
	protected void sequence_TurnAction(ISerializationContext context, TurnAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns TurnDegAction
	 *     TurnDegAction returns TurnDegAction
	 *
	 * Constraint:
	 *     degrees=NumberValue
	 */
	protected void sequence_TurnDegAction(ISerializationContext context, TurnDegAction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RaspiroverPackage.Literals.TURN_DEG_ACTION__DEGREES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RaspiroverPackage.Literals.TURN_DEG_ACTION__DEGREES));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTurnDegActionAccess().getDegreesNumberValueParserRuleCall_2_0(), semanticObject.getDegrees());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Unit returns Turn
	 *     Turn returns Turn
	 *
	 * Constraint:
	 *     {Turn}
	 */
	protected void sequence_Turn(ISerializationContext context, Turn semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns VarAssignment
	 *     VarAssignment returns VarAssignment
	 *
	 * Constraint:
	 *     (name=ID value=RoverValue)
	 */
	protected void sequence_VarAssignment(ISerializationContext context, VarAssignment semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RaspiroverPackage.Literals.VAR_ASSIGNMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RaspiroverPackage.Literals.VAR_ASSIGNMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, RaspiroverPackage.Literals.VAR_ASSIGNMENT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RaspiroverPackage.Literals.VAR_ASSIGNMENT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVarAssignmentAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVarAssignmentAccess().getValueRoverValueParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns VarRef
	 *     RoverValue returns VarRef
	 *     NumberValue returns VarRef
	 *     StringValue returns VarRef
	 *     BooleanValue returns VarRef
	 *     VarRef returns VarRef
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_VarRef(ISerializationContext context, VarRef semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RaspiroverPackage.Literals.VAR_REF__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RaspiroverPackage.Literals.VAR_REF__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVarRefAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Unit returns Yard
	 *     Yard returns Yard
	 *
	 * Constraint:
	 *     {Yard}
	 */
	protected void sequence_Yard(ISerializationContext context, Yard semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}