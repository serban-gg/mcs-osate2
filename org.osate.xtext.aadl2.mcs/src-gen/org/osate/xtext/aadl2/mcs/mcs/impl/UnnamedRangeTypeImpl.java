/**
 */
package org.osate.xtext.aadl2.mcs.mcs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.osate.aadl2.NumberType;

import org.osate.xtext.aadl2.mcs.mcs.McsPackage;
import org.osate.xtext.aadl2.mcs.mcs.UnnamedRangeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unnamed Range Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.UnnamedRangeTypeImpl#getOwnedNumberType <em>Owned Number Type</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.UnnamedRangeTypeImpl#getReferencedNumberType <em>Referenced Number Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnnamedRangeTypeImpl extends MinimalEObjectImpl.Container implements UnnamedRangeType
{
  /**
   * The cached value of the '{@link #getOwnedNumberType() <em>Owned Number Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedNumberType()
   * @generated
   * @ordered
   */
  protected EObject ownedNumberType;

  /**
   * The cached value of the '{@link #getReferencedNumberType() <em>Referenced Number Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferencedNumberType()
   * @generated
   * @ordered
   */
  protected NumberType referencedNumberType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UnnamedRangeTypeImpl()
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
    return McsPackage.Literals.UNNAMED_RANGE_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getOwnedNumberType()
  {
    return ownedNumberType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOwnedNumberType(EObject newOwnedNumberType, NotificationChain msgs)
  {
    EObject oldOwnedNumberType = ownedNumberType;
    ownedNumberType = newOwnedNumberType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.UNNAMED_RANGE_TYPE__OWNED_NUMBER_TYPE, oldOwnedNumberType, newOwnedNumberType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOwnedNumberType(EObject newOwnedNumberType)
  {
    if (newOwnedNumberType != ownedNumberType)
    {
      NotificationChain msgs = null;
      if (ownedNumberType != null)
        msgs = ((InternalEObject)ownedNumberType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.UNNAMED_RANGE_TYPE__OWNED_NUMBER_TYPE, null, msgs);
      if (newOwnedNumberType != null)
        msgs = ((InternalEObject)newOwnedNumberType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.UNNAMED_RANGE_TYPE__OWNED_NUMBER_TYPE, null, msgs);
      msgs = basicSetOwnedNumberType(newOwnedNumberType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.UNNAMED_RANGE_TYPE__OWNED_NUMBER_TYPE, newOwnedNumberType, newOwnedNumberType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberType getReferencedNumberType()
  {
    if (referencedNumberType != null && ((EObject)referencedNumberType).eIsProxy())
    {
      InternalEObject oldReferencedNumberType = (InternalEObject)referencedNumberType;
      referencedNumberType = (NumberType)eResolveProxy(oldReferencedNumberType);
      if (referencedNumberType != oldReferencedNumberType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, McsPackage.UNNAMED_RANGE_TYPE__REFERENCED_NUMBER_TYPE, oldReferencedNumberType, referencedNumberType));
      }
    }
    return referencedNumberType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberType basicGetReferencedNumberType()
  {
    return referencedNumberType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReferencedNumberType(NumberType newReferencedNumberType)
  {
    NumberType oldReferencedNumberType = referencedNumberType;
    referencedNumberType = newReferencedNumberType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.UNNAMED_RANGE_TYPE__REFERENCED_NUMBER_TYPE, oldReferencedNumberType, referencedNumberType));
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
      case McsPackage.UNNAMED_RANGE_TYPE__OWNED_NUMBER_TYPE:
        return basicSetOwnedNumberType(null, msgs);
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
      case McsPackage.UNNAMED_RANGE_TYPE__OWNED_NUMBER_TYPE:
        return getOwnedNumberType();
      case McsPackage.UNNAMED_RANGE_TYPE__REFERENCED_NUMBER_TYPE:
        if (resolve) return getReferencedNumberType();
        return basicGetReferencedNumberType();
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
      case McsPackage.UNNAMED_RANGE_TYPE__OWNED_NUMBER_TYPE:
        setOwnedNumberType((EObject)newValue);
        return;
      case McsPackage.UNNAMED_RANGE_TYPE__REFERENCED_NUMBER_TYPE:
        setReferencedNumberType((NumberType)newValue);
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
      case McsPackage.UNNAMED_RANGE_TYPE__OWNED_NUMBER_TYPE:
        setOwnedNumberType((EObject)null);
        return;
      case McsPackage.UNNAMED_RANGE_TYPE__REFERENCED_NUMBER_TYPE:
        setReferencedNumberType((NumberType)null);
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
      case McsPackage.UNNAMED_RANGE_TYPE__OWNED_NUMBER_TYPE:
        return ownedNumberType != null;
      case McsPackage.UNNAMED_RANGE_TYPE__REFERENCED_NUMBER_TYPE:
        return referencedNumberType != null;
    }
    return super.eIsSet(featureID);
  }

} //UnnamedRangeTypeImpl
