/**
 * Copyright (c) 2015-2017 Obeo, Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 	
 * Contributors:
 * - William Piers <william.piers@obeo.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 */
package org.eclipse.cmf.occi.multicloud.modemo;

import java.math.BigInteger;

import java.util.Map;

import org.eclipse.cmf.occi.core.Link;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemo.Rule#getRuleOperator <em>Rule Operator</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemo.Rule#getRuleThreshold <em>Rule Threshold</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemo.Rule#getRulePeriod <em>Rule Period</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.modemo.Rule#getRuleConsecutive <em>Rule Consecutive</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage#getRule()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='targetConstraint'"
 * @generated
 */
public interface Rule extends Link {
	/**
	 * Returns the value of the '<em><b>Rule Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.cmf.occi.multicloud.modemo.OperatorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rule Operator</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.OperatorType
	 * @see #setRuleOperator(OperatorType)
	 * @see org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage#getRule_RuleOperator()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.modemo/ecore!Rule!ruleOperator'"
	 * @generated
	 */
	OperatorType getRuleOperator();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.modemo.Rule#getRuleOperator <em>Rule Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Operator</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.modemo.OperatorType
	 * @see #getRuleOperator()
	 * @generated
	 */
	void setRuleOperator(OperatorType value);

	/**
	 * Returns the value of the '<em><b>Rule Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rule Threshold</em>' attribute.
	 * @see #setRuleThreshold(Float)
	 * @see org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage#getRule_RuleThreshold()
	 * @model dataType="org.eclipse.cmf.occi.multicloud.modemo.Float"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.modemo/ecore!Rule!ruleThreshold'"
	 * @generated
	 */
	Float getRuleThreshold();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.modemo.Rule#getRuleThreshold <em>Rule Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Threshold</em>' attribute.
	 * @see #getRuleThreshold()
	 * @generated
	 */
	void setRuleThreshold(Float value);

	/**
	 * Returns the value of the '<em><b>Rule Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rule Period</em>' attribute.
	 * @see #setRulePeriod(int)
	 * @see org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage#getRule_RulePeriod()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.modemo/ecore!Rule!rulePeriod'"
	 * @generated
	 */
	int getRulePeriod();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.modemo.Rule#getRulePeriod <em>Rule Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Period</em>' attribute.
	 * @see #getRulePeriod()
	 * @generated
	 */
	void setRulePeriod(int value);

	/**
	 * Returns the value of the '<em><b>Rule Consecutive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rule Consecutive</em>' attribute.
	 * @see #setRuleConsecutive(int)
	 * @see org.eclipse.cmf.occi.multicloud.modemo.ModemoPackage#getRule_RuleConsecutive()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.modemo/ecore!Rule!ruleConsecutive'"
	 * @generated
	 */
	int getRuleConsecutive();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.modemo.Rule#getRuleConsecutive <em>Rule Consecutive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Consecutive</em>' attribute.
	 * @see #getRuleConsecutive()
	 * @generated
	 */
	void setRuleConsecutive(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv sourceConstraint:\n *   let severity : Integer[1] = \'Rule::sourceConstraint\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : occi::Boolean[1] = self.source.oclIsKindOf(Elasticitycontroller)\n *       in\n *         \'Rule::sourceConstraint\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.cmf.occi.multicloud.modemo.ModemoTables%&gt;.STR_Rule_c_c_sourceConstraint);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%org.eclipse.cmf.occi.multicloud.modemo.ModemoTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_modemo_c_c_Elasticitycontroller_0 = idResolver.getClass(&lt;%org.eclipse.cmf.occi.multicloud.modemo.ModemoTables%&gt;.CLSSid_Elasticitycontroller, null);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.Resource%&gt; source = this.getSource();\n\tfinal /*@NonInvalid\052/ boolean result = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation%&gt;.INSTANCE.evaluate(executor, source, TYP_modemo_c_c_Elasticitycontroller_0).booleanValue();\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%org.eclipse.cmf.occi.multicloud.modemo.ModemoTables%&gt;.STR_Rule_c_c_sourceConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, &lt;%org.eclipse.cmf.occi.multicloud.modemo.ModemoTables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean sourceConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv targetConstraint:\n *   let severity : Integer[1] = \'Rule::targetConstraint\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : occi::Boolean[1] = self.target.oclIsKindOf(Actiontrigger)\n *       in\n *         \'Rule::targetConstraint\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.cmf.occi.multicloud.modemo.ModemoTables%&gt;.STR_Rule_c_c_targetConstraint);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%org.eclipse.cmf.occi.multicloud.modemo.ModemoTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_modemo_c_c_Actiontrigger = idResolver.getClass(&lt;%org.eclipse.cmf.occi.multicloud.modemo.ModemoTables%&gt;.CLSSid_Actiontrigger, null);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.Resource%&gt; target = this.getTarget();\n\tfinal /*@NonInvalid\052/ boolean result = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation%&gt;.INSTANCE.evaluate(executor, target, TYP_modemo_c_c_Actiontrigger).booleanValue();\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%org.eclipse.cmf.occi.multicloud.modemo.ModemoTables%&gt;.STR_Rule_c_c_targetConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, &lt;%org.eclipse.cmf.occi.multicloud.modemo.ModemoTables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean targetConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Rule
