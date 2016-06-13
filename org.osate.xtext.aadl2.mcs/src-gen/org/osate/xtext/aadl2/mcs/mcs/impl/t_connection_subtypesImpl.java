/**
 */
package org.osate.xtext.aadl2.mcs.mcs.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.xtext.aadl2.mcs.mcs.McsPackage;
import org.osate.xtext.aadl2.mcs.mcs.t_connection_subtypes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>tconnection subtypes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_connection_subtypesImpl#isT_conn <em>Tconn</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_connection_subtypesImpl#isT_feat_conn <em>Tfeat conn</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_connection_subtypesImpl#isT_port_conn <em>Tport conn</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_connection_subtypesImpl#isT_parm_conn <em>Tparm conn</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_connection_subtypesImpl#isT_acc_con <em>Tacc con</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_connection_subtypesImpl#isT_fg_conn <em>Tfg conn</em>}</li>
 * </ul>
 *
 * @generated
 */
public class t_connection_subtypesImpl extends t_instance_subtypesImpl implements t_connection_subtypes
{
  /**
   * The default value of the '{@link #isT_conn() <em>Tconn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_conn()
   * @generated
   * @ordered
   */
  protected static final boolean TCONN_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isT_conn() <em>Tconn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_conn()
   * @generated
   * @ordered
   */
  protected boolean t_conn = TCONN_EDEFAULT;

  /**
   * The default value of the '{@link #isT_feat_conn() <em>Tfeat conn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_feat_conn()
   * @generated
   * @ordered
   */
  protected static final boolean TFEAT_CONN_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isT_feat_conn() <em>Tfeat conn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_feat_conn()
   * @generated
   * @ordered
   */
  protected boolean t_feat_conn = TFEAT_CONN_EDEFAULT;

  /**
   * The default value of the '{@link #isT_port_conn() <em>Tport conn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_port_conn()
   * @generated
   * @ordered
   */
  protected static final boolean TPORT_CONN_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isT_port_conn() <em>Tport conn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_port_conn()
   * @generated
   * @ordered
   */
  protected boolean t_port_conn = TPORT_CONN_EDEFAULT;

  /**
   * The default value of the '{@link #isT_parm_conn() <em>Tparm conn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_parm_conn()
   * @generated
   * @ordered
   */
  protected static final boolean TPARM_CONN_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isT_parm_conn() <em>Tparm conn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_parm_conn()
   * @generated
   * @ordered
   */
  protected boolean t_parm_conn = TPARM_CONN_EDEFAULT;

  /**
   * The default value of the '{@link #isT_acc_con() <em>Tacc con</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_acc_con()
   * @generated
   * @ordered
   */
  protected static final boolean TACC_CON_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isT_acc_con() <em>Tacc con</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_acc_con()
   * @generated
   * @ordered
   */
  protected boolean t_acc_con = TACC_CON_EDEFAULT;

