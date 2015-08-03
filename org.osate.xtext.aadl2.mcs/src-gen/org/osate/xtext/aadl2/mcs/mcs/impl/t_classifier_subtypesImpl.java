/**
 */
package org.osate.xtext.aadl2.mcs.mcs.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.osate.xtext.aadl2.mcs.mcs.McsPackage;
import org.osate.xtext.aadl2.mcs.mcs.t_classifier_subtypes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>tclassifier subtypes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_classifier_subtypesImpl#isT_ctype <em>Tctype</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_classifier_subtypesImpl#isT_cimpl <em>Tcimpl</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_classifier_subtypesImpl#isT_fgclass <em>Tfgclass</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_classifier_subtypesImpl#isT_annexclass <em>Tannexclass</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class t_classifier_subtypesImpl extends MinimalEObjectImpl.Container implements t_classifier_subtypes
{
  /**
   * The default value of the '{@link #isT_ctype() <em>Tctype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_ctype()
   * @generated
   * @ordered
   */
  protected static final boolean TCTYPE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isT_ctype() <em>Tctype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_ctype()
   * @generated
   * @ordered
   */
  protected boolean t_ctype = TCTYPE_EDEFAULT;

  /**
   * The default value of the '{@link #isT_cimpl() <em>Tcimpl</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_cimpl()
   * @generated
   * @ordered
   */
  protected static final boolean TCIMPL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isT_cimpl() <em>Tcimpl</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_cimpl()
   * @generated
   * @ordered
   */
  protected boolean t_cimpl = TCIMPL_EDEFAULT;

  /**
   * The default value of the '{@link #isT_fgclass() <em>Tfgclass</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_fgclass()
   * @generated
   * @ordered
   */
  protected static final boolean TFGCLASS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isT_fgclass() <em>Tfgclass</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_fgclass()
   * @generated
   * @ordered
   */
  protected boolean t_fgclass = TFGCLASS_EDEFAULT;

  /**
   * The default value of the '{@link #isT_annexclass() <em>Tannexclass</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_annexclass()
   * @generated
   * @ordered
   */
  protected static final boolean TANNEXCLASS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isT_annexclass() <em>Tannexclass</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_annexclass()
   * @generated
   * @ordered
   */
  protected boolean t_annexclass = TANNEXCLASS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected t_classifier_subtypesImpl()
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
    return McsPackage.Literals.TCLASSIFIER_SUBTYPES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isT_ctype()
  {
    return t_ctype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT_ctype(boolean newT_ctype)
  {
    boolean oldT_ctype = t_ctype;
    t_ctype = newT_ctype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TCLASSIFIER_SUBTYPES__TCTYPE, oldT_ctype, t_ctype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isT_cimpl()
  {
    return t_cimpl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT_cimpl(boolean newT_cimpl)
  {
    boolean oldT_cimpl = t_cimpl;
    t_cimpl = newT_cimpl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TCLASSIFIER_SUBTYPES__TCIMPL, oldT_cimpl, t_cimpl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isT_fgclass()
  {
    return t_fgclass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT_fgclass(boolean newT_fgclass)
  {
    boolean oldT_fgclass = t_fgclass;
    t_fgclass = newT_fgclass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TCLASSIFIER_SUBTYPES__TFGCLASS, oldT_fgclass, t_fgclass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isT_annexclass()
  {
    return t_annexclass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT_annexclass(boolean newT_annexclass)
  {
    boolean oldT_annexclass = t_annexclass;
    t_annexclass = newT_annexclass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TCLASSIFIER_SUBTYPES__TANNEXCLASS, oldT_annexclass, t_annexclass));
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
      case McsPackage.TCLASSIFIER_SUBTYPES__TCTYPE:
        return isT_ctype();
      case McsPackage.TCLASSIFIER_SUBTYPES__TCIMPL:
        return isT_cimpl();
      case McsPackage.TCLASSIFIER_SUBTYPES__TFGCLASS:
        return isT_fgclass();
      case McsPackage.TCLASSIFIER_SUBTYPES__TANNEXCLASS:
        return isT_annexclass();
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
      case McsPackage.TCLASSIFIER_SUBTYPES__TCTYPE:
        setT_ctype((Boolean)newValue);
        return;
      case McsPackage.TCLASSIFIER_SUBTYPES__TCIMPL:
        setT_cimpl((Boolean)newValue);
        return;
      case McsPackage.TCLASSIFIER_SUBTYPES__TFGCLASS:
        setT_fgclass((Boolean)newValue);
        return;
      case McsPackage.TCLASSIFIER_SUBTYPES__TANNEXCLASS:
        setT_annexclass((Boolean)newValue);
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
      case McsPackage.TCLASSIFIER_SUBTYPES__TCTYPE:
        setT_ctype(TCTYPE_EDEFAULT);
        return;
      case McsPackage.TCLASSIFIER_SUBTYPES__TCIMPL:
        setT_cimpl(TCIMPL_EDEFAULT);
        return;
      case McsPackage.TCLASSIFIER_SUBTYPES__TFGCLASS:
        setT_fgclass(TFGCLASS_EDEFAULT);
        return;
      case McsPackage.TCLASSIFIER_SUBTYPES__TANNEXCLASS:
        setT_annexclass(TANNEXCLASS_EDEFAULT);
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
      case McsPackage.TCLASSIFIER_SUBTYPES__TCTYPE:
        return t_ctype != TCTYPE_EDEFAULT;
      case McsPackage.TCLASSIFIER_SUBTYPES__TCIMPL:
        return t_cimpl != TCIMPL_EDEFAULT;
      case McsPackage.TCLASSIFIER_SUBTYPES__TFGCLASS:
        return t_fgclass != TFGCLASS_EDEFAULT;
      case McsPackage.TCLASSIFIER_SUBTYPES__TANNEXCLASS:
        return t_annexclass != TANNEXCLASS_EDEFAULT;
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
    result.append(" (t_ctype: ");
    result.append(t_ctype);
    result.append(", t_cimpl: ");
    result.append(t_cimpl);
    result.append(", t_fgclass: ");
    result.append(t_fgclass);
    result.append(", t_annexclass: ");
    result.append(t_annexclass);
    result.append(')');
    return result.toString();
  }

} //t_classifier_subtypesImpl
