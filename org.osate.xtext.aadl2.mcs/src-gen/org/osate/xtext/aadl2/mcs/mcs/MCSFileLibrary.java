/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.ModelUnit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MCS File Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.MCSFileLibrary#getImportedUnit <em>Imported Unit</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.MCSFileLibrary#getFiles <em>Files</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.MCSFileLibrary#getTypes <em>Types</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.MCSFileLibrary#getConstants <em>Constants</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.MCSFileLibrary#getFunctions <em>Functions</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.MCSFileLibrary#getTheorems <em>Theorems</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.MCSFileLibrary#getCalls <em>Calls</em>}</li>
 * </ul>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMCSFileLibrary()
 * @model
 * @generated
 */
public interface MCSFileLibrary extends EObject
{
  /**
   * Returns the value of the '<em><b>Imported Unit</b></em>' reference list.
   * The list contents are of type {@link org.osate.aadl2.ModelUnit}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imported Unit</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imported Unit</em>' reference list.
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMCSFileLibrary_ImportedUnit()
   * @model
   * @generated
   */
  EList<ModelUnit> getImportedUnit();

  /**
   * Returns the value of the '<em><b>Files</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Files</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Files</em>' attribute list.
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMCSFileLibrary_Files()
   * @model unique="false"
   * @generated
   */
  EList<String> getFiles();

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
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMCSFileLibrary_Types()
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
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMCSFileLibrary_Constants()
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
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMCSFileLibrary_Functions()
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
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMCSFileLibrary_Theorems()
   * @model containment="true"
   * @generated
   */
  EList<Theorem> getTheorems();

  /**
   * Returns the value of the '<em><b>Calls</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.xtext.aadl2.mcs.mcs.TheoremCall}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Calls</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Calls</em>' containment reference list.
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMCSFileLibrary_Calls()
   * @model containment="true"
   * @generated
   */
  EList<TheoremCall> getCalls();

} // MCSFileLibrary
