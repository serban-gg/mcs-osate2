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

import org.osate.xtext.aadl2.mcs.mcs.Local_declaration;
import org.osate.xtext.aadl2.mcs.mcs.McsPackage;
import org.osate.xtext.aadl2.mcs.mcs.Theorem_declaration;
import org.osate.xtext.aadl2.mcs.mcs.Theorem_statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Theorem declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.Theorem_declarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.Theorem_declarationImpl#isMl <em>Ml</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.Theorem_declarationImpl#getLocals <em>Locals</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.Theorem_declarationImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.impl.Theorem_declarationImpl#getEndname <em>Endname</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Theorem_declarationImpl extends MinimalEObjectImpl.Container implements Theorem_declaration
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
   * The default value of the '{@link #isMl() <em>Ml</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMl()
   * @generated
   * @ordered
   */
  protected static final boolean ML_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMl() <em>Ml</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMl()
   * @generated
   * @ordered
   */
  protected boolean ml = ML_EDEFAULT;

  /**
   * The cached value of the '{@link #getLocals() <em>Locals</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocals()
   * @generated
   * @ordered
   */
  protected EList<Local_declaration> locals;

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
   * The cached value of the '{@link #getEndname() <em>Endname</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndname()
   * @generated
   * @ordered
   */
  protected Theorem_declaration endname;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Theorem_declarationImpl()
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
    return McsPackage.Literals.THEOREM_DECLARATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.THEOREM_DECLARATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMl()
  {
    return ml;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMl(boolean newMl)
  {
    boolean oldMl = ml;
    ml = newMl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.THEOREM_DECLARATION__ML, oldMl, ml));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Local_declaration> getLocals()
  {
    if (locals == null)
    {
      locals = new EObjectContainmentEList<Local_declaration>(Local_declaration.class, this, McsPackage.THEOREM_DECLARATION__LOCALS);
    }
    return locals;
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
      statements = new EObjectContainmentEList<Theorem_statement>(Theorem_statement.class, this, McsPackage.THEOREM_DECLARATION__STATEMENTS);
    }
    return statements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Theorem_declaration getEndname()
  {
    if (endname != null && endname.eIsProxy())
    {
      InternalEObject oldEndname = (InternalEObject)endname;
      endname = (Theorem_declaration)eResolveProxy(oldEndname);
      if (endname != oldEndname)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, McsPackage.THEOREM_DECLARATION__ENDNAME, oldEndname, endname));
      }
    }
    return endname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Theorem_declaration basicGetEndname()
  {
    return endname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEndname(Theorem_declaration newEndname)
  {
    Theorem_declaration oldEndname = endname;
    endname = newEndname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McsPackage.THEOREM_DECLARATION__ENDNAME, oldEndname, endname));
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
      case McsPackage.THEOREM_DECLARATION__LOCALS:
        return ((InternalEList<?>)getLocals()).basicRemove(otherEnd, msgs);
      case McsPackage.THEOREM_DECLARATION__STATEMENTS:
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
      case McsPackage.THEOREM_DECLARATION__NAME:
        return getName();
      case McsPackage.THEOREM_DECLARATION__ML:
        return isMl();
      case McsPackage.THEOREM_DECLARATION__LOCALS:
        return getLocals();
      case McsPackage.THEOREM_DECLARATION__STATEMENTS:
        return getStatements();
      case McsPackage.THEOREM_DECLARATION__ENDNAME:
        if (resolve) return getEndname();
        return basicGetEndname();
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
      case McsPackage.THEOREM_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case McsPackage.THEOREM_DECLARATION__ML:
        setMl((Boolean)newValue);
        return;
      case McsPackage.THEOREM_DECLARATION__LOCALS:
        getLocals().clear();
        getLocals().addAll((Collection<? extends Local_declaration>)newValue);
        return;
      case McsPackage.THEOREM_DECLARATION__STATEMENTS:
        getStatements().clear();
        getStatements().addAll((Collection<? extends Theorem_statement>)newValue);
        return;
      case McsPackage.THEOREM_DECLARATION__ENDNAME:
        setEndname((Theorem_declaration)newValue);
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
      case McsPackage.THEOREM_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case McsPackage.THEOREM_DECLARATION__ML:
        setMl(ML_EDEFAULT);
        return;
      case McsPackage.THEOREM_DECLARATION__LOCALS:
        getLocals().clear();
        return;
      case McsPackage.THEOREM_DECLARATION__STATEMENTS:
        getStatements().clear();
        return;
      case McsPackage.THEOREM_DECLARATION__ENDNAME:
        setEndname((Theorem_declaration)null);
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
      case McsPackage.THEOREM_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case McsPackage.THEOREM_DECLARATION__ML:
        return ml != ML_EDEFAULT;
      case McsPackage.THEOREM_DECLARATION__LOCALS:
        return locals != null && !locals.isEmpty();
      case McsPackage.THEOREM_DECLARATION__STATEMENTS:
        return statements != null && !statements.isEmpty();
      case McsPackage.THEOREM_DECLARATION__ENDNAME:
        return endname != null;
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
    result.append(", ml: ");
    result.append(ml);
    result.append(')');
    return result.toString();
  }

} //Theorem_declarationImpl
