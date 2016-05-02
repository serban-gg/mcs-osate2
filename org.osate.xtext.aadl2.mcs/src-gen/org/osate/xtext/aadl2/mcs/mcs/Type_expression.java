/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Type_expression#getBasic <em>Basic</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Type_expression#getComposite <em>Composite</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Type_expression#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getType_expression()
 * @model
 * @generated
 */
public interface Type_expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Basic</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Basic</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Basic</em>' containment reference.
   * @see #setBasic(Basic_type)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getType_expression_Basic()
   * @model containment="true"
   * @generated
   */
  Basic_type getBasic();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.Type_expression#getBasic <em>Basic</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Basic</em>' containment reference.
   * @see #getBasic()
   * @generated
   */
  void setBasic(Basic_type value);

  /**
   * Returns the value of the '<em><b>Composite</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Composite</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Composite</em>' containment reference.
   * @see #setComposite(Composite_type)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getType_expression_Composite()
   * @model containment="true"
   * @generated
   */
  Composite_type getComposite();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.Type_expression#getComposite <em>Composite</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Composite</em>' containment reference.
   * @see #getComposite()
   * @generated
   */
  void setComposite(Composite_type value);

  /**
   * Returns the value of the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' containment reference.
   * @see #setElement(Element_type)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getType_expression_Element()
   * @model containment="true"
   * @generated
   */
  Element_type getElement();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.Type_expression#getElement <em>Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' containment reference.
   * @see #getElement()
   * @generated
   */
  void setElement(Element_type value);

} // Type_expression
