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
   * Returns a new object of class '<em>Type declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type declaration</em>'.
   * @generated
   */
  Type_declaration createType_declaration();

  /**
   * Returns a new object of class '<em>Constant declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constant declaration</em>'.
   * @generated
   */
  Constant_declaration createConstant_declaration();

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
   * Returns a new object of class '<em>property reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>property reference</em>'.
   * @generated
   */
  property_reference createproperty_reference();

  /**
   * Returns a new object of class '<em>element reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>element reference</em>'.
   * @generated
   */
  element_reference createelement_reference();

  /**
   * Returns a new object of class '<em>Containment Path Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Containment Path Element</em>'.
   * @generated
   */
  ContainmentPathElement createContainmentPathElement();

  /**
   * Returns a new object of class '<em>Array Range</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Range</em>'.
   * @generated
   */
  ArrayRange createArrayRange();

  /**
   * Returns a new object of class '<em>Package Enforce</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Package Enforce</em>'.
   * @generated
   */
  PackageEnforce createPackageEnforce();

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
   * Returns a new object of class '<em>constant expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>constant expression</em>'.
   * @generated
   */
  constant_expression createconstant_expression();

  /**
   * Returns a new object of class '<em>expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>expression</em>'.
   * @generated
   */
  expression createexpression();

  /**
   * Returns a new object of class '<em>Boolean Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Term</em>'.
   * @generated
   */
  BooleanTerm createBooleanTerm();

  /**
   * Returns a new object of class '<em>Collection Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Collection Term</em>'.
   * @generated
   */
  CollectionTerm createCollectionTerm();

  /**
   * Returns a new object of class '<em>Set comprehension</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set comprehension</em>'.
   * @generated
   */
  Set_comprehension createSet_comprehension();

  /**
   * Returns a new object of class '<em>Query element set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Query element set</em>'.
   * @generated
   */
  Query_element_set createQuery_element_set();

  /**
   * Returns a new object of class '<em>Element types</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Element types</em>'.
   * @generated
   */
  Element_types createElement_types();

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
   * Returns a new object of class '<em>Function declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function declaration</em>'.
   * @generated
   */
  Function_declaration createFunction_declaration();

  /**
   * Returns a new object of class '<em>Argument</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Argument</em>'.
   * @generated
   */
  Argument createArgument();

  /**
   * Returns a new object of class '<em>Theorem declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Theorem declaration</em>'.
   * @generated
   */
  Theorem_declaration createTheorem_declaration();

  /**
   * Returns a new object of class '<em>In modes list</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>In modes list</em>'.
   * @generated
   */
  In_modes_list createIn_modes_list();

  /**
   * Returns a new object of class '<em>Local declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Local declaration</em>'.
   * @generated
   */
  Local_declaration createLocal_declaration();

  /**
   * Returns a new object of class '<em>Theorem statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Theorem statement</em>'.
   * @generated
   */
  Theorem_statement createTheorem_statement();

  /**
   * Returns a new object of class '<em>Basic statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Basic statement</em>'.
   * @generated
   */
  Basic_statement createBasic_statement();

  /**
   * Returns a new object of class '<em>Iteration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Iteration</em>'.
   * @generated
   */
  Iteration createIteration();

  /**
   * Returns a new object of class '<em>Type expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type expression</em>'.
   * @generated
   */
  Type_expression createType_expression();

  /**
   * Returns a new object of class '<em>Basic type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Basic type</em>'.
   * @generated
   */
  Basic_type createBasic_type();

  /**
   * Returns a new object of class '<em>Unnamed Function Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unnamed Function Type</em>'.
   * @generated
   */
  UnnamedFunctionType createUnnamedFunctionType();

  /**
   * Returns a new object of class '<em>Composite type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Composite type</em>'.
   * @generated
   */
  Composite_type createComposite_type();

  /**
   * Returns a new object of class '<em>Set type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set type</em>'.
   * @generated
   */
  Set_type createSet_type();

  /**
   * Returns a new object of class '<em>List type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>List type</em>'.
   * @generated
   */
  List_type createList_type();

  /**
   * Returns a new object of class '<em>Map type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Map type</em>'.
   * @generated
   */
  Map_type createMap_type();

  /**
   * Returns a new object of class '<em>Record type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Record type</em>'.
   * @generated
   */
  Record_type createRecord_type();

  /**
   * Returns a new object of class '<em>Union type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Union type</em>'.
   * @generated
   */
  Union_type createUnion_type();

  /**
   * Returns a new object of class '<em>Id type pair</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Id type pair</em>'.
   * @generated
   */
  Id_type_pair createId_type_pair();

  /**
   * Returns a new object of class '<em>Element type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Element type</em>'.
   * @generated
   */
  Element_type createElement_type();

  /**
   * Returns a new object of class '<em>tclassifiers</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>tclassifiers</em>'.
   * @generated
   */
  t_classifiers createt_classifiers();

  /**
   * Returns a new object of class '<em>tclassifier subtypes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>tclassifier subtypes</em>'.
   * @generated
   */
  t_classifier_subtypes createt_classifier_subtypes();

  /**
   * Returns a new object of class '<em>tnamed references</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>tnamed references</em>'.
   * @generated
   */
  t_named_references createt_named_references();

  /**
   * Returns a new object of class '<em>tnamed reference subtypes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>tnamed reference subtypes</em>'.
   * @generated
   */
  t_named_reference_subtypes createt_named_reference_subtypes();

  /**
   * Returns a new object of class '<em>tsubcomponent subtypes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>tsubcomponent subtypes</em>'.
   * @generated
   */
  t_subcomponent_subtypes createt_subcomponent_subtypes();

  /**
   * Returns a new object of class '<em>tcomponent impl subtypes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>tcomponent impl subtypes</em>'.
   * @generated
   */
  t_component_impl_subtypes createt_component_impl_subtypes();

  /**
   * Returns a new object of class '<em>tconnection subtypes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>tconnection subtypes</em>'.
   * @generated
   */
  t_connection_subtypes createt_connection_subtypes();

  /**
   * Returns a new object of class '<em>tfeature subtypes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>tfeature subtypes</em>'.
   * @generated
   */
  t_feature_subtypes createt_feature_subtypes();

  /**
   * Returns a new object of class '<em>taccess subtypes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>taccess subtypes</em>'.
   * @generated
   */
  t_access_subtypes createt_access_subtypes();

  /**
   * Returns a new object of class '<em>tport subtypes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>tport subtypes</em>'.
   * @generated
   */
  t_port_subtypes createt_port_subtypes();

  /**
   * Returns a new object of class '<em>tflow spec subtypes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>tflow spec subtypes</em>'.
   * @generated
   */
  t_flow_spec_subtypes createt_flow_spec_subtypes();

  /**
   * Returns a new object of class '<em>tflow impl subtypes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>tflow impl subtypes</em>'.
   * @generated
   */
  t_flow_impl_subtypes createt_flow_impl_subtypes();

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
