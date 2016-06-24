/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.ComponentClassifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Classifier_literal#getClasslit <em>Classlit</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Classifier_literal#getNameref <em>Nameref</em>}</li>
 * </ul>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getClassifier_literal()
 * @model
 * @generated
 */
public interface Classifier_literal extends EObject
{
  /**
   * Returns the value of the '<em><b>Classlit</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Classlit</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Classlit</em>' reference.
   * @see #setClasslit(ComponentClassifier)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getClassifier_literal_Classlit()
   * @model
   * @generated
   */
  ComponentClassifier getClasslit();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.Classifier_literal#getClasslit <em>Classlit</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Classlit</em>' reference.
   * @see #getClasslit()
   * @generated
   */
  void setClasslit(ComponentClassifier value);

  /**
   * Returns the value of the '<em><b>Nameref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nameref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nameref</em>' containment reference.
   * @see #setNameref(Mcs_name_ref)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getClassifier_literal_Nameref()
   * @model containment="true"
   * @generated
   */
  Mcs_name_ref getNameref();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.Classifier_literal#getNameref <em>Nameref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nameref</em>' containment reference.
   * @see #getNameref()
   * @generated
   */
  void setNameref(Mcs_name_ref value);

} // Classifier_literal
