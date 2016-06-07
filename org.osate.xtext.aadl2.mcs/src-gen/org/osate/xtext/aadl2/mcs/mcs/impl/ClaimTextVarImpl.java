/**
 */
package org.osate.xtext.aadl2.mcs.mcs.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.osate.xtext.aadl2.mcs.mcs.ClaimTextVar;
import org.osate.xtext.aadl2.mcs.mcs.McsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim Text Var</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.ClaimTextVarImpl#isParm <em>Parm</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.ClaimTextVarImpl#isConst <em>Const</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.ClaimTextVarImpl#isLetb <em>Letb</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClaimTextVarImpl extends MinimalEObjectImpl.Container implements ClaimTextVar
{
  /**
   * The default value of the '{@link #isParm() <em>Parm</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isParm()
   * @generated
   * @ordered
   */
  protected static final boolean PARM_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isParm() <em>Parm</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isParm()
   * @generated
   * @ordered
   */
  protected boolean parm = PARM_EDEFAULT;

  /**
   * The default value of the '{@link #isConst() <em>Const</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isConst()
   * @generated
   * @ordered
   */
  protected static final boolean CONST_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isConst() <em>Const</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isConst()
   * @generated
   * @ordered
   */
  protected boolean const_ = CONST_EDEFAULT;

  /**
   * The default value of the '{@link #isLetb() <em>Letb</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLetb()
   * @generated
   * @ordered
   */
  protected static final boolean LETB_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isLetb() <em>Letb</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLetb()
   * @generated
   * @ordered
   */
  protected boolean letb = LETB_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClaimTextVarImpl()
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
    return McsPackage.Literals.CLAIM_TEXT_VAR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isParm()
  {
    return parm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParm(boolean newParm)
  {
    boolean oldParm = parm;
    parm = newParm;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.CLAIM_TEXT_VAR__PARM, oldParm, parm));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isConst()
  {
    return const_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConst(boolean newConst)
  {
    boolean oldConst = const_;
    const_ = newConst;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.CLAIM_TEXT_VAR__CONST, oldConst, const_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isLetb()
  {
    return letb;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLetb(boolean newLetb)
  {
    boolean oldLetb = letb;
    letb = newLetb;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.CLAIM_TEXT_VAR__LETB, oldLetb, letb));
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
      case McsPackage.CLAIM_TEXT_VAR__PARM:
        return isParm();
      case McsPackage.CLAIM_TEXT_VAR__CONST:
        return isConst();
      case McsPackage.CLAIM_TEXT_VAR__LETB:
        return isLetb();
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
      case McsPackage.CLAIM_TEXT_VAR__PARM:
        setParm((Boolean)newValue);
        return;
      case McsPackage.CLAIM_TEXT_VAR__CONST:
        setConst((Boolean)newValue);
        return;
      case McsPackage.CLAIM_TEXT_VAR__LETB:
        setLetb((Boolean)newValue);
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
      case McsPackage.CLAIM_TEXT_VAR__PARM:
        setParm(PARM_EDEFAULT);
        return;
      case McsPackage.CLAIM_TEXT_VAR__CONST:
        setConst(CONST_EDEFAULT);
        return;
      case McsPackage.CLAIM_TEXT_VAR__LETB:
        setLetb(LETB_EDEFAULT);
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
      case McsPackage.CLAIM_TEXT_VAR__PARM:
        return parm != PARM_EDEFAULT;
      case McsPackage.CLAIM_TEXT_VAR__CONST:
        return const_ != CONST_EDEFAULT;
      case McsPackage.CLAIM_TEXT_VAR__LETB:
        return letb != LETB_EDEFAULT;
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
    result.append(" (parm: ");
    result.append(parm);
    result.append(", const: ");
    result.append(const_);
    result.append(", letb: ");
    result.append(letb);
    result.append(')');
    return result.toString();
  }

} //ClaimTextVarImpl
