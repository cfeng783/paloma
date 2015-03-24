/**
 */
package org.xtext.edinburgh.paloma.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.edinburgh.paloma.PR_Expr;
import org.xtext.edinburgh.paloma.PalomaPackage;
import org.xtext.edinburgh.paloma.Terminal_PR_Expr;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PR Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.edinburgh.paloma.impl.PR_ExprImpl#getPrE <em>Pr E</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PR_ExprImpl extends Terminal_PR_ExprImpl implements PR_Expr
{
  /**
   * The cached value of the '{@link #getPrE() <em>Pr E</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrE()
   * @generated
   * @ordered
   */
  protected EList<Terminal_PR_Expr> prE;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PR_ExprImpl()
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
    return PalomaPackage.Literals.PR_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Terminal_PR_Expr> getPrE()
  {
    if (prE == null)
    {
      prE = new EObjectContainmentEList<Terminal_PR_Expr>(Terminal_PR_Expr.class, this, PalomaPackage.PR_EXPR__PR_E);
    }
    return prE;
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
      case PalomaPackage.PR_EXPR__PR_E:
        return ((InternalEList<?>)getPrE()).basicRemove(otherEnd, msgs);
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
      case PalomaPackage.PR_EXPR__PR_E:
        return getPrE();
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
      case PalomaPackage.PR_EXPR__PR_E:
        getPrE().clear();
        getPrE().addAll((Collection<? extends Terminal_PR_Expr>)newValue);
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
      case PalomaPackage.PR_EXPR__PR_E:
        getPrE().clear();
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
      case PalomaPackage.PR_EXPR__PR_E:
        return prE != null && !prE.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PR_ExprImpl
