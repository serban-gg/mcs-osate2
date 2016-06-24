/**
 */
package org.osate.xtext.aadl2.mcs.mcs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.FilterSet#isList <em>List</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.FilterSet#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getFilterSet()
 * @model
 * @generated
 */
public interface FilterSet extends Expr
{
  /**
   * Returns the value of the '<em><b>List</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List</em>' attribute.
   * @see #setList(boolean)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getFilterSet_List()
   * @model
   * @generated
   */
  boolean isList();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.FilterSet#isList <em>List</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>List</em>' attribute.
   * @see #isList()
   * @generated
   */
  void setList(boolean value);

  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(Expr)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getFilterSet_Exp()
   * @model containment="true"
   * @generated
   */
  Expr getExp();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.FilterSet#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(Expr value);

} // FilterSet
