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
      case McsPackage.MCS_FILE_LIBRARY: return createMCSFileLibrary();
      case McsPackage.MCS_ANNEX_SUBCLAUSE: return createMCSAnnexSubclause();
      case McsPackage.CONSTANT: return createConstant();
      case McsPackage.FOR_T: return createF_or_T();
      case McsPackage.THEOREM_ROOT: return createTheorem_root();
      case McsPackage.DEFINITION_BODY: return createDefinitionBody();
      case McsPackage.ARG: return createArg();
      case McsPackage.PARM_STRING: return createParm_string();
      case McsPackage.CLAIM_TEXT_VAR: return createClaimTextVar();
      case McsPackage.THEOREM_CALL: return createTheoremCall();
      case McsPackage.CLASSIFIER_LITERAL: return createClassifier_literal();
      case McsPackage.REFERENCE_TERM: return createReferenceTerm();
      case McsPackage.MCS_NAME: return createMcs_name();
      case McsPackage.MCS_NAME_REF: return createMcs_name_ref();
      case McsPackage.LET_BINDING: return createLet_binding();
      case McsPackage.EXPR: return createExpr();
      case McsPackage.DOMAIN: return createDomain();
      case McsPackage.TYPE_EXPRESSION: return createType_expression();
      case McsPackage.BASIC_TYPE: return createBasic_type();
      case McsPackage.COMPOSITE_TYPE: return createComposite_type();
      case McsPackage.MAPPING_TYPE: return createMapping_type();
      case McsPackage.SET_TYPE: return createSet_type();
      case McsPackage.LIST_TYPE: return createList_type();
      case McsPackage.RECORD_TYPE: return createRecord_type();
      case McsPackage.UNION_TYPE: return createUnion_type();
      case McsPackage.ID_TYPE_PAIR: return createId_type_pair();
      case McsPackage.ELEMENT_TYPE: return createElement_type();
      case McsPackage.CLASSIFIERS: return createClassifiers();
      case McsPackage.TCLASSIFIER_SUBTYPES: return createT_classifier_subtypes();
      case McsPackage.INSTANCES: return createInstances();
      case McsPackage.TINSTANCE_SUBTYPES: return createt_instance_subtypes();
      case McsPackage.TSUBCOMPONENT_SUBTYPES: return createt_subcomponent_subtypes();
      case McsPackage.TCOMPONENT_SUBTYPES: return createt_component_subtypes();
      case McsPackage.TCONNECTION_SUBTYPES: return createt_connection_subtypes();
      case McsPackage.TFEATURE_SUBTYPES: return createt_feature_subtypes();
      case McsPackage.TACCESS_SUBTYPES: return createt_access_subtypes();
      case McsPackage.TPORT_SUBTYPES: return createt_port_subtypes();
      case McsPackage.TFLOW_SPEC_SUBTYPES: return createt_flow_spec_subtypes();
      case McsPackage.TFLOW_IMPL_SUBTYPES: return createt_flow_impl_subtypes();
      case McsPackage.FUNCTION_BODY: return createFunctionBody();
      case McsPackage.CLAIM_BODY: return createClaimBody();
      case McsPackage.CLAIM_STRING: return createClaimString();
      case McsPackage.CLAIM_ARG: return createClaimArg();
      case McsPackage.BINARY_EXPR: return createBinaryExpr();
      case McsPackage.INSTANCE_OF_EXPR: return createInstanceOfExpr();
      case McsPackage.UNARY_EXPR: return createUnaryExpr();
      case McsPackage.POST_CAST_EXPR: return createPostCastExpr();
      case McsPackage.MCS_NAME_EXPR: return createMCSNameExpr();
      case McsPackage.PKG_EXPR: return createPkgExpr();
      case McsPackage.COMP_EXPR: return createCompExpr();
      case McsPackage.REF_EXPR: return createRefExpr();
      case McsPackage.THIS_EXPR: return createThisExpr();
      case McsPackage.INT_EXPR: return createIntExpr();
      case McsPackage.REAL_EXPR: return createRealExpr();
      case McsPackage.BOOL_EXPR: return createBoolExpr();
      case McsPackage.STRING_EXPR: return createStringExpr();
      case McsPackage.RANGE: return createRange();
      case McsPackage.IF_THEN_ELSE_EXPR: return createIfThenElseExpr();
      case McsPackage.QUANTIFIED_EXPR: return createQuantifiedExpr();
      case McsPackage.BUILT_IN_FN_CALL_EXPR: return createBuiltInFnCallExpr();
      case McsPackage.BUILT_PROPERTY_EXISTS: return createBuiltPropertyExists();
      case McsPackage.BUILT_PROPERTY_VAL: return createBuiltPropertyVal();
      case McsPackage.FN_CALL_EXPR: return createFnCallExpr();
      case McsPackage.FILTER_MAP_EXPR: return createFilterMapExpr();
      case McsPackage.SET_EXPR: return createSetExpr();
      case McsPackage.EMPTY: return createEmpty();
      case McsPackage.LET_EXPR: return createLetExpr();
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
  public MCSFileLibrary createMCSFileLibrary()
  {
    MCSFileLibraryImpl mcsFileLibrary = new MCSFileLibraryImpl();
    return mcsFileLibrary;
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
  public Constant createConstant()
  {
    ConstantImpl constant = new ConstantImpl();
    return constant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public F_or_T createF_or_T()
  {
    F_or_TImpl f_or_T = new F_or_TImpl();
    return f_or_T;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Theorem_root createTheorem_root()
  {
    Theorem_rootImpl theorem_root = new Theorem_rootImpl();
    return theorem_root;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefinitionBody createDefinitionBody()
  {
    DefinitionBodyImpl definitionBody = new DefinitionBodyImpl();
    return definitionBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Arg createArg()
  {
    ArgImpl arg = new ArgImpl();
    return arg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parm_string createParm_string()
  {
    Parm_stringImpl parm_string = new Parm_stringImpl();
    return parm_string;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClaimTextVar createClaimTextVar()
  {
    ClaimTextVarImpl claimTextVar = new ClaimTextVarImpl();
    return claimTextVar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TheoremCall createTheoremCall()
  {
    TheoremCallImpl theoremCall = new TheoremCallImpl();
    return theoremCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Classifier_literal createClassifier_literal()
  {
    Classifier_literalImpl classifier_literal = new Classifier_literalImpl();
    return classifier_literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferenceTerm createReferenceTerm()
  {
    ReferenceTermImpl referenceTerm = new ReferenceTermImpl();
    return referenceTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mcs_name createMcs_name()
  {
    Mcs_nameImpl mcs_name = new Mcs_nameImpl();
    return mcs_name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mcs_name_ref createMcs_name_ref()
  {
    Mcs_name_refImpl mcs_name_ref = new Mcs_name_refImpl();
    return mcs_name_ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Let_binding createLet_binding()
  {
    Let_bindingImpl let_binding = new Let_bindingImpl();
    return let_binding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr createExpr()
  {
    ExprImpl expr = new ExprImpl();
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Domain createDomain()
  {
    DomainImpl domain = new DomainImpl();
    return domain;
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
  public Mapping_type createMapping_type()
  {
    Mapping_typeImpl mapping_type = new Mapping_typeImpl();
    return mapping_type;
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
  public Classifiers createClassifiers()
  {
    ClassifiersImpl classifiers = new ClassifiersImpl();
    return classifiers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public T_classifier_subtypes createT_classifier_subtypes()
  {
    T_classifier_subtypesImpl t_classifier_subtypes = new T_classifier_subtypesImpl();
    return t_classifier_subtypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instances createInstances()
  {
    InstancesImpl instances = new InstancesImpl();
    return instances;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public t_instance_subtypes createt_instance_subtypes()
  {
    t_instance_subtypesImpl t_instance_subtypes = new t_instance_subtypesImpl();
    return t_instance_subtypes;
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
  public t_component_subtypes createt_component_subtypes()
  {
    t_component_subtypesImpl t_component_subtypes = new t_component_subtypesImpl();
    return t_component_subtypes;
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
  public FunctionBody createFunctionBody()
  {
    FunctionBodyImpl functionBody = new FunctionBodyImpl();
    return functionBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClaimBody createClaimBody()
  {
    ClaimBodyImpl claimBody = new ClaimBodyImpl();
    return claimBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClaimString createClaimString()
  {
    ClaimStringImpl claimString = new ClaimStringImpl();
    return claimString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClaimArg createClaimArg()
  {
    ClaimArgImpl claimArg = new ClaimArgImpl();
    return claimArg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryExpr createBinaryExpr()
  {
    BinaryExprImpl binaryExpr = new BinaryExprImpl();
    return binaryExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstanceOfExpr createInstanceOfExpr()
  {
    InstanceOfExprImpl instanceOfExpr = new InstanceOfExprImpl();
    return instanceOfExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryExpr createUnaryExpr()
  {
    UnaryExprImpl unaryExpr = new UnaryExprImpl();
    return unaryExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PostCastExpr createPostCastExpr()
  {
    PostCastExprImpl postCastExpr = new PostCastExprImpl();
    return postCastExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MCSNameExpr createMCSNameExpr()
  {
    MCSNameExprImpl mcsNameExpr = new MCSNameExprImpl();
    return mcsNameExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PkgExpr createPkgExpr()
  {
    PkgExprImpl pkgExpr = new PkgExprImpl();
    return pkgExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompExpr createCompExpr()
  {
    CompExprImpl compExpr = new CompExprImpl();
    return compExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefExpr createRefExpr()
  {
    RefExprImpl refExpr = new RefExprImpl();
    return refExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ThisExpr createThisExpr()
  {
    ThisExprImpl thisExpr = new ThisExprImpl();
    return thisExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntExpr createIntExpr()
  {
    IntExprImpl intExpr = new IntExprImpl();
    return intExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RealExpr createRealExpr()
  {
    RealExprImpl realExpr = new RealExprImpl();
    return realExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoolExpr createBoolExpr()
  {
    BoolExprImpl boolExpr = new BoolExprImpl();
    return boolExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringExpr createStringExpr()
  {
    StringExprImpl stringExpr = new StringExprImpl();
    return stringExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Range createRange()
  {
    RangeImpl range = new RangeImpl();
    return range;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfThenElseExpr createIfThenElseExpr()
  {
    IfThenElseExprImpl ifThenElseExpr = new IfThenElseExprImpl();
    return ifThenElseExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuantifiedExpr createQuantifiedExpr()
  {
    QuantifiedExprImpl quantifiedExpr = new QuantifiedExprImpl();
    return quantifiedExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BuiltInFnCallExpr createBuiltInFnCallExpr()
  {
    BuiltInFnCallExprImpl builtInFnCallExpr = new BuiltInFnCallExprImpl();
    return builtInFnCallExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BuiltPropertyExists createBuiltPropertyExists()
  {
    BuiltPropertyExistsImpl builtPropertyExists = new BuiltPropertyExistsImpl();
    return builtPropertyExists;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BuiltPropertyVal createBuiltPropertyVal()
  {
    BuiltPropertyValImpl builtPropertyVal = new BuiltPropertyValImpl();
    return builtPropertyVal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FnCallExpr createFnCallExpr()
  {
    FnCallExprImpl fnCallExpr = new FnCallExprImpl();
    return fnCallExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FilterMapExpr createFilterMapExpr()
  {
    FilterMapExprImpl filterMapExpr = new FilterMapExprImpl();
    return filterMapExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetExpr createSetExpr()
  {
    SetExprImpl setExpr = new SetExprImpl();
    return setExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Empty createEmpty()
  {
    EmptyImpl empty = new EmptyImpl();
    return empty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LetExpr createLetExpr()
  {
    LetExprImpl letExpr = new LetExprImpl();
    return letExpr;
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
