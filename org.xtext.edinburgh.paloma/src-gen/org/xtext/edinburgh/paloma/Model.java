/**
 */
package org.xtext.edinburgh.paloma;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.edinburgh.paloma.Model#getParams <em>Params</em>}</li>
 *   <li>{@link org.xtext.edinburgh.paloma.Model#getStates <em>States</em>}</li>
 *   <li>{@link org.xtext.edinburgh.paloma.Model#getPopulation <em>Population</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.edinburgh.paloma.PalomaPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.edinburgh.paloma.Param}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see org.xtext.edinburgh.paloma.PalomaPackage#getModel_Params()
   * @model containment="true"
   * @generated
   */
  EList<Param> getParams();

  /**
   * Returns the value of the '<em><b>States</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.edinburgh.paloma.AgentState}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>States</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>States</em>' containment reference list.
   * @see org.xtext.edinburgh.paloma.PalomaPackage#getModel_States()
   * @model containment="true"
   * @generated
   */
  EList<AgentState> getStates();

  /**
   * Returns the value of the '<em><b>Population</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Population</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Population</em>' containment reference.
   * @see #setPopulation(POPULATION)
   * @see org.xtext.edinburgh.paloma.PalomaPackage#getModel_Population()
   * @model containment="true"
   * @generated
   */
  POPULATION getPopulation();

  /**
   * Sets the value of the '{@link org.xtext.edinburgh.paloma.Model#getPopulation <em>Population</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Population</em>' containment reference.
   * @see #getPopulation()
   * @generated
   */
  void setPopulation(POPULATION value);

} // Model
