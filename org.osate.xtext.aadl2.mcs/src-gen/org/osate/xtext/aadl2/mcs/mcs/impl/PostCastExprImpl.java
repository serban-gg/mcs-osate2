/**
 */
package org.osate.xtext.aadl2.mcs.mcs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.xtext.aadl2.mcs.mcs.Expr;
import org.osate.xtext.aadl2.mcs.mcs.McsPackage;
import org.osate.xtext.aadl2.mcs.mcs.MethodChain;
import org.osate.xtext.aadl2.mcs.mcs.PostCastExpr;
import org.osate.xtext.aadl2.mcs.mcs.Type_expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Post Cast Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.PostCastExprImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.PostCastExprImpl#getNewtype <em>Newtype</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.PostCastExprImpl#getChain <em>Chain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PostCastExprImpl extends ExprImpl implements PostCastExpr
{
  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected Expr expr;

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
   * The cached value of the '{@link #getChain() <em>Chain</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChain()
   * @generated
   * @ordered
   */
  protected MethodChain chain;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PostCastExprImpl()
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
    return McsPackage.Literals.POST_CAST_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr(Expr newExpr, NotificationChain msgs)
  {
    Expr oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.POST_CAST_EXPR__EXPR, oldExpr, newExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr(Expr newExpr)
  {
    if (newExpr != expr)
    {
      NotificationChain msgs = null;
      if (expr != null)
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.POST_CAST_EXPR__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.POST_CAST_EXPR__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.POST_CAST_EXPR__EXPR, newExpr, newExpr));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.POST_CAST_EXPR__NEWTYPE, oldNewtype, newNewtype);
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
        msgs = ((InternalEObject)newtype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.POST_CAST_EXPR__NEWTYPE, null, msgs);
      if (newNewtype != null)
        msgs = ((InternalEObject)newNewtype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.POST_CAST_EXPR__NEWTYPE, null, msgs);
      msgs = basicSetNewtype(newNewtype, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.POST_CAST_EXPR__NEWTYPE, newNewtype, newNewtype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodChain getChain()
  {
    return chain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetChain(MethodChain newChain, NotificationChain msgs)
  {
    MethodChain oldChain = chain;
    chain = newChain;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.POST_CAST_EXPR__CHAIN, oldChain, newChain);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChain(MethodChain newChain)
  {
    if (newChain != chain)
    {
      NotificationChain msgs = null;
      if (chain != null)
        msgs = ((InternalEObject)chain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.POST_CAST_EXPR__CHAIN, null, msgs);
      if (newChain != null)
        msgs = ((InternalEObject)newChain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.POST_CAST_EXPR__CHAIN, null, msgs);
      msgs = basicSetChain(newChain, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.POST_CAST_EXPR__CHAIN, newChain, newChain));
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
      case McsPackage.POST_CAST_EXPR__EXPR:
        return basicSetExpr(null, msgs);
      case McsPackage.POST_CAST_EXPR__NEWTYPE:
        return basicSetNewtype(null, msgs);
      case McsPackage.POST_CAST_EXPR__CHAIN:
        return basicSetChain(null, msgs);
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
      case McsPackage.POST_CAST_EXPR__EXPR:
        return getExpr();
      case McsPackage.POST_CAST_EXPR__NEWTYPE:
        return getNewtype();
      case McsPackage.POST_CAST_EXPR__CHAIN:
        return getChain();
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
      case McsPackage.POST_CAST_EXPR__EXPR:
        setExpr((Expr)newValue);
        return;
      case McsPackage.POST_CAST_EXPR__NEWTYPE:
        setNewtype((Type_expression)newValue);
        return;
      case McsPackage.POST_CAST_EXPR__CHAIN:
        setChain((MethodChain)newValue);
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
      case McsPackage.POST_CAST_EXPR__EXPR:
        setExpr((Expr)null);
        return;
      case McsPackage.POST_CAST_EXPR__NEWTYPE:
        setNewtype((Type_expression)null);
        return;
      case McsPackage.POST_CAST_EXPR__CHAIN:
        setChain((MethodChain)null);
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
      case McsPackage.POST_CAST_EXPR__EXPR:
        return expr != null;
      case McsPackage.POST_CAST_EXPR__NEWTYPE:
        return newtype != null;
      case McsPackage.POST_CAST_EXPR__CHAIN:
        return chain != null;
    }
    return super.eIsSet(featureID);
  }

} //PostCastExprImpl
