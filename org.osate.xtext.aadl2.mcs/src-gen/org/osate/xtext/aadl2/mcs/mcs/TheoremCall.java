/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Theorem Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.TheoremCall#getTname <em>Tname</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.TheoremCall#getCroot <em>Croot</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.TheoremCall#getActarg <em>Actarg</em>}</li>
 * </ul>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getTheoremCall()
 * @model
 * @generated
 */
public interface TheoremCall extends EObject
{
  /**
   * Returns the value of the '<em><b>Tname</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tname</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tname</em>' reference.
   * @see #setTname(Theorem)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getTheoremCall_Tname()
   * @model
   * @generated
   */
  Theorem getTname();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.TheoremCall#getTname <em>Tname</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tname</em>' reference.
   * @see #getTname()
   * @generated
   */
  void setTname(Theorem value);

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

} // TheoremCall
