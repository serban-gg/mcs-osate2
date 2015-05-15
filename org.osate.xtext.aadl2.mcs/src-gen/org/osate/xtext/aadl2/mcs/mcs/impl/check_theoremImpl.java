/**
 */
package org.osate.xtext.aadl2.mcs.mcs.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.xtext.aadl2.mcs.mcs.McsPackage;
import org.osate.xtext.aadl2.mcs.mcs.check_theorem;
import org.osate.xtext.aadl2.mcs.mcs.theorem_declaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>check theorem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.check_theoremImpl#getTheo <em>Theo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class check_theoremImpl extends check_statementImpl implements check_theorem
{
  /**
   * The cached value of the '{@link #getTheo() <em>Theo</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTheo()
   * @generated
   * @ordered
   */
  protected theorem_declaration theo;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected check_theoremImpl()
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
    return McsPackage.Literals.CHECK_THEOREM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public theorem_declaration getTheo()
  {
    if (theo != null && theo.eIsProxy())
    {
      InternalEObject oldTheo = (InternalEObject)theo;
      theo = (theorem_declaration)eResolveProxy(oldTheo);
      if (theo != oldTheo)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, McsPackage.CHECK_THEOREM__THEO, oldTheo, theo));
      }
    }
    return theo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public theorem_declaration basicGetTheo()
  {
    return theo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTheo(theorem_declaration newTheo)
  {
    theorem_declaration oldTheo = theo;
    theo = newTheo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.CHECK_THEOREM__THEO, oldTheo, theo));
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
      case McsPackage.CHECK_THEOREM__THEO:
        if (resolve) return getTheo();
        return basicGetTheo();
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
      case McsPackage.CHECK_THEOREM__THEO:
        setTheo((theorem_declaration)newValue);
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
      case McsPackage.CHECK_THEOREM__THEO:
        setTheo((theorem_declaration)null);
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
      case McsPackage.CHECK_THEOREM__THEO:
        return theo != null;
    }
    return super.eIsSet(featureID);
  }

} //check_theoremImpl
