/**
 */
package org.xtext.edinburgh.paloma;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.edinburgh.paloma.PalomaPackage
 * @generated
 */
public interface PalomaFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PalomaFactory eINSTANCE = org.xtext.edinburgh.paloma.impl.PalomaFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Param</em>'.
   * @generated
   */
  Param createParam();

  /**
   * Returns a new object of class '<em>Agent State</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Agent State</em>'.
   * @generated
   */
  AgentState createAgentState();

  /**
   * Returns a new object of class '<em>Prefix</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Prefix</em>'.
   * @generated
   */
  Prefix createPrefix();

  /**
   * Returns a new object of class '<em>ACTION</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ACTION</em>'.
   * @generated
   */
  ACTION createACTION();

  /**
   * Returns a new object of class '<em>ACT Sp No Msg</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ACT Sp No Msg</em>'.
   * @generated
   */
  ACT_SpNoMsg createACT_SpNoMsg();

  /**
   * Returns a new object of class '<em>ACT Sp Br</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ACT Sp Br</em>'.
   * @generated
   */
  ACT_SpBr createACT_SpBr();

  /**
   * Returns a new object of class '<em>ACT Sp Uni</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ACT Sp Uni</em>'.
   * @generated
   */
  ACT_SpUni createACT_SpUni();

  /**
   * Returns a new object of class '<em>ACT In Br</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ACT In Br</em>'.
   * @generated
   */
  ACT_InBr createACT_InBr();

  /**
   * Returns a new object of class '<em>ACT In Uni</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ACT In Uni</em>'.
   * @generated
   */
  ACT_InUni createACT_InUni();

  /**
   * Returns a new object of class '<em>IRange</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>IRange</em>'.
   * @generated
   */
  IRange createIRange();

  /**
   * Returns a new object of class '<em>PR Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PR Expr</em>'.
   * @generated
   */
  PR_Expr createPR_Expr();

  /**
   * Returns a new object of class '<em>Terminal PR Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Terminal PR Expr</em>'.
   * @generated
   */
  Terminal_PR_Expr createTerminal_PR_Expr();

  /**
   * Returns a new object of class '<em>RATE Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>RATE Expr</em>'.
   * @generated
   */
  RATE_Expr createRATE_Expr();

  /**
   * Returns a new object of class '<em>Terminal RATE Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Terminal RATE Expr</em>'.
   * @generated
   */
  Terminal_RATE_Expr createTerminal_RATE_Expr();

  /**
   * Returns a new object of class '<em>AGENT NUM</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>AGENT NUM</em>'.
   * @generated
   */
  AGENT_NUM createAGENT_NUM();

  /**
   * Returns a new object of class '<em>POPULATION</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>POPULATION</em>'.
   * @generated
   */
  POPULATION createPOPULATION();

  /**
   * Returns a new object of class '<em>AGENTS</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>AGENTS</em>'.
   * @generated
   */
  AGENTS createAGENTS();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  PalomaPackage getPalomaPackage();

} //PalomaFactory
