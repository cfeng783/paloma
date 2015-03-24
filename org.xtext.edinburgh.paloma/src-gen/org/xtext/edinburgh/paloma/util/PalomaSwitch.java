/**
 */
package org.xtext.edinburgh.paloma.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.edinburgh.paloma.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.edinburgh.paloma.PalomaPackage
 * @generated
 */
public class PalomaSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PalomaPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PalomaSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = PalomaPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case PalomaPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PalomaPackage.PARAM:
      {
        Param param = (Param)theEObject;
        T result = caseParam(param);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PalomaPackage.AGENT_STATE:
      {
        AgentState agentState = (AgentState)theEObject;
        T result = caseAgentState(agentState);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PalomaPackage.PREFIX:
      {
        Prefix prefix = (Prefix)theEObject;
        T result = casePrefix(prefix);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PalomaPackage.ACTION:
      {
        ACTION action = (ACTION)theEObject;
        T result = caseACTION(action);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PalomaPackage.ACT_SP_NO_MSG:
      {
        ACT_SpNoMsg acT_SpNoMsg = (ACT_SpNoMsg)theEObject;
        T result = caseACT_SpNoMsg(acT_SpNoMsg);
        if (result == null) result = caseACTION(acT_SpNoMsg);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PalomaPackage.ACT_SP_BR:
      {
        ACT_SpBr acT_SpBr = (ACT_SpBr)theEObject;
        T result = caseACT_SpBr(acT_SpBr);
        if (result == null) result = caseACTION(acT_SpBr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PalomaPackage.ACT_SP_UNI:
      {
        ACT_SpUni acT_SpUni = (ACT_SpUni)theEObject;
        T result = caseACT_SpUni(acT_SpUni);
        if (result == null) result = caseACTION(acT_SpUni);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PalomaPackage.ACT_IN_BR:
      {
        ACT_InBr acT_InBr = (ACT_InBr)theEObject;
        T result = caseACT_InBr(acT_InBr);
        if (result == null) result = caseACTION(acT_InBr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PalomaPackage.ACT_IN_UNI:
      {
        ACT_InUni acT_InUni = (ACT_InUni)theEObject;
        T result = caseACT_InUni(acT_InUni);
        if (result == null) result = caseACTION(acT_InUni);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PalomaPackage.IRANGE:
      {
        IRange iRange = (IRange)theEObject;
        T result = caseIRange(iRange);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PalomaPackage.PR_EXPR:
      {
        PR_Expr pR_Expr = (PR_Expr)theEObject;
        T result = casePR_Expr(pR_Expr);
        if (result == null) result = caseTerminal_PR_Expr(pR_Expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PalomaPackage.TERMINAL_PR_EXPR:
      {
        Terminal_PR_Expr terminal_PR_Expr = (Terminal_PR_Expr)theEObject;
        T result = caseTerminal_PR_Expr(terminal_PR_Expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PalomaPackage.RATE_EXPR:
      {
        RATE_Expr ratE_Expr = (RATE_Expr)theEObject;
        T result = caseRATE_Expr(ratE_Expr);
        if (result == null) result = caseIRange(ratE_Expr);
        if (result == null) result = caseTerminal_RATE_Expr(ratE_Expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PalomaPackage.TERMINAL_RATE_EXPR:
      {
        Terminal_RATE_Expr terminal_RATE_Expr = (Terminal_RATE_Expr)theEObject;
        T result = caseTerminal_RATE_Expr(terminal_RATE_Expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PalomaPackage.AGENT_NUM:
      {
        AGENT_NUM agenT_NUM = (AGENT_NUM)theEObject;
        T result = caseAGENT_NUM(agenT_NUM);
        if (result == null) result = caseTerminal_PR_Expr(agenT_NUM);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PalomaPackage.POPULATION:
      {
        POPULATION population = (POPULATION)theEObject;
        T result = casePOPULATION(population);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PalomaPackage.AGENTS:
      {
        AGENTS agents = (AGENTS)theEObject;
        T result = caseAGENTS(agents);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Param</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Param</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParam(Param object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Agent State</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Agent State</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAgentState(AgentState object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Prefix</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Prefix</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrefix(Prefix object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ACTION</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ACTION</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseACTION(ACTION object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ACT Sp No Msg</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ACT Sp No Msg</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseACT_SpNoMsg(ACT_SpNoMsg object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ACT Sp Br</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ACT Sp Br</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseACT_SpBr(ACT_SpBr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ACT Sp Uni</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ACT Sp Uni</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseACT_SpUni(ACT_SpUni object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ACT In Br</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ACT In Br</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseACT_InBr(ACT_InBr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ACT In Uni</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ACT In Uni</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseACT_InUni(ACT_InUni object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>IRange</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>IRange</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIRange(IRange object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PR Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PR Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePR_Expr(PR_Expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Terminal PR Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Terminal PR Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTerminal_PR_Expr(Terminal_PR_Expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>RATE Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>RATE Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRATE_Expr(RATE_Expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Terminal RATE Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Terminal RATE Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTerminal_RATE_Expr(Terminal_RATE_Expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>AGENT NUM</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>AGENT NUM</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAGENT_NUM(AGENT_NUM object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>POPULATION</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>POPULATION</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePOPULATION(POPULATION object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>AGENTS</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>AGENTS</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAGENTS(AGENTS object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //PalomaSwitch
