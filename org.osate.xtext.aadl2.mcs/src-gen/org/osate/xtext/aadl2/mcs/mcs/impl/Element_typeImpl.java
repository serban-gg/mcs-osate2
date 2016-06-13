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
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.Element_typeImpl#isTelem <em>Telem</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.Element_typeImpl#isTpack <em>Tpack</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.Element_typeImpl#isT_class <em>Tclass</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.Element_typeImpl#isT_inst <em>Tinst</em>}</li>
 * </ul>
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
   * The default value of the '{@link #isTpack() <em>Tpack</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTpack()
   * @generated
   * @ordered
   */
  protected static final boolean TPACK_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTpack() <em>Tpack</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTpack()
   * @generated
   * @ordered
   */
  protected boolean tpack = TPACK_EDEFAULT;

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
   * The default value of the '{@link #isT_inst() <em>Tinst</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_inst()
   * @generated
   * @ordered
   */
  protected static final boolean TINST_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isT_inst() <em>Tinst</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_inst()
   * @generated
   * @ordered
   */
  protected boolean t_inst = TINST_EDEFAULT;

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
  public boolean isTpack()
  {
    return tpack;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTpack(boolean newTpack)
  {
    boolean oldTpack = tpack;
    tpack = newTpack;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.ELEMENT_TYPE__TPACK, oldTpack, tpack));
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
  public boolean isT_inst()
  {
    return t_inst;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT_inst(boolean newT_inst)
  {
    boolean oldT_inst = t_inst;
    t_inst = newT_inst;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.ELEMENT_TYPE__TINST, oldT_inst, t_inst));
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
      case McsPackage.ELEMENT_TYPE__TPACK:
        return isTpack();
      case McsPackage.ELEMENT_TYPE__TCLASS:
        return isT_class();
      case McsPackage.ELEMENT_TYPE__TINST:
        return isT_inst();
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
      case McsPackage.ELEMENT_TYPE__TPACK:
        setTpack((Boolean)newValue);
        return;
      case McsPackage.ELEMENT_TYPE__TCLASS:
        setT_class((Boolean)newValue);
        return;
      case McsPackage.ELEMENT_TYPE__TINST:
        setT_inst((Boolean)newValue);
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
      case McsPackage.ELEMENT_TYPE__TPACK:
        setTpack(TPACK_EDEFAULT);
        return;
      case McsPackage.ELEMENT_TYPE__TCLASS:
        setT_class(TCLASS_EDEFAULT);
        return;
      case McsPackage.ELEMENT_TYPE__TINST:
        setT_inst(TINST_EDEFAULT);
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
      case McsPackage.ELEMENT_TYPE__TPACK:
        return tpack != TPACK_EDEFAULT;
      case McsPackage.ELEMENT_TYPE__TCLASS:
        return t_class != TCLASS_EDEFAULT;
      case McsPackage.ELEMENT_TYPE__TINST:
        return t_inst != TINST_EDEFAULT;
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
    result.append(", tpack: ");
    result.append(tpack);
    result.append(", t_class: ");
    result.append(t_class);
    result.append(", t_inst: ");
    result.append(t_inst);
    result.append(')');
    return result.toString();
  }

} //Element_typeImpl
