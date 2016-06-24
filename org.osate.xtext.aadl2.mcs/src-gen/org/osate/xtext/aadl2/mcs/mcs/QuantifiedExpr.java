/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantified Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.QuantifiedExpr#getQuant <em>Quant</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.QuantifiedExpr#getArgs <em>Args</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.QuantifiedExpr#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getQuantifiedExpr()
 * @model
 * @generated
 */
public interface QuantifiedExpr extends Expr
{
  /**
   * Returns the value of the '<em><b>Quant</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Quant</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Quant</em>' attribute.
   * @see #setQuant(String)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getQuantifiedExpr_Quant()
   * @model
   * @generated
   */
  String getQuant();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.QuantifiedExpr#getQuant <em>Quant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Quant</em>' attribute.
   * @see #getQuant()
   * @generated
   */
  void setQuant(String value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.xtext.aadl2.mcs.mcs.Parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference list.
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getQuantifiedExpr_Args()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getArgs();

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
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getQuantifiedExpr_Expr()
   * @model containment="true"
   * @generated
   */
  Expr getExpr();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.QuantifiedExpr#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expr value);

} // QuantifiedExpr
