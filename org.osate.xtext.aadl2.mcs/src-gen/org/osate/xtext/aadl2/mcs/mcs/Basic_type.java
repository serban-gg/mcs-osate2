/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.AadlBoolean;
import org.osate.aadl2.AadlString;
import org.osate.aadl2.EnumerationType;
import org.osate.aadl2.UnitsType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Basic_type#getPtype <em>Ptype</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Basic_type#getPref <em>Pref</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Basic_type#getBool <em>Bool</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Basic_type#getString <em>String</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Basic_type#getEnumer <em>Enumer</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Basic_type#getUnits <em>Units</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Basic_type#getInteger <em>Integer</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Basic_type#getReal <em>Real</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Basic_type#getRange <em>Range</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.Basic_type#getTypename <em>Typename</em>}</li>
 * </ul>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getBasic_type()
 * @model
 * @generated
 */
public interface Basic_type extends EObject
{
  /**
   * Returns the value of the '<em><b>Ptype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ptype</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ptype</em>' attribute.
   * @see #setPtype(String)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getBasic_type_Ptype()
   * @model
   * @generated
   */
  String getPtype();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.Basic_type#getPtype <em>Ptype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ptype</em>' attribute.
   * @see #getPtype()
   * @generated
   */
  void setPtype(String value);

  /**
   * Returns the value of the '<em><b>Pref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pref</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pref</em>' attribute.
   * @see #setPref(String)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getBasic_type_Pref()
   * @model
   * @generated
   */
  String getPref();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.Basic_type#getPref <em>Pref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pref</em>' attribute.
   * @see #getPref()
   * @generated
   */
  void setPref(String value);

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
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getBasic_type_Bool()
   * @model containment="true"
   * @generated
   */
  AadlBoolean getBool();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.Basic_type#getBool <em>Bool</em>}' containment reference.
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
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getBasic_type_String()
   * @model containment="true"
   * @generated
   */
  AadlString getString();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.Basic_type#getString <em>String</em>}' containment reference.
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
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getBasic_type_Enumer()
   * @model containment="true"
   * @generated
   */
  EnumerationType getEnumer();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.Basic_type#getEnumer <em>Enumer</em>}' containment reference.
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
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getBasic_type_Units()
   * @model containment="true"
   * @generated
   */
  UnitsType getUnits();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.Basic_type#getUnits <em>Units</em>}' containment reference.
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
   * @see #setInteger(UnnamedIntegerType)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getBasic_type_Integer()
   * @model containment="true"
   * @generated
   */
  UnnamedIntegerType getInteger();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.Basic_type#getInteger <em>Integer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Integer</em>' containment reference.
   * @see #getInteger()
   * @generated
   */
  void setInteger(UnnamedIntegerType value);

  /**
   * Returns the value of the '<em><b>Real</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Real</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Real</em>' containment reference.
   * @see #setReal(UnnamedRealType)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getBasic_type_Real()
   * @model containment="true"
   * @generated
   */
  UnnamedRealType getReal();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.Basic_type#getReal <em>Real</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Real</em>' containment reference.
   * @see #getReal()
   * @generated
   */
  void setReal(UnnamedRealType value);

  /**
   * Returns the value of the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Range</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Range</em>' containment reference.
   * @see #setRange(UnnamedRangeType)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getBasic_type_Range()
   * @model containment="true"
   * @generated
   */
  UnnamedRangeType getRange();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.Basic_type#getRange <em>Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Range</em>' containment reference.
   * @see #getRange()
   * @generated
   */
  void setRange(UnnamedRangeType value);

  /**
   * Returns the value of the '<em><b>Typename</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Typename</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Typename</em>' reference.
   * @see #setTypename(Type_declaration)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getBasic_type_Typename()
   * @model
   * @generated
   */
  Type_declaration getTypename();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.Basic_type#getTypename <em>Typename</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Typename</em>' reference.
   * @see #getTypename()
   * @generated
   */
  void setTypename(Type_declaration value);

} // Basic_type
