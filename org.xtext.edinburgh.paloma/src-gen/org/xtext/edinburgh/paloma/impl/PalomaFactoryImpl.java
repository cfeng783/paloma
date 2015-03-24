/**
 */
package org.xtext.edinburgh.paloma.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.edinburgh.paloma.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PalomaFactoryImpl extends EFactoryImpl implements PalomaFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PalomaFactory init()
  {
    try
    {
      PalomaFactory thePalomaFactory = (PalomaFactory)EPackage.Registry.INSTANCE.getEFactory(PalomaPackage.eNS_URI);
      if (thePalomaFactory != null)
      {
        return thePalomaFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PalomaFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PalomaFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case PalomaPackage.MODEL: return createModel();
      case PalomaPackage.PARAM: return createParam();
      case PalomaPackage.AGENT_STATE: return createAgentState();
      case PalomaPackage.PREFIX: return createPrefix();
      case PalomaPackage.ACTION: return createACTION();
      case PalomaPackage.ACT_SP_NO_MSG: return createACT_SpNoMsg();
      case PalomaPackage.ACT_SP_BR: return createACT_SpBr();
      case PalomaPackage.ACT_SP_UNI: return createACT_SpUni();
      case PalomaPackage.ACT_IN_BR: return createACT_InBr();
      case PalomaPackage.ACT_IN_UNI: return createACT_InUni();
      case PalomaPackage.IRANGE: return createIRange();
      case PalomaPackage.PR_EXPR: return createPR_Expr();
      case PalomaPackage.TERMINAL_PR_EXPR: return createTerminal_PR_Expr();
      case PalomaPackage.RATE_EXPR: return createRATE_Expr();
      case PalomaPackage.TERMINAL_RATE_EXPR: return createTerminal_RATE_Expr();
      case PalomaPackage.AGENT_NUM: return createAGENT_NUM();
      case PalomaPackage.POPULATION: return createPOPULATION();
      case PalomaPackage.AGENTS: return createAGENTS();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Param createParam()
  {
    ParamImpl param = new ParamImpl();
    return param;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AgentState createAgentState()
  {
    AgentStateImpl agentState = new AgentStateImpl();
    return agentState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Prefix createPrefix()
  {
    PrefixImpl prefix = new PrefixImpl();
    return prefix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ACTION createACTION()
  {
    ACTIONImpl action = new ACTIONImpl();
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ACT_SpNoMsg createACT_SpNoMsg()
  {
    ACT_SpNoMsgImpl acT_SpNoMsg = new ACT_SpNoMsgImpl();
    return acT_SpNoMsg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ACT_SpBr createACT_SpBr()
  {
    ACT_SpBrImpl acT_SpBr = new ACT_SpBrImpl();
    return acT_SpBr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ACT_SpUni createACT_SpUni()
  {
    ACT_SpUniImpl acT_SpUni = new ACT_SpUniImpl();
    return acT_SpUni;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ACT_InBr createACT_InBr()
  {
    ACT_InBrImpl acT_InBr = new ACT_InBrImpl();
    return acT_InBr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ACT_InUni createACT_InUni()
  {
    ACT_InUniImpl acT_InUni = new ACT_InUniImpl();
    return acT_InUni;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IRange createIRange()
  {
    IRangeImpl iRange = new IRangeImpl();
    return iRange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PR_Expr createPR_Expr()
  {
    PR_ExprImpl pR_Expr = new PR_ExprImpl();
    return pR_Expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Terminal_PR_Expr createTerminal_PR_Expr()
  {
    Terminal_PR_ExprImpl terminal_PR_Expr = new Terminal_PR_ExprImpl();
    return terminal_PR_Expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RATE_Expr createRATE_Expr()
  {
    RATE_ExprImpl ratE_Expr = new RATE_ExprImpl();
    return ratE_Expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Terminal_RATE_Expr createTerminal_RATE_Expr()
  {
    Terminal_RATE_ExprImpl terminal_RATE_Expr = new Terminal_RATE_ExprImpl();
    return terminal_RATE_Expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AGENT_NUM createAGENT_NUM()
  {
    AGENT_NUMImpl agenT_NUM = new AGENT_NUMImpl();
    return agenT_NUM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public POPULATION createPOPULATION()
  {
    POPULATIONImpl population = new POPULATIONImpl();
    return population;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AGENTS createAGENTS()
  {
    AGENTSImpl agents = new AGENTSImpl();
    return agents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PalomaPackage getPalomaPackage()
  {
    return (PalomaPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PalomaPackage getPackage()
  {
    return PalomaPackage.eINSTANCE;
  }

} //PalomaFactoryImpl
