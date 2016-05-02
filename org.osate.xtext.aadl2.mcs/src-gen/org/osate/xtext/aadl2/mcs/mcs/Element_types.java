/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element types</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Element_types#getEl_type <em>El type</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Element_types#getEl_types <em>El types</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getElement_types()
 * @model
 * @generated
 */
public interface Element_types extends EObject
{
  /**
   * Returns the value of the '<em><b>El type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>El type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>El type</em>' containment reference.
   * @see #setEl_type(Element_type)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getElement_types_El_type()
   * @model containment="true"
   * @generated
   */
  Element_type getEl_type();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.Element_types#getEl_type <em>El type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>El type</em>' containment reference.
   * @see #getEl_type()
   * @generated
   */
  void setEl_type(Element_type value);

  /**
   * Returns the value of the '<em><b>El types</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.xtext.aadl2.mcs.mcs.Element_type}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>El types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>El types</em>' containment reference list.
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getElement_types_El_types()
   * @model containment="true"
   * @generated
   */
  EList<Element_type> getEl_types();

} // Element_types
