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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.aadl2.NamedElement;

import org.osate.xtext.aadl2.mcs.mcs.ArrayRange;
import org.osate.xtext.aadl2.mcs.mcs.ContainmentPathElement;
import org.osate.xtext.aadl2.mcs.mcs.McsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Containment Path Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.ContainmentPathElementImpl#getNamedElement <em>Named Element</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.ContainmentPathElementImpl#getArrayRange <em>Array Range</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.ContainmentPathElementImpl#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContainmentPathElementImpl extends MinimalEObjectImpl.Container implements ContainmentPathElement
{
  /**
   * The cached value of the '{@link #getNamedElement() <em>Named Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamedElement()
   * @generated
   * @ordered
   */
  protected NamedElement namedElement;

  /**
   * The cached value of the '{@link #getArrayRange() <em>Array Range</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArrayRange()
   * @generated
   * @ordered
   */
  protected EList<ArrayRange> arrayRange;

  /**
   * The cached value of the '{@link #getPath() <em>Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPath()
   * @generated
   * @ordered
   */
  protected ContainmentPathElement path;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContainmentPathElementImpl()
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
    return McsPackage.Literals.CONTAINMENT_PATH_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedElement getNamedElement()
  {
    if (namedElement != null && ((EObject)namedElement).eIsProxy())
    {
      InternalEObject oldNamedElement = (InternalEObject)namedElement;
      namedElement = (NamedElement)eResolveProxy(oldNamedElement);
      if (namedElement != oldNamedElement)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, McsPackage.CONTAINMENT_PATH_ELEMENT__NAMED_ELEMENT, oldNamedElement, namedElement));
      }
    }
    return namedElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedElement basicGetNamedElement()
  {
    return namedElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNamedElement(NamedElement newNamedElement)
  {
    NamedElement oldNamedElement = namedElement;
    namedElement = newNamedElement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.CONTAINMENT_PATH_ELEMENT__NAMED_ELEMENT, oldNamedElement, namedElement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ArrayRange> getArrayRange()
  {
    if (arrayRange == null)
    {
      arrayRange = new EObjectContainmentEList<ArrayRange>(ArrayRange.class, this, McsPackage.CONTAINMENT_PATH_ELEMENT__ARRAY_RANGE);
    }
    return arrayRange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContainmentPathElement getPath()
  {
    return path;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPath(ContainmentPathElement newPath, NotificationChain msgs)
  {
    ContainmentPathElement oldPath = path;
    path = newPath;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.CONTAINMENT_PATH_ELEMENT__PATH, oldPath, newPath);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPath(ContainmentPathElement newPath)
  {
    if (newPath != path)
    {
      NotificationChain msgs = null;
      if (path != null)
        msgs = ((InternalEObject)path).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.CONTAINMENT_PATH_ELEMENT__PATH, null, msgs);
      if (newPath != null)
        msgs = ((InternalEObject)newPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.CONTAINMENT_PATH_ELEMENT__PATH, null, msgs);
      msgs = basicSetPath(newPath, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.CONTAINMENT_PATH_ELEMENT__PATH, newPath, newPath));
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
      case McsPackage.CONTAINMENT_PATH_ELEMENT__ARRAY_RANGE:
        return ((InternalEList<?>)getArrayRange()).basicRemove(otherEnd, msgs);
      case McsPackage.CONTAINMENT_PATH_ELEMENT__PATH:
        return basicSetPath(null, msgs);
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
      case McsPackage.CONTAINMENT_PATH_ELEMENT__NAMED_ELEMENT:
        if (resolve) return getNamedElement();
        return basicGetNamedElement();
      case McsPackage.CONTAINMENT_PATH_ELEMENT__ARRAY_RANGE:
        return getArrayRange();
      case McsPackage.CONTAINMENT_PATH_ELEMENT__PATH:
        return getPath();
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
      case McsPackage.CONTAINMENT_PATH_ELEMENT__NAMED_ELEMENT:
        setNamedElement((NamedElement)newValue);
        return;
      case McsPackage.CONTAINMENT_PATH_ELEMENT__ARRAY_RANGE:
        getArrayRange().clear();
        getArrayRange().addAll((Collection<? extends ArrayRange>)newValue);
        return;
      case McsPackage.CONTAINMENT_PATH_ELEMENT__PATH:
        setPath((ContainmentPathElement)newValue);
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
      case McsPackage.CONTAINMENT_PATH_ELEMENT__NAMED_ELEMENT:
        setNamedElement((NamedElement)null);
        return;
      case McsPackage.CONTAINMENT_PATH_ELEMENT__ARRAY_RANGE:
        getArrayRange().clear();
        return;
      case McsPackage.CONTAINMENT_PATH_ELEMENT__PATH:
        setPath((ContainmentPathElement)null);
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
      case McsPackage.CONTAINMENT_PATH_ELEMENT__NAMED_ELEMENT:
        return namedElement != null;
      case McsPackage.CONTAINMENT_PATH_ELEMENT__ARRAY_RANGE:
        return arrayRange != null && !arrayRange.isEmpty();
      case McsPackage.CONTAINMENT_PATH_ELEMENT__PATH:
        return path != null;
    }
    return super.eIsSet(featureID);
  }

} //ContainmentPathElementImpl
