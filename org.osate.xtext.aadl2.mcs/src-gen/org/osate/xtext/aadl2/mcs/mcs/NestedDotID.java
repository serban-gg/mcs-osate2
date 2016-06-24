/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nested Dot ID</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.NestedDotID#getBase <em>Base</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.NestedDotID#getSub <em>Sub</em>}</li>
 * </ul>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getNestedDotID()
 * @model
 * @generated
 */
public interface NestedDotID extends EObject
{
  /**
   * Returns the value of the '<em><b>Base</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Base</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base</em>' reference.
   * @see #setBase(NamedElement)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getNestedDotID_Base()
   * @model
   * @generated
   */
  NamedElement getBase();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.NestedDotID#getBase <em>Base</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base</em>' reference.
   * @see #getBase()
   * @generated
   */
  void setBase(NamedElement value);

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
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getNestedDotID_Sub()
   * @model containment="true"
   * @generated
   */
  NestedDotID getSub();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.NestedDotID#getSub <em>Sub</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sub</em>' containment reference.
   * @see #getSub()
   * @generated
   */
  void setSub(NestedDotID value);

} // NestedDotID
