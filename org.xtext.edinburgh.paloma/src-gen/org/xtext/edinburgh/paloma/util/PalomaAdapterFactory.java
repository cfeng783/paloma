/**
 */
package org.xtext.edinburgh.paloma.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.edinburgh.paloma.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.edinburgh.paloma.PalomaPackage
 * @generated
 */
public class PalomaAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PalomaPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PalomaAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = PalomaPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PalomaSwitch<Adapter> modelSwitch =
    new PalomaSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseParam(Param object)
      {
        return createParamAdapter();
      }
      @Override
      public Adapter caseAgentState(AgentState object)
      {
        return createAgentStateAdapter();
      }
      @Override
      public Adapter casePrefix(Prefix object)
      {
        return createPrefixAdapter();
      }
      @Override
      public Adapter caseACTION(ACTION object)
      {
        return createACTIONAdapter();
      }
      @Override
      public Adapter caseACT_SpNoMsg(ACT_SpNoMsg object)
      {
        return createACT_SpNoMsgAdapter();
      }
      @Override
      public Adapter caseACT_SpBr(ACT_SpBr object)
      {
        return createACT_SpBrAdapter();
      }
      @Override
      public Adapter caseACT_SpUni(ACT_SpUni object)
      {
        return createACT_SpUniAdapter();
      }
      @Override
      public Adapter caseACT_InBr(ACT_InBr object)
      {
        return createACT_InBrAdapter();
      }
      @Override
      public Adapter caseACT_InUni(ACT_InUni object)
      {
        return createACT_InUniAdapter();
      }
      @Override
      public Adapter caseIRange(IRange object)
      {
        return createIRangeAdapter();
      }
      @Override
      public Adapter casePR_Expr(PR_Expr object)
      {
        return createPR_ExprAdapter();
      }
      @Override
      public Adapter caseTerminal_PR_Expr(Terminal_PR_Expr object)
      {
        return createTerminal_PR_ExprAdapter();
      }
      @Override
      public Adapter caseRATE_Expr(RATE_Expr object)
      {
        return createRATE_ExprAdapter();
      }
      @Override
      public Adapter caseTerminal_RATE_Expr(Terminal_RATE_Expr object)
      {
        return createTerminal_RATE_ExprAdapter();
      }
      @Override
      public Adapter caseAGENT_NUM(AGENT_NUM object)
      {
        return createAGENT_NUMAdapter();
      }
      @Override
      public Adapter casePOPULATION(POPULATION object)
      {
        return createPOPULATIONAdapter();
      }
      @Override
      public Adapter caseAGENTS(AGENTS object)
      {
        return createAGENTSAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.xtext.edinburgh.paloma.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.edinburgh.paloma.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.edinburgh.paloma.Param <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.edinburgh.paloma.Param
   * @generated
   */
  public Adapter createParamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.edinburgh.paloma.AgentState <em>Agent State</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.edinburgh.paloma.AgentState
   * @generated
   */
  public Adapter createAgentStateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.edinburgh.paloma.Prefix <em>Prefix</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.edinburgh.paloma.Prefix
   * @generated
   */
  public Adapter createPrefixAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.edinburgh.paloma.ACTION <em>ACTION</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.edinburgh.paloma.ACTION
   * @generated
   */
  public Adapter createACTIONAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.edinburgh.paloma.ACT_SpNoMsg <em>ACT Sp No Msg</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.edinburgh.paloma.ACT_SpNoMsg
   * @generated
   */
  public Adapter createACT_SpNoMsgAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.edinburgh.paloma.ACT_SpBr <em>ACT Sp Br</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.edinburgh.paloma.ACT_SpBr
   * @generated
   */
  public Adapter createACT_SpBrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.edinburgh.paloma.ACT_SpUni <em>ACT Sp Uni</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.edinburgh.paloma.ACT_SpUni
   * @generated
   */
  public Adapter createACT_SpUniAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.edinburgh.paloma.ACT_InBr <em>ACT In Br</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.edinburgh.paloma.ACT_InBr
   * @generated
   */
  public Adapter createACT_InBrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.edinburgh.paloma.ACT_InUni <em>ACT In Uni</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.edinburgh.paloma.ACT_InUni
   * @generated
   */
  public Adapter createACT_InUniAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.edinburgh.paloma.IRange <em>IRange</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.edinburgh.paloma.IRange
   * @generated
   */
  public Adapter createIRangeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.edinburgh.paloma.PR_Expr <em>PR Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.edinburgh.paloma.PR_Expr
   * @generated
   */
  public Adapter createPR_ExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.edinburgh.paloma.Terminal_PR_Expr <em>Terminal PR Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.edinburgh.paloma.Terminal_PR_Expr
   * @generated
   */
  public Adapter createTerminal_PR_ExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.edinburgh.paloma.RATE_Expr <em>RATE Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.edinburgh.paloma.RATE_Expr
   * @generated
   */
  public Adapter createRATE_ExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.edinburgh.paloma.Terminal_RATE_Expr <em>Terminal RATE Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.edinburgh.paloma.Terminal_RATE_Expr
   * @generated
   */
  public Adapter createTerminal_RATE_ExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.edinburgh.paloma.AGENT_NUM <em>AGENT NUM</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.edinburgh.paloma.AGENT_NUM
   * @generated
   */
  public Adapter createAGENT_NUMAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.edinburgh.paloma.POPULATION <em>POPULATION</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.edinburgh.paloma.POPULATION
   * @generated
   */
  public Adapter createPOPULATIONAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.edinburgh.paloma.AGENTS <em>AGENTS</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.edinburgh.paloma.AGENTS
   * @generated
   */
  public Adapter createAGENTSAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //PalomaAdapterFactory
