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

import org.osate.xtext.aadl2.mcs.mcs.Element_type;
import org.osate.xtext.aadl2.mcs.mcs.Element_types;
import org.osate.xtext.aadl2.mcs.mcs.McsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element types</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.Element_typesImpl#getEl_type <em>El type</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.Element_typesImpl#getEl_types <em>El types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Element_typesImpl extends MinimalEObjectImpl.Container implements Element_types
{
  /**
   * The cached value of the '{@link #getEl_type() <em>El type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEl_type()
   * @generated
   * @ordered
   */
  protected Element_type el_type;

  /**
   * The cached value of the '{@link #getEl_types() <em>El types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEl_types()
   * @generated
   * @ordered
   */
  protected EList<Element_type> el_types;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Element_typesImpl()
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
    return McsPackage.Literals.ELEMENT_TYPES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Element_type getEl_type()
  {
    return el_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEl_type(Element_type newEl_type, NotificationChain msgs)
  {
    Element_type oldEl_type = el_type;
    el_type = newEl_type;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.ELEMENT_TYPES__EL_TYPE, oldEl_type, newEl_type);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEl_type(Element_type newEl_type)
  {
    if (newEl_type != el_type)
    {
      NotificationChain msgs = null;
      if (el_type != null)
        msgs = ((InternalEObject)el_type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.ELEMENT_TYPES__EL_TYPE, null, msgs);
      if (newEl_type != null)
        msgs = ((InternalEObject)newEl_type).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.ELEMENT_TYPES__EL_TYPE, null, msgs);
      msgs = basicSetEl_type(newEl_type, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.ELEMENT_TYPES__EL_TYPE, newEl_type, newEl_type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Element_type> getEl_types()
  {
    if (el_types == null)
    {
      el_types = new EObjectContainmentEList<Element_type>(Element_type.class, this, McsPackage.ELEMENT_TYPES__EL_TYPES);
    }
    return el_types;
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
      case McsPackage.ELEMENT_TYPES__EL_TYPE:
        return basicSetEl_type(null, msgs);
      case McsPackage.ELEMENT_TYPES__EL_TYPES:
        return ((InternalEList<?>)getEl_types()).basicRemove(otherEnd, msgs);
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
      case McsPackage.ELEMENT_TYPES__EL_TYPE:
        return getEl_type();
      case McsPackage.ELEMENT_TYPES__EL_TYPES:
        return getEl_types();
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
      case McsPackage.ELEMENT_TYPES__EL_TYPE:
        setEl_type((Element_type)newValue);
        return;
      case McsPackage.ELEMENT_TYPES__EL_TYPES:
        getEl_types().clear();
        getEl_types().addAll((Collection<? extends Element_type>)newValue);
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
      case McsPackage.ELEMENT_TYPES__EL_TYPE:
        setEl_type((Element_type)null);
        return;
      case McsPackage.ELEMENT_TYPES__EL_TYPES:
        getEl_types().clear();
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
      case McsPackage.ELEMENT_TYPES__EL_TYPE:
        return el_type != null;
      case McsPackage.ELEMENT_TYPES__EL_TYPES:
        return el_types != null && !el_types.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //Element_typesImpl
