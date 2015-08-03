/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>tclassifiers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.t_classifiers#isT_class <em>Tclass</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.t_classifiers#isT_class_subtype <em>Tclass subtype</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#gett_classifiers()
 * @model
 * @generated
 */
public interface t_classifiers extends EObject
{
  /**
   * Returns the value of the '<em><b>Tclass</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tclass</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tclass</em>' attribute.
   * @see #setT_class(boolean)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#gett_classifiers_T_class()
   * @model
   * @generated
   */
  boolean isT_class();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.t_classifiers#isT_class <em>Tclass</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tclass</em>' attribute.
   * @see #isT_class()
   * @generated
   */
  void setT_class(boolean value);

  /**
   * Returns the value of the '<em><b>Tclass subtype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tclass subtype</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tclass subtype</em>' attribute.
   * @see #setT_class_subtype(boolean)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#gett_classifiers_T_class_subtype()
   * @model
   * @generated
   */
  boolean isT_class_subtype();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.t_classifiers#isT_class_subtype <em>Tclass subtype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tclass subtype</em>' attribute.
   * @see #isT_class_subtype()
   * @generated
   */
  void setT_class_subtype(boolean value);

} // t_classifiers
