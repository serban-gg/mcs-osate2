/**
 */
package org.osate.xtext.aadl2.mcs.mcs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.osate.xtext.aadl2.mcs.mcs.MCSAnnexLibrary;
import org.osate.xtext.aadl2.mcs.mcs.MCSAnnexSubclause;
import org.osate.xtext.aadl2.mcs.mcs.MCSGrammarRoot;
import org.osate.xtext.aadl2.mcs.mcs.McsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MCS Grammar Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.MCSGrammarRootImpl#getLib <em>Lib</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.MCSGrammarRootImpl#getSubclause <em>Subclause</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MCSGrammarRootImpl extends MinimalEObjectImpl.Container implements MCSGrammarRoot
{
  /**
   * The cached value of the '{@link #getLib() <em>Lib</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLib()
   * @generated
   * @ordered
   */
  protected MCSAnnexLibrary lib;

  /**
   * The cached value of the '{@link #getSubclause() <em>Subclause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubclause()
   * @generated
   * @ordered
   */
  protected MCSAnnexSubclause subclause;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MCSGrammarRootImpl()
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
    return McsPackage.Literals.MCS_GRAMMAR_ROOT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MCSAnnexLibrary getLib()
  {
    return lib;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLib(MCSAnnexLibrary newLib, NotificationChain msgs)
  {
    MCSAnnexLibrary oldLib = lib;
    lib = newLib;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.MCS_GRAMMAR_ROOT__LIB, oldLib, newLib);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLib(MCSAnnexLibrary newLib)
  {
    if (newLib != lib)
    {
      NotificationChain msgs = null;
      if (lib != null)
        msgs = ((InternalEObject)lib).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.MCS_GRAMMAR_ROOT__LIB, null, msgs);
      if (newLib != null)
        msgs = ((InternalEObject)newLib).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.MCS_GRAMMAR_ROOT__LIB, null, msgs);
      msgs = basicSetLib(newLib, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.MCS_GRAMMAR_ROOT__LIB, newLib, newLib));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MCSAnnexSubclause getSubclause()
  {
    return subclause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSubclause(MCSAnnexSubclause newSubclause, NotificationChain msgs)
  {
    MCSAnnexSubclause oldSubclause = subclause;
    subclause = newSubclause;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.MCS_GRAMMAR_ROOT__SUBCLAUSE, oldSubclause, newSubclause);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubclause(MCSAnnexSubclause newSubclause)
  {
    if (newSubclause != subclause)
    {
      NotificationChain msgs = null;
      if (subclause != null)
        msgs = ((InternalEObject)subclause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.MCS_GRAMMAR_ROOT__SUBCLAUSE, null, msgs);
      if (newSubclause != null)
        msgs = ((InternalEObject)newSubclause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.MCS_GRAMMAR_ROOT__SUBCLAUSE, null, msgs);
      msgs = basicSetSubclause(newSubclause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.MCS_GRAMMAR_ROOT__SUBCLAUSE, newSubclause, newSubclause));
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
      case McsPackage.MCS_GRAMMAR_ROOT__LIB:
        return basicSetLib(null, msgs);
      case McsPackage.MCS_GRAMMAR_ROOT__SUBCLAUSE:
        return basicSetSubclause(null, msgs);
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
      case McsPackage.MCS_GRAMMAR_ROOT__LIB:
        return getLib();
      case McsPackage.MCS_GRAMMAR_ROOT__SUBCLAUSE:
        return getSubclause();
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
      case McsPackage.MCS_GRAMMAR_ROOT__LIB:
        setLib((MCSAnnexLibrary)newValue);
        return;
      case McsPackage.MCS_GRAMMAR_ROOT__SUBCLAUSE:
        setSubclause((MCSAnnexSubclause)newValue);
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
      case McsPackage.MCS_GRAMMAR_ROOT__LIB:
        setLib((MCSAnnexLibrary)null);
        return;
      case McsPackage.MCS_GRAMMAR_ROOT__SUBCLAUSE:
        setSubclause((MCSAnnexSubclause)null);
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
      case McsPackage.MCS_GRAMMAR_ROOT__LIB:
        return lib != null;
      case McsPackage.MCS_GRAMMAR_ROOT__SUBCLAUSE:
        return subclause != null;
    }
    return super.eIsSet(featureID);
  }

} //MCSGrammarRootImpl
