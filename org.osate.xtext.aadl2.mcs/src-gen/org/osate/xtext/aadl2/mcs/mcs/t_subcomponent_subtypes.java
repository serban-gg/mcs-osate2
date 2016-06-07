/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>tsubcomponent subtypes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.t_subcomponent_subtypes#isT_sub <em>Tsub</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.t_subcomponent_subtypes#isT_cimpl_st <em>Tcimpl st</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#gett_subcomponent_subtypes()
 * @model
 * @generated
 */
public interface t_subcomponent_subtypes extends EObject
{
  /**
   * Returns the value of the '<em><b>Tsub</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tsub</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tsub</em>' attribute.
   * @see #setT_sub(boolean)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#gett_subcomponent_subtypes_T_sub()
   * @model
   * @generated
   */
  boolean isT_sub();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.t_subcomponent_subtypes#isT_sub <em>Tsub</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tsub</em>' attribute.
   * @see #isT_sub()
   * @generated
   */
  void setT_sub(boolean value);

  /**
   * Returns the value of the '<em><b>Tcimpl st</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tcimpl st</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tcimpl st</em>' attribute.
   * @see #setT_cimpl_st(boolean)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#gett_subcomponent_subtypes_T_cimpl_st()
   * @model
   * @generated
   */
  boolean isT_cimpl_st();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.t_subcomponent_subtypes#isT_cimpl_st <em>Tcimpl st</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tcimpl st</em>' attribute.
   * @see #isT_cimpl_st()
   * @generated
   */
  void setT_cimpl_st(boolean value);

} // t_subcomponent_subtypes
