/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iteration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Iteration#getVar_id <em>Var id</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Iteration#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Iteration#getLocal <em>Local</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Iteration#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getIteration()
 * @model
 * @generated
 */
public interface Iteration extends Basic_statement
{
  /**
   * Returns the value of the '<em><b>Var id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var id</em>' attribute.
   * @see #setVar_id(String)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getIteration_Var_id()
   * @model
   * @generated
   */
  String getVar_id();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.Iteration#getVar_id <em>Var id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var id</em>' attribute.
   * @see #getVar_id()
   * @generated
   */
  void setVar_id(String value);

  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(expression)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getIteration_Expr()
   * @model containment="true"
   * @generated
   */
  expression getExpr();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.Iteration#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(expression value);

  /**
   * Returns the value of the '<em><b>Local</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.xtext.aadl2.mcs.mcs.Local_declaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Local</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Local</em>' containment reference list.
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getIteration_Local()
   * @model containment="true"
   * @generated
   */
  EList<Local_declaration> getLocal();

  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.xtext.aadl2.mcs.mcs.Theorem_statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getIteration_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Theorem_statement> getStatements();

} // Iteration
