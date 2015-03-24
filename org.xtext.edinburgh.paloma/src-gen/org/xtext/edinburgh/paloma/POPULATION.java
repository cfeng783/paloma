/**
 */
package org.xtext.edinburgh.paloma;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>POPULATION</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.edinburgh.paloma.POPULATION#getPopu <em>Popu</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.edinburgh.paloma.PalomaPackage#getPOPULATION()
 * @model
 * @generated
 */
public interface POPULATION extends EObject
{
  /**
   * Returns the value of the '<em><b>Popu</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.edinburgh.paloma.AGENTS}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Popu</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Popu</em>' containment reference list.
   * @see org.xtext.edinburgh.paloma.PalomaPackage#getPOPULATION_Popu()
   * @model containment="true"
   * @generated
   */
  EList<AGENTS> getPopu();

} // POPULATION
