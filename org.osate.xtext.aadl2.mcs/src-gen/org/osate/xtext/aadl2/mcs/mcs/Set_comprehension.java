/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set comprehension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Set_comprehension#getResult <em>Result</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Set_comprehension#getVar <em>Var</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Set_comprehension#getSet <em>Set</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Set_comprehension#isCond <em>Cond</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getSet_comprehension()
 * @model
 * @generated
 */
public interface Set_comprehension extends EObject
{
  /**
   * Returns the value of the '<em><b>Result</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Result</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Result</em>' containment reference.
   * @see #setResult(expression)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getSet_comprehension_Result()
   * @model containment="true"
   * @generated
   */
  expression getResult();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.Set_comprehension#getResult <em>Result</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Result</em>' containment reference.
   * @see #getResult()
   * @generated
   */
  void setResult(expression value);

  /**
   * Returns the value of the '<em><b>Var</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' attribute.
   * @see #setVar(String)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getSet_comprehension_Var()
   * @model
   * @generated
   */
  String getVar();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.Set_comprehension#getVar <em>Var</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' attribute.
   * @see #getVar()
   * @generated
   */
  void setVar(String value);

  /**
   * Returns the value of the '<em><b>Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Set</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Set</em>' containment reference.
   * @see #setSet(expression)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getSet_comprehension_Set()
   * @model containment="true"
   * @generated
   */
  expression getSet();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.Set_comprehension#getSet <em>Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Set</em>' containment reference.
   * @see #getSet()
   * @generated
   */
  void setSet(expression value);

  /**
   * Returns the value of the '<em><b>Cond</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cond</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cond</em>' attribute.
   * @see #setCond(boolean)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getSet_comprehension_Cond()
   * @model
   * @generated
   */
  boolean isCond();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.Set_comprehension#isCond <em>Cond</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cond</em>' attribute.
   * @see #isCond()
   * @generated
   */
  void setCond(boolean value);

} // Set_comprehension
