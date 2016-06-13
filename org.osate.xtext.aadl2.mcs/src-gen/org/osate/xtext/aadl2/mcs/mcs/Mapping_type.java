/**
 */
package org.osate.xtext.aadl2.mcs.mcs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Mapping_type#getKey <em>Key</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Mapping_type#getVal <em>Val</em>}</li>
 * </ul>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMapping_type()
 * @model
 * @generated
 */
public interface Mapping_type extends Composite_type
{
  /**
   * Returns the value of the '<em><b>Key</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key</em>' containment reference.
   * @see #setKey(Type_expression)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMapping_type_Key()
   * @model containment="true"
   * @generated
   */
  Type_expression getKey();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.Mapping_type#getKey <em>Key</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key</em>' containment reference.
   * @see #getKey()
   * @generated
   */
  void setKey(Type_expression value);

  /**
   * Returns the value of the '<em><b>Val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Val</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val</em>' containment reference.
   * @see #setVal(Type_expression)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getMapping_type_Val()
   * @model containment="true"
   * @generated
   */
  Type_expression getVal();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.Mapping_type#getVal <em>Val</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val</em>' containment reference.
   * @see #getVal()
   * @generated
   */
  void setVal(Type_expression value);

} // Mapping_type
