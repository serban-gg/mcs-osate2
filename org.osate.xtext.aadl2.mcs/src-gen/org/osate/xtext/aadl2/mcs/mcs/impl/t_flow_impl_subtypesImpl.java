/**
 */
package org.osate.xtext.aadl2.mcs.mcs.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.xtext.aadl2.mcs.mcs.McsPackage;
import org.osate.xtext.aadl2.mcs.mcs.t_flow_impl_subtypes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>tflow impl subtypes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_flow_impl_subtypesImpl#isT_f_i <em>Tfi</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_flow_impl_subtypesImpl#isT_f_i_source <em>Tfisource</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_flow_impl_subtypesImpl#isT_f_i_sink <em>Tfisink</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_flow_impl_subtypesImpl#isT_f_i_path <em>Tfipath</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class t_flow_impl_subtypesImpl extends t_instance_subtypesImpl implements t_flow_impl_subtypes
{
  /**
   * The default value of the '{@link #isT_f_i() <em>Tfi</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_f_i()
   * @generated
   * @ordered
   */
  protected static final boolean TFI_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isT_f_i() <em>Tfi</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_f_i()
   * @generated
   * @ordered
   */
  protected boolean t_f_i = TFI_EDEFAULT;

  /**
   * The default value of the '{@link #isT_f_i_source() <em>Tfisource</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_f_i_source()
   * @generated
   * @ordered
   */
  protected static final boolean TFISOURCE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isT_f_i_source() <em>Tfisource</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_f_i_source()
   * @generated
   * @ordered
   */
  protected boolean t_f_i_source = TFISOURCE_EDEFAULT;

  /**
   * The default value of the '{@link #isT_f_i_sink() <em>Tfisink</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_f_i_sink()
   * @generated
   * @ordered
   */
  protected static final boolean TFISINK_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isT_f_i_sink() <em>Tfisink</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_f_i_sink()
   * @generated
   * @ordered
   */
  protected boolean t_f_i_sink = TFISINK_EDEFAULT;

  /**
   * The default value of the '{@link #isT_f_i_path() <em>Tfipath</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_f_i_path()
   * @generated
   * @ordered
   */
  protected static final boolean TFIPATH_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isT_f_i_path() <em>Tfipath</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_f_i_path()
   * @generated
   * @ordered
   */
  protected boolean t_f_i_path = TFIPATH_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected t_flow_impl_subtypesImpl()
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
    return McsPackage.Literals.TFLOW_IMPL_SUBTYPES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isT_f_i()
  {
    return t_f_i;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT_f_i(boolean newT_f_i)
  {
    boolean oldT_f_i = t_f_i;
    t_f_i = newT_f_i;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TFLOW_IMPL_SUBTYPES__TFI, oldT_f_i, t_f_i));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isT_f_i_source()
  {
    return t_f_i_source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT_f_i_source(boolean newT_f_i_source)
  {
    boolean oldT_f_i_source = t_f_i_source;
    t_f_i_source = newT_f_i_source;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TFLOW_IMPL_SUBTYPES__TFISOURCE, oldT_f_i_source, t_f_i_source));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isT_f_i_sink()
  {
    return t_f_i_sink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT_f_i_sink(boolean newT_f_i_sink)
  {
    boolean oldT_f_i_sink = t_f_i_sink;
    t_f_i_sink = newT_f_i_sink;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TFLOW_IMPL_SUBTYPES__TFISINK, oldT_f_i_sink, t_f_i_sink));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isT_f_i_path()
  {
    return t_f_i_path;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT_f_i_path(boolean newT_f_i_path)
  {
    boolean oldT_f_i_path = t_f_i_path;
    t_f_i_path = newT_f_i_path;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TFLOW_IMPL_SUBTYPES__TFIPATH, oldT_f_i_path, t_f_i_path));
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
      case McsPackage.TFLOW_IMPL_SUBTYPES__TFI:
        return isT_f_i();
      case McsPackage.TFLOW_IMPL_SUBTYPES__TFISOURCE:
        return isT_f_i_source();
      case McsPackage.TFLOW_IMPL_SUBTYPES__TFISINK:
        return isT_f_i_sink();
      case McsPackage.TFLOW_IMPL_SUBTYPES__TFIPATH:
        return isT_f_i_path();
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
      case McsPackage.TFLOW_IMPL_SUBTYPES__TFI:
        setT_f_i((Boolean)newValue);
        return;
      case McsPackage.TFLOW_IMPL_SUBTYPES__TFISOURCE:
        setT_f_i_source((Boolean)newValue);
        return;
      case McsPackage.TFLOW_IMPL_SUBTYPES__TFISINK:
        setT_f_i_sink((Boolean)newValue);
        return;
      case McsPackage.TFLOW_IMPL_SUBTYPES__TFIPATH:
        setT_f_i_path((Boolean)newValue);
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
      case McsPackage.TFLOW_IMPL_SUBTYPES__TFI:
        setT_f_i(TFI_EDEFAULT);
        return;
      case McsPackage.TFLOW_IMPL_SUBTYPES__TFISOURCE:
        setT_f_i_source(TFISOURCE_EDEFAULT);
        return;
      case McsPackage.TFLOW_IMPL_SUBTYPES__TFISINK:
        setT_f_i_sink(TFISINK_EDEFAULT);
        return;
      case McsPackage.TFLOW_IMPL_SUBTYPES__TFIPATH:
        setT_f_i_path(TFIPATH_EDEFAULT);
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
      case McsPackage.TFLOW_IMPL_SUBTYPES__TFI:
        return t_f_i != TFI_EDEFAULT;
      case McsPackage.TFLOW_IMPL_SUBTYPES__TFISOURCE:
        return t_f_i_source != TFISOURCE_EDEFAULT;
      case McsPackage.TFLOW_IMPL_SUBTYPES__TFISINK:
        return t_f_i_sink != TFISINK_EDEFAULT;
      case McsPackage.TFLOW_IMPL_SUBTYPES__TFIPATH:
        return t_f_i_path != TFIPATH_EDEFAULT;
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
    result.append(" (t_f_i: ");
    result.append(t_f_i);
    result.append(", t_f_i_source: ");
    result.append(t_f_i_source);
    result.append(", t_f_i_sink: ");
    result.append(t_f_i_sink);
    result.append(", t_f_i_path: ");
    result.append(t_f_i_path);
    result.append(')');
    return result.toString();
  }

} //t_flow_impl_subtypesImpl
