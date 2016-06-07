/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim Text Var</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.ClaimTextVar#isParm <em>Parm</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.ClaimTextVar#isConst <em>Const</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.ClaimTextVar#isLetb <em>Letb</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getClaimTextVar()
 * @model
 * @generated
 */
public interface ClaimTextVar extends EObject
{
  /**
   * Returns the value of the '<em><b>Parm</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parm</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parm</em>' attribute.
   * @see #setParm(boolean)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getClaimTextVar_Parm()
   * @model
   * @generated
   */
  boolean isParm();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.ClaimTextVar#isParm <em>Parm</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parm</em>' attribute.
   * @see #isParm()
   * @generated
   */
  void setParm(boolean value);

  /**
   * Returns the value of the '<em><b>Const</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Const</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Const</em>' attribute.
   * @see #setConst(boolean)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getClaimTextVar_Const()
   * @model
   * @generated
   */
  boolean isConst();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.ClaimTextVar#isConst <em>Const</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Const</em>' attribute.
   * @see #isConst()
   * @generated
   */
  void setConst(boolean value);

  /**
   * Returns the value of the '<em><b>Letb</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Letb</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Letb</em>' attribute.
   * @see #setLetb(boolean)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getClaimTextVar_Letb()
   * @model
   * @generated
   */
  boolean isLetb();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.ClaimTextVar#isLetb <em>Letb</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Letb</em>' attribute.
   * @see #isLetb()
   * @generated
   */
  void setLetb(boolean value);

} // ClaimTextVar
