/**
 */
package org.osate.xtext.aadl2.mcs.mcs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.osate.aadl2.ComponentClassifier;

import org.osate.xtext.aadl2.mcs.mcs.Classifier_literal;
import org.osate.xtext.aadl2.mcs.mcs.McsPackage;
import org.osate.xtext.aadl2.mcs.mcs.Mcs_name_ref;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.Classifier_literalImpl#getClasslit <em>Classlit</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.Classifier_literalImpl#getArg <em>Arg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Classifier_literalImpl extends MinimalEObjectImpl.Container implements Classifier_literal
{
  /**
   * The cached value of the '{@link #getClasslit() <em>Classlit</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClasslit()
   * @generated
   * @ordered
   */
  protected ComponentClassifier classlit;

  /**
   * The cached value of the '{@link #getArg() <em>Arg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArg()
   * @generated
   * @ordered
   */
  protected Mcs_name_ref arg;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Classifier_literalImpl()
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
    return McsPackage.Literals.CLASSIFIER_LITERAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentClassifier getClasslit()
  {
    if (classlit != null && ((EObject)classlit).eIsProxy())
    {
      InternalEObject oldClasslit = (InternalEObject)classlit;
      classlit = (ComponentClassifier)eResolveProxy(oldClasslit);
      if (classlit != oldClasslit)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, McsPackage.CLASSIFIER_LITERAL__CLASSLIT, oldClasslit, classlit));
      }
    }
    return classlit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentClassifier basicGetClasslit()
  {
    return classlit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClasslit(ComponentClassifier newClasslit)
  {
    ComponentClassifier oldClasslit = classlit;
    classlit = newClasslit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.CLASSIFIER_LITERAL__CLASSLIT, oldClasslit, classlit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mcs_name_ref getArg()
  {
    return arg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArg(Mcs_name_ref newArg, NotificationChain msgs)
  {
    Mcs_name_ref oldArg = arg;
    arg = newArg;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.CLASSIFIER_LITERAL__ARG, oldArg, newArg);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArg(Mcs_name_ref newArg)
  {
    if (newArg != arg)
    {
      NotificationChain msgs = null;
      if (arg != null)
        msgs = ((InternalEObject)arg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.CLASSIFIER_LITERAL__ARG, null, msgs);
      if (newArg != null)
        msgs = ((InternalEObject)newArg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.CLASSIFIER_LITERAL__ARG, null, msgs);
      msgs = basicSetArg(newArg, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.CLASSIFIER_LITERAL__ARG, newArg, newArg));
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
      case McsPackage.CLASSIFIER_LITERAL__ARG:
        return basicSetArg(null, msgs);
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
      case McsPackage.CLASSIFIER_LITERAL__CLASSLIT:
        if (resolve) return getClasslit();
        return basicGetClasslit();
      case McsPackage.CLASSIFIER_LITERAL__ARG:
        return getArg();
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
      case McsPackage.CLASSIFIER_LITERAL__CLASSLIT:
        setClasslit((ComponentClassifier)newValue);
        return;
      case McsPackage.CLASSIFIER_LITERAL__ARG:
        setArg((Mcs_name_ref)newValue);
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
      case McsPackage.CLASSIFIER_LITERAL__CLASSLIT:
        setClasslit((ComponentClassifier)null);
        return;
      case McsPackage.CLASSIFIER_LITERAL__ARG:
        setArg((Mcs_name_ref)null);
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
      case McsPackage.CLASSIFIER_LITERAL__CLASSLIT:
        return classlit != null;
      case McsPackage.CLASSIFIER_LITERAL__ARG:
        return arg != null;
    }
    return super.eIsSet(featureID);
  }

} //Classifier_literalImpl
