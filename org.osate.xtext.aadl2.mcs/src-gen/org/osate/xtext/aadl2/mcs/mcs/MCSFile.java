/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.ModelUnit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MCS File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.MCSFile#getImportedUnit <em>Imported Unit</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.MCSFile#getFiles <em>Files</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.MCSFile#getTypes <em>Types</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.MCSFile#getConstants <em>Constants</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.MCSFile#getFunctions <em>Functions</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.MCSFile#getTheorems <em>Theorems</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.MCSFile#getCalls <em>Calls</em>}</li>
 * </ul>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMCSFile()
 * @model
 * @generated
 */
public interface MCSFile extends EObject
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
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMCSFile_ImportedUnit()
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
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMCSFile_Files()
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
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMCSFile_Types()
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
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMCSFile_Constants()
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
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMCSFile_Functions()
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
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMCSFile_Theorems()
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
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMCSFile_Calls()
   * @model containment="true"
   * @generated
   */
  EList<TheoremCall> getCalls();

} // MCSFile
