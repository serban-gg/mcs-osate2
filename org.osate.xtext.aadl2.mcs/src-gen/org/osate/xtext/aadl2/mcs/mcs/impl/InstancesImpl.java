/**
 */
package org.osate.xtext.aadl2.mcs.mcs.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.osate.xtext.aadl2.mcs.mcs.Instances;
import org.osate.xtext.aadl2.mcs.mcs.McsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instances</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.InstancesImpl#isInst <em>Inst</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.InstancesImpl#isT_inst_st <em>Tinst st</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstancesImpl extends MinimalEObjectImpl.Container implements Instances
{
  /**
   * The default value of the '{@link #isInst() <em>Inst</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInst()
   * @generated
   * @ordered
   */
  protected static final boolean INST_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isInst() <em>Inst</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInst()
   * @generated
   * @ordered
   */
  protected boolean inst = INST_EDEFAULT;

  /**
   * The default value of the '{@link #isT_inst_st() <em>Tinst st</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_inst_st()
   * @generated
   * @ordered
   */
  protected static final boolean TINST_ST_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isT_inst_st() <em>Tinst st</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_inst_st()
   * @generated
   * @ordered
   */
  protected boolean t_inst_st = TINST_ST_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InstancesImpl()
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
    return McsPackage.Literals.INSTANCES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isInst()
  {
    return inst;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInst(boolean newInst)
  {
    boolean oldInst = inst;
    inst = newInst;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.INSTANCES__INST, oldInst, inst));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isT_inst_st()
  {
    return t_inst_st;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT_inst_st(boolean newT_inst_st)
  {
    boolean oldT_inst_st = t_inst_st;
    t_inst_st = newT_inst_st;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.INSTANCES__TINST_ST, oldT_inst_st, t_inst_st));
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
      case McsPackage.INSTANCES__INST:
        return isInst();
      case McsPackage.INSTANCES__TINST_ST:
        return isT_inst_st();
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
      case McsPackage.INSTANCES__INST:
        setInst((Boolean)newValue);
        return;
      case McsPackage.INSTANCES__TINST_ST:
        setT_inst_st((Boolean)newValue);
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
      case McsPackage.INSTANCES__INST:
        setInst(INST_EDEFAULT);
        return;
      case McsPackage.INSTANCES__TINST_ST:
        setT_inst_st(TINST_ST_EDEFAULT);
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
      case McsPackage.INSTANCES__INST:
        return inst != INST_EDEFAULT;
      case McsPackage.INSTANCES__TINST_ST:
        return t_inst_st != TINST_ST_EDEFAULT;
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
    result.append(" (inst: ");
    result.append(inst);
    result.append(", t_inst_st: ");
    result.append(t_inst_st);
    result.append(')');
    return result.toString();
  }

} //InstancesImpl
