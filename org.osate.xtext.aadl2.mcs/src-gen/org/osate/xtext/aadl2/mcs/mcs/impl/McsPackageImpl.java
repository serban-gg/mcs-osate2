/**
 */
package org.osate.xtext.aadl2.mcs.mcs.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.osate.aadl2.Aadl2Package;

import org.osate.xtext.aadl2.mcs.mcs.AppliesToClause;
import org.osate.xtext.aadl2.mcs.mcs.ClassifierCategory;
import org.osate.xtext.aadl2.mcs.mcs.ClassifierEnforce;
import org.osate.xtext.aadl2.mcs.mcs.ClassifierScript;
import org.osate.xtext.aadl2.mcs.mcs.ConstraintsBlock;
import org.osate.xtext.aadl2.mcs.mcs.Enforcement_policy;
import org.osate.xtext.aadl2.mcs.mcs.FeatureGroupClassifierReference;
import org.osate.xtext.aadl2.mcs.mcs.MCSAnnexLibrary;
import org.osate.xtext.aadl2.mcs.mcs.MCSAnnexSubclause;
import org.osate.xtext.aadl2.mcs.mcs.MCSGrammarRoot;
import org.osate.xtext.aadl2.mcs.mcs.MCSViewpoint;
import org.osate.xtext.aadl2.mcs.mcs.McsFactory;
import org.osate.xtext.aadl2.mcs.mcs.McsPackage;
import org.osate.xtext.aadl2.mcs.mcs.ModeName;
import org.osate.xtext.aadl2.mcs.mcs.ModeSpec;
import org.osate.xtext.aadl2.mcs.mcs.PackageEnforce;
import org.osate.xtext.aadl2.mcs.mcs.PackageScript;
import org.osate.xtext.aadl2.mcs.mcs.ViewpointReference;
import org.osate.xtext.aadl2.mcs.mcs.assertion_expression;
import org.osate.xtext.aadl2.mcs.mcs.basic_type;
import org.osate.xtext.aadl2.mcs.mcs.block_label_id;
import org.osate.xtext.aadl2.mcs.mcs.check_assertion;
import org.osate.xtext.aadl2.mcs.mcs.check_label_id;
import org.osate.xtext.aadl2.mcs.mcs.check_statement;
import org.osate.xtext.aadl2.mcs.mcs.check_theorem;
import org.osate.xtext.aadl2.mcs.mcs.constant_declaration;
import org.osate.xtext.aadl2.mcs.mcs.constant_expression;
import org.osate.xtext.aadl2.mcs.mcs.constant_identifier;
import org.osate.xtext.aadl2.mcs.mcs.element_reference;
import org.osate.xtext.aadl2.mcs.mcs.expression;
import org.osate.xtext.aadl2.mcs.mcs.in_modes_list;
import org.osate.xtext.aadl2.mcs.mcs.labelled_check_statement;
import org.osate.xtext.aadl2.mcs.mcs.local_declaration;
import org.osate.xtext.aadl2.mcs.mcs.root_element;
import org.osate.xtext.aadl2.mcs.mcs.string_expression;
import org.osate.xtext.aadl2.mcs.mcs.theorem_declaration;
import org.osate.xtext.aadl2.mcs.mcs.theorem_statements;
import org.osate.xtext.aadl2.mcs.mcs.type_expression;

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
  private EClass packageEnforceEClass = null;

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
  private EClass constant_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constant_identifierEClass = null;

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
  private EClass constant_expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass theorem_statementsEClass = null;

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
  public EReference getMCSAnnexLibrary_Theorems()
  {
    return (EReference)mcsAnnexLibraryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMCSAnnexLibrary_Viewpoints()
  {
    return (EReference)mcsAnnexLibraryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMCSAnnexLibrary_Enforceclauses()
  {
    return (EReference)mcsAnnexLibraryEClass.getEStructuralFeatures().get(2);
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
  public EReference getcheck_theorem_Theo()
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
  public EAttribute getelement_reference_Name()
  {
    return (EAttribute)element_referenceEClass.getEStructuralFeatures().get(0);
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
  public EClass getexpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getexpression_Expr()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(0);
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
  public EClass getMCSAnnexSubclause()
  {
    return mcsAnnexSubclauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMCSAnnexSubclause_Theorems()
  {
    return (EReference)mcsAnnexSubclauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMCSAnnexSubclause_Enforceclauses()
  {
    return (EReference)mcsAnnexSubclauseEClass.getEStructuralFeatures().get(1);
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
  public EAttribute gettheorem_declaration_Endname()
  {
    return (EAttribute)theorem_declarationEClass.getEStructuralFeatures().get(4);
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
  public EClass getconstant_declaration()
  {
    return constant_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getconstant_identifier()
  {
    return constant_identifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getconstant_identifier_Type()
  {
    return (EReference)constant_identifierEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getconstant_identifier_Left_expr()
  {
    return (EReference)constant_identifierEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getconstant_identifier_Name()
  {
    return (EAttribute)constant_identifierEClass.getEStructuralFeatures().get(2);
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
  public EClass getconstant_expression()
  {
    return constant_expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gettheorem_statements()
  {
    return theorem_statementsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gettheorem_statements_Statements()
  {
    return (EAttribute)theorem_statementsEClass.getEStructuralFeatures().get(0);
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
    createEReference(mcsAnnexLibraryEClass, MCS_ANNEX_LIBRARY__THEOREMS);
    createEReference(mcsAnnexLibraryEClass, MCS_ANNEX_LIBRARY__VIEWPOINTS);
    createEReference(mcsAnnexLibraryEClass, MCS_ANNEX_LIBRARY__ENFORCECLAUSES);

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
    createEReference(check_theoremEClass, CHECK_THEOREM__THEO);

    modeSpecEClass = createEClass(MODE_SPEC);
    createEReference(modeSpecEClass, MODE_SPEC__MODE);

    modeNameEClass = createEClass(MODE_NAME);
    createEAttribute(modeNameEClass, MODE_NAME__NAME);

    check_assertionEClass = createEClass(CHECK_ASSERTION);
    createEReference(check_assertionEClass, CHECK_ASSERTION__EXPR);

    root_elementEClass = createEClass(ROOT_ELEMENT);

    element_referenceEClass = createEClass(ELEMENT_REFERENCE);
    createEAttribute(element_referenceEClass, ELEMENT_REFERENCE__NAME);

    packageEnforceEClass = createEClass(PACKAGE_ENFORCE);
    createEReference(packageEnforceEClass, PACKAGE_ENFORCE__VIEWPOINT);

    expressionEClass = createEClass(EXPRESSION);
    createEReference(expressionEClass, EXPRESSION__EXPR);

    assertion_expressionEClass = createEClass(ASSERTION_EXPRESSION);
    createEReference(assertion_expressionEClass, ASSERTION_EXPRESSION__EXPR);

    string_expressionEClass = createEClass(STRING_EXPRESSION);
    createEReference(string_expressionEClass, STRING_EXPRESSION__EXPR);

    mcsAnnexSubclauseEClass = createEClass(MCS_ANNEX_SUBCLAUSE);
    createEReference(mcsAnnexSubclauseEClass, MCS_ANNEX_SUBCLAUSE__THEOREMS);
    createEReference(mcsAnnexSubclauseEClass, MCS_ANNEX_SUBCLAUSE__ENFORCECLAUSES);

    classifierEnforceEClass = createEClass(CLASSIFIER_ENFORCE);
    createEReference(classifierEnforceEClass, CLASSIFIER_ENFORCE__VIEWPOINT);
    createEReference(classifierEnforceEClass, CLASSIFIER_ENFORCE__SCRIPT);

    classifierScriptEClass = createEClass(CLASSIFIER_SCRIPT);
    createEReference(classifierScriptEClass, CLASSIFIER_SCRIPT__CBLOCK);
    createEReference(classifierScriptEClass, CLASSIFIER_SCRIPT__REF);

    theorem_declarationEClass = createEClass(THEOREM_DECLARATION);
    createEAttribute(theorem_declarationEClass, THEOREM_DECLARATION__NAME);
    createEAttribute(theorem_declarationEClass, THEOREM_DECLARATION__ML);
    createEReference(theorem_declarationEClass, THEOREM_DECLARATION__LOCALS);
    createEReference(theorem_declarationEClass, THEOREM_DECLARATION__STATEMENTS);
    createEAttribute(theorem_declarationEClass, THEOREM_DECLARATION__ENDNAME);

    in_modes_listEClass = createEClass(IN_MODES_LIST);
    createEAttribute(in_modes_listEClass, IN_MODES_LIST__MODES);

    local_declarationEClass = createEClass(LOCAL_DECLARATION);

    constant_declarationEClass = createEClass(CONSTANT_DECLARATION);

    constant_identifierEClass = createEClass(CONSTANT_IDENTIFIER);
    createEReference(constant_identifierEClass, CONSTANT_IDENTIFIER__TYPE);
    createEReference(constant_identifierEClass, CONSTANT_IDENTIFIER__LEFT_EXPR);
    createEAttribute(constant_identifierEClass, CONSTANT_IDENTIFIER__NAME);

    type_expressionEClass = createEClass(TYPE_EXPRESSION);

    basic_typeEClass = createEClass(BASIC_TYPE);
    createEReference(basic_typeEClass, BASIC_TYPE__BOOL);
    createEReference(basic_typeEClass, BASIC_TYPE__STRING);

    constant_expressionEClass = createEClass(CONSTANT_EXPRESSION);

    theorem_statementsEClass = createEClass(THEOREM_STATEMENTS);
    createEAttribute(theorem_statementsEClass, THEOREM_STATEMENTS__STATEMENTS);
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

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    mcsAnnexLibraryEClass.getESuperTypes().add(theAadl2Package.getAnnexLibrary());
    check_theoremEClass.getESuperTypes().add(this.getcheck_statement());
    check_assertionEClass.getESuperTypes().add(this.getcheck_statement());
    element_referenceEClass.getESuperTypes().add(this.getroot_element());
    expressionEClass.getESuperTypes().add(this.getconstant_expression());
    mcsAnnexSubclauseEClass.getESuperTypes().add(theAadl2Package.getAnnexSubclause());
    constant_declarationEClass.getESuperTypes().add(this.getlocal_declaration());
    constant_identifierEClass.getESuperTypes().add(this.getconstant_declaration());
    basic_typeEClass.getESuperTypes().add(this.gettype_expression());

    // Initialize classes and features; add operations and parameters
    initEClass(mcsGrammarRootEClass, MCSGrammarRoot.class, "MCSGrammarRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMCSGrammarRoot_Lib(), this.getMCSAnnexLibrary(), null, "lib", null, 0, 1, MCSGrammarRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMCSGrammarRoot_Subclause(), this.getMCSAnnexSubclause(), null, "subclause", null, 0, 1, MCSGrammarRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mcsAnnexLibraryEClass, MCSAnnexLibrary.class, "MCSAnnexLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMCSAnnexLibrary_Theorems(), this.gettheorem_declaration(), null, "theorems", null, 0, -1, MCSAnnexLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMCSAnnexLibrary_Viewpoints(), this.getMCSViewpoint(), null, "viewpoints", null, 0, -1, MCSAnnexLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMCSAnnexLibrary_Enforceclauses(), this.getPackageEnforce(), null, "enforceclauses", null, 0, -1, MCSAnnexLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mcsViewpointEClass, MCSViewpoint.class, "MCSViewpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMCSViewpoint_Name(), ecorePackage.getEString(), "name", null, 0, 1, MCSViewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMCSViewpoint_Policy(), this.getEnforcement_policy(), null, "policy", null, 0, 1, MCSViewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMCSViewpoint_Pscript(), this.getPackageScript(), null, "pscript", null, 0, 1, MCSViewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enforcement_policyEClass, Enforcement_policy.class, "Enforcement_policy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnforcement_policy_Pack(), ecorePackage.getEBoolean(), "pack", null, 0, 1, Enforcement_policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEnforcement_policy_Class(), ecorePackage.getEBoolean(), "class", null, 0, 1, Enforcement_policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(packageScriptEClass, PackageScript.class, "PackageScript", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPackageScript_Applies(), this.getAppliesToClause(), null, "applies", null, 0, -1, PackageScript.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackageScript_C_block(), this.getConstraintsBlock(), null, "c_block", null, 0, -1, PackageScript.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackageScript_Ref(), this.getViewpointReference(), null, "ref", null, 0, 1, PackageScript.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(appliesToClauseEClass, AppliesToClause.class, "AppliesToClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAppliesToClause_All(), ecorePackage.getEBoolean(), "all", null, 0, 1, AppliesToClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAppliesToClause_Category(), this.getClassifierCategory(), null, "category", null, 0, 1, AppliesToClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classifierCategoryEClass, ClassifierCategory.class, "ClassifierCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getClassifierCategory_Component(), theAadl2Package.getComponentCategory(), "component", null, 0, 1, ClassifierCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClassifierCategory_Ct(), theAadl2Package.getComponentType(), null, "ct", null, 0, 1, ClassifierCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClassifierCategory_Impl(), ecorePackage.getEBoolean(), "impl", null, 0, 1, ClassifierCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClassifierCategory_Ci(), theAadl2Package.getComponentImplementation(), null, "ci", null, 0, 1, ClassifierCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClassifierCategory_Feat_g(), ecorePackage.getEBoolean(), "feat_g", null, 0, 1, ClassifierCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
    initEAttribute(getblock_label_id_Name(), ecorePackage.getEString(), "name", null, 0, 1, block_label_id.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(check_label_idEClass, check_label_id.class, "check_label_id", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getcheck_label_id_Name(), ecorePackage.getEString(), "name", null, 0, 1, check_label_id.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(check_theoremEClass, check_theorem.class, "check_theorem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getcheck_theorem_Theo(), this.gettheorem_declaration(), null, "theo", null, 0, 1, check_theorem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modeSpecEClass, ModeSpec.class, "ModeSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModeSpec_Mode(), this.getModeName(), null, "mode", null, 0, 1, ModeSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modeNameEClass, ModeName.class, "ModeName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModeName_Name(), ecorePackage.getEString(), "name", null, 0, 1, ModeName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(check_assertionEClass, check_assertion.class, "check_assertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getcheck_assertion_Expr(), this.getassertion_expression(), null, "expr", null, 0, 1, check_assertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(root_elementEClass, root_element.class, "root_element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(element_referenceEClass, element_reference.class, "element_reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getelement_reference_Name(), ecorePackage.getEString(), "name", null, 0, 1, element_reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(packageEnforceEClass, PackageEnforce.class, "PackageEnforce", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPackageEnforce_Viewpoint(), this.getMCSViewpoint(), null, "viewpoint", null, 0, 1, PackageEnforce.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, expression.class, "expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getexpression_Expr(), theAadl2Package.getPropertyExpression(), null, "expr", null, 0, 1, expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assertion_expressionEClass, assertion_expression.class, "assertion_expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getassertion_expression_Expr(), this.getexpression(), null, "expr", null, 0, 1, assertion_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(string_expressionEClass, string_expression.class, "string_expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getstring_expression_Expr(), this.getexpression(), null, "expr", null, 0, 1, string_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mcsAnnexSubclauseEClass, MCSAnnexSubclause.class, "MCSAnnexSubclause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMCSAnnexSubclause_Theorems(), this.gettheorem_declaration(), null, "theorems", null, 0, -1, MCSAnnexSubclause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMCSAnnexSubclause_Enforceclauses(), this.getClassifierEnforce(), null, "enforceclauses", null, 0, -1, MCSAnnexSubclause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classifierEnforceEClass, ClassifierEnforce.class, "ClassifierEnforce", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getClassifierEnforce_Viewpoint(), this.getMCSViewpoint(), null, "viewpoint", null, 0, 1, ClassifierEnforce.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClassifierEnforce_Script(), this.getClassifierScript(), null, "script", null, 0, 1, ClassifierEnforce.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classifierScriptEClass, ClassifierScript.class, "ClassifierScript", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getClassifierScript_C_block(), this.getConstraintsBlock(), null, "c_block", null, 0, -1, ClassifierScript.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClassifierScript_Ref(), this.getViewpointReference(), null, "ref", null, 0, 1, ClassifierScript.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(theorem_declarationEClass, theorem_declaration.class, "theorem_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(gettheorem_declaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, theorem_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(gettheorem_declaration_Ml(), ecorePackage.getEBoolean(), "ml", null, 0, 1, theorem_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(gettheorem_declaration_Locals(), this.getlocal_declaration(), null, "locals", null, 0, -1, theorem_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(gettheorem_declaration_Statements(), this.gettheorem_statements(), null, "statements", null, 0, -1, theorem_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(gettheorem_declaration_Endname(), ecorePackage.getEString(), "endname", null, 0, 1, theorem_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(in_modes_listEClass, in_modes_list.class, "in_modes_list", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getin_modes_list_Modes(), ecorePackage.getEString(), "modes", null, 0, -1, in_modes_list.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(local_declarationEClass, local_declaration.class, "local_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(constant_declarationEClass, constant_declaration.class, "constant_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(constant_identifierEClass, constant_identifier.class, "constant_identifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getconstant_identifier_Type(), this.gettype_expression(), null, "type", null, 0, 1, constant_identifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getconstant_identifier_Left_expr(), this.getconstant_expression(), null, "left_expr", null, 0, 1, constant_identifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getconstant_identifier_Name(), ecorePackage.getEString(), "name", null, 0, 1, constant_identifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(type_expressionEClass, type_expression.class, "type_expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(basic_typeEClass, basic_type.class, "basic_type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getbasic_type_Bool(), theAadl2Package.getAadlBoolean(), null, "bool", null, 0, 1, basic_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getbasic_type_String(), theAadl2Package.getAadlString(), null, "string", null, 0, 1, basic_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constant_expressionEClass, constant_expression.class, "constant_expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(theorem_statementsEClass, theorem_statements.class, "theorem_statements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(gettheorem_statements_Statements(), ecorePackage.getEString(), "statements", null, 0, 1, theorem_statements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //McsPackageImpl
