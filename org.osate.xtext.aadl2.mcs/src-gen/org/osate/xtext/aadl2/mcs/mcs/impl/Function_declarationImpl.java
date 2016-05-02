/**
 */
package org.osate.xtext.aadl2.mcs.mcs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xbase.XExpression;

import org.osate.xtext.aadl2.mcs.mcs.Argument;
import org.osate.xtext.aadl2.mcs.mcs.Function_declaration;
import org.osate.xtext.aadl2.mcs.mcs.McsPackage;
import org.osate.xtext.aadl2.mcs.mcs.Type_declaration;
import org.osate.xtext.aadl2.mcs.mcs.Type_expression;
import org.osate.xtext.aadl2.mcs.mcs.UnnamedFunctionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.Function_declarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.Function_declarationImpl#getArg <em>Arg</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.Function_declarationImpl#getOut <em>Out</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.Function_declarationImpl#getFtype <em>Ftype</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.Function_declarationImpl#getTyperef <em>Typeref</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.Function_declarationImpl#getClosure <em>Closure</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.Function_declarationImpl#getExp_body <em>Exp body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Function_declarationImpl extends MinimalEObjectImpl.Container implements Function_declaration
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getArg() <em>Arg</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArg()
   * @generated
   * @ordered
   */
  protected EList<Argument> arg;

  /**
   * The cached value of the '{@link #getOut() <em>Out</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOut()
   * @generated
   * @ordered
   */
  protected Type_expression out;

  /**
   * The cached value of the '{@link #getFtype() <em>Ftype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFtype()
   * @generated
   * @ordered
   */
  protected UnnamedFunctionType ftype;

  /**
   * The cached value of the '{@link #getTyperef() <em>Typeref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTyperef()
   * @generated
   * @ordered
   */
  protected Type_declaration typeref;

  /**
   * The cached value of the '{@link #getClosure() <em>Closure</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClosure()
   * @generated
   * @ordered
   */
  protected XExpression closure;

  /**
   * The cached value of the '{@link #getExp_body() <em>Exp body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp_body()
   * @generated
   * @ordered
   */
  protected XExpression exp_body;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Function_declarationImpl()
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
    return McsPackage.Literals.FUNCTION_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.FUNCTION_DECLARATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Argument> getArg()
  {
    if (arg == null)
    {
      arg = new EObjectContainmentEList<Argument>(Argument.class, this, McsPackage.FUNCTION_DECLARATION__ARG);
    }
    return arg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type_expression getOut()
  {
    return out;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOut(Type_expression newOut, NotificationChain msgs)
  {
    Type_expression oldOut = out;
    out = newOut;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.FUNCTION_DECLARATION__OUT, oldOut, newOut);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOut(Type_expression newOut)
  {
    if (newOut != out)
    {
      NotificationChain msgs = null;
      if (out != null)
        msgs = ((InternalEObject)out).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.FUNCTION_DECLARATION__OUT, null, msgs);
      if (newOut != null)
        msgs = ((InternalEObject)newOut).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.FUNCTION_DECLARATION__OUT, null, msgs);
      msgs = basicSetOut(newOut, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.FUNCTION_DECLARATION__OUT, newOut, newOut));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnnamedFunctionType getFtype()
  {
    return ftype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFtype(UnnamedFunctionType newFtype, NotificationChain msgs)
  {
    UnnamedFunctionType oldFtype = ftype;
    ftype = newFtype;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.FUNCTION_DECLARATION__FTYPE, oldFtype, newFtype);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFtype(UnnamedFunctionType newFtype)
  {
    if (newFtype != ftype)
    {
      NotificationChain msgs = null;
      if (ftype != null)
        msgs = ((InternalEObject)ftype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.FUNCTION_DECLARATION__FTYPE, null, msgs);
      if (newFtype != null)
        msgs = ((InternalEObject)newFtype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.FUNCTION_DECLARATION__FTYPE, null, msgs);
      msgs = basicSetFtype(newFtype, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.FUNCTION_DECLARATION__FTYPE, newFtype, newFtype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type_declaration getTyperef()
  {
    if (typeref != null && typeref.eIsProxy())
    {
      InternalEObject oldTyperef = (InternalEObject)typeref;
      typeref = (Type_declaration)eResolveProxy(oldTyperef);
      if (typeref != oldTyperef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, McsPackage.FUNCTION_DECLARATION__TYPEREF, oldTyperef, typeref));
      }
    }
    return typeref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type_declaration basicGetTyperef()
  {
    return typeref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTyperef(Type_declaration newTyperef)
  {
    Type_declaration oldTyperef = typeref;
    typeref = newTyperef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.FUNCTION_DECLARATION__TYPEREF, oldTyperef, typeref));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getClosure()
  {
    return closure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClosure(XExpression newClosure, NotificationChain msgs)
  {
    XExpression oldClosure = closure;
    closure = newClosure;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.FUNCTION_DECLARATION__CLOSURE, oldClosure, newClosure);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClosure(XExpression newClosure)
  {
    if (newClosure != closure)
    {
      NotificationChain msgs = null;
      if (closure != null)
        msgs = ((InternalEObject)closure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.FUNCTION_DECLARATION__CLOSURE, null, msgs);
      if (newClosure != null)
        msgs = ((InternalEObject)newClosure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.FUNCTION_DECLARATION__CLOSURE, null, msgs);
      msgs = basicSetClosure(newClosure, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.FUNCTION_DECLARATION__CLOSURE, newClosure, newClosure));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getExp_body()
  {
    return exp_body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExp_body(XExpression newExp_body, NotificationChain msgs)
  {
    XExpression oldExp_body = exp_body;
    exp_body = newExp_body;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.FUNCTION_DECLARATION__EXP_BODY, oldExp_body, newExp_body);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExp_body(XExpression newExp_body)
  {
    if (newExp_body != exp_body)
    {
      NotificationChain msgs = null;
      if (exp_body != null)
        msgs = ((InternalEObject)exp_body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.FUNCTION_DECLARATION__EXP_BODY, null, msgs);
      if (newExp_body != null)
        msgs = ((InternalEObject)newExp_body).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.FUNCTION_DECLARATION__EXP_BODY, null, msgs);
      msgs = basicSetExp_body(newExp_body, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.FUNCTION_DECLARATION__EXP_BODY, newExp_body, newExp_body));
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
      case McsPackage.FUNCTION_DECLARATION__ARG:
        return ((InternalEList<?>)getArg()).basicRemove(otherEnd, msgs);
      case McsPackage.FUNCTION_DECLARATION__OUT:
        return basicSetOut(null, msgs);
      case McsPackage.FUNCTION_DECLARATION__FTYPE:
        return basicSetFtype(null, msgs);
      case McsPackage.FUNCTION_DECLARATION__CLOSURE:
        return basicSetClosure(null, msgs);
      case McsPackage.FUNCTION_DECLARATION__EXP_BODY:
        return basicSetExp_body(null, msgs);
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
      case McsPackage.FUNCTION_DECLARATION__NAME:
        return getName();
      case McsPackage.FUNCTION_DECLARATION__ARG:
        return getArg();
      case McsPackage.FUNCTION_DECLARATION__OUT:
        return getOut();
      case McsPackage.FUNCTION_DECLARATION__FTYPE:
        return getFtype();
      case McsPackage.FUNCTION_DECLARATION__TYPEREF:
        if (resolve) return getTyperef();
        return basicGetTyperef();
      case McsPackage.FUNCTION_DECLARATION__CLOSURE:
        return getClosure();
      case McsPackage.FUNCTION_DECLARATION__EXP_BODY:
        return getExp_body();
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
      case McsPackage.FUNCTION_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case McsPackage.FUNCTION_DECLARATION__ARG:
        getArg().clear();
        getArg().addAll((Collection<? extends Argument>)newValue);
        return;
      case McsPackage.FUNCTION_DECLARATION__OUT:
        setOut((Type_expression)newValue);
        return;
      case McsPackage.FUNCTION_DECLARATION__FTYPE:
        setFtype((UnnamedFunctionType)newValue);
        return;
      case McsPackage.FUNCTION_DECLARATION__TYPEREF:
        setTyperef((Type_declaration)newValue);
        return;
      case McsPackage.FUNCTION_DECLARATION__CLOSURE:
        setClosure((XExpression)newValue);
        return;
      case McsPackage.FUNCTION_DECLARATION__EXP_BODY:
        setExp_body((XExpression)newValue);
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
      case McsPackage.FUNCTION_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case McsPackage.FUNCTION_DECLARATION__ARG:
        getArg().clear();
        return;
      case McsPackage.FUNCTION_DECLARATION__OUT:
        setOut((Type_expression)null);
        return;
      case McsPackage.FUNCTION_DECLARATION__FTYPE:
        setFtype((UnnamedFunctionType)null);
        return;
      case McsPackage.FUNCTION_DECLARATION__TYPEREF:
        setTyperef((Type_declaration)null);
        return;
      case McsPackage.FUNCTION_DECLARATION__CLOSURE:
        setClosure((XExpression)null);
        return;
      case McsPackage.FUNCTION_DECLARATION__EXP_BODY:
        setExp_body((XExpression)null);
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
      case McsPackage.FUNCTION_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case McsPackage.FUNCTION_DECLARATION__ARG:
        return arg != null && !arg.isEmpty();
      case McsPackage.FUNCTION_DECLARATION__OUT:
        return out != null;
      case McsPackage.FUNCTION_DECLARATION__FTYPE:
        return ftype != null;
      case McsPackage.FUNCTION_DECLARATION__TYPEREF:
        return typeref != null;
      case McsPackage.FUNCTION_DECLARATION__CLOSURE:
        return closure != null;
      case McsPackage.FUNCTION_DECLARATION__EXP_BODY:
        return exp_body != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //Function_declarationImpl
