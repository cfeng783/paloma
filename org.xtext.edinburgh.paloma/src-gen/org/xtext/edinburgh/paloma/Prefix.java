/**
 */
package org.xtext.edinburgh.paloma;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prefix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.edinburgh.paloma.Prefix#getAction <em>Action</em>}</li>
 *   <li>{@link org.xtext.edinburgh.paloma.Prefix#getContinue <em>Continue</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.edinburgh.paloma.PalomaPackage#getPrefix()
 * @model
 * @generated
 */
public interface Prefix extends EObject
{
  /**
   * Returns the value of the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' containment reference.
   * @see #setAction(ACTION)
   * @see org.xtext.edinburgh.paloma.PalomaPackage#getPrefix_Action()
   * @model containment="true"
   * @generated
   */
  ACTION getAction();

  /**
   * Sets the value of the '{@link org.xtext.edinburgh.paloma.Prefix#getAction <em>Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' containment reference.
   * @see #getAction()
   * @generated
   */
  void setAction(ACTION value);

  /**
   * Returns the value of the '<em><b>Continue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Continue</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Continue</em>' attribute.
   * @see #setContinue(String)
   * @see org.xtext.edinburgh.paloma.PalomaPackage#getPrefix_Continue()
   * @model
   * @generated
   */
  String getContinue();

  /**
   * Sets the value of the '{@link org.xtext.edinburgh.paloma.Prefix#getContinue <em>Continue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Continue</em>' attribute.
   * @see #getContinue()
   * @generated
   */
  void setContinue(String value);

} // Prefix
