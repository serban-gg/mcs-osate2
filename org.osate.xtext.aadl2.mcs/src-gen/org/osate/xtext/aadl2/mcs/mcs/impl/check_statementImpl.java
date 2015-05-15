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
import org.osate.xtext.aadl2.mcs.mcs.ModeSpec;
import org.osate.xtext.aadl2.mcs.mcs.check_statement;
import org.osate.xtext.aadl2.mcs.mcs.root_element;
import org.osate.xtext.aadl2.mcs.mcs.string_expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>check statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.check_statementImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.check_statementImpl#getInmode <em>Inmode</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.check_statementImpl#getStr <em>Str</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class check_statementImpl extends MinimalEObjectImpl.Container implements check_statement
{
  /**
   * The cached value of the '{@link #getRoot() <em>Root</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRoot()
   * @generated
   * @ordered
   */
  protected root_element root;

  /**
   * The cached value of the '{@link #getInmode() <em>Inmode</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInmode()
   * @generated
   * @ordered
   */
  protected ModeSpec inmode;

  /**
   * The cached value of the '{@link #getStr() <em>Str</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStr()
   * @generated
   * @ordered
   */
  protected string_expression str;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected check_statementImpl()
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
    return McsPackage.Literals.CHECK_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public root_element getRoot()
  {
    return root;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRoot(root_element newRoot, NotificationChain msgs)
  {
    root_element oldRoot = root;
    root = newRoot;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.CHECK_STATEMENT__ROOT, oldRoot, newRoot);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRoot(root_element newRoot)
  {
    if (newRoot != root)
    {
      NotificationChain msgs = null;
      if (root != null)
        msgs = ((InternalEObject)root).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.CHECK_STATEMENT__ROOT, null, msgs);
      if (newRoot != null)
        msgs = ((InternalEObject)newRoot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.CHECK_STATEMENT__ROOT, null, msgs);
      msgs = basicSetRoot(newRoot, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.CHECK_STATEMENT__ROOT, newRoot, newRoot));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModeSpec getInmode()
  {
    return inmode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInmode(ModeSpec newInmode, NotificationChain msgs)
  {
    ModeSpec oldInmode = inmode;
    inmode = newInmode;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.CHECK_STATEMENT__INMODE, oldInmode, newInmode);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInmode(ModeSpec newInmode)
  {
    if (newInmode != inmode)
    {
      NotificationChain msgs = null;
      if (inmode != null)
        msgs = ((InternalEObject)inmode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.CHECK_STATEMENT__INMODE, null, msgs);
      if (newInmode != null)
        msgs = ((InternalEObject)newInmode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.CHECK_STATEMENT__INMODE, null, msgs);
      msgs = basicSetInmode(newInmode, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.CHECK_STATEMENT__INMODE, newInmode, newInmode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public string_expression getStr()
  {
    return str;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStr(string_expression newStr, NotificationChain msgs)
  {
    string_expression oldStr = str;
    str = newStr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.CHECK_STATEMENT__STR, oldStr, newStr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStr(string_expression newStr)
  {
    if (newStr != str)
    {
      NotificationChain msgs = null;
      if (str != null)
        msgs = ((InternalEObject)str).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.CHECK_STATEMENT__STR, null, msgs);
      if (newStr != null)
        msgs = ((InternalEObject)newStr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.CHECK_STATEMENT__STR, null, msgs);
      msgs = basicSetStr(newStr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.CHECK_STATEMENT__STR, newStr, newStr));
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
      case McsPackage.CHECK_STATEMENT__ROOT:
        return basicSetRoot(null, msgs);
      case McsPackage.CHECK_STATEMENT__INMODE:
        return basicSetInmode(null, msgs);
      case McsPackage.CHECK_STATEMENT__STR:
        return basicSetStr(null, msgs);
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
      case McsPackage.CHECK_STATEMENT__ROOT:
        return getRoot();
      case McsPackage.CHECK_STATEMENT__INMODE:
        return getInmode();
      case McsPackage.CHECK_STATEMENT__STR:
        return getStr();
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
      case McsPackage.CHECK_STATEMENT__ROOT:
        setRoot((root_element)newValue);
        return;
      case McsPackage.CHECK_STATEMENT__INMODE:
        setInmode((ModeSpec)newValue);
        return;
      case McsPackage.CHECK_STATEMENT__STR:
        setStr((string_expression)newValue);
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
      case McsPackage.CHECK_STATEMENT__ROOT:
        setRoot((root_element)null);
        return;
      case McsPackage.CHECK_STATEMENT__INMODE:
        setInmode((ModeSpec)null);
        return;
      case McsPackage.CHECK_STATEMENT__STR:
        setStr((string_expression)null);
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
      case McsPackage.CHECK_STATEMENT__ROOT:
        return root != null;
      case McsPackage.CHECK_STATEMENT__INMODE:
        return inmode != null;
      case McsPackage.CHECK_STATEMENT__STR:
        return str != null;
    }
    return super.eIsSet(featureID);
  }

} //check_statementImpl
