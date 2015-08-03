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
import org.osate.xtext.aadl2.mcs.mcs.basic_type;
import org.osate.xtext.aadl2.mcs.mcs.composite_type;
import org.osate.xtext.aadl2.mcs.mcs.element_type;
import org.osate.xtext.aadl2.mcs.mcs.type_expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>type expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.type_expressionImpl#getBasic <em>Basic</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.type_expressionImpl#getComposite <em>Composite</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.type_expressionImpl#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class type_expressionImpl extends MinimalEObjectImpl.Container implements type_expression
{
  /**
   * The cached value of the '{@link #getBasic() <em>Basic</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBasic()
   * @generated
   * @ordered
   */
  protected basic_type basic;

  /**
   * The cached value of the '{@link #getComposite() <em>Composite</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComposite()
   * @generated
   * @ordered
   */
  protected composite_type composite;

  /**
   * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElement()
   * @generated
   * @ordered
   */
  protected element_type element;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected type_expressionImpl()
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
    return McsPackage.Literals.TYPE_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public basic_type getBasic()
  {
    return basic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBasic(basic_type newBasic, NotificationChain msgs)
  {
    basic_type oldBasic = basic;
    basic = newBasic;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.TYPE_EXPRESSION__BASIC, oldBasic, newBasic);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBasic(basic_type newBasic)
  {
    if (newBasic != basic)
    {
      NotificationChain msgs = null;
      if (basic != null)
        msgs = ((InternalEObject)basic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.TYPE_EXPRESSION__BASIC, null, msgs);
      if (newBasic != null)
        msgs = ((InternalEObject)newBasic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.TYPE_EXPRESSION__BASIC, null, msgs);
      msgs = basicSetBasic(newBasic, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TYPE_EXPRESSION__BASIC, newBasic, newBasic));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public composite_type getComposite()
  {
    return composite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetComposite(composite_type newComposite, NotificationChain msgs)
  {
    composite_type oldComposite = composite;
    composite = newComposite;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.TYPE_EXPRESSION__COMPOSITE, oldComposite, newComposite);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComposite(composite_type newComposite)
  {
    if (newComposite != composite)
    {
      NotificationChain msgs = null;
      if (composite != null)
        msgs = ((InternalEObject)composite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.TYPE_EXPRESSION__COMPOSITE, null, msgs);
      if (newComposite != null)
        msgs = ((InternalEObject)newComposite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.TYPE_EXPRESSION__COMPOSITE, null, msgs);
      msgs = basicSetComposite(newComposite, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TYPE_EXPRESSION__COMPOSITE, newComposite, newComposite));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public element_type getElement()
  {
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElement(element_type newElement, NotificationChain msgs)
  {
    element_type oldElement = element;
    element = newElement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.TYPE_EXPRESSION__ELEMENT, oldElement, newElement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElement(element_type newElement)
  {
    if (newElement != element)
    {
      NotificationChain msgs = null;
      if (element != null)
        msgs = ((InternalEObject)element).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.TYPE_EXPRESSION__ELEMENT, null, msgs);
      if (newElement != null)
        msgs = ((InternalEObject)newElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.TYPE_EXPRESSION__ELEMENT, null, msgs);
      msgs = basicSetElement(newElement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.TYPE_EXPRESSION__ELEMENT, newElement, newElement));
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
      case McsPackage.TYPE_EXPRESSION__BASIC:
        return basicSetBasic(null, msgs);
      case McsPackage.TYPE_EXPRESSION__COMPOSITE:
        return basicSetComposite(null, msgs);
      case McsPackage.TYPE_EXPRESSION__ELEMENT:
        return basicSetElement(null, msgs);
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
      case McsPackage.TYPE_EXPRESSION__BASIC:
        return getBasic();
      case McsPackage.TYPE_EXPRESSION__COMPOSITE:
        return getComposite();
      case McsPackage.TYPE_EXPRESSION__ELEMENT:
        return getElement();
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
      case McsPackage.TYPE_EXPRESSION__BASIC:
        setBasic((basic_type)newValue);
        return;
      case McsPackage.TYPE_EXPRESSION__COMPOSITE:
        setComposite((composite_type)newValue);
        return;
      case McsPackage.TYPE_EXPRESSION__ELEMENT:
        setElement((element_type)newValue);
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
      case McsPackage.TYPE_EXPRESSION__BASIC:
        setBasic((basic_type)null);
        return;
      case McsPackage.TYPE_EXPRESSION__COMPOSITE:
        setComposite((composite_type)null);
        return;
      case McsPackage.TYPE_EXPRESSION__ELEMENT:
        setElement((element_type)null);
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
      case McsPackage.TYPE_EXPRESSION__BASIC:
        return basic != null;
      case McsPackage.TYPE_EXPRESSION__COMPOSITE:
        return composite != null;
      case McsPackage.TYPE_EXPRESSION__ELEMENT:
        return element != null;
    }
    return super.eIsSet(featureID);
  }

} //type_expressionImpl
