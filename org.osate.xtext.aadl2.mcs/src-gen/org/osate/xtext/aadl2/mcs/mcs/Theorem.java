/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Theorem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Theorem#getName <em>Name</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Theorem#isT_root <em>Troot</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Theorem#getArgs <em>Args</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Theorem#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getTheorem()
 * @model
 * @generated
 */
public interface Theorem extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getTheorem_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.Theorem#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Troot</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Troot</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Troot</em>' attribute.
   * @see #setT_root(boolean)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getTheorem_T_root()
   * @model
   * @generated
   */
  boolean isT_root();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.Theorem#isT_root <em>Troot</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Troot</em>' attribute.
   * @see #isT_root()
   * @generated
   */
  void setT_root(boolean value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.xtext.aadl2.mcs.mcs.Parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference list.
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getTheorem_Args()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getArgs();

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(TheoremBody)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getTheorem_Body()
   * @model containment="true"
   * @generated
   */
  TheoremBody getBody();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.Theorem#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(TheoremBody value);

} // Theorem
