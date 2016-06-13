/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Constant_declaration#getConst <em>Const</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Constant_declaration#getLeft_expr <em>Left expr</em>}</li>
 * </ul>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getConstant_declaration()
 * @model
 * @generated
 */
public interface Constant_declaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Const</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Const</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Const</em>' containment reference.
   * @see #setConst(McsTypedName)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getConstant_declaration_Const()
   * @model containment="true"
   * @generated
   */
  McsTypedName getConst();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.Constant_declaration#getConst <em>Const</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Const</em>' containment reference.
   * @see #getConst()
   * @generated
   */
  void setConst(McsTypedName value);

  /**
   * Returns the value of the '<em><b>Left expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left expr</em>' containment reference.
   * @see #setLeft_expr(Expr)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getConstant_declaration_Left_expr()
   * @model containment="true"
   * @generated
   */
  Expr getLeft_expr();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.Constant_declaration#getLeft_expr <em>Left expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left expr</em>' containment reference.
   * @see #getLeft_expr()
   * @generated
   */
  void setLeft_expr(Expr value);

} // Constant_declaration
