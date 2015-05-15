/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier Script</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.ClassifierScript#getC_block <em>Cblock</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.ClassifierScript#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getClassifierScript()
 * @model
 * @generated
 */
public interface ClassifierScript extends EObject
{
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
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getClassifierScript_C_block()
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
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getClassifierScript_Ref()
   * @model containment="true"
   * @generated
   */
  ViewpointReference getRef();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.ClassifierScript#getRef <em>Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' containment reference.
   * @see #getRef()
   * @generated
   */
  void setRef(ViewpointReference value);

} // ClassifierScript
