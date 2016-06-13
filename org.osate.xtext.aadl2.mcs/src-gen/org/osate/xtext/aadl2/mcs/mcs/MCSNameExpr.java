/**
 */
package org.osate.xtext.aadl2.mcs.mcs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MCS Name Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.MCSNameExpr#isRoot <em>Root</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.MCSNameExpr#isIroot <em>Iroot</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.MCSNameExpr#isNil <em>Nil</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.MCSNameExpr#isEmpty <em>Empty</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.MCSNameExpr#isAllmodes <em>Allmodes</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.MCSNameExpr#getTypednameref <em>Typednameref</em>}</li>
 * </ul>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMCSNameExpr()
 * @model
 * @generated
 */
public interface MCSNameExpr extends Expr
{
  /**
   * Returns the value of the '<em><b>Root</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Root</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Root</em>' attribute.
   * @see #setRoot(boolean)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMCSNameExpr_Root()
   * @model
   * @generated
   */
  boolean isRoot();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.MCSNameExpr#isRoot <em>Root</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Root</em>' attribute.
   * @see #isRoot()
   * @generated
   */
  void setRoot(boolean value);

  /**
   * Returns the value of the '<em><b>Iroot</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Iroot</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Iroot</em>' attribute.
   * @see #setIroot(boolean)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMCSNameExpr_Iroot()
   * @model
   * @generated
   */
  boolean isIroot();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.MCSNameExpr#isIroot <em>Iroot</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Iroot</em>' attribute.
   * @see #isIroot()
   * @generated
   */
  void setIroot(boolean value);

  /**
   * Returns the value of the '<em><b>Nil</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nil</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nil</em>' attribute.
   * @see #setNil(boolean)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMCSNameExpr_Nil()
   * @model
   * @generated
   */
  boolean isNil();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.MCSNameExpr#isNil <em>Nil</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nil</em>' attribute.
   * @see #isNil()
   * @generated
   */
  void setNil(boolean value);

  /**
   * Returns the value of the '<em><b>Empty</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Empty</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Empty</em>' attribute.
   * @see #setEmpty(boolean)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMCSNameExpr_Empty()
   * @model
   * @generated
   */
  boolean isEmpty();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.MCSNameExpr#isEmpty <em>Empty</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Empty</em>' attribute.
   * @see #isEmpty()
   * @generated
   */
  void setEmpty(boolean value);

  /**
   * Returns the value of the '<em><b>Allmodes</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Allmodes</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Allmodes</em>' attribute.
   * @see #setAllmodes(boolean)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMCSNameExpr_Allmodes()
   * @model
   * @generated
   */
  boolean isAllmodes();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.MCSNameExpr#isAllmodes <em>Allmodes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Allmodes</em>' attribute.
   * @see #isAllmodes()
   * @generated
   */
  void setAllmodes(boolean value);

  /**
   * Returns the value of the '<em><b>Typednameref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Typednameref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Typednameref</em>' containment reference.
   * @see #setTypednameref(Mcs_name_ref)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMCSNameExpr_Typednameref()
   * @model containment="true"
   * @generated
   */
  Mcs_name_ref getTypednameref();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.MCSNameExpr#getTypednameref <em>Typednameref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Typednameref</em>' containment reference.
   * @see #getTypednameref()
   * @generated
   */
  void setTypednameref(Mcs_name_ref value);

} // MCSNameExpr
