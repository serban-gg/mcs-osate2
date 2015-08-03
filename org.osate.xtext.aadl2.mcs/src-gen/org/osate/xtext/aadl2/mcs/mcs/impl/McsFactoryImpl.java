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
      case McsPackage.TYPE_DECLARATION: return createtype_declaration();
      case McsPackage.CONSTANT_DECLARATION: return createconstant_declaration();
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
      case McsPackage.ELEMENT_REFERENCE: return createelement_reference();
      case McsPackage.CONTAINMENT_PATH_ELEMENT: return createContainmentPathElement();
      case McsPackage.ARRAY_RANGE: return createArrayRange();
      case McsPackage.PACKAGE_ENFORCE: return createPackageEnforce();
      case McsPackage.ASSERTION_EXPRESSION: return createassertion_expression();
      case McsPackage.STRING_EXPRESSION: return createstring_expression();
      case McsPackage.CONSTANT_EXPRESSION: return createconstant_expression();
      case McsPackage.EXPRESSION: return createexpression();
      case McsPackage.MCS_ANNEX_SUBCLAUSE: return createMCSAnnexSubclause();
      case McsPackage.CLASSIFIER_ENFORCE: return createClassifierEnforce();
      case McsPackage.CLASSIFIER_SCRIPT: return createClassifierScript();
      case McsPackage.FUNCTION_DECLARATION: return createfunction_declaration();
      case McsPackage.ARGUMENT: return createargument();
      case McsPackage.THEOREM_DECLARATION: return createtheorem_declaration();
      case McsPackage.IN_MODES_LIST: return createin_modes_list();
      case McsPackage.LOCAL_DECLARATION: return createlocal_declaration();
      case McsPackage.THEOREM_STATEMENT: return createtheorem_statement();
      case McsPackage.TYPE_EXPRESSION: return createtype_expression();
      case McsPackage.BASIC_TYPE: return createbasic_type();
      case McsPackage.UNNAMED_FUNCTION_TYPE: return createUnnamedFunctionType();
      case McsPackage.COMPOSITE_TYPE: return createcomposite_type();
      case McsPackage.SET_TYPE: return createset_type();
      case McsPackage.LIST_TYPE: return createlist_type();
      case McsPackage.MAP_TYPE: return createmap_type();
      case McsPackage.RECORD_TYPE: return createrecord_type();
      case McsPackage.UNION_TYPE: return createunion_type();
      case McsPackage.ID_TYPE_PAIR: return createid_type_pair();
      case McsPackage.ELEMENT_TYPE: return createelement_type();
      case McsPackage.TCLASSIFIERS: return createt_classifiers();
      case McsPackage.TCLASSIFIER_SUBTYPES: return createt_classifier_subtypes();
      case McsPackage.TNAMED_REFERENCES: return createt_named_references();
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
  public type_declaration createtype_declaration()
  {
    type_declarationImpl type_declaration = new type_declarationImpl();
    return type_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public constant_declaration createconstant_declaration()
  {
    constant_declarationImpl constant_declaration = new constant_declarationImpl();
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
  public function_declaration createfunction_declaration()
  {
    function_declarationImpl function_declaration = new function_declarationImpl();
    return function_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public argument createargument()
  {
    argumentImpl argument = new argumentImpl();
    return argument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public theorem_declaration createtheorem_declaration()
  {
    theorem_declarationImpl theorem_declaration = new theorem_declarationImpl();
    return theorem_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public in_modes_list createin_modes_list()
  {
    in_modes_listImpl in_modes_list = new in_modes_listImpl();
    return in_modes_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public local_declaration createlocal_declaration()
  {
    local_declarationImpl local_declaration = new local_declarationImpl();
    return local_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public theorem_statement createtheorem_statement()
  {
    theorem_statementImpl theorem_statement = new theorem_statementImpl();
    return theorem_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type_expression createtype_expression()
  {
    type_expressionImpl type_expression = new type_expressionImpl();
    return type_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public basic_type createbasic_type()
  {
    basic_typeImpl basic_type = new basic_typeImpl();
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
  public composite_type createcomposite_type()
  {
    composite_typeImpl composite_type = new composite_typeImpl();
    return composite_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public set_type createset_type()
  {
    set_typeImpl set_type = new set_typeImpl();
    return set_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public list_type createlist_type()
  {
    list_typeImpl list_type = new list_typeImpl();
    return list_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public map_type createmap_type()
  {
    map_typeImpl map_type = new map_typeImpl();
    return map_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public record_type createrecord_type()
  {
    record_typeImpl record_type = new record_typeImpl();
    return record_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public union_type createunion_type()
  {
    union_typeImpl union_type = new union_typeImpl();
    return union_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public id_type_pair createid_type_pair()
  {
    id_type_pairImpl id_type_pair = new id_type_pairImpl();
    return id_type_pair;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public element_type createelement_type()
  {
    element_typeImpl element_type = new element_typeImpl();
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
