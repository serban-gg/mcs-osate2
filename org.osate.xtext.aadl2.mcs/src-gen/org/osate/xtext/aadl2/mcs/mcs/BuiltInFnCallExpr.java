/**
 */
package org.osate.xtext.aadl2.mcs.mcs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Built In Fn Call Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.BuiltInFnCallExpr#getBuiltin <em>Builtin</em>}</li>
 * </ul>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getBuiltInFnCallExpr()
 * @model
 * @generated
 */
public interface BuiltInFnCallExpr extends Expr
{
  /**
   * Returns the value of the '<em><b>Builtin</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Builtin</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Builtin</em>' containment reference.
   * @see #setBuiltin(BuiltInFnCall)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getBuiltInFnCallExpr_Builtin()
   * @model containment="true"
   * @generated
   */
  BuiltInFnCall getBuiltin();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.BuiltInFnCallExpr#getBuiltin <em>Builtin</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Builtin</em>' containment reference.
   * @see #getBuiltin()
   * @generated
   */
  void setBuiltin(BuiltInFnCall value);

} // BuiltInFnCallExpr
