/**
 */
package org.osate.xtext.aadl2.mcs.mcs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.xtext.aadl2.mcs.mcs.McsPackage;
import org.osate.xtext.aadl2.mcs.mcs.TheoremCall;
import org.osate.xtext.aadl2.mcs.mcs.TheoremCallExpr;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Theorem Call Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.TheoremCallExprImpl#getFn <em>Fn</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TheoremCallExprImpl extends ExprImpl implements TheoremCallExpr
{
  /**
   * The cached value of the '{@link #getFn() <em>Fn</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFn()
   * @generated
   * @ordered
   */
  protected TheoremCall fn;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TheoremCallExprImpl()
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
    return McsPackage.Literals.THEOREM_CALL_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TheoremCall getFn()
  {
    return fn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFn(TheoremCall newFn, NotificationChain msgs)
  {
    TheoremCall oldFn = fn;
    fn = newFn;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.THEOREM_CALL_EXPR__FN, oldFn, newFn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFn(TheoremCall newFn)
  {
    if (newFn != fn)
    {
      NotificationChain msgs = null;
      if (fn != null)
        msgs = ((InternalEObject)fn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.THEOREM_CALL_EXPR__FN, null, msgs);
      if (newFn != null)
        msgs = ((InternalEObject)newFn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.THEOREM_CALL_EXPR__FN, null, msgs);
      msgs = basicSetFn(newFn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.THEOREM_CALL_EXPR__FN, newFn, newFn));
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
      case McsPackage.THEOREM_CALL_EXPR__FN:
        return basicSetFn(null, msgs);
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
      case McsPackage.THEOREM_CALL_EXPR__FN:
        return getFn();
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
      case McsPackage.THEOREM_CALL_EXPR__FN:
        setFn((TheoremCall)newValue);
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
      case McsPackage.THEOREM_CALL_EXPR__FN:
        setFn((TheoremCall)null);
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
      case McsPackage.THEOREM_CALL_EXPR__FN:
        return fn != null;
    }
    return super.eIsSet(featureID);
  }

} //TheoremCallExprImpl
