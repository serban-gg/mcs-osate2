/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.osate.aadl2.StringLiteral;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.StringExpr#getVal <em>Val</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getStringExpr()
 * @model
 * @generated
 */
public interface StringExpr extends Expr
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
   * @see #setVal(StringLiteral)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getStringExpr_Val()
   * @model containment="true"
   * @generated
   */
  StringLiteral getVal();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.StringExpr#getVal <em>Val</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val</em>' containment reference.
   * @see #getVal()
   * @generated
   */
  void setVal(StringLiteral value);

} // StringExpr
