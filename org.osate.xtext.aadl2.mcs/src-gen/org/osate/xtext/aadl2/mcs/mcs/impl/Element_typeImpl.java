/**
 */
package org.osate.xtext.aadl2.mcs.mcs.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.osate.xtext.aadl2.mcs.mcs.Element_type;
import org.osate.xtext.aadl2.mcs.mcs.McsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.Element_typeImpl#isTelem <em>Telem</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.Element_typeImpl#isT_class <em>Tclass</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.Element_typeImpl#isT_ref <em>Tref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Element_typeImpl extends MinimalEObjectImpl.Container implements Element_type
{
  /**
   * The default value of the '{@link #isTelem() <em>Telem</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTelem()
   * @generated
   * @ordered
   */
  protected static final boolean TELEM_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTelem() <em>Telem</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTelem()
   * @generated
   * @ordered
   */
  protected boolean telem = TELEM_EDEFAULT;

  /**
   * The default value of the '{@link #isT_class() <em>Tclass</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_class()
   * @generated
   * @ordered
   */
  protected static final boolean TCLASS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isT_class() <em>Tclass</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_class()
   * @generated
   * @ordered
   */
  protected boolean t_class = TCLASS_EDEFAULT;

  /**
   * The default value of the '{@link #isT_ref() <em>Tref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_ref()
   * @generated
   * @ordered
   */
  protected static final boolean TREF_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isT_ref() <em>Tref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_ref()
   * @generated
   * @ordered
   */
  protected boolean t_ref = TREF_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Element_typeImpl()
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
    return McsPackage.Literals.ELEMENT_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isTelem()
  {
    return telem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTelem(boolean newTelem)
  {
    boolean oldTelem = telem;
    telem = newTelem;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.ELEMENT_TYPE__TELEM, oldTelem, telem));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isT_class()
  {
    return t_class;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT_class(boolean newT_class)
  {
    boolean oldT_class = t_class;
    t_class = newT_class;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.ELEMENT_TYPE__TCLASS, oldT_class, t_class));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isT_ref()
  {
    return t_ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT_ref(boolean newT_ref)
  {
    boolean oldT_ref = t_ref;
    t_ref = newT_ref;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.ELEMENT_TYPE__TREF, oldT_ref, t_ref));
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
      case McsPackage.ELEMENT_TYPE__TELEM:
        return isTelem();
      case McsPackage.ELEMENT_TYPE__TCLASS:
        return isT_class();
      case McsPackage.ELEMENT_TYPE__TREF:
        return isT_ref();
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
      case McsPackage.ELEMENT_TYPE__TELEM:
        setTelem((Boolean)newValue);
        return;
      case McsPackage.ELEMENT_TYPE__TCLASS:
        setT_class((Boolean)newValue);
        return;
      case McsPackage.ELEMENT_TYPE__TREF:
        setT_ref((Boolean)newValue);
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
      case McsPackage.ELEMENT_TYPE__TELEM:
        setTelem(TELEM_EDEFAULT);
        return;
      case McsPackage.ELEMENT_TYPE__TCLASS:
        setT_class(TCLASS_EDEFAULT);
        return;
      case McsPackage.ELEMENT_TYPE__TREF:
        setT_ref(TREF_EDEFAULT);
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
      case McsPackage.ELEMENT_TYPE__TELEM:
        return telem != TELEM_EDEFAULT;
      case McsPackage.ELEMENT_TYPE__TCLASS:
        return t_class != TCLASS_EDEFAULT;
      case McsPackage.ELEMENT_TYPE__TREF:
        return t_ref != TREF_EDEFAULT;
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
    result.append(" (telem: ");
    result.append(telem);
    result.append(", t_class: ");
    result.append(t_class);
    result.append(", t_ref: ");
    result.append(t_ref);
    result.append(')');
    return result.toString();
  }

} //Element_typeImpl
