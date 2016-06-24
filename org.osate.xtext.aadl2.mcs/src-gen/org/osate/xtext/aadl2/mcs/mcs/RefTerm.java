/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.RefTerm#isRoot <em>Root</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.RefTerm#getSub <em>Sub</em>}</li>
 * </ul>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getRefTerm()
 * @model
 * @generated
 */
public interface RefTerm extends EObject
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
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getRefTerm_Root()
   * @model
   * @generated
   */
  boolean isRoot();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.RefTerm#isRoot <em>Root</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Root</em>' attribute.
   * @see #isRoot()
   * @generated
   */
  void setRoot(boolean value);

  /**
   * Returns the value of the '<em><b>Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub</em>' containment reference.
   * @see #setSub(NestedDotID)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getRefTerm_Sub()
   * @model containment="true"
   * @generated
   */
  NestedDotID getSub();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.RefTerm#getSub <em>Sub</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sub</em>' containment reference.
   * @see #getSub()
   * @generated
   */
  void setSub(NestedDotID value);

} // RefTerm
