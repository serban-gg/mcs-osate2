/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.osate.aadl2.IntegerLiteral;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Int Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.IntExpr#getVal <em>Val</em>}</li>
 * </ul>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getIntExpr()
 * @model
 * @generated
 */
public interface IntExpr extends Expr
{
  /**
   * Returns the value of the '<em><b>Val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Val</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val</em>' containment reference.
   * @see #setVal(IntegerLiteral)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getIntExpr_Val()
   * @model containment="true"
   * @generated
   */
  IntegerLiteral getVal();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.IntExpr#getVal <em>Val</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val</em>' containment reference.
   * @see #getVal()
   * @generated
   */
  void setVal(IntegerLiteral value);

} // IntExpr
