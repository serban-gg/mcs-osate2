/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraints Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.ConstraintsBlock#getB_label <em>Blabel</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.ConstraintsBlock#getCs <em>Cs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getConstraintsBlock()
 * @model
 * @generated
 */
public interface ConstraintsBlock extends EObject
{
  /**
   * Returns the value of the '<em><b>Blabel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Blabel</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Blabel</em>' containment reference.
   * @see #setB_label(block_label_id)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getConstraintsBlock_B_label()
   * @model containment="true"
   * @generated
   */
  block_label_id getB_label();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.ConstraintsBlock#getB_label <em>Blabel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Blabel</em>' containment reference.
   * @see #getB_label()
   * @generated
   */
  void setB_label(block_label_id value);

  /**
   * Returns the value of the '<em><b>Cs</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.xtext.aadl2.mcs.mcs.labelled_check_statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cs</em>' containment reference list.
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getConstraintsBlock_Cs()
   * @model containment="true"
   * @generated
   */
  EList<labelled_check_statement> getCs();

} // ConstraintsBlock
