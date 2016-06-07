/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Union type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Union_type#getTypes <em>Types</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Union_type#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getUnion_type()
 * @model
 * @generated
 */
public interface Union_type extends Composite_type
{
  /**
   * Returns the value of the '<em><b>Types</b></em>' reference list.
   * The list contents are of type {@link org.osate.xtext.aadl2.mcs.mcs.Type_expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Types</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' reference list.
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getUnion_type_Types()
   * @model
   * @generated
   */
  EList<Type_expression> getTypes();

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference list.
   * The list contents are of type {@link org.osate.xtext.aadl2.mcs.mcs.Type_expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference list.
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getUnion_type_Type()
   * @model
   * @generated
   */
  EList<Type_expression> getType();

} // Union_type
