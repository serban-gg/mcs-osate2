/**
 */
package org.osate.xtext.aadl2.mcs.mcs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.MappingExpr#getExpr1 <em>Expr1</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.MappingExpr#getExpr2 <em>Expr2</em>}</li>
 * </ul>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMappingExpr()
 * @model
 * @generated
 */
public interface MappingExpr extends Expr
{
  /**
   * Returns the value of the '<em><b>Expr1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr1</em>' containment reference.
   * @see #setExpr1(Expr)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMappingExpr_Expr1()
   * @model containment="true"
   * @generated
   */
  Expr getExpr1();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.MappingExpr#getExpr1 <em>Expr1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr1</em>' containment reference.
   * @see #getExpr1()
   * @generated
   */
  void setExpr1(Expr value);

  /**
   * Returns the value of the '<em><b>Expr2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr2</em>' containment reference.
   * @see #setExpr2(Expr)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMappingExpr_Expr2()
   * @model containment="true"
   * @generated
   */
  Expr getExpr2();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.MappingExpr#getExpr2 <em>Expr2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr2</em>' containment reference.
   * @see #getExpr2()
   * @generated
   */
  void setExpr2(Expr value);

} // MappingExpr
