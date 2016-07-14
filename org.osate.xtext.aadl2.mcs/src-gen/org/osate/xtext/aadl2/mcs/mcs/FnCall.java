/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fn Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.FnCall#getFn <em>Fn</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.FnCall#getArgs <em>Args</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.FnCall#getNewtype <em>Newtype</em>}</li>
 * </ul>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getFnCall()
 * @model
 * @generated
 */
public interface FnCall extends EObject
{
  /**
   * Returns the value of the '<em><b>Fn</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fn</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fn</em>' reference.
   * @see #setFn(Function)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getFnCall_Fn()
   * @model
   * @generated
   */
  Function getFn();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.FnCall#getFn <em>Fn</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fn</em>' reference.
   * @see #getFn()
   * @generated
   */
  void setFn(Function value);

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
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getFnCall_Args()
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
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getFnCall_Newtype()
   * @model containment="true"
   * @generated
   */
  Type_expression getNewtype();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.FnCall#getNewtype <em>Newtype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Newtype</em>' containment reference.
   * @see #getNewtype()
   * @generated
   */
  void setNewtype(Type_expression value);

} // FnCall
