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

import org.osate.xtext.aadl2.mcs.mcs.Expr;
import org.osate.xtext.aadl2.mcs.mcs.FnCall;
import org.osate.xtext.aadl2.mcs.mcs.Function;
import org.osate.xtext.aadl2.mcs.mcs.McsPackage;
import org.osate.xtext.aadl2.mcs.mcs.Type_expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fn Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.FnCallImpl#getFn <em>Fn</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.FnCallImpl#getArgs <em>Args</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.FnCallImpl#getNewtype <em>Newtype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FnCallImpl extends MinimalEObjectImpl.Container implements FnCall
{
  /**
   * The cached value of the '{@link #getFn() <em>Fn</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFn()
   * @generated
   * @ordered
   */
  protected Function fn;

  /**
   * The cached value of the '{@link #getArgs() <em>Args</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgs()
   * @generated
   * @ordered
   */
  protected EList<Expr> args;

  /**
   * The cached value of the '{@link #getNewtype() <em>Newtype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNewtype()
   * @generated
   * @ordered
   */
  protected Type_expression newtype;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FnCallImpl()
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
    return McsPackage.Literals.FN_CALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function getFn()
  {
    if (fn != null && fn.eIsProxy())
    {
      InternalEObject oldFn = (InternalEObject)fn;
      fn = (Function)eResolveProxy(oldFn);
      if (fn != oldFn)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, McsPackage.FN_CALL__FN, oldFn, fn));
      }
    }
    return fn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function basicGetFn()
  {
    return fn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFn(Function newFn)
  {
    Function oldFn = fn;
    fn = newFn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.FN_CALL__FN, oldFn, fn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expr> getArgs()
  {
    if (args == null)
    {
      args = new EObjectContainmentEList<Expr>(Expr.class, this, McsPackage.FN_CALL__ARGS);
    }
    return args;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type_expression getNewtype()
  {
    return newtype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNewtype(Type_expression newNewtype, NotificationChain msgs)
  {
    Type_expression oldNewtype = newtype;
    newtype = newNewtype;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.FN_CALL__NEWTYPE, oldNewtype, newNewtype);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNewtype(Type_expression newNewtype)
  {
    if (newNewtype != newtype)
    {
      NotificationChain msgs = null;
      if (newtype != null)
        msgs = ((InternalEObject)newtype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.FN_CALL__NEWTYPE, null, msgs);
      if (newNewtype != null)
        msgs = ((InternalEObject)newNewtype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.FN_CALL__NEWTYPE, null, msgs);
      msgs = basicSetNewtype(newNewtype, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.FN_CALL__NEWTYPE, newNewtype, newNewtype));
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
      case McsPackage.FN_CALL__ARGS:
        return ((InternalEList<?>)getArgs()).basicRemove(otherEnd, msgs);
      case McsPackage.FN_CALL__NEWTYPE:
        return basicSetNewtype(null, msgs);
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
      case McsPackage.FN_CALL__FN:
        if (resolve) return getFn();
        return basicGetFn();
      case McsPackage.FN_CALL__ARGS:
        return getArgs();
      case McsPackage.FN_CALL__NEWTYPE:
        return getNewtype();
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
      case McsPackage.FN_CALL__FN:
        setFn((Function)newValue);
        return;
      case McsPackage.FN_CALL__ARGS:
        getArgs().clear();
        getArgs().addAll((Collection<? extends Expr>)newValue);
        return;
      case McsPackage.FN_CALL__NEWTYPE:
        setNewtype((Type_expression)newValue);
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
      case McsPackage.FN_CALL__FN:
        setFn((Function)null);
        return;
      case McsPackage.FN_CALL__ARGS:
        getArgs().clear();
        return;
      case McsPackage.FN_CALL__NEWTYPE:
        setNewtype((Type_expression)null);
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
      case McsPackage.FN_CALL__FN:
        return fn != null;
      case McsPackage.FN_CALL__ARGS:
        return args != null && !args.isEmpty();
      case McsPackage.FN_CALL__NEWTYPE:
        return newtype != null;
    }
    return super.eIsSet(featureID);
  }

} //FnCallImpl
