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
import org.osate.xtext.aadl2.mcs.mcs.NestedDotID;
import org.osate.xtext.aadl2.mcs.mcs.RefTerm;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ref Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.RefTermImpl#isRoot <em>Root</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.RefTermImpl#getSub <em>Sub</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefTermImpl extends MinimalEObjectImpl.Container implements RefTerm
{
  /**
   * The default value of the '{@link #isRoot() <em>Root</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRoot()
   * @generated
   * @ordered
   */
  protected static final boolean ROOT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRoot() <em>Root</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRoot()
   * @generated
   * @ordered
   */
  protected boolean root = ROOT_EDEFAULT;

  /**
   * The cached value of the '{@link #getSub() <em>Sub</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSub()
   * @generated
   * @ordered
   */
  protected NestedDotID sub;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RefTermImpl()
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
    return McsPackage.Literals.REF_TERM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isRoot()
  {
    return root;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRoot(boolean newRoot)
  {
    boolean oldRoot = root;
    root = newRoot;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.REF_TERM__ROOT, oldRoot, root));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NestedDotID getSub()
  {
    return sub;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSub(NestedDotID newSub, NotificationChain msgs)
  {
    NestedDotID oldSub = sub;
    sub = newSub;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.REF_TERM__SUB, oldSub, newSub);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSub(NestedDotID newSub)
  {
    if (newSub != sub)
    {
      NotificationChain msgs = null;
      if (sub != null)
        msgs = ((InternalEObject)sub).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.REF_TERM__SUB, null, msgs);
      if (newSub != null)
        msgs = ((InternalEObject)newSub).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.REF_TERM__SUB, null, msgs);
      msgs = basicSetSub(newSub, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.REF_TERM__SUB, newSub, newSub));
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
      case McsPackage.REF_TERM__SUB:
        return basicSetSub(null, msgs);
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
      case McsPackage.REF_TERM__ROOT:
        return isRoot();
      case McsPackage.REF_TERM__SUB:
        return getSub();
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
      case McsPackage.REF_TERM__ROOT:
        setRoot((Boolean)newValue);
        return;
      case McsPackage.REF_TERM__SUB:
        setSub((NestedDotID)newValue);
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
      case McsPackage.REF_TERM__ROOT:
        setRoot(ROOT_EDEFAULT);
        return;
      case McsPackage.REF_TERM__SUB:
        setSub((NestedDotID)null);
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
      case McsPackage.REF_TERM__ROOT:
        return root != ROOT_EDEFAULT;
      case McsPackage.REF_TERM__SUB:
        return sub != null;
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
    result.append(" (root: ");
    result.append(root);
    result.append(')');
    return result.toString();
  }

} //RefTermImpl
