/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enforcement policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Enforcement_policy#isPack <em>Pack</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Enforcement_policy#isClass <em>Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getEnforcement_policy()
 * @model
 * @generated
 */
public interface Enforcement_policy extends EObject
{
  /**
   * Returns the value of the '<em><b>Pack</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pack</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pack</em>' attribute.
   * @see #setPack(boolean)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getEnforcement_policy_Pack()
   * @model
   * @generated
   */
  boolean isPack();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.Enforcement_policy#isPack <em>Pack</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pack</em>' attribute.
   * @see #isPack()
   * @generated
   */
  void setPack(boolean value);

  /**
   * Returns the value of the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class</em>' attribute.
   * @see #setClass(boolean)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getEnforcement_policy_Class()
   * @model
   * @generated
   */
  boolean isClass();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.Enforcement_policy#isClass <em>Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class</em>' attribute.
   * @see #isClass()
   * @generated
   */
  void setClass(boolean value);

} // Enforcement_policy
