/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.NumberType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unnamed Range Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.UnnamedRangeType#getOwnedNumberType <em>Owned Number Type</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.UnnamedRangeType#getReferencedNumberType <em>Referenced Number Type</em>}</li>
 * </ul>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getUnnamedRangeType()
 * @model
 * @generated
 */
public interface UnnamedRangeType extends EObject
{
  /**
   * Returns the value of the '<em><b>Owned Number Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Number Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Number Type</em>' containment reference.
   * @see #setOwnedNumberType(EObject)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getUnnamedRangeType_OwnedNumberType()
   * @model containment="true"
   * @generated
   */
  EObject getOwnedNumberType();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.UnnamedRangeType#getOwnedNumberType <em>Owned Number Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owned Number Type</em>' containment reference.
   * @see #getOwnedNumberType()
   * @generated
   */
  void setOwnedNumberType(EObject value);

  /**
   * Returns the value of the '<em><b>Referenced Number Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Referenced Number Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Referenced Number Type</em>' reference.
   * @see #setReferencedNumberType(NumberType)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getUnnamedRangeType_ReferencedNumberType()
   * @model
   * @generated
   */
  NumberType getReferencedNumberType();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.UnnamedRangeType#getReferencedNumberType <em>Referenced Number Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Referenced Number Type</em>' reference.
   * @see #getReferencedNumberType()
   * @generated
   */
  void setReferencedNumberType(NumberType value);

} // UnnamedRangeType
