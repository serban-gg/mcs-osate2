/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Theorem Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.TheoremCall#getName <em>Name</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.TheoremCall#getCroot <em>Croot</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.TheoremCall#getActarg <em>Actarg</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.TheoremCall#getFn <em>Fn</em>}</li>
 * </ul>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getTheoremCall()
 * @model
 * @generated
 */
public interface TheoremCall extends Expr
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' reference.
   * @see #setName(F_or_T)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getTheoremCall_Name()
   * @model
   * @generated
   */
  F_or_T getName();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.TheoremCall#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(F_or_T value);

  /**
   * Returns the value of the '<em><b>Croot</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Croot</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Croot</em>' containment reference.
   * @see #setCroot(Classifier_literal)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getTheoremCall_Croot()
   * @model containment="true"
   * @generated
   */
  Classifier_literal getCroot();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.TheoremCall#getCroot <em>Croot</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Croot</em>' containment reference.
   * @see #getCroot()
   * @generated
   */
  void setCroot(Classifier_literal value);

  /**
   * Returns the value of the '<em><b>Actarg</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.xtext.aadl2.mcs.mcs.Expr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actarg</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actarg</em>' containment reference list.
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getTheoremCall_Actarg()
   * @model containment="true"
   * @generated
   */
  EList<Expr> getActarg();

  /**
   * Returns the value of the '<em><b>Fn</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fn</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fn</em>' containment reference.
   * @see #setFn(TheoremCall)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getTheoremCall_Fn()
   * @model containment="true"
   * @generated
   */
  TheoremCall getFn();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.TheoremCall#getFn <em>Fn</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fn</em>' containment reference.
   * @see #getFn()
   * @generated
   */
  void setFn(TheoremCall value);

} // TheoremCall
