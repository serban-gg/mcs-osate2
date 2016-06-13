/**
 */
package org.osate.xtext.aadl2.mcs.mcs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.osate.xtext.aadl2.mcs.mcs.Classifiers;
import org.osate.xtext.aadl2.mcs.mcs.McsPackage;
import org.osate.xtext.aadl2.mcs.mcs.Theorem_root;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Theorem root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.Theorem_rootImpl#isNilroot <em>Nilroot</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.Theorem_rootImpl#getClassifier <em>Classifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Theorem_rootImpl extends MinimalEObjectImpl.Container implements Theorem_root
{
  /**
   * The default value of the '{@link #isNilroot() <em>Nilroot</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNilroot()
   * @generated
   * @ordered
   */
  protected static final boolean NILROOT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNilroot() <em>Nilroot</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNilroot()
   * @generated
   * @ordered
   */
  protected boolean nilroot = NILROOT_EDEFAULT;

  /**
   * The cached value of the '{@link #getClassifier() <em>Classifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassifier()
   * @generated
   * @ordered
   */
  protected Classifiers classifier;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Theorem_rootImpl()
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
    return McsPackage.Literals.THEOREM_ROOT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNilroot()
  {
    return nilroot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNilroot(boolean newNilroot)
  {
    boolean oldNilroot = nilroot;
    nilroot = newNilroot;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.THEOREM_ROOT__NILROOT, oldNilroot, nilroot));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Classifiers getClassifier()
  {
    return classifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClassifier(Classifiers newClassifier, NotificationChain msgs)
  {
    Classifiers oldClassifier = classifier;
    classifier = newClassifier;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.THEOREM_ROOT__CLASSIFIER, oldClassifier, newClassifier);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClassifier(Classifiers newClassifier)
  {
    if (newClassifier != classifier)
    {
      NotificationChain msgs = null;
      if (classifier != null)
        msgs = ((InternalEObject)classifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.THEOREM_ROOT__CLASSIFIER, null, msgs);
      if (newClassifier != null)
        msgs = ((InternalEObject)newClassifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.THEOREM_ROOT__CLASSIFIER, null, msgs);
      msgs = basicSetClassifier(newClassifier, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.THEOREM_ROOT__CLASSIFIER, newClassifier, newClassifier));
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
      case McsPackage.THEOREM_ROOT__CLASSIFIER:
        return basicSetClassifier(null, msgs);
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
      case McsPackage.THEOREM_ROOT__NILROOT:
        return isNilroot();
      case McsPackage.THEOREM_ROOT__CLASSIFIER:
        return getClassifier();
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
      case McsPackage.THEOREM_ROOT__NILROOT:
        setNilroot((Boolean)newValue);
        return;
      case McsPackage.THEOREM_ROOT__CLASSIFIER:
        setClassifier((Classifiers)newValue);
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
      case McsPackage.THEOREM_ROOT__NILROOT:
        setNilroot(NILROOT_EDEFAULT);
        return;
      case McsPackage.THEOREM_ROOT__CLASSIFIER:
        setClassifier((Classifiers)null);
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
      case McsPackage.THEOREM_ROOT__NILROOT:
        return nilroot != NILROOT_EDEFAULT;
      case McsPackage.THEOREM_ROOT__CLASSIFIER:
        return classifier != null;
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
    result.append(" (nilroot: ");
    result.append(nilroot);
    result.append(')');
    return result.toString();
  }

} //Theorem_rootImpl
