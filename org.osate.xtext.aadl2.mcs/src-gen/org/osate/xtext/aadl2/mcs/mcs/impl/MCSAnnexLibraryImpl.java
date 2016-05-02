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

import org.osate.aadl2.impl.AnnexLibraryImpl;

import org.osate.xtext.aadl2.mcs.mcs.Constant_declaration;
import org.osate.xtext.aadl2.mcs.mcs.Function_declaration;
import org.osate.xtext.aadl2.mcs.mcs.MCSAnnexLibrary;
import org.osate.xtext.aadl2.mcs.mcs.MCSViewpoint;
import org.osate.xtext.aadl2.mcs.mcs.McsPackage;
import org.osate.xtext.aadl2.mcs.mcs.PackageEnforce;
import org.osate.xtext.aadl2.mcs.mcs.Theorem_declaration;
import org.osate.xtext.aadl2.mcs.mcs.Type_declaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MCS Annex Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.MCSAnnexLibraryImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.MCSAnnexLibraryImpl#getConstants <em>Constants</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.MCSAnnexLibraryImpl#getFunctions <em>Functions</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.MCSAnnexLibraryImpl#getTheorems <em>Theorems</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.MCSAnnexLibraryImpl#getViewpoints <em>Viewpoints</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.MCSAnnexLibraryImpl#getEnforceclauses <em>Enforceclauses</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MCSAnnexLibraryImpl extends AnnexLibraryImpl implements MCSAnnexLibrary
{
  /**
   * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypes()
   * @generated
   * @ordered
   */
  protected EList<Type_declaration> types;

  /**
   * The cached value of the '{@link #getConstants() <em>Constants</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstants()
   * @generated
   * @ordered
   */
  protected EList<Constant_declaration> constants;

  /**
   * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctions()
   * @generated
   * @ordered
   */
  protected EList<Function_declaration> functions;

  /**
   * The cached value of the '{@link #getTheorems() <em>Theorems</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTheorems()
   * @generated
   * @ordered
   */
  protected EList<Theorem_declaration> theorems;

  /**
   * The cached value of the '{@link #getViewpoints() <em>Viewpoints</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getViewpoints()
   * @generated
   * @ordered
   */
  protected EList<MCSViewpoint> viewpoints;

  /**
   * The cached value of the '{@link #getEnforceclauses() <em>Enforceclauses</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnforceclauses()
   * @generated
   * @ordered
   */
  protected EList<PackageEnforce> enforceclauses;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MCSAnnexLibraryImpl()
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
    return McsPackage.Literals.MCS_ANNEX_LIBRARY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Type_declaration> getTypes()
  {
    if (types == null)
    {
      types = new EObjectContainmentEList<Type_declaration>(Type_declaration.class, this, McsPackage.MCS_ANNEX_LIBRARY__TYPES);
    }
    return types;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Constant_declaration> getConstants()
  {
    if (constants == null)
    {
      constants = new EObjectContainmentEList<Constant_declaration>(Constant_declaration.class, this, McsPackage.MCS_ANNEX_LIBRARY__CONSTANTS);
    }
    return constants;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Function_declaration> getFunctions()
  {
    if (functions == null)
    {
      functions = new EObjectContainmentEList<Function_declaration>(Function_declaration.class, this, McsPackage.MCS_ANNEX_LIBRARY__FUNCTIONS);
    }
    return functions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Theorem_declaration> getTheorems()
  {
    if (theorems == null)
    {
      theorems = new EObjectContainmentEList<Theorem_declaration>(Theorem_declaration.class, this, McsPackage.MCS_ANNEX_LIBRARY__THEOREMS);
    }
    return theorems;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MCSViewpoint> getViewpoints()
  {
    if (viewpoints == null)
    {
      viewpoints = new EObjectContainmentEList<MCSViewpoint>(MCSViewpoint.class, this, McsPackage.MCS_ANNEX_LIBRARY__VIEWPOINTS);
    }
    return viewpoints;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PackageEnforce> getEnforceclauses()
  {
    if (enforceclauses == null)
    {
      enforceclauses = new EObjectContainmentEList<PackageEnforce>(PackageEnforce.class, this, McsPackage.MCS_ANNEX_LIBRARY__ENFORCECLAUSES);
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
      case McsPackage.MCS_ANNEX_LIBRARY__TYPES:
        return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
      case McsPackage.MCS_ANNEX_LIBRARY__CONSTANTS:
        return ((InternalEList<?>)getConstants()).basicRemove(otherEnd, msgs);
      case McsPackage.MCS_ANNEX_LIBRARY__FUNCTIONS:
        return ((InternalEList<?>)getFunctions()).basicRemove(otherEnd, msgs);
      case McsPackage.MCS_ANNEX_LIBRARY__THEOREMS:
        return ((InternalEList<?>)getTheorems()).basicRemove(otherEnd, msgs);
      case McsPackage.MCS_ANNEX_LIBRARY__VIEWPOINTS:
        return ((InternalEList<?>)getViewpoints()).basicRemove(otherEnd, msgs);
      case McsPackage.MCS_ANNEX_LIBRARY__ENFORCECLAUSES:
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
      case McsPackage.MCS_ANNEX_LIBRARY__TYPES:
        return getTypes();
      case McsPackage.MCS_ANNEX_LIBRARY__CONSTANTS:
        return getConstants();
      case McsPackage.MCS_ANNEX_LIBRARY__FUNCTIONS:
        return getFunctions();
      case McsPackage.MCS_ANNEX_LIBRARY__THEOREMS:
        return getTheorems();
      case McsPackage.MCS_ANNEX_LIBRARY__VIEWPOINTS:
        return getViewpoints();
      case McsPackage.MCS_ANNEX_LIBRARY__ENFORCECLAUSES:
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
      case McsPackage.MCS_ANNEX_LIBRARY__TYPES:
        getTypes().clear();
        getTypes().addAll((Collection<? extends Type_declaration>)newValue);
        return;
      case McsPackage.MCS_ANNEX_LIBRARY__CONSTANTS:
        getConstants().clear();
        getConstants().addAll((Collection<? extends Constant_declaration>)newValue);
        return;
      case McsPackage.MCS_ANNEX_LIBRARY__FUNCTIONS:
        getFunctions().clear();
        getFunctions().addAll((Collection<? extends Function_declaration>)newValue);
        return;
      case McsPackage.MCS_ANNEX_LIBRARY__THEOREMS:
        getTheorems().clear();
        getTheorems().addAll((Collection<? extends Theorem_declaration>)newValue);
        return;
      case McsPackage.MCS_ANNEX_LIBRARY__VIEWPOINTS:
        getViewpoints().clear();
        getViewpoints().addAll((Collection<? extends MCSViewpoint>)newValue);
        return;
      case McsPackage.MCS_ANNEX_LIBRARY__ENFORCECLAUSES:
        getEnforceclauses().clear();
        getEnforceclauses().addAll((Collection<? extends PackageEnforce>)newValue);
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
      case McsPackage.MCS_ANNEX_LIBRARY__TYPES:
        getTypes().clear();
        return;
      case McsPackage.MCS_ANNEX_LIBRARY__CONSTANTS:
        getConstants().clear();
        return;
      case McsPackage.MCS_ANNEX_LIBRARY__FUNCTIONS:
        getFunctions().clear();
        return;
      case McsPackage.MCS_ANNEX_LIBRARY__THEOREMS:
        getTheorems().clear();
        return;
      case McsPackage.MCS_ANNEX_LIBRARY__VIEWPOINTS:
        getViewpoints().clear();
        return;
      case McsPackage.MCS_ANNEX_LIBRARY__ENFORCECLAUSES:
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
      case McsPackage.MCS_ANNEX_LIBRARY__TYPES:
        return types != null && !types.isEmpty();
      case McsPackage.MCS_ANNEX_LIBRARY__CONSTANTS:
        return constants != null && !constants.isEmpty();
      case McsPackage.MCS_ANNEX_LIBRARY__FUNCTIONS:
        return functions != null && !functions.isEmpty();
      case McsPackage.MCS_ANNEX_LIBRARY__THEOREMS:
        return theorems != null && !theorems.isEmpty();
      case McsPackage.MCS_ANNEX_LIBRARY__VIEWPOINTS:
        return viewpoints != null && !viewpoints.isEmpty();
      case McsPackage.MCS_ANNEX_LIBRARY__ENFORCECLAUSES:
        return enforceclauses != null && !enforceclauses.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MCSAnnexLibraryImpl
