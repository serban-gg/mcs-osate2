/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>theorem statements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.theorem_statements#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#gettheorem_statements()
 * @model
 * @generated
 */
public interface theorem_statements extends EObject
{
  /**
   * Returns the value of the '<em><b>Statements</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' attribute.
   * @see #setStatements(String)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#gettheorem_statements_Statements()
   * @model
   * @generated
   */
  String getStatements();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.theorem_statements#getStatements <em>Statements</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statements</em>' attribute.
   * @see #getStatements()
   * @generated
   */
  void setStatements(String value);

} // theorem_statements
