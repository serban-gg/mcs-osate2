/**
 */
package org.osate.xtext.aadl2.mcs.mcs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.aadl2.impl.AnnexSubclauseImpl;

import org.osate.xtext.aadl2.mcs.mcs.MCSAnnexSubclause;
import org.osate.xtext.aadl2.mcs.mcs.McsPackage;
import org.osate.xtext.aadl2.mcs.mcs.TheoremCall;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MCS Annex Subclause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.MCSAnnexSubclauseImpl#getCalls <em>Calls</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MCSAnnexSubclauseImpl extends AnnexSubclauseImpl implements MCSAnnexSubclause
{
  /**
   * The cached value of the '{@link #getCalls() <em>Calls</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCalls()
   * @generated
   * @ordered
   */
  protected EList<TheoremCall> calls;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MCSAnnexSubclauseImpl()
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
    return McsPackage.Literals.MCS_ANNEX_SUBCLAUSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TheoremCall> getCalls()
  {
    if (calls == null)
    {
      calls = new EObjectContainmentEList<TheoremCall>(TheoremCall.class, this, McsPackage.MCS_ANNEX_SUBCLAUSE__CALLS);
    }
    return calls;
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
      case McsPackage.MCS_ANNEX_SUBCLAUSE__CALLS:
        return ((InternalEList<?>)getCalls()).basicRemove(otherEnd, msgs);
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
      case McsPackage.MCS_ANNEX_SUBCLAUSE__CALLS:
        return getCalls();
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
      case McsPackage.MCS_ANNEX_SUBCLAUSE__CALLS:
        getCalls().clear();
        getCalls().addAll((Collection<? extends TheoremCall>)newValue);
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
      case McsPackage.MCS_ANNEX_SUBCLAUSE__CALLS:
        getCalls().clear();
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
      case McsPackage.MCS_ANNEX_SUBCLAUSE__CALLS:
        return calls != null && !calls.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MCSAnnexSubclauseImpl
