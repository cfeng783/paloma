/**
 */
package org.xtext.edinburgh.paloma;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ACTION</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.edinburgh.paloma.ACTION#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.edinburgh.paloma.ACTION#getRate <em>Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.edinburgh.paloma.PalomaPackage#getACTION()
 * @model
 * @generated
 */
public interface ACTION extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.edinburgh.paloma.PalomaPackage#getACTION_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.edinburgh.paloma.ACTION#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Rate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rate</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rate</em>' containment reference.
   * @see #setRate(RATE_Expr)
   * @see org.xtext.edinburgh.paloma.PalomaPackage#getACTION_Rate()
   * @model containment="true"
   * @generated
   */
  RATE_Expr getRate();

  /**
   * Sets the value of the '{@link org.xtext.edinburgh.paloma.ACTION#getRate <em>Rate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rate</em>' containment reference.
   * @see #getRate()
   * @generated
   */
  void setRate(RATE_Expr value);

} // ACTION
