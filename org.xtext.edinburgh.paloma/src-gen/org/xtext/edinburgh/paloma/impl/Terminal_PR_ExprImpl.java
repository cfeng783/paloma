/**
 */
package org.xtext.edinburgh.paloma.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.edinburgh.paloma.PalomaPackage;
import org.xtext.edinburgh.paloma.Terminal_PR_Expr;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Terminal PR Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.edinburgh.paloma.impl.Terminal_PR_ExprImpl#getLinkedParam <em>Linked Param</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Terminal_PR_ExprImpl extends MinimalEObjectImpl.Container implements Terminal_PR_Expr
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Terminal_PR_ExprImpl()
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
    return PalomaPackage.Literals.TERMINAL_PR_EXPR;
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
      eNotify(new ENotificationImpl(this, Notification.SET, PalomaPackage.TERMINAL_PR_EXPR__LINKED_PARAM, oldLinkedParam, linkedParam));
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
      case PalomaPackage.TERMINAL_PR_EXPR__LINKED_PARAM:
        return getLinkedParam();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PalomaPackage.TERMINAL_PR_EXPR__LINKED_PARAM:
        setLinkedParam((String)newValue);
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
      case PalomaPackage.TERMINAL_PR_EXPR__LINKED_PARAM:
        setLinkedParam(LINKED_PARAM_EDEFAULT);
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
      case PalomaPackage.TERMINAL_PR_EXPR__LINKED_PARAM:
        return LINKED_PARAM_EDEFAULT == null ? linkedParam != null : !LINKED_PARAM_EDEFAULT.equals(linkedParam);
    }
    return super.eIsSet(featureID);
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

} //Terminal_PR_ExprImpl
