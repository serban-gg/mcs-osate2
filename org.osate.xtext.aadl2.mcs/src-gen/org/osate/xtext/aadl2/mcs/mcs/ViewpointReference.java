/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Viewpoint Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.ViewpointReference#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.ViewpointReference#getVp_ref <em>Vp ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getViewpointReference()
 * @model
 * @generated
 */
public interface ViewpointReference extends EObject
{
  /**
   * Returns the value of the '<em><b>Policy</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Policy</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Policy</em>' reference.
   * @see #setPolicy(Enforcement_policy)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getViewpointReference_Policy()
   * @model
   * @generated
   */
  Enforcement_policy getPolicy();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.ViewpointReference#getPolicy <em>Policy</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Policy</em>' reference.
   * @see #getPolicy()
   * @generated
   */
  void setPolicy(Enforcement_policy value);

  /**
   * Returns the value of the '<em><b>Vp ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vp ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vp ref</em>' reference.
   * @see #setVp_ref(MCSViewpoint)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getViewpointReference_Vp_ref()
   * @model
   * @generated
   */
  MCSViewpoint getVp_ref();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.ViewpointReference#getVp_ref <em>Vp ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vp ref</em>' reference.
   * @see #getVp_ref()
   * @generated
   */
  void setVp_ref(MCSViewpoint value);

} // ViewpointReference
