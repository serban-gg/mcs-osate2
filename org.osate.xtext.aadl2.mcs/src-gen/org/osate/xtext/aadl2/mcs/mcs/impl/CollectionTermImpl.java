/**
 */
package org.osate.xtext.aadl2.mcs.mcs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.xbase.XCollectionLiteral;

import org.eclipse.xtext.xbase.impl.XExpressionImpl;

import org.osate.xtext.aadl2.mcs.mcs.CollectionTerm;
import org.osate.xtext.aadl2.mcs.mcs.McsPackage;
import org.osate.xtext.aadl2.mcs.mcs.Query_element_set;
import org.osate.xtext.aadl2.mcs.mcs.Set_comprehension;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collection Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.CollectionTermImpl#getXc <em>Xc</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.CollectionTermImpl#getQuery_set <em>Query set</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.CollectionTermImpl#getSet_c <em>Set c</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollectionTermImpl extends XExpressionImpl implements CollectionTerm
{
  /**
   * The cached value of the '{@link #getXc() <em>Xc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXc()
   * @generated
   * @ordered
   */
  protected XCollectionLiteral xc;

  /**
   * The cached value of the '{@link #getQuery_set() <em>Query set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuery_set()
   * @generated
   * @ordered
   */
  protected Query_element_set query_set;

  /**
   * The cached value of the '{@link #getSet_c() <em>Set c</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSet_c()
   * @generated
   * @ordered
   */
  protected Set_comprehension set_c;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CollectionTermImpl()
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
    return McsPackage.Literals.COLLECTION_TERM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XCollectionLiteral getXc()
  {
    return xc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetXc(XCollectionLiteral newXc, NotificationChain msgs)
  {
    XCollectionLiteral oldXc = xc;
    xc = newXc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.COLLECTION_TERM__XC, oldXc, newXc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setXc(XCollectionLiteral newXc)
  {
    if (newXc != xc)
    {
      NotificationChain msgs = null;
      if (xc != null)
        msgs = ((InternalEObject)xc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.COLLECTION_TERM__XC, null, msgs);
      if (newXc != null)
        msgs = ((InternalEObject)newXc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.COLLECTION_TERM__XC, null, msgs);
      msgs = basicSetXc(newXc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.COLLECTION_TERM__XC, newXc, newXc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Query_element_set getQuery_set()
  {
    return query_set;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQuery_set(Query_element_set newQuery_set, NotificationChain msgs)
  {
    Query_element_set oldQuery_set = query_set;
    query_set = newQuery_set;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.COLLECTION_TERM__QUERY_SET, oldQuery_set, newQuery_set);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuery_set(Query_element_set newQuery_set)
  {
    if (newQuery_set != query_set)
    {
      NotificationChain msgs = null;
      if (query_set != null)
        msgs = ((InternalEObject)query_set).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.COLLECTION_TERM__QUERY_SET, null, msgs);
      if (newQuery_set != null)
        msgs = ((InternalEObject)newQuery_set).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.COLLECTION_TERM__QUERY_SET, null, msgs);
      msgs = basicSetQuery_set(newQuery_set, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.COLLECTION_TERM__QUERY_SET, newQuery_set, newQuery_set));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Set_comprehension getSet_c()
  {
    return set_c;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSet_c(Set_comprehension newSet_c, NotificationChain msgs)
  {
    Set_comprehension oldSet_c = set_c;
    set_c = newSet_c;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.COLLECTION_TERM__SET_C, oldSet_c, newSet_c);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSet_c(Set_comprehension newSet_c)
  {
    if (newSet_c != set_c)
    {
      NotificationChain msgs = null;
      if (set_c != null)
        msgs = ((InternalEObject)set_c).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.COLLECTION_TERM__SET_C, null, msgs);
      if (newSet_c != null)
        msgs = ((InternalEObject)newSet_c).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.COLLECTION_TERM__SET_C, null, msgs);
      msgs = basicSetSet_c(newSet_c, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.COLLECTION_TERM__SET_C, newSet_c, newSet_c));
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
      case McsPackage.COLLECTION_TERM__XC:
        return basicSetXc(null, msgs);
      case McsPackage.COLLECTION_TERM__QUERY_SET:
        return basicSetQuery_set(null, msgs);
      case McsPackage.COLLECTION_TERM__SET_C:
        return basicSetSet_c(null, msgs);
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
      case McsPackage.COLLECTION_TERM__XC:
        return getXc();
      case McsPackage.COLLECTION_TERM__QUERY_SET:
        return getQuery_set();
      case McsPackage.COLLECTION_TERM__SET_C:
        return getSet_c();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case McsPackage.COLLECTION_TERM__XC:
        setXc((XCollectionLiteral)newValue);
        return;
      case McsPackage.COLLECTION_TERM__QUERY_SET:
        setQuery_set((Query_element_set)newValue);
        return;
      case McsPackage.COLLECTION_TERM__SET_C:
        setSet_c((Set_comprehension)newValue);
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
      case McsPackage.COLLECTION_TERM__XC:
        setXc((XCollectionLiteral)null);
        return;
      case McsPackage.COLLECTION_TERM__QUERY_SET:
        setQuery_set((Query_element_set)null);
        return;
      case McsPackage.COLLECTION_TERM__SET_C:
        setSet_c((Set_comprehension)null);
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
      case McsPackage.COLLECTION_TERM__XC:
        return xc != null;
      case McsPackage.COLLECTION_TERM__QUERY_SET:
        return query_set != null;
      case McsPackage.COLLECTION_TERM__SET_C:
        return set_c != null;
    }
    return super.eIsSet(featureID);
  }

} //CollectionTermImpl
