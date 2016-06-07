/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.ClaimBody#getClaim <em>Claim</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getClaimBody()
 * @model
 * @generated
 */
public interface ClaimBody extends DefinitionBody
{
  /**
   * Returns the value of the '<em><b>Claim</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.xtext.aadl2.mcs.mcs.Parm_string}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Claim</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Claim</em>' containment reference list.
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getClaimBody_Claim()
   * @model containment="true"
   * @generated
   */
  EList<Parm_string> getClaim();

} // ClaimBody
