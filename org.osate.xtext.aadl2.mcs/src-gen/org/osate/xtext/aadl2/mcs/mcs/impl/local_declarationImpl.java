/**
 */
package org.osate.xtext.aadl2.mcs.mcs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.osate.xtext.aadl2.mcs.mcs.McsPackage;
import org.osate.xtext.aadl2.mcs.mcs.local_declaration;
import org.osate.xtext.aadl2.mcs.mcs.type_expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>local declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.local_declarationImpl#isConst <em>Const</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.local_declarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.local_declarationImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.local_declarationImpl#getLeft_expr <em>Left expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class local_declarationImpl extends MinimalEObjectImpl.Container implements local_declaration
{
  /**
   * The default value of the '{@link #isConst() <em>Const</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isConst()
   * @generated
   * @ordered
   */
  protected static final boolean CONST_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isConst() <em>Const</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isConst()
   * @generated
   * @ordered
   */
  protected boolean const_ = CONST_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected type_expression type;

  /**
   * The cached value of the '{@link #getLeft_expr() <em>Left expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft_expr()
   * @generated
   * @ordered
   */
  protected EObject left_expr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected local_declarationImpl()
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
    return McsPackage.Literals.LOCAL_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isConst()
  {
    return const_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConst(boolean newConst)
  {
    boolean oldConst = const_;
    const_ = newConst;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.LOCAL_DECLARATION__CONST, oldConst, const_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.LOCAL_DECLARATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type_expression getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(type_expression newType, NotificationChain msgs)
  {
    type_expression oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.LOCAL_DECLARATION__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(type_expression newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.LOCAL_DECLARATION__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.LOCAL_DECLARATION__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.LOCAL_DECLARATION__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getLeft_expr()
  {
    return left_expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft_expr(EObject newLeft_expr, NotificationChain msgs)
  {
    EObject oldLeft_expr = left_expr;
    left_expr = newLeft_expr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.LOCAL_DECLARATION__LEFT_EXPR, oldLeft_expr, newLeft_expr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft_expr(EObject newLeft_expr)
  {
    if (newLeft_expr != left_expr)
    {
      NotificationChain msgs = null;
      if (left_expr != null)
        msgs = ((InternalEObject)left_expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.LOCAL_DECLARATION__LEFT_EXPR, null, msgs);
      if (newLeft_expr != null)
        msgs = ((InternalEObject)newLeft_expr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.LOCAL_DECLARATION__LEFT_EXPR, null, msgs);
      msgs = basicSetLeft_expr(newLeft_expr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.LOCAL_DECLARATION__LEFT_EXPR, newLeft_expr, newLeft_expr));
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
      case McsPackage.LOCAL_DECLARATION__TYPE:
        return basicSetType(null, msgs);
      case McsPackage.LOCAL_DECLARATION__LEFT_EXPR:
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
      case McsPackage.LOCAL_DECLARATION__CONST:
        return isConst();
      case McsPackage.LOCAL_DECLARATION__NAME:
        return getName();
      case McsPackage.LOCAL_DECLARATION__TYPE:
        return getType();
      case McsPackage.LOCAL_DECLARATION__LEFT_EXPR:
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
      case McsPackage.LOCAL_DECLARATION__CONST:
        setConst((Boolean)newValue);
        return;
      case McsPackage.LOCAL_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case McsPackage.LOCAL_DECLARATION__TYPE:
        setType((type_expression)newValue);
        return;
      case McsPackage.LOCAL_DECLARATION__LEFT_EXPR:
        setLeft_expr((EObject)newValue);
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
      case McsPackage.LOCAL_DECLARATION__CONST:
        setConst(CONST_EDEFAULT);
        return;
      case McsPackage.LOCAL_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case McsPackage.LOCAL_DECLARATION__TYPE:
        setType((type_expression)null);
        return;
      case McsPackage.LOCAL_DECLARATION__LEFT_EXPR:
        setLeft_expr((EObject)null);
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
      case McsPackage.LOCAL_DECLARATION__CONST:
        return const_ != CONST_EDEFAULT;
      case McsPackage.LOCAL_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case McsPackage.LOCAL_DECLARATION__TYPE:
        return type != null;
      case McsPackage.LOCAL_DECLARATION__LEFT_EXPR:
        return left_expr != null;
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
    result.append(" (const: ");
    result.append(const_);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //local_declarationImpl
