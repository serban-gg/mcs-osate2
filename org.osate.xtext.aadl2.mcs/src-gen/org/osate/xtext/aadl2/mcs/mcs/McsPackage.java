/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.osate.aadl2.Aadl2Package;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.osate.xtext.aadl2.mcs.mcs.McsFactory
 * @model kind="package"
 * @generated
 */
public interface McsPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "mcs";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.osate.org/xtext/aadl2/mcs/MCS";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "mcs";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  McsPackage eINSTANCE = org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl.init();

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.MCSGrammarRootImpl <em>MCS Grammar Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.MCSGrammarRootImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getMCSGrammarRoot()
   * @generated
   */
  int MCS_GRAMMAR_ROOT = 0;

  /**
   * The feature id for the '<em><b>Lib</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_GRAMMAR_ROOT__LIB = 0;

  /**
   * The feature id for the '<em><b>Subclause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_GRAMMAR_ROOT__SUBCLAUSE = 1;

  /**
   * The number of structural features of the '<em>MCS Grammar Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_GRAMMAR_ROOT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.MCSAnnexLibraryImpl <em>MCS Annex Library</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.MCSAnnexLibraryImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getMCSAnnexLibrary()
   * @generated
   */
  int MCS_ANNEX_LIBRARY = 1;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_ANNEX_LIBRARY__OWNED_ELEMENT = Aadl2Package.ANNEX_LIBRARY__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_ANNEX_LIBRARY__OWNED_COMMENT = Aadl2Package.ANNEX_LIBRARY__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_ANNEX_LIBRARY__NAME = Aadl2Package.ANNEX_LIBRARY__NAME;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_ANNEX_LIBRARY__QUALIFIED_NAME = Aadl2Package.ANNEX_LIBRARY__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_ANNEX_LIBRARY__OWNED_PROPERTY_ASSOCIATION = Aadl2Package.ANNEX_LIBRARY__OWNED_PROPERTY_ASSOCIATION;

  /**
   * The feature id for the '<em><b>Theorems</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_ANNEX_LIBRARY__THEOREMS = Aadl2Package.ANNEX_LIBRARY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Viewpoints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_ANNEX_LIBRARY__VIEWPOINTS = Aadl2Package.ANNEX_LIBRARY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Enforceclauses</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_ANNEX_LIBRARY__ENFORCECLAUSES = Aadl2Package.ANNEX_LIBRARY_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>MCS Annex Library</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_ANNEX_LIBRARY_FEATURE_COUNT = Aadl2Package.ANNEX_LIBRARY_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.MCSViewpointImpl <em>MCS Viewpoint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.MCSViewpointImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getMCSViewpoint()
   * @generated
   */
  int MCS_VIEWPOINT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_VIEWPOINT__NAME = 0;

  /**
   * The feature id for the '<em><b>Policy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_VIEWPOINT__POLICY = 1;

  /**
   * The feature id for the '<em><b>Pscript</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_VIEWPOINT__PSCRIPT = 2;

  /**
   * The number of structural features of the '<em>MCS Viewpoint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_VIEWPOINT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.Enforcement_policyImpl <em>Enforcement policy</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.Enforcement_policyImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getEnforcement_policy()
   * @generated
   */
  int ENFORCEMENT_POLICY = 3;

  /**
   * The feature id for the '<em><b>Pack</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENFORCEMENT_POLICY__PACK = 0;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENFORCEMENT_POLICY__CLASS = 1;

  /**
   * The number of structural features of the '<em>Enforcement policy</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENFORCEMENT_POLICY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.PackageScriptImpl <em>Package Script</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.PackageScriptImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getPackageScript()
   * @generated
   */
  int PACKAGE_SCRIPT = 4;

  /**
   * The feature id for the '<em><b>Applies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_SCRIPT__APPLIES = 0;

  /**
   * The feature id for the '<em><b>Cblock</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_SCRIPT__CBLOCK = 1;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_SCRIPT__REF = 2;

  /**
   * The number of structural features of the '<em>Package Script</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_SCRIPT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.AppliesToClauseImpl <em>Applies To Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.AppliesToClauseImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getAppliesToClause()
   * @generated
   */
  int APPLIES_TO_CLAUSE = 5;

  /**
   * The feature id for the '<em><b>All</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLIES_TO_CLAUSE__ALL = 0;

  /**
   * The feature id for the '<em><b>Category</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLIES_TO_CLAUSE__CATEGORY = 1;

  /**
   * The number of structural features of the '<em>Applies To Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLIES_TO_CLAUSE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.ClassifierCategoryImpl <em>Classifier Category</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.ClassifierCategoryImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getClassifierCategory()
   * @generated
   */
  int CLASSIFIER_CATEGORY = 6;

  /**
   * The feature id for the '<em><b>Component</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER_CATEGORY__COMPONENT = 0;

  /**
   * The feature id for the '<em><b>Ct</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER_CATEGORY__CT = 1;

  /**
   * The feature id for the '<em><b>Impl</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER_CATEGORY__IMPL = 2;

  /**
   * The feature id for the '<em><b>Ci</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER_CATEGORY__CI = 3;

  /**
   * The feature id for the '<em><b>Feat g</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER_CATEGORY__FEAT_G = 4;

  /**
   * The feature id for the '<em><b>Ref to f</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER_CATEGORY__REF_TO_F = 5;

  /**
   * The number of structural features of the '<em>Classifier Category</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER_CATEGORY_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.FeatureGroupClassifierReferenceImpl <em>Feature Group Classifier Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.FeatureGroupClassifierReferenceImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getFeatureGroupClassifierReference()
   * @generated
   */
  int FEATURE_GROUP_CLASSIFIER_REFERENCE = 7;

  /**
   * The feature id for the '<em><b>Fg</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_GROUP_CLASSIFIER_REFERENCE__FG = 0;

  /**
   * The number of structural features of the '<em>Feature Group Classifier Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_GROUP_CLASSIFIER_REFERENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.ViewpointReferenceImpl <em>Viewpoint Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.ViewpointReferenceImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getViewpointReference()
   * @generated
   */
  int VIEWPOINT_REFERENCE = 8;

  /**
   * The feature id for the '<em><b>Policy</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEWPOINT_REFERENCE__POLICY = 0;

  /**
   * The feature id for the '<em><b>Vp ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEWPOINT_REFERENCE__VP_REF = 1;

  /**
   * The number of structural features of the '<em>Viewpoint Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEWPOINT_REFERENCE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.ConstraintsBlockImpl <em>Constraints Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.ConstraintsBlockImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getConstraintsBlock()
   * @generated
   */
  int CONSTRAINTS_BLOCK = 9;

  /**
   * The feature id for the '<em><b>Blabel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINTS_BLOCK__BLABEL = 0;

  /**
   * The feature id for the '<em><b>Cs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINTS_BLOCK__CS = 1;

  /**
   * The number of structural features of the '<em>Constraints Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINTS_BLOCK_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.labelled_check_statementImpl <em>labelled check statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.labelled_check_statementImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getlabelled_check_statement()
   * @generated
   */
  int LABELLED_CHECK_STATEMENT = 10;

  /**
   * The feature id for the '<em><b>Clabel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABELLED_CHECK_STATEMENT__CLABEL = 0;

  /**
   * The feature id for the '<em><b>Cs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABELLED_CHECK_STATEMENT__CS = 1;

  /**
   * The number of structural features of the '<em>labelled check statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABELLED_CHECK_STATEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.check_statementImpl <em>check statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.check_statementImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getcheck_statement()
   * @generated
   */
  int CHECK_STATEMENT = 11;

  /**
   * The feature id for the '<em><b>Root</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_STATEMENT__ROOT = 0;

  /**
   * The feature id for the '<em><b>Inmode</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_STATEMENT__INMODE = 1;

  /**
   * The feature id for the '<em><b>Str</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_STATEMENT__STR = 2;

  /**
   * The number of structural features of the '<em>check statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_STATEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.block_label_idImpl <em>block label id</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.block_label_idImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getblock_label_id()
   * @generated
   */
  int BLOCK_LABEL_ID = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_LABEL_ID__NAME = 0;

  /**
   * The number of structural features of the '<em>block label id</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_LABEL_ID_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.check_label_idImpl <em>check label id</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.check_label_idImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getcheck_label_id()
   * @generated
   */
  int CHECK_LABEL_ID = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_LABEL_ID__NAME = 0;

  /**
   * The number of structural features of the '<em>check label id</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_LABEL_ID_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.check_theoremImpl <em>check theorem</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.check_theoremImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getcheck_theorem()
   * @generated
   */
  int CHECK_THEOREM = 14;

  /**
   * The feature id for the '<em><b>Root</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_THEOREM__ROOT = CHECK_STATEMENT__ROOT;

  /**
   * The feature id for the '<em><b>Inmode</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_THEOREM__INMODE = CHECK_STATEMENT__INMODE;

  /**
   * The feature id for the '<em><b>Str</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_THEOREM__STR = CHECK_STATEMENT__STR;

  /**
   * The feature id for the '<em><b>Theo</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_THEOREM__THEO = CHECK_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>check theorem</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_THEOREM_FEATURE_COUNT = CHECK_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.ModeSpecImpl <em>Mode Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.ModeSpecImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getModeSpec()
   * @generated
   */
  int MODE_SPEC = 15;

  /**
   * The feature id for the '<em><b>Mode</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODE_SPEC__MODE = 0;

  /**
   * The number of structural features of the '<em>Mode Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODE_SPEC_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.ModeNameImpl <em>Mode Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.ModeNameImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getModeName()
   * @generated
   */
  int MODE_NAME = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODE_NAME__NAME = 0;

  /**
   * The number of structural features of the '<em>Mode Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODE_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.check_assertionImpl <em>check assertion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.check_assertionImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getcheck_assertion()
   * @generated
   */
  int CHECK_ASSERTION = 17;

  /**
   * The feature id for the '<em><b>Root</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_ASSERTION__ROOT = CHECK_STATEMENT__ROOT;

  /**
   * The feature id for the '<em><b>Inmode</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_ASSERTION__INMODE = CHECK_STATEMENT__INMODE;

  /**
   * The feature id for the '<em><b>Str</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_ASSERTION__STR = CHECK_STATEMENT__STR;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_ASSERTION__EXPR = CHECK_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>check assertion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_ASSERTION_FEATURE_COUNT = CHECK_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.root_elementImpl <em>root element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.root_elementImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getroot_element()
   * @generated
   */
  int ROOT_ELEMENT = 18;

  /**
   * The number of structural features of the '<em>root element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.element_referenceImpl <em>element reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.element_referenceImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getelement_reference()
   * @generated
   */
  int ELEMENT_REFERENCE = 19;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_REFERENCE__NAME = ROOT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>element reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_REFERENCE_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.PackageEnforceImpl <em>Package Enforce</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.PackageEnforceImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getPackageEnforce()
   * @generated
   */
  int PACKAGE_ENFORCE = 20;

  /**
   * The feature id for the '<em><b>Viewpoint</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_ENFORCE__VIEWPOINT = 0;

  /**
   * The number of structural features of the '<em>Package Enforce</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_ENFORCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.constant_expressionImpl <em>constant expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.constant_expressionImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getconstant_expression()
   * @generated
   */
  int CONSTANT_EXPRESSION = 34;

  /**
   * The number of structural features of the '<em>constant expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.expressionImpl <em>expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.expressionImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getexpression()
   * @generated
   */
  int EXPRESSION = 21;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__EXPR = CONSTANT_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = CONSTANT_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.assertion_expressionImpl <em>assertion expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.assertion_expressionImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getassertion_expression()
   * @generated
   */
  int ASSERTION_EXPRESSION = 22;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_EXPRESSION__EXPR = 0;

  /**
   * The number of structural features of the '<em>assertion expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.string_expressionImpl <em>string expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.string_expressionImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getstring_expression()
   * @generated
   */
  int STRING_EXPRESSION = 23;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_EXPRESSION__EXPR = 0;

  /**
   * The number of structural features of the '<em>string expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.MCSAnnexSubclauseImpl <em>MCS Annex Subclause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.MCSAnnexSubclauseImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getMCSAnnexSubclause()
   * @generated
   */
  int MCS_ANNEX_SUBCLAUSE = 24;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_ANNEX_SUBCLAUSE__OWNED_ELEMENT = Aadl2Package.ANNEX_SUBCLAUSE__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_ANNEX_SUBCLAUSE__OWNED_COMMENT = Aadl2Package.ANNEX_SUBCLAUSE__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_ANNEX_SUBCLAUSE__NAME = Aadl2Package.ANNEX_SUBCLAUSE__NAME;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_ANNEX_SUBCLAUSE__QUALIFIED_NAME = Aadl2Package.ANNEX_SUBCLAUSE__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_ANNEX_SUBCLAUSE__OWNED_PROPERTY_ASSOCIATION = Aadl2Package.ANNEX_SUBCLAUSE__OWNED_PROPERTY_ASSOCIATION;

  /**
   * The feature id for the '<em><b>In Mode</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_ANNEX_SUBCLAUSE__IN_MODE = Aadl2Package.ANNEX_SUBCLAUSE__IN_MODE;

  /**
   * The feature id for the '<em><b>Theorems</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_ANNEX_SUBCLAUSE__THEOREMS = Aadl2Package.ANNEX_SUBCLAUSE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Enforceclauses</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_ANNEX_SUBCLAUSE__ENFORCECLAUSES = Aadl2Package.ANNEX_SUBCLAUSE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>MCS Annex Subclause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_ANNEX_SUBCLAUSE_FEATURE_COUNT = Aadl2Package.ANNEX_SUBCLAUSE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.ClassifierEnforceImpl <em>Classifier Enforce</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.ClassifierEnforceImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getClassifierEnforce()
   * @generated
   */
  int CLASSIFIER_ENFORCE = 25;

  /**
   * The feature id for the '<em><b>Viewpoint</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER_ENFORCE__VIEWPOINT = 0;

  /**
   * The feature id for the '<em><b>Script</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER_ENFORCE__SCRIPT = 1;

  /**
   * The number of structural features of the '<em>Classifier Enforce</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER_ENFORCE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.ClassifierScriptImpl <em>Classifier Script</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.ClassifierScriptImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getClassifierScript()
   * @generated
   */
  int CLASSIFIER_SCRIPT = 26;

  /**
   * The feature id for the '<em><b>Cblock</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER_SCRIPT__CBLOCK = 0;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER_SCRIPT__REF = 1;

  /**
   * The number of structural features of the '<em>Classifier Script</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER_SCRIPT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.theorem_declarationImpl <em>theorem declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.theorem_declarationImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#gettheorem_declaration()
   * @generated
   */
  int THEOREM_DECLARATION = 27;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEOREM_DECLARATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Ml</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEOREM_DECLARATION__ML = 1;

  /**
   * The feature id for the '<em><b>Locals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEOREM_DECLARATION__LOCALS = 2;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEOREM_DECLARATION__STATEMENTS = 3;

  /**
   * The feature id for the '<em><b>Endname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEOREM_DECLARATION__ENDNAME = 4;

  /**
   * The number of structural features of the '<em>theorem declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEOREM_DECLARATION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.in_modes_listImpl <em>in modes list</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.in_modes_listImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getin_modes_list()
   * @generated
   */
  int IN_MODES_LIST = 28;

  /**
   * The feature id for the '<em><b>Modes</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_MODES_LIST__MODES = 0;

  /**
   * The number of structural features of the '<em>in modes list</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_MODES_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.local_declarationImpl <em>local declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.local_declarationImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getlocal_declaration()
   * @generated
   */
  int LOCAL_DECLARATION = 29;

  /**
   * The number of structural features of the '<em>local declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_DECLARATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.constant_declarationImpl <em>constant declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.constant_declarationImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getconstant_declaration()
   * @generated
   */
  int CONSTANT_DECLARATION = 30;

  /**
   * The number of structural features of the '<em>constant declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DECLARATION_FEATURE_COUNT = LOCAL_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.constant_identifierImpl <em>constant identifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.constant_identifierImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getconstant_identifier()
   * @generated
   */
  int CONSTANT_IDENTIFIER = 31;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_IDENTIFIER__TYPE = CONSTANT_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Left expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_IDENTIFIER__LEFT_EXPR = CONSTANT_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_IDENTIFIER__NAME = CONSTANT_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>constant identifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_IDENTIFIER_FEATURE_COUNT = CONSTANT_DECLARATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.type_expressionImpl <em>type expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.type_expressionImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#gettype_expression()
   * @generated
   */
  int TYPE_EXPRESSION = 32;

  /**
   * The number of structural features of the '<em>type expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.basic_typeImpl <em>basic type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.basic_typeImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getbasic_type()
   * @generated
   */
  int BASIC_TYPE = 33;

  /**
   * The feature id for the '<em><b>Bool</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_TYPE__BOOL = TYPE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>String</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_TYPE__STRING = TYPE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>basic type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_TYPE_FEATURE_COUNT = TYPE_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.theorem_statementsImpl <em>theorem statements</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.theorem_statementsImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#gettheorem_statements()
   * @generated
   */
  int THEOREM_STATEMENTS = 35;

  /**
   * The feature id for the '<em><b>Statements</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEOREM_STATEMENTS__STATEMENTS = 0;

  /**
   * The number of structural features of the '<em>theorem statements</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEOREM_STATEMENTS_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.MCSGrammarRoot <em>MCS Grammar Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MCS Grammar Root</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.MCSGrammarRoot
   * @generated
   */
  EClass getMCSGrammarRoot();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.MCSGrammarRoot#getLib <em>Lib</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lib</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.MCSGrammarRoot#getLib()
   * @see #getMCSGrammarRoot()
   * @generated
   */
  EReference getMCSGrammarRoot_Lib();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.MCSGrammarRoot#getSubclause <em>Subclause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Subclause</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.MCSGrammarRoot#getSubclause()
   * @see #getMCSGrammarRoot()
   * @generated
   */
  EReference getMCSGrammarRoot_Subclause();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.MCSAnnexLibrary <em>MCS Annex Library</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MCS Annex Library</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.MCSAnnexLibrary
   * @generated
   */
  EClass getMCSAnnexLibrary();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.mcs.mcs.MCSAnnexLibrary#getTheorems <em>Theorems</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Theorems</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.MCSAnnexLibrary#getTheorems()
   * @see #getMCSAnnexLibrary()
   * @generated
   */
  EReference getMCSAnnexLibrary_Theorems();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.mcs.mcs.MCSAnnexLibrary#getViewpoints <em>Viewpoints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Viewpoints</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.MCSAnnexLibrary#getViewpoints()
   * @see #getMCSAnnexLibrary()
   * @generated
   */
  EReference getMCSAnnexLibrary_Viewpoints();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.mcs.mcs.MCSAnnexLibrary#getEnforceclauses <em>Enforceclauses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Enforceclauses</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.MCSAnnexLibrary#getEnforceclauses()
   * @see #getMCSAnnexLibrary()
   * @generated
   */
  EReference getMCSAnnexLibrary_Enforceclauses();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.MCSViewpoint <em>MCS Viewpoint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MCS Viewpoint</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.MCSViewpoint
   * @generated
   */
  EClass getMCSViewpoint();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.MCSViewpoint#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.MCSViewpoint#getName()
   * @see #getMCSViewpoint()
   * @generated
   */
  EAttribute getMCSViewpoint_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.MCSViewpoint#getPolicy <em>Policy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Policy</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.MCSViewpoint#getPolicy()
   * @see #getMCSViewpoint()
   * @generated
   */
  EReference getMCSViewpoint_Policy();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.MCSViewpoint#getPscript <em>Pscript</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pscript</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.MCSViewpoint#getPscript()
   * @see #getMCSViewpoint()
   * @generated
   */
  EReference getMCSViewpoint_Pscript();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.Enforcement_policy <em>Enforcement policy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enforcement policy</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Enforcement_policy
   * @generated
   */
  EClass getEnforcement_policy();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.Enforcement_policy#isPack <em>Pack</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pack</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Enforcement_policy#isPack()
   * @see #getEnforcement_policy()
   * @generated
   */
  EAttribute getEnforcement_policy_Pack();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.Enforcement_policy#isClass <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Enforcement_policy#isClass()
   * @see #getEnforcement_policy()
   * @generated
   */
  EAttribute getEnforcement_policy_Class();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.PackageScript <em>Package Script</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Script</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.PackageScript
   * @generated
   */
  EClass getPackageScript();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.mcs.mcs.PackageScript#getApplies <em>Applies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Applies</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.PackageScript#getApplies()
   * @see #getPackageScript()
   * @generated
   */
  EReference getPackageScript_Applies();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.mcs.mcs.PackageScript#getC_block <em>Cblock</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cblock</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.PackageScript#getC_block()
   * @see #getPackageScript()
   * @generated
   */
  EReference getPackageScript_C_block();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.PackageScript#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.PackageScript#getRef()
   * @see #getPackageScript()
   * @generated
   */
  EReference getPackageScript_Ref();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.AppliesToClause <em>Applies To Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Applies To Clause</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.AppliesToClause
   * @generated
   */
  EClass getAppliesToClause();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.AppliesToClause#isAll <em>All</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>All</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.AppliesToClause#isAll()
   * @see #getAppliesToClause()
   * @generated
   */
  EAttribute getAppliesToClause_All();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.AppliesToClause#getCategory <em>Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Category</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.AppliesToClause#getCategory()
   * @see #getAppliesToClause()
   * @generated
   */
  EReference getAppliesToClause_Category();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.ClassifierCategory <em>Classifier Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Classifier Category</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.ClassifierCategory
   * @generated
   */
  EClass getClassifierCategory();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.ClassifierCategory#getComponent <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Component</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.ClassifierCategory#getComponent()
   * @see #getClassifierCategory()
   * @generated
   */
  EAttribute getClassifierCategory_Component();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.mcs.mcs.ClassifierCategory#getCt <em>Ct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ct</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.ClassifierCategory#getCt()
   * @see #getClassifierCategory()
   * @generated
   */
  EReference getClassifierCategory_Ct();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.ClassifierCategory#isImpl <em>Impl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Impl</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.ClassifierCategory#isImpl()
   * @see #getClassifierCategory()
   * @generated
   */
  EAttribute getClassifierCategory_Impl();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.mcs.mcs.ClassifierCategory#getCi <em>Ci</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ci</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.ClassifierCategory#getCi()
   * @see #getClassifierCategory()
   * @generated
   */
  EReference getClassifierCategory_Ci();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.ClassifierCategory#isFeat_g <em>Feat g</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Feat g</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.ClassifierCategory#isFeat_g()
   * @see #getClassifierCategory()
   * @generated
   */
  EAttribute getClassifierCategory_Feat_g();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.ClassifierCategory#getRef_to_f <em>Ref to f</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref to f</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.ClassifierCategory#getRef_to_f()
   * @see #getClassifierCategory()
   * @generated
   */
  EReference getClassifierCategory_Ref_to_f();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.FeatureGroupClassifierReference <em>Feature Group Classifier Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature Group Classifier Reference</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.FeatureGroupClassifierReference
   * @generated
   */
  EClass getFeatureGroupClassifierReference();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.mcs.mcs.FeatureGroupClassifierReference#getFg <em>Fg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Fg</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.FeatureGroupClassifierReference#getFg()
   * @see #getFeatureGroupClassifierReference()
   * @generated
   */
  EReference getFeatureGroupClassifierReference_Fg();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.ViewpointReference <em>Viewpoint Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Viewpoint Reference</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.ViewpointReference
   * @generated
   */
  EClass getViewpointReference();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.mcs.mcs.ViewpointReference#getPolicy <em>Policy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Policy</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.ViewpointReference#getPolicy()
   * @see #getViewpointReference()
   * @generated
   */
  EReference getViewpointReference_Policy();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.mcs.mcs.ViewpointReference#getVp_ref <em>Vp ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Vp ref</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.ViewpointReference#getVp_ref()
   * @see #getViewpointReference()
   * @generated
   */
  EReference getViewpointReference_Vp_ref();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.ConstraintsBlock <em>Constraints Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constraints Block</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.ConstraintsBlock
   * @generated
   */
  EClass getConstraintsBlock();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.ConstraintsBlock#getB_label <em>Blabel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Blabel</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.ConstraintsBlock#getB_label()
   * @see #getConstraintsBlock()
   * @generated
   */
  EReference getConstraintsBlock_B_label();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.mcs.mcs.ConstraintsBlock#getCs <em>Cs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cs</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.ConstraintsBlock#getCs()
   * @see #getConstraintsBlock()
   * @generated
   */
  EReference getConstraintsBlock_Cs();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.labelled_check_statement <em>labelled check statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>labelled check statement</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.labelled_check_statement
   * @generated
   */
  EClass getlabelled_check_statement();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.labelled_check_statement#getC_label <em>Clabel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Clabel</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.labelled_check_statement#getC_label()
   * @see #getlabelled_check_statement()
   * @generated
   */
  EReference getlabelled_check_statement_C_label();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.labelled_check_statement#getCs <em>Cs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cs</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.labelled_check_statement#getCs()
   * @see #getlabelled_check_statement()
   * @generated
   */
  EReference getlabelled_check_statement_Cs();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.check_statement <em>check statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>check statement</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.check_statement
   * @generated
   */
  EClass getcheck_statement();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.check_statement#getRoot <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Root</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.check_statement#getRoot()
   * @see #getcheck_statement()
   * @generated
   */
  EReference getcheck_statement_Root();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.check_statement#getInmode <em>Inmode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inmode</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.check_statement#getInmode()
   * @see #getcheck_statement()
   * @generated
   */
  EReference getcheck_statement_Inmode();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.check_statement#getStr <em>Str</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Str</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.check_statement#getStr()
   * @see #getcheck_statement()
   * @generated
   */
  EReference getcheck_statement_Str();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.block_label_id <em>block label id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>block label id</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.block_label_id
   * @generated
   */
  EClass getblock_label_id();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.block_label_id#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.block_label_id#getName()
   * @see #getblock_label_id()
   * @generated
   */
  EAttribute getblock_label_id_Name();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.check_label_id <em>check label id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>check label id</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.check_label_id
   * @generated
   */
  EClass getcheck_label_id();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.check_label_id#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.check_label_id#getName()
   * @see #getcheck_label_id()
   * @generated
   */
  EAttribute getcheck_label_id_Name();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.check_theorem <em>check theorem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>check theorem</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.check_theorem
   * @generated
   */
  EClass getcheck_theorem();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.mcs.mcs.check_theorem#getTheo <em>Theo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Theo</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.check_theorem#getTheo()
   * @see #getcheck_theorem()
   * @generated
   */
  EReference getcheck_theorem_Theo();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.ModeSpec <em>Mode Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mode Spec</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.ModeSpec
   * @generated
   */
  EClass getModeSpec();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.ModeSpec#getMode <em>Mode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mode</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.ModeSpec#getMode()
   * @see #getModeSpec()
   * @generated
   */
  EReference getModeSpec_Mode();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.ModeName <em>Mode Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mode Name</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.ModeName
   * @generated
   */
  EClass getModeName();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.ModeName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.ModeName#getName()
   * @see #getModeName()
   * @generated
   */
  EAttribute getModeName_Name();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.check_assertion <em>check assertion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>check assertion</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.check_assertion
   * @generated
   */
  EClass getcheck_assertion();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.check_assertion#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.check_assertion#getExpr()
   * @see #getcheck_assertion()
   * @generated
   */
  EReference getcheck_assertion_Expr();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.root_element <em>root element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>root element</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.root_element
   * @generated
   */
  EClass getroot_element();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.element_reference <em>element reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>element reference</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.element_reference
   * @generated
   */
  EClass getelement_reference();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.element_reference#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.element_reference#getName()
   * @see #getelement_reference()
   * @generated
   */
  EAttribute getelement_reference_Name();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.PackageEnforce <em>Package Enforce</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Enforce</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.PackageEnforce
   * @generated
   */
  EClass getPackageEnforce();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.mcs.mcs.PackageEnforce#getViewpoint <em>Viewpoint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Viewpoint</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.PackageEnforce#getViewpoint()
   * @see #getPackageEnforce()
   * @generated
   */
  EReference getPackageEnforce_Viewpoint();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.expression <em>expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>expression</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.expression
   * @generated
   */
  EClass getexpression();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.expression#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.expression#getExpr()
   * @see #getexpression()
   * @generated
   */
  EReference getexpression_Expr();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.assertion_expression <em>assertion expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>assertion expression</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.assertion_expression
   * @generated
   */
  EClass getassertion_expression();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.assertion_expression#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.assertion_expression#getExpr()
   * @see #getassertion_expression()
   * @generated
   */
  EReference getassertion_expression_Expr();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.string_expression <em>string expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>string expression</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.string_expression
   * @generated
   */
  EClass getstring_expression();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.string_expression#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.string_expression#getExpr()
   * @see #getstring_expression()
   * @generated
   */
  EReference getstring_expression_Expr();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.MCSAnnexSubclause <em>MCS Annex Subclause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MCS Annex Subclause</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.MCSAnnexSubclause
   * @generated
   */
  EClass getMCSAnnexSubclause();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.mcs.mcs.MCSAnnexSubclause#getTheorems <em>Theorems</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Theorems</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.MCSAnnexSubclause#getTheorems()
   * @see #getMCSAnnexSubclause()
   * @generated
   */
  EReference getMCSAnnexSubclause_Theorems();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.mcs.mcs.MCSAnnexSubclause#getEnforceclauses <em>Enforceclauses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Enforceclauses</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.MCSAnnexSubclause#getEnforceclauses()
   * @see #getMCSAnnexSubclause()
   * @generated
   */
  EReference getMCSAnnexSubclause_Enforceclauses();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.ClassifierEnforce <em>Classifier Enforce</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Classifier Enforce</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.ClassifierEnforce
   * @generated
   */
  EClass getClassifierEnforce();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.mcs.mcs.ClassifierEnforce#getViewpoint <em>Viewpoint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Viewpoint</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.ClassifierEnforce#getViewpoint()
   * @see #getClassifierEnforce()
   * @generated
   */
  EReference getClassifierEnforce_Viewpoint();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.ClassifierEnforce#getScript <em>Script</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Script</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.ClassifierEnforce#getScript()
   * @see #getClassifierEnforce()
   * @generated
   */
  EReference getClassifierEnforce_Script();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.ClassifierScript <em>Classifier Script</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Classifier Script</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.ClassifierScript
   * @generated
   */
  EClass getClassifierScript();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.mcs.mcs.ClassifierScript#getC_block <em>Cblock</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cblock</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.ClassifierScript#getC_block()
   * @see #getClassifierScript()
   * @generated
   */
  EReference getClassifierScript_C_block();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.ClassifierScript#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.ClassifierScript#getRef()
   * @see #getClassifierScript()
   * @generated
   */
  EReference getClassifierScript_Ref();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.theorem_declaration <em>theorem declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>theorem declaration</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.theorem_declaration
   * @generated
   */
  EClass gettheorem_declaration();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.theorem_declaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.theorem_declaration#getName()
   * @see #gettheorem_declaration()
   * @generated
   */
  EAttribute gettheorem_declaration_Name();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.theorem_declaration#isMl <em>Ml</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ml</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.theorem_declaration#isMl()
   * @see #gettheorem_declaration()
   * @generated
   */
  EAttribute gettheorem_declaration_Ml();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.mcs.mcs.theorem_declaration#getLocals <em>Locals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Locals</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.theorem_declaration#getLocals()
   * @see #gettheorem_declaration()
   * @generated
   */
  EReference gettheorem_declaration_Locals();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.mcs.mcs.theorem_declaration#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.theorem_declaration#getStatements()
   * @see #gettheorem_declaration()
   * @generated
   */
  EReference gettheorem_declaration_Statements();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.theorem_declaration#getEndname <em>Endname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Endname</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.theorem_declaration#getEndname()
   * @see #gettheorem_declaration()
   * @generated
   */
  EAttribute gettheorem_declaration_Endname();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.in_modes_list <em>in modes list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>in modes list</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.in_modes_list
   * @generated
   */
  EClass getin_modes_list();

  /**
   * Returns the meta object for the attribute list '{@link org.osate.xtext.aadl2.mcs.mcs.in_modes_list#getModes <em>Modes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Modes</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.in_modes_list#getModes()
   * @see #getin_modes_list()
   * @generated
   */
  EAttribute getin_modes_list_Modes();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.local_declaration <em>local declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>local declaration</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.local_declaration
   * @generated
   */
  EClass getlocal_declaration();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.constant_declaration <em>constant declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>constant declaration</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.constant_declaration
   * @generated
   */
  EClass getconstant_declaration();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.constant_identifier <em>constant identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>constant identifier</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.constant_identifier
   * @generated
   */
  EClass getconstant_identifier();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.constant_identifier#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.constant_identifier#getType()
   * @see #getconstant_identifier()
   * @generated
   */
  EReference getconstant_identifier_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.constant_identifier#getLeft_expr <em>Left expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left expr</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.constant_identifier#getLeft_expr()
   * @see #getconstant_identifier()
   * @generated
   */
  EReference getconstant_identifier_Left_expr();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.constant_identifier#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.constant_identifier#getName()
   * @see #getconstant_identifier()
   * @generated
   */
  EAttribute getconstant_identifier_Name();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.type_expression <em>type expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>type expression</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.type_expression
   * @generated
   */
  EClass gettype_expression();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.basic_type <em>basic type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>basic type</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.basic_type
   * @generated
   */
  EClass getbasic_type();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.basic_type#getBool <em>Bool</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bool</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.basic_type#getBool()
   * @see #getbasic_type()
   * @generated
   */
  EReference getbasic_type_Bool();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.basic_type#getString <em>String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>String</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.basic_type#getString()
   * @see #getbasic_type()
   * @generated
   */
  EReference getbasic_type_String();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.constant_expression <em>constant expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>constant expression</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.constant_expression
   * @generated
   */
  EClass getconstant_expression();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.theorem_statements <em>theorem statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>theorem statements</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.theorem_statements
   * @generated
   */
  EClass gettheorem_statements();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.theorem_statements#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Statements</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.theorem_statements#getStatements()
   * @see #gettheorem_statements()
   * @generated
   */
  EAttribute gettheorem_statements_Statements();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  McsFactory getMcsFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.MCSGrammarRootImpl <em>MCS Grammar Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.MCSGrammarRootImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getMCSGrammarRoot()
     * @generated
     */
    EClass MCS_GRAMMAR_ROOT = eINSTANCE.getMCSGrammarRoot();

    /**
     * The meta object literal for the '<em><b>Lib</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MCS_GRAMMAR_ROOT__LIB = eINSTANCE.getMCSGrammarRoot_Lib();

    /**
     * The meta object literal for the '<em><b>Subclause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MCS_GRAMMAR_ROOT__SUBCLAUSE = eINSTANCE.getMCSGrammarRoot_Subclause();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.MCSAnnexLibraryImpl <em>MCS Annex Library</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.MCSAnnexLibraryImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getMCSAnnexLibrary()
     * @generated
     */
    EClass MCS_ANNEX_LIBRARY = eINSTANCE.getMCSAnnexLibrary();

    /**
     * The meta object literal for the '<em><b>Theorems</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MCS_ANNEX_LIBRARY__THEOREMS = eINSTANCE.getMCSAnnexLibrary_Theorems();

    /**
     * The meta object literal for the '<em><b>Viewpoints</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MCS_ANNEX_LIBRARY__VIEWPOINTS = eINSTANCE.getMCSAnnexLibrary_Viewpoints();

    /**
     * The meta object literal for the '<em><b>Enforceclauses</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MCS_ANNEX_LIBRARY__ENFORCECLAUSES = eINSTANCE.getMCSAnnexLibrary_Enforceclauses();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.MCSViewpointImpl <em>MCS Viewpoint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.MCSViewpointImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getMCSViewpoint()
     * @generated
     */
    EClass MCS_VIEWPOINT = eINSTANCE.getMCSViewpoint();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MCS_VIEWPOINT__NAME = eINSTANCE.getMCSViewpoint_Name();

    /**
     * The meta object literal for the '<em><b>Policy</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MCS_VIEWPOINT__POLICY = eINSTANCE.getMCSViewpoint_Policy();

    /**
     * The meta object literal for the '<em><b>Pscript</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MCS_VIEWPOINT__PSCRIPT = eINSTANCE.getMCSViewpoint_Pscript();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.Enforcement_policyImpl <em>Enforcement policy</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.Enforcement_policyImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getEnforcement_policy()
     * @generated
     */
    EClass ENFORCEMENT_POLICY = eINSTANCE.getEnforcement_policy();

    /**
     * The meta object literal for the '<em><b>Pack</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENFORCEMENT_POLICY__PACK = eINSTANCE.getEnforcement_policy_Pack();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENFORCEMENT_POLICY__CLASS = eINSTANCE.getEnforcement_policy_Class();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.PackageScriptImpl <em>Package Script</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.PackageScriptImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getPackageScript()
     * @generated
     */
    EClass PACKAGE_SCRIPT = eINSTANCE.getPackageScript();

    /**
     * The meta object literal for the '<em><b>Applies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_SCRIPT__APPLIES = eINSTANCE.getPackageScript_Applies();

    /**
     * The meta object literal for the '<em><b>Cblock</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_SCRIPT__CBLOCK = eINSTANCE.getPackageScript_C_block();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_SCRIPT__REF = eINSTANCE.getPackageScript_Ref();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.AppliesToClauseImpl <em>Applies To Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.AppliesToClauseImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getAppliesToClause()
     * @generated
     */
    EClass APPLIES_TO_CLAUSE = eINSTANCE.getAppliesToClause();

    /**
     * The meta object literal for the '<em><b>All</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLIES_TO_CLAUSE__ALL = eINSTANCE.getAppliesToClause_All();

    /**
     * The meta object literal for the '<em><b>Category</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLIES_TO_CLAUSE__CATEGORY = eINSTANCE.getAppliesToClause_Category();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.ClassifierCategoryImpl <em>Classifier Category</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.ClassifierCategoryImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getClassifierCategory()
     * @generated
     */
    EClass CLASSIFIER_CATEGORY = eINSTANCE.getClassifierCategory();

    /**
     * The meta object literal for the '<em><b>Component</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASSIFIER_CATEGORY__COMPONENT = eINSTANCE.getClassifierCategory_Component();

    /**
     * The meta object literal for the '<em><b>Ct</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASSIFIER_CATEGORY__CT = eINSTANCE.getClassifierCategory_Ct();

    /**
     * The meta object literal for the '<em><b>Impl</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASSIFIER_CATEGORY__IMPL = eINSTANCE.getClassifierCategory_Impl();

    /**
     * The meta object literal for the '<em><b>Ci</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASSIFIER_CATEGORY__CI = eINSTANCE.getClassifierCategory_Ci();

    /**
     * The meta object literal for the '<em><b>Feat g</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASSIFIER_CATEGORY__FEAT_G = eINSTANCE.getClassifierCategory_Feat_g();

    /**
     * The meta object literal for the '<em><b>Ref to f</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASSIFIER_CATEGORY__REF_TO_F = eINSTANCE.getClassifierCategory_Ref_to_f();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.FeatureGroupClassifierReferenceImpl <em>Feature Group Classifier Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.FeatureGroupClassifierReferenceImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getFeatureGroupClassifierReference()
     * @generated
     */
    EClass FEATURE_GROUP_CLASSIFIER_REFERENCE = eINSTANCE.getFeatureGroupClassifierReference();

    /**
     * The meta object literal for the '<em><b>Fg</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_GROUP_CLASSIFIER_REFERENCE__FG = eINSTANCE.getFeatureGroupClassifierReference_Fg();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.ViewpointReferenceImpl <em>Viewpoint Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.ViewpointReferenceImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getViewpointReference()
     * @generated
     */
    EClass VIEWPOINT_REFERENCE = eINSTANCE.getViewpointReference();

    /**
     * The meta object literal for the '<em><b>Policy</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEWPOINT_REFERENCE__POLICY = eINSTANCE.getViewpointReference_Policy();

    /**
     * The meta object literal for the '<em><b>Vp ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEWPOINT_REFERENCE__VP_REF = eINSTANCE.getViewpointReference_Vp_ref();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.ConstraintsBlockImpl <em>Constraints Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.ConstraintsBlockImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getConstraintsBlock()
     * @generated
     */
    EClass CONSTRAINTS_BLOCK = eINSTANCE.getConstraintsBlock();

    /**
     * The meta object literal for the '<em><b>Blabel</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINTS_BLOCK__BLABEL = eINSTANCE.getConstraintsBlock_B_label();

    /**
     * The meta object literal for the '<em><b>Cs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINTS_BLOCK__CS = eINSTANCE.getConstraintsBlock_Cs();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.labelled_check_statementImpl <em>labelled check statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.labelled_check_statementImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getlabelled_check_statement()
     * @generated
     */
    EClass LABELLED_CHECK_STATEMENT = eINSTANCE.getlabelled_check_statement();

    /**
     * The meta object literal for the '<em><b>Clabel</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LABELLED_CHECK_STATEMENT__CLABEL = eINSTANCE.getlabelled_check_statement_C_label();

    /**
     * The meta object literal for the '<em><b>Cs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LABELLED_CHECK_STATEMENT__CS = eINSTANCE.getlabelled_check_statement_Cs();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.check_statementImpl <em>check statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.check_statementImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getcheck_statement()
     * @generated
     */
    EClass CHECK_STATEMENT = eINSTANCE.getcheck_statement();

    /**
     * The meta object literal for the '<em><b>Root</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHECK_STATEMENT__ROOT = eINSTANCE.getcheck_statement_Root();

    /**
     * The meta object literal for the '<em><b>Inmode</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHECK_STATEMENT__INMODE = eINSTANCE.getcheck_statement_Inmode();

    /**
     * The meta object literal for the '<em><b>Str</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHECK_STATEMENT__STR = eINSTANCE.getcheck_statement_Str();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.block_label_idImpl <em>block label id</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.block_label_idImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getblock_label_id()
     * @generated
     */
    EClass BLOCK_LABEL_ID = eINSTANCE.getblock_label_id();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BLOCK_LABEL_ID__NAME = eINSTANCE.getblock_label_id_Name();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.check_label_idImpl <em>check label id</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.check_label_idImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getcheck_label_id()
     * @generated
     */
    EClass CHECK_LABEL_ID = eINSTANCE.getcheck_label_id();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHECK_LABEL_ID__NAME = eINSTANCE.getcheck_label_id_Name();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.check_theoremImpl <em>check theorem</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.check_theoremImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getcheck_theorem()
     * @generated
     */
    EClass CHECK_THEOREM = eINSTANCE.getcheck_theorem();

    /**
     * The meta object literal for the '<em><b>Theo</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHECK_THEOREM__THEO = eINSTANCE.getcheck_theorem_Theo();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.ModeSpecImpl <em>Mode Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.ModeSpecImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getModeSpec()
     * @generated
     */
    EClass MODE_SPEC = eINSTANCE.getModeSpec();

    /**
     * The meta object literal for the '<em><b>Mode</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODE_SPEC__MODE = eINSTANCE.getModeSpec_Mode();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.ModeNameImpl <em>Mode Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.ModeNameImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getModeName()
     * @generated
     */
    EClass MODE_NAME = eINSTANCE.getModeName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODE_NAME__NAME = eINSTANCE.getModeName_Name();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.check_assertionImpl <em>check assertion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.check_assertionImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getcheck_assertion()
     * @generated
     */
    EClass CHECK_ASSERTION = eINSTANCE.getcheck_assertion();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHECK_ASSERTION__EXPR = eINSTANCE.getcheck_assertion_Expr();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.root_elementImpl <em>root element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.root_elementImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getroot_element()
     * @generated
     */
    EClass ROOT_ELEMENT = eINSTANCE.getroot_element();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.element_referenceImpl <em>element reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.element_referenceImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getelement_reference()
     * @generated
     */
    EClass ELEMENT_REFERENCE = eINSTANCE.getelement_reference();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_REFERENCE__NAME = eINSTANCE.getelement_reference_Name();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.PackageEnforceImpl <em>Package Enforce</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.PackageEnforceImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getPackageEnforce()
     * @generated
     */
    EClass PACKAGE_ENFORCE = eINSTANCE.getPackageEnforce();

    /**
     * The meta object literal for the '<em><b>Viewpoint</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_ENFORCE__VIEWPOINT = eINSTANCE.getPackageEnforce_Viewpoint();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.expressionImpl <em>expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.expressionImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getexpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getexpression();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__EXPR = eINSTANCE.getexpression_Expr();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.assertion_expressionImpl <em>assertion expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.assertion_expressionImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getassertion_expression()
     * @generated
     */
    EClass ASSERTION_EXPRESSION = eINSTANCE.getassertion_expression();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSERTION_EXPRESSION__EXPR = eINSTANCE.getassertion_expression_Expr();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.string_expressionImpl <em>string expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.string_expressionImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getstring_expression()
     * @generated
     */
    EClass STRING_EXPRESSION = eINSTANCE.getstring_expression();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRING_EXPRESSION__EXPR = eINSTANCE.getstring_expression_Expr();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.MCSAnnexSubclauseImpl <em>MCS Annex Subclause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.MCSAnnexSubclauseImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getMCSAnnexSubclause()
     * @generated
     */
    EClass MCS_ANNEX_SUBCLAUSE = eINSTANCE.getMCSAnnexSubclause();

    /**
     * The meta object literal for the '<em><b>Theorems</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MCS_ANNEX_SUBCLAUSE__THEOREMS = eINSTANCE.getMCSAnnexSubclause_Theorems();

    /**
     * The meta object literal for the '<em><b>Enforceclauses</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MCS_ANNEX_SUBCLAUSE__ENFORCECLAUSES = eINSTANCE.getMCSAnnexSubclause_Enforceclauses();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.ClassifierEnforceImpl <em>Classifier Enforce</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.ClassifierEnforceImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getClassifierEnforce()
     * @generated
     */
    EClass CLASSIFIER_ENFORCE = eINSTANCE.getClassifierEnforce();

    /**
     * The meta object literal for the '<em><b>Viewpoint</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASSIFIER_ENFORCE__VIEWPOINT = eINSTANCE.getClassifierEnforce_Viewpoint();

    /**
     * The meta object literal for the '<em><b>Script</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASSIFIER_ENFORCE__SCRIPT = eINSTANCE.getClassifierEnforce_Script();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.ClassifierScriptImpl <em>Classifier Script</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.ClassifierScriptImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getClassifierScript()
     * @generated
     */
    EClass CLASSIFIER_SCRIPT = eINSTANCE.getClassifierScript();

    /**
     * The meta object literal for the '<em><b>Cblock</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASSIFIER_SCRIPT__CBLOCK = eINSTANCE.getClassifierScript_C_block();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASSIFIER_SCRIPT__REF = eINSTANCE.getClassifierScript_Ref();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.theorem_declarationImpl <em>theorem declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.theorem_declarationImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#gettheorem_declaration()
     * @generated
     */
    EClass THEOREM_DECLARATION = eINSTANCE.gettheorem_declaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute THEOREM_DECLARATION__NAME = eINSTANCE.gettheorem_declaration_Name();

    /**
     * The meta object literal for the '<em><b>Ml</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute THEOREM_DECLARATION__ML = eINSTANCE.gettheorem_declaration_Ml();

    /**
     * The meta object literal for the '<em><b>Locals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THEOREM_DECLARATION__LOCALS = eINSTANCE.gettheorem_declaration_Locals();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THEOREM_DECLARATION__STATEMENTS = eINSTANCE.gettheorem_declaration_Statements();

    /**
     * The meta object literal for the '<em><b>Endname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute THEOREM_DECLARATION__ENDNAME = eINSTANCE.gettheorem_declaration_Endname();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.in_modes_listImpl <em>in modes list</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.in_modes_listImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getin_modes_list()
     * @generated
     */
    EClass IN_MODES_LIST = eINSTANCE.getin_modes_list();

    /**
     * The meta object literal for the '<em><b>Modes</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IN_MODES_LIST__MODES = eINSTANCE.getin_modes_list_Modes();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.local_declarationImpl <em>local declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.local_declarationImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getlocal_declaration()
     * @generated
     */
    EClass LOCAL_DECLARATION = eINSTANCE.getlocal_declaration();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.constant_declarationImpl <em>constant declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.constant_declarationImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getconstant_declaration()
     * @generated
     */
    EClass CONSTANT_DECLARATION = eINSTANCE.getconstant_declaration();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.constant_identifierImpl <em>constant identifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.constant_identifierImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getconstant_identifier()
     * @generated
     */
    EClass CONSTANT_IDENTIFIER = eINSTANCE.getconstant_identifier();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_IDENTIFIER__TYPE = eINSTANCE.getconstant_identifier_Type();

    /**
     * The meta object literal for the '<em><b>Left expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_IDENTIFIER__LEFT_EXPR = eINSTANCE.getconstant_identifier_Left_expr();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT_IDENTIFIER__NAME = eINSTANCE.getconstant_identifier_Name();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.type_expressionImpl <em>type expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.type_expressionImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#gettype_expression()
     * @generated
     */
    EClass TYPE_EXPRESSION = eINSTANCE.gettype_expression();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.basic_typeImpl <em>basic type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.basic_typeImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getbasic_type()
     * @generated
     */
    EClass BASIC_TYPE = eINSTANCE.getbasic_type();

    /**
     * The meta object literal for the '<em><b>Bool</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_TYPE__BOOL = eINSTANCE.getbasic_type_Bool();

    /**
     * The meta object literal for the '<em><b>String</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_TYPE__STRING = eINSTANCE.getbasic_type_String();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.constant_expressionImpl <em>constant expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.constant_expressionImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getconstant_expression()
     * @generated
     */
    EClass CONSTANT_EXPRESSION = eINSTANCE.getconstant_expression();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.theorem_statementsImpl <em>theorem statements</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.theorem_statementsImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#gettheorem_statements()
     * @generated
     */
    EClass THEOREM_STATEMENTS = eINSTANCE.gettheorem_statements();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute THEOREM_STATEMENTS__STATEMENTS = eINSTANCE.gettheorem_statements_Statements();

  }

} //McsPackage
