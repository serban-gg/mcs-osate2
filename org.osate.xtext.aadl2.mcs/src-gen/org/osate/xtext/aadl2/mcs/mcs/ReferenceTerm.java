/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.ReferenceValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.ReferenceTerm#isRoot <em>Root</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getReferenceTerm()
 * @model
 * @generated
 */
public interface ReferenceTerm extends EObject, ReferenceValue
{
  /**
   * Returns the value of the '<em><b>Root</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Root</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Root</em>' attribute.
   * @see #setRoot(boolean)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getReferenceTerm_Root()
   * @model
   * @generated
   */
  boolean isRoot();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.ReferenceTerm#isRoot <em>Root</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Root</em>' attribute.
   * @see #isRoot()
   * @generated
   */
  void setRoot(boolean value);

} // ReferenceTerm
