/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter Map Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.FilterMapExpr#getMap <em>Map</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.FilterMapExpr#getArgs <em>Args</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.FilterMapExpr#getFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getFilterMapExpr()
 * @model
 * @generated
 */
public interface FilterMapExpr extends Expr
{
  /**
   * Returns the value of the '<em><b>Map</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Map</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Map</em>' containment reference.
   * @see #setMap(FilterSet)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getFilterMapExpr_Map()
   * @model containment="true"
   * @generated
   */
  FilterSet getMap();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.FilterMapExpr#getMap <em>Map</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Map</em>' containment reference.
   * @see #getMap()
   * @generated
   */
  void setMap(FilterSet value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.xtext.aadl2.mcs.mcs.Parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference list.
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getFilterMapExpr_Args()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getArgs();

  /**
   * Returns the value of the '<em><b>Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Filter</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filter</em>' containment reference.
   * @see #setFilter(Expr)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getFilterMapExpr_Filter()
   * @model containment="true"
   * @generated
   */
  Expr getFilter();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.FilterMapExpr#getFilter <em>Filter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Filter</em>' containment reference.
   * @see #getFilter()
   * @generated
   */
  void setFilter(Expr value);

} // FilterMapExpr
