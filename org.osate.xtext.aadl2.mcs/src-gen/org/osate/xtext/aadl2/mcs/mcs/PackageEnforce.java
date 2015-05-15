/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Enforce</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.PackageEnforce#getViewpoint <em>Viewpoint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getPackageEnforce()
 * @model
 * @generated
 */
public interface PackageEnforce extends EObject
{
  /**
   * Returns the value of the '<em><b>Viewpoint</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Viewpoint</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Viewpoint</em>' reference.
   * @see #setViewpoint(MCSViewpoint)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getPackageEnforce_Viewpoint()
   * @model
   * @generated
   */
  MCSViewpoint getViewpoint();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.PackageEnforce#getViewpoint <em>Viewpoint</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Viewpoint</em>' reference.
   * @see #getViewpoint()
   * @generated
   */
  void setViewpoint(MCSViewpoint value);

} // PackageEnforce
