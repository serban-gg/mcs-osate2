/**
 */
package org.osate.xtext.aadl2.mcs.mcs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.osate.aadl2.ComponentImplementation;
import org.osate.aadl2.ComponentType;

import org.osate.xtext.aadl2.mcs.mcs.ClassifierCategory;
import org.osate.xtext.aadl2.mcs.mcs.FeatureGroupClassifierReference;
import org.osate.xtext.aadl2.mcs.mcs.McsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.ClassifierCategoryImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.ClassifierCategoryImpl#getCt <em>Ct</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.ClassifierCategoryImpl#isImpl <em>Impl</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.ClassifierCategoryImpl#getCi <em>Ci</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.ClassifierCategoryImpl#isFeat_g <em>Feat g</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.ClassifierCategoryImpl#getRef_to_f <em>Ref to f</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassifierCategoryImpl extends MinimalEObjectImpl.Container implements ClassifierCategory
{
  /**
   * The default value of the '{@link #getComponent() <em>Component</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponent()
   * @generated
   * @ordered
   */
  protected static final String COMPONENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getComponent() <em>Component</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponent()
   * @generated
   * @ordered
   */
  protected String component = COMPONENT_EDEFAULT;

  /**
   * The cached value of the '{@link #getCt() <em>Ct</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCt()
   * @generated
   * @ordered
   */
  protected ComponentType ct;

  /**
   * The default value of the '{@link #isImpl() <em>Impl</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isImpl()
   * @generated
   * @ordered
   */
  protected static final boolean IMPL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isImpl() <em>Impl</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isImpl()
   * @generated
   * @ordered
   */
  protected boolean impl = IMPL_EDEFAULT;

  /**
   * The cached value of the '{@link #getCi() <em>Ci</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCi()
   * @generated
   * @ordered
   */
  protected ComponentImplementation ci;

  /**
   * The default value of the '{@link #isFeat_g() <em>Feat g</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFeat_g()
   * @generated
   * @ordered
   */
  protected static final boolean FEAT_G_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isFeat_g() <em>Feat g</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFeat_g()
   * @generated
   * @ordered
   */
  protected boolean feat_g = FEAT_G_EDEFAULT;

  /**
   * The cached value of the '{@link #getRef_to_f() <em>Ref to f</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRef_to_f()
   * @generated
   * @ordered
   */
  protected FeatureGroupClassifierReference ref_to_f;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClassifierCategoryImpl()
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
    return McsPackage.Literals.CLASSIFIER_CATEGORY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getComponent()
  {
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComponent(String newComponent)
  {
    String oldComponent = component;
    component = newComponent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.CLASSIFIER_CATEGORY__COMPONENT, oldComponent, component));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentType getCt()
  {
    if (ct != null && ((EObject)ct).eIsProxy())
    {
      InternalEObject oldCt = (InternalEObject)ct;
      ct = (ComponentType)eResolveProxy(oldCt);
      if (ct != oldCt)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, McsPackage.CLASSIFIER_CATEGORY__CT, oldCt, ct));
      }
    }
    return ct;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentType basicGetCt()
  {
    return ct;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCt(ComponentType newCt)
  {
    ComponentType oldCt = ct;
    ct = newCt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.CLASSIFIER_CATEGORY__CT, oldCt, ct));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isImpl()
  {
    return impl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImpl(boolean newImpl)
  {
    boolean oldImpl = impl;
    impl = newImpl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.CLASSIFIER_CATEGORY__IMPL, oldImpl, impl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentImplementation getCi()
  {
    if (ci != null && ((EObject)ci).eIsProxy())
    {
      InternalEObject oldCi = (InternalEObject)ci;
      ci = (ComponentImplementation)eResolveProxy(oldCi);
      if (ci != oldCi)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, McsPackage.CLASSIFIER_CATEGORY__CI, oldCi, ci));
      }
    }
    return ci;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentImplementation basicGetCi()
  {
    return ci;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCi(ComponentImplementation newCi)
  {
    ComponentImplementation oldCi = ci;
    ci = newCi;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.CLASSIFIER_CATEGORY__CI, oldCi, ci));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isFeat_g()
  {
    return feat_g;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFeat_g(boolean newFeat_g)
  {
    boolean oldFeat_g = feat_g;
    feat_g = newFeat_g;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.CLASSIFIER_CATEGORY__FEAT_G, oldFeat_g, feat_g));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureGroupClassifierReference getRef_to_f()
  {
    return ref_to_f;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRef_to_f(FeatureGroupClassifierReference newRef_to_f, NotificationChain msgs)
  {
    FeatureGroupClassifierReference oldRef_to_f = ref_to_f;
    ref_to_f = newRef_to_f;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.CLASSIFIER_CATEGORY__REF_TO_F, oldRef_to_f, newRef_to_f);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRef_to_f(FeatureGroupClassifierReference newRef_to_f)
  {
    if (newRef_to_f != ref_to_f)
    {
      NotificationChain msgs = null;
      if (ref_to_f != null)
        msgs = ((InternalEObject)ref_to_f).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.CLASSIFIER_CATEGORY__REF_TO_F, null, msgs);
      if (newRef_to_f != null)
        msgs = ((InternalEObject)newRef_to_f).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.CLASSIFIER_CATEGORY__REF_TO_F, null, msgs);
      msgs = basicSetRef_to_f(newRef_to_f, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.CLASSIFIER_CATEGORY__REF_TO_F, newRef_to_f, newRef_to_f));
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
      case McsPackage.CLASSIFIER_CATEGORY__REF_TO_F:
        return basicSetRef_to_f(null, msgs);
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
      case McsPackage.CLASSIFIER_CATEGORY__COMPONENT:
        return getComponent();
      case McsPackage.CLASSIFIER_CATEGORY__CT:
        if (resolve) return getCt();
        return basicGetCt();
      case McsPackage.CLASSIFIER_CATEGORY__IMPL:
        return isImpl();
      case McsPackage.CLASSIFIER_CATEGORY__CI:
        if (resolve) return getCi();
        return basicGetCi();
      case McsPackage.CLASSIFIER_CATEGORY__FEAT_G:
        return isFeat_g();
      case McsPackage.CLASSIFIER_CATEGORY__REF_TO_F:
        return getRef_to_f();
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
      case McsPackage.CLASSIFIER_CATEGORY__COMPONENT:
        setComponent((String)newValue);
        return;
      case McsPackage.CLASSIFIER_CATEGORY__CT:
        setCt((ComponentType)newValue);
        return;
      case McsPackage.CLASSIFIER_CATEGORY__IMPL:
        setImpl((Boolean)newValue);
        return;
      case McsPackage.CLASSIFIER_CATEGORY__CI:
        setCi((ComponentImplementation)newValue);
        return;
      case McsPackage.CLASSIFIER_CATEGORY__FEAT_G:
        setFeat_g((Boolean)newValue);
        return;
      case McsPackage.CLASSIFIER_CATEGORY__REF_TO_F:
        setRef_to_f((FeatureGroupClassifierReference)newValue);
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
      case McsPackage.CLASSIFIER_CATEGORY__COMPONENT:
        setComponent(COMPONENT_EDEFAULT);
        return;
      case McsPackage.CLASSIFIER_CATEGORY__CT:
        setCt((ComponentType)null);
        return;
      case McsPackage.CLASSIFIER_CATEGORY__IMPL:
        setImpl(IMPL_EDEFAULT);
        return;
      case McsPackage.CLASSIFIER_CATEGORY__CI:
        setCi((ComponentImplementation)null);
        return;
      case McsPackage.CLASSIFIER_CATEGORY__FEAT_G:
        setFeat_g(FEAT_G_EDEFAULT);
        return;
      case McsPackage.CLASSIFIER_CATEGORY__REF_TO_F:
        setRef_to_f((FeatureGroupClassifierReference)null);
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
      case McsPackage.CLASSIFIER_CATEGORY__COMPONENT:
        return COMPONENT_EDEFAULT == null ? component != null : !COMPONENT_EDEFAULT.equals(component);
      case McsPackage.CLASSIFIER_CATEGORY__CT:
        return ct != null;
      case McsPackage.CLASSIFIER_CATEGORY__IMPL:
        return impl != IMPL_EDEFAULT;
      case McsPackage.CLASSIFIER_CATEGORY__CI:
        return ci != null;
      case McsPackage.CLASSIFIER_CATEGORY__FEAT_G:
        return feat_g != FEAT_G_EDEFAULT;
      case McsPackage.CLASSIFIER_CATEGORY__REF_TO_F:
        return ref_to_f != null;
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
    result.append(" (component: ");
    result.append(component);
    result.append(", impl: ");
    result.append(impl);
    result.append(", feat_g: ");
    result.append(feat_g);
    result.append(')');
    return result.toString();
  }

} //ClassifierCategoryImpl
