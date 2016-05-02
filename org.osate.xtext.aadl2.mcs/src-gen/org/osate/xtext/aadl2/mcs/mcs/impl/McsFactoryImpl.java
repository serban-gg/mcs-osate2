/**
 */
package org.osate.xtext.aadl2.mcs.mcs.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.osate.xtext.aadl2.mcs.mcs.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class McsFactoryImpl extends EFactoryImpl implements McsFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static McsFactory init()
  {
    try
    {
      McsFactory theMcsFactory = (McsFactory)EPackage.Registry.INSTANCE.getEFactory(McsPackage.eNS_URI);
      if (theMcsFactory != null)
      {
        return theMcsFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new McsFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public McsFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case McsPackage.MCS_GRAMMAR_ROOT: return createMCSGrammarRoot();
      case McsPackage.MCS_ANNEX_LIBRARY: return createMCSAnnexLibrary();
      case McsPackage.TYPE_DECLARATION: return createType_declaration();
      case McsPackage.CONSTANT_DECLARATION: return createConstant_declaration();
      case McsPackage.MCS_VIEWPOINT: return createMCSViewpoint();
      case McsPackage.ENFORCEMENT_POLICY: return createEnforcement_policy();
      case McsPackage.PACKAGE_SCRIPT: return createPackageScript();
      case McsPackage.APPLIES_TO_CLAUSE: return createAppliesToClause();
      case McsPackage.CLASSIFIER_CATEGORY: return createClassifierCategory();
      case McsPackage.FEATURE_GROUP_CLASSIFIER_REFERENCE: return createFeatureGroupClassifierReference();
      case McsPackage.VIEWPOINT_REFERENCE: return createViewpointReference();
      case McsPackage.CONSTRAINTS_BLOCK: return createConstraintsBlock();
      case McsPackage.LABELLED_CHECK_STATEMENT: return createlabelled_check_statement();
      case McsPackage.CHECK_STATEMENT: return createcheck_statement();
      case McsPackage.BLOCK_LABEL_ID: return createblock_label_id();
      case McsPackage.CHECK_LABEL_ID: return createcheck_label_id();
      case McsPackage.CHECK_THEOREM: return createcheck_theorem();
      case McsPackage.MODE_SPEC: return createModeSpec();
      case McsPackage.MODE_NAME: return createModeName();
      case McsPackage.CHECK_ASSERTION: return createcheck_assertion();
      case McsPackage.ROOT_ELEMENT: return createroot_element();
      case McsPackage.PROPERTY_REFERENCE: return createproperty_reference();
      case McsPackage.ELEMENT_REFERENCE: return createelement_reference();
      case McsPackage.CONTAINMENT_PATH_ELEMENT: return createContainmentPathElement();
      case McsPackage.ARRAY_RANGE: return createArrayRange();
      case McsPackage.PACKAGE_ENFORCE: return createPackageEnforce();
      case McsPackage.ASSERTION_EXPRESSION: return createassertion_expression();
      case McsPackage.STRING_EXPRESSION: return createstring_expression();
      case McsPackage.CONSTANT_EXPRESSION: return createconstant_expression();
      case McsPackage.EXPRESSION: return createexpression();
      case McsPackage.BOOLEAN_TERM: return createBooleanTerm();
      case McsPackage.COLLECTION_TERM: return createCollectionTerm();
      case McsPackage.SET_COMPREHENSION: return createSet_comprehension();
      case McsPackage.QUERY_ELEMENT_SET: return createQuery_element_set();
      case McsPackage.ELEMENT_TYPES: return createElement_types();
      case McsPackage.MCS_ANNEX_SUBCLAUSE: return createMCSAnnexSubclause();
      case McsPackage.CLASSIFIER_ENFORCE: return createClassifierEnforce();
      case McsPackage.CLASSIFIER_SCRIPT: return createClassifierScript();
      case McsPackage.FUNCTION_DECLARATION: return createFunction_declaration();
      case McsPackage.ARGUMENT: return createArgument();
      case McsPackage.THEOREM_DECLARATION: return createTheorem_declaration();
      case McsPackage.IN_MODES_LIST: return createIn_modes_list();
      case McsPackage.LOCAL_DECLARATION: return createLocal_declaration();
      case McsPackage.THEOREM_STATEMENT: return createTheorem_statement();
      case McsPackage.BASIC_STATEMENT: return createBasic_statement();
      case McsPackage.ITERATION: return createIteration();
      case McsPackage.TYPE_EXPRESSION: return createType_expression();
      case McsPackage.BASIC_TYPE: return createBasic_type();
      case McsPackage.UNNAMED_FUNCTION_TYPE: return createUnnamedFunctionType();
      case McsPackage.COMPOSITE_TYPE: return createComposite_type();
      case McsPackage.SET_TYPE: return createSet_type();
      case McsPackage.LIST_TYPE: return createList_type();
      case McsPackage.MAP_TYPE: return createMap_type();
      case McsPackage.RECORD_TYPE: return createRecord_type();
      case McsPackage.UNION_TYPE: return createUnion_type();
      case McsPackage.ID_TYPE_PAIR: return createId_type_pair();
      case McsPackage.ELEMENT_TYPE: return createElement_type();
      case McsPackage.TCLASSIFIERS: return createt_classifiers();
      case McsPackage.TCLASSIFIER_SUBTYPES: return createt_classifier_subtypes();
      case McsPackage.TNAMED_REFERENCES: return createt_named_references();
      case McsPackage.TNAMED_REFERENCE_SUBTYPES: return createt_named_reference_subtypes();
      case McsPackage.TSUBCOMPONENT_SUBTYPES: return createt_subcomponent_subtypes();
      case McsPackage.TCOMPONENT_IMPL_SUBTYPES: return createt_component_impl_subtypes();
      case McsPackage.TCONNECTION_SUBTYPES: return createt_connection_subtypes();
      case McsPackage.TFEATURE_SUBTYPES: return createt_feature_subtypes();
      case McsPackage.TACCESS_SUBTYPES: return createt_access_subtypes();
      case McsPackage.TPORT_SUBTYPES: return createt_port_subtypes();
      case McsPackage.TFLOW_SPEC_SUBTYPES: return createt_flow_spec_subtypes();
      case McsPackage.TFLOW_IMPL_SUBTYPES: return createt_flow_impl_subtypes();
      case McsPackage.MCS_CLOSURE: return createMCSClosure();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MCSGrammarRoot createMCSGrammarRoot()
  {
    MCSGrammarRootImpl mcsGrammarRoot = new MCSGrammarRootImpl();
    return mcsGrammarRoot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MCSAnnexLibrary createMCSAnnexLibrary()
  {
    MCSAnnexLibraryImpl mcsAnnexLibrary = new MCSAnnexLibraryImpl();
    return mcsAnnexLibrary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type_declaration createType_declaration()
  {
    Type_declarationImpl type_declaration = new Type_declarationImpl();
    return type_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constant_declaration createConstant_declaration()
  {
    Constant_declarationImpl constant_declaration = new Constant_declarationImpl();
    return constant_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MCSViewpoint createMCSViewpoint()
  {
    MCSViewpointImpl mcsViewpoint = new MCSViewpointImpl();
    return mcsViewpoint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Enforcement_policy createEnforcement_policy()
  {
    Enforcement_policyImpl enforcement_policy = new Enforcement_policyImpl();
    return enforcement_policy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageScript createPackageScript()
  {
    PackageScriptImpl packageScript = new PackageScriptImpl();
    return packageScript;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AppliesToClause createAppliesToClause()
  {
    AppliesToClauseImpl appliesToClause = new AppliesToClauseImpl();
    return appliesToClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassifierCategory createClassifierCategory()
  {
    ClassifierCategoryImpl classifierCategory = new ClassifierCategoryImpl();
    return classifierCategory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureGroupClassifierReference createFeatureGroupClassifierReference()
  {
    FeatureGroupClassifierReferenceImpl featureGroupClassifierReference = new FeatureGroupClassifierReferenceImpl();
    return featureGroupClassifierReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewpointReference createViewpointReference()
  {
    ViewpointReferenceImpl viewpointReference = new ViewpointReferenceImpl();
    return viewpointReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstraintsBlock createConstraintsBlock()
  {
    ConstraintsBlockImpl constraintsBlock = new ConstraintsBlockImpl();
    return constraintsBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public labelled_check_statement createlabelled_check_statement()
  {
    labelled_check_statementImpl labelled_check_statement = new labelled_check_statementImpl();
    return labelled_check_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public check_statement createcheck_statement()
  {
    check_statementImpl check_statement = new check_statementImpl();
    return check_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public block_label_id createblock_label_id()
  {
    block_label_idImpl block_label_id = new block_label_idImpl();
    return block_label_id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public check_label_id createcheck_label_id()
  {
    check_label_idImpl check_label_id = new check_label_idImpl();
    return check_label_id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public check_theorem createcheck_theorem()
  {
    check_theoremImpl check_theorem = new check_theoremImpl();
    return check_theorem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModeSpec createModeSpec()
  {
    ModeSpecImpl modeSpec = new ModeSpecImpl();
    return modeSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModeName createModeName()
  {
    ModeNameImpl modeName = new ModeNameImpl();
    return modeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public check_assertion createcheck_assertion()
  {
    check_assertionImpl check_assertion = new check_assertionImpl();
    return check_assertion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public root_element createroot_element()
  {
    root_elementImpl root_element = new root_elementImpl();
    return root_element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public property_reference createproperty_reference()
  {
    property_referenceImpl property_reference = new property_referenceImpl();
    return property_reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public element_reference createelement_reference()
  {
    element_referenceImpl element_reference = new element_referenceImpl();
    return element_reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContainmentPathElement createContainmentPathElement()
  {
    ContainmentPathElementImpl containmentPathElement = new ContainmentPathElementImpl();
    return containmentPathElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayRange createArrayRange()
  {
    ArrayRangeImpl arrayRange = new ArrayRangeImpl();
    return arrayRange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageEnforce createPackageEnforce()
  {
    PackageEnforceImpl packageEnforce = new PackageEnforceImpl();
    return packageEnforce;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public assertion_expression createassertion_expression()
  {
    assertion_expressionImpl assertion_expression = new assertion_expressionImpl();
    return assertion_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public string_expression createstring_expression()
  {
    string_expressionImpl string_expression = new string_expressionImpl();
    return string_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public constant_expression createconstant_expression()
  {
    constant_expressionImpl constant_expression = new constant_expressionImpl();
    return constant_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression createexpression()
  {
    expressionImpl expression = new expressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanTerm createBooleanTerm()
  {
    BooleanTermImpl booleanTerm = new BooleanTermImpl();
    return booleanTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CollectionTerm createCollectionTerm()
  {
    CollectionTermImpl collectionTerm = new CollectionTermImpl();
    return collectionTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Set_comprehension createSet_comprehension()
  {
    Set_comprehensionImpl set_comprehension = new Set_comprehensionImpl();
    return set_comprehension;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Query_element_set createQuery_element_set()
  {
    Query_element_setImpl query_element_set = new Query_element_setImpl();
    return query_element_set;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Element_types createElement_types()
  {
    Element_typesImpl element_types = new Element_typesImpl();
    return element_types;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MCSAnnexSubclause createMCSAnnexSubclause()
  {
    MCSAnnexSubclauseImpl mcsAnnexSubclause = new MCSAnnexSubclauseImpl();
    return mcsAnnexSubclause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassifierEnforce createClassifierEnforce()
  {
    ClassifierEnforceImpl classifierEnforce = new ClassifierEnforceImpl();
    return classifierEnforce;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassifierScript createClassifierScript()
  {
    ClassifierScriptImpl classifierScript = new ClassifierScriptImpl();
    return classifierScript;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function_declaration createFunction_declaration()
  {
    Function_declarationImpl function_declaration = new Function_declarationImpl();
    return function_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Argument createArgument()
  {
    ArgumentImpl argument = new ArgumentImpl();
    return argument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Theorem_declaration createTheorem_declaration()
  {
    Theorem_declarationImpl theorem_declaration = new Theorem_declarationImpl();
    return theorem_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public In_modes_list createIn_modes_list()
  {
    In_modes_listImpl in_modes_list = new In_modes_listImpl();
    return in_modes_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Local_declaration createLocal_declaration()
  {
    Local_declarationImpl local_declaration = new Local_declarationImpl();
    return local_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Theorem_statement createTheorem_statement()
  {
    Theorem_statementImpl theorem_statement = new Theorem_statementImpl();
    return theorem_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Basic_statement createBasic_statement()
  {
    Basic_statementImpl basic_statement = new Basic_statementImpl();
    return basic_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Iteration createIteration()
  {
    IterationImpl iteration = new IterationImpl();
    return iteration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type_expression createType_expression()
  {
    Type_expressionImpl type_expression = new Type_expressionImpl();
    return type_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Basic_type createBasic_type()
  {
    Basic_typeImpl basic_type = new Basic_typeImpl();
    return basic_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnnamedFunctionType createUnnamedFunctionType()
  {
    UnnamedFunctionTypeImpl unnamedFunctionType = new UnnamedFunctionTypeImpl();
    return unnamedFunctionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Composite_type createComposite_type()
  {
    Composite_typeImpl composite_type = new Composite_typeImpl();
    return composite_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Set_type createSet_type()
  {
    Set_typeImpl set_type = new Set_typeImpl();
    return set_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List_type createList_type()
  {
    List_typeImpl list_type = new List_typeImpl();
    return list_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Map_type createMap_type()
  {
    Map_typeImpl map_type = new Map_typeImpl();
    return map_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Record_type createRecord_type()
  {
    Record_typeImpl record_type = new Record_typeImpl();
    return record_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Union_type createUnion_type()
  {
    Union_typeImpl union_type = new Union_typeImpl();
    return union_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Id_type_pair createId_type_pair()
  {
    Id_type_pairImpl id_type_pair = new Id_type_pairImpl();
    return id_type_pair;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Element_type createElement_type()
  {
    Element_typeImpl element_type = new Element_typeImpl();
    return element_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public t_classifiers createt_classifiers()
  {
    t_classifiersImpl t_classifiers = new t_classifiersImpl();
    return t_classifiers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public t_classifier_subtypes createt_classifier_subtypes()
  {
    t_classifier_subtypesImpl t_classifier_subtypes = new t_classifier_subtypesImpl();
    return t_classifier_subtypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public t_named_references createt_named_references()
  {
    t_named_referencesImpl t_named_references = new t_named_referencesImpl();
    return t_named_references;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public t_named_reference_subtypes createt_named_reference_subtypes()
  {
    t_named_reference_subtypesImpl t_named_reference_subtypes = new t_named_reference_subtypesImpl();
    return t_named_reference_subtypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public t_subcomponent_subtypes createt_subcomponent_subtypes()
  {
    t_subcomponent_subtypesImpl t_subcomponent_subtypes = new t_subcomponent_subtypesImpl();
    return t_subcomponent_subtypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public t_component_impl_subtypes createt_component_impl_subtypes()
  {
    t_component_impl_subtypesImpl t_component_impl_subtypes = new t_component_impl_subtypesImpl();
    return t_component_impl_subtypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public t_connection_subtypes createt_connection_subtypes()
  {
    t_connection_subtypesImpl t_connection_subtypes = new t_connection_subtypesImpl();
    return t_connection_subtypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public t_feature_subtypes createt_feature_subtypes()
  {
    t_feature_subtypesImpl t_feature_subtypes = new t_feature_subtypesImpl();
    return t_feature_subtypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public t_access_subtypes createt_access_subtypes()
  {
    t_access_subtypesImpl t_access_subtypes = new t_access_subtypesImpl();
    return t_access_subtypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public t_port_subtypes createt_port_subtypes()
  {
    t_port_subtypesImpl t_port_subtypes = new t_port_subtypesImpl();
    return t_port_subtypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public t_flow_spec_subtypes createt_flow_spec_subtypes()
  {
    t_flow_spec_subtypesImpl t_flow_spec_subtypes = new t_flow_spec_subtypesImpl();
    return t_flow_spec_subtypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public t_flow_impl_subtypes createt_flow_impl_subtypes()
  {
    t_flow_impl_subtypesImpl t_flow_impl_subtypes = new t_flow_impl_subtypesImpl();
    return t_flow_impl_subtypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MCSClosure createMCSClosure()
  {
    MCSClosureImpl mcsClosure = new MCSClosureImpl();
    return mcsClosure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public McsPackage getMcsPackage()
  {
    return (McsPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static McsPackage getPackage()
  {
    return McsPackage.eINSTANCE;
  }

} //McsFactoryImpl
