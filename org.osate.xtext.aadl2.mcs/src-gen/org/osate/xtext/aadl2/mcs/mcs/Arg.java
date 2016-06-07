/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Arg#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getArg()
 * @model
 * @generated
 */
public interface Arg extends EObject, Parameter
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Type_expression)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getArg_Type()
   * @model containment="true"
   * @generated
   */
  Type_expression getType();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.Arg#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Type_expression value);

} // Arg
