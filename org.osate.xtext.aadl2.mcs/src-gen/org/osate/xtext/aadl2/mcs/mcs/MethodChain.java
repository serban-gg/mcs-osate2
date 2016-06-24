/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Chain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.MethodChain#getBuiltin <em>Builtin</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.MethodChain#getMethod <em>Method</em>}</li>
 * </ul>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMethodChain()
 * @model
 * @generated
 */
public interface MethodChain extends EObject
{
  /**
   * Returns the value of the '<em><b>Builtin</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.xtext.aadl2.mcs.mcs.BuiltInFnCall}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Builtin</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Builtin</em>' containment reference list.
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMethodChain_Builtin()
   * @model containment="true"
   * @generated
   */
  EList<BuiltInFnCall> getBuiltin();

  /**
   * Returns the value of the '<em><b>Method</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.xtext.aadl2.mcs.mcs.FnCall}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method</em>' containment reference list.
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMethodChain_Method()
   * @model containment="true"
   * @generated
   */
  EList<FnCall> getMethod();

} // MethodChain
