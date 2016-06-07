/**
 */
package org.osate.xtext.aadl2.mcs.mcs.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.xtext.aadl2.mcs.mcs.Mapping_type;
import org.osate.xtext.aadl2.mcs.mcs.McsPackage;
import org.osate.xtext.aadl2.mcs.mcs.Type_expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.Mapping_typeImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.Mapping_typeImpl#getVal <em>Val</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Mapping_typeImpl extends Composite_typeImpl implements Mapping_type
{
  /**
   * The cached value of the '{@link #getKey() <em>Key</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKey()
   * @generated
   * @ordered
   */
  protected Type_expression key;

  /**
   * The cached value of the '{@link #getVal() <em>Val</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal()
   * @generated
   * @ordered
   */
  protected Type_expression val;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Mapping_typeImpl()
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
    return McsPackage.Literals.MAPPING_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type_expression getKey()
  {
    if (key != null && key.eIsProxy())
    {
      InternalEObject oldKey = (InternalEObject)key;
      key = (Type_expression)eResolveProxy(oldKey);
      if (key != oldKey)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, McsPackage.MAPPING_TYPE__KEY, oldKey, key));
      }
    }
    return key;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type_expression basicGetKey()
  {
    return key;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKey(Type_expression newKey)
  {
    Type_expression oldKey = key;
    key = newKey;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.MAPPING_TYPE__KEY, oldKey, key));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type_expression getVal()
  {
    if (val != null && val.eIsProxy())
    {
      InternalEObject oldVal = (InternalEObject)val;
      val = (Type_expression)eResolveProxy(oldVal);
      if (val != oldVal)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, McsPackage.MAPPING_TYPE__VAL, oldVal, val));
      }
    }
    return val;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type_expression basicGetVal()
  {
    return val;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVal(Type_expression newVal)
  {
    Type_expression oldVal = val;
    val = newVal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.MAPPING_TYPE__VAL, oldVal, val));
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
      case McsPackage.MAPPING_TYPE__KEY:
        if (resolve) return getKey();
        return basicGetKey();
      case McsPackage.MAPPING_TYPE__VAL:
        if (resolve) return getVal();
        return basicGetVal();
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
      case McsPackage.MAPPING_TYPE__KEY:
        setKey((Type_expression)newValue);
        return;
      case McsPackage.MAPPING_TYPE__VAL:
        setVal((Type_expression)newValue);
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
      case McsPackage.MAPPING_TYPE__KEY:
        setKey((Type_expression)null);
        return;
      case McsPackage.MAPPING_TYPE__VAL:
        setVal((Type_expression)null);
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
      case McsPackage.MAPPING_TYPE__KEY:
        return key != null;
      case McsPackage.MAPPING_TYPE__VAL:
        return val != null;
    }
    return super.eIsSet(featureID);
  }

} //Mapping_typeImpl
