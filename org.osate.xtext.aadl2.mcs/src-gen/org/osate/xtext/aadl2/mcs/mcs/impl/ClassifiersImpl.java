/**
 */
package org.osate.xtext.aadl2.mcs.mcs.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.osate.xtext.aadl2.mcs.mcs.Classifiers;
import org.osate.xtext.aadl2.mcs.mcs.McsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifiers</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.ClassifiersImpl#isT_class <em>Tclass</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.ClassifiersImpl#isT_class_subtype <em>Tclass subtype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassifiersImpl extends MinimalEObjectImpl.Container implements Classifiers
{
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
   * The default value of the '{@link #isT_class_subtype() <em>Tclass subtype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_class_subtype()
   * @generated
   * @ordered
   */
  protected static final boolean TCLASS_SUBTYPE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isT_class_subtype() <em>Tclass subtype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT_class_subtype()
   * @generated
   * @ordered
   */
  protected boolean t_class_subtype = TCLASS_SUBTYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClassifiersImpl()
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
    return McsPackage.Literals.CLASSIFIERS;
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
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.CLASSIFIERS__TCLASS, oldT_class, t_class));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isT_class_subtype()
  {
    return t_class_subtype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT_class_subtype(boolean newT_class_subtype)
  {
    boolean oldT_class_subtype = t_class_subtype;
    t_class_subtype = newT_class_subtype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.CLASSIFIERS__TCLASS_SUBTYPE, oldT_class_subtype, t_class_subtype));
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
      case McsPackage.CLASSIFIERS__TCLASS:
        return isT_class();
      case McsPackage.CLASSIFIERS__TCLASS_SUBTYPE:
        return isT_class_subtype();
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
      case McsPackage.CLASSIFIERS__TCLASS:
        setT_class((Boolean)newValue);
        return;
      case McsPackage.CLASSIFIERS__TCLASS_SUBTYPE:
        setT_class_subtype((Boolean)newValue);
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
      case McsPackage.CLASSIFIERS__TCLASS:
        setT_class(TCLASS_EDEFAULT);
        return;
      case McsPackage.CLASSIFIERS__TCLASS_SUBTYPE:
        setT_class_subtype(TCLASS_SUBTYPE_EDEFAULT);
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
      case McsPackage.CLASSIFIERS__TCLASS:
        return t_class != TCLASS_EDEFAULT;
      case McsPackage.CLASSIFIERS__TCLASS_SUBTYPE:
        return t_class_subtype != TCLASS_SUBTYPE_EDEFAULT;
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
    result.append(" (t_class: ");
    result.append(t_class);
    result.append(", t_class_subtype: ");
    result.append(t_class_subtype);
    result.append(')');
    return result.toString();
  }

} //ClassifiersImpl
