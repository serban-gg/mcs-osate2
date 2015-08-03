/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtext.xbase.XExpression;

import org.osate.aadl2.Classifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>element reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.element_reference#isSelf <em>Self</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.element_reference#isRoot <em>Root</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.element_reference#isCurrentmode <em>Currentmode</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.element_reference#getCref <em>Cref</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.element_reference#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.element_reference#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getelement_reference()
 * @model
 * @generated
 */
public interface element_reference extends root_element, XExpression
{
  /**
   * Returns the value of the '<em><b>Self</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Self</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Self</em>' attribute.
   * @see #setSelf(boolean)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getelement_reference_Self()
   * @model
   * @generated
   */
  boolean isSelf();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.element_reference#isSelf <em>Self</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Self</em>' attribute.
   * @see #isSelf()
   * @generated
   */
  void setSelf(boolean value);

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
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getelement_reference_Root()
   * @model
   * @generated
   */
  boolean isRoot();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.element_reference#isRoot <em>Root</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Root</em>' attribute.
   * @see #isRoot()
   * @generated
   */
  void setRoot(boolean value);

  /**
   * Returns the value of the '<em><b>Currentmode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Currentmode</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Currentmode</em>' attribute.
   * @see #setCurrentmode(boolean)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getelement_reference_Currentmode()
   * @model
   * @generated
   */
  boolean isCurrentmode();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.element_reference#isCurrentmode <em>Currentmode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Currentmode</em>' attribute.
   * @see #isCurrentmode()
   * @generated
   */
  void setCurrentmode(boolean value);

  /**
   * Returns the value of the '<em><b>Cref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cref</em>' reference.
   * @see #setCref(Classifier)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getelement_reference_Cref()
   * @model
   * @generated
   */
  Classifier getCref();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.element_reference#getCref <em>Cref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cref</em>' reference.
   * @see #getCref()
   * @generated
   */
  void setCref(Classifier value);

  /**
   * Returns the value of the '<em><b>Package Name</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package Name</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package Name</em>' attribute list.
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getelement_reference_PackageName()
   * @model unique="false"
   * @generated
   */
  EList<String> getPackageName();

  /**
   * Returns the value of the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' containment reference.
   * @see #setRef(ContainmentPathElement)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getelement_reference_Ref()
   * @model containment="true"
   * @generated
   */
  ContainmentPathElement getRef();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.element_reference#getRef <em>Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' containment reference.
   * @see #getRef()
   * @generated
   */
  void setRef(ContainmentPathElement value);

} // element_reference
