/**
 */
package org.osate.xtext.aadl2.mcs.mcs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.xtext.aadl2.mcs.mcs.McsPackage;
import org.osate.xtext.aadl2.mcs.mcs.type_expression;
import org.osate.xtext.aadl2.mcs.mcs.union_type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>union type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.union_typeImpl#getTypename <em>Typename</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.union_typeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class union_typeImpl extends composite_typeImpl implements union_type
{
  /**
   * The cached value of the '{@link #getTypename() <em>Typename</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypename()
   * @generated
   * @ordered
   */
  protected EList<String> typename;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected EList<type_expression> type;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected union_typeImpl()
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
    return McsPackage.Literals.UNION_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getTypename()
  {
    if (typename == null)
    {
      typename = new EDataTypeEList<String>(String.class, this, McsPackage.UNION_TYPE__TYPENAME);
    }
    return typename;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<type_expression> getType()
  {
    if (type == null)
    {
      type = new EObjectContainmentEList<type_expression>(type_expression.class, this, McsPackage.UNION_TYPE__TYPE);
    }
    return type;
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
      case McsPackage.UNION_TYPE__TYPE:
        return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
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
      case McsPackage.UNION_TYPE__TYPENAME:
        return getTypename();
      case McsPackage.UNION_TYPE__TYPE:
        return getType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case McsPackage.UNION_TYPE__TYPENAME:
        getTypename().clear();
        getTypename().addAll((Collection<? extends String>)newValue);
        return;
      case McsPackage.UNION_TYPE__TYPE:
        getType().clear();
        getType().addAll((Collection<? extends type_expression>)newValue);
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
      case McsPackage.UNION_TYPE__TYPENAME:
        getTypename().clear();
        return;
      case McsPackage.UNION_TYPE__TYPE:
        getType().clear();
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
      case McsPackage.UNION_TYPE__TYPENAME:
        return typename != null && !typename.isEmpty();
      case McsPackage.UNION_TYPE__TYPE:
        return type != null && !type.isEmpty();
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
    result.append(" (typename: ");
    result.append(typename);
    result.append(')');
    return result.toString();
  }

} //union_typeImpl
