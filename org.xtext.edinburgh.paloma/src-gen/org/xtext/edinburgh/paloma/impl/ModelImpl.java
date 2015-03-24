/**
 */
package org.xtext.edinburgh.paloma.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.edinburgh.paloma.AgentState;
import org.xtext.edinburgh.paloma.Model;
import org.xtext.edinburgh.paloma.POPULATION;
import org.xtext.edinburgh.paloma.PalomaPackage;
import org.xtext.edinburgh.paloma.Param;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.edinburgh.paloma.impl.ModelImpl#getParams <em>Params</em>}</li>
 *   <li>{@link org.xtext.edinburgh.paloma.impl.ModelImpl#getStates <em>States</em>}</li>
 *   <li>{@link org.xtext.edinburgh.paloma.impl.ModelImpl#getPopulation <em>Population</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<Param> params;

  /**
   * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStates()
   * @generated
   * @ordered
   */
  protected EList<AgentState> states;

  /**
   * The cached value of the '{@link #getPopulation() <em>Population</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPopulation()
   * @generated
   * @ordered
   */
  protected POPULATION population;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PalomaPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Param> getParams()
  {
    if (params == null)
    {
      params = new EObjectContainmentEList<Param>(Param.class, this, PalomaPackage.MODEL__PARAMS);
    }
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AgentState> getStates()
  {
    if (states == null)
    {
      states = new EObjectContainmentEList<AgentState>(AgentState.class, this, PalomaPackage.MODEL__STATES);
    }
    return states;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public POPULATION getPopulation()
  {
    return population;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPopulation(POPULATION newPopulation, NotificationChain msgs)
  {
    POPULATION oldPopulation = population;
    population = newPopulation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PalomaPackage.MODEL__POPULATION, oldPopulation, newPopulation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPopulation(POPULATION newPopulation)
  {
    if (newPopulation != population)
    {
      NotificationChain msgs = null;
      if (population != null)
        msgs = ((InternalEObject)population).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PalomaPackage.MODEL__POPULATION, null, msgs);
      if (newPopulation != null)
        msgs = ((InternalEObject)newPopulation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PalomaPackage.MODEL__POPULATION, null, msgs);
      msgs = basicSetPopulation(newPopulation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PalomaPackage.MODEL__POPULATION, newPopulation, newPopulation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PalomaPackage.MODEL__PARAMS:
        return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
      case PalomaPackage.MODEL__STATES:
        return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
      case PalomaPackage.MODEL__POPULATION:
        return basicSetPopulation(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PalomaPackage.MODEL__PARAMS:
        return getParams();
      case PalomaPackage.MODEL__STATES:
        return getStates();
      case PalomaPackage.MODEL__POPULATION:
        return getPopulation();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PalomaPackage.MODEL__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends Param>)newValue);
        return;
      case PalomaPackage.MODEL__STATES:
        getStates().clear();
        getStates().addAll((Collection<? extends AgentState>)newValue);
        return;
      case PalomaPackage.MODEL__POPULATION:
        setPopulation((POPULATION)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PalomaPackage.MODEL__PARAMS:
        getParams().clear();
        return;
      case PalomaPackage.MODEL__STATES:
        getStates().clear();
        return;
      case PalomaPackage.MODEL__POPULATION:
        setPopulation((POPULATION)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PalomaPackage.MODEL__PARAMS:
        return params != null && !params.isEmpty();
      case PalomaPackage.MODEL__STATES:
        return states != null && !states.isEmpty();
      case PalomaPackage.MODEL__POPULATION:
        return population != null;
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
