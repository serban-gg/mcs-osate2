/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>In modes list</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.In_modes_list#getModes <em>Modes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getIn_modes_list()
 * @model
 * @generated
 */
public interface In_modes_list extends EObject
{
  /**
   * Returns the value of the '<em><b>Modes</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modes</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modes</em>' attribute list.
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getIn_modes_list_Modes()
   * @model unique="false"
   * @generated
   */
  EList<String> getModes();

} // In_modes_list
