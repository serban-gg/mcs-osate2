/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.osate.aadl2.AadlPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pkg Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.PkgExpr#getPackage <em>Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getPkgExpr()
 * @model
 * @generated
 */
public interface PkgExpr extends Expr
{
  /**
   * Returns the value of the '<em><b>Package</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package</em>' reference.
   * @see #setPackage(AadlPackage)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getPkgExpr_Package()
   * @model
   * @generated
   */
  AadlPackage getPackage();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.PkgExpr#getPackage <em>Package</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Package</em>' reference.
   * @see #getPackage()
   * @generated
   */
  void setPackage(AadlPackage value);

} // PkgExpr
