/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Applies To Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.AppliesToClause#isAll <em>All</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.AppliesToClause#getCategory <em>Category</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getAppliesToClause()
 * @model
 * @generated
 */
public interface AppliesToClause extends EObject
{
  /**
   * Returns the value of the '<em><b>All</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>All</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>All</em>' attribute.
   * @see #setAll(boolean)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getAppliesToClause_All()
   * @model
   * @generated
   */
  boolean isAll();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.AppliesToClause#isAll <em>All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>All</em>' attribute.
   * @see #isAll()
   * @generated
   */
  void setAll(boolean value);

  /**
   * Returns the value of the '<em><b>Category</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.xtext.aadl2.mcs.mcs.ClassifierCategory}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Category</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Category</em>' containment reference list.
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getAppliesToClause_Category()
   * @model containment="true"
   * @generated
   */
  EList<ClassifierCategory> getCategory();

} // AppliesToClause
