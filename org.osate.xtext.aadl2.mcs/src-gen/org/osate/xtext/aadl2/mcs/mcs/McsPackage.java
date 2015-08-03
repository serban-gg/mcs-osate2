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
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.type_declarationImpl <em>type declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.type_declarationImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#gettype_declaration()
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
   * The number of structural features of the '<em>type declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.constant_declarationImpl <em>constant declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.constant_declarationImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getconstant_declaration()
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
   * The number of structural features of the '<em>constant declaration</em>' class.
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
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.element_referenceImpl <em>element reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.element_referenceImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getelement_reference()
   * @generated
   */
  int ELEMENT_REFERENCE = 21;

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
  int CONTAINMENT_PATH_ELEMENT = 22;

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
  int ARRAY_RANGE = 23;

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
  int PACKAGE_ENFORCE = 24;

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
  int ASSERTION_EXPRESSION = 25;

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
  int STRING_EXPRESSION = 26;

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
  int CONSTANT_EXPRESSION = 27;

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
  int EXPRESSION = 28;

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
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.MCSAnnexSubclauseImpl <em>MCS Annex Subclause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.MCSAnnexSubclauseImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getMCSAnnexSubclause()
   * @generated
   */
  int MCS_ANNEX_SUBCLAUSE = 29;

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
  int CLASSIFIER_ENFORCE = 30;

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
  int CLASSIFIER_SCRIPT = 31;

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
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.function_declarationImpl <em>function declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.function_declarationImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getfunction_declaration()
   * @generated
   */
  int FUNCTION_DECLARATION = 32;

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
   * The number of structural features of the '<em>function declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.argumentImpl <em>argument</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.argumentImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getargument()
   * @generated
   */
  int ARGUMENT = 33;

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
   * The number of structural features of the '<em>argument</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.theorem_declarationImpl <em>theorem declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.theorem_declarationImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#gettheorem_declaration()
   * @generated
   */
  int THEOREM_DECLARATION = 34;

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
  int IN_MODES_LIST = 35;

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
  int LOCAL_DECLARATION = 36;

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
   * The number of structural features of the '<em>local declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_DECLARATION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.theorem_statementImpl <em>theorem statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.theorem_statementImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#gettheorem_statement()
   * @generated
   */
  int THEOREM_STATEMENT = 37;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEOREM_STATEMENT__STATEMENT = 0;

  /**
   * The number of structural features of the '<em>theorem statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEOREM_STATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.type_expressionImpl <em>type expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.type_expressionImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#gettype_expression()
   * @generated
   */
  int TYPE_EXPRESSION = 38;

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
   * The number of structural features of the '<em>type expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_EXPRESSION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.basic_typeImpl <em>basic type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.basic_typeImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getbasic_type()
   * @generated
   */
  int BASIC_TYPE = 39;

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
   * The number of structural features of the '<em>basic type</em>' class.
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
  int UNNAMED_FUNCTION_TYPE = 40;

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
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.composite_typeImpl <em>composite type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.composite_typeImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getcomposite_type()
   * @generated
   */
  int COMPOSITE_TYPE = 41;

  /**
   * The number of structural features of the '<em>composite type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.set_typeImpl <em>set type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.set_typeImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getset_type()
   * @generated
   */
  int SET_TYPE = 42;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_TYPE__TYPE = COMPOSITE_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>set type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_TYPE_FEATURE_COUNT = COMPOSITE_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.list_typeImpl <em>list type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.list_typeImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getlist_type()
   * @generated
   */
  int LIST_TYPE = 43;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_TYPE__TYPE = COMPOSITE_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>list type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_TYPE_FEATURE_COUNT = COMPOSITE_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.map_typeImpl <em>map type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.map_typeImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getmap_type()
   * @generated
   */
  int MAP_TYPE = 44;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_TYPE__TYPE = COMPOSITE_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>map type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_TYPE_FEATURE_COUNT = COMPOSITE_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.record_typeImpl <em>record type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.record_typeImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getrecord_type()
   * @generated
   */
  int RECORD_TYPE = 45;

  /**
   * The feature id for the '<em><b>Field</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_TYPE__FIELD = COMPOSITE_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>record type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_TYPE_FEATURE_COUNT = COMPOSITE_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.union_typeImpl <em>union type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.union_typeImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getunion_type()
   * @generated
   */
  int UNION_TYPE = 46;

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
   * The number of structural features of the '<em>union type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNION_TYPE_FEATURE_COUNT = COMPOSITE_TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.id_type_pairImpl <em>id type pair</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.id_type_pairImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getid_type_pair()
   * @generated
   */
  int ID_TYPE_PAIR = 47;

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
   * The number of structural features of the '<em>id type pair</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_TYPE_PAIR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.element_typeImpl <em>element type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.element_typeImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getelement_type()
   * @generated
   */
  int ELEMENT_TYPE = 48;

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
   * The number of structural features of the '<em>element type</em>' class.
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
  int TCLASSIFIERS = 49;

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
  int TCLASSIFIER_SUBTYPES = 50;

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
  int TNAMED_REFERENCES = 51;

  /**
   * The feature id for the '<em><b>Tnref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TNAMED_REFERENCES__TNREF = 0;

  /**
   * The number of structural features of the '<em>tnamed references</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TNAMED_REFERENCES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.MCSClosureImpl <em>MCS Closure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.MCSClosureImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getMCSClosure()
   * @generated
   */
  int MCS_CLOSURE = 52;

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
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.type_declaration <em>type declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>type declaration</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.type_declaration
   * @generated
   */
  EClass gettype_declaration();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.type_declaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.type_declaration#getName()
   * @see #gettype_declaration()
   * @generated
   */
  EAttribute gettype_declaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.type_declaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.type_declaration#getType()
   * @see #gettype_declaration()
   * @generated
   */
  EReference gettype_declaration_Type();

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
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.constant_declaration#isConst <em>Const</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Const</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.constant_declaration#isConst()
   * @see #getconstant_declaration()
   * @generated
   */
  EAttribute getconstant_declaration_Const();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.constant_declaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.constant_declaration#getName()
   * @see #getconstant_declaration()
   * @generated
   */
  EAttribute getconstant_declaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.constant_declaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.constant_declaration#getType()
   * @see #getconstant_declaration()
   * @generated
   */
  EReference getconstant_declaration_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.constant_declaration#getLeft_expr <em>Left expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left expr</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.constant_declaration#getLeft_expr()
   * @see #getconstant_declaration()
   * @generated
   */
  EReference getconstant_declaration_Left_expr();

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
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.function_declaration <em>function declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>function declaration</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.function_declaration
   * @generated
   */
  EClass getfunction_declaration();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.function_declaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.function_declaration#getName()
   * @see #getfunction_declaration()
   * @generated
   */
  EAttribute getfunction_declaration_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.mcs.mcs.function_declaration#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arg</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.function_declaration#getArg()
   * @see #getfunction_declaration()
   * @generated
   */
  EReference getfunction_declaration_Arg();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.function_declaration#getOut <em>Out</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Out</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.function_declaration#getOut()
   * @see #getfunction_declaration()
   * @generated
   */
  EReference getfunction_declaration_Out();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.function_declaration#getFtype <em>Ftype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ftype</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.function_declaration#getFtype()
   * @see #getfunction_declaration()
   * @generated
   */
  EReference getfunction_declaration_Ftype();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.mcs.mcs.function_declaration#getTyperef <em>Typeref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Typeref</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.function_declaration#getTyperef()
   * @see #getfunction_declaration()
   * @generated
   */
  EReference getfunction_declaration_Typeref();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.function_declaration#getClosure <em>Closure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Closure</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.function_declaration#getClosure()
   * @see #getfunction_declaration()
   * @generated
   */
  EReference getfunction_declaration_Closure();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.function_declaration#getExp_body <em>Exp body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp body</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.function_declaration#getExp_body()
   * @see #getfunction_declaration()
   * @generated
   */
  EReference getfunction_declaration_Exp_body();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.argument <em>argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>argument</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.argument
   * @generated
   */
  EClass getargument();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.argument#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.argument#getName()
   * @see #getargument()
   * @generated
   */
  EAttribute getargument_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.argument#getArg_type <em>Arg type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arg type</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.argument#getArg_type()
   * @see #getargument()
   * @generated
   */
  EReference getargument_Arg_type();

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
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.mcs.mcs.theorem_declaration#getEndname <em>Endname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Endname</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.theorem_declaration#getEndname()
   * @see #gettheorem_declaration()
   * @generated
   */
  EReference gettheorem_declaration_Endname();

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
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.local_declaration#isConst <em>Const</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Const</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.local_declaration#isConst()
   * @see #getlocal_declaration()
   * @generated
   */
  EAttribute getlocal_declaration_Const();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.local_declaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.local_declaration#getName()
   * @see #getlocal_declaration()
   * @generated
   */
  EAttribute getlocal_declaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.local_declaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.local_declaration#getType()
   * @see #getlocal_declaration()
   * @generated
   */
  EReference getlocal_declaration_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.local_declaration#getLeft_expr <em>Left expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left expr</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.local_declaration#getLeft_expr()
   * @see #getlocal_declaration()
   * @generated
   */
  EReference getlocal_declaration_Left_expr();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.theorem_statement <em>theorem statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>theorem statement</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.theorem_statement
   * @generated
   */
  EClass gettheorem_statement();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.theorem_statement#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.theorem_statement#getStatement()
   * @see #gettheorem_statement()
   * @generated
   */
  EReference gettheorem_statement_Statement();

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
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.type_expression#getBasic <em>Basic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Basic</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.type_expression#getBasic()
   * @see #gettype_expression()
   * @generated
   */
  EReference gettype_expression_Basic();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.type_expression#getComposite <em>Composite</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Composite</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.type_expression#getComposite()
   * @see #gettype_expression()
   * @generated
   */
  EReference gettype_expression_Composite();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.type_expression#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.type_expression#getElement()
   * @see #gettype_expression()
   * @generated
   */
  EReference gettype_expression_Element();

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
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.basic_type#getEnumer <em>Enumer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Enumer</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.basic_type#getEnumer()
   * @see #getbasic_type()
   * @generated
   */
  EReference getbasic_type_Enumer();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.basic_type#getUnits <em>Units</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Units</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.basic_type#getUnits()
   * @see #getbasic_type()
   * @generated
   */
  EReference getbasic_type_Units();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.basic_type#getInteger <em>Integer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Integer</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.basic_type#getInteger()
   * @see #getbasic_type()
   * @generated
   */
  EReference getbasic_type_Integer();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.basic_type#getReal <em>Real</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Real</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.basic_type#getReal()
   * @see #getbasic_type()
   * @generated
   */
  EReference getbasic_type_Real();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.basic_type#getRange <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Range</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.basic_type#getRange()
   * @see #getbasic_type()
   * @generated
   */
  EReference getbasic_type_Range();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.basic_type#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.basic_type#getClass_()
   * @see #getbasic_type()
   * @generated
   */
  EReference getbasic_type_Class();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.basic_type#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.basic_type#getRef()
   * @see #getbasic_type()
   * @generated
   */
  EReference getbasic_type_Ref();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.basic_type#getFunc <em>Func</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Func</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.basic_type#getFunc()
   * @see #getbasic_type()
   * @generated
   */
  EReference getbasic_type_Func();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.mcs.mcs.basic_type#getTypename <em>Typename</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Typename</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.basic_type#getTypename()
   * @see #getbasic_type()
   * @generated
   */
  EReference getbasic_type_Typename();

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
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.composite_type <em>composite type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>composite type</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.composite_type
   * @generated
   */
  EClass getcomposite_type();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.set_type <em>set type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>set type</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.set_type
   * @generated
   */
  EClass getset_type();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.set_type#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.set_type#getType()
   * @see #getset_type()
   * @generated
   */
  EReference getset_type_Type();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.list_type <em>list type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>list type</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.list_type
   * @generated
   */
  EClass getlist_type();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.list_type#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.list_type#getType()
   * @see #getlist_type()
   * @generated
   */
  EReference getlist_type_Type();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.map_type <em>map type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>map type</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.map_type
   * @generated
   */
  EClass getmap_type();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.map_type#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.map_type#getType()
   * @see #getmap_type()
   * @generated
   */
  EReference getmap_type_Type();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.record_type <em>record type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>record type</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.record_type
   * @generated
   */
  EClass getrecord_type();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.mcs.mcs.record_type#getField <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Field</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.record_type#getField()
   * @see #getrecord_type()
   * @generated
   */
  EReference getrecord_type_Field();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.union_type <em>union type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>union type</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.union_type
   * @generated
   */
  EClass getunion_type();

  /**
   * Returns the meta object for the attribute list '{@link org.osate.xtext.aadl2.mcs.mcs.union_type#getTypename <em>Typename</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Typename</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.union_type#getTypename()
   * @see #getunion_type()
   * @generated
   */
  EAttribute getunion_type_Typename();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.mcs.mcs.union_type#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Type</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.union_type#getType()
   * @see #getunion_type()
   * @generated
   */
  EReference getunion_type_Type();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.id_type_pair <em>id type pair</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>id type pair</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.id_type_pair
   * @generated
   */
  EClass getid_type_pair();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.id_type_pair#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.id_type_pair#getName()
   * @see #getid_type_pair()
   * @generated
   */
  EAttribute getid_type_pair_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.id_type_pair#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.id_type_pair#getType()
   * @see #getid_type_pair()
   * @generated
   */
  EReference getid_type_pair_Type();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.element_type <em>element type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>element type</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.element_type
   * @generated
   */
  EClass getelement_type();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.element_type#isTelem <em>Telem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Telem</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.element_type#isTelem()
   * @see #getelement_type()
   * @generated
   */
  EAttribute getelement_type_Telem();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.element_type#isT_class <em>Tclass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tclass</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.element_type#isT_class()
   * @see #getelement_type()
   * @generated
   */
  EAttribute getelement_type_T_class();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.element_type#isT_ref <em>Tref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tref</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.element_type#isT_ref()
   * @see #getelement_type()
   * @generated
   */
  EAttribute getelement_type_T_ref();

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
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.type_declarationImpl <em>type declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.type_declarationImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#gettype_declaration()
     * @generated
     */
    EClass TYPE_DECLARATION = eINSTANCE.gettype_declaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_DECLARATION__NAME = eINSTANCE.gettype_declaration_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DECLARATION__TYPE = eINSTANCE.gettype_declaration_Type();

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
     * The meta object literal for the '<em><b>Const</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT_DECLARATION__CONST = eINSTANCE.getconstant_declaration_Const();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT_DECLARATION__NAME = eINSTANCE.getconstant_declaration_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_DECLARATION__TYPE = eINSTANCE.getconstant_declaration_Type();

    /**
     * The meta object literal for the '<em><b>Left expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_DECLARATION__LEFT_EXPR = eINSTANCE.getconstant_declaration_Left_expr();

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
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.function_declarationImpl <em>function declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.function_declarationImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getfunction_declaration()
     * @generated
     */
    EClass FUNCTION_DECLARATION = eINSTANCE.getfunction_declaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_DECLARATION__NAME = eINSTANCE.getfunction_declaration_Name();

    /**
     * The meta object literal for the '<em><b>Arg</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DECLARATION__ARG = eINSTANCE.getfunction_declaration_Arg();

    /**
     * The meta object literal for the '<em><b>Out</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DECLARATION__OUT = eINSTANCE.getfunction_declaration_Out();

    /**
     * The meta object literal for the '<em><b>Ftype</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DECLARATION__FTYPE = eINSTANCE.getfunction_declaration_Ftype();

    /**
     * The meta object literal for the '<em><b>Typeref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DECLARATION__TYPEREF = eINSTANCE.getfunction_declaration_Typeref();

    /**
     * The meta object literal for the '<em><b>Closure</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DECLARATION__CLOSURE = eINSTANCE.getfunction_declaration_Closure();

    /**
     * The meta object literal for the '<em><b>Exp body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DECLARATION__EXP_BODY = eINSTANCE.getfunction_declaration_Exp_body();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.argumentImpl <em>argument</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.argumentImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getargument()
     * @generated
     */
    EClass ARGUMENT = eINSTANCE.getargument();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGUMENT__NAME = eINSTANCE.getargument_Name();

    /**
     * The meta object literal for the '<em><b>Arg type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGUMENT__ARG_TYPE = eINSTANCE.getargument_Arg_type();

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
     * The meta object literal for the '<em><b>Endname</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THEOREM_DECLARATION__ENDNAME = eINSTANCE.gettheorem_declaration_Endname();

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
     * The meta object literal for the '<em><b>Const</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCAL_DECLARATION__CONST = eINSTANCE.getlocal_declaration_Const();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCAL_DECLARATION__NAME = eINSTANCE.getlocal_declaration_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_DECLARATION__TYPE = eINSTANCE.getlocal_declaration_Type();

    /**
     * The meta object literal for the '<em><b>Left expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_DECLARATION__LEFT_EXPR = eINSTANCE.getlocal_declaration_Left_expr();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.theorem_statementImpl <em>theorem statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.theorem_statementImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#gettheorem_statement()
     * @generated
     */
    EClass THEOREM_STATEMENT = eINSTANCE.gettheorem_statement();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THEOREM_STATEMENT__STATEMENT = eINSTANCE.gettheorem_statement_Statement();

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
     * The meta object literal for the '<em><b>Basic</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_EXPRESSION__BASIC = eINSTANCE.gettype_expression_Basic();

    /**
     * The meta object literal for the '<em><b>Composite</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_EXPRESSION__COMPOSITE = eINSTANCE.gettype_expression_Composite();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_EXPRESSION__ELEMENT = eINSTANCE.gettype_expression_Element();

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
     * The meta object literal for the '<em><b>Enumer</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_TYPE__ENUMER = eINSTANCE.getbasic_type_Enumer();

    /**
     * The meta object literal for the '<em><b>Units</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_TYPE__UNITS = eINSTANCE.getbasic_type_Units();

    /**
     * The meta object literal for the '<em><b>Integer</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_TYPE__INTEGER = eINSTANCE.getbasic_type_Integer();

    /**
     * The meta object literal for the '<em><b>Real</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_TYPE__REAL = eINSTANCE.getbasic_type_Real();

    /**
     * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_TYPE__RANGE = eINSTANCE.getbasic_type_Range();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_TYPE__CLASS = eINSTANCE.getbasic_type_Class();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_TYPE__REF = eINSTANCE.getbasic_type_Ref();

    /**
     * The meta object literal for the '<em><b>Func</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_TYPE__FUNC = eINSTANCE.getbasic_type_Func();

    /**
     * The meta object literal for the '<em><b>Typename</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_TYPE__TYPENAME = eINSTANCE.getbasic_type_Typename();

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
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.composite_typeImpl <em>composite type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.composite_typeImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getcomposite_type()
     * @generated
     */
    EClass COMPOSITE_TYPE = eINSTANCE.getcomposite_type();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.set_typeImpl <em>set type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.set_typeImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getset_type()
     * @generated
     */
    EClass SET_TYPE = eINSTANCE.getset_type();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SET_TYPE__TYPE = eINSTANCE.getset_type_Type();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.list_typeImpl <em>list type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.list_typeImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getlist_type()
     * @generated
     */
    EClass LIST_TYPE = eINSTANCE.getlist_type();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_TYPE__TYPE = eINSTANCE.getlist_type_Type();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.map_typeImpl <em>map type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.map_typeImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getmap_type()
     * @generated
     */
    EClass MAP_TYPE = eINSTANCE.getmap_type();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAP_TYPE__TYPE = eINSTANCE.getmap_type_Type();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.record_typeImpl <em>record type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.record_typeImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getrecord_type()
     * @generated
     */
    EClass RECORD_TYPE = eINSTANCE.getrecord_type();

    /**
     * The meta object literal for the '<em><b>Field</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECORD_TYPE__FIELD = eINSTANCE.getrecord_type_Field();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.union_typeImpl <em>union type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.union_typeImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getunion_type()
     * @generated
     */
    EClass UNION_TYPE = eINSTANCE.getunion_type();

    /**
     * The meta object literal for the '<em><b>Typename</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNION_TYPE__TYPENAME = eINSTANCE.getunion_type_Typename();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNION_TYPE__TYPE = eINSTANCE.getunion_type_Type();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.id_type_pairImpl <em>id type pair</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.id_type_pairImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getid_type_pair()
     * @generated
     */
    EClass ID_TYPE_PAIR = eINSTANCE.getid_type_pair();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ID_TYPE_PAIR__NAME = eINSTANCE.getid_type_pair_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ID_TYPE_PAIR__TYPE = eINSTANCE.getid_type_pair_Type();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.element_typeImpl <em>element type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.element_typeImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getelement_type()
     * @generated
     */
    EClass ELEMENT_TYPE = eINSTANCE.getelement_type();

    /**
     * The meta object literal for the '<em><b>Telem</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_TYPE__TELEM = eINSTANCE.getelement_type_Telem();

    /**
     * The meta object literal for the '<em><b>Tclass</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_TYPE__TCLASS = eINSTANCE.getelement_type_T_class();

    /**
     * The meta object literal for the '<em><b>Tref</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_TYPE__TREF = eINSTANCE.getelement_type_T_ref();

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
