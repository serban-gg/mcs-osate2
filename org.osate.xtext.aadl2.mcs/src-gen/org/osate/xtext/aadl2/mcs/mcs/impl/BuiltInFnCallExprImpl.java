/**
 */
package org.osate.xtext.aadl2.mcs.mcs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.xtext.aadl2.mcs.mcs.BuiltInFnCall;
import org.osate.xtext.aadl2.mcs.mcs.BuiltInFnCallExpr;
import org.osate.xtext.aadl2.mcs.mcs.McsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Built In Fn Call Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.BuiltInFnCallExprImpl#getBuiltin <em>Builtin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BuiltInFnCallExprImpl extends ExprImpl implements BuiltInFnCallExpr
{
  /**
   * The cached value of the '{@link #getBuiltin() <em>Builtin</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBuiltin()
   * @generated
   * @ordered
   */
  protected BuiltInFnCall builtin;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BuiltInFnCallExprImpl()
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
    return McsPackage.Literals.BUILT_IN_FN_CALL_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BuiltInFnCall getBuiltin()
  {
    return builtin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBuiltin(BuiltInFnCall newBuiltin, NotificationChain msgs)
  {
    BuiltInFnCall oldBuiltin = builtin;
    builtin = newBuiltin;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.BUILT_IN_FN_CALL_EXPR__BUILTIN, oldBuiltin, newBuiltin);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBuiltin(BuiltInFnCall newBuiltin)
  {
    if (newBuiltin != builtin)
    {
      NotificationChain msgs = null;
      if (builtin != null)
        msgs = ((InternalEObject)builtin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.BUILT_IN_FN_CALL_EXPR__BUILTIN, null, msgs);
      if (newBuiltin != null)
        msgs = ((InternalEObject)newBuiltin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.BUILT_IN_FN_CALL_EXPR__BUILTIN, null, msgs);
      msgs = basicSetBuiltin(newBuiltin, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.BUILT_IN_FN_CALL_EXPR__BUILTIN, newBuiltin, newBuiltin));
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
      case McsPackage.BUILT_IN_FN_CALL_EXPR__BUILTIN:
        return basicSetBuiltin(null, msgs);
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
      case McsPackage.BUILT_IN_FN_CALL_EXPR__BUILTIN:
        return getBuiltin();
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
      case McsPackage.BUILT_IN_FN_CALL_EXPR__BUILTIN:
        setBuiltin((BuiltInFnCall)newValue);
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
      case McsPackage.BUILT_IN_FN_CALL_EXPR__BUILTIN:
        setBuiltin((BuiltInFnCall)null);
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
      case McsPackage.BUILT_IN_FN_CALL_EXPR__BUILTIN:
        return builtin != null;
    }
    return super.eIsSet(featureID);
  }

} //BuiltInFnCallExprImpl
