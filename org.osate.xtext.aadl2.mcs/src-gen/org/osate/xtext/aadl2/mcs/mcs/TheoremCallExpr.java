/**
 */
package org.osate.xtext.aadl2.mcs.mcs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Theorem Call Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.TheoremCallExpr#getFn <em>Fn</em>}</li>
 * </ul>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getTheoremCallExpr()
 * @model
 * @generated
 */
public interface TheoremCallExpr extends Expr
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
   * @see #setFn(TheoremCall)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getTheoremCallExpr_Fn()
   * @model containment="true"
   * @generated
   */
  TheoremCall getFn();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.TheoremCallExpr#getFn <em>Fn</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fn</em>' containment reference.
   * @see #getFn()
   * @generated
   */
  void setFn(TheoremCall value);

} // TheoremCallExpr
