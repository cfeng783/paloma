/**
 */
package org.xtext.edinburgh.paloma;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminal PR Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.edinburgh.paloma.Terminal_PR_Expr#getLinkedParam <em>Linked Param</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.edinburgh.paloma.PalomaPackage#getTerminal_PR_Expr()
 * @model
 * @generated
 */
public interface Terminal_PR_Expr extends EObject
{
  /**
   * Returns the value of the '<em><b>Linked Param</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Linked Param</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Linked Param</em>' attribute.
   * @see #setLinkedParam(String)
   * @see org.xtext.edinburgh.paloma.PalomaPackage#getTerminal_PR_Expr_LinkedParam()
   * @model
   * @generated
   */
  String getLinkedParam();

  /**
   * Sets the value of the '{@link org.xtext.edinburgh.paloma.Terminal_PR_Expr#getLinkedParam <em>Linked Param</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Linked Param</em>' attribute.
   * @see #getLinkedParam()
   * @generated
   */
  void setLinkedParam(String value);

} // Terminal_PR_Expr
