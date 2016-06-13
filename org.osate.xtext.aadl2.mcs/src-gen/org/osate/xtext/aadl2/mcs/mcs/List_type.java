/**
 */
package org.osate.xtext.aadl2.mcs.mcs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.List_type#getRoot_type <em>Root type</em>}</li>
 * </ul>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getList_type()
 * @model
 * @generated
 */
public interface List_type extends Composite_type
{
  /**
   * Returns the value of the '<em><b>Root type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Root type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Root type</em>' containment reference.
   * @see #setRoot_type(Type_expression)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getList_type_Root_type()
   * @model containment="true"
   * @generated
   */
  Type_expression getRoot_type();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.List_type#getRoot_type <em>Root type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Root type</em>' containment reference.
   * @see #getRoot_type()
   * @generated
   */
  void setRoot_type(Type_expression value);

} // List_type
