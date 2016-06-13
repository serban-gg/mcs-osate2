/**
 */
package org.osate.xtext.aadl2.mcs.mcs.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.osate.aadl2.Aadl2Package;

import org.osate.xtext.aadl2.mcs.mcs.Basic_type;
import org.osate.xtext.aadl2.mcs.mcs.BinaryExpr;
import org.osate.xtext.aadl2.mcs.mcs.BoolExpr;
import org.osate.xtext.aadl2.mcs.mcs.BuiltInFnCall;
import org.osate.xtext.aadl2.mcs.mcs.BuiltInFnCallExpr;
import org.osate.xtext.aadl2.mcs.mcs.ClaimArg;
import org.osate.xtext.aadl2.mcs.mcs.ClaimBody;
import org.osate.xtext.aadl2.mcs.mcs.ClaimString;
import org.osate.xtext.aadl2.mcs.mcs.Classifier_literal;
import org.osate.xtext.aadl2.mcs.mcs.Classifiers;
import org.osate.xtext.aadl2.mcs.mcs.CompExpr;
import org.osate.xtext.aadl2.mcs.mcs.Composite_type;
import org.osate.xtext.aadl2.mcs.mcs.Constant_declaration;
import org.osate.xtext.aadl2.mcs.mcs.DefinitionBody;
import org.osate.xtext.aadl2.mcs.mcs.Domain;
import org.osate.xtext.aadl2.mcs.mcs.Element_type;
import org.osate.xtext.aadl2.mcs.mcs.Empty;
import org.osate.xtext.aadl2.mcs.mcs.Expr;
import org.osate.xtext.aadl2.mcs.mcs.F_or_T;
import org.osate.xtext.aadl2.mcs.mcs.FilterMapExpr;
import org.osate.xtext.aadl2.mcs.mcs.FnCall;
import org.osate.xtext.aadl2.mcs.mcs.FnCallExpr;
import org.osate.xtext.aadl2.mcs.mcs.FunctionBody;
import org.osate.xtext.aadl2.mcs.mcs.Id_type_pair;
import org.osate.xtext.aadl2.mcs.mcs.IfThenElseExpr;
import org.osate.xtext.aadl2.mcs.mcs.InstanceOfExpr;
import org.osate.xtext.aadl2.mcs.mcs.Instances;
import org.osate.xtext.aadl2.mcs.mcs.IntExpr;
import org.osate.xtext.aadl2.mcs.mcs.LetExpr;
import org.osate.xtext.aadl2.mcs.mcs.Let_binding;
import org.osate.xtext.aadl2.mcs.mcs.List_type;
import org.osate.xtext.aadl2.mcs.mcs.MCSAnnexLibrary;
import org.osate.xtext.aadl2.mcs.mcs.MCSAnnexSubclause;
import org.osate.xtext.aadl2.mcs.mcs.MCSFileLibrary;
import org.osate.xtext.aadl2.mcs.mcs.MCSGrammarRoot;
import org.osate.xtext.aadl2.mcs.mcs.MCSNameExpr;
import org.osate.xtext.aadl2.mcs.mcs.Mapping_type;
import org.osate.xtext.aadl2.mcs.mcs.McsFactory;
import org.osate.xtext.aadl2.mcs.mcs.McsName;
import org.osate.xtext.aadl2.mcs.mcs.McsPackage;
import org.osate.xtext.aadl2.mcs.mcs.McsTypedName;
import org.osate.xtext.aadl2.mcs.mcs.Mcs_name_ref;
import org.osate.xtext.aadl2.mcs.mcs.Parameter;
import org.osate.xtext.aadl2.mcs.mcs.ParameterizedString;
import org.osate.xtext.aadl2.mcs.mcs.PkgExpr;
import org.osate.xtext.aadl2.mcs.mcs.PostCastExpr;
import org.osate.xtext.aadl2.mcs.mcs.QuantifiedExpr;
import org.osate.xtext.aadl2.mcs.mcs.Range;
import org.osate.xtext.aadl2.mcs.mcs.RealExpr;
import org.osate.xtext.aadl2.mcs.mcs.Record_type;
import org.osate.xtext.aadl2.mcs.mcs.RefExpr;
import org.osate.xtext.aadl2.mcs.mcs.RefTerm;
import org.osate.xtext.aadl2.mcs.mcs.SetExpr;
import org.osate.xtext.aadl2.mcs.mcs.Set_type;
import org.osate.xtext.aadl2.mcs.mcs.StringExpr;
import org.osate.xtext.aadl2.mcs.mcs.T_classifier_subtypes;
import org.osate.xtext.aadl2.mcs.mcs.TextParm;
import org.osate.xtext.aadl2.mcs.mcs.TheoremCall;
import org.osate.xtext.aadl2.mcs.mcs.Theorem_root;
import org.osate.xtext.aadl2.mcs.mcs.ThisExpr;
import org.osate.xtext.aadl2.mcs.mcs.Type_declaration;
import org.osate.xtext.aadl2.mcs.mcs.Type_expression;
import org.osate.xtext.aadl2.mcs.mcs.UnaryExpr;
import org.osate.xtext.aadl2.mcs.mcs.Union_type;
import org.osate.xtext.aadl2.mcs.mcs.t_access_subtypes;
import org.osate.xtext.aadl2.mcs.mcs.t_component_subtypes;
import org.osate.xtext.aadl2.mcs.mcs.t_connection_subtypes;
import org.osate.xtext.aadl2.mcs.mcs.t_feature_subtypes;
import org.osate.xtext.aadl2.mcs.mcs.t_flow_impl_subtypes;
import org.osate.xtext.aadl2.mcs.mcs.t_flow_spec_subtypes;
import org.osate.xtext.aadl2.mcs.mcs.t_instance_subtypes;
import org.osate.xtext.aadl2.mcs.mcs.t_port_subtypes;
import org.osate.xtext.aadl2.mcs.mcs.t_subcomponent_subtypes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class McsPackageImpl extends EPackageImpl implements McsPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mcsGrammarRootEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mcsAnnexLibraryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mcsFileLibraryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mcsAnnexSubclauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass type_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constant_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass f_or_TEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass theorem_rootEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass definitionBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterizedStringEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass textParmEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mcsNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mcsTypedNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass theoremCallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classifier_literalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass refTermEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mcs_name_refEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass builtInFnCallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fnCallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass let_bindingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass domainEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass type_expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass basic_typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass composite_typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mapping_typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass set_typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass list_typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass record_typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass union_typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass id_type_pairEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass element_typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classifiersEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass t_classifier_subtypesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instancesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass t_instance_subtypesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass t_subcomponent_subtypesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass t_component_subtypesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass t_connection_subtypesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass t_feature_subtypesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass t_access_subtypesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass t_port_subtypesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass t_flow_spec_subtypesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass t_flow_impl_subtypesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass claimBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass claimStringEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass claimArgEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass binaryExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instanceOfExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unaryExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass postCastExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mcsNameExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pkgExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass refExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass thisExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass realExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass boolExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rangeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifThenElseExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass quantifiedExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass builtInFnCallExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fnCallExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass filterMapExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass setExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass emptyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass letExprEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private McsPackageImpl()
  {
    super(eNS_URI, McsFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link McsPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static McsPackage init()
  {
    if (isInited) return (McsPackage)EPackage.Registry.INSTANCE.getEPackage(McsPackage.eNS_URI);

    // Obtain or create and register package
    McsPackageImpl theMcsPackage = (McsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof McsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new McsPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    EcorePackage.eINSTANCE.eClass();
    Aadl2Package.eINSTANCE.eClass();

    // Create package meta-data objects
    theMcsPackage.createPackageContents();

    // Initialize created meta-data
    theMcsPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMcsPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(McsPackage.eNS_URI, theMcsPackage);
    return theMcsPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMCSGrammarRoot()
  {
    return mcsGrammarRootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMCSGrammarRoot_Lib()
  {
    return (EReference)mcsGrammarRootEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMCSGrammarRoot_File()
  {
    return (EReference)mcsGrammarRootEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMCSGrammarRoot_Subclause()
  {
    return (EReference)mcsGrammarRootEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMCSAnnexLibrary()
  {
    return mcsAnnexLibraryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMCSAnnexLibrary_Types()
  {
    return (EReference)mcsAnnexLibraryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMCSAnnexLibrary_Constants()
  {
    return (EReference)mcsAnnexLibraryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMCSAnnexLibrary_Functions()
  {
    return (EReference)mcsAnnexLibraryEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMCSAnnexLibrary_Theorems()
  {
    return (EReference)mcsAnnexLibraryEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMCSFileLibrary()
  {
    return mcsFileLibraryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMCSFileLibrary_ImportedUnit()
  {
    return (EReference)mcsFileLibraryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMCSFileLibrary_Files()
  {
    return (EAttribute)mcsFileLibraryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMCSFileLibrary_Types()
  {
    return (EReference)mcsFileLibraryEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMCSFileLibrary_Constants()
  {
    return (EReference)mcsFileLibraryEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMCSFileLibrary_Functions()
  {
    return (EReference)mcsFileLibraryEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMCSFileLibrary_Theorems()
  {
    return (EReference)mcsFileLibraryEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMCSFileLibrary_Calls()
  {
    return (EReference)mcsFileLibraryEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMCSAnnexSubclause()
  {
    return mcsAnnexSubclauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMCSAnnexSubclause_Calls()
  {
    return (EReference)mcsAnnexSubclauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getType_declaration()
  {
    return type_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getType_declaration_Name()
  {
    return (EAttribute)type_declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_declaration_Type()
  {
    return (EReference)type_declarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstant_declaration()
  {
    return constant_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstant_declaration_Const()
  {
    return (EReference)constant_declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstant_declaration_Left_expr()
  {
    return (EReference)constant_declarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getF_or_T()
  {
    return f_or_TEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getF_or_T_Name()
  {
    return (EAttribute)f_or_TEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getF_or_T_T_root()
  {
    return (EAttribute)f_or_TEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getF_or_T_Args()
  {
    return (EReference)f_or_TEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getF_or_T_Body()
  {
    return (EReference)f_or_TEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTheorem_root()
  {
    return theorem_rootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTheorem_root_Nilroot()
  {
    return (EAttribute)theorem_rootEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTheorem_root_Classifier()
  {
    return (EReference)theorem_rootEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefinitionBody()
  {
    return definitionBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDefinitionBody_Expr()
  {
    return (EReference)definitionBodyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterizedString()
  {
    return parameterizedStringEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterizedString_Claim()
  {
    return (EReference)parameterizedStringEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameter()
  {
    return parameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTextParm()
  {
    return textParmEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMcsName()
  {
    return mcsNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMcsName_Type()
  {
    return (EReference)mcsNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMcsTypedName()
  {
    return mcsTypedNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTheoremCall()
  {
    return theoremCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTheoremCall_Name()
  {
    return (EReference)theoremCallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTheoremCall_Croot()
  {
    return (EReference)theoremCallEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTheoremCall_Actarg()
  {
    return (EReference)theoremCallEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTheoremCall_Fn()
  {
    return (EReference)theoremCallEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassifier_literal()
  {
    return classifier_literalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassifier_literal_Classlit()
  {
    return (EReference)classifier_literalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassifier_literal_Arg()
  {
    return (EReference)classifier_literalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRefTerm()
  {
    return refTermEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRefTerm_Root()
  {
    return (EAttribute)refTermEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRefTerm_Path()
  {
    return (EReference)refTermEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMcs_name_ref()
  {
    return mcs_name_refEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMcs_name_ref_Ref()
  {
    return (EReference)mcs_name_refEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMcs_name_ref_Builtin()
  {
    return (EReference)mcs_name_refEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMcs_name_ref_Method()
  {
    return (EReference)mcs_name_refEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBuiltInFnCall()
  {
    return builtInFnCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBuiltInFnCall_Fn()
  {
    return (EAttribute)builtInFnCallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuiltInFnCall_Args()
  {
    return (EReference)builtInFnCallEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFnCall()
  {
    return fnCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFnCall_Fn()
  {
    return (EReference)fnCallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFnCall_Args()
  {
    return (EReference)fnCallEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLet_binding()
  {
    return let_bindingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLet_binding_Local()
  {
    return (EReference)let_bindingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLet_binding_Expr()
  {
    return (EReference)let_bindingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpr()
  {
    return exprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpr_List()
  {
    return (EAttribute)exprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpr_Exp()
  {
    return (EReference)exprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpr_Builtin()
  {
    return (EReference)exprEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpr_Method()
  {
    return (EReference)exprEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDomain()
  {
    return domainEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomain_Name()
  {
    return (EAttribute)domainEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomain_Expr()
  {
    return (EReference)domainEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getType_expression()
  {
    return type_expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_expression_Basic()
  {
    return (EReference)type_expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_expression_Composite()
  {
    return (EReference)type_expressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_expression_Element()
  {
    return (EReference)type_expressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBasic_type()
  {
    return basic_typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBasic_type_Ptype()
  {
    return (EAttribute)basic_typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBasic_type_Pref()
  {
    return (EAttribute)basic_typeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBasic_type_Bool()
  {
    return (EReference)basic_typeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBasic_type_String()
  {
    return (EReference)basic_typeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBasic_type_Enumer()
  {
    return (EReference)basic_typeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBasic_type_Units()
  {
    return (EReference)basic_typeEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBasic_type_Integer()
  {
    return (EReference)basic_typeEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBasic_type_Real()
  {
    return (EReference)basic_typeEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBasic_type_Range()
  {
    return (EReference)basic_typeEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBasic_type_Class()
  {
    return (EReference)basic_typeEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBasic_type_Ref()
  {
    return (EReference)basic_typeEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBasic_type_Typename()
  {
    return (EReference)basic_typeEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComposite_type()
  {
    return composite_typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMapping_type()
  {
    return mapping_typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMapping_type_Key()
  {
    return (EReference)mapping_typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMapping_type_Val()
  {
    return (EReference)mapping_typeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSet_type()
  {
    return set_typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSet_type_Root_type()
  {
    return (EReference)set_typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getList_type()
  {
    return list_typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getList_type_Root_type()
  {
    return (EReference)list_typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRecord_type()
  {
    return record_typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecord_type_Field()
  {
    return (EReference)record_typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnion_type()
  {
    return union_typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnion_type_Types()
  {
    return (EReference)union_typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnion_type_Type()
  {
    return (EReference)union_typeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getId_type_pair()
  {
    return id_type_pairEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getId_type_pair_Name()
  {
    return (EAttribute)id_type_pairEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getId_type_pair_Type()
  {
    return (EReference)id_type_pairEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElement_type()
  {
    return element_typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getElement_type_Telem()
  {
    return (EAttribute)element_typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getElement_type_Tpack()
  {
    return (EAttribute)element_typeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getElement_type_T_class()
  {
    return (EAttribute)element_typeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getElement_type_T_inst()
  {
    return (EAttribute)element_typeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassifiers()
  {
    return classifiersEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClassifiers_T_class()
  {
    return (EAttribute)classifiersEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClassifiers_T_class_subtype()
  {
    return (EAttribute)classifiersEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getT_classifier_subtypes()
  {
    return t_classifier_subtypesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getT_classifier_subtypes_T_ctype()
  {
    return (EAttribute)t_classifier_subtypesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getT_classifier_subtypes_T_cimpl()
  {
    return (EAttribute)t_classifier_subtypesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getT_classifier_subtypes_T_fgclass()
  {
    return (EAttribute)t_classifier_subtypesEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getT_classifier_subtypes_T_annexclass()
  {
    return (EAttribute)t_classifier_subtypesEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstances()
  {
    return instancesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstances_Inst()
  {
    return (EAttribute)instancesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstances_T_inst_st()
  {
    return (EAttribute)instancesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gett_instance_subtypes()
  {
    return t_instance_subtypesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_instance_subtypes_T_subc_st()
  {
    return (EAttribute)t_instance_subtypesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_instance_subtypes_T_sbcall()
  {
    return (EAttribute)t_instance_subtypesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_instance_subtypes_T_callseq()
  {
    return (EAttribute)t_instance_subtypesEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_instance_subtypes_T_eeflow()
  {
    return (EAttribute)t_instance_subtypesEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_instance_subtypes_T_proto()
  {
    return (EAttribute)t_instance_subtypesEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_instance_subtypes_T_mode()
  {
    return (EAttribute)t_instance_subtypesEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_instance_subtypes_T_mod_trans()
  {
    return (EAttribute)t_instance_subtypesEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_instance_subtypes_T_mode_trig()
  {
    return (EAttribute)t_instance_subtypesEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gett_subcomponent_subtypes()
  {
    return t_subcomponent_subtypesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_subcomponent_subtypes_T_sub()
  {
    return (EAttribute)t_subcomponent_subtypesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_subcomponent_subtypes_T_cimpl_st()
  {
    return (EAttribute)t_subcomponent_subtypesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gett_component_subtypes()
  {
    return t_component_subtypesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_component_subtypes_T_annex_sub()
  {
    return (EAttribute)t_component_subtypesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_component_subtypes_T_abstract()
  {
    return (EAttribute)t_component_subtypesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_component_subtypes_T_sys()
  {
    return (EAttribute)t_component_subtypesEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_component_subtypes_T_dev()
  {
    return (EAttribute)t_component_subtypesEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_component_subtypes_T_proc()
  {
    return (EAttribute)t_component_subtypesEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_component_subtypes_T_virt_proc()
  {
    return (EAttribute)t_component_subtypesEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_component_subtypes_T_bus()
  {
    return (EAttribute)t_component_subtypesEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_component_subtypes_T_vbus()
  {
    return (EAttribute)t_component_subtypesEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_component_subtypes_T_mem()
  {
    return (EAttribute)t_component_subtypesEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_component_subtypes_T_tg()
  {
    return (EAttribute)t_component_subtypesEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_component_subtypes_T_t()
  {
    return (EAttribute)t_component_subtypesEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_component_subtypes_T_d()
  {
    return (EAttribute)t_component_subtypesEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_component_subtypes_T_subprog()
  {
    return (EAttribute)t_component_subtypesEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_component_subtypes_T_subprog_g()
  {
    return (EAttribute)t_component_subtypesEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gett_connection_subtypes()
  {
    return t_connection_subtypesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_connection_subtypes_T_conn()
  {
    return (EAttribute)t_connection_subtypesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_connection_subtypes_T_feat_conn()
  {
    return (EAttribute)t_connection_subtypesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_connection_subtypes_T_port_conn()
  {
    return (EAttribute)t_connection_subtypesEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_connection_subtypes_T_parm_conn()
  {
    return (EAttribute)t_connection_subtypesEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_connection_subtypes_T_acc_con()
  {
    return (EAttribute)t_connection_subtypesEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_connection_subtypes_T_fg_conn()
  {
    return (EAttribute)t_connection_subtypesEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gett_feature_subtypes()
  {
    return t_feature_subtypesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_feature_subtypes_T_feat()
  {
    return (EAttribute)t_feature_subtypesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_feature_subtypes_T_abs_feat()
  {
    return (EAttribute)t_feature_subtypesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_feature_subtypes_T_parm()
  {
    return (EAttribute)t_feature_subtypesEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_feature_subtypes_T_fg()
  {
    return (EAttribute)t_feature_subtypesEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gett_access_subtypes()
  {
    return t_access_subtypesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_access_subtypes_T_access()
  {
    return (EAttribute)t_access_subtypesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_access_subtypes_T_data_acc()
  {
    return (EAttribute)t_access_subtypesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_access_subtypes_T_sub_acc()
  {
    return (EAttribute)t_access_subtypesEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_access_subtypes_T_sub_gr_acc()
  {
    return (EAttribute)t_access_subtypesEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_access_subtypes_T_bus_acc()
  {
    return (EAttribute)t_access_subtypesEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gett_port_subtypes()
  {
    return t_port_subtypesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_port_subtypes_T_port()
  {
    return (EAttribute)t_port_subtypesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_port_subtypes_T_d_port()
  {
    return (EAttribute)t_port_subtypesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_port_subtypes_T_ev_port()
  {
    return (EAttribute)t_port_subtypesEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_port_subtypes_T_evd_port()
  {
    return (EAttribute)t_port_subtypesEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gett_flow_spec_subtypes()
  {
    return t_flow_spec_subtypesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_flow_spec_subtypes_T_f_spec()
  {
    return (EAttribute)t_flow_spec_subtypesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_flow_spec_subtypes_T_f_spec_source()
  {
    return (EAttribute)t_flow_spec_subtypesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_flow_spec_subtypes_T_f_spec_sink()
  {
    return (EAttribute)t_flow_spec_subtypesEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_flow_spec_subtypes_T_f_spec_path()
  {
    return (EAttribute)t_flow_spec_subtypesEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gett_flow_impl_subtypes()
  {
    return t_flow_impl_subtypesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_flow_impl_subtypes_T_f_i()
  {
    return (EAttribute)t_flow_impl_subtypesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_flow_impl_subtypes_T_f_i_source()
  {
    return (EAttribute)t_flow_impl_subtypesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_flow_impl_subtypes_T_f_i_sink()
  {
    return (EAttribute)t_flow_impl_subtypesEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_flow_impl_subtypes_T_f_i_path()
  {
    return (EAttribute)t_flow_impl_subtypesEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionBody()
  {
    return functionBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionBody_Type()
  {
    return (EReference)functionBodyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClaimBody()
  {
    return claimBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClaimBody_String()
  {
    return (EReference)claimBodyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClaimString()
  {
    return claimStringEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClaimString_Str()
  {
    return (EReference)claimStringEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClaimArg()
  {
    return claimArgEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClaimArg_Arg()
  {
    return (EReference)claimArgEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClaimArg_Unit()
  {
    return (EReference)claimArgEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBinaryExpr()
  {
    return binaryExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryExpr_Left()
  {
    return (EReference)binaryExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBinaryExpr_Op()
  {
    return (EAttribute)binaryExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryExpr_Right()
  {
    return (EReference)binaryExprEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstanceOfExpr()
  {
    return instanceOfExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstanceOfExpr_Expr()
  {
    return (EReference)instanceOfExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstanceOfExpr_Type()
  {
    return (EReference)instanceOfExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnaryExpr()
  {
    return unaryExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnaryExpr_Op()
  {
    return (EAttribute)unaryExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryExpr_Expr()
  {
    return (EReference)unaryExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPostCastExpr()
  {
    return postCastExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPostCastExpr_Expr()
  {
    return (EReference)postCastExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPostCastExpr_Newtype()
  {
    return (EReference)postCastExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMCSNameExpr()
  {
    return mcsNameExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMCSNameExpr_Root()
  {
    return (EAttribute)mcsNameExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMCSNameExpr_Iroot()
  {
    return (EAttribute)mcsNameExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMCSNameExpr_Nil()
  {
    return (EAttribute)mcsNameExprEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMCSNameExpr_Empty()
  {
    return (EAttribute)mcsNameExprEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMCSNameExpr_Allmodes()
  {
    return (EAttribute)mcsNameExprEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMCSNameExpr_Typednameref()
  {
    return (EReference)mcsNameExprEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPkgExpr()
  {
    return pkgExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPkgExpr_Package()
  {
    return (EReference)pkgExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompExpr()
  {
    return compExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompExpr_Classifier()
  {
    return (EReference)compExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRefExpr()
  {
    return refExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRefExpr_Reference()
  {
    return (EReference)refExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getThisExpr()
  {
    return thisExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getThisExpr_Sub()
  {
    return (EReference)thisExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntExpr()
  {
    return intExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIntExpr_Val()
  {
    return (EReference)intExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRealExpr()
  {
    return realExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRealExpr_Val()
  {
    return (EReference)realExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBoolExpr()
  {
    return boolExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBoolExpr_Val()
  {
    return (EReference)boolExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringExpr()
  {
    return stringExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStringExpr_Val()
  {
    return (EReference)stringExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRange()
  {
    return rangeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRange_Val()
  {
    return (EReference)rangeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIfThenElseExpr()
  {
    return ifThenElseExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfThenElseExpr_Cond()
  {
    return (EReference)ifThenElseExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfThenElseExpr_Then()
  {
    return (EReference)ifThenElseExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfThenElseExpr_Else()
  {
    return (EReference)ifThenElseExprEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQuantifiedExpr()
  {
    return quantifiedExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuantifiedExpr_Quant()
  {
    return (EAttribute)quantifiedExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQuantifiedExpr_Args()
  {
    return (EReference)quantifiedExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQuantifiedExpr_Expr()
  {
    return (EReference)quantifiedExprEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBuiltInFnCallExpr()
  {
    return builtInFnCallExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFnCallExpr()
  {
    return fnCallExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFnCallExpr_Fn()
  {
    return (EReference)fnCallExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFilterMapExpr()
  {
    return filterMapExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFilterMapExpr_Map()
  {
    return (EReference)filterMapExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFilterMapExpr_Args()
  {
    return (EReference)filterMapExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFilterMapExpr_Filter()
  {
    return (EReference)filterMapExprEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSetExpr()
  {
    return setExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSetExpr_Exprs()
  {
    return (EReference)setExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEmpty()
  {
    return emptyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLetExpr()
  {
    return letExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLetExpr_Binding()
  {
    return (EReference)letExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLetExpr_Expr()
  {
    return (EReference)letExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public McsFactory getMcsFactory()
  {
    return (McsFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    mcsGrammarRootEClass = createEClass(MCS_GRAMMAR_ROOT);
    createEReference(mcsGrammarRootEClass, MCS_GRAMMAR_ROOT__LIB);
    createEReference(mcsGrammarRootEClass, MCS_GRAMMAR_ROOT__FILE);
    createEReference(mcsGrammarRootEClass, MCS_GRAMMAR_ROOT__SUBCLAUSE);

    mcsAnnexLibraryEClass = createEClass(MCS_ANNEX_LIBRARY);
    createEReference(mcsAnnexLibraryEClass, MCS_ANNEX_LIBRARY__TYPES);
    createEReference(mcsAnnexLibraryEClass, MCS_ANNEX_LIBRARY__CONSTANTS);
    createEReference(mcsAnnexLibraryEClass, MCS_ANNEX_LIBRARY__FUNCTIONS);
    createEReference(mcsAnnexLibraryEClass, MCS_ANNEX_LIBRARY__THEOREMS);

    mcsFileLibraryEClass = createEClass(MCS_FILE_LIBRARY);
    createEReference(mcsFileLibraryEClass, MCS_FILE_LIBRARY__IMPORTED_UNIT);
    createEAttribute(mcsFileLibraryEClass, MCS_FILE_LIBRARY__FILES);
    createEReference(mcsFileLibraryEClass, MCS_FILE_LIBRARY__TYPES);
    createEReference(mcsFileLibraryEClass, MCS_FILE_LIBRARY__CONSTANTS);
    createEReference(mcsFileLibraryEClass, MCS_FILE_LIBRARY__FUNCTIONS);
    createEReference(mcsFileLibraryEClass, MCS_FILE_LIBRARY__THEOREMS);
    createEReference(mcsFileLibraryEClass, MCS_FILE_LIBRARY__CALLS);

    mcsAnnexSubclauseEClass = createEClass(MCS_ANNEX_SUBCLAUSE);
    createEReference(mcsAnnexSubclauseEClass, MCS_ANNEX_SUBCLAUSE__CALLS);

    type_declarationEClass = createEClass(TYPE_DECLARATION);
    createEAttribute(type_declarationEClass, TYPE_DECLARATION__NAME);
    createEReference(type_declarationEClass, TYPE_DECLARATION__TYPE);

    constant_declarationEClass = createEClass(CONSTANT_DECLARATION);
    createEReference(constant_declarationEClass, CONSTANT_DECLARATION__CONST);
    createEReference(constant_declarationEClass, CONSTANT_DECLARATION__LEFT_EXPR);

    f_or_TEClass = createEClass(FOR_T);
    createEAttribute(f_or_TEClass, FOR_T__NAME);
    createEAttribute(f_or_TEClass, FOR_T__TROOT);
    createEReference(f_or_TEClass, FOR_T__ARGS);
    createEReference(f_or_TEClass, FOR_T__BODY);

    theorem_rootEClass = createEClass(THEOREM_ROOT);
    createEAttribute(theorem_rootEClass, THEOREM_ROOT__NILROOT);
    createEReference(theorem_rootEClass, THEOREM_ROOT__CLASSIFIER);

    definitionBodyEClass = createEClass(DEFINITION_BODY);
    createEReference(definitionBodyEClass, DEFINITION_BODY__EXPR);

    parameterizedStringEClass = createEClass(PARAMETERIZED_STRING);
    createEReference(parameterizedStringEClass, PARAMETERIZED_STRING__CLAIM);

    parameterEClass = createEClass(PARAMETER);

    textParmEClass = createEClass(TEXT_PARM);

    mcsNameEClass = createEClass(MCS_NAME);
    createEReference(mcsNameEClass, MCS_NAME__TYPE);

    mcsTypedNameEClass = createEClass(MCS_TYPED_NAME);

    theoremCallEClass = createEClass(THEOREM_CALL);
    createEReference(theoremCallEClass, THEOREM_CALL__NAME);
    createEReference(theoremCallEClass, THEOREM_CALL__CROOT);
    createEReference(theoremCallEClass, THEOREM_CALL__ACTARG);
    createEReference(theoremCallEClass, THEOREM_CALL__FN);

    classifier_literalEClass = createEClass(CLASSIFIER_LITERAL);
    createEReference(classifier_literalEClass, CLASSIFIER_LITERAL__CLASSLIT);
    createEReference(classifier_literalEClass, CLASSIFIER_LITERAL__ARG);

    refTermEClass = createEClass(REF_TERM);
    createEAttribute(refTermEClass, REF_TERM__ROOT);
    createEReference(refTermEClass, REF_TERM__PATH);

    mcs_name_refEClass = createEClass(MCS_NAME_REF);
    createEReference(mcs_name_refEClass, MCS_NAME_REF__REF);
    createEReference(mcs_name_refEClass, MCS_NAME_REF__BUILTIN);
    createEReference(mcs_name_refEClass, MCS_NAME_REF__METHOD);

    builtInFnCallEClass = createEClass(BUILT_IN_FN_CALL);
    createEAttribute(builtInFnCallEClass, BUILT_IN_FN_CALL__FN);
    createEReference(builtInFnCallEClass, BUILT_IN_FN_CALL__ARGS);

    fnCallEClass = createEClass(FN_CALL);
    createEReference(fnCallEClass, FN_CALL__FN);
    createEReference(fnCallEClass, FN_CALL__ARGS);

    let_bindingEClass = createEClass(LET_BINDING);
    createEReference(let_bindingEClass, LET_BINDING__LOCAL);
    createEReference(let_bindingEClass, LET_BINDING__EXPR);

    exprEClass = createEClass(EXPR);
    createEAttribute(exprEClass, EXPR__LIST);
    createEReference(exprEClass, EXPR__EXP);
    createEReference(exprEClass, EXPR__BUILTIN);
    createEReference(exprEClass, EXPR__METHOD);

    domainEClass = createEClass(DOMAIN);
    createEAttribute(domainEClass, DOMAIN__NAME);
    createEReference(domainEClass, DOMAIN__EXPR);

    type_expressionEClass = createEClass(TYPE_EXPRESSION);
    createEReference(type_expressionEClass, TYPE_EXPRESSION__BASIC);
    createEReference(type_expressionEClass, TYPE_EXPRESSION__COMPOSITE);
    createEReference(type_expressionEClass, TYPE_EXPRESSION__ELEMENT);

    basic_typeEClass = createEClass(BASIC_TYPE);
    createEAttribute(basic_typeEClass, BASIC_TYPE__PTYPE);
    createEAttribute(basic_typeEClass, BASIC_TYPE__PREF);
    createEReference(basic_typeEClass, BASIC_TYPE__BOOL);
    createEReference(basic_typeEClass, BASIC_TYPE__STRING);
    createEReference(basic_typeEClass, BASIC_TYPE__ENUMER);
    createEReference(basic_typeEClass, BASIC_TYPE__UNITS);
    createEReference(basic_typeEClass, BASIC_TYPE__INTEGER);
    createEReference(basic_typeEClass, BASIC_TYPE__REAL);
    createEReference(basic_typeEClass, BASIC_TYPE__RANGE);
    createEReference(basic_typeEClass, BASIC_TYPE__CLASS);
    createEReference(basic_typeEClass, BASIC_TYPE__REF);
    createEReference(basic_typeEClass, BASIC_TYPE__TYPENAME);

    composite_typeEClass = createEClass(COMPOSITE_TYPE);

    mapping_typeEClass = createEClass(MAPPING_TYPE);
    createEReference(mapping_typeEClass, MAPPING_TYPE__KEY);
    createEReference(mapping_typeEClass, MAPPING_TYPE__VAL);

    set_typeEClass = createEClass(SET_TYPE);
    createEReference(set_typeEClass, SET_TYPE__ROOT_TYPE);

    list_typeEClass = createEClass(LIST_TYPE);
    createEReference(list_typeEClass, LIST_TYPE__ROOT_TYPE);

    record_typeEClass = createEClass(RECORD_TYPE);
    createEReference(record_typeEClass, RECORD_TYPE__FIELD);

    union_typeEClass = createEClass(UNION_TYPE);
    createEReference(union_typeEClass, UNION_TYPE__TYPES);
    createEReference(union_typeEClass, UNION_TYPE__TYPE);

    id_type_pairEClass = createEClass(ID_TYPE_PAIR);
    createEAttribute(id_type_pairEClass, ID_TYPE_PAIR__NAME);
    createEReference(id_type_pairEClass, ID_TYPE_PAIR__TYPE);

    element_typeEClass = createEClass(ELEMENT_TYPE);
    createEAttribute(element_typeEClass, ELEMENT_TYPE__TELEM);
    createEAttribute(element_typeEClass, ELEMENT_TYPE__TPACK);
    createEAttribute(element_typeEClass, ELEMENT_TYPE__TCLASS);
    createEAttribute(element_typeEClass, ELEMENT_TYPE__TINST);

    classifiersEClass = createEClass(CLASSIFIERS);
    createEAttribute(classifiersEClass, CLASSIFIERS__TCLASS);
    createEAttribute(classifiersEClass, CLASSIFIERS__TCLASS_SUBTYPE);

    t_classifier_subtypesEClass = createEClass(TCLASSIFIER_SUBTYPES);
    createEAttribute(t_classifier_subtypesEClass, TCLASSIFIER_SUBTYPES__TCTYPE);
    createEAttribute(t_classifier_subtypesEClass, TCLASSIFIER_SUBTYPES__TCIMPL);
    createEAttribute(t_classifier_subtypesEClass, TCLASSIFIER_SUBTYPES__TFGCLASS);
    createEAttribute(t_classifier_subtypesEClass, TCLASSIFIER_SUBTYPES__TANNEXCLASS);

    instancesEClass = createEClass(INSTANCES);
    createEAttribute(instancesEClass, INSTANCES__INST);
    createEAttribute(instancesEClass, INSTANCES__TINST_ST);

    t_instance_subtypesEClass = createEClass(TINSTANCE_SUBTYPES);
    createEAttribute(t_instance_subtypesEClass, TINSTANCE_SUBTYPES__TSUBC_ST);
    createEAttribute(t_instance_subtypesEClass, TINSTANCE_SUBTYPES__TSBCALL);
    createEAttribute(t_instance_subtypesEClass, TINSTANCE_SUBTYPES__TCALLSEQ);
    createEAttribute(t_instance_subtypesEClass, TINSTANCE_SUBTYPES__TEEFLOW);
    createEAttribute(t_instance_subtypesEClass, TINSTANCE_SUBTYPES__TPROTO);
    createEAttribute(t_instance_subtypesEClass, TINSTANCE_SUBTYPES__TMODE);
    createEAttribute(t_instance_subtypesEClass, TINSTANCE_SUBTYPES__TMOD_TRANS);
    createEAttribute(t_instance_subtypesEClass, TINSTANCE_SUBTYPES__TMODE_TRIG);

    t_subcomponent_subtypesEClass = createEClass(TSUBCOMPONENT_SUBTYPES);
    createEAttribute(t_subcomponent_subtypesEClass, TSUBCOMPONENT_SUBTYPES__TSUB);
    createEAttribute(t_subcomponent_subtypesEClass, TSUBCOMPONENT_SUBTYPES__TCIMPL_ST);

    t_component_subtypesEClass = createEClass(TCOMPONENT_SUBTYPES);
    createEAttribute(t_component_subtypesEClass, TCOMPONENT_SUBTYPES__TANNEX_SUB);
    createEAttribute(t_component_subtypesEClass, TCOMPONENT_SUBTYPES__TABSTRACT);
    createEAttribute(t_component_subtypesEClass, TCOMPONENT_SUBTYPES__TSYS);
    createEAttribute(t_component_subtypesEClass, TCOMPONENT_SUBTYPES__TDEV);
    createEAttribute(t_component_subtypesEClass, TCOMPONENT_SUBTYPES__TPROC);
    createEAttribute(t_component_subtypesEClass, TCOMPONENT_SUBTYPES__TVIRT_PROC);
    createEAttribute(t_component_subtypesEClass, TCOMPONENT_SUBTYPES__TBUS);
    createEAttribute(t_component_subtypesEClass, TCOMPONENT_SUBTYPES__TVBUS);
    createEAttribute(t_component_subtypesEClass, TCOMPONENT_SUBTYPES__TMEM);
    createEAttribute(t_component_subtypesEClass, TCOMPONENT_SUBTYPES__TTG);
    createEAttribute(t_component_subtypesEClass, TCOMPONENT_SUBTYPES__TT);
    createEAttribute(t_component_subtypesEClass, TCOMPONENT_SUBTYPES__TD);
    createEAttribute(t_component_subtypesEClass, TCOMPONENT_SUBTYPES__TSUBPROG);
    createEAttribute(t_component_subtypesEClass, TCOMPONENT_SUBTYPES__TSUBPROG_G);

    t_connection_subtypesEClass = createEClass(TCONNECTION_SUBTYPES);
    createEAttribute(t_connection_subtypesEClass, TCONNECTION_SUBTYPES__TCONN);
    createEAttribute(t_connection_subtypesEClass, TCONNECTION_SUBTYPES__TFEAT_CONN);
    createEAttribute(t_connection_subtypesEClass, TCONNECTION_SUBTYPES__TPORT_CONN);
    createEAttribute(t_connection_subtypesEClass, TCONNECTION_SUBTYPES__TPARM_CONN);
    createEAttribute(t_connection_subtypesEClass, TCONNECTION_SUBTYPES__TACC_CON);
    createEAttribute(t_connection_subtypesEClass, TCONNECTION_SUBTYPES__TFG_CONN);

    t_feature_subtypesEClass = createEClass(TFEATURE_SUBTYPES);
    createEAttribute(t_feature_subtypesEClass, TFEATURE_SUBTYPES__TFEAT);
    createEAttribute(t_feature_subtypesEClass, TFEATURE_SUBTYPES__TABS_FEAT);
    createEAttribute(t_feature_subtypesEClass, TFEATURE_SUBTYPES__TPARM);
    createEAttribute(t_feature_subtypesEClass, TFEATURE_SUBTYPES__TFG);

    t_access_subtypesEClass = createEClass(TACCESS_SUBTYPES);
    createEAttribute(t_access_subtypesEClass, TACCESS_SUBTYPES__TACCESS);
    createEAttribute(t_access_subtypesEClass, TACCESS_SUBTYPES__TDATA_ACC);
    createEAttribute(t_access_subtypesEClass, TACCESS_SUBTYPES__TSUB_ACC);
    createEAttribute(t_access_subtypesEClass, TACCESS_SUBTYPES__TSUB_GR_ACC);
    createEAttribute(t_access_subtypesEClass, TACCESS_SUBTYPES__TBUS_ACC);

    t_port_subtypesEClass = createEClass(TPORT_SUBTYPES);
    createEAttribute(t_port_subtypesEClass, TPORT_SUBTYPES__TPORT);
    createEAttribute(t_port_subtypesEClass, TPORT_SUBTYPES__TDPORT);
    createEAttribute(t_port_subtypesEClass, TPORT_SUBTYPES__TEV_PORT);
    createEAttribute(t_port_subtypesEClass, TPORT_SUBTYPES__TEVD_PORT);

    t_flow_spec_subtypesEClass = createEClass(TFLOW_SPEC_SUBTYPES);
    createEAttribute(t_flow_spec_subtypesEClass, TFLOW_SPEC_SUBTYPES__TFSPEC);
    createEAttribute(t_flow_spec_subtypesEClass, TFLOW_SPEC_SUBTYPES__TFSPEC_SOURCE);
    createEAttribute(t_flow_spec_subtypesEClass, TFLOW_SPEC_SUBTYPES__TFSPEC_SINK);
    createEAttribute(t_flow_spec_subtypesEClass, TFLOW_SPEC_SUBTYPES__TFSPEC_PATH);

    t_flow_impl_subtypesEClass = createEClass(TFLOW_IMPL_SUBTYPES);
    createEAttribute(t_flow_impl_subtypesEClass, TFLOW_IMPL_SUBTYPES__TFI);
    createEAttribute(t_flow_impl_subtypesEClass, TFLOW_IMPL_SUBTYPES__TFISOURCE);
    createEAttribute(t_flow_impl_subtypesEClass, TFLOW_IMPL_SUBTYPES__TFISINK);
    createEAttribute(t_flow_impl_subtypesEClass, TFLOW_IMPL_SUBTYPES__TFIPATH);

    functionBodyEClass = createEClass(FUNCTION_BODY);
    createEReference(functionBodyEClass, FUNCTION_BODY__TYPE);

    claimBodyEClass = createEClass(CLAIM_BODY);
    createEReference(claimBodyEClass, CLAIM_BODY__STRING);

    claimStringEClass = createEClass(CLAIM_STRING);
    createEReference(claimStringEClass, CLAIM_STRING__STR);

    claimArgEClass = createEClass(CLAIM_ARG);
    createEReference(claimArgEClass, CLAIM_ARG__ARG);
    createEReference(claimArgEClass, CLAIM_ARG__UNIT);

    binaryExprEClass = createEClass(BINARY_EXPR);
    createEReference(binaryExprEClass, BINARY_EXPR__LEFT);
    createEAttribute(binaryExprEClass, BINARY_EXPR__OP);
    createEReference(binaryExprEClass, BINARY_EXPR__RIGHT);

    instanceOfExprEClass = createEClass(INSTANCE_OF_EXPR);
    createEReference(instanceOfExprEClass, INSTANCE_OF_EXPR__EXPR);
    createEReference(instanceOfExprEClass, INSTANCE_OF_EXPR__TYPE);

    unaryExprEClass = createEClass(UNARY_EXPR);
    createEAttribute(unaryExprEClass, UNARY_EXPR__OP);
    createEReference(unaryExprEClass, UNARY_EXPR__EXPR);

    postCastExprEClass = createEClass(POST_CAST_EXPR);
    createEReference(postCastExprEClass, POST_CAST_EXPR__EXPR);
    createEReference(postCastExprEClass, POST_CAST_EXPR__NEWTYPE);

    mcsNameExprEClass = createEClass(MCS_NAME_EXPR);
    createEAttribute(mcsNameExprEClass, MCS_NAME_EXPR__ROOT);
    createEAttribute(mcsNameExprEClass, MCS_NAME_EXPR__IROOT);
    createEAttribute(mcsNameExprEClass, MCS_NAME_EXPR__NIL);
    createEAttribute(mcsNameExprEClass, MCS_NAME_EXPR__EMPTY);
    createEAttribute(mcsNameExprEClass, MCS_NAME_EXPR__ALLMODES);
    createEReference(mcsNameExprEClass, MCS_NAME_EXPR__TYPEDNAMEREF);

    pkgExprEClass = createEClass(PKG_EXPR);
    createEReference(pkgExprEClass, PKG_EXPR__PACKAGE);

    compExprEClass = createEClass(COMP_EXPR);
    createEReference(compExprEClass, COMP_EXPR__CLASSIFIER);

    refExprEClass = createEClass(REF_EXPR);
    createEReference(refExprEClass, REF_EXPR__REFERENCE);

    thisExprEClass = createEClass(THIS_EXPR);
    createEReference(thisExprEClass, THIS_EXPR__SUB);

    intExprEClass = createEClass(INT_EXPR);
    createEReference(intExprEClass, INT_EXPR__VAL);

    realExprEClass = createEClass(REAL_EXPR);
    createEReference(realExprEClass, REAL_EXPR__VAL);

    boolExprEClass = createEClass(BOOL_EXPR);
    createEReference(boolExprEClass, BOOL_EXPR__VAL);

    stringExprEClass = createEClass(STRING_EXPR);
    createEReference(stringExprEClass, STRING_EXPR__VAL);

    rangeEClass = createEClass(RANGE);
    createEReference(rangeEClass, RANGE__VAL);

    ifThenElseExprEClass = createEClass(IF_THEN_ELSE_EXPR);
    createEReference(ifThenElseExprEClass, IF_THEN_ELSE_EXPR__COND);
    createEReference(ifThenElseExprEClass, IF_THEN_ELSE_EXPR__THEN);
    createEReference(ifThenElseExprEClass, IF_THEN_ELSE_EXPR__ELSE);

    quantifiedExprEClass = createEClass(QUANTIFIED_EXPR);
    createEAttribute(quantifiedExprEClass, QUANTIFIED_EXPR__QUANT);
    createEReference(quantifiedExprEClass, QUANTIFIED_EXPR__ARGS);
    createEReference(quantifiedExprEClass, QUANTIFIED_EXPR__EXPR);

    builtInFnCallExprEClass = createEClass(BUILT_IN_FN_CALL_EXPR);

    fnCallExprEClass = createEClass(FN_CALL_EXPR);
    createEReference(fnCallExprEClass, FN_CALL_EXPR__FN);

    filterMapExprEClass = createEClass(FILTER_MAP_EXPR);
    createEReference(filterMapExprEClass, FILTER_MAP_EXPR__MAP);
    createEReference(filterMapExprEClass, FILTER_MAP_EXPR__ARGS);
    createEReference(filterMapExprEClass, FILTER_MAP_EXPR__FILTER);

    setExprEClass = createEClass(SET_EXPR);
    createEReference(setExprEClass, SET_EXPR__EXPRS);

    emptyEClass = createEClass(EMPTY);

    letExprEClass = createEClass(LET_EXPR);
    createEReference(letExprEClass, LET_EXPR__BINDING);
    createEReference(letExprEClass, LET_EXPR__EXPR);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    Aadl2Package theAadl2Package = (Aadl2Package)EPackage.Registry.INSTANCE.getEPackage(Aadl2Package.eNS_URI);
    EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    parameterEClass.getESuperTypes().add(theAadl2Package.getParameter());
    mcsNameEClass.getESuperTypes().add(this.getMcsTypedName());
    mcsTypedNameEClass.getESuperTypes().add(this.getParameter());
    theoremCallEClass.getESuperTypes().add(this.getExpr());
    mapping_typeEClass.getESuperTypes().add(this.getComposite_type());
    set_typeEClass.getESuperTypes().add(this.getComposite_type());
    list_typeEClass.getESuperTypes().add(this.getComposite_type());
    record_typeEClass.getESuperTypes().add(this.getComposite_type());
    union_typeEClass.getESuperTypes().add(this.getComposite_type());
    t_connection_subtypesEClass.getESuperTypes().add(this.gett_instance_subtypes());
    t_feature_subtypesEClass.getESuperTypes().add(this.gett_instance_subtypes());
    t_access_subtypesEClass.getESuperTypes().add(this.gett_feature_subtypes());
    t_port_subtypesEClass.getESuperTypes().add(this.gett_feature_subtypes());
    t_flow_spec_subtypesEClass.getESuperTypes().add(this.gett_instance_subtypes());
    t_flow_impl_subtypesEClass.getESuperTypes().add(this.gett_instance_subtypes());
    functionBodyEClass.getESuperTypes().add(this.getDefinitionBody());
    claimBodyEClass.getESuperTypes().add(this.getDefinitionBody());
    claimStringEClass.getESuperTypes().add(this.getTextParm());
    claimArgEClass.getESuperTypes().add(this.getTextParm());
    binaryExprEClass.getESuperTypes().add(this.getExpr());
    instanceOfExprEClass.getESuperTypes().add(this.getExpr());
    unaryExprEClass.getESuperTypes().add(this.getExpr());
    postCastExprEClass.getESuperTypes().add(this.getExpr());
    mcsNameExprEClass.getESuperTypes().add(this.getExpr());
    pkgExprEClass.getESuperTypes().add(this.getExpr());
    compExprEClass.getESuperTypes().add(this.getExpr());
    refExprEClass.getESuperTypes().add(this.getExpr());
    thisExprEClass.getESuperTypes().add(this.getExpr());
    intExprEClass.getESuperTypes().add(this.getExpr());
    realExprEClass.getESuperTypes().add(this.getExpr());
    boolExprEClass.getESuperTypes().add(this.getExpr());
    stringExprEClass.getESuperTypes().add(this.getExpr());
    rangeEClass.getESuperTypes().add(this.getExpr());
    ifThenElseExprEClass.getESuperTypes().add(this.getExpr());
    quantifiedExprEClass.getESuperTypes().add(this.getExpr());
    builtInFnCallExprEClass.getESuperTypes().add(this.getExpr());
    fnCallExprEClass.getESuperTypes().add(this.getExpr());
    filterMapExprEClass.getESuperTypes().add(this.getExpr());
    setExprEClass.getESuperTypes().add(this.getExpr());
    emptyEClass.getESuperTypes().add(this.getExpr());
    letExprEClass.getESuperTypes().add(this.getExpr());

    // Initialize classes and features; add operations and parameters
    initEClass(mcsGrammarRootEClass, MCSGrammarRoot.class, "MCSGrammarRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMCSGrammarRoot_Lib(), this.getMCSAnnexLibrary(), null, "lib", null, 0, 1, MCSGrammarRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMCSGrammarRoot_File(), this.getMCSFileLibrary(), null, "file", null, 0, 1, MCSGrammarRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMCSGrammarRoot_Subclause(), this.getMCSAnnexSubclause(), null, "subclause", null, 0, 1, MCSGrammarRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mcsAnnexLibraryEClass, MCSAnnexLibrary.class, "MCSAnnexLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMCSAnnexLibrary_Types(), this.getType_declaration(), null, "types", null, 0, -1, MCSAnnexLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMCSAnnexLibrary_Constants(), this.getConstant_declaration(), null, "constants", null, 0, -1, MCSAnnexLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMCSAnnexLibrary_Functions(), this.getF_or_T(), null, "functions", null, 0, -1, MCSAnnexLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMCSAnnexLibrary_Theorems(), this.getF_or_T(), null, "theorems", null, 0, -1, MCSAnnexLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mcsFileLibraryEClass, MCSFileLibrary.class, "MCSFileLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMCSFileLibrary_ImportedUnit(), theAadl2Package.getModelUnit(), null, "importedUnit", null, 0, -1, MCSFileLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMCSFileLibrary_Files(), theEcorePackage.getEString(), "files", null, 0, -1, MCSFileLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMCSFileLibrary_Types(), this.getType_declaration(), null, "types", null, 0, -1, MCSFileLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMCSFileLibrary_Constants(), this.getConstant_declaration(), null, "constants", null, 0, -1, MCSFileLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMCSFileLibrary_Functions(), this.getF_or_T(), null, "functions", null, 0, -1, MCSFileLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMCSFileLibrary_Theorems(), this.getF_or_T(), null, "theorems", null, 0, -1, MCSFileLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMCSFileLibrary_Calls(), this.getTheoremCall(), null, "calls", null, 0, -1, MCSFileLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mcsAnnexSubclauseEClass, MCSAnnexSubclause.class, "MCSAnnexSubclause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMCSAnnexSubclause_Calls(), this.getTheoremCall(), null, "calls", null, 0, -1, MCSAnnexSubclause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(type_declarationEClass, Type_declaration.class, "Type_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getType_declaration_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Type_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getType_declaration_Type(), this.getType_expression(), null, "type", null, 0, 1, Type_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constant_declarationEClass, Constant_declaration.class, "Constant_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConstant_declaration_Const(), this.getMcsTypedName(), null, "const", null, 0, 1, Constant_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstant_declaration_Left_expr(), this.getExpr(), null, "left_expr", null, 0, 1, Constant_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(f_or_TEClass, F_or_T.class, "F_or_T", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getF_or_T_Name(), theEcorePackage.getEString(), "name", null, 0, 1, F_or_T.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getF_or_T_T_root(), theEcorePackage.getEBoolean(), "t_root", null, 0, 1, F_or_T.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getF_or_T_Args(), this.getParameter(), null, "args", null, 0, -1, F_or_T.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getF_or_T_Body(), this.getDefinitionBody(), null, "body", null, 0, 1, F_or_T.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(theorem_rootEClass, Theorem_root.class, "Theorem_root", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTheorem_root_Nilroot(), theEcorePackage.getEBoolean(), "nilroot", null, 0, 1, Theorem_root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTheorem_root_Classifier(), this.getClassifiers(), null, "classifier", null, 0, 1, Theorem_root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(definitionBodyEClass, DefinitionBody.class, "DefinitionBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDefinitionBody_Expr(), this.getExpr(), null, "expr", null, 0, 1, DefinitionBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterizedStringEClass, ParameterizedString.class, "ParameterizedString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameterizedString_Claim(), this.getTextParm(), null, "claim", null, 0, -1, ParameterizedString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(textParmEClass, TextParm.class, "TextParm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(mcsNameEClass, McsName.class, "McsName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMcsName_Type(), this.getType_expression(), null, "type", null, 0, 1, McsName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mcsTypedNameEClass, McsTypedName.class, "McsTypedName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(theoremCallEClass, TheoremCall.class, "TheoremCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTheoremCall_Name(), this.getF_or_T(), null, "name", null, 0, 1, TheoremCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTheoremCall_Croot(), this.getClassifier_literal(), null, "croot", null, 0, 1, TheoremCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTheoremCall_Actarg(), this.getExpr(), null, "actarg", null, 0, -1, TheoremCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTheoremCall_Fn(), this.getTheoremCall(), null, "fn", null, 0, 1, TheoremCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classifier_literalEClass, Classifier_literal.class, "Classifier_literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getClassifier_literal_Classlit(), theAadl2Package.getComponentClassifier(), null, "classlit", null, 0, 1, Classifier_literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClassifier_literal_Arg(), this.getMcs_name_ref(), null, "arg", null, 0, 1, Classifier_literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(refTermEClass, RefTerm.class, "RefTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRefTerm_Root(), theEcorePackage.getEBoolean(), "root", null, 0, 1, RefTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRefTerm_Path(), theAadl2Package.getContainmentPathElement(), null, "path", null, 0, 1, RefTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mcs_name_refEClass, Mcs_name_ref.class, "Mcs_name_ref", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMcs_name_ref_Ref(), this.getMcsTypedName(), null, "ref", null, 0, 1, Mcs_name_ref.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMcs_name_ref_Builtin(), this.getBuiltInFnCall(), null, "builtin", null, 0, -1, Mcs_name_ref.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMcs_name_ref_Method(), this.getFnCall(), null, "method", null, 0, -1, Mcs_name_ref.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(builtInFnCallEClass, BuiltInFnCall.class, "BuiltInFnCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBuiltInFnCall_Fn(), theEcorePackage.getEString(), "fn", null, 0, 1, BuiltInFnCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuiltInFnCall_Args(), this.getExpr(), null, "args", null, 0, -1, BuiltInFnCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fnCallEClass, FnCall.class, "FnCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFnCall_Fn(), this.getF_or_T(), null, "fn", null, 0, 1, FnCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFnCall_Args(), this.getExpr(), null, "args", null, 0, -1, FnCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(let_bindingEClass, Let_binding.class, "Let_binding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLet_binding_Local(), this.getMcsTypedName(), null, "local", null, 0, 1, Let_binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLet_binding_Expr(), this.getExpr(), null, "expr", null, 0, 1, Let_binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprEClass, Expr.class, "Expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExpr_List(), theEcorePackage.getEBoolean(), "list", null, 0, 1, Expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpr_Exp(), this.getExpr(), null, "exp", null, 0, 1, Expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpr_Builtin(), this.getBuiltInFnCall(), null, "builtin", null, 0, -1, Expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpr_Method(), this.getFnCall(), null, "method", null, 0, -1, Expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(domainEClass, Domain.class, "Domain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDomain_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDomain_Expr(), this.getExpr(), null, "expr", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(type_expressionEClass, Type_expression.class, "Type_expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getType_expression_Basic(), this.getBasic_type(), null, "basic", null, 0, 1, Type_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getType_expression_Composite(), this.getComposite_type(), null, "composite", null, 0, 1, Type_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getType_expression_Element(), this.getElement_type(), null, "element", null, 0, 1, Type_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(basic_typeEClass, Basic_type.class, "Basic_type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBasic_type_Ptype(), theEcorePackage.getEString(), "ptype", null, 0, 1, Basic_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBasic_type_Pref(), theEcorePackage.getEString(), "pref", null, 0, 1, Basic_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBasic_type_Bool(), theAadl2Package.getAadlBoolean(), null, "bool", null, 0, 1, Basic_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBasic_type_String(), theAadl2Package.getAadlString(), null, "string", null, 0, 1, Basic_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBasic_type_Enumer(), theAadl2Package.getEnumerationType(), null, "enumer", null, 0, 1, Basic_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBasic_type_Units(), theAadl2Package.getUnitsType(), null, "units", null, 0, 1, Basic_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBasic_type_Integer(), theAadl2Package.getAadlInteger(), null, "integer", null, 0, 1, Basic_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBasic_type_Real(), theAadl2Package.getAadlReal(), null, "real", null, 0, 1, Basic_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBasic_type_Range(), theAadl2Package.getRangeType(), null, "range", null, 0, 1, Basic_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBasic_type_Class(), theAadl2Package.getClassifierType(), null, "class", null, 0, 1, Basic_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBasic_type_Ref(), theAadl2Package.getReferenceType(), null, "ref", null, 0, 1, Basic_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBasic_type_Typename(), this.getType_declaration(), null, "typename", null, 0, 1, Basic_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(composite_typeEClass, Composite_type.class, "Composite_type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(mapping_typeEClass, Mapping_type.class, "Mapping_type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMapping_type_Key(), this.getType_expression(), null, "key", null, 0, 1, Mapping_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMapping_type_Val(), this.getType_expression(), null, "val", null, 0, 1, Mapping_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(set_typeEClass, Set_type.class, "Set_type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSet_type_Root_type(), this.getType_expression(), null, "root_type", null, 0, 1, Set_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(list_typeEClass, List_type.class, "List_type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getList_type_Root_type(), this.getType_expression(), null, "root_type", null, 0, 1, List_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(record_typeEClass, Record_type.class, "Record_type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRecord_type_Field(), this.getId_type_pair(), null, "field", null, 0, -1, Record_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(union_typeEClass, Union_type.class, "Union_type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUnion_type_Types(), this.getType_expression(), null, "types", null, 0, -1, Union_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUnion_type_Type(), this.getType_expression(), null, "type", null, 0, -1, Union_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(id_type_pairEClass, Id_type_pair.class, "Id_type_pair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getId_type_pair_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Id_type_pair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getId_type_pair_Type(), this.getType_expression(), null, "type", null, 0, 1, Id_type_pair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(element_typeEClass, Element_type.class, "Element_type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getElement_type_Telem(), theEcorePackage.getEBoolean(), "telem", null, 0, 1, Element_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getElement_type_Tpack(), theEcorePackage.getEBoolean(), "tpack", null, 0, 1, Element_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getElement_type_T_class(), theEcorePackage.getEBoolean(), "t_class", null, 0, 1, Element_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getElement_type_T_inst(), theEcorePackage.getEBoolean(), "t_inst", null, 0, 1, Element_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classifiersEClass, Classifiers.class, "Classifiers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getClassifiers_T_class(), theEcorePackage.getEBoolean(), "t_class", null, 0, 1, Classifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClassifiers_T_class_subtype(), theEcorePackage.getEBoolean(), "t_class_subtype", null, 0, 1, Classifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(t_classifier_subtypesEClass, T_classifier_subtypes.class, "T_classifier_subtypes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getT_classifier_subtypes_T_ctype(), theEcorePackage.getEBoolean(), "t_ctype", null, 0, 1, T_classifier_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getT_classifier_subtypes_T_cimpl(), theEcorePackage.getEBoolean(), "t_cimpl", null, 0, 1, T_classifier_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getT_classifier_subtypes_T_fgclass(), theEcorePackage.getEBoolean(), "t_fgclass", null, 0, 1, T_classifier_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getT_classifier_subtypes_T_annexclass(), theEcorePackage.getEBoolean(), "t_annexclass", null, 0, 1, T_classifier_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instancesEClass, Instances.class, "Instances", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInstances_Inst(), theEcorePackage.getEBoolean(), "inst", null, 0, 1, Instances.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInstances_T_inst_st(), theEcorePackage.getEBoolean(), "t_inst_st", null, 0, 1, Instances.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(t_instance_subtypesEClass, t_instance_subtypes.class, "t_instance_subtypes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(gett_instance_subtypes_T_subc_st(), theEcorePackage.getEBoolean(), "t_subc_st", null, 0, 1, t_instance_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(gett_instance_subtypes_T_sbcall(), theEcorePackage.getEBoolean(), "t_sbcall", null, 0, 1, t_instance_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(gett_instance_subtypes_T_callseq(), theEcorePackage.getEBoolean(), "t_callseq", null, 0, 1, t_instance_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(gett_instance_subtypes_T_eeflow(), theEcorePackage.getEBoolean(), "t_eeflow", null, 0, 1, t_instance_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(gett_instance_subtypes_T_proto(), theEcorePackage.getEBoolean(), "t_proto", null, 0, 1, t_instance_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(gett_instance_subtypes_T_mode(), theEcorePackage.getEBoolean(), "t_mode", null, 0, 1, t_instance_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(gett_instance_subtypes_T_mod_trans(), theEcorePackage.getEBoolean(), "t_mod_trans", null, 0, 1, t_instance_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(gett_instance_subtypes_T_mode_trig(), theEcorePackage.getEBoolean(), "t_mode_trig", null, 0, 1, t_instance_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(t_subcomponent_subtypesEClass, t_subcomponent_subtypes.class, "t_subcomponent_subtypes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(gett_subcomponent_subtypes_T_sub(), theEcorePackage.getEBoolean(), "t_sub", null, 0, 1, t_subcomponent_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(gett_subcomponent_subtypes_T_cimpl_st(), theEcorePackage.getEBoolean(), "t_cimpl_st", null, 0, 1, t_subcomponent_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(t_component_subtypesEClass, t_component_subtypes.class, "t_component_subtypes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(gett_component_subtypes_T_annex_sub(), theEcorePackage.getEBoolean(), "t_annex_sub", null, 0, 1, t_component_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(gett_component_subtypes_T_abstract(), theEcorePackage.getEBoolean(), "t_abstract", null, 0, 1, t_component_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(gett_component_subtypes_T_sys(), theEcorePackage.getEBoolean(), "t_sys", null, 0, 1, t_component_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(gett_component_subtypes_T_dev(), theEcorePackage.getEBoolean(), "t_dev", null, 0, 1, t_component_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(gett_component_subtypes_T_proc(), theEcorePackage.getEBoolean(), "t_proc", null, 0, 1, t_component_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(gett_component_subtypes_T_virt_proc(), theEcorePackage.getEBoolean(), "t_virt_proc", null, 0, 1, t_component_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(gett_component_subtypes_T_bus(), theEcorePackage.getEBoolean(), "t_bus", null, 0, 1, t_component_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(gett_component_subtypes_T_vbus(), theEcorePackage.getEBoolean(), "t_vbus", null, 0, 1, t_component_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(gett_component_subtypes_T_mem(), theEcorePackage.getEBoolean(), "t_mem", null, 0, 1, t_component_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(gett_component_subtypes_T_tg(), theEcorePackage.getEBoolean(), "t_tg", null, 0, 1, t_component_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(gett_component_subtypes_T_t(), theEcorePackage.getEBoolean(), "t_t", null, 0, 1, t_component_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(gett_component_subtypes_T_d(), theEcorePackage.getEBoolean(), "t_d", null, 0, 1, t_component_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(gett_component_subtypes_T_subprog(), theEcorePackage.getEBoolean(), "t_subprog", null, 0, 1, t_component_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(gett_component_subtypes_T_subprog_g(), theEcorePackage.getEBoolean(), "t_subprog_g", null, 0, 1, t_component_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(t_connection_subtypesEClass, t_connection_subtypes.class, "t_connection_subtypes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(gett_connection_subtypes_T_conn(), theEcorePackage.getEBoolean(), "t_conn", null, 0, 1, t_connection_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(gett_connection_subtypes_T_feat_conn(), theEcorePackage.getEBoolean(), "t_feat_conn", null, 0, 1, t_connection_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(gett_connection_subtypes_T_port_conn(), theEcorePackage.getEBoolean(), "t_port_conn", null, 0, 1, t_connection_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(gett_connection_subtypes_T_parm_conn(), theEcorePackage.getEBoolean(), "t_parm_conn", null, 0, 1, t_connection_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(gett_connection_subtypes_T_acc_con(), theEcorePackage.getEBoolean(), "t_acc_con", null, 0, 1, t_connection_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(gett_connection_subtypes_T_fg_conn(), theEcorePackage.getEBoolean(), "t_fg_conn", null, 0, 1, t_connection_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(t_feature_subtypesEClass, t_feature_subtypes.class, "t_feature_subtypes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(gett_feature_subtypes_T_feat(), theEcorePackage.getEBoolean(), "t_feat", null, 0, 1, t_feature_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(gett_feature_subtypes_T_abs_feat(), theEcorePackage.getEBoolean(), "t_abs_feat", null, 0, 1, t_feature_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(gett_feature_subtypes_T_parm(), theEcorePackage.getEBoolean(), "t_parm", null, 0, 1, t_feature_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(gett_feature_subtypes_T_fg(), theEcorePackage.getEBoolean(), "t_fg", null, 0, 1, t_feature_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(t_access_subtypesEClass, t_access_subtypes.class, "t_access_subtypes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(gett_access_subtypes_T_access(), theEcorePackage.getEBoolean(), "t_access", null, 0, 1, t_access_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(gett_access_subtypes_T_data_acc(), theEcorePackage.getEBoolean(), "t_data_acc", null, 0, 1, t_access_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(gett_access_subtypes_T_sub_acc(), theEcorePackage.getEBoolean(), "t_sub_acc", null, 0, 1, t_access_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(gett_access_subtypes_T_sub_gr_acc(), theEcorePackage.getEBoolean(), "t_sub_gr_acc", null, 0, 1, t_access_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(gett_access_subtypes_T_bus_acc(), theEcorePackage.getEBoolean(), "t_bus_acc", null, 0, 1, t_access_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(t_port_subtypesEClass, t_port_subtypes.class, "t_port_subtypes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(gett_port_subtypes_T_port(), theEcorePackage.getEBoolean(), "t_port", null, 0, 1, t_port_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(gett_port_subtypes_T_d_port(), theEcorePackage.getEBoolean(), "t_d_port", null, 0, 1, t_port_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(gett_port_subtypes_T_ev_port(), theEcorePackage.getEBoolean(), "t_ev_port", null, 0, 1, t_port_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(gett_port_subtypes_T_evd_port(), theEcorePackage.getEBoolean(), "t_evd_port", null, 0, 1, t_port_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(t_flow_spec_subtypesEClass, t_flow_spec_subtypes.class, "t_flow_spec_subtypes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(gett_flow_spec_subtypes_T_f_spec(), theEcorePackage.getEBoolean(), "t_f_spec", null, 0, 1, t_flow_spec_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(gett_flow_spec_subtypes_T_f_spec_source(), theEcorePackage.getEBoolean(), "t_f_spec_source", null, 0, 1, t_flow_spec_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(gett_flow_spec_subtypes_T_f_spec_sink(), theEcorePackage.getEBoolean(), "t_f_spec_sink", null, 0, 1, t_flow_spec_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(gett_flow_spec_subtypes_T_f_spec_path(), theEcorePackage.getEBoolean(), "t_f_spec_path", null, 0, 1, t_flow_spec_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(t_flow_impl_subtypesEClass, t_flow_impl_subtypes.class, "t_flow_impl_subtypes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(gett_flow_impl_subtypes_T_f_i(), theEcorePackage.getEBoolean(), "t_f_i", null, 0, 1, t_flow_impl_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(gett_flow_impl_subtypes_T_f_i_source(), theEcorePackage.getEBoolean(), "t_f_i_source", null, 0, 1, t_flow_impl_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(gett_flow_impl_subtypes_T_f_i_sink(), theEcorePackage.getEBoolean(), "t_f_i_sink", null, 0, 1, t_flow_impl_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(gett_flow_impl_subtypes_T_f_i_path(), theEcorePackage.getEBoolean(), "t_f_i_path", null, 0, 1, t_flow_impl_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionBodyEClass, FunctionBody.class, "FunctionBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFunctionBody_Type(), this.getType_expression(), null, "type", null, 0, 1, FunctionBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(claimBodyEClass, ClaimBody.class, "ClaimBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getClaimBody_String(), this.getParameterizedString(), null, "string", null, 0, -1, ClaimBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(claimStringEClass, ClaimString.class, "ClaimString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getClaimString_Str(), theAadl2Package.getStringLiteral(), null, "str", null, 0, 1, ClaimString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(claimArgEClass, ClaimArg.class, "ClaimArg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getClaimArg_Arg(), this.getMcsTypedName(), null, "arg", null, 0, 1, ClaimArg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClaimArg_Unit(), theAadl2Package.getUnitLiteral(), null, "unit", null, 0, 1, ClaimArg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(binaryExprEClass, BinaryExpr.class, "BinaryExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBinaryExpr_Left(), this.getExpr(), null, "left", null, 0, 1, BinaryExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBinaryExpr_Op(), theEcorePackage.getEString(), "op", null, 0, 1, BinaryExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBinaryExpr_Right(), theEcorePackage.getEObject(), null, "right", null, 0, 1, BinaryExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instanceOfExprEClass, InstanceOfExpr.class, "InstanceOfExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInstanceOfExpr_Expr(), this.getExpr(), null, "expr", null, 0, 1, InstanceOfExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstanceOfExpr_Type(), this.getType_expression(), null, "type", null, 0, 1, InstanceOfExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unaryExprEClass, UnaryExpr.class, "UnaryExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUnaryExpr_Op(), theEcorePackage.getEString(), "op", null, 0, 1, UnaryExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUnaryExpr_Expr(), this.getExpr(), null, "expr", null, 0, 1, UnaryExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(postCastExprEClass, PostCastExpr.class, "PostCastExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPostCastExpr_Expr(), this.getExpr(), null, "expr", null, 0, 1, PostCastExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPostCastExpr_Newtype(), this.getType_expression(), null, "newtype", null, 0, 1, PostCastExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mcsNameExprEClass, MCSNameExpr.class, "MCSNameExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMCSNameExpr_Root(), theEcorePackage.getEBoolean(), "root", null, 0, 1, MCSNameExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMCSNameExpr_Iroot(), theEcorePackage.getEBoolean(), "iroot", null, 0, 1, MCSNameExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMCSNameExpr_Nil(), theEcorePackage.getEBoolean(), "nil", null, 0, 1, MCSNameExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMCSNameExpr_Empty(), theEcorePackage.getEBoolean(), "empty", null, 0, 1, MCSNameExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMCSNameExpr_Allmodes(), theEcorePackage.getEBoolean(), "allmodes", null, 0, 1, MCSNameExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMCSNameExpr_Typednameref(), this.getMcs_name_ref(), null, "typednameref", null, 0, 1, MCSNameExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pkgExprEClass, PkgExpr.class, "PkgExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPkgExpr_Package(), theAadl2Package.getAadlPackage(), null, "package", null, 0, 1, PkgExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(compExprEClass, CompExpr.class, "CompExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCompExpr_Classifier(), theAadl2Package.getClassifierValue(), null, "classifier", null, 0, 1, CompExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(refExprEClass, RefExpr.class, "RefExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRefExpr_Reference(), this.getRefTerm(), null, "reference", null, 0, 1, RefExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(thisExprEClass, ThisExpr.class, "ThisExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getThisExpr_Sub(), theAadl2Package.getContainedNamedElement(), null, "sub", null, 0, 1, ThisExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intExprEClass, IntExpr.class, "IntExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIntExpr_Val(), theAadl2Package.getIntegerLiteral(), null, "val", null, 0, 1, IntExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(realExprEClass, RealExpr.class, "RealExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRealExpr_Val(), theAadl2Package.getRealLiteral(), null, "val", null, 0, 1, RealExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(boolExprEClass, BoolExpr.class, "BoolExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBoolExpr_Val(), theAadl2Package.getBooleanLiteral(), null, "val", null, 0, 1, BoolExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringExprEClass, StringExpr.class, "StringExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStringExpr_Val(), theAadl2Package.getStringLiteral(), null, "val", null, 0, 1, StringExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rangeEClass, Range.class, "Range", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRange_Val(), theAadl2Package.getNumericRange(), null, "val", null, 0, 1, Range.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ifThenElseExprEClass, IfThenElseExpr.class, "IfThenElseExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIfThenElseExpr_Cond(), this.getExpr(), null, "cond", null, 0, 1, IfThenElseExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfThenElseExpr_Then(), this.getExpr(), null, "then", null, 0, 1, IfThenElseExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfThenElseExpr_Else(), this.getExpr(), null, "else", null, 0, 1, IfThenElseExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(quantifiedExprEClass, QuantifiedExpr.class, "QuantifiedExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQuantifiedExpr_Quant(), theEcorePackage.getEString(), "quant", null, 0, 1, QuantifiedExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQuantifiedExpr_Args(), theEcorePackage.getEObject(), null, "args", null, 0, -1, QuantifiedExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQuantifiedExpr_Expr(), this.getExpr(), null, "expr", null, 0, 1, QuantifiedExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(builtInFnCallExprEClass, BuiltInFnCallExpr.class, "BuiltInFnCallExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(fnCallExprEClass, FnCallExpr.class, "FnCallExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFnCallExpr_Fn(), this.getFnCall(), null, "fn", null, 0, 1, FnCallExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(filterMapExprEClass, FilterMapExpr.class, "FilterMapExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFilterMapExpr_Map(), this.getExpr(), null, "map", null, 0, 1, FilterMapExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFilterMapExpr_Args(), theEcorePackage.getEObject(), null, "args", null, 0, -1, FilterMapExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFilterMapExpr_Filter(), this.getExpr(), null, "filter", null, 0, 1, FilterMapExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(setExprEClass, SetExpr.class, "SetExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSetExpr_Exprs(), this.getExpr(), null, "exprs", null, 0, -1, SetExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(emptyEClass, Empty.class, "Empty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(letExprEClass, LetExpr.class, "LetExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLetExpr_Binding(), this.getLet_binding(), null, "binding", null, 0, 1, LetExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLetExpr_Expr(), this.getExpr(), null, "expr", null, 0, 1, LetExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //McsPackageImpl
