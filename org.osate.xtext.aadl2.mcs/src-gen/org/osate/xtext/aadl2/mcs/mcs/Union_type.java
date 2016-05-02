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
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Union_type#getTypename <em>Typename</em>}</li>
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
   * Returns the value of the '<em><b>Typename</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Typename</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Typename</em>' attribute list.
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getUnion_type_Typename()
   * @model unique="false"
   * @generated
   */
  EList<String> getTypename();

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.xtext.aadl2.mcs.mcs.Type_expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference list.
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getUnion_type_Type()
   * @model containment="true"
   * @generated
   */
  EList<Type_expression> getType();

} // Union_type
