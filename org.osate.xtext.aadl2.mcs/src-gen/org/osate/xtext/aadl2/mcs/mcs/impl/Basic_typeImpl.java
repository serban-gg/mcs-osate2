/**
 */
package org.osate.xtext.aadl2.mcs.mcs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.osate.aadl2.AadlBoolean;
import org.osate.aadl2.AadlInteger;
import org.osate.aadl2.AadlReal;
import org.osate.aadl2.AadlString;
import org.osate.aadl2.ClassifierType;
import org.osate.aadl2.EnumerationType;
import org.osate.aadl2.RangeType;
import org.osate.aadl2.ReferenceType;
import org.osate.aadl2.UnitsType;

import org.osate.xtext.aadl2.mcs.mcs.Basic_type;
import org.osate.xtext.aadl2.mcs.mcs.Constant;
import org.osate.xtext.aadl2.mcs.mcs.McsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.Basic_typeImpl#getPtype <em>Ptype</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.Basic_typeImpl#getPref <em>Pref</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.Basic_typeImpl#getBool <em>Bool</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.Basic_typeImpl#getString <em>String</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.Basic_typeImpl#getEnumer <em>Enumer</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.Basic_typeImpl#getUnits <em>Units</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.Basic_typeImpl#getInteger <em>Integer</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.Basic_typeImpl#getReal <em>Real</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.Basic_typeImpl#getRange <em>Range</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.Basic_typeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.Basic_typeImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.Basic_typeImpl#getTypename <em>Typename</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Basic_typeImpl extends MinimalEObjectImpl.Container implements Basic_type
{
  /**
   * The default value of the '{@link #getPtype() <em>Ptype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPtype()
   * @generated
   * @ordered
   */
  protected static final String PTYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPtype() <em>Ptype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPtype()
   * @generated
   * @ordered
   */
  protected String ptype = PTYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getPref() <em>Pref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPref()
   * @generated
   * @ordered
   */
  protected static final String PREF_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPref() <em>Pref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPref()
   * @generated
   * @ordered
   */
  protected String pref = PREF_EDEFAULT;

  /**
   * The cached value of the '{@link #getBool() <em>Bool</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBool()
   * @generated
   * @ordered
   */
  protected AadlBoolean bool;

  /**
   * The cached value of the '{@link #getString() <em>String</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getString()
   * @generated
   * @ordered
   */
  protected AadlString string;

  /**
   * The cached value of the '{@link #getEnumer() <em>Enumer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnumer()
   * @generated
   * @ordered
   */
  protected EnumerationType enumer;

  /**
   * The cached value of the '{@link #getUnits() <em>Units</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnits()
   * @generated
   * @ordered
   */
  protected UnitsType units;

  /**
   * The cached value of the '{@link #getInteger() <em>Integer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInteger()
   * @generated
   * @ordered
   */
  protected AadlInteger integer;

  /**
   * The cached value of the '{@link #getReal() <em>Real</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReal()
   * @generated
   * @ordered
   */
  protected AadlReal real;

  /**
   * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRange()
   * @generated
   * @ordered
   */
  protected RangeType range;

  /**
   * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_()
   * @generated
   * @ordered
   */
  protected ClassifierType class_;

  /**
   * The cached value of the '{@link #getRef() <em>Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRef()
   * @generated
   * @ordered
   */
  protected ReferenceType ref;

  /**
   * The cached value of the '{@link #getTypename() <em>Typename</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypename()
   * @generated
   * @ordered
   */
  protected Constant typename;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Basic_typeImpl()
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
    return McsPackage.Literals.BASIC_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPtype()
  {
    return ptype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPtype(String newPtype)
  {
    String oldPtype = ptype;
    ptype = newPtype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.BASIC_TYPE__PTYPE, oldPtype, ptype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPref()
  {
    return pref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPref(String newPref)
  {
    String oldPref = pref;
    pref = newPref;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.BASIC_TYPE__PREF, oldPref, pref));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AadlBoolean getBool()
  {
    return bool;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBool(AadlBoolean newBool, NotificationChain msgs)
  {
    AadlBoolean oldBool = bool;
    bool = newBool;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.BASIC_TYPE__BOOL, oldBool, newBool);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBool(AadlBoolean newBool)
  {
    if (newBool != bool)
    {
      NotificationChain msgs = null;
      if (bool != null)
        msgs = ((InternalEObject)bool).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.BASIC_TYPE__BOOL, null, msgs);
      if (newBool != null)
        msgs = ((InternalEObject)newBool).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.BASIC_TYPE__BOOL, null, msgs);
      msgs = basicSetBool(newBool, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.BASIC_TYPE__BOOL, newBool, newBool));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AadlString getString()
  {
    return string;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetString(AadlString newString, NotificationChain msgs)
  {
    AadlString oldString = string;
    string = newString;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.BASIC_TYPE__STRING, oldString, newString);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setString(AadlString newString)
  {
    if (newString != string)
    {
      NotificationChain msgs = null;
      if (string != null)
        msgs = ((InternalEObject)string).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.BASIC_TYPE__STRING, null, msgs);
      if (newString != null)
        msgs = ((InternalEObject)newString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.BASIC_TYPE__STRING, null, msgs);
      msgs = basicSetString(newString, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.BASIC_TYPE__STRING, newString, newString));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumerationType getEnumer()
  {
    return enumer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEnumer(EnumerationType newEnumer, NotificationChain msgs)
  {
    EnumerationType oldEnumer = enumer;
    enumer = newEnumer;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.BASIC_TYPE__ENUMER, oldEnumer, newEnumer);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnumer(EnumerationType newEnumer)
  {
    if (newEnumer != enumer)
    {
      NotificationChain msgs = null;
      if (enumer != null)
        msgs = ((InternalEObject)enumer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.BASIC_TYPE__ENUMER, null, msgs);
      if (newEnumer != null)
        msgs = ((InternalEObject)newEnumer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.BASIC_TYPE__ENUMER, null, msgs);
      msgs = basicSetEnumer(newEnumer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.BASIC_TYPE__ENUMER, newEnumer, newEnumer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnitsType getUnits()
  {
    return units;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnits(UnitsType newUnits, NotificationChain msgs)
  {
    UnitsType oldUnits = units;
    units = newUnits;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.BASIC_TYPE__UNITS, oldUnits, newUnits);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnits(UnitsType newUnits)
  {
    if (newUnits != units)
    {
      NotificationChain msgs = null;
      if (units != null)
        msgs = ((InternalEObject)units).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.BASIC_TYPE__UNITS, null, msgs);
      if (newUnits != null)
        msgs = ((InternalEObject)newUnits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.BASIC_TYPE__UNITS, null, msgs);
      msgs = basicSetUnits(newUnits, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.BASIC_TYPE__UNITS, newUnits, newUnits));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AadlInteger getInteger()
  {
    return integer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInteger(AadlInteger newInteger, NotificationChain msgs)
  {
    AadlInteger oldInteger = integer;
    integer = newInteger;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.BASIC_TYPE__INTEGER, oldInteger, newInteger);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInteger(AadlInteger newInteger)
  {
    if (newInteger != integer)
    {
      NotificationChain msgs = null;
      if (integer != null)
        msgs = ((InternalEObject)integer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.BASIC_TYPE__INTEGER, null, msgs);
      if (newInteger != null)
        msgs = ((InternalEObject)newInteger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.BASIC_TYPE__INTEGER, null, msgs);
      msgs = basicSetInteger(newInteger, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.BASIC_TYPE__INTEGER, newInteger, newInteger));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AadlReal getReal()
  {
    return real;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReal(AadlReal newReal, NotificationChain msgs)
  {
    AadlReal oldReal = real;
    real = newReal;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.BASIC_TYPE__REAL, oldReal, newReal);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReal(AadlReal newReal)
  {
    if (newReal != real)
    {
      NotificationChain msgs = null;
      if (real != null)
        msgs = ((InternalEObject)real).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.BASIC_TYPE__REAL, null, msgs);
      if (newReal != null)
        msgs = ((InternalEObject)newReal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.BASIC_TYPE__REAL, null, msgs);
      msgs = basicSetReal(newReal, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.BASIC_TYPE__REAL, newReal, newReal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RangeType getRange()
  {
    return range;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRange(RangeType newRange, NotificationChain msgs)
  {
    RangeType oldRange = range;
    range = newRange;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.BASIC_TYPE__RANGE, oldRange, newRange);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRange(RangeType newRange)
  {
    if (newRange != range)
    {
      NotificationChain msgs = null;
      if (range != null)
        msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.BASIC_TYPE__RANGE, null, msgs);
      if (newRange != null)
        msgs = ((InternalEObject)newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.BASIC_TYPE__RANGE, null, msgs);
      msgs = basicSetRange(newRange, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.BASIC_TYPE__RANGE, newRange, newRange));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassifierType getClass_()
  {
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClass(ClassifierType newClass, NotificationChain msgs)
  {
    ClassifierType oldClass = class_;
    class_ = newClass;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.BASIC_TYPE__CLASS, oldClass, newClass);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClass(ClassifierType newClass)
  {
    if (newClass != class_)
    {
      NotificationChain msgs = null;
      if (class_ != null)
        msgs = ((InternalEObject)class_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.BASIC_TYPE__CLASS, null, msgs);
      if (newClass != null)
        msgs = ((InternalEObject)newClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.BASIC_TYPE__CLASS, null, msgs);
      msgs = basicSetClass(newClass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.BASIC_TYPE__CLASS, newClass, newClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferenceType getRef()
  {
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRef(ReferenceType newRef, NotificationChain msgs)
  {
    ReferenceType oldRef = ref;
    ref = newRef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.BASIC_TYPE__REF, oldRef, newRef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRef(ReferenceType newRef)
  {
    if (newRef != ref)
    {
      NotificationChain msgs = null;
      if (ref != null)
        msgs = ((InternalEObject)ref).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.BASIC_TYPE__REF, null, msgs);
      if (newRef != null)
        msgs = ((InternalEObject)newRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.BASIC_TYPE__REF, null, msgs);
      msgs = basicSetRef(newRef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.BASIC_TYPE__REF, newRef, newRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constant getTypename()
  {
    if (typename != null && typename.eIsProxy())
    {
      InternalEObject oldTypename = (InternalEObject)typename;
      typename = (Constant)eResolveProxy(oldTypename);
      if (typename != oldTypename)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, McsPackage.BASIC_TYPE__TYPENAME, oldTypename, typename));
      }
    }
    return typename;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constant basicGetTypename()
  {
    return typename;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypename(Constant newTypename)
  {
    Constant oldTypename = typename;
    typename = newTypename;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.BASIC_TYPE__TYPENAME, oldTypename, typename));
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
      case McsPackage.BASIC_TYPE__BOOL:
        return basicSetBool(null, msgs);
      case McsPackage.BASIC_TYPE__STRING:
        return basicSetString(null, msgs);
      case McsPackage.BASIC_TYPE__ENUMER:
        return basicSetEnumer(null, msgs);
      case McsPackage.BASIC_TYPE__UNITS:
        return basicSetUnits(null, msgs);
      case McsPackage.BASIC_TYPE__INTEGER:
        return basicSetInteger(null, msgs);
      case McsPackage.BASIC_TYPE__REAL:
        return basicSetReal(null, msgs);
      case McsPackage.BASIC_TYPE__RANGE:
        return basicSetRange(null, msgs);
      case McsPackage.BASIC_TYPE__CLASS:
        return basicSetClass(null, msgs);
      case McsPackage.BASIC_TYPE__REF:
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
      case McsPackage.BASIC_TYPE__PTYPE:
        return getPtype();
      case McsPackage.BASIC_TYPE__PREF:
        return getPref();
      case McsPackage.BASIC_TYPE__BOOL:
        return getBool();
      case McsPackage.BASIC_TYPE__STRING:
        return getString();
      case McsPackage.BASIC_TYPE__ENUMER:
        return getEnumer();
      case McsPackage.BASIC_TYPE__UNITS:
        return getUnits();
      case McsPackage.BASIC_TYPE__INTEGER:
        return getInteger();
      case McsPackage.BASIC_TYPE__REAL:
        return getReal();
      case McsPackage.BASIC_TYPE__RANGE:
        return getRange();
      case McsPackage.BASIC_TYPE__CLASS:
        return getClass_();
      case McsPackage.BASIC_TYPE__REF:
        return getRef();
      case McsPackage.BASIC_TYPE__TYPENAME:
        if (resolve) return getTypename();
        return basicGetTypename();
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
      case McsPackage.BASIC_TYPE__PTYPE:
        setPtype((String)newValue);
        return;
      case McsPackage.BASIC_TYPE__PREF:
        setPref((String)newValue);
        return;
      case McsPackage.BASIC_TYPE__BOOL:
        setBool((AadlBoolean)newValue);
        return;
      case McsPackage.BASIC_TYPE__STRING:
        setString((AadlString)newValue);
        return;
      case McsPackage.BASIC_TYPE__ENUMER:
        setEnumer((EnumerationType)newValue);
        return;
      case McsPackage.BASIC_TYPE__UNITS:
        setUnits((UnitsType)newValue);
        return;
      case McsPackage.BASIC_TYPE__INTEGER:
        setInteger((AadlInteger)newValue);
        return;
      case McsPackage.BASIC_TYPE__REAL:
        setReal((AadlReal)newValue);
        return;
      case McsPackage.BASIC_TYPE__RANGE:
        setRange((RangeType)newValue);
        return;
      case McsPackage.BASIC_TYPE__CLASS:
        setClass((ClassifierType)newValue);
        return;
      case McsPackage.BASIC_TYPE__REF:
        setRef((ReferenceType)newValue);
        return;
      case McsPackage.BASIC_TYPE__TYPENAME:
        setTypename((Constant)newValue);
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
      case McsPackage.BASIC_TYPE__PTYPE:
        setPtype(PTYPE_EDEFAULT);
        return;
      case McsPackage.BASIC_TYPE__PREF:
        setPref(PREF_EDEFAULT);
        return;
      case McsPackage.BASIC_TYPE__BOOL:
        setBool((AadlBoolean)null);
        return;
      case McsPackage.BASIC_TYPE__STRING:
        setString((AadlString)null);
        return;
      case McsPackage.BASIC_TYPE__ENUMER:
        setEnumer((EnumerationType)null);
        return;
      case McsPackage.BASIC_TYPE__UNITS:
        setUnits((UnitsType)null);
        return;
      case McsPackage.BASIC_TYPE__INTEGER:
        setInteger((AadlInteger)null);
        return;
      case McsPackage.BASIC_TYPE__REAL:
        setReal((AadlReal)null);
        return;
      case McsPackage.BASIC_TYPE__RANGE:
        setRange((RangeType)null);
        return;
      case McsPackage.BASIC_TYPE__CLASS:
        setClass((ClassifierType)null);
        return;
      case McsPackage.BASIC_TYPE__REF:
        setRef((ReferenceType)null);
        return;
      case McsPackage.BASIC_TYPE__TYPENAME:
        setTypename((Constant)null);
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
      case McsPackage.BASIC_TYPE__PTYPE:
        return PTYPE_EDEFAULT == null ? ptype != null : !PTYPE_EDEFAULT.equals(ptype);
      case McsPackage.BASIC_TYPE__PREF:
        return PREF_EDEFAULT == null ? pref != null : !PREF_EDEFAULT.equals(pref);
      case McsPackage.BASIC_TYPE__BOOL:
        return bool != null;
      case McsPackage.BASIC_TYPE__STRING:
        return string != null;
      case McsPackage.BASIC_TYPE__ENUMER:
        return enumer != null;
      case McsPackage.BASIC_TYPE__UNITS:
        return units != null;
      case McsPackage.BASIC_TYPE__INTEGER:
        return integer != null;
      case McsPackage.BASIC_TYPE__REAL:
        return real != null;
      case McsPackage.BASIC_TYPE__RANGE:
        return range != null;
      case McsPackage.BASIC_TYPE__CLASS:
        return class_ != null;
      case McsPackage.BASIC_TYPE__REF:
        return ref != null;
      case McsPackage.BASIC_TYPE__TYPENAME:
        return typename != null;
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
    result.append(" (ptype: ");
    result.append(ptype);
    result.append(", pref: ");
    result.append(pref);
    result.append(')');
    return result.toString();
  }

} //Basic_typeImpl
