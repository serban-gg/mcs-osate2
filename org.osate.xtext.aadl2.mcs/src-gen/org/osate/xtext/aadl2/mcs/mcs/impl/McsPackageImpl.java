/**
 */
package org.osate.xtext.aadl2.mcs.mcs.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.xbase.XbasePackage;

import org.osate.aadl2.Aadl2Package;

import org.osate.xtext.aadl2.mcs.mcs.AppliesToClause;
import org.osate.xtext.aadl2.mcs.mcs.ArrayRange;
import org.osate.xtext.aadl2.mcs.mcs.ClassifierCategory;
import org.osate.xtext.aadl2.mcs.mcs.ClassifierEnforce;
import org.osate.xtext.aadl2.mcs.mcs.ClassifierScript;
import org.osate.xtext.aadl2.mcs.mcs.ConstraintsBlock;
import org.osate.xtext.aadl2.mcs.mcs.ContainmentPathElement;
import org.osate.xtext.aadl2.mcs.mcs.Enforcement_policy;
import org.osate.xtext.aadl2.mcs.mcs.FeatureGroupClassifierReference;
import org.osate.xtext.aadl2.mcs.mcs.MCSAnnexLibrary;
import org.osate.xtext.aadl2.mcs.mcs.MCSAnnexSubclause;
import org.osate.xtext.aadl2.mcs.mcs.MCSClosure;
import org.osate.xtext.aadl2.mcs.mcs.MCSGrammarRoot;
import org.osate.xtext.aadl2.mcs.mcs.MCSViewpoint;
import org.osate.xtext.aadl2.mcs.mcs.McsFactory;
import org.osate.xtext.aadl2.mcs.mcs.McsPackage;
import org.osate.xtext.aadl2.mcs.mcs.ModeName;
import org.osate.xtext.aadl2.mcs.mcs.ModeSpec;
import org.osate.xtext.aadl2.mcs.mcs.PackageEnforce;
import org.osate.xtext.aadl2.mcs.mcs.PackageScript;
import org.osate.xtext.aadl2.mcs.mcs.UnnamedFunctionType;
import org.osate.xtext.aadl2.mcs.mcs.ViewpointReference;
import org.osate.xtext.aadl2.mcs.mcs.argument;
import org.osate.xtext.aadl2.mcs.mcs.assertion_expression;
import org.osate.xtext.aadl2.mcs.mcs.basic_type;
import org.osate.xtext.aadl2.mcs.mcs.block_label_id;
import org.osate.xtext.aadl2.mcs.mcs.check_assertion;
import org.osate.xtext.aadl2.mcs.mcs.check_label_id;
import org.osate.xtext.aadl2.mcs.mcs.check_statement;
import org.osate.xtext.aadl2.mcs.mcs.check_theorem;
import org.osate.xtext.aadl2.mcs.mcs.composite_type;
import org.osate.xtext.aadl2.mcs.mcs.constant_declaration;
import org.osate.xtext.aadl2.mcs.mcs.constant_expression;
import org.osate.xtext.aadl2.mcs.mcs.element_reference;
import org.osate.xtext.aadl2.mcs.mcs.element_type;
import org.osate.xtext.aadl2.mcs.mcs.expression;
import org.osate.xtext.aadl2.mcs.mcs.function_declaration;
import org.osate.xtext.aadl2.mcs.mcs.id_type_pair;
import org.osate.xtext.aadl2.mcs.mcs.in_modes_list;
import org.osate.xtext.aadl2.mcs.mcs.labelled_check_statement;
import org.osate.xtext.aadl2.mcs.mcs.list_type;
import org.osate.xtext.aadl2.mcs.mcs.local_declaration;
import org.osate.xtext.aadl2.mcs.mcs.map_type;
import org.osate.xtext.aadl2.mcs.mcs.record_type;
import org.osate.xtext.aadl2.mcs.mcs.root_element;
import org.osate.xtext.aadl2.mcs.mcs.set_type;
import org.osate.xtext.aadl2.mcs.mcs.string_expression;
import org.osate.xtext.aadl2.mcs.mcs.t_classifier_subtypes;
import org.osate.xtext.aadl2.mcs.mcs.t_classifiers;
import org.osate.xtext.aadl2.mcs.mcs.t_named_references;
import org.osate.xtext.aadl2.mcs.mcs.theorem_declaration;
import org.osate.xtext.aadl2.mcs.mcs.theorem_statement;
import org.osate.xtext.aadl2.mcs.mcs.type_declaration;
import org.osate.xtext.aadl2.mcs.mcs.type_expression;
import org.osate.xtext.aadl2.mcs.mcs.union_type;

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
  private EClass mcsViewpointEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enforcement_policyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packageScriptEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass appliesToClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classifierCategoryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureGroupClassifierReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass viewpointReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constraintsBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass labelled_check_statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass check_statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass block_label_idEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass check_label_idEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass check_theoremEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modeSpecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modeNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass check_assertionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass root_elementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass element_referenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass containmentPathElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arrayRangeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packageEnforceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assertion_expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass string_expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constant_expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

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
  private EClass classifierEnforceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classifierScriptEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass function_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass argumentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass theorem_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass in_modes_listEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass local_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass theorem_statementEClass = null;

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
  private EClass unnamedFunctionTypeEClass = null;

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
  private EClass map_typeEClass = null;

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
  private EClass t_classifiersEClass = null;

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
  private EClass t_named_referencesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mcsClosureEClass = null;

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
    XbasePackage.eINSTANCE.eClass();
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
  public EReference getMCSGrammarRoot_Subclause()
  {
    return (EReference)mcsGrammarRootEClass.getEStructuralFeatures().get(1);
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
  public EReference getMCSAnnexLibrary_Viewpoints()
  {
    return (EReference)mcsAnnexLibraryEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMCSAnnexLibrary_Enforceclauses()
  {
    return (EReference)mcsAnnexLibraryEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gettype_declaration()
  {
    return type_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gettype_declaration_Name()
  {
    return (EAttribute)type_declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference gettype_declaration_Type()
  {
    return (EReference)type_declarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getconstant_declaration()
  {
    return constant_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getconstant_declaration_Const()
  {
    return (EAttribute)constant_declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getconstant_declaration_Name()
  {
    return (EAttribute)constant_declarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getconstant_declaration_Type()
  {
    return (EReference)constant_declarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getconstant_declaration_Left_expr()
  {
    return (EReference)constant_declarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMCSViewpoint()
  {
    return mcsViewpointEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMCSViewpoint_Name()
  {
    return (EAttribute)mcsViewpointEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMCSViewpoint_Policy()
  {
    return (EReference)mcsViewpointEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMCSViewpoint_Pscript()
  {
    return (EReference)mcsViewpointEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnforcement_policy()
  {
    return enforcement_policyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnforcement_policy_Pack()
  {
    return (EAttribute)enforcement_policyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnforcement_policy_Class()
  {
    return (EAttribute)enforcement_policyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPackageScript()
  {
    return packageScriptEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackageScript_Applies()
  {
    return (EReference)packageScriptEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackageScript_C_block()
  {
    return (EReference)packageScriptEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackageScript_Ref()
  {
    return (EReference)packageScriptEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAppliesToClause()
  {
    return appliesToClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAppliesToClause_All()
  {
    return (EAttribute)appliesToClauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAppliesToClause_Category()
  {
    return (EReference)appliesToClauseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassifierCategory()
  {
    return classifierCategoryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClassifierCategory_Component()
  {
    return (EAttribute)classifierCategoryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassifierCategory_Ct()
  {
    return (EReference)classifierCategoryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClassifierCategory_Impl()
  {
    return (EAttribute)classifierCategoryEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassifierCategory_Ci()
  {
    return (EReference)classifierCategoryEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClassifierCategory_Feat_g()
  {
    return (EAttribute)classifierCategoryEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassifierCategory_Ref_to_f()
  {
    return (EReference)classifierCategoryEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeatureGroupClassifierReference()
  {
    return featureGroupClassifierReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeatureGroupClassifierReference_Fg()
  {
    return (EReference)featureGroupClassifierReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getViewpointReference()
  {
    return viewpointReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getViewpointReference_Policy()
  {
    return (EReference)viewpointReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getViewpointReference_Vp_ref()
  {
    return (EReference)viewpointReferenceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstraintsBlock()
  {
    return constraintsBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstraintsBlock_B_label()
  {
    return (EReference)constraintsBlockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstraintsBlock_Cs()
  {
    return (EReference)constraintsBlockEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getlabelled_check_statement()
  {
    return labelled_check_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getlabelled_check_statement_C_label()
  {
    return (EReference)labelled_check_statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getlabelled_check_statement_Cs()
  {
    return (EReference)labelled_check_statementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcheck_statement()
  {
    return check_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcheck_statement_Root()
  {
    return (EReference)check_statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcheck_statement_Inmode()
  {
    return (EReference)check_statementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcheck_statement_Str()
  {
    return (EReference)check_statementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getblock_label_id()
  {
    return block_label_idEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getblock_label_id_Name()
  {
    return (EAttribute)block_label_idEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcheck_label_id()
  {
    return check_label_idEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getcheck_label_id_Name()
  {
    return (EAttribute)check_label_idEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcheck_theorem()
  {
    return check_theoremEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcheck_theorem_Name()
  {
    return (EReference)check_theoremEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModeSpec()
  {
    return modeSpecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModeSpec_Mode()
  {
    return (EReference)modeSpecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModeName()
  {
    return modeNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModeName_Name()
  {
    return (EAttribute)modeNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcheck_assertion()
  {
    return check_assertionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcheck_assertion_Expr()
  {
    return (EReference)check_assertionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getroot_element()
  {
    return root_elementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getelement_reference()
  {
    return element_referenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getelement_reference_Self()
  {
    return (EAttribute)element_referenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getelement_reference_Root()
  {
    return (EAttribute)element_referenceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getelement_reference_Currentmode()
  {
    return (EAttribute)element_referenceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getelement_reference_Cref()
  {
    return (EReference)element_referenceEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getelement_reference_PackageName()
  {
    return (EAttribute)element_referenceEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getelement_reference_Ref()
  {
    return (EReference)element_referenceEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContainmentPathElement()
  {
    return containmentPathElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContainmentPathElement_NamedElement()
  {
    return (EReference)containmentPathElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContainmentPathElement_ArrayRange()
  {
    return (EReference)containmentPathElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContainmentPathElement_Path()
  {
    return (EReference)containmentPathElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArrayRange()
  {
    return arrayRangeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArrayRange_LowerBound()
  {
    return (EAttribute)arrayRangeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArrayRange_UpperBound()
  {
    return (EAttribute)arrayRangeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPackageEnforce()
  {
    return packageEnforceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackageEnforce_Viewpoint()
  {
    return (EReference)packageEnforceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getassertion_expression()
  {
    return assertion_expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getassertion_expression_Expr()
  {
    return (EReference)assertion_expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getstring_expression()
  {
    return string_expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstring_expression_Expr()
  {
    return (EReference)string_expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getconstant_expression()
  {
    return constant_expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getexpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getexpression_Name()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(0);
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
  public EReference getMCSAnnexSubclause_Types()
  {
    return (EReference)mcsAnnexSubclauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMCSAnnexSubclause_Constants()
  {
    return (EReference)mcsAnnexSubclauseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMCSAnnexSubclause_Functions()
  {
    return (EReference)mcsAnnexSubclauseEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMCSAnnexSubclause_Theorems()
  {
    return (EReference)mcsAnnexSubclauseEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMCSAnnexSubclause_Enforceclauses()
  {
    return (EReference)mcsAnnexSubclauseEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassifierEnforce()
  {
    return classifierEnforceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassifierEnforce_Viewpoint()
  {
    return (EReference)classifierEnforceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassifierEnforce_Script()
  {
    return (EReference)classifierEnforceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassifierScript()
  {
    return classifierScriptEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassifierScript_C_block()
  {
    return (EReference)classifierScriptEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassifierScript_Ref()
  {
    return (EReference)classifierScriptEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfunction_declaration()
  {
    return function_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfunction_declaration_Name()
  {
    return (EAttribute)function_declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfunction_declaration_Arg()
  {
    return (EReference)function_declarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfunction_declaration_Out()
  {
    return (EReference)function_declarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfunction_declaration_Ftype()
  {
    return (EReference)function_declarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfunction_declaration_Typeref()
  {
    return (EReference)function_declarationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfunction_declaration_Closure()
  {
    return (EReference)function_declarationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfunction_declaration_Exp_body()
  {
    return (EReference)function_declarationEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getargument()
  {
    return argumentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getargument_Name()
  {
    return (EAttribute)argumentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getargument_Arg_type()
  {
    return (EReference)argumentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gettheorem_declaration()
  {
    return theorem_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gettheorem_declaration_Name()
  {
    return (EAttribute)theorem_declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gettheorem_declaration_Ml()
  {
    return (EAttribute)theorem_declarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference gettheorem_declaration_Locals()
  {
    return (EReference)theorem_declarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference gettheorem_declaration_Statements()
  {
    return (EReference)theorem_declarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference gettheorem_declaration_Endname()
  {
    return (EReference)theorem_declarationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getin_modes_list()
  {
    return in_modes_listEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getin_modes_list_Modes()
  {
    return (EAttribute)in_modes_listEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getlocal_declaration()
  {
    return local_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getlocal_declaration_Const()
  {
    return (EAttribute)local_declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getlocal_declaration_Name()
  {
    return (EAttribute)local_declarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getlocal_declaration_Type()
  {
    return (EReference)local_declarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getlocal_declaration_Left_expr()
  {
    return (EReference)local_declarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gettheorem_statement()
  {
    return theorem_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference gettheorem_statement_Statement()
  {
    return (EReference)theorem_statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gettype_expression()
  {
    return type_expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference gettype_expression_Basic()
  {
    return (EReference)type_expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference gettype_expression_Composite()
  {
    return (EReference)type_expressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference gettype_expression_Element()
  {
    return (EReference)type_expressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbasic_type()
  {
    return basic_typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getbasic_type_Bool()
  {
    return (EReference)basic_typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getbasic_type_String()
  {
    return (EReference)basic_typeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getbasic_type_Enumer()
  {
    return (EReference)basic_typeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getbasic_type_Units()
  {
    return (EReference)basic_typeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getbasic_type_Integer()
  {
    return (EReference)basic_typeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getbasic_type_Real()
  {
    return (EReference)basic_typeEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getbasic_type_Range()
  {
    return (EReference)basic_typeEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getbasic_type_Class()
  {
    return (EReference)basic_typeEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getbasic_type_Ref()
  {
    return (EReference)basic_typeEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getbasic_type_Func()
  {
    return (EReference)basic_typeEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getbasic_type_Typename()
  {
    return (EReference)basic_typeEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnnamedFunctionType()
  {
    return unnamedFunctionTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnnamedFunctionType_Parm()
  {
    return (EReference)unnamedFunctionTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnnamedFunctionType_Outspec()
  {
    return (EAttribute)unnamedFunctionTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnnamedFunctionType_Result()
  {
    return (EReference)unnamedFunctionTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcomposite_type()
  {
    return composite_typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getset_type()
  {
    return set_typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getset_type_Type()
  {
    return (EReference)set_typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getlist_type()
  {
    return list_typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getlist_type_Type()
  {
    return (EReference)list_typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getmap_type()
  {
    return map_typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getmap_type_Type()
  {
    return (EReference)map_typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getrecord_type()
  {
    return record_typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getrecord_type_Field()
  {
    return (EReference)record_typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getunion_type()
  {
    return union_typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getunion_type_Typename()
  {
    return (EAttribute)union_typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getunion_type_Type()
  {
    return (EReference)union_typeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getid_type_pair()
  {
    return id_type_pairEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getid_type_pair_Name()
  {
    return (EAttribute)id_type_pairEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getid_type_pair_Type()
  {
    return (EReference)id_type_pairEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getelement_type()
  {
    return element_typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getelement_type_Telem()
  {
    return (EAttribute)element_typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getelement_type_T_class()
  {
    return (EAttribute)element_typeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getelement_type_T_ref()
  {
    return (EAttribute)element_typeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gett_classifiers()
  {
    return t_classifiersEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_classifiers_T_class()
  {
    return (EAttribute)t_classifiersEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_classifiers_T_class_subtype()
  {
    return (EAttribute)t_classifiersEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gett_classifier_subtypes()
  {
    return t_classifier_subtypesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_classifier_subtypes_T_ctype()
  {
    return (EAttribute)t_classifier_subtypesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_classifier_subtypes_T_cimpl()
  {
    return (EAttribute)t_classifier_subtypesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_classifier_subtypes_T_fgclass()
  {
    return (EAttribute)t_classifier_subtypesEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_classifier_subtypes_T_annexclass()
  {
    return (EAttribute)t_classifier_subtypesEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gett_named_references()
  {
    return t_named_referencesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gett_named_references_T_nref()
  {
    return (EAttribute)t_named_referencesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMCSClosure()
  {
    return mcsClosureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMCSClosure_DeclaredFormalParameters()
  {
    return (EReference)mcsClosureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMCSClosure_ExplicitSyntax()
  {
    return (EAttribute)mcsClosureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMCSClosure_Expression()
  {
    return (EReference)mcsClosureEClass.getEStructuralFeatures().get(2);
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
    createEReference(mcsGrammarRootEClass, MCS_GRAMMAR_ROOT__SUBCLAUSE);

    mcsAnnexLibraryEClass = createEClass(MCS_ANNEX_LIBRARY);
    createEReference(mcsAnnexLibraryEClass, MCS_ANNEX_LIBRARY__TYPES);
    createEReference(mcsAnnexLibraryEClass, MCS_ANNEX_LIBRARY__CONSTANTS);
    createEReference(mcsAnnexLibraryEClass, MCS_ANNEX_LIBRARY__FUNCTIONS);
    createEReference(mcsAnnexLibraryEClass, MCS_ANNEX_LIBRARY__THEOREMS);
    createEReference(mcsAnnexLibraryEClass, MCS_ANNEX_LIBRARY__VIEWPOINTS);
    createEReference(mcsAnnexLibraryEClass, MCS_ANNEX_LIBRARY__ENFORCECLAUSES);

    type_declarationEClass = createEClass(TYPE_DECLARATION);
    createEAttribute(type_declarationEClass, TYPE_DECLARATION__NAME);
    createEReference(type_declarationEClass, TYPE_DECLARATION__TYPE);

    constant_declarationEClass = createEClass(CONSTANT_DECLARATION);
    createEAttribute(constant_declarationEClass, CONSTANT_DECLARATION__CONST);
    createEAttribute(constant_declarationEClass, CONSTANT_DECLARATION__NAME);
    createEReference(constant_declarationEClass, CONSTANT_DECLARATION__TYPE);
    createEReference(constant_declarationEClass, CONSTANT_DECLARATION__LEFT_EXPR);

    mcsViewpointEClass = createEClass(MCS_VIEWPOINT);
    createEAttribute(mcsViewpointEClass, MCS_VIEWPOINT__NAME);
    createEReference(mcsViewpointEClass, MCS_VIEWPOINT__POLICY);
    createEReference(mcsViewpointEClass, MCS_VIEWPOINT__PSCRIPT);

    enforcement_policyEClass = createEClass(ENFORCEMENT_POLICY);
    createEAttribute(enforcement_policyEClass, ENFORCEMENT_POLICY__PACK);
    createEAttribute(enforcement_policyEClass, ENFORCEMENT_POLICY__CLASS);

    packageScriptEClass = createEClass(PACKAGE_SCRIPT);
    createEReference(packageScriptEClass, PACKAGE_SCRIPT__APPLIES);
    createEReference(packageScriptEClass, PACKAGE_SCRIPT__CBLOCK);
    createEReference(packageScriptEClass, PACKAGE_SCRIPT__REF);

    appliesToClauseEClass = createEClass(APPLIES_TO_CLAUSE);
    createEAttribute(appliesToClauseEClass, APPLIES_TO_CLAUSE__ALL);
    createEReference(appliesToClauseEClass, APPLIES_TO_CLAUSE__CATEGORY);

    classifierCategoryEClass = createEClass(CLASSIFIER_CATEGORY);
    createEAttribute(classifierCategoryEClass, CLASSIFIER_CATEGORY__COMPONENT);
    createEReference(classifierCategoryEClass, CLASSIFIER_CATEGORY__CT);
    createEAttribute(classifierCategoryEClass, CLASSIFIER_CATEGORY__IMPL);
    createEReference(classifierCategoryEClass, CLASSIFIER_CATEGORY__CI);
    createEAttribute(classifierCategoryEClass, CLASSIFIER_CATEGORY__FEAT_G);
    createEReference(classifierCategoryEClass, CLASSIFIER_CATEGORY__REF_TO_F);

    featureGroupClassifierReferenceEClass = createEClass(FEATURE_GROUP_CLASSIFIER_REFERENCE);
    createEReference(featureGroupClassifierReferenceEClass, FEATURE_GROUP_CLASSIFIER_REFERENCE__FG);

    viewpointReferenceEClass = createEClass(VIEWPOINT_REFERENCE);
    createEReference(viewpointReferenceEClass, VIEWPOINT_REFERENCE__POLICY);
    createEReference(viewpointReferenceEClass, VIEWPOINT_REFERENCE__VP_REF);

    constraintsBlockEClass = createEClass(CONSTRAINTS_BLOCK);
    createEReference(constraintsBlockEClass, CONSTRAINTS_BLOCK__BLABEL);
    createEReference(constraintsBlockEClass, CONSTRAINTS_BLOCK__CS);

    labelled_check_statementEClass = createEClass(LABELLED_CHECK_STATEMENT);
    createEReference(labelled_check_statementEClass, LABELLED_CHECK_STATEMENT__CLABEL);
    createEReference(labelled_check_statementEClass, LABELLED_CHECK_STATEMENT__CS);

    check_statementEClass = createEClass(CHECK_STATEMENT);
    createEReference(check_statementEClass, CHECK_STATEMENT__ROOT);
    createEReference(check_statementEClass, CHECK_STATEMENT__INMODE);
    createEReference(check_statementEClass, CHECK_STATEMENT__STR);

    block_label_idEClass = createEClass(BLOCK_LABEL_ID);
    createEAttribute(block_label_idEClass, BLOCK_LABEL_ID__NAME);

    check_label_idEClass = createEClass(CHECK_LABEL_ID);
    createEAttribute(check_label_idEClass, CHECK_LABEL_ID__NAME);

    check_theoremEClass = createEClass(CHECK_THEOREM);
    createEReference(check_theoremEClass, CHECK_THEOREM__NAME);

    modeSpecEClass = createEClass(MODE_SPEC);
    createEReference(modeSpecEClass, MODE_SPEC__MODE);

    modeNameEClass = createEClass(MODE_NAME);
    createEAttribute(modeNameEClass, MODE_NAME__NAME);

    check_assertionEClass = createEClass(CHECK_ASSERTION);
    createEReference(check_assertionEClass, CHECK_ASSERTION__EXPR);

    root_elementEClass = createEClass(ROOT_ELEMENT);

    element_referenceEClass = createEClass(ELEMENT_REFERENCE);
    createEAttribute(element_referenceEClass, ELEMENT_REFERENCE__SELF);
    createEAttribute(element_referenceEClass, ELEMENT_REFERENCE__ROOT);
    createEAttribute(element_referenceEClass, ELEMENT_REFERENCE__CURRENTMODE);
    createEReference(element_referenceEClass, ELEMENT_REFERENCE__CREF);
    createEAttribute(element_referenceEClass, ELEMENT_REFERENCE__PACKAGE_NAME);
    createEReference(element_referenceEClass, ELEMENT_REFERENCE__REF);

    containmentPathElementEClass = createEClass(CONTAINMENT_PATH_ELEMENT);
    createEReference(containmentPathElementEClass, CONTAINMENT_PATH_ELEMENT__NAMED_ELEMENT);
    createEReference(containmentPathElementEClass, CONTAINMENT_PATH_ELEMENT__ARRAY_RANGE);
    createEReference(containmentPathElementEClass, CONTAINMENT_PATH_ELEMENT__PATH);

    arrayRangeEClass = createEClass(ARRAY_RANGE);
    createEAttribute(arrayRangeEClass, ARRAY_RANGE__LOWER_BOUND);
    createEAttribute(arrayRangeEClass, ARRAY_RANGE__UPPER_BOUND);

    packageEnforceEClass = createEClass(PACKAGE_ENFORCE);
    createEReference(packageEnforceEClass, PACKAGE_ENFORCE__VIEWPOINT);

    assertion_expressionEClass = createEClass(ASSERTION_EXPRESSION);
    createEReference(assertion_expressionEClass, ASSERTION_EXPRESSION__EXPR);

    string_expressionEClass = createEClass(STRING_EXPRESSION);
    createEReference(string_expressionEClass, STRING_EXPRESSION__EXPR);

    constant_expressionEClass = createEClass(CONSTANT_EXPRESSION);

    expressionEClass = createEClass(EXPRESSION);
    createEReference(expressionEClass, EXPRESSION__NAME);

    mcsAnnexSubclauseEClass = createEClass(MCS_ANNEX_SUBCLAUSE);
    createEReference(mcsAnnexSubclauseEClass, MCS_ANNEX_SUBCLAUSE__TYPES);
    createEReference(mcsAnnexSubclauseEClass, MCS_ANNEX_SUBCLAUSE__CONSTANTS);
    createEReference(mcsAnnexSubclauseEClass, MCS_ANNEX_SUBCLAUSE__FUNCTIONS);
    createEReference(mcsAnnexSubclauseEClass, MCS_ANNEX_SUBCLAUSE__THEOREMS);
    createEReference(mcsAnnexSubclauseEClass, MCS_ANNEX_SUBCLAUSE__ENFORCECLAUSES);

    classifierEnforceEClass = createEClass(CLASSIFIER_ENFORCE);
    createEReference(classifierEnforceEClass, CLASSIFIER_ENFORCE__VIEWPOINT);
    createEReference(classifierEnforceEClass, CLASSIFIER_ENFORCE__SCRIPT);

    classifierScriptEClass = createEClass(CLASSIFIER_SCRIPT);
    createEReference(classifierScriptEClass, CLASSIFIER_SCRIPT__CBLOCK);
    createEReference(classifierScriptEClass, CLASSIFIER_SCRIPT__REF);

    function_declarationEClass = createEClass(FUNCTION_DECLARATION);
    createEAttribute(function_declarationEClass, FUNCTION_DECLARATION__NAME);
    createEReference(function_declarationEClass, FUNCTION_DECLARATION__ARG);
    createEReference(function_declarationEClass, FUNCTION_DECLARATION__OUT);
    createEReference(function_declarationEClass, FUNCTION_DECLARATION__FTYPE);
    createEReference(function_declarationEClass, FUNCTION_DECLARATION__TYPEREF);
    createEReference(function_declarationEClass, FUNCTION_DECLARATION__CLOSURE);
    createEReference(function_declarationEClass, FUNCTION_DECLARATION__EXP_BODY);

    argumentEClass = createEClass(ARGUMENT);
    createEAttribute(argumentEClass, ARGUMENT__NAME);
    createEReference(argumentEClass, ARGUMENT__ARG_TYPE);

    theorem_declarationEClass = createEClass(THEOREM_DECLARATION);
    createEAttribute(theorem_declarationEClass, THEOREM_DECLARATION__NAME);
    createEAttribute(theorem_declarationEClass, THEOREM_DECLARATION__ML);
    createEReference(theorem_declarationEClass, THEOREM_DECLARATION__LOCALS);
    createEReference(theorem_declarationEClass, THEOREM_DECLARATION__STATEMENTS);
    createEReference(theorem_declarationEClass, THEOREM_DECLARATION__ENDNAME);

    in_modes_listEClass = createEClass(IN_MODES_LIST);
    createEAttribute(in_modes_listEClass, IN_MODES_LIST__MODES);

    local_declarationEClass = createEClass(LOCAL_DECLARATION);
    createEAttribute(local_declarationEClass, LOCAL_DECLARATION__CONST);
    createEAttribute(local_declarationEClass, LOCAL_DECLARATION__NAME);
    createEReference(local_declarationEClass, LOCAL_DECLARATION__TYPE);
    createEReference(local_declarationEClass, LOCAL_DECLARATION__LEFT_EXPR);

    theorem_statementEClass = createEClass(THEOREM_STATEMENT);
    createEReference(theorem_statementEClass, THEOREM_STATEMENT__STATEMENT);

    type_expressionEClass = createEClass(TYPE_EXPRESSION);
    createEReference(type_expressionEClass, TYPE_EXPRESSION__BASIC);
    createEReference(type_expressionEClass, TYPE_EXPRESSION__COMPOSITE);
    createEReference(type_expressionEClass, TYPE_EXPRESSION__ELEMENT);

    basic_typeEClass = createEClass(BASIC_TYPE);
    createEReference(basic_typeEClass, BASIC_TYPE__BOOL);
    createEReference(basic_typeEClass, BASIC_TYPE__STRING);
    createEReference(basic_typeEClass, BASIC_TYPE__ENUMER);
    createEReference(basic_typeEClass, BASIC_TYPE__UNITS);
    createEReference(basic_typeEClass, BASIC_TYPE__INTEGER);
    createEReference(basic_typeEClass, BASIC_TYPE__REAL);
    createEReference(basic_typeEClass, BASIC_TYPE__RANGE);
    createEReference(basic_typeEClass, BASIC_TYPE__CLASS);
    createEReference(basic_typeEClass, BASIC_TYPE__REF);
    createEReference(basic_typeEClass, BASIC_TYPE__FUNC);
    createEReference(basic_typeEClass, BASIC_TYPE__TYPENAME);

    unnamedFunctionTypeEClass = createEClass(UNNAMED_FUNCTION_TYPE);
    createEReference(unnamedFunctionTypeEClass, UNNAMED_FUNCTION_TYPE__PARM);
    createEAttribute(unnamedFunctionTypeEClass, UNNAMED_FUNCTION_TYPE__OUTSPEC);
    createEReference(unnamedFunctionTypeEClass, UNNAMED_FUNCTION_TYPE__RESULT);

    composite_typeEClass = createEClass(COMPOSITE_TYPE);

    set_typeEClass = createEClass(SET_TYPE);
    createEReference(set_typeEClass, SET_TYPE__TYPE);

    list_typeEClass = createEClass(LIST_TYPE);
    createEReference(list_typeEClass, LIST_TYPE__TYPE);

    map_typeEClass = createEClass(MAP_TYPE);
    createEReference(map_typeEClass, MAP_TYPE__TYPE);

    record_typeEClass = createEClass(RECORD_TYPE);
    createEReference(record_typeEClass, RECORD_TYPE__FIELD);

    union_typeEClass = createEClass(UNION_TYPE);
    createEAttribute(union_typeEClass, UNION_TYPE__TYPENAME);
    createEReference(union_typeEClass, UNION_TYPE__TYPE);

    id_type_pairEClass = createEClass(ID_TYPE_PAIR);
    createEAttribute(id_type_pairEClass, ID_TYPE_PAIR__NAME);
    createEReference(id_type_pairEClass, ID_TYPE_PAIR__TYPE);

    element_typeEClass = createEClass(ELEMENT_TYPE);
    createEAttribute(element_typeEClass, ELEMENT_TYPE__TELEM);
    createEAttribute(element_typeEClass, ELEMENT_TYPE__TCLASS);
    createEAttribute(element_typeEClass, ELEMENT_TYPE__TREF);

    t_classifiersEClass = createEClass(TCLASSIFIERS);
    createEAttribute(t_classifiersEClass, TCLASSIFIERS__TCLASS);
    createEAttribute(t_classifiersEClass, TCLASSIFIERS__TCLASS_SUBTYPE);

    t_classifier_subtypesEClass = createEClass(TCLASSIFIER_SUBTYPES);
    createEAttribute(t_classifier_subtypesEClass, TCLASSIFIER_SUBTYPES__TCTYPE);
    createEAttribute(t_classifier_subtypesEClass, TCLASSIFIER_SUBTYPES__TCIMPL);
    createEAttribute(t_classifier_subtypesEClass, TCLASSIFIER_SUBTYPES__TFGCLASS);
    createEAttribute(t_classifier_subtypesEClass, TCLASSIFIER_SUBTYPES__TANNEXCLASS);

    t_named_referencesEClass = createEClass(TNAMED_REFERENCES);
    createEAttribute(t_named_referencesEClass, TNAMED_REFERENCES__TNREF);

    mcsClosureEClass = createEClass(MCS_CLOSURE);
    createEReference(mcsClosureEClass, MCS_CLOSURE__DECLARED_FORMAL_PARAMETERS);
    createEAttribute(mcsClosureEClass, MCS_CLOSURE__EXPLICIT_SYNTAX);
    createEReference(mcsClosureEClass, MCS_CLOSURE__EXPRESSION);
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
    XbasePackage theXbasePackage = (XbasePackage)EPackage.Registry.INSTANCE.getEPackage(XbasePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    mcsAnnexLibraryEClass.getESuperTypes().add(theAadl2Package.getAnnexLibrary());
    check_theoremEClass.getESuperTypes().add(this.getcheck_statement());
    check_assertionEClass.getESuperTypes().add(this.getcheck_statement());
    element_referenceEClass.getESuperTypes().add(this.getroot_element());
    element_referenceEClass.getESuperTypes().add(theXbasePackage.getXExpression());
    expressionEClass.getESuperTypes().add(this.getconstant_expression());
    mcsAnnexSubclauseEClass.getESuperTypes().add(theAadl2Package.getAnnexSubclause());
    set_typeEClass.getESuperTypes().add(this.getcomposite_type());
    list_typeEClass.getESuperTypes().add(this.getcomposite_type());
    map_typeEClass.getESuperTypes().add(this.getcomposite_type());
    record_typeEClass.getESuperTypes().add(this.getcomposite_type());
    union_typeEClass.getESuperTypes().add(this.getcomposite_type());
    mcsClosureEClass.getESuperTypes().add(theXbasePackage.getXExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(mcsGrammarRootEClass, MCSGrammarRoot.class, "MCSGrammarRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMCSGrammarRoot_Lib(), this.getMCSAnnexLibrary(), null, "lib", null, 0, 1, MCSGrammarRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMCSGrammarRoot_Subclause(), this.getMCSAnnexSubclause(), null, "subclause", null, 0, 1, MCSGrammarRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mcsAnnexLibraryEClass, MCSAnnexLibrary.class, "MCSAnnexLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMCSAnnexLibrary_Types(), this.gettype_declaration(), null, "types", null, 0, -1, MCSAnnexLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMCSAnnexLibrary_Constants(), this.getconstant_declaration(), null, "constants", null, 0, -1, MCSAnnexLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMCSAnnexLibrary_Functions(), this.getfunction_declaration(), null, "functions", null, 0, -1, MCSAnnexLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMCSAnnexLibrary_Theorems(), this.gettheorem_declaration(), null, "theorems", null, 0, -1, MCSAnnexLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMCSAnnexLibrary_Viewpoints(), this.getMCSViewpoint(), null, "viewpoints", null, 0, -1, MCSAnnexLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMCSAnnexLibrary_Enforceclauses(), this.getPackageEnforce(), null, "enforceclauses", null, 0, -1, MCSAnnexLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(type_declarationEClass, type_declaration.class, "type_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(gettype_declaration_Name(), theEcorePackage.getEString(), "name", null, 0, 1, type_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(gettype_declaration_Type(), this.gettype_expression(), null, "type", null, 0, 1, type_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constant_declarationEClass, constant_declaration.class, "constant_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getconstant_declaration_Const(), theEcorePackage.getEBoolean(), "const", null, 0, 1, constant_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getconstant_declaration_Name(), theEcorePackage.getEString(), "name", null, 0, 1, constant_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getconstant_declaration_Type(), this.gettype_expression(), null, "type", null, 0, 1, constant_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getconstant_declaration_Left_expr(), this.getconstant_expression(), null, "left_expr", null, 0, 1, constant_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mcsViewpointEClass, MCSViewpoint.class, "MCSViewpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMCSViewpoint_Name(), theEcorePackage.getEString(), "name", null, 0, 1, MCSViewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMCSViewpoint_Policy(), this.getEnforcement_policy(), null, "policy", null, 0, 1, MCSViewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMCSViewpoint_Pscript(), this.getPackageScript(), null, "pscript", null, 0, 1, MCSViewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enforcement_policyEClass, Enforcement_policy.class, "Enforcement_policy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnforcement_policy_Pack(), theEcorePackage.getEBoolean(), "pack", null, 0, 1, Enforcement_policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEnforcement_policy_Class(), theEcorePackage.getEBoolean(), "class", null, 0, 1, Enforcement_policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(packageScriptEClass, PackageScript.class, "PackageScript", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPackageScript_Applies(), this.getAppliesToClause(), null, "applies", null, 0, -1, PackageScript.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackageScript_C_block(), this.getConstraintsBlock(), null, "c_block", null, 0, -1, PackageScript.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackageScript_Ref(), this.getViewpointReference(), null, "ref", null, 0, 1, PackageScript.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(appliesToClauseEClass, AppliesToClause.class, "AppliesToClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAppliesToClause_All(), theEcorePackage.getEBoolean(), "all", null, 0, 1, AppliesToClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAppliesToClause_Category(), this.getClassifierCategory(), null, "category", null, 0, -1, AppliesToClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classifierCategoryEClass, ClassifierCategory.class, "ClassifierCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getClassifierCategory_Component(), theAadl2Package.getComponentCategory(), "component", null, 0, 1, ClassifierCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClassifierCategory_Ct(), theAadl2Package.getComponentType(), null, "ct", null, 0, 1, ClassifierCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClassifierCategory_Impl(), theEcorePackage.getEBoolean(), "impl", null, 0, 1, ClassifierCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClassifierCategory_Ci(), theAadl2Package.getComponentImplementation(), null, "ci", null, 0, 1, ClassifierCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClassifierCategory_Feat_g(), theEcorePackage.getEBoolean(), "feat_g", null, 0, 1, ClassifierCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClassifierCategory_Ref_to_f(), this.getFeatureGroupClassifierReference(), null, "ref_to_f", null, 0, 1, ClassifierCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(featureGroupClassifierReferenceEClass, FeatureGroupClassifierReference.class, "FeatureGroupClassifierReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFeatureGroupClassifierReference_Fg(), theAadl2Package.getFeatureGroupType(), null, "fg", null, 0, 1, FeatureGroupClassifierReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(viewpointReferenceEClass, ViewpointReference.class, "ViewpointReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getViewpointReference_Policy(), this.getEnforcement_policy(), null, "policy", null, 0, 1, ViewpointReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getViewpointReference_Vp_ref(), this.getMCSViewpoint(), null, "vp_ref", null, 0, 1, ViewpointReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constraintsBlockEClass, ConstraintsBlock.class, "ConstraintsBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConstraintsBlock_B_label(), this.getblock_label_id(), null, "b_label", null, 0, 1, ConstraintsBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstraintsBlock_Cs(), this.getlabelled_check_statement(), null, "cs", null, 0, -1, ConstraintsBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(labelled_check_statementEClass, labelled_check_statement.class, "labelled_check_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getlabelled_check_statement_C_label(), this.getcheck_label_id(), null, "c_label", null, 0, 1, labelled_check_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getlabelled_check_statement_Cs(), this.getcheck_statement(), null, "cs", null, 0, 1, labelled_check_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(check_statementEClass, check_statement.class, "check_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getcheck_statement_Root(), this.getroot_element(), null, "root", null, 0, 1, check_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getcheck_statement_Inmode(), this.getModeSpec(), null, "inmode", null, 0, 1, check_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getcheck_statement_Str(), this.getstring_expression(), null, "str", null, 0, 1, check_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(block_label_idEClass, block_label_id.class, "block_label_id", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getblock_label_id_Name(), theEcorePackage.getEString(), "name", null, 0, 1, block_label_id.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(check_label_idEClass, check_label_id.class, "check_label_id", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getcheck_label_id_Name(), theEcorePackage.getEString(), "name", null, 0, 1, check_label_id.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(check_theoremEClass, check_theorem.class, "check_theorem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getcheck_theorem_Name(), this.gettheorem_declaration(), null, "name", null, 0, 1, check_theorem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modeSpecEClass, ModeSpec.class, "ModeSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModeSpec_Mode(), this.getModeName(), null, "mode", null, 0, 1, ModeSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modeNameEClass, ModeName.class, "ModeName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModeName_Name(), theEcorePackage.getEString(), "name", null, 0, 1, ModeName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(check_assertionEClass, check_assertion.class, "check_assertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getcheck_assertion_Expr(), this.getassertion_expression(), null, "expr", null, 0, 1, check_assertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(root_elementEClass, root_element.class, "root_element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(element_referenceEClass, element_reference.class, "element_reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getelement_reference_Self(), theEcorePackage.getEBoolean(), "self", null, 0, 1, element_reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getelement_reference_Root(), theEcorePackage.getEBoolean(), "root", null, 0, 1, element_reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getelement_reference_Currentmode(), theEcorePackage.getEBoolean(), "currentmode", null, 0, 1, element_reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getelement_reference_Cref(), theAadl2Package.getClassifier(), null, "cref", null, 0, 1, element_reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getelement_reference_PackageName(), theEcorePackage.getEString(), "packageName", null, 0, -1, element_reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getelement_reference_Ref(), this.getContainmentPathElement(), null, "ref", null, 0, 1, element_reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(containmentPathElementEClass, ContainmentPathElement.class, "ContainmentPathElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getContainmentPathElement_NamedElement(), theAadl2Package.getNamedElement(), null, "namedElement", null, 0, 1, ContainmentPathElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContainmentPathElement_ArrayRange(), this.getArrayRange(), null, "arrayRange", null, 0, -1, ContainmentPathElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContainmentPathElement_Path(), this.getContainmentPathElement(), null, "path", null, 0, 1, ContainmentPathElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(arrayRangeEClass, ArrayRange.class, "ArrayRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getArrayRange_LowerBound(), theEcorePackage.getEInt(), "lowerBound", null, 0, 1, ArrayRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArrayRange_UpperBound(), theEcorePackage.getEInt(), "upperBound", null, 0, 1, ArrayRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(packageEnforceEClass, PackageEnforce.class, "PackageEnforce", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPackageEnforce_Viewpoint(), this.getMCSViewpoint(), null, "viewpoint", null, 0, 1, PackageEnforce.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assertion_expressionEClass, assertion_expression.class, "assertion_expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getassertion_expression_Expr(), this.getexpression(), null, "expr", null, 0, 1, assertion_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(string_expressionEClass, string_expression.class, "string_expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getstring_expression_Expr(), this.getexpression(), null, "expr", null, 0, 1, string_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constant_expressionEClass, constant_expression.class, "constant_expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(expressionEClass, expression.class, "expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getexpression_Name(), theXbasePackage.getXExpression(), null, "name", null, 0, 1, expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mcsAnnexSubclauseEClass, MCSAnnexSubclause.class, "MCSAnnexSubclause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMCSAnnexSubclause_Types(), this.gettype_declaration(), null, "types", null, 0, -1, MCSAnnexSubclause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMCSAnnexSubclause_Constants(), this.getconstant_declaration(), null, "constants", null, 0, -1, MCSAnnexSubclause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMCSAnnexSubclause_Functions(), this.getfunction_declaration(), null, "functions", null, 0, -1, MCSAnnexSubclause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMCSAnnexSubclause_Theorems(), this.gettheorem_declaration(), null, "theorems", null, 0, -1, MCSAnnexSubclause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMCSAnnexSubclause_Enforceclauses(), this.getClassifierEnforce(), null, "enforceclauses", null, 0, -1, MCSAnnexSubclause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classifierEnforceEClass, ClassifierEnforce.class, "ClassifierEnforce", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getClassifierEnforce_Viewpoint(), this.getMCSViewpoint(), null, "viewpoint", null, 0, 1, ClassifierEnforce.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClassifierEnforce_Script(), this.getClassifierScript(), null, "script", null, 0, 1, ClassifierEnforce.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classifierScriptEClass, ClassifierScript.class, "ClassifierScript", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getClassifierScript_C_block(), this.getConstraintsBlock(), null, "c_block", null, 0, -1, ClassifierScript.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClassifierScript_Ref(), this.getViewpointReference(), null, "ref", null, 0, 1, ClassifierScript.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(function_declarationEClass, function_declaration.class, "function_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfunction_declaration_Name(), theEcorePackage.getEString(), "name", null, 0, 1, function_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfunction_declaration_Arg(), this.getargument(), null, "arg", null, 0, -1, function_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfunction_declaration_Out(), this.gettype_expression(), null, "out", null, 0, 1, function_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfunction_declaration_Ftype(), this.getUnnamedFunctionType(), null, "ftype", null, 0, 1, function_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfunction_declaration_Typeref(), this.gettype_declaration(), null, "typeref", null, 0, 1, function_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfunction_declaration_Closure(), theXbasePackage.getXExpression(), null, "closure", null, 0, 1, function_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfunction_declaration_Exp_body(), theXbasePackage.getXExpression(), null, "exp_body", null, 0, 1, function_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(argumentEClass, argument.class, "argument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getargument_Name(), theEcorePackage.getEString(), "name", null, 0, 1, argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getargument_Arg_type(), this.gettype_expression(), null, "arg_type", null, 0, 1, argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(theorem_declarationEClass, theorem_declaration.class, "theorem_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(gettheorem_declaration_Name(), theEcorePackage.getEString(), "name", null, 0, 1, theorem_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(gettheorem_declaration_Ml(), theEcorePackage.getEBoolean(), "ml", null, 0, 1, theorem_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(gettheorem_declaration_Locals(), this.getlocal_declaration(), null, "locals", null, 0, -1, theorem_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(gettheorem_declaration_Statements(), this.gettheorem_statement(), null, "statements", null, 0, -1, theorem_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(gettheorem_declaration_Endname(), this.gettheorem_declaration(), null, "endname", null, 0, 1, theorem_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(in_modes_listEClass, in_modes_list.class, "in_modes_list", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getin_modes_list_Modes(), theEcorePackage.getEString(), "modes", null, 0, -1, in_modes_list.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(local_declarationEClass, local_declaration.class, "local_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getlocal_declaration_Const(), theEcorePackage.getEBoolean(), "const", null, 0, 1, local_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getlocal_declaration_Name(), theEcorePackage.getEString(), "name", null, 0, 1, local_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getlocal_declaration_Type(), this.gettype_expression(), null, "type", null, 0, 1, local_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getlocal_declaration_Left_expr(), theEcorePackage.getEObject(), null, "left_expr", null, 0, 1, local_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(theorem_statementEClass, theorem_statement.class, "theorem_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(gettheorem_statement_Statement(), this.getcheck_statement(), null, "statement", null, 0, 1, theorem_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(type_expressionEClass, type_expression.class, "type_expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(gettype_expression_Basic(), this.getbasic_type(), null, "basic", null, 0, 1, type_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(gettype_expression_Composite(), this.getcomposite_type(), null, "composite", null, 0, 1, type_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(gettype_expression_Element(), this.getelement_type(), null, "element", null, 0, 1, type_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(basic_typeEClass, basic_type.class, "basic_type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getbasic_type_Bool(), theAadl2Package.getAadlBoolean(), null, "bool", null, 0, 1, basic_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getbasic_type_String(), theAadl2Package.getAadlString(), null, "string", null, 0, 1, basic_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getbasic_type_Enumer(), theAadl2Package.getEnumerationType(), null, "enumer", null, 0, 1, basic_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getbasic_type_Units(), theAadl2Package.getUnitsType(), null, "units", null, 0, 1, basic_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getbasic_type_Integer(), theAadl2Package.getAadlInteger(), null, "integer", null, 0, 1, basic_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getbasic_type_Real(), theAadl2Package.getAadlReal(), null, "real", null, 0, 1, basic_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getbasic_type_Range(), theAadl2Package.getRangeType(), null, "range", null, 0, 1, basic_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getbasic_type_Class(), theAadl2Package.getClassifierType(), null, "class", null, 0, 1, basic_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getbasic_type_Ref(), theAadl2Package.getReferenceType(), null, "ref", null, 0, 1, basic_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getbasic_type_Func(), this.getUnnamedFunctionType(), null, "func", null, 0, 1, basic_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getbasic_type_Typename(), this.gettype_declaration(), null, "typename", null, 0, 1, basic_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unnamedFunctionTypeEClass, UnnamedFunctionType.class, "UnnamedFunctionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUnnamedFunctionType_Parm(), this.gettype_expression(), null, "parm", null, 0, -1, UnnamedFunctionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUnnamedFunctionType_Outspec(), theEcorePackage.getEBoolean(), "outspec", null, 0, 1, UnnamedFunctionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUnnamedFunctionType_Result(), this.gettype_expression(), null, "result", null, 0, 1, UnnamedFunctionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(composite_typeEClass, composite_type.class, "composite_type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(set_typeEClass, set_type.class, "set_type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getset_type_Type(), this.gettype_expression(), null, "type", null, 0, 1, set_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(list_typeEClass, list_type.class, "list_type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getlist_type_Type(), this.gettype_expression(), null, "type", null, 0, 1, list_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(map_typeEClass, map_type.class, "map_type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getmap_type_Type(), this.gettype_expression(), null, "type", null, 0, 1, map_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(record_typeEClass, record_type.class, "record_type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getrecord_type_Field(), this.getid_type_pair(), null, "field", null, 0, -1, record_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(union_typeEClass, union_type.class, "union_type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getunion_type_Typename(), theEcorePackage.getEString(), "typename", null, 0, -1, union_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getunion_type_Type(), this.gettype_expression(), null, "type", null, 0, -1, union_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(id_type_pairEClass, id_type_pair.class, "id_type_pair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getid_type_pair_Name(), theEcorePackage.getEString(), "name", null, 0, 1, id_type_pair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getid_type_pair_Type(), this.gettype_expression(), null, "type", null, 0, 1, id_type_pair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(element_typeEClass, element_type.class, "element_type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getelement_type_Telem(), theEcorePackage.getEBoolean(), "telem", null, 0, 1, element_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getelement_type_T_class(), theEcorePackage.getEBoolean(), "t_class", null, 0, 1, element_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getelement_type_T_ref(), theEcorePackage.getEBoolean(), "t_ref", null, 0, 1, element_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(t_classifiersEClass, t_classifiers.class, "t_classifiers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(gett_classifiers_T_class(), theEcorePackage.getEBoolean(), "t_class", null, 0, 1, t_classifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(gett_classifiers_T_class_subtype(), theEcorePackage.getEBoolean(), "t_class_subtype", null, 0, 1, t_classifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(t_classifier_subtypesEClass, t_classifier_subtypes.class, "t_classifier_subtypes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(gett_classifier_subtypes_T_ctype(), theEcorePackage.getEBoolean(), "t_ctype", null, 0, 1, t_classifier_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(gett_classifier_subtypes_T_cimpl(), theEcorePackage.getEBoolean(), "t_cimpl", null, 0, 1, t_classifier_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(gett_classifier_subtypes_T_fgclass(), theEcorePackage.getEBoolean(), "t_fgclass", null, 0, 1, t_classifier_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(gett_classifier_subtypes_T_annexclass(), theEcorePackage.getEBoolean(), "t_annexclass", null, 0, 1, t_classifier_subtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(t_named_referencesEClass, t_named_references.class, "t_named_references", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(gett_named_references_T_nref(), theEcorePackage.getEBoolean(), "t_nref", null, 0, 1, t_named_references.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mcsClosureEClass, MCSClosure.class, "MCSClosure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMCSClosure_DeclaredFormalParameters(), this.getargument(), null, "declaredFormalParameters", null, 0, -1, MCSClosure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMCSClosure_ExplicitSyntax(), theEcorePackage.getEBoolean(), "explicitSyntax", null, 0, 1, MCSClosure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMCSClosure_Expression(), theXbasePackage.getXExpression(), null, "expression", null, 0, 1, MCSClosure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //McsPackageImpl
