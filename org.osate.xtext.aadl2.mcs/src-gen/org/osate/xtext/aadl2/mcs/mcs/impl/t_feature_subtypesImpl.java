/**
 */
package org.osate.xtext.aadl2.mcs.mcs.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.xtext.aadl2.mcs.mcs.McsPackage;
import org.osate.xtext.aadl2.mcs.mcs.t_feature_subtypes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>tfeature subtypes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_feature_subtypesImpl#isT_feat <em>Tfeat</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_feature_subtypesImpl#isT_abs_feat <em>Tabs feat</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_feature_subtypesImpl#isT_parm <em>Tparm</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_feature_subtypesImpl#isT_fg <em>Tfg</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class t_feature_subtypesImpl extends t_named_reference_subtypesImpl implements t_feature_subtypes
{
  /**
   * The default value of the '{@link #isT_feat() <em>Tfeat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_feat()
   * @generated
   * @ordered
   */
  protected static final boolean TFEAT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isT_feat() <em>Tfeat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_feat()
   * @generated
   * @ordered
   */
  protected boolean t_feat = TFEAT_EDEFAULT;

  /**
   * The default value of the '{@link #isT_abs_feat() <em>Tabs feat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_abs_feat()
   * @generated
   * @ordered
   */
  protected static final boolean TABS_FEAT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isT_abs_feat() <em>Tabs feat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_abs_feat()
   * @generated
   * @ordered
   */
  protected boolean t_abs_feat = TABS_FEAT_EDEFAULT;

  /**
   * The default value of the '{@link #isT_parm() <em>Tparm</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_parm()
   * @generated
   * @ordered
   */
  protected static final boolean TPARM_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isT_parm() <em>Tparm</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_parm()
   * @generated
   * @ordered
   */
  protected boolean t_parm = TPARM_EDEFAULT;

  /**
   * The default value of the '{@link #isT_fg() <em>Tfg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_fg()
   * @generated
   * @ordered
   */
  protected static final boolean TFG_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isT_fg() <em>Tfg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_fg()
   * @generated
   * @ordered
   */
  protected boolean t_fg = TFG_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected t_feature_subtypesImpl()
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
    return McsPackage.Literals.TFEATURE_SUBTYPES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isT_feat()
  {
    return t_feat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT_feat(boolean newT_feat)
  {
    boolean oldT_feat = t_feat;
    t_feat = newT_feat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TFEATURE_SUBTYPES__TFEAT, oldT_feat, t_feat));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isT_abs_feat()
  {
    return t_abs_feat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT_abs_feat(boolean newT_abs_feat)
  {
    boolean oldT_abs_feat = t_abs_feat;
    t_abs_feat = newT_abs_feat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TFEATURE_SUBTYPES__TABS_FEAT, oldT_abs_feat, t_abs_feat));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isT_parm()
  {
    return t_parm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT_parm(boolean newT_parm)
  {
    boolean oldT_parm = t_parm;
    t_parm = newT_parm;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TFEATURE_SUBTYPES__TPARM, oldT_parm, t_parm));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isT_fg()
  {
    return t_fg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT_fg(boolean newT_fg)
  {
    boolean oldT_fg = t_fg;
    t_fg = newT_fg;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TFEATURE_SUBTYPES__TFG, oldT_fg, t_fg));
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
      case McsPackage.TFEATURE_SUBTYPES__TFEAT:
        return isT_feat();
      case McsPackage.TFEATURE_SUBTYPES__TABS_FEAT:
        return isT_abs_feat();
      case McsPackage.TFEATURE_SUBTYPES__TPARM:
        return isT_parm();
      case McsPackage.TFEATURE_SUBTYPES__TFG:
        return isT_fg();
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
      case McsPackage.TFEATURE_SUBTYPES__TFEAT:
        setT_feat((Boolean)newValue);
        return;
      case McsPackage.TFEATURE_SUBTYPES__TABS_FEAT:
        setT_abs_feat((Boolean)newValue);
        return;
      case McsPackage.TFEATURE_SUBTYPES__TPARM:
        setT_parm((Boolean)newValue);
        return;
      case McsPackage.TFEATURE_SUBTYPES__TFG:
        setT_fg((Boolean)newValue);
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
      case McsPackage.TFEATURE_SUBTYPES__TFEAT:
        setT_feat(TFEAT_EDEFAULT);
        return;
      case McsPackage.TFEATURE_SUBTYPES__TABS_FEAT:
        setT_abs_feat(TABS_FEAT_EDEFAULT);
        return;
      case McsPackage.TFEATURE_SUBTYPES__TPARM:
        setT_parm(TPARM_EDEFAULT);
        return;
      case McsPackage.TFEATURE_SUBTYPES__TFG:
        setT_fg(TFG_EDEFAULT);
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
      case McsPackage.TFEATURE_SUBTYPES__TFEAT:
        return t_feat != TFEAT_EDEFAULT;
      case McsPackage.TFEATURE_SUBTYPES__TABS_FEAT:
        return t_abs_feat != TABS_FEAT_EDEFAULT;
      case McsPackage.TFEATURE_SUBTYPES__TPARM:
        return t_parm != TPARM_EDEFAULT;
      case McsPackage.TFEATURE_SUBTYPES__TFG:
        return t_fg != TFG_EDEFAULT;
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
    result.append(" (t_feat: ");
    result.append(t_feat);
    result.append(", t_abs_feat: ");
    result.append(t_abs_feat);
    result.append(", t_parm: ");
    result.append(t_parm);
    result.append(", t_fg: ");
    result.append(t_fg);
    result.append(')');
    return result.toString();
  }

} //t_feature_subtypesImpl
