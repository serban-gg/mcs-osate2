/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.AnnexSubclause;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MCS Annex Subclause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.MCSAnnexSubclause#getTypes <em>Types</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.MCSAnnexSubclause#getConstants <em>Constants</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.MCSAnnexSubclause#getFunctions <em>Functions</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.MCSAnnexSubclause#getTheorems <em>Theorems</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.MCSAnnexSubclause#getEnforceclauses <em>Enforceclauses</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMCSAnnexSubclause()
 * @model
 * @generated
 */
public interface MCSAnnexSubclause extends EObject, AnnexSubclause
{
  /**
   * Returns the value of the '<em><b>Types</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.xtext.aadl2.mcs.mcs.type_declaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' containment reference list.
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMCSAnnexSubclause_Types()
   * @model containment="true"
   * @generated
   */
  EList<type_declaration> getTypes();

  /**
   * Returns the value of the '<em><b>Constants</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.xtext.aadl2.mcs.mcs.constant_declaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constants</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constants</em>' containment reference list.
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMCSAnnexSubclause_Constants()
   * @model containment="true"
   * @generated
   */
  EList<constant_declaration> getConstants();

  /**
   * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.xtext.aadl2.mcs.mcs.function_declaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Functions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Functions</em>' containment reference list.
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMCSAnnexSubclause_Functions()
   * @model containment="true"
   * @generated
   */
  EList<function_declaration> getFunctions();

  /**
   * Returns the value of the '<em><b>Theorems</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.xtext.aadl2.mcs.mcs.theorem_declaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Theorems</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Theorems</em>' containment reference list.
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMCSAnnexSubclause_Theorems()
   * @model containment="true"
   * @generated
   */
  EList<theorem_declaration> getTheorems();

  /**
   * Returns the value of the '<em><b>Enforceclauses</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.xtext.aadl2.mcs.mcs.ClassifierEnforce}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enforceclauses</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enforceclauses</em>' containment reference list.
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMCSAnnexSubclause_Enforceclauses()
   * @model containment="true"
   * @generated
   */
  EList<ClassifierEnforce> getEnforceclauses();

} // MCSAnnexSubclause
