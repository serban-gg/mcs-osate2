/**
 */
package org.osate.xtext.aadl2.mcs.mcs.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.xtext.xbase.XExpression;

import org.osate.aadl2.AnnexLibrary;
import org.osate.aadl2.AnnexSubclause;
import org.osate.aadl2.Element;
import org.osate.aadl2.ModalElement;
import org.osate.aadl2.NamedElement;

import org.osate.xtext.aadl2.mcs.mcs.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage
 * @generated
 */
public class McsSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static McsPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public McsSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = McsPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case McsPackage.MCS_GRAMMAR_ROOT:
      {
        MCSGrammarRoot mcsGrammarRoot = (MCSGrammarRoot)theEObject;
        T result = caseMCSGrammarRoot(mcsGrammarRoot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.MCS_ANNEX_LIBRARY:
      {
        MCSAnnexLibrary mcsAnnexLibrary = (MCSAnnexLibrary)theEObject;
        T result = caseMCSAnnexLibrary(mcsAnnexLibrary);
        if (result == null) result = caseAnnexLibrary(mcsAnnexLibrary);
        if (result == null) result = caseNamedElement(mcsAnnexLibrary);
        if (result == null) result = caseElement(mcsAnnexLibrary);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.TYPE_DECLARATION:
      {
        type_declaration type_declaration = (type_declaration)theEObject;
        T result = casetype_declaration(type_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.CONSTANT_DECLARATION:
      {
        constant_declaration constant_declaration = (constant_declaration)theEObject;
        T result = caseconstant_declaration(constant_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.MCS_VIEWPOINT:
      {
        MCSViewpoint mcsViewpoint = (MCSViewpoint)theEObject;
        T result = caseMCSViewpoint(mcsViewpoint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.ENFORCEMENT_POLICY:
      {
        Enforcement_policy enforcement_policy = (Enforcement_policy)theEObject;
        T result = caseEnforcement_policy(enforcement_policy);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.PACKAGE_SCRIPT:
      {
        PackageScript packageScript = (PackageScript)theEObject;
        T result = casePackageScript(packageScript);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.APPLIES_TO_CLAUSE:
      {
        AppliesToClause appliesToClause = (AppliesToClause)theEObject;
        T result = caseAppliesToClause(appliesToClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.CLASSIFIER_CATEGORY:
      {
        ClassifierCategory classifierCategory = (ClassifierCategory)theEObject;
        T result = caseClassifierCategory(classifierCategory);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.FEATURE_GROUP_CLASSIFIER_REFERENCE:
      {
        FeatureGroupClassifierReference featureGroupClassifierReference = (FeatureGroupClassifierReference)theEObject;
        T result = caseFeatureGroupClassifierReference(featureGroupClassifierReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.VIEWPOINT_REFERENCE:
      {
        ViewpointReference viewpointReference = (ViewpointReference)theEObject;
        T result = caseViewpointReference(viewpointReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.CONSTRAINTS_BLOCK:
      {
        ConstraintsBlock constraintsBlock = (ConstraintsBlock)theEObject;
        T result = caseConstraintsBlock(constraintsBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.LABELLED_CHECK_STATEMENT:
      {
        labelled_check_statement labelled_check_statement = (labelled_check_statement)theEObject;
        T result = caselabelled_check_statement(labelled_check_statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.CHECK_STATEMENT:
      {
        check_statement check_statement = (check_statement)theEObject;
        T result = casecheck_statement(check_statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.BLOCK_LABEL_ID:
      {
        block_label_id block_label_id = (block_label_id)theEObject;
        T result = caseblock_label_id(block_label_id);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.CHECK_LABEL_ID:
      {
        check_label_id check_label_id = (check_label_id)theEObject;
        T result = casecheck_label_id(check_label_id);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.CHECK_THEOREM:
      {
        check_theorem check_theorem = (check_theorem)theEObject;
        T result = casecheck_theorem(check_theorem);
        if (result == null) result = casecheck_statement(check_theorem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.MODE_SPEC:
      {
        ModeSpec modeSpec = (ModeSpec)theEObject;
        T result = caseModeSpec(modeSpec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.MODE_NAME:
      {
        ModeName modeName = (ModeName)theEObject;
        T result = caseModeName(modeName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.CHECK_ASSERTION:
      {
        check_assertion check_assertion = (check_assertion)theEObject;
        T result = casecheck_assertion(check_assertion);
        if (result == null) result = casecheck_statement(check_assertion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.ROOT_ELEMENT:
      {
        root_element root_element = (root_element)theEObject;
        T result = caseroot_element(root_element);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.ELEMENT_REFERENCE:
      {
        element_reference element_reference = (element_reference)theEObject;
        T result = caseelement_reference(element_reference);
        if (result == null) result = caseroot_element(element_reference);
        if (result == null) result = caseXExpression(element_reference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.CONTAINMENT_PATH_ELEMENT:
      {
        ContainmentPathElement containmentPathElement = (ContainmentPathElement)theEObject;
        T result = caseContainmentPathElement(containmentPathElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.ARRAY_RANGE:
      {
        ArrayRange arrayRange = (ArrayRange)theEObject;
        T result = caseArrayRange(arrayRange);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.PACKAGE_ENFORCE:
      {
        PackageEnforce packageEnforce = (PackageEnforce)theEObject;
        T result = casePackageEnforce(packageEnforce);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.ASSERTION_EXPRESSION:
      {
        assertion_expression assertion_expression = (assertion_expression)theEObject;
        T result = caseassertion_expression(assertion_expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.STRING_EXPRESSION:
      {
        string_expression string_expression = (string_expression)theEObject;
        T result = casestring_expression(string_expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.CONSTANT_EXPRESSION:
      {
        constant_expression constant_expression = (constant_expression)theEObject;
        T result = caseconstant_expression(constant_expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.EXPRESSION:
      {
        expression expression = (expression)theEObject;
        T result = caseexpression(expression);
        if (result == null) result = caseconstant_expression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.MCS_ANNEX_SUBCLAUSE:
      {
        MCSAnnexSubclause mcsAnnexSubclause = (MCSAnnexSubclause)theEObject;
        T result = caseMCSAnnexSubclause(mcsAnnexSubclause);
        if (result == null) result = caseAnnexSubclause(mcsAnnexSubclause);
        if (result == null) result = caseModalElement(mcsAnnexSubclause);
        if (result == null) result = caseNamedElement(mcsAnnexSubclause);
        if (result == null) result = caseElement(mcsAnnexSubclause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.CLASSIFIER_ENFORCE:
      {
        ClassifierEnforce classifierEnforce = (ClassifierEnforce)theEObject;
        T result = caseClassifierEnforce(classifierEnforce);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.CLASSIFIER_SCRIPT:
      {
        ClassifierScript classifierScript = (ClassifierScript)theEObject;
        T result = caseClassifierScript(classifierScript);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.FUNCTION_DECLARATION:
      {
        function_declaration function_declaration = (function_declaration)theEObject;
        T result = casefunction_declaration(function_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.ARGUMENT:
      {
        argument argument = (argument)theEObject;
        T result = caseargument(argument);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.THEOREM_DECLARATION:
      {
        theorem_declaration theorem_declaration = (theorem_declaration)theEObject;
        T result = casetheorem_declaration(theorem_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.IN_MODES_LIST:
      {
        in_modes_list in_modes_list = (in_modes_list)theEObject;
        T result = casein_modes_list(in_modes_list);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.LOCAL_DECLARATION:
      {
        local_declaration local_declaration = (local_declaration)theEObject;
        T result = caselocal_declaration(local_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.THEOREM_STATEMENT:
      {
        theorem_statement theorem_statement = (theorem_statement)theEObject;
        T result = casetheorem_statement(theorem_statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.TYPE_EXPRESSION:
      {
        type_expression type_expression = (type_expression)theEObject;
        T result = casetype_expression(type_expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.BASIC_TYPE:
      {
        basic_type basic_type = (basic_type)theEObject;
        T result = casebasic_type(basic_type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.UNNAMED_FUNCTION_TYPE:
      {
        UnnamedFunctionType unnamedFunctionType = (UnnamedFunctionType)theEObject;
        T result = caseUnnamedFunctionType(unnamedFunctionType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.COMPOSITE_TYPE:
      {
        composite_type composite_type = (composite_type)theEObject;
        T result = casecomposite_type(composite_type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.SET_TYPE:
      {
        set_type set_type = (set_type)theEObject;
        T result = caseset_type(set_type);
        if (result == null) result = casecomposite_type(set_type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.LIST_TYPE:
      {
        list_type list_type = (list_type)theEObject;
        T result = caselist_type(list_type);
        if (result == null) result = casecomposite_type(list_type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.MAP_TYPE:
      {
        map_type map_type = (map_type)theEObject;
        T result = casemap_type(map_type);
        if (result == null) result = casecomposite_type(map_type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.RECORD_TYPE:
      {
        record_type record_type = (record_type)theEObject;
        T result = caserecord_type(record_type);
        if (result == null) result = casecomposite_type(record_type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.UNION_TYPE:
      {
        union_type union_type = (union_type)theEObject;
        T result = caseunion_type(union_type);
        if (result == null) result = casecomposite_type(union_type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.ID_TYPE_PAIR:
      {
        id_type_pair id_type_pair = (id_type_pair)theEObject;
        T result = caseid_type_pair(id_type_pair);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.ELEMENT_TYPE:
      {
        element_type element_type = (element_type)theEObject;
        T result = caseelement_type(element_type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.TCLASSIFIERS:
      {
        t_classifiers t_classifiers = (t_classifiers)theEObject;
        T result = caset_classifiers(t_classifiers);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.TCLASSIFIER_SUBTYPES:
      {
        t_classifier_subtypes t_classifier_subtypes = (t_classifier_subtypes)theEObject;
        T result = caset_classifier_subtypes(t_classifier_subtypes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.TNAMED_REFERENCES:
      {
        t_named_references t_named_references = (t_named_references)theEObject;
        T result = caset_named_references(t_named_references);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.MCS_CLOSURE:
      {
        MCSClosure mcsClosure = (MCSClosure)theEObject;
        T result = caseMCSClosure(mcsClosure);
        if (result == null) result = caseXExpression(mcsClosure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MCS Grammar Root</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MCS Grammar Root</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMCSGrammarRoot(MCSGrammarRoot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MCS Annex Library</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MCS Annex Library</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMCSAnnexLibrary(MCSAnnexLibrary object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>type declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>type declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casetype_declaration(type_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>constant declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>constant declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseconstant_declaration(constant_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MCS Viewpoint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MCS Viewpoint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMCSViewpoint(MCSViewpoint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enforcement policy</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enforcement policy</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnforcement_policy(Enforcement_policy object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package Script</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package Script</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackageScript(PackageScript object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Applies To Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Applies To Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAppliesToClause(AppliesToClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Classifier Category</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Classifier Category</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassifierCategory(ClassifierCategory object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature Group Classifier Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature Group Classifier Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeatureGroupClassifierReference(FeatureGroupClassifierReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Viewpoint Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Viewpoint Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseViewpointReference(ViewpointReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constraints Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constraints Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstraintsBlock(ConstraintsBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>labelled check statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>labelled check statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caselabelled_check_statement(labelled_check_statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>check statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>check statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecheck_statement(check_statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>block label id</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>block label id</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseblock_label_id(block_label_id object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>check label id</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>check label id</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecheck_label_id(check_label_id object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>check theorem</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>check theorem</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecheck_theorem(check_theorem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mode Spec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mode Spec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModeSpec(ModeSpec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mode Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mode Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModeName(ModeName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>check assertion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>check assertion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecheck_assertion(check_assertion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>root element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>root element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseroot_element(root_element object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>element reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>element reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseelement_reference(element_reference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Containment Path Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Containment Path Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContainmentPathElement(ContainmentPathElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array Range</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array Range</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArrayRange(ArrayRange object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package Enforce</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package Enforce</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackageEnforce(PackageEnforce object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>assertion expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>assertion expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseassertion_expression(assertion_expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>string expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>string expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casestring_expression(string_expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>constant expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>constant expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseconstant_expression(constant_expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseexpression(expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MCS Annex Subclause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MCS Annex Subclause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMCSAnnexSubclause(MCSAnnexSubclause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Classifier Enforce</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Classifier Enforce</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassifierEnforce(ClassifierEnforce object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Classifier Script</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Classifier Script</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassifierScript(ClassifierScript object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>function declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>function declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefunction_declaration(function_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>argument</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>argument</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseargument(argument object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>theorem declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>theorem declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casetheorem_declaration(theorem_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>in modes list</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>in modes list</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casein_modes_list(in_modes_list object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>local declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>local declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caselocal_declaration(local_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>theorem statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>theorem statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casetheorem_statement(theorem_statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>type expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>type expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casetype_expression(type_expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>basic type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>basic type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebasic_type(basic_type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unnamed Function Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unnamed Function Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnnamedFunctionType(UnnamedFunctionType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>composite type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>composite type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecomposite_type(composite_type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>set type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>set type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseset_type(set_type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>list type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>list type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caselist_type(list_type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>map type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>map type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casemap_type(map_type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>record type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>record type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caserecord_type(record_type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>union type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>union type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseunion_type(union_type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>id type pair</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>id type pair</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseid_type_pair(id_type_pair object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>element type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>element type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseelement_type(element_type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>tclassifiers</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>tclassifiers</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caset_classifiers(t_classifiers object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>tclassifier subtypes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>tclassifier subtypes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caset_classifier_subtypes(t_classifier_subtypes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>tnamed references</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>tnamed references</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caset_named_references(t_named_references object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MCS Closure</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MCS Closure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMCSClosure(MCSClosure object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElement(Element object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedElement(NamedElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annex Library</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annex Library</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnexLibrary(AnnexLibrary object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XExpression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XExpression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXExpression(XExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Modal Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Modal Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModalElement(ModalElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annex Subclause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annex Subclause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnexSubclause(AnnexSubclause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //McsSwitch
