/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Theorem Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.TheoremBody#getString <em>String</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.TheoremBody#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getTheoremBody()
 * @model
 * @generated
 */
public interface TheoremBody extends EObject
{
  /**
   * Returns the value of the '<em><b>String</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.xtext.aadl2.mcs.mcs.ParameterizedString}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>String</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>String</em>' containment reference list.
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getTheoremBody_String()
   * @model containment="true"
   * @generated
   */
  EList<ParameterizedString> getString();

  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(Expr)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getTheoremBody_Expr()
   * @model containment="true"
   * @generated
   */
  Expr getExpr();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.TheoremBody#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expr value);

} // TheoremBody
