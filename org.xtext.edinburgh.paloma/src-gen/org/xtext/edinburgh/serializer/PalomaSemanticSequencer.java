package org.xtext.edinburgh.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.edinburgh.paloma.ACT_InBr;
import org.xtext.edinburgh.paloma.ACT_InUni;
import org.xtext.edinburgh.paloma.ACT_SpBr;
import org.xtext.edinburgh.paloma.ACT_SpNoMsg;
import org.xtext.edinburgh.paloma.ACT_SpUni;
import org.xtext.edinburgh.paloma.AGENTS;
import org.xtext.edinburgh.paloma.AGENT_NUM;
import org.xtext.edinburgh.paloma.AgentState;
import org.xtext.edinburgh.paloma.Model;
import org.xtext.edinburgh.paloma.POPULATION;
import org.xtext.edinburgh.paloma.PR_Expr;
import org.xtext.edinburgh.paloma.PalomaPackage;
import org.xtext.edinburgh.paloma.Param;
import org.xtext.edinburgh.paloma.Prefix;
import org.xtext.edinburgh.paloma.RATE_Expr;
import org.xtext.edinburgh.paloma.Terminal_PR_Expr;
import org.xtext.edinburgh.paloma.Terminal_RATE_Expr;
import org.xtext.edinburgh.services.PalomaGrammarAccess;

