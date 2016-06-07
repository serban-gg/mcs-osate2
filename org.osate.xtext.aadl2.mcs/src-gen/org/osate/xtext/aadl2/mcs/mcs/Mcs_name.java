/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mcs name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Mcs_name#getName <em>Name</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Mcs_name#getBuiltin <em>Builtin</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Mcs_name#getMethod <em>Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMcs_name()
 * @model
 * @generated
 */
public interface Mcs_name extends Classifier_literal, Mcs_name_ref
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
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMcs_name_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.Mcs_name#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Builtin</b></em>' reference list.
   * The list contents are of type {@link org.osate.xtext.aadl2.mcs.mcs.BuiltInFnCallExpr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Builtin</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Builtin</em>' reference list.
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMcs_name_Builtin()
   * @model
   * @generated
   */
  EList<BuiltInFnCallExpr> getBuiltin();

  /**
   * Returns the value of the '<em><b>Method</b></em>' reference list.
   * The list contents are of type {@link org.osate.xtext.aadl2.mcs.mcs.FnCallExpr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method</em>' reference list.
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMcs_name_Method()
   * @model
   * @generated
   */
  EList<FnCallExpr> getMethod();

} // Mcs_name
