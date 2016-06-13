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
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.ClaimBody#getString <em>String</em>}</li>
 * </ul>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getClaimBody()
 * @model
 * @generated
 */
public interface ClaimBody extends DefinitionBody
{
  /**
   * Returns the value of the '<em><b>String</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.xtext.aadl2.mcs.mcs.ParameterizedString}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>String</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>String</em>' containment reference list.
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getClaimBody_String()
   * @model containment="true"
   * @generated
   */
  EList<ParameterizedString> getString();

} // ClaimBody
