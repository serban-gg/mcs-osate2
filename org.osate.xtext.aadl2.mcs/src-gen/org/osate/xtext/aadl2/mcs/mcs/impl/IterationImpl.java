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

import org.osate.xtext.aadl2.mcs.mcs.Iteration;
import org.osate.xtext.aadl2.mcs.mcs.Local_declaration;
import org.osate.xtext.aadl2.mcs.mcs.McsPackage;
import org.osate.xtext.aadl2.mcs.mcs.Theorem_statement;
import org.osate.xtext.aadl2.mcs.mcs.expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iteration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.IterationImpl#getVar_id <em>Var id</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.IterationImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.IterationImpl#getLocal <em>Local</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.IterationImpl#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IterationImpl extends Basic_statementImpl implements Iteration
{
  /**
   * The default value of the '{@link #getVar_id() <em>Var id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar_id()
   * @generated
   * @ordered
   */
  protected static final String VAR_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVar_id() <em>Var id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar_id()
   * @generated
   * @ordered
   */
  protected String var_id = VAR_ID_EDEFAULT;

  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected expression expr;

  /**
   * The cached value of the '{@link #getLocal() <em>Local</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocal()
   * @generated
   * @ordered
   */
  protected EList<Local_declaration> local;

  /**
   * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatements()
   * @generated
   * @ordered
   */
  protected EList<Theorem_statement> statements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IterationImpl()
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
    return McsPackage.Literals.ITERATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVar_id()
  {
    return var_id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVar_id(String newVar_id)
  {
    String oldVar_id = var_id;
    var_id = newVar_id;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.ITERATION__VAR_ID, oldVar_id, var_id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr(expression newExpr, NotificationChain msgs)
  {
    expression oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McsPackage.ITERATION__EXPR, oldExpr, newExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr(expression newExpr)
  {
    if (newExpr != expr)
    {
      NotificationChain msgs = null;
      if (expr != null)
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McsPackage.ITERATION__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McsPackage.ITERATION__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.ITERATION__EXPR, newExpr, newExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Local_declaration> getLocal()
  {
    if (local == null)
    {
      local = new EObjectContainmentEList<Local_declaration>(Local_declaration.class, this, McsPackage.ITERATION__LOCAL);
    }
    return local;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Theorem_statement> getStatements()
  {
    if (statements == null)
    {
      statements = new EObjectContainmentEList<Theorem_statement>(Theorem_statement.class, this, McsPackage.ITERATION__STATEMENTS);
    }
    return statements;
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
      case McsPackage.ITERATION__EXPR:
        return basicSetExpr(null, msgs);
      case McsPackage.ITERATION__LOCAL:
        return ((InternalEList<?>)getLocal()).basicRemove(otherEnd, msgs);
      case McsPackage.ITERATION__STATEMENTS:
        return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
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
      case McsPackage.ITERATION__VAR_ID:
        return getVar_id();
      case McsPackage.ITERATION__EXPR:
        return getExpr();
      case McsPackage.ITERATION__LOCAL:
        return getLocal();
      case McsPackage.ITERATION__STATEMENTS:
        return getStatements();
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
      case McsPackage.ITERATION__VAR_ID:
        setVar_id((String)newValue);
        return;
      case McsPackage.ITERATION__EXPR:
        setExpr((expression)newValue);
        return;
      case McsPackage.ITERATION__LOCAL:
        getLocal().clear();
        getLocal().addAll((Collection<? extends Local_declaration>)newValue);
        return;
      case McsPackage.ITERATION__STATEMENTS:
        getStatements().clear();
        getStatements().addAll((Collection<? extends Theorem_statement>)newValue);
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
      case McsPackage.ITERATION__VAR_ID:
        setVar_id(VAR_ID_EDEFAULT);
        return;
      case McsPackage.ITERATION__EXPR:
        setExpr((expression)null);
        return;
      case McsPackage.ITERATION__LOCAL:
        getLocal().clear();
        return;
      case McsPackage.ITERATION__STATEMENTS:
        getStatements().clear();
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
      case McsPackage.ITERATION__VAR_ID:
        return VAR_ID_EDEFAULT == null ? var_id != null : !VAR_ID_EDEFAULT.equals(var_id);
      case McsPackage.ITERATION__EXPR:
        return expr != null;
      case McsPackage.ITERATION__LOCAL:
        return local != null && !local.isEmpty();
      case McsPackage.ITERATION__STATEMENTS:
        return statements != null && !statements.isEmpty();
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
    result.append(" (var_id: ");
    result.append(var_id);
    result.append(')');
    return result.toString();
  }

} //IterationImpl
