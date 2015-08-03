/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.ComponentCategory;
import org.osate.aadl2.ComponentImplementation;
import org.osate.aadl2.ComponentType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.ClassifierCategory#getComponent <em>Component</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.ClassifierCategory#getCt <em>Ct</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.ClassifierCategory#isImpl <em>Impl</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.ClassifierCategory#getCi <em>Ci</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.ClassifierCategory#isFeat_g <em>Feat g</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.mcs.mcs.ClassifierCategory#getRef_to_f <em>Ref to f</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getClassifierCategory()
 * @model
 * @generated
 */
public interface ClassifierCategory extends EObject
{
  /**
   * Returns the value of the '<em><b>Component</b></em>' attribute.
   * The literals are from the enumeration {@link org.osate.aadl2.ComponentCategory}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Component</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component</em>' attribute.
   * @see org.osate.aadl2.ComponentCategory
   * @see #setComponent(ComponentCategory)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getClassifierCategory_Component()
   * @model
   * @generated
   */
  ComponentCategory getComponent();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.ClassifierCategory#getComponent <em>Component</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Component</em>' attribute.
   * @see org.osate.aadl2.ComponentCategory
   * @see #getComponent()
   * @generated
   */
  void setComponent(ComponentCategory value);

  /**
   * Returns the value of the '<em><b>Ct</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ct</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ct</em>' reference.
   * @see #setCt(ComponentType)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getClassifierCategory_Ct()
   * @model
   * @generated
   */
  ComponentType getCt();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.ClassifierCategory#getCt <em>Ct</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ct</em>' reference.
   * @see #getCt()
   * @generated
   */
  void setCt(ComponentType value);

  /**
   * Returns the value of the '<em><b>Impl</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Impl</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Impl</em>' attribute.
   * @see #setImpl(boolean)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getClassifierCategory_Impl()
   * @model
   * @generated
   */
  boolean isImpl();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.ClassifierCategory#isImpl <em>Impl</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Impl</em>' attribute.
   * @see #isImpl()
   * @generated
   */
  void setImpl(boolean value);

  /**
   * Returns the value of the '<em><b>Ci</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ci</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ci</em>' reference.
   * @see #setCi(ComponentImplementation)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getClassifierCategory_Ci()
   * @model
   * @generated
   */
  ComponentImplementation getCi();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.ClassifierCategory#getCi <em>Ci</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ci</em>' reference.
   * @see #getCi()
   * @generated
   */
  void setCi(ComponentImplementation value);

  /**
   * Returns the value of the '<em><b>Feat g</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feat g</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feat g</em>' attribute.
   * @see #setFeat_g(boolean)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getClassifierCategory_Feat_g()
   * @model
   * @generated
   */
  boolean isFeat_g();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.ClassifierCategory#isFeat_g <em>Feat g</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feat g</em>' attribute.
   * @see #isFeat_g()
   * @generated
   */
  void setFeat_g(boolean value);

  /**
   * Returns the value of the '<em><b>Ref to f</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref to f</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref to f</em>' containment reference.
   * @see #setRef_to_f(FeatureGroupClassifierReference)
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#getClassifierCategory_Ref_to_f()
   * @model containment="true"
   * @generated
   */
  FeatureGroupClassifierReference getRef_to_f();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.mcs.mcs.ClassifierCategory#getRef_to_f <em>Ref to f</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref to f</em>' containment reference.
   * @see #getRef_to_f()
   * @generated
   */
  void setRef_to_f(FeatureGroupClassifierReference value);

} // ClassifierCategory
