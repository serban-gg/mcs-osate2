/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>record type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.record_type#getField <em>Field</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getrecord_type()
 * @model
 * @generated
 */
public interface record_type extends composite_type
{
  /**
   * Returns the value of the '<em><b>Field</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.xtext.aadl2.mcs.mcs.id_type_pair}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Field</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field</em>' containment reference list.
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getrecord_type_Field()
   * @model containment="true"
   * @generated
   */
  EList<id_type_pair> getField();

} // record_type
