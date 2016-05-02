/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.xtext.xbase.XExpression;

import org.osate.aadl2.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>property reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.property_reference#getEl_ref <em>El ref</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.property_reference#isExists <em>Exists</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.property_reference#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getproperty_reference()
 * @model
 * @generated
 */
public interface property_reference extends XExpression
{
  /**
   * Returns the value of the '<em><b>El ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>El ref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>El ref</em>' containment reference.
   * @see #setEl_ref(element_reference)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getproperty_reference_El_ref()
   * @model containment="true"
   * @generated
   */
  element_reference getEl_ref();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.property_reference#getEl_ref <em>El ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>El ref</em>' containment reference.
   * @see #getEl_ref()
   * @generated
   */
  void setEl_ref(element_reference value);

  /**
   * Returns the value of the '<em><b>Exists</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exists</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exists</em>' attribute.
   * @see #setExists(boolean)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getproperty_reference_Exists()
   * @model
   * @generated
   */
  boolean isExists();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.property_reference#isExists <em>Exists</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exists</em>' attribute.
   * @see #isExists()
   * @generated
   */
  void setExists(boolean value);

  /**
   * Returns the value of the '<em><b>Property</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' reference.
   * @see #setProperty(Property)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getproperty_reference_Property()
   * @model
   * @generated
   */
  Property getProperty();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.property_reference#getProperty <em>Property</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property</em>' reference.
   * @see #getProperty()
   * @generated
   */
  void setProperty(Property value);

} // property_reference
