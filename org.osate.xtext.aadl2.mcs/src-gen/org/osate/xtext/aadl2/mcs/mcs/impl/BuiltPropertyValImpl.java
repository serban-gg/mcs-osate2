/**
 */
package org.osate.xtext.aadl2.mcs.mcs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.aadl2.Property;

import org.osate.xtext.aadl2.mcs.mcs.BuiltPropertyVal;
import org.osate.xtext.aadl2.mcs.mcs.Expr;
import org.osate.xtext.aadl2.mcs.mcs.McsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Built Property Val</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.BuiltPropertyValImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.BuiltPropertyValImpl#getModeset <em>Modeset</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.BuiltPropertyValImpl#getInbind <em>Inbind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BuiltPropertyValImpl extends ExprImpl implements BuiltPropertyVal
{
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
   * The cached value of the '{@link #getModeset() <em>Modeset</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModeset()
   * @generated
   * @ordered
   */
  protected Expr modeset;

  /**
   * The cached value of the '{@link #getInbind() <em>Inbind</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInbind()
   * @generated
   * @ordered
   */
  protected Expr inbind;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BuiltPropertyValImpl()
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
    return McsPackage.Literals.BUILT_PROPERTY_VAL;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, McsPackage.BUILT_PROPERTY_VAL__PROPERTY, oldProperty, property));
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
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.BUILT_PROPERTY_VAL__PROPERTY, oldProperty, property));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getModeset()
  {
    return modeset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetModeset(Expr newModeset, NotificationChain msgs)
  {
    Expr oldModeset = modeset;
    modeset = newModeset;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.BUILT_PROPERTY_VAL__MODESET, oldModeset, newModeset);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModeset(Expr newModeset)
  {
    if (newModeset != modeset)
    {
      NotificationChain msgs = null;
      if (modeset != null)
        msgs = ((InternalEObject)modeset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.BUILT_PROPERTY_VAL__MODESET, null, msgs);
      if (newModeset != null)
        msgs = ((InternalEObject)newModeset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.BUILT_PROPERTY_VAL__MODESET, null, msgs);
      msgs = basicSetModeset(newModeset, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.BUILT_PROPERTY_VAL__MODESET, newModeset, newModeset));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getInbind()
  {
    return inbind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInbind(Expr newInbind, NotificationChain msgs)
  {
    Expr oldInbind = inbind;
    inbind = newInbind;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.BUILT_PROPERTY_VAL__INBIND, oldInbind, newInbind);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInbind(Expr newInbind)
  {
    if (newInbind != inbind)
    {
      NotificationChain msgs = null;
      if (inbind != null)
        msgs = ((InternalEObject)inbind).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.BUILT_PROPERTY_VAL__INBIND, null, msgs);
      if (newInbind != null)
        msgs = ((InternalEObject)newInbind).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.BUILT_PROPERTY_VAL__INBIND, null, msgs);
      msgs = basicSetInbind(newInbind, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.BUILT_PROPERTY_VAL__INBIND, newInbind, newInbind));
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
      case McsPackage.BUILT_PROPERTY_VAL__MODESET:
        return basicSetModeset(null, msgs);
      case McsPackage.BUILT_PROPERTY_VAL__INBIND:
        return basicSetInbind(null, msgs);
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
      case McsPackage.BUILT_PROPERTY_VAL__PROPERTY:
        if (resolve) return getProperty();
        return basicGetProperty();
      case McsPackage.BUILT_PROPERTY_VAL__MODESET:
        return getModeset();
      case McsPackage.BUILT_PROPERTY_VAL__INBIND:
        return getInbind();
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
      case McsPackage.BUILT_PROPERTY_VAL__PROPERTY:
        setProperty((Property)newValue);
        return;
      case McsPackage.BUILT_PROPERTY_VAL__MODESET:
        setModeset((Expr)newValue);
        return;
      case McsPackage.BUILT_PROPERTY_VAL__INBIND:
        setInbind((Expr)newValue);
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
      case McsPackage.BUILT_PROPERTY_VAL__PROPERTY:
        setProperty((Property)null);
        return;
      case McsPackage.BUILT_PROPERTY_VAL__MODESET:
        setModeset((Expr)null);
        return;
      case McsPackage.BUILT_PROPERTY_VAL__INBIND:
        setInbind((Expr)null);
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
      case McsPackage.BUILT_PROPERTY_VAL__PROPERTY:
        return property != null;
      case McsPackage.BUILT_PROPERTY_VAL__MODESET:
        return modeset != null;
      case McsPackage.BUILT_PROPERTY_VAL__INBIND:
        return inbind != null;
    }
    return super.eIsSet(featureID);
  }

} //BuiltPropertyValImpl
