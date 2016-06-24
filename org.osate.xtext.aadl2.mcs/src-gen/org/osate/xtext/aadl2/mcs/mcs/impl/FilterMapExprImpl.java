/**
 */
package org.osate.xtext.aadl2.mcs.mcs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.xtext.aadl2.mcs.mcs.Expr;
import org.osate.xtext.aadl2.mcs.mcs.FilterMapExpr;
import org.osate.xtext.aadl2.mcs.mcs.FilterSet;
import org.osate.xtext.aadl2.mcs.mcs.McsPackage;
import org.osate.xtext.aadl2.mcs.mcs.Parameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter Map Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.FilterMapExprImpl#getMap <em>Map</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.FilterMapExprImpl#getArgs <em>Args</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.FilterMapExprImpl#getFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FilterMapExprImpl extends ExprImpl implements FilterMapExpr
{
  /**
   * The cached value of the '{@link #getMap() <em>Map</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMap()
   * @generated
   * @ordered
   */
  protected FilterSet map;

  /**
   * The cached value of the '{@link #getArgs() <em>Args</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgs()
   * @generated
   * @ordered
   */
  protected EList<Parameter> args;

  /**
   * The cached value of the '{@link #getFilter() <em>Filter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilter()
   * @generated
   * @ordered
   */
  protected Expr filter;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FilterMapExprImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return McsPackage.Literals.FILTER_MAP_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FilterSet getMap()
  {
    return map;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMap(FilterSet newMap, NotificationChain msgs)
  {
    FilterSet oldMap = map;
    map = newMap;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.FILTER_MAP_EXPR__MAP, oldMap, newMap);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMap(FilterSet newMap)
  {
    if (newMap != map)
    {
      NotificationChain msgs = null;
      if (map != null)
        msgs = ((InternalEObject)map).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.FILTER_MAP_EXPR__MAP, null, msgs);
      if (newMap != null)
        msgs = ((InternalEObject)newMap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.FILTER_MAP_EXPR__MAP, null, msgs);
      msgs = basicSetMap(newMap, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.FILTER_MAP_EXPR__MAP, newMap, newMap));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Parameter> getArgs()
  {
    if (args == null)
    {
      args = new EObjectContainmentEList<Parameter>(Parameter.class, this, McsPackage.FILTER_MAP_EXPR__ARGS);
    }
    return args;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getFilter()
  {
    return filter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFilter(Expr newFilter, NotificationChain msgs)
  {
    Expr oldFilter = filter;
    filter = newFilter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.FILTER_MAP_EXPR__FILTER, oldFilter, newFilter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFilter(Expr newFilter)
  {
    if (newFilter != filter)
    {
      NotificationChain msgs = null;
      if (filter != null)
        msgs = ((InternalEObject)filter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.FILTER_MAP_EXPR__FILTER, null, msgs);
      if (newFilter != null)
        msgs = ((InternalEObject)newFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.FILTER_MAP_EXPR__FILTER, null, msgs);
      msgs = basicSetFilter(newFilter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.FILTER_MAP_EXPR__FILTER, newFilter, newFilter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case McsPackage.FILTER_MAP_EXPR__MAP:
        return basicSetMap(null, msgs);
      case McsPackage.FILTER_MAP_EXPR__ARGS:
        return ((InternalEList<?>)getArgs()).basicRemove(otherEnd, msgs);
      case McsPackage.FILTER_MAP_EXPR__FILTER:
        return basicSetFilter(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case McsPackage.FILTER_MAP_EXPR__MAP:
        return getMap();
      case McsPackage.FILTER_MAP_EXPR__ARGS:
        return getArgs();
      case McsPackage.FILTER_MAP_EXPR__FILTER:
        return getFilter();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case McsPackage.FILTER_MAP_EXPR__MAP:
        setMap((FilterSet)newValue);
        return;
      case McsPackage.FILTER_MAP_EXPR__ARGS:
        getArgs().clear();
        getArgs().addAll((Collection<? extends Parameter>)newValue);
        return;
      case McsPackage.FILTER_MAP_EXPR__FILTER:
        setFilter((Expr)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case McsPackage.FILTER_MAP_EXPR__MAP:
        setMap((FilterSet)null);
        return;
      case McsPackage.FILTER_MAP_EXPR__ARGS:
        getArgs().clear();
        return;
      case McsPackage.FILTER_MAP_EXPR__FILTER:
        setFilter((Expr)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case McsPackage.FILTER_MAP_EXPR__MAP:
        return map != null;
      case McsPackage.FILTER_MAP_EXPR__ARGS:
        return args != null && !args.isEmpty();
      case McsPackage.FILTER_MAP_EXPR__FILTER:
        return filter != null;
    }
    return super.eIsSet(featureID);
  }

} //FilterMapExprImpl
