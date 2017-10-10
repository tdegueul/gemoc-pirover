/*
 * generated by Xtext 2.12.0
 */
package rover.raspirover.xtext.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import rover.raspirover.xtext.services.RaspiRoverGrammarAccess;

@SuppressWarnings("all")
public class RaspiRoverSyntacticSequencer extends AbstractSyntacticSequencer {

	protected RaspiRoverGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Project___BoardsKeyword_2_0_LeftSquareBracketKeyword_2_1_RightSquareBracketKeyword_2_3__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (RaspiRoverGrammarAccess) access;
		match_Project___BoardsKeyword_2_0_LeftSquareBracketKeyword_2_1_RightSquareBracketKeyword_2_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getProjectAccess().getBoardsKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getProjectAccess().getLeftSquareBracketKeyword_2_1()), new TokenAlias(false, false, grammarAccess.getProjectAccess().getRightSquareBracketKeyword_2_3()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Project___BoardsKeyword_2_0_LeftSquareBracketKeyword_2_1_RightSquareBracketKeyword_2_3__q.equals(syntax))
				emit_Project___BoardsKeyword_2_0_LeftSquareBracketKeyword_2_1_RightSquareBracketKeyword_2_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ('boards' '[' ']')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'raspi-project' '{' (ambiguity) program=RoverProgram
	 */
	protected void emit_Project___BoardsKeyword_2_0_LeftSquareBracketKeyword_2_1_RightSquareBracketKeyword_2_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}