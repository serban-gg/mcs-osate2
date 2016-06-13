/**
 */
package org.osate.xtext.aadl2.mcs.mcs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fn Call Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.FnCallExpr#getFn <em>Fn</em>}</li>
 * </ul>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getFnCallExpr()
 * @model
 * @generated
 */
public interface FnCallExpr extends Expr
{
  /**
   * Returns the value of the '<em><b>Fn</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fn</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fn</em>' containment reference.
   * @see #setFn(FnCall)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getFnCallExpr_Fn()
   * @model containment="true"
   * @generated
   */
  FnCall getFn();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.FnCallExpr#getFn <em>Fn</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fn</em>' containment reference.
   * @see #getFn()
   * @generated
   */
  void setFn(FnCall value);

} // FnCallExpr
