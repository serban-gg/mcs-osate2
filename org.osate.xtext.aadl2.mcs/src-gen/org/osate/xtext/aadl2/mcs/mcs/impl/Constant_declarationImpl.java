/**
 */
package org.osate.xtext.aadl2.mcs.mcs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.osate.xtext.aadl2.mcs.mcs.Constant_declaration;
import org.osate.xtext.aadl2.mcs.mcs.Expr;
import org.osate.xtext.aadl2.mcs.mcs.McsPackage;
import org.osate.xtext.aadl2.mcs.mcs.McsTypedName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constant declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.Constant_declarationImpl#getConst <em>Const</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.Constant_declarationImpl#getLeft_expr <em>Left expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Constant_declarationImpl extends MinimalEObjectImpl.Container implements Constant_declaration
{
  /**
   * The cached value of the '{@link #getConst() <em>Const</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConst()
   * @generated
   * @ordered
   */
  protected McsTypedName const_;

  /**
   * The cached value of the '{@link #getLeft_expr() <em>Left expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft_expr()
   * @generated
   * @ordered
   */
  protected Expr left_expr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Constant_declarationImpl()
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
    return McsPackage.Literals.CONSTANT_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public McsTypedName getConst()
  {
    return const_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConst(McsTypedName newConst, NotificationChain msgs)
  {
    McsTypedName oldConst = const_;
    const_ = newConst;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.CONSTANT_DECLARATION__CONST, oldConst, newConst);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConst(McsTypedName newConst)
  {
    if (newConst != const_)
    {
      NotificationChain msgs = null;
      if (const_ != null)
        msgs = ((InternalEObject)const_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.CONSTANT_DECLARATION__CONST, null, msgs);
      if (newConst != null)
        msgs = ((InternalEObject)newConst).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.CONSTANT_DECLARATION__CONST, null, msgs);
      msgs = basicSetConst(newConst, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.CONSTANT_DECLARATION__CONST, newConst, newConst));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getLeft_expr()
  {
    return left_expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft_expr(Expr newLeft_expr, NotificationChain msgs)
  {
    Expr oldLeft_expr = left_expr;
    left_expr = newLeft_expr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.CONSTANT_DECLARATION__LEFT_EXPR, oldLeft_expr, newLeft_expr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft_expr(Expr newLeft_expr)
  {
    if (newLeft_expr != left_expr)
    {
      NotificationChain msgs = null;
      if (left_expr != null)
        msgs = ((InternalEObject)left_expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.CONSTANT_DECLARATION__LEFT_EXPR, null, msgs);
      if (newLeft_expr != null)
        msgs = ((InternalEObject)newLeft_expr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.CONSTANT_DECLARATION__LEFT_EXPR, null, msgs);
      msgs = basicSetLeft_expr(newLeft_expr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.CONSTANT_DECLARATION__LEFT_EXPR, newLeft_expr, newLeft_expr));
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
      case McsPackage.CONSTANT_DECLARATION__CONST:
        return basicSetConst(null, msgs);
      case McsPackage.CONSTANT_DECLARATION__LEFT_EXPR:
        return basicSetLeft_expr(null, msgs);
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
      case McsPackage.CONSTANT_DECLARATION__CONST:
        return getConst();
      case McsPackage.CONSTANT_DECLARATION__LEFT_EXPR:
        return getLeft_expr();
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
      case McsPackage.CONSTANT_DECLARATION__CONST:
        setConst((McsTypedName)newValue);
        return;
      case McsPackage.CONSTANT_DECLARATION__LEFT_EXPR:
        setLeft_expr((Expr)newValue);
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
      case McsPackage.CONSTANT_DECLARATION__CONST:
        setConst((McsTypedName)null);
        return;
      case McsPackage.CONSTANT_DECLARATION__LEFT_EXPR:
        setLeft_expr((Expr)null);
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
      case McsPackage.CONSTANT_DECLARATION__CONST:
        return const_ != null;
      case McsPackage.CONSTANT_DECLARATION__LEFT_EXPR:
        return left_expr != null;
    }
    return super.eIsSet(featureID);
  }

} //Constant_declarationImpl
