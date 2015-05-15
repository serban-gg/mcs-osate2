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
import org.osate.xtext.aadl2.mcs.mcs.check_label_id;
import org.osate.xtext.aadl2.mcs.mcs.check_statement;
import org.osate.xtext.aadl2.mcs.mcs.labelled_check_statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>labelled check statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.labelled_check_statementImpl#getC_label <em>Clabel</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.labelled_check_statementImpl#getCs <em>Cs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class labelled_check_statementImpl extends MinimalEObjectImpl.Container implements labelled_check_statement
{
  /**
   * The cached value of the '{@link #getC_label() <em>Clabel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getC_label()
   * @generated
   * @ordered
   */
  protected check_label_id c_label;

  /**
   * The cached value of the '{@link #getCs() <em>Cs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCs()
   * @generated
   * @ordered
   */
  protected check_statement cs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected labelled_check_statementImpl()
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
    return McsPackage.Literals.LABELLED_CHECK_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public check_label_id getC_label()
  {
    return c_label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetC_label(check_label_id newC_label, NotificationChain msgs)
  {
    check_label_id oldC_label = c_label;
    c_label = newC_label;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.LABELLED_CHECK_STATEMENT__CLABEL, oldC_label, newC_label);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setC_label(check_label_id newC_label)
  {
    if (newC_label != c_label)
    {
      NotificationChain msgs = null;
      if (c_label != null)
        msgs = ((InternalEObject)c_label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.LABELLED_CHECK_STATEMENT__CLABEL, null, msgs);
      if (newC_label != null)
        msgs = ((InternalEObject)newC_label).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.LABELLED_CHECK_STATEMENT__CLABEL, null, msgs);
      msgs = basicSetC_label(newC_label, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.LABELLED_CHECK_STATEMENT__CLABEL, newC_label, newC_label));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public check_statement getCs()
  {
    return cs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCs(check_statement newCs, NotificationChain msgs)
  {
    check_statement oldCs = cs;
    cs = newCs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.LABELLED_CHECK_STATEMENT__CS, oldCs, newCs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCs(check_statement newCs)
  {
    if (newCs != cs)
    {
      NotificationChain msgs = null;
      if (cs != null)
        msgs = ((InternalEObject)cs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.LABELLED_CHECK_STATEMENT__CS, null, msgs);
      if (newCs != null)
        msgs = ((InternalEObject)newCs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.LABELLED_CHECK_STATEMENT__CS, null, msgs);
      msgs = basicSetCs(newCs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.LABELLED_CHECK_STATEMENT__CS, newCs, newCs));
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
      case McsPackage.LABELLED_CHECK_STATEMENT__CLABEL:
        return basicSetC_label(null, msgs);
      case McsPackage.LABELLED_CHECK_STATEMENT__CS:
        return basicSetCs(null, msgs);
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
      case McsPackage.LABELLED_CHECK_STATEMENT__CLABEL:
        return getC_label();
      case McsPackage.LABELLED_CHECK_STATEMENT__CS:
        return getCs();
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
      case McsPackage.LABELLED_CHECK_STATEMENT__CLABEL:
        setC_label((check_label_id)newValue);
        return;
      case McsPackage.LABELLED_CHECK_STATEMENT__CS:
        setCs((check_statement)newValue);
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
      case McsPackage.LABELLED_CHECK_STATEMENT__CLABEL:
        setC_label((check_label_id)null);
        return;
      case McsPackage.LABELLED_CHECK_STATEMENT__CS:
        setCs((check_statement)null);
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
      case McsPackage.LABELLED_CHECK_STATEMENT__CLABEL:
        return c_label != null;
      case McsPackage.LABELLED_CHECK_STATEMENT__CS:
        return cs != null;
    }
    return super.eIsSet(featureID);
  }

} //labelled_check_statementImpl
