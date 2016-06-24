/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.UnitsType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unnamed Real Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.UnnamedRealType#getRange <em>Range</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.UnnamedRealType#getOwnedUnitsType <em>Owned Units Type</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.UnnamedRealType#getReferencedUnitsType <em>Referenced Units Type</em>}</li>
 * </ul>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getUnnamedRealType()
 * @model
 * @generated
 */
public interface UnnamedRealType extends EObject
{
  /**
   * Returns the value of the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Range</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Range</em>' containment reference.
   * @see #setRange(RealRange)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getUnnamedRealType_Range()
   * @model containment="true"
   * @generated
   */
  RealRange getRange();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.UnnamedRealType#getRange <em>Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Range</em>' containment reference.
   * @see #getRange()
   * @generated
   */
  void setRange(RealRange value);

  /**
   * Returns the value of the '<em><b>Owned Units Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Units Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Units Type</em>' containment reference.
   * @see #setOwnedUnitsType(UnitsType)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getUnnamedRealType_OwnedUnitsType()
   * @model containment="true"
   * @generated
   */
  UnitsType getOwnedUnitsType();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.UnnamedRealType#getOwnedUnitsType <em>Owned Units Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owned Units Type</em>' containment reference.
   * @see #getOwnedUnitsType()
   * @generated
   */
  void setOwnedUnitsType(UnitsType value);

  /**
   * Returns the value of the '<em><b>Referenced Units Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Referenced Units Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Referenced Units Type</em>' reference.
   * @see #setReferencedUnitsType(UnitsType)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getUnnamedRealType_ReferencedUnitsType()
   * @model
   * @generated
   */
  UnitsType getReferencedUnitsType();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.UnnamedRealType#getReferencedUnitsType <em>Referenced Units Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Referenced Units Type</em>' reference.
   * @see #getReferencedUnitsType()
   * @generated
   */
  void setReferencedUnitsType(UnitsType value);

} // UnnamedRealType
