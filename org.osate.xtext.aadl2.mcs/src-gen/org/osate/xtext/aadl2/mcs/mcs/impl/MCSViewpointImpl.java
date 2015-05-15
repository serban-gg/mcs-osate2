/**
 */
package org.osate.xtext.aadl2.mcs.mcs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.osate.xtext.aadl2.mcs.mcs.Enforcement_policy;
import org.osate.xtext.aadl2.mcs.mcs.MCSViewpoint;
import org.osate.xtext.aadl2.mcs.mcs.McsPackage;
import org.osate.xtext.aadl2.mcs.mcs.PackageScript;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MCS Viewpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.MCSViewpointImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.MCSViewpointImpl#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.MCSViewpointImpl#getPscript <em>Pscript</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MCSViewpointImpl extends MinimalEObjectImpl.Container implements MCSViewpoint
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
   * The cached value of the '{@link #getPolicy() <em>Policy</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPolicy()
   * @generated
   * @ordered
   */
  protected Enforcement_policy policy;

  /**
   * The cached value of the '{@link #getPscript() <em>Pscript</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPscript()
   * @generated
   * @ordered
   */
  protected PackageScript pscript;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MCSViewpointImpl()
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
    return McsPackage.Literals.MCS_VIEWPOINT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.MCS_VIEWPOINT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Enforcement_policy getPolicy()
  {
    return policy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPolicy(Enforcement_policy newPolicy, NotificationChain msgs)
  {
    Enforcement_policy oldPolicy = policy;
    policy = newPolicy;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.MCS_VIEWPOINT__POLICY, oldPolicy, newPolicy);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPolicy(Enforcement_policy newPolicy)
  {
    if (newPolicy != policy)
    {
      NotificationChain msgs = null;
      if (policy != null)
        msgs = ((InternalEObject)policy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.MCS_VIEWPOINT__POLICY, null, msgs);
      if (newPolicy != null)
        msgs = ((InternalEObject)newPolicy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.MCS_VIEWPOINT__POLICY, null, msgs);
      msgs = basicSetPolicy(newPolicy, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.MCS_VIEWPOINT__POLICY, newPolicy, newPolicy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageScript getPscript()
  {
    return pscript;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPscript(PackageScript newPscript, NotificationChain msgs)
  {
    PackageScript oldPscript = pscript;
    pscript = newPscript;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.MCS_VIEWPOINT__PSCRIPT, oldPscript, newPscript);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPscript(PackageScript newPscript)
  {
    if (newPscript != pscript)
    {
      NotificationChain msgs = null;
      if (pscript != null)
        msgs = ((InternalEObject)pscript).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.MCS_VIEWPOINT__PSCRIPT, null, msgs);
      if (newPscript != null)
        msgs = ((InternalEObject)newPscript).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.MCS_VIEWPOINT__PSCRIPT, null, msgs);
      msgs = basicSetPscript(newPscript, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.MCS_VIEWPOINT__PSCRIPT, newPscript, newPscript));
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
      case McsPackage.MCS_VIEWPOINT__POLICY:
        return basicSetPolicy(null, msgs);
      case McsPackage.MCS_VIEWPOINT__PSCRIPT:
        return basicSetPscript(null, msgs);
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
      case McsPackage.MCS_VIEWPOINT__NAME:
        return getName();
      case McsPackage.MCS_VIEWPOINT__POLICY:
        return getPolicy();
      case McsPackage.MCS_VIEWPOINT__PSCRIPT:
        return getPscript();
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
      case McsPackage.MCS_VIEWPOINT__NAME:
        setName((String)newValue);
        return;
      case McsPackage.MCS_VIEWPOINT__POLICY:
        setPolicy((Enforcement_policy)newValue);
        return;
      case McsPackage.MCS_VIEWPOINT__PSCRIPT:
        setPscript((PackageScript)newValue);
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
      case McsPackage.MCS_VIEWPOINT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case McsPackage.MCS_VIEWPOINT__POLICY:
        setPolicy((Enforcement_policy)null);
        return;
      case McsPackage.MCS_VIEWPOINT__PSCRIPT:
        setPscript((PackageScript)null);
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
      case McsPackage.MCS_VIEWPOINT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case McsPackage.MCS_VIEWPOINT__POLICY:
        return policy != null;
      case McsPackage.MCS_VIEWPOINT__PSCRIPT:
        return pscript != null;
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

} //MCSViewpointImpl
