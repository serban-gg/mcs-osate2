/**
 */
package org.osate.xtext.aadl2.mcs.mcs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.xtext.aadl2.mcs.mcs.AppliesToClause;
import org.osate.xtext.aadl2.mcs.mcs.ConstraintsBlock;
import org.osate.xtext.aadl2.mcs.mcs.McsPackage;
import org.osate.xtext.aadl2.mcs.mcs.PackageScript;
import org.osate.xtext.aadl2.mcs.mcs.ViewpointReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Script</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.PackageScriptImpl#getApplies <em>Applies</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.PackageScriptImpl#getC_block <em>Cblock</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.PackageScriptImpl#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageScriptImpl extends MinimalEObjectImpl.Container implements PackageScript
{
  /**
   * The cached value of the '{@link #getApplies() <em>Applies</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getApplies()
   * @generated
   * @ordered
   */
  protected EList<AppliesToClause> applies;

  /**
   * The cached value of the '{@link #getC_block() <em>Cblock</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getC_block()
   * @generated
   * @ordered
   */
  protected EList<ConstraintsBlock> c_block;

  /**
   * The cached value of the '{@link #getRef() <em>Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRef()
   * @generated
   * @ordered
   */
  protected ViewpointReference ref;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PackageScriptImpl()
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
    return McsPackage.Literals.PACKAGE_SCRIPT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AppliesToClause> getApplies()
  {
    if (applies == null)
    {
      applies = new EObjectContainmentEList<AppliesToClause>(AppliesToClause.class, this, McsPackage.PACKAGE_SCRIPT__APPLIES);
    }
    return applies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ConstraintsBlock> getC_block()
  {
    if (c_block == null)
    {
      c_block = new EObjectContainmentEList<ConstraintsBlock>(ConstraintsBlock.class, this, McsPackage.PACKAGE_SCRIPT__CBLOCK);
    }
    return c_block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewpointReference getRef()
  {
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRef(ViewpointReference newRef, NotificationChain msgs)
  {
    ViewpointReference oldRef = ref;
    ref = newRef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.PACKAGE_SCRIPT__REF, oldRef, newRef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRef(ViewpointReference newRef)
  {
    if (newRef != ref)
    {
      NotificationChain msgs = null;
      if (ref != null)
        msgs = ((InternalEObject)ref).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.PACKAGE_SCRIPT__REF, null, msgs);
      if (newRef != null)
        msgs = ((InternalEObject)newRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.PACKAGE_SCRIPT__REF, null, msgs);
      msgs = basicSetRef(newRef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.PACKAGE_SCRIPT__REF, newRef, newRef));
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
      case McsPackage.PACKAGE_SCRIPT__APPLIES:
        return ((InternalEList<?>)getApplies()).basicRemove(otherEnd, msgs);
      case McsPackage.PACKAGE_SCRIPT__CBLOCK:
        return ((InternalEList<?>)getC_block()).basicRemove(otherEnd, msgs);
      case McsPackage.PACKAGE_SCRIPT__REF:
        return basicSetRef(null, msgs);
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
      case McsPackage.PACKAGE_SCRIPT__APPLIES:
        return getApplies();
      case McsPackage.PACKAGE_SCRIPT__CBLOCK:
        return getC_block();
      case McsPackage.PACKAGE_SCRIPT__REF:
        return getRef();
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
      case McsPackage.PACKAGE_SCRIPT__APPLIES:
        getApplies().clear();
        getApplies().addAll((Collection<? extends AppliesToClause>)newValue);
        return;
      case McsPackage.PACKAGE_SCRIPT__CBLOCK:
        getC_block().clear();
        getC_block().addAll((Collection<? extends ConstraintsBlock>)newValue);
        return;
      case McsPackage.PACKAGE_SCRIPT__REF:
        setRef((ViewpointReference)newValue);
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
      case McsPackage.PACKAGE_SCRIPT__APPLIES:
        getApplies().clear();
        return;
      case McsPackage.PACKAGE_SCRIPT__CBLOCK:
        getC_block().clear();
        return;
      case McsPackage.PACKAGE_SCRIPT__REF:
        setRef((ViewpointReference)null);
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
      case McsPackage.PACKAGE_SCRIPT__APPLIES:
        return applies != null && !applies.isEmpty();
      case McsPackage.PACKAGE_SCRIPT__CBLOCK:
        return c_block != null && !c_block.isEmpty();
      case McsPackage.PACKAGE_SCRIPT__REF:
        return ref != null;
    }
    return super.eIsSet(featureID);
  }

} //PackageScriptImpl
