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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.xtext.aadl2.mcs.mcs.Element_types;
import org.osate.xtext.aadl2.mcs.mcs.McsPackage;
import org.osate.xtext.aadl2.mcs.mcs.Query_element_set;
import org.osate.xtext.aadl2.mcs.mcs.expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query element set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.Query_element_setImpl#isDirect <em>Direct</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.Query_element_setImpl#getResult_types <em>Result types</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.Query_element_setImpl#getElem_set <em>Elem set</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.Query_element_setImpl#isMode_spec <em>Mode spec</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Query_element_setImpl extends MinimalEObjectImpl.Container implements Query_element_set
{
  /**
   * The default value of the '{@link #isDirect() <em>Direct</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDirect()
   * @generated
   * @ordered
   */
  protected static final boolean DIRECT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDirect() <em>Direct</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDirect()
   * @generated
   * @ordered
   */
  protected boolean direct = DIRECT_EDEFAULT;

  /**
   * The cached value of the '{@link #getResult_types() <em>Result types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResult_types()
   * @generated
   * @ordered
   */
  protected EList<Element_types> result_types;

  /**
   * The cached value of the '{@link #getElem_set() <em>Elem set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElem_set()
   * @generated
   * @ordered
   */
  protected expression elem_set;

  /**
   * The default value of the '{@link #isMode_spec() <em>Mode spec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMode_spec()
   * @generated
   * @ordered
   */
  protected static final boolean MODE_SPEC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMode_spec() <em>Mode spec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMode_spec()
   * @generated
   * @ordered
   */
  protected boolean mode_spec = MODE_SPEC_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Query_element_setImpl()
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
    return McsPackage.Literals.QUERY_ELEMENT_SET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDirect()
  {
    return direct;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDirect(boolean newDirect)
  {
    boolean oldDirect = direct;
    direct = newDirect;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.QUERY_ELEMENT_SET__DIRECT, oldDirect, direct));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Element_types> getResult_types()
  {
    if (result_types == null)
    {
      result_types = new EObjectContainmentEList<Element_types>(Element_types.class, this, McsPackage.QUERY_ELEMENT_SET__RESULT_TYPES);
    }
    return result_types;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression getElem_set()
  {
    return elem_set;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElem_set(expression newElem_set, NotificationChain msgs)
  {
    expression oldElem_set = elem_set;
    elem_set = newElem_set;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.QUERY_ELEMENT_SET__ELEM_SET, oldElem_set, newElem_set);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElem_set(expression newElem_set)
  {
    if (newElem_set != elem_set)
    {
      NotificationChain msgs = null;
      if (elem_set != null)
        msgs = ((InternalEObject)elem_set).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.QUERY_ELEMENT_SET__ELEM_SET, null, msgs);
      if (newElem_set != null)
        msgs = ((InternalEObject)newElem_set).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.QUERY_ELEMENT_SET__ELEM_SET, null, msgs);
      msgs = basicSetElem_set(newElem_set, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.QUERY_ELEMENT_SET__ELEM_SET, newElem_set, newElem_set));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMode_spec()
  {
    return mode_spec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMode_spec(boolean newMode_spec)
  {
    boolean oldMode_spec = mode_spec;
    mode_spec = newMode_spec;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.QUERY_ELEMENT_SET__MODE_SPEC, oldMode_spec, mode_spec));
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
      case McsPackage.QUERY_ELEMENT_SET__RESULT_TYPES:
        return ((InternalEList<?>)getResult_types()).basicRemove(otherEnd, msgs);
      case McsPackage.QUERY_ELEMENT_SET__ELEM_SET:
        return basicSetElem_set(null, msgs);
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
      case McsPackage.QUERY_ELEMENT_SET__DIRECT:
        return isDirect();
      case McsPackage.QUERY_ELEMENT_SET__RESULT_TYPES:
        return getResult_types();
      case McsPackage.QUERY_ELEMENT_SET__ELEM_SET:
        return getElem_set();
      case McsPackage.QUERY_ELEMENT_SET__MODE_SPEC:
        return isMode_spec();
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
      case McsPackage.QUERY_ELEMENT_SET__DIRECT:
        setDirect((Boolean)newValue);
        return;
      case McsPackage.QUERY_ELEMENT_SET__RESULT_TYPES:
        getResult_types().clear();
        getResult_types().addAll((Collection<? extends Element_types>)newValue);
        return;
      case McsPackage.QUERY_ELEMENT_SET__ELEM_SET:
        setElem_set((expression)newValue);
        return;
      case McsPackage.QUERY_ELEMENT_SET__MODE_SPEC:
        setMode_spec((Boolean)newValue);
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
      case McsPackage.QUERY_ELEMENT_SET__DIRECT:
        setDirect(DIRECT_EDEFAULT);
        return;
      case McsPackage.QUERY_ELEMENT_SET__RESULT_TYPES:
        getResult_types().clear();
        return;
      case McsPackage.QUERY_ELEMENT_SET__ELEM_SET:
        setElem_set((expression)null);
        return;
      case McsPackage.QUERY_ELEMENT_SET__MODE_SPEC:
        setMode_spec(MODE_SPEC_EDEFAULT);
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
      case McsPackage.QUERY_ELEMENT_SET__DIRECT:
        return direct != DIRECT_EDEFAULT;
      case McsPackage.QUERY_ELEMENT_SET__RESULT_TYPES:
        return result_types != null && !result_types.isEmpty();
      case McsPackage.QUERY_ELEMENT_SET__ELEM_SET:
        return elem_set != null;
      case McsPackage.QUERY_ELEMENT_SET__MODE_SPEC:
        return mode_spec != MODE_SPEC_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (direct: ");
    result.append(direct);
    result.append(", mode_spec: ");
    result.append(mode_spec);
    result.append(')');
    return result.toString();
  }

} //Query_element_setImpl
