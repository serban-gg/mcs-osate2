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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.xtext.aadl2.mcs.mcs.Classifier_literal;
import org.osate.xtext.aadl2.mcs.mcs.Expr;
import org.osate.xtext.aadl2.mcs.mcs.F_or_T;
import org.osate.xtext.aadl2.mcs.mcs.McsPackage;
import org.osate.xtext.aadl2.mcs.mcs.TheoremCall;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Theorem Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.TheoremCallImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.TheoremCallImpl#getCroot <em>Croot</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.TheoremCallImpl#getActarg <em>Actarg</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.TheoremCallImpl#getFn <em>Fn</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TheoremCallImpl extends ExprImpl implements TheoremCall
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected F_or_T name;

  /**
   * The cached value of the '{@link #getCroot() <em>Croot</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCroot()
   * @generated
   * @ordered
   */
  protected Classifier_literal croot;

  /**
   * The cached value of the '{@link #getActarg() <em>Actarg</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActarg()
   * @generated
   * @ordered
   */
  protected EList<Expr> actarg;

  /**
   * The cached value of the '{@link #getFn() <em>Fn</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFn()
   * @generated
   * @ordered
   */
  protected TheoremCall fn;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TheoremCallImpl()
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
    return McsPackage.Literals.THEOREM_CALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public F_or_T getName()
  {
    if (name != null && name.eIsProxy())
    {
      InternalEObject oldName = (InternalEObject)name;
      name = (F_or_T)eResolveProxy(oldName);
      if (name != oldName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, McsPackage.THEOREM_CALL__NAME, oldName, name));
      }
    }
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public F_or_T basicGetName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(F_or_T newName)
  {
    F_or_T oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.THEOREM_CALL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Classifier_literal getCroot()
  {
    return croot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCroot(Classifier_literal newCroot, NotificationChain msgs)
  {
    Classifier_literal oldCroot = croot;
    croot = newCroot;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.THEOREM_CALL__CROOT, oldCroot, newCroot);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCroot(Classifier_literal newCroot)
  {
    if (newCroot != croot)
    {
      NotificationChain msgs = null;
      if (croot != null)
        msgs = ((InternalEObject)croot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.THEOREM_CALL__CROOT, null, msgs);
      if (newCroot != null)
        msgs = ((InternalEObject)newCroot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.THEOREM_CALL__CROOT, null, msgs);
      msgs = basicSetCroot(newCroot, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.THEOREM_CALL__CROOT, newCroot, newCroot));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expr> getActarg()
  {
    if (actarg == null)
    {
      actarg = new EObjectContainmentEList<Expr>(Expr.class, this, McsPackage.THEOREM_CALL__ACTARG);
    }
    return actarg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TheoremCall getFn()
  {
    return fn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFn(TheoremCall newFn, NotificationChain msgs)
  {
    TheoremCall oldFn = fn;
    fn = newFn;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.THEOREM_CALL__FN, oldFn, newFn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFn(TheoremCall newFn)
  {
    if (newFn != fn)
    {
      NotificationChain msgs = null;
      if (fn != null)
        msgs = ((InternalEObject)fn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.THEOREM_CALL__FN, null, msgs);
      if (newFn != null)
        msgs = ((InternalEObject)newFn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.THEOREM_CALL__FN, null, msgs);
      msgs = basicSetFn(newFn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.THEOREM_CALL__FN, newFn, newFn));
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
      case McsPackage.THEOREM_CALL__CROOT:
        return basicSetCroot(null, msgs);
      case McsPackage.THEOREM_CALL__ACTARG:
        return ((InternalEList<?>)getActarg()).basicRemove(otherEnd, msgs);
      case McsPackage.THEOREM_CALL__FN:
        return basicSetFn(null, msgs);
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
      case McsPackage.THEOREM_CALL__NAME:
        if (resolve) return getName();
        return basicGetName();
      case McsPackage.THEOREM_CALL__CROOT:
        return getCroot();
      case McsPackage.THEOREM_CALL__ACTARG:
        return getActarg();
      case McsPackage.THEOREM_CALL__FN:
        return getFn();
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
      case McsPackage.THEOREM_CALL__NAME:
        setName((F_or_T)newValue);
        return;
      case McsPackage.THEOREM_CALL__CROOT:
        setCroot((Classifier_literal)newValue);
        return;
      case McsPackage.THEOREM_CALL__ACTARG:
        getActarg().clear();
        getActarg().addAll((Collection<? extends Expr>)newValue);
        return;
      case McsPackage.THEOREM_CALL__FN:
        setFn((TheoremCall)newValue);
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
      case McsPackage.THEOREM_CALL__NAME:
        setName((F_or_T)null);
        return;
      case McsPackage.THEOREM_CALL__CROOT:
        setCroot((Classifier_literal)null);
        return;
      case McsPackage.THEOREM_CALL__ACTARG:
        getActarg().clear();
        return;
      case McsPackage.THEOREM_CALL__FN:
        setFn((TheoremCall)null);
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
      case McsPackage.THEOREM_CALL__NAME:
        return name != null;
      case McsPackage.THEOREM_CALL__CROOT:
        return croot != null;
      case McsPackage.THEOREM_CALL__ACTARG:
        return actarg != null && !actarg.isEmpty();
      case McsPackage.THEOREM_CALL__FN:
        return fn != null;
    }
    return super.eIsSet(featureID);
  }

} //TheoremCallImpl
