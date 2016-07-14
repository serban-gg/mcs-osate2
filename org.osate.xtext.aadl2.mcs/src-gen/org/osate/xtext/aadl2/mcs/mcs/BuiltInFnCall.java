/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Built In Fn Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.BuiltInFnCall#getFn <em>Fn</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.BuiltInFnCall#getArgs <em>Args</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.BuiltInFnCall#getNewtype <em>Newtype</em>}</li>
 * </ul>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getBuiltInFnCall()
 * @model
 * @generated
 */
public interface BuiltInFnCall extends EObject
{
  /**
   * Returns the value of the '<em><b>Fn</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fn</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fn</em>' attribute.
   * @see #setFn(String)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getBuiltInFnCall_Fn()
   * @model
   * @generated
   */
  String getFn();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.BuiltInFnCall#getFn <em>Fn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fn</em>' attribute.
   * @see #getFn()
   * @generated
   */
  void setFn(String value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.xtext.aadl2.mcs.mcs.Expr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference list.
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getBuiltInFnCall_Args()
   * @model containment="true"
   * @generated
   */
  EList<Expr> getArgs();

  /**
   * Returns the value of the '<em><b>Newtype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Newtype</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Newtype</em>' containment reference.
   * @see #setNewtype(Type_expression)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getBuiltInFnCall_Newtype()
   * @model containment="true"
   * @generated
   */
  Type_expression getNewtype();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.BuiltInFnCall#getNewtype <em>Newtype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Newtype</em>' containment reference.
   * @see #getNewtype()
   * @generated
   */
  void setNewtype(Type_expression value);

} // BuiltInFnCall
