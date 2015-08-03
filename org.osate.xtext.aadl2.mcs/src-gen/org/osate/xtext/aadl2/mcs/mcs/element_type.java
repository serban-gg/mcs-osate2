/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>element type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.element_type#isTelem <em>Telem</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.element_type#isT_class <em>Tclass</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.element_type#isT_ref <em>Tref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getelement_type()
 * @model
 * @generated
 */
public interface element_type extends EObject
{
  /**
   * Returns the value of the '<em><b>Telem</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Telem</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Telem</em>' attribute.
   * @see #setTelem(boolean)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getelement_type_Telem()
   * @model
   * @generated
   */
  boolean isTelem();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.element_type#isTelem <em>Telem</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Telem</em>' attribute.
   * @see #isTelem()
   * @generated
   */
  void setTelem(boolean value);

  /**
   * Returns the value of the '<em><b>Tclass</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tclass</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tclass</em>' attribute.
   * @see #setT_class(boolean)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getelement_type_T_class()
   * @model
   * @generated
   */
  boolean isT_class();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.element_type#isT_class <em>Tclass</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tclass</em>' attribute.
   * @see #isT_class()
   * @generated
   */
  void setT_class(boolean value);

  /**
   * Returns the value of the '<em><b>Tref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tref</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tref</em>' attribute.
   * @see #setT_ref(boolean)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getelement_type_T_ref()
   * @model
   * @generated
   */
  boolean isT_ref();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.element_type#isT_ref <em>Tref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tref</em>' attribute.
   * @see #isT_ref()
   * @generated
   */
  void setT_ref(boolean value);

} // element_type
