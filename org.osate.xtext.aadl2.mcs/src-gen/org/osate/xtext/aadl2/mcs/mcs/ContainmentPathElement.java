/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Containment Path Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.ContainmentPathElement#getNamedElement <em>Named Element</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.ContainmentPathElement#getArrayRange <em>Array Range</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.ContainmentPathElement#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getContainmentPathElement()
 * @model
 * @generated
 */
public interface ContainmentPathElement extends EObject
{
  /**
   * Returns the value of the '<em><b>Named Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Named Element</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Named Element</em>' reference.
   * @see #setNamedElement(NamedElement)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getContainmentPathElement_NamedElement()
   * @model
   * @generated
   */
  NamedElement getNamedElement();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.ContainmentPathElement#getNamedElement <em>Named Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Named Element</em>' reference.
   * @see #getNamedElement()
   * @generated
   */
  void setNamedElement(NamedElement value);

  /**
   * Returns the value of the '<em><b>Array Range</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.xtext.aadl2.mcs.mcs.ArrayRange}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Array Range</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array Range</em>' containment reference list.
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getContainmentPathElement_ArrayRange()
   * @model containment="true"
   * @generated
   */
  EList<ArrayRange> getArrayRange();

  /**
   * Returns the value of the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' containment reference.
   * @see #setPath(ContainmentPathElement)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getContainmentPathElement_Path()
   * @model containment="true"
   * @generated
   */
  ContainmentPathElement getPath();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.ContainmentPathElement#getPath <em>Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' containment reference.
   * @see #getPath()
   * @generated
   */
  void setPath(ContainmentPathElement value);

} // ContainmentPathElement
