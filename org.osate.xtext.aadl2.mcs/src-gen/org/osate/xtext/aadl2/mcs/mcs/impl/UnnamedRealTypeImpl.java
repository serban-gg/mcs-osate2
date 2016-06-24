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

import org.osate.aadl2.UnitsType;

import org.osate.xtext.aadl2.mcs.mcs.McsPackage;
import org.osate.xtext.aadl2.mcs.mcs.RealRange;
import org.osate.xtext.aadl2.mcs.mcs.UnnamedRealType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unnamed Real Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.UnnamedRealTypeImpl#getRange <em>Range</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.UnnamedRealTypeImpl#getOwnedUnitsType <em>Owned Units Type</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.UnnamedRealTypeImpl#getReferencedUnitsType <em>Referenced Units Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnnamedRealTypeImpl extends MinimalEObjectImpl.Container implements UnnamedRealType
{
  /**
   * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRange()
   * @generated
   * @ordered
   */
  protected RealRange range;

  /**
   * The cached value of the '{@link #getOwnedUnitsType() <em>Owned Units Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedUnitsType()
   * @generated
   * @ordered
   */
  protected UnitsType ownedUnitsType;

  /**
   * The cached value of the '{@link #getReferencedUnitsType() <em>Referenced Units Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferencedUnitsType()
   * @generated
   * @ordered
   */
  protected UnitsType referencedUnitsType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UnnamedRealTypeImpl()
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
    return McsPackage.Literals.UNNAMED_REAL_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RealRange getRange()
  {
    return range;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRange(RealRange newRange, NotificationChain msgs)
  {
    RealRange oldRange = range;
    range = newRange;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.UNNAMED_REAL_TYPE__RANGE, oldRange, newRange);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRange(RealRange newRange)
  {
    if (newRange != range)
    {
      NotificationChain msgs = null;
      if (range != null)
        msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.UNNAMED_REAL_TYPE__RANGE, null, msgs);
      if (newRange != null)
        msgs = ((InternalEObject)newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.UNNAMED_REAL_TYPE__RANGE, null, msgs);
      msgs = basicSetRange(newRange, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.UNNAMED_REAL_TYPE__RANGE, newRange, newRange));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnitsType getOwnedUnitsType()
  {
    return ownedUnitsType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOwnedUnitsType(UnitsType newOwnedUnitsType, NotificationChain msgs)
  {
    UnitsType oldOwnedUnitsType = ownedUnitsType;
    ownedUnitsType = newOwnedUnitsType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.UNNAMED_REAL_TYPE__OWNED_UNITS_TYPE, oldOwnedUnitsType, newOwnedUnitsType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOwnedUnitsType(UnitsType newOwnedUnitsType)
  {
    if (newOwnedUnitsType != ownedUnitsType)
    {
      NotificationChain msgs = null;
      if (ownedUnitsType != null)
        msgs = ((InternalEObject)ownedUnitsType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.UNNAMED_REAL_TYPE__OWNED_UNITS_TYPE, null, msgs);
      if (newOwnedUnitsType != null)
        msgs = ((InternalEObject)newOwnedUnitsType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.UNNAMED_REAL_TYPE__OWNED_UNITS_TYPE, null, msgs);
      msgs = basicSetOwnedUnitsType(newOwnedUnitsType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.UNNAMED_REAL_TYPE__OWNED_UNITS_TYPE, newOwnedUnitsType, newOwnedUnitsType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnitsType getReferencedUnitsType()
  {
    if (referencedUnitsType != null && ((EObject)referencedUnitsType).eIsProxy())
    {
      InternalEObject oldReferencedUnitsType = (InternalEObject)referencedUnitsType;
      referencedUnitsType = (UnitsType)eResolveProxy(oldReferencedUnitsType);
      if (referencedUnitsType != oldReferencedUnitsType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, McsPackage.UNNAMED_REAL_TYPE__REFERENCED_UNITS_TYPE, oldReferencedUnitsType, referencedUnitsType));
      }
    }
    return referencedUnitsType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnitsType basicGetReferencedUnitsType()
  {
    return referencedUnitsType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReferencedUnitsType(UnitsType newReferencedUnitsType)
  {
    UnitsType oldReferencedUnitsType = referencedUnitsType;
    referencedUnitsType = newReferencedUnitsType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.UNNAMED_REAL_TYPE__REFERENCED_UNITS_TYPE, oldReferencedUnitsType, referencedUnitsType));
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
      case McsPackage.UNNAMED_REAL_TYPE__RANGE:
        return basicSetRange(null, msgs);
      case McsPackage.UNNAMED_REAL_TYPE__OWNED_UNITS_TYPE:
        return basicSetOwnedUnitsType(null, msgs);
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
      case McsPackage.UNNAMED_REAL_TYPE__RANGE:
        return getRange();
      case McsPackage.UNNAMED_REAL_TYPE__OWNED_UNITS_TYPE:
        return getOwnedUnitsType();
      case McsPackage.UNNAMED_REAL_TYPE__REFERENCED_UNITS_TYPE:
        if (resolve) return getReferencedUnitsType();
        return basicGetReferencedUnitsType();
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
      case McsPackage.UNNAMED_REAL_TYPE__RANGE:
        setRange((RealRange)newValue);
        return;
      case McsPackage.UNNAMED_REAL_TYPE__OWNED_UNITS_TYPE:
        setOwnedUnitsType((UnitsType)newValue);
        return;
      case McsPackage.UNNAMED_REAL_TYPE__REFERENCED_UNITS_TYPE:
        setReferencedUnitsType((UnitsType)newValue);
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
      case McsPackage.UNNAMED_REAL_TYPE__RANGE:
        setRange((RealRange)null);
        return;
      case McsPackage.UNNAMED_REAL_TYPE__OWNED_UNITS_TYPE:
        setOwnedUnitsType((UnitsType)null);
        return;
      case McsPackage.UNNAMED_REAL_TYPE__REFERENCED_UNITS_TYPE:
        setReferencedUnitsType((UnitsType)null);
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
      case McsPackage.UNNAMED_REAL_TYPE__RANGE:
        return range != null;
      case McsPackage.UNNAMED_REAL_TYPE__OWNED_UNITS_TYPE:
        return ownedUnitsType != null;
      case McsPackage.UNNAMED_REAL_TYPE__REFERENCED_UNITS_TYPE:
        return referencedUnitsType != null;
    }
    return super.eIsSet(featureID);
  }

} //UnnamedRealTypeImpl
