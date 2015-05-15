/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>labelled check statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.labelled_check_statement#getC_label <em>Clabel</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.labelled_check_statement#getCs <em>Cs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getlabelled_check_statement()
 * @model
 * @generated
 */
public interface labelled_check_statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Clabel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Clabel</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Clabel</em>' containment reference.
   * @see #setC_label(check_label_id)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getlabelled_check_statement_C_label()
   * @model containment="true"
   * @generated
   */
  check_label_id getC_label();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.labelled_check_statement#getC_label <em>Clabel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Clabel</em>' containment reference.
   * @see #getC_label()
   * @generated
   */
  void setC_label(check_label_id value);

  /**
   * Returns the value of the '<em><b>Cs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cs</em>' containment reference.
   * @see #setCs(check_statement)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getlabelled_check_statement_Cs()
   * @model containment="true"
   * @generated
   */
  check_statement getCs();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.labelled_check_statement#getCs <em>Cs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cs</em>' containment reference.
   * @see #getCs()
   * @generated
   */
  void setCs(check_statement value);

} // labelled_check_statement
