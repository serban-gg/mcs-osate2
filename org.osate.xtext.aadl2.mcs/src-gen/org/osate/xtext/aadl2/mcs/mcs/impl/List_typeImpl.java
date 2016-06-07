/**
 */
package org.osate.xtext.aadl2.mcs.mcs.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.xtext.aadl2.mcs.mcs.List_type;
import org.osate.xtext.aadl2.mcs.mcs.McsPackage;
import org.osate.xtext.aadl2.mcs.mcs.Type_expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.List_typeImpl#getRoot_type <em>Root type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class List_typeImpl extends Composite_typeImpl implements List_type
{
  /**
   * The cached value of the '{@link #getRoot_type() <em>Root type</em>}' reference.
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
  protected List_typeImpl()
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
    return McsPackage.Literals.LIST_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type_expression getRoot_type()
  {
    if (root_type != null && root_type.eIsProxy())
    {
      InternalEObject oldRoot_type = (InternalEObject)root_type;
      root_type = (Type_expression)eResolveProxy(oldRoot_type);
      if (root_type != oldRoot_type)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, McsPackage.LIST_TYPE__ROOT_TYPE, oldRoot_type, root_type));
      }
    }
    return root_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type_expression basicGetRoot_type()
  {
    return root_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRoot_type(Type_expression newRoot_type)
  {
    Type_expression oldRoot_type = root_type;
    root_type = newRoot_type;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.LIST_TYPE__ROOT_TYPE, oldRoot_type, root_type));
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
      case McsPackage.LIST_TYPE__ROOT_TYPE:
        if (resolve) return getRoot_type();
        return basicGetRoot_type();
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
      case McsPackage.LIST_TYPE__ROOT_TYPE:
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
      case McsPackage.LIST_TYPE__ROOT_TYPE:
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
      case McsPackage.LIST_TYPE__ROOT_TYPE:
        return root_type != null;
    }
    return super.eIsSet(featureID);
  }

} //List_typeImpl
