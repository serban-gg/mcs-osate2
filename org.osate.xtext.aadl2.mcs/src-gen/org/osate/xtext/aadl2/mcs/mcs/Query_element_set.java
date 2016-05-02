/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query element set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Query_element_set#isDirect <em>Direct</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Query_element_set#getResult_types <em>Result types</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Query_element_set#getElem_set <em>Elem set</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Query_element_set#isMode_spec <em>Mode spec</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getQuery_element_set()
 * @model
 * @generated
 */
public interface Query_element_set extends EObject
{
  /**
   * Returns the value of the '<em><b>Direct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Direct</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Direct</em>' attribute.
   * @see #setDirect(boolean)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getQuery_element_set_Direct()
   * @model
   * @generated
   */
  boolean isDirect();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.Query_element_set#isDirect <em>Direct</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Direct</em>' attribute.
   * @see #isDirect()
   * @generated
   */
  void setDirect(boolean value);

  /**
   * Returns the value of the '<em><b>Result types</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.xtext.aadl2.mcs.mcs.Element_types}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Result types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Result types</em>' containment reference list.
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getQuery_element_set_Result_types()
   * @model containment="true"
   * @generated
   */
  EList<Element_types> getResult_types();

  /**
   * Returns the value of the '<em><b>Elem set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elem set</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elem set</em>' containment reference.
   * @see #setElem_set(expression)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getQuery_element_set_Elem_set()
   * @model containment="true"
   * @generated
   */
  expression getElem_set();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.Query_element_set#getElem_set <em>Elem set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elem set</em>' containment reference.
   * @see #getElem_set()
   * @generated
   */
  void setElem_set(expression value);

  /**
   * Returns the value of the '<em><b>Mode spec</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mode spec</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mode spec</em>' attribute.
   * @see #setMode_spec(boolean)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getQuery_element_set_Mode_spec()
   * @model
   * @generated
   */
  boolean isMode_spec();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.Query_element_set#isMode_spec <em>Mode spec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mode spec</em>' attribute.
   * @see #isMode_spec()
   * @generated
   */
  void setMode_spec(boolean value);

} // Query_element_set
