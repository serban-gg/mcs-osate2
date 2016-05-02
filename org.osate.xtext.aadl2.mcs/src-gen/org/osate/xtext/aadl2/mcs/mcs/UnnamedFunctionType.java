/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unnamed Function Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.UnnamedFunctionType#getParm <em>Parm</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.UnnamedFunctionType#isOutspec <em>Outspec</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.UnnamedFunctionType#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getUnnamedFunctionType()
 * @model
 * @generated
 */
public interface UnnamedFunctionType extends EObject
{
  /**
   * Returns the value of the '<em><b>Parm</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.xtext.aadl2.mcs.mcs.Type_expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parm</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parm</em>' containment reference list.
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getUnnamedFunctionType_Parm()
   * @model containment="true"
   * @generated
   */
  EList<Type_expression> getParm();

  /**
   * Returns the value of the '<em><b>Outspec</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Outspec</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outspec</em>' attribute.
   * @see #setOutspec(boolean)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getUnnamedFunctionType_Outspec()
   * @model
   * @generated
   */
  boolean isOutspec();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.UnnamedFunctionType#isOutspec <em>Outspec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Outspec</em>' attribute.
   * @see #isOutspec()
   * @generated
   */
  void setOutspec(boolean value);

  /**
   * Returns the value of the '<em><b>Result</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Result</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Result</em>' containment reference.
   * @see #setResult(Type_expression)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getUnnamedFunctionType_Result()
   * @model containment="true"
   * @generated
   */
  Type_expression getResult();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.UnnamedFunctionType#getResult <em>Result</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Result</em>' containment reference.
   * @see #getResult()
   * @generated
   */
  void setResult(Type_expression value);

} // UnnamedFunctionType
