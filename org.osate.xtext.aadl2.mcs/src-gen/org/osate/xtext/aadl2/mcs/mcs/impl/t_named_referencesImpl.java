/**
 */
package org.osate.xtext.aadl2.mcs.mcs.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.osate.xtext.aadl2.mcs.mcs.McsPackage;
import org.osate.xtext.aadl2.mcs.mcs.t_named_references;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>tnamed references</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_named_referencesImpl#isT_nref <em>Tnref</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_named_referencesImpl#isT_nref_st <em>Tnref st</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class t_named_referencesImpl extends MinimalEObjectImpl.Container implements t_named_references
{
  /**
   * The default value of the '{@link #isT_nref() <em>Tnref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_nref()
   * @generated
   * @ordered
   */
  protected static final boolean TNREF_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isT_nref() <em>Tnref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_nref()
   * @generated
   * @ordered
   */
  protected boolean t_nref = TNREF_EDEFAULT;

  /**
   * The default value of the '{@link #isT_nref_st() <em>Tnref st</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_nref_st()
   * @generated
   * @ordered
   */
  protected static final boolean TNREF_ST_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isT_nref_st() <em>Tnref st</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_nref_st()
   * @generated
   * @ordered
   */
  protected boolean t_nref_st = TNREF_ST_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected t_named_referencesImpl()
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
    return McsPackage.Literals.TNAMED_REFERENCES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isT_nref()
  {
    return t_nref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT_nref(boolean newT_nref)
  {
    boolean oldT_nref = t_nref;
    t_nref = newT_nref;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TNAMED_REFERENCES__TNREF, oldT_nref, t_nref));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isT_nref_st()
  {
    return t_nref_st;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT_nref_st(boolean newT_nref_st)
  {
    boolean oldT_nref_st = t_nref_st;
    t_nref_st = newT_nref_st;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TNAMED_REFERENCES__TNREF_ST, oldT_nref_st, t_nref_st));
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
      case McsPackage.TNAMED_REFERENCES__TNREF:
        return isT_nref();
      case McsPackage.TNAMED_REFERENCES__TNREF_ST:
        return isT_nref_st();
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
      case McsPackage.TNAMED_REFERENCES__TNREF:
        setT_nref((Boolean)newValue);
        return;
      case McsPackage.TNAMED_REFERENCES__TNREF_ST:
        setT_nref_st((Boolean)newValue);
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
      case McsPackage.TNAMED_REFERENCES__TNREF:
        setT_nref(TNREF_EDEFAULT);
        return;
      case McsPackage.TNAMED_REFERENCES__TNREF_ST:
        setT_nref_st(TNREF_ST_EDEFAULT);
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
      case McsPackage.TNAMED_REFERENCES__TNREF:
        return t_nref != TNREF_EDEFAULT;
      case McsPackage.TNAMED_REFERENCES__TNREF_ST:
        return t_nref_st != TNREF_ST_EDEFAULT;
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
    result.append(" (t_nref: ");
    result.append(t_nref);
    result.append(", t_nref_st: ");
    result.append(t_nref_st);
    result.append(')');
    return result.toString();
  }

} //t_named_referencesImpl
