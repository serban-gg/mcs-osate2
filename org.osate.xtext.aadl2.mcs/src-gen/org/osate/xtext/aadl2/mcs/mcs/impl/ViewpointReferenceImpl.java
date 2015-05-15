/**
 */
package org.osate.xtext.aadl2.mcs.mcs.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.osate.xtext.aadl2.mcs.mcs.Enforcement_policy;
import org.osate.xtext.aadl2.mcs.mcs.MCSViewpoint;
import org.osate.xtext.aadl2.mcs.mcs.McsPackage;
import org.osate.xtext.aadl2.mcs.mcs.ViewpointReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Viewpoint Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.ViewpointReferenceImpl#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.ViewpointReferenceImpl#getVp_ref <em>Vp ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewpointReferenceImpl extends MinimalEObjectImpl.Container implements ViewpointReference
{
  /**
   * The cached value of the '{@link #getPolicy() <em>Policy</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPolicy()
   * @generated
   * @ordered
   */
  protected Enforcement_policy policy;

  /**
   * The cached value of the '{@link #getVp_ref() <em>Vp ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVp_ref()
   * @generated
   * @ordered
   */
  protected MCSViewpoint vp_ref;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ViewpointReferenceImpl()
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
    return McsPackage.Literals.VIEWPOINT_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Enforcement_policy getPolicy()
  {
    if (policy != null && policy.eIsProxy())
    {
      InternalEObject oldPolicy = (InternalEObject)policy;
      policy = (Enforcement_policy)eResolveProxy(oldPolicy);
      if (policy != oldPolicy)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, McsPackage.VIEWPOINT_REFERENCE__POLICY, oldPolicy, policy));
      }
    }
    return policy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Enforcement_policy basicGetPolicy()
  {
    return policy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPolicy(Enforcement_policy newPolicy)
  {
    Enforcement_policy oldPolicy = policy;
    policy = newPolicy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.VIEWPOINT_REFERENCE__POLICY, oldPolicy, policy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MCSViewpoint getVp_ref()
  {
    if (vp_ref != null && vp_ref.eIsProxy())
    {
      InternalEObject oldVp_ref = (InternalEObject)vp_ref;
      vp_ref = (MCSViewpoint)eResolveProxy(oldVp_ref);
      if (vp_ref != oldVp_ref)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, McsPackage.VIEWPOINT_REFERENCE__VP_REF, oldVp_ref, vp_ref));
      }
    }
    return vp_ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MCSViewpoint basicGetVp_ref()
  {
    return vp_ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVp_ref(MCSViewpoint newVp_ref)
  {
    MCSViewpoint oldVp_ref = vp_ref;
    vp_ref = newVp_ref;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.VIEWPOINT_REFERENCE__VP_REF, oldVp_ref, vp_ref));
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
      case McsPackage.VIEWPOINT_REFERENCE__POLICY:
        if (resolve) return getPolicy();
        return basicGetPolicy();
      case McsPackage.VIEWPOINT_REFERENCE__VP_REF:
        if (resolve) return getVp_ref();
        return basicGetVp_ref();
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
      case McsPackage.VIEWPOINT_REFERENCE__POLICY:
        setPolicy((Enforcement_policy)newValue);
        return;
      case McsPackage.VIEWPOINT_REFERENCE__VP_REF:
        setVp_ref((MCSViewpoint)newValue);
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
      case McsPackage.VIEWPOINT_REFERENCE__POLICY:
        setPolicy((Enforcement_policy)null);
        return;
      case McsPackage.VIEWPOINT_REFERENCE__VP_REF:
        setVp_ref((MCSViewpoint)null);
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
      case McsPackage.VIEWPOINT_REFERENCE__POLICY:
        return policy != null;
      case McsPackage.VIEWPOINT_REFERENCE__VP_REF:
        return vp_ref != null;
    }
    return super.eIsSet(featureID);
  }

} //ViewpointReferenceImpl
