/**
 */
package org.osate.xtext.aadl2.mcs.mcs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>constant identifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.constant_identifier#getType <em>Type</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.constant_identifier#getLeft_expr <em>Left expr</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.constant_identifier#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getconstant_identifier()
 * @model
 * @generated
 */
public interface constant_identifier extends constant_declaration
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(type_expression)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getconstant_identifier_Type()
   * @model containment="true"
   * @generated
   */
  type_expression getType();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.constant_identifier#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(type_expression value);

  /**
   * Returns the value of the '<em><b>Left expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left expr</em>' containment reference.
   * @see #setLeft_expr(constant_expression)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getconstant_identifier_Left_expr()
   * @model containment="true"
   * @generated
   */
  constant_expression getLeft_expr();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.constant_identifier#getLeft_expr <em>Left expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left expr</em>' containment reference.
   * @see #getLeft_expr()
   * @generated
   */
  void setLeft_expr(constant_expression value);

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
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getconstant_identifier_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.constant_identifier#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // constant_identifier
