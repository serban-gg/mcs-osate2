/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Script</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.PackageScript#getApplies <em>Applies</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.PackageScript#getC_block <em>Cblock</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.PackageScript#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getPackageScript()
 * @model
 * @generated
 */
public interface PackageScript extends EObject
{
  /**
   * Returns the value of the '<em><b>Applies</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.xtext.aadl2.mcs.mcs.AppliesToClause}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Applies</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Applies</em>' containment reference list.
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getPackageScript_Applies()
   * @model containment="true"
   * @generated
   */
  EList<AppliesToClause> getApplies();

  /**
   * Returns the value of the '<em><b>Cblock</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.xtext.aadl2.mcs.mcs.ConstraintsBlock}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cblock</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cblock</em>' containment reference list.
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getPackageScript_C_block()
   * @model containment="true"
   * @generated
   */
  EList<ConstraintsBlock> getC_block();

  /**
   * Returns the value of the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' containment reference.
   * @see #setRef(ViewpointReference)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getPackageScript_Ref()
   * @model containment="true"
   * @generated
   */
  ViewpointReference getRef();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.PackageScript#getRef <em>Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' containment reference.
   * @see #getRef()
   * @generated
   */
  void setRef(ViewpointReference value);

} // PackageScript
