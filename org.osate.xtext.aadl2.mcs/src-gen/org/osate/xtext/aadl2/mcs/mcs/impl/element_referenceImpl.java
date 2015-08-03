/**
 */
package org.osate.xtext.aadl2.mcs.mcs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.osate.aadl2.Classifier;

import org.osate.xtext.aadl2.mcs.mcs.ContainmentPathElement;
import org.osate.xtext.aadl2.mcs.mcs.McsPackage;
import org.osate.xtext.aadl2.mcs.mcs.element_reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>element reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.element_referenceImpl#isSelf <em>Self</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.element_referenceImpl#isRoot <em>Root</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.element_referenceImpl#isCurrentmode <em>Currentmode</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.element_referenceImpl#getCref <em>Cref</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.element_referenceImpl#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.element_referenceImpl#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class element_referenceImpl extends root_elementImpl implements element_reference
{
  /**
   * The default value of the '{@link #isSelf() <em>Self</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSelf()
   * @generated
   * @ordered
   */
  protected static final boolean SELF_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSelf() <em>Self</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSelf()
   * @generated
   * @ordered
   */
  protected boolean self = SELF_EDEFAULT;

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
   * The default value of the '{@link #isCurrentmode() <em>Currentmode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCurrentmode()
   * @generated
   * @ordered
   */
  protected static final boolean CURRENTMODE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isCurrentmode() <em>Currentmode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCurrentmode()
   * @generated
   * @ordered
   */
  protected boolean currentmode = CURRENTMODE_EDEFAULT;

  /**
   * The cached value of the '{@link #getCref() <em>Cref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCref()
   * @generated
   * @ordered
   */
  protected Classifier cref;

  /**
   * The cached value of the '{@link #getPackageName() <em>Package Name</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackageName()
   * @generated
   * @ordered
   */
  protected EList<String> packageName;

  /**
   * The cached value of the '{@link #getRef() <em>Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRef()
   * @generated
   * @ordered
   */
  protected ContainmentPathElement ref;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected element_referenceImpl()
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
    return McsPackage.Literals.ELEMENT_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSelf()
  {
    return self;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSelf(boolean newSelf)
  {
    boolean oldSelf = self;
    self = newSelf;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.ELEMENT_REFERENCE__SELF, oldSelf, self));
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
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.ELEMENT_REFERENCE__ROOT, oldRoot, root));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isCurrentmode()
  {
    return currentmode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCurrentmode(boolean newCurrentmode)
  {
    boolean oldCurrentmode = currentmode;
    currentmode = newCurrentmode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.ELEMENT_REFERENCE__CURRENTMODE, oldCurrentmode, currentmode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Classifier getCref()
  {
    if (cref != null && ((EObject)cref).eIsProxy())
    {
      InternalEObject oldCref = (InternalEObject)cref;
      cref = (Classifier)eResolveProxy(oldCref);
      if (cref != oldCref)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, McsPackage.ELEMENT_REFERENCE__CREF, oldCref, cref));
      }
    }
    return cref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Classifier basicGetCref()
  {
    return cref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCref(Classifier newCref)
  {
    Classifier oldCref = cref;
    cref = newCref;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.ELEMENT_REFERENCE__CREF, oldCref, cref));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getPackageName()
  {
    if (packageName == null)
    {
      packageName = new EDataTypeEList<String>(String.class, this, McsPackage.ELEMENT_REFERENCE__PACKAGE_NAME);
    }
    return packageName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContainmentPathElement getRef()
  {
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRef(ContainmentPathElement newRef, NotificationChain msgs)
  {
    ContainmentPathElement oldRef = ref;
    ref = newRef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.ELEMENT_REFERENCE__REF, oldRef, newRef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRef(ContainmentPathElement newRef)
  {
    if (newRef != ref)
    {
      NotificationChain msgs = null;
      if (ref != null)
        msgs = ((InternalEObject)ref).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.ELEMENT_REFERENCE__REF, null, msgs);
      if (newRef != null)
        msgs = ((InternalEObject)newRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.ELEMENT_REFERENCE__REF, null, msgs);
      msgs = basicSetRef(newRef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.ELEMENT_REFERENCE__REF, newRef, newRef));
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
      case McsPackage.ELEMENT_REFERENCE__REF:
        return basicSetRef(null, msgs);
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
      case McsPackage.ELEMENT_REFERENCE__SELF:
        return isSelf();
      case McsPackage.ELEMENT_REFERENCE__ROOT:
        return isRoot();
      case McsPackage.ELEMENT_REFERENCE__CURRENTMODE:
        return isCurrentmode();
      case McsPackage.ELEMENT_REFERENCE__CREF:
        if (resolve) return getCref();
        return basicGetCref();
      case McsPackage.ELEMENT_REFERENCE__PACKAGE_NAME:
        return getPackageName();
      case McsPackage.ELEMENT_REFERENCE__REF:
        return getRef();
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
      case McsPackage.ELEMENT_REFERENCE__SELF:
        setSelf((Boolean)newValue);
        return;
      case McsPackage.ELEMENT_REFERENCE__ROOT:
        setRoot((Boolean)newValue);
        return;
      case McsPackage.ELEMENT_REFERENCE__CURRENTMODE:
        setCurrentmode((Boolean)newValue);
        return;
      case McsPackage.ELEMENT_REFERENCE__CREF:
        setCref((Classifier)newValue);
        return;
      case McsPackage.ELEMENT_REFERENCE__PACKAGE_NAME:
        getPackageName().clear();
        getPackageName().addAll((Collection<? extends String>)newValue);
        return;
      case McsPackage.ELEMENT_REFERENCE__REF:
        setRef((ContainmentPathElement)newValue);
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
      case McsPackage.ELEMENT_REFERENCE__SELF:
        setSelf(SELF_EDEFAULT);
        return;
      case McsPackage.ELEMENT_REFERENCE__ROOT:
        setRoot(ROOT_EDEFAULT);
        return;
      case McsPackage.ELEMENT_REFERENCE__CURRENTMODE:
        setCurrentmode(CURRENTMODE_EDEFAULT);
        return;
      case McsPackage.ELEMENT_REFERENCE__CREF:
        setCref((Classifier)null);
        return;
      case McsPackage.ELEMENT_REFERENCE__PACKAGE_NAME:
        getPackageName().clear();
        return;
      case McsPackage.ELEMENT_REFERENCE__REF:
        setRef((ContainmentPathElement)null);
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
      case McsPackage.ELEMENT_REFERENCE__SELF:
        return self != SELF_EDEFAULT;
      case McsPackage.ELEMENT_REFERENCE__ROOT:
        return root != ROOT_EDEFAULT;
      case McsPackage.ELEMENT_REFERENCE__CURRENTMODE:
        return currentmode != CURRENTMODE_EDEFAULT;
      case McsPackage.ELEMENT_REFERENCE__CREF:
        return cref != null;
      case McsPackage.ELEMENT_REFERENCE__PACKAGE_NAME:
        return packageName != null && !packageName.isEmpty();
      case McsPackage.ELEMENT_REFERENCE__REF:
        return ref != null;
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
    result.append(" (self: ");
    result.append(self);
    result.append(", root: ");
    result.append(root);
    result.append(", currentmode: ");
    result.append(currentmode);
    result.append(", packageName: ");
    result.append(packageName);
    result.append(')');
    return result.toString();
  }

} //element_referenceImpl
