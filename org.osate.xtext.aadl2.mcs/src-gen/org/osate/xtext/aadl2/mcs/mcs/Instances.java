/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instances</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Instances#isInst <em>Inst</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Instances#isT_inst_st <em>Tinst st</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getInstances()
 * @model
 * @generated
 */
public interface Instances extends EObject
{
  /**
   * Returns the value of the '<em><b>Inst</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inst</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inst</em>' attribute.
   * @see #setInst(boolean)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getInstances_Inst()
   * @model
   * @generated
   */
  boolean isInst();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.Instances#isInst <em>Inst</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inst</em>' attribute.
   * @see #isInst()
   * @generated
   */
  void setInst(boolean value);

  /**
   * Returns the value of the '<em><b>Tinst st</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tinst st</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tinst st</em>' attribute.
   * @see #setT_inst_st(boolean)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getInstances_T_inst_st()
   * @model
   * @generated
   */
  boolean isT_inst_st();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.Instances#isT_inst_st <em>Tinst st</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tinst st</em>' attribute.
   * @see #isT_inst_st()
   * @generated
   */
  void setT_inst_st(boolean value);

} // Instances
