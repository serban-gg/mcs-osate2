/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MCS Viewpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.MCSViewpoint#getName <em>Name</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.MCSViewpoint#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.MCSViewpoint#getPscript <em>Pscript</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMCSViewpoint()
 * @model
 * @generated
 */
public interface MCSViewpoint extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMCSViewpoint_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.MCSViewpoint#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Policy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Policy</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Policy</em>' containment reference.
   * @see #setPolicy(Enforcement_policy)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMCSViewpoint_Policy()
   * @model containment="true"
   * @generated
   */
  Enforcement_policy getPolicy();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.MCSViewpoint#getPolicy <em>Policy</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Policy</em>' containment reference.
   * @see #getPolicy()
   * @generated
   */
  void setPolicy(Enforcement_policy value);

  /**
   * Returns the value of the '<em><b>Pscript</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pscript</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pscript</em>' containment reference.
   * @see #setPscript(PackageScript)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMCSViewpoint_Pscript()
   * @model containment="true"
   * @generated
   */
  PackageScript getPscript();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.MCSViewpoint#getPscript <em>Pscript</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pscript</em>' containment reference.
   * @see #getPscript()
   * @generated
   */
  void setPscript(PackageScript value);

} // MCSViewpoint
