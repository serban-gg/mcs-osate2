/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.expression#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getexpression()
 * @model
 * @generated
 */
public interface expression extends constant_expression
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(XExpression)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getexpression_Name()
   * @model containment="true"
   * @generated
   */
  XExpression getName();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.expression#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(XExpression value);

} // expression