  /**
   * The default value of the '{@link #isT_fg_conn() <em>Tfg conn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_fg_conn()
   * @generated
   * @ordered
   */
  protected static final boolean TFG_CONN_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isT_fg_conn() <em>Tfg conn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_fg_conn()
   * @generated
   * @ordered
   */
  protected boolean t_fg_conn = TFG_CONN_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected t_connection_subtypesImpl()
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
    return McsPackage.Literals.TCONNECTION_SUBTYPES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isT_conn()
  {
    return t_conn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT_conn(boolean newT_conn)
  {
    boolean oldT_conn = t_conn;
    t_conn = newT_conn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TCONNECTION_SUBTYPES__TCONN, oldT_conn, t_conn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isT_feat_conn()
  {
    return t_feat_conn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT_feat_conn(boolean newT_feat_conn)
  {
    boolean oldT_feat_conn = t_feat_conn;
    t_feat_conn = newT_feat_conn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TCONNECTION_SUBTYPES__TFEAT_CONN, oldT_feat_conn, t_feat_conn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isT_port_conn()
  {
    return t_port_conn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT_port_conn(boolean newT_port_conn)
  {
    boolean oldT_port_conn = t_port_conn;
    t_port_conn = newT_port_conn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TCONNECTION_SUBTYPES__TPORT_CONN, oldT_port_conn, t_port_conn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isT_parm_conn()
  {
    return t_parm_conn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT_parm_conn(boolean newT_parm_conn)
  {
    boolean oldT_parm_conn = t_parm_conn;
    t_parm_conn = newT_parm_conn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TCONNECTION_SUBTYPES__TPARM_CONN, oldT_parm_conn, t_parm_conn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isT_acc_con()
  {
    return t_acc_con;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT_acc_con(boolean newT_acc_con)
  {
    boolean oldT_acc_con = t_acc_con;
    t_acc_con = newT_acc_con;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TCONNECTION_SUBTYPES__TACC_CON, oldT_acc_con, t_acc_con));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isT_fg_conn()
  {
    return t_fg_conn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT_fg_conn(boolean newT_fg_conn)
  {
    boolean oldT_fg_conn = t_fg_conn;
    t_fg_conn = newT_fg_conn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TCONNECTION_SUBTYPES__TFG_CONN, oldT_fg_conn, t_fg_conn));
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
      case McsPackage.TCONNECTION_SUBTYPES__TCONN:
        return isT_conn();
      case McsPackage.TCONNECTION_SUBTYPES__TFEAT_CONN:
        return isT_feat_conn();
      case McsPackage.TCONNECTION_SUBTYPES__TPORT_CONN:
        return isT_port_conn();
      case McsPackage.TCONNECTION_SUBTYPES__TPARM_CONN:
        return isT_parm_conn();
      case McsPackage.TCONNECTION_SUBTYPES__TACC_CON:
        return isT_acc_con();
      case McsPackage.TCONNECTION_SUBTYPES__TFG_CONN:
        return isT_fg_conn();
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
      case McsPackage.TCONNECTION_SUBTYPES__TCONN:
        setT_conn((Boolean)newValue);
        return;
      case McsPackage.TCONNECTION_SUBTYPES__TFEAT_CONN:
        setT_feat_conn((Boolean)newValue);
        return;
      case McsPackage.TCONNECTION_SUBTYPES__TPORT_CONN:
        setT_port_conn((Boolean)newValue);
        return;
      case McsPackage.TCONNECTION_SUBTYPES__TPARM_CONN:
        setT_parm_conn((Boolean)newValue);
        return;
      case McsPackage.TCONNECTION_SUBTYPES__TACC_CON:
        setT_acc_con((Boolean)newValue);
        return;
      case McsPackage.TCONNECTION_SUBTYPES__TFG_CONN:
        setT_fg_conn((Boolean)newValue);
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
      case McsPackage.TCONNECTION_SUBTYPES__TCONN:
        setT_conn(TCONN_EDEFAULT);
        return;
      case McsPackage.TCONNECTION_SUBTYPES__TFEAT_CONN:
        setT_feat_conn(TFEAT_CONN_EDEFAULT);
        return;
      case McsPackage.TCONNECTION_SUBTYPES__TPORT_CONN:
        setT_port_conn(TPORT_CONN_EDEFAULT);
        return;
      case McsPackage.TCONNECTION_SUBTYPES__TPARM_CONN:
        setT_parm_conn(TPARM_CONN_EDEFAULT);
        return;
      case McsPackage.TCONNECTION_SUBTYPES__TACC_CON:
        setT_acc_con(TACC_CON_EDEFAULT);
        return;
      case McsPackage.TCONNECTION_SUBTYPES__TFG_CONN:
        setT_fg_conn(TFG_CONN_EDEFAULT);
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
      case McsPackage.TCONNECTION_SUBTYPES__TCONN:
        return t_conn != TCONN_EDEFAULT;
      case McsPackage.TCONNECTION_SUBTYPES__TFEAT_CONN:
        return t_feat_conn != TFEAT_CONN_EDEFAULT;
      case McsPackage.TCONNECTION_SUBTYPES__TPORT_CONN:
        return t_port_conn != TPORT_CONN_EDEFAULT;
      case McsPackage.TCONNECTION_SUBTYPES__TPARM_CONN:
        return t_parm_conn != TPARM_CONN_EDEFAULT;
      case McsPackage.TCONNECTION_SUBTYPES__TACC_CON:
        return t_acc_con != TACC_CON_EDEFAULT;
      case McsPackage.TCONNECTION_SUBTYPES__TFG_CONN:
        return t_fg_conn != TFG_CONN_EDEFAULT;
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
    result.append(" (t_conn: ");
    result.append(t_conn);
    result.append(", t_feat_conn: ");
    result.append(t_feat_conn);
    result.append(", t_port_conn: ");
    result.append(t_port_conn);
    result.append(", t_parm_conn: ");
    result.append(t_parm_conn);
    result.append(", t_acc_con: ");
    result.append(t_acc_con);
    result.append(", t_fg_conn: ");
    result.append(t_fg_conn);
    result.append(')');
    return result.toString();
  }

} //t_connection_subtypesImpl
