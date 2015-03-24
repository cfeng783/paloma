/**
 */
package org.xtext.edinburgh.paloma.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.edinburgh.paloma.ACT_InBr;
import org.xtext.edinburgh.paloma.ACT_InUni;
import org.xtext.edinburgh.paloma.ACT_SpBr;
import org.xtext.edinburgh.paloma.ACT_SpNoMsg;
import org.xtext.edinburgh.paloma.ACT_SpUni;
import org.xtext.edinburgh.paloma.AgentState;
import org.xtext.edinburgh.paloma.IRange;
import org.xtext.edinburgh.paloma.Model;
import org.xtext.edinburgh.paloma.PR_Expr;
import org.xtext.edinburgh.paloma.PalomaFactory;
import org.xtext.edinburgh.paloma.PalomaPackage;
import org.xtext.edinburgh.paloma.Param;
import org.xtext.edinburgh.paloma.Prefix;
import org.xtext.edinburgh.paloma.RATE_Expr;
import org.xtext.edinburgh.paloma.Terminal_PR_Expr;
import org.xtext.edinburgh.paloma.Terminal_RATE_Expr;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PalomaPackageImpl extends EPackageImpl implements PalomaPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass paramEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass agentStateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass prefixEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass acT_SpNoMsgEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass acT_SpBrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass acT_SpUniEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass acT_InBrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass acT_InUniEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iRangeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pR_ExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass terminal_PR_ExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ratE_ExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass terminal_RATE_ExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass agenT_NUMEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass populationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass agentsEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.edinburgh.paloma.PalomaPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private PalomaPackageImpl()
  {
    super(eNS_URI, PalomaFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link PalomaPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static PalomaPackage init()
  {
    if (isInited) return (PalomaPackage)EPackage.Registry.INSTANCE.getEPackage(PalomaPackage.eNS_URI);

    // Obtain or create and register package
    PalomaPackageImpl thePalomaPackage = (PalomaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PalomaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PalomaPackageImpl());

    isInited = true;

    // Create package meta-data objects
    thePalomaPackage.createPackageContents();

    // Initialize created meta-data
    thePalomaPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    thePalomaPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(PalomaPackage.eNS_URI, thePalomaPackage);
    return thePalomaPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Params()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_States()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Population()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParam()
  {
    return paramEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParam_Name()
  {
    return (EAttribute)paramEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParam_Value()
  {
    return (EAttribute)paramEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAgentState()
  {
    return agentStateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAgentState_Name()
  {
    return (EAttribute)agentStateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAgentState_Prefixs()
  {
    return (EReference)agentStateEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrefix()
  {
    return prefixEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrefix_Action()
  {
    return (EReference)prefixEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrefix_Continue()
  {
    return (EAttribute)prefixEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getACTION()
  {
    return actionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getACTION_Name()
  {
    return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getACTION_Rate()
  {
    return (EReference)actionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getACT_SpNoMsg()
  {
    return acT_SpNoMsgEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getACT_SpBr()
  {
    return acT_SpBrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getACT_SpBr_Range()
  {
    return (EReference)acT_SpBrEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getACT_SpUni()
  {
    return acT_SpUniEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getACT_SpUni_Range()
  {
    return (EReference)acT_SpUniEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getACT_InBr()
  {
    return acT_InBrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getACT_InBr_Value()
  {
    return (EReference)acT_InBrEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getACT_InUni()
  {
    return acT_InUniEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getACT_InUni_Value()
  {
    return (EReference)acT_InUniEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIRange()
  {
    return iRangeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPR_Expr()
  {
    return pR_ExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPR_Expr_PrE()
  {
    return (EReference)pR_ExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTerminal_PR_Expr()
  {
    return terminal_PR_ExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTerminal_PR_Expr_LinkedParam()
  {
    return (EAttribute)terminal_PR_ExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRATE_Expr()
  {
    return ratE_ExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRATE_Expr_Rt()
  {
    return (EReference)ratE_ExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTerminal_RATE_Expr()
  {
    return terminal_RATE_ExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTerminal_RATE_Expr_LinkedParam()
  {
    return (EAttribute)terminal_RATE_ExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAGENT_NUM()
  {
    return agenT_NUMEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAGENT_NUM_Type()
  {
    return (EAttribute)agenT_NUMEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPOPULATION()
  {
    return populationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPOPULATION_Popu()
  {
    return (EReference)populationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAGENTS()
  {
    return agentsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAGENTS_Type()
  {
    return (EAttribute)agentsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PalomaFactory getPalomaFactory()
  {
    return (PalomaFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__PARAMS);
    createEReference(modelEClass, MODEL__STATES);
    createEReference(modelEClass, MODEL__POPULATION);

    paramEClass = createEClass(PARAM);
    createEAttribute(paramEClass, PARAM__NAME);
    createEAttribute(paramEClass, PARAM__VALUE);

    agentStateEClass = createEClass(AGENT_STATE);
    createEAttribute(agentStateEClass, AGENT_STATE__NAME);
    createEReference(agentStateEClass, AGENT_STATE__PREFIXS);

    prefixEClass = createEClass(PREFIX);
    createEReference(prefixEClass, PREFIX__ACTION);
    createEAttribute(prefixEClass, PREFIX__CONTINUE);

    actionEClass = createEClass(ACTION);
    createEAttribute(actionEClass, ACTION__NAME);
    createEReference(actionEClass, ACTION__RATE);

    acT_SpNoMsgEClass = createEClass(ACT_SP_NO_MSG);

    acT_SpBrEClass = createEClass(ACT_SP_BR);
    createEReference(acT_SpBrEClass, ACT_SP_BR__RANGE);

    acT_SpUniEClass = createEClass(ACT_SP_UNI);
    createEReference(acT_SpUniEClass, ACT_SP_UNI__RANGE);

    acT_InBrEClass = createEClass(ACT_IN_BR);
    createEReference(acT_InBrEClass, ACT_IN_BR__VALUE);

    acT_InUniEClass = createEClass(ACT_IN_UNI);
    createEReference(acT_InUniEClass, ACT_IN_UNI__VALUE);

    iRangeEClass = createEClass(IRANGE);

    pR_ExprEClass = createEClass(PR_EXPR);
    createEReference(pR_ExprEClass, PR_EXPR__PR_E);

    terminal_PR_ExprEClass = createEClass(TERMINAL_PR_EXPR);
    createEAttribute(terminal_PR_ExprEClass, TERMINAL_PR_EXPR__LINKED_PARAM);

    ratE_ExprEClass = createEClass(RATE_EXPR);
    createEReference(ratE_ExprEClass, RATE_EXPR__RT);

    terminal_RATE_ExprEClass = createEClass(TERMINAL_RATE_EXPR);
    createEAttribute(terminal_RATE_ExprEClass, TERMINAL_RATE_EXPR__LINKED_PARAM);

    agenT_NUMEClass = createEClass(AGENT_NUM);
    createEAttribute(agenT_NUMEClass, AGENT_NUM__TYPE);

    populationEClass = createEClass(POPULATION);
    createEReference(populationEClass, POPULATION__POPU);

    agentsEClass = createEClass(AGENTS);
    createEAttribute(agentsEClass, AGENTS__TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    acT_SpNoMsgEClass.getESuperTypes().add(this.getACTION());
    acT_SpBrEClass.getESuperTypes().add(this.getACTION());
    acT_SpUniEClass.getESuperTypes().add(this.getACTION());
    acT_InBrEClass.getESuperTypes().add(this.getACTION());
    acT_InUniEClass.getESuperTypes().add(this.getACTION());
    pR_ExprEClass.getESuperTypes().add(this.getTerminal_PR_Expr());
    ratE_ExprEClass.getESuperTypes().add(this.getIRange());
    ratE_ExprEClass.getESuperTypes().add(this.getTerminal_RATE_Expr());
    agenT_NUMEClass.getESuperTypes().add(this.getTerminal_PR_Expr());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Params(), this.getParam(), null, "params", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_States(), this.getAgentState(), null, "states", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Population(), this.getPOPULATION(), null, "population", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(paramEClass, Param.class, "Param", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParam_Name(), ecorePackage.getEString(), "name", null, 0, 1, Param.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParam_Value(), ecorePackage.getEString(), "value", null, 0, 1, Param.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(agentStateEClass, AgentState.class, "AgentState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAgentState_Name(), ecorePackage.getEString(), "name", null, 0, 1, AgentState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAgentState_Prefixs(), this.getPrefix(), null, "prefixs", null, 0, -1, AgentState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(prefixEClass, Prefix.class, "Prefix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPrefix_Action(), this.getACTION(), null, "action", null, 0, 1, Prefix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPrefix_Continue(), ecorePackage.getEString(), "continue", null, 0, 1, Prefix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionEClass, org.xtext.edinburgh.paloma.ACTION.class, "ACTION", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getACTION_Name(), ecorePackage.getEString(), "name", null, 0, 1, org.xtext.edinburgh.paloma.ACTION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getACTION_Rate(), this.getRATE_Expr(), null, "rate", null, 0, 1, org.xtext.edinburgh.paloma.ACTION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(acT_SpNoMsgEClass, ACT_SpNoMsg.class, "ACT_SpNoMsg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(acT_SpBrEClass, ACT_SpBr.class, "ACT_SpBr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getACT_SpBr_Range(), this.getIRange(), null, "range", null, 0, 1, ACT_SpBr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(acT_SpUniEClass, ACT_SpUni.class, "ACT_SpUni", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getACT_SpUni_Range(), this.getIRange(), null, "range", null, 0, 1, ACT_SpUni.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(acT_InBrEClass, ACT_InBr.class, "ACT_InBr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getACT_InBr_Value(), this.getPR_Expr(), null, "value", null, 0, 1, ACT_InBr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(acT_InUniEClass, ACT_InUni.class, "ACT_InUni", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getACT_InUni_Value(), this.getPR_Expr(), null, "value", null, 0, 1, ACT_InUni.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(iRangeEClass, IRange.class, "IRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(pR_ExprEClass, PR_Expr.class, "PR_Expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPR_Expr_PrE(), this.getTerminal_PR_Expr(), null, "prE", null, 0, -1, PR_Expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(terminal_PR_ExprEClass, Terminal_PR_Expr.class, "Terminal_PR_Expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTerminal_PR_Expr_LinkedParam(), ecorePackage.getEString(), "linkedParam", null, 0, 1, Terminal_PR_Expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ratE_ExprEClass, RATE_Expr.class, "RATE_Expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRATE_Expr_Rt(), this.getTerminal_RATE_Expr(), null, "rt", null, 0, -1, RATE_Expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(terminal_RATE_ExprEClass, Terminal_RATE_Expr.class, "Terminal_RATE_Expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTerminal_RATE_Expr_LinkedParam(), ecorePackage.getEString(), "linkedParam", null, 0, 1, Terminal_RATE_Expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(agenT_NUMEClass, org.xtext.edinburgh.paloma.AGENT_NUM.class, "AGENT_NUM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAGENT_NUM_Type(), ecorePackage.getEString(), "type", null, 0, 1, org.xtext.edinburgh.paloma.AGENT_NUM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(populationEClass, org.xtext.edinburgh.paloma.POPULATION.class, "POPULATION", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPOPULATION_Popu(), this.getAGENTS(), null, "popu", null, 0, -1, org.xtext.edinburgh.paloma.POPULATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(agentsEClass, org.xtext.edinburgh.paloma.AGENTS.class, "AGENTS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAGENTS_Type(), ecorePackage.getEString(), "type", null, 0, 1, org.xtext.edinburgh.paloma.AGENTS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //PalomaPackageImpl
