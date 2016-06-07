/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Theorem root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Theorem_root#isNilroot <em>Nilroot</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Theorem_root#getClassifier <em>Classifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getTheorem_root()
 * @model
 * @generated
 */
public interface Theorem_root extends EObject
{
  /**
   * Returns the value of the '<em><b>Nilroot</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nilroot</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nilroot</em>' attribute.
   * @see #setNilroot(boolean)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getTheorem_root_Nilroot()
   * @model
   * @generated
   */
  boolean isNilroot();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.Theorem_root#isNilroot <em>Nilroot</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nilroot</em>' attribute.
   * @see #isNilroot()
   * @generated
   */
  void setNilroot(boolean value);

  /**
   * Returns the value of the '<em><b>Classifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Classifier</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Classifier</em>' containment reference.
   * @see #setClassifier(T_classifier_subtypes)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getTheorem_root_Classifier()
   * @model containment="true"
   * @generated
   */
  T_classifier_subtypes getClassifier();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.Theorem_root#getClassifier <em>Classifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Classifier</em>' containment reference.
   * @see #getClassifier()
   * @generated
   */
  void setClassifier(T_classifier_subtypes value);

} // Theorem_root
