/**
 */
package org.osate.xtext.aadl2.mcs.mcs.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.osate.aadl2.ArrayableElement;
import org.osate.aadl2.ClassifierFeature;
import org.osate.aadl2.ConnectionEnd;
import org.osate.aadl2.Context;
import org.osate.aadl2.DirectedFeature;
import org.osate.aadl2.Element;
import org.osate.aadl2.Feature;
import org.osate.aadl2.FeatureConnectionEnd;
import org.osate.aadl2.NamedElement;
import org.osate.aadl2.ParameterConnectionEnd;
import org.osate.aadl2.RefinableElement;
import org.osate.aadl2.StructuralFeature;

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
   * @param ePackage the package in question.
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
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.MCS_FILE_LIBRARY:
      {
        MCSFileLibrary mcsFileLibrary = (MCSFileLibrary)theEObject;
        T result = caseMCSFileLibrary(mcsFileLibrary);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.MCS_ANNEX_SUBCLAUSE:
      {
        MCSAnnexSubclause mcsAnnexSubclause = (MCSAnnexSubclause)theEObject;
        T result = caseMCSAnnexSubclause(mcsAnnexSubclause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.TYPE_DECLARATION:
      {
        Type_declaration type_declaration = (Type_declaration)theEObject;
        T result = caseType_declaration(type_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.CONSTANT_DECLARATION:
      {
        Constant_declaration constant_declaration = (Constant_declaration)theEObject;
        T result = caseConstant_declaration(constant_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.FOR_T:
      {
        F_or_T f_or_T = (F_or_T)theEObject;
        T result = caseF_or_T(f_or_T);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.THEOREM_ROOT:
      {
        Theorem_root theorem_root = (Theorem_root)theEObject;
        T result = caseTheorem_root(theorem_root);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.DEFINITION_BODY:
      {
        DefinitionBody definitionBody = (DefinitionBody)theEObject;
        T result = caseDefinitionBody(definitionBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.PARAMETERIZED_STRING:
      {
        ParameterizedString parameterizedString = (ParameterizedString)theEObject;
        T result = caseParameterizedString(parameterizedString);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.PARAMETER:
      {
        Parameter parameter = (Parameter)theEObject;
        T result = caseParameter(parameter);
        if (result == null) result = caseAadl2_Parameter(parameter);
        if (result == null) result = caseDirectedFeature(parameter);
        if (result == null) result = caseContext(parameter);
        if (result == null) result = caseParameterConnectionEnd(parameter);
        if (result == null) result = caseFeature(parameter);
        if (result == null) result = caseStructuralFeature(parameter);
        if (result == null) result = caseFeatureConnectionEnd(parameter);
        if (result == null) result = caseArrayableElement(parameter);
        if (result == null) result = caseRefinableElement(parameter);
        if (result == null) result = caseClassifierFeature(parameter);
        if (result == null) result = caseConnectionEnd(parameter);
        if (result == null) result = caseNamedElement(parameter);
        if (result == null) result = caseElement(parameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.TEXT_PARM:
      {
        TextParm textParm = (TextParm)theEObject;
        T result = caseTextParm(textParm);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.MCS_NAME:
      {
        McsName mcsName = (McsName)theEObject;
        T result = caseMcsName(mcsName);
        if (result == null) result = caseMcsTypedName(mcsName);
        if (result == null) result = caseParameter(mcsName);
        if (result == null) result = caseAadl2_Parameter(mcsName);
        if (result == null) result = caseDirectedFeature(mcsName);
        if (result == null) result = caseContext(mcsName);
        if (result == null) result = caseParameterConnectionEnd(mcsName);
        if (result == null) result = caseFeature(mcsName);
        if (result == null) result = caseStructuralFeature(mcsName);
        if (result == null) result = caseFeatureConnectionEnd(mcsName);
        if (result == null) result = caseArrayableElement(mcsName);
        if (result == null) result = caseRefinableElement(mcsName);
        if (result == null) result = caseClassifierFeature(mcsName);
        if (result == null) result = caseConnectionEnd(mcsName);
        if (result == null) result = caseNamedElement(mcsName);
        if (result == null) result = caseElement(mcsName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.MCS_TYPED_NAME:
      {
        McsTypedName mcsTypedName = (McsTypedName)theEObject;
        T result = caseMcsTypedName(mcsTypedName);
        if (result == null) result = caseParameter(mcsTypedName);
        if (result == null) result = caseAadl2_Parameter(mcsTypedName);
        if (result == null) result = caseDirectedFeature(mcsTypedName);
        if (result == null) result = caseContext(mcsTypedName);
        if (result == null) result = caseParameterConnectionEnd(mcsTypedName);
        if (result == null) result = caseFeature(mcsTypedName);
        if (result == null) result = caseStructuralFeature(mcsTypedName);
        if (result == null) result = caseFeatureConnectionEnd(mcsTypedName);
        if (result == null) result = caseArrayableElement(mcsTypedName);
        if (result == null) result = caseRefinableElement(mcsTypedName);
        if (result == null) result = caseClassifierFeature(mcsTypedName);
        if (result == null) result = caseConnectionEnd(mcsTypedName);
        if (result == null) result = caseNamedElement(mcsTypedName);
        if (result == null) result = caseElement(mcsTypedName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.THEOREM_CALL:
      {
        TheoremCall theoremCall = (TheoremCall)theEObject;
        T result = caseTheoremCall(theoremCall);
        if (result == null) result = caseExpr(theoremCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.CLASSIFIER_LITERAL:
      {
        Classifier_literal classifier_literal = (Classifier_literal)theEObject;
        T result = caseClassifier_literal(classifier_literal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.REF_TERM:
      {
        RefTerm refTerm = (RefTerm)theEObject;
        T result = caseRefTerm(refTerm);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.MCS_NAME_REF:
      {
        Mcs_name_ref mcs_name_ref = (Mcs_name_ref)theEObject;
        T result = caseMcs_name_ref(mcs_name_ref);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.BUILT_IN_FN_CALL:
      {
        BuiltInFnCall builtInFnCall = (BuiltInFnCall)theEObject;
        T result = caseBuiltInFnCall(builtInFnCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.FN_CALL:
      {
        FnCall fnCall = (FnCall)theEObject;
        T result = caseFnCall(fnCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.LET_BINDING:
      {
        Let_binding let_binding = (Let_binding)theEObject;
        T result = caseLet_binding(let_binding);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.EXPR:
      {
        Expr expr = (Expr)theEObject;
        T result = caseExpr(expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.DOMAIN:
      {
        Domain domain = (Domain)theEObject;
        T result = caseDomain(domain);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.TYPE_EXPRESSION:
      {
        Type_expression type_expression = (Type_expression)theEObject;
        T result = caseType_expression(type_expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.BASIC_TYPE:
      {
        Basic_type basic_type = (Basic_type)theEObject;
        T result = caseBasic_type(basic_type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.COMPOSITE_TYPE:
      {
        Composite_type composite_type = (Composite_type)theEObject;
        T result = caseComposite_type(composite_type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.MAPPING_TYPE:
      {
        Mapping_type mapping_type = (Mapping_type)theEObject;
        T result = caseMapping_type(mapping_type);
        if (result == null) result = caseComposite_type(mapping_type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.SET_TYPE:
      {
        Set_type set_type = (Set_type)theEObject;
        T result = caseSet_type(set_type);
        if (result == null) result = caseComposite_type(set_type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.LIST_TYPE:
      {
        List_type list_type = (List_type)theEObject;
        T result = caseList_type(list_type);
        if (result == null) result = caseComposite_type(list_type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.RECORD_TYPE:
      {
        Record_type record_type = (Record_type)theEObject;
        T result = caseRecord_type(record_type);
        if (result == null) result = caseComposite_type(record_type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.UNION_TYPE:
      {
        Union_type union_type = (Union_type)theEObject;
        T result = caseUnion_type(union_type);
        if (result == null) result = caseComposite_type(union_type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.ID_TYPE_PAIR:
      {
        Id_type_pair id_type_pair = (Id_type_pair)theEObject;
        T result = caseId_type_pair(id_type_pair);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.ELEMENT_TYPE:
      {
        Element_type element_type = (Element_type)theEObject;
        T result = caseElement_type(element_type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.CLASSIFIERS:
      {
        Classifiers classifiers = (Classifiers)theEObject;
        T result = caseClassifiers(classifiers);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.TCLASSIFIER_SUBTYPES:
      {
        T_classifier_subtypes t_classifier_subtypes = (T_classifier_subtypes)theEObject;
        T result = caseT_classifier_subtypes(t_classifier_subtypes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.INSTANCES:
      {
        Instances instances = (Instances)theEObject;
        T result = caseInstances(instances);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.TINSTANCE_SUBTYPES:
      {
        t_instance_subtypes t_instance_subtypes = (t_instance_subtypes)theEObject;
        T result = caset_instance_subtypes(t_instance_subtypes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.TSUBCOMPONENT_SUBTYPES:
      {
        t_subcomponent_subtypes t_subcomponent_subtypes = (t_subcomponent_subtypes)theEObject;
        T result = caset_subcomponent_subtypes(t_subcomponent_subtypes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.TCOMPONENT_SUBTYPES:
      {
        t_component_subtypes t_component_subtypes = (t_component_subtypes)theEObject;
        T result = caset_component_subtypes(t_component_subtypes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.TCONNECTION_SUBTYPES:
      {
        t_connection_subtypes t_connection_subtypes = (t_connection_subtypes)theEObject;
        T result = caset_connection_subtypes(t_connection_subtypes);
        if (result == null) result = caset_instance_subtypes(t_connection_subtypes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.TFEATURE_SUBTYPES:
      {
        t_feature_subtypes t_feature_subtypes = (t_feature_subtypes)theEObject;
        T result = caset_feature_subtypes(t_feature_subtypes);
        if (result == null) result = caset_instance_subtypes(t_feature_subtypes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.TACCESS_SUBTYPES:
      {
        t_access_subtypes t_access_subtypes = (t_access_subtypes)theEObject;
        T result = caset_access_subtypes(t_access_subtypes);
        if (result == null) result = caset_feature_subtypes(t_access_subtypes);
        if (result == null) result = caset_instance_subtypes(t_access_subtypes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.TPORT_SUBTYPES:
      {
        t_port_subtypes t_port_subtypes = (t_port_subtypes)theEObject;
        T result = caset_port_subtypes(t_port_subtypes);
        if (result == null) result = caset_feature_subtypes(t_port_subtypes);
        if (result == null) result = caset_instance_subtypes(t_port_subtypes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.TFLOW_SPEC_SUBTYPES:
      {
        t_flow_spec_subtypes t_flow_spec_subtypes = (t_flow_spec_subtypes)theEObject;
        T result = caset_flow_spec_subtypes(t_flow_spec_subtypes);
        if (result == null) result = caset_instance_subtypes(t_flow_spec_subtypes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.TFLOW_IMPL_SUBTYPES:
      {
        t_flow_impl_subtypes t_flow_impl_subtypes = (t_flow_impl_subtypes)theEObject;
        T result = caset_flow_impl_subtypes(t_flow_impl_subtypes);
        if (result == null) result = caset_instance_subtypes(t_flow_impl_subtypes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.FUNCTION_BODY:
      {
        FunctionBody functionBody = (FunctionBody)theEObject;
        T result = caseFunctionBody(functionBody);
        if (result == null) result = caseDefinitionBody(functionBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.CLAIM_BODY:
      {
        ClaimBody claimBody = (ClaimBody)theEObject;
        T result = caseClaimBody(claimBody);
        if (result == null) result = caseDefinitionBody(claimBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.CLAIM_STRING:
      {
        ClaimString claimString = (ClaimString)theEObject;
        T result = caseClaimString(claimString);
        if (result == null) result = caseTextParm(claimString);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.CLAIM_ARG:
      {
        ClaimArg claimArg = (ClaimArg)theEObject;
        T result = caseClaimArg(claimArg);
        if (result == null) result = caseTextParm(claimArg);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.BINARY_EXPR:
      {
        BinaryExpr binaryExpr = (BinaryExpr)theEObject;
        T result = caseBinaryExpr(binaryExpr);
        if (result == null) result = caseExpr(binaryExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.INSTANCE_OF_EXPR:
      {
        InstanceOfExpr instanceOfExpr = (InstanceOfExpr)theEObject;
        T result = caseInstanceOfExpr(instanceOfExpr);
        if (result == null) result = caseExpr(instanceOfExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.UNARY_EXPR:
      {
        UnaryExpr unaryExpr = (UnaryExpr)theEObject;
        T result = caseUnaryExpr(unaryExpr);
        if (result == null) result = caseExpr(unaryExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.POST_CAST_EXPR:
      {
        PostCastExpr postCastExpr = (PostCastExpr)theEObject;
        T result = casePostCastExpr(postCastExpr);
        if (result == null) result = caseExpr(postCastExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.MCS_NAME_EXPR:
      {
        MCSNameExpr mcsNameExpr = (MCSNameExpr)theEObject;
        T result = caseMCSNameExpr(mcsNameExpr);
        if (result == null) result = caseExpr(mcsNameExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.PKG_EXPR:
      {
        PkgExpr pkgExpr = (PkgExpr)theEObject;
        T result = casePkgExpr(pkgExpr);
        if (result == null) result = caseExpr(pkgExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.COMP_EXPR:
      {
        CompExpr compExpr = (CompExpr)theEObject;
        T result = caseCompExpr(compExpr);
        if (result == null) result = caseExpr(compExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.REF_EXPR:
      {
        RefExpr refExpr = (RefExpr)theEObject;
        T result = caseRefExpr(refExpr);
        if (result == null) result = caseExpr(refExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.THIS_EXPR:
      {
        ThisExpr thisExpr = (ThisExpr)theEObject;
        T result = caseThisExpr(thisExpr);
        if (result == null) result = caseExpr(thisExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.INT_EXPR:
      {
        IntExpr intExpr = (IntExpr)theEObject;
        T result = caseIntExpr(intExpr);
        if (result == null) result = caseExpr(intExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.REAL_EXPR:
      {
        RealExpr realExpr = (RealExpr)theEObject;
        T result = caseRealExpr(realExpr);
        if (result == null) result = caseExpr(realExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.BOOL_EXPR:
      {
        BoolExpr boolExpr = (BoolExpr)theEObject;
        T result = caseBoolExpr(boolExpr);
        if (result == null) result = caseExpr(boolExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.STRING_EXPR:
      {
        StringExpr stringExpr = (StringExpr)theEObject;
        T result = caseStringExpr(stringExpr);
        if (result == null) result = caseExpr(stringExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.RANGE:
      {
        Range range = (Range)theEObject;
        T result = caseRange(range);
        if (result == null) result = caseExpr(range);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.IF_THEN_ELSE_EXPR:
      {
        IfThenElseExpr ifThenElseExpr = (IfThenElseExpr)theEObject;
        T result = caseIfThenElseExpr(ifThenElseExpr);
        if (result == null) result = caseExpr(ifThenElseExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.QUANTIFIED_EXPR:
      {
        QuantifiedExpr quantifiedExpr = (QuantifiedExpr)theEObject;
        T result = caseQuantifiedExpr(quantifiedExpr);
        if (result == null) result = caseExpr(quantifiedExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.BUILT_IN_FN_CALL_EXPR:
      {
        BuiltInFnCallExpr builtInFnCallExpr = (BuiltInFnCallExpr)theEObject;
        T result = caseBuiltInFnCallExpr(builtInFnCallExpr);
        if (result == null) result = caseExpr(builtInFnCallExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.FN_CALL_EXPR:
      {
        FnCallExpr fnCallExpr = (FnCallExpr)theEObject;
        T result = caseFnCallExpr(fnCallExpr);
        if (result == null) result = caseExpr(fnCallExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.FILTER_MAP_EXPR:
      {
        FilterMapExpr filterMapExpr = (FilterMapExpr)theEObject;
        T result = caseFilterMapExpr(filterMapExpr);
        if (result == null) result = caseExpr(filterMapExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.SET_EXPR:
      {
        SetExpr setExpr = (SetExpr)theEObject;
        T result = caseSetExpr(setExpr);
        if (result == null) result = caseExpr(setExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.EMPTY:
      {
        Empty empty = (Empty)theEObject;
        T result = caseEmpty(empty);
        if (result == null) result = caseExpr(empty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case McsPackage.LET_EXPR:
      {
        LetExpr letExpr = (LetExpr)theEObject;
        T result = caseLetExpr(letExpr);
        if (result == null) result = caseExpr(letExpr);
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
   * Returns the result of interpreting the object as an instance of '<em>MCS File Library</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MCS File Library</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMCSFileLibrary(MCSFileLibrary object)
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
   * Returns the result of interpreting the object as an instance of '<em>Type declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType_declaration(Type_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constant declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstant_declaration(Constant_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>For T</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>For T</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseF_or_T(F_or_T object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Theorem root</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Theorem root</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTheorem_root(Theorem_root object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Definition Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Definition Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefinitionBody(DefinitionBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameterized String</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameterized String</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterizedString(ParameterizedString object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameter(Parameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Text Parm</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text Parm</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTextParm(TextParm object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMcsName(McsName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Typed Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Typed Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMcsTypedName(McsTypedName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Theorem Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Theorem Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTheoremCall(TheoremCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Classifier literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Classifier literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassifier_literal(Classifier_literal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ref Term</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ref Term</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRefTerm(RefTerm object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mcs name ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mcs name ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMcs_name_ref(Mcs_name_ref object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Built In Fn Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Built In Fn Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBuiltInFnCall(BuiltInFnCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fn Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fn Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFnCall(FnCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Let binding</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Let binding</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLet_binding(Let_binding object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpr(Expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Domain</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Domain</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDomain(Domain object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType_expression(Type_expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Basic type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Basic type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBasic_type(Basic_type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Composite type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Composite type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComposite_type(Composite_type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mapping type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mapping type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMapping_type(Mapping_type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Set type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Set type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSet_type(Set_type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseList_type(List_type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Record type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Record type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRecord_type(Record_type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Union type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Union type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnion_type(Union_type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Id type pair</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Id type pair</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseId_type_pair(Id_type_pair object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElement_type(Element_type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Classifiers</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Classifiers</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassifiers(Classifiers object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tclassifier subtypes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tclassifier subtypes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseT_classifier_subtypes(T_classifier_subtypes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instances</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instances</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstances(Instances object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>tinstance subtypes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>tinstance subtypes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caset_instance_subtypes(t_instance_subtypes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>tsubcomponent subtypes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>tsubcomponent subtypes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caset_subcomponent_subtypes(t_subcomponent_subtypes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>tcomponent subtypes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>tcomponent subtypes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caset_component_subtypes(t_component_subtypes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>tconnection subtypes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>tconnection subtypes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caset_connection_subtypes(t_connection_subtypes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>tfeature subtypes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>tfeature subtypes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caset_feature_subtypes(t_feature_subtypes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>taccess subtypes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>taccess subtypes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caset_access_subtypes(t_access_subtypes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>tport subtypes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>tport subtypes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caset_port_subtypes(t_port_subtypes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>tflow spec subtypes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>tflow spec subtypes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caset_flow_spec_subtypes(t_flow_spec_subtypes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>tflow impl subtypes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>tflow impl subtypes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caset_flow_impl_subtypes(t_flow_impl_subtypes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionBody(FunctionBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Claim Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Claim Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClaimBody(ClaimBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Claim String</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Claim String</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClaimString(ClaimString object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Claim Arg</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Claim Arg</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClaimArg(ClaimArg object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Binary Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Binary Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBinaryExpr(BinaryExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instance Of Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instance Of Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstanceOfExpr(InstanceOfExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unary Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unary Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnaryExpr(UnaryExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Post Cast Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Post Cast Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePostCastExpr(PostCastExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MCS Name Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MCS Name Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMCSNameExpr(MCSNameExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pkg Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pkg Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePkgExpr(PkgExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comp Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comp Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompExpr(CompExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ref Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ref Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRefExpr(RefExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>This Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>This Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseThisExpr(ThisExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntExpr(IntExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Real Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Real Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRealExpr(RealExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bool Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bool Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoolExpr(BoolExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringExpr(StringExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Range</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Range</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRange(Range object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If Then Else Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If Then Else Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIfThenElseExpr(IfThenElseExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Quantified Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Quantified Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQuantifiedExpr(QuantifiedExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Built In Fn Call Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Built In Fn Call Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBuiltInFnCallExpr(BuiltInFnCallExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fn Call Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fn Call Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFnCallExpr(FnCallExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Filter Map Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Filter Map Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFilterMapExpr(FilterMapExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Set Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Set Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSetExpr(SetExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Empty</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Empty</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEmpty(Empty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Let Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Let Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLetExpr(LetExpr object)
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
   * Returns the result of interpreting the object as an instance of '<em>Refinable Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Refinable Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRefinableElement(RefinableElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Classifier Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Classifier Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassifierFeature(ClassifierFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Structural Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Structural Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStructuralFeature(StructuralFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Connection End</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Connection End</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConnectionEnd(ConnectionEnd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature Connection End</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature Connection End</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeatureConnectionEnd(FeatureConnectionEnd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Arrayable Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Arrayable Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArrayableElement(ArrayableElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeature(Feature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Directed Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Directed Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDirectedFeature(DirectedFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Context</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Context</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContext(Context object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Connection End</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Connection End</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterConnectionEnd(ParameterConnectionEnd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAadl2_Parameter(org.osate.aadl2.Parameter object)
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
