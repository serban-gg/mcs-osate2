/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MCS Grammar Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.MCSGrammarRoot#getLib <em>Lib</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.MCSGrammarRoot#getFile <em>File</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.MCSGrammarRoot#getSubclause <em>Subclause</em>}</li>
 * </ul>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMCSGrammarRoot()
 * @model
 * @generated
 */
public interface MCSGrammarRoot extends EObject
{
  /**
   * Returns the value of the '<em><b>Lib</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lib</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lib</em>' containment reference.
   * @see #setLib(MCSAnnexLibrary)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMCSGrammarRoot_Lib()
   * @model containment="true"
   * @generated
   */
  MCSAnnexLibrary getLib();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.MCSGrammarRoot#getLib <em>Lib</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lib</em>' containment reference.
   * @see #getLib()
   * @generated
   */
  void setLib(MCSAnnexLibrary value);

  /**
   * Returns the value of the '<em><b>File</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>File</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>File</em>' containment reference.
   * @see #setFile(MCSFile)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMCSGrammarRoot_File()
   * @model containment="true"
   * @generated
   */
  MCSFile getFile();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.MCSGrammarRoot#getFile <em>File</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>File</em>' containment reference.
   * @see #getFile()
   * @generated
   */
  void setFile(MCSFile value);

  /**
   * Returns the value of the '<em><b>Subclause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subclause</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subclause</em>' containment reference.
   * @see #setSubclause(MCSAnnexSubclause)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMCSGrammarRoot_Subclause()
   * @model containment="true"
   * @generated
   */
  MCSAnnexSubclause getSubclause();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.MCSGrammarRoot#getSubclause <em>Subclause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subclause</em>' containment reference.
   * @see #getSubclause()
   * @generated
   */
  void setSubclause(MCSAnnexSubclause value);

} // MCSGrammarRoot
