/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.AadlBoolean;
import org.osate.aadl2.AadlInteger;
import org.osate.aadl2.AadlReal;
import org.osate.aadl2.AadlString;
import org.osate.aadl2.ClassifierType;
import org.osate.aadl2.EnumerationType;
import org.osate.aadl2.RangeType;
import org.osate.aadl2.ReferenceType;
import org.osate.aadl2.UnitsType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>basic type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.basic_type#getBool <em>Bool</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.basic_type#getString <em>String</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.basic_type#getEnumer <em>Enumer</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.basic_type#getUnits <em>Units</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.basic_type#getInteger <em>Integer</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.basic_type#getReal <em>Real</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.basic_type#getRange <em>Range</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.basic_type#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.basic_type#getRef <em>Ref</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.basic_type#getFunc <em>Func</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.basic_type#getTypename <em>Typename</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getbasic_type()
 * @model
 * @generated
 */
public interface basic_type extends EObject
{
  /**
   * Returns the value of the '<em><b>Bool</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bool</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bool</em>' containment reference.
   * @see #setBool(AadlBoolean)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getbasic_type_Bool()
   * @model containment="true"
   * @generated
   */
  AadlBoolean getBool();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.basic_type#getBool <em>Bool</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bool</em>' containment reference.
   * @see #getBool()
   * @generated
   */
  void setBool(AadlBoolean value);

  /**
   * Returns the value of the '<em><b>String</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>String</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>String</em>' containment reference.
   * @see #setString(AadlString)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getbasic_type_String()
   * @model containment="true"
   * @generated
   */
  AadlString getString();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.basic_type#getString <em>String</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String</em>' containment reference.
   * @see #getString()
   * @generated
   */
  void setString(AadlString value);

  /**
   * Returns the value of the '<em><b>Enumer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enumer</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enumer</em>' containment reference.
   * @see #setEnumer(EnumerationType)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getbasic_type_Enumer()
   * @model containment="true"
   * @generated
   */
  EnumerationType getEnumer();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.basic_type#getEnumer <em>Enumer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enumer</em>' containment reference.
   * @see #getEnumer()
   * @generated
   */
  void setEnumer(EnumerationType value);

  /**
   * Returns the value of the '<em><b>Units</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Units</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Units</em>' containment reference.
   * @see #setUnits(UnitsType)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getbasic_type_Units()
   * @model containment="true"
   * @generated
   */
  UnitsType getUnits();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.basic_type#getUnits <em>Units</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Units</em>' containment reference.
   * @see #getUnits()
   * @generated
   */
  void setUnits(UnitsType value);

  /**
   * Returns the value of the '<em><b>Integer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Integer</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Integer</em>' containment reference.
   * @see #setInteger(AadlInteger)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getbasic_type_Integer()
   * @model containment="true"
   * @generated
   */
  AadlInteger getInteger();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.basic_type#getInteger <em>Integer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Integer</em>' containment reference.
   * @see #getInteger()
   * @generated
   */
  void setInteger(AadlInteger value);

  /**
   * Returns the value of the '<em><b>Real</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Real</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Real</em>' containment reference.
   * @see #setReal(AadlReal)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getbasic_type_Real()
   * @model containment="true"
   * @generated
   */
  AadlReal getReal();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.basic_type#getReal <em>Real</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Real</em>' containment reference.
   * @see #getReal()
   * @generated
   */
  void setReal(AadlReal value);

  /**
   * Returns the value of the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Range</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Range</em>' containment reference.
   * @see #setRange(RangeType)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getbasic_type_Range()
   * @model containment="true"
   * @generated
   */
  RangeType getRange();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.basic_type#getRange <em>Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Range</em>' containment reference.
   * @see #getRange()
   * @generated
   */
  void setRange(RangeType value);

  /**
   * Returns the value of the '<em><b>Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class</em>' containment reference.
   * @see #setClass(ClassifierType)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getbasic_type_Class()
   * @model containment="true"
   * @generated
   */
  ClassifierType getClass_();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.basic_type#getClass_ <em>Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class</em>' containment reference.
   * @see #getClass_()
   * @generated
   */
  void setClass(ClassifierType value);

  /**
   * Returns the value of the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' containment reference.
   * @see #setRef(ReferenceType)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getbasic_type_Ref()
   * @model containment="true"
   * @generated
   */
  ReferenceType getRef();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.basic_type#getRef <em>Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' containment reference.
   * @see #getRef()
   * @generated
   */
  void setRef(ReferenceType value);

  /**
   * Returns the value of the '<em><b>Func</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Func</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Func</em>' containment reference.
   * @see #setFunc(UnnamedFunctionType)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getbasic_type_Func()
   * @model containment="true"
   * @generated
   */
  UnnamedFunctionType getFunc();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.basic_type#getFunc <em>Func</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Func</em>' containment reference.
   * @see #getFunc()
   * @generated
   */
  void setFunc(UnnamedFunctionType value);

  /**
   * Returns the value of the '<em><b>Typename</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Typename</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Typename</em>' reference.
   * @see #setTypename(type_declaration)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getbasic_type_Typename()
   * @model
   * @generated
   */
  type_declaration getTypename();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.basic_type#getTypename <em>Typename</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Typename</em>' reference.
   * @see #getTypename()
   * @generated
   */
  void setTypename(type_declaration value);

} // basic_type
