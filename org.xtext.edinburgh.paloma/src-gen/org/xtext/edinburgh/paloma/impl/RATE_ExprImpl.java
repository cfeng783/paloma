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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.edinburgh.paloma.PalomaPackage;
import org.xtext.edinburgh.paloma.RATE_Expr;
import org.xtext.edinburgh.paloma.Terminal_RATE_Expr;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RATE Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.edinburgh.paloma.impl.RATE_ExprImpl#getLinkedParam <em>Linked Param</em>}</li>
 *   <li>{@link org.xtext.edinburgh.paloma.impl.RATE_ExprImpl#getRt <em>Rt</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RATE_ExprImpl extends IRangeImpl implements RATE_Expr
{
  /**
   * The default value of the '{@link #getLinkedParam() <em>Linked Param</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinkedParam()
   * @generated
   * @ordered
   */
  protected static final String LINKED_PARAM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLinkedParam() <em>Linked Param</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinkedParam()
   * @generated
   * @ordered
   */
  protected String linkedParam = LINKED_PARAM_EDEFAULT;

  /**
   * The cached value of the '{@link #getRt() <em>Rt</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRt()
   * @generated
   * @ordered
   */
  protected EList<Terminal_RATE_Expr> rt;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RATE_ExprImpl()
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
    return PalomaPackage.Literals.RATE_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLinkedParam()
  {
    return linkedParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLinkedParam(String newLinkedParam)
  {
    String oldLinkedParam = linkedParam;
    linkedParam = newLinkedParam;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PalomaPackage.RATE_EXPR__LINKED_PARAM, oldLinkedParam, linkedParam));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Terminal_RATE_Expr> getRt()
  {
    if (rt == null)
    {
      rt = new EObjectContainmentEList<Terminal_RATE_Expr>(Terminal_RATE_Expr.class, this, PalomaPackage.RATE_EXPR__RT);
    }
    return rt;
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
      case PalomaPackage.RATE_EXPR__RT:
        return ((InternalEList<?>)getRt()).basicRemove(otherEnd, msgs);
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
      case PalomaPackage.RATE_EXPR__LINKED_PARAM:
        return getLinkedParam();
      case PalomaPackage.RATE_EXPR__RT:
        return getRt();
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
      case PalomaPackage.RATE_EXPR__LINKED_PARAM:
        setLinkedParam((String)newValue);
        return;
      case PalomaPackage.RATE_EXPR__RT:
        getRt().clear();
        getRt().addAll((Collection<? extends Terminal_RATE_Expr>)newValue);
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
      case PalomaPackage.RATE_EXPR__LINKED_PARAM:
        setLinkedParam(LINKED_PARAM_EDEFAULT);
        return;
      case PalomaPackage.RATE_EXPR__RT:
        getRt().clear();
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
      case PalomaPackage.RATE_EXPR__LINKED_PARAM:
        return LINKED_PARAM_EDEFAULT == null ? linkedParam != null : !LINKED_PARAM_EDEFAULT.equals(linkedParam);
      case PalomaPackage.RATE_EXPR__RT:
        return rt != null && !rt.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == Terminal_RATE_Expr.class)
    {
      switch (derivedFeatureID)
      {
        case PalomaPackage.RATE_EXPR__LINKED_PARAM: return PalomaPackage.TERMINAL_RATE_EXPR__LINKED_PARAM;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == Terminal_RATE_Expr.class)
    {
      switch (baseFeatureID)
      {
        case PalomaPackage.TERMINAL_RATE_EXPR__LINKED_PARAM: return PalomaPackage.RATE_EXPR__LINKED_PARAM;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (linkedParam: ");
    result.append(linkedParam);
    result.append(')');
    return result.toString();
  }

} //RATE_ExprImpl
