/**
 */
package org.osate.xtext.aadl2.mcs.mcs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.osate.xtext.aadl2.mcs.mcs.McsPackage;
import org.osate.xtext.aadl2.mcs.mcs.McsTypedName;
import org.osate.xtext.aadl2.mcs.mcs.Mcs_name_ref;
import org.osate.xtext.aadl2.mcs.mcs.MethodChain;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mcs name ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.Mcs_name_refImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.Mcs_name_refImpl#getChain <em>Chain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Mcs_name_refImpl extends MinimalEObjectImpl.Container implements Mcs_name_ref
{
  /**
   * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRef()
   * @generated
   * @ordered
   */
  protected McsTypedName ref;

  /**
   * The cached value of the '{@link #getChain() <em>Chain</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChain()
   * @generated
   * @ordered
   */
  protected MethodChain chain;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Mcs_name_refImpl()
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
    return McsPackage.Literals.MCS_NAME_REF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public McsTypedName getRef()
  {
    if (ref != null && ref.eIsProxy())
    {
      InternalEObject oldRef = (InternalEObject)ref;
      ref = (McsTypedName)eResolveProxy(oldRef);
      if (ref != oldRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, McsPackage.MCS_NAME_REF__REF, oldRef, ref));
      }
    }
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public McsTypedName basicGetRef()
  {
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRef(McsTypedName newRef)
  {
    McsTypedName oldRef = ref;
    ref = newRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.MCS_NAME_REF__REF, oldRef, ref));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodChain getChain()
  {
    return chain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetChain(MethodChain newChain, NotificationChain msgs)
  {
    MethodChain oldChain = chain;
    chain = newChain;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.MCS_NAME_REF__CHAIN, oldChain, newChain);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChain(MethodChain newChain)
  {
    if (newChain != chain)
    {
      NotificationChain msgs = null;
      if (chain != null)
        msgs = ((InternalEObject)chain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.MCS_NAME_REF__CHAIN, null, msgs);
      if (newChain != null)
        msgs = ((InternalEObject)newChain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.MCS_NAME_REF__CHAIN, null, msgs);
      msgs = basicSetChain(newChain, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.MCS_NAME_REF__CHAIN, newChain, newChain));
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
      case McsPackage.MCS_NAME_REF__CHAIN:
        return basicSetChain(null, msgs);
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
      case McsPackage.MCS_NAME_REF__REF:
        if (resolve) return getRef();
        return basicGetRef();
      case McsPackage.MCS_NAME_REF__CHAIN:
        return getChain();
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
      case McsPackage.MCS_NAME_REF__REF:
        setRef((McsTypedName)newValue);
        return;
      case McsPackage.MCS_NAME_REF__CHAIN:
        setChain((MethodChain)newValue);
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
      case McsPackage.MCS_NAME_REF__REF:
        setRef((McsTypedName)null);
        return;
      case McsPackage.MCS_NAME_REF__CHAIN:
        setChain((MethodChain)null);
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
      case McsPackage.MCS_NAME_REF__REF:
        return ref != null;
      case McsPackage.MCS_NAME_REF__CHAIN:
        return chain != null;
    }
    return super.eIsSet(featureID);
  }

} //Mcs_name_refImpl
