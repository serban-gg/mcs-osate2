/**
 */
package org.osate.xtext.aadl2.mcs.mcs.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.xtext.aadl2.mcs.mcs.McsPackage;
import org.osate.xtext.aadl2.mcs.mcs.t_flow_spec_subtypes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>tflow spec subtypes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_flow_spec_subtypesImpl#isT_f_spec <em>Tfspec</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_flow_spec_subtypesImpl#isT_f_spec_source <em>Tfspec source</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_flow_spec_subtypesImpl#isT_f_spec_sink <em>Tfspec sink</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_flow_spec_subtypesImpl#isT_f_spec_path <em>Tfspec path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class t_flow_spec_subtypesImpl extends t_instance_subtypesImpl implements t_flow_spec_subtypes
{
  /**
   * The default value of the '{@link #isT_f_spec() <em>Tfspec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_f_spec()
   * @generated
   * @ordered
   */
  protected static final boolean TFSPEC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isT_f_spec() <em>Tfspec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_f_spec()
   * @generated
   * @ordered
   */
  protected boolean t_f_spec = TFSPEC_EDEFAULT;

  /**
   * The default value of the '{@link #isT_f_spec_source() <em>Tfspec source</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_f_spec_source()
   * @generated
   * @ordered
   */
  protected static final boolean TFSPEC_SOURCE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isT_f_spec_source() <em>Tfspec source</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_f_spec_source()
   * @generated
   * @ordered
   */
  protected boolean t_f_spec_source = TFSPEC_SOURCE_EDEFAULT;

  /**
   * The default value of the '{@link #isT_f_spec_sink() <em>Tfspec sink</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_f_spec_sink()
   * @generated
   * @ordered
   */
  protected static final boolean TFSPEC_SINK_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isT_f_spec_sink() <em>Tfspec sink</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_f_spec_sink()
   * @generated
   * @ordered
   */
  protected boolean t_f_spec_sink = TFSPEC_SINK_EDEFAULT;

  /**
   * The default value of the '{@link #isT_f_spec_path() <em>Tfspec path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_f_spec_path()
   * @generated
   * @ordered
   */
  protected static final boolean TFSPEC_PATH_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isT_f_spec_path() <em>Tfspec path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_f_spec_path()
   * @generated
   * @ordered
   */
  protected boolean t_f_spec_path = TFSPEC_PATH_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected t_flow_spec_subtypesImpl()
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
    return McsPackage.Literals.TFLOW_SPEC_SUBTYPES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isT_f_spec()
  {
    return t_f_spec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT_f_spec(boolean newT_f_spec)
  {
    boolean oldT_f_spec = t_f_spec;
    t_f_spec = newT_f_spec;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TFLOW_SPEC_SUBTYPES__TFSPEC, oldT_f_spec, t_f_spec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isT_f_spec_source()
  {
    return t_f_spec_source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT_f_spec_source(boolean newT_f_spec_source)
  {
    boolean oldT_f_spec_source = t_f_spec_source;
    t_f_spec_source = newT_f_spec_source;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TFLOW_SPEC_SUBTYPES__TFSPEC_SOURCE, oldT_f_spec_source, t_f_spec_source));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isT_f_spec_sink()
  {
    return t_f_spec_sink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT_f_spec_sink(boolean newT_f_spec_sink)
  {
    boolean oldT_f_spec_sink = t_f_spec_sink;
    t_f_spec_sink = newT_f_spec_sink;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TFLOW_SPEC_SUBTYPES__TFSPEC_SINK, oldT_f_spec_sink, t_f_spec_sink));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isT_f_spec_path()
  {
    return t_f_spec_path;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT_f_spec_path(boolean newT_f_spec_path)
  {
    boolean oldT_f_spec_path = t_f_spec_path;
    t_f_spec_path = newT_f_spec_path;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TFLOW_SPEC_SUBTYPES__TFSPEC_PATH, oldT_f_spec_path, t_f_spec_path));
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
      case McsPackage.TFLOW_SPEC_SUBTYPES__TFSPEC:
        return isT_f_spec();
      case McsPackage.TFLOW_SPEC_SUBTYPES__TFSPEC_SOURCE:
        return isT_f_spec_source();
      case McsPackage.TFLOW_SPEC_SUBTYPES__TFSPEC_SINK:
        return isT_f_spec_sink();
      case McsPackage.TFLOW_SPEC_SUBTYPES__TFSPEC_PATH:
        return isT_f_spec_path();
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
      case McsPackage.TFLOW_SPEC_SUBTYPES__TFSPEC:
        setT_f_spec((Boolean)newValue);
        return;
      case McsPackage.TFLOW_SPEC_SUBTYPES__TFSPEC_SOURCE:
        setT_f_spec_source((Boolean)newValue);
        return;
      case McsPackage.TFLOW_SPEC_SUBTYPES__TFSPEC_SINK:
        setT_f_spec_sink((Boolean)newValue);
        return;
      case McsPackage.TFLOW_SPEC_SUBTYPES__TFSPEC_PATH:
        setT_f_spec_path((Boolean)newValue);
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
      case McsPackage.TFLOW_SPEC_SUBTYPES__TFSPEC:
        setT_f_spec(TFSPEC_EDEFAULT);
        return;
      case McsPackage.TFLOW_SPEC_SUBTYPES__TFSPEC_SOURCE:
        setT_f_spec_source(TFSPEC_SOURCE_EDEFAULT);
        return;
      case McsPackage.TFLOW_SPEC_SUBTYPES__TFSPEC_SINK:
        setT_f_spec_sink(TFSPEC_SINK_EDEFAULT);
        return;
      case McsPackage.TFLOW_SPEC_SUBTYPES__TFSPEC_PATH:
        setT_f_spec_path(TFSPEC_PATH_EDEFAULT);
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
      case McsPackage.TFLOW_SPEC_SUBTYPES__TFSPEC:
        return t_f_spec != TFSPEC_EDEFAULT;
      case McsPackage.TFLOW_SPEC_SUBTYPES__TFSPEC_SOURCE:
        return t_f_spec_source != TFSPEC_SOURCE_EDEFAULT;
      case McsPackage.TFLOW_SPEC_SUBTYPES__TFSPEC_SINK:
        return t_f_spec_sink != TFSPEC_SINK_EDEFAULT;
      case McsPackage.TFLOW_SPEC_SUBTYPES__TFSPEC_PATH:
        return t_f_spec_path != TFSPEC_PATH_EDEFAULT;
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
    result.append(" (t_f_spec: ");
    result.append(t_f_spec);
    result.append(", t_f_spec_source: ");
    result.append(t_f_spec_source);
    result.append(", t_f_spec_sink: ");
    result.append(t_f_spec_sink);
    result.append(", t_f_spec_path: ");
    result.append(t_f_spec_path);
    result.append(')');
    return result.toString();
  }

} //t_flow_spec_subtypesImpl
