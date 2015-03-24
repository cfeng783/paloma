/**
 */
package org.xtext.edinburgh.paloma;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agent State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.edinburgh.paloma.AgentState#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.edinburgh.paloma.AgentState#getPrefixs <em>Prefixs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.edinburgh.paloma.PalomaPackage#getAgentState()
 * @model
 * @generated
 */
public interface AgentState extends EObject
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
   * @see org.xtext.edinburgh.paloma.PalomaPackage#getAgentState_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.edinburgh.paloma.AgentState#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Prefixs</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.edinburgh.paloma.Prefix}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prefixs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prefixs</em>' containment reference list.
   * @see org.xtext.edinburgh.paloma.PalomaPackage#getAgentState_Prefixs()
   * @model containment="true"
   * @generated
   */
  EList<Prefix> getPrefixs();

} // AgentState
