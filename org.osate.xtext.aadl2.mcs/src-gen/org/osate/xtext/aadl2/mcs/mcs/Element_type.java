/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Element_type#isTelem <em>Telem</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Element_type#isTpack <em>Tpack</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Element_type#isT_class <em>Tclass</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Element_type#isT_inst <em>Tinst</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getElement_type()
 * @model
 * @generated
 */
public interface Element_type extends EObject
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
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getElement_type_Telem()
   * @model
   * @generated
   */
  boolean isTelem();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.Element_type#isTelem <em>Telem</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Telem</em>' attribute.
   * @see #isTelem()
   * @generated
   */
  void setTelem(boolean value);

  /**
   * Returns the value of the '<em><b>Tpack</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tpack</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tpack</em>' attribute.
   * @see #setTpack(boolean)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getElement_type_Tpack()
   * @model
   * @generated
   */
  boolean isTpack();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.Element_type#isTpack <em>Tpack</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tpack</em>' attribute.
   * @see #isTpack()
   * @generated
   */
  void setTpack(boolean value);

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
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getElement_type_T_class()
   * @model
   * @generated
   */
  boolean isT_class();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.Element_type#isT_class <em>Tclass</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tclass</em>' attribute.
   * @see #isT_class()
   * @generated
   */
  void setT_class(boolean value);

  /**
   * Returns the value of the '<em><b>Tinst</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tinst</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tinst</em>' attribute.
   * @see #setT_inst(boolean)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getElement_type_T_inst()
   * @model
   * @generated
   */
  boolean isT_inst();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.Element_type#isT_inst <em>Tinst</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tinst</em>' attribute.
   * @see #isT_inst()
   * @generated
   */
  void setT_inst(boolean value);

} // Element_type
