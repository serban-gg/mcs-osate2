/**
 */
package org.osate.xtext.aadl2.mcs.mcs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.xtext.aadl2.mcs.mcs.McsPackage;
import org.osate.xtext.aadl2.mcs.mcs.Set_type;
import org.osate.xtext.aadl2.mcs.mcs.Type_expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.Set_typeImpl#getRoot_type <em>Root type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Set_typeImpl extends Composite_typeImpl implements Set_type
{
  /**
   * The cached value of the '{@link #getRoot_type() <em>Root type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRoot_type()
   * @generated
   * @ordered
   */
  protected Type_expression root_type;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Set_typeImpl()
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
    return McsPackage.Literals.SET_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type_expression getRoot_type()
  {
    return root_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRoot_type(Type_expression newRoot_type, NotificationChain msgs)
  {
    Type_expression oldRoot_type = root_type;
    root_type = newRoot_type;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.SET_TYPE__ROOT_TYPE, oldRoot_type, newRoot_type);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRoot_type(Type_expression newRoot_type)
  {
    if (newRoot_type != root_type)
    {
      NotificationChain msgs = null;
      if (root_type != null)
        msgs = ((InternalEObject)root_type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.SET_TYPE__ROOT_TYPE, null, msgs);
      if (newRoot_type != null)
        msgs = ((InternalEObject)newRoot_type).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.SET_TYPE__ROOT_TYPE, null, msgs);
      msgs = basicSetRoot_type(newRoot_type, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.SET_TYPE__ROOT_TYPE, newRoot_type, newRoot_type));
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
      case McsPackage.SET_TYPE__ROOT_TYPE:
        return basicSetRoot_type(null, msgs);
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
      case McsPackage.SET_TYPE__ROOT_TYPE:
        return getRoot_type();
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
      case McsPackage.SET_TYPE__ROOT_TYPE:
        setRoot_type((Type_expression)newValue);
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
      case McsPackage.SET_TYPE__ROOT_TYPE:
        setRoot_type((Type_expression)null);
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
      case McsPackage.SET_TYPE__ROOT_TYPE:
        return root_type != null;
    }
    return super.eIsSet(featureID);
  }

} //Set_typeImpl
