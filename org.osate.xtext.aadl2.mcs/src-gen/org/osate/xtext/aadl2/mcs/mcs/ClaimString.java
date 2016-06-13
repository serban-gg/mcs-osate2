/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.osate.aadl2.StringLiteral;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.ClaimString#getStr <em>Str</em>}</li>
 * </ul>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getClaimString()
 * @model
 * @generated
 */
public interface ClaimString extends TextParm
{
  /**
   * Returns the value of the '<em><b>Str</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Str</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Str</em>' containment reference.
   * @see #setStr(StringLiteral)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getClaimString_Str()
   * @model containment="true"
   * @generated
   */
  StringLiteral getStr();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.ClaimString#getStr <em>Str</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Str</em>' containment reference.
   * @see #getStr()
   * @generated
   */
  void setStr(StringLiteral value);

} // ClaimString
