/**
 */
package org.osate.xtext.aadl2.mcs.mcs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Set_type#getRoot_type <em>Root type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getSet_type()
 * @model
 * @generated
 */
public interface Set_type extends Composite_type
{
  /**
   * Returns the value of the '<em><b>Root type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Root type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Root type</em>' reference.
   * @see #setRoot_type(Type_expression)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getSet_type_Root_type()
   * @model
   * @generated
   */
  Type_expression getRoot_type();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.Set_type#getRoot_type <em>Root type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Root type</em>' reference.
   * @see #getRoot_type()
   * @generated
   */
  void setRoot_type(Type_expression value);

} // Set_type
