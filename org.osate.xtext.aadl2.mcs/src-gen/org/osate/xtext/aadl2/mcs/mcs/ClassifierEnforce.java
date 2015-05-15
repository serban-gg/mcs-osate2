/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier Enforce</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.ClassifierEnforce#getViewpoint <em>Viewpoint</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.ClassifierEnforce#getScript <em>Script</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getClassifierEnforce()
 * @model
 * @generated
 */
public interface ClassifierEnforce extends EObject
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
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getClassifierEnforce_Viewpoint()
   * @model
   * @generated
   */
  MCSViewpoint getViewpoint();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.ClassifierEnforce#getViewpoint <em>Viewpoint</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Viewpoint</em>' reference.
   * @see #getViewpoint()
   * @generated
   */
  void setViewpoint(MCSViewpoint value);

  /**
   * Returns the value of the '<em><b>Script</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Script</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Script</em>' containment reference.
   * @see #setScript(ClassifierScript)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getClassifierEnforce_Script()
   * @model containment="true"
   * @generated
   */
  ClassifierScript getScript();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.ClassifierEnforce#getScript <em>Script</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Script</em>' containment reference.
   * @see #getScript()
   * @generated
   */
  void setScript(ClassifierScript value);

} // ClassifierEnforce
