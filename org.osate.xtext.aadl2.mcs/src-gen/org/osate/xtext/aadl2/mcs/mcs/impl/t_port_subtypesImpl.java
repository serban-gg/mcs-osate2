/**
 */
package org.osate.xtext.aadl2.mcs.mcs.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.xtext.aadl2.mcs.mcs.McsPackage;
import org.osate.xtext.aadl2.mcs.mcs.t_port_subtypes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>tport subtypes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_port_subtypesImpl#isT_port <em>Tport</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_port_subtypesImpl#isT_d_port <em>Tdport</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_port_subtypesImpl#isT_ev_port <em>Tev port</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_port_subtypesImpl#isT_evd_port <em>Tevd port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class t_port_subtypesImpl extends t_feature_subtypesImpl implements t_port_subtypes
{
  /**
   * The default value of the '{@link #isT_port() <em>Tport</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_port()
   * @generated
   * @ordered
   */
  protected static final boolean TPORT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isT_port() <em>Tport</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_port()
   * @generated
   * @ordered
   */
  protected boolean t_port = TPORT_EDEFAULT;

  /**
   * The default value of the '{@link #isT_d_port() <em>Tdport</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_d_port()
   * @generated
   * @ordered
   */
  protected static final boolean TDPORT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isT_d_port() <em>Tdport</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_d_port()
   * @generated
   * @ordered
   */
  protected boolean t_d_port = TDPORT_EDEFAULT;

  /**
   * The default value of the '{@link #isT_ev_port() <em>Tev port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_ev_port()
   * @generated
   * @ordered
   */
  protected static final boolean TEV_PORT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isT_ev_port() <em>Tev port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_ev_port()
   * @generated
   * @ordered
   */
  protected boolean t_ev_port = TEV_PORT_EDEFAULT;

  /**
   * The default value of the '{@link #isT_evd_port() <em>Tevd port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_evd_port()
   * @generated
   * @ordered
   */
  protected static final boolean TEVD_PORT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isT_evd_port() <em>Tevd port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_evd_port()
   * @generated
   * @ordered
   */
  protected boolean t_evd_port = TEVD_PORT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected t_port_subtypesImpl()
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
    return McsPackage.Literals.TPORT_SUBTYPES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isT_port()
  {
    return t_port;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT_port(boolean newT_port)
  {
    boolean oldT_port = t_port;
    t_port = newT_port;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TPORT_SUBTYPES__TPORT, oldT_port, t_port));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isT_d_port()
  {
    return t_d_port;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT_d_port(boolean newT_d_port)
  {
    boolean oldT_d_port = t_d_port;
    t_d_port = newT_d_port;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TPORT_SUBTYPES__TDPORT, oldT_d_port, t_d_port));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isT_ev_port()
  {
    return t_ev_port;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT_ev_port(boolean newT_ev_port)
  {
    boolean oldT_ev_port = t_ev_port;
    t_ev_port = newT_ev_port;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TPORT_SUBTYPES__TEV_PORT, oldT_ev_port, t_ev_port));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isT_evd_port()
  {
    return t_evd_port;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT_evd_port(boolean newT_evd_port)
  {
    boolean oldT_evd_port = t_evd_port;
    t_evd_port = newT_evd_port;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TPORT_SUBTYPES__TEVD_PORT, oldT_evd_port, t_evd_port));
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
      case McsPackage.TPORT_SUBTYPES__TPORT:
        return isT_port();
      case McsPackage.TPORT_SUBTYPES__TDPORT:
        return isT_d_port();
      case McsPackage.TPORT_SUBTYPES__TEV_PORT:
        return isT_ev_port();
      case McsPackage.TPORT_SUBTYPES__TEVD_PORT:
        return isT_evd_port();
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
      case McsPackage.TPORT_SUBTYPES__TPORT:
        setT_port((Boolean)newValue);
        return;
      case McsPackage.TPORT_SUBTYPES__TDPORT:
        setT_d_port((Boolean)newValue);
        return;
      case McsPackage.TPORT_SUBTYPES__TEV_PORT:
        setT_ev_port((Boolean)newValue);
        return;
      case McsPackage.TPORT_SUBTYPES__TEVD_PORT:
        setT_evd_port((Boolean)newValue);
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
      case McsPackage.TPORT_SUBTYPES__TPORT:
        setT_port(TPORT_EDEFAULT);
        return;
      case McsPackage.TPORT_SUBTYPES__TDPORT:
        setT_d_port(TDPORT_EDEFAULT);
        return;
      case McsPackage.TPORT_SUBTYPES__TEV_PORT:
        setT_ev_port(TEV_PORT_EDEFAULT);
        return;
      case McsPackage.TPORT_SUBTYPES__TEVD_PORT:
        setT_evd_port(TEVD_PORT_EDEFAULT);
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
      case McsPackage.TPORT_SUBTYPES__TPORT:
        return t_port != TPORT_EDEFAULT;
      case McsPackage.TPORT_SUBTYPES__TDPORT:
        return t_d_port != TDPORT_EDEFAULT;
      case McsPackage.TPORT_SUBTYPES__TEV_PORT:
        return t_ev_port != TEV_PORT_EDEFAULT;
      case McsPackage.TPORT_SUBTYPES__TEVD_PORT:
        return t_evd_port != TEVD_PORT_EDEFAULT;
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
    result.append(" (t_port: ");
    result.append(t_port);
    result.append(", t_d_port: ");
    result.append(t_d_port);
    result.append(", t_ev_port: ");
    result.append(t_ev_port);
    result.append(", t_evd_port: ");
    result.append(t_evd_port);
    result.append(')');
    return result.toString();
  }

} //t_port_subtypesImpl
