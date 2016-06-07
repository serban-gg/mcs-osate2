/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.osate.aadl2.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Built Property Exists</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.BuiltPropertyExists#getProperty <em>Property</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.BuiltPropertyExists#getModeset <em>Modeset</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.BuiltPropertyExists#getInbind <em>Inbind</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getBuiltPropertyExists()
 * @model
 * @generated
 */
public interface BuiltPropertyExists extends Expr
{
  /**
   * Returns the value of the '<em><b>Property</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' reference.
   * @see #setProperty(Property)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getBuiltPropertyExists_Property()
   * @model
   * @generated
   */
  Property getProperty();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.BuiltPropertyExists#getProperty <em>Property</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property</em>' reference.
   * @see #getProperty()
   * @generated
   */
  void setProperty(Property value);

  /**
   * Returns the value of the '<em><b>Modeset</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modeset</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modeset</em>' containment reference.
   * @see #setModeset(Expr)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getBuiltPropertyExists_Modeset()
   * @model containment="true"
   * @generated
   */
  Expr getModeset();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.BuiltPropertyExists#getModeset <em>Modeset</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modeset</em>' containment reference.
   * @see #getModeset()
   * @generated
   */
  void setModeset(Expr value);

  /**
   * Returns the value of the '<em><b>Inbind</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inbind</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inbind</em>' containment reference.
   * @see #setInbind(Expr)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getBuiltPropertyExists_Inbind()
   * @model containment="true"
   * @generated
   */
  Expr getInbind();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.BuiltPropertyExists#getInbind <em>Inbind</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inbind</em>' containment reference.
   * @see #getInbind()
   * @generated
   */
  void setInbind(Expr value);

} // BuiltPropertyExists
