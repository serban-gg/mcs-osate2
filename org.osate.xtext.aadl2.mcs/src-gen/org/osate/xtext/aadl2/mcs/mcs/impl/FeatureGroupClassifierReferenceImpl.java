/**
 */
package org.osate.xtext.aadl2.mcs.mcs.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.osate.aadl2.FeatureGroupType;

import org.osate.xtext.aadl2.mcs.mcs.FeatureGroupClassifierReference;
import org.osate.xtext.aadl2.mcs.mcs.McsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Group Classifier Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.FeatureGroupClassifierReferenceImpl#getFg <em>Fg</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureGroupClassifierReferenceImpl extends MinimalEObjectImpl.Container implements FeatureGroupClassifierReference
{
  /**
   * The cached value of the '{@link #getFg() <em>Fg</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFg()
   * @generated
   * @ordered
   */
  protected FeatureGroupType fg;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FeatureGroupClassifierReferenceImpl()
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
    return McsPackage.Literals.FEATURE_GROUP_CLASSIFIER_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureGroupType getFg()
  {
    if (fg != null && ((EObject)fg).eIsProxy())
    {
      InternalEObject oldFg = (InternalEObject)fg;
      fg = (FeatureGroupType)eResolveProxy(oldFg);
      if (fg != oldFg)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, McsPackage.FEATURE_GROUP_CLASSIFIER_REFERENCE__FG, oldFg, fg));
      }
    }
    return fg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureGroupType basicGetFg()
  {
    return fg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFg(FeatureGroupType newFg)
  {
    FeatureGroupType oldFg = fg;
    fg = newFg;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.FEATURE_GROUP_CLASSIFIER_REFERENCE__FG, oldFg, fg));
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
      case McsPackage.FEATURE_GROUP_CLASSIFIER_REFERENCE__FG:
        if (resolve) return getFg();
        return basicGetFg();
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
      case McsPackage.FEATURE_GROUP_CLASSIFIER_REFERENCE__FG:
        setFg((FeatureGroupType)newValue);
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
      case McsPackage.FEATURE_GROUP_CLASSIFIER_REFERENCE__FG:
        setFg((FeatureGroupType)null);
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
      case McsPackage.FEATURE_GROUP_CLASSIFIER_REFERENCE__FG:
        return fg != null;
    }
    return super.eIsSet(featureID);
  }

} //FeatureGroupClassifierReferenceImpl
