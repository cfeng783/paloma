/**
 */
package org.xtext.edinburgh.paloma;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ACT In Br</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.edinburgh.paloma.ACT_InBr#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.edinburgh.paloma.PalomaPackage#getACT_InBr()
 * @model
 * @generated
 */
public interface ACT_InBr extends ACTION
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(PR_Expr)
   * @see org.xtext.edinburgh.paloma.PalomaPackage#getACT_InBr_Value()
   * @model containment="true"
   * @generated
   */
  PR_Expr getValue();

  /**
   * Sets the value of the '{@link org.xtext.edinburgh.paloma.ACT_InBr#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(PR_Expr value);

} // ACT_InBr
