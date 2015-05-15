/**
 */
package org.osate.xtext.aadl2.mcs.mcs.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.osate.xtext.aadl2.mcs.mcs.MCSViewpoint;
import org.osate.xtext.aadl2.mcs.mcs.McsPackage;
import org.osate.xtext.aadl2.mcs.mcs.PackageEnforce;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Enforce</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.PackageEnforceImpl#getViewpoint <em>Viewpoint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageEnforceImpl extends MinimalEObjectImpl.Container implements PackageEnforce
{
  /**
   * The cached value of the '{@link #getViewpoint() <em>Viewpoint</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getViewpoint()
   * @generated
   * @ordered
   */
  protected MCSViewpoint viewpoint;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PackageEnforceImpl()
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
    return McsPackage.Literals.PACKAGE_ENFORCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MCSViewpoint getViewpoint()
  {
    if (viewpoint != null && viewpoint.eIsProxy())
    {
      InternalEObject oldViewpoint = (InternalEObject)viewpoint;
      viewpoint = (MCSViewpoint)eResolveProxy(oldViewpoint);
      if (viewpoint != oldViewpoint)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, McsPackage.PACKAGE_ENFORCE__VIEWPOINT, oldViewpoint, viewpoint));
      }
    }
    return viewpoint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MCSViewpoint basicGetViewpoint()
  {
    return viewpoint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setViewpoint(MCSViewpoint newViewpoint)
  {
    MCSViewpoint oldViewpoint = viewpoint;
    viewpoint = newViewpoint;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.PACKAGE_ENFORCE__VIEWPOINT, oldViewpoint, viewpoint));
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
      case McsPackage.PACKAGE_ENFORCE__VIEWPOINT:
        if (resolve) return getViewpoint();
        return basicGetViewpoint();
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
      case McsPackage.PACKAGE_ENFORCE__VIEWPOINT:
        setViewpoint((MCSViewpoint)newValue);
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
      case McsPackage.PACKAGE_ENFORCE__VIEWPOINT:
        setViewpoint((MCSViewpoint)null);
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
      case McsPackage.PACKAGE_ENFORCE__VIEWPOINT:
        return viewpoint != null;
    }
    return super.eIsSet(featureID);
  }

} //PackageEnforceImpl
