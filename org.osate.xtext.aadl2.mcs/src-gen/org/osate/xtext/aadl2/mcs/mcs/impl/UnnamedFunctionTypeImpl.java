/**
 */
package org.osate.xtext.aadl2.mcs.mcs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.xtext.aadl2.mcs.mcs.McsPackage;
import org.osate.xtext.aadl2.mcs.mcs.UnnamedFunctionType;
import org.osate.xtext.aadl2.mcs.mcs.type_expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unnamed Function Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.UnnamedFunctionTypeImpl#getParm <em>Parm</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.UnnamedFunctionTypeImpl#isOutspec <em>Outspec</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.UnnamedFunctionTypeImpl#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnnamedFunctionTypeImpl extends MinimalEObjectImpl.Container implements UnnamedFunctionType
{
  /**
   * The cached value of the '{@link #getParm() <em>Parm</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParm()
   * @generated
   * @ordered
   */
  protected EList<type_expression> parm;

  /**
   * The default value of the '{@link #isOutspec() <em>Outspec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOutspec()
   * @generated
   * @ordered
   */
  protected static final boolean OUTSPEC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOutspec() <em>Outspec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOutspec()
   * @generated
   * @ordered
   */
  protected boolean outspec = OUTSPEC_EDEFAULT;

  /**
   * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResult()
   * @generated
   * @ordered
   */
  protected type_expression result;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UnnamedFunctionTypeImpl()
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
    return McsPackage.Literals.UNNAMED_FUNCTION_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<type_expression> getParm()
  {
    if (parm == null)
    {
      parm = new EObjectContainmentEList<type_expression>(type_expression.class, this, McsPackage.UNNAMED_FUNCTION_TYPE__PARM);
    }
    return parm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isOutspec()
  {
    return outspec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutspec(boolean newOutspec)
  {
    boolean oldOutspec = outspec;
    outspec = newOutspec;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.UNNAMED_FUNCTION_TYPE__OUTSPEC, oldOutspec, outspec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type_expression getResult()
  {
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetResult(type_expression newResult, NotificationChain msgs)
  {
    type_expression oldResult = result;
    result = newResult;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.UNNAMED_FUNCTION_TYPE__RESULT, oldResult, newResult);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResult(type_expression newResult)
  {
    if (newResult != result)
    {
      NotificationChain msgs = null;
      if (result != null)
        msgs = ((InternalEObject)result).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.UNNAMED_FUNCTION_TYPE__RESULT, null, msgs);
      if (newResult != null)
        msgs = ((InternalEObject)newResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.UNNAMED_FUNCTION_TYPE__RESULT, null, msgs);
      msgs = basicSetResult(newResult, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.UNNAMED_FUNCTION_TYPE__RESULT, newResult, newResult));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case McsPackage.UNNAMED_FUNCTION_TYPE__PARM:
        return ((InternalEList<?>)getParm()).basicRemove(otherEnd, msgs);
      case McsPackage.UNNAMED_FUNCTION_TYPE__RESULT:
        return basicSetResult(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case McsPackage.UNNAMED_FUNCTION_TYPE__PARM:
        return getParm();
      case McsPackage.UNNAMED_FUNCTION_TYPE__OUTSPEC:
        return isOutspec();
      case McsPackage.UNNAMED_FUNCTION_TYPE__RESULT:
        return getResult();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case McsPackage.UNNAMED_FUNCTION_TYPE__PARM:
        getParm().clear();
        getParm().addAll((Collection<? extends type_expression>)newValue);
        return;
      case McsPackage.UNNAMED_FUNCTION_TYPE__OUTSPEC:
        setOutspec((Boolean)newValue);
        return;
      case McsPackage.UNNAMED_FUNCTION_TYPE__RESULT:
        setResult((type_expression)newValue);
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
      case McsPackage.UNNAMED_FUNCTION_TYPE__PARM:
        getParm().clear();
        return;
      case McsPackage.UNNAMED_FUNCTION_TYPE__OUTSPEC:
        setOutspec(OUTSPEC_EDEFAULT);
        return;
      case McsPackage.UNNAMED_FUNCTION_TYPE__RESULT:
        setResult((type_expression)null);
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
      case McsPackage.UNNAMED_FUNCTION_TYPE__PARM:
        return parm != null && !parm.isEmpty();
      case McsPackage.UNNAMED_FUNCTION_TYPE__OUTSPEC:
        return outspec != OUTSPEC_EDEFAULT;
      case McsPackage.UNNAMED_FUNCTION_TYPE__RESULT:
        return result != null;
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
    result.append(" (outspec: ");
    result.append(outspec);
    result.append(')');
    return result.toString();
  }

} //UnnamedFunctionTypeImpl
