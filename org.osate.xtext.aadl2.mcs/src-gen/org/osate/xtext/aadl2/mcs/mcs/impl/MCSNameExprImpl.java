/**
 */
package org.osate.xtext.aadl2.mcs.mcs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.xtext.aadl2.mcs.mcs.MCSNameExpr;
import org.osate.xtext.aadl2.mcs.mcs.McsPackage;
import org.osate.xtext.aadl2.mcs.mcs.Mcs_name_ref;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MCS Name Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.MCSNameExprImpl#isRoot <em>Root</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.MCSNameExprImpl#isIroot <em>Iroot</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.MCSNameExprImpl#isNil <em>Nil</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.MCSNameExprImpl#isEmpty <em>Empty</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.MCSNameExprImpl#isAllmodes <em>Allmodes</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.MCSNameExprImpl#getNameref <em>Nameref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MCSNameExprImpl extends ExprImpl implements MCSNameExpr
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
   * The default value of the '{@link #isIroot() <em>Iroot</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIroot()
   * @generated
   * @ordered
   */
  protected static final boolean IROOT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIroot() <em>Iroot</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIroot()
   * @generated
   * @ordered
   */
  protected boolean iroot = IROOT_EDEFAULT;

  /**
   * The default value of the '{@link #isNil() <em>Nil</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNil()
   * @generated
   * @ordered
   */
  protected static final boolean NIL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNil() <em>Nil</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNil()
   * @generated
   * @ordered
   */
  protected boolean nil = NIL_EDEFAULT;

  /**
   * The default value of the '{@link #isEmpty() <em>Empty</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEmpty()
   * @generated
   * @ordered
   */
  protected static final boolean EMPTY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEmpty() <em>Empty</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEmpty()
   * @generated
   * @ordered
   */
  protected boolean empty = EMPTY_EDEFAULT;

  /**
   * The default value of the '{@link #isAllmodes() <em>Allmodes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAllmodes()
   * @generated
   * @ordered
   */
  protected static final boolean ALLMODES_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAllmodes() <em>Allmodes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAllmodes()
   * @generated
   * @ordered
   */
  protected boolean allmodes = ALLMODES_EDEFAULT;

  /**
   * The cached value of the '{@link #getNameref() <em>Nameref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameref()
   * @generated
   * @ordered
   */
  protected Mcs_name_ref nameref;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MCSNameExprImpl()
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
    return McsPackage.Literals.MCS_NAME_EXPR;
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
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.MCS_NAME_EXPR__ROOT, oldRoot, root));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIroot()
  {
    return iroot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIroot(boolean newIroot)
  {
    boolean oldIroot = iroot;
    iroot = newIroot;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.MCS_NAME_EXPR__IROOT, oldIroot, iroot));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNil()
  {
    return nil;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNil(boolean newNil)
  {
    boolean oldNil = nil;
    nil = newNil;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.MCS_NAME_EXPR__NIL, oldNil, nil));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isEmpty()
  {
    return empty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEmpty(boolean newEmpty)
  {
    boolean oldEmpty = empty;
    empty = newEmpty;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.MCS_NAME_EXPR__EMPTY, oldEmpty, empty));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAllmodes()
  {
    return allmodes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAllmodes(boolean newAllmodes)
  {
    boolean oldAllmodes = allmodes;
    allmodes = newAllmodes;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.MCS_NAME_EXPR__ALLMODES, oldAllmodes, allmodes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mcs_name_ref getNameref()
  {
    return nameref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNameref(Mcs_name_ref newNameref, NotificationChain msgs)
  {
    Mcs_name_ref oldNameref = nameref;
    nameref = newNameref;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.MCS_NAME_EXPR__NAMEREF, oldNameref, newNameref);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNameref(Mcs_name_ref newNameref)
  {
    if (newNameref != nameref)
    {
      NotificationChain msgs = null;
      if (nameref != null)
        msgs = ((InternalEObject)nameref).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.MCS_NAME_EXPR__NAMEREF, null, msgs);
      if (newNameref != null)
        msgs = ((InternalEObject)newNameref).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.MCS_NAME_EXPR__NAMEREF, null, msgs);
      msgs = basicSetNameref(newNameref, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.MCS_NAME_EXPR__NAMEREF, newNameref, newNameref));
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
      case McsPackage.MCS_NAME_EXPR__NAMEREF:
        return basicSetNameref(null, msgs);
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
      case McsPackage.MCS_NAME_EXPR__ROOT:
        return isRoot();
      case McsPackage.MCS_NAME_EXPR__IROOT:
        return isIroot();
      case McsPackage.MCS_NAME_EXPR__NIL:
        return isNil();
      case McsPackage.MCS_NAME_EXPR__EMPTY:
        return isEmpty();
      case McsPackage.MCS_NAME_EXPR__ALLMODES:
        return isAllmodes();
      case McsPackage.MCS_NAME_EXPR__NAMEREF:
        return getNameref();
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
      case McsPackage.MCS_NAME_EXPR__ROOT:
        setRoot((Boolean)newValue);
        return;
      case McsPackage.MCS_NAME_EXPR__IROOT:
        setIroot((Boolean)newValue);
        return;
      case McsPackage.MCS_NAME_EXPR__NIL:
        setNil((Boolean)newValue);
        return;
      case McsPackage.MCS_NAME_EXPR__EMPTY:
        setEmpty((Boolean)newValue);
        return;
      case McsPackage.MCS_NAME_EXPR__ALLMODES:
        setAllmodes((Boolean)newValue);
        return;
      case McsPackage.MCS_NAME_EXPR__NAMEREF:
        setNameref((Mcs_name_ref)newValue);
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
      case McsPackage.MCS_NAME_EXPR__ROOT:
        setRoot(ROOT_EDEFAULT);
        return;
      case McsPackage.MCS_NAME_EXPR__IROOT:
        setIroot(IROOT_EDEFAULT);
        return;
      case McsPackage.MCS_NAME_EXPR__NIL:
        setNil(NIL_EDEFAULT);
        return;
      case McsPackage.MCS_NAME_EXPR__EMPTY:
        setEmpty(EMPTY_EDEFAULT);
        return;
      case McsPackage.MCS_NAME_EXPR__ALLMODES:
        setAllmodes(ALLMODES_EDEFAULT);
        return;
      case McsPackage.MCS_NAME_EXPR__NAMEREF:
        setNameref((Mcs_name_ref)null);
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
      case McsPackage.MCS_NAME_EXPR__ROOT:
        return root != ROOT_EDEFAULT;
      case McsPackage.MCS_NAME_EXPR__IROOT:
        return iroot != IROOT_EDEFAULT;
      case McsPackage.MCS_NAME_EXPR__NIL:
        return nil != NIL_EDEFAULT;
      case McsPackage.MCS_NAME_EXPR__EMPTY:
        return empty != EMPTY_EDEFAULT;
      case McsPackage.MCS_NAME_EXPR__ALLMODES:
        return allmodes != ALLMODES_EDEFAULT;
      case McsPackage.MCS_NAME_EXPR__NAMEREF:
        return nameref != null;
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
    result.append(", iroot: ");
    result.append(iroot);
    result.append(", nil: ");
    result.append(nil);
    result.append(", empty: ");
    result.append(empty);
    result.append(", allmodes: ");
    result.append(allmodes);
    result.append(')');
    return result.toString();
  }

} //MCSNameExprImpl
