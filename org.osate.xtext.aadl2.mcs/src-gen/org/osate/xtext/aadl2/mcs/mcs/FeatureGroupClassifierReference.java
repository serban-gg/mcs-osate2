/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.FeatureGroupType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Group Classifier Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.FeatureGroupClassifierReference#getFg <em>Fg</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getFeatureGroupClassifierReference()
 * @model
 * @generated
 */
public interface FeatureGroupClassifierReference extends EObject
{
  /**
   * Returns the value of the '<em><b>Fg</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fg</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fg</em>' reference.
   * @see #setFg(FeatureGroupType)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getFeatureGroupClassifierReference_Fg()
   * @model
   * @generated
   */
  FeatureGroupType getFg();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.FeatureGroupClassifierReference#getFg <em>Fg</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fg</em>' reference.
   * @see #getFg()
   * @generated
   */
  void setFg(FeatureGroupType value);

} // FeatureGroupClassifierReference
