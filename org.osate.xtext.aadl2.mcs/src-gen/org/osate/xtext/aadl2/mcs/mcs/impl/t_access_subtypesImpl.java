/**
 */
package org.osate.xtext.aadl2.mcs.mcs.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.xtext.aadl2.mcs.mcs.McsPackage;
import org.osate.xtext.aadl2.mcs.mcs.t_access_subtypes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>taccess subtypes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_access_subtypesImpl#isT_access <em>Taccess</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_access_subtypesImpl#isT_data_acc <em>Tdata acc</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_access_subtypesImpl#isT_sub_acc <em>Tsub acc</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_access_subtypesImpl#isT_sub_gr_acc <em>Tsub gr acc</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_access_subtypesImpl#isT_bus_acc <em>Tbus acc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class t_access_subtypesImpl extends t_feature_subtypesImpl implements t_access_subtypes
{
  /**
   * The default value of the '{@link #isT_access() <em>Taccess</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_access()
   * @generated
   * @ordered
   */
  protected static final boolean TACCESS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isT_access() <em>Taccess</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_access()
   * @generated
   * @ordered
   */
  protected boolean t_access = TACCESS_EDEFAULT;

  /**
   * The default value of the '{@link #isT_data_acc() <em>Tdata acc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_data_acc()
   * @generated
   * @ordered
   */
  protected static final boolean TDATA_ACC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isT_data_acc() <em>Tdata acc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_data_acc()
   * @generated
   * @ordered
   */
  protected boolean t_data_acc = TDATA_ACC_EDEFAULT;

  /**
   * The default value of the '{@link #isT_sub_acc() <em>Tsub acc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_sub_acc()
   * @generated
   * @ordered
   */
  protected static final boolean TSUB_ACC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isT_sub_acc() <em>Tsub acc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_sub_acc()
   * @generated
   * @ordered
   */
  protected boolean t_sub_acc = TSUB_ACC_EDEFAULT;

  /**
   * The default value of the '{@link #isT_sub_gr_acc() <em>Tsub gr acc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_sub_gr_acc()
   * @generated
   * @ordered
   */
  protected static final boolean TSUB_GR_ACC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isT_sub_gr_acc() <em>Tsub gr acc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_sub_gr_acc()
   * @generated
   * @ordered
   */
  protected boolean t_sub_gr_acc = TSUB_GR_ACC_EDEFAULT;

  /**
   * The default value of the '{@link #isT_bus_acc() <em>Tbus acc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_bus_acc()
   * @generated
   * @ordered
   */
  protected static final boolean TBUS_ACC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isT_bus_acc() <em>Tbus acc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_bus_acc()
   * @generated
   * @ordered
   */
  protected boolean t_bus_acc = TBUS_ACC_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected t_access_subtypesImpl()
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
    return McsPackage.Literals.TACCESS_SUBTYPES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isT_access()
  {
    return t_access;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT_access(boolean newT_access)
  {
    boolean oldT_access = t_access;
    t_access = newT_access;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TACCESS_SUBTYPES__TACCESS, oldT_access, t_access));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isT_data_acc()
  {
    return t_data_acc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT_data_acc(boolean newT_data_acc)
  {
    boolean oldT_data_acc = t_data_acc;
    t_data_acc = newT_data_acc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TACCESS_SUBTYPES__TDATA_ACC, oldT_data_acc, t_data_acc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isT_sub_acc()
  {
    return t_sub_acc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT_sub_acc(boolean newT_sub_acc)
  {
    boolean oldT_sub_acc = t_sub_acc;
    t_sub_acc = newT_sub_acc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TACCESS_SUBTYPES__TSUB_ACC, oldT_sub_acc, t_sub_acc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isT_sub_gr_acc()
  {
    return t_sub_gr_acc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT_sub_gr_acc(boolean newT_sub_gr_acc)
  {
    boolean oldT_sub_gr_acc = t_sub_gr_acc;
    t_sub_gr_acc = newT_sub_gr_acc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TACCESS_SUBTYPES__TSUB_GR_ACC, oldT_sub_gr_acc, t_sub_gr_acc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isT_bus_acc()
  {
    return t_bus_acc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT_bus_acc(boolean newT_bus_acc)
  {
    boolean oldT_bus_acc = t_bus_acc;
    t_bus_acc = newT_bus_acc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TACCESS_SUBTYPES__TBUS_ACC, oldT_bus_acc, t_bus_acc));
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
      case McsPackage.TACCESS_SUBTYPES__TACCESS:
        return isT_access();
      case McsPackage.TACCESS_SUBTYPES__TDATA_ACC:
        return isT_data_acc();
      case McsPackage.TACCESS_SUBTYPES__TSUB_ACC:
        return isT_sub_acc();
      case McsPackage.TACCESS_SUBTYPES__TSUB_GR_ACC:
        return isT_sub_gr_acc();
      case McsPackage.TACCESS_SUBTYPES__TBUS_ACC:
        return isT_bus_acc();
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
      case McsPackage.TACCESS_SUBTYPES__TACCESS:
        setT_access((Boolean)newValue);
        return;
      case McsPackage.TACCESS_SUBTYPES__TDATA_ACC:
        setT_data_acc((Boolean)newValue);
        return;
      case McsPackage.TACCESS_SUBTYPES__TSUB_ACC:
        setT_sub_acc((Boolean)newValue);
        return;
      case McsPackage.TACCESS_SUBTYPES__TSUB_GR_ACC:
        setT_sub_gr_acc((Boolean)newValue);
        return;
      case McsPackage.TACCESS_SUBTYPES__TBUS_ACC:
        setT_bus_acc((Boolean)newValue);
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
      case McsPackage.TACCESS_SUBTYPES__TACCESS:
        setT_access(TACCESS_EDEFAULT);
        return;
      case McsPackage.TACCESS_SUBTYPES__TDATA_ACC:
        setT_data_acc(TDATA_ACC_EDEFAULT);
        return;
      case McsPackage.TACCESS_SUBTYPES__TSUB_ACC:
        setT_sub_acc(TSUB_ACC_EDEFAULT);
        return;
      case McsPackage.TACCESS_SUBTYPES__TSUB_GR_ACC:
        setT_sub_gr_acc(TSUB_GR_ACC_EDEFAULT);
        return;
      case McsPackage.TACCESS_SUBTYPES__TBUS_ACC:
        setT_bus_acc(TBUS_ACC_EDEFAULT);
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
      case McsPackage.TACCESS_SUBTYPES__TACCESS:
        return t_access != TACCESS_EDEFAULT;
      case McsPackage.TACCESS_SUBTYPES__TDATA_ACC:
        return t_data_acc != TDATA_ACC_EDEFAULT;
      case McsPackage.TACCESS_SUBTYPES__TSUB_ACC:
        return t_sub_acc != TSUB_ACC_EDEFAULT;
      case McsPackage.TACCESS_SUBTYPES__TSUB_GR_ACC:
        return t_sub_gr_acc != TSUB_GR_ACC_EDEFAULT;
      case McsPackage.TACCESS_SUBTYPES__TBUS_ACC:
        return t_bus_acc != TBUS_ACC_EDEFAULT;
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
    result.append(" (t_access: ");
    result.append(t_access);
    result.append(", t_data_acc: ");
    result.append(t_data_acc);
    result.append(", t_sub_acc: ");
    result.append(t_sub_acc);
    result.append(", t_sub_gr_acc: ");
    result.append(t_sub_gr_acc);
    result.append(", t_bus_acc: ");
    result.append(t_bus_acc);
    result.append(')');
    return result.toString();
  }

} //t_access_subtypesImpl
