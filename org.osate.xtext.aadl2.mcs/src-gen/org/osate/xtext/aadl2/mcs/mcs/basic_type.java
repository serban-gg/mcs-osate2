/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.osate.aadl2.AadlBoolean;
import org.osate.aadl2.AadlString;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>basic type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.basic_type#getBool <em>Bool</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.basic_type#getString <em>String</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getbasic_type()
 * @model
 * @generated
 */
public interface basic_type extends type_expression
{
  /**
   * Returns the value of the '<em><b>Bool</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bool</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bool</em>' containment reference.
   * @see #setBool(AadlBoolean)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getbasic_type_Bool()
   * @model containment="true"
   * @generated
   */
  AadlBoolean getBool();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.basic_type#getBool <em>Bool</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bool</em>' containment reference.
   * @see #getBool()
   * @generated
   */
  void setBool(AadlBoolean value);

  /**
   * Returns the value of the '<em><b>String</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>String</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>String</em>' containment reference.
   * @see #setString(AadlString)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getbasic_type_String()
   * @model containment="true"
   * @generated
   */
  AadlString getString();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.basic_type#getString <em>String</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String</em>' containment reference.
   * @see #getString()
   * @generated
   */
  void setString(AadlString value);

} // basic_type
