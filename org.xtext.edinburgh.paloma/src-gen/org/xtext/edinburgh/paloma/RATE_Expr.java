/**
 */
package org.xtext.edinburgh.paloma;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RATE Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.edinburgh.paloma.RATE_Expr#getRt <em>Rt</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.edinburgh.paloma.PalomaPackage#getRATE_Expr()
 * @model
 * @generated
 */
public interface RATE_Expr extends IRange, Terminal_RATE_Expr
{
  /**
   * Returns the value of the '<em><b>Rt</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.edinburgh.paloma.Terminal_RATE_Expr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rt</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rt</em>' containment reference list.
   * @see org.xtext.edinburgh.paloma.PalomaPackage#getRATE_Expr_Rt()
   * @model containment="true"
   * @generated
   */
  EList<Terminal_RATE_Expr> getRt();

} // RATE_Expr
