/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mcs name ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Mcs_name_ref#getRef <em>Ref</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Mcs_name_ref#getChain <em>Chain</em>}</li>
 * </ul>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMcs_name_ref()
 * @model
 * @generated
 */
public interface Mcs_name_ref extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(McsTypedName)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMcs_name_ref_Ref()
   * @model
   * @generated
   */
  McsTypedName getRef();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.Mcs_name_ref#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(McsTypedName value);

  /**
   * Returns the value of the '<em><b>Chain</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Chain</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Chain</em>' containment reference.
   * @see #setChain(MethodChain)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMcs_name_ref_Chain()
   * @model containment="true"
   * @generated
   */
  MethodChain getChain();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.Mcs_name_ref#getChain <em>Chain</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Chain</em>' containment reference.
   * @see #getChain()
   * @generated
   */
  void setChain(MethodChain value);

} // Mcs_name_ref
