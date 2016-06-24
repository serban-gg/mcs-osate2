/**
 */
package org.osate.xtext.aadl2.mcs.mcs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.xtext.aadl2.mcs.mcs.Expr;
import org.osate.xtext.aadl2.mcs.mcs.LetExpr;
import org.osate.xtext.aadl2.mcs.mcs.McsPackage;
import org.osate.xtext.aadl2.mcs.mcs.McsTypedName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Let Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.LetExprImpl#getLocal <em>Local</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.LetExprImpl#getExpr1 <em>Expr1</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.LetExprImpl#getExpr2 <em>Expr2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LetExprImpl extends ExprImpl implements LetExpr
{
  /**
   * The cached value of the '{@link #getLocal() <em>Local</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocal()
   * @generated
   * @ordered
   */
  protected McsTypedName local;

  /**
   * The cached value of the '{@link #getExpr1() <em>Expr1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr1()
   * @generated
   * @ordered
   */
  protected Expr expr1;

  /**
   * The cached value of the '{@link #getExpr2() <em>Expr2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr2()
   * @generated
   * @ordered
   */
  protected Expr expr2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LetExprImpl()
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
    return McsPackage.Literals.LET_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public McsTypedName getLocal()
  {
    return local;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLocal(McsTypedName newLocal, NotificationChain msgs)
  {
    McsTypedName oldLocal = local;
    local = newLocal;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.LET_EXPR__LOCAL, oldLocal, newLocal);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLocal(McsTypedName newLocal)
  {
    if (newLocal != local)
    {
      NotificationChain msgs = null;
      if (local != null)
        msgs = ((InternalEObject)local).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.LET_EXPR__LOCAL, null, msgs);
      if (newLocal != null)
        msgs = ((InternalEObject)newLocal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.LET_EXPR__LOCAL, null, msgs);
      msgs = basicSetLocal(newLocal, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.LET_EXPR__LOCAL, newLocal, newLocal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getExpr1()
  {
    return expr1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr1(Expr newExpr1, NotificationChain msgs)
  {
    Expr oldExpr1 = expr1;
    expr1 = newExpr1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.LET_EXPR__EXPR1, oldExpr1, newExpr1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr1(Expr newExpr1)
  {
    if (newExpr1 != expr1)
    {
      NotificationChain msgs = null;
      if (expr1 != null)
        msgs = ((InternalEObject)expr1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.LET_EXPR__EXPR1, null, msgs);
      if (newExpr1 != null)
        msgs = ((InternalEObject)newExpr1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.LET_EXPR__EXPR1, null, msgs);
      msgs = basicSetExpr1(newExpr1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.LET_EXPR__EXPR1, newExpr1, newExpr1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getExpr2()
  {
    return expr2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr2(Expr newExpr2, NotificationChain msgs)
  {
    Expr oldExpr2 = expr2;
    expr2 = newExpr2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.LET_EXPR__EXPR2, oldExpr2, newExpr2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr2(Expr newExpr2)
  {
    if (newExpr2 != expr2)
    {
      NotificationChain msgs = null;
      if (expr2 != null)
        msgs = ((InternalEObject)expr2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.LET_EXPR__EXPR2, null, msgs);
      if (newExpr2 != null)
        msgs = ((InternalEObject)newExpr2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.LET_EXPR__EXPR2, null, msgs);
      msgs = basicSetExpr2(newExpr2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.LET_EXPR__EXPR2, newExpr2, newExpr2));
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
      case McsPackage.LET_EXPR__LOCAL:
        return basicSetLocal(null, msgs);
      case McsPackage.LET_EXPR__EXPR1:
        return basicSetExpr1(null, msgs);
      case McsPackage.LET_EXPR__EXPR2:
        return basicSetExpr2(null, msgs);
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
      case McsPackage.LET_EXPR__LOCAL:
        return getLocal();
      case McsPackage.LET_EXPR__EXPR1:
        return getExpr1();
      case McsPackage.LET_EXPR__EXPR2:
        return getExpr2();
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
      case McsPackage.LET_EXPR__LOCAL:
        setLocal((McsTypedName)newValue);
        return;
      case McsPackage.LET_EXPR__EXPR1:
        setExpr1((Expr)newValue);
        return;
      case McsPackage.LET_EXPR__EXPR2:
        setExpr2((Expr)newValue);
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
      case McsPackage.LET_EXPR__LOCAL:
        setLocal((McsTypedName)null);
        return;
      case McsPackage.LET_EXPR__EXPR1:
        setExpr1((Expr)null);
        return;
      case McsPackage.LET_EXPR__EXPR2:
        setExpr2((Expr)null);
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
      case McsPackage.LET_EXPR__LOCAL:
        return local != null;
      case McsPackage.LET_EXPR__EXPR1:
        return expr1 != null;
      case McsPackage.LET_EXPR__EXPR2:
        return expr2 != null;
    }
    return super.eIsSet(featureID);
  }

} //LetExprImpl
