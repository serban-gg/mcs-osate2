/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.BooleanTerm#getXbool <em>Xbool</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.BooleanTerm#getMember_check <em>Member check</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.BooleanTerm#getCollect_expr <em>Collect expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getBooleanTerm()
 * @model
 * @generated
 */
public interface BooleanTerm extends XExpression
{
  /**
   * Returns the value of the '<em><b>Xbool</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Xbool</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Xbool</em>' containment reference.
   * @see #setXbool(XExpression)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getBooleanTerm_Xbool()
   * @model containment="true"
   * @generated
   */
  XExpression getXbool();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.BooleanTerm#getXbool <em>Xbool</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Xbool</em>' containment reference.
   * @see #getXbool()
   * @generated
   */
  void setXbool(XExpression value);

  /**
   * Returns the value of the '<em><b>Member check</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Member check</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Member check</em>' containment reference.
   * @see #setMember_check(expression)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getBooleanTerm_Member_check()
   * @model containment="true"
   * @generated
   */
  expression getMember_check();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.BooleanTerm#getMember_check <em>Member check</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Member check</em>' containment reference.
   * @see #getMember_check()
   * @generated
   */
  void setMember_check(expression value);

  /**
   * Returns the value of the '<em><b>Collect expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Collect expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Collect expr</em>' containment reference.
   * @see #setCollect_expr(expression)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getBooleanTerm_Collect_expr()
   * @model containment="true"
   * @generated
   */
  expression getCollect_expr();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.BooleanTerm#getCollect_expr <em>Collect expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Collect expr</em>' containment reference.
   * @see #getCollect_expr()
   * @generated
   */
  void setCollect_expr(expression value);

} // BooleanTerm
