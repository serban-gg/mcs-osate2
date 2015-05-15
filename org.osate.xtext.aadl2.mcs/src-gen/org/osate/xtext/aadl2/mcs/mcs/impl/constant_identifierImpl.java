/**
 */
package org.osate.xtext.aadl2.mcs.mcs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.xtext.aadl2.mcs.mcs.McsPackage;
import org.osate.xtext.aadl2.mcs.mcs.constant_expression;
import org.osate.xtext.aadl2.mcs.mcs.constant_identifier;
import org.osate.xtext.aadl2.mcs.mcs.type_expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>constant identifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.constant_identifierImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.constant_identifierImpl#getLeft_expr <em>Left expr</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.constant_identifierImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class constant_identifierImpl extends constant_declarationImpl implements constant_identifier
{
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
  protected constant_expression left_expr;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected constant_identifierImpl()
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
    return McsPackage.Literals.CONSTANT_IDENTIFIER;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.CONSTANT_IDENTIFIER__TYPE, oldType, newType);
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
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.CONSTANT_IDENTIFIER__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.CONSTANT_IDENTIFIER__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.CONSTANT_IDENTIFIER__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public constant_expression getLeft_expr()
  {
    return left_expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft_expr(constant_expression newLeft_expr, NotificationChain msgs)
  {
    constant_expression oldLeft_expr = left_expr;
    left_expr = newLeft_expr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.CONSTANT_IDENTIFIER__LEFT_EXPR, oldLeft_expr, newLeft_expr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft_expr(constant_expression newLeft_expr)
  {
    if (newLeft_expr != left_expr)
    {
      NotificationChain msgs = null;
      if (left_expr != null)
        msgs = ((InternalEObject)left_expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.CONSTANT_IDENTIFIER__LEFT_EXPR, null, msgs);
      if (newLeft_expr != null)
        msgs = ((InternalEObject)newLeft_expr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.CONSTANT_IDENTIFIER__LEFT_EXPR, null, msgs);
      msgs = basicSetLeft_expr(newLeft_expr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.CONSTANT_IDENTIFIER__LEFT_EXPR, newLeft_expr, newLeft_expr));
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
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.CONSTANT_IDENTIFIER__NAME, oldName, name));
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
      case McsPackage.CONSTANT_IDENTIFIER__TYPE:
        return basicSetType(null, msgs);
      case McsPackage.CONSTANT_IDENTIFIER__LEFT_EXPR:
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
      case McsPackage.CONSTANT_IDENTIFIER__TYPE:
        return getType();
      case McsPackage.CONSTANT_IDENTIFIER__LEFT_EXPR:
        return getLeft_expr();
      case McsPackage.CONSTANT_IDENTIFIER__NAME:
        return getName();
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
      case McsPackage.CONSTANT_IDENTIFIER__TYPE:
        setType((type_expression)newValue);
        return;
      case McsPackage.CONSTANT_IDENTIFIER__LEFT_EXPR:
        setLeft_expr((constant_expression)newValue);
        return;
      case McsPackage.CONSTANT_IDENTIFIER__NAME:
        setName((String)newValue);
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
      case McsPackage.CONSTANT_IDENTIFIER__TYPE:
        setType((type_expression)null);
        return;
      case McsPackage.CONSTANT_IDENTIFIER__LEFT_EXPR:
        setLeft_expr((constant_expression)null);
        return;
      case McsPackage.CONSTANT_IDENTIFIER__NAME:
        setName(NAME_EDEFAULT);
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
      case McsPackage.CONSTANT_IDENTIFIER__TYPE:
        return type != null;
      case McsPackage.CONSTANT_IDENTIFIER__LEFT_EXPR:
        return left_expr != null;
      case McsPackage.CONSTANT_IDENTIFIER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //constant_identifierImpl
