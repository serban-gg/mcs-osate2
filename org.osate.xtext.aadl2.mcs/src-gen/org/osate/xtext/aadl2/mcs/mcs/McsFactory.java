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
   * Returns a new object of class '<em>MCS File</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>MCS File</em>'.
   * @generated
   */
  MCSFile createMCSFile();

  /**
   * Returns a new object of class '<em>MCS Annex Subclause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>MCS Annex Subclause</em>'.
   * @generated
   */
  MCSAnnexSubclause createMCSAnnexSubclause();

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
   * Returns a new object of class '<em>Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function</em>'.
   * @generated
   */
  Function createFunction();

  /**
   * Returns a new object of class '<em>Theorem</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Theorem</em>'.
   * @generated
   */
  Theorem createTheorem();

  /**
   * Returns a new object of class '<em>Theorem root</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Theorem root</em>'.
   * @generated
   */
  Theorem_root createTheorem_root();

  /**
   * Returns a new object of class '<em>Function Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Body</em>'.
   * @generated
   */
  FunctionBody createFunctionBody();

  /**
   * Returns a new object of class '<em>Theorem Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Theorem Body</em>'.
   * @generated
   */
  TheoremBody createTheoremBody();

  /**
   * Returns a new object of class '<em>Parameterized String</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameterized String</em>'.
   * @generated
   */
  ParameterizedString createParameterizedString();

  /**
   * Returns a new object of class '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter</em>'.
   * @generated
   */
  Parameter createParameter();

  /**
   * Returns a new object of class '<em>Text Parm</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Text Parm</em>'.
   * @generated
   */
  TextParm createTextParm();

  /**
   * Returns a new object of class '<em>Typed Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Typed Name</em>'.
   * @generated
   */
  McsTypedName createMcsTypedName();

  /**
   * Returns a new object of class '<em>Theorem Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Theorem Call</em>'.
   * @generated
   */
  TheoremCall createTheoremCall();

  /**
   * Returns a new object of class '<em>Classifier literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Classifier literal</em>'.
   * @generated
   */
  Classifier_literal createClassifier_literal();

  /**
   * Returns a new object of class '<em>Range</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Range</em>'.
   * @generated
   */
  Range createRange();

  /**
   * Returns a new object of class '<em>Ref Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ref Term</em>'.
   * @generated
   */
  RefTerm createRefTerm();

  /**
   * Returns a new object of class '<em>Nested Dot ID</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Nested Dot ID</em>'.
   * @generated
   */
  NestedDotID createNestedDotID();

  /**
   * Returns a new object of class '<em>Mcs name ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mcs name ref</em>'.
   * @generated
   */
  Mcs_name_ref createMcs_name_ref();

  /**
   * Returns a new object of class '<em>Method Chain</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method Chain</em>'.
   * @generated
   */
  MethodChain createMethodChain();

  /**
   * Returns a new object of class '<em>Built In Fn Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Built In Fn Call</em>'.
   * @generated
   */
  BuiltInFnCall createBuiltInFnCall();

  /**
   * Returns a new object of class '<em>Fn Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fn Call</em>'.
   * @generated
   */
  FnCall createFnCall();

  /**
   * Returns a new object of class '<em>Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr</em>'.
   * @generated
   */
  Expr createExpr();

  /**
   * Returns a new object of class '<em>Post Cast Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Post Cast Expr</em>'.
   * @generated
   */
  PostCastExpr createPostCastExpr();

  /**
   * Returns a new object of class '<em>MCS Name Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>MCS Name Expr</em>'.
   * @generated
   */
  MCSNameExpr createMCSNameExpr();

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
   * Returns a new object of class '<em>Composite type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Composite type</em>'.
   * @generated
   */
  Composite_type createComposite_type();

  /**
   * Returns a new object of class '<em>Mapping type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mapping type</em>'.
   * @generated
   */
  Mapping_type createMapping_type();

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
   * Returns a new object of class '<em>Union type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Union type</em>'.
   * @generated
   */
  Union_type createUnion_type();

  /**
   * Returns a new object of class '<em>Element type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Element type</em>'.
   * @generated
   */
  Element_type createElement_type();

  /**
   * Returns a new object of class '<em>Classifiers</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Classifiers</em>'.
   * @generated
   */
  Classifiers createClassifiers();

  /**
   * Returns a new object of class '<em>Tclassifier subtypes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tclassifier subtypes</em>'.
   * @generated
   */
  T_classifier_subtypes createT_classifier_subtypes();

  /**
   * Returns a new object of class '<em>Instances</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instances</em>'.
   * @generated
   */
  Instances createInstances();

  /**
   * Returns a new object of class '<em>tinstance subtypes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>tinstance subtypes</em>'.
   * @generated
   */
  t_instance_subtypes createt_instance_subtypes();

  /**
   * Returns a new object of class '<em>tsubcomponent subtypes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>tsubcomponent subtypes</em>'.
   * @generated
   */
  t_subcomponent_subtypes createt_subcomponent_subtypes();

  /**
   * Returns a new object of class '<em>tcomponent subtypes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>tcomponent subtypes</em>'.
   * @generated
   */
  t_component_subtypes createt_component_subtypes();

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
   * Returns a new object of class '<em>Integer Range</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Integer Range</em>'.
   * @generated
   */
  IntegerRange createIntegerRange();

  /**
   * Returns a new object of class '<em>Real Range</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Real Range</em>'.
   * @generated
   */
  RealRange createRealRange();

  /**
   * Returns a new object of class '<em>Unnamed Integer Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unnamed Integer Type</em>'.
   * @generated
   */
  UnnamedIntegerType createUnnamedIntegerType();

  /**
   * Returns a new object of class '<em>Unnamed Real Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unnamed Real Type</em>'.
   * @generated
   */
  UnnamedRealType createUnnamedRealType();

  /**
   * Returns a new object of class '<em>Unnamed Range Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unnamed Range Type</em>'.
   * @generated
   */
  UnnamedRangeType createUnnamedRangeType();

  /**
   * Returns a new object of class '<em>Claim String</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Claim String</em>'.
   * @generated
   */
  ClaimString createClaimString();

  /**
   * Returns a new object of class '<em>Claim Arg</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Claim Arg</em>'.
   * @generated
   */
  ClaimArg createClaimArg();

  /**
   * Returns a new object of class '<em>Binary Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Binary Expr</em>'.
   * @generated
   */
  BinaryExpr createBinaryExpr();

  /**
   * Returns a new object of class '<em>Instance Of Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instance Of Expr</em>'.
   * @generated
   */
  InstanceOfExpr createInstanceOfExpr();

  /**
   * Returns a new object of class '<em>Unary Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unary Expr</em>'.
   * @generated
   */
  UnaryExpr createUnaryExpr();

  /**
   * Returns a new object of class '<em>Pkg Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pkg Expr</em>'.
   * @generated
   */
  PkgExpr createPkgExpr();

  /**
   * Returns a new object of class '<em>Comp Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Comp Expr</em>'.
   * @generated
   */
  CompExpr createCompExpr();

  /**
   * Returns a new object of class '<em>Ref Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ref Expr</em>'.
   * @generated
   */
  RefExpr createRefExpr();

  /**
   * Returns a new object of class '<em>This Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>This Expr</em>'.
   * @generated
   */
  ThisExpr createThisExpr();

  /**
   * Returns a new object of class '<em>Int Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Expr</em>'.
   * @generated
   */
  IntExpr createIntExpr();

  /**
   * Returns a new object of class '<em>Real Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Real Expr</em>'.
   * @generated
   */
  RealExpr createRealExpr();

  /**
   * Returns a new object of class '<em>Bool Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bool Expr</em>'.
   * @generated
   */
  BoolExpr createBoolExpr();

  /**
   * Returns a new object of class '<em>String Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Expr</em>'.
   * @generated
   */
  StringExpr createStringExpr();

  /**
   * Returns a new object of class '<em>If Then Else Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>If Then Else Expr</em>'.
   * @generated
   */
  IfThenElseExpr createIfThenElseExpr();

  /**
   * Returns a new object of class '<em>Quantified Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Quantified Expr</em>'.
   * @generated
   */
  QuantifiedExpr createQuantifiedExpr();

  /**
   * Returns a new object of class '<em>Built In Fn Call Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Built In Fn Call Expr</em>'.
   * @generated
   */
  BuiltInFnCallExpr createBuiltInFnCallExpr();

  /**
   * Returns a new object of class '<em>Fn Call Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fn Call Expr</em>'.
   * @generated
   */
  FnCallExpr createFnCallExpr();

  /**
   * Returns a new object of class '<em>Theorem Call Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Theorem Call Expr</em>'.
   * @generated
   */
  TheoremCallExpr createTheoremCallExpr();

  /**
   * Returns a new object of class '<em>Filter Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Filter Set</em>'.
   * @generated
   */
  FilterSet createFilterSet();

  /**
   * Returns a new object of class '<em>Filter Map Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Filter Map Expr</em>'.
   * @generated
   */
  FilterMapExpr createFilterMapExpr();

  /**
   * Returns a new object of class '<em>Set Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set Expr</em>'.
   * @generated
   */
  SetExpr createSetExpr();

  /**
   * Returns a new object of class '<em>Mapping Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mapping Expr</em>'.
   * @generated
   */
  MappingExpr createMappingExpr();

  /**
   * Returns a new object of class '<em>Empty Set Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Empty Set Expr</em>'.
   * @generated
   */
  EmptySetExpr createEmptySetExpr();

  /**
   * Returns a new object of class '<em>Let Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Let Expr</em>'.
   * @generated
   */
  LetExpr createLetExpr();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  McsPackage getMcsPackage();

} //McsFactory
