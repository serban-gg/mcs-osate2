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
   * The feature id for the '<em><b>File</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_GRAMMAR_ROOT__FILE = 1;

  /**
   * The feature id for the '<em><b>Subclause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_GRAMMAR_ROOT__SUBCLAUSE = 2;

  /**
   * The number of structural features of the '<em>MCS Grammar Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_GRAMMAR_ROOT_FEATURE_COUNT = 3;

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
   * The number of structural features of the '<em>MCS Annex Library</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_ANNEX_LIBRARY_FEATURE_COUNT = Aadl2Package.ANNEX_LIBRARY_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.MCSFileImpl <em>MCS File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.MCSFileImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getMCSFile()
   * @generated
   */
  int MCS_FILE = 2;

  /**
   * The feature id for the '<em><b>Imported Unit</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_FILE__IMPORTED_UNIT = 0;

  /**
   * The feature id for the '<em><b>Files</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_FILE__FILES = 1;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_FILE__TYPES = 2;

  /**
   * The feature id for the '<em><b>Constants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_FILE__CONSTANTS = 3;

  /**
   * The feature id for the '<em><b>Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_FILE__FUNCTIONS = 4;

  /**
   * The feature id for the '<em><b>Theorems</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_FILE__THEOREMS = 5;

  /**
   * The feature id for the '<em><b>Calls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_FILE__CALLS = 6;

  /**
   * The number of structural features of the '<em>MCS File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_FILE_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.MCSAnnexSubclauseImpl <em>MCS Annex Subclause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.MCSAnnexSubclauseImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getMCSAnnexSubclause()
   * @generated
   */
  int MCS_ANNEX_SUBCLAUSE = 3;

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
   * The feature id for the '<em><b>Calls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_ANNEX_SUBCLAUSE__CALLS = Aadl2Package.ANNEX_SUBCLAUSE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>MCS Annex Subclause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_ANNEX_SUBCLAUSE_FEATURE_COUNT = Aadl2Package.ANNEX_SUBCLAUSE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.Type_declarationImpl <em>Type declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.Type_declarationImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getType_declaration()
   * @generated
   */
  int TYPE_DECLARATION = 4;

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
  int CONSTANT_DECLARATION = 5;

  /**
   * The feature id for the '<em><b>Const</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DECLARATION__CONST = 0;

  /**
   * The feature id for the '<em><b>Left expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DECLARATION__LEFT_EXPR = 1;

  /**
   * The number of structural features of the '<em>Constant declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.FunctionImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__ARGS = 1;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__BODY = 2;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.TheoremImpl <em>Theorem</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.TheoremImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getTheorem()
   * @generated
   */
  int THEOREM = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEOREM__NAME = 0;

  /**
   * The feature id for the '<em><b>Troot</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEOREM__TROOT = 1;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEOREM__ARGS = 2;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEOREM__BODY = 3;

  /**
   * The number of structural features of the '<em>Theorem</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEOREM_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.Theorem_rootImpl <em>Theorem root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.Theorem_rootImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getTheorem_root()
   * @generated
   */
  int THEOREM_ROOT = 8;

  /**
   * The feature id for the '<em><b>Nilroot</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEOREM_ROOT__NILROOT = 0;

  /**
   * The feature id for the '<em><b>Classifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEOREM_ROOT__CLASSIFIER = 1;

  /**
   * The number of structural features of the '<em>Theorem root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEOREM_ROOT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.FunctionBodyImpl <em>Function Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.FunctionBodyImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getFunctionBody()
   * @generated
   */
  int FUNCTION_BODY = 9;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_BODY__TYPE = 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_BODY__EXPR = 1;

  /**
   * The number of structural features of the '<em>Function Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_BODY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.TheoremBodyImpl <em>Theorem Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.TheoremBodyImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getTheoremBody()
   * @generated
   */
  int THEOREM_BODY = 10;

  /**
   * The feature id for the '<em><b>String</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEOREM_BODY__STRING = 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEOREM_BODY__EXPR = 1;

  /**
   * The number of structural features of the '<em>Theorem Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEOREM_BODY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.ParameterizedStringImpl <em>Parameterized String</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.ParameterizedStringImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getParameterizedString()
   * @generated
   */
  int PARAMETERIZED_STRING = 11;

  /**
   * The feature id for the '<em><b>Claim</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERIZED_STRING__CLAIM = 0;

  /**
   * The number of structural features of the '<em>Parameterized String</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERIZED_STRING_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.ParameterImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 12;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.TextParmImpl <em>Text Parm</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.TextParmImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getTextParm()
   * @generated
   */
  int TEXT_PARM = 13;

  /**
   * The number of structural features of the '<em>Text Parm</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_PARM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.McsTypedNameImpl <em>Typed Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsTypedNameImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getMcsTypedName()
   * @generated
   */
  int MCS_TYPED_NAME = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_TYPED_NAME__NAME = PARAMETER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_TYPED_NAME__TYPE = PARAMETER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_TYPED_NAME__EXPR = PARAMETER_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Typed Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_TYPED_NAME_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.TheoremCallImpl <em>Theorem Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.TheoremCallImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getTheoremCall()
   * @generated
   */
  int THEOREM_CALL = 15;

  /**
   * The feature id for the '<em><b>Tname</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEOREM_CALL__TNAME = 0;

  /**
   * The feature id for the '<em><b>Croot</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEOREM_CALL__CROOT = 1;

  /**
   * The feature id for the '<em><b>Actarg</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEOREM_CALL__ACTARG = 2;

  /**
   * The number of structural features of the '<em>Theorem Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEOREM_CALL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.Classifier_literalImpl <em>Classifier literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.Classifier_literalImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getClassifier_literal()
   * @generated
   */
  int CLASSIFIER_LITERAL = 16;

  /**
   * The feature id for the '<em><b>Classlit</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER_LITERAL__CLASSLIT = 0;

  /**
   * The feature id for the '<em><b>Nameref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER_LITERAL__NAMEREF = 1;

  /**
   * The number of structural features of the '<em>Classifier literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER_LITERAL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.ExprImpl <em>Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.ExprImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getExpr()
   * @generated
   */
  int EXPR = 24;

  /**
   * The number of structural features of the '<em>Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.RangeImpl <em>Range</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.RangeImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getRange()
   * @generated
   */
  int RANGE = 17;

  /**
   * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE__LOWER_BOUND = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE__UPPER_BOUND = EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE__VAL = EXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Range</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_FEATURE_COUNT = EXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.RefTermImpl <em>Ref Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.RefTermImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getRefTerm()
   * @generated
   */
  int REF_TERM = 18;

  /**
   * The feature id for the '<em><b>Root</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_TERM__ROOT = 0;

  /**
   * The feature id for the '<em><b>Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_TERM__SUB = 1;

  /**
   * The number of structural features of the '<em>Ref Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_TERM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.NestedDotIDImpl <em>Nested Dot ID</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.NestedDotIDImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getNestedDotID()
   * @generated
   */
  int NESTED_DOT_ID = 19;

  /**
   * The feature id for the '<em><b>Base</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_DOT_ID__BASE = 0;

  /**
   * The feature id for the '<em><b>Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_DOT_ID__SUB = 1;

  /**
   * The number of structural features of the '<em>Nested Dot ID</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_DOT_ID_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.Mcs_name_refImpl <em>Mcs name ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.Mcs_name_refImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getMcs_name_ref()
   * @generated
   */
  int MCS_NAME_REF = 20;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_NAME_REF__REF = 0;

  /**
   * The feature id for the '<em><b>Chain</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_NAME_REF__CHAIN = 1;

  /**
   * The number of structural features of the '<em>Mcs name ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_NAME_REF_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.MethodChainImpl <em>Method Chain</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.MethodChainImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getMethodChain()
   * @generated
   */
  int METHOD_CHAIN = 21;

  /**
   * The feature id for the '<em><b>Builtin</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_CHAIN__BUILTIN = 0;

  /**
   * The feature id for the '<em><b>Method</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_CHAIN__METHOD = 1;

  /**
   * The number of structural features of the '<em>Method Chain</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_CHAIN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.BuiltInFnCallImpl <em>Built In Fn Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.BuiltInFnCallImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getBuiltInFnCall()
   * @generated
   */
  int BUILT_IN_FN_CALL = 22;

  /**
   * The feature id for the '<em><b>Fn</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILT_IN_FN_CALL__FN = 0;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILT_IN_FN_CALL__ARGS = 1;

  /**
   * The feature id for the '<em><b>Newtype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILT_IN_FN_CALL__NEWTYPE = 2;

  /**
   * The number of structural features of the '<em>Built In Fn Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILT_IN_FN_CALL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.FnCallImpl <em>Fn Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.FnCallImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getFnCall()
   * @generated
   */
  int FN_CALL = 23;

  /**
   * The feature id for the '<em><b>Fn</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FN_CALL__FN = 0;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FN_CALL__ARGS = 1;

  /**
   * The feature id for the '<em><b>Newtype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FN_CALL__NEWTYPE = 2;

  /**
   * The number of structural features of the '<em>Fn Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FN_CALL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.PostCastExprImpl <em>Post Cast Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.PostCastExprImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getPostCastExpr()
   * @generated
   */
  int POST_CAST_EXPR = 25;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST_CAST_EXPR__EXPR = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Newtype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST_CAST_EXPR__NEWTYPE = EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Chain</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST_CAST_EXPR__CHAIN = EXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Post Cast Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST_CAST_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.MCSNameExprImpl <em>MCS Name Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.MCSNameExprImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getMCSNameExpr()
   * @generated
   */
  int MCS_NAME_EXPR = 26;

  /**
   * The feature id for the '<em><b>Root</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_NAME_EXPR__ROOT = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Iroot</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_NAME_EXPR__IROOT = EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Nil</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_NAME_EXPR__NIL = EXPR_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Empty</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_NAME_EXPR__EMPTY = EXPR_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Allmodes</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_NAME_EXPR__ALLMODES = EXPR_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Typednameref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_NAME_EXPR__TYPEDNAMEREF = EXPR_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>MCS Name Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MCS_NAME_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.Type_expressionImpl <em>Type expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.Type_expressionImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getType_expression()
   * @generated
   */
  int TYPE_EXPRESSION = 27;

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
  int BASIC_TYPE = 28;

  /**
   * The feature id for the '<em><b>Ptype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_TYPE__PTYPE = 0;

  /**
   * The feature id for the '<em><b>Pref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_TYPE__PREF = 1;

  /**
   * The feature id for the '<em><b>Bool</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_TYPE__BOOL = 2;

  /**
   * The feature id for the '<em><b>String</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_TYPE__STRING = 3;

  /**
   * The feature id for the '<em><b>Enumer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_TYPE__ENUMER = 4;

  /**
   * The feature id for the '<em><b>Units</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_TYPE__UNITS = 5;

  /**
   * The feature id for the '<em><b>Integer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_TYPE__INTEGER = 6;

  /**
   * The feature id for the '<em><b>Real</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_TYPE__REAL = 7;

  /**
   * The feature id for the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_TYPE__RANGE = 8;

  /**
   * The feature id for the '<em><b>Typename</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_TYPE__TYPENAME = 9;

  /**
   * The number of structural features of the '<em>Basic type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_TYPE_FEATURE_COUNT = 10;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.Composite_typeImpl <em>Composite type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.Composite_typeImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getComposite_type()
   * @generated
   */
  int COMPOSITE_TYPE = 29;

  /**
   * The number of structural features of the '<em>Composite type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.Mapping_typeImpl <em>Mapping type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.Mapping_typeImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getMapping_type()
   * @generated
   */
  int MAPPING_TYPE = 30;

  /**
   * The feature id for the '<em><b>Key</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_TYPE__KEY = COMPOSITE_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_TYPE__VAL = COMPOSITE_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Mapping type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_TYPE_FEATURE_COUNT = COMPOSITE_TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.Set_typeImpl <em>Set type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.Set_typeImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getSet_type()
   * @generated
   */
  int SET_TYPE = 31;

  /**
   * The feature id for the '<em><b>Root type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_TYPE__ROOT_TYPE = COMPOSITE_TYPE_FEATURE_COUNT + 0;

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
  int LIST_TYPE = 32;

  /**
   * The feature id for the '<em><b>Root type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_TYPE__ROOT_TYPE = COMPOSITE_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>List type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_TYPE_FEATURE_COUNT = COMPOSITE_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.Union_typeImpl <em>Union type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.Union_typeImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getUnion_type()
   * @generated
   */
  int UNION_TYPE = 33;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNION_TYPE__TYPES = COMPOSITE_TYPE_FEATURE_COUNT + 0;

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
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.Element_typeImpl <em>Element type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.Element_typeImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getElement_type()
   * @generated
   */
  int ELEMENT_TYPE = 34;

  /**
   * The feature id for the '<em><b>Telem</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_TYPE__TELEM = 0;

  /**
   * The feature id for the '<em><b>Tpack</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_TYPE__TPACK = 1;

  /**
   * The feature id for the '<em><b>Tclass</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_TYPE__TCLASS = 2;

  /**
   * The feature id for the '<em><b>Tinst</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_TYPE__TINST = 3;

  /**
   * The number of structural features of the '<em>Element type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_TYPE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.ClassifiersImpl <em>Classifiers</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.ClassifiersImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getClassifiers()
   * @generated
   */
  int CLASSIFIERS = 35;

  /**
   * The feature id for the '<em><b>Tclass</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIERS__TCLASS = 0;

  /**
   * The feature id for the '<em><b>Tclass subtype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIERS__TCLASS_SUBTYPE = 1;

  /**
   * The number of structural features of the '<em>Classifiers</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIERS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.T_classifier_subtypesImpl <em>Tclassifier subtypes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.T_classifier_subtypesImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getT_classifier_subtypes()
   * @generated
   */
  int TCLASSIFIER_SUBTYPES = 36;

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
   * The number of structural features of the '<em>Tclassifier subtypes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCLASSIFIER_SUBTYPES_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.InstancesImpl <em>Instances</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.InstancesImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getInstances()
   * @generated
   */
  int INSTANCES = 37;

  /**
   * The feature id for the '<em><b>Inst</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCES__INST = 0;

  /**
   * The feature id for the '<em><b>Tinst st</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCES__TINST_ST = 1;

  /**
   * The number of structural features of the '<em>Instances</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCES_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_instance_subtypesImpl <em>tinstance subtypes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.t_instance_subtypesImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#gett_instance_subtypes()
   * @generated
   */
  int TINSTANCE_SUBTYPES = 38;

  /**
   * The feature id for the '<em><b>Tsubc st</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TINSTANCE_SUBTYPES__TSUBC_ST = 0;

  /**
   * The feature id for the '<em><b>Tsbcall</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TINSTANCE_SUBTYPES__TSBCALL = 1;

  /**
   * The feature id for the '<em><b>Tcallseq</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TINSTANCE_SUBTYPES__TCALLSEQ = 2;

  /**
   * The feature id for the '<em><b>Teeflow</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TINSTANCE_SUBTYPES__TEEFLOW = 3;

  /**
   * The feature id for the '<em><b>Tproto</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TINSTANCE_SUBTYPES__TPROTO = 4;

  /**
   * The feature id for the '<em><b>Tmode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TINSTANCE_SUBTYPES__TMODE = 5;

  /**
   * The feature id for the '<em><b>Tmod trans</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TINSTANCE_SUBTYPES__TMOD_TRANS = 6;

  /**
   * The feature id for the '<em><b>Tmode trig</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TINSTANCE_SUBTYPES__TMODE_TRIG = 7;

  /**
   * The number of structural features of the '<em>tinstance subtypes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TINSTANCE_SUBTYPES_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_subcomponent_subtypesImpl <em>tsubcomponent subtypes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.t_subcomponent_subtypesImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#gett_subcomponent_subtypes()
   * @generated
   */
  int TSUBCOMPONENT_SUBTYPES = 39;

  /**
   * The feature id for the '<em><b>Tsub</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TSUBCOMPONENT_SUBTYPES__TSUB = 0;

  /**
   * The feature id for the '<em><b>Tcimpl st</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TSUBCOMPONENT_SUBTYPES__TCIMPL_ST = 1;

  /**
   * The number of structural features of the '<em>tsubcomponent subtypes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TSUBCOMPONENT_SUBTYPES_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_component_subtypesImpl <em>tcomponent subtypes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.t_component_subtypesImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#gett_component_subtypes()
   * @generated
   */
  int TCOMPONENT_SUBTYPES = 40;

  /**
   * The feature id for the '<em><b>Tannex sub</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCOMPONENT_SUBTYPES__TANNEX_SUB = 0;

  /**
   * The feature id for the '<em><b>Tabstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCOMPONENT_SUBTYPES__TABSTRACT = 1;

  /**
   * The feature id for the '<em><b>Tsys</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCOMPONENT_SUBTYPES__TSYS = 2;

  /**
   * The feature id for the '<em><b>Tdev</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCOMPONENT_SUBTYPES__TDEV = 3;

  /**
   * The feature id for the '<em><b>Tproc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCOMPONENT_SUBTYPES__TPROC = 4;

  /**
   * The feature id for the '<em><b>Tvirt proc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCOMPONENT_SUBTYPES__TVIRT_PROC = 5;

  /**
   * The feature id for the '<em><b>Tbus</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCOMPONENT_SUBTYPES__TBUS = 6;

  /**
   * The feature id for the '<em><b>Tvbus</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCOMPONENT_SUBTYPES__TVBUS = 7;

  /**
   * The feature id for the '<em><b>Tmem</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCOMPONENT_SUBTYPES__TMEM = 8;

  /**
   * The feature id for the '<em><b>Ttg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCOMPONENT_SUBTYPES__TTG = 9;

  /**
   * The feature id for the '<em><b>Tt</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCOMPONENT_SUBTYPES__TT = 10;

  /**
   * The feature id for the '<em><b>Td</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCOMPONENT_SUBTYPES__TD = 11;

  /**
   * The feature id for the '<em><b>Tsubprog</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCOMPONENT_SUBTYPES__TSUBPROG = 12;

  /**
   * The feature id for the '<em><b>Tsubprog g</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCOMPONENT_SUBTYPES__TSUBPROG_G = 13;

  /**
   * The number of structural features of the '<em>tcomponent subtypes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCOMPONENT_SUBTYPES_FEATURE_COUNT = 14;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_connection_subtypesImpl <em>tconnection subtypes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.t_connection_subtypesImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#gett_connection_subtypes()
   * @generated
   */
  int TCONNECTION_SUBTYPES = 41;

  /**
   * The feature id for the '<em><b>Tsubc st</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCONNECTION_SUBTYPES__TSUBC_ST = TINSTANCE_SUBTYPES__TSUBC_ST;

  /**
   * The feature id for the '<em><b>Tsbcall</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCONNECTION_SUBTYPES__TSBCALL = TINSTANCE_SUBTYPES__TSBCALL;

  /**
   * The feature id for the '<em><b>Tcallseq</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCONNECTION_SUBTYPES__TCALLSEQ = TINSTANCE_SUBTYPES__TCALLSEQ;

  /**
   * The feature id for the '<em><b>Teeflow</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCONNECTION_SUBTYPES__TEEFLOW = TINSTANCE_SUBTYPES__TEEFLOW;

  /**
   * The feature id for the '<em><b>Tproto</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCONNECTION_SUBTYPES__TPROTO = TINSTANCE_SUBTYPES__TPROTO;

  /**
   * The feature id for the '<em><b>Tmode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCONNECTION_SUBTYPES__TMODE = TINSTANCE_SUBTYPES__TMODE;

  /**
   * The feature id for the '<em><b>Tmod trans</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCONNECTION_SUBTYPES__TMOD_TRANS = TINSTANCE_SUBTYPES__TMOD_TRANS;

  /**
   * The feature id for the '<em><b>Tmode trig</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCONNECTION_SUBTYPES__TMODE_TRIG = TINSTANCE_SUBTYPES__TMODE_TRIG;

  /**
   * The feature id for the '<em><b>Tconn</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCONNECTION_SUBTYPES__TCONN = TINSTANCE_SUBTYPES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tfeat conn</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCONNECTION_SUBTYPES__TFEAT_CONN = TINSTANCE_SUBTYPES_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Tport conn</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCONNECTION_SUBTYPES__TPORT_CONN = TINSTANCE_SUBTYPES_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Tparm conn</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCONNECTION_SUBTYPES__TPARM_CONN = TINSTANCE_SUBTYPES_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Tacc con</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCONNECTION_SUBTYPES__TACC_CON = TINSTANCE_SUBTYPES_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Tfg conn</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCONNECTION_SUBTYPES__TFG_CONN = TINSTANCE_SUBTYPES_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>tconnection subtypes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCONNECTION_SUBTYPES_FEATURE_COUNT = TINSTANCE_SUBTYPES_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_feature_subtypesImpl <em>tfeature subtypes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.t_feature_subtypesImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#gett_feature_subtypes()
   * @generated
   */
  int TFEATURE_SUBTYPES = 42;

  /**
   * The feature id for the '<em><b>Tsubc st</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFEATURE_SUBTYPES__TSUBC_ST = TINSTANCE_SUBTYPES__TSUBC_ST;

  /**
   * The feature id for the '<em><b>Tsbcall</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFEATURE_SUBTYPES__TSBCALL = TINSTANCE_SUBTYPES__TSBCALL;

  /**
   * The feature id for the '<em><b>Tcallseq</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFEATURE_SUBTYPES__TCALLSEQ = TINSTANCE_SUBTYPES__TCALLSEQ;

  /**
   * The feature id for the '<em><b>Teeflow</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFEATURE_SUBTYPES__TEEFLOW = TINSTANCE_SUBTYPES__TEEFLOW;

  /**
   * The feature id for the '<em><b>Tproto</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFEATURE_SUBTYPES__TPROTO = TINSTANCE_SUBTYPES__TPROTO;

  /**
   * The feature id for the '<em><b>Tmode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFEATURE_SUBTYPES__TMODE = TINSTANCE_SUBTYPES__TMODE;

  /**
   * The feature id for the '<em><b>Tmod trans</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFEATURE_SUBTYPES__TMOD_TRANS = TINSTANCE_SUBTYPES__TMOD_TRANS;

  /**
   * The feature id for the '<em><b>Tmode trig</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFEATURE_SUBTYPES__TMODE_TRIG = TINSTANCE_SUBTYPES__TMODE_TRIG;

  /**
   * The feature id for the '<em><b>Tfeat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFEATURE_SUBTYPES__TFEAT = TINSTANCE_SUBTYPES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tabs feat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFEATURE_SUBTYPES__TABS_FEAT = TINSTANCE_SUBTYPES_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Tparm</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFEATURE_SUBTYPES__TPARM = TINSTANCE_SUBTYPES_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Tfg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFEATURE_SUBTYPES__TFG = TINSTANCE_SUBTYPES_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>tfeature subtypes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFEATURE_SUBTYPES_FEATURE_COUNT = TINSTANCE_SUBTYPES_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_access_subtypesImpl <em>taccess subtypes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.t_access_subtypesImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#gett_access_subtypes()
   * @generated
   */
  int TACCESS_SUBTYPES = 43;

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
  int TPORT_SUBTYPES = 44;

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
  int TFLOW_SPEC_SUBTYPES = 45;

  /**
   * The feature id for the '<em><b>Tsubc st</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFLOW_SPEC_SUBTYPES__TSUBC_ST = TINSTANCE_SUBTYPES__TSUBC_ST;

  /**
   * The feature id for the '<em><b>Tsbcall</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFLOW_SPEC_SUBTYPES__TSBCALL = TINSTANCE_SUBTYPES__TSBCALL;

  /**
   * The feature id for the '<em><b>Tcallseq</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFLOW_SPEC_SUBTYPES__TCALLSEQ = TINSTANCE_SUBTYPES__TCALLSEQ;

  /**
   * The feature id for the '<em><b>Teeflow</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFLOW_SPEC_SUBTYPES__TEEFLOW = TINSTANCE_SUBTYPES__TEEFLOW;

  /**
   * The feature id for the '<em><b>Tproto</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFLOW_SPEC_SUBTYPES__TPROTO = TINSTANCE_SUBTYPES__TPROTO;

  /**
   * The feature id for the '<em><b>Tmode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFLOW_SPEC_SUBTYPES__TMODE = TINSTANCE_SUBTYPES__TMODE;

  /**
   * The feature id for the '<em><b>Tmod trans</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFLOW_SPEC_SUBTYPES__TMOD_TRANS = TINSTANCE_SUBTYPES__TMOD_TRANS;

  /**
   * The feature id for the '<em><b>Tmode trig</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFLOW_SPEC_SUBTYPES__TMODE_TRIG = TINSTANCE_SUBTYPES__TMODE_TRIG;

  /**
   * The feature id for the '<em><b>Tfspec</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFLOW_SPEC_SUBTYPES__TFSPEC = TINSTANCE_SUBTYPES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tfspec source</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFLOW_SPEC_SUBTYPES__TFSPEC_SOURCE = TINSTANCE_SUBTYPES_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Tfspec sink</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFLOW_SPEC_SUBTYPES__TFSPEC_SINK = TINSTANCE_SUBTYPES_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Tfspec path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFLOW_SPEC_SUBTYPES__TFSPEC_PATH = TINSTANCE_SUBTYPES_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>tflow spec subtypes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFLOW_SPEC_SUBTYPES_FEATURE_COUNT = TINSTANCE_SUBTYPES_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_flow_impl_subtypesImpl <em>tflow impl subtypes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.t_flow_impl_subtypesImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#gett_flow_impl_subtypes()
   * @generated
   */
  int TFLOW_IMPL_SUBTYPES = 46;

  /**
   * The feature id for the '<em><b>Tsubc st</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFLOW_IMPL_SUBTYPES__TSUBC_ST = TINSTANCE_SUBTYPES__TSUBC_ST;

  /**
   * The feature id for the '<em><b>Tsbcall</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFLOW_IMPL_SUBTYPES__TSBCALL = TINSTANCE_SUBTYPES__TSBCALL;

  /**
   * The feature id for the '<em><b>Tcallseq</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFLOW_IMPL_SUBTYPES__TCALLSEQ = TINSTANCE_SUBTYPES__TCALLSEQ;

  /**
   * The feature id for the '<em><b>Teeflow</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFLOW_IMPL_SUBTYPES__TEEFLOW = TINSTANCE_SUBTYPES__TEEFLOW;

  /**
   * The feature id for the '<em><b>Tproto</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFLOW_IMPL_SUBTYPES__TPROTO = TINSTANCE_SUBTYPES__TPROTO;

  /**
   * The feature id for the '<em><b>Tmode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFLOW_IMPL_SUBTYPES__TMODE = TINSTANCE_SUBTYPES__TMODE;

  /**
   * The feature id for the '<em><b>Tmod trans</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFLOW_IMPL_SUBTYPES__TMOD_TRANS = TINSTANCE_SUBTYPES__TMOD_TRANS;

  /**
   * The feature id for the '<em><b>Tmode trig</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFLOW_IMPL_SUBTYPES__TMODE_TRIG = TINSTANCE_SUBTYPES__TMODE_TRIG;

  /**
   * The feature id for the '<em><b>Tfi</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFLOW_IMPL_SUBTYPES__TFI = TINSTANCE_SUBTYPES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tfisource</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFLOW_IMPL_SUBTYPES__TFISOURCE = TINSTANCE_SUBTYPES_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Tfisink</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFLOW_IMPL_SUBTYPES__TFISINK = TINSTANCE_SUBTYPES_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Tfipath</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFLOW_IMPL_SUBTYPES__TFIPATH = TINSTANCE_SUBTYPES_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>tflow impl subtypes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFLOW_IMPL_SUBTYPES_FEATURE_COUNT = TINSTANCE_SUBTYPES_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.IntegerRangeImpl <em>Integer Range</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.IntegerRangeImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getIntegerRange()
   * @generated
   */
  int INTEGER_RANGE = 47;

  /**
   * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_RANGE__LOWER_BOUND = 0;

  /**
   * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_RANGE__UPPER_BOUND = 1;

  /**
   * The number of structural features of the '<em>Integer Range</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_RANGE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.RealRangeImpl <em>Real Range</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.RealRangeImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getRealRange()
   * @generated
   */
  int REAL_RANGE = 48;

  /**
   * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_RANGE__LOWER_BOUND = 0;

  /**
   * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_RANGE__UPPER_BOUND = 1;

  /**
   * The number of structural features of the '<em>Real Range</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_RANGE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.UnnamedIntegerTypeImpl <em>Unnamed Integer Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.UnnamedIntegerTypeImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getUnnamedIntegerType()
   * @generated
   */
  int UNNAMED_INTEGER_TYPE = 49;

  /**
   * The feature id for the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNNAMED_INTEGER_TYPE__RANGE = 0;

  /**
   * The feature id for the '<em><b>Owned Units Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNNAMED_INTEGER_TYPE__OWNED_UNITS_TYPE = 1;

  /**
   * The feature id for the '<em><b>Referenced Units Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNNAMED_INTEGER_TYPE__REFERENCED_UNITS_TYPE = 2;

  /**
   * The number of structural features of the '<em>Unnamed Integer Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNNAMED_INTEGER_TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.UnnamedRealTypeImpl <em>Unnamed Real Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.UnnamedRealTypeImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getUnnamedRealType()
   * @generated
   */
  int UNNAMED_REAL_TYPE = 50;

  /**
   * The feature id for the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNNAMED_REAL_TYPE__RANGE = 0;

  /**
   * The feature id for the '<em><b>Owned Units Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNNAMED_REAL_TYPE__OWNED_UNITS_TYPE = 1;

  /**
   * The feature id for the '<em><b>Referenced Units Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNNAMED_REAL_TYPE__REFERENCED_UNITS_TYPE = 2;

  /**
   * The number of structural features of the '<em>Unnamed Real Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNNAMED_REAL_TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.UnnamedRangeTypeImpl <em>Unnamed Range Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.UnnamedRangeTypeImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getUnnamedRangeType()
   * @generated
   */
  int UNNAMED_RANGE_TYPE = 51;

  /**
   * The feature id for the '<em><b>Owned Number Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNNAMED_RANGE_TYPE__OWNED_NUMBER_TYPE = 0;

  /**
   * The feature id for the '<em><b>Referenced Number Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNNAMED_RANGE_TYPE__REFERENCED_NUMBER_TYPE = 1;

  /**
   * The number of structural features of the '<em>Unnamed Range Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNNAMED_RANGE_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.ClaimStringImpl <em>Claim String</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.ClaimStringImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getClaimString()
   * @generated
   */
  int CLAIM_STRING = 52;

  /**
   * The feature id for the '<em><b>Str</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAIM_STRING__STR = TEXT_PARM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Claim String</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAIM_STRING_FEATURE_COUNT = TEXT_PARM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.ClaimArgImpl <em>Claim Arg</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.ClaimArgImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getClaimArg()
   * @generated
   */
  int CLAIM_ARG = 53;

  /**
   * The feature id for the '<em><b>Textarg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAIM_ARG__TEXTARG = TEXT_PARM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Unit</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAIM_ARG__UNIT = TEXT_PARM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Claim Arg</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAIM_ARG_FEATURE_COUNT = TEXT_PARM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.BinaryExprImpl <em>Binary Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.BinaryExprImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getBinaryExpr()
   * @generated
   */
  int BINARY_EXPR = 54;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPR__LEFT = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPR__OP = EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPR__RIGHT = EXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Binary Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.InstanceOfExprImpl <em>Instance Of Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.InstanceOfExprImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getInstanceOfExpr()
   * @generated
   */
  int INSTANCE_OF_EXPR = 55;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_OF_EXPR__EXPR = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_OF_EXPR__TYPE = EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Instance Of Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_OF_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.UnaryExprImpl <em>Unary Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.UnaryExprImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getUnaryExpr()
   * @generated
   */
  int UNARY_EXPR = 56;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPR__OP = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPR__EXPR = EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Unary Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.PkgExprImpl <em>Pkg Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.PkgExprImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getPkgExpr()
   * @generated
   */
  int PKG_EXPR = 57;

  /**
   * The feature id for the '<em><b>Package</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PKG_EXPR__PACKAGE = EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Pkg Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PKG_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.CompExprImpl <em>Comp Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.CompExprImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getCompExpr()
   * @generated
   */
  int COMP_EXPR = 58;

  /**
   * The feature id for the '<em><b>Classifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMP_EXPR__CLASSIFIER = EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Comp Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMP_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.RefExprImpl <em>Ref Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.RefExprImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getRefExpr()
   * @generated
   */
  int REF_EXPR = 59;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_EXPR__REFERENCE = EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Ref Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.ThisExprImpl <em>This Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.ThisExprImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getThisExpr()
   * @generated
   */
  int THIS_EXPR = 60;

  /**
   * The feature id for the '<em><b>Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THIS_EXPR__SUB = EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>This Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THIS_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.IntExprImpl <em>Int Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.IntExprImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getIntExpr()
   * @generated
   */
  int INT_EXPR = 61;

  /**
   * The feature id for the '<em><b>Val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_EXPR__VAL = EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Int Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.RealExprImpl <em>Real Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.RealExprImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getRealExpr()
   * @generated
   */
  int REAL_EXPR = 62;

  /**
   * The feature id for the '<em><b>Val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_EXPR__VAL = EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Real Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.BoolExprImpl <em>Bool Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.BoolExprImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getBoolExpr()
   * @generated
   */
  int BOOL_EXPR = 63;

  /**
   * The feature id for the '<em><b>Val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_EXPR__VAL = EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Bool Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.StringExprImpl <em>String Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.StringExprImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getStringExpr()
   * @generated
   */
  int STRING_EXPR = 64;

  /**
   * The feature id for the '<em><b>Val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_EXPR__VAL = EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.IfThenElseExprImpl <em>If Then Else Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.IfThenElseExprImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getIfThenElseExpr()
   * @generated
   */
  int IF_THEN_ELSE_EXPR = 65;

  /**
   * The feature id for the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE_EXPR__COND = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE_EXPR__THEN = EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE_EXPR__ELSE = EXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>If Then Else Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.QuantifiedExprImpl <em>Quantified Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.QuantifiedExprImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getQuantifiedExpr()
   * @generated
   */
  int QUANTIFIED_EXPR = 66;

  /**
   * The feature id for the '<em><b>Quant</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIED_EXPR__QUANT = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIED_EXPR__ARGS = EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIED_EXPR__EXPR = EXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Quantified Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIED_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.BuiltInFnCallExprImpl <em>Built In Fn Call Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.BuiltInFnCallExprImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getBuiltInFnCallExpr()
   * @generated
   */
  int BUILT_IN_FN_CALL_EXPR = 67;

  /**
   * The feature id for the '<em><b>Builtin</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILT_IN_FN_CALL_EXPR__BUILTIN = EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Built In Fn Call Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILT_IN_FN_CALL_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.FnCallExprImpl <em>Fn Call Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.FnCallExprImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getFnCallExpr()
   * @generated
   */
  int FN_CALL_EXPR = 68;

  /**
   * The feature id for the '<em><b>Fn</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FN_CALL_EXPR__FN = EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Fn Call Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FN_CALL_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.TheoremCallExprImpl <em>Theorem Call Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.TheoremCallExprImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getTheoremCallExpr()
   * @generated
   */
  int THEOREM_CALL_EXPR = 69;

  /**
   * The feature id for the '<em><b>Fn</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEOREM_CALL_EXPR__FN = EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Theorem Call Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEOREM_CALL_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.FilterSetImpl <em>Filter Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.FilterSetImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getFilterSet()
   * @generated
   */
  int FILTER_SET = 70;

  /**
   * The feature id for the '<em><b>List</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_SET__LIST = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_SET__EXP = EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Filter Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_SET_FEATURE_COUNT = EXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.FilterMapExprImpl <em>Filter Map Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.FilterMapExprImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getFilterMapExpr()
   * @generated
   */
  int FILTER_MAP_EXPR = 71;

  /**
   * The feature id for the '<em><b>Map</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_MAP_EXPR__MAP = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_MAP_EXPR__ARGS = EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_MAP_EXPR__FILTER = EXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Filter Map Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_MAP_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.SetExprImpl <em>Set Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.SetExprImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getSetExpr()
   * @generated
   */
  int SET_EXPR = 72;

  /**
   * The feature id for the '<em><b>Exprs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_EXPR__EXPRS = EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Set Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.MappingExprImpl <em>Mapping Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.MappingExprImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getMappingExpr()
   * @generated
   */
  int MAPPING_EXPR = 73;

  /**
   * The feature id for the '<em><b>Expr1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_EXPR__EXPR1 = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expr2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_EXPR__EXPR2 = EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Mapping Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.EmptySetExprImpl <em>Empty Set Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.EmptySetExprImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getEmptySetExpr()
   * @generated
   */
  int EMPTY_SET_EXPR = 74;

  /**
   * The number of structural features of the '<em>Empty Set Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPTY_SET_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.LetExprImpl <em>Let Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.LetExprImpl
   * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getLetExpr()
   * @generated
   */
  int LET_EXPR = 75;

  /**
   * The feature id for the '<em><b>Local</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET_EXPR__LOCAL = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expr1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET_EXPR__EXPR1 = EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Expr2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET_EXPR__EXPR2 = EXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Let Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 3;


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
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.MCSGrammarRoot#getFile <em>File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>File</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.MCSGrammarRoot#getFile()
   * @see #getMCSGrammarRoot()
   * @generated
   */
  EReference getMCSGrammarRoot_File();

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
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.MCSFile <em>MCS File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MCS File</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.MCSFile
   * @generated
   */
  EClass getMCSFile();

  /**
   * Returns the meta object for the reference list '{@link org.osate.xtext.aadl2.mcs.mcs.MCSFile#getImportedUnit <em>Imported Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Imported Unit</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.MCSFile#getImportedUnit()
   * @see #getMCSFile()
   * @generated
   */
  EReference getMCSFile_ImportedUnit();

  /**
   * Returns the meta object for the attribute list '{@link org.osate.xtext.aadl2.mcs.mcs.MCSFile#getFiles <em>Files</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Files</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.MCSFile#getFiles()
   * @see #getMCSFile()
   * @generated
   */
  EAttribute getMCSFile_Files();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.mcs.mcs.MCSFile#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.MCSFile#getTypes()
   * @see #getMCSFile()
   * @generated
   */
  EReference getMCSFile_Types();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.mcs.mcs.MCSFile#getConstants <em>Constants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constants</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.MCSFile#getConstants()
   * @see #getMCSFile()
   * @generated
   */
  EReference getMCSFile_Constants();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.mcs.mcs.MCSFile#getFunctions <em>Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Functions</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.MCSFile#getFunctions()
   * @see #getMCSFile()
   * @generated
   */
  EReference getMCSFile_Functions();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.mcs.mcs.MCSFile#getTheorems <em>Theorems</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Theorems</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.MCSFile#getTheorems()
   * @see #getMCSFile()
   * @generated
   */
  EReference getMCSFile_Theorems();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.mcs.mcs.MCSFile#getCalls <em>Calls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Calls</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.MCSFile#getCalls()
   * @see #getMCSFile()
   * @generated
   */
  EReference getMCSFile_Calls();

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
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.mcs.mcs.MCSAnnexSubclause#getCalls <em>Calls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Calls</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.MCSAnnexSubclause#getCalls()
   * @see #getMCSAnnexSubclause()
   * @generated
   */
  EReference getMCSAnnexSubclause_Calls();

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
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.Constant_declaration#getConst <em>Const</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Const</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Constant_declaration#getConst()
   * @see #getConstant_declaration()
   * @generated
   */
  EReference getConstant_declaration_Const();

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
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Function
   * @generated
   */
  EClass getFunction();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.Function#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Function#getName()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.mcs.mcs.Function#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Function#getArgs()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Args();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.Function#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Function#getBody()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Body();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.Theorem <em>Theorem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Theorem</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Theorem
   * @generated
   */
  EClass getTheorem();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.Theorem#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Theorem#getName()
   * @see #getTheorem()
   * @generated
   */
  EAttribute getTheorem_Name();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.Theorem#isT_root <em>Troot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Troot</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Theorem#isT_root()
   * @see #getTheorem()
   * @generated
   */
  EAttribute getTheorem_T_root();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.mcs.mcs.Theorem#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Theorem#getArgs()
   * @see #getTheorem()
   * @generated
   */
  EReference getTheorem_Args();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.Theorem#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Theorem#getBody()
   * @see #getTheorem()
   * @generated
   */
  EReference getTheorem_Body();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.Theorem_root <em>Theorem root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Theorem root</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Theorem_root
   * @generated
   */
  EClass getTheorem_root();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.Theorem_root#isNilroot <em>Nilroot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nilroot</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Theorem_root#isNilroot()
   * @see #getTheorem_root()
   * @generated
   */
  EAttribute getTheorem_root_Nilroot();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.Theorem_root#getClassifier <em>Classifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Classifier</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Theorem_root#getClassifier()
   * @see #getTheorem_root()
   * @generated
   */
  EReference getTheorem_root_Classifier();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.FunctionBody <em>Function Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Body</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.FunctionBody
   * @generated
   */
  EClass getFunctionBody();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.FunctionBody#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.FunctionBody#getType()
   * @see #getFunctionBody()
   * @generated
   */
  EReference getFunctionBody_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.FunctionBody#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.FunctionBody#getExpr()
   * @see #getFunctionBody()
   * @generated
   */
  EReference getFunctionBody_Expr();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.TheoremBody <em>Theorem Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Theorem Body</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.TheoremBody
   * @generated
   */
  EClass getTheoremBody();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.mcs.mcs.TheoremBody#getString <em>String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>String</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.TheoremBody#getString()
   * @see #getTheoremBody()
   * @generated
   */
  EReference getTheoremBody_String();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.TheoremBody#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.TheoremBody#getExpr()
   * @see #getTheoremBody()
   * @generated
   */
  EReference getTheoremBody_Expr();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.ParameterizedString <em>Parameterized String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameterized String</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.ParameterizedString
   * @generated
   */
  EClass getParameterizedString();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.mcs.mcs.ParameterizedString#getClaim <em>Claim</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Claim</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.ParameterizedString#getClaim()
   * @see #getParameterizedString()
   * @generated
   */
  EReference getParameterizedString_Claim();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.TextParm <em>Text Parm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Parm</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.TextParm
   * @generated
   */
  EClass getTextParm();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.McsTypedName <em>Typed Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Typed Name</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.McsTypedName
   * @generated
   */
  EClass getMcsTypedName();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.McsTypedName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.McsTypedName#getName()
   * @see #getMcsTypedName()
   * @generated
   */
  EAttribute getMcsTypedName_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.McsTypedName#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.McsTypedName#getType()
   * @see #getMcsTypedName()
   * @generated
   */
  EReference getMcsTypedName_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.McsTypedName#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.McsTypedName#getExpr()
   * @see #getMcsTypedName()
   * @generated
   */
  EReference getMcsTypedName_Expr();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.TheoremCall <em>Theorem Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Theorem Call</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.TheoremCall
   * @generated
   */
  EClass getTheoremCall();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.mcs.mcs.TheoremCall#getTname <em>Tname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Tname</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.TheoremCall#getTname()
   * @see #getTheoremCall()
   * @generated
   */
  EReference getTheoremCall_Tname();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.TheoremCall#getCroot <em>Croot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Croot</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.TheoremCall#getCroot()
   * @see #getTheoremCall()
   * @generated
   */
  EReference getTheoremCall_Croot();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.mcs.mcs.TheoremCall#getActarg <em>Actarg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actarg</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.TheoremCall#getActarg()
   * @see #getTheoremCall()
   * @generated
   */
  EReference getTheoremCall_Actarg();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.Classifier_literal <em>Classifier literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Classifier literal</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Classifier_literal
   * @generated
   */
  EClass getClassifier_literal();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.mcs.mcs.Classifier_literal#getClasslit <em>Classlit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Classlit</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Classifier_literal#getClasslit()
   * @see #getClassifier_literal()
   * @generated
   */
  EReference getClassifier_literal_Classlit();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.Classifier_literal#getNameref <em>Nameref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nameref</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Classifier_literal#getNameref()
   * @see #getClassifier_literal()
   * @generated
   */
  EReference getClassifier_literal_Nameref();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.Range <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Range</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Range
   * @generated
   */
  EClass getRange();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.Range#getLowerBound <em>Lower Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lower Bound</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Range#getLowerBound()
   * @see #getRange()
   * @generated
   */
  EReference getRange_LowerBound();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.Range#getUpperBound <em>Upper Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Upper Bound</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Range#getUpperBound()
   * @see #getRange()
   * @generated
   */
  EReference getRange_UpperBound();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.Range#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Val</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Range#getVal()
   * @see #getRange()
   * @generated
   */
  EReference getRange_Val();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.RefTerm <em>Ref Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ref Term</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.RefTerm
   * @generated
   */
  EClass getRefTerm();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.RefTerm#isRoot <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Root</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.RefTerm#isRoot()
   * @see #getRefTerm()
   * @generated
   */
  EAttribute getRefTerm_Root();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.RefTerm#getSub <em>Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sub</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.RefTerm#getSub()
   * @see #getRefTerm()
   * @generated
   */
  EReference getRefTerm_Sub();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.NestedDotID <em>Nested Dot ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nested Dot ID</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.NestedDotID
   * @generated
   */
  EClass getNestedDotID();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.mcs.mcs.NestedDotID#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Base</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.NestedDotID#getBase()
   * @see #getNestedDotID()
   * @generated
   */
  EReference getNestedDotID_Base();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.NestedDotID#getSub <em>Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sub</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.NestedDotID#getSub()
   * @see #getNestedDotID()
   * @generated
   */
  EReference getNestedDotID_Sub();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.Mcs_name_ref <em>Mcs name ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mcs name ref</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Mcs_name_ref
   * @generated
   */
  EClass getMcs_name_ref();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.mcs.mcs.Mcs_name_ref#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Mcs_name_ref#getRef()
   * @see #getMcs_name_ref()
   * @generated
   */
  EReference getMcs_name_ref_Ref();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.Mcs_name_ref#getChain <em>Chain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Chain</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Mcs_name_ref#getChain()
   * @see #getMcs_name_ref()
   * @generated
   */
  EReference getMcs_name_ref_Chain();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.MethodChain <em>Method Chain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method Chain</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.MethodChain
   * @generated
   */
  EClass getMethodChain();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.mcs.mcs.MethodChain#getBuiltin <em>Builtin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Builtin</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.MethodChain#getBuiltin()
   * @see #getMethodChain()
   * @generated
   */
  EReference getMethodChain_Builtin();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.mcs.mcs.MethodChain#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Method</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.MethodChain#getMethod()
   * @see #getMethodChain()
   * @generated
   */
  EReference getMethodChain_Method();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.BuiltInFnCall <em>Built In Fn Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Built In Fn Call</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.BuiltInFnCall
   * @generated
   */
  EClass getBuiltInFnCall();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.BuiltInFnCall#getFn <em>Fn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fn</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.BuiltInFnCall#getFn()
   * @see #getBuiltInFnCall()
   * @generated
   */
  EAttribute getBuiltInFnCall_Fn();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.mcs.mcs.BuiltInFnCall#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.BuiltInFnCall#getArgs()
   * @see #getBuiltInFnCall()
   * @generated
   */
  EReference getBuiltInFnCall_Args();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.BuiltInFnCall#getNewtype <em>Newtype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Newtype</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.BuiltInFnCall#getNewtype()
   * @see #getBuiltInFnCall()
   * @generated
   */
  EReference getBuiltInFnCall_Newtype();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.FnCall <em>Fn Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fn Call</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.FnCall
   * @generated
   */
  EClass getFnCall();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.mcs.mcs.FnCall#getFn <em>Fn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Fn</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.FnCall#getFn()
   * @see #getFnCall()
   * @generated
   */
  EReference getFnCall_Fn();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.mcs.mcs.FnCall#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.FnCall#getArgs()
   * @see #getFnCall()
   * @generated
   */
  EReference getFnCall_Args();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.FnCall#getNewtype <em>Newtype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Newtype</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.FnCall#getNewtype()
   * @see #getFnCall()
   * @generated
   */
  EReference getFnCall_Newtype();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.Expr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Expr
   * @generated
   */
  EClass getExpr();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.PostCastExpr <em>Post Cast Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Post Cast Expr</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.PostCastExpr
   * @generated
   */
  EClass getPostCastExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.PostCastExpr#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.PostCastExpr#getExpr()
   * @see #getPostCastExpr()
   * @generated
   */
  EReference getPostCastExpr_Expr();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.PostCastExpr#getNewtype <em>Newtype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Newtype</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.PostCastExpr#getNewtype()
   * @see #getPostCastExpr()
   * @generated
   */
  EReference getPostCastExpr_Newtype();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.PostCastExpr#getChain <em>Chain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Chain</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.PostCastExpr#getChain()
   * @see #getPostCastExpr()
   * @generated
   */
  EReference getPostCastExpr_Chain();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.MCSNameExpr <em>MCS Name Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MCS Name Expr</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.MCSNameExpr
   * @generated
   */
  EClass getMCSNameExpr();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.MCSNameExpr#isRoot <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Root</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.MCSNameExpr#isRoot()
   * @see #getMCSNameExpr()
   * @generated
   */
  EAttribute getMCSNameExpr_Root();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.MCSNameExpr#isIroot <em>Iroot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Iroot</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.MCSNameExpr#isIroot()
   * @see #getMCSNameExpr()
   * @generated
   */
  EAttribute getMCSNameExpr_Iroot();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.MCSNameExpr#isNil <em>Nil</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nil</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.MCSNameExpr#isNil()
   * @see #getMCSNameExpr()
   * @generated
   */
  EAttribute getMCSNameExpr_Nil();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.MCSNameExpr#isEmpty <em>Empty</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Empty</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.MCSNameExpr#isEmpty()
   * @see #getMCSNameExpr()
   * @generated
   */
  EAttribute getMCSNameExpr_Empty();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.MCSNameExpr#isAllmodes <em>Allmodes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Allmodes</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.MCSNameExpr#isAllmodes()
   * @see #getMCSNameExpr()
   * @generated
   */
  EAttribute getMCSNameExpr_Allmodes();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.MCSNameExpr#getTypednameref <em>Typednameref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Typednameref</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.MCSNameExpr#getTypednameref()
   * @see #getMCSNameExpr()
   * @generated
   */
  EReference getMCSNameExpr_Typednameref();

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
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.Basic_type#getPtype <em>Ptype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ptype</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Basic_type#getPtype()
   * @see #getBasic_type()
   * @generated
   */
  EAttribute getBasic_type_Ptype();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.Basic_type#getPref <em>Pref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pref</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Basic_type#getPref()
   * @see #getBasic_type()
   * @generated
   */
  EAttribute getBasic_type_Pref();

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
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.Composite_type <em>Composite type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Composite type</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Composite_type
   * @generated
   */
  EClass getComposite_type();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.Mapping_type <em>Mapping type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapping type</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Mapping_type
   * @generated
   */
  EClass getMapping_type();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.Mapping_type#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Key</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Mapping_type#getKey()
   * @see #getMapping_type()
   * @generated
   */
  EReference getMapping_type_Key();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.Mapping_type#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Val</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Mapping_type#getVal()
   * @see #getMapping_type()
   * @generated
   */
  EReference getMapping_type_Val();

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
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.Set_type#getRoot_type <em>Root type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Root type</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Set_type#getRoot_type()
   * @see #getSet_type()
   * @generated
   */
  EReference getSet_type_Root_type();

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
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.List_type#getRoot_type <em>Root type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Root type</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.List_type#getRoot_type()
   * @see #getList_type()
   * @generated
   */
  EReference getList_type_Root_type();

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
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.mcs.mcs.Union_type#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Union_type#getTypes()
   * @see #getUnion_type()
   * @generated
   */
  EReference getUnion_type_Types();

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
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.Element_type#isTpack <em>Tpack</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tpack</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Element_type#isTpack()
   * @see #getElement_type()
   * @generated
   */
  EAttribute getElement_type_Tpack();

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
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.Element_type#isT_inst <em>Tinst</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tinst</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Element_type#isT_inst()
   * @see #getElement_type()
   * @generated
   */
  EAttribute getElement_type_T_inst();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.Classifiers <em>Classifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Classifiers</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Classifiers
   * @generated
   */
  EClass getClassifiers();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.Classifiers#isT_class <em>Tclass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tclass</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Classifiers#isT_class()
   * @see #getClassifiers()
   * @generated
   */
  EAttribute getClassifiers_T_class();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.Classifiers#isT_class_subtype <em>Tclass subtype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tclass subtype</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Classifiers#isT_class_subtype()
   * @see #getClassifiers()
   * @generated
   */
  EAttribute getClassifiers_T_class_subtype();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.T_classifier_subtypes <em>Tclassifier subtypes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tclassifier subtypes</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.T_classifier_subtypes
   * @generated
   */
  EClass getT_classifier_subtypes();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.T_classifier_subtypes#isT_ctype <em>Tctype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tctype</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.T_classifier_subtypes#isT_ctype()
   * @see #getT_classifier_subtypes()
   * @generated
   */
  EAttribute getT_classifier_subtypes_T_ctype();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.T_classifier_subtypes#isT_cimpl <em>Tcimpl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tcimpl</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.T_classifier_subtypes#isT_cimpl()
   * @see #getT_classifier_subtypes()
   * @generated
   */
  EAttribute getT_classifier_subtypes_T_cimpl();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.T_classifier_subtypes#isT_fgclass <em>Tfgclass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tfgclass</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.T_classifier_subtypes#isT_fgclass()
   * @see #getT_classifier_subtypes()
   * @generated
   */
  EAttribute getT_classifier_subtypes_T_fgclass();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.T_classifier_subtypes#isT_annexclass <em>Tannexclass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tannexclass</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.T_classifier_subtypes#isT_annexclass()
   * @see #getT_classifier_subtypes()
   * @generated
   */
  EAttribute getT_classifier_subtypes_T_annexclass();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.Instances <em>Instances</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instances</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Instances
   * @generated
   */
  EClass getInstances();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.Instances#isInst <em>Inst</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Inst</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Instances#isInst()
   * @see #getInstances()
   * @generated
   */
  EAttribute getInstances_Inst();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.Instances#isT_inst_st <em>Tinst st</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tinst st</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.Instances#isT_inst_st()
   * @see #getInstances()
   * @generated
   */
  EAttribute getInstances_T_inst_st();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.t_instance_subtypes <em>tinstance subtypes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>tinstance subtypes</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_instance_subtypes
   * @generated
   */
  EClass gett_instance_subtypes();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_instance_subtypes#isT_subc_st <em>Tsubc st</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tsubc st</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_instance_subtypes#isT_subc_st()
   * @see #gett_instance_subtypes()
   * @generated
   */
  EAttribute gett_instance_subtypes_T_subc_st();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_instance_subtypes#isT_sbcall <em>Tsbcall</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tsbcall</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_instance_subtypes#isT_sbcall()
   * @see #gett_instance_subtypes()
   * @generated
   */
  EAttribute gett_instance_subtypes_T_sbcall();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_instance_subtypes#isT_callseq <em>Tcallseq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tcallseq</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_instance_subtypes#isT_callseq()
   * @see #gett_instance_subtypes()
   * @generated
   */
  EAttribute gett_instance_subtypes_T_callseq();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_instance_subtypes#isT_eeflow <em>Teeflow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Teeflow</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_instance_subtypes#isT_eeflow()
   * @see #gett_instance_subtypes()
   * @generated
   */
  EAttribute gett_instance_subtypes_T_eeflow();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_instance_subtypes#isT_proto <em>Tproto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tproto</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_instance_subtypes#isT_proto()
   * @see #gett_instance_subtypes()
   * @generated
   */
  EAttribute gett_instance_subtypes_T_proto();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_instance_subtypes#isT_mode <em>Tmode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tmode</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_instance_subtypes#isT_mode()
   * @see #gett_instance_subtypes()
   * @generated
   */
  EAttribute gett_instance_subtypes_T_mode();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_instance_subtypes#isT_mod_trans <em>Tmod trans</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tmod trans</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_instance_subtypes#isT_mod_trans()
   * @see #gett_instance_subtypes()
   * @generated
   */
  EAttribute gett_instance_subtypes_T_mod_trans();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_instance_subtypes#isT_mode_trig <em>Tmode trig</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tmode trig</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_instance_subtypes#isT_mode_trig()
   * @see #gett_instance_subtypes()
   * @generated
   */
  EAttribute gett_instance_subtypes_T_mode_trig();

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
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.t_component_subtypes <em>tcomponent subtypes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>tcomponent subtypes</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_component_subtypes
   * @generated
   */
  EClass gett_component_subtypes();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_component_subtypes#isT_annex_sub <em>Tannex sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tannex sub</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_component_subtypes#isT_annex_sub()
   * @see #gett_component_subtypes()
   * @generated
   */
  EAttribute gett_component_subtypes_T_annex_sub();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_component_subtypes#isT_abstract <em>Tabstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tabstract</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_component_subtypes#isT_abstract()
   * @see #gett_component_subtypes()
   * @generated
   */
  EAttribute gett_component_subtypes_T_abstract();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_component_subtypes#isT_sys <em>Tsys</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tsys</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_component_subtypes#isT_sys()
   * @see #gett_component_subtypes()
   * @generated
   */
  EAttribute gett_component_subtypes_T_sys();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_component_subtypes#isT_dev <em>Tdev</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tdev</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_component_subtypes#isT_dev()
   * @see #gett_component_subtypes()
   * @generated
   */
  EAttribute gett_component_subtypes_T_dev();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_component_subtypes#isT_proc <em>Tproc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tproc</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_component_subtypes#isT_proc()
   * @see #gett_component_subtypes()
   * @generated
   */
  EAttribute gett_component_subtypes_T_proc();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_component_subtypes#isT_virt_proc <em>Tvirt proc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tvirt proc</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_component_subtypes#isT_virt_proc()
   * @see #gett_component_subtypes()
   * @generated
   */
  EAttribute gett_component_subtypes_T_virt_proc();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_component_subtypes#isT_bus <em>Tbus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tbus</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_component_subtypes#isT_bus()
   * @see #gett_component_subtypes()
   * @generated
   */
  EAttribute gett_component_subtypes_T_bus();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_component_subtypes#isT_vbus <em>Tvbus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tvbus</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_component_subtypes#isT_vbus()
   * @see #gett_component_subtypes()
   * @generated
   */
  EAttribute gett_component_subtypes_T_vbus();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_component_subtypes#isT_mem <em>Tmem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tmem</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_component_subtypes#isT_mem()
   * @see #gett_component_subtypes()
   * @generated
   */
  EAttribute gett_component_subtypes_T_mem();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_component_subtypes#isT_tg <em>Ttg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ttg</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_component_subtypes#isT_tg()
   * @see #gett_component_subtypes()
   * @generated
   */
  EAttribute gett_component_subtypes_T_tg();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_component_subtypes#isT_t <em>Tt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tt</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_component_subtypes#isT_t()
   * @see #gett_component_subtypes()
   * @generated
   */
  EAttribute gett_component_subtypes_T_t();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_component_subtypes#isT_d <em>Td</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Td</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_component_subtypes#isT_d()
   * @see #gett_component_subtypes()
   * @generated
   */
  EAttribute gett_component_subtypes_T_d();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_component_subtypes#isT_subprog <em>Tsubprog</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tsubprog</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_component_subtypes#isT_subprog()
   * @see #gett_component_subtypes()
   * @generated
   */
  EAttribute gett_component_subtypes_T_subprog();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.t_component_subtypes#isT_subprog_g <em>Tsubprog g</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tsubprog g</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_component_subtypes#isT_subprog_g()
   * @see #gett_component_subtypes()
   * @generated
   */
  EAttribute gett_component_subtypes_T_subprog_g();

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
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.IntegerRange <em>Integer Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Range</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.IntegerRange
   * @generated
   */
  EClass getIntegerRange();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.IntegerRange#getLowerBound <em>Lower Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lower Bound</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.IntegerRange#getLowerBound()
   * @see #getIntegerRange()
   * @generated
   */
  EReference getIntegerRange_LowerBound();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.IntegerRange#getUpperBound <em>Upper Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Upper Bound</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.IntegerRange#getUpperBound()
   * @see #getIntegerRange()
   * @generated
   */
  EReference getIntegerRange_UpperBound();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.RealRange <em>Real Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Real Range</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.RealRange
   * @generated
   */
  EClass getRealRange();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.RealRange#getLowerBound <em>Lower Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lower Bound</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.RealRange#getLowerBound()
   * @see #getRealRange()
   * @generated
   */
  EReference getRealRange_LowerBound();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.RealRange#getUpperBound <em>Upper Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Upper Bound</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.RealRange#getUpperBound()
   * @see #getRealRange()
   * @generated
   */
  EReference getRealRange_UpperBound();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.UnnamedIntegerType <em>Unnamed Integer Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unnamed Integer Type</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.UnnamedIntegerType
   * @generated
   */
  EClass getUnnamedIntegerType();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.UnnamedIntegerType#getRange <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Range</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.UnnamedIntegerType#getRange()
   * @see #getUnnamedIntegerType()
   * @generated
   */
  EReference getUnnamedIntegerType_Range();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.UnnamedIntegerType#getOwnedUnitsType <em>Owned Units Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Owned Units Type</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.UnnamedIntegerType#getOwnedUnitsType()
   * @see #getUnnamedIntegerType()
   * @generated
   */
  EReference getUnnamedIntegerType_OwnedUnitsType();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.mcs.mcs.UnnamedIntegerType#getReferencedUnitsType <em>Referenced Units Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Referenced Units Type</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.UnnamedIntegerType#getReferencedUnitsType()
   * @see #getUnnamedIntegerType()
   * @generated
   */
  EReference getUnnamedIntegerType_ReferencedUnitsType();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.UnnamedRealType <em>Unnamed Real Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unnamed Real Type</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.UnnamedRealType
   * @generated
   */
  EClass getUnnamedRealType();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.UnnamedRealType#getRange <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Range</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.UnnamedRealType#getRange()
   * @see #getUnnamedRealType()
   * @generated
   */
  EReference getUnnamedRealType_Range();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.UnnamedRealType#getOwnedUnitsType <em>Owned Units Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Owned Units Type</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.UnnamedRealType#getOwnedUnitsType()
   * @see #getUnnamedRealType()
   * @generated
   */
  EReference getUnnamedRealType_OwnedUnitsType();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.mcs.mcs.UnnamedRealType#getReferencedUnitsType <em>Referenced Units Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Referenced Units Type</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.UnnamedRealType#getReferencedUnitsType()
   * @see #getUnnamedRealType()
   * @generated
   */
  EReference getUnnamedRealType_ReferencedUnitsType();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.UnnamedRangeType <em>Unnamed Range Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unnamed Range Type</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.UnnamedRangeType
   * @generated
   */
  EClass getUnnamedRangeType();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.UnnamedRangeType#getOwnedNumberType <em>Owned Number Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Owned Number Type</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.UnnamedRangeType#getOwnedNumberType()
   * @see #getUnnamedRangeType()
   * @generated
   */
  EReference getUnnamedRangeType_OwnedNumberType();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.mcs.mcs.UnnamedRangeType#getReferencedNumberType <em>Referenced Number Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Referenced Number Type</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.UnnamedRangeType#getReferencedNumberType()
   * @see #getUnnamedRangeType()
   * @generated
   */
  EReference getUnnamedRangeType_ReferencedNumberType();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.ClaimString <em>Claim String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Claim String</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.ClaimString
   * @generated
   */
  EClass getClaimString();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.ClaimString#getStr <em>Str</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Str</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.ClaimString#getStr()
   * @see #getClaimString()
   * @generated
   */
  EReference getClaimString_Str();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.ClaimArg <em>Claim Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Claim Arg</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.ClaimArg
   * @generated
   */
  EClass getClaimArg();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.ClaimArg#getTextarg <em>Textarg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Textarg</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.ClaimArg#getTextarg()
   * @see #getClaimArg()
   * @generated
   */
  EReference getClaimArg_Textarg();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.mcs.mcs.ClaimArg#getUnit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Unit</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.ClaimArg#getUnit()
   * @see #getClaimArg()
   * @generated
   */
  EReference getClaimArg_Unit();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.BinaryExpr <em>Binary Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binary Expr</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.BinaryExpr
   * @generated
   */
  EClass getBinaryExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.BinaryExpr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.BinaryExpr#getLeft()
   * @see #getBinaryExpr()
   * @generated
   */
  EReference getBinaryExpr_Left();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.BinaryExpr#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.BinaryExpr#getOp()
   * @see #getBinaryExpr()
   * @generated
   */
  EAttribute getBinaryExpr_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.BinaryExpr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.BinaryExpr#getRight()
   * @see #getBinaryExpr()
   * @generated
   */
  EReference getBinaryExpr_Right();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.InstanceOfExpr <em>Instance Of Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instance Of Expr</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.InstanceOfExpr
   * @generated
   */
  EClass getInstanceOfExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.InstanceOfExpr#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.InstanceOfExpr#getExpr()
   * @see #getInstanceOfExpr()
   * @generated
   */
  EReference getInstanceOfExpr_Expr();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.InstanceOfExpr#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.InstanceOfExpr#getType()
   * @see #getInstanceOfExpr()
   * @generated
   */
  EReference getInstanceOfExpr_Type();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.UnaryExpr <em>Unary Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary Expr</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.UnaryExpr
   * @generated
   */
  EClass getUnaryExpr();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.UnaryExpr#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.UnaryExpr#getOp()
   * @see #getUnaryExpr()
   * @generated
   */
  EAttribute getUnaryExpr_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.UnaryExpr#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.UnaryExpr#getExpr()
   * @see #getUnaryExpr()
   * @generated
   */
  EReference getUnaryExpr_Expr();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.PkgExpr <em>Pkg Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pkg Expr</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.PkgExpr
   * @generated
   */
  EClass getPkgExpr();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.mcs.mcs.PkgExpr#getPackage <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Package</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.PkgExpr#getPackage()
   * @see #getPkgExpr()
   * @generated
   */
  EReference getPkgExpr_Package();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.CompExpr <em>Comp Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comp Expr</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.CompExpr
   * @generated
   */
  EClass getCompExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.CompExpr#getClassifier <em>Classifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Classifier</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.CompExpr#getClassifier()
   * @see #getCompExpr()
   * @generated
   */
  EReference getCompExpr_Classifier();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.RefExpr <em>Ref Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ref Expr</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.RefExpr
   * @generated
   */
  EClass getRefExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.RefExpr#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Reference</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.RefExpr#getReference()
   * @see #getRefExpr()
   * @generated
   */
  EReference getRefExpr_Reference();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.ThisExpr <em>This Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>This Expr</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.ThisExpr
   * @generated
   */
  EClass getThisExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.ThisExpr#getSub <em>Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sub</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.ThisExpr#getSub()
   * @see #getThisExpr()
   * @generated
   */
  EReference getThisExpr_Sub();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.IntExpr <em>Int Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Expr</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.IntExpr
   * @generated
   */
  EClass getIntExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.IntExpr#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Val</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.IntExpr#getVal()
   * @see #getIntExpr()
   * @generated
   */
  EReference getIntExpr_Val();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.RealExpr <em>Real Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Real Expr</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.RealExpr
   * @generated
   */
  EClass getRealExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.RealExpr#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Val</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.RealExpr#getVal()
   * @see #getRealExpr()
   * @generated
   */
  EReference getRealExpr_Val();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.BoolExpr <em>Bool Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bool Expr</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.BoolExpr
   * @generated
   */
  EClass getBoolExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.BoolExpr#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Val</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.BoolExpr#getVal()
   * @see #getBoolExpr()
   * @generated
   */
  EReference getBoolExpr_Val();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.StringExpr <em>String Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Expr</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.StringExpr
   * @generated
   */
  EClass getStringExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.StringExpr#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Val</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.StringExpr#getVal()
   * @see #getStringExpr()
   * @generated
   */
  EReference getStringExpr_Val();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.IfThenElseExpr <em>If Then Else Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Then Else Expr</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.IfThenElseExpr
   * @generated
   */
  EClass getIfThenElseExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.IfThenElseExpr#getCond <em>Cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cond</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.IfThenElseExpr#getCond()
   * @see #getIfThenElseExpr()
   * @generated
   */
  EReference getIfThenElseExpr_Cond();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.IfThenElseExpr#getThen <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.IfThenElseExpr#getThen()
   * @see #getIfThenElseExpr()
   * @generated
   */
  EReference getIfThenElseExpr_Then();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.IfThenElseExpr#getElse <em>Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.IfThenElseExpr#getElse()
   * @see #getIfThenElseExpr()
   * @generated
   */
  EReference getIfThenElseExpr_Else();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.QuantifiedExpr <em>Quantified Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Quantified Expr</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.QuantifiedExpr
   * @generated
   */
  EClass getQuantifiedExpr();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.QuantifiedExpr#getQuant <em>Quant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Quant</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.QuantifiedExpr#getQuant()
   * @see #getQuantifiedExpr()
   * @generated
   */
  EAttribute getQuantifiedExpr_Quant();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.mcs.mcs.QuantifiedExpr#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.QuantifiedExpr#getArgs()
   * @see #getQuantifiedExpr()
   * @generated
   */
  EReference getQuantifiedExpr_Args();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.QuantifiedExpr#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.QuantifiedExpr#getExpr()
   * @see #getQuantifiedExpr()
   * @generated
   */
  EReference getQuantifiedExpr_Expr();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.BuiltInFnCallExpr <em>Built In Fn Call Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Built In Fn Call Expr</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.BuiltInFnCallExpr
   * @generated
   */
  EClass getBuiltInFnCallExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.BuiltInFnCallExpr#getBuiltin <em>Builtin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Builtin</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.BuiltInFnCallExpr#getBuiltin()
   * @see #getBuiltInFnCallExpr()
   * @generated
   */
  EReference getBuiltInFnCallExpr_Builtin();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.FnCallExpr <em>Fn Call Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fn Call Expr</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.FnCallExpr
   * @generated
   */
  EClass getFnCallExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.FnCallExpr#getFn <em>Fn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fn</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.FnCallExpr#getFn()
   * @see #getFnCallExpr()
   * @generated
   */
  EReference getFnCallExpr_Fn();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.TheoremCallExpr <em>Theorem Call Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Theorem Call Expr</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.TheoremCallExpr
   * @generated
   */
  EClass getTheoremCallExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.TheoremCallExpr#getFn <em>Fn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fn</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.TheoremCallExpr#getFn()
   * @see #getTheoremCallExpr()
   * @generated
   */
  EReference getTheoremCallExpr_Fn();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.FilterSet <em>Filter Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Filter Set</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.FilterSet
   * @generated
   */
  EClass getFilterSet();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.mcs.mcs.FilterSet#isList <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>List</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.FilterSet#isList()
   * @see #getFilterSet()
   * @generated
   */
  EAttribute getFilterSet_List();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.FilterSet#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.FilterSet#getExp()
   * @see #getFilterSet()
   * @generated
   */
  EReference getFilterSet_Exp();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.FilterMapExpr <em>Filter Map Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Filter Map Expr</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.FilterMapExpr
   * @generated
   */
  EClass getFilterMapExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.FilterMapExpr#getMap <em>Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Map</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.FilterMapExpr#getMap()
   * @see #getFilterMapExpr()
   * @generated
   */
  EReference getFilterMapExpr_Map();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.mcs.mcs.FilterMapExpr#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.FilterMapExpr#getArgs()
   * @see #getFilterMapExpr()
   * @generated
   */
  EReference getFilterMapExpr_Args();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.FilterMapExpr#getFilter <em>Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Filter</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.FilterMapExpr#getFilter()
   * @see #getFilterMapExpr()
   * @generated
   */
  EReference getFilterMapExpr_Filter();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.SetExpr <em>Set Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Set Expr</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.SetExpr
   * @generated
   */
  EClass getSetExpr();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.mcs.mcs.SetExpr#getExprs <em>Exprs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exprs</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.SetExpr#getExprs()
   * @see #getSetExpr()
   * @generated
   */
  EReference getSetExpr_Exprs();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.MappingExpr <em>Mapping Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapping Expr</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.MappingExpr
   * @generated
   */
  EClass getMappingExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.MappingExpr#getExpr1 <em>Expr1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr1</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.MappingExpr#getExpr1()
   * @see #getMappingExpr()
   * @generated
   */
  EReference getMappingExpr_Expr1();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.MappingExpr#getExpr2 <em>Expr2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr2</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.MappingExpr#getExpr2()
   * @see #getMappingExpr()
   * @generated
   */
  EReference getMappingExpr_Expr2();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.EmptySetExpr <em>Empty Set Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Empty Set Expr</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.EmptySetExpr
   * @generated
   */
  EClass getEmptySetExpr();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.mcs.mcs.LetExpr <em>Let Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Let Expr</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.LetExpr
   * @generated
   */
  EClass getLetExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.LetExpr#getLocal <em>Local</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Local</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.LetExpr#getLocal()
   * @see #getLetExpr()
   * @generated
   */
  EReference getLetExpr_Local();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.LetExpr#getExpr1 <em>Expr1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr1</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.LetExpr#getExpr1()
   * @see #getLetExpr()
   * @generated
   */
  EReference getLetExpr_Expr1();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.mcs.mcs.LetExpr#getExpr2 <em>Expr2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr2</em>'.
   * @see org.osate.xtext.aadl2.mcs.mcs.LetExpr#getExpr2()
   * @see #getLetExpr()
   * @generated
   */
  EReference getLetExpr_Expr2();

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
     * The meta object literal for the '<em><b>File</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MCS_GRAMMAR_ROOT__FILE = eINSTANCE.getMCSGrammarRoot_File();

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
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.MCSFileImpl <em>MCS File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.MCSFileImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getMCSFile()
     * @generated
     */
    EClass MCS_FILE = eINSTANCE.getMCSFile();

    /**
     * The meta object literal for the '<em><b>Imported Unit</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MCS_FILE__IMPORTED_UNIT = eINSTANCE.getMCSFile_ImportedUnit();

    /**
     * The meta object literal for the '<em><b>Files</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MCS_FILE__FILES = eINSTANCE.getMCSFile_Files();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MCS_FILE__TYPES = eINSTANCE.getMCSFile_Types();

    /**
     * The meta object literal for the '<em><b>Constants</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MCS_FILE__CONSTANTS = eINSTANCE.getMCSFile_Constants();

    /**
     * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MCS_FILE__FUNCTIONS = eINSTANCE.getMCSFile_Functions();

    /**
     * The meta object literal for the '<em><b>Theorems</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MCS_FILE__THEOREMS = eINSTANCE.getMCSFile_Theorems();

    /**
     * The meta object literal for the '<em><b>Calls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MCS_FILE__CALLS = eINSTANCE.getMCSFile_Calls();

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
     * The meta object literal for the '<em><b>Calls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MCS_ANNEX_SUBCLAUSE__CALLS = eINSTANCE.getMCSAnnexSubclause_Calls();

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
     * The meta object literal for the '<em><b>Const</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_DECLARATION__CONST = eINSTANCE.getConstant_declaration_Const();

    /**
     * The meta object literal for the '<em><b>Left expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_DECLARATION__LEFT_EXPR = eINSTANCE.getConstant_declaration_Left_expr();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.FunctionImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getFunction()
     * @generated
     */
    EClass FUNCTION = eINSTANCE.getFunction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION__NAME = eINSTANCE.getFunction_Name();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__ARGS = eINSTANCE.getFunction_Args();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__BODY = eINSTANCE.getFunction_Body();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.TheoremImpl <em>Theorem</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.TheoremImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getTheorem()
     * @generated
     */
    EClass THEOREM = eINSTANCE.getTheorem();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute THEOREM__NAME = eINSTANCE.getTheorem_Name();

    /**
     * The meta object literal for the '<em><b>Troot</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute THEOREM__TROOT = eINSTANCE.getTheorem_T_root();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THEOREM__ARGS = eINSTANCE.getTheorem_Args();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THEOREM__BODY = eINSTANCE.getTheorem_Body();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.Theorem_rootImpl <em>Theorem root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.Theorem_rootImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getTheorem_root()
     * @generated
     */
    EClass THEOREM_ROOT = eINSTANCE.getTheorem_root();

    /**
     * The meta object literal for the '<em><b>Nilroot</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute THEOREM_ROOT__NILROOT = eINSTANCE.getTheorem_root_Nilroot();

    /**
     * The meta object literal for the '<em><b>Classifier</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THEOREM_ROOT__CLASSIFIER = eINSTANCE.getTheorem_root_Classifier();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.FunctionBodyImpl <em>Function Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.FunctionBodyImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getFunctionBody()
     * @generated
     */
    EClass FUNCTION_BODY = eINSTANCE.getFunctionBody();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_BODY__TYPE = eINSTANCE.getFunctionBody_Type();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_BODY__EXPR = eINSTANCE.getFunctionBody_Expr();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.TheoremBodyImpl <em>Theorem Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.TheoremBodyImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getTheoremBody()
     * @generated
     */
    EClass THEOREM_BODY = eINSTANCE.getTheoremBody();

    /**
     * The meta object literal for the '<em><b>String</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THEOREM_BODY__STRING = eINSTANCE.getTheoremBody_String();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THEOREM_BODY__EXPR = eINSTANCE.getTheoremBody_Expr();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.ParameterizedStringImpl <em>Parameterized String</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.ParameterizedStringImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getParameterizedString()
     * @generated
     */
    EClass PARAMETERIZED_STRING = eINSTANCE.getParameterizedString();

    /**
     * The meta object literal for the '<em><b>Claim</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETERIZED_STRING__CLAIM = eINSTANCE.getParameterizedString_Claim();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.ParameterImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.TextParmImpl <em>Text Parm</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.TextParmImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getTextParm()
     * @generated
     */
    EClass TEXT_PARM = eINSTANCE.getTextParm();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.McsTypedNameImpl <em>Typed Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsTypedNameImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getMcsTypedName()
     * @generated
     */
    EClass MCS_TYPED_NAME = eINSTANCE.getMcsTypedName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MCS_TYPED_NAME__NAME = eINSTANCE.getMcsTypedName_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MCS_TYPED_NAME__TYPE = eINSTANCE.getMcsTypedName_Type();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MCS_TYPED_NAME__EXPR = eINSTANCE.getMcsTypedName_Expr();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.TheoremCallImpl <em>Theorem Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.TheoremCallImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getTheoremCall()
     * @generated
     */
    EClass THEOREM_CALL = eINSTANCE.getTheoremCall();

    /**
     * The meta object literal for the '<em><b>Tname</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THEOREM_CALL__TNAME = eINSTANCE.getTheoremCall_Tname();

    /**
     * The meta object literal for the '<em><b>Croot</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THEOREM_CALL__CROOT = eINSTANCE.getTheoremCall_Croot();

    /**
     * The meta object literal for the '<em><b>Actarg</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THEOREM_CALL__ACTARG = eINSTANCE.getTheoremCall_Actarg();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.Classifier_literalImpl <em>Classifier literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.Classifier_literalImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getClassifier_literal()
     * @generated
     */
    EClass CLASSIFIER_LITERAL = eINSTANCE.getClassifier_literal();

    /**
     * The meta object literal for the '<em><b>Classlit</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASSIFIER_LITERAL__CLASSLIT = eINSTANCE.getClassifier_literal_Classlit();

    /**
     * The meta object literal for the '<em><b>Nameref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASSIFIER_LITERAL__NAMEREF = eINSTANCE.getClassifier_literal_Nameref();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.RangeImpl <em>Range</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.RangeImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getRange()
     * @generated
     */
    EClass RANGE = eINSTANCE.getRange();

    /**
     * The meta object literal for the '<em><b>Lower Bound</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RANGE__LOWER_BOUND = eINSTANCE.getRange_LowerBound();

    /**
     * The meta object literal for the '<em><b>Upper Bound</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RANGE__UPPER_BOUND = eINSTANCE.getRange_UpperBound();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RANGE__VAL = eINSTANCE.getRange_Val();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.RefTermImpl <em>Ref Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.RefTermImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getRefTerm()
     * @generated
     */
    EClass REF_TERM = eINSTANCE.getRefTerm();

    /**
     * The meta object literal for the '<em><b>Root</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REF_TERM__ROOT = eINSTANCE.getRefTerm_Root();

    /**
     * The meta object literal for the '<em><b>Sub</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REF_TERM__SUB = eINSTANCE.getRefTerm_Sub();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.NestedDotIDImpl <em>Nested Dot ID</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.NestedDotIDImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getNestedDotID()
     * @generated
     */
    EClass NESTED_DOT_ID = eINSTANCE.getNestedDotID();

    /**
     * The meta object literal for the '<em><b>Base</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NESTED_DOT_ID__BASE = eINSTANCE.getNestedDotID_Base();

    /**
     * The meta object literal for the '<em><b>Sub</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NESTED_DOT_ID__SUB = eINSTANCE.getNestedDotID_Sub();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.Mcs_name_refImpl <em>Mcs name ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.Mcs_name_refImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getMcs_name_ref()
     * @generated
     */
    EClass MCS_NAME_REF = eINSTANCE.getMcs_name_ref();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MCS_NAME_REF__REF = eINSTANCE.getMcs_name_ref_Ref();

    /**
     * The meta object literal for the '<em><b>Chain</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MCS_NAME_REF__CHAIN = eINSTANCE.getMcs_name_ref_Chain();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.MethodChainImpl <em>Method Chain</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.MethodChainImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getMethodChain()
     * @generated
     */
    EClass METHOD_CHAIN = eINSTANCE.getMethodChain();

    /**
     * The meta object literal for the '<em><b>Builtin</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_CHAIN__BUILTIN = eINSTANCE.getMethodChain_Builtin();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_CHAIN__METHOD = eINSTANCE.getMethodChain_Method();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.BuiltInFnCallImpl <em>Built In Fn Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.BuiltInFnCallImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getBuiltInFnCall()
     * @generated
     */
    EClass BUILT_IN_FN_CALL = eINSTANCE.getBuiltInFnCall();

    /**
     * The meta object literal for the '<em><b>Fn</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUILT_IN_FN_CALL__FN = eINSTANCE.getBuiltInFnCall_Fn();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUILT_IN_FN_CALL__ARGS = eINSTANCE.getBuiltInFnCall_Args();

    /**
     * The meta object literal for the '<em><b>Newtype</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUILT_IN_FN_CALL__NEWTYPE = eINSTANCE.getBuiltInFnCall_Newtype();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.FnCallImpl <em>Fn Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.FnCallImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getFnCall()
     * @generated
     */
    EClass FN_CALL = eINSTANCE.getFnCall();

    /**
     * The meta object literal for the '<em><b>Fn</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FN_CALL__FN = eINSTANCE.getFnCall_Fn();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FN_CALL__ARGS = eINSTANCE.getFnCall_Args();

    /**
     * The meta object literal for the '<em><b>Newtype</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FN_CALL__NEWTYPE = eINSTANCE.getFnCall_Newtype();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.ExprImpl <em>Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.ExprImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getExpr()
     * @generated
     */
    EClass EXPR = eINSTANCE.getExpr();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.PostCastExprImpl <em>Post Cast Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.PostCastExprImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getPostCastExpr()
     * @generated
     */
    EClass POST_CAST_EXPR = eINSTANCE.getPostCastExpr();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POST_CAST_EXPR__EXPR = eINSTANCE.getPostCastExpr_Expr();

    /**
     * The meta object literal for the '<em><b>Newtype</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POST_CAST_EXPR__NEWTYPE = eINSTANCE.getPostCastExpr_Newtype();

    /**
     * The meta object literal for the '<em><b>Chain</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POST_CAST_EXPR__CHAIN = eINSTANCE.getPostCastExpr_Chain();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.MCSNameExprImpl <em>MCS Name Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.MCSNameExprImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getMCSNameExpr()
     * @generated
     */
    EClass MCS_NAME_EXPR = eINSTANCE.getMCSNameExpr();

    /**
     * The meta object literal for the '<em><b>Root</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MCS_NAME_EXPR__ROOT = eINSTANCE.getMCSNameExpr_Root();

    /**
     * The meta object literal for the '<em><b>Iroot</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MCS_NAME_EXPR__IROOT = eINSTANCE.getMCSNameExpr_Iroot();

    /**
     * The meta object literal for the '<em><b>Nil</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MCS_NAME_EXPR__NIL = eINSTANCE.getMCSNameExpr_Nil();

    /**
     * The meta object literal for the '<em><b>Empty</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MCS_NAME_EXPR__EMPTY = eINSTANCE.getMCSNameExpr_Empty();

    /**
     * The meta object literal for the '<em><b>Allmodes</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MCS_NAME_EXPR__ALLMODES = eINSTANCE.getMCSNameExpr_Allmodes();

    /**
     * The meta object literal for the '<em><b>Typednameref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MCS_NAME_EXPR__TYPEDNAMEREF = eINSTANCE.getMCSNameExpr_Typednameref();

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
     * The meta object literal for the '<em><b>Ptype</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BASIC_TYPE__PTYPE = eINSTANCE.getBasic_type_Ptype();

    /**
     * The meta object literal for the '<em><b>Pref</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BASIC_TYPE__PREF = eINSTANCE.getBasic_type_Pref();

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
     * The meta object literal for the '<em><b>Typename</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_TYPE__TYPENAME = eINSTANCE.getBasic_type_Typename();

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
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.Mapping_typeImpl <em>Mapping type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.Mapping_typeImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getMapping_type()
     * @generated
     */
    EClass MAPPING_TYPE = eINSTANCE.getMapping_type();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING_TYPE__KEY = eINSTANCE.getMapping_type_Key();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING_TYPE__VAL = eINSTANCE.getMapping_type_Val();

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
     * The meta object literal for the '<em><b>Root type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SET_TYPE__ROOT_TYPE = eINSTANCE.getSet_type_Root_type();

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
     * The meta object literal for the '<em><b>Root type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_TYPE__ROOT_TYPE = eINSTANCE.getList_type_Root_type();

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
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNION_TYPE__TYPES = eINSTANCE.getUnion_type_Types();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNION_TYPE__TYPE = eINSTANCE.getUnion_type_Type();

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
     * The meta object literal for the '<em><b>Tpack</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_TYPE__TPACK = eINSTANCE.getElement_type_Tpack();

    /**
     * The meta object literal for the '<em><b>Tclass</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_TYPE__TCLASS = eINSTANCE.getElement_type_T_class();

    /**
     * The meta object literal for the '<em><b>Tinst</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_TYPE__TINST = eINSTANCE.getElement_type_T_inst();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.ClassifiersImpl <em>Classifiers</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.ClassifiersImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getClassifiers()
     * @generated
     */
    EClass CLASSIFIERS = eINSTANCE.getClassifiers();

    /**
     * The meta object literal for the '<em><b>Tclass</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASSIFIERS__TCLASS = eINSTANCE.getClassifiers_T_class();

    /**
     * The meta object literal for the '<em><b>Tclass subtype</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASSIFIERS__TCLASS_SUBTYPE = eINSTANCE.getClassifiers_T_class_subtype();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.T_classifier_subtypesImpl <em>Tclassifier subtypes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.T_classifier_subtypesImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getT_classifier_subtypes()
     * @generated
     */
    EClass TCLASSIFIER_SUBTYPES = eINSTANCE.getT_classifier_subtypes();

    /**
     * The meta object literal for the '<em><b>Tctype</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TCLASSIFIER_SUBTYPES__TCTYPE = eINSTANCE.getT_classifier_subtypes_T_ctype();

    /**
     * The meta object literal for the '<em><b>Tcimpl</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TCLASSIFIER_SUBTYPES__TCIMPL = eINSTANCE.getT_classifier_subtypes_T_cimpl();

    /**
     * The meta object literal for the '<em><b>Tfgclass</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TCLASSIFIER_SUBTYPES__TFGCLASS = eINSTANCE.getT_classifier_subtypes_T_fgclass();

    /**
     * The meta object literal for the '<em><b>Tannexclass</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TCLASSIFIER_SUBTYPES__TANNEXCLASS = eINSTANCE.getT_classifier_subtypes_T_annexclass();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.InstancesImpl <em>Instances</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.InstancesImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getInstances()
     * @generated
     */
    EClass INSTANCES = eINSTANCE.getInstances();

    /**
     * The meta object literal for the '<em><b>Inst</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTANCES__INST = eINSTANCE.getInstances_Inst();

    /**
     * The meta object literal for the '<em><b>Tinst st</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTANCES__TINST_ST = eINSTANCE.getInstances_T_inst_st();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_instance_subtypesImpl <em>tinstance subtypes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.t_instance_subtypesImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#gett_instance_subtypes()
     * @generated
     */
    EClass TINSTANCE_SUBTYPES = eINSTANCE.gett_instance_subtypes();

    /**
     * The meta object literal for the '<em><b>Tsubc st</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TINSTANCE_SUBTYPES__TSUBC_ST = eINSTANCE.gett_instance_subtypes_T_subc_st();

    /**
     * The meta object literal for the '<em><b>Tsbcall</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TINSTANCE_SUBTYPES__TSBCALL = eINSTANCE.gett_instance_subtypes_T_sbcall();

    /**
     * The meta object literal for the '<em><b>Tcallseq</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TINSTANCE_SUBTYPES__TCALLSEQ = eINSTANCE.gett_instance_subtypes_T_callseq();

    /**
     * The meta object literal for the '<em><b>Teeflow</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TINSTANCE_SUBTYPES__TEEFLOW = eINSTANCE.gett_instance_subtypes_T_eeflow();

    /**
     * The meta object literal for the '<em><b>Tproto</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TINSTANCE_SUBTYPES__TPROTO = eINSTANCE.gett_instance_subtypes_T_proto();

    /**
     * The meta object literal for the '<em><b>Tmode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TINSTANCE_SUBTYPES__TMODE = eINSTANCE.gett_instance_subtypes_T_mode();

    /**
     * The meta object literal for the '<em><b>Tmod trans</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TINSTANCE_SUBTYPES__TMOD_TRANS = eINSTANCE.gett_instance_subtypes_T_mod_trans();

    /**
     * The meta object literal for the '<em><b>Tmode trig</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TINSTANCE_SUBTYPES__TMODE_TRIG = eINSTANCE.gett_instance_subtypes_T_mode_trig();

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
     * The meta object literal for the '<em><b>Tcimpl st</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TSUBCOMPONENT_SUBTYPES__TCIMPL_ST = eINSTANCE.gett_subcomponent_subtypes_T_cimpl_st();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.t_component_subtypesImpl <em>tcomponent subtypes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.t_component_subtypesImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#gett_component_subtypes()
     * @generated
     */
    EClass TCOMPONENT_SUBTYPES = eINSTANCE.gett_component_subtypes();

    /**
     * The meta object literal for the '<em><b>Tannex sub</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TCOMPONENT_SUBTYPES__TANNEX_SUB = eINSTANCE.gett_component_subtypes_T_annex_sub();

    /**
     * The meta object literal for the '<em><b>Tabstract</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TCOMPONENT_SUBTYPES__TABSTRACT = eINSTANCE.gett_component_subtypes_T_abstract();

    /**
     * The meta object literal for the '<em><b>Tsys</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TCOMPONENT_SUBTYPES__TSYS = eINSTANCE.gett_component_subtypes_T_sys();

    /**
     * The meta object literal for the '<em><b>Tdev</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TCOMPONENT_SUBTYPES__TDEV = eINSTANCE.gett_component_subtypes_T_dev();

    /**
     * The meta object literal for the '<em><b>Tproc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TCOMPONENT_SUBTYPES__TPROC = eINSTANCE.gett_component_subtypes_T_proc();

    /**
     * The meta object literal for the '<em><b>Tvirt proc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TCOMPONENT_SUBTYPES__TVIRT_PROC = eINSTANCE.gett_component_subtypes_T_virt_proc();

    /**
     * The meta object literal for the '<em><b>Tbus</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TCOMPONENT_SUBTYPES__TBUS = eINSTANCE.gett_component_subtypes_T_bus();

    /**
     * The meta object literal for the '<em><b>Tvbus</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TCOMPONENT_SUBTYPES__TVBUS = eINSTANCE.gett_component_subtypes_T_vbus();

    /**
     * The meta object literal for the '<em><b>Tmem</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TCOMPONENT_SUBTYPES__TMEM = eINSTANCE.gett_component_subtypes_T_mem();

    /**
     * The meta object literal for the '<em><b>Ttg</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TCOMPONENT_SUBTYPES__TTG = eINSTANCE.gett_component_subtypes_T_tg();

    /**
     * The meta object literal for the '<em><b>Tt</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TCOMPONENT_SUBTYPES__TT = eINSTANCE.gett_component_subtypes_T_t();

    /**
     * The meta object literal for the '<em><b>Td</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TCOMPONENT_SUBTYPES__TD = eINSTANCE.gett_component_subtypes_T_d();

    /**
     * The meta object literal for the '<em><b>Tsubprog</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TCOMPONENT_SUBTYPES__TSUBPROG = eINSTANCE.gett_component_subtypes_T_subprog();

    /**
     * The meta object literal for the '<em><b>Tsubprog g</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TCOMPONENT_SUBTYPES__TSUBPROG_G = eINSTANCE.gett_component_subtypes_T_subprog_g();

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
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.IntegerRangeImpl <em>Integer Range</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.IntegerRangeImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getIntegerRange()
     * @generated
     */
    EClass INTEGER_RANGE = eINSTANCE.getIntegerRange();

    /**
     * The meta object literal for the '<em><b>Lower Bound</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTEGER_RANGE__LOWER_BOUND = eINSTANCE.getIntegerRange_LowerBound();

    /**
     * The meta object literal for the '<em><b>Upper Bound</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTEGER_RANGE__UPPER_BOUND = eINSTANCE.getIntegerRange_UpperBound();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.RealRangeImpl <em>Real Range</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.RealRangeImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getRealRange()
     * @generated
     */
    EClass REAL_RANGE = eINSTANCE.getRealRange();

    /**
     * The meta object literal for the '<em><b>Lower Bound</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REAL_RANGE__LOWER_BOUND = eINSTANCE.getRealRange_LowerBound();

    /**
     * The meta object literal for the '<em><b>Upper Bound</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REAL_RANGE__UPPER_BOUND = eINSTANCE.getRealRange_UpperBound();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.UnnamedIntegerTypeImpl <em>Unnamed Integer Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.UnnamedIntegerTypeImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getUnnamedIntegerType()
     * @generated
     */
    EClass UNNAMED_INTEGER_TYPE = eINSTANCE.getUnnamedIntegerType();

    /**
     * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNNAMED_INTEGER_TYPE__RANGE = eINSTANCE.getUnnamedIntegerType_Range();

    /**
     * The meta object literal for the '<em><b>Owned Units Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNNAMED_INTEGER_TYPE__OWNED_UNITS_TYPE = eINSTANCE.getUnnamedIntegerType_OwnedUnitsType();

    /**
     * The meta object literal for the '<em><b>Referenced Units Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNNAMED_INTEGER_TYPE__REFERENCED_UNITS_TYPE = eINSTANCE.getUnnamedIntegerType_ReferencedUnitsType();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.UnnamedRealTypeImpl <em>Unnamed Real Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.UnnamedRealTypeImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getUnnamedRealType()
     * @generated
     */
    EClass UNNAMED_REAL_TYPE = eINSTANCE.getUnnamedRealType();

    /**
     * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNNAMED_REAL_TYPE__RANGE = eINSTANCE.getUnnamedRealType_Range();

    /**
     * The meta object literal for the '<em><b>Owned Units Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNNAMED_REAL_TYPE__OWNED_UNITS_TYPE = eINSTANCE.getUnnamedRealType_OwnedUnitsType();

    /**
     * The meta object literal for the '<em><b>Referenced Units Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNNAMED_REAL_TYPE__REFERENCED_UNITS_TYPE = eINSTANCE.getUnnamedRealType_ReferencedUnitsType();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.UnnamedRangeTypeImpl <em>Unnamed Range Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.UnnamedRangeTypeImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getUnnamedRangeType()
     * @generated
     */
    EClass UNNAMED_RANGE_TYPE = eINSTANCE.getUnnamedRangeType();

    /**
     * The meta object literal for the '<em><b>Owned Number Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNNAMED_RANGE_TYPE__OWNED_NUMBER_TYPE = eINSTANCE.getUnnamedRangeType_OwnedNumberType();

    /**
     * The meta object literal for the '<em><b>Referenced Number Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNNAMED_RANGE_TYPE__REFERENCED_NUMBER_TYPE = eINSTANCE.getUnnamedRangeType_ReferencedNumberType();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.ClaimStringImpl <em>Claim String</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.ClaimStringImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getClaimString()
     * @generated
     */
    EClass CLAIM_STRING = eINSTANCE.getClaimString();

    /**
     * The meta object literal for the '<em><b>Str</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLAIM_STRING__STR = eINSTANCE.getClaimString_Str();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.ClaimArgImpl <em>Claim Arg</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.ClaimArgImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getClaimArg()
     * @generated
     */
    EClass CLAIM_ARG = eINSTANCE.getClaimArg();

    /**
     * The meta object literal for the '<em><b>Textarg</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLAIM_ARG__TEXTARG = eINSTANCE.getClaimArg_Textarg();

    /**
     * The meta object literal for the '<em><b>Unit</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLAIM_ARG__UNIT = eINSTANCE.getClaimArg_Unit();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.BinaryExprImpl <em>Binary Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.BinaryExprImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getBinaryExpr()
     * @generated
     */
    EClass BINARY_EXPR = eINSTANCE.getBinaryExpr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_EXPR__LEFT = eINSTANCE.getBinaryExpr_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINARY_EXPR__OP = eINSTANCE.getBinaryExpr_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_EXPR__RIGHT = eINSTANCE.getBinaryExpr_Right();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.InstanceOfExprImpl <em>Instance Of Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.InstanceOfExprImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getInstanceOfExpr()
     * @generated
     */
    EClass INSTANCE_OF_EXPR = eINSTANCE.getInstanceOfExpr();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCE_OF_EXPR__EXPR = eINSTANCE.getInstanceOfExpr_Expr();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCE_OF_EXPR__TYPE = eINSTANCE.getInstanceOfExpr_Type();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.UnaryExprImpl <em>Unary Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.UnaryExprImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getUnaryExpr()
     * @generated
     */
    EClass UNARY_EXPR = eINSTANCE.getUnaryExpr();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNARY_EXPR__OP = eINSTANCE.getUnaryExpr_Op();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_EXPR__EXPR = eINSTANCE.getUnaryExpr_Expr();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.PkgExprImpl <em>Pkg Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.PkgExprImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getPkgExpr()
     * @generated
     */
    EClass PKG_EXPR = eINSTANCE.getPkgExpr();

    /**
     * The meta object literal for the '<em><b>Package</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PKG_EXPR__PACKAGE = eINSTANCE.getPkgExpr_Package();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.CompExprImpl <em>Comp Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.CompExprImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getCompExpr()
     * @generated
     */
    EClass COMP_EXPR = eINSTANCE.getCompExpr();

    /**
     * The meta object literal for the '<em><b>Classifier</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMP_EXPR__CLASSIFIER = eINSTANCE.getCompExpr_Classifier();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.RefExprImpl <em>Ref Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.RefExprImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getRefExpr()
     * @generated
     */
    EClass REF_EXPR = eINSTANCE.getRefExpr();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REF_EXPR__REFERENCE = eINSTANCE.getRefExpr_Reference();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.ThisExprImpl <em>This Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.ThisExprImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getThisExpr()
     * @generated
     */
    EClass THIS_EXPR = eINSTANCE.getThisExpr();

    /**
     * The meta object literal for the '<em><b>Sub</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THIS_EXPR__SUB = eINSTANCE.getThisExpr_Sub();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.IntExprImpl <em>Int Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.IntExprImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getIntExpr()
     * @generated
     */
    EClass INT_EXPR = eINSTANCE.getIntExpr();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INT_EXPR__VAL = eINSTANCE.getIntExpr_Val();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.RealExprImpl <em>Real Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.RealExprImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getRealExpr()
     * @generated
     */
    EClass REAL_EXPR = eINSTANCE.getRealExpr();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REAL_EXPR__VAL = eINSTANCE.getRealExpr_Val();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.BoolExprImpl <em>Bool Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.BoolExprImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getBoolExpr()
     * @generated
     */
    EClass BOOL_EXPR = eINSTANCE.getBoolExpr();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOL_EXPR__VAL = eINSTANCE.getBoolExpr_Val();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.StringExprImpl <em>String Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.StringExprImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getStringExpr()
     * @generated
     */
    EClass STRING_EXPR = eINSTANCE.getStringExpr();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRING_EXPR__VAL = eINSTANCE.getStringExpr_Val();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.IfThenElseExprImpl <em>If Then Else Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.IfThenElseExprImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getIfThenElseExpr()
     * @generated
     */
    EClass IF_THEN_ELSE_EXPR = eINSTANCE.getIfThenElseExpr();

    /**
     * The meta object literal for the '<em><b>Cond</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_THEN_ELSE_EXPR__COND = eINSTANCE.getIfThenElseExpr_Cond();

    /**
     * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_THEN_ELSE_EXPR__THEN = eINSTANCE.getIfThenElseExpr_Then();

    /**
     * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_THEN_ELSE_EXPR__ELSE = eINSTANCE.getIfThenElseExpr_Else();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.QuantifiedExprImpl <em>Quantified Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.QuantifiedExprImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getQuantifiedExpr()
     * @generated
     */
    EClass QUANTIFIED_EXPR = eINSTANCE.getQuantifiedExpr();

    /**
     * The meta object literal for the '<em><b>Quant</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUANTIFIED_EXPR__QUANT = eINSTANCE.getQuantifiedExpr_Quant();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUANTIFIED_EXPR__ARGS = eINSTANCE.getQuantifiedExpr_Args();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUANTIFIED_EXPR__EXPR = eINSTANCE.getQuantifiedExpr_Expr();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.BuiltInFnCallExprImpl <em>Built In Fn Call Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.BuiltInFnCallExprImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getBuiltInFnCallExpr()
     * @generated
     */
    EClass BUILT_IN_FN_CALL_EXPR = eINSTANCE.getBuiltInFnCallExpr();

    /**
     * The meta object literal for the '<em><b>Builtin</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUILT_IN_FN_CALL_EXPR__BUILTIN = eINSTANCE.getBuiltInFnCallExpr_Builtin();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.FnCallExprImpl <em>Fn Call Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.FnCallExprImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getFnCallExpr()
     * @generated
     */
    EClass FN_CALL_EXPR = eINSTANCE.getFnCallExpr();

    /**
     * The meta object literal for the '<em><b>Fn</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FN_CALL_EXPR__FN = eINSTANCE.getFnCallExpr_Fn();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.TheoremCallExprImpl <em>Theorem Call Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.TheoremCallExprImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getTheoremCallExpr()
     * @generated
     */
    EClass THEOREM_CALL_EXPR = eINSTANCE.getTheoremCallExpr();

    /**
     * The meta object literal for the '<em><b>Fn</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THEOREM_CALL_EXPR__FN = eINSTANCE.getTheoremCallExpr_Fn();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.FilterSetImpl <em>Filter Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.FilterSetImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getFilterSet()
     * @generated
     */
    EClass FILTER_SET = eINSTANCE.getFilterSet();

    /**
     * The meta object literal for the '<em><b>List</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FILTER_SET__LIST = eINSTANCE.getFilterSet_List();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILTER_SET__EXP = eINSTANCE.getFilterSet_Exp();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.FilterMapExprImpl <em>Filter Map Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.FilterMapExprImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getFilterMapExpr()
     * @generated
     */
    EClass FILTER_MAP_EXPR = eINSTANCE.getFilterMapExpr();

    /**
     * The meta object literal for the '<em><b>Map</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILTER_MAP_EXPR__MAP = eINSTANCE.getFilterMapExpr_Map();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILTER_MAP_EXPR__ARGS = eINSTANCE.getFilterMapExpr_Args();

    /**
     * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILTER_MAP_EXPR__FILTER = eINSTANCE.getFilterMapExpr_Filter();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.SetExprImpl <em>Set Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.SetExprImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getSetExpr()
     * @generated
     */
    EClass SET_EXPR = eINSTANCE.getSetExpr();

    /**
     * The meta object literal for the '<em><b>Exprs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SET_EXPR__EXPRS = eINSTANCE.getSetExpr_Exprs();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.MappingExprImpl <em>Mapping Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.MappingExprImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getMappingExpr()
     * @generated
     */
    EClass MAPPING_EXPR = eINSTANCE.getMappingExpr();

    /**
     * The meta object literal for the '<em><b>Expr1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING_EXPR__EXPR1 = eINSTANCE.getMappingExpr_Expr1();

    /**
     * The meta object literal for the '<em><b>Expr2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING_EXPR__EXPR2 = eINSTANCE.getMappingExpr_Expr2();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.EmptySetExprImpl <em>Empty Set Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.EmptySetExprImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getEmptySetExpr()
     * @generated
     */
    EClass EMPTY_SET_EXPR = eINSTANCE.getEmptySetExpr();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.mcs.mcs.impl.LetExprImpl <em>Let Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.LetExprImpl
     * @see org.osate.xtext.aadl2.mcs.mcs.impl.McsPackageImpl#getLetExpr()
     * @generated
     */
    EClass LET_EXPR = eINSTANCE.getLetExpr();

    /**
     * The meta object literal for the '<em><b>Local</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LET_EXPR__LOCAL = eINSTANCE.getLetExpr_Local();

    /**
     * The meta object literal for the '<em><b>Expr1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LET_EXPR__EXPR1 = eINSTANCE.getLetExpr_Expr1();

    /**
     * The meta object literal for the '<em><b>Expr2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LET_EXPR__EXPR2 = eINSTANCE.getLetExpr_Expr2();

  }

} //McsPackage
