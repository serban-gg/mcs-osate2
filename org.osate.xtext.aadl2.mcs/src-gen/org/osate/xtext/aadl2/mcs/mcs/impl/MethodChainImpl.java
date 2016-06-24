/**
 */
package org.osate.xtext.aadl2.mcs.mcs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.xtext.aadl2.mcs.mcs.BuiltInFnCall;
import org.osate.xtext.aadl2.mcs.mcs.FnCall;
import org.osate.xtext.aadl2.mcs.mcs.McsPackage;
import org.osate.xtext.aadl2.mcs.mcs.MethodChain;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Chain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.MethodChainImpl#getBuiltin <em>Builtin</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.MethodChainImpl#getMethod <em>Method</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodChainImpl extends MinimalEObjectImpl.Container implements MethodChain
{
  /**
   * The cached value of the '{@link #getBuiltin() <em>Builtin</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBuiltin()
   * @generated
   * @ordered
   */
  protected EList<BuiltInFnCall> builtin;

  /**
   * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected EList<FnCall> method;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MethodChainImpl()
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
    return McsPackage.Literals.METHOD_CHAIN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BuiltInFnCall> getBuiltin()
  {
    if (builtin == null)
    {
      builtin = new EObjectContainmentEList<BuiltInFnCall>(BuiltInFnCall.class, this, McsPackage.METHOD_CHAIN__BUILTIN);
    }
    return builtin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FnCall> getMethod()
  {
    if (method == null)
    {
      method = new EObjectContainmentEList<FnCall>(FnCall.class, this, McsPackage.METHOD_CHAIN__METHOD);
    }
    return method;
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
      case McsPackage.METHOD_CHAIN__BUILTIN:
        return ((InternalEList<?>)getBuiltin()).basicRemove(otherEnd, msgs);
      case McsPackage.METHOD_CHAIN__METHOD:
        return ((InternalEList<?>)getMethod()).basicRemove(otherEnd, msgs);
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
      case McsPackage.METHOD_CHAIN__BUILTIN:
        return getBuiltin();
      case McsPackage.METHOD_CHAIN__METHOD:
        return getMethod();
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
      case McsPackage.METHOD_CHAIN__BUILTIN:
        getBuiltin().clear();
        getBuiltin().addAll((Collection<? extends BuiltInFnCall>)newValue);
        return;
      case McsPackage.METHOD_CHAIN__METHOD:
        getMethod().clear();
        getMethod().addAll((Collection<? extends FnCall>)newValue);
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
      case McsPackage.METHOD_CHAIN__BUILTIN:
        getBuiltin().clear();
        return;
      case McsPackage.METHOD_CHAIN__METHOD:
        getMethod().clear();
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
      case McsPackage.METHOD_CHAIN__BUILTIN:
        return builtin != null && !builtin.isEmpty();
      case McsPackage.METHOD_CHAIN__METHOD:
        return method != null && !method.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MethodChainImpl
