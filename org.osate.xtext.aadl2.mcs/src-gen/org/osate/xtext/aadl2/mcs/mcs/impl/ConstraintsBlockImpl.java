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

import org.osate.xtext.aadl2.mcs.mcs.ConstraintsBlock;
import org.osate.xtext.aadl2.mcs.mcs.McsPackage;
import org.osate.xtext.aadl2.mcs.mcs.block_label_id;
import org.osate.xtext.aadl2.mcs.mcs.labelled_check_statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraints Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.ConstraintsBlockImpl#getB_label <em>Blabel</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.ConstraintsBlockImpl#getCs <em>Cs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstraintsBlockImpl extends MinimalEObjectImpl.Container implements ConstraintsBlock
{
  /**
   * The cached value of the '{@link #getB_label() <em>Blabel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getB_label()
   * @generated
   * @ordered
   */
  protected block_label_id b_label;

  /**
   * The cached value of the '{@link #getCs() <em>Cs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCs()
   * @generated
   * @ordered
   */
  protected EList<labelled_check_statement> cs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConstraintsBlockImpl()
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
    return McsPackage.Literals.CONSTRAINTS_BLOCK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public block_label_id getB_label()
  {
    return b_label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetB_label(block_label_id newB_label, NotificationChain msgs)
  {
    block_label_id oldB_label = b_label;
    b_label = newB_label;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.CONSTRAINTS_BLOCK__BLABEL, oldB_label, newB_label);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setB_label(block_label_id newB_label)
  {
    if (newB_label != b_label)
    {
      NotificationChain msgs = null;
      if (b_label != null)
        msgs = ((InternalEObject)b_label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.CONSTRAINTS_BLOCK__BLABEL, null, msgs);
      if (newB_label != null)
        msgs = ((InternalEObject)newB_label).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.CONSTRAINTS_BLOCK__BLABEL, null, msgs);
      msgs = basicSetB_label(newB_label, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.CONSTRAINTS_BLOCK__BLABEL, newB_label, newB_label));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<labelled_check_statement> getCs()
  {
    if (cs == null)
    {
      cs = new EObjectContainmentEList<labelled_check_statement>(labelled_check_statement.class, this, McsPackage.CONSTRAINTS_BLOCK__CS);
    }
    return cs;
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
      case McsPackage.CONSTRAINTS_BLOCK__BLABEL:
        return basicSetB_label(null, msgs);
      case McsPackage.CONSTRAINTS_BLOCK__CS:
        return ((InternalEList<?>)getCs()).basicRemove(otherEnd, msgs);
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
      case McsPackage.CONSTRAINTS_BLOCK__BLABEL:
        return getB_label();
      case McsPackage.CONSTRAINTS_BLOCK__CS:
        return getCs();
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
      case McsPackage.CONSTRAINTS_BLOCK__BLABEL:
        setB_label((block_label_id)newValue);
        return;
      case McsPackage.CONSTRAINTS_BLOCK__CS:
        getCs().clear();
        getCs().addAll((Collection<? extends labelled_check_statement>)newValue);
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
      case McsPackage.CONSTRAINTS_BLOCK__BLABEL:
        setB_label((block_label_id)null);
        return;
      case McsPackage.CONSTRAINTS_BLOCK__CS:
        getCs().clear();
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
      case McsPackage.CONSTRAINTS_BLOCK__BLABEL:
        return b_label != null;
      case McsPackage.CONSTRAINTS_BLOCK__CS:
        return cs != null && !cs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ConstraintsBlockImpl
