/**
 */
package org.xtext.edinburgh.paloma.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.edinburgh.paloma.AGENTS;
import org.xtext.edinburgh.paloma.POPULATION;
import org.xtext.edinburgh.paloma.PalomaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>POPULATION</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.edinburgh.paloma.impl.POPULATIONImpl#getPopu <em>Popu</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class POPULATIONImpl extends MinimalEObjectImpl.Container implements POPULATION
{
  /**
   * The cached value of the '{@link #getPopu() <em>Popu</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPopu()
   * @generated
   * @ordered
   */
  protected EList<AGENTS> popu;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected POPULATIONImpl()
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
    return PalomaPackage.Literals.POPULATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AGENTS> getPopu()
  {
    if (popu == null)
    {
      popu = new EObjectContainmentEList<AGENTS>(AGENTS.class, this, PalomaPackage.POPULATION__POPU);
    }
    return popu;
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
      case PalomaPackage.POPULATION__POPU:
        return ((InternalEList<?>)getPopu()).basicRemove(otherEnd, msgs);
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
      case PalomaPackage.POPULATION__POPU:
        return getPopu();
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
      case PalomaPackage.POPULATION__POPU:
        getPopu().clear();
        getPopu().addAll((Collection<? extends AGENTS>)newValue);
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
      case PalomaPackage.POPULATION__POPU:
        getPopu().clear();
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
      case PalomaPackage.POPULATION__POPU:
        return popu != null && !popu.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //POPULATIONImpl
