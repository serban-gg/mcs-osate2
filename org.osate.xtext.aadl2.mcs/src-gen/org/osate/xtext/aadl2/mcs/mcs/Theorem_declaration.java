/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Theorem declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Theorem_declaration#getName <em>Name</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Theorem_declaration#isMl <em>Ml</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Theorem_declaration#getLocals <em>Locals</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Theorem_declaration#getStatements <em>Statements</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Theorem_declaration#getEndname <em>Endname</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getTheorem_declaration()
 * @model
 * @generated
 */
public interface Theorem_declaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getTheorem_declaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.Theorem_declaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Ml</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ml</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ml</em>' attribute.
   * @see #setMl(boolean)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getTheorem_declaration_Ml()
   * @model
   * @generated
   */
  boolean isMl();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.Theorem_declaration#isMl <em>Ml</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ml</em>' attribute.
   * @see #isMl()
   * @generated
   */
  void setMl(boolean value);

  /**
   * Returns the value of the '<em><b>Locals</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.xtext.aadl2.mcs.mcs.Local_declaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Locals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Locals</em>' containment reference list.
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getTheorem_declaration_Locals()
   * @model containment="true"
   * @generated
   */
  EList<Local_declaration> getLocals();

  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.xtext.aadl2.mcs.mcs.Theorem_statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getTheorem_declaration_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Theorem_statement> getStatements();

  /**
   * Returns the value of the '<em><b>Endname</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Endname</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Endname</em>' reference.
   * @see #setEndname(Theorem_declaration)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getTheorem_declaration_Endname()
   * @model
   * @generated
   */
  Theorem_declaration getEndname();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.Theorem_declaration#getEndname <em>Endname</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Endname</em>' reference.
   * @see #getEndname()
   * @generated
   */
  void setEndname(Theorem_declaration value);

} // Theorem_declaration
