/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MCS Closure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.MCSClosure#getDeclaredFormalParameters <em>Declared Formal Parameters</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.MCSClosure#isExplicitSyntax <em>Explicit Syntax</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.MCSClosure#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMCSClosure()
 * @model
 * @generated
 */
public interface MCSClosure extends XExpression
{
  /**
   * Returns the value of the '<em><b>Declared Formal Parameters</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.xtext.aadl2.mcs.mcs.argument}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declared Formal Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declared Formal Parameters</em>' containment reference list.
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMCSClosure_DeclaredFormalParameters()
   * @model containment="true"
   * @generated
   */
  EList<argument> getDeclaredFormalParameters();

  /**
   * Returns the value of the '<em><b>Explicit Syntax</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Explicit Syntax</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Explicit Syntax</em>' attribute.
   * @see #setExplicitSyntax(boolean)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMCSClosure_ExplicitSyntax()
   * @model
   * @generated
   */
  boolean isExplicitSyntax();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.MCSClosure#isExplicitSyntax <em>Explicit Syntax</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Explicit Syntax</em>' attribute.
   * @see #isExplicitSyntax()
   * @generated
   */
  void setExplicitSyntax(boolean value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(XExpression)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMCSClosure_Expression()
   * @model containment="true"
   * @generated
   */
  XExpression getExpression();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.MCSClosure#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(XExpression value);

} // MCSClosure
