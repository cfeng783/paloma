/**
 */
package org.xtext.edinburgh.paloma;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.edinburgh.paloma.PalomaFactory
 * @model kind="package"
 * @generated
 */
public interface PalomaPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "paloma";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/edinburgh/Paloma";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "paloma";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PalomaPackage eINSTANCE = org.xtext.edinburgh.paloma.impl.PalomaPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.edinburgh.paloma.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.edinburgh.paloma.impl.ModelImpl
   * @see org.xtext.edinburgh.paloma.impl.PalomaPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PARAMS = 0;

  /**
   * The feature id for the '<em><b>States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__STATES = 1;

  /**
   * The feature id for the '<em><b>Population</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__POPULATION = 2;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.edinburgh.paloma.impl.ParamImpl <em>Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.edinburgh.paloma.impl.ParamImpl
   * @see org.xtext.edinburgh.paloma.impl.PalomaPackageImpl#getParam()
   * @generated
   */
  int PARAM = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM__VALUE = 1;

  /**
   * The number of structural features of the '<em>Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.edinburgh.paloma.impl.AgentStateImpl <em>Agent State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.edinburgh.paloma.impl.AgentStateImpl
   * @see org.xtext.edinburgh.paloma.impl.PalomaPackageImpl#getAgentState()
   * @generated
   */
  int AGENT_STATE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT_STATE__NAME = 0;

  /**
   * The feature id for the '<em><b>Prefixs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT_STATE__PREFIXS = 1;

  /**
   * The number of structural features of the '<em>Agent State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT_STATE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.edinburgh.paloma.impl.PrefixImpl <em>Prefix</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.edinburgh.paloma.impl.PrefixImpl
   * @see org.xtext.edinburgh.paloma.impl.PalomaPackageImpl#getPrefix()
   * @generated
   */
  int PREFIX = 3;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX__ACTION = 0;

  /**
   * The feature id for the '<em><b>Continue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX__CONTINUE = 1;

  /**
   * The number of structural features of the '<em>Prefix</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.edinburgh.paloma.impl.ACTIONImpl <em>ACTION</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.edinburgh.paloma.impl.ACTIONImpl
   * @see org.xtext.edinburgh.paloma.impl.PalomaPackageImpl#getACTION()
   * @generated
   */
  int ACTION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Rate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__RATE = 1;

  /**
   * The number of structural features of the '<em>ACTION</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.edinburgh.paloma.impl.ACT_SpNoMsgImpl <em>ACT Sp No Msg</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.edinburgh.paloma.impl.ACT_SpNoMsgImpl
   * @see org.xtext.edinburgh.paloma.impl.PalomaPackageImpl#getACT_SpNoMsg()
   * @generated
   */
  int ACT_SP_NO_MSG = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACT_SP_NO_MSG__NAME = ACTION__NAME;

  /**
   * The feature id for the '<em><b>Rate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACT_SP_NO_MSG__RATE = ACTION__RATE;

  /**
   * The number of structural features of the '<em>ACT Sp No Msg</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACT_SP_NO_MSG_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.edinburgh.paloma.impl.ACT_SpBrImpl <em>ACT Sp Br</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.edinburgh.paloma.impl.ACT_SpBrImpl
   * @see org.xtext.edinburgh.paloma.impl.PalomaPackageImpl#getACT_SpBr()
   * @generated
   */
  int ACT_SP_BR = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACT_SP_BR__NAME = ACTION__NAME;

  /**
   * The feature id for the '<em><b>Rate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACT_SP_BR__RATE = ACTION__RATE;

  /**
   * The feature id for the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACT_SP_BR__RANGE = ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>ACT Sp Br</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACT_SP_BR_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.edinburgh.paloma.impl.ACT_SpUniImpl <em>ACT Sp Uni</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.edinburgh.paloma.impl.ACT_SpUniImpl
   * @see org.xtext.edinburgh.paloma.impl.PalomaPackageImpl#getACT_SpUni()
   * @generated
   */
  int ACT_SP_UNI = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACT_SP_UNI__NAME = ACTION__NAME;

  /**
   * The feature id for the '<em><b>Rate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACT_SP_UNI__RATE = ACTION__RATE;

  /**
   * The feature id for the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACT_SP_UNI__RANGE = ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>ACT Sp Uni</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACT_SP_UNI_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.edinburgh.paloma.impl.ACT_InBrImpl <em>ACT In Br</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.edinburgh.paloma.impl.ACT_InBrImpl
   * @see org.xtext.edinburgh.paloma.impl.PalomaPackageImpl#getACT_InBr()
   * @generated
   */
  int ACT_IN_BR = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACT_IN_BR__NAME = ACTION__NAME;

  /**
   * The feature id for the '<em><b>Rate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACT_IN_BR__RATE = ACTION__RATE;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACT_IN_BR__VALUE = ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>ACT In Br</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACT_IN_BR_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.edinburgh.paloma.impl.ACT_InUniImpl <em>ACT In Uni</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.edinburgh.paloma.impl.ACT_InUniImpl
   * @see org.xtext.edinburgh.paloma.impl.PalomaPackageImpl#getACT_InUni()
   * @generated
   */
  int ACT_IN_UNI = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACT_IN_UNI__NAME = ACTION__NAME;

  /**
   * The feature id for the '<em><b>Rate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACT_IN_UNI__RATE = ACTION__RATE;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACT_IN_UNI__VALUE = ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>ACT In Uni</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACT_IN_UNI_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.edinburgh.paloma.impl.IRangeImpl <em>IRange</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.edinburgh.paloma.impl.IRangeImpl
   * @see org.xtext.edinburgh.paloma.impl.PalomaPackageImpl#getIRange()
   * @generated
   */
  int IRANGE = 10;

  /**
   * The number of structural features of the '<em>IRange</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IRANGE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.edinburgh.paloma.impl.Terminal_PR_ExprImpl <em>Terminal PR Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.edinburgh.paloma.impl.Terminal_PR_ExprImpl
   * @see org.xtext.edinburgh.paloma.impl.PalomaPackageImpl#getTerminal_PR_Expr()
   * @generated
   */
  int TERMINAL_PR_EXPR = 12;

  /**
   * The feature id for the '<em><b>Linked Param</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMINAL_PR_EXPR__LINKED_PARAM = 0;

  /**
   * The number of structural features of the '<em>Terminal PR Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMINAL_PR_EXPR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.edinburgh.paloma.impl.PR_ExprImpl <em>PR Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.edinburgh.paloma.impl.PR_ExprImpl
   * @see org.xtext.edinburgh.paloma.impl.PalomaPackageImpl#getPR_Expr()
   * @generated
   */
  int PR_EXPR = 11;

  /**
   * The feature id for the '<em><b>Linked Param</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PR_EXPR__LINKED_PARAM = TERMINAL_PR_EXPR__LINKED_PARAM;

  /**
   * The feature id for the '<em><b>Pr E</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PR_EXPR__PR_E = TERMINAL_PR_EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>PR Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PR_EXPR_FEATURE_COUNT = TERMINAL_PR_EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.edinburgh.paloma.impl.RATE_ExprImpl <em>RATE Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.edinburgh.paloma.impl.RATE_ExprImpl
   * @see org.xtext.edinburgh.paloma.impl.PalomaPackageImpl#getRATE_Expr()
   * @generated
   */
  int RATE_EXPR = 13;

  /**
   * The feature id for the '<em><b>Linked Param</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RATE_EXPR__LINKED_PARAM = IRANGE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rt</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RATE_EXPR__RT = IRANGE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>RATE Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RATE_EXPR_FEATURE_COUNT = IRANGE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.edinburgh.paloma.impl.Terminal_RATE_ExprImpl <em>Terminal RATE Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.edinburgh.paloma.impl.Terminal_RATE_ExprImpl
   * @see org.xtext.edinburgh.paloma.impl.PalomaPackageImpl#getTerminal_RATE_Expr()
   * @generated
   */
  int TERMINAL_RATE_EXPR = 14;

  /**
   * The feature id for the '<em><b>Linked Param</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMINAL_RATE_EXPR__LINKED_PARAM = 0;

  /**
   * The number of structural features of the '<em>Terminal RATE Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMINAL_RATE_EXPR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.edinburgh.paloma.impl.AGENT_NUMImpl <em>AGENT NUM</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.edinburgh.paloma.impl.AGENT_NUMImpl
   * @see org.xtext.edinburgh.paloma.impl.PalomaPackageImpl#getAGENT_NUM()
   * @generated
   */
  int AGENT_NUM = 15;

  /**
   * The feature id for the '<em><b>Linked Param</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT_NUM__LINKED_PARAM = TERMINAL_PR_EXPR__LINKED_PARAM;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT_NUM__TYPE = TERMINAL_PR_EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>AGENT NUM</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT_NUM_FEATURE_COUNT = TERMINAL_PR_EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.edinburgh.paloma.impl.POPULATIONImpl <em>POPULATION</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.edinburgh.paloma.impl.POPULATIONImpl
   * @see org.xtext.edinburgh.paloma.impl.PalomaPackageImpl#getPOPULATION()
   * @generated
   */
  int POPULATION = 16;

  /**
   * The feature id for the '<em><b>Popu</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POPULATION__POPU = 0;

  /**
   * The number of structural features of the '<em>POPULATION</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POPULATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.edinburgh.paloma.impl.AGENTSImpl <em>AGENTS</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.edinburgh.paloma.impl.AGENTSImpl
   * @see org.xtext.edinburgh.paloma.impl.PalomaPackageImpl#getAGENTS()
   * @generated
   */
  int AGENTS = 17;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENTS__TYPE = 0;

  /**
   * The number of structural features of the '<em>AGENTS</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENTS_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.xtext.edinburgh.paloma.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.edinburgh.paloma.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.edinburgh.paloma.Model#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.xtext.edinburgh.paloma.Model#getParams()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Params();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.edinburgh.paloma.Model#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>States</em>'.
   * @see org.xtext.edinburgh.paloma.Model#getStates()
   * @see #getModel()
   * @generated
   */
  EReference getModel_States();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.edinburgh.paloma.Model#getPopulation <em>Population</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Population</em>'.
   * @see org.xtext.edinburgh.paloma.Model#getPopulation()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Population();

  /**
   * Returns the meta object for class '{@link org.xtext.edinburgh.paloma.Param <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Param</em>'.
   * @see org.xtext.edinburgh.paloma.Param
   * @generated
   */
  EClass getParam();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.edinburgh.paloma.Param#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.edinburgh.paloma.Param#getName()
   * @see #getParam()
   * @generated
   */
  EAttribute getParam_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.edinburgh.paloma.Param#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.edinburgh.paloma.Param#getValue()
   * @see #getParam()
   * @generated
   */
  EAttribute getParam_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.edinburgh.paloma.AgentState <em>Agent State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Agent State</em>'.
   * @see org.xtext.edinburgh.paloma.AgentState
   * @generated
   */
  EClass getAgentState();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.edinburgh.paloma.AgentState#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.edinburgh.paloma.AgentState#getName()
   * @see #getAgentState()
   * @generated
   */
  EAttribute getAgentState_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.edinburgh.paloma.AgentState#getPrefixs <em>Prefixs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Prefixs</em>'.
   * @see org.xtext.edinburgh.paloma.AgentState#getPrefixs()
   * @see #getAgentState()
   * @generated
   */
  EReference getAgentState_Prefixs();

  /**
   * Returns the meta object for class '{@link org.xtext.edinburgh.paloma.Prefix <em>Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Prefix</em>'.
   * @see org.xtext.edinburgh.paloma.Prefix
   * @generated
   */
  EClass getPrefix();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.edinburgh.paloma.Prefix#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Action</em>'.
   * @see org.xtext.edinburgh.paloma.Prefix#getAction()
   * @see #getPrefix()
   * @generated
   */
  EReference getPrefix_Action();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.edinburgh.paloma.Prefix#getContinue <em>Continue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Continue</em>'.
   * @see org.xtext.edinburgh.paloma.Prefix#getContinue()
   * @see #getPrefix()
   * @generated
   */
  EAttribute getPrefix_Continue();

  /**
   * Returns the meta object for class '{@link org.xtext.edinburgh.paloma.ACTION <em>ACTION</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ACTION</em>'.
   * @see org.xtext.edinburgh.paloma.ACTION
   * @generated
   */
  EClass getACTION();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.edinburgh.paloma.ACTION#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.edinburgh.paloma.ACTION#getName()
   * @see #getACTION()
   * @generated
   */
  EAttribute getACTION_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.edinburgh.paloma.ACTION#getRate <em>Rate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rate</em>'.
   * @see org.xtext.edinburgh.paloma.ACTION#getRate()
   * @see #getACTION()
   * @generated
   */
  EReference getACTION_Rate();

  /**
   * Returns the meta object for class '{@link org.xtext.edinburgh.paloma.ACT_SpNoMsg <em>ACT Sp No Msg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ACT Sp No Msg</em>'.
   * @see org.xtext.edinburgh.paloma.ACT_SpNoMsg
   * @generated
   */
  EClass getACT_SpNoMsg();

  /**
   * Returns the meta object for class '{@link org.xtext.edinburgh.paloma.ACT_SpBr <em>ACT Sp Br</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ACT Sp Br</em>'.
   * @see org.xtext.edinburgh.paloma.ACT_SpBr
   * @generated
   */
  EClass getACT_SpBr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.edinburgh.paloma.ACT_SpBr#getRange <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Range</em>'.
   * @see org.xtext.edinburgh.paloma.ACT_SpBr#getRange()
   * @see #getACT_SpBr()
   * @generated
   */
  EReference getACT_SpBr_Range();

  /**
   * Returns the meta object for class '{@link org.xtext.edinburgh.paloma.ACT_SpUni <em>ACT Sp Uni</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ACT Sp Uni</em>'.
   * @see org.xtext.edinburgh.paloma.ACT_SpUni
   * @generated
   */
  EClass getACT_SpUni();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.edinburgh.paloma.ACT_SpUni#getRange <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Range</em>'.
   * @see org.xtext.edinburgh.paloma.ACT_SpUni#getRange()
   * @see #getACT_SpUni()
   * @generated
   */
  EReference getACT_SpUni_Range();

  /**
   * Returns the meta object for class '{@link org.xtext.edinburgh.paloma.ACT_InBr <em>ACT In Br</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ACT In Br</em>'.
   * @see org.xtext.edinburgh.paloma.ACT_InBr
   * @generated
   */
  EClass getACT_InBr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.edinburgh.paloma.ACT_InBr#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.xtext.edinburgh.paloma.ACT_InBr#getValue()
   * @see #getACT_InBr()
   * @generated
   */
  EReference getACT_InBr_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.edinburgh.paloma.ACT_InUni <em>ACT In Uni</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ACT In Uni</em>'.
   * @see org.xtext.edinburgh.paloma.ACT_InUni
   * @generated
   */
  EClass getACT_InUni();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.edinburgh.paloma.ACT_InUni#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.xtext.edinburgh.paloma.ACT_InUni#getValue()
   * @see #getACT_InUni()
   * @generated
   */
  EReference getACT_InUni_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.edinburgh.paloma.IRange <em>IRange</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>IRange</em>'.
   * @see org.xtext.edinburgh.paloma.IRange
   * @generated
   */
  EClass getIRange();

  /**
   * Returns the meta object for class '{@link org.xtext.edinburgh.paloma.PR_Expr <em>PR Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PR Expr</em>'.
   * @see org.xtext.edinburgh.paloma.PR_Expr
   * @generated
   */
  EClass getPR_Expr();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.edinburgh.paloma.PR_Expr#getPrE <em>Pr E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pr E</em>'.
   * @see org.xtext.edinburgh.paloma.PR_Expr#getPrE()
   * @see #getPR_Expr()
   * @generated
   */
  EReference getPR_Expr_PrE();

  /**
   * Returns the meta object for class '{@link org.xtext.edinburgh.paloma.Terminal_PR_Expr <em>Terminal PR Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Terminal PR Expr</em>'.
   * @see org.xtext.edinburgh.paloma.Terminal_PR_Expr
   * @generated
   */
  EClass getTerminal_PR_Expr();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.edinburgh.paloma.Terminal_PR_Expr#getLinkedParam <em>Linked Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Linked Param</em>'.
   * @see org.xtext.edinburgh.paloma.Terminal_PR_Expr#getLinkedParam()
   * @see #getTerminal_PR_Expr()
   * @generated
   */
  EAttribute getTerminal_PR_Expr_LinkedParam();

  /**
   * Returns the meta object for class '{@link org.xtext.edinburgh.paloma.RATE_Expr <em>RATE Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>RATE Expr</em>'.
   * @see org.xtext.edinburgh.paloma.RATE_Expr
   * @generated
   */
  EClass getRATE_Expr();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.edinburgh.paloma.RATE_Expr#getRt <em>Rt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rt</em>'.
   * @see org.xtext.edinburgh.paloma.RATE_Expr#getRt()
   * @see #getRATE_Expr()
   * @generated
   */
  EReference getRATE_Expr_Rt();

  /**
   * Returns the meta object for class '{@link org.xtext.edinburgh.paloma.Terminal_RATE_Expr <em>Terminal RATE Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Terminal RATE Expr</em>'.
   * @see org.xtext.edinburgh.paloma.Terminal_RATE_Expr
   * @generated
   */
  EClass getTerminal_RATE_Expr();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.edinburgh.paloma.Terminal_RATE_Expr#getLinkedParam <em>Linked Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Linked Param</em>'.
   * @see org.xtext.edinburgh.paloma.Terminal_RATE_Expr#getLinkedParam()
   * @see #getTerminal_RATE_Expr()
   * @generated
   */
  EAttribute getTerminal_RATE_Expr_LinkedParam();

  /**
   * Returns the meta object for class '{@link org.xtext.edinburgh.paloma.AGENT_NUM <em>AGENT NUM</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>AGENT NUM</em>'.
   * @see org.xtext.edinburgh.paloma.AGENT_NUM
   * @generated
   */
  EClass getAGENT_NUM();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.edinburgh.paloma.AGENT_NUM#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.edinburgh.paloma.AGENT_NUM#getType()
   * @see #getAGENT_NUM()
   * @generated
   */
  EAttribute getAGENT_NUM_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.edinburgh.paloma.POPULATION <em>POPULATION</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>POPULATION</em>'.
   * @see org.xtext.edinburgh.paloma.POPULATION
   * @generated
   */
  EClass getPOPULATION();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.edinburgh.paloma.POPULATION#getPopu <em>Popu</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Popu</em>'.
   * @see org.xtext.edinburgh.paloma.POPULATION#getPopu()
   * @see #getPOPULATION()
   * @generated
   */
  EReference getPOPULATION_Popu();

  /**
   * Returns the meta object for class '{@link org.xtext.edinburgh.paloma.AGENTS <em>AGENTS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>AGENTS</em>'.
   * @see org.xtext.edinburgh.paloma.AGENTS
   * @generated
   */
  EClass getAGENTS();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.edinburgh.paloma.AGENTS#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.edinburgh.paloma.AGENTS#getType()
   * @see #getAGENTS()
   * @generated
   */
  EAttribute getAGENTS_Type();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PalomaFactory getPalomaFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.edinburgh.paloma.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.edinburgh.paloma.impl.ModelImpl
     * @see org.xtext.edinburgh.paloma.impl.PalomaPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PARAMS = eINSTANCE.getModel_Params();

    /**
     * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__STATES = eINSTANCE.getModel_States();

    /**
     * The meta object literal for the '<em><b>Population</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__POPULATION = eINSTANCE.getModel_Population();

    /**
     * The meta object literal for the '{@link org.xtext.edinburgh.paloma.impl.ParamImpl <em>Param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.edinburgh.paloma.impl.ParamImpl
     * @see org.xtext.edinburgh.paloma.impl.PalomaPackageImpl#getParam()
     * @generated
     */
    EClass PARAM = eINSTANCE.getParam();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAM__NAME = eINSTANCE.getParam_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAM__VALUE = eINSTANCE.getParam_Value();

    /**
     * The meta object literal for the '{@link org.xtext.edinburgh.paloma.impl.AgentStateImpl <em>Agent State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.edinburgh.paloma.impl.AgentStateImpl
     * @see org.xtext.edinburgh.paloma.impl.PalomaPackageImpl#getAgentState()
     * @generated
     */
    EClass AGENT_STATE = eINSTANCE.getAgentState();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AGENT_STATE__NAME = eINSTANCE.getAgentState_Name();

    /**
     * The meta object literal for the '<em><b>Prefixs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AGENT_STATE__PREFIXS = eINSTANCE.getAgentState_Prefixs();

    /**
     * The meta object literal for the '{@link org.xtext.edinburgh.paloma.impl.PrefixImpl <em>Prefix</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.edinburgh.paloma.impl.PrefixImpl
     * @see org.xtext.edinburgh.paloma.impl.PalomaPackageImpl#getPrefix()
     * @generated
     */
    EClass PREFIX = eINSTANCE.getPrefix();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREFIX__ACTION = eINSTANCE.getPrefix_Action();

    /**
     * The meta object literal for the '<em><b>Continue</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREFIX__CONTINUE = eINSTANCE.getPrefix_Continue();

    /**
     * The meta object literal for the '{@link org.xtext.edinburgh.paloma.impl.ACTIONImpl <em>ACTION</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.edinburgh.paloma.impl.ACTIONImpl
     * @see org.xtext.edinburgh.paloma.impl.PalomaPackageImpl#getACTION()
     * @generated
     */
    EClass ACTION = eINSTANCE.getACTION();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__NAME = eINSTANCE.getACTION_Name();

    /**
     * The meta object literal for the '<em><b>Rate</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__RATE = eINSTANCE.getACTION_Rate();

    /**
     * The meta object literal for the '{@link org.xtext.edinburgh.paloma.impl.ACT_SpNoMsgImpl <em>ACT Sp No Msg</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.edinburgh.paloma.impl.ACT_SpNoMsgImpl
     * @see org.xtext.edinburgh.paloma.impl.PalomaPackageImpl#getACT_SpNoMsg()
     * @generated
     */
    EClass ACT_SP_NO_MSG = eINSTANCE.getACT_SpNoMsg();

    /**
     * The meta object literal for the '{@link org.xtext.edinburgh.paloma.impl.ACT_SpBrImpl <em>ACT Sp Br</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.edinburgh.paloma.impl.ACT_SpBrImpl
     * @see org.xtext.edinburgh.paloma.impl.PalomaPackageImpl#getACT_SpBr()
     * @generated
     */
    EClass ACT_SP_BR = eINSTANCE.getACT_SpBr();

    /**
     * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACT_SP_BR__RANGE = eINSTANCE.getACT_SpBr_Range();

    /**
     * The meta object literal for the '{@link org.xtext.edinburgh.paloma.impl.ACT_SpUniImpl <em>ACT Sp Uni</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.edinburgh.paloma.impl.ACT_SpUniImpl
     * @see org.xtext.edinburgh.paloma.impl.PalomaPackageImpl#getACT_SpUni()
     * @generated
     */
    EClass ACT_SP_UNI = eINSTANCE.getACT_SpUni();

    /**
     * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACT_SP_UNI__RANGE = eINSTANCE.getACT_SpUni_Range();

    /**
     * The meta object literal for the '{@link org.xtext.edinburgh.paloma.impl.ACT_InBrImpl <em>ACT In Br</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.edinburgh.paloma.impl.ACT_InBrImpl
     * @see org.xtext.edinburgh.paloma.impl.PalomaPackageImpl#getACT_InBr()
     * @generated
     */
    EClass ACT_IN_BR = eINSTANCE.getACT_InBr();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACT_IN_BR__VALUE = eINSTANCE.getACT_InBr_Value();

    /**
     * The meta object literal for the '{@link org.xtext.edinburgh.paloma.impl.ACT_InUniImpl <em>ACT In Uni</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.edinburgh.paloma.impl.ACT_InUniImpl
     * @see org.xtext.edinburgh.paloma.impl.PalomaPackageImpl#getACT_InUni()
     * @generated
     */
    EClass ACT_IN_UNI = eINSTANCE.getACT_InUni();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACT_IN_UNI__VALUE = eINSTANCE.getACT_InUni_Value();

    /**
     * The meta object literal for the '{@link org.xtext.edinburgh.paloma.impl.IRangeImpl <em>IRange</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.edinburgh.paloma.impl.IRangeImpl
     * @see org.xtext.edinburgh.paloma.impl.PalomaPackageImpl#getIRange()
     * @generated
     */
    EClass IRANGE = eINSTANCE.getIRange();

    /**
     * The meta object literal for the '{@link org.xtext.edinburgh.paloma.impl.PR_ExprImpl <em>PR Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.edinburgh.paloma.impl.PR_ExprImpl
     * @see org.xtext.edinburgh.paloma.impl.PalomaPackageImpl#getPR_Expr()
     * @generated
     */
    EClass PR_EXPR = eINSTANCE.getPR_Expr();

    /**
     * The meta object literal for the '<em><b>Pr E</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PR_EXPR__PR_E = eINSTANCE.getPR_Expr_PrE();

    /**
     * The meta object literal for the '{@link org.xtext.edinburgh.paloma.impl.Terminal_PR_ExprImpl <em>Terminal PR Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.edinburgh.paloma.impl.Terminal_PR_ExprImpl
     * @see org.xtext.edinburgh.paloma.impl.PalomaPackageImpl#getTerminal_PR_Expr()
     * @generated
     */
    EClass TERMINAL_PR_EXPR = eINSTANCE.getTerminal_PR_Expr();

    /**
     * The meta object literal for the '<em><b>Linked Param</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TERMINAL_PR_EXPR__LINKED_PARAM = eINSTANCE.getTerminal_PR_Expr_LinkedParam();

    /**
     * The meta object literal for the '{@link org.xtext.edinburgh.paloma.impl.RATE_ExprImpl <em>RATE Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.edinburgh.paloma.impl.RATE_ExprImpl
     * @see org.xtext.edinburgh.paloma.impl.PalomaPackageImpl#getRATE_Expr()
     * @generated
     */
    EClass RATE_EXPR = eINSTANCE.getRATE_Expr();

    /**
     * The meta object literal for the '<em><b>Rt</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RATE_EXPR__RT = eINSTANCE.getRATE_Expr_Rt();

    /**
     * The meta object literal for the '{@link org.xtext.edinburgh.paloma.impl.Terminal_RATE_ExprImpl <em>Terminal RATE Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.edinburgh.paloma.impl.Terminal_RATE_ExprImpl
     * @see org.xtext.edinburgh.paloma.impl.PalomaPackageImpl#getTerminal_RATE_Expr()
     * @generated
     */
    EClass TERMINAL_RATE_EXPR = eINSTANCE.getTerminal_RATE_Expr();

    /**
     * The meta object literal for the '<em><b>Linked Param</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TERMINAL_RATE_EXPR__LINKED_PARAM = eINSTANCE.getTerminal_RATE_Expr_LinkedParam();

    /**
     * The meta object literal for the '{@link org.xtext.edinburgh.paloma.impl.AGENT_NUMImpl <em>AGENT NUM</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.edinburgh.paloma.impl.AGENT_NUMImpl
     * @see org.xtext.edinburgh.paloma.impl.PalomaPackageImpl#getAGENT_NUM()
     * @generated
     */
    EClass AGENT_NUM = eINSTANCE.getAGENT_NUM();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AGENT_NUM__TYPE = eINSTANCE.getAGENT_NUM_Type();

    /**
     * The meta object literal for the '{@link org.xtext.edinburgh.paloma.impl.POPULATIONImpl <em>POPULATION</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.edinburgh.paloma.impl.POPULATIONImpl
     * @see org.xtext.edinburgh.paloma.impl.PalomaPackageImpl#getPOPULATION()
     * @generated
     */
    EClass POPULATION = eINSTANCE.getPOPULATION();

    /**
     * The meta object literal for the '<em><b>Popu</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POPULATION__POPU = eINSTANCE.getPOPULATION_Popu();

    /**
     * The meta object literal for the '{@link org.xtext.edinburgh.paloma.impl.AGENTSImpl <em>AGENTS</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.edinburgh.paloma.impl.AGENTSImpl
     * @see org.xtext.edinburgh.paloma.impl.PalomaPackageImpl#getAGENTS()
     * @generated
     */
    EClass AGENTS = eINSTANCE.getAGENTS();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AGENTS__TYPE = eINSTANCE.getAGENTS_Type();

  }

} //PalomaPackage
