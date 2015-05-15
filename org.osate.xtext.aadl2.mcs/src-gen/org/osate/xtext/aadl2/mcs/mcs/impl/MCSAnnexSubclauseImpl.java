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

import org.osate.xtext.aadl2.mcs.mcs.ClassifierEnforce;
import org.osate.xtext.aadl2.mcs.mcs.MCSAnnexSubclause;
import org.osate.xtext.aadl2.mcs.mcs.McsPackage;
import org.osate.xtext.aadl2.mcs.mcs.theorem_declaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MCS Annex Subclause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.MCSAnnexSubclauseImpl#getTheorems <em>Theorems</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.MCSAnnexSubclauseImpl#getEnforceclauses <em>Enforceclauses</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MCSAnnexSubclauseImpl extends AnnexSubclauseImpl implements MCSAnnexSubclause
{
  /**
   * The cached value of the '{@link #getTheorems() <em>Theorems</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTheorems()
   * @generated
   * @ordered
   */
  protected EList<theorem_declaration> theorems;

  /**
   * The cached value of the '{@link #getEnforceclauses() <em>Enforceclauses</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnforceclauses()
   * @generated
   * @ordered
   */
  protected EList<ClassifierEnforce> enforceclauses;

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
  public EList<theorem_declaration> getTheorems()
  {
    if (theorems == null)
    {
      theorems = new EObjectContainmentEList<theorem_declaration>(theorem_declaration.class, this, McsPackage.MCS_ANNEX_SUBCLAUSE__THEOREMS);
    }
    return theorems;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ClassifierEnforce> getEnforceclauses()
  {
    if (enforceclauses == null)
    {
      enforceclauses = new EObjectContainmentEList<ClassifierEnforce>(ClassifierEnforce.class, this, McsPackage.MCS_ANNEX_SUBCLAUSE__ENFORCECLAUSES);
    }
    return enforceclauses;
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
      case McsPackage.MCS_ANNEX_SUBCLAUSE__THEOREMS:
        return ((InternalEList<?>)getTheorems()).basicRemove(otherEnd, msgs);
      case McsPackage.MCS_ANNEX_SUBCLAUSE__ENFORCECLAUSES:
        return ((InternalEList<?>)getEnforceclauses()).basicRemove(otherEnd, msgs);
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
      case McsPackage.MCS_ANNEX_SUBCLAUSE__THEOREMS:
        return getTheorems();
      case McsPackage.MCS_ANNEX_SUBCLAUSE__ENFORCECLAUSES:
        return getEnforceclauses();
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
      case McsPackage.MCS_ANNEX_SUBCLAUSE__THEOREMS:
        getTheorems().clear();
        getTheorems().addAll((Collection<? extends theorem_declaration>)newValue);
        return;
      case McsPackage.MCS_ANNEX_SUBCLAUSE__ENFORCECLAUSES:
        getEnforceclauses().clear();
        getEnforceclauses().addAll((Collection<? extends ClassifierEnforce>)newValue);
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
      case McsPackage.MCS_ANNEX_SUBCLAUSE__THEOREMS:
        getTheorems().clear();
        return;
      case McsPackage.MCS_ANNEX_SUBCLAUSE__ENFORCECLAUSES:
        getEnforceclauses().clear();
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
      case McsPackage.MCS_ANNEX_SUBCLAUSE__THEOREMS:
        return theorems != null && !theorems.isEmpty();
      case McsPackage.MCS_ANNEX_SUBCLAUSE__ENFORCECLAUSES:
        return enforceclauses != null && !enforceclauses.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MCSAnnexSubclauseImpl
