/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fn Call Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.FnCallExpr#getFn <em>Fn</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.FnCallExpr#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getFnCallExpr()
 * @model
 * @generated
 */
public interface FnCallExpr extends Expr
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
   * @see #setFn(F_or_T)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getFnCallExpr_Fn()
   * @model
   * @generated
   */
  F_or_T getFn();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.FnCallExpr#getFn <em>Fn</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fn</em>' reference.
   * @see #getFn()
   * @generated
   */
  void setFn(F_or_T value);

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
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getFnCallExpr_Args()
   * @model containment="true"
   * @generated
   */
  EList<Expr> getArgs();

} // FnCallExpr
