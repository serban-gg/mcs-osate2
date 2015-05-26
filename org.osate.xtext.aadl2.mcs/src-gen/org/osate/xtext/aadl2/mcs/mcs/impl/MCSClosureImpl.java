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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xbase.XExpression;

import org.osate.xtext.aadl2.mcs.mcs.MCSClosure;
import org.osate.xtext.aadl2.mcs.mcs.McsPackage;
import org.osate.xtext.aadl2.mcs.mcs.argument;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MCS Closure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.MCSClosureImpl#getDeclaredFormalParameters <em>Declared Formal Parameters</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.MCSClosureImpl#isExplicitSyntax <em>Explicit Syntax</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.MCSClosureImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MCSClosureImpl extends XExpressionImpl implements MCSClosure
{
  /**
   * The cached value of the '{@link #getDeclaredFormalParameters() <em>Declared Formal Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaredFormalParameters()
   * @generated
   * @ordered
   */
  protected EList<argument> declaredFormalParameters;

  /**
   * The default value of the '{@link #isExplicitSyntax() <em>Explicit Syntax</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExplicitSyntax()
   * @generated
   * @ordered
   */
  protected static final boolean EXPLICIT_SYNTAX_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isExplicitSyntax() <em>Explicit Syntax</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExplicitSyntax()
   * @generated
   * @ordered
   */
  protected boolean explicitSyntax = EXPLICIT_SYNTAX_EDEFAULT;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected XExpression expression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MCSClosureImpl()
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
    return McsPackage.Literals.MCS_CLOSURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<argument> getDeclaredFormalParameters()
  {
    if (declaredFormalParameters == null)
    {
      declaredFormalParameters = new EObjectContainmentEList<argument>(argument.class, this, McsPackage.MCS_CLOSURE__DECLARED_FORMAL_PARAMETERS);
    }
    return declaredFormalParameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isExplicitSyntax()
  {
    return explicitSyntax;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExplicitSyntax(boolean newExplicitSyntax)
  {
    boolean oldExplicitSyntax = explicitSyntax;
    explicitSyntax = newExplicitSyntax;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.MCS_CLOSURE__EXPLICIT_SYNTAX, oldExplicitSyntax, explicitSyntax));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(XExpression newExpression, NotificationChain msgs)
  {
    XExpression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.MCS_CLOSURE__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(XExpression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.MCS_CLOSURE__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.MCS_CLOSURE__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.MCS_CLOSURE__EXPRESSION, newExpression, newExpression));
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
      case McsPackage.MCS_CLOSURE__DECLARED_FORMAL_PARAMETERS:
        return ((InternalEList<?>)getDeclaredFormalParameters()).basicRemove(otherEnd, msgs);
      case McsPackage.MCS_CLOSURE__EXPRESSION:
        return basicSetExpression(null, msgs);
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
      case McsPackage.MCS_CLOSURE__DECLARED_FORMAL_PARAMETERS:
        return getDeclaredFormalParameters();
      case McsPackage.MCS_CLOSURE__EXPLICIT_SYNTAX:
        return isExplicitSyntax();
      case McsPackage.MCS_CLOSURE__EXPRESSION:
        return getExpression();
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
      case McsPackage.MCS_CLOSURE__DECLARED_FORMAL_PARAMETERS:
        getDeclaredFormalParameters().clear();
        getDeclaredFormalParameters().addAll((Collection<? extends argument>)newValue);
        return;
      case McsPackage.MCS_CLOSURE__EXPLICIT_SYNTAX:
        setExplicitSyntax((Boolean)newValue);
        return;
      case McsPackage.MCS_CLOSURE__EXPRESSION:
        setExpression((XExpression)newValue);
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
      case McsPackage.MCS_CLOSURE__DECLARED_FORMAL_PARAMETERS:
        getDeclaredFormalParameters().clear();
        return;
      case McsPackage.MCS_CLOSURE__EXPLICIT_SYNTAX:
        setExplicitSyntax(EXPLICIT_SYNTAX_EDEFAULT);
        return;
      case McsPackage.MCS_CLOSURE__EXPRESSION:
        setExpression((XExpression)null);
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
      case McsPackage.MCS_CLOSURE__DECLARED_FORMAL_PARAMETERS:
        return declaredFormalParameters != null && !declaredFormalParameters.isEmpty();
      case McsPackage.MCS_CLOSURE__EXPLICIT_SYNTAX:
        return explicitSyntax != EXPLICIT_SYNTAX_EDEFAULT;
      case McsPackage.MCS_CLOSURE__EXPRESSION:
        return expression != null;
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
    result.append(" (explicitSyntax: ");
    result.append(explicitSyntax);
    result.append(')');
    return result.toString();
  }

} //MCSClosureImpl
