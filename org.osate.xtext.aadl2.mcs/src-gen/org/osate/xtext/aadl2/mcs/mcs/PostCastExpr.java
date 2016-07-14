/**
 */
package org.osate.xtext.aadl2.mcs.mcs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Post Cast Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.PostCastExpr#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.PostCastExpr#getNewtype <em>Newtype</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.PostCastExpr#getChain <em>Chain</em>}</li>
 * </ul>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getPostCastExpr()
 * @model
 * @generated
 */
public interface PostCastExpr extends Expr
{
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
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getPostCastExpr_Expr()
   * @model containment="true"
   * @generated
   */
  Expr getExpr();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.PostCastExpr#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expr value);

  /**
   * Returns the value of the '<em><b>Newtype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Newtype</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Newtype</em>' containment reference.
   * @see #setNewtype(Type_expression)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getPostCastExpr_Newtype()
   * @model containment="true"
   * @generated
   */
  Type_expression getNewtype();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.PostCastExpr#getNewtype <em>Newtype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Newtype</em>' containment reference.
   * @see #getNewtype()
   * @generated
   */
  void setNewtype(Type_expression value);

  /**
   * Returns the value of the '<em><b>Chain</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Chain</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Chain</em>' containment reference.
   * @see #setChain(MethodChain)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getPostCastExpr_Chain()
   * @model containment="true"
   * @generated
   */
  MethodChain getChain();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.PostCastExpr#getChain <em>Chain</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Chain</em>' containment reference.
   * @see #getChain()
   * @generated
   */
  void setChain(MethodChain value);

} // PostCastExpr
