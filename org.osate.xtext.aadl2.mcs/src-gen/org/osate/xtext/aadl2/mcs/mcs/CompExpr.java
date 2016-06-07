/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.osate.aadl2.ClassifierValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comp Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.CompExpr#getClassifier <em>Classifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getCompExpr()
 * @model
 * @generated
 */
public interface CompExpr extends Expr
{
  /**
   * Returns the value of the '<em><b>Classifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Classifier</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Classifier</em>' containment reference.
   * @see #setClassifier(ClassifierValue)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getCompExpr_Classifier()
   * @model containment="true"
   * @generated
   */
  ClassifierValue getClassifier();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.CompExpr#getClassifier <em>Classifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Classifier</em>' containment reference.
   * @see #getClassifier()
   * @generated
   */
  void setClassifier(ClassifierValue value);

} // CompExpr
