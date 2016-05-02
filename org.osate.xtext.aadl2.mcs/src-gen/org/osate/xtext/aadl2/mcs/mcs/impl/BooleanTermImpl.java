/**
 */
package org.osate.xtext.aadl2.mcs.mcs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.xbase.XExpression;

import org.eclipse.xtext.xbase.impl.XExpressionImpl;

import org.osate.xtext.aadl2.mcs.mcs.BooleanTerm;
import org.osate.xtext.aadl2.mcs.mcs.McsPackage;
import org.osate.xtext.aadl2.mcs.mcs.expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.BooleanTermImpl#getXbool <em>Xbool</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.BooleanTermImpl#getMember_check <em>Member check</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.BooleanTermImpl#getCollect_expr <em>Collect expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BooleanTermImpl extends XExpressionImpl implements BooleanTerm
{
  /**
   * The cached value of the '{@link #getXbool() <em>Xbool</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXbool()
   * @generated
   * @ordered
   */
  protected XExpression xbool;

  /**
   * The cached value of the '{@link #getMember_check() <em>Member check</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMember_check()
   * @generated
   * @ordered
   */
  protected expression member_check;

  /**
   * The cached value of the '{@link #getCollect_expr() <em>Collect expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCollect_expr()
   * @generated
   * @ordered
   */
  protected expression collect_expr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BooleanTermImpl()
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
    return McsPackage.Literals.BOOLEAN_TERM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getXbool()
  {
    return xbool;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetXbool(XExpression newXbool, NotificationChain msgs)
  {
    XExpression oldXbool = xbool;
    xbool = newXbool;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.BOOLEAN_TERM__XBOOL, oldXbool, newXbool);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setXbool(XExpression newXbool)
  {
    if (newXbool != xbool)
    {
      NotificationChain msgs = null;
      if (xbool != null)
        msgs = ((InternalEObject)xbool).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.BOOLEAN_TERM__XBOOL, null, msgs);
      if (newXbool != null)
        msgs = ((InternalEObject)newXbool).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.BOOLEAN_TERM__XBOOL, null, msgs);
      msgs = basicSetXbool(newXbool, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.BOOLEAN_TERM__XBOOL, newXbool, newXbool));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression getMember_check()
  {
    return member_check;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMember_check(expression newMember_check, NotificationChain msgs)
  {
    expression oldMember_check = member_check;
    member_check = newMember_check;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.BOOLEAN_TERM__MEMBER_CHECK, oldMember_check, newMember_check);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMember_check(expression newMember_check)
  {
    if (newMember_check != member_check)
    {
      NotificationChain msgs = null;
      if (member_check != null)
        msgs = ((InternalEObject)member_check).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.BOOLEAN_TERM__MEMBER_CHECK, null, msgs);
      if (newMember_check != null)
        msgs = ((InternalEObject)newMember_check).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.BOOLEAN_TERM__MEMBER_CHECK, null, msgs);
      msgs = basicSetMember_check(newMember_check, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.BOOLEAN_TERM__MEMBER_CHECK, newMember_check, newMember_check));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression getCollect_expr()
  {
    return collect_expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCollect_expr(expression newCollect_expr, NotificationChain msgs)
  {
    expression oldCollect_expr = collect_expr;
    collect_expr = newCollect_expr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.BOOLEAN_TERM__COLLECT_EXPR, oldCollect_expr, newCollect_expr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCollect_expr(expression newCollect_expr)
  {
    if (newCollect_expr != collect_expr)
    {
      NotificationChain msgs = null;
      if (collect_expr != null)
        msgs = ((InternalEObject)collect_expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.BOOLEAN_TERM__COLLECT_EXPR, null, msgs);
      if (newCollect_expr != null)
        msgs = ((InternalEObject)newCollect_expr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.BOOLEAN_TERM__COLLECT_EXPR, null, msgs);
      msgs = basicSetCollect_expr(newCollect_expr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.BOOLEAN_TERM__COLLECT_EXPR, newCollect_expr, newCollect_expr));
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
      case McsPackage.BOOLEAN_TERM__XBOOL:
        return basicSetXbool(null, msgs);
      case McsPackage.BOOLEAN_TERM__MEMBER_CHECK:
        return basicSetMember_check(null, msgs);
      case McsPackage.BOOLEAN_TERM__COLLECT_EXPR:
        return basicSetCollect_expr(null, msgs);
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
      case McsPackage.BOOLEAN_TERM__XBOOL:
        return getXbool();
      case McsPackage.BOOLEAN_TERM__MEMBER_CHECK:
        return getMember_check();
      case McsPackage.BOOLEAN_TERM__COLLECT_EXPR:
        return getCollect_expr();
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
      case McsPackage.BOOLEAN_TERM__XBOOL:
        setXbool((XExpression)newValue);
        return;
      case McsPackage.BOOLEAN_TERM__MEMBER_CHECK:
        setMember_check((expression)newValue);
        return;
      case McsPackage.BOOLEAN_TERM__COLLECT_EXPR:
        setCollect_expr((expression)newValue);
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
      case McsPackage.BOOLEAN_TERM__XBOOL:
        setXbool((XExpression)null);
        return;
      case McsPackage.BOOLEAN_TERM__MEMBER_CHECK:
        setMember_check((expression)null);
        return;
      case McsPackage.BOOLEAN_TERM__COLLECT_EXPR:
        setCollect_expr((expression)null);
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
      case McsPackage.BOOLEAN_TERM__XBOOL:
        return xbool != null;
      case McsPackage.BOOLEAN_TERM__MEMBER_CHECK:
        return member_check != null;
      case McsPackage.BOOLEAN_TERM__COLLECT_EXPR:
        return collect_expr != null;
    }
    return super.eIsSet(featureID);
  }

} //BooleanTermImpl
