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

import org.osate.xtext.aadl2.mcs.mcs.IntegerRange;
import org.osate.xtext.aadl2.mcs.mcs.McsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integer Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.IntegerRangeImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.IntegerRangeImpl#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntegerRangeImpl extends MinimalEObjectImpl.Container implements IntegerRange
{
  /**
   * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLowerBound()
   * @generated
   * @ordered
   */
  protected EObject lowerBound;

  /**
   * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpperBound()
   * @generated
   * @ordered
   */
  protected EObject upperBound;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IntegerRangeImpl()
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
    return McsPackage.Literals.INTEGER_RANGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getLowerBound()
  {
    return lowerBound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLowerBound(EObject newLowerBound, NotificationChain msgs)
  {
    EObject oldLowerBound = lowerBound;
    lowerBound = newLowerBound;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.INTEGER_RANGE__LOWER_BOUND, oldLowerBound, newLowerBound);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLowerBound(EObject newLowerBound)
  {
    if (newLowerBound != lowerBound)
    {
      NotificationChain msgs = null;
      if (lowerBound != null)
        msgs = ((InternalEObject)lowerBound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.INTEGER_RANGE__LOWER_BOUND, null, msgs);
      if (newLowerBound != null)
        msgs = ((InternalEObject)newLowerBound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.INTEGER_RANGE__LOWER_BOUND, null, msgs);
      msgs = basicSetLowerBound(newLowerBound, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.INTEGER_RANGE__LOWER_BOUND, newLowerBound, newLowerBound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getUpperBound()
  {
    return upperBound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUpperBound(EObject newUpperBound, NotificationChain msgs)
  {
    EObject oldUpperBound = upperBound;
    upperBound = newUpperBound;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.INTEGER_RANGE__UPPER_BOUND, oldUpperBound, newUpperBound);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUpperBound(EObject newUpperBound)
  {
    if (newUpperBound != upperBound)
    {
      NotificationChain msgs = null;
      if (upperBound != null)
        msgs = ((InternalEObject)upperBound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.INTEGER_RANGE__UPPER_BOUND, null, msgs);
      if (newUpperBound != null)
        msgs = ((InternalEObject)newUpperBound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.INTEGER_RANGE__UPPER_BOUND, null, msgs);
      msgs = basicSetUpperBound(newUpperBound, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.INTEGER_RANGE__UPPER_BOUND, newUpperBound, newUpperBound));
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
      case McsPackage.INTEGER_RANGE__LOWER_BOUND:
        return basicSetLowerBound(null, msgs);
      case McsPackage.INTEGER_RANGE__UPPER_BOUND:
        return basicSetUpperBound(null, msgs);
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
      case McsPackage.INTEGER_RANGE__LOWER_BOUND:
        return getLowerBound();
      case McsPackage.INTEGER_RANGE__UPPER_BOUND:
        return getUpperBound();
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
      case McsPackage.INTEGER_RANGE__LOWER_BOUND:
        setLowerBound((EObject)newValue);
        return;
      case McsPackage.INTEGER_RANGE__UPPER_BOUND:
        setUpperBound((EObject)newValue);
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
      case McsPackage.INTEGER_RANGE__LOWER_BOUND:
        setLowerBound((EObject)null);
        return;
      case McsPackage.INTEGER_RANGE__UPPER_BOUND:
        setUpperBound((EObject)null);
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
      case McsPackage.INTEGER_RANGE__LOWER_BOUND:
        return lowerBound != null;
      case McsPackage.INTEGER_RANGE__UPPER_BOUND:
        return upperBound != null;
    }
    return super.eIsSet(featureID);
  }

} //IntegerRangeImpl
