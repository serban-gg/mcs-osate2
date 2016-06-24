/**
 */
package org.osate.xtext.aadl2.mcs.mcs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.McsTypedName#getName <em>Name</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.McsTypedName#getType <em>Type</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.McsTypedName#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMcsTypedName()
 * @model
 * @generated
 */
public interface McsTypedName extends Parameter
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
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMcsTypedName_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.McsTypedName#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Type_expression)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMcsTypedName_Type()
   * @model containment="true"
   * @generated
   */
  Type_expression getType();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.McsTypedName#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Type_expression value);

  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(Expr)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMcsTypedName_Expr()
   * @model containment="true"
   * @generated
   */
  Expr getExpr();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.McsTypedName#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expr value);

} // McsTypedName
