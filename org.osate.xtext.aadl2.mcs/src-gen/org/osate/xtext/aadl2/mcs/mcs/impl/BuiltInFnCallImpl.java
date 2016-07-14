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

import org.osate.xtext.aadl2.mcs.mcs.BuiltInFnCall;
import org.osate.xtext.aadl2.mcs.mcs.Expr;
import org.osate.xtext.aadl2.mcs.mcs.McsPackage;
import org.osate.xtext.aadl2.mcs.mcs.Type_expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Built In Fn Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.BuiltInFnCallImpl#getFn <em>Fn</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.BuiltInFnCallImpl#getArgs <em>Args</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.BuiltInFnCallImpl#getNewtype <em>Newtype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BuiltInFnCallImpl extends MinimalEObjectImpl.Container implements BuiltInFnCall
{
  /**
   * The default value of the '{@link #getFn() <em>Fn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFn()
   * @generated
   * @ordered
   */
  protected static final String FN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFn() <em>Fn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFn()
   * @generated
   * @ordered
   */
  protected String fn = FN_EDEFAULT;

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
  protected BuiltInFnCallImpl()
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
    return McsPackage.Literals.BUILT_IN_FN_CALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFn()
  {
    return fn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFn(String newFn)
  {
    String oldFn = fn;
    fn = newFn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.BUILT_IN_FN_CALL__FN, oldFn, fn));
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
      args = new EObjectContainmentEList<Expr>(Expr.class, this, McsPackage.BUILT_IN_FN_CALL__ARGS);
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.BUILT_IN_FN_CALL__NEWTYPE, oldNewtype, newNewtype);
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
        msgs = ((InternalEObject)newtype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.BUILT_IN_FN_CALL__NEWTYPE, null, msgs);
      if (newNewtype != null)
        msgs = ((InternalEObject)newNewtype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.BUILT_IN_FN_CALL__NEWTYPE, null, msgs);
      msgs = basicSetNewtype(newNewtype, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.BUILT_IN_FN_CALL__NEWTYPE, newNewtype, newNewtype));
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
      case McsPackage.BUILT_IN_FN_CALL__ARGS:
        return ((InternalEList<?>)getArgs()).basicRemove(otherEnd, msgs);
      case McsPackage.BUILT_IN_FN_CALL__NEWTYPE:
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
      case McsPackage.BUILT_IN_FN_CALL__FN:
        return getFn();
      case McsPackage.BUILT_IN_FN_CALL__ARGS:
        return getArgs();
      case McsPackage.BUILT_IN_FN_CALL__NEWTYPE:
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
      case McsPackage.BUILT_IN_FN_CALL__FN:
        setFn((String)newValue);
        return;
      case McsPackage.BUILT_IN_FN_CALL__ARGS:
        getArgs().clear();
        getArgs().addAll((Collection<? extends Expr>)newValue);
        return;
      case McsPackage.BUILT_IN_FN_CALL__NEWTYPE:
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
      case McsPackage.BUILT_IN_FN_CALL__FN:
        setFn(FN_EDEFAULT);
        return;
      case McsPackage.BUILT_IN_FN_CALL__ARGS:
        getArgs().clear();
        return;
      case McsPackage.BUILT_IN_FN_CALL__NEWTYPE:
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
      case McsPackage.BUILT_IN_FN_CALL__FN:
        return FN_EDEFAULT == null ? fn != null : !FN_EDEFAULT.equals(fn);
      case McsPackage.BUILT_IN_FN_CALL__ARGS:
        return args != null && !args.isEmpty();
      case McsPackage.BUILT_IN_FN_CALL__NEWTYPE:
        return newtype != null;
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
    result.append(" (fn: ");
    result.append(fn);
    result.append(')');
    return result.toString();
  }

} //BuiltInFnCallImpl
