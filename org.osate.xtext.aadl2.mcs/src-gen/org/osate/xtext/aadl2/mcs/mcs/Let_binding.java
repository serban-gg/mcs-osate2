/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Let binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Let_binding#getLocal <em>Local</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Let_binding#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getLet_binding()
 * @model
 * @generated
 */
public interface Let_binding extends EObject
{
  /**
   * Returns the value of the '<em><b>Local</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Local</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Local</em>' containment reference.
   * @see #setLocal(McsTypedName)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getLet_binding_Local()
   * @model containment="true"
   * @generated
   */
  McsTypedName getLocal();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.Let_binding#getLocal <em>Local</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Local</em>' containment reference.
   * @see #getLocal()
   * @generated
   */
  void setLocal(McsTypedName value);

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
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getLet_binding_Expr()
   * @model containment="true"
   * @generated
   */
  Expr getExpr();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.Let_binding#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expr value);

} // Let_binding
