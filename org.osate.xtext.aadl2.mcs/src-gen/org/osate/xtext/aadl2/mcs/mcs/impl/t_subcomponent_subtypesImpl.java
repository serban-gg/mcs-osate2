/**
 */
package org.osate.xtext.aadl2.mcs.mcs.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.osate.xtext.aadl2.mcs.mcs.McsPackage;
import org.osate.xtext.aadl2.mcs.mcs.t_subcomponent_subtypes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>tsubcomponent subtypes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_subcomponent_subtypesImpl#isT_sub <em>Tsub</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_subcomponent_subtypesImpl#isT_cimpl_st <em>Tcimpl st</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class t_subcomponent_subtypesImpl extends MinimalEObjectImpl.Container implements t_subcomponent_subtypes
{
  /**
   * The default value of the '{@link #isT_sub() <em>Tsub</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_sub()
   * @generated
   * @ordered
   */
  protected static final boolean TSUB_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isT_sub() <em>Tsub</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_sub()
   * @generated
   * @ordered
   */
  protected boolean t_sub = TSUB_EDEFAULT;

  /**
   * The default value of the '{@link #isT_cimpl_st() <em>Tcimpl st</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_cimpl_st()
   * @generated
   * @ordered
   */
  protected static final boolean TCIMPL_ST_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isT_cimpl_st() <em>Tcimpl st</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_cimpl_st()
   * @generated
   * @ordered
   */
  protected boolean t_cimpl_st = TCIMPL_ST_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected t_subcomponent_subtypesImpl()
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
    return McsPackage.Literals.TSUBCOMPONENT_SUBTYPES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isT_sub()
  {
    return t_sub;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT_sub(boolean newT_sub)
  {
    boolean oldT_sub = t_sub;
    t_sub = newT_sub;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TSUBCOMPONENT_SUBTYPES__TSUB, oldT_sub, t_sub));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isT_cimpl_st()
  {
    return t_cimpl_st;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT_cimpl_st(boolean newT_cimpl_st)
  {
    boolean oldT_cimpl_st = t_cimpl_st;
    t_cimpl_st = newT_cimpl_st;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TSUBCOMPONENT_SUBTYPES__TCIMPL_ST, oldT_cimpl_st, t_cimpl_st));
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
      case McsPackage.TSUBCOMPONENT_SUBTYPES__TSUB:
        return isT_sub();
      case McsPackage.TSUBCOMPONENT_SUBTYPES__TCIMPL_ST:
        return isT_cimpl_st();
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
      case McsPackage.TSUBCOMPONENT_SUBTYPES__TSUB:
        setT_sub((Boolean)newValue);
        return;
      case McsPackage.TSUBCOMPONENT_SUBTYPES__TCIMPL_ST:
        setT_cimpl_st((Boolean)newValue);
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
      case McsPackage.TSUBCOMPONENT_SUBTYPES__TSUB:
        setT_sub(TSUB_EDEFAULT);
        return;
      case McsPackage.TSUBCOMPONENT_SUBTYPES__TCIMPL_ST:
        setT_cimpl_st(TCIMPL_ST_EDEFAULT);
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
      case McsPackage.TSUBCOMPONENT_SUBTYPES__TSUB:
        return t_sub != TSUB_EDEFAULT;
      case McsPackage.TSUBCOMPONENT_SUBTYPES__TCIMPL_ST:
        return t_cimpl_st != TCIMPL_ST_EDEFAULT;
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
    result.append(" (t_sub: ");
    result.append(t_sub);
    result.append(", t_cimpl_st: ");
    result.append(t_cimpl_st);
    result.append(')');
    return result.toString();
  }

} //t_subcomponent_subtypesImpl
