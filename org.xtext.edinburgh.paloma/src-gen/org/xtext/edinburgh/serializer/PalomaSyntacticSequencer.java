package org.xtext.edinburgh.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.edinburgh.services.PalomaGrammarAccess;

@SuppressWarnings("all")
public class PalomaSyntacticSequencer extends AbstractSyntacticSequencer {

	protected PalomaGrammarAccess grammarAccess;
	protected AbstractElementAlias match_AGENTS___LeftSquareBracketKeyword_1_0_INTTerminalRuleCall_1_1_RightSquareBracketKeyword_1_2__q;
	protected AbstractElementAlias match_IRange___AllKeyword_1_or_LocalKeyword_0___or___LOCParserRuleCall_3_0___CommaKeyword_3_1_0_LOCParserRuleCall_3_1_1__a__;
	protected AbstractElementAlias match_Terminal_PR_Expr_DistParserRuleCall_1_2_or_NUMBERParserRuleCall_1_0;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (PalomaGrammarAccess) access;
		match_AGENTS___LeftSquareBracketKeyword_1_0_INTTerminalRuleCall_1_1_RightSquareBracketKeyword_1_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getAGENTSAccess().getLeftSquareBracketKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getAGENTSAccess().getINTTerminalRuleCall_1_1()), new TokenAlias(false, false, grammarAccess.getAGENTSAccess().getRightSquareBracketKeyword_1_2()));
		match_IRange___AllKeyword_1_or_LocalKeyword_0___or___LOCParserRuleCall_3_0___CommaKeyword_3_1_0_LOCParserRuleCall_3_1_1__a__ = new AlternativeAlias(false, false, new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getIRangeAccess().getAllKeyword_1()), new TokenAlias(false, false, grammarAccess.getIRangeAccess().getLocalKeyword_0())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getIRangeAccess().getLOCParserRuleCall_3_0()), new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getIRangeAccess().getCommaKeyword_3_1_0()), new TokenAlias(false, false, grammarAccess.getIRangeAccess().getLOCParserRuleCall_3_1_1()))));
		match_Terminal_PR_Expr_DistParserRuleCall_1_2_or_NUMBERParserRuleCall_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getTerminal_PR_ExprAccess().getDistParserRuleCall_1_2()), new TokenAlias(false, false, grammarAccess.getTerminal_PR_ExprAccess().getNUMBERParserRuleCall_1_0()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getDistRule())
			return getDistToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getINTRule())
			return getINTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLOCRule())
			return getLOCToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getMATH_OPRule())
			return getMATH_OPToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getNUMBERRule())
			return getNUMBERToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * Dist: 'dist' '(' ('loc_s'|'loc_r'|LOC) ',' ('loc_s'|'loc_r'|LOC) ')';
	 */
	protected String getDistToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "dist(loc_s,loc_s)";
	}
	
	/**
	 * terminal INT returns ecore::EInt: ('0'..'9')+;
	 */
	protected String getINTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * LOC: '(' INT ',' INT ')';
	 */
	protected String getLOCToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "(,)";
	}
	
	/**
	 * MATH_OP: ('^' | '+' | '-' | '*' | '/' | '%');
	 */
	protected String getMATH_OPToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "^";
	}
	
	/**
	 * NUMBER: (INT | DOUBLE | DOUBLE_SCIENTIFIC);
	 */
	protected String getNUMBERToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_AGENTS___LeftSquareBracketKeyword_1_0_INTTerminalRuleCall_1_1_RightSquareBracketKeyword_1_2__q.equals(syntax))
				emit_AGENTS___LeftSquareBracketKeyword_1_0_INTTerminalRuleCall_1_1_RightSquareBracketKeyword_1_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_IRange___AllKeyword_1_or_LocalKeyword_0___or___LOCParserRuleCall_3_0___CommaKeyword_3_1_0_LOCParserRuleCall_3_1_1__a__.equals(syntax))
				emit_IRange___AllKeyword_1_or_LocalKeyword_0___or___LOCParserRuleCall_3_0___CommaKeyword_3_1_0_LOCParserRuleCall_3_1_1__a__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Terminal_PR_Expr_DistParserRuleCall_1_2_or_NUMBERParserRuleCall_1_0.equals(syntax))
				emit_Terminal_PR_Expr_DistParserRuleCall_1_2_or_NUMBERParserRuleCall_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('[' INT ']')?
	 */
	protected void emit_AGENTS___LeftSquareBracketKeyword_1_0_INTTerminalRuleCall_1_1_RightSquareBracketKeyword_1_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (LOC (',' LOC)*) | ('local' | 'all')
	 */
	protected void emit_IRange___AllKeyword_1_or_LocalKeyword_0___or___LOCParserRuleCall_3_0___CommaKeyword_3_1_0_LOCParserRuleCall_3_1_1__a__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     Dist | NUMBER
	 */
	protected void emit_Terminal_PR_Expr_DistParserRuleCall_1_2_or_NUMBERParserRuleCall_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
