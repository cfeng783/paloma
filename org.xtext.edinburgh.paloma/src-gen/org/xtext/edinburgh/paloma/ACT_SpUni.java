/**
 */
package org.xtext.edinburgh.paloma;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ACT Sp Uni</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.edinburgh.paloma.ACT_SpUni#getRange <em>Range</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.edinburgh.paloma.PalomaPackage#getACT_SpUni()
 * @model
 * @generated
 */
public interface ACT_SpUni extends ACTION
{
  /**
   * Returns the value of the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Range</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Range</em>' containment reference.
   * @see #setRange(IRange)
   * @see org.xtext.edinburgh.paloma.PalomaPackage#getACT_SpUni_Range()
   * @model containment="true"
   * @generated
   */
  IRange getRange();

  /**
   * Sets the value of the '{@link org.xtext.edinburgh.paloma.ACT_SpUni#getRange <em>Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Range</em>' containment reference.
   * @see #getRange()
   * @generated
   */
  void setRange(IRange value);

} // ACT_SpUni
