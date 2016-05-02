/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.xtext.xbase.XCollectionLiteral;
import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.CollectionTerm#getXc <em>Xc</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.CollectionTerm#getQuery_set <em>Query set</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.CollectionTerm#getSet_c <em>Set c</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getCollectionTerm()
 * @model
 * @generated
 */
public interface CollectionTerm extends XExpression
{
  /**
   * Returns the value of the '<em><b>Xc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Xc</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Xc</em>' containment reference.
   * @see #setXc(XCollectionLiteral)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getCollectionTerm_Xc()
   * @model containment="true"
   * @generated
   */
  XCollectionLiteral getXc();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.CollectionTerm#getXc <em>Xc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Xc</em>' containment reference.
   * @see #getXc()
   * @generated
   */
  void setXc(XCollectionLiteral value);

  /**
   * Returns the value of the '<em><b>Query set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Query set</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Query set</em>' containment reference.
   * @see #setQuery_set(Query_element_set)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getCollectionTerm_Query_set()
   * @model containment="true"
   * @generated
   */
  Query_element_set getQuery_set();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.CollectionTerm#getQuery_set <em>Query set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Query set</em>' containment reference.
   * @see #getQuery_set()
   * @generated
   */
  void setQuery_set(Query_element_set value);

  /**
   * Returns the value of the '<em><b>Set c</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Set c</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Set c</em>' containment reference.
   * @see #setSet_c(Set_comprehension)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getCollectionTerm_Set_c()
   * @model containment="true"
   * @generated
   */
  Set_comprehension getSet_c();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.CollectionTerm#getSet_c <em>Set c</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Set c</em>' containment reference.
   * @see #getSet_c()
   * @generated
   */
  void setSet_c(Set_comprehension value);

} // CollectionTerm
