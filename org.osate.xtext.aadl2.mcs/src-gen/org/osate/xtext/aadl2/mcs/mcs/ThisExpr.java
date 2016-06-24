/**
 */
package org.osate.xtext.aadl2.mcs.mcs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>This Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.ThisExpr#getSub <em>Sub</em>}</li>
 * </ul>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getThisExpr()
 * @model
 * @generated
 */
public interface ThisExpr extends Expr
{
  /**
   * Returns the value of the '<em><b>Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub</em>' containment reference.
   * @see #setSub(NestedDotID)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getThisExpr_Sub()
   * @model containment="true"
   * @generated
   */
  NestedDotID getSub();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.ThisExpr#getSub <em>Sub</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sub</em>' containment reference.
   * @see #getSub()
   * @generated
   */
  void setSub(NestedDotID value);

} // ThisExpr
