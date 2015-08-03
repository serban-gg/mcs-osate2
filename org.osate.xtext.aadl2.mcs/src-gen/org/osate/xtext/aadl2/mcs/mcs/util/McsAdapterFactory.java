/**
 */
package org.osate.xtext.aadl2.mcs.mcs.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xbase.XExpression;

import org.osate.aadl2.AnnexLibrary;
import org.osate.aadl2.AnnexSubclause;
import org.osate.aadl2.Element;
import org.osate.aadl2.ModalElement;
import org.osate.aadl2.NamedElement;

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
      public Adapter casetype_declaration(type_declaration object)
      {
        return createtype_declarationAdapter();
      }
      @Override
      public Adapter caseconstant_declaration(constant_declaration object)
      {
        return createconstant_declarationAdapter();
      }
      @Override
      public Adapter caseMCSViewpoint(MCSViewpoint object)
      {
        return createMCSViewpointAdapter();
      }
      @Override
      public Adapter caseEnforcement_policy(Enforcement_policy object)
      {
        return createEnforcement_policyAdapter();
      }
      @Override
      public Adapter casePackageScript(PackageScript object)
      {
        return createPackageScriptAdapter();
      }
      @Override
      public Adapter caseAppliesToClause(AppliesToClause object)
      {
        return createAppliesToClauseAdapter();
      }
      @Override
      public Adapter caseClassifierCategory(ClassifierCategory object)
      {
        return createClassifierCategoryAdapter();
      }
      @Override
      public Adapter caseFeatureGroupClassifierReference(FeatureGroupClassifierReference object)
      {
        return createFeatureGroupClassifierReferenceAdapter();
      }
      @Override
      public Adapter caseViewpointReference(ViewpointReference object)
      {
        return createViewpointReferenceAdapter();
      }
      @Override
      public Adapter caseConstraintsBlock(ConstraintsBlock object)
      {
        return createConstraintsBlockAdapter();
      }
      @Override
      public Adapter caselabelled_check_statement(labelled_check_statement object)
      {
        return createlabelled_check_statementAdapter();
      }
      @Override
      public Adapter casecheck_statement(check_statement object)
      {
        return createcheck_statementAdapter();
      }
      @Override
      public Adapter caseblock_label_id(block_label_id object)
      {
        return createblock_label_idAdapter();
      }
      @Override
      public Adapter casecheck_label_id(check_label_id object)
      {
        return createcheck_label_idAdapter();
      }
      @Override
      public Adapter casecheck_theorem(check_theorem object)
      {
        return createcheck_theoremAdapter();
      }
      @Override
      public Adapter caseModeSpec(ModeSpec object)
      {
        return createModeSpecAdapter();
      }
      @Override
      public Adapter caseModeName(ModeName object)
      {
        return createModeNameAdapter();
      }
      @Override
      public Adapter casecheck_assertion(check_assertion object)
      {
        return createcheck_assertionAdapter();
      }
      @Override
      public Adapter caseroot_element(root_element object)
      {
        return createroot_elementAdapter();
      }
      @Override
      public Adapter caseelement_reference(element_reference object)
      {
        return createelement_referenceAdapter();
      }
      @Override
      public Adapter caseContainmentPathElement(ContainmentPathElement object)
      {
        return createContainmentPathElementAdapter();
      }
      @Override
      public Adapter caseArrayRange(ArrayRange object)
      {
        return createArrayRangeAdapter();
      }
      @Override
      public Adapter casePackageEnforce(PackageEnforce object)
      {
        return createPackageEnforceAdapter();
      }
      @Override
      public Adapter caseassertion_expression(assertion_expression object)
      {
        return createassertion_expressionAdapter();
      }
      @Override
      public Adapter casestring_expression(string_expression object)
      {
        return createstring_expressionAdapter();
      }
      @Override
      public Adapter caseconstant_expression(constant_expression object)
      {
        return createconstant_expressionAdapter();
      }
      @Override
      public Adapter caseexpression(expression object)
      {
        return createexpressionAdapter();
      }
      @Override
      public Adapter caseMCSAnnexSubclause(MCSAnnexSubclause object)
      {
        return createMCSAnnexSubclauseAdapter();
      }
      @Override
      public Adapter caseClassifierEnforce(ClassifierEnforce object)
      {
        return createClassifierEnforceAdapter();
      }
      @Override
      public Adapter caseClassifierScript(ClassifierScript object)
      {
        return createClassifierScriptAdapter();
      }
      @Override
      public Adapter casefunction_declaration(function_declaration object)
      {
        return createfunction_declarationAdapter();
      }
      @Override
      public Adapter caseargument(argument object)
      {
        return createargumentAdapter();
      }
      @Override
      public Adapter casetheorem_declaration(theorem_declaration object)
      {
        return createtheorem_declarationAdapter();
      }
      @Override
      public Adapter casein_modes_list(in_modes_list object)
      {
        return createin_modes_listAdapter();
      }
      @Override
      public Adapter caselocal_declaration(local_declaration object)
      {
        return createlocal_declarationAdapter();
      }
      @Override
      public Adapter casetheorem_statement(theorem_statement object)
      {
        return createtheorem_statementAdapter();
      }
      @Override
      public Adapter casetype_expression(type_expression object)
      {
        return createtype_expressionAdapter();
      }
      @Override
      public Adapter casebasic_type(basic_type object)
      {
        return createbasic_typeAdapter();
      }
      @Override
      public Adapter caseUnnamedFunctionType(UnnamedFunctionType object)
      {
        return createUnnamedFunctionTypeAdapter();
      }
      @Override
      public Adapter casecomposite_type(composite_type object)
      {
        return createcomposite_typeAdapter();
      }
      @Override
      public Adapter caseset_type(set_type object)
      {
        return createset_typeAdapter();
      }
      @Override
      public Adapter caselist_type(list_type object)
      {
        return createlist_typeAdapter();
      }
      @Override
      public Adapter casemap_type(map_type object)
      {
        return createmap_typeAdapter();
      }
      @Override
      public Adapter caserecord_type(record_type object)
      {
        return createrecord_typeAdapter();
      }
      @Override
      public Adapter caseunion_type(union_type object)
      {
        return createunion_typeAdapter();
      }
      @Override
      public Adapter caseid_type_pair(id_type_pair object)
      {
        return createid_type_pairAdapter();
      }
      @Override
      public Adapter caseelement_type(element_type object)
      {
        return createelement_typeAdapter();
      }
      @Override
      public Adapter caset_classifiers(t_classifiers object)
      {
        return createt_classifiersAdapter();
      }
      @Override
      public Adapter caset_classifier_subtypes(t_classifier_subtypes object)
      {
        return createt_classifier_subtypesAdapter();
      }
      @Override
      public Adapter caset_named_references(t_named_references object)
      {
        return createt_named_referencesAdapter();
      }
      @Override
      public Adapter caseMCSClosure(MCSClosure object)
      {
        return createMCSClosureAdapter();
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
      public Adapter caseAnnexLibrary(AnnexLibrary object)
      {
        return createAnnexLibraryAdapter();
      }
      @Override
      public Adapter caseXExpression(XExpression object)
      {
        return createXExpressionAdapter();
      }
      @Override
      public Adapter caseModalElement(ModalElement object)
      {
        return createModalElementAdapter();
      }
      @Override
      public Adapter caseAnnexSubclause(AnnexSubclause object)
      {
        return createAnnexSubclauseAdapter();
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
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.type_declaration <em>type declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.type_declaration
   * @generated
   */
  public Adapter createtype_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.constant_declaration <em>constant declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.constant_declaration
   * @generated
   */
  public Adapter createconstant_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.MCSViewpoint <em>MCS Viewpoint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.MCSViewpoint
   * @generated
   */
  public Adapter createMCSViewpointAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.Enforcement_policy <em>Enforcement policy</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.Enforcement_policy
   * @generated
   */
  public Adapter createEnforcement_policyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.PackageScript <em>Package Script</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.PackageScript
   * @generated
   */
  public Adapter createPackageScriptAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.AppliesToClause <em>Applies To Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.AppliesToClause
   * @generated
   */
  public Adapter createAppliesToClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.ClassifierCategory <em>Classifier Category</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.ClassifierCategory
   * @generated
   */
  public Adapter createClassifierCategoryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.FeatureGroupClassifierReference <em>Feature Group Classifier Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.FeatureGroupClassifierReference
   * @generated
   */
  public Adapter createFeatureGroupClassifierReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.ViewpointReference <em>Viewpoint Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.ViewpointReference
   * @generated
   */
  public Adapter createViewpointReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.ConstraintsBlock <em>Constraints Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.ConstraintsBlock
   * @generated
   */
  public Adapter createConstraintsBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.labelled_check_statement <em>labelled check statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.labelled_check_statement
   * @generated
   */
  public Adapter createlabelled_check_statementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.check_statement <em>check statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.check_statement
   * @generated
   */
  public Adapter createcheck_statementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.block_label_id <em>block label id</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.block_label_id
   * @generated
   */
  public Adapter createblock_label_idAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.check_label_id <em>check label id</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.check_label_id
   * @generated
   */
  public Adapter createcheck_label_idAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.check_theorem <em>check theorem</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.check_theorem
   * @generated
   */
  public Adapter createcheck_theoremAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.ModeSpec <em>Mode Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.ModeSpec
   * @generated
   */
  public Adapter createModeSpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.ModeName <em>Mode Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.ModeName
   * @generated
   */
  public Adapter createModeNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.check_assertion <em>check assertion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.check_assertion
   * @generated
   */
  public Adapter createcheck_assertionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.root_element <em>root element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.root_element
   * @generated
   */
  public Adapter createroot_elementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.element_reference <em>element reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.element_reference
   * @generated
   */
  public Adapter createelement_referenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.ContainmentPathElement <em>Containment Path Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.ContainmentPathElement
   * @generated
   */
  public Adapter createContainmentPathElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.ArrayRange <em>Array Range</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.ArrayRange
   * @generated
   */
  public Adapter createArrayRangeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.PackageEnforce <em>Package Enforce</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.PackageEnforce
   * @generated
   */
  public Adapter createPackageEnforceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.assertion_expression <em>assertion expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.assertion_expression
   * @generated
   */
  public Adapter createassertion_expressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.string_expression <em>string expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.string_expression
   * @generated
   */
  public Adapter createstring_expressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.constant_expression <em>constant expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.constant_expression
   * @generated
   */
  public Adapter createconstant_expressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.expression <em>expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.expression
   * @generated
   */
  public Adapter createexpressionAdapter()
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
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.ClassifierEnforce <em>Classifier Enforce</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.ClassifierEnforce
   * @generated
   */
  public Adapter createClassifierEnforceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.ClassifierScript <em>Classifier Script</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.ClassifierScript
   * @generated
   */
  public Adapter createClassifierScriptAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.function_declaration <em>function declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.function_declaration
   * @generated
   */
  public Adapter createfunction_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.argument <em>argument</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.argument
   * @generated
   */
  public Adapter createargumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.theorem_declaration <em>theorem declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.theorem_declaration
   * @generated
   */
  public Adapter createtheorem_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.in_modes_list <em>in modes list</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.in_modes_list
   * @generated
   */
  public Adapter createin_modes_listAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.local_declaration <em>local declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.local_declaration
   * @generated
   */
  public Adapter createlocal_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.theorem_statement <em>theorem statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.theorem_statement
   * @generated
   */
  public Adapter createtheorem_statementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.type_expression <em>type expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.type_expression
   * @generated
   */
  public Adapter createtype_expressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.basic_type <em>basic type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.basic_type
   * @generated
   */
  public Adapter createbasic_typeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.UnnamedFunctionType <em>Unnamed Function Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.UnnamedFunctionType
   * @generated
   */
  public Adapter createUnnamedFunctionTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.composite_type <em>composite type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.composite_type
   * @generated
   */
  public Adapter createcomposite_typeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.set_type <em>set type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.set_type
   * @generated
   */
  public Adapter createset_typeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.list_type <em>list type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.list_type
   * @generated
   */
  public Adapter createlist_typeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.map_type <em>map type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.map_type
   * @generated
   */
  public Adapter createmap_typeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.record_type <em>record type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.record_type
   * @generated
   */
  public Adapter createrecord_typeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.union_type <em>union type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.union_type
   * @generated
   */
  public Adapter createunion_typeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.id_type_pair <em>id type pair</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.id_type_pair
   * @generated
   */
  public Adapter createid_type_pairAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.element_type <em>element type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.element_type
   * @generated
   */
  public Adapter createelement_typeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.t_classifiers <em>tclassifiers</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_classifiers
   * @generated
   */
  public Adapter createt_classifiersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.t_classifier_subtypes <em>tclassifier subtypes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_classifier_subtypes
   * @generated
   */
  public Adapter createt_classifier_subtypesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.t_named_references <em>tnamed references</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.t_named_references
   * @generated
   */
  public Adapter createt_named_referencesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.mcs.mcs.MCSClosure <em>MCS Closure</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.mcs.mcs.MCSClosure
   * @generated
   */
  public Adapter createMCSClosureAdapter()
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
   * Creates a new adapter for an object of class '{@link org.osate.aadl2.AnnexLibrary <em>Annex Library</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.aadl2.AnnexLibrary
   * @generated
   */
  public Adapter createAnnexLibraryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xbase.XExpression <em>XExpression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.xbase.XExpression
   * @generated
   */
  public Adapter createXExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.aadl2.ModalElement <em>Modal Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.aadl2.ModalElement
   * @generated
   */
  public Adapter createModalElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.aadl2.AnnexSubclause <em>Annex Subclause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.aadl2.AnnexSubclause
   * @generated
   */
  public Adapter createAnnexSubclauseAdapter()
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
