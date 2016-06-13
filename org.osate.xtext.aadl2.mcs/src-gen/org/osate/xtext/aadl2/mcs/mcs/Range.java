/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.osate.aadl2.NumericRange;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Range#getVal <em>Val</em>}</li>
 * </ul>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getRange()
 * @model
 * @generated
 */
public interface Range extends Expr
{
  /**
   * Returns the value of the '<em><b>Val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Val</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val</em>' containment reference.
   * @see #setVal(NumericRange)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getRange_Val()
   * @model containment="true"
   * @generated
   */
  NumericRange getVal();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.Range#getVal <em>Val</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val</em>' containment reference.
   * @see #getVal()
   * @generated
   */
  void setVal(NumericRange value);

} // Range
