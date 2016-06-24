/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.osate.aadl2.UnitLiteral;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim Arg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.ClaimArg#getTextarg <em>Textarg</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.ClaimArg#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getClaimArg()
 * @model
 * @generated
 */
public interface ClaimArg extends TextParm
{
  /**
   * Returns the value of the '<em><b>Textarg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Textarg</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Textarg</em>' containment reference.
   * @see #setTextarg(MCSNameExpr)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getClaimArg_Textarg()
   * @model containment="true"
   * @generated
   */
  MCSNameExpr getTextarg();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.ClaimArg#getTextarg <em>Textarg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Textarg</em>' containment reference.
   * @see #getTextarg()
   * @generated
   */
  void setTextarg(MCSNameExpr value);

  /**
   * Returns the value of the '<em><b>Unit</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unit</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unit</em>' reference.
   * @see #setUnit(UnitLiteral)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getClaimArg_Unit()
   * @model
   * @generated
   */
  UnitLiteral getUnit();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.ClaimArg#getUnit <em>Unit</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unit</em>' reference.
   * @see #getUnit()
   * @generated
   */
  void setUnit(UnitLiteral value);

} // ClaimArg
