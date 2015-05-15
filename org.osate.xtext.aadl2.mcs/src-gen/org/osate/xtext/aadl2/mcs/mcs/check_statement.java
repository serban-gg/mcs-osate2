/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>check statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.check_statement#getRoot <em>Root</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.check_statement#getInmode <em>Inmode</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.check_statement#getStr <em>Str</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getcheck_statement()
 * @model
 * @generated
 */
public interface check_statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Root</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Root</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Root</em>' containment reference.
   * @see #setRoot(root_element)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getcheck_statement_Root()
   * @model containment="true"
   * @generated
   */
  root_element getRoot();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.check_statement#getRoot <em>Root</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Root</em>' containment reference.
   * @see #getRoot()
   * @generated
   */
  void setRoot(root_element value);

  /**
   * Returns the value of the '<em><b>Inmode</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inmode</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inmode</em>' containment reference.
   * @see #setInmode(ModeSpec)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getcheck_statement_Inmode()
   * @model containment="true"
   * @generated
   */
  ModeSpec getInmode();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.check_statement#getInmode <em>Inmode</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inmode</em>' containment reference.
   * @see #getInmode()
   * @generated
   */
  void setInmode(ModeSpec value);

  /**
   * Returns the value of the '<em><b>Str</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Str</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Str</em>' containment reference.
   * @see #setStr(string_expression)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getcheck_statement_Str()
   * @model containment="true"
   * @generated
   */
  string_expression getStr();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.check_statement#getStr <em>Str</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Str</em>' containment reference.
   * @see #getStr()
   * @generated
   */
  void setStr(string_expression value);

} // check_statement
