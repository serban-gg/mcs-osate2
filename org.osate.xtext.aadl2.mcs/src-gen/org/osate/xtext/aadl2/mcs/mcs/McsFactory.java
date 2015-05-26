/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage
 * @generated
 */
public interface McsFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  McsFactory eINSTANCE = org.osate.xtext.aadl2.mcs.mcs.impl.McsFactoryImpl.init();

  /**
   * Returns a new object of class '<em>MCS Grammar Root</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>MCS Grammar Root</em>'.
   * @generated
   */
  MCSGrammarRoot createMCSGrammarRoot();

  /**
   * Returns a new object of class '<em>MCS Annex Library</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>MCS Annex Library</em>'.
   * @generated
   */
  MCSAnnexLibrary createMCSAnnexLibrary();

  /**
   * Returns a new object of class '<em>MCS Viewpoint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>MCS Viewpoint</em>'.
   * @generated
   */
  MCSViewpoint createMCSViewpoint();

  /**
   * Returns a new object of class '<em>Enforcement policy</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enforcement policy</em>'.
   * @generated
   */
  Enforcement_policy createEnforcement_policy();

  /**
   * Returns a new object of class '<em>Package Script</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Package Script</em>'.
   * @generated
   */
  PackageScript createPackageScript();

  /**
   * Returns a new object of class '<em>Applies To Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Applies To Clause</em>'.
   * @generated
   */
  AppliesToClause createAppliesToClause();

  /**
   * Returns a new object of class '<em>Classifier Category</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Classifier Category</em>'.
   * @generated
   */
  ClassifierCategory createClassifierCategory();

  /**
   * Returns a new object of class '<em>Feature Group Classifier Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature Group Classifier Reference</em>'.
   * @generated
   */
  FeatureGroupClassifierReference createFeatureGroupClassifierReference();

  /**
   * Returns a new object of class '<em>Viewpoint Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Viewpoint Reference</em>'.
   * @generated
   */
  ViewpointReference createViewpointReference();

  /**
   * Returns a new object of class '<em>Constraints Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constraints Block</em>'.
   * @generated
   */
  ConstraintsBlock createConstraintsBlock();

  /**
   * Returns a new object of class '<em>labelled check statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>labelled check statement</em>'.
   * @generated
   */
  labelled_check_statement createlabelled_check_statement();

  /**
   * Returns a new object of class '<em>check statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>check statement</em>'.
   * @generated
   */
  check_statement createcheck_statement();

  /**
   * Returns a new object of class '<em>block label id</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>block label id</em>'.
   * @generated
   */
  block_label_id createblock_label_id();

  /**
   * Returns a new object of class '<em>check label id</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>check label id</em>'.
   * @generated
   */
  check_label_id createcheck_label_id();

  /**
   * Returns a new object of class '<em>check theorem</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>check theorem</em>'.
   * @generated
   */
  check_theorem createcheck_theorem();

  /**
   * Returns a new object of class '<em>Mode Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mode Spec</em>'.
   * @generated
   */
  ModeSpec createModeSpec();

  /**
   * Returns a new object of class '<em>Mode Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mode Name</em>'.
   * @generated
   */
  ModeName createModeName();

  /**
   * Returns a new object of class '<em>check assertion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>check assertion</em>'.
   * @generated
   */
  check_assertion createcheck_assertion();

  /**
   * Returns a new object of class '<em>root element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>root element</em>'.
   * @generated
   */
  root_element createroot_element();

  /**
   * Returns a new object of class '<em>element reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>element reference</em>'.
   * @generated
   */
  element_reference createelement_reference();

  /**
   * Returns a new object of class '<em>Package Enforce</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Package Enforce</em>'.
   * @generated
   */
  PackageEnforce createPackageEnforce();

  /**
   * Returns a new object of class '<em>expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>expression</em>'.
   * @generated
   */
  expression createexpression();

  /**
   * Returns a new object of class '<em>assertion expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>assertion expression</em>'.
   * @generated
   */
  assertion_expression createassertion_expression();

  /**
   * Returns a new object of class '<em>string expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>string expression</em>'.
   * @generated
   */
  string_expression createstring_expression();

  /**
   * Returns a new object of class '<em>MCS Annex Subclause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>MCS Annex Subclause</em>'.
   * @generated
   */
  MCSAnnexSubclause createMCSAnnexSubclause();

  /**
   * Returns a new object of class '<em>Classifier Enforce</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Classifier Enforce</em>'.
   * @generated
   */
  ClassifierEnforce createClassifierEnforce();

  /**
   * Returns a new object of class '<em>Classifier Script</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Classifier Script</em>'.
   * @generated
   */
  ClassifierScript createClassifierScript();

  /**
   * Returns a new object of class '<em>theorem declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>theorem declaration</em>'.
   * @generated
   */
  theorem_declaration createtheorem_declaration();

  /**
   * Returns a new object of class '<em>in modes list</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>in modes list</em>'.
   * @generated
   */
  in_modes_list createin_modes_list();

  /**
   * Returns a new object of class '<em>local declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>local declaration</em>'.
   * @generated
   */
  local_declaration createlocal_declaration();

  /**
   * Returns a new object of class '<em>theorem statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>theorem statement</em>'.
   * @generated
   */
  theorem_statement createtheorem_statement();

  /**
   * Returns a new object of class '<em>type declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>type declaration</em>'.
   * @generated
   */
  type_declaration createtype_declaration();

  /**
   * Returns a new object of class '<em>type expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>type expression</em>'.
   * @generated
   */
  type_expression createtype_expression();

  /**
   * Returns a new object of class '<em>function declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>function declaration</em>'.
   * @generated
   */
  function_declaration createfunction_declaration();

  /**
   * Returns a new object of class '<em>argument</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>argument</em>'.
   * @generated
   */
  argument createargument();

  /**
   * Returns a new object of class '<em>XExpression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XExpression</em>'.
   * @generated
   */
  XExpression createXExpression();

  /**
   * Returns a new object of class '<em>basic type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>basic type</em>'.
   * @generated
   */
  basic_type createbasic_type();

  /**
   * Returns a new object of class '<em>Unnamed Function Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unnamed Function Type</em>'.
   * @generated
   */
  UnnamedFunctionType createUnnamedFunctionType();

  /**
   * Returns a new object of class '<em>constant expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>constant expression</em>'.
   * @generated
   */
  constant_expression createconstant_expression();

  /**
   * Returns a new object of class '<em>MCS Closure</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>MCS Closure</em>'.
   * @generated
   */
  MCSClosure createMCSClosure();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  McsPackage getMcsPackage();

} //McsFactory
