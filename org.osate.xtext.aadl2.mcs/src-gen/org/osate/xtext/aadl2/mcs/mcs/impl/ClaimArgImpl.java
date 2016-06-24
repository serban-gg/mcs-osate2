/**
 */
package org.osate.xtext.aadl2.mcs.mcs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.aadl2.UnitLiteral;

import org.osate.xtext.aadl2.mcs.mcs.ClaimArg;
import org.osate.xtext.aadl2.mcs.mcs.MCSNameExpr;
import org.osate.xtext.aadl2.mcs.mcs.McsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim Arg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.ClaimArgImpl#getTextarg <em>Textarg</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.ClaimArgImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClaimArgImpl extends TextParmImpl implements ClaimArg
{
  /**
   * The cached value of the '{@link #getTextarg() <em>Textarg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTextarg()
   * @generated
   * @ordered
   */
  protected MCSNameExpr textarg;

  /**
   * The cached value of the '{@link #getUnit() <em>Unit</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnit()
   * @generated
   * @ordered
   */
  protected UnitLiteral unit;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClaimArgImpl()
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
    return McsPackage.Literals.CLAIM_ARG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MCSNameExpr getTextarg()
  {
    return textarg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTextarg(MCSNameExpr newTextarg, NotificationChain msgs)
  {
    MCSNameExpr oldTextarg = textarg;
    textarg = newTextarg;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.CLAIM_ARG__TEXTARG, oldTextarg, newTextarg);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTextarg(MCSNameExpr newTextarg)
  {
    if (newTextarg != textarg)
    {
      NotificationChain msgs = null;
      if (textarg != null)
        msgs = ((InternalEObject)textarg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.CLAIM_ARG__TEXTARG, null, msgs);
      if (newTextarg != null)
        msgs = ((InternalEObject)newTextarg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.CLAIM_ARG__TEXTARG, null, msgs);
      msgs = basicSetTextarg(newTextarg, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.CLAIM_ARG__TEXTARG, newTextarg, newTextarg));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnitLiteral getUnit()
  {
    if (unit != null && ((EObject)unit).eIsProxy())
    {
      InternalEObject oldUnit = (InternalEObject)unit;
      unit = (UnitLiteral)eResolveProxy(oldUnit);
      if (unit != oldUnit)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, McsPackage.CLAIM_ARG__UNIT, oldUnit, unit));
      }
    }
    return unit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnitLiteral basicGetUnit()
  {
    return unit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnit(UnitLiteral newUnit)
  {
    UnitLiteral oldUnit = unit;
    unit = newUnit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.CLAIM_ARG__UNIT, oldUnit, unit));
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
      case McsPackage.CLAIM_ARG__TEXTARG:
        return basicSetTextarg(null, msgs);
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
      case McsPackage.CLAIM_ARG__TEXTARG:
        return getTextarg();
      case McsPackage.CLAIM_ARG__UNIT:
        if (resolve) return getUnit();
        return basicGetUnit();
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
      case McsPackage.CLAIM_ARG__TEXTARG:
        setTextarg((MCSNameExpr)newValue);
        return;
      case McsPackage.CLAIM_ARG__UNIT:
        setUnit((UnitLiteral)newValue);
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
      case McsPackage.CLAIM_ARG__TEXTARG:
        setTextarg((MCSNameExpr)null);
        return;
      case McsPackage.CLAIM_ARG__UNIT:
        setUnit((UnitLiteral)null);
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
      case McsPackage.CLAIM_ARG__TEXTARG:
        return textarg != null;
      case McsPackage.CLAIM_ARG__UNIT:
        return unit != null;
    }
    return super.eIsSet(featureID);
  }

} //ClaimArgImpl
