/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>function declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.function_declaration#getName <em>Name</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.function_declaration#getArg <em>Arg</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.function_declaration#getOut <em>Out</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.function_declaration#getFtype <em>Ftype</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.function_declaration#getTyperef <em>Typeref</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.function_declaration#getClosure <em>Closure</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.function_declaration#getExp_body <em>Exp body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getfunction_declaration()
 * @model
 * @generated
 */
public interface function_declaration extends EObject
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
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getfunction_declaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.function_declaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Arg</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.xtext.aadl2.mcs.mcs.argument}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arg</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arg</em>' containment reference list.
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getfunction_declaration_Arg()
   * @model containment="true"
   * @generated
   */
  EList<argument> getArg();

  /**
   * Returns the value of the '<em><b>Out</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Out</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Out</em>' containment reference.
   * @see #setOut(type_expression)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getfunction_declaration_Out()
   * @model containment="true"
   * @generated
   */
  type_expression getOut();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.function_declaration#getOut <em>Out</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Out</em>' containment reference.
   * @see #getOut()
   * @generated
   */
  void setOut(type_expression value);

  /**
   * Returns the value of the '<em><b>Ftype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ftype</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ftype</em>' containment reference.
   * @see #setFtype(UnnamedFunctionType)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getfunction_declaration_Ftype()
   * @model containment="true"
   * @generated
   */
  UnnamedFunctionType getFtype();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.function_declaration#getFtype <em>Ftype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ftype</em>' containment reference.
   * @see #getFtype()
   * @generated
   */
  void setFtype(UnnamedFunctionType value);

  /**
   * Returns the value of the '<em><b>Typeref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Typeref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Typeref</em>' reference.
   * @see #setTyperef(type_declaration)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getfunction_declaration_Typeref()
   * @model
   * @generated
   */
  type_declaration getTyperef();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.function_declaration#getTyperef <em>Typeref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Typeref</em>' reference.
   * @see #getTyperef()
   * @generated
   */
  void setTyperef(type_declaration value);

  /**
   * Returns the value of the '<em><b>Closure</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Closure</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Closure</em>' containment reference.
   * @see #setClosure(XExpression)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getfunction_declaration_Closure()
   * @model containment="true"
   * @generated
   */
  XExpression getClosure();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.function_declaration#getClosure <em>Closure</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Closure</em>' containment reference.
   * @see #getClosure()
   * @generated
   */
  void setClosure(XExpression value);

  /**
   * Returns the value of the '<em><b>Exp body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp body</em>' containment reference.
   * @see #setExp_body(XExpression)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getfunction_declaration_Exp_body()
   * @model containment="true"
   * @generated
   */
  XExpression getExp_body();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.function_declaration#getExp_body <em>Exp body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp body</em>' containment reference.
   * @see #getExp_body()
   * @generated
   */
  void setExp_body(XExpression value);

} // function_declaration
