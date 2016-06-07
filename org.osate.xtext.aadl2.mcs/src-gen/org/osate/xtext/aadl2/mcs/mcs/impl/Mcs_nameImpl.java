/**
 */
package org.osate.xtext.aadl2.mcs.mcs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.osate.xtext.aadl2.mcs.mcs.BuiltInFnCallExpr;
import org.osate.xtext.aadl2.mcs.mcs.FnCallExpr;
import org.osate.xtext.aadl2.mcs.mcs.McsPackage;
import org.osate.xtext.aadl2.mcs.mcs.Mcs_name;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mcs name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.Mcs_nameImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.Mcs_nameImpl#getBuiltin <em>Builtin</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.Mcs_nameImpl#getMethod <em>Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Mcs_nameImpl extends Classifier_literalImpl implements Mcs_name
{
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
   * The cached value of the '{@link #getBuiltin() <em>Builtin</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBuiltin()
   * @generated
   * @ordered
   */
  protected EList<BuiltInFnCallExpr> builtin;

  /**
   * The cached value of the '{@link #getMethod() <em>Method</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected EList<FnCallExpr> method;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Mcs_nameImpl()
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
    return McsPackage.Literals.MCS_NAME;
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
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.MCS_NAME__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BuiltInFnCallExpr> getBuiltin()
  {
    if (builtin == null)
    {
      builtin = new EObjectResolvingEList<BuiltInFnCallExpr>(BuiltInFnCallExpr.class, this, McsPackage.MCS_NAME__BUILTIN);
    }
    return builtin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FnCallExpr> getMethod()
  {
    if (method == null)
    {
      method = new EObjectResolvingEList<FnCallExpr>(FnCallExpr.class, this, McsPackage.MCS_NAME__METHOD);
    }
    return method;
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
      case McsPackage.MCS_NAME__NAME:
        return getName();
      case McsPackage.MCS_NAME__BUILTIN:
        return getBuiltin();
      case McsPackage.MCS_NAME__METHOD:
        return getMethod();
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
      case McsPackage.MCS_NAME__NAME:
        setName((String)newValue);
        return;
      case McsPackage.MCS_NAME__BUILTIN:
        getBuiltin().clear();
        getBuiltin().addAll((Collection<? extends BuiltInFnCallExpr>)newValue);
        return;
      case McsPackage.MCS_NAME__METHOD:
        getMethod().clear();
        getMethod().addAll((Collection<? extends FnCallExpr>)newValue);
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
      case McsPackage.MCS_NAME__NAME:
        setName(NAME_EDEFAULT);
        return;
      case McsPackage.MCS_NAME__BUILTIN:
        getBuiltin().clear();
        return;
      case McsPackage.MCS_NAME__METHOD:
        getMethod().clear();
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
      case McsPackage.MCS_NAME__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case McsPackage.MCS_NAME__BUILTIN:
        return builtin != null && !builtin.isEmpty();
      case McsPackage.MCS_NAME__METHOD:
        return method != null && !method.isEmpty();
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

} //Mcs_nameImpl
