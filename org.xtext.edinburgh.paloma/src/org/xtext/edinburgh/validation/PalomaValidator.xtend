/*
 * generated by Xtext
 */
package org.xtext.edinburgh.validation

import org.eclipse.xtext.validation.Check
import org.xtext.edinburgh.paloma.Param
import org.xtext.edinburgh.paloma.Model
import org.xtext.edinburgh.paloma.PalomaPackage
import org.eclipse.xtext.validation.ValidationMessageAcceptor
import org.xtext.edinburgh.paloma.AgentState
import org.xtext.edinburgh.paloma.AGENTS
import org.xtext.edinburgh.paloma.AGENT_NUM
import org.xtext.edinburgh.paloma.Terminal_RATE_Expr
import org.xtext.edinburgh.paloma.Terminal_PR_Expr
import org.xtext.edinburgh.paloma.Prefix

//import org.eclipse.xtext.validation.Check

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class PalomaValidator extends AbstractPalomaValidator {

public static val INVALID_NAME = 'invalidName'

	@Check
	def checkParamNonExist(Param param) {
		var model = param.eContainer() as Model;
		var count = 0;
		for (other : model.getParams()) {
			if (param.getName().equals(other.getName())) {
				count ++;
				if(count > 1) {
					error("Param names have to be unique", PalomaPackage$Literals::PARAM__NAME,
					 	ValidationMessageAcceptor.INSIGNIFICANT_INDEX);
					return;
				}
				
			}
		}
	}
	
	@Check
	def checkStateNonExist(AgentState state) {
		var model = state.eContainer() as Model;
		var count = 0;
		for (other : model.getStates()) {
			if (state.getName().equals(other.getName())) {
				count ++;
				if(count > 1) {
					error("State names have to be unique", PalomaPackage$Literals::AGENT_STATE__NAME,
					 	ValidationMessageAcceptor.INSIGNIFICANT_INDEX);
					return;
				}
				
			}
		}
	}
	
	@Check
	def checkAgentExist(AGENTS agents) {
		var tempt = agents.eContainer();
		while(true) {
			if(tempt.eContainer() == null) {
				var model = tempt as Model;
				for (state : model.getStates()) {
					if (state.getName().equals(agents.getType())) {	
						return;
					}
					for(prefix: state.getPrefixs()) {
						if(prefix.getContinue().equals(agents.getType())) {
							return;
						}
					}
				}
				
				error("Unknown agent state", PalomaPackage$Literals::AGENTS__TYPE,
						 	ValidationMessageAcceptor.INSIGNIFICANT_INDEX);
				return;
			}else {
				tempt = tempt.eContainer();
			}
		}
	}
	
	@Check
	def checkAgentNumExist(AGENT_NUM agents) {
		var tempt = agents.eContainer();
		while(true) {
			if(tempt.eContainer() == null) {
				var model = tempt as Model;
				for (state : model.getStates()) {
					if (state.getName().equals(agents.getType())) {	
						return;
					}
				}
				error("Undefined agent state", PalomaPackage$Literals::AGENT_NUM__TYPE,
						 	ValidationMessageAcceptor.INSIGNIFICANT_INDEX);
				return;
			}else {
				tempt = tempt.eContainer();
			}
		}
	}
	
	
	@Check
	def checkParamExistForTRE(Terminal_RATE_Expr iRange) {//check param exist
		var tempt = iRange.eContainer();
		while(true) {
			if(tempt.eContainer() == null) {
				var model = tempt as Model;
				for (param : model.getParams()) {
					if (iRange.getLinkedParam().equals(param.getName())) {	
						return;
					}
				}
				error("Undefined param", PalomaPackage$Literals::TERMINAL_RATE_EXPR__LINKED_PARAM,
						 	ValidationMessageAcceptor.INSIGNIFICANT_INDEX);
				return;
			}else {
				tempt = tempt.eContainer();
			}
		}
	}
	
	@Check
	def checkParamExistForTPE(Terminal_PR_Expr iRange) {//check param exist
		var tempt = iRange.eContainer();
		while(true) {
			if(tempt.eContainer() == null) {
				var model = tempt as Model;
				for (param : model.getParams()) {
					if (iRange.getLinkedParam().equals(param.getName())) {	
						return;
					}
				}
				error("Undefined param", PalomaPackage$Literals::TERMINAL_PR_EXPR__LINKED_PARAM,
						 	ValidationMessageAcceptor.INSIGNIFICANT_INDEX);
				return;
			}else {
				tempt = tempt.eContainer();
			}
		}
	}
	
	@Check
	def checkPrefix(Prefix prefix) {
		var tempt = prefix.eContainer();
		while(true) {
			if(tempt.eContainer() == null) {
				var model = tempt as Model;
				for (state : model.getStates()) {
					if (state.getName().equals(prefix.getContinue())) {	
						return;
					}
				}
				warning("Undefined continuing agent state", PalomaPackage$Literals::PREFIX__CONTINUE,
						 	ValidationMessageAcceptor.INSIGNIFICANT_INDEX);
				return;
			}else {
				tempt = tempt.eContainer();
			}
		}
	}
}
