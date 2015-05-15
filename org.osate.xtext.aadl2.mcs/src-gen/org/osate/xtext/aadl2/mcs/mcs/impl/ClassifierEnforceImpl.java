/**
 */
package org.osate.xtext.aadl2.mcs.mcs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.osate.xtext.aadl2.mcs.mcs.ClassifierEnforce;
import org.osate.xtext.aadl2.mcs.mcs.ClassifierScript;
import org.osate.xtext.aadl2.mcs.mcs.MCSViewpoint;
import org.osate.xtext.aadl2.mcs.mcs.McsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier Enforce</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.ClassifierEnforceImpl#getViewpoint <em>Viewpoint</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.ClassifierEnforceImpl#getScript <em>Script</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassifierEnforceImpl extends MinimalEObjectImpl.Container implements ClassifierEnforce
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
   * The cached value of the '{@link #getScript() <em>Script</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScript()
   * @generated
   * @ordered
   */
  protected ClassifierScript script;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClassifierEnforceImpl()
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
    return McsPackage.Literals.CLASSIFIER_ENFORCE;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, McsPackage.CLASSIFIER_ENFORCE__VIEWPOINT, oldViewpoint, viewpoint));
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
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.CLASSIFIER_ENFORCE__VIEWPOINT, oldViewpoint, viewpoint));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassifierScript getScript()
  {
    return script;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetScript(ClassifierScript newScript, NotificationChain msgs)
  {
    ClassifierScript oldScript = script;
    script = newScript;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.CLASSIFIER_ENFORCE__SCRIPT, oldScript, newScript);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScript(ClassifierScript newScript)
  {
    if (newScript != script)
    {
      NotificationChain msgs = null;
      if (script != null)
        msgs = ((InternalEObject)script).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.CLASSIFIER_ENFORCE__SCRIPT, null, msgs);
      if (newScript != null)
        msgs = ((InternalEObject)newScript).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.CLASSIFIER_ENFORCE__SCRIPT, null, msgs);
      msgs = basicSetScript(newScript, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.CLASSIFIER_ENFORCE__SCRIPT, newScript, newScript));
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
      case McsPackage.CLASSIFIER_ENFORCE__SCRIPT:
        return basicSetScript(null, msgs);
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
      case McsPackage.CLASSIFIER_ENFORCE__VIEWPOINT:
        if (resolve) return getViewpoint();
        return basicGetViewpoint();
      case McsPackage.CLASSIFIER_ENFORCE__SCRIPT:
        return getScript();
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
      case McsPackage.CLASSIFIER_ENFORCE__VIEWPOINT:
        setViewpoint((MCSViewpoint)newValue);
        return;
      case McsPackage.CLASSIFIER_ENFORCE__SCRIPT:
        setScript((ClassifierScript)newValue);
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
      case McsPackage.CLASSIFIER_ENFORCE__VIEWPOINT:
        setViewpoint((MCSViewpoint)null);
        return;
      case McsPackage.CLASSIFIER_ENFORCE__SCRIPT:
        setScript((ClassifierScript)null);
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
      case McsPackage.CLASSIFIER_ENFORCE__VIEWPOINT:
        return viewpoint != null;
      case McsPackage.CLASSIFIER_ENFORCE__SCRIPT:
        return script != null;
    }
    return super.eIsSet(featureID);
  }

} //ClassifierEnforceImpl
