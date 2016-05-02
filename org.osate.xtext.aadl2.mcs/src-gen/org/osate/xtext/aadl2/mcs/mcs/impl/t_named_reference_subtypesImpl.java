/**
 */
package org.osate.xtext.aadl2.mcs.mcs.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.osate.xtext.aadl2.mcs.mcs.McsPackage;
import org.osate.xtext.aadl2.mcs.mcs.t_named_reference_subtypes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>tnamed reference subtypes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_named_reference_subtypesImpl#isT_subc_st <em>Tsubc st</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_named_reference_subtypesImpl#isT_sbcall <em>Tsbcall</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_named_reference_subtypesImpl#isT_callseq <em>Tcallseq</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_named_reference_subtypesImpl#isT_eeflow <em>Teeflow</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_named_reference_subtypesImpl#isT_proto <em>Tproto</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_named_reference_subtypesImpl#isT_mode <em>Tmode</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_named_reference_subtypesImpl#isT_req_mode <em>Treq mode</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_named_reference_subtypesImpl#isT_mod_trans <em>Tmod trans</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_named_reference_subtypesImpl#isT_mode_trig <em>Tmode trig</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class t_named_reference_subtypesImpl extends MinimalEObjectImpl.Container implements t_named_reference_subtypes
{
  /**
   * The default value of the '{@link #isT_subc_st() <em>Tsubc st</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_subc_st()
   * @generated
   * @ordered
   */
  protected static final boolean TSUBC_ST_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isT_subc_st() <em>Tsubc st</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_subc_st()
   * @generated
   * @ordered
   */
  protected boolean t_subc_st = TSUBC_ST_EDEFAULT;

  /**
   * The default value of the '{@link #isT_sbcall() <em>Tsbcall</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_sbcall()
   * @generated
   * @ordered
   */
  protected static final boolean TSBCALL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isT_sbcall() <em>Tsbcall</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_sbcall()
   * @generated
   * @ordered
   */
  protected boolean t_sbcall = TSBCALL_EDEFAULT;

  /**
   * The default value of the '{@link #isT_callseq() <em>Tcallseq</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_callseq()
   * @generated
   * @ordered
   */
  protected static final boolean TCALLSEQ_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isT_callseq() <em>Tcallseq</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_callseq()
   * @generated
   * @ordered
   */
  protected boolean t_callseq = TCALLSEQ_EDEFAULT;

  /**
   * The default value of the '{@link #isT_eeflow() <em>Teeflow</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_eeflow()
   * @generated
   * @ordered
   */
  protected static final boolean TEEFLOW_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isT_eeflow() <em>Teeflow</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_eeflow()
   * @generated
   * @ordered
   */
  protected boolean t_eeflow = TEEFLOW_EDEFAULT;

  /**
   * The default value of the '{@link #isT_proto() <em>Tproto</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_proto()
   * @generated
   * @ordered
   */
  protected static final boolean TPROTO_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isT_proto() <em>Tproto</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_proto()
   * @generated
   * @ordered
   */
  protected boolean t_proto = TPROTO_EDEFAULT;

  /**
   * The default value of the '{@link #isT_mode() <em>Tmode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_mode()
   * @generated
   * @ordered
   */
  protected static final boolean TMODE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isT_mode() <em>Tmode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_mode()
   * @generated
   * @ordered
   */
  protected boolean t_mode = TMODE_EDEFAULT;

  /**
   * The default value of the '{@link #isT_req_mode() <em>Treq mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_req_mode()
   * @generated
   * @ordered
   */
  protected static final boolean TREQ_MODE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isT_req_mode() <em>Treq mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_req_mode()
   * @generated
   * @ordered
   */
  protected boolean t_req_mode = TREQ_MODE_EDEFAULT;

  /**
   * The default value of the '{@link #isT_mod_trans() <em>Tmod trans</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_mod_trans()
   * @generated
   * @ordered
   */
  protected static final boolean TMOD_TRANS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isT_mod_trans() <em>Tmod trans</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_mod_trans()
   * @generated
   * @ordered
   */
  protected boolean t_mod_trans = TMOD_TRANS_EDEFAULT;

  /**
   * The default value of the '{@link #isT_mode_trig() <em>Tmode trig</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_mode_trig()
   * @generated
   * @ordered
   */
  protected static final boolean TMODE_TRIG_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isT_mode_trig() <em>Tmode trig</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_mode_trig()
   * @generated
   * @ordered
   */
  protected boolean t_mode_trig = TMODE_TRIG_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected t_named_reference_subtypesImpl()
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
    return McsPackage.Literals.TNAMED_REFERENCE_SUBTYPES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isT_subc_st()
  {
    return t_subc_st;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT_subc_st(boolean newT_subc_st)
  {
    boolean oldT_subc_st = t_subc_st;
    t_subc_st = newT_subc_st;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TNAMED_REFERENCE_SUBTYPES__TSUBC_ST, oldT_subc_st, t_subc_st));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isT_sbcall()
  {
    return t_sbcall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT_sbcall(boolean newT_sbcall)
  {
    boolean oldT_sbcall = t_sbcall;
    t_sbcall = newT_sbcall;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TNAMED_REFERENCE_SUBTYPES__TSBCALL, oldT_sbcall, t_sbcall));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isT_callseq()
  {
    return t_callseq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT_callseq(boolean newT_callseq)
  {
    boolean oldT_callseq = t_callseq;
    t_callseq = newT_callseq;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TNAMED_REFERENCE_SUBTYPES__TCALLSEQ, oldT_callseq, t_callseq));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isT_eeflow()
  {
    return t_eeflow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT_eeflow(boolean newT_eeflow)
  {
    boolean oldT_eeflow = t_eeflow;
    t_eeflow = newT_eeflow;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TNAMED_REFERENCE_SUBTYPES__TEEFLOW, oldT_eeflow, t_eeflow));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isT_proto()
  {
    return t_proto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT_proto(boolean newT_proto)
  {
    boolean oldT_proto = t_proto;
    t_proto = newT_proto;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TNAMED_REFERENCE_SUBTYPES__TPROTO, oldT_proto, t_proto));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isT_mode()
  {
    return t_mode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT_mode(boolean newT_mode)
  {
    boolean oldT_mode = t_mode;
    t_mode = newT_mode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TNAMED_REFERENCE_SUBTYPES__TMODE, oldT_mode, t_mode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isT_req_mode()
  {
    return t_req_mode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT_req_mode(boolean newT_req_mode)
  {
    boolean oldT_req_mode = t_req_mode;
    t_req_mode = newT_req_mode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TNAMED_REFERENCE_SUBTYPES__TREQ_MODE, oldT_req_mode, t_req_mode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isT_mod_trans()
  {
    return t_mod_trans;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT_mod_trans(boolean newT_mod_trans)
  {
    boolean oldT_mod_trans = t_mod_trans;
    t_mod_trans = newT_mod_trans;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TNAMED_REFERENCE_SUBTYPES__TMOD_TRANS, oldT_mod_trans, t_mod_trans));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isT_mode_trig()
  {
    return t_mode_trig;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT_mode_trig(boolean newT_mode_trig)
  {
    boolean oldT_mode_trig = t_mode_trig;
    t_mode_trig = newT_mode_trig;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TNAMED_REFERENCE_SUBTYPES__TMODE_TRIG, oldT_mode_trig, t_mode_trig));
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
      case McsPackage.TNAMED_REFERENCE_SUBTYPES__TSUBC_ST:
        return isT_subc_st();
      case McsPackage.TNAMED_REFERENCE_SUBTYPES__TSBCALL:
        return isT_sbcall();
      case McsPackage.TNAMED_REFERENCE_SUBTYPES__TCALLSEQ:
        return isT_callseq();
      case McsPackage.TNAMED_REFERENCE_SUBTYPES__TEEFLOW:
        return isT_eeflow();
      case McsPackage.TNAMED_REFERENCE_SUBTYPES__TPROTO:
        return isT_proto();
      case McsPackage.TNAMED_REFERENCE_SUBTYPES__TMODE:
        return isT_mode();
      case McsPackage.TNAMED_REFERENCE_SUBTYPES__TREQ_MODE:
        return isT_req_mode();
      case McsPackage.TNAMED_REFERENCE_SUBTYPES__TMOD_TRANS:
        return isT_mod_trans();
      case McsPackage.TNAMED_REFERENCE_SUBTYPES__TMODE_TRIG:
        return isT_mode_trig();
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
      case McsPackage.TNAMED_REFERENCE_SUBTYPES__TSUBC_ST:
        setT_subc_st((Boolean)newValue);
        return;
      case McsPackage.TNAMED_REFERENCE_SUBTYPES__TSBCALL:
        setT_sbcall((Boolean)newValue);
        return;
      case McsPackage.TNAMED_REFERENCE_SUBTYPES__TCALLSEQ:
        setT_callseq((Boolean)newValue);
        return;
      case McsPackage.TNAMED_REFERENCE_SUBTYPES__TEEFLOW:
        setT_eeflow((Boolean)newValue);
        return;
      case McsPackage.TNAMED_REFERENCE_SUBTYPES__TPROTO:
        setT_proto((Boolean)newValue);
        return;
      case McsPackage.TNAMED_REFERENCE_SUBTYPES__TMODE:
        setT_mode((Boolean)newValue);
        return;
      case McsPackage.TNAMED_REFERENCE_SUBTYPES__TREQ_MODE:
        setT_req_mode((Boolean)newValue);
        return;
      case McsPackage.TNAMED_REFERENCE_SUBTYPES__TMOD_TRANS:
        setT_mod_trans((Boolean)newValue);
        return;
      case McsPackage.TNAMED_REFERENCE_SUBTYPES__TMODE_TRIG:
        setT_mode_trig((Boolean)newValue);
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
      case McsPackage.TNAMED_REFERENCE_SUBTYPES__TSUBC_ST:
        setT_subc_st(TSUBC_ST_EDEFAULT);
        return;
      case McsPackage.TNAMED_REFERENCE_SUBTYPES__TSBCALL:
        setT_sbcall(TSBCALL_EDEFAULT);
        return;
      case McsPackage.TNAMED_REFERENCE_SUBTYPES__TCALLSEQ:
        setT_callseq(TCALLSEQ_EDEFAULT);
        return;
      case McsPackage.TNAMED_REFERENCE_SUBTYPES__TEEFLOW:
        setT_eeflow(TEEFLOW_EDEFAULT);
        return;
      case McsPackage.TNAMED_REFERENCE_SUBTYPES__TPROTO:
        setT_proto(TPROTO_EDEFAULT);
        return;
      case McsPackage.TNAMED_REFERENCE_SUBTYPES__TMODE:
        setT_mode(TMODE_EDEFAULT);
        return;
      case McsPackage.TNAMED_REFERENCE_SUBTYPES__TREQ_MODE:
        setT_req_mode(TREQ_MODE_EDEFAULT);
        return;
      case McsPackage.TNAMED_REFERENCE_SUBTYPES__TMOD_TRANS:
        setT_mod_trans(TMOD_TRANS_EDEFAULT);
        return;
      case McsPackage.TNAMED_REFERENCE_SUBTYPES__TMODE_TRIG:
        setT_mode_trig(TMODE_TRIG_EDEFAULT);
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
      case McsPackage.TNAMED_REFERENCE_SUBTYPES__TSUBC_ST:
        return t_subc_st != TSUBC_ST_EDEFAULT;
      case McsPackage.TNAMED_REFERENCE_SUBTYPES__TSBCALL:
        return t_sbcall != TSBCALL_EDEFAULT;
      case McsPackage.TNAMED_REFERENCE_SUBTYPES__TCALLSEQ:
        return t_callseq != TCALLSEQ_EDEFAULT;
      case McsPackage.TNAMED_REFERENCE_SUBTYPES__TEEFLOW:
        return t_eeflow != TEEFLOW_EDEFAULT;
      case McsPackage.TNAMED_REFERENCE_SUBTYPES__TPROTO:
        return t_proto != TPROTO_EDEFAULT;
      case McsPackage.TNAMED_REFERENCE_SUBTYPES__TMODE:
        return t_mode != TMODE_EDEFAULT;
      case McsPackage.TNAMED_REFERENCE_SUBTYPES__TREQ_MODE:
        return t_req_mode != TREQ_MODE_EDEFAULT;
      case McsPackage.TNAMED_REFERENCE_SUBTYPES__TMOD_TRANS:
        return t_mod_trans != TMOD_TRANS_EDEFAULT;
      case McsPackage.TNAMED_REFERENCE_SUBTYPES__TMODE_TRIG:
        return t_mode_trig != TMODE_TRIG_EDEFAULT;
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
    result.append(" (t_subc_st: ");
    result.append(t_subc_st);
    result.append(", t_sbcall: ");
    result.append(t_sbcall);
    result.append(", t_callseq: ");
    result.append(t_callseq);
    result.append(", t_eeflow: ");
    result.append(t_eeflow);
    result.append(", t_proto: ");
    result.append(t_proto);
    result.append(", t_mode: ");
    result.append(t_mode);
    result.append(", t_req_mode: ");
    result.append(t_req_mode);
    result.append(", t_mod_trans: ");
    result.append(t_mod_trans);
    result.append(", t_mode_trig: ");
    result.append(t_mode_trig);
    result.append(')');
    return result.toString();
  }

} //t_named_reference_subtypesImpl
