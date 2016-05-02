/**
 */
package org.osate.xtext.aadl2.mcs.mcs;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.xtext.xbase.XbasePackage;

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
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_ANNEX_LIBRARY__TYPES = Aadl2Package.ANNEX_LIBRARY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Constants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_ANNEX_LIBRARY__CONSTANTS = Aadl2Package.ANNEX_LIBRARY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_ANNEX_LIBRARY__FUNCTIONS = Aadl2Package.ANNEX_LIBRARY_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Theorems</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_ANNEX_LIBRARY__THEOREMS = Aadl2Package.ANNEX_LIBRARY_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Viewpoints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_ANNEX_LIBRARY__VIEWPOINTS = Aadl2Package.ANNEX_LIBRARY_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Enforceclauses</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_ANNEX_LIBRARY__ENFORCECLAUSES = Aadl2Package.ANNEX_LIBRARY_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>MCS Annex Library</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_ANNEX_LIBRARY_FEATURE_COUNT = Aadl2Package.ANNEX_LIBRARY_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.Type_declarationImpl <em>Type declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.Type_declarationImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getType_declaration()
   * @generated
   */
  int TYPE_DECLARATION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECLARATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECLARATION__TYPE = 1;

  /**
   * The number of structural features of the '<em>Type declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.Constant_declarationImpl <em>Constant declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.Constant_declarationImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getConstant_declaration()
   * @generated
   */
  int CONSTANT_DECLARATION = 3;

  /**
   * The feature id for the '<em><b>Const</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DECLARATION__CONST = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DECLARATION__NAME = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DECLARATION__TYPE = 2;

  /**
   * The feature id for the '<em><b>Left expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DECLARATION__LEFT_EXPR = 3;

  /**
   * The number of structural features of the '<em>Constant declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DECLARATION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.MCSViewpointImpl <em>MCS Viewpoint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.MCSViewpointImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getMCSViewpoint()
   * @generated
   */
  int MCS_VIEWPOINT = 4;

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
  int ENFORCEMENT_POLICY = 5;

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
  int PACKAGE_SCRIPT = 6;

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
  int APPLIES_TO_CLAUSE = 7;

  /**
   * The feature id for the '<em><b>All</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLIES_TO_CLAUSE__ALL = 0;

  /**
   * The feature id for the '<em><b>Category</b></em>' containment reference list.
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
  int CLASSIFIER_CATEGORY = 8;

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
  int FEATURE_GROUP_CLASSIFIER_REFERENCE = 9;

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
  int VIEWPOINT_REFERENCE = 10;

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
  int CONSTRAINTS_BLOCK = 11;

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
  int LABELLED_CHECK_STATEMENT = 12;

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
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.Theorem_statementImpl <em>Theorem statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.Theorem_statementImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getTheorem_statement()
   * @generated
   */
  int THEOREM_STATEMENT = 43;

  /**
   * The number of structural features of the '<em>Theorem statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEOREM_STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.check_statementImpl <em>check statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.check_statementImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getcheck_statement()
   * @generated
   */
  int CHECK_STATEMENT = 13;

  /**
   * The feature id for the '<em><b>Root</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_STATEMENT__ROOT = THEOREM_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Inmode</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_STATEMENT__INMODE = THEOREM_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Str</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_STATEMENT__STR = THEOREM_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>check statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_STATEMENT_FEATURE_COUNT = THEOREM_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.block_label_idImpl <em>block label id</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.block_label_idImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getblock_label_id()
   * @generated
   */
  int BLOCK_LABEL_ID = 14;

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
  int CHECK_LABEL_ID = 15;

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
  int CHECK_THEOREM = 16;

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
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_THEOREM__NAME = CHECK_STATEMENT_FEATURE_COUNT + 0;

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
  int MODE_SPEC = 17;

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
  int MODE_NAME = 18;

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
  int CHECK_ASSERTION = 19;

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
  int ROOT_ELEMENT = 20;

  /**
   * The number of structural features of the '<em>root element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.property_referenceImpl <em>property reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.property_referenceImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getproperty_reference()
   * @generated
   */
  int PROPERTY_REFERENCE = 21;

  /**
   * The feature id for the '<em><b>El ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_REFERENCE__EL_REF = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Exists</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_REFERENCE__EXISTS = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Property</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_REFERENCE__PROPERTY = XbasePackage.XEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>property reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_REFERENCE_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.element_referenceImpl <em>element reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.element_referenceImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getelement_reference()
   * @generated
   */
  int ELEMENT_REFERENCE = 22;

  /**
   * The feature id for the '<em><b>Self</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_REFERENCE__SELF = ROOT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Root</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_REFERENCE__ROOT = ROOT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Currentmode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_REFERENCE__CURRENTMODE = ROOT_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Cref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_REFERENCE__CREF = ROOT_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Package Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_REFERENCE__PACKAGE_NAME = ROOT_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_REFERENCE__REF = ROOT_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>element reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_REFERENCE_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.ContainmentPathElementImpl <em>Containment Path Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.ContainmentPathElementImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getContainmentPathElement()
   * @generated
   */
  int CONTAINMENT_PATH_ELEMENT = 23;

  /**
   * The feature id for the '<em><b>Named Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINMENT_PATH_ELEMENT__NAMED_ELEMENT = 0;

  /**
   * The feature id for the '<em><b>Array Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINMENT_PATH_ELEMENT__ARRAY_RANGE = 1;

  /**
   * The feature id for the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINMENT_PATH_ELEMENT__PATH = 2;

  /**
   * The number of structural features of the '<em>Containment Path Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINMENT_PATH_ELEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.ArrayRangeImpl <em>Array Range</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.ArrayRangeImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getArrayRange()
   * @generated
   */
  int ARRAY_RANGE = 24;

  /**
   * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_RANGE__LOWER_BOUND = 0;

  /**
   * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_RANGE__UPPER_BOUND = 1;

  /**
   * The number of structural features of the '<em>Array Range</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_RANGE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.PackageEnforceImpl <em>Package Enforce</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.PackageEnforceImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getPackageEnforce()
   * @generated
   */
  int PACKAGE_ENFORCE = 25;

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
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.assertion_expressionImpl <em>assertion expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.assertion_expressionImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getassertion_expression()
   * @generated
   */
  int ASSERTION_EXPRESSION = 26;

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
  int STRING_EXPRESSION = 27;

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
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.constant_expressionImpl <em>constant expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.constant_expressionImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getconstant_expression()
   * @generated
   */
  int CONSTANT_EXPRESSION = 28;

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
  int EXPRESSION = 29;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__NAME = CONSTANT_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = CONSTANT_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.BooleanTermImpl <em>Boolean Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.BooleanTermImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getBooleanTerm()
   * @generated
   */
  int BOOLEAN_TERM = 30;

  /**
   * The feature id for the '<em><b>Xbool</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_TERM__XBOOL = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Member check</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_TERM__MEMBER_CHECK = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Collect expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_TERM__COLLECT_EXPR = XbasePackage.XEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Boolean Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_TERM_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.CollectionTermImpl <em>Collection Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.CollectionTermImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getCollectionTerm()
   * @generated
   */
  int COLLECTION_TERM = 31;

  /**
   * The feature id for the '<em><b>Xc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_TERM__XC = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Query set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_TERM__QUERY_SET = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Set c</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_TERM__SET_C = XbasePackage.XEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Collection Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_TERM_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.Set_comprehensionImpl <em>Set comprehension</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.Set_comprehensionImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getSet_comprehension()
   * @generated
   */
  int SET_COMPREHENSION = 32;

  /**
   * The feature id for the '<em><b>Result</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_COMPREHENSION__RESULT = 0;

  /**
   * The feature id for the '<em><b>Var</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_COMPREHENSION__VAR = 1;

  /**
   * The feature id for the '<em><b>Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_COMPREHENSION__SET = 2;

  /**
   * The feature id for the '<em><b>Cond</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_COMPREHENSION__COND = 3;

  /**
   * The number of structural features of the '<em>Set comprehension</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_COMPREHENSION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.Query_element_setImpl <em>Query element set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.Query_element_setImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getQuery_element_set()
   * @generated
   */
  int QUERY_ELEMENT_SET = 33;

  /**
   * The feature id for the '<em><b>Direct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_ELEMENT_SET__DIRECT = 0;

  /**
   * The feature id for the '<em><b>Result types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_ELEMENT_SET__RESULT_TYPES = 1;

  /**
   * The feature id for the '<em><b>Elem set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_ELEMENT_SET__ELEM_SET = 2;

  /**
   * The feature id for the '<em><b>Mode spec</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_ELEMENT_SET__MODE_SPEC = 3;

  /**
   * The number of structural features of the '<em>Query element set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_ELEMENT_SET_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.Element_typesImpl <em>Element types</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.Element_typesImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getElement_types()
   * @generated
   */
  int ELEMENT_TYPES = 34;

  /**
   * The feature id for the '<em><b>El type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_TYPES__EL_TYPE = 0;

  /**
   * The feature id for the '<em><b>El types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_TYPES__EL_TYPES = 1;

  /**
   * The number of structural features of the '<em>Element types</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_TYPES_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.MCSAnnexSubclauseImpl <em>MCS Annex Subclause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.MCSAnnexSubclauseImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getMCSAnnexSubclause()
   * @generated
   */
  int MCS_ANNEX_SUBCLAUSE = 35;

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
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_ANNEX_SUBCLAUSE__TYPES = Aadl2Package.ANNEX_SUBCLAUSE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Constants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_ANNEX_SUBCLAUSE__CONSTANTS = Aadl2Package.ANNEX_SUBCLAUSE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_ANNEX_SUBCLAUSE__FUNCTIONS = Aadl2Package.ANNEX_SUBCLAUSE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Theorems</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_ANNEX_SUBCLAUSE__THEOREMS = Aadl2Package.ANNEX_SUBCLAUSE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Enforceclauses</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_ANNEX_SUBCLAUSE__ENFORCECLAUSES = Aadl2Package.ANNEX_SUBCLAUSE_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>MCS Annex Subclause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_ANNEX_SUBCLAUSE_FEATURE_COUNT = Aadl2Package.ANNEX_SUBCLAUSE_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.ClassifierEnforceImpl <em>Classifier Enforce</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.ClassifierEnforceImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getClassifierEnforce()
   * @generated
   */
  int CLASSIFIER_ENFORCE = 36;

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
  int CLASSIFIER_SCRIPT = 37;

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
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.Function_declarationImpl <em>Function declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.Function_declarationImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getFunction_declaration()
   * @generated
   */
  int FUNCTION_DECLARATION = 38;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Arg</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__ARG = 1;

  /**
   * The feature id for the '<em><b>Out</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__OUT = 2;

  /**
   * The feature id for the '<em><b>Ftype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__FTYPE = 3;

  /**
   * The feature id for the '<em><b>Typeref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__TYPEREF = 4;

  /**
   * The feature id for the '<em><b>Closure</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__CLOSURE = 5;

  /**
   * The feature id for the '<em><b>Exp body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__EXP_BODY = 6;

  /**
   * The number of structural features of the '<em>Function declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.ArgumentImpl <em>Argument</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.ArgumentImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getArgument()
   * @generated
   */
  int ARGUMENT = 39;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Arg type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__ARG_TYPE = 1;

  /**
   * The number of structural features of the '<em>Argument</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.Theorem_declarationImpl <em>Theorem declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.Theorem_declarationImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getTheorem_declaration()
   * @generated
   */
  int THEOREM_DECLARATION = 40;

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
   * The feature id for the '<em><b>Endname</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEOREM_DECLARATION__ENDNAME = 4;

  /**
   * The number of structural features of the '<em>Theorem declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEOREM_DECLARATION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.In_modes_listImpl <em>In modes list</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.In_modes_listImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getIn_modes_list()
   * @generated
   */
  int IN_MODES_LIST = 41;

  /**
   * The feature id for the '<em><b>Modes</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_MODES_LIST__MODES = 0;

  /**
   * The number of structural features of the '<em>In modes list</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_MODES_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.Local_declarationImpl <em>Local declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.Local_declarationImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getLocal_declaration()
   * @generated
   */
  int LOCAL_DECLARATION = 42;

  /**
   * The feature id for the '<em><b>Const</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_DECLARATION__CONST = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_DECLARATION__NAME = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_DECLARATION__TYPE = 2;

  /**
   * The feature id for the '<em><b>Left expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_DECLARATION__LEFT_EXPR = 3;

  /**
   * The number of structural features of the '<em>Local declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_DECLARATION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.Basic_statementImpl <em>Basic statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.Basic_statementImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getBasic_statement()
   * @generated
   */
  int BASIC_STATEMENT = 44;

  /**
   * The number of structural features of the '<em>Basic statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_STATEMENT_FEATURE_COUNT = THEOREM_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.IterationImpl <em>Iteration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.IterationImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getIteration()
   * @generated
   */
  int ITERATION = 45;

  /**
   * The feature id for the '<em><b>Var id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITERATION__VAR_ID = BASIC_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITERATION__EXPR = BASIC_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Local</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITERATION__LOCAL = BASIC_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITERATION__STATEMENTS = BASIC_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Iteration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITERATION_FEATURE_COUNT = BASIC_STATEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.Type_expressionImpl <em>Type expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.Type_expressionImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getType_expression()
   * @generated
   */
  int TYPE_EXPRESSION = 46;

  /**
   * The feature id for the '<em><b>Basic</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_EXPRESSION__BASIC = 0;

  /**
   * The feature id for the '<em><b>Composite</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_EXPRESSION__COMPOSITE = 1;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_EXPRESSION__ELEMENT = 2;

  /**
   * The number of structural features of the '<em>Type expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_EXPRESSION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.Basic_typeImpl <em>Basic type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.Basic_typeImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getBasic_type()
   * @generated
   */
  int BASIC_TYPE = 47;

  /**
   * The feature id for the '<em><b>Bool</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_TYPE__BOOL = 0;

  /**
   * The feature id for the '<em><b>String</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_TYPE__STRING = 1;

  /**
   * The feature id for the '<em><b>Enumer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_TYPE__ENUMER = 2;

  /**
   * The feature id for the '<em><b>Units</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_TYPE__UNITS = 3;

  /**
   * The feature id for the '<em><b>Integer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_TYPE__INTEGER = 4;

  /**
   * The feature id for the '<em><b>Real</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_TYPE__REAL = 5;

  /**
   * The feature id for the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_TYPE__RANGE = 6;

  /**
   * The feature id for the '<em><b>Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_TYPE__CLASS = 7;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_TYPE__REF = 8;

  /**
   * The feature id for the '<em><b>Func</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_TYPE__FUNC = 9;

  /**
   * The feature id for the '<em><b>Typename</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_TYPE__TYPENAME = 10;

  /**
   * The number of structural features of the '<em>Basic type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_TYPE_FEATURE_COUNT = 11;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.UnnamedFunctionTypeImpl <em>Unnamed Function Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.UnnamedFunctionTypeImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getUnnamedFunctionType()
   * @generated
   */
  int UNNAMED_FUNCTION_TYPE = 48;

  /**
   * The feature id for the '<em><b>Parm</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNNAMED_FUNCTION_TYPE__PARM = 0;

  /**
   * The feature id for the '<em><b>Outspec</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNNAMED_FUNCTION_TYPE__OUTSPEC = 1;

  /**
   * The feature id for the '<em><b>Result</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNNAMED_FUNCTION_TYPE__RESULT = 2;

  /**
   * The number of structural features of the '<em>Unnamed Function Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNNAMED_FUNCTION_TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.Composite_typeImpl <em>Composite type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.Composite_typeImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getComposite_type()
   * @generated
   */
  int COMPOSITE_TYPE = 49;

  /**
   * The number of structural features of the '<em>Composite type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.Set_typeImpl <em>Set type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.Set_typeImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getSet_type()
   * @generated
   */
  int SET_TYPE = 50;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_TYPE__TYPE = COMPOSITE_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Set type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_TYPE_FEATURE_COUNT = COMPOSITE_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.List_typeImpl <em>List type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.List_typeImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getList_type()
   * @generated
   */
  int LIST_TYPE = 51;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_TYPE__TYPE = COMPOSITE_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>List type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_TYPE_FEATURE_COUNT = COMPOSITE_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.Map_typeImpl <em>Map type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.Map_typeImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getMap_type()
   * @generated
   */
  int MAP_TYPE = 52;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_TYPE__TYPE = COMPOSITE_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Map type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_TYPE_FEATURE_COUNT = COMPOSITE_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.Record_typeImpl <em>Record type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.Record_typeImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getRecord_type()
   * @generated
   */
  int RECORD_TYPE = 53;

  /**
   * The feature id for the '<em><b>Field</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_TYPE__FIELD = COMPOSITE_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Record type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_TYPE_FEATURE_COUNT = COMPOSITE_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.Union_typeImpl <em>Union type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.Union_typeImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getUnion_type()
   * @generated
   */
  int UNION_TYPE = 54;

  /**
   * The feature id for the '<em><b>Typename</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNION_TYPE__TYPENAME = COMPOSITE_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNION_TYPE__TYPE = COMPOSITE_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Union type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNION_TYPE_FEATURE_COUNT = COMPOSITE_TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.Id_type_pairImpl <em>Id type pair</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.Id_type_pairImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getId_type_pair()
   * @generated
   */
  int ID_TYPE_PAIR = 55;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_TYPE_PAIR__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_TYPE_PAIR__TYPE = 1;

  /**
   * The number of structural features of the '<em>Id type pair</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_TYPE_PAIR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.Element_typeImpl <em>Element type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.Element_typeImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getElement_type()
   * @generated
   */
  int ELEMENT_TYPE = 56;

  /**
   * The feature id for the '<em><b>Telem</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_TYPE__TELEM = 0;

  /**
   * The feature id for the '<em><b>Tclass</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_TYPE__TCLASS = 1;

  /**
   * The feature id for the '<em><b>Tref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_TYPE__TREF = 2;

  /**
   * The number of structural features of the '<em>Element type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_classifiersImpl <em>tclassifiers</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.t_classifiersImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#gett_classifiers()
   * @generated
   */
  int TCLASSIFIERS = 57;

  /**
   * The feature id for the '<em><b>Tclass</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCLASSIFIERS__TCLASS = 0;

  /**
   * The feature id for the '<em><b>Tclass subtype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCLASSIFIERS__TCLASS_SUBTYPE = 1;

  /**
   * The number of structural features of the '<em>tclassifiers</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCLASSIFIERS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_classifier_subtypesImpl <em>tclassifier subtypes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.t_classifier_subtypesImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#gett_classifier_subtypes()
   * @generated
   */
  int TCLASSIFIER_SUBTYPES = 58;

  /**
   * The feature id for the '<em><b>Tctype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCLASSIFIER_SUBTYPES__TCTYPE = 0;

  /**
   * The feature id for the '<em><b>Tcimpl</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCLASSIFIER_SUBTYPES__TCIMPL = 1;

  /**
   * The feature id for the '<em><b>Tfgclass</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCLASSIFIER_SUBTYPES__TFGCLASS = 2;

  /**
   * The feature id for the '<em><b>Tannexclass</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCLASSIFIER_SUBTYPES__TANNEXCLASS = 3;

  /**
   * The number of structural features of the '<em>tclassifier subtypes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCLASSIFIER_SUBTYPES_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_named_referencesImpl <em>tnamed references</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.t_named_referencesImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#gett_named_references()
   * @generated
   */
  int TNAMED_REFERENCES = 59;

  /**
   * The feature id for the '<em><b>Tnref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TNAMED_REFERENCES__TNREF = 0;

  /**
   * The feature id for the '<em><b>Tnref st</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TNAMED_REFERENCES__TNREF_ST = 1;

  /**
   * The number of structural features of the '<em>tnamed references</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TNAMED_REFERENCES_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_named_reference_subtypesImpl <em>tnamed reference subtypes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.t_named_reference_subtypesImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#gett_named_reference_subtypes()
   * @generated
   */
  int TNAMED_REFERENCE_SUBTYPES = 60;

  /**
   * The feature id for the '<em><b>Tsubc st</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TNAMED_REFERENCE_SUBTYPES__TSUBC_ST = 0;

  /**
   * The feature id for the '<em><b>Tsbcall</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TNAMED_REFERENCE_SUBTYPES__TSBCALL = 1;

  /**
   * The feature id for the '<em><b>Tcallseq</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TNAMED_REFERENCE_SUBTYPES__TCALLSEQ = 2;

  /**
   * The feature id for the '<em><b>Teeflow</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TNAMED_REFERENCE_SUBTYPES__TEEFLOW = 3;

  /**
   * The feature id for the '<em><b>Tproto</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TNAMED_REFERENCE_SUBTYPES__TPROTO = 4;

  /**
   * The feature id for the '<em><b>Tmode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TNAMED_REFERENCE_SUBTYPES__TMODE = 5;

  /**
   * The feature id for the '<em><b>Treq mode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TNAMED_REFERENCE_SUBTYPES__TREQ_MODE = 6;

  /**
   * The feature id for the '<em><b>Tmod trans</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TNAMED_REFERENCE_SUBTYPES__TMOD_TRANS = 7;

  /**
   * The feature id for the '<em><b>Tmode trig</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TNAMED_REFERENCE_SUBTYPES__TMODE_TRIG = 8;

  /**
   * The number of structural features of the '<em>tnamed reference subtypes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TNAMED_REFERENCE_SUBTYPES_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_subcomponent_subtypesImpl <em>tsubcomponent subtypes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.t_subcomponent_subtypesImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#gett_subcomponent_subtypes()
   * @generated
   */
  int TSUBCOMPONENT_SUBTYPES = 61;

  /**
   * The feature id for the '<em><b>Tsub</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TSUBCOMPONENT_SUBTYPES__TSUB = 0;

  /**
   * The feature id for the '<em><b>Tannex sub</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TSUBCOMPONENT_SUBTYPES__TANNEX_SUB = 1;

  /**
   * The feature id for the '<em><b>Tcomp typeref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TSUBCOMPONENT_SUBTYPES__TCOMP_TYPEREF = 2;

  /**
   * The feature id for the '<em><b>Tcimpl st</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TSUBCOMPONENT_SUBTYPES__TCIMPL_ST = 3;

  /**
   * The number of structural features of the '<em>tsubcomponent subtypes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TSUBCOMPONENT_SUBTYPES_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_component_impl_subtypesImpl <em>tcomponent impl subtypes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.t_component_impl_subtypesImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#gett_component_impl_subtypes()
   * @generated
   */
  int TCOMPONENT_IMPL_SUBTYPES = 62;

  /**
   * The feature id for the '<em><b>Tcomp impref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCOMPONENT_IMPL_SUBTYPES__TCOMP_IMPREF = 0;

  /**
   * The feature id for the '<em><b>Tabstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCOMPONENT_IMPL_SUBTYPES__TABSTRACT = 1;

  /**
   * The feature id for the '<em><b>Tsys</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCOMPONENT_IMPL_SUBTYPES__TSYS = 2;

  /**
   * The feature id for the '<em><b>Tproc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCOMPONENT_IMPL_SUBTYPES__TPROC = 3;

  /**
   * The feature id for the '<em><b>Tvirt proc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCOMPONENT_IMPL_SUBTYPES__TVIRT_PROC = 4;

  /**
   * The feature id for the '<em><b>Tbus</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCOMPONENT_IMPL_SUBTYPES__TBUS = 5;

  /**
   * The feature id for the '<em><b>Tvbus</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCOMPONENT_IMPL_SUBTYPES__TVBUS = 6;

  /**
   * The feature id for the '<em><b>Tmem</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCOMPONENT_IMPL_SUBTYPES__TMEM = 7;

  /**
   * The feature id for the '<em><b>Ttg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCOMPONENT_IMPL_SUBTYPES__TTG = 8;

  /**
   * The feature id for the '<em><b>Tt</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCOMPONENT_IMPL_SUBTYPES__TT = 9;

  /**
   * The feature id for the '<em><b>Td</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCOMPONENT_IMPL_SUBTYPES__TD = 10;

  /**
   * The feature id for the '<em><b>Tsubprog</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCOMPONENT_IMPL_SUBTYPES__TSUBPROG = 11;

  /**
   * The feature id for the '<em><b>Tsubprog g</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCOMPONENT_IMPL_SUBTYPES__TSUBPROG_G = 12;

  /**
   * The number of structural features of the '<em>tcomponent impl subtypes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCOMPONENT_IMPL_SUBTYPES_FEATURE_COUNT = 13;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_connection_subtypesImpl <em>tconnection subtypes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.t_connection_subtypesImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#gett_connection_subtypes()
   * @generated
   */
  int TCONNECTION_SUBTYPES = 63;

  /**
   * The feature id for the '<em><b>Tsubc st</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCONNECTION_SUBTYPES__TSUBC_ST = TNAMED_REFERENCE_SUBTYPES__TSUBC_ST;

  /**
   * The feature id for the '<em><b>Tsbcall</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCONNECTION_SUBTYPES__TSBCALL = TNAMED_REFERENCE_SUBTYPES__TSBCALL;

  /**
   * The feature id for the '<em><b>Tcallseq</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCONNECTION_SUBTYPES__TCALLSEQ = TNAMED_REFERENCE_SUBTYPES__TCALLSEQ;

  /**
   * The feature id for the '<em><b>Teeflow</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCONNECTION_SUBTYPES__TEEFLOW = TNAMED_REFERENCE_SUBTYPES__TEEFLOW;

  /**
   * The feature id for the '<em><b>Tproto</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCONNECTION_SUBTYPES__TPROTO = TNAMED_REFERENCE_SUBTYPES__TPROTO;

  /**
   * The feature id for the '<em><b>Tmode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCONNECTION_SUBTYPES__TMODE = TNAMED_REFERENCE_SUBTYPES__TMODE;

  /**
   * The feature id for the '<em><b>Treq mode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCONNECTION_SUBTYPES__TREQ_MODE = TNAMED_REFERENCE_SUBTYPES__TREQ_MODE;

  /**
   * The feature id for the '<em><b>Tmod trans</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCONNECTION_SUBTYPES__TMOD_TRANS = TNAMED_REFERENCE_SUBTYPES__TMOD_TRANS;

  /**
   * The feature id for the '<em><b>Tmode trig</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCONNECTION_SUBTYPES__TMODE_TRIG = TNAMED_REFERENCE_SUBTYPES__TMODE_TRIG;

  /**
   * The feature id for the '<em><b>Tconn</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCONNECTION_SUBTYPES__TCONN = TNAMED_REFERENCE_SUBTYPES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tfeat conn</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCONNECTION_SUBTYPES__TFEAT_CONN = TNAMED_REFERENCE_SUBTYPES_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Tport conn</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCONNECTION_SUBTYPES__TPORT_CONN = TNAMED_REFERENCE_SUBTYPES_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Tparm conn</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCONNECTION_SUBTYPES__TPARM_CONN = TNAMED_REFERENCE_SUBTYPES_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Tacc con</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCONNECTION_SUBTYPES__TACC_CON = TNAMED_REFERENCE_SUBTYPES_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Tfg conn</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCONNECTION_SUBTYPES__TFG_CONN = TNAMED_REFERENCE_SUBTYPES_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>tconnection subtypes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCONNECTION_SUBTYPES_FEATURE_COUNT = TNAMED_REFERENCE_SUBTYPES_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_feature_subtypesImpl <em>tfeature subtypes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.t_feature_subtypesImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#gett_feature_subtypes()
   * @generated
   */
  int TFEATURE_SUBTYPES = 64;

  /**
   * The feature id for the '<em><b>Tsubc st</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFEATURE_SUBTYPES__TSUBC_ST = TNAMED_REFERENCE_SUBTYPES__TSUBC_ST;

  /**
   * The feature id for the '<em><b>Tsbcall</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFEATURE_SUBTYPES__TSBCALL = TNAMED_REFERENCE_SUBTYPES__TSBCALL;

  /**
   * The feature id for the '<em><b>Tcallseq</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFEATURE_SUBTYPES__TCALLSEQ = TNAMED_REFERENCE_SUBTYPES__TCALLSEQ;

  /**
   * The feature id for the '<em><b>Teeflow</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFEATURE_SUBTYPES__TEEFLOW = TNAMED_REFERENCE_SUBTYPES__TEEFLOW;

  /**
   * The feature id for the '<em><b>Tproto</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFEATURE_SUBTYPES__TPROTO = TNAMED_REFERENCE_SUBTYPES__TPROTO;

  /**
   * The feature id for the '<em><b>Tmode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFEATURE_SUBTYPES__TMODE = TNAMED_REFERENCE_SUBTYPES__TMODE;

  /**
   * The feature id for the '<em><b>Treq mode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFEATURE_SUBTYPES__TREQ_MODE = TNAMED_REFERENCE_SUBTYPES__TREQ_MODE;

  /**
   * The feature id for the '<em><b>Tmod trans</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFEATURE_SUBTYPES__TMOD_TRANS = TNAMED_REFERENCE_SUBTYPES__TMOD_TRANS;

  /**
   * The feature id for the '<em><b>Tmode trig</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFEATURE_SUBTYPES__TMODE_TRIG = TNAMED_REFERENCE_SUBTYPES__TMODE_TRIG;

  /**
   * The feature id for the '<em><b>Tfeat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFEATURE_SUBTYPES__TFEAT = TNAMED_REFERENCE_SUBTYPES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tabs feat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFEATURE_SUBTYPES__TABS_FEAT = TNAMED_REFERENCE_SUBTYPES_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Tparm</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFEATURE_SUBTYPES__TPARM = TNAMED_REFERENCE_SUBTYPES_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Tfg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFEATURE_SUBTYPES__TFG = TNAMED_REFERENCE_SUBTYPES_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>tfeature subtypes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFEATURE_SUBTYPES_FEATURE_COUNT = TNAMED_REFERENCE_SUBTYPES_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_access_subtypesImpl <em>taccess subtypes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.t_access_subtypesImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#gett_access_subtypes()
   * @generated
   */
  int TACCESS_SUBTYPES = 65;

  /**
   * The feature id for the '<em><b>Tsubc st</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TACCESS_SUBTYPES__TSUBC_ST = TFEATURE_SUBTYPES__TSUBC_ST;

  /**
   * The feature id for the '<em><b>Tsbcall</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TACCESS_SUBTYPES__TSBCALL = TFEATURE_SUBTYPES__TSBCALL;

  /**
   * The feature id for the '<em><b>Tcallseq</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TACCESS_SUBTYPES__TCALLSEQ = TFEATURE_SUBTYPES__TCALLSEQ;

  /**
   * The feature id for the '<em><b>Teeflow</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TACCESS_SUBTYPES__TEEFLOW = TFEATURE_SUBTYPES__TEEFLOW;

  /**
   * The feature id for the '<em><b>Tproto</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TACCESS_SUBTYPES__TPROTO = TFEATURE_SUBTYPES__TPROTO;

  /**
   * The feature id for the '<em><b>Tmode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TACCESS_SUBTYPES__TMODE = TFEATURE_SUBTYPES__TMODE;

  /**
   * The feature id for the '<em><b>Treq mode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TACCESS_SUBTYPES__TREQ_MODE = TFEATURE_SUBTYPES__TREQ_MODE;

  /**
   * The feature id for the '<em><b>Tmod trans</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TACCESS_SUBTYPES__TMOD_TRANS = TFEATURE_SUBTYPES__TMOD_TRANS;

  /**
   * The feature id for the '<em><b>Tmode trig</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TACCESS_SUBTYPES__TMODE_TRIG = TFEATURE_SUBTYPES__TMODE_TRIG;

  /**
   * The feature id for the '<em><b>Tfeat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TACCESS_SUBTYPES__TFEAT = TFEATURE_SUBTYPES__TFEAT;

  /**
   * The feature id for the '<em><b>Tabs feat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TACCESS_SUBTYPES__TABS_FEAT = TFEATURE_SUBTYPES__TABS_FEAT;

  /**
   * The feature id for the '<em><b>Tparm</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TACCESS_SUBTYPES__TPARM = TFEATURE_SUBTYPES__TPARM;

  /**
   * The feature id for the '<em><b>Tfg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TACCESS_SUBTYPES__TFG = TFEATURE_SUBTYPES__TFG;

  /**
   * The feature id for the '<em><b>Taccess</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TACCESS_SUBTYPES__TACCESS = TFEATURE_SUBTYPES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tdata acc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TACCESS_SUBTYPES__TDATA_ACC = TFEATURE_SUBTYPES_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Tsub acc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TACCESS_SUBTYPES__TSUB_ACC = TFEATURE_SUBTYPES_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Tsub gr acc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TACCESS_SUBTYPES__TSUB_GR_ACC = TFEATURE_SUBTYPES_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Tbus acc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TACCESS_SUBTYPES__TBUS_ACC = TFEATURE_SUBTYPES_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>taccess subtypes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TACCESS_SUBTYPES_FEATURE_COUNT = TFEATURE_SUBTYPES_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_port_subtypesImpl <em>tport subtypes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.t_port_subtypesImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#gett_port_subtypes()
   * @generated
   */
  int TPORT_SUBTYPES = 66;

  /**
   * The feature id for the '<em><b>Tsubc st</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TPORT_SUBTYPES__TSUBC_ST = TFEATURE_SUBTYPES__TSUBC_ST;

  /**
   * The feature id for the '<em><b>Tsbcall</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TPORT_SUBTYPES__TSBCALL = TFEATURE_SUBTYPES__TSBCALL;

  /**
   * The feature id for the '<em><b>Tcallseq</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TPORT_SUBTYPES__TCALLSEQ = TFEATURE_SUBTYPES__TCALLSEQ;

  /**
   * The feature id for the '<em><b>Teeflow</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TPORT_SUBTYPES__TEEFLOW = TFEATURE_SUBTYPES__TEEFLOW;

  /**
   * The feature id for the '<em><b>Tproto</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TPORT_SUBTYPES__TPROTO = TFEATURE_SUBTYPES__TPROTO;

  /**
   * The feature id for the '<em><b>Tmode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TPORT_SUBTYPES__TMODE = TFEATURE_SUBTYPES__TMODE;

  /**
   * The feature id for the '<em><b>Treq mode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TPORT_SUBTYPES__TREQ_MODE = TFEATURE_SUBTYPES__TREQ_MODE;

  /**
   * The feature id for the '<em><b>Tmod trans</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TPORT_SUBTYPES__TMOD_TRANS = TFEATURE_SUBTYPES__TMOD_TRANS;

  /**
   * The feature id for the '<em><b>Tmode trig</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TPORT_SUBTYPES__TMODE_TRIG = TFEATURE_SUBTYPES__TMODE_TRIG;

  /**
   * The feature id for the '<em><b>Tfeat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TPORT_SUBTYPES__TFEAT = TFEATURE_SUBTYPES__TFEAT;

  /**
   * The feature id for the '<em><b>Tabs feat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TPORT_SUBTYPES__TABS_FEAT = TFEATURE_SUBTYPES__TABS_FEAT;

  /**
   * The feature id for the '<em><b>Tparm</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TPORT_SUBTYPES__TPARM = TFEATURE_SUBTYPES__TPARM;

  /**
   * The feature id for the '<em><b>Tfg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TPORT_SUBTYPES__TFG = TFEATURE_SUBTYPES__TFG;

  /**
   * The feature id for the '<em><b>Tport</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TPORT_SUBTYPES__TPORT = TFEATURE_SUBTYPES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tdport</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TPORT_SUBTYPES__TDPORT = TFEATURE_SUBTYPES_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Tev port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TPORT_SUBTYPES__TEV_PORT = TFEATURE_SUBTYPES_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Tevd port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TPORT_SUBTYPES__TEVD_PORT = TFEATURE_SUBTYPES_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>tport subtypes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TPORT_SUBTYPES_FEATURE_COUNT = TFEATURE_SUBTYPES_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_flow_spec_subtypesImpl <em>tflow spec subtypes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.t_flow_spec_subtypesImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#gett_flow_spec_subtypes()
   * @generated
   */
  int TFLOW_SPEC_SUBTYPES = 67;

  /**
   * The feature id for the '<em><b>Tsubc st</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFLOW_SPEC_SUBTYPES__TSUBC_ST = TNAMED_REFERENCE_SUBTYPES__TSUBC_ST;

  /**
   * The feature id for the '<em><b>Tsbcall</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFLOW_SPEC_SUBTYPES__TSBCALL = TNAMED_REFERENCE_SUBTYPES__TSBCALL;

  /**
   * The feature id for the '<em><b>Tcallseq</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFLOW_SPEC_SUBTYPES__TCALLSEQ = TNAMED_REFERENCE_SUBTYPES__TCALLSEQ;

  /**
   * The feature id for the '<em><b>Teeflow</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFLOW_SPEC_SUBTYPES__TEEFLOW = TNAMED_REFERENCE_SUBTYPES__TEEFLOW;

  /**
   * The feature id for the '<em><b>Tproto</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFLOW_SPEC_SUBTYPES__TPROTO = TNAMED_REFERENCE_SUBTYPES__TPROTO;

  /**
   * The feature id for the '<em><b>Tmode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFLOW_SPEC_SUBTYPES__TMODE = TNAMED_REFERENCE_SUBTYPES__TMODE;

  /**
   * The feature id for the '<em><b>Treq mode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFLOW_SPEC_SUBTYPES__TREQ_MODE = TNAMED_REFERENCE_SUBTYPES__TREQ_MODE;

  /**
   * The feature id for the '<em><b>Tmod trans</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFLOW_SPEC_SUBTYPES__TMOD_TRANS = TNAMED_REFERENCE_SUBTYPES__TMOD_TRANS;

  /**
   * The feature id for the '<em><b>Tmode trig</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFLOW_SPEC_SUBTYPES__TMODE_TRIG = TNAMED_REFERENCE_SUBTYPES__TMODE_TRIG;

  /**
   * The feature id for the '<em><b>Tfspec</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFLOW_SPEC_SUBTYPES__TFSPEC = TNAMED_REFERENCE_SUBTYPES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tfspec source</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFLOW_SPEC_SUBTYPES__TFSPEC_SOURCE = TNAMED_REFERENCE_SUBTYPES_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Tfspec sink</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFLOW_SPEC_SUBTYPES__TFSPEC_SINK = TNAMED_REFERENCE_SUBTYPES_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Tfspec path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFLOW_SPEC_SUBTYPES__TFSPEC_PATH = TNAMED_REFERENCE_SUBTYPES_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>tflow spec subtypes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFLOW_SPEC_SUBTYPES_FEATURE_COUNT = TNAMED_REFERENCE_SUBTYPES_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_flow_impl_subtypesImpl <em>tflow impl subtypes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.t_flow_impl_subtypesImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#gett_flow_impl_subtypes()
   * @generated
   */
  int TFLOW_IMPL_SUBTYPES = 68;

  /**
   * The feature id for the '<em><b>Tsubc st</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFLOW_IMPL_SUBTYPES__TSUBC_ST = TNAMED_REFERENCE_SUBTYPES__TSUBC_ST;

  /**
   * The feature id for the '<em><b>Tsbcall</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFLOW_IMPL_SUBTYPES__TSBCALL = TNAMED_REFERENCE_SUBTYPES__TSBCALL;

  /**
   * The feature id for the '<em><b>Tcallseq</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFLOW_IMPL_SUBTYPES__TCALLSEQ = TNAMED_REFERENCE_SUBTYPES__TCALLSEQ;

  /**
   * The feature id for the '<em><b>Teeflow</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFLOW_IMPL_SUBTYPES__TEEFLOW = TNAMED_REFERENCE_SUBTYPES__TEEFLOW;

  /**
   * The feature id for the '<em><b>Tproto</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFLOW_IMPL_SUBTYPES__TPROTO = TNAMED_REFERENCE_SUBTYPES__TPROTO;

  /**
   * The feature id for the '<em><b>Tmode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFLOW_IMPL_SUBTYPES__TMODE = TNAMED_REFERENCE_SUBTYPES__TMODE;

  /**
   * The feature id for the '<em><b>Treq mode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFLOW_IMPL_SUBTYPES__TREQ_MODE = TNAMED_REFERENCE_SUBTYPES__TREQ_MODE;

  /**
   * The feature id for the '<em><b>Tmod trans</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFLOW_IMPL_SUBTYPES__TMOD_TRANS = TNAMED_REFERENCE_SUBTYPES__TMOD_TRANS;

  /**
   * The feature id for the '<em><b>Tmode trig</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFLOW_IMPL_SUBTYPES__TMODE_TRIG = TNAMED_REFERENCE_SUBTYPES__TMODE_TRIG;

  /**
   * The feature id for the '<em><b>Tfi</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFLOW_IMPL_SUBTYPES__TFI = TNAMED_REFERENCE_SUBTYPES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tfisource</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFLOW_IMPL_SUBTYPES__TFISOURCE = TNAMED_REFERENCE_SUBTYPES_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Tfisink</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFLOW_IMPL_SUBTYPES__TFISINK = TNAMED_REFERENCE_SUBTYPES_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Tfipath</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFLOW_IMPL_SUBTYPES__TFIPATH = TNAMED_REFERENCE_SUBTYPES_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>tflow impl subtypes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFLOW_IMPL_SUBTYPES_FEATURE_COUNT = TNAMED_REFERENCE_SUBTYPES_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.MCSClosureImpl <em>MCS Closure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.MCSClosureImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getMCSClosure()
   * @generated
   */
  int MCS_CLOSURE = 69;

  /**
   * The feature id for the '<em><b>Declared Formal Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_CLOSURE__DECLARED_FORMAL_PARAMETERS = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Explicit Syntax</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_CLOSURE__EXPLICIT_SYNTAX = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_CLOSURE__EXPRESSION = XbasePackage.XEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>MCS Closure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_CLOSURE_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 3;


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
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.mcs.mcs.MCSAnnexLibrary#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.MCSAnnexLibrary#getTypes()
   * @see #getMCSAnnexLibrary()
   * @generated
   */
  EReference getMCSAnnexLibrary_Types();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.mcs.mcs.MCSAnnexLibrary#getConstants <em>Constants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constants</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.MCSAnnexLibrary#getConstants()
   * @see #getMCSAnnexLibrary()
   * @generated
   */
  EReference getMCSAnnexLibrary_Constants();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.mcs.mcs.MCSAnnexLibrary#getFunctions <em>Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Functions</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.MCSAnnexLibrary#getFunctions()
   * @see #getMCSAnnexLibrary()
   * @generated
   */
  EReference getMCSAnnexLibrary_Functions();

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
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.Type_declaration <em>Type declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type declaration</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Type_declaration
   * @generated
   */
  EClass getType_declaration();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.Type_declaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Type_declaration#getName()
   * @see #getType_declaration()
   * @generated
   */
  EAttribute getType_declaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.Type_declaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Type_declaration#getType()
   * @see #getType_declaration()
   * @generated
   */
  EReference getType_declaration_Type();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.Constant_declaration <em>Constant declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant declaration</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Constant_declaration
   * @generated
   */
  EClass getConstant_declaration();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.Constant_declaration#isConst <em>Const</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Const</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Constant_declaration#isConst()
   * @see #getConstant_declaration()
   * @generated
   */
  EAttribute getConstant_declaration_Const();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.Constant_declaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Constant_declaration#getName()
   * @see #getConstant_declaration()
   * @generated
   */
  EAttribute getConstant_declaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.Constant_declaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Constant_declaration#getType()
   * @see #getConstant_declaration()
   * @generated
   */
  EReference getConstant_declaration_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.Constant_declaration#getLeft_expr <em>Left expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left expr</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Constant_declaration#getLeft_expr()
   * @see #getConstant_declaration()
   * @generated
   */
  EReference getConstant_declaration_Left_expr();

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
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.mcs.mcs.AppliesToClause#getCategory <em>Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Category</em>'.
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
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.mcs.mcs.check_theorem#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.check_theorem#getName()
   * @see #getcheck_theorem()
   * @generated
   */
  EReference getcheck_theorem_Name();

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
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.property_reference <em>property reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>property reference</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.property_reference
   * @generated
   */
  EClass getproperty_reference();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.property_reference#getEl_ref <em>El ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>El ref</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.property_reference#getEl_ref()
   * @see #getproperty_reference()
   * @generated
   */
  EReference getproperty_reference_El_ref();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.property_reference#isExists <em>Exists</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Exists</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.property_reference#isExists()
   * @see #getproperty_reference()
   * @generated
   */
  EAttribute getproperty_reference_Exists();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.mcs.mcs.property_reference#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Property</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.property_reference#getProperty()
   * @see #getproperty_reference()
   * @generated
   */
  EReference getproperty_reference_Property();

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
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.element_reference#isSelf <em>Self</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Self</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.element_reference#isSelf()
   * @see #getelement_reference()
   * @generated
   */
  EAttribute getelement_reference_Self();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.element_reference#isRoot <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Root</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.element_reference#isRoot()
   * @see #getelement_reference()
   * @generated
   */
  EAttribute getelement_reference_Root();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.element_reference#isCurrentmode <em>Currentmode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Currentmode</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.element_reference#isCurrentmode()
   * @see #getelement_reference()
   * @generated
   */
  EAttribute getelement_reference_Currentmode();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.mcs.mcs.element_reference#getCref <em>Cref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Cref</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.element_reference#getCref()
   * @see #getelement_reference()
   * @generated
   */
  EReference getelement_reference_Cref();

  /**
   * Returns the meta object for the attribute list '{@link org.osate.xtext.aadl2.mcs.mcs.element_reference#getPackageName <em>Package Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Package Name</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.element_reference#getPackageName()
   * @see #getelement_reference()
   * @generated
   */
  EAttribute getelement_reference_PackageName();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.element_reference#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.element_reference#getRef()
   * @see #getelement_reference()
   * @generated
   */
  EReference getelement_reference_Ref();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.ContainmentPathElement <em>Containment Path Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Containment Path Element</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.ContainmentPathElement
   * @generated
   */
  EClass getContainmentPathElement();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.mcs.mcs.ContainmentPathElement#getNamedElement <em>Named Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Named Element</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.ContainmentPathElement#getNamedElement()
   * @see #getContainmentPathElement()
   * @generated
   */
  EReference getContainmentPathElement_NamedElement();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.mcs.mcs.ContainmentPathElement#getArrayRange <em>Array Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Array Range</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.ContainmentPathElement#getArrayRange()
   * @see #getContainmentPathElement()
   * @generated
   */
  EReference getContainmentPathElement_ArrayRange();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.ContainmentPathElement#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Path</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.ContainmentPathElement#getPath()
   * @see #getContainmentPathElement()
   * @generated
   */
  EReference getContainmentPathElement_Path();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.ArrayRange <em>Array Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Range</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.ArrayRange
   * @generated
   */
  EClass getArrayRange();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.ArrayRange#getLowerBound <em>Lower Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lower Bound</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.ArrayRange#getLowerBound()
   * @see #getArrayRange()
   * @generated
   */
  EAttribute getArrayRange_LowerBound();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.ArrayRange#getUpperBound <em>Upper Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Upper Bound</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.ArrayRange#getUpperBound()
   * @see #getArrayRange()
   * @generated
   */
  EAttribute getArrayRange_UpperBound();

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
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.constant_expression <em>constant expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>constant expression</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.constant_expression
   * @generated
   */
  EClass getconstant_expression();

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
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.expression#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.expression#getName()
   * @see #getexpression()
   * @generated
   */
  EReference getexpression_Name();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.BooleanTerm <em>Boolean Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Term</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.BooleanTerm
   * @generated
   */
  EClass getBooleanTerm();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.BooleanTerm#getXbool <em>Xbool</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Xbool</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.BooleanTerm#getXbool()
   * @see #getBooleanTerm()
   * @generated
   */
  EReference getBooleanTerm_Xbool();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.BooleanTerm#getMember_check <em>Member check</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Member check</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.BooleanTerm#getMember_check()
   * @see #getBooleanTerm()
   * @generated
   */
  EReference getBooleanTerm_Member_check();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.BooleanTerm#getCollect_expr <em>Collect expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Collect expr</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.BooleanTerm#getCollect_expr()
   * @see #getBooleanTerm()
   * @generated
   */
  EReference getBooleanTerm_Collect_expr();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.CollectionTerm <em>Collection Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Collection Term</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.CollectionTerm
   * @generated
   */
  EClass getCollectionTerm();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.CollectionTerm#getXc <em>Xc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Xc</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.CollectionTerm#getXc()
   * @see #getCollectionTerm()
   * @generated
   */
  EReference getCollectionTerm_Xc();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.CollectionTerm#getQuery_set <em>Query set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Query set</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.CollectionTerm#getQuery_set()
   * @see #getCollectionTerm()
   * @generated
   */
  EReference getCollectionTerm_Query_set();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.CollectionTerm#getSet_c <em>Set c</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Set c</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.CollectionTerm#getSet_c()
   * @see #getCollectionTerm()
   * @generated
   */
  EReference getCollectionTerm_Set_c();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.Set_comprehension <em>Set comprehension</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Set comprehension</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Set_comprehension
   * @generated
   */
  EClass getSet_comprehension();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.Set_comprehension#getResult <em>Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Result</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Set_comprehension#getResult()
   * @see #getSet_comprehension()
   * @generated
   */
  EReference getSet_comprehension_Result();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.Set_comprehension#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Set_comprehension#getVar()
   * @see #getSet_comprehension()
   * @generated
   */
  EAttribute getSet_comprehension_Var();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.Set_comprehension#getSet <em>Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Set</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Set_comprehension#getSet()
   * @see #getSet_comprehension()
   * @generated
   */
  EReference getSet_comprehension_Set();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.Set_comprehension#isCond <em>Cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cond</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Set_comprehension#isCond()
   * @see #getSet_comprehension()
   * @generated
   */
  EAttribute getSet_comprehension_Cond();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.Query_element_set <em>Query element set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Query element set</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Query_element_set
   * @generated
   */
  EClass getQuery_element_set();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.Query_element_set#isDirect <em>Direct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Direct</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Query_element_set#isDirect()
   * @see #getQuery_element_set()
   * @generated
   */
  EAttribute getQuery_element_set_Direct();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.mcs.mcs.Query_element_set#getResult_types <em>Result types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Result types</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Query_element_set#getResult_types()
   * @see #getQuery_element_set()
   * @generated
   */
  EReference getQuery_element_set_Result_types();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.Query_element_set#getElem_set <em>Elem set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Elem set</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Query_element_set#getElem_set()
   * @see #getQuery_element_set()
   * @generated
   */
  EReference getQuery_element_set_Elem_set();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.Query_element_set#isMode_spec <em>Mode spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mode spec</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Query_element_set#isMode_spec()
   * @see #getQuery_element_set()
   * @generated
   */
  EAttribute getQuery_element_set_Mode_spec();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.Element_types <em>Element types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element types</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Element_types
   * @generated
   */
  EClass getElement_types();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.Element_types#getEl_type <em>El type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>El type</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Element_types#getEl_type()
   * @see #getElement_types()
   * @generated
   */
  EReference getElement_types_El_type();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.mcs.mcs.Element_types#getEl_types <em>El types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>El types</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Element_types#getEl_types()
   * @see #getElement_types()
   * @generated
   */
  EReference getElement_types_El_types();

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
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.mcs.mcs.MCSAnnexSubclause#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.MCSAnnexSubclause#getTypes()
   * @see #getMCSAnnexSubclause()
   * @generated
   */
  EReference getMCSAnnexSubclause_Types();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.mcs.mcs.MCSAnnexSubclause#getConstants <em>Constants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constants</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.MCSAnnexSubclause#getConstants()
   * @see #getMCSAnnexSubclause()
   * @generated
   */
  EReference getMCSAnnexSubclause_Constants();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.mcs.mcs.MCSAnnexSubclause#getFunctions <em>Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Functions</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.MCSAnnexSubclause#getFunctions()
   * @see #getMCSAnnexSubclause()
   * @generated
   */
  EReference getMCSAnnexSubclause_Functions();

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
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.Function_declaration <em>Function declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function declaration</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Function_declaration
   * @generated
   */
  EClass getFunction_declaration();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.Function_declaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Function_declaration#getName()
   * @see #getFunction_declaration()
   * @generated
   */
  EAttribute getFunction_declaration_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.mcs.mcs.Function_declaration#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arg</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Function_declaration#getArg()
   * @see #getFunction_declaration()
   * @generated
   */
  EReference getFunction_declaration_Arg();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.Function_declaration#getOut <em>Out</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Out</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Function_declaration#getOut()
   * @see #getFunction_declaration()
   * @generated
   */
  EReference getFunction_declaration_Out();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.Function_declaration#getFtype <em>Ftype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ftype</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Function_declaration#getFtype()
   * @see #getFunction_declaration()
   * @generated
   */
  EReference getFunction_declaration_Ftype();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.mcs.mcs.Function_declaration#getTyperef <em>Typeref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Typeref</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Function_declaration#getTyperef()
   * @see #getFunction_declaration()
   * @generated
   */
  EReference getFunction_declaration_Typeref();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.Function_declaration#getClosure <em>Closure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Closure</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Function_declaration#getClosure()
   * @see #getFunction_declaration()
   * @generated
   */
  EReference getFunction_declaration_Closure();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.Function_declaration#getExp_body <em>Exp body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp body</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Function_declaration#getExp_body()
   * @see #getFunction_declaration()
   * @generated
   */
  EReference getFunction_declaration_Exp_body();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.Argument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Argument</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Argument
   * @generated
   */
  EClass getArgument();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.Argument#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Argument#getName()
   * @see #getArgument()
   * @generated
   */
  EAttribute getArgument_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.Argument#getArg_type <em>Arg type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arg type</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Argument#getArg_type()
   * @see #getArgument()
   * @generated
   */
  EReference getArgument_Arg_type();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.Theorem_declaration <em>Theorem declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Theorem declaration</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Theorem_declaration
   * @generated
   */
  EClass getTheorem_declaration();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.Theorem_declaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Theorem_declaration#getName()
   * @see #getTheorem_declaration()
   * @generated
   */
  EAttribute getTheorem_declaration_Name();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.Theorem_declaration#isMl <em>Ml</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ml</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Theorem_declaration#isMl()
   * @see #getTheorem_declaration()
   * @generated
   */
  EAttribute getTheorem_declaration_Ml();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.mcs.mcs.Theorem_declaration#getLocals <em>Locals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Locals</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Theorem_declaration#getLocals()
   * @see #getTheorem_declaration()
   * @generated
   */
  EReference getTheorem_declaration_Locals();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.mcs.mcs.Theorem_declaration#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Theorem_declaration#getStatements()
   * @see #getTheorem_declaration()
   * @generated
   */
  EReference getTheorem_declaration_Statements();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.mcs.mcs.Theorem_declaration#getEndname <em>Endname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Endname</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Theorem_declaration#getEndname()
   * @see #getTheorem_declaration()
   * @generated
   */
  EReference getTheorem_declaration_Endname();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.In_modes_list <em>In modes list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>In modes list</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.In_modes_list
   * @generated
   */
  EClass getIn_modes_list();

  /**
   * Returns the meta object for the attribute list '{@link org.osate.xtext.aadl2.mcs.mcs.In_modes_list#getModes <em>Modes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Modes</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.In_modes_list#getModes()
   * @see #getIn_modes_list()
   * @generated
   */
  EAttribute getIn_modes_list_Modes();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.Local_declaration <em>Local declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local declaration</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Local_declaration
   * @generated
   */
  EClass getLocal_declaration();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.Local_declaration#isConst <em>Const</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Const</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Local_declaration#isConst()
   * @see #getLocal_declaration()
   * @generated
   */
  EAttribute getLocal_declaration_Const();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.Local_declaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Local_declaration#getName()
   * @see #getLocal_declaration()
   * @generated
   */
  EAttribute getLocal_declaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.Local_declaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Local_declaration#getType()
   * @see #getLocal_declaration()
   * @generated
   */
  EReference getLocal_declaration_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.Local_declaration#getLeft_expr <em>Left expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left expr</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Local_declaration#getLeft_expr()
   * @see #getLocal_declaration()
   * @generated
   */
  EReference getLocal_declaration_Left_expr();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.Theorem_statement <em>Theorem statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Theorem statement</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Theorem_statement
   * @generated
   */
  EClass getTheorem_statement();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.Basic_statement <em>Basic statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Basic statement</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Basic_statement
   * @generated
   */
  EClass getBasic_statement();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.Iteration <em>Iteration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Iteration</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Iteration
   * @generated
   */
  EClass getIteration();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.Iteration#getVar_id <em>Var id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var id</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Iteration#getVar_id()
   * @see #getIteration()
   * @generated
   */
  EAttribute getIteration_Var_id();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.Iteration#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Iteration#getExpr()
   * @see #getIteration()
   * @generated
   */
  EReference getIteration_Expr();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.mcs.mcs.Iteration#getLocal <em>Local</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Local</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Iteration#getLocal()
   * @see #getIteration()
   * @generated
   */
  EReference getIteration_Local();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.mcs.mcs.Iteration#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Iteration#getStatements()
   * @see #getIteration()
   * @generated
   */
  EReference getIteration_Statements();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.Type_expression <em>Type expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type expression</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Type_expression
   * @generated
   */
  EClass getType_expression();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.Type_expression#getBasic <em>Basic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Basic</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Type_expression#getBasic()
   * @see #getType_expression()
   * @generated
   */
  EReference getType_expression_Basic();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.Type_expression#getComposite <em>Composite</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Composite</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Type_expression#getComposite()
   * @see #getType_expression()
   * @generated
   */
  EReference getType_expression_Composite();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.Type_expression#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Type_expression#getElement()
   * @see #getType_expression()
   * @generated
   */
  EReference getType_expression_Element();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.Basic_type <em>Basic type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Basic type</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Basic_type
   * @generated
   */
  EClass getBasic_type();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.Basic_type#getBool <em>Bool</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bool</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Basic_type#getBool()
   * @see #getBasic_type()
   * @generated
   */
  EReference getBasic_type_Bool();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.Basic_type#getString <em>String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>String</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Basic_type#getString()
   * @see #getBasic_type()
   * @generated
   */
  EReference getBasic_type_String();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.Basic_type#getEnumer <em>Enumer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Enumer</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Basic_type#getEnumer()
   * @see #getBasic_type()
   * @generated
   */
  EReference getBasic_type_Enumer();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.Basic_type#getUnits <em>Units</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Units</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Basic_type#getUnits()
   * @see #getBasic_type()
   * @generated
   */
  EReference getBasic_type_Units();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.Basic_type#getInteger <em>Integer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Integer</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Basic_type#getInteger()
   * @see #getBasic_type()
   * @generated
   */
  EReference getBasic_type_Integer();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.Basic_type#getReal <em>Real</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Real</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Basic_type#getReal()
   * @see #getBasic_type()
   * @generated
   */
  EReference getBasic_type_Real();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.Basic_type#getRange <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Range</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Basic_type#getRange()
   * @see #getBasic_type()
   * @generated
   */
  EReference getBasic_type_Range();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.Basic_type#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Basic_type#getClass_()
   * @see #getBasic_type()
   * @generated
   */
  EReference getBasic_type_Class();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.Basic_type#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Basic_type#getRef()
   * @see #getBasic_type()
   * @generated
   */
  EReference getBasic_type_Ref();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.Basic_type#getFunc <em>Func</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Func</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Basic_type#getFunc()
   * @see #getBasic_type()
   * @generated
   */
  EReference getBasic_type_Func();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.mcs.mcs.Basic_type#getTypename <em>Typename</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Typename</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Basic_type#getTypename()
   * @see #getBasic_type()
   * @generated
   */
  EReference getBasic_type_Typename();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.UnnamedFunctionType <em>Unnamed Function Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unnamed Function Type</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.UnnamedFunctionType
   * @generated
   */
  EClass getUnnamedFunctionType();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.mcs.mcs.UnnamedFunctionType#getParm <em>Parm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parm</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.UnnamedFunctionType#getParm()
   * @see #getUnnamedFunctionType()
   * @generated
   */
  EReference getUnnamedFunctionType_Parm();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.UnnamedFunctionType#isOutspec <em>Outspec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Outspec</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.UnnamedFunctionType#isOutspec()
   * @see #getUnnamedFunctionType()
   * @generated
   */
  EAttribute getUnnamedFunctionType_Outspec();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.UnnamedFunctionType#getResult <em>Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Result</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.UnnamedFunctionType#getResult()
   * @see #getUnnamedFunctionType()
   * @generated
   */
  EReference getUnnamedFunctionType_Result();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.Composite_type <em>Composite type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Composite type</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Composite_type
   * @generated
   */
  EClass getComposite_type();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.Set_type <em>Set type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Set type</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Set_type
   * @generated
   */
  EClass getSet_type();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.Set_type#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Set_type#getType()
   * @see #getSet_type()
   * @generated
   */
  EReference getSet_type_Type();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.List_type <em>List type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List type</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.List_type
   * @generated
   */
  EClass getList_type();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.List_type#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.List_type#getType()
   * @see #getList_type()
   * @generated
   */
  EReference getList_type_Type();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.Map_type <em>Map type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Map type</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Map_type
   * @generated
   */
  EClass getMap_type();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.Map_type#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Map_type#getType()
   * @see #getMap_type()
   * @generated
   */
  EReference getMap_type_Type();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.Record_type <em>Record type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Record type</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Record_type
   * @generated
   */
  EClass getRecord_type();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.mcs.mcs.Record_type#getField <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Field</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Record_type#getField()
   * @see #getRecord_type()
   * @generated
   */
  EReference getRecord_type_Field();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.Union_type <em>Union type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Union type</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Union_type
   * @generated
   */
  EClass getUnion_type();

  /**
   * Returns the meta object for the attribute list '{@link org.osate.xtext.aadl2.mcs.mcs.Union_type#getTypename <em>Typename</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Typename</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Union_type#getTypename()
   * @see #getUnion_type()
   * @generated
   */
  EAttribute getUnion_type_Typename();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.mcs.mcs.Union_type#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Type</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Union_type#getType()
   * @see #getUnion_type()
   * @generated
   */
  EReference getUnion_type_Type();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.Id_type_pair <em>Id type pair</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Id type pair</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Id_type_pair
   * @generated
   */
  EClass getId_type_pair();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.Id_type_pair#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Id_type_pair#getName()
   * @see #getId_type_pair()
   * @generated
   */
  EAttribute getId_type_pair_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.Id_type_pair#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Id_type_pair#getType()
   * @see #getId_type_pair()
   * @generated
   */
  EReference getId_type_pair_Type();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.Element_type <em>Element type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element type</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Element_type
   * @generated
   */
  EClass getElement_type();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.Element_type#isTelem <em>Telem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Telem</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Element_type#isTelem()
   * @see #getElement_type()
   * @generated
   */
  EAttribute getElement_type_Telem();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.Element_type#isT_class <em>Tclass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tclass</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Element_type#isT_class()
   * @see #getElement_type()
   * @generated
   */
  EAttribute getElement_type_T_class();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.Element_type#isT_ref <em>Tref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tref</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Element_type#isT_ref()
   * @see #getElement_type()
   * @generated
   */
  EAttribute getElement_type_T_ref();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.t_classifiers <em>tclassifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>tclassifiers</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_classifiers
   * @generated
   */
  EClass gett_classifiers();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_classifiers#isT_class <em>Tclass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tclass</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_classifiers#isT_class()
   * @see #gett_classifiers()
   * @generated
   */
  EAttribute gett_classifiers_T_class();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_classifiers#isT_class_subtype <em>Tclass subtype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tclass subtype</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_classifiers#isT_class_subtype()
   * @see #gett_classifiers()
   * @generated
   */
  EAttribute gett_classifiers_T_class_subtype();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.t_classifier_subtypes <em>tclassifier subtypes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>tclassifier subtypes</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_classifier_subtypes
   * @generated
   */
  EClass gett_classifier_subtypes();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_classifier_subtypes#isT_ctype <em>Tctype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tctype</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_classifier_subtypes#isT_ctype()
   * @see #gett_classifier_subtypes()
   * @generated
   */
  EAttribute gett_classifier_subtypes_T_ctype();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_classifier_subtypes#isT_cimpl <em>Tcimpl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tcimpl</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_classifier_subtypes#isT_cimpl()
   * @see #gett_classifier_subtypes()
   * @generated
   */
  EAttribute gett_classifier_subtypes_T_cimpl();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_classifier_subtypes#isT_fgclass <em>Tfgclass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tfgclass</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_classifier_subtypes#isT_fgclass()
   * @see #gett_classifier_subtypes()
   * @generated
   */
  EAttribute gett_classifier_subtypes_T_fgclass();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_classifier_subtypes#isT_annexclass <em>Tannexclass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tannexclass</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_classifier_subtypes#isT_annexclass()
   * @see #gett_classifier_subtypes()
   * @generated
   */
  EAttribute gett_classifier_subtypes_T_annexclass();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.t_named_references <em>tnamed references</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>tnamed references</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_named_references
   * @generated
   */
  EClass gett_named_references();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_named_references#isT_nref <em>Tnref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tnref</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_named_references#isT_nref()
   * @see #gett_named_references()
   * @generated
   */
  EAttribute gett_named_references_T_nref();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_named_references#isT_nref_st <em>Tnref st</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tnref st</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_named_references#isT_nref_st()
   * @see #gett_named_references()
   * @generated
   */
  EAttribute gett_named_references_T_nref_st();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.t_named_reference_subtypes <em>tnamed reference subtypes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>tnamed reference subtypes</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_named_reference_subtypes
   * @generated
   */
  EClass gett_named_reference_subtypes();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_named_reference_subtypes#isT_subc_st <em>Tsubc st</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tsubc st</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_named_reference_subtypes#isT_subc_st()
   * @see #gett_named_reference_subtypes()
   * @generated
   */
  EAttribute gett_named_reference_subtypes_T_subc_st();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_named_reference_subtypes#isT_sbcall <em>Tsbcall</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tsbcall</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_named_reference_subtypes#isT_sbcall()
   * @see #gett_named_reference_subtypes()
   * @generated
   */
  EAttribute gett_named_reference_subtypes_T_sbcall();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_named_reference_subtypes#isT_callseq <em>Tcallseq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tcallseq</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_named_reference_subtypes#isT_callseq()
   * @see #gett_named_reference_subtypes()
   * @generated
   */
  EAttribute gett_named_reference_subtypes_T_callseq();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_named_reference_subtypes#isT_eeflow <em>Teeflow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Teeflow</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_named_reference_subtypes#isT_eeflow()
   * @see #gett_named_reference_subtypes()
   * @generated
   */
  EAttribute gett_named_reference_subtypes_T_eeflow();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_named_reference_subtypes#isT_proto <em>Tproto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tproto</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_named_reference_subtypes#isT_proto()
   * @see #gett_named_reference_subtypes()
   * @generated
   */
  EAttribute gett_named_reference_subtypes_T_proto();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_named_reference_subtypes#isT_mode <em>Tmode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tmode</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_named_reference_subtypes#isT_mode()
   * @see #gett_named_reference_subtypes()
   * @generated
   */
  EAttribute gett_named_reference_subtypes_T_mode();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_named_reference_subtypes#isT_req_mode <em>Treq mode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Treq mode</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_named_reference_subtypes#isT_req_mode()
   * @see #gett_named_reference_subtypes()
   * @generated
   */
  EAttribute gett_named_reference_subtypes_T_req_mode();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_named_reference_subtypes#isT_mod_trans <em>Tmod trans</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tmod trans</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_named_reference_subtypes#isT_mod_trans()
   * @see #gett_named_reference_subtypes()
   * @generated
   */
  EAttribute gett_named_reference_subtypes_T_mod_trans();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_named_reference_subtypes#isT_mode_trig <em>Tmode trig</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tmode trig</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_named_reference_subtypes#isT_mode_trig()
   * @see #gett_named_reference_subtypes()
   * @generated
   */
  EAttribute gett_named_reference_subtypes_T_mode_trig();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.t_subcomponent_subtypes <em>tsubcomponent subtypes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>tsubcomponent subtypes</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_subcomponent_subtypes
   * @generated
   */
  EClass gett_subcomponent_subtypes();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_subcomponent_subtypes#isT_sub <em>Tsub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tsub</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_subcomponent_subtypes#isT_sub()
   * @see #gett_subcomponent_subtypes()
   * @generated
   */
  EAttribute gett_subcomponent_subtypes_T_sub();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_subcomponent_subtypes#isT_annex_sub <em>Tannex sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tannex sub</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_subcomponent_subtypes#isT_annex_sub()
   * @see #gett_subcomponent_subtypes()
   * @generated
   */
  EAttribute gett_subcomponent_subtypes_T_annex_sub();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_subcomponent_subtypes#isT_comp_typeref <em>Tcomp typeref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tcomp typeref</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_subcomponent_subtypes#isT_comp_typeref()
   * @see #gett_subcomponent_subtypes()
   * @generated
   */
  EAttribute gett_subcomponent_subtypes_T_comp_typeref();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_subcomponent_subtypes#isT_cimpl_st <em>Tcimpl st</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tcimpl st</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_subcomponent_subtypes#isT_cimpl_st()
   * @see #gett_subcomponent_subtypes()
   * @generated
   */
  EAttribute gett_subcomponent_subtypes_T_cimpl_st();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.t_component_impl_subtypes <em>tcomponent impl subtypes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>tcomponent impl subtypes</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_component_impl_subtypes
   * @generated
   */
  EClass gett_component_impl_subtypes();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_component_impl_subtypes#isT_comp_impref <em>Tcomp impref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tcomp impref</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_component_impl_subtypes#isT_comp_impref()
   * @see #gett_component_impl_subtypes()
   * @generated
   */
  EAttribute gett_component_impl_subtypes_T_comp_impref();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_component_impl_subtypes#isT_abstract <em>Tabstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tabstract</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_component_impl_subtypes#isT_abstract()
   * @see #gett_component_impl_subtypes()
   * @generated
   */
  EAttribute gett_component_impl_subtypes_T_abstract();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_component_impl_subtypes#isT_sys <em>Tsys</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tsys</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_component_impl_subtypes#isT_sys()
   * @see #gett_component_impl_subtypes()
   * @generated
   */
  EAttribute gett_component_impl_subtypes_T_sys();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_component_impl_subtypes#isT_proc <em>Tproc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tproc</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_component_impl_subtypes#isT_proc()
   * @see #gett_component_impl_subtypes()
   * @generated
   */
  EAttribute gett_component_impl_subtypes_T_proc();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_component_impl_subtypes#isT_virt_proc <em>Tvirt proc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tvirt proc</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_component_impl_subtypes#isT_virt_proc()
   * @see #gett_component_impl_subtypes()
   * @generated
   */
  EAttribute gett_component_impl_subtypes_T_virt_proc();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_component_impl_subtypes#isT_bus <em>Tbus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tbus</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_component_impl_subtypes#isT_bus()
   * @see #gett_component_impl_subtypes()
   * @generated
   */
  EAttribute gett_component_impl_subtypes_T_bus();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_component_impl_subtypes#isT_vbus <em>Tvbus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tvbus</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_component_impl_subtypes#isT_vbus()
   * @see #gett_component_impl_subtypes()
   * @generated
   */
  EAttribute gett_component_impl_subtypes_T_vbus();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_component_impl_subtypes#isT_mem <em>Tmem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tmem</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_component_impl_subtypes#isT_mem()
   * @see #gett_component_impl_subtypes()
   * @generated
   */
  EAttribute gett_component_impl_subtypes_T_mem();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_component_impl_subtypes#isT_tg <em>Ttg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ttg</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_component_impl_subtypes#isT_tg()
   * @see #gett_component_impl_subtypes()
   * @generated
   */
  EAttribute gett_component_impl_subtypes_T_tg();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_component_impl_subtypes#isT_t <em>Tt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tt</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_component_impl_subtypes#isT_t()
   * @see #gett_component_impl_subtypes()
   * @generated
   */
  EAttribute gett_component_impl_subtypes_T_t();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_component_impl_subtypes#isT_d <em>Td</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Td</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_component_impl_subtypes#isT_d()
   * @see #gett_component_impl_subtypes()
   * @generated
   */
  EAttribute gett_component_impl_subtypes_T_d();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_component_impl_subtypes#isT_subprog <em>Tsubprog</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tsubprog</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_component_impl_subtypes#isT_subprog()
   * @see #gett_component_impl_subtypes()
   * @generated
   */
  EAttribute gett_component_impl_subtypes_T_subprog();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_component_impl_subtypes#isT_subprog_g <em>Tsubprog g</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tsubprog g</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_component_impl_subtypes#isT_subprog_g()
   * @see #gett_component_impl_subtypes()
   * @generated
   */
  EAttribute gett_component_impl_subtypes_T_subprog_g();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.t_connection_subtypes <em>tconnection subtypes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>tconnection subtypes</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_connection_subtypes
   * @generated
   */
  EClass gett_connection_subtypes();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_connection_subtypes#isT_conn <em>Tconn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tconn</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_connection_subtypes#isT_conn()
   * @see #gett_connection_subtypes()
   * @generated
   */
  EAttribute gett_connection_subtypes_T_conn();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_connection_subtypes#isT_feat_conn <em>Tfeat conn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tfeat conn</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_connection_subtypes#isT_feat_conn()
   * @see #gett_connection_subtypes()
   * @generated
   */
  EAttribute gett_connection_subtypes_T_feat_conn();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_connection_subtypes#isT_port_conn <em>Tport conn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tport conn</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_connection_subtypes#isT_port_conn()
   * @see #gett_connection_subtypes()
   * @generated
   */
  EAttribute gett_connection_subtypes_T_port_conn();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_connection_subtypes#isT_parm_conn <em>Tparm conn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tparm conn</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_connection_subtypes#isT_parm_conn()
   * @see #gett_connection_subtypes()
   * @generated
   */
  EAttribute gett_connection_subtypes_T_parm_conn();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_connection_subtypes#isT_acc_con <em>Tacc con</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tacc con</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_connection_subtypes#isT_acc_con()
   * @see #gett_connection_subtypes()
   * @generated
   */
  EAttribute gett_connection_subtypes_T_acc_con();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_connection_subtypes#isT_fg_conn <em>Tfg conn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tfg conn</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_connection_subtypes#isT_fg_conn()
   * @see #gett_connection_subtypes()
   * @generated
   */
  EAttribute gett_connection_subtypes_T_fg_conn();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.t_feature_subtypes <em>tfeature subtypes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>tfeature subtypes</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_feature_subtypes
   * @generated
   */
  EClass gett_feature_subtypes();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_feature_subtypes#isT_feat <em>Tfeat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tfeat</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_feature_subtypes#isT_feat()
   * @see #gett_feature_subtypes()
   * @generated
   */
  EAttribute gett_feature_subtypes_T_feat();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_feature_subtypes#isT_abs_feat <em>Tabs feat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tabs feat</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_feature_subtypes#isT_abs_feat()
   * @see #gett_feature_subtypes()
   * @generated
   */
  EAttribute gett_feature_subtypes_T_abs_feat();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_feature_subtypes#isT_parm <em>Tparm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tparm</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_feature_subtypes#isT_parm()
   * @see #gett_feature_subtypes()
   * @generated
   */
  EAttribute gett_feature_subtypes_T_parm();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_feature_subtypes#isT_fg <em>Tfg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tfg</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_feature_subtypes#isT_fg()
   * @see #gett_feature_subtypes()
   * @generated
   */
  EAttribute gett_feature_subtypes_T_fg();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.t_access_subtypes <em>taccess subtypes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>taccess subtypes</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_access_subtypes
   * @generated
   */
  EClass gett_access_subtypes();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_access_subtypes#isT_access <em>Taccess</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Taccess</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_access_subtypes#isT_access()
   * @see #gett_access_subtypes()
   * @generated
   */
  EAttribute gett_access_subtypes_T_access();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_access_subtypes#isT_data_acc <em>Tdata acc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tdata acc</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_access_subtypes#isT_data_acc()
   * @see #gett_access_subtypes()
   * @generated
   */
  EAttribute gett_access_subtypes_T_data_acc();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_access_subtypes#isT_sub_acc <em>Tsub acc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tsub acc</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_access_subtypes#isT_sub_acc()
   * @see #gett_access_subtypes()
   * @generated
   */
  EAttribute gett_access_subtypes_T_sub_acc();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_access_subtypes#isT_sub_gr_acc <em>Tsub gr acc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tsub gr acc</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_access_subtypes#isT_sub_gr_acc()
   * @see #gett_access_subtypes()
   * @generated
   */
  EAttribute gett_access_subtypes_T_sub_gr_acc();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_access_subtypes#isT_bus_acc <em>Tbus acc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tbus acc</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_access_subtypes#isT_bus_acc()
   * @see #gett_access_subtypes()
   * @generated
   */
  EAttribute gett_access_subtypes_T_bus_acc();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.t_port_subtypes <em>tport subtypes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>tport subtypes</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_port_subtypes
   * @generated
   */
  EClass gett_port_subtypes();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_port_subtypes#isT_port <em>Tport</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tport</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_port_subtypes#isT_port()
   * @see #gett_port_subtypes()
   * @generated
   */
  EAttribute gett_port_subtypes_T_port();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_port_subtypes#isT_d_port <em>Tdport</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tdport</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_port_subtypes#isT_d_port()
   * @see #gett_port_subtypes()
   * @generated
   */
  EAttribute gett_port_subtypes_T_d_port();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_port_subtypes#isT_ev_port <em>Tev port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tev port</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_port_subtypes#isT_ev_port()
   * @see #gett_port_subtypes()
   * @generated
   */
  EAttribute gett_port_subtypes_T_ev_port();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_port_subtypes#isT_evd_port <em>Tevd port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tevd port</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_port_subtypes#isT_evd_port()
   * @see #gett_port_subtypes()
   * @generated
   */
  EAttribute gett_port_subtypes_T_evd_port();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.t_flow_spec_subtypes <em>tflow spec subtypes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>tflow spec subtypes</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_flow_spec_subtypes
   * @generated
   */
  EClass gett_flow_spec_subtypes();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_flow_spec_subtypes#isT_f_spec <em>Tfspec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tfspec</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_flow_spec_subtypes#isT_f_spec()
   * @see #gett_flow_spec_subtypes()
   * @generated
   */
  EAttribute gett_flow_spec_subtypes_T_f_spec();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_flow_spec_subtypes#isT_f_spec_source <em>Tfspec source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tfspec source</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_flow_spec_subtypes#isT_f_spec_source()
   * @see #gett_flow_spec_subtypes()
   * @generated
   */
  EAttribute gett_flow_spec_subtypes_T_f_spec_source();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_flow_spec_subtypes#isT_f_spec_sink <em>Tfspec sink</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tfspec sink</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_flow_spec_subtypes#isT_f_spec_sink()
   * @see #gett_flow_spec_subtypes()
   * @generated
   */
  EAttribute gett_flow_spec_subtypes_T_f_spec_sink();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_flow_spec_subtypes#isT_f_spec_path <em>Tfspec path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tfspec path</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_flow_spec_subtypes#isT_f_spec_path()
   * @see #gett_flow_spec_subtypes()
   * @generated
   */
  EAttribute gett_flow_spec_subtypes_T_f_spec_path();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.t_flow_impl_subtypes <em>tflow impl subtypes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>tflow impl subtypes</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_flow_impl_subtypes
   * @generated
   */
  EClass gett_flow_impl_subtypes();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_flow_impl_subtypes#isT_f_i <em>Tfi</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tfi</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_flow_impl_subtypes#isT_f_i()
   * @see #gett_flow_impl_subtypes()
   * @generated
   */
  EAttribute gett_flow_impl_subtypes_T_f_i();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_flow_impl_subtypes#isT_f_i_source <em>Tfisource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tfisource</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_flow_impl_subtypes#isT_f_i_source()
   * @see #gett_flow_impl_subtypes()
   * @generated
   */
  EAttribute gett_flow_impl_subtypes_T_f_i_source();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_flow_impl_subtypes#isT_f_i_sink <em>Tfisink</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tfisink</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_flow_impl_subtypes#isT_f_i_sink()
   * @see #gett_flow_impl_subtypes()
   * @generated
   */
  EAttribute gett_flow_impl_subtypes_T_f_i_sink();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_flow_impl_subtypes#isT_f_i_path <em>Tfipath</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tfipath</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_flow_impl_subtypes#isT_f_i_path()
   * @see #gett_flow_impl_subtypes()
   * @generated
   */
  EAttribute gett_flow_impl_subtypes_T_f_i_path();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.MCSClosure <em>MCS Closure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MCS Closure</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.MCSClosure
   * @generated
   */
  EClass getMCSClosure();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.mcs.mcs.MCSClosure#getDeclaredFormalParameters <em>Declared Formal Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declared Formal Parameters</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.MCSClosure#getDeclaredFormalParameters()
   * @see #getMCSClosure()
   * @generated
   */
  EReference getMCSClosure_DeclaredFormalParameters();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.MCSClosure#isExplicitSyntax <em>Explicit Syntax</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Explicit Syntax</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.MCSClosure#isExplicitSyntax()
   * @see #getMCSClosure()
   * @generated
   */
  EAttribute getMCSClosure_ExplicitSyntax();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.MCSClosure#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.MCSClosure#getExpression()
   * @see #getMCSClosure()
   * @generated
   */
  EReference getMCSClosure_Expression();

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
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MCS_ANNEX_LIBRARY__TYPES = eINSTANCE.getMCSAnnexLibrary_Types();

    /**
     * The meta object literal for the '<em><b>Constants</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MCS_ANNEX_LIBRARY__CONSTANTS = eINSTANCE.getMCSAnnexLibrary_Constants();

    /**
     * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MCS_ANNEX_LIBRARY__FUNCTIONS = eINSTANCE.getMCSAnnexLibrary_Functions();

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
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.Type_declarationImpl <em>Type declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.Type_declarationImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getType_declaration()
     * @generated
     */
    EClass TYPE_DECLARATION = eINSTANCE.getType_declaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_DECLARATION__NAME = eINSTANCE.getType_declaration_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DECLARATION__TYPE = eINSTANCE.getType_declaration_Type();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.Constant_declarationImpl <em>Constant declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.Constant_declarationImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getConstant_declaration()
     * @generated
     */
    EClass CONSTANT_DECLARATION = eINSTANCE.getConstant_declaration();

    /**
     * The meta object literal for the '<em><b>Const</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT_DECLARATION__CONST = eINSTANCE.getConstant_declaration_Const();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT_DECLARATION__NAME = eINSTANCE.getConstant_declaration_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_DECLARATION__TYPE = eINSTANCE.getConstant_declaration_Type();

    /**
     * The meta object literal for the '<em><b>Left expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_DECLARATION__LEFT_EXPR = eINSTANCE.getConstant_declaration_Left_expr();

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
     * The meta object literal for the '<em><b>Category</b></em>' containment reference list feature.
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
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHECK_THEOREM__NAME = eINSTANCE.getcheck_theorem_Name();

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
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.property_referenceImpl <em>property reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.property_referenceImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getproperty_reference()
     * @generated
     */
    EClass PROPERTY_REFERENCE = eINSTANCE.getproperty_reference();

    /**
     * The meta object literal for the '<em><b>El ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_REFERENCE__EL_REF = eINSTANCE.getproperty_reference_El_ref();

    /**
     * The meta object literal for the '<em><b>Exists</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY_REFERENCE__EXISTS = eINSTANCE.getproperty_reference_Exists();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_REFERENCE__PROPERTY = eINSTANCE.getproperty_reference_Property();

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
     * The meta object literal for the '<em><b>Self</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_REFERENCE__SELF = eINSTANCE.getelement_reference_Self();

    /**
     * The meta object literal for the '<em><b>Root</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_REFERENCE__ROOT = eINSTANCE.getelement_reference_Root();

    /**
     * The meta object literal for the '<em><b>Currentmode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_REFERENCE__CURRENTMODE = eINSTANCE.getelement_reference_Currentmode();

    /**
     * The meta object literal for the '<em><b>Cref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT_REFERENCE__CREF = eINSTANCE.getelement_reference_Cref();

    /**
     * The meta object literal for the '<em><b>Package Name</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_REFERENCE__PACKAGE_NAME = eINSTANCE.getelement_reference_PackageName();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT_REFERENCE__REF = eINSTANCE.getelement_reference_Ref();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.ContainmentPathElementImpl <em>Containment Path Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.ContainmentPathElementImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getContainmentPathElement()
     * @generated
     */
    EClass CONTAINMENT_PATH_ELEMENT = eINSTANCE.getContainmentPathElement();

    /**
     * The meta object literal for the '<em><b>Named Element</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTAINMENT_PATH_ELEMENT__NAMED_ELEMENT = eINSTANCE.getContainmentPathElement_NamedElement();

    /**
     * The meta object literal for the '<em><b>Array Range</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTAINMENT_PATH_ELEMENT__ARRAY_RANGE = eINSTANCE.getContainmentPathElement_ArrayRange();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTAINMENT_PATH_ELEMENT__PATH = eINSTANCE.getContainmentPathElement_Path();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.ArrayRangeImpl <em>Array Range</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.ArrayRangeImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getArrayRange()
     * @generated
     */
    EClass ARRAY_RANGE = eINSTANCE.getArrayRange();

    /**
     * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARRAY_RANGE__LOWER_BOUND = eINSTANCE.getArrayRange_LowerBound();

    /**
     * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARRAY_RANGE__UPPER_BOUND = eINSTANCE.getArrayRange_UpperBound();

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
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.constant_expressionImpl <em>constant expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.constant_expressionImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getconstant_expression()
     * @generated
     */
    EClass CONSTANT_EXPRESSION = eINSTANCE.getconstant_expression();

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
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__NAME = eINSTANCE.getexpression_Name();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.BooleanTermImpl <em>Boolean Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.BooleanTermImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getBooleanTerm()
     * @generated
     */
    EClass BOOLEAN_TERM = eINSTANCE.getBooleanTerm();

    /**
     * The meta object literal for the '<em><b>Xbool</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOLEAN_TERM__XBOOL = eINSTANCE.getBooleanTerm_Xbool();

    /**
     * The meta object literal for the '<em><b>Member check</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOLEAN_TERM__MEMBER_CHECK = eINSTANCE.getBooleanTerm_Member_check();

    /**
     * The meta object literal for the '<em><b>Collect expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOLEAN_TERM__COLLECT_EXPR = eINSTANCE.getBooleanTerm_Collect_expr();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.CollectionTermImpl <em>Collection Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.CollectionTermImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getCollectionTerm()
     * @generated
     */
    EClass COLLECTION_TERM = eINSTANCE.getCollectionTerm();

    /**
     * The meta object literal for the '<em><b>Xc</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLLECTION_TERM__XC = eINSTANCE.getCollectionTerm_Xc();

    /**
     * The meta object literal for the '<em><b>Query set</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLLECTION_TERM__QUERY_SET = eINSTANCE.getCollectionTerm_Query_set();

    /**
     * The meta object literal for the '<em><b>Set c</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLLECTION_TERM__SET_C = eINSTANCE.getCollectionTerm_Set_c();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.Set_comprehensionImpl <em>Set comprehension</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.Set_comprehensionImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getSet_comprehension()
     * @generated
     */
    EClass SET_COMPREHENSION = eINSTANCE.getSet_comprehension();

    /**
     * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SET_COMPREHENSION__RESULT = eINSTANCE.getSet_comprehension_Result();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SET_COMPREHENSION__VAR = eINSTANCE.getSet_comprehension_Var();

    /**
     * The meta object literal for the '<em><b>Set</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SET_COMPREHENSION__SET = eINSTANCE.getSet_comprehension_Set();

    /**
     * The meta object literal for the '<em><b>Cond</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SET_COMPREHENSION__COND = eINSTANCE.getSet_comprehension_Cond();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.Query_element_setImpl <em>Query element set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.Query_element_setImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getQuery_element_set()
     * @generated
     */
    EClass QUERY_ELEMENT_SET = eINSTANCE.getQuery_element_set();

    /**
     * The meta object literal for the '<em><b>Direct</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUERY_ELEMENT_SET__DIRECT = eINSTANCE.getQuery_element_set_Direct();

    /**
     * The meta object literal for the '<em><b>Result types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUERY_ELEMENT_SET__RESULT_TYPES = eINSTANCE.getQuery_element_set_Result_types();

    /**
     * The meta object literal for the '<em><b>Elem set</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUERY_ELEMENT_SET__ELEM_SET = eINSTANCE.getQuery_element_set_Elem_set();

    /**
     * The meta object literal for the '<em><b>Mode spec</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUERY_ELEMENT_SET__MODE_SPEC = eINSTANCE.getQuery_element_set_Mode_spec();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.Element_typesImpl <em>Element types</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.Element_typesImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getElement_types()
     * @generated
     */
    EClass ELEMENT_TYPES = eINSTANCE.getElement_types();

    /**
     * The meta object literal for the '<em><b>El type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT_TYPES__EL_TYPE = eINSTANCE.getElement_types_El_type();

    /**
     * The meta object literal for the '<em><b>El types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT_TYPES__EL_TYPES = eINSTANCE.getElement_types_El_types();

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
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MCS_ANNEX_SUBCLAUSE__TYPES = eINSTANCE.getMCSAnnexSubclause_Types();

    /**
     * The meta object literal for the '<em><b>Constants</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MCS_ANNEX_SUBCLAUSE__CONSTANTS = eINSTANCE.getMCSAnnexSubclause_Constants();

    /**
     * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MCS_ANNEX_SUBCLAUSE__FUNCTIONS = eINSTANCE.getMCSAnnexSubclause_Functions();

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
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.Function_declarationImpl <em>Function declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.Function_declarationImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getFunction_declaration()
     * @generated
     */
    EClass FUNCTION_DECLARATION = eINSTANCE.getFunction_declaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_DECLARATION__NAME = eINSTANCE.getFunction_declaration_Name();

    /**
     * The meta object literal for the '<em><b>Arg</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DECLARATION__ARG = eINSTANCE.getFunction_declaration_Arg();

    /**
     * The meta object literal for the '<em><b>Out</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DECLARATION__OUT = eINSTANCE.getFunction_declaration_Out();

    /**
     * The meta object literal for the '<em><b>Ftype</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DECLARATION__FTYPE = eINSTANCE.getFunction_declaration_Ftype();

    /**
     * The meta object literal for the '<em><b>Typeref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DECLARATION__TYPEREF = eINSTANCE.getFunction_declaration_Typeref();

    /**
     * The meta object literal for the '<em><b>Closure</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DECLARATION__CLOSURE = eINSTANCE.getFunction_declaration_Closure();

    /**
     * The meta object literal for the '<em><b>Exp body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DECLARATION__EXP_BODY = eINSTANCE.getFunction_declaration_Exp_body();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.ArgumentImpl <em>Argument</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.ArgumentImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getArgument()
     * @generated
     */
    EClass ARGUMENT = eINSTANCE.getArgument();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGUMENT__NAME = eINSTANCE.getArgument_Name();

    /**
     * The meta object literal for the '<em><b>Arg type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGUMENT__ARG_TYPE = eINSTANCE.getArgument_Arg_type();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.Theorem_declarationImpl <em>Theorem declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.Theorem_declarationImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getTheorem_declaration()
     * @generated
     */
    EClass THEOREM_DECLARATION = eINSTANCE.getTheorem_declaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute THEOREM_DECLARATION__NAME = eINSTANCE.getTheorem_declaration_Name();

    /**
     * The meta object literal for the '<em><b>Ml</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute THEOREM_DECLARATION__ML = eINSTANCE.getTheorem_declaration_Ml();

    /**
     * The meta object literal for the '<em><b>Locals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THEOREM_DECLARATION__LOCALS = eINSTANCE.getTheorem_declaration_Locals();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THEOREM_DECLARATION__STATEMENTS = eINSTANCE.getTheorem_declaration_Statements();

    /**
     * The meta object literal for the '<em><b>Endname</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THEOREM_DECLARATION__ENDNAME = eINSTANCE.getTheorem_declaration_Endname();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.In_modes_listImpl <em>In modes list</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.In_modes_listImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getIn_modes_list()
     * @generated
     */
    EClass IN_MODES_LIST = eINSTANCE.getIn_modes_list();

    /**
     * The meta object literal for the '<em><b>Modes</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IN_MODES_LIST__MODES = eINSTANCE.getIn_modes_list_Modes();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.Local_declarationImpl <em>Local declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.Local_declarationImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getLocal_declaration()
     * @generated
     */
    EClass LOCAL_DECLARATION = eINSTANCE.getLocal_declaration();

    /**
     * The meta object literal for the '<em><b>Const</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCAL_DECLARATION__CONST = eINSTANCE.getLocal_declaration_Const();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCAL_DECLARATION__NAME = eINSTANCE.getLocal_declaration_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_DECLARATION__TYPE = eINSTANCE.getLocal_declaration_Type();

    /**
     * The meta object literal for the '<em><b>Left expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_DECLARATION__LEFT_EXPR = eINSTANCE.getLocal_declaration_Left_expr();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.Theorem_statementImpl <em>Theorem statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.Theorem_statementImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getTheorem_statement()
     * @generated
     */
    EClass THEOREM_STATEMENT = eINSTANCE.getTheorem_statement();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.Basic_statementImpl <em>Basic statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.Basic_statementImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getBasic_statement()
     * @generated
     */
    EClass BASIC_STATEMENT = eINSTANCE.getBasic_statement();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.IterationImpl <em>Iteration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.IterationImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getIteration()
     * @generated
     */
    EClass ITERATION = eINSTANCE.getIteration();

    /**
     * The meta object literal for the '<em><b>Var id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ITERATION__VAR_ID = eINSTANCE.getIteration_Var_id();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITERATION__EXPR = eINSTANCE.getIteration_Expr();

    /**
     * The meta object literal for the '<em><b>Local</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITERATION__LOCAL = eINSTANCE.getIteration_Local();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITERATION__STATEMENTS = eINSTANCE.getIteration_Statements();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.Type_expressionImpl <em>Type expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.Type_expressionImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getType_expression()
     * @generated
     */
    EClass TYPE_EXPRESSION = eINSTANCE.getType_expression();

    /**
     * The meta object literal for the '<em><b>Basic</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_EXPRESSION__BASIC = eINSTANCE.getType_expression_Basic();

    /**
     * The meta object literal for the '<em><b>Composite</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_EXPRESSION__COMPOSITE = eINSTANCE.getType_expression_Composite();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_EXPRESSION__ELEMENT = eINSTANCE.getType_expression_Element();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.Basic_typeImpl <em>Basic type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.Basic_typeImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getBasic_type()
     * @generated
     */
    EClass BASIC_TYPE = eINSTANCE.getBasic_type();

    /**
     * The meta object literal for the '<em><b>Bool</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_TYPE__BOOL = eINSTANCE.getBasic_type_Bool();

    /**
     * The meta object literal for the '<em><b>String</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_TYPE__STRING = eINSTANCE.getBasic_type_String();

    /**
     * The meta object literal for the '<em><b>Enumer</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_TYPE__ENUMER = eINSTANCE.getBasic_type_Enumer();

    /**
     * The meta object literal for the '<em><b>Units</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_TYPE__UNITS = eINSTANCE.getBasic_type_Units();

    /**
     * The meta object literal for the '<em><b>Integer</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_TYPE__INTEGER = eINSTANCE.getBasic_type_Integer();

    /**
     * The meta object literal for the '<em><b>Real</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_TYPE__REAL = eINSTANCE.getBasic_type_Real();

    /**
     * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_TYPE__RANGE = eINSTANCE.getBasic_type_Range();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_TYPE__CLASS = eINSTANCE.getBasic_type_Class();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_TYPE__REF = eINSTANCE.getBasic_type_Ref();

    /**
     * The meta object literal for the '<em><b>Func</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_TYPE__FUNC = eINSTANCE.getBasic_type_Func();

    /**
     * The meta object literal for the '<em><b>Typename</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_TYPE__TYPENAME = eINSTANCE.getBasic_type_Typename();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.UnnamedFunctionTypeImpl <em>Unnamed Function Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.UnnamedFunctionTypeImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getUnnamedFunctionType()
     * @generated
     */
    EClass UNNAMED_FUNCTION_TYPE = eINSTANCE.getUnnamedFunctionType();

    /**
     * The meta object literal for the '<em><b>Parm</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNNAMED_FUNCTION_TYPE__PARM = eINSTANCE.getUnnamedFunctionType_Parm();

    /**
     * The meta object literal for the '<em><b>Outspec</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNNAMED_FUNCTION_TYPE__OUTSPEC = eINSTANCE.getUnnamedFunctionType_Outspec();

    /**
     * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNNAMED_FUNCTION_TYPE__RESULT = eINSTANCE.getUnnamedFunctionType_Result();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.Composite_typeImpl <em>Composite type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.Composite_typeImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getComposite_type()
     * @generated
     */
    EClass COMPOSITE_TYPE = eINSTANCE.getComposite_type();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.Set_typeImpl <em>Set type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.Set_typeImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getSet_type()
     * @generated
     */
    EClass SET_TYPE = eINSTANCE.getSet_type();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SET_TYPE__TYPE = eINSTANCE.getSet_type_Type();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.List_typeImpl <em>List type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.List_typeImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getList_type()
     * @generated
     */
    EClass LIST_TYPE = eINSTANCE.getList_type();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_TYPE__TYPE = eINSTANCE.getList_type_Type();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.Map_typeImpl <em>Map type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.Map_typeImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getMap_type()
     * @generated
     */
    EClass MAP_TYPE = eINSTANCE.getMap_type();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAP_TYPE__TYPE = eINSTANCE.getMap_type_Type();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.Record_typeImpl <em>Record type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.Record_typeImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getRecord_type()
     * @generated
     */
    EClass RECORD_TYPE = eINSTANCE.getRecord_type();

    /**
     * The meta object literal for the '<em><b>Field</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECORD_TYPE__FIELD = eINSTANCE.getRecord_type_Field();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.Union_typeImpl <em>Union type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.Union_typeImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getUnion_type()
     * @generated
     */
    EClass UNION_TYPE = eINSTANCE.getUnion_type();

    /**
     * The meta object literal for the '<em><b>Typename</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNION_TYPE__TYPENAME = eINSTANCE.getUnion_type_Typename();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNION_TYPE__TYPE = eINSTANCE.getUnion_type_Type();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.Id_type_pairImpl <em>Id type pair</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.Id_type_pairImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getId_type_pair()
     * @generated
     */
    EClass ID_TYPE_PAIR = eINSTANCE.getId_type_pair();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ID_TYPE_PAIR__NAME = eINSTANCE.getId_type_pair_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ID_TYPE_PAIR__TYPE = eINSTANCE.getId_type_pair_Type();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.Element_typeImpl <em>Element type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.Element_typeImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getElement_type()
     * @generated
     */
    EClass ELEMENT_TYPE = eINSTANCE.getElement_type();

    /**
     * The meta object literal for the '<em><b>Telem</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_TYPE__TELEM = eINSTANCE.getElement_type_Telem();

    /**
     * The meta object literal for the '<em><b>Tclass</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_TYPE__TCLASS = eINSTANCE.getElement_type_T_class();

    /**
     * The meta object literal for the '<em><b>Tref</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_TYPE__TREF = eINSTANCE.getElement_type_T_ref();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_classifiersImpl <em>tclassifiers</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.t_classifiersImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#gett_classifiers()
     * @generated
     */
    EClass TCLASSIFIERS = eINSTANCE.gett_classifiers();

    /**
     * The meta object literal for the '<em><b>Tclass</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TCLASSIFIERS__TCLASS = eINSTANCE.gett_classifiers_T_class();

    /**
     * The meta object literal for the '<em><b>Tclass subtype</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TCLASSIFIERS__TCLASS_SUBTYPE = eINSTANCE.gett_classifiers_T_class_subtype();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_classifier_subtypesImpl <em>tclassifier subtypes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.t_classifier_subtypesImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#gett_classifier_subtypes()
     * @generated
     */
    EClass TCLASSIFIER_SUBTYPES = eINSTANCE.gett_classifier_subtypes();

    /**
     * The meta object literal for the '<em><b>Tctype</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TCLASSIFIER_SUBTYPES__TCTYPE = eINSTANCE.gett_classifier_subtypes_T_ctype();

    /**
     * The meta object literal for the '<em><b>Tcimpl</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TCLASSIFIER_SUBTYPES__TCIMPL = eINSTANCE.gett_classifier_subtypes_T_cimpl();

    /**
     * The meta object literal for the '<em><b>Tfgclass</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TCLASSIFIER_SUBTYPES__TFGCLASS = eINSTANCE.gett_classifier_subtypes_T_fgclass();

    /**
     * The meta object literal for the '<em><b>Tannexclass</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TCLASSIFIER_SUBTYPES__TANNEXCLASS = eINSTANCE.gett_classifier_subtypes_T_annexclass();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_named_referencesImpl <em>tnamed references</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.t_named_referencesImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#gett_named_references()
     * @generated
     */
    EClass TNAMED_REFERENCES = eINSTANCE.gett_named_references();

    /**
     * The meta object literal for the '<em><b>Tnref</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TNAMED_REFERENCES__TNREF = eINSTANCE.gett_named_references_T_nref();

    /**
     * The meta object literal for the '<em><b>Tnref st</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TNAMED_REFERENCES__TNREF_ST = eINSTANCE.gett_named_references_T_nref_st();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_named_reference_subtypesImpl <em>tnamed reference subtypes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.t_named_reference_subtypesImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#gett_named_reference_subtypes()
     * @generated
     */
    EClass TNAMED_REFERENCE_SUBTYPES = eINSTANCE.gett_named_reference_subtypes();

    /**
     * The meta object literal for the '<em><b>Tsubc st</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TNAMED_REFERENCE_SUBTYPES__TSUBC_ST = eINSTANCE.gett_named_reference_subtypes_T_subc_st();

    /**
     * The meta object literal for the '<em><b>Tsbcall</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TNAMED_REFERENCE_SUBTYPES__TSBCALL = eINSTANCE.gett_named_reference_subtypes_T_sbcall();

    /**
     * The meta object literal for the '<em><b>Tcallseq</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TNAMED_REFERENCE_SUBTYPES__TCALLSEQ = eINSTANCE.gett_named_reference_subtypes_T_callseq();

    /**
     * The meta object literal for the '<em><b>Teeflow</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TNAMED_REFERENCE_SUBTYPES__TEEFLOW = eINSTANCE.gett_named_reference_subtypes_T_eeflow();

    /**
     * The meta object literal for the '<em><b>Tproto</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TNAMED_REFERENCE_SUBTYPES__TPROTO = eINSTANCE.gett_named_reference_subtypes_T_proto();

    /**
     * The meta object literal for the '<em><b>Tmode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TNAMED_REFERENCE_SUBTYPES__TMODE = eINSTANCE.gett_named_reference_subtypes_T_mode();

    /**
     * The meta object literal for the '<em><b>Treq mode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TNAMED_REFERENCE_SUBTYPES__TREQ_MODE = eINSTANCE.gett_named_reference_subtypes_T_req_mode();

    /**
     * The meta object literal for the '<em><b>Tmod trans</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TNAMED_REFERENCE_SUBTYPES__TMOD_TRANS = eINSTANCE.gett_named_reference_subtypes_T_mod_trans();

    /**
     * The meta object literal for the '<em><b>Tmode trig</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TNAMED_REFERENCE_SUBTYPES__TMODE_TRIG = eINSTANCE.gett_named_reference_subtypes_T_mode_trig();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_subcomponent_subtypesImpl <em>tsubcomponent subtypes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.t_subcomponent_subtypesImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#gett_subcomponent_subtypes()
     * @generated
     */
    EClass TSUBCOMPONENT_SUBTYPES = eINSTANCE.gett_subcomponent_subtypes();

    /**
     * The meta object literal for the '<em><b>Tsub</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TSUBCOMPONENT_SUBTYPES__TSUB = eINSTANCE.gett_subcomponent_subtypes_T_sub();

    /**
     * The meta object literal for the '<em><b>Tannex sub</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TSUBCOMPONENT_SUBTYPES__TANNEX_SUB = eINSTANCE.gett_subcomponent_subtypes_T_annex_sub();

    /**
     * The meta object literal for the '<em><b>Tcomp typeref</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TSUBCOMPONENT_SUBTYPES__TCOMP_TYPEREF = eINSTANCE.gett_subcomponent_subtypes_T_comp_typeref();

    /**
     * The meta object literal for the '<em><b>Tcimpl st</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TSUBCOMPONENT_SUBTYPES__TCIMPL_ST = eINSTANCE.gett_subcomponent_subtypes_T_cimpl_st();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_component_impl_subtypesImpl <em>tcomponent impl subtypes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.t_component_impl_subtypesImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#gett_component_impl_subtypes()
     * @generated
     */
    EClass TCOMPONENT_IMPL_SUBTYPES = eINSTANCE.gett_component_impl_subtypes();

    /**
     * The meta object literal for the '<em><b>Tcomp impref</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TCOMPONENT_IMPL_SUBTYPES__TCOMP_IMPREF = eINSTANCE.gett_component_impl_subtypes_T_comp_impref();

    /**
     * The meta object literal for the '<em><b>Tabstract</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TCOMPONENT_IMPL_SUBTYPES__TABSTRACT = eINSTANCE.gett_component_impl_subtypes_T_abstract();

    /**
     * The meta object literal for the '<em><b>Tsys</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TCOMPONENT_IMPL_SUBTYPES__TSYS = eINSTANCE.gett_component_impl_subtypes_T_sys();

    /**
     * The meta object literal for the '<em><b>Tproc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TCOMPONENT_IMPL_SUBTYPES__TPROC = eINSTANCE.gett_component_impl_subtypes_T_proc();

    /**
     * The meta object literal for the '<em><b>Tvirt proc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TCOMPONENT_IMPL_SUBTYPES__TVIRT_PROC = eINSTANCE.gett_component_impl_subtypes_T_virt_proc();

    /**
     * The meta object literal for the '<em><b>Tbus</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TCOMPONENT_IMPL_SUBTYPES__TBUS = eINSTANCE.gett_component_impl_subtypes_T_bus();

    /**
     * The meta object literal for the '<em><b>Tvbus</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TCOMPONENT_IMPL_SUBTYPES__TVBUS = eINSTANCE.gett_component_impl_subtypes_T_vbus();

    /**
     * The meta object literal for the '<em><b>Tmem</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TCOMPONENT_IMPL_SUBTYPES__TMEM = eINSTANCE.gett_component_impl_subtypes_T_mem();

    /**
     * The meta object literal for the '<em><b>Ttg</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TCOMPONENT_IMPL_SUBTYPES__TTG = eINSTANCE.gett_component_impl_subtypes_T_tg();

    /**
     * The meta object literal for the '<em><b>Tt</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TCOMPONENT_IMPL_SUBTYPES__TT = eINSTANCE.gett_component_impl_subtypes_T_t();

    /**
     * The meta object literal for the '<em><b>Td</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TCOMPONENT_IMPL_SUBTYPES__TD = eINSTANCE.gett_component_impl_subtypes_T_d();

    /**
     * The meta object literal for the '<em><b>Tsubprog</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TCOMPONENT_IMPL_SUBTYPES__TSUBPROG = eINSTANCE.gett_component_impl_subtypes_T_subprog();

    /**
     * The meta object literal for the '<em><b>Tsubprog g</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TCOMPONENT_IMPL_SUBTYPES__TSUBPROG_G = eINSTANCE.gett_component_impl_subtypes_T_subprog_g();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_connection_subtypesImpl <em>tconnection subtypes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.t_connection_subtypesImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#gett_connection_subtypes()
     * @generated
     */
    EClass TCONNECTION_SUBTYPES = eINSTANCE.gett_connection_subtypes();

    /**
     * The meta object literal for the '<em><b>Tconn</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TCONNECTION_SUBTYPES__TCONN = eINSTANCE.gett_connection_subtypes_T_conn();

    /**
     * The meta object literal for the '<em><b>Tfeat conn</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TCONNECTION_SUBTYPES__TFEAT_CONN = eINSTANCE.gett_connection_subtypes_T_feat_conn();

    /**
     * The meta object literal for the '<em><b>Tport conn</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TCONNECTION_SUBTYPES__TPORT_CONN = eINSTANCE.gett_connection_subtypes_T_port_conn();

    /**
     * The meta object literal for the '<em><b>Tparm conn</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TCONNECTION_SUBTYPES__TPARM_CONN = eINSTANCE.gett_connection_subtypes_T_parm_conn();

    /**
     * The meta object literal for the '<em><b>Tacc con</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TCONNECTION_SUBTYPES__TACC_CON = eINSTANCE.gett_connection_subtypes_T_acc_con();

    /**
     * The meta object literal for the '<em><b>Tfg conn</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TCONNECTION_SUBTYPES__TFG_CONN = eINSTANCE.gett_connection_subtypes_T_fg_conn();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_feature_subtypesImpl <em>tfeature subtypes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.t_feature_subtypesImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#gett_feature_subtypes()
     * @generated
     */
    EClass TFEATURE_SUBTYPES = eINSTANCE.gett_feature_subtypes();

    /**
     * The meta object literal for the '<em><b>Tfeat</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TFEATURE_SUBTYPES__TFEAT = eINSTANCE.gett_feature_subtypes_T_feat();

    /**
     * The meta object literal for the '<em><b>Tabs feat</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TFEATURE_SUBTYPES__TABS_FEAT = eINSTANCE.gett_feature_subtypes_T_abs_feat();

    /**
     * The meta object literal for the '<em><b>Tparm</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TFEATURE_SUBTYPES__TPARM = eINSTANCE.gett_feature_subtypes_T_parm();

    /**
     * The meta object literal for the '<em><b>Tfg</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TFEATURE_SUBTYPES__TFG = eINSTANCE.gett_feature_subtypes_T_fg();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_access_subtypesImpl <em>taccess subtypes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.t_access_subtypesImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#gett_access_subtypes()
     * @generated
     */
    EClass TACCESS_SUBTYPES = eINSTANCE.gett_access_subtypes();

    /**
     * The meta object literal for the '<em><b>Taccess</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TACCESS_SUBTYPES__TACCESS = eINSTANCE.gett_access_subtypes_T_access();

    /**
     * The meta object literal for the '<em><b>Tdata acc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TACCESS_SUBTYPES__TDATA_ACC = eINSTANCE.gett_access_subtypes_T_data_acc();

    /**
     * The meta object literal for the '<em><b>Tsub acc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TACCESS_SUBTYPES__TSUB_ACC = eINSTANCE.gett_access_subtypes_T_sub_acc();

    /**
     * The meta object literal for the '<em><b>Tsub gr acc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TACCESS_SUBTYPES__TSUB_GR_ACC = eINSTANCE.gett_access_subtypes_T_sub_gr_acc();

    /**
     * The meta object literal for the '<em><b>Tbus acc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TACCESS_SUBTYPES__TBUS_ACC = eINSTANCE.gett_access_subtypes_T_bus_acc();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_port_subtypesImpl <em>tport subtypes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.t_port_subtypesImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#gett_port_subtypes()
     * @generated
     */
    EClass TPORT_SUBTYPES = eINSTANCE.gett_port_subtypes();

    /**
     * The meta object literal for the '<em><b>Tport</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TPORT_SUBTYPES__TPORT = eINSTANCE.gett_port_subtypes_T_port();

    /**
     * The meta object literal for the '<em><b>Tdport</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TPORT_SUBTYPES__TDPORT = eINSTANCE.gett_port_subtypes_T_d_port();

    /**
     * The meta object literal for the '<em><b>Tev port</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TPORT_SUBTYPES__TEV_PORT = eINSTANCE.gett_port_subtypes_T_ev_port();

    /**
     * The meta object literal for the '<em><b>Tevd port</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TPORT_SUBTYPES__TEVD_PORT = eINSTANCE.gett_port_subtypes_T_evd_port();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_flow_spec_subtypesImpl <em>tflow spec subtypes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.t_flow_spec_subtypesImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#gett_flow_spec_subtypes()
     * @generated
     */
    EClass TFLOW_SPEC_SUBTYPES = eINSTANCE.gett_flow_spec_subtypes();

    /**
     * The meta object literal for the '<em><b>Tfspec</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TFLOW_SPEC_SUBTYPES__TFSPEC = eINSTANCE.gett_flow_spec_subtypes_T_f_spec();

    /**
     * The meta object literal for the '<em><b>Tfspec source</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TFLOW_SPEC_SUBTYPES__TFSPEC_SOURCE = eINSTANCE.gett_flow_spec_subtypes_T_f_spec_source();

    /**
     * The meta object literal for the '<em><b>Tfspec sink</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TFLOW_SPEC_SUBTYPES__TFSPEC_SINK = eINSTANCE.gett_flow_spec_subtypes_T_f_spec_sink();

    /**
     * The meta object literal for the '<em><b>Tfspec path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TFLOW_SPEC_SUBTYPES__TFSPEC_PATH = eINSTANCE.gett_flow_spec_subtypes_T_f_spec_path();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_flow_impl_subtypesImpl <em>tflow impl subtypes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.t_flow_impl_subtypesImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#gett_flow_impl_subtypes()
     * @generated
     */
    EClass TFLOW_IMPL_SUBTYPES = eINSTANCE.gett_flow_impl_subtypes();

    /**
     * The meta object literal for the '<em><b>Tfi</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TFLOW_IMPL_SUBTYPES__TFI = eINSTANCE.gett_flow_impl_subtypes_T_f_i();

    /**
     * The meta object literal for the '<em><b>Tfisource</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TFLOW_IMPL_SUBTYPES__TFISOURCE = eINSTANCE.gett_flow_impl_subtypes_T_f_i_source();

    /**
     * The meta object literal for the '<em><b>Tfisink</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TFLOW_IMPL_SUBTYPES__TFISINK = eINSTANCE.gett_flow_impl_subtypes_T_f_i_sink();

    /**
     * The meta object literal for the '<em><b>Tfipath</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TFLOW_IMPL_SUBTYPES__TFIPATH = eINSTANCE.gett_flow_impl_subtypes_T_f_i_path();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.MCSClosureImpl <em>MCS Closure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.MCSClosureImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getMCSClosure()
     * @generated
     */
    EClass MCS_CLOSURE = eINSTANCE.getMCSClosure();

    /**
     * The meta object literal for the '<em><b>Declared Formal Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MCS_CLOSURE__DECLARED_FORMAL_PARAMETERS = eINSTANCE.getMCSClosure_DeclaredFormalParameters();

    /**
     * The meta object literal for the '<em><b>Explicit Syntax</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MCS_CLOSURE__EXPLICIT_SYNTAX = eINSTANCE.getMCSClosure_ExplicitSyntax();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MCS_CLOSURE__EXPRESSION = eINSTANCE.getMCSClosure_Expression();

  }

} //McsPackage
