/**
 */
package org.osate.xtext.aadl2.mcs.mcs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Then Else Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.IfThenElseExpr#getCond <em>Cond</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.IfThenElseExpr#getThen <em>Then</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.IfThenElseExpr#getElse <em>Else</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getIfThenElseExpr()
 * @model
 * @generated
 */
public interface IfThenElseExpr extends Expr
{
  /**
   * Returns the value of the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cond</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cond</em>' containment reference.
   * @see #setCond(Expr)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getIfThenElseExpr_Cond()
   * @model containment="true"
   * @generated
   */
  Expr getCond();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.IfThenElseExpr#getCond <em>Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cond</em>' containment reference.
   * @see #getCond()
   * @generated
   */
  void setCond(Expr value);

  /**
   * Returns the value of the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then</em>' containment reference.
   * @see #setThen(Expr)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getIfThenElseExpr_Then()
   * @model containment="true"
   * @generated
   */
  Expr getThen();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.IfThenElseExpr#getThen <em>Then</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then</em>' containment reference.
   * @see #getThen()
   * @generated
   */
  void setThen(Expr value);

  /**
   * Returns the value of the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else</em>' containment reference.
   * @see #setElse(Expr)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getIfThenElseExpr_Else()
   * @model containment="true"
   * @generated
   */
  Expr getElse();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.IfThenElseExpr#getElse <em>Else</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else</em>' containment reference.
   * @see #getElse()
   * @generated
   */
  void setElse(Expr value);

} // IfThenElseExpr
