/**
 */
package org.osate.xtext.aadl2.mcs.mcs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.xbase.impl.XExpressionImpl;

import org.osate.aadl2.Property;

import org.osate.xtext.aadl2.mcs.mcs.McsPackage;
import org.osate.xtext.aadl2.mcs.mcs.element_reference;
import org.osate.xtext.aadl2.mcs.mcs.property_reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>property reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.property_referenceImpl#getEl_ref <em>El ref</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.property_referenceImpl#isExists <em>Exists</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.property_referenceImpl#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class property_referenceImpl extends XExpressionImpl implements property_reference
{
  /**
   * The cached value of the '{@link #getEl_ref() <em>El ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEl_ref()
   * @generated
   * @ordered
   */
  protected element_reference el_ref;

  /**
   * The default value of the '{@link #isExists() <em>Exists</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExists()
   * @generated
   * @ordered
   */
  protected static final boolean EXISTS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isExists() <em>Exists</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExists()
   * @generated
   * @ordered
   */
  protected boolean exists = EXISTS_EDEFAULT;

  /**
   * The cached value of the '{@link #getProperty() <em>Property</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperty()
   * @generated
   * @ordered
   */
  protected Property property;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected property_referenceImpl()
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
    return McsPackage.Literals.PROPERTY_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public element_reference getEl_ref()
  {
    return el_ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEl_ref(element_reference newEl_ref, NotificationChain msgs)
  {
    element_reference oldEl_ref = el_ref;
    el_ref = newEl_ref;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.PROPERTY_REFERENCE__EL_REF, oldEl_ref, newEl_ref);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEl_ref(element_reference newEl_ref)
  {
    if (newEl_ref != el_ref)
    {
      NotificationChain msgs = null;
      if (el_ref != null)
        msgs = ((InternalEObject)el_ref).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.PROPERTY_REFERENCE__EL_REF, null, msgs);
      if (newEl_ref != null)
        msgs = ((InternalEObject)newEl_ref).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.PROPERTY_REFERENCE__EL_REF, null, msgs);
      msgs = basicSetEl_ref(newEl_ref, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.PROPERTY_REFERENCE__EL_REF, newEl_ref, newEl_ref));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isExists()
  {
    return exists;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExists(boolean newExists)
  {
    boolean oldExists = exists;
    exists = newExists;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.PROPERTY_REFERENCE__EXISTS, oldExists, exists));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property getProperty()
  {
    if (property != null && ((EObject)property).eIsProxy())
    {
      InternalEObject oldProperty = (InternalEObject)property;
      property = (Property)eResolveProxy(oldProperty);
      if (property != oldProperty)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, McsPackage.PROPERTY_REFERENCE__PROPERTY, oldProperty, property));
      }
    }
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property basicGetProperty()
  {
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProperty(Property newProperty)
  {
    Property oldProperty = property;
    property = newProperty;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.PROPERTY_REFERENCE__PROPERTY, oldProperty, property));
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
      case McsPackage.PROPERTY_REFERENCE__EL_REF:
        return basicSetEl_ref(null, msgs);
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
      case McsPackage.PROPERTY_REFERENCE__EL_REF:
        return getEl_ref();
      case McsPackage.PROPERTY_REFERENCE__EXISTS:
        return isExists();
      case McsPackage.PROPERTY_REFERENCE__PROPERTY:
        if (resolve) return getProperty();
        return basicGetProperty();
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
      case McsPackage.PROPERTY_REFERENCE__EL_REF:
        setEl_ref((element_reference)newValue);
        return;
      case McsPackage.PROPERTY_REFERENCE__EXISTS:
        setExists((Boolean)newValue);
        return;
      case McsPackage.PROPERTY_REFERENCE__PROPERTY:
        setProperty((Property)newValue);
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
      case McsPackage.PROPERTY_REFERENCE__EL_REF:
        setEl_ref((element_reference)null);
        return;
      case McsPackage.PROPERTY_REFERENCE__EXISTS:
        setExists(EXISTS_EDEFAULT);
        return;
      case McsPackage.PROPERTY_REFERENCE__PROPERTY:
        setProperty((Property)null);
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
      case McsPackage.PROPERTY_REFERENCE__EL_REF:
        return el_ref != null;
      case McsPackage.PROPERTY_REFERENCE__EXISTS:
        return exists != EXISTS_EDEFAULT;
      case McsPackage.PROPERTY_REFERENCE__PROPERTY:
        return property != null;
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
    result.append(" (exists: ");
    result.append(exists);
    result.append(')');
    return result.toString();
  }

} //property_referenceImpl
