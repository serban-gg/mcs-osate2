/**
 */
package org.osate.xtext.aadl2.mcs.mcs.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.ArrayableElement;
import org.osate.aadl2.ClassifierFeature;
import org.osate.aadl2.ConnectionEnd;
import org.osate.aadl2.ContainedNamedElement;
import org.osate.aadl2.Context;
import org.osate.aadl2.DirectedFeature;
import org.osate.aadl2.Element;
import org.osate.aadl2.Feature;
import org.osate.aadl2.FeatureConnectionEnd;
import org.osate.aadl2.NamedElement;
import org.osate.aadl2.Parameter;
import org.osate.aadl2.ParameterConnectionEnd;
import org.osate.aadl2.PropertyExpression;
import org.osate.aadl2.PropertyValue;
import org.osate.aadl2.ReferenceValue;
import org.osate.aadl2.RefinableElement;
import org.osate.aadl2.StructuralFeature;

import org.osate.xtext.aadl2.mcs.mcs.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.osate.xtext.aadl2.mcs.mcs.McsPackage
 * @generated
 */
public class McsAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static McsPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public McsAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = McsPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected McsSwitch<Adapter> modelSwitch =
    new McsSwitch<Adapter>()
    {
      @Override
      public Adapter caseMCSGrammarRoot(MCSGrammarRoot object)
      {
        return createMCSGrammarRootAdapter();
      }
      @Override
      public Adapter caseMCSAnnexLibrary(MCSAnnexLibrary object)
      {
        return createMCSAnnexLibraryAdapter();
      }
      @Override
      public Adapter caseMCSFileLibrary(MCSFileLibrary object)
      {
        return createMCSFileLibraryAdapter();
      }
      @Override
      public Adapter caseMCSAnnexSubclause(MCSAnnexSubclause object)
      {
        return createMCSAnnexSubclauseAdapter();
      }
      @Override
      public Adapter caseConstant(Constant object)
      {
        return createConstantAdapter();
      }
      @Override
      public Adapter caseF_or_T(F_or_T object)
      {
        return createF_or_TAdapter();
      }
      @Override
      public Adapter caseTheorem_root(Theorem_root object)
      {
        return createTheorem_rootAdapter();
      }
      @Override
      public Adapter caseDefinitionBody(DefinitionBody object)
      {
        return createDefinitionBodyAdapter();
      }
      @Override
      public Adapter caseArg(Arg object)
      {
        return createArgAdapter();
      }
      @Override
      public Adapter caseParm_string(Parm_string object)
      {
        return createParm_stringAdapter();
      }
      @Override
      public Adapter caseClaimTextVar(ClaimTextVar object)
      {
        return createClaimTextVarAdapter();
      }
      @Override
      public Adapter caseTheoremCall(TheoremCall object)
      {
        return createTheoremCallAdapter();
      }
      @Override
      public Adapter caseClassifier_literal(Classifier_literal object)
      {
        return createClassifier_literalAdapter();
      }
      @Override
      public Adapter caseReferenceTerm(ReferenceTerm object)
      {
        return createReferenceTermAdapter();
      }
      @Override
      public Adapter caseMcs_name(Mcs_name object)
      {
        return createMcs_nameAdapter();
      }
      @Override
      public Adapter caseMcs_name_ref(Mcs_name_ref object)
      {
        return createMcs_name_refAdapter();
      }
      @Override
      public Adapter caseLet_binding(Let_binding object)
      {
        return createLet_bindingAdapter();
      }
      @Override
      public Adapter caseExpr(Expr object)
      {
        return createExprAdapter();
      }
      @Override
      public Adapter caseDomain(Domain object)
      {
        return createDomainAdapter();
      }
      @Override
      public Adapter caseType_expression(Type_expression object)
      {
        return createType_expressionAdapter();
      }
      @Override
      public Adapter caseBasic_type(Basic_type object)
      {
        return createBasic_typeAdapter();
      }
      @Override
      public Adapter caseComposite_type(Composite_type object)
      {
        return createComposite_typeAdapter();
      }
      @Override
      public Adapter caseMapping_type(Mapping_type object)
      {
        return createMapping_typeAdapter();
      }
      @Override
      public Adapter caseSet_type(Set_type object)
      {
        return createSet_typeAdapter();
      }
      @Override
      public Adapter caseList_type(List_type object)
      {
        return createList_typeAdapter();
      }
      @Override
      public Adapter caseRecord_type(Record_type object)
      {
        return createRecord_typeAdapter();
      }
      @Override
      public Adapter caseUnion_type(Union_type object)
      {
        return createUnion_typeAdapter();
      }
      @Override
      public Adapter caseId_type_pair(Id_type_pair object)
      {
        return createId_type_pairAdapter();
      }
      @Override
      public Adapter caseElement_type(Element_type object)
      {
        return createElement_typeAdapter();
      }
      @Override
      public Adapter caseClassifiers(Classifiers object)
      {
        return createClassifiersAdapter();
      }
      @Override
      public Adapter caseT_classifier_subtypes(T_classifier_subtypes object)
      {
        return createT_classifier_subtypesAdapter();
      }
      @Override
      public Adapter caseInstances(Instances object)
      {
        return createInstancesAdapter();
      }
      @Override
      public Adapter caset_instance_subtypes(t_instance_subtypes object)
      {
        return createt_instance_subtypesAdapter();
      }
      @Override
      public Adapter caset_subcomponent_subtypes(t_subcomponent_subtypes object)
      {
        return createt_subcomponent_subtypesAdapter();
      }
      @Override
      public Adapter caset_component_subtypes(t_component_subtypes object)
      {
        return createt_component_subtypesAdapter();
      }
      @Override
      public Adapter caset_connection_subtypes(t_connection_subtypes object)
      {
        return createt_connection_subtypesAdapter();
      }
      @Override
      public Adapter caset_feature_subtypes(t_feature_subtypes object)
      {
        return createt_feature_subtypesAdapter();
      }
      @Override
      public Adapter caset_access_subtypes(t_access_subtypes object)
      {
        return createt_access_subtypesAdapter();
      }
      @Override
      public Adapter caset_port_subtypes(t_port_subtypes object)
      {
        return createt_port_subtypesAdapter();
      }
      @Override
      public Adapter caset_flow_spec_subtypes(t_flow_spec_subtypes object)
      {
        return createt_flow_spec_subtypesAdapter();
      }
      @Override
      public Adapter caset_flow_impl_subtypes(t_flow_impl_subtypes object)
      {
        return createt_flow_impl_subtypesAdapter();
      }
      @Override
      public Adapter caseFunctionBody(FunctionBody object)
      {
        return createFunctionBodyAdapter();
      }
      @Override
      public Adapter caseClaimBody(ClaimBody object)
      {
        return createClaimBodyAdapter();
      }
      @Override
      public Adapter caseClaimString(ClaimString object)
      {
        return createClaimStringAdapter();
      }
      @Override
      public Adapter caseClaimArg(ClaimArg object)
      {
        return createClaimArgAdapter();
      }
      @Override
      public Adapter caseBinaryExpr(BinaryExpr object)
      {
        return createBinaryExprAdapter();
      }
      @Override
      public Adapter caseInstanceOfExpr(InstanceOfExpr object)
      {
        return createInstanceOfExprAdapter();
      }
      @Override
      public Adapter caseUnaryExpr(UnaryExpr object)
      {
        return createUnaryExprAdapter();
      }
      @Override
      public Adapter casePostCastExpr(PostCastExpr object)
      {
        return createPostCastExprAdapter();
      }
      @Override
      public Adapter caseMCSNameExpr(MCSNameExpr object)
      {
        return createMCSNameExprAdapter();
      }
      @Override
      public Adapter casePkgExpr(PkgExpr object)
      {
        return createPkgExprAdapter();
      }
      @Override
      public Adapter caseCompExpr(CompExpr object)
      {
        return createCompExprAdapter();
      }
      @Override
      public Adapter caseRefExpr(RefExpr object)
      {
        return createRefExprAdapter();
      }
      @Override
      public Adapter caseThisExpr(ThisExpr object)
      {
        return createThisExprAdapter();
      }
      @Override
      public Adapter caseIntExpr(IntExpr object)
      {
        return createIntExprAdapter();
      }
      @Override
      public Adapter caseRealExpr(RealExpr object)
      {
        return createRealExprAdapter();
      }
      @Override
      public Adapter caseBoolExpr(BoolExpr object)
      {
        return createBoolExprAdapter();
      }
      @Override
      public Adapter caseStringExpr(StringExpr object)
      {
        return createStringExprAdapter();
      }
      @Override
      public Adapter caseRange(Range object)
      {
        return createRangeAdapter();
      }
      @Override
      public Adapter caseIfThenElseExpr(IfThenElseExpr object)
      {
        return createIfThenElseExprAdapter();
      }
      @Override
      public Adapter caseQuantifiedExpr(QuantifiedExpr object)
      {
        return createQuantifiedExprAdapter();
      }
      @Override
      public Adapter caseBuiltInFnCallExpr(BuiltInFnCallExpr object)
      {
        return createBuiltInFnCallExprAdapter();
      }
      @Override
      public Adapter caseBuiltPropertyExists(BuiltPropertyExists object)
      {
        return createBuiltPropertyExistsAdapter();
      }
      @Override
      public Adapter caseBuiltPropertyVal(BuiltPropertyVal object)
      {
        return createBuiltPropertyValAdapter();
      }
      @Override
      public Adapter caseFnCallExpr(FnCallExpr object)
      {
        return createFnCallExprAdapter();
      }
      @Override
      public Adapter caseFilterMapExpr(FilterMapExpr object)
      {
        return createFilterMapExprAdapter();
      }
      @Override
      public Adapter caseSetExpr(SetExpr object)
      {
        return createSetExprAdapter();
      }
      @Override
      public Adapter caseEmpty(Empty object)
      {
        return createEmptyAdapter();
      }
      @Override
      public Adapter caseLetExpr(LetExpr object)
      {
        return createLetExprAdapter();
      }
      @Override
      public Adapter caseElement(Element object)
      {
        return createElementAdapter();
      }
      @Override
      public Adapter caseNamedElement(NamedElement object)
      {
        return createNamedElementAdapter();
      }
      @Override
      public Adapter caseRefinableElement(RefinableElement object)
      {
        return createRefinableElementAdapter();
      }
      @Override
      public Adapter caseClassifierFeature(ClassifierFeature object)
      {
        return createClassifierFeatureAdapter();
      }
      @Override
      public Adapter caseStructuralFeature(StructuralFeature object)
      {
        return createStructuralFeatureAdapter();
      }
      @Override
      public Adapter caseConnectionEnd(ConnectionEnd object)
      {
        return createConnectionEndAdapter();
      }
      @Override
      public Adapter caseFeatureConnectionEnd(FeatureConnectionEnd object)
      {
        return createFeatureConnectionEndAdapter();
      }
      @Override
      public Adapter caseArrayableElement(ArrayableElement object)
      {
        return createArrayableElementAdapter();
      }
      @Override
      public Adapter caseFeature(Feature object)
      {
        return createFeatureAdapter();
      }
      @Override
      public Adapter caseDirectedFeature(DirectedFeature object)
      {
        return createDirectedFeatureAdapter();
      }
      @Override
      public Adapter caseContext(Context object)
      {
        return createContextAdapter();
      }
      @Override
      public Adapter caseParameterConnectionEnd(ParameterConnectionEnd object)
      {
        return createParameterConnectionEndAdapter();
      }
      @Override
      public Adapter caseParameter(Parameter object)
      {
        return createParameterAdapter();
      }
      @Override
      public Adapter caseContainedNamedElement(ContainedNamedElement object)
      {
        return createContainedNamedElementAdapter();
      }
      @Override
      public Adapter casePropertyExpression(PropertyExpression object)
      {
        return createPropertyExpressionAdapter();
      }
      @Override
      public Adapter casePropertyValue(PropertyValue object)
      {
        return createPropertyValueAdapter();
      }
      @Override
      public Adapter caseReferenceValue(ReferenceValue object)
      {
        return createReferenceValueAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.MCSGrammarRoot <em>MCS Grammar Root</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.MCSGrammarRoot
   * @generated
   */
  public Adapter createMCSGrammarRootAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.MCSAnnexLibrary <em>MCS Annex Library</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.MCSAnnexLibrary
   * @generated
   */
  public Adapter createMCSAnnexLibraryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.MCSFileLibrary <em>MCS File Library</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.MCSFileLibrary
   * @generated
   */
  public Adapter createMCSFileLibraryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.MCSAnnexSubclause <em>MCS Annex Subclause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.MCSAnnexSubclause
   * @generated
   */
  public Adapter createMCSAnnexSubclauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.Constant
   * @generated
   */
  public Adapter createConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.F_or_T <em>For T</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.F_or_T
   * @generated
   */
  public Adapter createF_or_TAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.Theorem_root <em>Theorem root</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.Theorem_root
   * @generated
   */
  public Adapter createTheorem_rootAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.DefinitionBody <em>Definition Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.DefinitionBody
   * @generated
   */
  public Adapter createDefinitionBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.Arg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.Arg
   * @generated
   */
  public Adapter createArgAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.Parm_string <em>Parm string</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.Parm_string
   * @generated
   */
  public Adapter createParm_stringAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.ClaimTextVar <em>Claim Text Var</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.ClaimTextVar
   * @generated
   */
  public Adapter createClaimTextVarAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.TheoremCall <em>Theorem Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.TheoremCall
   * @generated
   */
  public Adapter createTheoremCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.Classifier_literal <em>Classifier literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.Classifier_literal
   * @generated
   */
  public Adapter createClassifier_literalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.ReferenceTerm <em>Reference Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.ReferenceTerm
   * @generated
   */
  public Adapter createReferenceTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.Mcs_name <em>Mcs name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.Mcs_name
   * @generated
   */
  public Adapter createMcs_nameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.Mcs_name_ref <em>Mcs name ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.Mcs_name_ref
   * @generated
   */
  public Adapter createMcs_name_refAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.Let_binding <em>Let binding</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.Let_binding
   * @generated
   */
  public Adapter createLet_bindingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.Expr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.Expr
   * @generated
   */
  public Adapter createExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.Domain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.Domain
   * @generated
   */
  public Adapter createDomainAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.Type_expression <em>Type expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.Type_expression
   * @generated
   */
  public Adapter createType_expressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.Basic_type <em>Basic type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.Basic_type
   * @generated
   */
  public Adapter createBasic_typeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.Composite_type <em>Composite type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.Composite_type
   * @generated
   */
  public Adapter createComposite_typeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.Mapping_type <em>Mapping type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.Mapping_type
   * @generated
   */
  public Adapter createMapping_typeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.Set_type <em>Set type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.Set_type
   * @generated
   */
  public Adapter createSet_typeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.List_type <em>List type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.List_type
   * @generated
   */
  public Adapter createList_typeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.Record_type <em>Record type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.Record_type
   * @generated
   */
  public Adapter createRecord_typeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.Union_type <em>Union type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.Union_type
   * @generated
   */
  public Adapter createUnion_typeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.Id_type_pair <em>Id type pair</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.Id_type_pair
   * @generated
   */
  public Adapter createId_type_pairAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.Element_type <em>Element type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.Element_type
   * @generated
   */
  public Adapter createElement_typeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.Classifiers <em>Classifiers</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.Classifiers
   * @generated
   */
  public Adapter createClassifiersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.T_classifier_subtypes <em>Tclassifier subtypes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.T_classifier_subtypes
   * @generated
   */
  public Adapter createT_classifier_subtypesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.Instances <em>Instances</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.Instances
   * @generated
   */
  public Adapter createInstancesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.t_instance_subtypes <em>tinstance subtypes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_instance_subtypes
   * @generated
   */
  public Adapter createt_instance_subtypesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.t_subcomponent_subtypes <em>tsubcomponent subtypes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_subcomponent_subtypes
   * @generated
   */
  public Adapter createt_subcomponent_subtypesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.t_component_subtypes <em>tcomponent subtypes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_component_subtypes
   * @generated
   */
  public Adapter createt_component_subtypesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.t_connection_subtypes <em>tconnection subtypes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_connection_subtypes
   * @generated
   */
  public Adapter createt_connection_subtypesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.t_feature_subtypes <em>tfeature subtypes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_feature_subtypes
   * @generated
   */
  public Adapter createt_feature_subtypesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.t_access_subtypes <em>taccess subtypes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_access_subtypes
   * @generated
   */
  public Adapter createt_access_subtypesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.t_port_subtypes <em>tport subtypes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_port_subtypes
   * @generated
   */
  public Adapter createt_port_subtypesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.t_flow_spec_subtypes <em>tflow spec subtypes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_flow_spec_subtypes
   * @generated
   */
  public Adapter createt_flow_spec_subtypesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.t_flow_impl_subtypes <em>tflow impl subtypes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_flow_impl_subtypes
   * @generated
   */
  public Adapter createt_flow_impl_subtypesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.FunctionBody <em>Function Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.FunctionBody
   * @generated
   */
  public Adapter createFunctionBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.ClaimBody <em>Claim Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.ClaimBody
   * @generated
   */
  public Adapter createClaimBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.ClaimString <em>Claim String</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.ClaimString
   * @generated
   */
  public Adapter createClaimStringAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.ClaimArg <em>Claim Arg</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.ClaimArg
   * @generated
   */
  public Adapter createClaimArgAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.BinaryExpr <em>Binary Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.BinaryExpr
   * @generated
   */
  public Adapter createBinaryExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.InstanceOfExpr <em>Instance Of Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.InstanceOfExpr
   * @generated
   */
  public Adapter createInstanceOfExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.UnaryExpr <em>Unary Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.UnaryExpr
   * @generated
   */
  public Adapter createUnaryExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.PostCastExpr <em>Post Cast Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.PostCastExpr
   * @generated
   */
  public Adapter createPostCastExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.MCSNameExpr <em>MCS Name Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.MCSNameExpr
   * @generated
   */
  public Adapter createMCSNameExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.PkgExpr <em>Pkg Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.PkgExpr
   * @generated
   */
  public Adapter createPkgExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.CompExpr <em>Comp Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.CompExpr
   * @generated
   */
  public Adapter createCompExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.RefExpr <em>Ref Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.RefExpr
   * @generated
   */
  public Adapter createRefExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.ThisExpr <em>This Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.ThisExpr
   * @generated
   */
  public Adapter createThisExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.IntExpr <em>Int Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.IntExpr
   * @generated
   */
  public Adapter createIntExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.RealExpr <em>Real Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.RealExpr
   * @generated
   */
  public Adapter createRealExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.BoolExpr <em>Bool Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.BoolExpr
   * @generated
   */
  public Adapter createBoolExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.StringExpr <em>String Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.StringExpr
   * @generated
   */
  public Adapter createStringExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.Range <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.Range
   * @generated
   */
  public Adapter createRangeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.IfThenElseExpr <em>If Then Else Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.IfThenElseExpr
   * @generated
   */
  public Adapter createIfThenElseExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.QuantifiedExpr <em>Quantified Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.QuantifiedExpr
   * @generated
   */
  public Adapter createQuantifiedExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.BuiltInFnCallExpr <em>Built In Fn Call Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.BuiltInFnCallExpr
   * @generated
   */
  public Adapter createBuiltInFnCallExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.BuiltPropertyExists <em>Built Property Exists</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.BuiltPropertyExists
   * @generated
   */
  public Adapter createBuiltPropertyExistsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.BuiltPropertyVal <em>Built Property Val</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.BuiltPropertyVal
   * @generated
   */
  public Adapter createBuiltPropertyValAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.FnCallExpr <em>Fn Call Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.FnCallExpr
   * @generated
   */
  public Adapter createFnCallExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.FilterMapExpr <em>Filter Map Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.FilterMapExpr
   * @generated
   */
  public Adapter createFilterMapExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.SetExpr <em>Set Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.SetExpr
   * @generated
   */
  public Adapter createSetExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.Empty <em>Empty</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.Empty
   * @generated
   */
  public Adapter createEmptyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.LetExpr <em>Let Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.LetExpr
   * @generated
   */
  public Adapter createLetExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.aadl2.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.aadl2.Element
   * @generated
   */
  public Adapter createElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.aadl2.NamedElement <em>Named Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.aadl2.NamedElement
   * @generated
   */
  public Adapter createNamedElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.aadl2.RefinableElement <em>Refinable Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.aadl2.RefinableElement
   * @generated
   */
  public Adapter createRefinableElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.aadl2.ClassifierFeature <em>Classifier Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.aadl2.ClassifierFeature
   * @generated
   */
  public Adapter createClassifierFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.aadl2.StructuralFeature <em>Structural Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.aadl2.StructuralFeature
   * @generated
   */
  public Adapter createStructuralFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.aadl2.ConnectionEnd <em>Connection End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.aadl2.ConnectionEnd
   * @generated
   */
  public Adapter createConnectionEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.aadl2.FeatureConnectionEnd <em>Feature Connection End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.aadl2.FeatureConnectionEnd
   * @generated
   */
  public Adapter createFeatureConnectionEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.aadl2.ArrayableElement <em>Arrayable Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.aadl2.ArrayableElement
   * @generated
   */
  public Adapter createArrayableElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.aadl2.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.aadl2.Feature
   * @generated
   */
  public Adapter createFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.aadl2.DirectedFeature <em>Directed Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.aadl2.DirectedFeature
   * @generated
   */
  public Adapter createDirectedFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.aadl2.Context <em>Context</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.aadl2.Context
   * @generated
   */
  public Adapter createContextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.aadl2.ParameterConnectionEnd <em>Parameter Connection End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.aadl2.ParameterConnectionEnd
   * @generated
   */
  public Adapter createParameterConnectionEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.aadl2.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.aadl2.Parameter
   * @generated
   */
  public Adapter createParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.aadl2.ContainedNamedElement <em>Contained Named Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.aadl2.ContainedNamedElement
   * @generated
   */
  public Adapter createContainedNamedElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.aadl2.PropertyExpression <em>Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.aadl2.PropertyExpression
   * @generated
   */
  public Adapter createPropertyExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.aadl2.PropertyValue <em>Property Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.aadl2.PropertyValue
   * @generated
   */
  public Adapter createPropertyValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.aadl2.ReferenceValue <em>Reference Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.aadl2.ReferenceValue
   * @generated
   */
  public Adapter createReferenceValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //McsAdapterFactory
