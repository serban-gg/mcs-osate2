/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.AnnexLibrary;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MCS Annex Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.MCSAnnexLibrary#getTypes <em>Types</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.MCSAnnexLibrary#getConstants <em>Constants</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.MCSAnnexLibrary#getFunctions <em>Functions</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.MCSAnnexLibrary#getTheorems <em>Theorems</em>}</li>
 * </ul>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMCSAnnexLibrary()
 * @model
 * @generated
 */
public interface MCSAnnexLibrary extends EObject, AnnexLibrary
{
  /**
   * Returns the value of the '<em><b>Types</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.xtext.aadl2.mcs.mcs.Type_declaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' containment reference list.
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMCSAnnexLibrary_Types()
   * @model containment="true"
   * @generated
   */
  EList<Type_declaration> getTypes();

  /**
   * Returns the value of the '<em><b>Constants</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.xtext.aadl2.mcs.mcs.Constant_declaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constants</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constants</em>' containment reference list.
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMCSAnnexLibrary_Constants()
   * @model containment="true"
   * @generated
   */
  EList<Constant_declaration> getConstants();

  /**
   * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.xtext.aadl2.mcs.mcs.Function}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Functions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Functions</em>' containment reference list.
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMCSAnnexLibrary_Functions()
   * @model containment="true"
   * @generated
   */
  EList<Function> getFunctions();

  /**
   * Returns the value of the '<em><b>Theorems</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.xtext.aadl2.mcs.mcs.Theorem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Theorems</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Theorems</em>' containment reference list.
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMCSAnnexLibrary_Theorems()
   * @model containment="true"
   * @generated
   */
  EList<Theorem> getTheorems();

} // MCSAnnexLibrary