@SuppressWarnings("all")
public class PalomaSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PalomaGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == PalomaPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case PalomaPackage.ACT_IN_BR:
				if(context == grammarAccess.getACTIONRule() ||
				   context == grammarAccess.getACT_InBrRule()) {
					sequence_ACT_InBr(context, (ACT_InBr) semanticObject); 
					return; 
				}
				else break;
			case PalomaPackage.ACT_IN_UNI:
				if(context == grammarAccess.getACTIONRule() ||
				   context == grammarAccess.getACT_InUniRule()) {
					sequence_ACT_InUni(context, (ACT_InUni) semanticObject); 
					return; 
				}
				else break;
			case PalomaPackage.ACT_SP_BR:
				if(context == grammarAccess.getACTIONRule() ||
				   context == grammarAccess.getACT_SpBrRule()) {
					sequence_ACT_SpBr(context, (ACT_SpBr) semanticObject); 
					return; 
				}
				else break;
			case PalomaPackage.ACT_SP_NO_MSG:
				if(context == grammarAccess.getACTIONRule() ||
				   context == grammarAccess.getACT_SpNoMsgRule()) {
					sequence_ACT_SpNoMsg(context, (ACT_SpNoMsg) semanticObject); 
					return; 
				}
				else break;
			case PalomaPackage.ACT_SP_UNI:
				if(context == grammarAccess.getACTIONRule() ||
				   context == grammarAccess.getACT_SpUniRule()) {
					sequence_ACT_SpUni(context, (ACT_SpUni) semanticObject); 
					return; 
				}
				else break;
			case PalomaPackage.AGENTS:
				if(context == grammarAccess.getAGENTSRule()) {
					sequence_AGENTS(context, (AGENTS) semanticObject); 
					return; 
				}
				else break;
			case PalomaPackage.AGENT_NUM:
				if(context == grammarAccess.getAGENT_NUMRule() ||
				   context == grammarAccess.getTerminal_PR_ExprRule()) {
					sequence_AGENT_NUM(context, (AGENT_NUM) semanticObject); 
					return; 
				}
				else break;
			case PalomaPackage.AGENT_STATE:
				if(context == grammarAccess.getAgentStateRule()) {
					sequence_AgentState(context, (AgentState) semanticObject); 
					return; 
				}
				else break;
			case PalomaPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case PalomaPackage.POPULATION:
				if(context == grammarAccess.getPOPULATIONRule()) {
					sequence_POPULATION(context, (POPULATION) semanticObject); 
					return; 
				}
				else break;
			case PalomaPackage.PR_EXPR:
				if(context == grammarAccess.getPR_ExprRule() ||
				   context == grammarAccess.getTerminal_PR_ExprRule()) {
					sequence_PR_Expr(context, (PR_Expr) semanticObject); 
					return; 
				}
				else break;
			case PalomaPackage.PARAM:
				if(context == grammarAccess.getParamRule()) {
					sequence_Param(context, (Param) semanticObject); 
					return; 
				}
				else break;
			case PalomaPackage.PREFIX:
				if(context == grammarAccess.getPrefixRule()) {
					sequence_Prefix(context, (Prefix) semanticObject); 
					return; 
				}
				else break;
			case PalomaPackage.RATE_EXPR:
				if(context == grammarAccess.getIRangeRule() ||
				   context == grammarAccess.getRATE_ExprRule() ||
				   context == grammarAccess.getTerminal_RATE_ExprRule()) {
					sequence_RATE_Expr(context, (RATE_Expr) semanticObject); 
					return; 
				}
				else break;
			case PalomaPackage.TERMINAL_PR_EXPR:
				if(context == grammarAccess.getTerminal_PR_ExprRule()) {
					sequence_Terminal_PR_Expr(context, (Terminal_PR_Expr) semanticObject); 
					return; 
				}
				else break;
			case PalomaPackage.TERMINAL_RATE_EXPR:
				if(context == grammarAccess.getTerminal_RATE_ExprRule()) {
					sequence_Terminal_RATE_Expr(context, (Terminal_RATE_Expr) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID rate=RATE_Expr value=PR_Expr)
	 */
	protected void sequence_ACT_InBr(EObject context, ACT_InBr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PalomaPackage.Literals.ACTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PalomaPackage.Literals.ACTION__NAME));
			if(transientValues.isValueTransient(semanticObject, PalomaPackage.Literals.ACTION__RATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PalomaPackage.Literals.ACTION__RATE));
			if(transientValues.isValueTransient(semanticObject, PalomaPackage.Literals.ACT_IN_BR__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PalomaPackage.Literals.ACT_IN_BR__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getACT_InBrAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getACT_InBrAccess().getRateRATE_ExprParserRuleCall_3_0(), semanticObject.getRate());
		feeder.accept(grammarAccess.getACT_InBrAccess().getValuePR_ExprParserRuleCall_7_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID rate=RATE_Expr value=PR_Expr)
	 */
	protected void sequence_ACT_InUni(EObject context, ACT_InUni semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PalomaPackage.Literals.ACTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PalomaPackage.Literals.ACTION__NAME));
			if(transientValues.isValueTransient(semanticObject, PalomaPackage.Literals.ACTION__RATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PalomaPackage.Literals.ACTION__RATE));
			if(transientValues.isValueTransient(semanticObject, PalomaPackage.Literals.ACT_IN_UNI__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PalomaPackage.Literals.ACT_IN_UNI__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getACT_InUniAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getACT_InUniAccess().getRateRATE_ExprParserRuleCall_3_0(), semanticObject.getRate());
		feeder.accept(grammarAccess.getACT_InUniAccess().getValuePR_ExprParserRuleCall_7_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID rate=RATE_Expr range=IRange)
	 */
	protected void sequence_ACT_SpBr(EObject context, ACT_SpBr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PalomaPackage.Literals.ACTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PalomaPackage.Literals.ACTION__NAME));
			if(transientValues.isValueTransient(semanticObject, PalomaPackage.Literals.ACTION__RATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PalomaPackage.Literals.ACTION__RATE));
			if(transientValues.isValueTransient(semanticObject, PalomaPackage.Literals.ACT_SP_BR__RANGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PalomaPackage.Literals.ACT_SP_BR__RANGE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getACT_SpBrAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getACT_SpBrAccess().getRateRATE_ExprParserRuleCall_3_0(), semanticObject.getRate());
		feeder.accept(grammarAccess.getACT_SpBrAccess().getRangeIRangeParserRuleCall_7_0(), semanticObject.getRange());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID rate=RATE_Expr)
	 */
	protected void sequence_ACT_SpNoMsg(EObject context, ACT_SpNoMsg semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PalomaPackage.Literals.ACTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PalomaPackage.Literals.ACTION__NAME));
			if(transientValues.isValueTransient(semanticObject, PalomaPackage.Literals.ACTION__RATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PalomaPackage.Literals.ACTION__RATE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getACT_SpNoMsgAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getACT_SpNoMsgAccess().getRateRATE_ExprParserRuleCall_3_0(), semanticObject.getRate());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID rate=RATE_Expr range=IRange)
	 */
	protected void sequence_ACT_SpUni(EObject context, ACT_SpUni semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PalomaPackage.Literals.ACTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PalomaPackage.Literals.ACTION__NAME));
			if(transientValues.isValueTransient(semanticObject, PalomaPackage.Literals.ACTION__RATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PalomaPackage.Literals.ACTION__RATE));
			if(transientValues.isValueTransient(semanticObject, PalomaPackage.Literals.ACT_SP_UNI__RANGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PalomaPackage.Literals.ACT_SP_UNI__RANGE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getACT_SpUniAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getACT_SpUniAccess().getRateRATE_ExprParserRuleCall_3_0(), semanticObject.getRate());
		feeder.accept(grammarAccess.getACT_SpUniAccess().getRangeIRangeParserRuleCall_7_0(), semanticObject.getRange());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     type=AGENT
	 */
	protected void sequence_AGENTS(EObject context, AGENTS semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PalomaPackage.Literals.AGENTS__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PalomaPackage.Literals.AGENTS__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAGENTSAccess().getTypeAGENTParserRuleCall_0_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     type=AGENT
	 */
	protected void sequence_AGENT_NUM(EObject context, AGENT_NUM semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=AGENT prefixs+=Prefix prefixs+=Prefix*)
	 */
	protected void sequence_AgentState(EObject context, AgentState semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (params+=Param* states+=AgentState+ population=POPULATION)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (popu+=AGENTS popu+=AGENTS*)
	 */
	protected void sequence_POPULATION(EObject context, POPULATION semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (prE+=Terminal_PR_Expr prE+=Terminal_PR_Expr*)
	 */
	protected void sequence_PR_Expr(EObject context, PR_Expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID value=MATH_Expr)
	 */
	protected void sequence_Param(EObject context, Param semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PalomaPackage.Literals.PARAM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PalomaPackage.Literals.PARAM__NAME));
			if(transientValues.isValueTransient(semanticObject, PalomaPackage.Literals.PARAM__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PalomaPackage.Literals.PARAM__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParamAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getParamAccess().getValueMATH_ExprParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (action=ACTION continue=AGENT)
	 */
	protected void sequence_Prefix(EObject context, Prefix semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PalomaPackage.Literals.PREFIX__ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PalomaPackage.Literals.PREFIX__ACTION));
			if(transientValues.isValueTransient(semanticObject, PalomaPackage.Literals.PREFIX__CONTINUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PalomaPackage.Literals.PREFIX__CONTINUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrefixAccess().getActionACTIONParserRuleCall_0_0(), semanticObject.getAction());
		feeder.accept(grammarAccess.getPrefixAccess().getContinueAGENTParserRuleCall_1_0(), semanticObject.getContinue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (rt+=Terminal_RATE_Expr rt+=Terminal_RATE_Expr*)
	 */
	protected void sequence_RATE_Expr(EObject context, RATE_Expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     linkedParam=ID?
	 */
	protected void sequence_Terminal_PR_Expr(EObject context, Terminal_PR_Expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     linkedParam=ID?
	 */
	protected void sequence_Terminal_RATE_Expr(EObject context, Terminal_RATE_Expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
