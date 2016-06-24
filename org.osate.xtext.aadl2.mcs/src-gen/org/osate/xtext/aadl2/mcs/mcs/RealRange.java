/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Real Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.RealRange#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.RealRange#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getRealRange()
 * @model
 * @generated
 */
public interface RealRange extends EObject
{
  /**
   * Returns the value of the '<em><b>Lower Bound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lower Bound</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lower Bound</em>' containment reference.
   * @see #setLowerBound(EObject)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getRealRange_LowerBound()
   * @model containment="true"
   * @generated
   */
  EObject getLowerBound();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.RealRange#getLowerBound <em>Lower Bound</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lower Bound</em>' containment reference.
   * @see #getLowerBound()
   * @generated
   */
  void setLowerBound(EObject value);

  /**
   * Returns the value of the '<em><b>Upper Bound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Upper Bound</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Upper Bound</em>' containment reference.
   * @see #setUpperBound(EObject)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getRealRange_UpperBound()
   * @model containment="true"
   * @generated
   */
  EObject getUpperBound();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.RealRange#getUpperBound <em>Upper Bound</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Upper Bound</em>' containment reference.
   * @see #getUpperBound()
   * @generated
   */
  void setUpperBound(EObject value);

} // RealRange
