/**
 */
package org.osate.xtext.aadl2.mcs.mcs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.aadl2.ModelUnit;

import org.osate.xtext.aadl2.mcs.mcs.Constant_declaration;
import org.osate.xtext.aadl2.mcs.mcs.F_or_T;
import org.osate.xtext.aadl2.mcs.mcs.MCSFileLibrary;
import org.osate.xtext.aadl2.mcs.mcs.McsPackage;
import org.osate.xtext.aadl2.mcs.mcs.TheoremCall;
import org.osate.xtext.aadl2.mcs.mcs.Type_declaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MCS File Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.MCSFileLibraryImpl#getImportedUnit <em>Imported Unit</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.MCSFileLibraryImpl#getFiles <em>Files</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.MCSFileLibraryImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.MCSFileLibraryImpl#getConstants <em>Constants</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.MCSFileLibraryImpl#getFunctions <em>Functions</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.MCSFileLibraryImpl#getTheorems <em>Theorems</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.MCSFileLibraryImpl#getCalls <em>Calls</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MCSFileLibraryImpl extends MinimalEObjectImpl.Container implements MCSFileLibrary
{
  /**
   * The cached value of the '{@link #getImportedUnit() <em>Imported Unit</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportedUnit()
   * @generated
   * @ordered
   */
  protected EList<ModelUnit> importedUnit;

  /**
   * The cached value of the '{@link #getFiles() <em>Files</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFiles()
   * @generated
   * @ordered
   */
  protected EList<String> files;

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
  protected EList<F_or_T> functions;

  /**
   * The cached value of the '{@link #getTheorems() <em>Theorems</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTheorems()
   * @generated
   * @ordered
   */
  protected EList<F_or_T> theorems;

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
  protected MCSFileLibraryImpl()
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
    return McsPackage.Literals.MCS_FILE_LIBRARY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ModelUnit> getImportedUnit()
  {
    if (importedUnit == null)
    {
      importedUnit = new EObjectResolvingEList<ModelUnit>(ModelUnit.class, this, McsPackage.MCS_FILE_LIBRARY__IMPORTED_UNIT);
    }
    return importedUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getFiles()
  {
    if (files == null)
    {
      files = new EDataTypeEList<String>(String.class, this, McsPackage.MCS_FILE_LIBRARY__FILES);
    }
    return files;
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
      types = new EObjectContainmentEList<Type_declaration>(Type_declaration.class, this, McsPackage.MCS_FILE_LIBRARY__TYPES);
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
      constants = new EObjectContainmentEList<Constant_declaration>(Constant_declaration.class, this, McsPackage.MCS_FILE_LIBRARY__CONSTANTS);
    }
    return constants;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<F_or_T> getFunctions()
  {
    if (functions == null)
    {
      functions = new EObjectContainmentEList<F_or_T>(F_or_T.class, this, McsPackage.MCS_FILE_LIBRARY__FUNCTIONS);
    }
    return functions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<F_or_T> getTheorems()
  {
    if (theorems == null)
    {
      theorems = new EObjectContainmentEList<F_or_T>(F_or_T.class, this, McsPackage.MCS_FILE_LIBRARY__THEOREMS);
    }
    return theorems;
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
      calls = new EObjectContainmentEList<TheoremCall>(TheoremCall.class, this, McsPackage.MCS_FILE_LIBRARY__CALLS);
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
      case McsPackage.MCS_FILE_LIBRARY__TYPES:
        return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
      case McsPackage.MCS_FILE_LIBRARY__CONSTANTS:
        return ((InternalEList<?>)getConstants()).basicRemove(otherEnd, msgs);
      case McsPackage.MCS_FILE_LIBRARY__FUNCTIONS:
        return ((InternalEList<?>)getFunctions()).basicRemove(otherEnd, msgs);
      case McsPackage.MCS_FILE_LIBRARY__THEOREMS:
        return ((InternalEList<?>)getTheorems()).basicRemove(otherEnd, msgs);
      case McsPackage.MCS_FILE_LIBRARY__CALLS:
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
      case McsPackage.MCS_FILE_LIBRARY__IMPORTED_UNIT:
        return getImportedUnit();
      case McsPackage.MCS_FILE_LIBRARY__FILES:
        return getFiles();
      case McsPackage.MCS_FILE_LIBRARY__TYPES:
        return getTypes();
      case McsPackage.MCS_FILE_LIBRARY__CONSTANTS:
        return getConstants();
      case McsPackage.MCS_FILE_LIBRARY__FUNCTIONS:
        return getFunctions();
      case McsPackage.MCS_FILE_LIBRARY__THEOREMS:
        return getTheorems();
      case McsPackage.MCS_FILE_LIBRARY__CALLS:
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
      case McsPackage.MCS_FILE_LIBRARY__IMPORTED_UNIT:
        getImportedUnit().clear();
        getImportedUnit().addAll((Collection<? extends ModelUnit>)newValue);
        return;
      case McsPackage.MCS_FILE_LIBRARY__FILES:
        getFiles().clear();
        getFiles().addAll((Collection<? extends String>)newValue);
        return;
      case McsPackage.MCS_FILE_LIBRARY__TYPES:
        getTypes().clear();
        getTypes().addAll((Collection<? extends Type_declaration>)newValue);
        return;
      case McsPackage.MCS_FILE_LIBRARY__CONSTANTS:
        getConstants().clear();
        getConstants().addAll((Collection<? extends Constant_declaration>)newValue);
        return;
      case McsPackage.MCS_FILE_LIBRARY__FUNCTIONS:
        getFunctions().clear();
        getFunctions().addAll((Collection<? extends F_or_T>)newValue);
        return;
      case McsPackage.MCS_FILE_LIBRARY__THEOREMS:
        getTheorems().clear();
        getTheorems().addAll((Collection<? extends F_or_T>)newValue);
        return;
      case McsPackage.MCS_FILE_LIBRARY__CALLS:
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
      case McsPackage.MCS_FILE_LIBRARY__IMPORTED_UNIT:
        getImportedUnit().clear();
        return;
      case McsPackage.MCS_FILE_LIBRARY__FILES:
        getFiles().clear();
        return;
      case McsPackage.MCS_FILE_LIBRARY__TYPES:
        getTypes().clear();
        return;
      case McsPackage.MCS_FILE_LIBRARY__CONSTANTS:
        getConstants().clear();
        return;
      case McsPackage.MCS_FILE_LIBRARY__FUNCTIONS:
        getFunctions().clear();
        return;
      case McsPackage.MCS_FILE_LIBRARY__THEOREMS:
        getTheorems().clear();
        return;
      case McsPackage.MCS_FILE_LIBRARY__CALLS:
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
      case McsPackage.MCS_FILE_LIBRARY__IMPORTED_UNIT:
        return importedUnit != null && !importedUnit.isEmpty();
      case McsPackage.MCS_FILE_LIBRARY__FILES:
        return files != null && !files.isEmpty();
      case McsPackage.MCS_FILE_LIBRARY__TYPES:
        return types != null && !types.isEmpty();
      case McsPackage.MCS_FILE_LIBRARY__CONSTANTS:
        return constants != null && !constants.isEmpty();
      case McsPackage.MCS_FILE_LIBRARY__FUNCTIONS:
        return functions != null && !functions.isEmpty();
      case McsPackage.MCS_FILE_LIBRARY__THEOREMS:
        return theorems != null && !theorems.isEmpty();
      case McsPackage.MCS_FILE_LIBRARY__CALLS:
        return calls != null && !calls.isEmpty();
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
    result.append(" (files: ");
    result.append(files);
    result.append(')');
    return result.toString();
  }

} //MCSFileLibraryImpl
