/**
 */
package org.xtext.edinburgh.paloma;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PR Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.edinburgh.paloma.PR_Expr#getPrE <em>Pr E</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.edinburgh.paloma.PalomaPackage#getPR_Expr()
 * @model
 * @generated
 */
public interface PR_Expr extends Terminal_PR_Expr
{
  /**
   * Returns the value of the '<em><b>Pr E</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.edinburgh.paloma.Terminal_PR_Expr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pr E</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pr E</em>' containment reference list.
   * @see org.xtext.edinburgh.paloma.PalomaPackage#getPR_Expr_PrE()
   * @model containment="true"
   * @generated
   */
  EList<Terminal_PR_Expr> getPrE();

} // PR_Expr
